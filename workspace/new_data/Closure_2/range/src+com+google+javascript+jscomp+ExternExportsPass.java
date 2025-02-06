{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ExternExportsPass.java",
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
      "end_line": 562,
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
      "end_line": 357,
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
      "end_line": 224,
      "comment": "\n     * Given a function to export, create the empty function that\n     * will be put in the externs file. This extern function should have\n     * the same type as the original function and the same parameter\n     * name but no function body.\n     *\n     * We create a warning here if the the function to export is missing\n     * parameter or return types.\n     ",
      "child_ranges": [
        "(line 216,col 7)-(line 217,col 23)",
        "(line 218,col 7)-(line 218,col 76)",
        "(line 220,col 7)-(line 220,col 58)",
        "(line 221,col 7)-(line 221,col 61)",
        "(line 223,col 7)-(line 223,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.createExternObjectLit(com.google.javascript.rhino.Node)",
      "begin_line": 231,
      "end_line": 252,
      "comment": "\n     * Given an object literal to export, create an object lit with all its\n     * string properties. We don\u0027t care what the values of those properties\n     * are because they are not checked.\n     ",
      "child_ranges": [
        "(line 232,col 7)-(line 232,col 32)",
        "(line 233,col 7)-(line 233,col 51)",
        "(line 237,col 7)-(line 237,col 40)",
        "(line 239,col 7)-(line 239,col 20)",
        "(line 240,col 7)-(line 250,col 7)",
        "(line 251,col 7)-(line 251,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.checkForFunctionsWithUnknownTypes(com.google.javascript.rhino.Node)",
      "begin_line": 258,
      "end_line": 306,
      "comment": "\n     * Warn the user if there is an exported function for which a parameter\n     * or return type is unknown.\n     ",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 57)",
        "(line 261,col 7)-(line 262,col 59)",
        "(line 264,col 7)-(line 268,col 7)",
        "(line 273,col 7)-(line 273,col 64)",
        "(line 275,col 7)-(line 275,col 55)",
        "(line 278,col 7)-(line 281,col 7)",
        "(line 290,col 7)-(line 291,col 25)",
        "(line 293,col 7)-(line 294,col 25)",
        "(line 296,col 7)-(line 305,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.reportUnknownParameterType(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 308,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 309,col 7)-(line 312,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.reportUnknownReturnType(com.google.javascript.rhino.Node)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 316,col 7)-(line 318,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Export.getValue(com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 356,
      "comment": "\n     * If the given value is a qualified name which refers\n     * a function or object literal, the node is returned. Otherwise,\n     * {@code null} is returned.\n     ",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 54)",
        "(line 329,col 7)-(line 331,col 7)",
        "(line 333,col 7)-(line 333,col 63)",
        "(line 334,col 7)-(line 336,col 7)",
        "(line 338,col 7)-(line 338,col 22)",
        "(line 340,col 7)-(line 349,col 7)",
        "(line 351,col 7)-(line 353,col 7)",
        "(line 355,col 7)-(line 355,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SymbolExport",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ExternExportsPass.Export"
      ],
      "begin_line": 362,
      "end_line": 378,
      "comment": "\n   * A symbol export.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.SymbolExport.SymbolExport(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 364,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 365,col 7)-(line 365,col 31)",
        "(line 367,col 7)-(line 367,col 54)",
        "(line 369,col 7)-(line 371,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.SymbolExport.getExportedPath()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 7)-(line 376,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyExport",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ExternExportsPass.Export"
      ],
      "begin_line": 383,
      "end_line": 417,
      "comment": "\n   * A property export.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exportPath"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.PropertyExport.PropertyExport(java.lang.String, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 387,col 7)-(line 387,col 31)",
        "(line 389,col 7)-(line 389,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.PropertyExport.getExportedPath()",
      "begin_line": 392,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 72)",
        "(line 398,col 7)-(line 413,col 7)",
        "(line 415,col 7)-(line 415,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.ExternExportsPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 422,
      "end_line": 432,
      "comment": "\n   * Creates an instance.\n   ",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 40)",
        "(line 424,col 5)-(line 424,col 29)",
        "(line 425,col 5)-(line 425,col 43)",
        "(line 426,col 5)-(line 426,col 34)",
        "(line 427,col 5)-(line 427,col 47)",
        "(line 428,col 5)-(line 428,col 50)",
        "(line 429,col 5)-(line 429,col 41)",
        "(line 431,col 5)-(line 431,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.initExportMethods()",
      "begin_line": 434,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 53)",
        "(line 436,col 5)-(line 436,col 55)",
        "(line 441,col 5)-(line 441,col 65)",
        "(line 442,col 5)-(line 442,col 72)",
        "(line 443,col 5)-(line 443,col 76)",
        "(line 446,col 5)-(line 446,col 57)",
        "(line 447,col 5)-(line 447,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 450,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 452,col 5)-(line 452,col 53)",
        "(line 457,col 5)-(line 463,col 11)",
        "(line 465,col 5)-(line 465,col 27)",
        "(line 467,col 5)-(line 469,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.Anonymous-a0c6a3ef-8dfc-4b40-a565-aaa7f4d28c1a.compare(com.google.javascript.jscomp.ExternExportsPass.Export, com.google.javascript.jscomp.ExternExportsPass.Export)",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 13)-(line 461,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.getGeneratedExterns()",
      "begin_line": 475,
      "end_line": 480,
      "comment": "\n   * Returns the generated externs.\n   ",
      "child_ranges": [
        "(line 476,col 5)-(line 477,col 49)",
        "(line 479,col 5)-(line 479,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 482,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 484,col 5)-(line 510,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.handleSymbolExport(com.google.javascript.rhino.Node)",
      "begin_line": 513,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 518,col 5)",
        "(line 520,col 5)-(line 520,col 43)",
        "(line 521,col 5)-(line 521,col 38)",
        "(line 522,col 5)-(line 522,col 38)",
        "(line 526,col 5)-(line 528,col 5)",
        "(line 531,col 5)-(line 531,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExternExportsPass.handlePropertyExport(com.google.javascript.rhino.Node)",
      "begin_line": 534,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 537,col 5)-(line 539,col 5)",
        "(line 541,col 5)-(line 541,col 43)",
        "(line 542,col 5)-(line 542,col 40)",
        "(line 543,col 5)-(line 543,col 39)",
        "(line 544,col 5)-(line 544,col 38)",
        "(line 548,col 5)-(line 550,col 5)",
        "(line 552,col 5)-(line 554,col 5)",
        "(line 557,col 5)-(line 560,col 38)"
      ]
    }
  ]
}