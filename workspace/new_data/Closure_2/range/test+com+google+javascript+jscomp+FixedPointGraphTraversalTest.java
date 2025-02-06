{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/FixedPointGraphTraversalTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedPointGraphTraversalTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 211,
      "comment": "\n * Test for FixedPointGraphTraversal.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxChange"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " computation."
    },
    {
      "type": "class_interface",
      "name": "Counter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CounterIncrementer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.FixedPointGraphTraversalTest.Counter, java.lang.String\u003e"
      ],
      "begin_line": 41,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.CounterIncrementer.traverseEdge(com.google.javascript.jscomp.FixedPointGraphTraversalTest.Counter, java.lang.String, com.google.javascript.jscomp.FixedPointGraphTraversalTest.Counter)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 19)",
        "(line 45,col 7)-(line 45,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "A",
        "B",
        "C",
        "D",
        "E"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "traversal"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.setUp()",
      "begin_line": 67,
      "end_line": 89,
      "comment": " with all edges pointing downwards, and an \"up-edge\" from E to D.",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 22)",
        "(line 70,col 5)-(line 70,col 22)",
        "(line 71,col 5)-(line 71,col 22)",
        "(line 72,col 5)-(line 72,col 22)",
        "(line 73,col 5)-(line 73,col 22)",
        "(line 75,col 5)-(line 75,col 41)",
        "(line 76,col 5)-(line 76,col 37)",
        "(line 77,col 5)-(line 77,col 37)",
        "(line 78,col 5)-(line 78,col 37)",
        "(line 79,col 5)-(line 79,col 37)",
        "(line 80,col 5)-(line 80,col 37)",
        "(line 82,col 5)-(line 82,col 30)",
        "(line 83,col 5)-(line 83,col 30)",
        "(line 84,col 5)-(line 84,col 30)",
        "(line 85,col 5)-(line 85,col 30)",
        "(line 86,col 5)-(line 86,col 30)",
        "(line 87,col 5)-(line 87,col 30)",
        "(line 88,col 5)-(line 88,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph1()",
      "begin_line": 91,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 18)",
        "(line 93,col 5)-(line 93,col 42)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 96,col 5)-(line 96,col 29)",
        "(line 97,col 5)-(line 97,col 29)",
        "(line 98,col 5)-(line 98,col 29)",
        "(line 99,col 5)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph2()",
      "begin_line": 102,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 18)",
        "(line 104,col 5)-(line 104,col 42)",
        "(line 106,col 5)-(line 106,col 29)",
        "(line 107,col 5)-(line 107,col 29)",
        "(line 108,col 5)-(line 108,col 29)",
        "(line 109,col 5)-(line 109,col 29)",
        "(line 110,col 5)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph3()",
      "begin_line": 113,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 18)",
        "(line 115,col 5)-(line 115,col 42)",
        "(line 117,col 5)-(line 117,col 29)",
        "(line 118,col 5)-(line 118,col 29)",
        "(line 119,col 5)-(line 119,col 29)",
        "(line 120,col 5)-(line 120,col 29)",
        "(line 121,col 5)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph4()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 18)",
        "(line 126,col 5)-(line 126,col 42)",
        "(line 128,col 5)-(line 128,col 29)",
        "(line 129,col 5)-(line 129,col 29)",
        "(line 130,col 5)-(line 130,col 29)",
        "(line 131,col 5)-(line 131,col 29)",
        "(line 132,col 5)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph5()",
      "begin_line": 135,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 18)",
        "(line 137,col 5)-(line 137,col 42)",
        "(line 139,col 5)-(line 139,col 29)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 141,col 5)-(line 141,col 29)",
        "(line 142,col 5)-(line 142,col 29)",
        "(line 143,col 5)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph6()",
      "begin_line": 146,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 18)",
        "(line 148,col 5)-(line 148,col 42)",
        "(line 150,col 5)-(line 150,col 29)",
        "(line 151,col 5)-(line 151,col 29)",
        "(line 152,col 5)-(line 152,col 29)",
        "(line 153,col 5)-(line 153,col 29)",
        "(line 154,col 5)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph8()",
      "begin_line": 157,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 18)",
        "(line 159,col 5)-(line 159,col 42)",
        "(line 161,col 5)-(line 175,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.Anonymous-50bc86dc-f3fa-4abf-ba9a-4c41fdae957c.traverseEdge(com.google.javascript.jscomp.FixedPointGraphTraversalTest.Counter, java.lang.String, com.google.javascript.jscomp.FixedPointGraphTraversalTest.Counter)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph9()",
      "begin_line": 178,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 18)",
        "(line 183,col 5)-(line 183,col 39)",
        "(line 185,col 5)-(line 185,col 29)",
        "(line 186,col 5)-(line 186,col 29)",
        "(line 187,col 5)-(line 187,col 29)",
        "(line 188,col 5)-(line 188,col 29)",
        "(line 189,col 5)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FixedPointGraphTraversalTest.testGraph10()",
      "begin_line": 192,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 18)",
        "(line 196,col 5)-(line 196,col 22)",
        "(line 197,col 5)-(line 197,col 22)",
        "(line 199,col 5)-(line 199,col 41)",
        "(line 200,col 5)-(line 200,col 37)",
        "(line 201,col 5)-(line 201,col 37)",
        "(line 203,col 5)-(line 203,col 30)",
        "(line 204,col 5)-(line 204,col 30)",
        "(line 206,col 5)-(line 206,col 39)",
        "(line 208,col 5)-(line 208,col 29)",
        "(line 209,col 5)-(line 209,col 29)"
      ]
    }
  ]
}