{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CallGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 60,
      "end_line": 749,
      "comment": "\n * A pass the uses a {@link DefinitionProvider} to compute a call graph for an\n * AST.\n *\n * \u003cp\u003eA {@link CallGraph} connects {@link Function}s to {@link Callsite}s and\n * vice versa: each function in the graph links to the callsites it contains and\n * each callsite links to the functions it could call. Similarly, each callsite\n * links to the function that contains it and each function links to the\n * callsites that could call it.\n *\n * \u003cp\u003eThe callgraph is not precise. That is, a callsite may indicate it can\n * call a function when in fact it does not do so in the running program.\n *\n * \u003cp\u003eThe callgraph is also not complete: in some cases it may be unable to\n * determine some targets of a callsite. In this case,\n * Callsite.hasUnknownTarget() will return true.\n *\n * \u003cp\u003eThe CallGraph doesn\u0027t (currently) have functions for externally defined\n * functions; however, callsites that target externs will have hasExternTarget()\n * return true.\n *\n * \u003cp\u003eTODO(dcc): Have CallGraph (optionally?) include functions for externs.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesByNode"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Maps an AST node (with type Token.CALL or Token.NEW) to a Callsite object.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionsByNode"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Maps an AST node (with type Token.FUNCTION) to a Function object. "
    },
    {
      "type": "field",
      "varNames": [
        "computeBackwardGraph"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n   * Will the call graph support looking up the callsites that could call a\n   * given function?\n   "
    },
    {
      "type": "field",
      "varNames": [
        "computeForwardGraph"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n   * Will the call graph support looking up the functions that a given callsite\n   * can call?\n   "
    },
    {
      "type": "field",
      "varNames": [
        "alreadyRun"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Has the CallGraph already been constructed? "
    },
    {
      "type": "field",
      "varNames": [
        "MAIN_FUNCTION_NAME"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " The name we give the main function. "
    },
    {
      "type": "field",
      "varNames": [
        "mainFunction"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n   *  Represents the global function. Calling getBody() on this\n   *  function will yield the global script/block.\n   *\n   *  TODO(dcc): having a single main function is somewhat misleading. Perhaps\n   *  it might be better to make CallGraph module aware and have one per\n   *  module?\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.CallGraph(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "\n   * Creates a call graph object supporting the specified lookups.\n   *\n   * At least one (and possibly both) of computeForwardGraph and\n   * computeBackwardGraph must be true.\n   *\n   * @param compiler The compiler\n   * @param computeForwardGraph Should the call graph allow lookup of the target\n   *        functions a given callsite could call?\n   * @param computeBackwardGraph Should the call graph allow lookup of the\n   *        callsites that could call a given function?\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 77)",
        "(line 116,col 5)-(line 116,col 29)",
        "(line 118,col 5)-(line 118,col 51)",
        "(line 119,col 5)-(line 119,col 53)",
        "(line 121,col 5)-(line 121,col 46)",
        "(line 122,col 5)-(line 122,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.CallGraph(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n   * Creates a call graph object support both forward and backward lookups.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\n   * Builds a call graph for the given externsRoot and jsRoot.\n   * This method must not be called more than once per CallGraph instance.\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 50)",
        "(line 140,col 5)-(line 141,col 57)",
        "(line 143,col 5)-(line 143,col 60)",
        "(line 145,col 5)-(line 145,col 50)",
        "(line 147,col 5)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getFunctionForAstNode(com.google.javascript.rhino.Node)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n   * Returns the call graph Function object corresponding to the provided\n   * AST Token.FUNCTION node, or null if no such object exists.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 59)",
        "(line 157,col 5)-(line 157,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getMainFunction()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n   * Returns a Function object representing the \"main\" global function.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getAllFunctions()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n   * Returns a collection of all functions (including the main function)\n   * in the call graph.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getUniqueFunctionWithName(java.lang.String)",
      "begin_line": 180,
      "end_line": 205,
      "comment": "\n   * Finds a function with the given name. Throws an exception if\n   * there are no functions or multiple functions with the name. This is\n   * for testing purposes only.\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 197,col 9)",
        "(line 199,col 5)-(line 204,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Anonymous-70850932-972e-4082-9f98-e54815762b6a.apply(com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 185,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 188,col 11)-(line 188,col 51)",
        "(line 191,col 11)-(line 195,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getCallsiteForAstNode(com.google.javascript.rhino.Node)",
      "begin_line": 211,
      "end_line": 216,
      "comment": "\n   * Returns the call graph Callsite object corresponding to the provided\n   * AST Token.CALL or Token.NEW node, or null if no such object exists.\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 213,col 30)",
        "(line 215,col 5)-(line 215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getAllCallsites()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n   * Returns a collection of all callsites in the call graph.\n   ",
      "child_ranges": [
        "(line 222,col 4)-(line 222,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createFunctionsAndCallsites(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 229,
      "end_line": 262,
      "comment": "\n   * Creates {@link Function}s and {@link Callsite}s in a single\n   * AST traversal.\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 42)",
        "(line 234,col 5)-(line 261,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Anonymous-3d46096d-ae5d-4124-b93b-0b2eea2f63bf.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 235,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)",
        "(line 239,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createFunction(com.google.javascript.rhino.Node)",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n   * Create a Function object for given an Token.FUNCTION AST node.\n   *\n   * This is the bottleneck for Function creation: all Functions should\n   * be created with this method.\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 51)",
        "(line 272,col 5)-(line 272,col 48)",
        "(line 274,col 5)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createCallsite(com.google.javascript.rhino.Node)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 51)",
        "(line 279,col 5)-(line 279,col 48)",
        "(line 281,col 5)-(line 281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.connectCallsiteToTargets(com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 299,
      "end_line": 334,
      "comment": "\n   * Maps a Callsite to the Function(s) it could call\n   * and each Function to the Callsite(s) that could call it.\n   *\n   * If the definitionProvider cannot determine the target of the Callsite,\n   * the Callsite\u0027s hasUnknownTarget field is set to true.\n   *\n   * If the definitionProvider determines that the target of the Callsite\n   * could be an extern-defined function, then the Callsite\u0027s hasExternTarget\n   * field is set to true.\n   *\n   * @param callsite The callsite for which target functions should be found\n   * @param definitionProvider The DefinitionProvider used to determine\n   *    targets of callsites.\n   ",
      "child_ranges": [
        "(line 301,col 5)-(line 303,col 30)",
        "(line 305,col 5)-(line 333,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.fillInFunctionInformation(com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 345,
      "end_line": 359,
      "comment": "\n   * Fills in function information (such as whether the function is ever\n   * aliased or whether it is exposed to .call or .apply) using the\n   * definition provider.\n   *\n   * We do this here, rather than when connecting the callgraph, to make sure\n   * that we have correct information for all functions, rather than just\n   * functions that are actually called.\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 70)",
        "(line 348,col 5)-(line 358,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.updateFunctionForUse(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.rhino.Node)",
      "begin_line": 368,
      "end_line": 389,
      "comment": "\n   * Updates {@link Function} information (such as whether is is aliased\n   * or exposed to .apply or .call based a site where the function is used.\n   *\n   * Note: this method may be called multiple times per Function, each time\n   * with a different useNode.\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 41)",
        "(line 370,col 5)-(line 370,col 41)",
        "(line 372,col 5)-(line 388,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.lookupFunctionForDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 395,
      "end_line": 408,
      "comment": "\n   * Returns a {@link CallGraph.Function} for the passed in {@link Definition}\n   * or null if the definition isn\u0027t for a function.\n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 405,col 5)",
        "(line 407,col 5)-(line 407,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getForwardDirectedGraph()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n   * Constructs and returns a directed graph where the nodes are functions and\n   * the edges are callsites connecting callers to callees.\n   *\n   * It is safe to call this method on both forward and backwardly constructed\n   * CallGraphs.\n   ",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getBackwardDirectedGraph()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n   * Constructs and returns a directed graph where the nodes are functions and\n   * the edges are callsites connecting callees to callers.\n   *\n   * It is safe to call this method on both forward and backwardly constructed\n   * CallGraphs.\n   ",
      "child_ranges": [
        "(line 429,col 5)-(line 429,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.digraphConnect(com.google.javascript.jscomp.graph.DiGraph\u003ccom.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite\u003e, com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function, boolean)",
      "begin_line": 432,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 20)",
        "(line 439,col 5)-(line 439,col 25)",
        "(line 441,col 5)-(line 447,col 5)",
        "(line 449,col 5)-(line 449,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.constructDirectedGraph(boolean)",
      "begin_line": 463,
      "end_line": 496,
      "comment": "\n   * Constructs a digraph of the call graph. If {@code forward} is true, then\n   * the edges in the digraph will go from callers to callees, if false then\n   * the edges will go from callees to callers.\n   *\n   * It is safe to run this method on both a forwardly constructed callgraph\n   * and a backwardly constructed callgraph, regardless of the value of\n   * {@code forward}.\n   *\n   * @param forward If true then the digraph will be a forward digraph.\n   ",
      "child_ranges": [
        "(line 464,col 5)-(line 465,col 55)",
        "(line 468,col 5)-(line 470,col 5)",
        "(line 472,col 5)-(line 493,col 5)",
        "(line 495,col 5)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.constructDefinitionProvider(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 506,
      "end_line": 511,
      "comment": "\n   * Constructs a DefinitionProvider that can be used to determine the\n   * targets of callsites.\n   *\n   * We use SimpleNameFinder because in practice it does\n   * not appear to be less precise than NameReferenceGraph and is at least an\n   * order of magnitude faster on large compiles.\n   ",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 76)",
        "(line 509,col 5)-(line 509,col 43)",
        "(line 510,col 5)-(line 510,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.lookupDefinitionsForTargetsOfCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 521,
      "end_line": 536,
      "comment": "\n   * Queries the definition provider for the definitions that could be the\n   * targets of the given callsite node.\n   *\n   * This is complicated by the fact that NameReferenceGraph and\n   * SimpleDefinitionProvider (the two definition providers we currently\n   * use) differ on the types of target nodes they will analyze.\n   ",
      "child_ranges": [
        "(line 523,col 5)-(line 524,col 29)",
        "(line 526,col 5)-(line 526,col 53)",
        "(line 528,col 5)-(line 529,col 72)",
        "(line 531,col 5)-(line 533,col 5)",
        "(line 535,col 5)-(line 535,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 543,
      "end_line": 664,
      "comment": "\n   * An inner class that represents functions in the call graph.\n   * A Function knows how to get its AST node and what Callsites\n   * it contains.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astNode"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAliased"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExposedToCallOrApply"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesInFunction"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesPossiblyTargetingFunction"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.Function(com.google.javascript.rhino.Node)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 7)-(line 556,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isMain()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Does this function represent the global \"main\" function?\n     ",
      "child_ranges": [
        "(line 563,col 7)-(line 563,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getAstNode()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Returns the underlying AST node for the function. This usually\n     * has type Token.FUNCTION but in the case of the \"main\" function\n     * will have type Token.BLOCK.\n     ",
      "child_ranges": [
        "(line 572,col 7)-(line 572,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getBodyNode()",
      "begin_line": 579,
      "end_line": 585,
      "comment": "\n     * Returns the AST node for the body of the function. If this function\n     * is the main function, it will return the global block.\n     ",
      "child_ranges": [
        "(line 580,col 7)-(line 584,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getName()",
      "begin_line": 591,
      "end_line": 597,
      "comment": "\n     * Gets the name of this function. Returns null if the function is\n     * anonymous.\n     ",
      "child_ranges": [
        "(line 592,col 7)-(line 596,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getCallsitesInFunction()",
      "begin_line": 602,
      "end_line": 608,
      "comment": "\n     * Returns the callsites in this function.\n     ",
      "child_ranges": [
        "(line 603,col 7)-(line 607,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.addCallsiteInFunction(com.google.javascript.jscomp.CallGraph.Callsite)",
      "begin_line": 610,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 611,col 7)-(line 613,col 7)",
        "(line 614,col 7)-(line 614,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getCallsitesPossiblyTargetingFunction()",
      "begin_line": 628,
      "end_line": 640,
      "comment": "\n     * Returns a collection of callsites that might call this function.\n     *\n     * getCallsitesPossiblyTargetingFunction() is a best effort only: the\n     * collection may include callsites that do not actually call this function\n     * and if this function is exported or aliased may be missing actual\n     * targets.\n     *\n     * This method should not be called on a Function from a CallGraph\n     * that was constructed with {@code computeBackwardGraph} {@code false}.\n     ",
      "child_ranges": [
        "(line 629,col 7)-(line 639,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.addCallsitePossiblyTargetingFunction(com.google.javascript.jscomp.CallGraph.Callsite)",
      "begin_line": 642,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 643,col 7)-(line 643,col 53)",
        "(line 644,col 7)-(line 647,col 7)",
        "(line 648,col 7)-(line 648,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isAliased()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n     * Returns true if the function is aliased.\n     ",
      "child_ranges": [
        "(line 655,col 7)-(line 655,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isExposedToCallOrApply()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\n     * Returns true if the function is ever exposed to \".call\" or \".apply\".\n     ",
      "child_ranges": [
        "(line 662,col 7)-(line 662,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callsite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 671,
      "end_line": 748,
      "comment": "\n   * An inner class that represents call sites in the call graph.\n   * A Callsite knows how to get its AST node, what its containing\n   * Function is, and what its target Functions are.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astNode"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasUnknownTarget"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasExternTarget"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "containingFunction"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "possibleTargets"
      ],
      "begin_line": 679,
      "end_line": 679,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.Callsite(com.google.javascript.rhino.Node)",
      "begin_line": 681,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 7)-(line 682,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getAstNode()",
      "begin_line": 685,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getContainingFunction()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 690,col 7)-(line 690,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getPossibleTargets()",
      "begin_line": 707,
      "end_line": 719,
      "comment": "\n     * Returns the possible target functions that this callsite could call.\n     *\n     * These targets do not include functions defined in externs. If this\n     * callsite could call an extern function, then hasExternTarget() will\n     * return true.\n     *\n     * getKnownTargets() is a best effort only: the collection may include\n     * other functions that are not actual targets and (if hasUnknownTargets()\n     * is true) may be missing actual targets.\n     *\n     * This method should not be called on a Callsite from a CallGraph\n     * that was constructed with {@code computeForwardGraph} {@code false}.\n     ",
      "child_ranges": [
        "(line 708,col 7)-(line 718,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.addPossibleTarget(com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 721,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 722,col 7)-(line 722,col 52)",
        "(line 724,col 7)-(line 726,col 7)",
        "(line 727,col 7)-(line 727,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.hasUnknownTarget()",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\n     * If true, then DefinitionProvider used in callgraph construction\n     * was unable find all target functions of this callsite.\n     *\n     * If false, then getKnownTargets() contains all the possible targets of\n     * this callsite (and, perhaps, additional targets as well).\n     ",
      "child_ranges": [
        "(line 738,col 7)-(line 738,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.hasExternTarget()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * If true, then this callsite could target a function defined in the\n     * externs. If false, then not.\n     ",
      "child_ranges": [
        "(line 746,col 7)-(line 746,col 29)"
      ]
    }
  ]
}