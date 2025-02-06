{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/RescopeGlobalSymbolsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RescopeGlobalSymbolsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 224,
      "comment": "\n * Unit tests for {@link RescopeGlobalSymbols}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.RescopeGlobalSymbolsTest()",
      "begin_line": 27,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 5)-(line 31,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.setUp()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 18)",
        "(line 36,col 5)-(line 36,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.getNumRepetitions()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testVarDeclarations()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 35)",
        "(line 46,col 5)-(line 46,col 67)",
        "(line 47,col 5)-(line 48,col 76)",
        "(line 49,col 5)-(line 49,col 49)",
        "(line 50,col 5)-(line 50,col 23)",
        "(line 51,col 5)-(line 51,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testVarDeclarations_allSameModule()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 56)",
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 57,col 41)",
        "(line 58,col 5)-(line 58,col 77)",
        "(line 59,col 5)-(line 59,col 34)",
        "(line 60,col 5)-(line 60,col 23)",
        "(line 61,col 5)-(line 61,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testVarDeclarations_acrossModules()",
      "begin_line": 64,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 56)",
        "(line 66,col 5)-(line 68,col 41)",
        "(line 69,col 5)-(line 71,col 68)",
        "(line 72,col 5)-(line 74,col 68)",
        "(line 75,col 5)-(line 77,col 73)",
        "(line 78,col 5)-(line 80,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testForLoops()",
      "begin_line": 83,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 56)",
        "(line 85,col 5)-(line 87,col 76)",
        "(line 88,col 5)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testForLoops_acrossModules()",
      "begin_line": 94,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 96,col 45)",
        "(line 97,col 5)-(line 98,col 54)",
        "(line 99,col 5)-(line 100,col 63)",
        "(line 101,col 5)-(line 102,col 72)",
        "(line 103,col 5)-(line 104,col 44)",
        "(line 105,col 5)-(line 106,col 53)",
        "(line 107,col 5)-(line 108,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testFunctionStatements()",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 113,col 32)",
        "(line 114,col 5)-(line 115,col 37)",
        "(line 116,col 5)-(line 116,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testDeeperScopes()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 39)",
        "(line 122,col 5)-(line 123,col 48)",
        "(line 124,col 5)-(line 125,col 43)",
        "(line 126,col 5)-(line 127,col 58)",
        "(line 128,col 5)-(line 129,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testTryCatch()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 134,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testShadow()",
      "begin_line": 137,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 139,col 48)",
        "(line 140,col 5)-(line 141,col 74)",
        "(line 142,col 5)-(line 145,col 43)",
        "(line 146,col 5)-(line 149,col 26)",
        "(line 150,col 5)-(line 153,col 54)",
        "(line 154,col 5)-(line 159,col 33)",
        "(line 160,col 5)-(line 161,col 46)",
        "(line 164,col 5)-(line 165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.testExterns()",
      "begin_line": 168,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 171,col 39)",
        "(line 172,col 5)-(line 174,col 68)",
        "(line 175,col 5)-(line 177,col 68)",
        "(line 178,col 5)-(line 180,col 68)",
        "(line 181,col 5)-(line 183,col 66)",
        "(line 184,col 5)-(line 186,col 72)",
        "(line 187,col 5)-(line 189,col 47)",
        "(line 191,col 5)-(line 193,col 46)",
        "(line 195,col 5)-(line 197,col 39)",
        "(line 199,col 5)-(line 204,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringCompare",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 207,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.StringCompare.StringCompare()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.StringCompare.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbolsTest.StringCompare.testFreeCallSemantics()",
      "begin_line": 217,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 218,col 7)-(line 219,col 68)",
        "(line 220,col 7)-(line 221,col 39)"
      ]
    }
  ]
}