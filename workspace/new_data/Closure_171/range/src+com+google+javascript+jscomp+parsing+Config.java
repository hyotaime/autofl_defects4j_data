{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/Config.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Config",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 103,
      "comment": "\n * Configuration for the AST factory. Should be shared across AST creation\n * for all files of a compilation process.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "parseJsDocDocumentation"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * Whether to parse the descriptions of JsDoc comments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "isIdeMode"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n   * Whether we\u0027re in IDE mode.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n   * Recognized JSDoc annotations, mapped from their name to their internal\n   * representation.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n   * Recognized names in a {@code @suppress} tag.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "languageMode"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * Accept ECMAScript5 syntax, such as getter/setter.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n   * Accept `const\u0027 keyword.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.Config.Config(java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean)",
      "begin_line": 74,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 69)",
        "(line 78,col 5)-(line 78,col 45)",
        "(line 79,col 5)-(line 79,col 45)",
        "(line 80,col 5)-(line 80,col 31)",
        "(line 81,col 5)-(line 81,col 37)",
        "(line 82,col 5)-(line 82,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.Config.buildAnnotationNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 89,
      "end_line": 102,
      "comment": "\n   * Create the annotation names from the user-specified\n   * annotation whitelist.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 31)",
        "(line 93,col 5)-(line 93,col 63)",
        "(line 94,col 5)-(line 100,col 5)",
        "(line 101,col 5)-(line 101,col 37)"
      ]
    }
  ]
}