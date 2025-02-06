{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReplaceStrings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceStrings",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 50,
      "end_line": 499,
      "comment": "\n * Replaces JavaScript strings in the list of supplied methods with shortened\n * forms. Useful for replacing debug message such as: throw new\n * Error(\"Something bad happened\"); with generated codes like: throw new\n * Error(\"a\"); This makes the compiled JavaScript smaller and prevents us from\n * leaking details about the source code.\n *\n * Based in concept on the work by Jared Jacobs.\n "
    },
    {
      "type": "field",
      "varNames": [
        "BAD_REPLACEMENT_CONFIGURATION"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PLACEHOLDER_TOKEN"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeholderToken"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_ONE_MARKER"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_ALL_MARKER"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methods"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "results"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Config",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 86,
      "comment": "\n   * Describes a function to look for a which parameters to replace.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " classes."
    },
    {
      "type": "field",
      "varNames": [
        "parameter"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPLACE_ALL_VALUE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.Config.Config(java.lang.String, int)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 7)-(line 83,col 23)",
        "(line 84,col 7)-(line 84,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Result",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 91,
      "end_line": 108,
      "comment": "\n   * Describes a replacement that occurred.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "original"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " {@code placeholderToken}."
    },
    {
      "type": "field",
      "varNames": [
        "replacement"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacementLocations"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.Result.Result(java.lang.String, java.lang.String)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 31)",
        "(line 100,col 7)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.Result.addLocation(com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 106,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Location",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 111,
      "end_line": 120,
      "comment": " Represent a source location where a replacement occurred. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.Location.Location(java.lang.String, int, int)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 35)",
        "(line 117,col 7)-(line 117,col 23)",
        "(line 118,col 7)-(line 118,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.ReplaceStrings(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.util.List\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 134,
      "end_line": 155,
      "comment": "\n   * @param placeholderToken Separator to use between string parts. Used to replace\n   *     non-static string content.\n   * @param functionsToInspect A list of function configurations in the form of\n   *     function($,,,)\n   *   or\n   *     class.prototype.method($,,,)\n   * @param blacklisted A set of names that should not be used as replacement\n   *     strings.  Useful to prevent unwanted strings for appearing in the\n   *     final output.\n   * where \u0027$\u0027 is used to indicate which parameter should be replaced.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 29)",
        "(line 140,col 5)-(line 141,col 55)",
        "(line 142,col 5)-(line 142,col 47)",
        "(line 144,col 5)-(line 144,col 49)",
        "(line 145,col 5)-(line 150,col 5)",
        "(line 151,col 5)-(line 151,col 60)",
        "(line 154,col 5)-(line 154,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.initMapping(com.google.javascript.jscomp.VariableMap, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 80)",
        "(line 160,col 5)-(line 166,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "USED_RESULTS"
      ],
      "begin_line": 169,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.Anonymous-97f6865a-d7b0-4cde-bd86-021ab1750df3.apply(com.google.javascript.jscomp.ReplaceStrings.Result)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.getResult()",
      "begin_line": 179,
      "end_line": 182,
      "comment": " Get the list of all replacements performed.",
      "child_ranges": [
        "(line 180,col 5)-(line 181,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.getStringMap()",
      "begin_line": 185,
      "end_line": 193,
      "comment": " Get the list of replaces as a VariableMap",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 70)",
        "(line 187,col 5)-(line 189,col 5)",
        "(line 191,col 5)-(line 191,col 57)",
        "(line 192,col 5)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 200,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 239,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.findMatching(java.lang.String)",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n   * @param name The function name to find.\n   * @return The Config object for the name or null if no match was found.\n   ",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 40)",
        "(line 248,col 5)-(line 251,col 5)",
        "(line 252,col 5)-(line 252,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.findMatchingClass(com.google.javascript.rhino.jstype.JSType, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 259,
      "end_line": 272,
      "comment": "\n   * @return The Config object for the class match the specified type or null\n   * if no match was found.\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.doSubstitutions(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReplaceStrings.Config, com.google.javascript.rhino.Node)",
      "begin_line": 277,
      "end_line": 294,
      "comment": "\n   * Replace the parameters specified in the config, if possible.\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 279,col 33)",
        "(line 281,col 5)-(line 293,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.replaceExpression(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 305,
      "end_line": 349,
      "comment": "\n   * Replaces a string expression with a short encoded string expression.\n   *\n   * @param t The traversal\n   * @param expr The expression node\n   * @param parent The expression node\u0027s parent\n   * @return The replacement node (or the original expression if no replacement\n   *         is made)\n   ",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 21)",
        "(line 307,col 5)-(line 307,col 22)",
        "(line 308,col 5)-(line 308,col 29)",
        "(line 309,col 5)-(line 340,col 5)",
        "(line 342,col 5)-(line 342,col 36)",
        "(line 343,col 5)-(line 343,col 50)",
        "(line 344,col 5)-(line 344,col 33)",
        "(line 346,col 5)-(line 346,col 43)",
        "(line 347,col 5)-(line 347,col 32)",
        "(line 348,col 5)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.getReplacement(java.lang.String)",
      "begin_line": 354,
      "end_line": 364,
      "comment": "\n   * Get a replacement string for the provide key text.\n   ",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 37)",
        "(line 356,col 5)-(line 358,col 5)",
        "(line 360,col 5)-(line 360,col 58)",
        "(line 361,col 5)-(line 361,col 42)",
        "(line 362,col 5)-(line 362,col 29)",
        "(line 363,col 5)-(line 363,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.recordReplacement(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 369,
      "end_line": 374,
      "comment": "\n   * Record the location the replacement was made.\n   ",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 37)",
        "(line 371,col 5)-(line 371,col 45)",
        "(line 373,col 5)-(line 373,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.buildReplacement(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.StringBuilder)",
      "begin_line": 389,
      "end_line": 405,
      "comment": "\n   * Builds a replacement abstract syntax tree for the string expression {@code\n   * expr}. Appends any string literal values that are encountered to\n   * {@code keyBuilder}, to build the expression\u0027s replacement key.\n   *\n   * @param expr A JS expression that evaluates to a string value\n   * @param prefix The JS expression to which {@code expr}\u0027s replacement is\n   *        logically being concatenated. It is a partial solution to the\n   *        problem at hand and will either be this method\u0027s return value or a\n   *        descendant of it.\n   * @param keyBuilder A builder of the string expression\u0027s replacement key\n   * @return The abstract syntax tree that should replace {@code expr}\n   ",
      "child_ranges": [
        "(line 391,col 5)-(line 404,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.getMethodFromDeclarationName(java.lang.String)",
      "begin_line": 410,
      "end_line": 417,
      "comment": "\n   * From a provide name extract the method name.\n   ",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 66)",
        "(line 412,col 5)-(line 412,col 69)",
        "(line 413,col 5)-(line 415,col 5)",
        "(line 416,col 5)-(line 416,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.getClassFromDeclarationName(java.lang.String)",
      "begin_line": 422,
      "end_line": 429,
      "comment": "\n   * From a provide name extract the class name.\n   ",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 66)",
        "(line 424,col 5)-(line 424,col 69)",
        "(line 425,col 5)-(line 427,col 5)",
        "(line 428,col 5)-(line 428,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.parseConfiguration(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 435,
      "end_line": 445,
      "comment": "\n   * Build the data structures need by this pass from the provided\n   * list of functions and methods.\n   ",
      "child_ranges": [
        "(line 436,col 5)-(line 444,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.parseConfiguration(java.lang.String)",
      "begin_line": 456,
      "end_line": 487,
      "comment": "\n   * Convert the provide string into a Config.  The string can be a static function:\n   *    foo(,,?)\n   *    foo.bar(?)\n   * or a class method:\n   *    foo.prototype.bar(?)\n   * And is allowed to either replace all parameters using \"*\" or one parameter \"?\".\n   * \",\" is used as a placeholder for ignored parameters.\n   ",
      "child_ranges": [
        "(line 458,col 5)-(line 458,col 38)",
        "(line 459,col 5)-(line 459,col 37)",
        "(line 462,col 5)-(line 462,col 56)",
        "(line 464,col 5)-(line 464,col 47)",
        "(line 465,col 5)-(line 465,col 56)",
        "(line 467,col 5)-(line 467,col 23)",
        "(line 468,col 5)-(line 468,col 34)",
        "(line 469,col 5)-(line 469,col 39)",
        "(line 470,col 5)-(line 483,col 5)",
        "(line 485,col 5)-(line 485,col 57)",
        "(line 486,col 5)-(line 486,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceStrings.createNameGenerator(java.lang.Iterable\u003cjava.lang.String\u003e)",
      "begin_line": 493,
      "end_line": 498,
      "comment": "\n   * Use a name generate to create names so the names overlap with the names\n   * used for variable and properties.\n   ",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 33)",
        "(line 495,col 5)-(line 495,col 45)",
        "(line 496,col 5)-(line 497,col 66)"
      ]
    }
  ]
}