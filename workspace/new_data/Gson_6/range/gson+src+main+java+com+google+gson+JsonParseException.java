{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/JsonParseException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonParseException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 32,
      "end_line": 64,
      "comment": "\n * This exception is raised if there is a serious issue that occurs during parsing of a Json\n * string.  One of the main usages for this class is for the Gson infrastructure.  If the incoming\n * Json is bad/malicious, an instance of this exception is raised.\n *\n * \u003cp\u003eThis exception is a {@link RuntimeException} because it is exposed to the client.  Using a\n * {@link RuntimeException} avoids bad coding practices on the client side where they catch the\n * exception and do nothing.  It is often the case that you want to blow up if there is a parsing\n * error (i.e. often clients do not know how to recover from a {@link JsonParseException}.\u003c/p\u003e\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonParseException.JsonParseException(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n   * Creates exception with the specified message. If you are wrapping another exception, consider\n   * using {@link #JsonParseException(String, Throwable)} instead.\n   *\n   * @param msg error message describing a possible cause of this exception.\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonParseException.JsonParseException(java.lang.String, java.lang.Throwable)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n   * Creates exception with the specified message and cause.\n   *\n   * @param msg error message describing what happened.\n   * @param cause root exception that caused this exception to be thrown.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonParseException.JsonParseException(java.lang.Throwable)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n   * Creates exception with the specified cause. Consider using\n   * {@link #JsonParseException(String, Throwable)} instead if you can describe what happened.\n   *\n   * @param cause root exception that caused this exception to be thrown.\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 17)"
      ]
    }
  ]
}