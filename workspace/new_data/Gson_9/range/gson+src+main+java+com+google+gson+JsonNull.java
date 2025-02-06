{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonNull.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonNull",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonElement"
      ],
      "begin_line": 26,
      "end_line": 63,
      "comment": "\r\n * A class representing a Json {@code null} value.\r\n *\r\n * @author Inderjeet Singh\r\n * @author Joel Leitch\r\n * @since 1.2\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "\r\n   * singleton for JsonNull\r\n   *\r\n   * @since 1.8\r\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonNull.JsonNull()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\r\n   * Creates a new JsonNull object.\r\n   * Deprecated since Gson version 1.8. Use {@link #INSTANCE} instead\r\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonNull.deepCopy()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonNull.hashCode()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\r\n   * All instances of JsonNull have the same hash code since they are indistinguishable\r\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonNull.equals(java.lang.Object)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\r\n   * All instances of JsonNull are the same\r\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 54)"
      ]
    }
  ]
}