{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CoalesceVariableNamesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoalesceVariableNamesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 450,
      "comment": "\n * Unit tests for {@link CoalesceVariableNames}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "usePseudoName"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.getNumRepetitions()",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 4)-(line 33,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.setUp()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 38)",
        "(line 39,col 5)-(line 39,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 42,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 50,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.Anonymous-cda7c077-a863-4a2d-bb21-0d3b1e8e77f2.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testSimple()",
      "begin_line": 53,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 55,col 57)",
        "(line 57,col 5)-(line 58,col 42)",
        "(line 60,col 5)-(line 60,col 42)",
        "(line 62,col 5)-(line 63,col 42)",
        "(line 65,col 5)-(line 66,col 39)",
        "(line 68,col 5)-(line 69,col 41)",
        "(line 71,col 5)-(line 72,col 40)",
        "(line 74,col 5)-(line 75,col 47)",
        "(line 77,col 5)-(line 77,col 44)",
        "(line 79,col 5)-(line 80,col 44)",
        "(line 82,col 5)-(line 83,col 54)",
        "(line 85,col 5)-(line 85,col 41)",
        "(line 87,col 5)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testMergeThreeVarNames()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testDifferentBlock()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testLoops()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 61)",
        "(line 102,col 5)-(line 103,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testEscaped()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testFor()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 112,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testForIn()",
      "begin_line": 115,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 118,col 65)",
        "(line 120,col 5)-(line 121,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testLoopInductionVar()",
      "begin_line": 124,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 132,col 37)",
        "(line 134,col 5)-(line 139,col 49)",
        "(line 141,col 5)-(line 142,col 55)",
        "(line 144,col 5)-(line 145,col 51)",
        "(line 147,col 5)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testSwitchCase()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testDuplicatedVar()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 159,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testTryCatch()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 164,col 53)",
        "(line 165,col 5)-(line 166,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testDeadAssignment()",
      "begin_line": 169,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 46)",
        "(line 171,col 5)-(line 171,col 46)",
        "(line 172,col 5)-(line 172,col 46)",
        "(line 173,col 5)-(line 173,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testParameter()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 178,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testParameter2()",
      "begin_line": 181,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 52)",
        "(line 184,col 5)-(line 184,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testParameter3()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testParameter4()",
      "begin_line": 192,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 196,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testParameter4b()",
      "begin_line": 199,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 202,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testLiveRangeChangeWithinCfgNode()",
      "begin_line": 205,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 47)",
        "(line 207,col 5)-(line 207,col 39)",
        "(line 210,col 5)-(line 210,col 51)",
        "(line 211,col 5)-(line 211,col 80)",
        "(line 212,col 5)-(line 212,col 55)",
        "(line 213,col 5)-(line 213,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testLiveRangeChangeWithinCfgNode2()",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 218,col 57)",
        "(line 219,col 5)-(line 222,col 57)",
        "(line 223,col 5)-(line 226,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testFunctionNameReuse()",
      "begin_line": 229,
      "end_line": 249,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testBug1401831()",
      "begin_line": 251,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 262,col 12)",
        "(line 263,col 5)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testDeterministic()",
      "begin_line": 266,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 289,col 36)",
        "(line 296,col 5)-(line 308,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testVarLiveRangeCross()",
      "begin_line": 312,
      "end_line": 322,
      "comment": " Sometimes live range can be cross even within a VAR declaration.",
      "child_ranges": [
        "(line 313,col 5)-(line 314,col 43)",
        "(line 315,col 5)-(line 316,col 56)",
        "(line 317,col 5)-(line 318,col 70)",
        "(line 319,col 5)-(line 320,col 70)",
        "(line 321,col 5)-(line 321,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testBug1445366()",
      "begin_line": 324,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 336,col 14)",
        "(line 339,col 5)-(line 352,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testCannotReuseAnyParamsBug()",
      "begin_line": 355,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 381,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testForInWithAssignment()",
      "begin_line": 384,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 401,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testUsePseduoNames()",
      "begin_line": 404,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 405,col 5)-(line 405,col 25)",
        "(line 406,col 5)-(line 407,col 67)",
        "(line 409,col 5)-(line 413,col 43)",
        "(line 415,col 5)-(line 421,col 31)",
        "(line 423,col 5)-(line 426,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.testMaxVars()",
      "begin_line": 429,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 21)",
        "(line 431,col 5)-(line 434,col 5)",
        "(line 435,col 5)-(line 435,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.inFunction(java.lang.String)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.inFunction(java.lang.String, java.lang.String)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 444,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNamesTest.test(java.lang.String)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 448,col 5)-(line 448,col 19)"
      ]
    }
  ]
}