{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ReplaceIdGeneratorsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceIdGeneratorsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 400,
      "comment": "\n * Tests for {@link ReplaceIdGenerators}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastPass"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMappings"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 32,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 41,col 26)",
        "(line 42,col 5)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.setUp()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)",
        "(line 48,col 5)-(line 48,col 32)",
        "(line 49,col 5)-(line 49,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.getNumRepetitions()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testBackwardCompat()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 60,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSerialization1()",
      "begin_line": 63,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 74,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSerialization2()",
      "begin_line": 77,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 89,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerialization1()",
      "begin_line": 92,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 101,col 13)",
        "(line 102,col 5)-(line 112,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerialization2()",
      "begin_line": 115,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 124,col 13)",
        "(line 125,col 5)-(line 137,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerializationConsistent1()",
      "begin_line": 140,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 145,col 13)",
        "(line 146,col 5)-(line 158,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimple()",
      "begin_line": 161,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 169,col 34)",
        "(line 171,col 5)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimpleConsistent()",
      "begin_line": 184,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 192,col 34)",
        "(line 194,col 5)-(line 204,col 24)",
        "(line 206,col 5)-(line 219,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimpleStable()",
      "begin_line": 222,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 228,col 30)",
        "(line 230,col 5)-(line 237,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testVar()",
      "begin_line": 240,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 248,col 34)",
        "(line 250,col 5)-(line 255,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testObjLit()",
      "begin_line": 258,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 266,col 39)",
        "(line 268,col 5)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testTwoGenerators()",
      "begin_line": 276,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 296,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMixedGenerators()",
      "begin_line": 299,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 328,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testLocalCall()",
      "begin_line": 331,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 334,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testConditionalCall()",
      "begin_line": 337,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 340,col 59)",
        "(line 342,col 5)-(line 349,col 49)",
        "(line 351,col 5)-(line 356,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testConflictingIdGenerator()",
      "begin_line": 359,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 362,col 56)",
        "(line 364,col 5)-(line 366,col 56)",
        "(line 368,col 5)-(line 370,col 56)",
        "(line 372,col 5)-(line 379,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMap(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 382,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 25)",
        "(line 384,col 5)-(line 384,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.test(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 387,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 32)",
        "(line 389,col 5)-(line 389,col 25)",
        "(line 390,col 5)-(line 390,col 31)",
        "(line 391,col 5)-(line 391,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testNonPseudoSupportingGenerator(java.lang.String, java.lang.String)",
      "begin_line": 394,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 32)",
        "(line 396,col 5)-(line 396,col 25)",
        "(line 397,col 5)-(line 397,col 31)",
        "(line 398,col 5)-(line 398,col 25)"
      ]
    }
  ]
}