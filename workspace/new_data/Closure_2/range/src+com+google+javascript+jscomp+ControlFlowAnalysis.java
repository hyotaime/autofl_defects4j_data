{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ControlFlowAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ControlFlowAnalysis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 41,
      "end_line": 1058,
      "comment": "\n * This is a compiler pass that computes a control flow graph.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "astPosition"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodePriorities"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " TODO(nicksantos): should these be node annotations?"
    },
    {
      "type": "field",
      "varNames": [
        "priorityComparator"
      ],
      "begin_line": 70,
      "end_line": 77,
      "comment": " they will often be executed first in the source program."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.Anonymous-82ce1e2b-bea3-40c2-a157-59274473d595.compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 7)-(line 75,col 75)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "astPositionCounter"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "priorityCounter"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldTraverseFunctions"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edgeAnnotations"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " on only the externs."
    },
    {
      "type": "field",
      "varNames": [
        "exceptionHandler"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n   * This stack captures the structure of nested TRY blocks. The top of the\n   * stack is the inner most TRY block. A FUNCTION node in this stack implies\n   * that the handler is determined by the caller of the function at runtime.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "finallyMap"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n   * This map is used to handle the follow of FINALLY. For example:\n   *\n   * while(x) {\n   *  try {\n   *    try {\n   *      break;\n   *    } catch (a) {\n   *    } finally {\n   *      foo();\n   *    }\n   *    fooFollow();\n   *  } catch (b) {\n   *  } finally {\n   *    bar();\n   *  }\n   *  barFollow();\n   * }\n   * END();\n   *\n   * In this case finallyMap will contain a map from:\n   *    first FINALLY -\u003e bar()\n   *    second FINALLY -\u003e END()\n   *\n   * When we are connecting foo() and bar() to to their respective follow, we\n   * must also look up this map and connect:\n   *   foo() -\u003e bar()\n   *   bar() -\u003e END\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.ControlFlowAnalysis(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n   * Constructor.\n   *\n   * @param compiler Compiler instance.\n   * @param shouldTraverseFunctions Whether functions should be traversed (true\n   *    by default).\n   * @param edgeAnnotations Whether to allow edge annotations. By default,\n   *    only node annotations are allowed.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 29)",
        "(line 140,col 5)-(line 140,col 59)",
        "(line 141,col 5)-(line 141,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.getCfg()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 148,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 21)",
        "(line 151,col 5)-(line 151,col 27)",
        "(line 152,col 5)-(line 152,col 36)",
        "(line 153,col 5)-(line 153,col 39)",
        "(line 154,col 5)-(line 155,col 51)",
        "(line 156,col 5)-(line 156,col 49)",
        "(line 157,col 5)-(line 157,col 48)",
        "(line 161,col 5)-(line 161,col 24)",
        "(line 162,col 5)-(line 162,col 53)",
        "(line 163,col 5)-(line 163,col 35)",
        "(line 165,col 5)-(line 176,col 5)",
        "(line 182,col 5)-(line 186,col 5)",
        "(line 189,col 5)-(line 189,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.prioritizeFromEntryNode(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 196,
      "end_line": 215,
      "comment": "\n   * Given an entry node, find all the nodes reachable from that node\n   * and prioritize them.\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 198,col 77)",
        "(line 199,col 5)-(line 199,col 24)",
        "(line 201,col 5)-(line 214,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 217,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 45)",
        "(line 222,col 5)-(line 232,col 5)",
        "(line 250,col 5)-(line 290,col 5)",
        "(line 291,col 5)-(line 291,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 294,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleIf(com.google.javascript.rhino.Node)",
      "begin_line": 357,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 52)",
        "(line 359,col 5)-(line 359,col 41)",
        "(line 360,col 5)-(line 360,col 68)",
        "(line 362,col 5)-(line 367,col 5)",
        "(line 368,col 5)-(line 369,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleWhile(com.google.javascript.rhino.Node)",
      "begin_line": 372,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 375,col 60)",
        "(line 378,col 5)-(line 379,col 39)",
        "(line 380,col 5)-(line 381,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleDo(com.google.javascript.rhino.Node)",
      "begin_line": 384,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 79)",
        "(line 389,col 5)-(line 390,col 39)",
        "(line 391,col 5)-(line 392,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleFor(com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 431,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleSwitch(com.google.javascript.rhino.Node)",
      "begin_line": 434,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 438,col 65)",
        "(line 439,col 5)-(line 447,col 5)",
        "(line 448,col 5)-(line 448,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleCase(com.google.javascript.rhino.Node)",
      "begin_line": 451,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 454,col 40)",
        "(line 456,col 5)-(line 456,col 65)",
        "(line 457,col 5)-(line 469,col 5)",
        "(line 470,col 5)-(line 470,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleDefault(com.google.javascript.rhino.Node)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 475,col 5)-(line 475,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleWith(com.google.javascript.rhino.Node)",
      "begin_line": 478,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 57)",
        "(line 481,col 5)-(line 481,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleStmtList(com.google.javascript.rhino.Node)",
      "begin_line": 484,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 485,col 5)-(line 485,col 35)",
        "(line 487,col 5)-(line 492,col 5)",
        "(line 495,col 5)-(line 495,col 38)",
        "(line 499,col 5)-(line 501,col 5)",
        "(line 503,col 5)-(line 507,col 5)",
        "(line 510,col 5)-(line 522,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleFunction(com.google.javascript.rhino.Node)",
      "begin_line": 525,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 527,col 5)-(line 527,col 56)",
        "(line 528,col 5)-(line 529,col 70)",
        "(line 530,col 5)-(line 530,col 62)",
        "(line 531,col 5)-(line 531,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleExpr(com.google.javascript.rhino.Node)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 535,col 5)-(line 535,col 67)",
        "(line 536,col 5)-(line 536,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleThrow(com.google.javascript.rhino.Node)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleTry(com.google.javascript.rhino.Node)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleCatch(com.google.javascript.rhino.Node)",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 5)-(line 548,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleBreak(com.google.javascript.rhino.Node)",
      "begin_line": 551,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 24)",
        "(line 554,col 5)-(line 556,col 5)",
        "(line 557,col 5)-(line 557,col 13)",
        "(line 558,col 5)-(line 558,col 25)",
        "(line 559,col 5)-(line 559,col 18)",
        "(line 560,col 5)-(line 560,col 35)",
        "(line 570,col 5)-(line 593,col 5)",
        "(line 594,col 5)-(line 598,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleContinue(com.google.javascript.rhino.Node)",
      "begin_line": 601,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 602,col 5)-(line 602,col 24)",
        "(line 603,col 5)-(line 605,col 5)",
        "(line 606,col 5)-(line 606,col 13)",
        "(line 607,col 5)-(line 607,col 25)",
        "(line 608,col 5)-(line 608,col 18)",
        "(line 611,col 5)-(line 611,col 35)",
        "(line 612,col 5)-(line 626,col 5)",
        "(line 627,col 5)-(line 627,col 20)",
        "(line 628,col 5)-(line 630,col 5)",
        "(line 632,col 5)-(line 636,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleReturn(com.google.javascript.rhino.Node)",
      "begin_line": 639,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 640,col 5)-(line 640,col 25)",
        "(line 641,col 5)-(line 655,col 5)",
        "(line 657,col 5)-(line 659,col 5)",
        "(line 661,col 5)-(line 665,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.handleStmt(com.google.javascript.rhino.Node)",
      "begin_line": 668,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 670,col 5)-(line 670,col 67)",
        "(line 671,col 5)-(line 671,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowAnalysis)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 675,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(com.google.javascript.rhino.Node)",
      "begin_line": 678,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 679,col 5)-(line 679,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowAnalysis)",
      "begin_line": 692,
      "end_line": 789,
      "comment": "\n   * Computes the follow() node of a given node and its parent. There is a side\n   * effect when calling this function. If this function computed an edge that\n   * exists a FINALLY, it\u0027ll attempt to connect the fromNode to the outer\n   * FINALLY according to the finallyMap.\n   *\n   * @param fromNode The original source node since {@code node} is changed\n   *        during recursion.\n   * @param node The node that follow() should compute.\n   ",
      "child_ranges": [
        "(line 712,col 5)-(line 712,col 35)",
        "(line 713,col 5)-(line 716,col 5)",
        "(line 719,col 5)-(line 772,col 5)",
        "(line 776,col 5)-(line 776,col 38)",
        "(line 779,col 5)-(line 781,col 5)",
        "(line 783,col 5)-(line 788,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.computeFallThrough(com.google.javascript.rhino.Node)",
      "begin_line": 796,
      "end_line": 810,
      "comment": "\n   * Computes the destination node of n when we want to fallthrough into the\n   * subtree of n. We don\u0027t always create a CFG edge into n itself because of\n   * DOs and FORs.\n   ",
      "child_ranges": [
        "(line 797,col 5)-(line 809,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.createEdge(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch, com.google.javascript.rhino.Node)",
      "begin_line": 818,
      "end_line": 823,
      "comment": "\n   * Connects the two nodes in the control flow graph.\n   *\n   * @param fromNode Source.\n   * @param toNode Destination.\n   ",
      "child_ranges": [
        "(line 820,col 5)-(line 820,col 29)",
        "(line 821,col 5)-(line 821,col 27)",
        "(line 822,col 5)-(line 822,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.connectToPossibleExceptionHandler(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 830,
      "end_line": 857,
      "comment": "\n   * Connects cfgNode to the proper CATCH block if target subtree might throw\n   * an exception. If there are FINALLY blocks reached before a CATCH, it will\n   * make the corresponding entry in finallyMap.\n   ",
      "child_ranges": [
        "(line 831,col 5)-(line 856,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.getNextSiblingOfType(com.google.javascript.rhino.Node, int...)",
      "begin_line": 862,
      "end_line": 871,
      "comment": "\n   * Get the next sibling (including itself) of one of the given types.\n   ",
      "child_ranges": [
        "(line 863,col 5)-(line 869,col 5)",
        "(line 870,col 5)-(line 870,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 877,
      "end_line": 880,
      "comment": "\n   * Checks if target is actually the break target of labeled continue. The\n   * label can be null if it is an unlabeled break.\n   ",
      "child_ranges": [
        "(line 878,col 5)-(line 879,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.isContinueTarget(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 886,
      "end_line": 889,
      "comment": "\n   * Checks if target is actually the continue target of labeled continue. The\n   * label can be null if it is an unlabeled continue.\n   ",
      "child_ranges": [
        "(line 888,col 5)-(line 888,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.matchLabel(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 894,
      "end_line": 905,
      "comment": "\n   * Check if label is actually referencing the target control structure. If\n   * label is null, it always returns true.\n   ",
      "child_ranges": [
        "(line 895,col 5)-(line 897,col 5)",
        "(line 898,col 5)-(line 903,col 5)",
        "(line 904,col 5)-(line 904,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.mayThrowException(com.google.javascript.rhino.Node)",
      "begin_line": 910,
      "end_line": 931,
      "comment": "\n   * Determines if the subtree might throw an exception.\n   ",
      "child_ranges": [
        "(line 911,col 5)-(line 924,col 5)",
        "(line 925,col 5)-(line 929,col 5)",
        "(line 930,col 5)-(line 930,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.isBreakStructure(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 936,
      "end_line": 950,
      "comment": "\n   * Determines whether the given node can be terminated with a BREAK node.\n   ",
      "child_ranges": [
        "(line 937,col 5)-(line 949,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.isContinueStructure(com.google.javascript.rhino.Node)",
      "begin_line": 955,
      "end_line": 964,
      "comment": "\n   * Determines whether the given node can be advanced with a CONTINUE node.\n   ",
      "child_ranges": [
        "(line 956,col 5)-(line 963,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.getExceptionHandler(com.google.javascript.rhino.Node)",
      "begin_line": 971,
      "end_line": 981,
      "comment": "\n   * Get the TRY block with a CATCH that would be run if n throws an exception.\n   * @return The CATCH node or null if it there isn\u0027t a CATCH before the\n   *     the function terminates.\n   ",
      "child_ranges": [
        "(line 972,col 5)-(line 979,col 5)",
        "(line 980,col 5)-(line 980,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.getCatchHandlerForBlock(com.google.javascript.rhino.Node)",
      "begin_line": 987,
      "end_line": 998,
      "comment": "\n   * Locate the catch BLOCK given the first block in a TRY.\n   * @return The CATCH node or null there is no catch handler.\n   ",
      "child_ranges": [
        "(line 988,col 5)-(line 996,col 5)",
        "(line 997,col 5)-(line 997,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AstControlFlowGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1004,
      "end_line": 1057,
      "comment": "\n   * A {@link ControlFlowGraph} which provides a node comparator based on the\n   * pre-order traversal of the AST.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "priorities"
      ],
      "begin_line": 1005,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph.AstControlFlowGraph(com.google.javascript.rhino.Node, java.util.Map\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, java.lang.Integer\u003e, boolean)",
      "begin_line": 1013,
      "end_line": 1019,
      "comment": "\n     * Constructor.\n     * @param entry The entry node.\n     * @param priorities The map from nodes to position in the AST (to be\n     *    filled by the {@link ControlFlowAnalysis#shouldTraverse}).\n     ",
      "child_ranges": [
        "(line 1016,col 7)-(line 1017,col 56)",
        "(line 1018,col 7)-(line 1018,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph.getOptionalNodeComparator(boolean)",
      "begin_line": 1021,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 7)-(line 1045,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph.Anonymous-565af7be-86e8-4d6d-9fe1-d052186b1374.compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 1039,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph.Anonymous-449b812a-96d2-48ed-b1a3-0acab251978a.compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 1031,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 13)-(line 1034,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowAnalysis.AstControlFlowGraph.getPosition(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 1052,
      "end_line": 1056,
      "comment": "\n     * Gets the pre-order traversal position of the given node.\n     * @return An arbitrary counter used for comparing positions.\n     ",
      "child_ranges": [
        "(line 1053,col 7)-(line 1053,col 43)",
        "(line 1054,col 7)-(line 1054,col 43)",
        "(line 1055,col 7)-(line 1055,col 22)"
      ]
    }
  ]
}