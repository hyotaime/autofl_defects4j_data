{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/parsing/Config.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Config",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 102,
      "comment": "\n * Configuration for the AST factory. Should be shared across AST creation\n * for all files of a compilation process.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "parseJsDocDocumentation"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n   * Whether to parse the descriptions of JsDoc comments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "isIdeMode"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n   * Whether we\u0027re in IDE mode.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotationNames"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n   * Recognized JSDoc annotations, mapped from their name to their internal\n   * representation.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "suppressionNames"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Recognized names in a {@code @suppress} tag.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "languageMode"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n   * Accept ECMAScript5 syntax, such as getter/setter.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Accept `const\u0027 keyword.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.Config.Config(java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, boolean, com.google.javascript.jscomp.parsing.Config.LanguageMode, boolean)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 69)",
        "(line 77,col 5)-(line 77,col 45)",
        "(line 78,col 5)-(line 78,col 45)",
        "(line 79,col 5)-(line 79,col 31)",
        "(line 80,col 5)-(line 80,col 37)",
        "(line 81,col 5)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.Config.buildAnnotationNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 88,
      "end_line": 101,
      "comment": "\n   * Create the annotation names from the user-specified\n   * annotation whitelist.\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 91,col 31)",
        "(line 92,col 5)-(line 92,col 63)",
        "(line 93,col 5)-(line 99,col 5)",
        "(line 100,col 5)-(line 100,col 37)"
      ]
    }
  ]
}