{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ExternExportsPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExternExportsPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 43,
      "end_line": 568,
      "comment": "\n * Creates an externs file containing all exported symbols and properties\n * for later consumption.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE"
      ],
      "begin_line": 46,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE"
      ],
      "begin_line": 51,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exports"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The exports found. "
    },
    {
      "type": "field",
      "varNames": [
        "definitionMap"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A map of all assigns to their parent nodes. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The parent compiler. "
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The AST root which holds the externs generated. "
    },
    {
      "type": "field",
      "varNames": [
        "mappedPaths"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " A mapping of internal paths to exported paths. "
    },
    {
      "type": "field",
      "varNames": [
        "alreadyExportedPaths"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " A list of exported paths. "
    },
    {
      "type": "field",
      "varNames": [
        "exportSymbolFunctionNames"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A list of function names used to export symbols. "
    },
    {
      "type": "field",
      "varNames": [
        "exportPropertyFunctionNames"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A list of function names used to export properties. "
    },
    {
      "type": "class_interface",
      "name": "Export",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "symbolName"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.Export(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 35)",
        "(line 86,col 7)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.generateExterns()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Generates the externs representation of this export and appends\n     * it to the externsRoot AST.\n     ",
      "child_ranges": [
        "(line 94,col 7)-(line 94,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.getExportedPath()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Returns the path exported by this export.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.appendExtern(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 157,
      "comment": "\n     * Appends the exported function and all paths necessary for the path to be\n     * declared. For example, for a property \"a.b.c\", the initializers for\n     * paths \"a\", \"a.b\" will be appended (if they have not already) and a.b.c\n     * will be initialized with the exported version of the function:\n     * \u003cpre\u003e\n     * var a \u003d {};\n     * a.b \u003d {};\n     * a.b.c \u003d function(x,y) { }\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 114,col 7)-(line 114,col 60)",
        "(line 116,col 7)-(line 156,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.computePathPrefixes(java.lang.String)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     * Computes a list of the path prefixes constructed from the components\n     * of the path.\n     * \u003cpre\u003e\n     * E.g., if the path is:\n     *      \"a.b.c\"\n     * then then path prefixes will be\n     *    [\"a\",\"a.b\",\"a.b.c\"]:\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 170,col 7)-(line 170,col 66)",
        "(line 172,col 7)-(line 172,col 55)",
        "(line 174,col 7)-(line 176,col 7)",
        "(line 178,col 7)-(line 178,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.appendPathDefinition(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 26)",
        "(line 184,col 7)-(line 199,col 7)",
        "(line 201,col 7)-(line 201,col 49)",
        "(line 203,col 7)-(line 203,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.createExternFunction(com.google.javascript.rhino.Node)",
      "begin_line": 215,
      "end_line": 233,
      "comment": "\n     * Given a function to export, create the empty function that\n     * will be put in the externs file. This extern function should have\n     * the same type as the original function and the same parameter\n     * name but no function body.\n     *\n     * We create a warning here if the the function to export is missing\n     * parameter or return types.\n     ",
      "child_ranges": [
        "(line 216,col 7)-(line 217,col 23)",
        "(line 219,col 7)-(line 219,col 45)",
        "(line 220,col 7)-(line 226,col 7)",
        "(line 227,col 7)-(line 227,col 76)",
        "(line 229,col 7)-(line 229,col 58)",
        "(line 230,col 7)-(line 230,col 61)",
        "(line 232,col 7)-(line 232,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.createExternObjectLit(com.google.javascript.rhino.Node)",
      "begin_line": 240,
      "end_line": 261,
      "comment": "\n     * Given an object literal to export, create an object lit with all its\n     * string properties. We don\u0027t care what the values of those properties\n     * are because they are not checked.\n     ",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 32)",
        "(line 242,col 7)-(line 242,col 51)",
        "(line 246,col 7)-(line 246,col 40)",
        "(line 248,col 7)-(line 248,col 20)",
        "(line 249,col 7)-(line 259,col 7)",
        "(line 260,col 7)-(line 260,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.checkForFunctionsWithUnknownTypes(com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 310,
      "comment": "\n     * Warn the user if there is an exported function for which a parameter\n     * or return type is unknown.\n     ",
      "child_ranges": [
        "(line 268,col 7)-(line 268,col 57)",
        "(line 270,col 7)-(line 271,col 59)",
        "(line 273,col 7)-(line 277,col 7)",
        "(line 279,col 7)-(line 279,col 55)",
        "(line 282,col 7)-(line 285,col 7)",
        "(line 294,col 7)-(line 295,col 25)",
        "(line 297,col 7)-(line 298,col 25)",
        "(line 300,col 7)-(line 309,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.reportUnknownParameterType(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 313,col 7)-(line 316,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.reportUnknownReturnType(com.google.javascript.rhino.Node)",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.getValue(com.google.javascript.rhino.Node)",
      "begin_line": 330,
      "end_line": 360,
      "comment": "\n     * If the given value is a qualified name which refers\n     * a function or object literal, the node is returned. Otherwise,\n     * {@code null} is returned.\n     ",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 54)",
        "(line 333,col 7)-(line 335,col 7)",
        "(line 337,col 7)-(line 337,col 63)",
        "(line 338,col 7)-(line 340,col 7)",
        "(line 342,col 7)-(line 342,col 22)",
        "(line 344,col 7)-(line 353,col 7)",
        "(line 355,col 7)-(line 357,col 7)",
        "(line 359,col 7)-(line 359,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SymbolExport",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ExternExportsPass.Export"
      ],
      "begin_line": 366,
      "end_line": 382,
      "comment": "\n   * A symbol export.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.SymbolExport.SymbolExport(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 368,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 369,col 7)-(line 369,col 31)",
        "(line 371,col 7)-(line 371,col 54)",
        "(line 373,col 7)-(line 375,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.SymbolExport.getExportedPath()",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 7)-(line 380,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyExport",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ExternExportsPass.Export"
      ],
      "begin_line": 387,
      "end_line": 421,
      "comment": "\n   * A property export.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exportPath"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.PropertyExport.PropertyExport(java.lang.String, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 390,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 31)",
        "(line 393,col 7)-(line 393,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.PropertyExport.getExportedPath()",
      "begin_line": 396,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 72)",
        "(line 402,col 7)-(line 417,col 7)",
        "(line 419,col 7)-(line 419,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.ExternExportsPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 426,
      "end_line": 436,
      "comment": "\n   * Creates an instance.\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 40)",
        "(line 428,col 5)-(line 428,col 29)",
        "(line 429,col 5)-(line 429,col 43)",
        "(line 430,col 5)-(line 430,col 34)",
        "(line 431,col 5)-(line 431,col 47)",
        "(line 432,col 5)-(line 432,col 50)",
        "(line 433,col 5)-(line 433,col 41)",
        "(line 435,col 5)-(line 435,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.initExportMethods()",
      "begin_line": 438,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 53)",
        "(line 440,col 5)-(line 440,col 55)",
        "(line 445,col 5)-(line 445,col 65)",
        "(line 446,col 5)-(line 446,col 72)",
        "(line 447,col 5)-(line 447,col 76)",
        "(line 450,col 5)-(line 450,col 57)",
        "(line 451,col 5)-(line 451,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 456,col 5)-(line 456,col 53)",
        "(line 461,col 5)-(line 467,col 11)",
        "(line 469,col 5)-(line 469,col 27)",
        "(line 471,col 5)-(line 473,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Anonymous-39c823f4-571c-48bd-ac03-5aec71c6ab15.compare(com.google.javascript.jscomp.ExternExportsPass.Export, com.google.javascript.jscomp.ExternExportsPass.Export)",
      "begin_line": 463,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 465,col 13)-(line 465,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.getGeneratedExterns()",
      "begin_line": 479,
      "end_line": 486,
      "comment": "\n   * Returns the generated externs.\n   ",
      "child_ranges": [
        "(line 480,col 5)-(line 483,col 51)",
        "(line 485,col 5)-(line 485,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 488,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 516,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.handleSymbolExport(com.google.javascript.rhino.Node)",
      "begin_line": 519,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 522,col 5)-(line 524,col 5)",
        "(line 526,col 5)-(line 526,col 43)",
        "(line 527,col 5)-(line 527,col 38)",
        "(line 528,col 5)-(line 528,col 38)",
        "(line 532,col 5)-(line 534,col 5)",
        "(line 537,col 5)-(line 537,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.handlePropertyExport(com.google.javascript.rhino.Node)",
      "begin_line": 540,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 543,col 5)-(line 545,col 5)",
        "(line 547,col 5)-(line 547,col 43)",
        "(line 548,col 5)-(line 548,col 40)",
        "(line 549,col 5)-(line 549,col 39)",
        "(line 550,col 5)-(line 550,col 38)",
        "(line 554,col 5)-(line 556,col 5)",
        "(line 558,col 5)-(line 560,col 5)",
        "(line 563,col 5)-(line 566,col 38)"
      ]
    }
  ]
}