{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/PhaseOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PhaseOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 226,
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
        "optimizer"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.setUp()",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 22)",
        "(line 43,col 5)-(line 43,col 30)",
        "(line 44,col 5)-(line 44,col 44)",
        "(line 45,col 5)-(line 46,col 55)",
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
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testLoop3()",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 46)",
        "(line 69,col 5)-(line 69,col 32)",
        "(line 70,col 5)-(line 70,col 32)",
        "(line 71,col 5)-(line 71,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testNotInfiniteLoop()",
      "begin_line": 74,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 46)",
        "(line 76,col 5)-(line 76,col 55)",
        "(line 77,col 5)-(line 77,col 34)",
        "(line 78,col 5)-(line 78,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testInfiniteLoop()",
      "begin_line": 81,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 46)",
        "(line 83,col 5)-(line 83,col 59)",
        "(line 84,col 5)-(line 89,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testCombined()",
      "begin_line": 92,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 24)",
        "(line 94,col 5)-(line 94,col 46)",
        "(line 95,col 5)-(line 95,col 32)",
        "(line 96,col 5)-(line 96,col 32)",
        "(line 97,col 5)-(line 97,col 24)",
        "(line 98,col 5)-(line 98,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testSanityCheck()",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 46)",
        "(line 103,col 5)-(line 103,col 32)",
        "(line 104,col 5)-(line 104,col 24)",
        "(line 105,col 5)-(line 106,col 69)",
        "(line 107,col 5)-(line 107,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testConsumption1()",
      "begin_line": 110,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 118,col 46)",
        "(line 119,col 5)-(line 119,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testConsumption2()",
      "begin_line": 122,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 127,col 47)",
        "(line 128,col 5)-(line 128,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testConsumption3()",
      "begin_line": 131,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 136,col 47)",
        "(line 137,col 5)-(line 137,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testDuplicateLoop()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 46)",
        "(line 142,col 5)-(line 142,col 32)",
        "(line 143,col 5)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testPassOrdering()",
      "begin_line": 149,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 46)",
        "(line 151,col 5)-(line 152,col 38)",
        "(line 153,col 5)-(line 153,col 33)",
        "(line 154,col 5)-(line 157,col 5)",
        "(line 158,col 5)-(line 158,col 34)",
        "(line 159,col 5)-(line 159,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.testProgress()",
      "begin_line": 162,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 59)",
        "(line 164,col 5)-(line 168,col 6)",
        "(line 169,col 5)-(line 169,col 44)",
        "(line 170,col 5)-(line 171,col 50)",
        "(line 172,col 5)-(line 172,col 25)",
        "(line 173,col 5)-(line 173,col 25)",
        "(line 174,col 5)-(line 174,col 25)",
        "(line 175,col 5)-(line 175,col 25)",
        "(line 176,col 5)-(line 176,col 34)",
        "(line 177,col 5)-(line 177,col 41)",
        "(line 178,col 5)-(line 178,col 54)",
        "(line 179,col 5)-(line 179,col 54)",
        "(line 180,col 5)-(line 180,col 54)",
        "(line 181,col 5)-(line 181,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-89a857bb-807f-4b42-a76f-757313de9d3c.setProgress(double, java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.assertPasses(java.lang.String...)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 34)",
        "(line 186,col 5)-(line 186,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.addOneTimePass(java.lang.String)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 191,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.addLoopedPass(com.google.javascript.jscomp.PhaseOptimizer.Loop, java.lang.String, int)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 196,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPassFactory(java.lang.String, int, boolean)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPassFactory(java.lang.String, com.google.javascript.jscomp.CompilerPass, boolean)",
      "begin_line": 204,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 211,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-a29192a9-14b9-4adf-9840-591f52bc75a5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.createPass(java.lang.String, int)",
      "begin_line": 214,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 59)",
        "(line 216,col 5)-(line 224,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PhaseOptimizerTest.Anonymous-f693d8e2-738a-4b27-9e5f-7bd4f0fc34ac.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 28)",
        "(line 219,col 9)-(line 222,col 9)"
      ]
    }
  ]
}