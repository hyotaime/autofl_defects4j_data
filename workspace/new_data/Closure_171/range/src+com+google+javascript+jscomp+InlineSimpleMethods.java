{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InlineSimpleMethods.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineSimpleMethods",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MethodCompilerPass"
      ],
      "begin_line": 53,
      "end_line": 304,
      "comment": "\n * Inlines methods that take no arguments and have only a return statement\n * returning a property. Because it works on method names rather than type\n * inference, a method with multiple definitions will be inlined if each\n * definition is identical.\n *\n * \u003cpre\u003e\n * A.prototype.foo \u003d function() { return this.b; }\n * B.prototype.foo \u003d function() { return this.b; }\n * \u003c/pre\u003e\n *\n * will inline foo, but\n *\n * \u003cpre\u003e\n * A.prototype.foo \u003d function() { return this.b; }\n * B.prototype.foo \u003d function() { return this.c; }\n * \u003c/pre\u003e\n *\n * will not.\n *\n * Declarations are not removed because we do not find all possible\n * call sites. For examples, calls of the form foo[\"bar\"] are not\n * detected.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.InlineSimpleMethods(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InlineTrivialAccessors",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InvocationsCallback"
      ],
      "begin_line": 66,
      "end_line": 111,
      "comment": "\n   * For each method call, see if it is a candidate for inlining.\n   * TODO(kushal): Cache the results of the checks\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.InlineTrivialAccessors.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 68,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 70,col 7)-(line 73,col 7)",
        "(line 75,col 7)-(line 75,col 69)",
        "(line 76,col 7)-(line 78,col 7)",
        "(line 82,col 7)-(line 82,col 59)",
        "(line 85,col 7)-(line 109,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getActingCallback()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.isPropertyTree(com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 139,
      "comment": "\n   * Returns true if the provided node is a getprop for\n   * which the left child is this or a valid property tree\n   * and for which the right side is a string.\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 126,col 5)",
        "(line 128,col 5)-(line 128,col 53)",
        "(line 129,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 134,col 38)",
        "(line 135,col 5)-(line 137,col 5)",
        "(line 138,col 5)-(line 138,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.replaceThis(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "\n   * Finds the occurrence of \"this\" in the provided property tree and replaces\n   * it with replacement\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 53)",
        "(line 147,col 5)-(line 151,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.returnedExpression(com.google.javascript.rhino.Node)",
      "begin_line": 158,
      "end_line": 174,
      "comment": "\n   * Return the node that represents the expression returned\n   * by the method, given a FUNCTION node.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 44)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 164,col 5)-(line 164,col 56)",
        "(line 165,col 5)-(line 167,col 5)",
        "(line 169,col 5)-(line 171,col 5)",
        "(line 173,col 5)-(line 173,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.isEmptyMethod(com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\n   * Return whether the given FUNCTION node is an empty method definition.\n   *\n   * Must be private, or moved to NodeUtil.\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 44)",
        "(line 184,col 5)-(line 185,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getMethodBlock(com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 202,
      "comment": "\n   * Return a BLOCK node if the given FUNCTION node is a valid method\n   * definition, null otherwise.\n   *\n   * Must be private, or moved to NodeUtil.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 197,col 5)",
        "(line 199,col 5)-(line 199,col 43)",
        "(line 200,col 5)-(line 201,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.allDefinitionsEquivalent(java.util.Collection\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 207,
      "end_line": 218,
      "comment": "\n   * Given a set of method definitions, verify they are the same.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 43)",
        "(line 210,col 5)-(line 210,col 29)",
        "(line 211,col 5)-(line 211,col 29)",
        "(line 212,col 5)-(line 216,col 5)",
        "(line 217,col 5)-(line 217,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlinePropertyReturn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\n   * Replace the provided method call with the tree specified in returnedValue\n   *\n   * Parse tree of a call is\n   * name\n   *   call\n   *     getprop\n   *       obj\n   *       string\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 45)",
        "(line 233,col 5)-(line 233,col 66)",
        "(line 234,col 5)-(line 234,col 39)",
        "(line 235,col 5)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlineConstReturn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\n   * Replace the provided object and its method call with the tree specified\n   * in returnedValue. Should be called only if the object reference has\n   * no side effects.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 46)",
        "(line 246,col 5)-(line 246,col 40)",
        "(line 247,col 5)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.inlineEmptyMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 253,
      "end_line": 263,
      "comment": "\n   * Remove the provided object and its method call.\n   ",
      "child_ranges": [
        "(line 256,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.argsMayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 279,
      "comment": "\n   * Check whether the given method call\u0027s arguments have side effects.\n   * @param call The call node of a method invocation.\n   ",
      "child_ranges": [
        "(line 270,col 5)-(line 276,col 5)",
        "(line 278,col 5)-(line 278,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DUMMY_SIGNATURE_STORE"
      ],
      "begin_line": 284,
      "end_line": 298,
      "comment": "\n   * A do-nothing signature store.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-f0cf1e66-5743-482d-a431-ce6552f351bf.addSignature(java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-e0608011-60ab-4d7d-98d9-77d60f8c46c1.removeSignature(java.lang.String)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.Anonymous-e0f2c083-5027-496c-b5db-1e1bc461cf70.reset()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethods.getSignatureStore()",
      "begin_line": 300,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 33)"
      ]
    }
  ]
}