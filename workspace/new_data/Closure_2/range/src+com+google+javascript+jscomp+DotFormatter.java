{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DotFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DotFormatter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 296,
      "comment": "\n * \u003cp\u003eDotFormatter prints out a dot file of the Abstract Syntax Tree.\n * For a detailed description of the dot format and visualization tool refer\n * to \u003ca href\u003d\"http://www.graphviz.org\"\u003eGraphviz\u003c/a\u003e.\u003c/p\u003e\n * \u003cp\u003eTypical usage of this class\u003c/p\u003e\n * \u003ccode\u003eSystem.out.println(new DotFormatter().toDot(\u003ci\u003enode\u003c/i\u003e));\u003c/code\u003e\n * \u003cp\u003eThis class is \u003cb\u003enot\u003c/b\u003e thread safe and should not be used without proper\n * external synchronization.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "INDENT"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARROW"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LINE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignments"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " stores the current assignment of node to keys"
    },
    {
      "type": "field",
      "varNames": [
        "keyCount"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " key count in order to assign a unique key to each node"
    },
    {
      "type": "field",
      "varNames": [
        "builder"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the builder used to generate the dot diagram"
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printAnnotations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DotFormatter.DotFormatter()",
      "begin_line": 63,
      "end_line": 67,
      "comment": " For Testing Only ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 39)",
        "(line 65,col 5)-(line 65,col 20)",
        "(line 66,col 5)-(line 66,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DotFormatter.DotFormatter(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, java.lang.Appendable, boolean)",
      "begin_line": 69,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 19)",
        "(line 72,col 5)-(line 72,col 27)",
        "(line 73,col 5)-(line 73,col 45)",
        "(line 75,col 5)-(line 75,col 21)",
        "(line 76,col 5)-(line 76,col 21)",
        "(line 77,col 5)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.toDot(com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n   * Converts an AST to dot representation.\n   * @param n the root of the AST described in the dot formatted string\n   * @return the dot representation of the AST\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.toDot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, boolean)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\n   * Converts an AST to dot representation.\n   * @param n the root of the AST described in the dot formatted string\n   * @param inCFG Control Flow Graph.\n   * @param printAnnotations print annotations.\n   * @return the dot representation of the AST\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 48)",
        "(line 100,col 5)-(line 100,col 58)",
        "(line 101,col 5)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.toDot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n   * Converts an AST to dot representation.\n   * @param n the root of the AST described in the dot formatted string\n   * @param inCFG Control Flow Graph.\n   * @return the dot representation of the AST\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 48)",
        "(line 113,col 5)-(line 113,col 47)",
        "(line 114,col 5)-(line 114,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.appendDot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, java.lang.Appendable)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n   * Converts an AST to dot representation and appends it to the given buffer.\n   * @param n the root of the AST described in the dot formatted string\n   * @param inCFG Control Flow Graph.\n   * @param builder A place to dump the graph.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.newInstanceForTesting()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Creates a DotFormatter purely for testing DotFormatter\u0027s internal methods.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.traverseNodes(com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 32)",
        "(line 140,col 5)-(line 150,col 5)",
        "(line 153,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.key(com.google.javascript.rhino.Node)",
      "begin_line": 183,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 37)",
        "(line 185,col 5)-(line 209,col 5)",
        "(line 210,col 5)-(line 210,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.name(com.google.javascript.rhino.Node)",
      "begin_line": 213,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 27)",
        "(line 215,col 5)-(line 221,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.formatNodeName(java.lang.Integer)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.formatPreamble()",
      "begin_line": 228,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 38)",
        "(line 230,col 5)-(line 230,col 27)",
        "(line 231,col 5)-(line 231,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.formatConclusion()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DotFormatter.toDot(com.google.javascript.jscomp.graph.GraphvizGraph)",
      "begin_line": 244,
      "end_line": 295,
      "comment": "\n   * Outputs a string in DOT format that presents the graph.\n   *\n   * @param graph Input graph.\n   * @return A string in Dot format that presents the graph.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 49)",
        "(line 246,col 5)-(line 246,col 61)",
        "(line 247,col 5)-(line 247,col 27)",
        "(line 248,col 5)-(line 248,col 36)",
        "(line 249,col 5)-(line 249,col 27)",
        "(line 250,col 5)-(line 250,col 27)",
        "(line 251,col 5)-(line 251,col 63)",
        "(line 253,col 5)-(line 253,col 64)",
        "(line 255,col 5)-(line 255,col 56)",
        "(line 257,col 5)-(line 257,col 50)",
        "(line 259,col 5)-(line 263,col 5)",
        "(line 267,col 5)-(line 267,col 27)",
        "(line 269,col 5)-(line 273,col 5)",
        "(line 275,col 5)-(line 275,col 56)",
        "(line 277,col 5)-(line 277,col 50)",
        "(line 279,col 5)-(line 282,col 5)",
        "(line 285,col 5)-(line 285,col 27)",
        "(line 287,col 5)-(line 291,col 5)",
        "(line 293,col 5)-(line 293,col 26)",
        "(line 294,col 5)-(line 294,col 30)"
      ]
    }
  ]
}