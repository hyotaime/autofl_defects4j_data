{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RuntimeTypeCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RuntimeTypeCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 48,
      "end_line": 385,
      "comment": "\n * Inserts run-time type assertions.\n *\n * \u003cp\u003eWe add markers to user-defined interfaces and classes in order to check if\n * an object conforms to that type.\n *\n * \u003cp\u003eFor each function, we insert a run-time type assertion for each parameter\n * and return value for which the compiler has a type.\n *\n * \u003cp\u003eThe JavaScript code which implements the type assertions is in\n * js/runtime-type-check.js.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ALPHA"
      ],
      "begin_line": 50,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.Anonymous-5f6d78bf-c1aa-4580-9f27-35f85719f4d6.compare(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 53,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.Anonymous-def4e025-4e18-472f-a07a-ea48132194a0.getName(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 56,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 57,col 7)-(line 68,col 7)"
      ]
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
        "logFunction"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.RuntimeTypeCheck(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 29)",
        "(line 77,col 5)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 69)",
        "(line 83,col 5)-(line 83,col 60)",
        "(line 84,col 5)-(line 84,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AddMarkers",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 99,
      "end_line": 203,
      "comment": "\n   * Inserts marker properties for user-defined interfaces and classes.\n   *\n   * \u003cp\u003eFor example, for a class C, we add\n   * {@code C.prototype[\u0027instance_of__C\u0027]}, and for each interface I it\n   * implements , we add {@code C.prototype[\u0027implements__I\u0027]}.\n   *\n   * \u003cp\u003eSince interfaces are not a run-time JS concept, we use these markers to\n   * recognize an interface implementation at runtime. We also use markers for\n   * user-defined classes, so that we can easily recognize them independently of\n   * which module they are defined in and whether the module is loaded.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.AddMarkers(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 7)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 112,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 65)",
        "(line 117,col 7)-(line 119,col 7)",
        "(line 121,col 7)-(line 121,col 56)",
        "(line 123,col 7)-(line 123,col 70)",
        "(line 125,col 7)-(line 125,col 57)",
        "(line 126,col 7)-(line 126,col 69)",
        "(line 127,col 7)-(line 130,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.addMarker(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 133,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 140,col 7)",
        "(line 142,col 7)-(line 142,col 71)",
        "(line 146,col 7)-(line 148,col 7)",
        "(line 150,col 7)-(line 151,col 53)",
        "(line 153,col 7)-(line 156,col 65)",
        "(line 158,col 7)-(line 163,col 26)",
        "(line 165,col 7)-(line 165,col 77)",
        "(line 166,col 7)-(line 166,col 34)",
        "(line 167,col 7)-(line 167,col 33)",
        "(line 168,col 7)-(line 168,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.findNodeToInsertAfter(com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 189,
      "comment": "\n     * Find the node to insert the markers after. Typically, this node\n     * corresponds to the constructor declaration, but we want to skip any of\n     * the white-listed function calls.\n     *\n     * @param n the constructor function node\n     * @return the node to insert after\n     ",
      "child_ranges": [
        "(line 180,col 7)-(line 180,col 70)",
        "(line 182,col 7)-(line 182,col 46)",
        "(line 183,col 7)-(line 186,col 7)",
        "(line 188,col 7)-(line 188,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.findEnclosingConstructorDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 192,col 7)-(line 194,col 7)",
        "(line 195,col 7)-(line 195,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers.isClassDefiningCall(com.google.javascript.rhino.Node)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 201,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AddChecks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 212,
      "end_line": 362,
      "comment": "\n   * Insert calls to the run-time type checking function {@code checkType}, which\n   * takes an expression to check and a list of checkers (one of which must\n   * match). It returns the expression back to facilitate checking of return\n   * values. We have checkers for value types, class types (user-defined and\n   * externed), and interface types.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.AddChecks()",
      "begin_line": 215,
      "end_line": 216,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 220,col 7)-(line 224,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 270,
      "comment": "\n     * Insert checks for the parameters of the function.\n     ",
      "child_ranges": [
        "(line 231,col 7)-(line 231,col 71)",
        "(line 232,col 7)-(line 232,col 36)",
        "(line 233,col 7)-(line 233,col 73)",
        "(line 234,col 7)-(line 234,col 33)",
        "(line 238,col 7)-(line 242,col 7)",
        "(line 244,col 7)-(line 269,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 272,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 273,col 7)-(line 273,col 47)",
        "(line 274,col 7)-(line 274,col 72)",
        "(line 276,col 7)-(line 276,col 40)",
        "(line 277,col 7)-(line 279,col 7)",
        "(line 281,col 7)-(line 282,col 57)",
        "(line 284,col 7)-(line 286,col 7)",
        "(line 288,col 7)-(line 288,col 42)",
        "(line 289,col 7)-(line 289,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.createCheckTypeCallNode(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 301,
      "end_line": 318,
      "comment": "\n     * Creates a function call to check that the given expression matches the\n     * given type at runtime.\n     *\n     * \u003cp\u003eFor example, if the type is {@code (string|Foo)}, the function call is\n     * {@code checkType(expr, [valueChecker(\u0027string\u0027), classChecker(\u0027Foo\u0027)])}.\n     *\n     * @return the function call node or {@code null} if the type is not checked\n     ",
      "child_ranges": [
        "(line 302,col 7)-(line 302,col 37)",
        "(line 303,col 7)-(line 303,col 36)",
        "(line 304,col 7)-(line 309,col 7)",
        "(line 310,col 7)-(line 316,col 7)",
        "(line 317,col 7)-(line 317,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks.createCheckerNode(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 327,
      "end_line": 361,
      "comment": "\n     * Creates a node which evaluates to a checker for the given type (which\n     * must not be a union). We have checkers for value types, classes and\n     * interfaces.\n     *\n     * @return the checker node or {@code null} if the type is not checked\n     ",
      "child_ranges": [
        "(line 328,col 7)-(line 360,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.addBoilerplateCode()",
      "begin_line": 364,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 72)",
        "(line 366,col 5)-(line 378,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RuntimeTypeCheck.jsCode(java.lang.String)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 383,col 69)"
      ]
    }
  ]
}