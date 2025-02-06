{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/StandardUnionFind.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardUnionFind",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "com.google.javascript.jscomp.graph.UnionFind\u003cE\u003e"
      ],
      "begin_line": 49,
      "end_line": 228,
      "comment": "\n * A Union-Find implementation.\n *\n * \u003cp\u003eThis class implements Union-Find algorithm with rank and path\n * compression.\n *\n * \u003cp\u003eSee \u003ca\n * href\u003d\"http://www.algorithmist.com/index.php?title\u003dUnion_Find\u0026oldid\u003d7575\"\u003e\n * algorithmist\u003c/a\u003e for more detail.\n *\n * @param \u003cE\u003e element type\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elmap"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " All values with the same root node are in the same equivalence set. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.StandardUnionFind()",
      "begin_line": 57,
      "end_line": 58,
      "comment": " Creates an empty UnionFind structure. ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.StandardUnionFind(com.google.javascript.jscomp.graph.UnionFind\u003cE\u003e)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n   * Creates an UnionFind structure being a copy of other structure.\n   * The created structure is optimal in a sense that the paths to\n   * the root from any element will have a length of at most 1.\n   *\n   * @param other structure to be copied\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 70,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.add(E)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.union(E, E)",
      "begin_line": 78,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 44)",
        "(line 81,col 5)-(line 81,col 44)",
        "(line 83,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 90,col 5)",
        "(line 91,col 5)-(line 91,col 25)",
        "(line 92,col 5)-(line 94,col 5)",
        "(line 95,col 5)-(line 95,col 29)",
        "(line 96,col 5)-(line 96,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.find(E)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 73)",
        "(line 102,col 5)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.areEquivalent(E, E)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 21)",
        "(line 108,col 5)-(line 108,col 21)",
        "(line 109,col 5)-(line 109,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.elements()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.allEquivalenceClasses()",
      "begin_line": 117,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 72)",
        "(line 120,col 5)-(line 128,col 5)",
        "(line 129,col 5)-(line 129,col 67)",
        "(line 130,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findRootOrCreateNode(E)",
      "begin_line": 142,
      "end_line": 150,
      "comment": "\n   * If e is already in a non-trivial equivalence class, that is, a class with\n   * more than two elements, then return the {@link Node} corresponding to the\n   * representative element. Otherwise, if e sits in an equivalence class by\n   * itself, then create a {@link Node}, put it into elmap and return it.\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 32)",
        "(line 144,col 5)-(line 146,col 5)",
        "(line 147,col 5)-(line 147,col 26)",
        "(line 148,col 5)-(line 148,col 23)",
        "(line 149,col 5)-(line 149,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findRoot(com.google.javascript.jscomp.graph.StandardUnionFind.Node\u003cE\u003e)",
      "begin_line": 159,
      "end_line": 164,
      "comment": "\n   * Given a {@link Node}, walk the parent field as far as possible, until\n   * reaching the root, which is the {@link Node} for the current\n   * representative of this equivalence class. To achieve low runtime\n   * complexity, also compress the path, by making each node a direct child of\n   * the root.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 162,col 5)",
        "(line 163,col 5)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findAll(E)",
      "begin_line": 166,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 80)",
        "(line 170,col 5)-(line 187,col 6)",
        "(line 189,col 5)-(line 203,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nodeForValue"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " some node that\u0027s close to the root, or null "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-a76b9f86-0318-4183-8169-9479983f8bdf.apply(java.lang.Object)",
      "begin_line": 175,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 46)",
        "(line 185,col 9)-(line 185,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-f4fa08fd-bde8-41c2-a9b1-fe89dedc7cd2.contains(java.lang.Object)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-ef368c40-e881-4328-bdb1-d48eddded44e.iterator()",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 197,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-bede256e-cd92-4320-b1a9-8b433ae3eb95.size()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 207,
      "end_line": 227,
      "comment": " The internal node representation. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The parent node of this element. "
    },
    {
      "type": "field",
      "varNames": [
        "element"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The element represented by this node. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " A bound on the depth of the subtree rooted to this node. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * If this node is the root of a tree, this is the number of elements in the\n     * tree. Otherwise, it\u0027s undefined.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Node.Node(E)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 224,col 7)-(line 224,col 25)",
        "(line 225,col 7)-(line 225,col 29)"
      ]
    }
  ]
}