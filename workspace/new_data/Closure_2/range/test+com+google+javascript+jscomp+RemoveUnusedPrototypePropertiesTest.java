{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/RemoveUnusedPrototypePropertiesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedPrototypePropertiesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 507,
      "comment": "\n * Tests for {@link RemoveUnusedPrototypeProperties}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 25,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemoveExterns"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anchorUnusedVars"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.RemoveUnusedPrototypePropertiesTest()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 35,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 38,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.setUp()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 29)",
        "(line 44,col 5)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAnalyzePrototypeProperties()",
      "begin_line": 47,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 55,col 35)",
        "(line 58,col 5)-(line 63,col 35)",
        "(line 67,col 5)-(line 74,col 35)",
        "(line 75,col 5)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing1()",
      "begin_line": 83,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 94,col 41)",
        "(line 97,col 5)-(line 107,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing2()",
      "begin_line": 110,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 119,col 32)",
        "(line 122,col 5)-(line 130,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing3()",
      "begin_line": 133,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 145,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing4()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 155,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing5()",
      "begin_line": 158,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 169,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing6()",
      "begin_line": 172,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 183,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testAliasing7()",
      "begin_line": 186,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 192,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testStatementRestriction()",
      "begin_line": 195,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testExportedMethodsByNamingConvention()",
      "begin_line": 204,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 210,col 61)",
        "(line 212,col 5)-(line 216,col 61)",
        "(line 218,col 5)-(line 218,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testMethodsFromExternsFileNotExported()",
      "begin_line": 221,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 28)",
        "(line 223,col 5)-(line 228,col 49)",
        "(line 230,col 5)-(line 232,col 34)",
        "(line 234,col 5)-(line 234,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testExportedMethodsByNamingConventionAlwaysExported()",
      "begin_line": 237,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 28)",
        "(line 239,col 5)-(line 244,col 61)",
        "(line 246,col 5)-(line 250,col 61)",
        "(line 252,col 5)-(line 252,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testExternMethodsFromExternsFile()",
      "begin_line": 255,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 261,col 49)",
        "(line 263,col 5)-(line 267,col 49)",
        "(line 269,col 5)-(line 269,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testPropertyReferenceGraph()",
      "begin_line": 272,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 45)",
        "(line 276,col 5)-(line 277,col 74)",
        "(line 278,col 5)-(line 278,col 64)",
        "(line 279,col 5)-(line 280,col 63)",
        "(line 281,col 5)-(line 281,col 64)",
        "(line 282,col 5)-(line 282,col 74)",
        "(line 283,col 5)-(line 283,col 54)",
        "(line 284,col 5)-(line 284,col 80)",
        "(line 287,col 5)-(line 287,col 27)",
        "(line 290,col 5)-(line 290,col 38)",
        "(line 291,col 5)-(line 291,col 38)",
        "(line 292,col 5)-(line 292,col 38)",
        "(line 293,col 5)-(line 293,col 38)",
        "(line 294,col 5)-(line 294,col 38)",
        "(line 295,col 5)-(line 295,col 38)",
        "(line 296,col 5)-(line 296,col 59)",
        "(line 297,col 5)-(line 297,col 66)",
        "(line 298,col 5)-(line 298,col 73)",
        "(line 299,col 5)-(line 299,col 80)",
        "(line 300,col 5)-(line 300,col 73)",
        "(line 301,col 5)-(line 301,col 59)",
        "(line 303,col 5)-(line 304,col 59)",
        "(line 305,col 5)-(line 306,col 59)",
        "(line 307,col 5)-(line 308,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testPropertiesDefinedWithGetElem()",
      "begin_line": 311,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 73)",
        "(line 313,col 5)-(line 313,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testNeverRemoveImplicitlyUsedProperties()",
      "begin_line": 316,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 320,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testPropertyDefinedInBranch()",
      "begin_line": 323,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 325,col 23)",
        "(line 326,col 5)-(line 327,col 26)",
        "(line 328,col 5)-(line 329,col 22)",
        "(line 330,col 5)-(line 331,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testUsingAnonymousObjectsToDefeatRemoval()",
      "begin_line": 334,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 45)",
        "(line 336,col 5)-(line 336,col 64)",
        "(line 337,col 5)-(line 337,col 26)",
        "(line 338,col 5)-(line 338,col 53)",
        "(line 339,col 5)-(line 339,col 48)",
        "(line 340,col 5)-(line 341,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph()",
      "begin_line": 344,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 350,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph2()",
      "begin_line": 353,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 364,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph3()",
      "begin_line": 367,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 368,col 5)-(line 375,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph4()",
      "begin_line": 378,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 379,col 5)-(line 383,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph5()",
      "begin_line": 386,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 392,col 12)",
        "(line 394,col 5)-(line 394,col 28)",
        "(line 395,col 5)-(line 403,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph6()",
      "begin_line": 406,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 412,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGlobalFunctionsInGraph7()",
      "begin_line": 415,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 416,col 5)-(line 419,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGetterBaseline()",
      "begin_line": 422,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 28)",
        "(line 424,col 5)-(line 436,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGetter1()",
      "begin_line": 439,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 440,col 5)-(line 449,col 29)",
        "(line 451,col 5)-(line 451,col 28)",
        "(line 452,col 5)-(line 464,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testGetter2()",
      "begin_line": 467,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 28)",
        "(line 469,col 5)-(line 484,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testHook1()",
      "begin_line": 487,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 488,col 5)-(line 494,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedPrototypePropertiesTest.testHook2()",
      "begin_line": 497,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 504,col 34)"
      ]
    }
  ]
}