{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineSimpleMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineSimpleMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MethodCompilerPass"
      ],
      "begin_line": 52,
      "end_line": 303,
      "comment": "\n * Inlines methods that take no arguments and have only a return statement\n * returning a property. Because it works on method names rather than type\n * inference, a method with multiple definitions will be inlined if each\n * definition is identical.\n *\n * \u003cpre\u003e\n * A.prototype.foo \u003d function() { return this.b; }\n * B.prototype.foo \u003d function() { return this.b; }\n * \u003c/pre\u003e\n *\n * will inline foo, but\n *\n * \u003cpre\u003e\n * A.prototype.foo \u003d function() { return this.b; }\n * B.prototype.foo \u003d function() { return this.c; }\n * \u003c/pre\u003e\n *\n * will not.\n *\n * Declarations are not removed because we do not find all possible\n * call sites. For examples, calls of the form foo[\"bar\"] are not\n * detected.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.InlineSimpleMethods(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InlineTrivialAccessors",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InvocationsCallback"
      ],
      "begin_line": 65,
      "end_line": 110,
      "comment": "\n   * For each method call, see if it is a candidate for inlining.\n   * TODO(kushal): Cache the results of the checks\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.InlineTrivialAccessors.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 67,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 72,col 7)",
        "(line 74,col 7)-(line 74,col 69)",
        "(line 75,col 7)-(line 77,col 7)",
        "(line 81,col 7)-(line 81,col 59)",
        "(line 84,col 7)-(line 108,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getActingCallback()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.isPropertyTree(com.google.javascript.rhino.Node)",
      "begin_line": 122,
      "end_line": 138,
      "comment": "\n   * Returns true if the provided node is a getprop for\n   * which the left child is this or a valid property tree\n   * and for which the right side is a string.\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 5)",
        "(line 127,col 5)-(line 127,col 53)",
        "(line 128,col 5)-(line 131,col 5)",
        "(line 133,col 5)-(line 133,col 38)",
        "(line 134,col 5)-(line 136,col 5)",
        "(line 137,col 5)-(line 137,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.replaceThis(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 151,
      "comment": "\n   * Finds the occurrence of \"this\" in the provided property tree and replaces\n   * it with replacement\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 53)",
        "(line 146,col 5)-(line 150,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.returnedExpression(com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 173,
      "comment": "\n   * Return the node that represents the expression returned\n   * by the method, given a FUNCTION node.\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 44)",
        "(line 159,col 5)-(line 161,col 5)",
        "(line 163,col 5)-(line 163,col 56)",
        "(line 164,col 5)-(line 166,col 5)",
        "(line 168,col 5)-(line 170,col 5)",
        "(line 172,col 5)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.isEmptyMethod(com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n   * Return whether the given FUNCTION node is an empty method definition.\n   *\n   * Must be private, or moved to NodeUtil.\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 44)",
        "(line 183,col 5)-(line 184,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getMethodBlock(com.google.javascript.rhino.Node)",
      "begin_line": 193,
      "end_line": 201,
      "comment": "\n   * Return a BLOCK node if the given FUNCTION node is a valid method\n   * definition, null otherwise.\n   *\n   * Must be private, or moved to NodeUtil.\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 196,col 5)",
        "(line 198,col 5)-(line 198,col 43)",
        "(line 199,col 5)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.allDefinitionsEquivalent(java.util.Collection\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 206,
      "end_line": 217,
      "comment": "\n   * Given a set of method definitions, verify they are the same.\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 43)",
        "(line 209,col 5)-(line 209,col 29)",
        "(line 210,col 5)-(line 210,col 29)",
        "(line 211,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 216,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlinePropertyReturn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 229,
      "end_line": 235,
      "comment": "\n   * Replace the provided method call with the tree specified in returnedValue\n   *\n   * Parse tree of a call is\n   * name\n   *   call\n   *     getprop\n   *       obj\n   *       string\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 45)",
        "(line 232,col 5)-(line 232,col 66)",
        "(line 233,col 5)-(line 233,col 39)",
        "(line 234,col 5)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlineConstReturn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n   * Replace the provided object and its method call with the tree specified\n   * in returnedValue. Should be called only if the object reference has\n   * no side effects.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 46)",
        "(line 245,col 5)-(line 245,col 40)",
        "(line 246,col 5)-(line 246,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlineEmptyMethod(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 252,
      "end_line": 262,
      "comment": "\n   * Remove the provided object and its method call.\n   ",
      "child_ranges": [
        "(line 255,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.argsMayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "\n   * Check whether the given method call\u0027s arguments have side effects.\n   * @param call The call node of a method invocation.\n   ",
      "child_ranges": [
        "(line 269,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 277,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DUMMY_SIGNATURE_STORE"
      ],
      "begin_line": 283,
      "end_line": 297,
      "comment": "\n   * A do-nothing signature store.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-aa59b978-20ee-472d-aa54-db37f444248d.addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-493504af-8ffb-4e4f-a9b0-f99381ea2048.removeSignature(java.lang.String)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-62db32ed-6ac9-41e7-bdd3-4d772821fdf7.reset()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getSignatureStore()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 33)"
      ]
    }
  ]
}