{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckEventfulObjectDisposal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckEventfulObjectDisposal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 59,
      "end_line": 1221,
      "comment": " TODO(user) Pass needs to be updated for listenable interfaces."
    },
    {
      "type": "field",
      "varNames": [
        "EVENTFUL_OBJECT_NOT_DISPOSED"
      ],
      "begin_line": 62,
      "end_line": 66,
      "comment": " Error messages returned"
    },
    {
      "type": "field",
      "varNames": [
        "EVENTFUL_OBJECT_PURELY_LOCAL"
      ],
      "begin_line": 67,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OVERWRITE_PRIVATE_EVENTFUL_OBJECT"
      ],
      "begin_line": 70,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNLISTEN_WITH_ANONBOUND"
      ],
      "begin_line": 73,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DISPOSABLE_TYPE_NAME"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Seed types"
    },
    {
      "type": "field",
      "varNames": [
        "EVENT_HANDLER_TYPE_NAME"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "googDisposableType"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "googEventsEventHandlerType"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventfulTypes"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Eventful types"
    },
    {
      "type": "field",
      "varNames": [
        "disposeMethods"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Dispose methods is a map from regex to argument disposed/all arguments disposed."
    },
    {
      "type": "field",
      "varNames": [
        "disposeAll"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Member used to signify all arguments should be disposed."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EventfulObjectState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 121,
      "end_line": 124,
      "comment": " Combine the state and allocation site of eventful objects"
    },
    {
      "type": "field",
      "varNames": [
        "seen"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allocationSite"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkingPolicy"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n   * The disposal checking policy used.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "eventizes"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n   * Eventize DAG represented using adjacency lists.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "eventfulObjectMap"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n   * Maps from eventful object name to state.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.CheckEventfulObjectDisposal(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckEventfulObjectDisposal.DisposalCheckingPolicy)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 29)",
        "(line 145,col 5)-(line 145,col 41)",
        "(line 146,col 5)-(line 146,col 39)",
        "(line 147,col 5)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.addDisposeCall(java.lang.String, int[])",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n   * Add a new call that is used to dispose an JS object.\n   * @param pattern A regular expression that matches the function used to dispose of/register\n   *   an object as disposable\n   * @param argumentsThatAreDisposed An array of integers (ideally sorted) that specifies\n   *   the arguments of the function being disposed\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.initializeDisposeMethodsMap()",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n   * Initialize disposeMethods map with calls to dispose calls.\n   ",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 44)",
        "(line 170,col 5)-(line 170,col 54)",
        "(line 171,col 5)-(line 171,col 55)",
        "(line 172,col 5)-(line 172,col 47)",
        "(line 173,col 5)-(line 173,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.getBase(com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 18)",
        "(line 179,col 5)-(line 181,col 5)",
        "(line 183,col 5)-(line 183,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.getTypeOfThisForScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 190,
      "end_line": 198,
      "comment": "\n   * Get the type of the this in the current scope of traversal\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 53)",
        "(line 192,col 5)-(line 194,col 5)",
        "(line 195,col 5)-(line 196,col 49)",
        "(line 197,col 5)-(line 197,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.isPossiblySubtype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 210,
      "end_line": 230,
      "comment": "\n   * Determines if thisType is possibly a subtype of thatType.\n   *\n   *  It differs from isSubtype only in that thisType gets expanded\n   *  if it is a union.\n   *\n   *  Common case targeted is a function returning an eventful object\n   *  that may also return a null.\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 213,col 5)",
        "(line 215,col 5)-(line 215,col 27)",
        "(line 217,col 5)-(line 227,col 5)",
        "(line 229,col 5)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.dereference(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.generateKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 260,
      "end_line": 349,
      "comment": "\n   * Create a unique identification string for Node n, or null if function\n   * called with invalid argument.\n   *\n   * This function is basically used to distinguish between:\n   *   A.B \u003d function() {\n   *     this.eh \u003d new ...\n   *   }\n   * and\n   *   C.D \u003d function() {\n   *     this.eh \u003d new ...\n   *   }\n   *\n   * As well as\n   *   A.B \u003d function() {\n   *     var eh \u003d new ...\n   *   }\n   * and\n   *   C.D \u003d function() {\n   *     var eh \u003d new ...\n   *   }\n   *\n   * Warning: Inheritance is not currently handled.\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 264,col 15)",
        "(line 266,col 5)-(line 266,col 38)",
        "(line 268,col 5)-(line 346,col 5)",
        "(line 348,col 5)-(line 348,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 351,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 78)",
        "(line 357,col 5)-(line 357,col 82)",
        "(line 358,col 5)-(line 358,col 93)",
        "(line 364,col 5)-(line 366,col 5)",
        "(line 369,col 5)-(line 369,col 42)",
        "(line 370,col 5)-(line 370,col 50)",
        "(line 373,col 5)-(line 376,col 5)",
        "(line 383,col 5)-(line 383,col 67)",
        "(line 386,col 5)-(line 386,col 60)",
        "(line 392,col 5)-(line 399,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.computeEventful()",
      "begin_line": 402,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 406,col 50)",
        "(line 411,col 5)-(line 411,col 39)",
        "(line 412,col 5)-(line 412,col 36)",
        "(line 413,col 5)-(line 413,col 64)",
        "(line 414,col 5)-(line 414,col 49)",
        "(line 421,col 5)-(line 426,col 5)",
        "(line 428,col 5)-(line 428,col 17)",
        "(line 429,col 5)-(line 453,col 5)",
        "(line 458,col 5)-(line 464,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.maybeReturnDisposedType(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 467,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 35)",
        "(line 479,col 5)-(line 481,col 5)",
        "(line 482,col 5)-(line 482,col 47)",
        "(line 484,col 5)-(line 496,col 5)",
        "(line 498,col 5)-(line 510,col 5)",
        "(line 512,col 5)-(line 512,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComputeEventizeTraversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 518,
      "end_line": 764,
      "comment": "\n   * Compute eventize relationship graph.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "isConstructorStack"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": "\n     * Keep track of whether in the constructor or disposal scope.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isDisposalStack"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.ComputeEventizeTraversal()",
      "begin_line": 528,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 529,col 7)-(line 529,col 48)",
        "(line 530,col 7)-(line 530,col 45)",
        "(line 531,col 7)-(line 531,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.inConstructorScope()",
      "begin_line": 534,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 535,col 53)",
        "(line 536,col 7)-(line 538,col 7)",
        "(line 539,col 7)-(line 539,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.inDisposalScope()",
      "begin_line": 542,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 543,col 7)-(line 543,col 50)",
        "(line 544,col 7)-(line 546,col 7)",
        "(line 547,col 7)-(line 547,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.collectorFilterType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 553,
      "end_line": 565,
      "comment": "\n     * Filter types not interested in for eventize graph\n     ",
      "child_ranges": [
        "(line 554,col 7)-(line 556,col 7)",
        "(line 558,col 7)-(line 562,col 7)",
        "(line 564,col 7)-(line 564,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.addEventize(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 570,
      "end_line": 588,
      "comment": "\n     * Log that thisType eventizes thatType.\n     ",
      "child_ranges": [
        "(line 571,col 7)-(line 575,col 7)",
        "(line 577,col 7)-(line 577,col 51)",
        "(line 578,col 7)-(line 587,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.addEventizeClass(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 590,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 591,col 60)",
        "(line 593,col 7)-(line 593,col 63)",
        "(line 594,col 7)-(line 597,col 7)",
        "(line 598,col 7)-(line 598,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 601,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 603,col 7)-(line 603,col 32)",
        "(line 604,col 7)-(line 604,col 36)",
        "(line 605,col 7)-(line 605,col 35)",
        "(line 606,col 7)-(line 606,col 33)",
        "(line 611,col 7)-(line 672,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 675,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 677,col 7)-(line 677,col 31)",
        "(line 678,col 7)-(line 678,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.isGoogEventsUnlisten(com.google.javascript.rhino.Node)",
      "begin_line": 684,
      "end_line": 712,
      "comment": "\n     * Is the current node a call to goog.events.unlisten\n     ",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 57)",
        "(line 687,col 7)-(line 687,col 43)",
        "(line 689,col 7)-(line 689,col 53)",
        "(line 690,col 7)-(line 692,col 7)",
        "(line 694,col 7)-(line 711,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.isCalled(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 715,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 716,col 7)-(line 716,col 46)",
        "(line 717,col 7)-(line 720,col 7)",
        "(line 721,col 7)-(line 721,col 68)",
        "(line 722,col 7)-(line 722,col 51)",
        "(line 723,col 7)-(line 725,col 7)",
        "(line 731,col 7)-(line 737,col 7)",
        "(line 738,col 7)-(line 741,col 7)",
        "(line 748,col 7)-(line 748,col 74)",
        "(line 749,col 7)-(line 751,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.ComputeEventizeTraversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 754,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 756,col 7)-(line 762,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 766,
      "end_line": 1220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.createsEventfulObject(com.google.javascript.rhino.Node)",
      "begin_line": 770,
      "end_line": 788,
      "comment": "\n     * Checks if the input node correspond to the creation of an eventful object\n     ",
      "child_ranges": [
        "(line 771,col 7)-(line 771,col 37)",
        "(line 772,col 7)-(line 772,col 34)",
        "(line 773,col 7)-(line 778,col 7)",
        "(line 780,col 7)-(line 780,col 46)",
        "(line 781,col 7)-(line 786,col 7)",
        "(line 787,col 7)-(line 787,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.localEventfulObjectAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 798,
      "end_line": 856,
      "comment": "\n     * This function traverses the current scope to see if a locally\n     * defined eventful object is assigned to a live-out variable.\n     *\n     * Note: This function could be called multiple times to traverse\n     * the same scope if multiple local eventful objects are created in the\n     * scope.\n     ",
      "child_ranges": [
        "(line 800,col 7)-(line 800,col 18)",
        "(line 801,col 7)-(line 811,col 7)",
        "(line 816,col 7)-(line 828,col 7)",
        "(line 834,col 7)-(line 834,col 55)",
        "(line 835,col 7)-(line 837,col 7)",
        "(line 839,col 7)-(line 839,col 28)",
        "(line 840,col 7)-(line 851,col 7)",
        "(line 852,col 7)-(line 852,col 38)",
        "(line 855,col 7)-(line 855,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.isNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 861,
      "end_line": 928,
      "comment": "\n     * Record the creation of a new eventful object.\n     ",
      "child_ranges": [
        "(line 862,col 7)-(line 864,col 7)",
        "(line 869,col 7)-(line 869,col 17)",
        "(line 870,col 7)-(line 870,col 24)",
        "(line 878,col 7)-(line 882,col 7)",
        "(line 888,col 7)-(line 891,col 7)",
        "(line 893,col 7)-(line 893,col 48)",
        "(line 894,col 7)-(line 896,col 7)",
        "(line 898,col 7)-(line 898,col 28)",
        "(line 899,col 7)-(line 906,col 7)",
        "(line 907,col 7)-(line 907,col 38)",
        "(line 913,col 7)-(line 927,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.maybeGetValueNodesFromCall(com.google.javascript.rhino.Node)",
      "begin_line": 930,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 941,col 7)-(line 941,col 44)",
        "(line 942,col 7)-(line 942,col 37)",
        "(line 944,col 7)-(line 946,col 7)",
        "(line 947,col 7)-(line 947,col 49)",
        "(line 949,col 7)-(line 959,col 7)",
        "(line 962,col 7)-(line 991,col 7)",
        "(line 998,col 7)-(line 998,col 56)",
        "(line 999,col 7)-(line 1001,col 7)",
        "(line 1002,col 7)-(line 1012,col 7)",
        "(line 1014,col 7)-(line 1014,col 49)",
        "(line 1015,col 7)-(line 1020,col 7)",
        "(line 1022,col 7)-(line 1022,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.isCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1030,
      "end_line": 1056,
      "comment": "\n     * Look for calls to an eventful object\u0027s disposal functions.\n     * (dispose or removeAll will remove all event listeners from\n     * an EventHandler).\n     ",
      "child_ranges": [
        "(line 1032,col 7)-(line 1032,col 63)",
        "(line 1034,col 7)-(line 1055,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.dereference(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1062,
      "end_line": 1064,
      "comment": "\n     * Dereference a type, autoboxing it and filtering out null.\n     * From {@link CheckAccessControls}\n     ",
      "child_ranges": [
        "(line 1063,col 7)-(line 1063,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.isAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1073,
      "end_line": 1135,
      "comment": "\n     * Track assignments to see if a private field is being\n     * overwritten.\n     *\n     * Assigning to an array element is taken care of by the generateKey\n     * returning null on array (\"complex\") variable names.\n     ",
      "child_ranges": [
        "(line 1074,col 7)-(line 1074,col 42)",
        "(line 1075,col 7)-(line 1075,col 53)",
        "(line 1076,col 7)-(line 1078,col 7)",
        "(line 1080,col 7)-(line 1134,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.isReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1140,
      "end_line": 1162,
      "comment": "\n     * Filter out any eventful objects returned.\n     ",
      "child_ranges": [
        "(line 1141,col 7)-(line 1141,col 44)",
        "(line 1142,col 7)-(line 1144,col 7)",
        "(line 1145,col 7)-(line 1145,col 45)",
        "(line 1146,col 7)-(line 1148,col 7)",
        "(line 1150,col 7)-(line 1150,col 38)",
        "(line 1151,col 7)-(line 1156,col 7)",
        "(line 1157,col 7)-(line 1159,col 7)",
        "(line 1161,col 7)-(line 1161,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.eventfulObjectDisposed(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1167,
      "end_line": 1179,
      "comment": "\n     * Mark an eventful object as being disposed.\n     ",
      "child_ranges": [
        "(line 1168,col 7)-(line 1168,col 55)",
        "(line 1169,col 7)-(line 1171,col 7)",
        "(line 1173,col 7)-(line 1173,col 57)",
        "(line 1174,col 7)-(line 1177,col 7)",
        "(line 1178,col 7)-(line 1178,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1181,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 7)-(line 1187,col 59)",
        "(line 1188,col 7)-(line 1189,col 65)",
        "(line 1190,col 7)-(line 1190,col 25)",
        "(line 1192,col 7)-(line 1194,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposal.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1201,
      "end_line": 1219,
      "comment": "",
      "child_ranges": [
        "(line 1203,col 7)-(line 1218,col 7)"
      ]
    }
  ]
}