{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AbstractCompiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCompiler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceExcerptProvider"
      ],
      "begin_line": 43,
      "end_line": 413,
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
      "type": "field",
      "varNames": [
        "analyzeChangedScopesOnly"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Intended for use by the compiler only; not accessed by compiler users."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getInput(com.google.javascript.rhino.InputId)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * Looks up an input (possibly an externs input) by input id.\n   * May return null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getSourceFileByName(java.lang.String)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n   * Looks up a source file by name. May return null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.newExternInput(java.lang.String)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Creates a new externs file.\n   * @param name A name for the new externs file.\n   * @throws IllegalArgumentException If the name of the externs file conflicts\n   *     with a pre-existing externs file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getModuleGraph()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Gets the module graph. May return null if there aren\u0027t at least two\n   * modules.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getInputsInOrder()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * Gets the inputs in the order in which they are being processed.\n   * Only for use by {@code AbstractCompilerRunner}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypeRegistry()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Gets a central registry of type information from the compiled JS.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypedScopeCreator()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n   * Gets a memoized scope creator with type information.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTopScope()",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n   * Gets the top scope.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n   * Report an error or warning.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.throwInternalError(java.lang.String, java.lang.Exception)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n   * Report an internal error.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getCodingConvention()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n   * Gets the current coding convention.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.reportCodeChange()",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n   * Report code changes.\n   *\n   * Passes should call reportCodeChange when they alter the JS tree. This is\n   * verified by CompilerTestCase. This allows us to optimize to a fixed point.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.addToDebugLog(java.lang.String)",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n   * Logs a message under a central logger.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n   * Sets the CssRenamingMap.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getCssRenamingMap()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n   * Gets the CssRenamingMap.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)",
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n   * Gets a suitable SCRIPT node to serve as a parent for code insertion. If\n   * {@code module} contains any inputs, the returned node will be the SCRIPT\n   * node corresponding to its first input. If {@code module} is empty, on the\n   * other hand, then the returned node will be the first SCRIPT node in a\n   * non-empty module that {@code module} depends on (the deepest one possible).\n   *\n   * @param module A module. If null, will return the first SCRIPT node of all\n   *     modules.\n   * @return A SCRIPT node (never null).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getTypeValidator()",
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n   * Gets the central registry of type violations.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseSyntheticCode(java.lang.String)",
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n   * Parses code for injecting.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseSyntheticCode(java.lang.String, java.lang.String)",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n   * Parses code for injecting, and associate it with a given source file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.parseTestCode(java.lang.String)",
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n   * Parses code for testing.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.toSource(com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n   * Prints a node to source code.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getDefaultErrorReporter()",
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n   * Gets a default error reporter for injecting into Rhino.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getReverseAbstractInterpreter()",
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n   * Get an interpreter for type analysis.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getLifeCycleStage()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n   * @return The current life-cycle stage of the AST we\u0027re working on.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getUniqueNameIdSupplier()",
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n   * Generates unique ids.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.hasHaltingErrors()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n   * @return Whether any errors have been encountered that\n   *     should stop the compilation process.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n   * Register a listener for code change events.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 217,
      "end_line": 217,
      "comment": "\n   * Remove a listener for code change events.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setScope(com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 220,
      "comment": " Let the PhaseOptimizer know which scope a pass is currently analyzing ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getJsRoot()",
      "begin_line": 223,
      "end_line": 223,
      "comment": " Returns the root of the source tree, ignoring externs ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.hasScopeChanged(com.google.javascript.rhino.Node)",
      "begin_line": 226,
      "end_line": 226,
      "comment": " True iff a function changed since the last time a pass was run ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.reportChangeToEnclosingScope(com.google.javascript.rhino.Node)",
      "begin_line": 229,
      "end_line": 229,
      "comment": " Passes that do cross-scope modifications use this (eg, InlineVariables) ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.isIdeMode()",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n   * Returns true if compiling in IDE mode.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.acceptEcmaScript5()",
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n   * @return Whether the compiler is in ES5Mode.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.acceptConstKeyword()",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n   * @return Whether the compiler accepts `const\u0027 keyword.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getParserConfig()",
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n   * Returns the parser configuration.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.isTypeCheckingEnabled()",
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n   * Returns true if type checking is enabled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.prepareAst(com.google.javascript.rhino.Node)",
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n   * Normalizes the types of AST nodes in the given tree, and\n   * annotates any nodes to which the coding convention applies so that passes\n   * can read the annotations instead of using the coding convention.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getErrorManager()",
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n   * Gets the error manager.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n   * Set the current life-cycle state.\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 279,
      "end_line": 279,
      "comment": "\n   * Are the nodes equal for the purpose of inlining?\n   * If type aware optimizations are on, type equality is checked.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setHasRegExpGlobalReferences(boolean)",
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n   * Set if RegExp global properties are used.\n   * @param references Whether there are references to the RegExp global object\n   *     properties.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.hasRegExpGlobalReferences()",
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n   * @return Whether the AST contains references to the RegExp global object\n   *     properties.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getErrorLevel(com.google.javascript.jscomp.JSError)",
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n   * @return The error level the given error object will be reported at.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalized()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalizedUnobfuscated()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 7)-(line 315,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.isNormalizedObfuscated()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 319,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.process(com.google.javascript.jscomp.CompilerPass)",
      "begin_line": 327,
      "end_line": 327,
      "comment": "\n   * Runs a given compiler-pass by calling its {@code process()} method.\n   * @param pass The pass to be run.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getRoot()",
      "begin_line": 332,
      "end_line": 332,
      "comment": "\n   * Returns the root node of the AST, which includes both externs and source.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 347,
      "end_line": 348,
      "comment": "\n   * Updates the list of references for variables in global scope.\n   *\n   * @param refMapPatch Maps each variable to all of its references; may contain\n   *     references collected from the whole AST or only a SCRIPT sub-tree.\n   * @param collectionRoot The root of sub-tree in which reference collection\n   *     has been done. This should either be a SCRIPT node (if collection is\n   *     done on a single file) or it is assumed that collection is on full AST.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getGlobalVarReferences()",
      "begin_line": 356,
      "end_line": 356,
      "comment": "\n   * This can be used to get the list of all references to all global variables\n   * based on all previous calls to {@code updateGlobalVarReferences}.\n   *\n   * @return The reference collection map associated to global scope variable.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getSynthesizedExternsInput()",
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n   * @return a CompilerInput that can be modified to add addition extern\n   * definitions;\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getProgress()",
      "begin_line": 370,
      "end_line": 370,
      "comment": "\n   * @return a number in [0,1] range indicating an approximate progress of the\n   * last compile. Note this should only be used as a hint and no assumptions\n   * should be made on accuracy, even a completed compile may choose not to set\n   * this to 1.0 at the end.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getLastPassName()",
      "begin_line": 375,
      "end_line": 375,
      "comment": "\n   * Gets the last pass name set by setProgress.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setProgress(double, java.lang.String)",
      "begin_line": 383,
      "end_line": 383,
      "comment": "\n   * Sets the progress percentage as well as the name of the last pass that\n   * ran (if available).\n   * @param progress A precentage expressed as a double in the range [0, 1].\n   *     Use -1 if you just want to set the last pass name.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.ensureLibraryInjected(java.lang.String)",
      "begin_line": 398,
      "end_line": 398,
      "comment": "\n   * The subdir js/ contains libraries of code that we inject\n   * at compile-time only if requested by this function.\n   *\n   * Notice that these libraries will almost always create global symbols.\n   *\n   * @param resourceName The name of the library. For example, if \"base\" is\n   *     is specified, then we load js/base.js\n   * @return If new code was injected, returns the last expression node of the\n   *     library. If the caller needs to add additional code, they should add\n   *     it as the next sibling of this node. If new code was not injected,\n   *     returns null.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.setOldParseTree(java.lang.String, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 405,
      "end_line": 405,
      "comment": "\n    * Stores the \"new\" Rhino parse tree for a given source file.\n    * @param sourceName The source file name.\n    * @param astRoot The \"new\" Rhino parse tree.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCompiler.getOldParseTreeByName(java.lang.String)",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n    * Gets an old format parse tree for a given source file.\n    * @param sourceName The source file name to get the tree for.\n    * @return The \"new\" Rhino parse tree for the given source file.\n    ",
      "child_ranges": []
    }
  ]
}