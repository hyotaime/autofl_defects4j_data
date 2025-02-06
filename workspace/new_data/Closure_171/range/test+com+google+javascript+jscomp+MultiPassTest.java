{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/MultiPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiPassTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 29,
      "end_line": 201,
      "comment": "\n * This file contains the only tests that use the infrastructure in\n * CompilerTestCase to run multiple passes and do sanity checks. The other files\n * that use CompilerTestCase unit test a single pass.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MultiPassTest.MultiPassTest()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 36,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 71)",
        "(line 39,col 5)-(line 39,col 29)",
        "(line 40,col 5)-(line 46,col 11)",
        "(line 47,col 5)-(line 47,col 41)",
        "(line 48,col 5)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-ad157a5f-a921-4455-988a-4c5a0adb2e5d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testInlineVarsAndPeephole()",
      "begin_line": 51,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 35)",
        "(line 53,col 5)-(line 53,col 25)",
        "(line 54,col 5)-(line 54,col 18)",
        "(line 55,col 5)-(line 56,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testInlineFunctionsAndPeephole()",
      "begin_line": 59,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 35)",
        "(line 61,col 5)-(line 61,col 25)",
        "(line 62,col 5)-(line 62,col 18)",
        "(line 63,col 5)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testInlineVarsAndDeadCodeElim()",
      "begin_line": 69,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 35)",
        "(line 71,col 5)-(line 71,col 29)",
        "(line 72,col 5)-(line 72,col 25)",
        "(line 73,col 5)-(line 74,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testCollapseObjectLiteralsScopeChange()",
      "begin_line": 77,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 35)",
        "(line 79,col 5)-(line 79,col 32)",
        "(line 80,col 5)-(line 89,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testRemoveUnusedClassPropertiesScopeChange()",
      "begin_line": 92,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 35)",
        "(line 94,col 5)-(line 94,col 37)",
        "(line 95,col 5)-(line 100,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testRemoveUnusedVariablesScopeChange()",
      "begin_line": 103,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 35)",
        "(line 105,col 5)-(line 105,col 26)",
        "(line 106,col 5)-(line 107,col 27)",
        "(line 108,col 5)-(line 109,col 27)",
        "(line 110,col 5)-(line 111,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.testTopScopeChange()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 35)",
        "(line 116,col 5)-(line 116,col 25)",
        "(line 117,col 5)-(line 117,col 18)",
        "(line 118,col 5)-(line 118,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addCollapseObjectLiterals()",
      "begin_line": 121,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 129,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-800abaa6-d2a7-4d52-8ae6-fd313a8614d3.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 127,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addDeadCodeElimination()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 139,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-c44d0af5-58fb-4e3f-a462-40e9518fa185.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addInlineFunctions()",
      "begin_line": 142,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 151,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-62bdb6cf-cfe0-4eee-ac06-9dbb1c1f0190.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 149,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addInlineVariables()",
      "begin_line": 154,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 162,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-cae84cdc-9381-477c-98ad-cb9c9b26439b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 160,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addPeephole()",
      "begin_line": 165,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 179,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-46e3902e-e6bf-46c6-83cd-a2cb18ce888e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 39)",
        "(line 171,col 13)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addRemoveUnusedClassProperties()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 189,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-52d004ca-805b-4002-91c7-90eb24fb146f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 13)-(line 187,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.addRemoveUnusedVars()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 199,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MultiPassTest.Anonymous-4088a883-3b9c-4c46-ad9e-a6110d4d5ec7.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 71)"
      ]
    }
  ]
}