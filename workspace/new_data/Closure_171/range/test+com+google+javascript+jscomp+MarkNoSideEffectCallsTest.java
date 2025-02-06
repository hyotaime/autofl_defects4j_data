{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/MarkNoSideEffectCallsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MarkNoSideEffectCallsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 31,
      "end_line": 309,
      "comment": "\n * Tests for {@link MarkNoSideEffectCalls}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "noSideEffectCalls"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "kExterns"
      ],
      "begin_line": 34,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.MarkNoSideEffectCallsTest()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.getNumRepetitions()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.tearDown()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 21)",
        "(line 60,col 5)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testFunctionAnnotation()",
      "begin_line": 63,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 65,col 41)",
        "(line 66,col 5)-(line 67,col 41)",
        "(line 68,col 5)-(line 69,col 41)",
        "(line 70,col 5)-(line 71,col 41)",
        "(line 72,col 5)-(line 73,col 41)",
        "(line 76,col 5)-(line 76,col 69)",
        "(line 77,col 5)-(line 77,col 73)",
        "(line 80,col 5)-(line 83,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testNamespaceAnnotation()",
      "begin_line": 86,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 88,col 42)",
        "(line 89,col 5)-(line 90,col 42)",
        "(line 91,col 5)-(line 92,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testConstructorAnnotation()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 41)",
        "(line 98,col 5)-(line 99,col 41)",
        "(line 100,col 5)-(line 101,col 41)",
        "(line 102,col 5)-(line 102,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testMultipleDefinition()",
      "begin_line": 105,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 113,col 51)",
        "(line 114,col 5)-(line 117,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testAssignNoFunction()",
      "begin_line": 120,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 41)",
        "(line 123,col 5)-(line 124,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testPrototype()",
      "begin_line": 127,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 131,col 43)",
        "(line 132,col 5)-(line 136,col 43)",
        "(line 139,col 5)-(line 144,col 46)",
        "(line 146,col 5)-(line 152,col 43)",
        "(line 155,col 5)-(line 161,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testAnnotationInExterns()",
      "begin_line": 164,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 67)",
        "(line 166,col 5)-(line 166,col 67)",
        "(line 167,col 5)-(line 167,col 68)",
        "(line 168,col 5)-(line 168,col 68)",
        "(line 169,col 5)-(line 169,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testNamespaceAnnotationInExterns()",
      "begin_line": 172,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 71)",
        "(line 174,col 5)-(line 174,col 71)",
        "(line 175,col 5)-(line 175,col 76)",
        "(line 176,col 5)-(line 176,col 76)",
        "(line 178,col 5)-(line 178,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testOverrideDefinitionInSource()",
      "begin_line": 181,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 184,col 51)",
        "(line 187,col 5)-(line 190,col 51)",
        "(line 193,col 5)-(line 194,col 51)",
        "(line 197,col 5)-(line 200,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testApply1()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 206,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testApply2()",
      "begin_line": 209,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testCall1()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testCall2()",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 224,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testInvalidAnnotation1()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testInvalidAnnotation2()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 234,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testInvalidAnnotation3()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 239,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testInvalidAnnotation4()",
      "begin_line": 242,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 245,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testInvalidAnnotation5()",
      "begin_line": 248,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 251,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testCallNumber()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 256,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testMarkCalls(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.testMarkCalls(java.lang.String, java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 52)",
        "(line 266,col 5)-(line 266,col 46)",
        "(line 267,col 5)-(line 267,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 270,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NoSideEffectCallEnumerator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 279,
      "end_line": 308,
      "comment": "\n   * Run MarkNoSideEffectCalls, then gather a list of calls that are\n   * marked as having no side effects.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "passUnderTest"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.NoSideEffectCallEnumerator.NoSideEffectCallEnumerator(com.google.javascript.jscomp.Compiler)",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 63)",
        "(line 286,col 7)-(line 286,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.NoSideEffectCallEnumerator.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 289,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 43)",
        "(line 292,col 7)-(line 292,col 54)",
        "(line 293,col 7)-(line 293,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCallsTest.NoSideEffectCallEnumerator.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 296,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 306,col 7)"
      ]
    }
  ]
}