{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/graph/GraphColoringTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphColoringTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 210,
      "comment": "\n * Tests for {@link GraphColoring}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testNoEdge()",
      "begin_line": 37,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 65)",
        "(line 39,col 5)-(line 49,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testTwoNodesConnected()",
      "begin_line": 52,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 65)",
        "(line 54,col 5)-(line 54,col 26)",
        "(line 55,col 5)-(line 55,col 26)",
        "(line 56,col 5)-(line 56,col 34)",
        "(line 57,col 5)-(line 58,col 55)",
        "(line 59,col 5)-(line 59,col 38)",
        "(line 60,col 5)-(line 60,col 28)",
        "(line 61,col 5)-(line 61,col 59)",
        "(line 62,col 5)-(line 62,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testGreedy()",
      "begin_line": 65,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 65)",
        "(line 67,col 5)-(line 67,col 26)",
        "(line 68,col 5)-(line 68,col 26)",
        "(line 69,col 5)-(line 69,col 26)",
        "(line 70,col 5)-(line 70,col 26)",
        "(line 71,col 5)-(line 71,col 34)",
        "(line 72,col 5)-(line 72,col 34)",
        "(line 73,col 5)-(line 73,col 34)",
        "(line 74,col 5)-(line 75,col 55)",
        "(line 76,col 5)-(line 76,col 38)",
        "(line 77,col 5)-(line 77,col 28)",
        "(line 78,col 5)-(line 78,col 59)",
        "(line 79,col 5)-(line 79,col 59)",
        "(line 80,col 5)-(line 80,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testFullyConnected()",
      "begin_line": 83,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 26)",
        "(line 85,col 5)-(line 85,col 65)",
        "(line 86,col 5)-(line 94,col 5)",
        "(line 95,col 5)-(line 96,col 55)",
        "(line 97,col 5)-(line 97,col 42)",
        "(line 98,col 5)-(line 98,col 28)",
        "(line 99,col 5)-(line 101,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testAllConnectedToOneNode()",
      "begin_line": 104,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 25)",
        "(line 106,col 5)-(line 106,col 65)",
        "(line 107,col 5)-(line 107,col 31)",
        "(line 108,col 5)-(line 111,col 5)",
        "(line 112,col 5)-(line 113,col 55)",
        "(line 114,col 5)-(line 114,col 38)",
        "(line 115,col 5)-(line 115,col 28)",
        "(line 116,col 5)-(line 116,col 69)",
        "(line 117,col 5)-(line 119,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testTwoFullyConnected()",
      "begin_line": 122,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 26)",
        "(line 125,col 5)-(line 125,col 65)",
        "(line 126,col 5)-(line 137,col 5)",
        "(line 138,col 5)-(line 138,col 80)",
        "(line 139,col 5)-(line 139,col 28)",
        "(line 142,col 5)-(line 144,col 5)",
        "(line 149,col 5)-(line 149,col 80)",
        "(line 150,col 5)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.testDeterministic()",
      "begin_line": 153,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 65)",
        "(line 156,col 5)-(line 156,col 26)",
        "(line 157,col 5)-(line 157,col 26)",
        "(line 158,col 5)-(line 158,col 26)",
        "(line 159,col 5)-(line 159,col 26)",
        "(line 160,col 5)-(line 160,col 26)",
        "(line 161,col 5)-(line 161,col 35)",
        "(line 162,col 5)-(line 162,col 35)",
        "(line 163,col 5)-(line 163,col 35)",
        "(line 164,col 5)-(line 164,col 35)",
        "(line 165,col 5)-(line 165,col 35)",
        "(line 167,col 5)-(line 172,col 6)",
        "(line 173,col 5)-(line 174,col 70)",
        "(line 175,col 5)-(line 175,col 38)",
        "(line 176,col 5)-(line 176,col 28)",
        "(line 177,col 5)-(line 177,col 59)",
        "(line 178,col 5)-(line 178,col 59)",
        "(line 180,col 5)-(line 185,col 6)",
        "(line 187,col 5)-(line 187,col 69)",
        "(line 188,col 5)-(line 188,col 38)",
        "(line 189,col 5)-(line 189,col 28)",
        "(line 190,col 5)-(line 190,col 59)",
        "(line 191,col 5)-(line 191,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.Anonymous-c61d3bcb-c60e-49ea-b158-d474e48f1962.compare(java.lang.String, java.lang.String)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.Anonymous-c519c9c6-e6bb-4416-b97c-88dda44202ef.compare(java.lang.String, java.lang.String)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoringTest.validateColoring(com.google.javascript.jscomp.graph.Graph\u003cN, E\u003e)",
      "begin_line": 198,
      "end_line": 209,
      "comment": "\n   * Validate that each node has been colored and connected nodes have different\n   * coloring.\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 201,col 5)",
        "(line 202,col 5)-(line 208,col 5)"
      ]
    }
  ]
}