{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 148,
      "comment": "\n * A simple class for generating unique JavaScript variable/property names.\n *\n * \u003cp\u003eThis class is not thread safe.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_CHAR"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": " Generate short name with this first character "
    },
    {
      "type": "field",
      "varNames": [
        "NONFIRST_CHAR"
      ],
      "begin_line": 38,
      "end_line": 40,
      "comment": " These appear after after the first character "
    },
    {
      "type": "field",
      "varNames": [
        "reservedNames"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameCount"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstChars"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nonFirstChars"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameGenerator.NameGenerator(java.util.Set\u003cjava.lang.String\u003e, java.lang.String, char[])",
      "begin_line": 59,
      "end_line": 69,
      "comment": "\n   * Creates a NameGenerator.\n   *\n   * @param reservedNames set of names that are reserved; generated names will\n   *   not include these names. This set is referenced rather than copied,\n   *   so changes to the set will be reflected in how names are generated.\n   * @param prefix all generated names begin with this prefix.\n   * @param reservedCharacters If specified these characters won\u0027t be used in\n   *   generated names\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 39)",
        "(line 62,col 5)-(line 62,col 25)",
        "(line 65,col 5)-(line 65,col 72)",
        "(line 66,col 5)-(line 66,col 78)",
        "(line 68,col 5)-(line 68,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.reserveCharacters(char[], char[])",
      "begin_line": 78,
      "end_line": 87,
      "comment": "\n   * Provides the array of available characters based on the specified arrays.\n   * @param chars The list of characters that are legal\n   * @param reservedCharacters The characters that should not be used\n   * @return An array of characters to use. Will return the chars array if\n   *    reservedCharacters is null or empty, otherwise creates a new array.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 81,col 5)",
        "(line 82,col 5)-(line 82,col 72)",
        "(line 83,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 86,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.checkPrefix(java.lang.String)",
      "begin_line": 90,
      "end_line": 105,
      "comment": " Validates a name prefix. ",
      "child_ranges": [
        "(line 91,col 5)-(line 104,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.contains(char[], char)",
      "begin_line": 107,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.generateNextName()",
      "begin_line": 119,
      "end_line": 147,
      "comment": "\n   * Generates the next short name.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 146,col 5)"
      ]
    }
  ]
}