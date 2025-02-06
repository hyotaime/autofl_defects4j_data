{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AstParallelizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstParallelizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 234,
      "comment": "\n * Breaks up the AST at different levels for parallel analysis and\n * optimizations. In all cases, the subtrees are detached from the original\n * source tree and are replaced by place-holders for the reverse process.\n * Although this class breaks the AST into independent subtrees and make tree\n * transformation safe, it is still up to individual passes to preserve proper\n * semantics when analyzing the subtrees.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "TEMP_NAME"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldSplit"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeHolderProvider"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forest"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeRoot"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detachPointList"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maps to place holder to the original function."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstParallelizer.AstParallelizer(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Supplier\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 66,
      "end_line": 78,
      "comment": "\n   * Constructor.\n   *\n   * @param shouldSplit Specify at which node it should split the subtree.\n   * @param shouldTraverse Specify when to stop looking for subtree to split.\n   *     This is \u003cb\u003every\u003c/b\u003e important for performance as we do not want to\n   *     traverse too much just looking for subtree.\n   * @param placeHolderProvider Specify what type of node should be place as\n   *     a temporary place holder for where the subtree is detached.\n   * @param root The AST itself.\n   * @param includeRoot Should we include the root inside the forest returned\n   *     by {{@link #split()}.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 35)",
        "(line 73,col 5)-(line 73,col 51)",
        "(line 74,col 5)-(line 74,col 21)",
        "(line 75,col 5)-(line 75,col 35)",
        "(line 76,col 5)-(line 76,col 40)",
        "(line 77,col 5)-(line 77,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.createNewFunctionLevelAstParallelizer(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 80,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 89,col 6)",
        "(line 92,col 5)-(line 97,col 6)",
        "(line 100,col 5)-(line 105,col 6)",
        "(line 106,col 5)-(line 107,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-d903db19-7dfa-44b4-b551-26ccddc2e4f1.apply(com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-89f3590b-e7ef-45b7-8b86-9078bc951eb5.apply(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-d18df795-5b6c-4dd1-bbcd-7455d0b4489f.get()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.createNewFileLevelAstParallelizer(com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 118,col 6)",
        "(line 121,col 5)-(line 126,col 6)",
        "(line 129,col 5)-(line 134,col 6)",
        "(line 135,col 5)-(line 136,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-adb156b8-f677-4024-9b78-9f9f305ac9fa.apply(com.google.javascript.rhino.Node)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-39154f57-9d83-43ca-8244-76c3861477fa.get()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.Anonymous-b77645fb-9e6e-4c35-9b54-97ded9a99264.apply(com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.recordSplitPoint(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n   * Remembers the split point for use in {@link #join()}.\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.split()",
      "begin_line": 151,
      "end_line": 157,
      "comment": "\n   * Splits the AST into subtree at different levels. The subtrees itself are\n   * usually not valid JavaScript but they are all subtrees of some valid\n   * JavaScript.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 154,col 5)",
        "(line 155,col 5)-(line 155,col 16)",
        "(line 156,col 5)-(line 156,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.split(com.google.javascript.rhino.Node)",
      "begin_line": 159,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 31)",
        "(line 161,col 5)-(line 161,col 23)",
        "(line 162,col 5)-(line 181,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.join()",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n   * Reverse the splitting done by {@link #split()}.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 192,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DetachPoint",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 203,
      "end_line": 233,
      "comment": "\n   * A class to map the place holder to the original subtree for re-attachment.\n   * Normally a Map from Node -\u003e Node is sufficient, however, if we also\n   * remember the node before the place holder, we can avoid using\n   * {@link Node#replaceChild(Node, Node)} which requires a linear search of\n   * the before node. Maybe someday we should get a prev pointer for this\n   * purpose.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "placeHolder"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The place holder to remember where the original node was."
    },
    {
      "type": "field",
      "varNames": [
        "before"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The node before the place holder and the original, null if"
    },
    {
      "type": "field",
      "varNames": [
        "original"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The root of the subtree to be temporary detached."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstParallelizer.DetachPoint.DetachPoint(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 37)",
        "(line 216,col 7)-(line 216,col 27)",
        "(line 217,col 7)-(line 217,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizer.DetachPoint.reattach()",
      "begin_line": 220,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 223,col 7)-(line 231,col 7)"
      ]
    }
  ]
}