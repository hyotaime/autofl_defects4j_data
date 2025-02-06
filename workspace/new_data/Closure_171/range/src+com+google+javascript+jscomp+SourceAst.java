{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SourceAst.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceAst",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 55,
      "comment": "\n * An interface for accessing the AST root of an input.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceAst.getAstRoot(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n   * Gets the root node of the AST for the source file this represents. The AST\n   * is lazily instantiated and cached.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceAst.clearAst()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n   * Removes any references to root node of the AST.  If it is requested again,\n   * another parse will be performed.  This method is needed to allow the ASTs\n   * to be garbage collected if the inputs are still around after compilation.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceAst.getInputId()",
      "begin_line": 43,
      "end_line": 43,
      "comment": " @return The input id associated with this AST ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceAst.getSourceFile()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " Returns the source file the generated AST represents. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceAst.setSourceFile(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Sets the source file the generated AST represents. This can be called after\n   * deserializing if access to the source file is needed. If a different file\n   * is provided than that with which this was created, an IllegalStateException\n   * will be thrown.\n   ",
      "child_ranges": []
    }
  ]
}