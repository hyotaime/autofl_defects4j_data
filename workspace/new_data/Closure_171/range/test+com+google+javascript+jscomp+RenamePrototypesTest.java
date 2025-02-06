{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/RenamePrototypesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenamePrototypesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 19,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedRenameMap"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renamePrototypes"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.RenamePrototypesTest()",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 26,col 5)-(line 26,col 19)",
        "(line 27,col 5)-(line 27,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 30,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 33,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.tearDown()",
      "begin_line": 36,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 21)",
        "(line 40,col 5)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.getNumRepetitions()",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testRenamePrototypes1()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 51,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testRenamePrototypes2()",
      "begin_line": 54,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 59,col 41)",
        "(line 60,col 5)-(line 63,col 44)",
        "(line 64,col 5)-(line 65,col 60)",
        "(line 66,col 5)-(line 69,col 36)",
        "(line 71,col 5)-(line 74,col 36)",
        "(line 77,col 5)-(line 80,col 36)",
        "(line 83,col 5)-(line 86,col 42)",
        "(line 89,col 5)-(line 92,col 43)",
        "(line 95,col 5)-(line 98,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testRenamePrototypesWithGetOrSet()",
      "begin_line": 101,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 109,col 38)",
        "(line 110,col 5)-(line 111,col 44)",
        "(line 118,col 5)-(line 119,col 39)",
        "(line 120,col 5)-(line 121,col 45)",
        "(line 124,col 5)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testRenameProperties()",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n   * Test renaming private properties (end with underscores) and test to make\n   * sure we don\u0027t rename other properties.\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 60)",
        "(line 136,col 5)-(line 136,col 45)",
        "(line 137,col 5)-(line 137,col 47)",
        "(line 138,col 5)-(line 138,col 51)",
        "(line 139,col 5)-(line 139,col 53)",
        "(line 140,col 5)-(line 141,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testBoth()",
      "begin_line": 148,
      "end_line": 153,
      "comment": "\n   * Tests a potential tricky interaction between prototype renaming and\n   * property renaming.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 152,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testPropertyNameThatIsBothObjLitKeyAndPrototypeProperty()",
      "begin_line": 155,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 161,col 66)",
        "(line 166,col 5)-(line 167,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testModule()",
      "begin_line": 170,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 175,col 57)",
        "(line 177,col 5)-(line 182,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStableSimple1()",
      "begin_line": 185,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 196,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStableSimple2()",
      "begin_line": 199,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 210,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStableSimple3()",
      "begin_line": 213,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 221,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStableOverlap()",
      "begin_line": 224,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 229,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStableTrickyExternedMethods()",
      "begin_line": 232,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 236,col 43)",
        "(line 237,col 5)-(line 237,col 58)",
        "(line 238,col 5)-(line 238,col 41)",
        "(line 239,col 5)-(line 243,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypesTest.testStable(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 28)",
        "(line 249,col 5)-(line 249,col 58)",
        "(line 250,col 5)-(line 250,col 28)"
      ]
    }
  ]
}