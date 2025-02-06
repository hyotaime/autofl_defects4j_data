{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/RecordFunctionInformationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RecordFunctionInformationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 213,
      "comment": "\n * Tests for {@link RecordFunctionInformation}\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.testFunction()",
      "begin_line": 31,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 32)",
        "(line 33,col 5)-(line 33,col 45)",
        "(line 34,col 5)-(line 34,col 42)",
        "(line 36,col 5)-(line 37,col 44)",
        "(line 38,col 5)-(line 46,col 39)",
        "(line 47,col 5)-(line 55,col 43)",
        "(line 56,col 5)-(line 59,col 46)",
        "(line 61,col 5)-(line 61,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.testModule()",
      "begin_line": 64,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 32)",
        "(line 66,col 5)-(line 66,col 45)",
        "(line 67,col 5)-(line 67,col 45)",
        "(line 68,col 5)-(line 68,col 45)",
        "(line 69,col 5)-(line 69,col 44)",
        "(line 71,col 5)-(line 72,col 44)",
        "(line 73,col 5)-(line 81,col 39)",
        "(line 82,col 5)-(line 90,col 43)",
        "(line 91,col 5)-(line 99,col 41)",
        "(line 100,col 5)-(line 103,col 49)",
        "(line 104,col 5)-(line 107,col 49)",
        "(line 109,col 5)-(line 109,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.testMotionPreservesOriginalSourceName()",
      "begin_line": 112,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 32)",
        "(line 114,col 5)-(line 114,col 32)",
        "(line 116,col 5)-(line 116,col 29)",
        "(line 117,col 5)-(line 117,col 26)",
        "(line 119,col 5)-(line 119,col 78)",
        "(line 120,col 5)-(line 120,col 45)",
        "(line 121,col 5)-(line 121,col 31)",
        "(line 122,col 5)-(line 122,col 37)",
        "(line 123,col 5)-(line 123,col 31)",
        "(line 125,col 5)-(line 125,col 24)",
        "(line 126,col 5)-(line 126,col 24)",
        "(line 127,col 5)-(line 127,col 57)",
        "(line 128,col 5)-(line 128,col 48)",
        "(line 129,col 5)-(line 129,col 65)",
        "(line 131,col 5)-(line 132,col 42)",
        "(line 133,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 150,col 39)",
        "(line 151,col 5)-(line 154,col 52)",
        "(line 155,col 5)-(line 158,col 52)",
        "(line 160,col 5)-(line 160,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "test(String, FunctionInformationMap)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027FunctionInformationMap\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 164,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 39)",
        "(line 166,col 5)-(line 168,col 41)",
        "(line 169,col 5)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "test(JSModule[], FunctionInformationMap)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027FunctionInformationMap\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "test(Compiler, FunctionInformationMap)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027FunctionInformationMap\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 176,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 31)",
        "(line 178,col 5)-(line 178,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "test(Compiler, Node, Node, FunctionInformationMap)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027FunctionInformationMap\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 181,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 62)",
        "(line 184,col 5)-(line 184,col 49)",
        "(line 186,col 5)-(line 187,col 63)",
        "(line 188,col 5)-(line 188,col 45)",
        "(line 189,col 5)-(line 189,col 55)",
        "(line 190,col 5)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.compilerFor(com.google.javascript.jscomp.JSModule[])",
      "begin_line": 193,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 41)",
        "(line 195,col 7)-(line 198,col 33)",
        "(line 199,col 7)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.root(com.google.javascript.jscomp.Compiler)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.externs(com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformationTest.main(com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 42)"
      ]
    }
  ]
}