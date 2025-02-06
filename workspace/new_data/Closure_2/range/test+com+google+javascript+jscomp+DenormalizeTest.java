{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/DenormalizeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DenormalizeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 128,
      "comment": "\n * @author johnlenz@google.com (John Lenz)\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 5)-(line 29,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.getNumRepetitions()",
      "begin_line": 32,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.testFor()",
      "begin_line": 38,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 41,col 43)",
        "(line 43,col 5)-(line 44,col 46)",
        "(line 47,col 5)-(line 47,col 54)",
        "(line 48,col 5)-(line 48,col 56)",
        "(line 51,col 5)-(line 52,col 52)",
        "(line 55,col 5)-(line 56,col 44)",
        "(line 59,col 5)-(line 60,col 58)",
        "(line 61,col 5)-(line 61,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.testForIn()",
      "begin_line": 64,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 63)",
        "(line 66,col 5)-(line 66,col 41)",
        "(line 67,col 5)-(line 67,col 45)",
        "(line 70,col 5)-(line 70,col 43)",
        "(line 71,col 5)-(line 71,col 45)",
        "(line 74,col 5)-(line 75,col 41)",
        "(line 78,col 5)-(line 78,col 42)",
        "(line 81,col 5)-(line 81,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.testInOperatorNotInsideFor()",
      "begin_line": 84,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 38)",
        "(line 94,col 5)-(line 95,col 38)",
        "(line 98,col 5)-(line 101,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NormalizeAndDenormalizePass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 110,
      "end_line": 126,
      "comment": "\n   * Create a class to combine the Normalize and Denormalize passes.\n   * This is needed because the enableNormalize() call on CompilerTestCase\n   * causes normalization of the result *and* the expected string, and\n   * we really don\u0027t want the compiler twisting the expected code around.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "denormalizePass"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalizePass"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.NormalizeAndDenormalizePass.NormalizeAndDenormalizePass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 31)",
        "(line 117,col 7)-(line 117,col 50)",
        "(line 118,col 7)-(line 118,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DenormalizeTest.NormalizeAndDenormalizePass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 60)",
        "(line 124,col 7)-(line 124,col 62)"
      ]
    }
  ]
}