{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AnalyzePrototypeProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnalyzePrototypeProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 52,
      "end_line": 831,
      "comment": "\n * Analyzes properties on prototypes.\n *\n * Uses a reference graph to analyze prototype properties. Each unique property\n * name is represented by a node in this graph. An edge from property A to\n * property B means that there\u0027s a GETPROP access of a property B on some\n * object inside of a method named A.\n *\n * Global functions are also represented by nodes in this graph, with\n * similar semantics.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTY"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Constants for symbol types, for easier readability."
    },
    {
      "type": "field",
      "varNames": [
        "VAR"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canModifyExterns"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anchorUnusedVars"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstModule"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IMPLICITLY_USED_PROPERTIES"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " Properties that are implicitly used as part of the JS language."
    },
    {
      "type": "field",
      "varNames": [
        "symbolGraph"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": " from scotch to age."
    },
    {
      "type": "field",
      "varNames": [
        "globalNode"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " A dummy node for representing global references."
    },
    {
      "type": "field",
      "varNames": [
        "externNode"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " A dummy node for representing extern references."
    },
    {
      "type": "field",
      "varNames": [
        "anonymousNode"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " A dummy node for representing all anonymous functions with no names."
    },
    {
      "type": "field",
      "varNames": [
        "propertyNameInfo"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " of the property that they represent."
    },
    {
      "type": "field",
      "varNames": [
        "varNameInfo"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " global variable that it\u0027s assigned to."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AnalyzePrototypeProperties(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JSModuleGraph, boolean, boolean)",
      "begin_line": 114,
      "end_line": 143,
      "comment": "\n   * Creates a new pass for analyzing prototype properties.\n   * @param compiler The compiler.\n   * @param moduleGraph The graph for resolving module dependencies. May be\n   *     null if we don\u0027t care about module dependencies.\n   * @param canModifyExterns If true, then we can move prototype\n   *     properties that are declared in the externs file.\n   * @param anchorUnusedVars If true, then we must mark all vars as referenced,\n   *     even if they are never used.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 29)",
        "(line 118,col 5)-(line 118,col 35)",
        "(line 119,col 5)-(line 119,col 45)",
        "(line 120,col 5)-(line 120,col 45)",
        "(line 122,col 5)-(line 126,col 5)",
        "(line 128,col 5)-(line 128,col 35)",
        "(line 129,col 5)-(line 129,col 35)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 39)",
        "(line 133,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 145,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 150,col 5)",
        "(line 152,col 5)-(line 152,col 68)",
        "(line 154,col 5)-(line 155,col 73)",
        "(line 156,col 5)-(line 157,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo()",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n   * Returns information on all prototype properties.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 74)",
        "(line 165,col 5)-(line 165,col 40)",
        "(line 166,col 5)-(line 166,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)",
      "begin_line": 176,
      "end_line": 187,
      "comment": "\n   * Gets the name info for the property or variable of a given name,\n   * and creates a new one if necessary.\n   *\n   * @param name The name of the symbol.\n   * @param type The type of symbol.\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 178,col 39)",
        "(line 179,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 189,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "symbolStack"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": "    given a name context. These contexts do not have scopes."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 201,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 203,col 7)-(line 203,col 34)",
        "(line 204,col 7)-(line 229,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 7)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 69)",
        "(line 241,col 7)-(line 245,col 7)",
        "(line 246,col 7)-(line 246,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 251,col 7)-(line 325,col 7)",
        "(line 328,col 7)-(line 330,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.addSymbolUse(java.lang.String, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)",
      "begin_line": 333,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 334,col 7)-(line 334,col 53)",
        "(line 335,col 7)-(line 335,col 26)",
        "(line 337,col 7)-(line 342,col 7)",
        "(line 343,col 7)-(line 345,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.processNonFunctionPrototypeAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * If this is a non-function prototype assign, return the prop name.\n     * Otherwise, return null.\n     ",
      "child_ranges": [
        "(line 353,col 7)-(line 355,col 7)",
        "(line 356,col 7)-(line 356,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.isGlobalFunctionDeclaration(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 363,
      "end_line": 374,
      "comment": "\n     * Determines whether {@code n} is the FUNCTION node in a global function\n     * declaration.\n     ",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 29)",
        "(line 367,col 7)-(line 370,col 7)",
        "(line 372,col 7)-(line 373,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.isAssignRValue(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Returns true if this is the r-value of an assignment.\n     ",
      "child_ranges": [
        "(line 380,col 7)-(line 380,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.getPrototypePropertyNameFromRValue(com.google.javascript.rhino.Node)",
      "begin_line": 390,
      "end_line": 416,
      "comment": "\n     * Returns the name of a prototype property being assigned to this r-value.\n     *\n     * Returns null if this is not the R-value of a prototype property, or if\n     * the R-value is used in multiple expressions (i.e., if there\u0027s\n     * a prototype property assignment in a more complex expression).\n     ",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 51)",
        "(line 392,col 7)-(line 398,col 7)",
        "(line 400,col 7)-(line 401,col 69)",
        "(line 402,col 7)-(line 404,col 7)",
        "(line 405,col 7)-(line 405,col 48)",
        "(line 406,col 7)-(line 408,col 7)",
        "(line 410,col 7)-(line 410,col 58)",
        "(line 411,col 7)-(line 413,col 7)",
        "(line 415,col 7)-(line 415,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.processGlobalFunctionDeclaration(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 422,
      "end_line": 446,
      "comment": "\n     * Processes a NAME node to see if it\u0027s a global function declaration.\n     * If it is, record it and return true. Otherwise, return false.\n     ",
      "child_ranges": [
        "(line 424,col 7)-(line 424,col 49)",
        "(line 425,col 7)-(line 425,col 41)",
        "(line 427,col 7)-(line 444,col 7)",
        "(line 445,col 7)-(line 445,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.processPrototypeRef(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 497,
      "comment": "\n     * Processes the GETPROP of prototype, which can either be under\n     * another GETPROP (in the case of Foo.prototype.bar), or can be\n     * under an assignment (in the case of Foo.prototype \u003d ...).\n     * @return True if a declaration was added.\n     ",
      "child_ranges": [
        "(line 455,col 7)-(line 455,col 55)",
        "(line 457,col 7)-(line 457,col 31)",
        "(line 458,col 7)-(line 495,col 7)",
        "(line 496,col 7)-(line 496,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.maybeGetVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 499,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 500,col 7)-(line 501,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties.addGlobalUseOfSymbol(java.lang.String, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 7)-(line 506,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExternProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 510,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessExternProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 511,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 513,col 7)-(line 516,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropagateReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.JSModule\u003e"
      ],
      "begin_line": 520,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.PropagateReferences.traverseEdge(com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo)",
      "begin_line": 522,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 524,col 7)-(line 532,col 7)",
        "(line 533,col 7)-(line 533,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Symbol",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 544,
      "end_line": 559,
      "comment": "\n   * The declaration of an abstract symbol.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol.remove()",
      "begin_line": 548,
      "end_line": 548,
      "comment": "\n     * Remove the declaration from the AST.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol.getRootVar()",
      "begin_line": 553,
      "end_line": 553,
      "comment": "\n     * The variable for the root of this symbol.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol.getModule()",
      "begin_line": 558,
      "end_line": 558,
      "comment": "\n     * Returns the module where this appears.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GlobalFunction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol"
      ],
      "begin_line": 569,
      "end_line": 615,
      "comment": "\n   * A function initialized as a VAR statement or a function declaration.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 570,
      "end_line": 570,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "var"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 572,
      "end_line": 572,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction.GlobalFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.JSModule)",
      "begin_line": 574,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 575,col 7)-(line 575,col 41)",
        "(line 576,col 7)-(line 578,col 50)",
        "(line 579,col 7)-(line 579,col 31)",
        "(line 580,col 7)-(line 580,col 21)",
        "(line 581,col 7)-(line 581,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction.getRootVar()",
      "begin_line": 584,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction.remove()",
      "begin_line": 589,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 591,col 41)",
        "(line 592,col 7)-(line 597,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction.getModule()",
      "begin_line": 600,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction.getFunctionNode()",
      "begin_line": 605,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 606,col 7)-(line 606,col 41)",
        "(line 608,col 7)-(line 613,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol"
      ],
      "begin_line": 621,
      "end_line": 628,
      "comment": "\n   * Since there are two ways of assigning properties to prototypes, we hide\n   * then behind this interface so they can both be removed regardless of type.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.Property.getPrototype()",
      "begin_line": 624,
      "end_line": 624,
      "comment": " Returns the GETPROP node that refers to the prototype. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.Property.getValue()",
      "begin_line": 627,
      "end_line": 627,
      "comment": " Returns the value of this property. ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AssignmentProperty",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnalyzePrototypeProperties.Property"
      ],
      "begin_line": 636,
      "end_line": 678,
      "comment": "\n   * Properties created via EXPR assignment:\n   *\n   * \u003cpre\u003efunction Foo() { ... };\n   * Foo.prototype.bar \u003d function() { ... };\u003c/pre\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exprNode"
      ],
      "begin_line": 637,
      "end_line": 637,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootVar"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 639,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.AssignmentProperty(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.JSModule)",
      "begin_line": 644,
      "end_line": 648,
      "comment": "\n     * @param node An EXPR node.\n     ",
      "child_ranges": [
        "(line 645,col 7)-(line 645,col 27)",
        "(line 646,col 7)-(line 646,col 29)",
        "(line 647,col 7)-(line 647,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.getRootVar()",
      "begin_line": 650,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 652,col 7)-(line 652,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.remove()",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 7)-(line 657,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.getPrototype()",
      "begin_line": 660,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 7)-(line 662,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.getValue()",
      "begin_line": 665,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 667,col 7)-(line 667,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.getAssignNode()",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 7)-(line 671,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty.getModule()",
      "begin_line": 674,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 7)-(line 676,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LiteralProperty",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnalyzePrototypeProperties.Property"
      ],
      "begin_line": 686,
      "end_line": 728,
      "comment": "\n   * Properties created via object literals:\n   *\n   * \u003cpre\u003efunction Foo() { ... };\n   * Foo.prototype \u003d {bar: function() { ... };\u003c/pre\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 687,
      "end_line": 687,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 688,
      "end_line": 688,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 689,
      "end_line": 689,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assign"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootVar"
      ],
      "begin_line": 691,
      "end_line": 691,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 692,
      "end_line": 692,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.LiteralProperty(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.JSModule)",
      "begin_line": 694,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 696,col 7)-(line 696,col 21)",
        "(line 697,col 7)-(line 697,col 25)",
        "(line 698,col 7)-(line 698,col 21)",
        "(line 699,col 7)-(line 699,col 27)",
        "(line 700,col 7)-(line 700,col 29)",
        "(line 701,col 7)-(line 701,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.getRootVar()",
      "begin_line": 704,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.remove()",
      "begin_line": 709,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 711,col 7)-(line 711,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.getPrototype()",
      "begin_line": 714,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 716,col 7)-(line 716,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.getValue()",
      "begin_line": 719,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 721,col 7)-(line 721,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty.getModule()",
      "begin_line": 724,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 726,col 7)-(line 726,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 734,
      "end_line": 745,
      "comment": "\n   * The context of the current name. This includes the NameInfo and the scope\n   * if it is a scope defining name (function).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 735,
      "end_line": 735,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 739,
      "end_line": 739,
      "comment": " corresponding function. Otherwise, it will be null."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext.NameContext(com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.Scope)",
      "begin_line": 741,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 742,col 7)-(line 742,col 23)",
        "(line 743,col 7)-(line 743,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 750,
      "end_line": 830,
      "comment": "\n   * Information on all properties or global variables of a given name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 754,
      "end_line": 754,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 755,
      "end_line": 755,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deepestCommonModuleRef"
      ],
      "begin_line": 756,
      "end_line": 756,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readClosureVariables"
      ],
      "begin_line": 760,
      "end_line": 760,
      "comment": " outer scope which isn\u0027t the global scope."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.NameInfo(java.lang.String)",
      "begin_line": 767,
      "end_line": 769,
      "comment": "\n     * Constructs a new NameInfo.\n     * @param name The name of the property that this represents. May be null\n     *     to signify dummy nodes in the property graph.\n     ",
      "child_ranges": [
        "(line 768,col 7)-(line 768,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.toString()",
      "begin_line": 771,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 771,col 42)-(line 771,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.isReferenced()",
      "begin_line": 774,
      "end_line": 776,
      "comment": " Determines whether we\u0027ve marked a reference to this property name. ",
      "child_ranges": [
        "(line 775,col 7)-(line 775,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.readsClosureVariables()",
      "begin_line": 779,
      "end_line": 781,
      "comment": " Determines whether it reads a closure variable. ",
      "child_ranges": [
        "(line 780,col 7)-(line 780,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.markReference(com.google.javascript.jscomp.JSModule)",
      "begin_line": 789,
      "end_line": 813,
      "comment": "\n     * Mark a reference in a given module to this property name, and record\n     * the deepest common module reference.\n     * @param module The module where it was referenced.\n     * @return Whether the name info has changed.\n     ",
      "child_ranges": [
        "(line 790,col 7)-(line 790,col 33)",
        "(line 791,col 7)-(line 794,col 7)",
        "(line 796,col 7)-(line 810,col 7)",
        "(line 812,col 7)-(line 812,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.getDeepestCommonModuleRef()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * Returns the deepest common module of all the references to this\n     * property.\n     ",
      "child_ranges": [
        "(line 820,col 7)-(line 820,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo.getDeclarations()",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\n     * Returns a mutable collection of all the prototype property declarations\n     * of this property name.\n     ",
      "child_ranges": [
        "(line 828,col 7)-(line 828,col 26)"
      ]
    }
  ]
}