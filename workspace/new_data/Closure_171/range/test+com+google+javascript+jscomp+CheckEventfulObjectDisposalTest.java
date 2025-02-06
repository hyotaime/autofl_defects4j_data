{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CheckEventfulObjectDisposalTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckEventfulObjectDisposalTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "policy"
      ],
      "begin_line": 26,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLOSURE_DEFS"
      ],
      "begin_line": 29,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.setUp()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 18)",
        "(line 57,col 5)-(line 57,col 40)",
        "(line 58,col 5)-(line 58,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 97)",
        "(line 65,col 5)-(line 65,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testNoEventHandler()",
      "begin_line": 68,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 73,col 38)",
        "(line 74,col 5)-(line 74,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testNotFreed1()",
      "begin_line": 77,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 82,col 38)",
        "(line 83,col 5)-(line 83,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testLocal()",
      "begin_line": 86,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 92,col 38)",
        "(line 93,col 5)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testLocalAggressive()",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 75)",
        "(line 98,col 5)-(line 103,col 38)",
        "(line 104,col 5)-(line 104,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedLocal1()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 75)",
        "(line 109,col 5)-(line 114,col 38)",
        "(line 115,col 5)-(line 115,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedLocal2()",
      "begin_line": 118,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 124,col 38)",
        "(line 125,col 5)-(line 125,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedLocal2Aggressive()",
      "begin_line": 128,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 75)",
        "(line 130,col 5)-(line 135,col 38)",
        "(line 136,col 5)-(line 136,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testLocalLive1()",
      "begin_line": 139,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 75)",
        "(line 141,col 5)-(line 147,col 38)",
        "(line 148,col 5)-(line 148,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testLocalLive2()",
      "begin_line": 151,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 75)",
        "(line 153,col 5)-(line 159,col 38)",
        "(line 160,col 5)-(line 160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testLocalLive3()",
      "begin_line": 167,
      "end_line": 178,
      "comment": "\n   * Local variable is never freed but as it is assigned to an array\n   * this is left to the dynamic analyzer to discover it.\n   ",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 75)",
        "(line 169,col 5)-(line 176,col 38)",
        "(line 177,col 5)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedDispose()",
      "begin_line": 180,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 186,col 38)",
        "(line 187,col 5)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedGoogDispose1()",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 196,col 38)",
        "(line 197,col 5)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testNotAllFreedGoogDispose()",
      "begin_line": 200,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 208,col 38)",
        "(line 209,col 5)-(line 209,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedGoogDisposeAll()",
      "begin_line": 212,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 220,col 38)",
        "(line 221,col 5)-(line 221,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedRegisterDisposable()",
      "begin_line": 224,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 230,col 38)",
        "(line 231,col 5)-(line 231,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testFreedRemoveAll()",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 240,col 38)",
        "(line 241,col 5)-(line 241,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckEventfulObjectDisposalTest.testPrivateInheritance()",
      "begin_line": 244,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 256,col 38)",
        "(line 257,col 5)-(line 257,col 86)"
      ]
    }
  ]
}