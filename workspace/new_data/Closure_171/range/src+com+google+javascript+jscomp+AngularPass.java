{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AngularPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AngularPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 71,
      "end_line": 311,
      "comment": "\n * Compiler pass for AngularJS-specific needs. Generates {@code $inject} \\\n * properties for functions (class constructors, wrappers, etc) annotated with\n * @ngInject.\n *\n * \u003cp\u003eFor example, the following code:\u003c/p\u003e\n * \u003cpre\u003e{@code\n *\n * /** @ngInject * /\n * function Controller(dependency1, dependency2) {\n *   // do something\n * }\n *\n * }\u003c/pre\u003e\n *\n * \u003cp\u003ewill be transformed into:\n * \u003cpre\u003e{@code\n *\n * function Controller(dependency1, dependency2) {\n *   // do something\n * }\n * Controller.$inject \u003d [\u0027dependency1\u0027, \u0027dependency2\u0027];\n *\n * }\u003c/pre\u003e\n *\n * \u003cp\u003e This pass also supports assignments of function expressions to variables\n * like:\n * \u003cpre\u003e{@code\n *\n * /** @ngInject * /\n * var filter \u003d function(a, b) {};\n *\n * var ns \u003d {};\n * /** @ngInject * /\n * ns.method \u003d function(a,b,c) {};\n *\n * /** @ngInject * /\n * var shorthand \u003d ns.method2 \u003d function(a,b,c,) {}\n *\n * }\u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectables"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Nodes annotated with @ngInject "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AngularPass.AngularPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INJECT_PROPERTY_NAME"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INJECT_IN_NON_GLOBAL_OR_BLOCK_ERROR"
      ],
      "begin_line": 83,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INJECT_NON_FUNCTION_ERROR"
      ],
      "begin_line": 88,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NAME_ERROR"
      ],
      "begin_line": 93,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 97,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 49)",
        "(line 101,col 5)-(line 101,col 65)",
        "(line 102,col 5)-(line 102,col 32)",
        "(line 104,col 5)-(line 137,col 5)",
        "(line 138,col 5)-(line 140,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.createDependenciesList(com.google.javascript.rhino.Node)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "\n   * Given a FUNCTION node returns array of STRING nodes representing function\n   * parameters.\n   * @param n the FUNCTION node.\n   * @return STRING nodes.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 48)",
        "(line 151,col 5)-(line 151,col 52)",
        "(line 152,col 5)-(line 154,col 5)",
        "(line 155,col 5)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.createStringsFromParamList(com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 171,
      "comment": "\n   * Given a PARAM_LIST node creates an array of corresponding STRING nodes.\n   * @param params PARAM_LIST node.\n   * @return array of STRING nodes.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 40)",
        "(line 165,col 5)-(line 165,col 49)",
        "(line 166,col 5)-(line 169,col 5)",
        "(line 170,col 5)-(line 170,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 41)",
        "(line 176,col 5)-(line 178,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.addNode(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 186,
      "end_line": 239,
      "comment": "\n   * Add node to the list of injectables.\n   * @param n node to add.\n   * @param t node traversal instance.\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 23)",
        "(line 188,col 5)-(line 188,col 19)",
        "(line 189,col 5)-(line 189,col 23)",
        "(line 191,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 227,col 5)",
        "(line 229,col 5)-(line 232,col 5)",
        "(line 236,col 5)-(line 236,col 37)",
        "(line 238,col 5)-(line 238,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.getDeclarationRValue(com.google.javascript.rhino.Node)",
      "begin_line": 253,
      "end_line": 264,
      "comment": "\n   * Given a VAR node (variable declaration) returns the node of initial value.\n   *\n   * \u003cpre\u003e{@code\n   * var x;  // null\n   * var y \u003d \"value\"; // STRING \"value\" node\n   * var z \u003d x \u003d y \u003d function() {}; // FUNCTION node\n   * }\u003c/pre\u003e\n   * @param n VAR node.\n   * @return the assigned intial value, or the rightmost rvalue of an assignment\n   * chain, or null.\n   ",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 34)",
        "(line 255,col 5)-(line 255,col 43)",
        "(line 256,col 5)-(line 256,col 42)",
        "(line 257,col 5)-(line 259,col 5)",
        "(line 260,col 5)-(line 262,col 5)",
        "(line 263,col 5)-(line 263,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 266,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " Name of the function/object. "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Node jsDoc is attached to. "
    },
    {
      "type": "field",
      "varNames": [
        "functionNode"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " Function node "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Node after which to inject the new code "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AngularPass.NodeContext.NodeContext(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 277,col 7)-(line 277,col 23)",
        "(line 278,col 7)-(line 278,col 23)",
        "(line 279,col 7)-(line 279,col 39)",
        "(line 280,col 7)-(line 280,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.NodeContext.getName()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * @return the name.\n     ",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.NodeContext.getNode()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * @return the node.\n     ",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.NodeContext.getFunctionNode()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * @return the context.\n     ",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AngularPass.NodeContext.getTarget()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * @return the context.\n     ",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 20)"
      ]
    }
  ]
}