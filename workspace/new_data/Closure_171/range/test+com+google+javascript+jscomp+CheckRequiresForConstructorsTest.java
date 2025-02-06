{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CheckRequiresForConstructorsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructorsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 27,
      "end_line": 288,
      "comment": "\n * Tests for {@link CheckRequiresForConstructors}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 28,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 5)-(line 30,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithNoNewNodes()",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 57)",
        "(line 35,col 5)-(line 35,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNew()",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 41,col 68)",
        "(line 42,col 5)-(line 42,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNewOuterClass()",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 48,col 74)",
        "(line 49,col 5)-(line 49,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithOneNewOuterClassWithUpperPrefix()",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 55,col 78)",
        "(line 56,col 5)-(line 56,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithOneNew()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 74)",
        "(line 61,col 5)-(line 61,col 61)",
        "(line 62,col 5)-(line 62,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithTwoNewNodes()",
      "begin_line": 65,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 69,col 72)",
        "(line 70,col 5)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithNestedNewNodes()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 76,col 62)",
        "(line 77,col 5)-(line 77,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithNestedNewNodes()",
      "begin_line": 80,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 69)",
        "(line 84,col 5)-(line 84,col 66)",
        "(line 85,col 5)-(line 85,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithLocalFunctions()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 90,col 80)",
        "(line 91,col 5)-(line 91,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithLocalVariables()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 97,col 49)",
        "(line 98,col 5)-(line 98,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithLocalVariableInMoreThanOneFile()",
      "begin_line": 101,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 107,col 43)",
        "(line 108,col 5)-(line 108,col 72)",
        "(line 109,col 5)-(line 109,col 62)",
        "(line 110,col 5)-(line 110,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesMetaTraditionalFunctionForm()",
      "begin_line": 113,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 119,col 68)",
        "(line 120,col 5)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesMeta()",
      "begin_line": 123,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 128,col 50)",
        "(line 129,col 5)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testShouldWarnWhenInstantiatingObjectsDefinedInGlobalScope()",
      "begin_line": 132,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 137,col 67)",
        "(line 138,col 5)-(line 138,col 77)",
        "(line 139,col 5)-(line 139,col 43)",
        "(line 140,col 5)-(line 140,col 57)",
        "(line 141,col 5)-(line 141,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testShouldWarnWhenInstantiatingGlobalClassesFromGlobalScope()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 149,col 65)",
        "(line 150,col 5)-(line 150,col 39)",
        "(line 151,col 5)-(line 151,col 43)",
        "(line 152,col 5)-(line 152,col 57)",
        "(line 153,col 5)-(line 153,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testIgnoresNativeObject()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 67)",
        "(line 158,col 5)-(line 158,col 45)",
        "(line 159,col 5)-(line 159,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNewNodesWithMoreThanOneFile()",
      "begin_line": 162,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 168,col 32)",
        "(line 169,col 5)-(line 169,col 57)",
        "(line 170,col 5)-(line 170,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testPassWithoutWarningsAndMultipleFiles()",
      "begin_line": 173,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 177,col 53)",
        "(line 178,col 5)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testFailWithWarningsAndMultipleFiles()",
      "begin_line": 181,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 187,col 32)",
        "(line 188,col 5)-(line 188,col 57)",
        "(line 189,col 5)-(line 189,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testCanStillCallNumberWithoutNewOperator()",
      "begin_line": 192,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 73)",
        "(line 194,col 5)-(line 194,col 40)",
        "(line 195,col 5)-(line 195,col 38)",
        "(line 196,col 5)-(line 196,col 29)",
        "(line 197,col 5)-(line 197,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testRequiresAreCaughtBeforeProcessed()",
      "begin_line": 200,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 61)",
        "(line 202,col 5)-(line 202,col 57)",
        "(line 203,col 5)-(line 203,col 39)",
        "(line 204,col 5)-(line 204,col 49)",
        "(line 205,col 5)-(line 205,col 44)",
        "(line 206,col 5)-(line 206,col 28)",
        "(line 208,col 5)-(line 209,col 39)",
        "(line 210,col 5)-(line 210,col 41)",
        "(line 211,col 5)-(line 211,col 28)",
        "(line 212,col 5)-(line 212,col 36)",
        "(line 214,col 5)-(line 214,col 69)",
        "(line 216,col 5)-(line 220,col 5)",
        "(line 222,col 5)-(line 222,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testNoWarningsForThisConstructor()",
      "begin_line": 225,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 231,col 11)",
        "(line 232,col 5)-(line 232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testBug2062487()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 241,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testIgnoreDuplicateWarningsForSingleClasses()",
      "begin_line": 244,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 252,col 12)",
        "(line 253,col 5)-(line 253,col 65)",
        "(line 254,col 5)-(line 254,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testVarConstructorName()",
      "begin_line": 257,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 259,col 21)",
        "(line 260,col 5)-(line 260,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testVarConstructorFunction()",
      "begin_line": 263,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 265,col 21)",
        "(line 266,col 5)-(line 266,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testAssignConstructorName()",
      "begin_line": 269,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 272,col 25)",
        "(line 273,col 5)-(line 273,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testAssignConstructorFunction()",
      "begin_line": 276,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 279,col 25)",
        "(line 280,col 5)-(line 280,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructorsTest.testConstructorFunctionReference()",
      "begin_line": 283,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 285,col 21)",
        "(line 286,col 5)-(line 286,col 17)"
      ]
    }
  ]
}