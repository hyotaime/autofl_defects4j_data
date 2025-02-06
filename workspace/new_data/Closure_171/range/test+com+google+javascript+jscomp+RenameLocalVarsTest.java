{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/RenameLocalVarsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameLocalVarsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 140,
      "comment": "\n * Tests for {@link RenameVars}.\n * @see RenameVarsTest\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 32,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 36,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.setUp()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameSimple()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 46,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameGlobals()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameLocals()",
      "begin_line": 53,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 55,col 56)",
        "(line 56,col 5)-(line 57,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameLocalsClashingWithGlobals()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 63,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameNested()",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 68,col 54)",
        "(line 69,col 5)-(line 70,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithExterns1()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 52)",
        "(line 75,col 5)-(line 77,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithExterns2()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testDoNotRenameExportedName()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithNameOverlap()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 93,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithPrefix1()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 20)",
        "(line 98,col 5)-(line 99,col 49)",
        "(line 100,col 5)-(line 100,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithPrefix2()",
      "begin_line": 103,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 20)",
        "(line 105,col 5)-(line 106,col 65)",
        "(line 107,col 5)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testRenameWithPrefix3()",
      "begin_line": 110,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 17)",
        "(line 112,col 5)-(line 124,col 21)",
        "(line 125,col 5)-(line 125,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testBias()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 72)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameLocalVarsTest.testBias2()",
      "begin_line": 134,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 72)",
        "(line 136,col 5)-(line 136,col 39)",
        "(line 137,col 5)-(line 138,col 50)"
      ]
    }
  ]
}