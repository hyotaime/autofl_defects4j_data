{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NodeNameExtractor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeNameExtractor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 96,
      "comment": "\n * Utility class that extracts the qualified name out of a node.\n * Useful when trying to get a human-friendly string representation of\n * a property node that can be used to describe the node or name\n * related nodes based on it (as done by the NameAnonymousFunctions\n * compiler pass).\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "delimiter"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextUniqueInt"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeNameExtractor.NodeNameExtractor(char)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeNameExtractor.getName(com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 95,
      "comment": "\n   * Returns a qualified name of the specified node. Dots and brackets\n   * are changed to the delimiter passed in when constructing the\n   * NodeNameExtractor object.  We also replace \".prototype\" with the\n   * delimiter to keep names short, while still differentiating them\n   * from static properties.  (Prototype properties will end up\n   * looking like \"a$b$$c\" if this.delimiter \u003d \u0027$\u0027.)\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 94,col 5)"
      ]
    }
  ]
}