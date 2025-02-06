{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PhaseOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhaseOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 223,
      "comment": "\n * Tests for {@link PhaseOptimizer}.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "passesRun"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dummyRoot"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "optimizer"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.setUp()",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 22)",
        "(line 44,col 5)-(line 44,col 30)",
        "(line 45,col 5)-(line 45,col 44)",
        "(line 46,col 5)-(line 46,col 72)",
        "(line 47,col 5)-(line 47,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testOneRun()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 24)",
        "(line 52,col 5)-(line 52,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testLoop1()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 46)",
        "(line 57,col 5)-(line 57,col 32)",
        "(line 58,col 5)-(line 58,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testLoop2()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 46)",
        "(line 63,col 5)-(line 63,col 32)",
        "(line 64,col 5)-(line 64,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSchedulingOfLoopablePasses()",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 46)",
        "(line 69,col 5)-(line 69,col 32)",
        "(line 70,col 5)-(line 70,col 32)",
        "(line 72,col 5)-(line 72,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testNotInfiniteLoop()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 46)",
        "(line 77,col 5)-(line 77,col 59)",
        "(line 78,col 5)-(line 78,col 39)",
        "(line 79,col 5)-(line 79,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testInfiniteLoop()",
      "begin_line": 82,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 46)",
        "(line 84,col 5)-(line 84,col 59)",
        "(line 85,col 5)-(line 91,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSchedulingOfAnyKindOfPasses1()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 24)",
        "(line 96,col 5)-(line 96,col 46)",
        "(line 97,col 5)-(line 97,col 32)",
        "(line 98,col 5)-(line 98,col 32)",
        "(line 99,col 5)-(line 99,col 24)",
        "(line 100,col 5)-(line 100,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSchedulingOfAnyKindOfPasses2()",
      "begin_line": 103,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 111,col 46)",
        "(line 114,col 5)-(line 114,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSchedulingOfAnyKindOfPasses3()",
      "begin_line": 117,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 122,col 47)",
        "(line 123,col 5)-(line 123,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSchedulingOfAnyKindOfPasses4()",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 131,col 47)",
        "(line 132,col 5)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testDuplicateLoop()",
      "begin_line": 135,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 46)",
        "(line 137,col 5)-(line 137,col 32)",
        "(line 138,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testPassOrdering()",
      "begin_line": 146,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 46)",
        "(line 148,col 5)-(line 149,col 38)",
        "(line 150,col 5)-(line 150,col 33)",
        "(line 151,col 5)-(line 154,col 5)",
        "(line 155,col 5)-(line 155,col 39)",
        "(line 156,col 5)-(line 156,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testProgress()",
      "begin_line": 159,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 59)",
        "(line 161,col 5)-(line 165,col 6)",
        "(line 166,col 5)-(line 166,col 44)",
        "(line 167,col 5)-(line 168,col 50)",
        "(line 169,col 5)-(line 169,col 25)",
        "(line 170,col 5)-(line 170,col 25)",
        "(line 171,col 5)-(line 171,col 25)",
        "(line 172,col 5)-(line 172,col 25)",
        "(line 173,col 5)-(line 173,col 39)",
        "(line 174,col 5)-(line 174,col 41)",
        "(line 175,col 5)-(line 175,col 54)",
        "(line 176,col 5)-(line 176,col 54)",
        "(line 177,col 5)-(line 177,col 54)",
        "(line 178,col 5)-(line 178,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-1699a764-74b6-40eb-b924-b951620a0e21.setProgress(double, java.lang.String)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.assertPasses(java.lang.String...)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 39)",
        "(line 183,col 5)-(line 183,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.addOneTimePass(java.lang.String)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 188,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.addLoopedPass(com.google.javascript.jscomp.PhaseOptimizer.Loop, java.lang.String, int)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 193,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPassFactory(java.lang.String, int, boolean)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPassFactory(java.lang.String, com.google.javascript.jscomp.CompilerPass, boolean)",
      "begin_line": 201,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 208,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-88093619-6b00-4a71-be36-8a27abb84fd0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPass(java.lang.String, int)",
      "begin_line": 211,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 59)",
        "(line 213,col 5)-(line 221,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-6e23e7ca-0c0f-4c4c-8796-b6ad0109aa48.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 214,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 28)",
        "(line 216,col 9)-(line 219,col 9)"
      ]
    }
  ]
}