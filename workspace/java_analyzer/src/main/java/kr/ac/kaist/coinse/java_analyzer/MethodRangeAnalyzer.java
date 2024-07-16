package kr.ac.kaist.coinse.java_analyzer;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.Range;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.stmt.AssertStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.Log;
import com.github.javaparser.utils.SourceRoot;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.resolution.UnsolvedSymbolException;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.List;
import java.util.LinkedList;
import java.nio.file.Paths;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;


/**
 * Some code that uses JavaParser.
 */
public class MethodRangeAnalyzer {

    public static void main(String[] args) throws IOException {

        // JavaParser has a minimal logging class that normally logs nothing.
        // Let's ask it to write to standard out:
        Log.setAdapter(new Log.StandardOutStandardErrorAdapter());

        // args: <target src path> <a directory where we look into Java files> <path to jar files..>
        CombinedTypeSolver combinedTypeSolver = new CombinedTypeSolver();
        combinedTypeSolver.add(new ReflectionTypeSolver());
        for (int i = 2; i < args.length; i++) {
           if (args[i].endsWith(".jar")) {
              combinedTypeSolver.add(new JarTypeSolver(new File(args[i])));
               } else {
              combinedTypeSolver.add(new JavaParserTypeSolver(new File(args[i])));
           }
        }
        
        JavaSymbolSolver symbolSolver = new JavaSymbolSolver(combinedTypeSolver);
        StaticJavaParser.getConfiguration().setSymbolResolver(symbolSolver);

        CompilationUnit cu = StaticJavaParser.parse(new File(args[0]));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject data = new JsonObject();
        data.addProperty("filepath", args[0]);
        JsonArray nodes = new JsonArray();
        data.add("nodes", nodes);

        cu.accept(new VoidVisitorAdapter<Void>() {

            @Override
            public void visit(ClassOrInterfaceDeclaration n, Void arg) {
                int beginLine, endLine;
                if (n.getRange().isPresent()) {
                    Range range = n.getRange().get();
                    beginLine = range.begin.line;
                    endLine = range.end.line;
                }
                else {
                    beginLine = -1;
                    endLine = -1;
                }

                JsonArray parents = new JsonArray();
                for (ClassOrInterfaceType t: n.getExtendedTypes()) {
                    try {
                        parents.add(t.resolve().describe());
                    } catch (UnsolvedSymbolException e) {
                        parents.add(t.asString());
                    }
                }
                for (ClassOrInterfaceType t: n.getImplementedTypes()) {
                    try {
                        parents.add(t.resolve().describe());
                    } catch (UnsolvedSymbolException e) {
                        parents.add(t.asString());
                    }
                }
                JsonObject node = new JsonObject();
                node.addProperty("type", "class_interface");
                node.addProperty("name", n.getName().toString());
                node.addProperty("is_interface", n.isInterface());
                node.add("parent_types", parents);
                node.addProperty("begin_line", beginLine);
                node.addProperty("end_line", endLine);
                node.addProperty("comment", n.getComment().map(o -> o.getContent()).orElse(""));
                nodes.add(node);

                super.visit(n, arg);
            }
            @Override
            public void visit(MethodDeclaration n, Void arg) {
                int beginLine, endLine;
                if (n.getRange().isPresent()) {
                    Range range = n.getRange().get();
                    beginLine = range.begin.line;
                    endLine = range.end.line;
                }
                else {
                    beginLine = -1;
                    endLine = -1;
                }
                JsonObject node = new JsonObject();
                node.addProperty("type", "method");
                try {
                    node.addProperty("signature", n.resolve().getQualifiedSignature());
                } catch (UnsolvedSymbolException e) {
                    node.addProperty("signature", n.getSignature().asString());
                    node.addProperty("exception", e.toString());
                }
                node.addProperty("begin_line", beginLine);
                node.addProperty("end_line", endLine);
                node.addProperty("comment", n.getComment().map(o -> o.getContent()).orElse(""));
                JsonArray childRanges = new JsonArray();
                n.getBody().ifPresent(body -> {
                    for (Node child : body.getStatements()) {
                        child.getRange().ifPresent(r -> {
                            childRanges.add(r.toString());
                        });
                    }
                });
                node.add("child_ranges", childRanges);
                nodes.add(node);
                 
                super.visit(n, arg);
            }
            @Override
            public void visit(ConstructorDeclaration n, Void arg) {
                int beginLine, endLine;
                if (n.getRange().isPresent()) {
                    Range range = n.getRange().get();
                    beginLine = range.begin.line;
                    endLine = range.end.line;
                }
                else {
                    beginLine = -1;
                    endLine = -1;
                }
                JsonObject node = new JsonObject();
                node.addProperty("type", "constructor");
                try {
                    node.addProperty("signature", n.resolve().getQualifiedSignature());
                } catch (UnsolvedSymbolException e) {
                    node.addProperty("signature", n.getSignature().asString());
                    node.addProperty("exception", e.toString());
                }
                node.addProperty("begin_line", beginLine);
                node.addProperty("end_line", endLine);
                node.addProperty("comment", n.getComment().map(o -> o.getContent()).orElse(""));
                JsonArray childRanges = new JsonArray();
                for (Node child : n.getBody().getStatements()) {
                    child.getRange().ifPresent(r -> {
                        childRanges.add(r.toString());
                    });
                }
                node.add("child_ranges", childRanges);
                nodes.add(node);
                super.visit(n, arg);
            }
            @Override
            public void visit(FieldDeclaration n, Void arg) {
                int beginLine, endLine;
                if (n.getRange().isPresent()) {
                    Range range = n.getRange().get();
                    beginLine = range.begin.line;
                    endLine = range.end.line;
                }
                else {
                    beginLine = -1;
                    endLine = -1;
                }
                JsonObject node = new JsonObject();
                node.addProperty("type", "field");
                JsonArray varNames = new JsonArray();
                for (VariableDeclarator var: n.getVariables()) {
                    varNames.add(var.getName().toString());
                }
                node.add("varNames", varNames);
                node.addProperty("begin_line", beginLine);
                node.addProperty("end_line", endLine);
                node.addProperty("comment", n.getComment().map(o -> o.getContent()).orElse(""));
                nodes.add(node);
                super.visit(n, arg);
            }
            @Override
            public void visit(ExpressionStmt n, Void arg) {
                super.visit(n, arg);
                int beginLine, endLine;
                if (n.getRange().isPresent()) {
                    Range range = n.getRange().get();
                    beginLine = range.begin.line;
                    endLine = range.end.line;
                    if (n.getComment().isPresent()) {
                        Comment com = n.getComment().get();
                        int comBeginLine = com.getRange().get().begin.line;
                        int comEndLine = com.getRange().get().end.line;
                        if (comBeginLine < beginLine) beginLine = comBeginLine;
                        if (comEndLine > endLine) endLine = comEndLine;
                    }
                }
                else {
                    beginLine = -1;
                    endLine = -1;
                }
                //System.out.println("expr|" + "-" + "|" + beginLine + "|" + endLine);
            }
        }, null);
        FileWriter out = new FileWriter(args[1]);
        gson.toJson(data, out);
        out.close();
    }
}
