{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/StandardUnionFind.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardUnionFind",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "com.google.javascript.jscomp.graph.UnionFind\u003cE\u003e"
      ],
      "begin_line": 48,
      "end_line": 227,
      "comment": "\n * A Union-Find implementation.\n *\n * \u003cp\u003eThis class implements Union-Find algorithm with rank and path\n * compression.\n *\n * \u003cp\u003eSee \u003ca\n * href\u003d\"http://www.algorithmist.com/index.php?title\u003dUnion_Find\u0026oldid\u003d7575\"\u003e\n * algorithmist\u003c/a\u003e for more detail.\n *\n * @param \u003cE\u003e element type\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elmap"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " All values with the same root node are in the same equivalence set. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.StandardUnionFind()",
      "begin_line": 56,
      "end_line": 57,
      "comment": " Creates an empty UnionFind structure. ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.StandardUnionFind(com.google.javascript.jscomp.graph.UnionFind\u003cE\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n   * Creates an UnionFind structure being a copy of other structure.\n   * The created structure is optimal in a sense that the paths to\n   * the root from any element will have a length of at most 1.\n   *\n   * @param other structure to be copied\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 69,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.add(E)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.union(E, E)",
      "begin_line": 77,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 44)",
        "(line 80,col 5)-(line 80,col 44)",
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 89,col 5)",
        "(line 90,col 5)-(line 90,col 25)",
        "(line 91,col 5)-(line 93,col 5)",
        "(line 94,col 5)-(line 94,col 29)",
        "(line 95,col 5)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.find(E)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 73)",
        "(line 101,col 5)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.areEquivalent(E, E)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 21)",
        "(line 107,col 5)-(line 107,col 21)",
        "(line 108,col 5)-(line 108,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.elements()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.allEquivalenceClasses()",
      "begin_line": 116,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 72)",
        "(line 119,col 5)-(line 127,col 5)",
        "(line 128,col 5)-(line 128,col 67)",
        "(line 129,col 5)-(line 131,col 5)",
        "(line 132,col 5)-(line 132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findRootOrCreateNode(E)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n   * If e is already in a non-trivial equivalence class, that is, a class with\n   * more than two elements, then return the {@link Node} corresponding to the\n   * representative element. Otherwise, if e sits in an equivalence class by\n   * itself, then create a {@link Node}, put it into elmap and return it.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 32)",
        "(line 143,col 5)-(line 145,col 5)",
        "(line 146,col 5)-(line 146,col 26)",
        "(line 147,col 5)-(line 147,col 23)",
        "(line 148,col 5)-(line 148,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findRoot(com.google.javascript.jscomp.graph.StandardUnionFind.Node\u003cE\u003e)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "\n   * Given a {@link Node}, walk the parent field as far as possible, until\n   * reaching the root, which is the {@link Node} for the current\n   * representative of this equivalence class. To achieve low runtime\n   * complexity, also compress the path, by making each node a direct child of\n   * the root.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 161,col 5)",
        "(line 162,col 5)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.findAll(E)",
      "begin_line": 165,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 80)",
        "(line 169,col 5)-(line 186,col 6)",
        "(line 188,col 5)-(line 202,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nodeForValue"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " some node that\u0027s close to the root, or null "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-b66482fd-adf5-4113-bb16-00bff51569c7.apply(java.lang.Object)",
      "begin_line": 174,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 40)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-7ae17864-c413-4e82-98bf-320d82f5890a.contains(java.lang.Object)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-a5d6a6b6-8bfb-442b-800d-2370f6a62d49.iterator()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 196,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Anonymous-a4e8cac4-2b10-44f0-983b-0a523116bb9f.size()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 206,
      "end_line": 226,
      "comment": " The internal node representation. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The parent node of this element. "
    },
    {
      "type": "field",
      "varNames": [
        "element"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The element represented by this node. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " A bound on the depth of the subtree rooted to this node. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * If this node is the root of a tree, this is the number of elements in the\n     * tree. Otherwise, it\u0027s undefined.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.StandardUnionFind.Node.Node(E)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 25)",
        "(line 224,col 7)-(line 224,col 29)"
      ]
    }
  ]
}