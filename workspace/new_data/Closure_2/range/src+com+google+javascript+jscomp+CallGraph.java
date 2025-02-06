{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CallGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CallGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 61,
      "end_line": 810,
      "comment": "\n * A pass the uses a {@link DefinitionProvider} to compute a call graph for an\n * AST.\n *\n * \u003cp\u003eA {@link CallGraph} connects {@link Function}s to {@link Callsite}s and\n * vice versa: each function in the graph links to the callsites it contains and\n * each callsite links to the functions it could call. Similarly, each callsite\n * links to the function that contains it and each function links to the\n * callsites that could call it.\n *\n * \u003cp\u003eThe callgraph is not precise. That is, a callsite may indicate it can\n * call a function when in fact it does not do so in the running program.\n *\n * \u003cp\u003eThe callgraph is also not complete: in some cases it may be unable to\n * determine some targets of a callsite. In this case,\n * Callsite.hasUnknownTarget() will return true.\n *\n * \u003cp\u003eThe CallGraph doesn\u0027t (currently) have functions for externally defined\n * functions; however, callsites that target externs will have hasExternTarget()\n * return true.\n *\n * \u003cp\u003eTODO(dcc): Have CallGraph (optionally?) include functions for externs.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesByNode"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Maps an AST node (with type Token.CALL or Token.NEW) to a Callsite object.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionsByNode"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Maps an AST node (with type Token.FUNCTION) to a Function object. "
    },
    {
      "type": "field",
      "varNames": [
        "computeBackwardGraph"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Will the call graph support looking up the callsites that could call a\n   * given function?\n   "
    },
    {
      "type": "field",
      "varNames": [
        "computeForwardGraph"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Will the call graph support looking up the functions that a given callsite\n   * can call?\n   "
    },
    {
      "type": "field",
      "varNames": [
        "useNameReferenceGraph"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * If true, then the callgraph will use NameReferenceGraph as a\n   * definition provider; otherwise, use the faster SimpleDefinitionProvider.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "alreadyRun"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Has the CallGraph already been constructed? "
    },
    {
      "type": "field",
      "varNames": [
        "MAIN_FUNCTION_NAME"
      ],
      "begin_line": 94,
      "end_line": 95,
      "comment": " The name we give the main function. "
    },
    {
      "type": "field",
      "varNames": [
        "mainFunction"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n   *  Represents the global function. Calling getBody() on this\n   *  function will yield the global script/block.\n   *\n   *  TODO(dcc): having a single main function is somewhat misleading. Perhaps\n   *  it might be better to make CallGraph module aware and have one per\n   *  module?\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.CallGraph(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n   * Creates a call graph object supporting the specified lookups.\n   *\n   * At least one (and possibly both) of computeForwardGraph and\n   * computeBackwardGraph must be true.\n   *\n   * @param compiler The compiler\n   * @param computeForwardGraph Should the call graph allow lookup of the target\n   *        functions a given callsite could call?\n   * @param computeBackwardGraph Should the call graph allow lookup of the\n   *        callsites that could call a given function?\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 77)",
        "(line 123,col 5)-(line 123,col 29)",
        "(line 125,col 5)-(line 125,col 51)",
        "(line 126,col 5)-(line 126,col 53)",
        "(line 128,col 5)-(line 128,col 46)",
        "(line 129,col 5)-(line 129,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.CallGraph(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n   * Creates a call graph object support both forward and backward lookups.\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 143,
      "end_line": 155,
      "comment": "\n   * Builds a call graph for the given externsRoot and jsRoot.\n   * This method must not be called more than once per CallGraph instance.\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 50)",
        "(line 147,col 5)-(line 148,col 57)",
        "(line 150,col 5)-(line 150,col 60)",
        "(line 152,col 5)-(line 152,col 50)",
        "(line 154,col 5)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getFunctionForAstNode(com.google.javascript.rhino.Node)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n   * Returns the call graph Function object corresponding to the provided\n   * AST Token.FUNCTION node, or null if no such object exists.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 59)",
        "(line 164,col 5)-(line 164,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getMainFunction()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n   * Returns a Function object representing the \"main\" global function.\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getAllFunctions()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n   * Returns a collection of all functions (including the main function)\n   * in the call graph.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getUniqueFunctionWithName(java.lang.String)",
      "begin_line": 187,
      "end_line": 212,
      "comment": "\n   * Finds a function with the given name. Throws an exception if\n   * there are no functions or multiple functions with the name. This is\n   * for testing purposes only.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 204,col 9)",
        "(line 206,col 5)-(line 211,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Anonymous-0cf6af7a-b17b-4306-9911-6b26a38ee926.apply(com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 192,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 195,col 11)-(line 195,col 51)",
        "(line 198,col 11)-(line 202,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getCallsiteForAstNode(com.google.javascript.rhino.Node)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n   * Returns the call graph Callsite object corresponding to the provided\n   * AST Token.CALL or Token.NEW node, or null if no such object exists.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 220,col 30)",
        "(line 222,col 5)-(line 222,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getAllCallsites()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n   * Returns a collection of all callsites in the call graph.\n   ",
      "child_ranges": [
        "(line 229,col 4)-(line 229,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createFunctionsAndCallsites(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 236,
      "end_line": 269,
      "comment": "\n   * Creates {@link Function}s and {@link Callsite}s in a single\n   * AST traversal.\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 42)",
        "(line 241,col 5)-(line 268,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Anonymous-e8d65c1b-2d86-4dd6-9c0c-11761fe07b74.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 242,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 35)",
        "(line 246,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createFunction(com.google.javascript.rhino.Node)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n   * Create a Function object for given an Token.FUNCTION AST node.\n   *\n   * This is the bottleneck for Function creation: all Functions should\n   * be created with this method.\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 51)",
        "(line 279,col 5)-(line 279,col 48)",
        "(line 281,col 5)-(line 281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.createCallsite(com.google.javascript.rhino.Node)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 51)",
        "(line 286,col 5)-(line 286,col 48)",
        "(line 288,col 5)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.connectCallsiteToTargets(com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 306,
      "end_line": 341,
      "comment": "\n   * Maps a Callsite to the Function(s) it could call\n   * and each Function to the Callsite(s) that could call it.\n   *\n   * If the definitionProvider cannot determine the target of the Callsite,\n   * the Callsite\u0027s hasUnknownTarget field is set to true.\n   *\n   * If the definitionProvider determines that the target of the Callsite\n   * could be an extern-defined function, then the Callsite\u0027s hasExternTarget\n   * field is set to true.\n   *\n   * @param callsite The callsite for which target functions should be found\n   * @param definitionProvider The DefinitionProvider used to determine\n   *    targets of callsites.\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 310,col 30)",
        "(line 312,col 5)-(line 340,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.fillInFunctionInformation(com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 352,
      "end_line": 381,
      "comment": "\n   * Fills in function information (such as whether the function is ever\n   * aliased or whether it is exposed to .call or .apply) using the\n   * definition provider.\n   *\n   * We do this here, rather than when connecting the callgraph, to make sure\n   * that we have correct information for all functions, rather than just\n   * functions that are actually called.\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 380,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.updateFunctionForName(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 390,
      "end_line": 398,
      "comment": "\n   * Updates {@link Function} information (such as whether is is aliased\n   * or exposed to .apply or .call from a {@link NameReferenceGraph.Name}.\n   *\n   * Note: this method may be called multiple times per Function, each time\n   * with a different name.\n   ",
      "child_ranges": [
        "(line 391,col 5)-(line 393,col 5)",
        "(line 395,col 5)-(line 397,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.updateFunctionForUse(com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.rhino.Node)",
      "begin_line": 407,
      "end_line": 428,
      "comment": "\n   * Updates {@link Function} information (such as whether is is aliased\n   * or exposed to .apply or .call based a site where the function is used.\n   *\n   * Note: this method may be called multiple times per Function, each time\n   * with a different useNode.\n   ",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 41)",
        "(line 409,col 5)-(line 409,col 41)",
        "(line 411,col 5)-(line 427,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.lookupFunctionForDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 434,
      "end_line": 447,
      "comment": "\n   * Returns a {@link CallGraph.Function} for the passed in {@link Definition}\n   * or null if the definition isn\u0027t for a function.\n   ",
      "child_ranges": [
        "(line 435,col 5)-(line 444,col 5)",
        "(line 446,col 5)-(line 446,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getForwardDirectedGraph()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n   * Constructs and returns a directed graph where the nodes are functions and\n   * the edges are callsites connecting callers to callees.\n   *\n   * It is safe to call this method on both forward and backwardly constructed\n   * CallGraphs.\n   ",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.getBackwardDirectedGraph()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n   * Constructs and returns a directed graph where the nodes are functions and\n   * the edges are callsites connecting callees to callers.\n   *\n   * It is safe to call this method on both forward and backwardly constructed\n   * CallGraphs.\n   ",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.digraphConnect(com.google.javascript.jscomp.graph.DiGraph\u003ccom.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite\u003e, com.google.javascript.jscomp.CallGraph.Function, com.google.javascript.jscomp.CallGraph.Callsite, com.google.javascript.jscomp.CallGraph.Function, boolean)",
      "begin_line": 471,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 20)",
        "(line 478,col 5)-(line 478,col 25)",
        "(line 480,col 5)-(line 486,col 5)",
        "(line 488,col 5)-(line 488,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.constructDirectedGraph(boolean)",
      "begin_line": 502,
      "end_line": 535,
      "comment": "\n   * Constructs a digraph of the call graph. If {@code forward} is true, then\n   * the edges in the digraph will go from callers to callees, if false then\n   * the edges will go from callees to callers.\n   *\n   * It is safe to run this method on both a forwardly constructed callgraph\n   * and a backwardly constructed callgraph, regardless of the value of\n   * {@code forward}.\n   *\n   * @param forward If true then the digraph will be a forward digraph.\n   ",
      "child_ranges": [
        "(line 503,col 5)-(line 504,col 55)",
        "(line 507,col 5)-(line 509,col 5)",
        "(line 511,col 5)-(line 532,col 5)",
        "(line 534,col 5)-(line 534,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.constructDefinitionProvider(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 550,
      "end_line": 565,
      "comment": "\n   * Constructs a DefinitionProvider that can be used to determine the\n   * targets of callsites.\n   *\n   * This construction is the main cost of building the callgraph, so we offer\n   * the client a choice of NameReferenceGraph, which is slow and hopefully more\n   * precise, and SimpleDefinitionFinder, which is fast and perhaps not as\n   * precise.\n   *\n   * We use SimpleNameFinder as the default because in practice it does\n   * not appear to be less precise than NameReferenceGraph and is at least an\n   * order of magnitude faster on large compiles.\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 564,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.lookupDefinitionsForTargetsOfCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 575,
      "end_line": 597,
      "comment": "\n   * Queries the definition provider for the definitions that could be the\n   * targets of the given callsite node.\n   *\n   * This is complicated by the fact that NameReferenceGraph and\n   * SimpleDefinitionProvider (the two definition providers we currently\n   * use) differ on the types of target nodes they will analyze.\n   ",
      "child_ranges": [
        "(line 577,col 5)-(line 578,col 29)",
        "(line 580,col 5)-(line 580,col 53)",
        "(line 584,col 5)-(line 594,col 5)",
        "(line 596,col 5)-(line 596,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 604,
      "end_line": 725,
      "comment": "\n   * An inner class that represents functions in the call graph.\n   * A Function knows how to get its AST node and what Callsites\n   * it contains.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astNode"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAliased"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExposedToCallOrApply"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesInFunction"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsitesPossiblyTargetingFunction"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.Function(com.google.javascript.rhino.Node)",
      "begin_line": 616,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 7)-(line 617,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isMain()",
      "begin_line": 623,
      "end_line": 625,
      "comment": "\n     * Does this function represent the global \"main\" function?\n     ",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getAstNode()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n     * Returns the underlying AST node for the function. This usually\n     * has type Token.FUNCTION but in the case of the \"main\" function\n     * will have type Token.BLOCK.\n     ",
      "child_ranges": [
        "(line 633,col 7)-(line 633,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getBodyNode()",
      "begin_line": 640,
      "end_line": 646,
      "comment": "\n     * Returns the AST node for the body of the function. If this function\n     * is the main function, it will return the global block.\n     ",
      "child_ranges": [
        "(line 641,col 7)-(line 645,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getName()",
      "begin_line": 652,
      "end_line": 658,
      "comment": "\n     * Gets the name of this function. Returns null if the function is\n     * anonymous.\n     ",
      "child_ranges": [
        "(line 653,col 7)-(line 657,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getCallsitesInFunction()",
      "begin_line": 663,
      "end_line": 669,
      "comment": "\n     * Returns the callsites in this function.\n     ",
      "child_ranges": [
        "(line 664,col 7)-(line 668,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.addCallsiteInFunction(com.google.javascript.jscomp.CallGraph.Callsite)",
      "begin_line": 671,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 672,col 7)-(line 674,col 7)",
        "(line 675,col 7)-(line 675,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.getCallsitesPossiblyTargetingFunction()",
      "begin_line": 689,
      "end_line": 701,
      "comment": "\n     * Returns a collection of callsites that might call this function.\n     *\n     * getCallsitesPossiblyTargetingFunction() is a best effort only: the\n     * collection may include callsites that do not actually call this function\n     * and if this function is exported or aliased may be missing actual\n     * targets.\n     *\n     * This method should not be called on a Function from a CallGraph\n     * that was constructed with {@code computeBackwardGraph} {@code false}.\n     ",
      "child_ranges": [
        "(line 690,col 7)-(line 700,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.addCallsitePossiblyTargetingFunction(com.google.javascript.jscomp.CallGraph.Callsite)",
      "begin_line": 703,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 704,col 7)-(line 704,col 53)",
        "(line 705,col 7)-(line 708,col 7)",
        "(line 709,col 7)-(line 709,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isAliased()",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * Returns true if the function is aliased.\n     ",
      "child_ranges": [
        "(line 716,col 7)-(line 716,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Function.isExposedToCallOrApply()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\n     * Returns true if the function is ever exposed to \".call\" or \".apply\".\n     ",
      "child_ranges": [
        "(line 723,col 7)-(line 723,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callsite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 732,
      "end_line": 809,
      "comment": "\n   * An inner class that represents call sites in the call graph.\n   * A Callsite knows how to get its AST node, what its containing\n   * Function is, and what its target Functions are.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "astNode"
      ],
      "begin_line": 733,
      "end_line": 733,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasUnknownTarget"
      ],
      "begin_line": 735,
      "end_line": 735,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasExternTarget"
      ],
      "begin_line": 736,
      "end_line": 736,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "containingFunction"
      ],
      "begin_line": 738,
      "end_line": 738,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "possibleTargets"
      ],
      "begin_line": 740,
      "end_line": 740,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.Callsite(com.google.javascript.rhino.Node)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 743,col 7)-(line 743,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getAstNode()",
      "begin_line": 746,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 747,col 7)-(line 747,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getContainingFunction()",
      "begin_line": 750,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 751,col 7)-(line 751,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.getPossibleTargets()",
      "begin_line": 768,
      "end_line": 780,
      "comment": "\n     * Returns the possible target functions that this callsite could call.\n     *\n     * These targets do not include functions defined in externs. If this\n     * callsite could call an extern function, then hasExternTarget() will\n     * return true.\n     *\n     * getKnownTargets() is a best effort only: the collection may include\n     * other functions that are not actual targets and (if hasUnknownTargets()\n     * is true) may be missing actual targets.\n     *\n     * This method should not be called on a Callsite from a CallGraph\n     * that was constructed with {@code computeForwardGraph} {@code false}.\n     ",
      "child_ranges": [
        "(line 769,col 7)-(line 779,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.addPossibleTarget(com.google.javascript.jscomp.CallGraph.Function)",
      "begin_line": 782,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 783,col 7)-(line 783,col 52)",
        "(line 785,col 7)-(line 787,col 7)",
        "(line 788,col 7)-(line 788,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.hasUnknownTarget()",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\n     * If true, then DefinitionProvider used in callgraph construction\n     * was unable find all target functions of this callsite.\n     *\n     * If false, then getKnownTargets() contains all the possible targets of\n     * this callsite (and, perhaps, additional targets as well).\n     ",
      "child_ranges": [
        "(line 799,col 7)-(line 799,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CallGraph.Callsite.hasExternTarget()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * If true, then this callsite could target a function defined in the\n     * externs. If false, then not.\n     ",
      "child_ranges": [
        "(line 807,col 7)-(line 807,col 29)"
      ]
    }
  ]
}