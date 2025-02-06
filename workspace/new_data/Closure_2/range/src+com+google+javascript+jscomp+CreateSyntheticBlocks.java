{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CreateSyntheticBlocks.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CreateSyntheticBlocks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 217,
      "comment": "\n * Creates synthetic blocks to optimizations from moving code\n * past markers in the source.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNMATCHED_START_MARKER"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNMATCHED_END_MARKER"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_MARKER_USAGE"
      ],
      "begin_line": 41,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMarkerName"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Name of the start marker. "
    },
    {
      "type": "field",
      "varNames": [
        "endMarkerName"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Name of the end marker. "
    },
    {
      "type": "field",
      "varNames": [
        "markerStack"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n   * Markers can be nested.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "validMarkers"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Marker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMarker"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endMarker"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.Marker.Marker(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 7)-(line 64,col 37)",
        "(line 65,col 7)-(line 65,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.CreateSyntheticBlocks(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 29)",
        "(line 72,col 5)-(line 72,col 43)",
        "(line 73,col 5)-(line 73,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 59)",
        "(line 82,col 5)-(line 87,col 5)",
        "(line 90,col 5)-(line 92,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.addBlocks(com.google.javascript.jscomp.CreateSyntheticBlocks.Marker)",
      "begin_line": 98,
      "end_line": 130,
      "comment": "\n   * @param marker The marker to add synthetic blocks for.\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 55)",
        "(line 110,col 5)-(line 110,col 33)",
        "(line 111,col 5)-(line 111,col 41)",
        "(line 112,col 5)-(line 112,col 66)",
        "(line 114,col 5)-(line 114,col 33)",
        "(line 115,col 5)-(line 115,col 41)",
        "(line 118,col 5)-(line 120,col 26)",
        "(line 123,col 5)-(line 123,col 75)",
        "(line 125,col 5)-(line 125,col 42)",
        "(line 127,col 5)-(line 127,col 75)",
        "(line 129,col 5)-(line 129,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.moveSiblingExclusive(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\n   * Move the Nodes between start and end from the source block to the\n   * destination block. If start is null, move the first child of the block.\n   * If end is null, move the last child of the block.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.childAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 149,
      "end_line": 155,
      "comment": "\n   * Like Node.getNext, that null is used to signal the child before the\n   * block.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 154,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.removeChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n   * Like removeChildAfter, the firstChild is removed\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 165,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 168,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 169,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 171,col 7)-(line 173,col 7)",
        "(line 175,col 7)-(line 175,col 42)",
        "(line 176,col 7)-(line 176,col 47)",
        "(line 178,col 7)-(line 186,col 7)",
        "(line 188,col 7)-(line 190,col 7)",
        "(line 192,col 7)-(line 192,col 34)",
        "(line 193,col 7)-(line 197,col 7)",
        "(line 199,col 7)-(line 203,col 7)",
        "(line 205,col 7)-(line 205,col 47)",
        "(line 206,col 7)-(line 211,col 7)",
        "(line 214,col 7)-(line 214,col 67)"
      ]
    }
  ]
}