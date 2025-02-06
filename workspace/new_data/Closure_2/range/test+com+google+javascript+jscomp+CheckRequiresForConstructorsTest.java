{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CheckRequiresForConstructorsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructorsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 29,
      "end_line": 258,
      "comment": "\n * Tests for {@link CheckRequiresForConstructors}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithNoNewNodes()",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 57)",
        "(line 37,col 5)-(line 37,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNew()",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 43,col 68)",
        "(line 44,col 5)-(line 44,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNewOuterClass()",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 50,col 74)",
        "(line 51,col 5)-(line 51,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNewOuterClassWithUpperPrefix()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 57,col 78)",
        "(line 58,col 5)-(line 58,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithOneNew()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 74)",
        "(line 63,col 5)-(line 63,col 61)",
        "(line 64,col 5)-(line 64,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithTwoNewNodes()",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 71,col 72)",
        "(line 72,col 5)-(line 72,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithNestedNewNodes()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 78,col 62)",
        "(line 79,col 5)-(line 79,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithNestedNewNodes()",
      "begin_line": 82,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 85,col 69)",
        "(line 86,col 5)-(line 86,col 66)",
        "(line 87,col 5)-(line 87,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithLocalFunctions()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 80)",
        "(line 93,col 5)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithLocalVariables()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 99,col 49)",
        "(line 100,col 5)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithLocalVariableInMoreThanOneFile()",
      "begin_line": 103,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 109,col 43)",
        "(line 110,col 5)-(line 110,col 72)",
        "(line 111,col 5)-(line 111,col 62)",
        "(line 112,col 5)-(line 112,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesMetaTraditionalFunctionForm()",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 121,col 68)",
        "(line 122,col 5)-(line 122,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesMeta()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 130,col 50)",
        "(line 131,col 5)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testShouldWarnWhenInstantiatingObjectsDefinedInGlobalScope()",
      "begin_line": 134,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 139,col 67)",
        "(line 140,col 5)-(line 140,col 77)",
        "(line 141,col 5)-(line 141,col 43)",
        "(line 142,col 5)-(line 142,col 57)",
        "(line 143,col 5)-(line 143,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testShouldWarnWhenInstantiatingGlobalClassesFromGlobalScope()",
      "begin_line": 146,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 151,col 65)",
        "(line 152,col 5)-(line 152,col 39)",
        "(line 153,col 5)-(line 153,col 43)",
        "(line 154,col 5)-(line 154,col 57)",
        "(line 155,col 5)-(line 155,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testIgnoresNativeObject()",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 67)",
        "(line 160,col 5)-(line 160,col 45)",
        "(line 161,col 5)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesWithMoreThanOneFile()",
      "begin_line": 164,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 170,col 32)",
        "(line 171,col 5)-(line 171,col 57)",
        "(line 172,col 5)-(line 172,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithoutWarningsAndMultipleFiles()",
      "begin_line": 175,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 179,col 53)",
        "(line 180,col 5)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithWarningsAndMultipleFiles()",
      "begin_line": 183,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 189,col 32)",
        "(line 190,col 5)-(line 190,col 57)",
        "(line 191,col 5)-(line 191,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testCanStillCallNumberWithoutNewOperator()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 73)",
        "(line 196,col 5)-(line 196,col 40)",
        "(line 197,col 5)-(line 197,col 38)",
        "(line 198,col 5)-(line 198,col 29)",
        "(line 199,col 5)-(line 199,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testRequiresAreCaughtBeforeProcessed()",
      "begin_line": 202,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 61)",
        "(line 204,col 5)-(line 204,col 57)",
        "(line 205,col 5)-(line 205,col 39)",
        "(line 206,col 5)-(line 206,col 49)",
        "(line 207,col 5)-(line 207,col 44)",
        "(line 208,col 5)-(line 208,col 28)",
        "(line 210,col 5)-(line 211,col 39)",
        "(line 212,col 5)-(line 212,col 41)",
        "(line 213,col 5)-(line 213,col 28)",
        "(line 214,col 5)-(line 214,col 36)",
        "(line 216,col 5)-(line 216,col 69)",
        "(line 218,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 224,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNoWarningsForThisConstructor()",
      "begin_line": 227,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 233,col 11)",
        "(line 234,col 5)-(line 234,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testBug2062487()",
      "begin_line": 237,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 243,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testIgnoreDuplicateWarningsForSingleClasses()",
      "begin_line": 246,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 254,col 12)",
        "(line 255,col 5)-(line 255,col 65)",
        "(line 256,col 5)-(line 256,col 57)"
      ]
    }
  ]
}