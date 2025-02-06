{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/VariableMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 204,
      "comment": "\n * Stores the mapping from original variable name to new variable names.\n * @see RenameVars\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maps original source name to new name "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMap"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Maps new name to source name, lazily initialized "
    },
    {
      "type": "field",
      "varNames": [
        "SEPARATOR"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableMap.VariableMap(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.lookupNewName(java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n   * Given an original variable name, look up new name, may return null\n   * if it\u0027s not found.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.lookupSourceName(java.lang.String)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n   * Given a new variable name, lookup the source name, may return null\n   * if it\u0027s not found.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 21)",
        "(line 61,col 5)-(line 61,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.initReverseMap()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "\n   * Initializes the reverse map.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 74,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.getOriginalNameToNewNameMap()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n   * Returns an unmodifiable mapping from original names to new names.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.getNewNameToOriginalNameMap()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n   * Returns an unmodifiable mapping from new names to original names.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 21)",
        "(line 89,col 5)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.save(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n   * Saves the variable map to a file.\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.load(java.lang.String)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n   * Reads the variable map from a file written via {@link #save(String)}.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 108,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.toBytes()",
      "begin_line": 114,
      "end_line": 131,
      "comment": "\n   * Serializes the variable map to a byte array.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 61)",
        "(line 116,col 5)-(line 116,col 65)",
        "(line 117,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 130,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SPLITTER"
      ],
      "begin_line": 133,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.fromBytes(byte[])",
      "begin_line": 140,
      "end_line": 156,
      "comment": "\n   * Deserializes the variable map from a byte array returned by\n   * {@link #toBytes()}.\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 43)",
        "(line 144,col 5)-(line 144,col 70)",
        "(line 146,col 5)-(line 154,col 5)",
        "(line 155,col 5)-(line 155,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.escape(java.lang.String)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 161,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.findIndexOfChar(java.lang.String, char)",
      "begin_line": 164,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 29)",
        "(line 166,col 5)-(line 173,col 5)",
        "(line 174,col 5)-(line 174,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.unescape(java.lang.CharSequence)",
      "begin_line": 177,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 43)",
        "(line 179,col 5)-(line 179,col 29)",
        "(line 180,col 5)-(line 186,col 5)",
        "(line 187,col 5)-(line 187,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.fromMap(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n   * Initializes the variable map from an existing map.\n   * @param map The map to use from original names to generated names. It is\n   *   copied and changes to the specified map will not affect the returned\n   *   object.\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.toMap()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 15)"
      ]
    }
  ]
}