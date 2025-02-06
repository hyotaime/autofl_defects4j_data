{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonSyntaxException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonSyntaxException",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonParseException"
      ],
      "begin_line": 25,
      "end_line": 47,
      "comment": "\n * This exception is raised when Gson attempts to read (or write) a malformed\n * JSON element.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonSyntaxException.JsonSyntaxException(java.lang.String)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 5)-(line 30,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonSyntaxException.JsonSyntaxException(java.lang.String, java.lang.Throwable)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonSyntaxException.JsonSyntaxException(java.lang.Throwable)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n   * Creates exception with the specified cause. Consider using\n   * {@link #JsonSyntaxException(String, Throwable)} instead if you can\n   * describe what actually happened.\n   *\n   * @param cause root exception that caused this exception to be thrown.\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 17)"
      ]
    }
  ]
}