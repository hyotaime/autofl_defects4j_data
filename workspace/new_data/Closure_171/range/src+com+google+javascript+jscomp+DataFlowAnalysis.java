{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DataFlowAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataFlowAnalysis",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 579,
      "comment": "\n * A framework to help writing static program analysis. A subclass of\n * this framework should specify how a single node changes the state\n * of a program. This class finds a safe estimate (a fixed-point) for\n * the whole program. The proven facts about the program will be\n * annotated with\n * {@link com.google.javascript.jscomp.graph.GraphNode#setAnnotation} to the\n * given control flow graph\u0027s nodes in form of {@link LatticeElement}\n * after calling {@link #analyze()}.\n *\n * \u003cp\u003eAs a guideline, the following is a list of behaviors that any analysis\n * can take:\n * \u003col\u003e\n * \u003cli\u003eFlow Direction: Is the analysis a forward or backward analysis?\n * \u003cli\u003eLattice Elements: How does the analysis represent the state of the\n * program at any given point?\n * \u003cli\u003eJOIN Operation: Given two incoming paths and a lattice state value, what\n * can the compiler conclude at the join point?\n * \u003cli\u003eFlow Equations: How does an instruction modify the state of program in\n * terms of lattice values?\n * \u003cli\u003eInitial Entry Value: What can the compiler assume at the beginning of the\n * program?\n * \u003cli\u003eInitial Estimate: What can the compiler assume at each point of the\n * program? (What is the BOTTOM value of the lattice) By definition this lattice\n * JOIN {@code x} for any {@code x} must also be {@code x}.\n * \u003c/ol\u003e\n * To make these behaviors known to the framework, the following steps must be\n * taken.\n * \u003col\u003e\n * \u003cli\u003eFlow Direction: Implement {@link #isForward()}.\n * \u003cli\u003eLattice Elements: Implement {@link LatticeElement}.\n * \u003cli\u003eJOIN Operation: Implement\n *    {@link JoinOp#apply}.\n * \u003cli\u003eFlow Equations: Implement\n * {@link #flowThrough(Object, LatticeElement)}.\n * \u003cli\u003eInitial Entry Value: Implement {@link #createEntryLattice()}.\n * \u003cli\u003eInitial Estimate: Implement {@link #createInitialEstimateLattice()}.\n * \u003c/ol\u003e\n *\n * \u003cp\u003eUpon execution of the {@link #analyze()} method, nodes of the input\n * control flow graph will be annotated with a {@link FlowState} object that\n * represents maximum fixed point solution. Any previous annotations at the\n * nodes of the control flow graph will be lost.\n *\n *\n * @param \u003cN\u003e The control flow graph\u0027s node value type.\n * @param \u003cL\u003e Lattice element type.\n "
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "joinOp"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderedWorkSet"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_STEPS"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n   * Feel free to increase this to a reasonable number if you are finding that\n   * more and more passes need more than 400000 steps before finding a\n   * fixed-point. If you just have a special case, consider calling\n   * {@link #analyse(int)} instead.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.DataFlowAnalysis(com.google.javascript.jscomp.ControlFlowGraph\u003cN\u003e, com.google.javascript.jscomp.JoinOp\u003cL\u003e)",
      "begin_line": 120,
      "end_line": 130,
      "comment": "\n   * Constructs a data flow analysis.\n   *\n   * \u003cp\u003eTypical usage\n   * \u003cpre\u003e\n   * DataFlowAnalysis dfa \u003d ...\n   * dfa.analyze();\n   * \u003c/pre\u003e\n   *\n   * {@link #analyze()} annotates the result to the control flow graph by\n   * means of {@link DiGraphNode#setAnnotation} without any\n   * modification of the graph itself. Additional calls to {@link #analyze()}\n   * recomputes the analysis which can be useful if the control flow graph\n   * has been modified.\n   *\n   * @param targetCfg The control flow graph object that this object performs\n   *     on. Modification of the graph requires a separate call to\n   *     {@link #analyze()}.\n   *\n   * @see #analyze()\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 25)",
        "(line 122,col 5)-(line 122,col 25)",
        "(line 123,col 5)-(line 124,col 49)",
        "(line 125,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.getCfg()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Returns the control flow graph that this analysis was performed on.\n   * Modifications can be done on this graph, however, the only time that the\n   * annotations are correct is after {@link #analyze()} is called and before\n   * the graph has been modified.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.getExitLatticeElement()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n   * Returns the lattice element at the exit point.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 63)",
        "(line 147,col 5)-(line 147,col 46)",
        "(line 148,col 5)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.join(L, L)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.isForward()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n   * Checks whether the analysis is a forward flow analysis or backward flow\n   * analysis.\n   *\n   * @return {@code true} if it is a forward analysis.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.flowThrough(N, L)",
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n   * Computes the output state for a given node and input state.\n   *\n   * @param node The node.\n   * @param input Input lattice that should be read-only.\n   * @return Output lattice.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.analyze()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n   * Finds a fixed-point solution using at most {@link #MAX_STEPS}\n   * iterations.\n   *\n   * @see #analyze(int)\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.analyze(int)",
      "begin_line": 201,
      "end_line": 229,
      "comment": "\n   * Finds a fixed-point solution. The function has the side effect of replacing\n   * the existing node annotations with the computed solutions using {@link\n   * com.google.javascript.jscomp.graph.GraphNode#setAnnotation(Annotation)}.\n   *\n   * \u003cp\u003eInitially, each node\u0027s input and output flow state contains the value\n   * given by {@link #createInitialEstimateLattice()} (with the exception of the\n   * entry node of the graph which takes on the {@link #createEntryLattice()}\n   * value. Each node will use the output state of its predecessor and compute a\n   * output state according to the instruction. At that time, any nodes that\n   * depends on the node\u0027s newly modified output value will need to recompute\n   * their output state again. Each step will perform a computation at one node\n   * until no extra computation will modify any existing output state anymore.\n   *\n   * @param maxSteps Max number of iterations before the method stops and throw\n   *        a {@link MaxIterationsExceededException}. This will prevent the\n   *        analysis from going into a infinite loop.\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 17)",
        "(line 203,col 5)-(line 203,col 17)",
        "(line 204,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 228,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.createInitialEstimateLattice()",
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n   * Gets the state of the initial estimation at each node.\n   *\n   * @return Initial state.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.createEntryLattice()",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n   * Gets the incoming state of the entry node.\n   *\n   * @return Entry state.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.initialize()",
      "begin_line": 248,
      "end_line": 260,
      "comment": "\n   * Initializes the work list and the control flow graph.\n   ",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 27)",
        "(line 253,col 5)-(line 259,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.flow(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 267,
      "end_line": 278,
      "comment": "\n   * Performs a single flow through a node.\n   *\n   * @return {@code true} if the flow state differs from the previous state.\n   ",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 46)",
        "(line 269,col 5)-(line 277,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.joinInputs(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 286,
      "end_line": 324,
      "comment": "\n   * Computes the new flow state at a given node\u0027s entry by merging the\n   * output (input) lattice of the node\u0027s predecessor (successor).\n   *\n   * @param node Node to compute new join.\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 46)",
        "(line 288,col 5)-(line 323,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlowState",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotation"
      ],
      "begin_line": 331,
      "end_line": 375,
      "comment": "\n   * The in and out states of a node.\n   *\n   * @param \u003cL\u003e Input and output lattice element type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.FlowState(L, L)",
      "begin_line": 341,
      "end_line": 346,
      "comment": "\n     * Private constructor. No other classes should create new states.\n     *\n     * @param inState Input.\n     * @param outState Output.\n     ",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 42)",
        "(line 343,col 7)-(line 343,col 43)",
        "(line 344,col 7)-(line 344,col 24)",
        "(line 345,col 7)-(line 345,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.getIn()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 349,col 7)-(line 349,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.setIn(L)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 353,col 7)-(line 353,col 37)",
        "(line 354,col 7)-(line 354,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.getOut()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 7)-(line 358,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.setOut(L)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 38)",
        "(line 363,col 7)-(line 363,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.toString()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 7)-(line 368,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.FlowState.hashCode()",
      "begin_line": 371,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 7)-(line 373,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 382,
      "end_line": 387,
      "comment": "\n   * The exception to be thrown if the analysis has been running for a long\n   * number of iterations. Chances are the analysis is not monotonic, a\n   * fixed-point cannot be found and it is currently stuck in an infinite loop.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.MaxIterationsExceededException.MaxIterationsExceededException(java.lang.String)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 7)-(line 385,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BranchedForwardDataFlowAnalysis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003cN, L\u003e"
      ],
      "begin_line": 389,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.initialize()",
      "begin_line": 392,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 394,col 7)-(line 394,col 29)",
        "(line 395,col 7)-(line 406,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.BranchedForwardDataFlowAnalysis(com.google.javascript.jscomp.ControlFlowGraph\u003cN\u003e, com.google.javascript.jscomp.JoinOp\u003cL\u003e)",
      "begin_line": 409,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 7)-(line 411,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.getExitLatticeElement()",
      "begin_line": 418,
      "end_line": 423,
      "comment": "\n     * Returns the lattice element at the exit point. Needs to be overridden\n     * because we use a BranchedFlowState instead of a FlowState; ugh.\n     ",
      "child_ranges": [
        "(line 420,col 7)-(line 420,col 65)",
        "(line 421,col 7)-(line 421,col 56)",
        "(line 422,col 7)-(line 422,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.isForward()",
      "begin_line": 425,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 7)-(line 427,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.branchedFlowThrough(N, L)",
      "begin_line": 441,
      "end_line": 441,
      "comment": "\n     * The branched flow function maps a single lattice to a list of output\n     * lattices.\n     *\n     * \u003cp\u003eEach outgoing edge of a node will have a corresponding output lattice\n     * in the ordered returned by\n     * {@link com.google.javascript.jscomp.graph.DiGraph#getOutEdges(Object)}\n     * in the returned list.\n     *\n     * @return A list of output values depending on the edge\u0027s branch type.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.flow(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 443,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 445,col 7)-(line 445,col 56)",
        "(line 446,col 7)-(line 446,col 36)",
        "(line 447,col 7)-(line 447,col 65)",
        "(line 448,col 7)-(line 448,col 69)",
        "(line 449,col 7)-(line 453,col 7)",
        "(line 454,col 7)-(line 454,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis.joinInputs(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 457,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 459,col 7)-(line 459,col 56)",
        "(line 460,col 7)-(line 461,col 46)",
        "(line 462,col 7)-(line 462,col 58)",
        "(line 464,col 7)-(line 471,col 7)",
        "(line 472,col 7)-(line 476,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BranchedFlowState",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotation"
      ],
      "begin_line": 485,
      "end_line": 533,
      "comment": "\n   * The in and out states of a node.\n   *\n   * @param \u003cL\u003e Input and output lattice element type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.BranchedFlowState(L, java.util.List\u003cL\u003e)",
      "begin_line": 496,
      "end_line": 501,
      "comment": "\n     * Private constructor. No other classes should create new states.\n     *\n     * @param inState Input.\n     * @param outState Output.\n     ",
      "child_ranges": [
        "(line 497,col 7)-(line 497,col 42)",
        "(line 498,col 7)-(line 498,col 43)",
        "(line 499,col 7)-(line 499,col 24)",
        "(line 500,col 7)-(line 500,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.getIn()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 504,col 7)-(line 504,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.setIn(L)",
      "begin_line": 507,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 508,col 7)-(line 508,col 37)",
        "(line 509,col 7)-(line 509,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.getOut()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 513,col 7)-(line 513,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.setOut(java.util.List\u003cL\u003e)",
      "begin_line": 516,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 517,col 7)-(line 517,col 38)",
        "(line 518,col 7)-(line 520,col 7)",
        "(line 521,col 7)-(line 521,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.toString()",
      "begin_line": 524,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 7)-(line 526,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState.hashCode()",
      "begin_line": 529,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 7)-(line 531,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.computeEscaped(com.google.javascript.jscomp.Scope, java.util.Set\u003ccom.google.javascript.jscomp.Scope.Var\u003e, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 548,
      "end_line": 578,
      "comment": "\n   * Compute set of escaped variables. When a variable is escaped in a\n   * dataflow analysis, it can be reference outside of the code that we are\n   * analyzing. A variable is escaped if any of the following is true:\n   *\n   * \u003cp\u003e\u003col\u003e\n   * \u003cli\u003eIt is defined as the exception name in CATCH clause so it became a\n   * variable local not to our definition of scope.\u003c/li\u003e\n   * \u003cli\u003eExported variables as they can be needed after the script terminates.\n   * \u003c/li\u003e\n   * \u003cli\u003eNames of named functions because in JavaScript, \u003ci\u003efunction foo(){}\u003c/i\u003e\n   * does not kill \u003ci\u003efoo\u003c/i\u003e in the dataflow.\u003c/li\u003e\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 564,col 6)",
        "(line 566,col 5)-(line 566,col 58)",
        "(line 567,col 5)-(line 567,col 31)",
        "(line 571,col 5)-(line 577,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DataFlowAnalysis.Anonymous-44b21880-3ac6-4dec-9424-4f07d172decb.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 552,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 36)",
        "(line 559,col 9)-(line 559,col 44)",
        "(line 560,col 9)-(line 562,col 9)"
      ]
    }
  ]
}