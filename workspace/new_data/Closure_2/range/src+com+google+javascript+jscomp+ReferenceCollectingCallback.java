{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ReferenceCollectingCallback.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReferenceCollectingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass",
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e"
      ],
      "begin_line": 52,
      "end_line": 724,
      "comment": "\n * A helper class for passes that want to access all information about where a\n * variable is referenced and declared at once and then make a decision as to\n * how it should be handled, possibly inlining, reordering, or generating\n * warnings. Callers do this by providing {@link Behavior} and then\n * calling {@link #process(Node, Node)}.\n *\n * @author kushal@google.com (Kushal Dave)\n "
    },
    {
      "type": "field",
      "varNames": [
        "referenceMap"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": "\n   * Maps a given variable to a collection of references to that name. Note that\n   * Var objects are not stable across multiple traversals (unlike scope root or\n   * name).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "blockStack"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * The stack of basic blocks and scopes the current traversal is in.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "behavior"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n   * Source of behavior at various points in the traversal.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n   * JavaScript compiler to use in traversing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "varFilter"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Only collect references for filtered variables.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollectingCallback(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n   * Constructor initializes block stack.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollectingCallback(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n   * Constructor only collects references that match the given variable.\n   *\n   * The test for Var equality uses reference equality, so it\u0027s necessary to\n   * inject a scope when you traverse.\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 29)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n   * Convenience method for running this pass over a tree with this\n   * class as a callback.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 111,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n   * Same as process but only runs on a part of AST associated to one script.\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.getAllSymbols()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n   * Gets the variables that were referenced in this callback.\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.getScope(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n   * Gets the reference collection for the given variable.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 147,
      "end_line": 164,
      "comment": "\n   * For each node, update the block stack and reference collection\n   * as appropriate.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 163,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 169,
      "end_line": 174,
      "comment": "\n   * Updates block stack and invokes any additional behavior.\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 40)",
        "(line 172,col 5)-(line 172,col 72)",
        "(line 173,col 5)-(line 173,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "\n   * Updates block stack and invokes any additional behavior.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 21)",
        "(line 182,col 5)-(line 188,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 202,
      "comment": "\n   * Updates block stack.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 207,
      "end_line": 237,
      "comment": "\n   * @return true if this node marks the start of a new basic block\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 234,col 5)",
        "(line 236,col 5)-(line 236,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 239,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 60)",
        "(line 242,col 5)-(line 245,col 5)",
        "(line 248,col 5)-(line 248,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceMap",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 251,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 252,
      "end_line": 252,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ReferenceMapWrapper",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap"
      ],
      "begin_line": 255,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenceMap"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMapWrapper.ReferenceMapWrapper(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMapWrapper.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Behavior",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n   * Way for callers to add specific behavior during traversal that\n   * utilizes the built-up reference information.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * Called after we finish with a scope.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "DO_NOTHING_BEHAVIOR"
      ],
      "begin_line": 279,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Anonymous-26d0ae90-a4f1-4313-bcb2-1b341ea07b6c.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 280,
      "end_line": 281,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ReferenceCollection",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e"
      ],
      "begin_line": 288,
      "end_line": 481,
      "comment": "\n   * A collection of references. Can be subclassed to apply checks or\n   * store additional state when adding.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "references"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.iterator()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.add(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isWellDefined()",
      "begin_line": 310,
      "end_line": 333,
      "comment": "\n     * Determines if the variable for this reference collection is\n     * \"well-defined.\" A variable is well-defined if we can prove at\n     * compile-time that it\u0027s assigned a value before it\u0027s used.\n     *\n     * Notice that if this function returns false, this doesn\u0027t imply that the\n     * variable is used before it\u0027s assigned. It just means that we don\u0027t\n     * have enough information to make a definitive judgment.\n     ",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 35)",
        "(line 312,col 7)-(line 314,col 7)",
        "(line 318,col 7)-(line 318,col 50)",
        "(line 319,col 7)-(line 321,col 7)",
        "(line 323,col 7)-(line 323,col 66)",
        "(line 324,col 7)-(line 324,col 50)",
        "(line 325,col 7)-(line 330,col 7)",
        "(line 332,col 7)-(line 332,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isEscaped()",
      "begin_line": 338,
      "end_line": 348,
      "comment": "\n     * Whether the variable is escaped into an inner scope.\n     ",
      "child_ranges": [
        "(line 339,col 7)-(line 339,col 25)",
        "(line 340,col 7)-(line 346,col 7)",
        "(line 347,col 7)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isInitializingDeclarationAt(int)",
      "begin_line": 357,
      "end_line": 366,
      "comment": "\n     * @param index The index into the references array to look for an\n     * assigning declaration.\n     *\n     * This is either the declaration if a value is assigned (such as\n     * \"var a \u003d 2\", \"function a()...\", \"... catch (a)...\").\n     ",
      "child_ranges": [
        "(line 358,col 7)-(line 358,col 50)",
        "(line 359,col 7)-(line 364,col 7)",
        "(line 365,col 7)-(line 365,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isInitializingAssignmentAt(int)",
      "begin_line": 374,
      "end_line": 386,
      "comment": "\n     * @param index The index into the references array to look for an\n     * initialized assignment reference. That is, an assignment immediately\n     * follow a variable declaration that itself does not initialize the\n     * variable.\n     ",
      "child_ranges": [
        "(line 375,col 7)-(line 384,col 7)",
        "(line 385,col 7)-(line 385,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.getInitializingReference()",
      "begin_line": 395,
      "end_line": 402,
      "comment": "\n     * @return The reference that provides the value for the variable at the\n     * time of the first read, if known, otherwise null.\n     *\n     * This is either the variable declaration (\"var a \u003d ...\") or first\n     * reference following the declaration if it is an assignment.\n     ",
      "child_ranges": [
        "(line 396,col 7)-(line 400,col 7)",
        "(line 401,col 7)-(line 401,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.getInitializingReferenceForConstants()",
      "begin_line": 407,
      "end_line": 415,
      "comment": "\n     * Constants are allowed to be defined after their first use.\n     ",
      "child_ranges": [
        "(line 408,col 7)-(line 408,col 35)",
        "(line 409,col 7)-(line 413,col 7)",
        "(line 414,col 7)-(line 414,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isAssignedOnceInLifetime()",
      "begin_line": 421,
      "end_line": 438,
      "comment": "\n     * @return Whether the variable is only assigned a value once for its\n     *     lifetime.\n     ",
      "child_ranges": [
        "(line 422,col 7)-(line 422,col 48)",
        "(line 423,col 7)-(line 425,col 7)",
        "(line 428,col 7)-(line 435,col 7)",
        "(line 437,col 7)-(line 437,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.getOneAndOnlyAssignment()",
      "begin_line": 444,
      "end_line": 458,
      "comment": "\n     * @return The one and only assignment. Returns if there are 0 or 2+\n     *    assignments.\n     ",
      "child_ranges": [
        "(line 445,col 7)-(line 445,col 34)",
        "(line 446,col 7)-(line 446,col 35)",
        "(line 447,col 7)-(line 456,col 7)",
        "(line 457,col 7)-(line 457,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.isNeverAssigned()",
      "begin_line": 463,
      "end_line": 472,
      "comment": "\n     * @return Whether the variable is never assigned a value.\n     ",
      "child_ranges": [
        "(line 464,col 7)-(line 464,col 35)",
        "(line 465,col 7)-(line 470,col 7)",
        "(line 471,col 7)-(line 471,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection.firstReferenceIsAssigningDeclaration()",
      "begin_line": 474,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 475,col 7)-(line 475,col 35)",
        "(line 476,col 7)-(line 478,col 7)",
        "(line 479,col 7)-(line 479,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 486,
      "end_line": 634,
      "comment": "\n   * Represents a single declaration or reference to a variable.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "DECLARATION_PARENTS"
      ],
      "begin_line": 488,
      "end_line": 489,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "basicBlock"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 7)-(line 499,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.newBleedingFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock, com.google.javascript.rhino.Node)",
      "begin_line": 504,
      "end_line": 508,
      "comment": " not appear inside their scope. So they need their own constructor.",
      "child_ranges": [
        "(line 506,col 7)-(line 507,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.createRefForTest(com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 515,
      "end_line": 519,
      "comment": "\n     * Creates a variable reference in a given script file name, used in tests.\n     *\n     * @return The created reference.\n     ",
      "child_ranges": [
        "(line 517,col 7)-(line 518,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.InputId)",
      "begin_line": 521,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 523,col 7)-(line 523,col 31)",
        "(line 524,col 7)-(line 524,col 35)",
        "(line 525,col 7)-(line 525,col 25)",
        "(line 526,col 7)-(line 526,col 29)",
        "(line 527,col 7)-(line 527,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.cloneWithNewScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Makes a copy of the current reference using a new Scope instance.\n     ",
      "child_ranges": [
        "(line 534,col 7)-(line 534,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getSymbol()",
      "begin_line": 537,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 7)-(line 539,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getNode()",
      "begin_line": 542,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 7)-(line 544,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getInputId()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 548,col 7)-(line 548,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getSourceFile()",
      "begin_line": 551,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 7)-(line 553,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isDeclaration()",
      "begin_line": 556,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 7)-(line 557,col 32)",
        "(line 558,col 7)-(line 558,col 44)",
        "(line 559,col 7)-(line 561,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isVarDeclaration()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 7)-(line 565,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isHoistedFunction()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isInitializingDeclaration()",
      "begin_line": 575,
      "end_line": 581,
      "comment": "\n     * Determines whether the variable is initialized at the declaration.\n     ",
      "child_ranges": [
        "(line 578,col 7)-(line 580,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getAssignedValue()",
      "begin_line": 587,
      "end_line": 591,
      "comment": "\n    * @return For an assignment, variable declaration, or function declaration\n    * return the assigned value, otherwise null.\n    ",
      "child_ranges": [
        "(line 588,col 7)-(line 588,col 32)",
        "(line 589,col 7)-(line 590,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getBasicBlock()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 7)-(line 594,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getParent()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 7)-(line 598,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getGrandparent()",
      "begin_line": 601,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 602,col 32)",
        "(line 603,col 7)-(line 603,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isLhsOfForInExpression(com.google.javascript.rhino.Node)",
      "begin_line": 606,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 607,col 34)",
        "(line 608,col 7)-(line 610,col 7)",
        "(line 611,col 7)-(line 611,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isSimpleAssignmentToName()",
      "begin_line": 614,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 615,col 7)-(line 615,col 32)",
        "(line 616,col 7)-(line 617,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.isLvalue()",
      "begin_line": 620,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 621,col 7)-(line 621,col 32)",
        "(line 622,col 7)-(line 622,col 40)",
        "(line 623,col 7)-(line 628,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.getScope()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BasicBlock",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 640,
      "end_line": 723,
      "comment": "\n   * Represents a section of code that is uninterrupted by control structures\n   * (conditional or iterative logic).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isHoisted"
      ],
      "begin_line": 648,
      "end_line": 648,
      "comment": "\n     * Determines whether the block may not be part of the normal control flow,\n     * but instead \"hoisted\" to the top of the scope.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isFunction"
      ],
      "begin_line": 653,
      "end_line": 653,
      "comment": "\n     * Whether this block denotes a function scope.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isLoop"
      ],
      "begin_line": 658,
      "end_line": 658,
      "comment": "\n     * Whether this block denotes a loop.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.BasicBlock(com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock, com.google.javascript.rhino.Node)",
      "begin_line": 665,
      "end_line": 681,
      "comment": "\n     * Creates a new block.\n     * @param parent The containing block.\n     * @param root The root node of the block.\n     ",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 27)",
        "(line 669,col 7)-(line 669,col 67)",
        "(line 671,col 7)-(line 671,col 42)",
        "(line 673,col 7)-(line 680,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.getParent()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 684,col 7)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.isGlobalScopeBlock()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Determines whether this block is equivalent to the very first block that\n     * is created when reference collection traversal enters global scope. Note\n     * that when traversing a single script in a hot-swap fashion a new instance\n     * of {@code BasicBlock} is created.\n     *\n     * @return true if this is global scope block.\n     ",
      "child_ranges": [
        "(line 696,col 7)-(line 696,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock.provablyExecutesBefore(com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock)",
      "begin_line": 703,
      "end_line": 722,
      "comment": "\n     * Determines whether this block is guaranteed to begin executing before\n     * the given block does.\n     ",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 30)",
        "(line 707,col 7)-(line 713,col 7)",
        "(line 715,col 7)-(line 717,col 7)",
        "(line 718,col 7)-(line 720,col 7)",
        "(line 721,col 7)-(line 721,col 19)"
      ]
    }
  ]
}