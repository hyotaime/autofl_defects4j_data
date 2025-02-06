{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AbstractCompiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCompiler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceExcerptProvider"
      ],
      "begin_line": 43,
      "end_line": 392,
      "comment": "\n * An abstract compiler, to help remove the circular dependency of\n * passes on JSCompiler.\n *\n * This is an abstract class, so that we can make the methods package-private.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "READ_ERROR"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stage"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getInput(com.google.javascript.rhino.InputId)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Looks up an input (possibly an externs input) by input id.\n   * May return null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getSourceFileByName(java.lang.String)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n   * Looks up a source file by name. May return null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.newExternInput(java.lang.String)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * Creates a new externs file.\n   * @param name A name for the new externs file.\n   * @throws IllegalArgumentException If the name of the externs file conflicts\n   *     with a pre-existing externs file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getModuleGraph()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Gets the module graph. May return null if there aren\u0027t at least two\n   * modules.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getInputsInOrder()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Gets the inputs in the order in which they are being processed.\n   * Only for use by {@code AbstractCompilerRunner}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypeRegistry()",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * Gets a central registry of type information from the compiled JS.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypedScopeCreator()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * Gets a memoized scope creator with type information.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTopScope()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n   * Gets the top scope.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * Report an error or warning.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.throwInternalError(java.lang.String, java.lang.Exception)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n   * Report an internal error.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getCodingConvention()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n   * Gets the current coding convention.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.reportCodeChange()",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n   * Report code changes.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.addToDebugLog(java.lang.String)",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n   * Logs a message under a central logger.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n   * Sets the CssRenamingMap.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getCssRenamingMap()",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n   * Gets the CssRenamingMap.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)",
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n   * Gets a suitable SCRIPT node to serve as a parent for code insertion. If\n   * {@code module} contains any inputs, the returned node will be the SCRIPT\n   * node corresponding to its first input. If {@code module} is empty, on the\n   * other hand, then the returned node will be the first SCRIPT node in a\n   * non-empty module that {@code module} depends on (the deepest one possible).\n   *\n   * @param module A module. If null, will return the first SCRIPT node of all\n   *     modules.\n   * @return A SCRIPT node (never null).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypeValidator()",
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n   * Gets the central registry of type violations.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseSyntheticCode(java.lang.String)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n   * Parses code for injecting.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseSyntheticCode(java.lang.String, java.lang.String)",
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n   * Parses code for injecting, and associate it with a given source file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseTestCode(java.lang.String)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n   * Parses code for testing.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.toSource(com.google.javascript.rhino.Node)",
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n   * Prints a node to source code.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getDefaultErrorReporter()",
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n   * Gets a default error reporter for injecting into Rhino.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getReverseAbstractInterpreter()",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n   * Get an interpreter for type analysis.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getLifeCycleStage()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n   * @return The current life-cycle stage of the AST we\u0027re working on.\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getUniqueNameIdSupplier()",
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n   * Generates unique ids.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.hasHaltingErrors()",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n   * @return Whether any errors have been encountered that\n   *     should stop the compilation process.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 203,
      "end_line": 203,
      "comment": "\n   * Register a listener for code change events.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n   * Remove a listener for code change events.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.isIdeMode()",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n   * Returns true if compiling in IDE mode.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.acceptEcmaScript5()",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n   * @return Whether the compiler is in ES5Mode.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.acceptConstKeyword()",
      "begin_line": 223,
      "end_line": 223,
      "comment": "\n   * @return Whether the compiler accepts `const\u0027 keyword.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getParserConfig()",
      "begin_line": 228,
      "end_line": 228,
      "comment": "\n   * Returns the parser configuration.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.isTypeCheckingEnabled()",
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n   * Returns true if type checking is enabled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.prepareAst(com.google.javascript.rhino.Node)",
      "begin_line": 240,
      "end_line": 240,
      "comment": "\n   * Normalizes the types of AST nodes in the given tree, and\n   * annotates any nodes to which the coding convention applies so that passes\n   * can read the annotations instead of using the coding convention.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getErrorManager()",
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n   * Gets the error manager.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n   * Set the current life-cycle state.\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n   * Are the nodes equal for the purpose of inlining?\n   * If type aware optimizations are on, type equality is checked.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setHasRegExpGlobalReferences(boolean)",
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n   * Set if RegExp global properties are used.\n   * @param references Whether there are references to the RegExp global object\n   *     properties.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.hasRegExpGlobalReferences()",
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n   * @return Whether the AST contains references to the RegExp global object\n   *     properties.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getErrorLevel(com.google.javascript.jscomp.JSError)",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n   * @return The error level the given error object will be reported at.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalized()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalizedUnobfuscated()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalizedObfuscated()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.process(com.google.javascript.jscomp.CompilerPass)",
      "begin_line": 306,
      "end_line": 306,
      "comment": "\n   * Runs a given compiler-pass by calling its {@code process()} method.\n   * @param pass The pass to be run.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getRoot()",
      "begin_line": 311,
      "end_line": 311,
      "comment": "\n   * Returns the root node of the AST, which includes both externs and source.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 327,
      "comment": "\n   * Updates the list of references for variables in global scope.\n   *\n   * @param refMapPatch Maps each variable to all of its references; may contain\n   *     references collected from the whole AST or only a SCRIPT sub-tree.\n   * @param collectionRoot The root of sub-tree in which reference collection\n   *     has been done. This should either be a SCRIPT node (if collection is\n   *     done on a single file) or it is assumed that collection is on full AST.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getGlobalVarReferences()",
      "begin_line": 335,
      "end_line": 335,
      "comment": "\n   * This can be used to get the list of all references to all global variables\n   * based on all previous calls to {@code updateGlobalVarReferences}.\n   *\n   * @return The reference collection map associated to global scope variable.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getSynthesizedExternsInput()",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n   * @return a CompilerInput that can be modified to add addition extern\n   * definitions;\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getProgress()",
      "begin_line": 349,
      "end_line": 349,
      "comment": "\n   * @return a number in [0,1] range indicating an approximate progress of the\n   * last compile. Note this should only be used as a hint and no assumptions\n   * should be made on accuracy, even a completed compile may choose not to set\n   * this to 1.0 at the end.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getLastPassName()",
      "begin_line": 354,
      "end_line": 354,
      "comment": "\n   * Gets the last pass name set by setProgress.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setProgress(double, java.lang.String)",
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n   * Sets the progress percentage as well as the name of the last pass that\n   * ran (if available).\n   * @param progress A precentage expressed as a double in the range [0, 1].\n   *     Use -1 if you just want to set the last pass name.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.ensureLibraryInjected(java.lang.String)",
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n   * The subdir js/ contains libraries of code that we inject\n   * at compile-time only if requested by this function.\n   *\n   * Notice that these libraries will almost always create global symbols.\n   *\n   * @param resourceName The name of the library. For example, if \"base\" is\n   *     is specified, then we load js/base.js\n   * @return If new code was injected, returns the last expression node of the\n   *     library. If the caller needs to add additional code, they should add\n   *     it as the next sibling of this node. If new code was not injected,\n   *     returns null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setOldParseTree(java.lang.String, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 384,
      "end_line": 384,
      "comment": "\n    * Stores the old parse tree for a given source file.\n    * @param sourceName\n    * @param astRoot\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getOldParseTreeByName(java.lang.String)",
      "begin_line": 391,
      "end_line": 391,
      "comment": "\n    * Gets an old format parse tree for a given source file.\n    * @param sourceName The source file name to get the tree for.\n    * @return The old format parse tree for the given source file.\n    ",
      "child_ranges": []
    }
  ]
}