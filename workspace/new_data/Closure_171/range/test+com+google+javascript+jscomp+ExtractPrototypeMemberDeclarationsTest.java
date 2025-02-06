{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ExtractPrototypeMemberDeclarationsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtractPrototypeMemberDeclarationsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 287,
      "comment": "\n * Tests for {@link ExtractPrototypeMemberDeclarations}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "TMP"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.setUp()",
      "begin_line": 29,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 31,col 5)-(line 31,col 38)",
        "(line 32,col 5)-(line 32,col 22)",
        "(line 33,col 5)-(line 33,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testNotEnoughPrototypeToExtract()",
      "begin_line": 41,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 45,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testExtractingSingleClassPrototype()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 51,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testExtractingTwoClassPrototype()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 61,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testExtractingTwoClassPrototypeInDifferentBlocks()",
      "begin_line": 64,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 75,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testNoMemberDeclarations()",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 82,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testExtractingPrototypeWithQName()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 89,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testInterweaved()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testExtractingPrototypeWithNestedMembers()",
      "begin_line": 102,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 118,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testWithDevirtualization()",
      "begin_line": 121,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 140,col 25)",
        "(line 142,col 5)-(line 164,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testAnonSimple()",
      "begin_line": 167,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 40)",
        "(line 170,col 5)-(line 173,col 28)",
        "(line 175,col 5)-(line 175,col 52)",
        "(line 176,col 5)-(line 176,col 52)",
        "(line 178,col 5)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testAnonWithDevirtualization()",
      "begin_line": 185,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 40)",
        "(line 188,col 5)-(line 199,col 39)",
        "(line 201,col 5)-(line 216,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.testAnonWithSideFx()",
      "begin_line": 219,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 40)",
        "(line 221,col 5)-(line 236,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.loadPrototype(java.lang.String)",
      "begin_line": 239,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 244,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.extract(java.lang.String, java.lang.String)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 252,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.generatePrototypeDeclarations(java.lang.String, int)",
      "begin_line": 255,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 48)",
        "(line 257,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.generatePrototypeDeclaration(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.generateExtractedDeclarations(int)",
      "begin_line": 270,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 48)",
        "(line 273,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExtractPrototypeMemberDeclarationsTest.generateExtractedDeclaration(java.lang.String, java.lang.String)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 52)"
      ]
    }
  ]
}