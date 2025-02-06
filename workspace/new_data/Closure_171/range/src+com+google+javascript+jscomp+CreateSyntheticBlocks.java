{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CreateSyntheticBlocks.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CreateSyntheticBlocks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 35,
      "end_line": 218,
      "comment": "\n * Creates synthetic blocks to optimizations from moving code\n * past markers in the source.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNMATCHED_START_MARKER"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNMATCHED_END_MARKER"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_MARKER_USAGE"
      ],
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMarkerName"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Name of the start marker. "
    },
    {
      "type": "field",
      "varNames": [
        "endMarkerName"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Name of the end marker. "
    },
    {
      "type": "field",
      "varNames": [
        "markerStack"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Markers can be nested.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "validMarkers"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Marker",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMarker"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "endMarker"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.Marker.Marker(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 37)",
        "(line 66,col 7)-(line 66,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.CreateSyntheticBlocks(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 29)",
        "(line 73,col 5)-(line 73,col 43)",
        "(line 74,col 5)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 59)",
        "(line 83,col 5)-(line 88,col 5)",
        "(line 91,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.addBlocks(com.google.javascript.jscomp.CreateSyntheticBlocks.Marker)",
      "begin_line": 99,
      "end_line": 131,
      "comment": "\n   * @param marker The marker to add synthetic blocks for.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 55)",
        "(line 111,col 5)-(line 111,col 33)",
        "(line 112,col 5)-(line 112,col 41)",
        "(line 113,col 5)-(line 113,col 66)",
        "(line 115,col 5)-(line 115,col 33)",
        "(line 116,col 5)-(line 116,col 41)",
        "(line 119,col 5)-(line 121,col 26)",
        "(line 124,col 5)-(line 124,col 75)",
        "(line 126,col 5)-(line 126,col 42)",
        "(line 128,col 5)-(line 128,col 75)",
        "(line 130,col 5)-(line 130,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.moveSiblingExclusive(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 138,
      "end_line": 144,
      "comment": "\n   * Move the Nodes between start and end from the source block to the\n   * destination block. If start is null, move the first child of the block.\n   * If end is null, move the last child of the block.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.childAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n   * Like Node.getNext, that null is used to signal the child before the\n   * block.\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 155,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.removeChildAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n   * Like removeChildAfter, the firstChild is removed\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 166,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 169,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CreateSyntheticBlocks.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 170,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 174,col 7)",
        "(line 176,col 7)-(line 176,col 42)",
        "(line 177,col 7)-(line 177,col 47)",
        "(line 179,col 7)-(line 187,col 7)",
        "(line 189,col 7)-(line 191,col 7)",
        "(line 193,col 7)-(line 193,col 34)",
        "(line 194,col 7)-(line 198,col 7)",
        "(line 200,col 7)-(line 204,col 7)",
        "(line 206,col 7)-(line 206,col 47)",
        "(line 207,col 7)-(line 212,col 7)",
        "(line 215,col 7)-(line 215,col 67)"
      ]
    }
  ]
}