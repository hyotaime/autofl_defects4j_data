{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AstParallelizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstParallelizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 233,
      "comment": "\n * Breaks up the AST at different levels for parallel analysis and\n * optimizations. In all cases, the subtrees are detached from the original\n * source tree and are replaced by place-holders for the reverse process.\n * Although this class breaks the AST into independent subtrees and make tree\n * transformation safe, it is still up to individual passes to preserve proper\n * semantics when analyzing the subtrees.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "TEMP_NAME"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldSplit"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeHolderProvider"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forest"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeRoot"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detachPointList"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maps to place holder to the original function."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstParallelizer.AstParallelizer(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Supplier\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 65,
      "end_line": 77,
      "comment": "\n   * Constructor.\n   *\n   * @param shouldSplit Specify at which node it should split the subtree.\n   * @param shouldTraverse Specify when to stop looking for subtree to split.\n   *     This is \u003cb\u003every\u003c/b\u003e important for performance as we do not want to\n   *     traverse too much just looking for subtree.\n   * @param placeHolderProvider Specify what type of node should be place as\n   *     a temporary place holder for where the subtree is detached.\n   * @param root The AST itself.\n   * @param includeRoot Should we include the root inside the forest returned\n   *     by {{@link #split()}.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 35)",
        "(line 72,col 5)-(line 72,col 51)",
        "(line 73,col 5)-(line 73,col 21)",
        "(line 74,col 5)-(line 74,col 35)",
        "(line 75,col 5)-(line 75,col 40)",
        "(line 76,col 5)-(line 76,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.createNewFunctionLevelAstParallelizer(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 79,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 88,col 6)",
        "(line 91,col 5)-(line 96,col 6)",
        "(line 99,col 5)-(line 104,col 6)",
        "(line 105,col 5)-(line 106,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-6552acec-8506-412e-801a-d5ad5bbdc9fa.apply(com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-7e15db01-94eb-4161-904d-609f31382099.apply(com.google.javascript.rhino.Node)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-343403d6-7d76-47a1-98bc-c118e4d99e62.get()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.createNewFileLevelAstParallelizer(com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 117,col 6)",
        "(line 120,col 5)-(line 125,col 6)",
        "(line 128,col 5)-(line 133,col 6)",
        "(line 134,col 5)-(line 135,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-b8a6d266-b65f-4a4a-ab50-371802aab997.apply(com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-b25979ba-3f19-496b-b981-949bb9f6fcc6.get()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-39355bf9-deb8-48ff-b137-1e5cbc898a5d.apply(com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.recordSplitPoint(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Remembers the split point for use in {@link #join()}.\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.split()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n   * Splits the AST into subtree at different levels. The subtrees itself are\n   * usually not valid JavaScript but they are all subtrees of some valid\n   * JavaScript.\n   ",
      "child_ranges": [
        "(line 151,col 5)-(line 153,col 5)",
        "(line 154,col 5)-(line 154,col 16)",
        "(line 155,col 5)-(line 155,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.split(com.google.javascript.rhino.Node)",
      "begin_line": 158,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 31)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.join()",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\n   * Reverse the splitting done by {@link #split()}.\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 191,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DetachPoint",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 202,
      "end_line": 232,
      "comment": "\n   * A class to map the place holder to the original subtree for re-attachment.\n   * Normally a Map from Node -\u003e Node is sufficient, however, if we also\n   * remember the node before the place holder, we can avoid using\n   * {@link Node#replaceChild(Node, Node)} which requires a linear search of\n   * the before node. Maybe someday we should get a prev pointer for this\n   * purpose.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "placeHolder"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " The place holder to remember where the original node was."
    },
    {
      "type": "field",
      "varNames": [
        "before"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The node before the place holder and the original, null if"
    },
    {
      "type": "field",
      "varNames": [
        "original"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The root of the subtree to be temporary detached."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstParallelizer.DetachPoint.DetachPoint(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 37)",
        "(line 215,col 7)-(line 215,col 27)",
        "(line 216,col 7)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.DetachPoint.reattach()",
      "begin_line": 219,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 222,col 7)-(line 230,col 7)"
      ]
    }
  ]
}