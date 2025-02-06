{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/SpecializeModuleTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpecializeModuleTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 29,
      "end_line": 523,
      "comment": "\n * Tests for {@link SpecializeModule}.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHARED_EXTERNS"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleTest()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineFunctions"
      ],
      "begin_line": 37,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.Anonymous-8b9f7b8f-c7aa-40e9-bc58-2597d2bd6970.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 42,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypeProperties"
      ],
      "begin_line": 46,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.Anonymous-53ad67d8-12d8-49e5-98dc-e1ab68c80349.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 7)-(line 50,col 73)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "devirtualizePrototypeMethods"
      ],
      "begin_line": 54,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.Anonymous-c3283ef6-9917-4bee-8b70-4abf5401b529.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 62,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 66,col 41)",
        "(line 68,col 5)-(line 76,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.Anonymous-2ed6dfba-94fc-4fcd-98e3-538c4417089a.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 48)",
        "(line 74,col 9)-(line 74,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.setUp()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 18)",
        "(line 83,col 5)-(line 83,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeInline()",
      "begin_line": 86,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 99,col 10)",
        "(line 101,col 5)-(line 114,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeCascadedInline()",
      "begin_line": 117,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 127,col 12)",
        "(line 129,col 5)-(line 140,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeInlineWithMultipleDependents()",
      "begin_line": 143,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 155,col 6)",
        "(line 157,col 5)-(line 171,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeInlineWithNamespaces()",
      "begin_line": 174,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 184,col 15)",
        "(line 186,col 5)-(line 197,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeInlineWithRegularFunctions()",
      "begin_line": 200,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 209,col 12)",
        "(line 211,col 5)-(line 222,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testDontSpecializeLocalNonAnonymousFunctions()",
      "begin_line": 225,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 27)",
        "(line 229,col 5)-(line 234,col 12)",
        "(line 236,col 5)-(line 242,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testAddDummyVarsForRemovedFunctions()",
      "begin_line": 245,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 255,col 12)",
        "(line 257,col 5)-(line 267,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeRemoveUnusedProperties()",
      "begin_line": 270,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 282,col 12)",
        "(line 284,col 5)-(line 294,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testDontSpecializeAliasedFunctions_inline()",
      "begin_line": 297,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 307,col 16)",
        "(line 309,col 5)-(line 319,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testDontSpecializeAliasedFunctions_remove_unused_properties()",
      "begin_line": 322,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 336,col 12)",
        "(line 338,col 5)-(line 351,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeDevirtualizePrototypeMethods()",
      "begin_line": 354,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 364,col 12)",
        "(line 366,col 5)-(line 379,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.testSpecializeDevirtualizePrototypeMethodsWithInline()",
      "begin_line": 382,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 383,col 5)-(line 391,col 12)",
        "(line 393,col 5)-(line 400,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpecializeModuleSpecializationStateTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 406,
      "end_line": 522,
      "comment": "\n   * Tests for {@link SpecializeModule.SpecializationState}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 413,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 415,col 7)-(line 415,col 30)",
        "(line 417,col 7)-(line 433,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.Anonymous-e6f0d5fd-9c9f-4eb7-8151-026ff7e43801.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 419,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 421,col 11)-(line 422,col 51)",
        "(line 424,col 11)-(line 424,col 43)",
        "(line 426,col 11)-(line 427,col 48)",
        "(line 429,col 11)-(line 429,col 51)",
        "(line 431,col 11)-(line 431,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.testRemovedFunctions()",
      "begin_line": 436,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 437,col 7)-(line 437,col 57)",
        "(line 439,col 7)-(line 439,col 71)",
        "(line 441,col 7)-(line 441,col 41)",
        "(line 443,col 7)-(line 443,col 72)",
        "(line 444,col 7)-(line 444,col 80)",
        "(line 446,col 7)-(line 446,col 41)",
        "(line 448,col 7)-(line 448,col 72)",
        "(line 449,col 7)-(line 450,col 43)",
        "(line 452,col 7)-(line 452,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.testSpecializedFunctions()",
      "begin_line": 455,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 456,col 7)-(line 456,col 57)",
        "(line 458,col 7)-(line 458,col 75)",
        "(line 460,col 7)-(line 460,col 41)",
        "(line 462,col 7)-(line 462,col 53)",
        "(line 463,col 7)-(line 464,col 47)",
        "(line 466,col 7)-(line 466,col 41)",
        "(line 468,col 7)-(line 468,col 53)",
        "(line 469,col 7)-(line 470,col 47)",
        "(line 472,col 7)-(line 472,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.testCanFixupFunction()",
      "begin_line": 475,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 476,col 7)-(line 481,col 42)",
        "(line 483,col 7)-(line 483,col 64)",
        "(line 484,col 7)-(line 484,col 64)",
        "(line 485,col 7)-(line 485,col 67)",
        "(line 486,col 7)-(line 486,col 69)",
        "(line 487,col 7)-(line 487,col 69)",
        "(line 490,col 7)-(line 491,col 31)",
        "(line 493,col 7)-(line 493,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.findFunction(java.lang.String)",
      "begin_line": 496,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 497,col 7)-(line 497,col 50)",
        "(line 498,col 7)-(line 498,col 71)",
        "(line 499,col 7)-(line 499,col 54)",
        "(line 500,col 7)-(line 500,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 506,
      "end_line": 521,
      "comment": "\n     * Quick Traversal to find a given function in the AST.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "found"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.FunctionFinder.FunctionFinder(java.lang.String)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SpecializeModuleTest.SpecializeModuleSpecializationStateTest.FunctionFinder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 514,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 519,col 9)"
      ]
    }
  ]
}