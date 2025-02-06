{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/DevirtualizePrototypeMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DevirtualizePrototypeMethodsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 34,
      "end_line": 740,
      "comment": "\n * Tests for {@link DevirtualizePrototypeMethods}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNAL_SYMBOLS"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeInformation"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.DevirtualizePrototypeMethodsTest()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 28)",
        "(line 41,col 5)-(line 41,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.getNumRepetitions()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.setUp()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 18)",
        "(line 53,col 5)-(line 53,col 38)",
        "(line 54,col 5)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.newlineJoin(java.lang.String...)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n   * Combine source strings using \u0027\\n\u0027 as the separator.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.semicolonJoin(java.lang.String...)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n   * Combine source strings using \u0027;\u0027 as the separator.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewritePrototypeMethodTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 131,
      "comment": "\n   * Inputs for prototype method tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "INPUT"
      ],
      "begin_line": 75,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED"
      ],
      "begin_line": 88,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_TYPE_CHECKING_OFF"
      ],
      "begin_line": 106,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_TYPE_CHECKING_ON"
      ],
      "begin_line": 118,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.RewritePrototypeMethodTestInput.RewritePrototypeMethodTestInput()",
      "begin_line": 130,
      "end_line": 130,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewritePrototypeMethods1()",
      "begin_line": 133,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 23)",
        "(line 136,col 5)-(line 138,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewritePrototypeMethods2()",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 38)",
        "(line 144,col 5)-(line 146,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteChained()",
      "begin_line": 149,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 153,col 25)",
        "(line 155,col 5)-(line 163,col 73)",
        "(line 164,col 5)-(line 164,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewriteDeclarationUsedAsRValue",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n   * Inputs for declaration used as an r-value tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "DECL"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CALL"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewriteDeclarationUsedAsRValue.NoRewriteDeclarationUsedAsRValue()",
      "begin_line": 174,
      "end_line": 174,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteDeclIsExpressionStatement()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 182,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteDeclUsedAsAssignmentRhs()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 187,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteDeclUsedAsCallArgument()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 192,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewriteIfNotInGlobalScopeTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 198,
      "end_line": 206,
      "comment": "\n   * Inputs for restrict-to-global-scope tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "INPUT"
      ],
      "begin_line": 199,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewriteIfNotInGlobalScopeTestInput.NoRewriteIfNotInGlobalScopeTestInput()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteInGlobalScope()",
      "begin_line": 208,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 216,col 44)",
        "(line 218,col 5)-(line 218,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteIfNotInGlobalScope1()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteIfNotInGlobalScope2()",
      "begin_line": 225,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 228,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteNamespaceFunctions()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 235,col 19)",
        "(line 236,col 5)-(line 236,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewriteMultipleDefinitionTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 242,
      "end_line": 254,
      "comment": "\n   * Inputs for multiple definition tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "TEMPLATE"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOURCE_A"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SOURCE_B"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CALL"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE_DEFINITION_EXPECTED"
      ],
      "begin_line": 248,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewriteMultipleDefinitionTestInput.NoRewriteMultipleDefinitionTestInput()",
      "begin_line": 253,
      "end_line": 253,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteSingleDefinition1()",
      "begin_line": 256,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 259,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteSingleDefinition2()",
      "begin_line": 262,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 265,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteMultipleDefinition1()",
      "begin_line": 268,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 271,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteMultipleDefinition2()",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 277,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteMultipleDefinition3()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 283,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewritePrototypeObjectLiteralsTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 289,
      "end_line": 295,
      "comment": "\n   * Inputs for object literal tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "REGULAR"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OBJ_LIT"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CALL"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewritePrototypeObjectLiteralsTestInput.NoRewritePrototypeObjectLiteralsTestInput()",
      "begin_line": 294,
      "end_line": 294,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewritePrototypeNoObjectLiterals()",
      "begin_line": 297,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewritePrototypeObjectLiterals1()",
      "begin_line": 305,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 311,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewritePrototypeObjectLiterals2()",
      "begin_line": 314,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 317,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteExternalMethods1()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteExternalMethods2()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteCodingConvention()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteNoVarArgs()",
      "begin_line": 333,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 338,col 19)",
        "(line 340,col 5)-(line 345,col 43)",
        "(line 347,col 5)-(line 347,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteVarArgs()",
      "begin_line": 350,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 355,col 19)",
        "(line 356,col 5)-(line 356,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewriteNonCallReferenceTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 362,
      "end_line": 369,
      "comment": "\n   * Inputs for invalidating reference tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "BASE"
      ],
      "begin_line": 363,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewriteNonCallReferenceTestInput.NoRewriteNonCallReferenceTestInput()",
      "begin_line": 368,
      "end_line": 368,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteCallReference()",
      "begin_line": 371,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 379,col 44)",
        "(line 381,col 5)-(line 381,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteNoReferences()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteNonCallReference()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 75)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoRewriteNestedFunctionTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 395,
      "end_line": 406,
      "comment": "\n   * Inputs for nested definition tests.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "PREFIX"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUFFIX"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INNER"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_PREFIX"
      ],
      "begin_line": 399,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_SUFFIX"
      ],
      "begin_line": 402,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.NoRewriteNestedFunctionTestInput.NoRewriteNestedFunctionTestInput()",
      "begin_line": 405,
      "end_line": 405,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteNoNestedFunction()",
      "begin_line": 408,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 409,col 5)-(line 418,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteNestedFunction()",
      "begin_line": 421,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 427,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteImplementedMethod()",
      "begin_line": 430,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 431,col 5)-(line 435,col 19)",
        "(line 436,col 5)-(line 441,col 43)",
        "(line 442,col 5)-(line 442,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteImplementedMethod2()",
      "begin_line": 445,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 450,col 19)",
        "(line 451,col 5)-(line 451,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteImplementedMethod3()",
      "begin_line": 454,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 459,col 20)",
        "(line 460,col 5)-(line 460,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteImplementedMethod4()",
      "begin_line": 463,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 468,col 20)",
        "(line 469,col 5)-(line 469,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteImplementedMethodInObj()",
      "begin_line": 472,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 477,col 19)",
        "(line 478,col 5)-(line 484,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteGet1()",
      "begin_line": 487,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 489,col 5)-(line 493,col 19)",
        "(line 494,col 5)-(line 494,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteGet2()",
      "begin_line": 497,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 499,col 5)-(line 503,col 17)",
        "(line 504,col 5)-(line 504,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteSet1()",
      "begin_line": 507,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 513,col 19)",
        "(line 514,col 5)-(line 514,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteSet2()",
      "begin_line": 517,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 519,col 5)-(line 523,col 21)",
        "(line 524,col 5)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteNotImplementedMethod()",
      "begin_line": 527,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 528,col 5)-(line 530,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testWrapper()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ModuleTestInput",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 537,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFINITION"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "USE"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REWRITTEN_DEFINITION"
      ],
      "begin_line": 541,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REWRITTEN_USE"
      ],
      "begin_line": 544,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.ModuleTestInput.ModuleTestInput()",
      "begin_line": 547,
      "end_line": 547,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteSameModule1()",
      "begin_line": 550,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 551,col 5)-(line 556,col 12)",
        "(line 558,col 5)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteSameModule2()",
      "begin_line": 567,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 568,col 5)-(line 573,col 44)",
        "(line 575,col 5)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteSameModule3()",
      "begin_line": 584,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 585,col 5)-(line 590,col 12)",
        "(line 592,col 5)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testRewriteDefinitionBeforeUse()",
      "begin_line": 601,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 602,col 5)-(line 606,col 29)",
        "(line 608,col 5)-(line 613,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.testNoRewriteUseBeforeDefinition()",
      "begin_line": 616,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 617,col 5)-(line 621,col 36)",
        "(line 623,col 5)-(line 623,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.checkTypes(java.lang.String, java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 631,
      "end_line": 637,
      "comment": "\n   * Verifies that the compiler pass\u0027s output matches the expected\n   * output, and that nodes are annotated with the expected jstype\n   * information.\n   ",
      "child_ranges": [
        "(line 634,col 5)-(line 634,col 28)",
        "(line 635,col 5)-(line 635,col 27)",
        "(line 636,col 5)-(line 636,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 639,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 641,col 5)-(line 642,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeInformationGatherer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 650,
      "end_line": 739,
      "comment": "\n   * Wrapper that gathers function, call, and self variable type strings after\n   * the pass under test runs.  For use to test passes that modify JSType\n   * annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passUnderTest"
      ],
      "begin_line": 653,
      "end_line": 653,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeInformation"
      ],
      "begin_line": 654,
      "end_line": 654,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.TypeInformationGatherer.TypeInformationGatherer(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CompilerPass, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 656,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 659,col 7)-(line 659,col 31)",
        "(line 660,col 7)-(line 660,col 41)",
        "(line 661,col 7)-(line 661,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.TypeInformationGatherer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 664,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 43)",
        "(line 667,col 7)-(line 667,col 70)",
        "(line 668,col 7)-(line 668,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.TypeInformationGatherer.getNameString(com.google.javascript.rhino.Node)",
      "begin_line": 671,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 672,col 7)-(line 672,col 29)",
        "(line 673,col 7)-(line 694,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 697,
      "end_line": 738,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest.TypeInformationGatherer.GatherCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 698,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 29)",
        "(line 701,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 736,col 9)"
      ]
    }
  ]
}