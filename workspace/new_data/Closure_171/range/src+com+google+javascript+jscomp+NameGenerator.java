{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NameGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 247,
      "comment": "\n * A simple class for generating unique JavaScript variable/property names.\n *\n * \u003cp\u003eThis class is not thread safe.\n *\n "
    },
    {
      "type": "class_interface",
      "name": "CharPriority",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003ccom.google.javascript.jscomp.NameGenerator.CharPriority\u003e"
      ],
      "begin_line": 42,
      "end_line": 66,
      "comment": "\n   * Represents a char that can be used in renaming as well as how often\n   * that char appears in the generated code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "occurance"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " When that happens, the \u0027natural\u0027 order prevails."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameGenerator.CharPriority.CharPriority(char, int)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 7)-(line 50,col 23)",
        "(line 51,col 7)-(line 51,col 25)",
        "(line 52,col 7)-(line 52,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.CharPriority.compareTo(com.google.javascript.jscomp.NameGenerator.CharPriority)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 52)",
        "(line 59,col 7)-(line 61,col 7)",
        "(line 63,col 7)-(line 63,col 40)",
        "(line 64,col 7)-(line 64,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "priorityLookupMap"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " a problem."
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_CHAR"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": " Generate short name with this first character "
    },
    {
      "type": "field",
      "varNames": [
        "NONFIRST_CHAR"
      ],
      "begin_line": 85,
      "end_line": 87,
      "comment": " These appear after after the first character "
    },
    {
      "type": "field",
      "varNames": [
        "reservedNames"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameCount"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstChars"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nonFirstChars"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameGenerator.NameGenerator(java.util.Set\u003cjava.lang.String\u003e, java.lang.String, char[])",
      "begin_line": 106,
      "end_line": 125,
      "comment": "\n   * Creates a NameGenerator.\n   *\n   * @param reservedNames set of names that are reserved; generated names will\n   *   not include these names. This set is referenced rather than copied,\n   *   so changes to the set will be reflected in how names are generated.\n   * @param prefix all generated names begin with this prefix.\n   * @param reservedCharacters If specified these characters won\u0027t be used in\n   *   generated names\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 39)",
        "(line 109,col 5)-(line 109,col 25)",
        "(line 111,col 5)-(line 112,col 30)",
        "(line 114,col 5)-(line 114,col 18)",
        "(line 115,col 5)-(line 118,col 5)",
        "(line 121,col 5)-(line 121,col 72)",
        "(line 122,col 5)-(line 122,col 78)",
        "(line 124,col 5)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.restartNaming()",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n   * Restart the name generation. Re-calculate how characters are prioritized\n   * based on how often the they appear in the final output.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 28)",
        "(line 133,col 5)-(line 133,col 31)",
        "(line 134,col 5)-(line 134,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.favors(java.lang.CharSequence)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n   * Increase the prioritization of all the chars in a String. This information\n   * is not used until {@link #restartNaming()} is called. A compiler would be\n   * able to generate names while changing the prioritization of the name\n   * generator for the \u003cb\u003enext\u003c/b\u003e pass.\n   ",
      "child_ranges": [
        "(line 144,col 5)-(line 149,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.reserveCharacters(char[], char[])",
      "begin_line": 159,
      "end_line": 178,
      "comment": "\n   * Provides the array of available characters based on the specified arrays.\n   * @param chars The list of characters that are legal\n   * @param reservedCharacters The characters that should not be used\n   * @return An array of characters to use. Will return the chars array if\n   *    reservedCharacters is null or empty, otherwise creates a new array.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 166,col 5)",
        "(line 167,col 5)-(line 167,col 72)",
        "(line 168,col 5)-(line 170,col 5)",
        "(line 172,col 5)-(line 172,col 61)",
        "(line 173,col 5)-(line 173,col 18)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 177,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.checkPrefix(java.lang.String)",
      "begin_line": 181,
      "end_line": 204,
      "comment": " Validates a name prefix. ",
      "child_ranges": [
        "(line 182,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.contains(com.google.javascript.jscomp.NameGenerator.CharPriority[], char)",
      "begin_line": 206,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 212,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameGenerator.generateNextName()",
      "begin_line": 218,
      "end_line": 246,
      "comment": "\n   * Generates the next short name.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 245,col 5)"
      ]
    }
  ]
}