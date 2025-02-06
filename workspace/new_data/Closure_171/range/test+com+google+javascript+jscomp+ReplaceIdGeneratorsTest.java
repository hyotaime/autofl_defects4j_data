{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ReplaceIdGeneratorsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceIdGeneratorsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 491,
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
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 43,col 6)",
        "(line 45,col 5)-(line 53,col 26)",
        "(line 54,col 5)-(line 54,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 35,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.Anonymous-7dd0e7b7-d698-4525-a74c-9ab295ddf7fb.get(java.lang.String)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 44)",
        "(line 41,col 9)-(line 41,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.setUp()",
      "begin_line": 57,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 18)",
        "(line 60,col 5)-(line 60,col 32)",
        "(line 61,col 5)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.getNumRepetitions()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testBackwardCompat()",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSerialization1()",
      "begin_line": 75,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 86,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSerialization2()",
      "begin_line": 89,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 101,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerialization1()",
      "begin_line": 104,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 113,col 13)",
        "(line 114,col 5)-(line 124,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerialization2()",
      "begin_line": 127,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 136,col 13)",
        "(line 137,col 5)-(line 149,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testReusePreviousSerializationConsistent1()",
      "begin_line": 152,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 157,col 13)",
        "(line 158,col 5)-(line 170,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimple()",
      "begin_line": 173,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 181,col 34)",
        "(line 183,col 5)-(line 193,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testObjectLit()",
      "begin_line": 196,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 204,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testObjectLit_empty()",
      "begin_line": 207,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 215,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimpleConsistent()",
      "begin_line": 218,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 226,col 34)",
        "(line 228,col 5)-(line 238,col 24)",
        "(line 240,col 5)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testSimpleStable()",
      "begin_line": 256,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 262,col 30)",
        "(line 264,col 5)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testVar()",
      "begin_line": 274,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 282,col 34)",
        "(line 284,col 5)-(line 289,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testInObjLit()",
      "begin_line": 292,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 300,col 39)",
        "(line 302,col 5)-(line 307,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testInObjLit2()",
      "begin_line": 310,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 318,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMapped()",
      "begin_line": 321,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 329,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMappedMap()",
      "begin_line": 332,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 344,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMapped2()",
      "begin_line": 347,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 355,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testTwoGenerators()",
      "begin_line": 358,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 378,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMixedGenerators()",
      "begin_line": 381,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 410,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testLocalCall()",
      "begin_line": 413,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 416,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testConditionalCall()",
      "begin_line": 419,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 420,col 5)-(line 422,col 59)",
        "(line 424,col 5)-(line 431,col 49)",
        "(line 433,col 5)-(line 438,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testConflictingIdGenerator()",
      "begin_line": 441,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 444,col 56)",
        "(line 446,col 5)-(line 448,col 56)",
        "(line 450,col 5)-(line 453,col 56)",
        "(line 455,col 5)-(line 462,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testUnknownMapping()",
      "begin_line": 465,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 470,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testMap(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 474,col 5)-(line 474,col 25)",
        "(line 475,col 5)-(line 475,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.test(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 478,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 32)",
        "(line 480,col 5)-(line 480,col 25)",
        "(line 481,col 5)-(line 481,col 31)",
        "(line 482,col 5)-(line 482,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceIdGeneratorsTest.testNonPseudoSupportingGenerator(java.lang.String, java.lang.String)",
      "begin_line": 485,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 32)",
        "(line 487,col 5)-(line 487,col 25)",
        "(line 488,col 5)-(line 488,col 31)",
        "(line 489,col 5)-(line 489,col 25)"
      ]
    }
  ]
}