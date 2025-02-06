{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeCollectPropertyAssignments.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeCollectPropertyAssignments",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 32,
      "end_line": 278,
      "comment": "\n * A pass that looks for assignments to properties of an object or array\n * immediately following its creation using the abbreviated syntax.\n * \u003cp\u003e\n * E.g. {@code var a \u003d [];a[0] \u003d 0} is optimized to {@code var a \u003d [0]} and\n * similarly for the object constructor.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 35,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 39,col 5)",
        "(line 41,col 5)-(line 41,col 32)",
        "(line 45,col 5)-(line 76,col 5)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.getName(com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 90,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.getValue(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.isInterestingValue(com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.isPropertyAssignmentToName(com.google.javascript.rhino.Node)",
      "begin_line": 106,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 52)",
        "(line 109,col 5)-(line 111,col 5)",
        "(line 113,col 5)-(line 113,col 50)",
        "(line 116,col 5)-(line 116,col 36)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 122,col 5)-(line 122,col 35)",
        "(line 123,col 5)-(line 125,col 5)",
        "(line 127,col 5)-(line 127,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.collectProperty(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 136,col 65)",
        "(line 138,col 5)-(line 140,col 5)",
        "(line 142,col 5)-(line 142,col 29)",
        "(line 144,col 5)-(line 147,col 5)",
        "(line 149,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 167,col 5)",
        "(line 168,col 5)-(line 168,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.collectArrayProperty(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 172,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 56)",
        "(line 175,col 5)-(line 175,col 64)",
        "(line 176,col 5)-(line 176,col 50)",
        "(line 178,col 5)-(line 178,col 42)",
        "(line 179,col 5)-(line 179,col 29)",
        "(line 180,col 5)-(line 182,col 5)",
        "(line 183,col 5)-(line 183,col 35)",
        "(line 184,col 5)-(line 184,col 34)",
        "(line 186,col 5)-(line 188,col 5)",
        "(line 190,col 5)-(line 190,col 41)",
        "(line 191,col 5)-(line 194,col 5)",
        "(line 195,col 5)-(line 195,col 29)",
        "(line 196,col 5)-(line 198,col 5)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 204,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 224,col 41)",
        "(line 225,col 5)-(line 225,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.collectObjectProperty(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 56)",
        "(line 231,col 5)-(line 231,col 63)",
        "(line 232,col 5)-(line 232,col 35)",
        "(line 233,col 5)-(line 233,col 34)",
        "(line 236,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 24)",
        "(line 243,col 5)-(line 247,col 5)",
        "(line 249,col 5)-(line 250,col 39)",
        "(line 252,col 5)-(line 254,col 5)",
        "(line 255,col 5)-(line 255,col 43)",
        "(line 256,col 5)-(line 256,col 41)",
        "(line 257,col 5)-(line 257,col 46)",
        "(line 259,col 5)-(line 259,col 41)",
        "(line 260,col 5)-(line 260,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.mightContainForwardReference(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 264,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 268,col 5)",
        "(line 269,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 275,col 17)"
      ]
    }
  ]
}