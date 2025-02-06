{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/LinkedFlowScopeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedFlowScopeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTypeTestCase"
      ],
      "begin_line": 29,
      "end_line": 324,
      "comment": "\n * Tests for LinkedFlowScope.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "blockNode"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionNode"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LONG_CHAIN_LENGTH"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalScope"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localScope"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalEntry"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localEntry"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.setUp()",
      "begin_line": 41,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 18)",
        "(line 45,col 5)-(line 45,col 53)",
        "(line 46,col 5)-(line 46,col 53)",
        "(line 47,col 5)-(line 47,col 53)",
        "(line 49,col 5)-(line 49,col 54)",
        "(line 50,col 5)-(line 50,col 51)",
        "(line 51,col 5)-(line 51,col 51)",
        "(line 53,col 5)-(line 53,col 66)",
        "(line 54,col 5)-(line 54,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testOptimize()",
      "begin_line": 57,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 52)",
        "(line 60,col 5)-(line 60,col 56)",
        "(line 61,col 5)-(line 61,col 47)",
        "(line 63,col 5)-(line 63,col 47)",
        "(line 64,col 5)-(line 64,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testJoin1()",
      "begin_line": 67,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 57)",
        "(line 69,col 5)-(line 69,col 48)",
        "(line 71,col 5)-(line 71,col 54)",
        "(line 72,col 5)-(line 72,col 49)",
        "(line 74,col 5)-(line 74,col 57)",
        "(line 75,col 5)-(line 75,col 49)",
        "(line 77,col 5)-(line 77,col 71)",
        "(line 78,col 5)-(line 78,col 71)",
        "(line 79,col 5)-(line 79,col 51)",
        "(line 81,col 5)-(line 81,col 45)",
        "(line 82,col 5)-(line 83,col 44)",
        "(line 84,col 5)-(line 84,col 51)",
        "(line 86,col 5)-(line 86,col 35)",
        "(line 87,col 5)-(line 88,col 44)",
        "(line 89,col 5)-(line 89,col 51)",
        "(line 91,col 5)-(line 92,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testJoin2()",
      "begin_line": 95,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 57)",
        "(line 97,col 5)-(line 97,col 48)",
        "(line 99,col 5)-(line 99,col 57)",
        "(line 100,col 5)-(line 100,col 50)",
        "(line 102,col 5)-(line 102,col 70)",
        "(line 103,col 5)-(line 103,col 72)",
        "(line 104,col 5)-(line 104,col 51)",
        "(line 106,col 5)-(line 106,col 44)",
        "(line 107,col 5)-(line 107,col 70)",
        "(line 108,col 5)-(line 108,col 72)",
        "(line 110,col 5)-(line 110,col 34)",
        "(line 111,col 5)-(line 111,col 70)",
        "(line 112,col 5)-(line 112,col 72)",
        "(line 114,col 5)-(line 115,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testJoin3()",
      "begin_line": 118,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 58)",
        "(line 120,col 5)-(line 120,col 58)",
        "(line 122,col 5)-(line 122,col 57)",
        "(line 123,col 5)-(line 123,col 48)",
        "(line 125,col 5)-(line 125,col 57)",
        "(line 126,col 5)-(line 126,col 49)",
        "(line 128,col 5)-(line 128,col 44)",
        "(line 129,col 5)-(line 130,col 44)",
        "(line 131,col 5)-(line 132,col 44)",
        "(line 134,col 5)-(line 134,col 34)",
        "(line 135,col 5)-(line 136,col 44)",
        "(line 137,col 5)-(line 138,col 44)",
        "(line 140,col 5)-(line 141,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testLongChain1()",
      "begin_line": 148,
      "end_line": 163,
      "comment": "\n   * Create a long chain of flow scopes where each link in the chain\n   * contains one slot.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 57)",
        "(line 150,col 5)-(line 150,col 57)",
        "(line 151,col 5)-(line 160,col 5)",
        "(line 162,col 5)-(line 162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testLongChain2()",
      "begin_line": 169,
      "end_line": 186,
      "comment": "\n   * Create a long chain of flow scopes where each link in the chain\n   * contains 7 slots.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 57)",
        "(line 171,col 5)-(line 171,col 57)",
        "(line 172,col 5)-(line 183,col 5)",
        "(line 185,col 5)-(line 185,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testLongChain3()",
      "begin_line": 192,
      "end_line": 210,
      "comment": "\n   * Create a long chain of flow scopes where every 4 links in the chain\n   * contain a slot.\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 57)",
        "(line 194,col 5)-(line 194,col 57)",
        "(line 195,col 5)-(line 207,col 5)",
        "(line 209,col 5)-(line 209,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.verifyLongChains(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 213,
      "end_line": 240,
      "comment": " Common chain verification for testLongChainN for all N.",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 44)",
        "(line 215,col 5)-(line 235,col 5)",
        "(line 237,col 5)-(line 237,col 39)",
        "(line 238,col 5)-(line 238,col 39)",
        "(line 239,col 5)-(line 239,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testFindUniqueSlot()",
      "begin_line": 242,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 57)",
        "(line 244,col 5)-(line 244,col 48)",
        "(line 246,col 5)-(line 246,col 54)",
        "(line 247,col 5)-(line 247,col 49)",
        "(line 249,col 5)-(line 249,col 56)",
        "(line 250,col 5)-(line 250,col 51)",
        "(line 252,col 5)-(line 252,col 57)",
        "(line 253,col 5)-(line 254,col 59)",
        "(line 255,col 5)-(line 255,col 55)",
        "(line 256,col 5)-(line 256,col 59)",
        "(line 258,col 5)-(line 259,col 57)",
        "(line 260,col 5)-(line 261,col 61)",
        "(line 263,col 5)-(line 264,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testDiffer1()",
      "begin_line": 267,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 57)",
        "(line 269,col 5)-(line 269,col 48)",
        "(line 271,col 5)-(line 271,col 54)",
        "(line 272,col 5)-(line 272,col 49)",
        "(line 274,col 5)-(line 274,col 56)",
        "(line 275,col 5)-(line 275,col 51)",
        "(line 277,col 5)-(line 277,col 54)",
        "(line 278,col 5)-(line 278,col 48)",
        "(line 280,col 5)-(line 280,col 54)",
        "(line 281,col 5)-(line 281,col 45)",
        "(line 283,col 5)-(line 283,col 38)",
        "(line 284,col 5)-(line 284,col 42)",
        "(line 286,col 5)-(line 286,col 41)",
        "(line 287,col 5)-(line 287,col 41)",
        "(line 289,col 5)-(line 289,col 40)",
        "(line 290,col 5)-(line 290,col 41)",
        "(line 291,col 5)-(line 291,col 39)",
        "(line 292,col 5)-(line 292,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.testDiffer2()",
      "begin_line": 295,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 57)",
        "(line 297,col 5)-(line 297,col 48)",
        "(line 299,col 5)-(line 299,col 57)",
        "(line 300,col 5)-(line 300,col 44)",
        "(line 302,col 5)-(line 302,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.assertScopesDiffer(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 29)",
        "(line 307,col 5)-(line 307,col 29)",
        "(line 308,col 5)-(line 308,col 23)",
        "(line 309,col 5)-(line 309,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.assertScopesSame(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 23)",
        "(line 314,col 5)-(line 314,col 23)",
        "(line 315,col 5)-(line 315,col 23)",
        "(line 316,col 5)-(line 316,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScopeTest.join(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 322,col 34)"
      ]
    }
  ]
}