{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InferJSDocInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InferJSDocInfo",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 61,
      "end_line": 224,
      "comment": "\n * Set the JSDocInfo on all types.\n *\n * Propagates JSDoc across the type graph, but not across the symbol graph.\n * This means that if you have:\n * \u003ccode\u003e\n * var x \u003d new Foo();\n * x.bar;\n * \u003c/code\u003e\n * then the JSType attached to x.bar may get associated JSDoc, but the\n * Node and Var will not.\n *\n * JSDoc is initially attached to AST Nodes at parse time.\n * There are 3 ways that JSDoc get propagated across the type system.\n * 1) Nominal types (e.g., constructors) may contain JSDocInfo for their\n *    declaration.\n * 2) Object types have a JSDocInfo slot for each property on that type.\n * 3) Shape types (like structural functions) may have JSDocInfo.\n *\n * #1 and #2 should be self-explanatory, and non-controversial. #3 is\n * a bit trickier. It means that if you have:\n * \u003ccode\u003e\n * /** @param {number} x /\n * Foo.prototype.bar \u003d goog.abstractMethod;\n * \u003c/code\u003e\n * the JSDocInfo will appear in two places in the type system: in the \u0027bar\u0027\n * slot of Foo.prototype, and on the function expression type created by\n * this expression.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.InferJSDocInfo(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 72,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 77,col 5)",
        "(line 78,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 37)",
        "(line 87,col 5)-(line 87,col 46)",
        "(line 88,col 5)-(line 88,col 22)",
        "(line 89,col 5)-(line 89,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 92,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 22)",
        "(line 96,col 5)-(line 188,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.dereferenceToObject(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n   * Dereferences the given type to an object, or returns null.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InferJSDocInfo.attachJSDocInfoToNominalTypeOrShape(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.JSDocInfo, java.lang.String)",
      "begin_line": 201,
      "end_line": 223,
      "comment": "\n   * Handle cases #1 and #3 in the class doc.\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 222,col 5)"
      ]
    }
  ]
}