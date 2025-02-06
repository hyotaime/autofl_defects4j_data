{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CrossModuleCodeMotion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrossModuleCodeMotion",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 39,
      "end_line": 427,
      "comment": "\n * A {@link Compiler} pass for moving code to a deeper module if possible.\n * - currently it only moves functions + variables\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 42,
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
        "graph"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleVarParentMap"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n   * Map from module to the node in that module that should parent any string\n   * variable declarations that have to be moved into that module\n   "
    },
    {
      "type": "field",
      "varNames": [
        "namedInfo"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n   * NOTE - I made this a LinkedHashMap to make testing easier. With a regular\n   * HashMap, the variables may not output in a consistent order\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.CrossModuleCodeMotion(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JSModuleGraph)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The compiler\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 29)",
        "(line 69,col 5)-(line 69,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 72,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 67)",
        "(line 77,col 5)-(line 84,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.moveCode()",
      "begin_line": 88,
      "end_line": 130,
      "comment": " move the code accordingly ",
      "child_ranges": [
        "(line 89,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamedInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 133,
      "end_line": 185,
      "comment": " useful information for each variable candidate "
    },
    {
      "type": "field",
      "varNames": [
        "allowMove"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deepestModule"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The deepest module where the variable is used. Starts at null"
    },
    {
      "type": "field",
      "varNames": [
        "declModule"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The module where declarations appear"
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 143,
      "end_line": 144,
      "comment": " information on the spot where the item was declared"
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo.addUsedModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 147,
      "end_line": 161,
      "comment": " Add a Module where it is used",
      "child_ranges": [
        "(line 149,col 7)-(line 151,col 7)",
        "(line 154,col 7)-(line 160,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo.addDeclaration(com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration)",
      "begin_line": 168,
      "end_line": 176,
      "comment": "\n     * Add a declaration for this name.\n     * @return Whether this is a valid declaration. If this returns false,\n     *    this should be added as a reference.\n     ",
      "child_ranges": [
        "(line 170,col 7)-(line 172,col 7)",
        "(line 173,col 7)-(line 173,col 27)",
        "(line 174,col 7)-(line 174,col 28)",
        "(line 175,col 7)-(line 175,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo.declarationIterator()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Returns an iterator over the declarations, in the order that they were\n     * declared.\n     ",
      "child_ranges": [
        "(line 183,col 7)-(line 183,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Declaration",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 187,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.Declaration.Declaration(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 7)-(line 192,col 27)",
        "(line 193,col 7)-(line 193,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.hasConditionalAncestor(com.google.javascript.rhino.Node)",
      "begin_line": 202,
      "end_line": 216,
      "comment": "\n   * return true if the node has any form of conditional in its ancestry\n   * TODO(nicksantos) keep track of the conditionals in the ancestry, so\n   * that we don\u0027t have to recrawl it.\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 215,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.getNamedInfo(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n   * get the information on a variable\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 38)",
        "(line 223,col 5)-(line 226,col 5)",
        "(line 227,col 5)-(line 227,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.processReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo, java.lang.String)",
      "begin_line": 233,
      "end_line": 276,
      "comment": "\n   * Process the references to named variables\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 30)",
        "(line 240,col 5)-(line 240,col 47)",
        "(line 241,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 282,col 5)",
        "(line 285,col 5)-(line 285,col 32)",
        "(line 286,col 5)-(line 288,col 5)",
        "(line 293,col 5)-(line 293,col 38)",
        "(line 294,col 5)-(line 296,col 5)",
        "(line 298,col 5)-(line 298,col 37)",
        "(line 299,col 5)-(line 313,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.maybeProcessDeclaration(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CrossModuleCodeMotion.NamedInfo)",
      "begin_line": 331,
      "end_line": 391,
      "comment": "\n   * Determines whether the given NAME node belongs to a declaration that\n   * can be moved across modules. If it is, registers it properly.\n   *\n   * There are four types of movable declarations:\n   * 1) var NAME \u003d [movable object];\n   * 2) function NAME() {}\n   * 3) NAME \u003d [movable object];\n   *    NAME.prop \u003d [movable object];\n   *    NAME.prop.prop2 \u003d [movable object];\n   *    etc.\n   * 4) Class-defining function calls, like \"inherits\" and \"mixin\".\n   *    NAME.inherits([some other name]);\n   * where \"movable object\" is a literal or a function.\n   ",
      "child_ranges": [
        "(line 333,col 5)-(line 333,col 37)",
        "(line 334,col 5)-(line 390,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleCodeMotion.canMoveValue(com.google.javascript.rhino.Node)",
      "begin_line": 396,
      "end_line": 426,
      "comment": "\n   * Determines whether the given value is eligible to be moved across modules.\n   ",
      "child_ranges": [
        "(line 403,col 5)-(line 423,col 5)",
        "(line 425,col 5)-(line 425,col 17)"
      ]
    }
  ]
}