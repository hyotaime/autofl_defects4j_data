{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DefinitionsRemover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefinitionsRemover",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 401,
      "comment": "\n * Models an assignment that defines a variable and the removal of it.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.getDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 37,
      "end_line": 65,
      "comment": "\n   * @return an {@link Definition} object if the node contains a definition or\n   *     {@code null} otherwise.\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 32)",
        "(line 43,col 5)-(line 45,col 5)",
        "(line 47,col 5)-(line 63,col 5)",
        "(line 64,col 5)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.isDefinitionNode(com.google.javascript.rhino.Node)",
      "begin_line": 70,
      "end_line": 93,
      "comment": "\n   * @return Whether a definition object can be created.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 32)",
        "(line 73,col 5)-(line 75,col 5)",
        "(line 77,col 5)-(line 91,col 5)",
        "(line 92,col 5)-(line 92,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Definition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExtern"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.Definition(boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 7)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.remove()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * Removes this definition from the AST if it is not an extern.\n     *\n     * This method should not be called on a definition for which isExtern()\n     * is true.\n     ",
      "child_ranges": [
        "(line 111,col 7)-(line 116,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.performRemove()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Subclasses should override to remove the definition from the AST.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.getLValue()",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Variable or property name represented by this definition.\n     * For example, in the case of assignments this method would\n     * return the NAME, GETPROP or GETELEM expression that acts as the\n     * assignment left hand side.\n     *\n     * @return the L-Value associated with this definition.\n     *         The node\u0027s type is always NAME, GETPROP or GETELEM.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.getRValue()",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Value expression that acts as the right hand side of the\n     * definition statement.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.Definition.isExtern()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns true if the definition is an extern.\n     ",
      "child_ranges": [
        "(line 145,col 7)-(line 145,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IncompleteDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.Definition"
      ],
      "begin_line": 153,
      "end_line": 175,
      "comment": "\n   * Represents an name-only external definition.  The definition\u0027s\n   * RHS is missing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ALLOWED_TYPES"
      ],
      "begin_line": 154,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lValue"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition.IncompleteDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 23)",
        "(line 160,col 7)-(line 160,col 41)",
        "(line 161,col 7)-(line 162,col 69)",
        "(line 163,col 7)-(line 163,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition.getLValue()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition.getRValue()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnknownDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition"
      ],
      "begin_line": 180,
      "end_line": 189,
      "comment": "\n   * Represents an unknown definition.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.UnknownDefinition.UnknownDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.UnknownDefinition.performRemove()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 7)-(line 187,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExternalNameOnlyDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition"
      ],
      "begin_line": 195,
      "end_line": 206,
      "comment": "\n   * Represents an name-only external definition.  The definition\u0027s\n   * RHS is missing.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ExternalNameOnlyDefinition.ExternalNameOnlyDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 7)-(line 198,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ExternalNameOnlyDefinition.performRemove()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 7)-(line 204,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionArgumentDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.IncompleteDefinition"
      ],
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n   * Represents a function formal parameter. The definition\u0027s RHS is missing.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionArgumentDefinition.FunctionArgumentDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 212,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 37)",
        "(line 216,col 7)-(line 216,col 57)",
        "(line 217,col 7)-(line 217,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionArgumentDefinition.performRemove()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 222,col 7)-(line 223,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.Definition"
      ],
      "begin_line": 230,
      "end_line": 249,
      "comment": "\n   * Represents a function declaration or function expression.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition.FunctionDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 235,col 23)",
        "(line 236,col 7)-(line 236,col 53)",
        "(line 237,col 7)-(line 237,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition.getLValue()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 7)-(line 242,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition.getRValue()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 7)-(line 247,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamedFunctionDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition"
      ],
      "begin_line": 255,
      "end_line": 264,
      "comment": "\n   * Represents a function declaration without assignment node such as\n   * {@code function foo()}.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.NamedFunctionDefinition.NamedFunctionDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.NamedFunctionDefinition.performRemove()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionExpressionDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.FunctionDefinition"
      ],
      "begin_line": 270,
      "end_line": 282,
      "comment": "\n   * Represents a function expression that acts as a RHS.  The defined\n   * name is only reachable from within the function.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionExpressionDefinition.FunctionExpressionDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 271,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 29)",
        "(line 273,col 7)-(line 274,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.FunctionExpressionDefinition.performRemove()",
      "begin_line": 277,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AssignmentDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.Definition"
      ],
      "begin_line": 287,
      "end_line": 314,
      "comment": "\n   * Represents a declaration within an assignment.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assignment"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition.AssignmentDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 23)",
        "(line 292,col 7)-(line 292,col 51)",
        "(line 293,col 7)-(line 293,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition.performRemove()",
      "begin_line": 296,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 43)",
        "(line 300,col 7)-(line 300,col 44)",
        "(line 301,col 7)-(line 301,col 35)",
        "(line 302,col 7)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition.getLValue()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 7)-(line 307,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.AssignmentDefinition.getRValue()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 7)-(line 312,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectLiteralPropertyDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.Definition"
      ],
      "begin_line": 320,
      "end_line": 365,
      "comment": "\n   * Represents member declarations using a object literal.\n   * Example: var x \u003d { e : function() { } };\n   "
    },
    {
      "type": "field",
      "varNames": [
        "literal"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ObjectLiteralPropertyDefinition.ObjectLiteralPropertyDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 326,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 22)",
        "(line 330,col 7)-(line 330,col 25)",
        "(line 331,col 7)-(line 331,col 23)",
        "(line 332,col 7)-(line 332,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ObjectLiteralPropertyDefinition.performRemove()",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 7)-(line 337,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ObjectLiteralPropertyDefinition.getLValue()",
      "begin_line": 340,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 348,col 7)-(line 358,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.ObjectLiteralPropertyDefinition.getRValue()",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 7)-(line 363,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VarDefinition",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DefinitionsRemover.Definition"
      ],
      "begin_line": 370,
      "end_line": 400,
      "comment": "\n   * Represents a VAR declaration with an assignment.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.VarDefinition.VarDefinition(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 372,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 373,col 7)-(line 373,col 23)",
        "(line 374,col 7)-(line 374,col 67)",
        "(line 375,col 7)-(line 376,col 80)",
        "(line 377,col 7)-(line 377,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.VarDefinition.performRemove()",
      "begin_line": 380,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 382,col 7)-(line 382,col 34)",
        "(line 383,col 7)-(line 384,col 44)",
        "(line 385,col 7)-(line 385,col 36)",
        "(line 386,col 7)-(line 386,col 44)",
        "(line 387,col 7)-(line 387,col 48)",
        "(line 388,col 7)-(line 388,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.VarDefinition.getLValue()",
      "begin_line": 391,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 7)-(line 393,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefinitionsRemover.VarDefinition.getRValue()",
      "begin_line": 396,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 7)-(line 398,col 34)"
      ]
    }
  ]
}