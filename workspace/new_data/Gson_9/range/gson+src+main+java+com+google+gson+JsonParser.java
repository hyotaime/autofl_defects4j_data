{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 93,
      "comment": "\r\n * A parser to parse Json into a parse tree of {@link JsonElement}s\r\n *\r\n * @author Inderjeet Singh\r\n * @author Joel Leitch\r\n * @since 1.3\r\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonParser.parse(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\r\n   * Parses the specified JSON string into a parse tree\r\n   *\r\n   * @param json JSON text\r\n   * @return a parse tree of {@link JsonElement}s corresponding to the specified JSON\r\n   * @throws JsonParseException if the specified text is not valid JSON\r\n   * @since 1.3\r\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonParser.parse(java.io.Reader)",
      "begin_line": 56,
      "end_line": 71,
      "comment": "\r\n   * Parses the specified JSON string into a parse tree\r\n   *\r\n   * @param json JSON text\r\n   * @return a parse tree of {@link JsonElement}s corresponding to the specified JSON\r\n   * @throws JsonParseException if the specified text is not valid JSON\r\n   * @since 1.3\r\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 70,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonParser.parse(com.google.gson.stream.JsonReader)",
      "begin_line": 80,
      "end_line": 92,
      "comment": "\r\n   * Returns the next value from the JSON stream as a parse tree.\r\n   *\r\n   * @throws JsonParseException if there is an IOException or if the specified\r\n   *     text is not valid JSON\r\n   * @since 1.6\r\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 39)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 91,col 5)"
      ]
    }
  ]
}