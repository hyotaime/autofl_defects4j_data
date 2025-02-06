{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/VariableMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableMap",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 209,
      "comment": "\n * Stores the mapping from original variable name to new variable names.\n * @see RenameVars\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maps original source name to new name "
    },
    {
      "type": "field",
      "varNames": [
        "reverseMap"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Maps new name to source name, lazily initialized "
    },
    {
      "type": "field",
      "varNames": [
        "SEPARATOR"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableMap.VariableMap(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.lookupNewName(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Given an original variable name, look up new name, may return null\n   * if it\u0027s not found.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.lookupSourceName(java.lang.String)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n   * Given a new variable name, lookup the source name, may return null\n   * if it\u0027s not found.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 21)",
        "(line 62,col 5)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.initReverseMap()",
      "begin_line": 68,
      "end_line": 76,
      "comment": "\n   * Initializes the reverse map.\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.getOriginalNameToNewNameMap()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n   * Returns an unmodifiable mapping from original names to new names.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.getNewNameToOriginalNameMap()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n   * Returns an unmodifiable mapping from new names to original names.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 21)",
        "(line 90,col 5)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.save(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n   * Saves the variable map to a file.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.load(java.lang.String)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n   * Reads the variable map from a file written via {@link #save(String)}.\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 109,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.toBytes()",
      "begin_line": 115,
      "end_line": 132,
      "comment": "\n   * Serializes the variable map to a byte array.\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 61)",
        "(line 117,col 5)-(line 117,col 65)",
        "(line 118,col 5)-(line 130,col 5)",
        "(line 131,col 5)-(line 131,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.fromBytes(byte[])",
      "begin_line": 138,
      "end_line": 161,
      "comment": "\n   * Deserializes the variable map from a byte array returned by\n   * {@link #toBytes()}.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 27)",
        "(line 140,col 5)-(line 147,col 5)",
        "(line 149,col 5)-(line 149,col 70)",
        "(line 151,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.escape(java.lang.String)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 166,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.findIndexOfChar(java.lang.String, char)",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 29)",
        "(line 171,col 5)-(line 178,col 5)",
        "(line 179,col 5)-(line 179,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.unescape(java.lang.CharSequence)",
      "begin_line": 182,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 43)",
        "(line 184,col 5)-(line 184,col 29)",
        "(line 185,col 5)-(line 191,col 5)",
        "(line 192,col 5)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.fromMap(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n   * Initializes the variable map from an existing map.\n   * @param map The map to use from original names to generated names. It is\n   *   copied and changes to the specified map will not affect the returned\n   *   object.\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableMap.toMap()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 15)"
      ]
    }
  ]
}