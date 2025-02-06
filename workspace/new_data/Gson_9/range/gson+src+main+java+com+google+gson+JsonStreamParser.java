{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/JsonStreamParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonStreamParser",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.gson.JsonElement\u003e"
      ],
      "begin_line": 52,
      "end_line": 122,
      "comment": "\n * A streaming parser that allows reading of multiple {@link JsonElement}s from the specified reader\n * asynchronously.\n * \n * \u003cp\u003eThis class is conditionally thread-safe (see Item 70, Effective Java second edition). To\n * properly use this class across multiple threads, you will need to add some external\n * synchronization.  For example:\n * \n * \u003cpre\u003e\n * JsonStreamParser parser \u003d new JsonStreamParser(\"[\u0027first\u0027] {\u0027second\u0027:10} \u0027third\u0027\");\n * JsonElement element;\n * synchronized (parser) {  // synchronize on an object shared by threads\n *   if (parser.hasNext()) {\n *     element \u003d parser.next();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n * @since 1.4\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lock"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonStreamParser.JsonStreamParser(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n   * @param json The string containing JSON elements concatenated to each other.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.JsonStreamParser.JsonStreamParser(java.io.Reader)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n   * @param reader The data stream containing JSON elements concatenated to each other.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 36)",
        "(line 70,col 5)-(line 70,col 28)",
        "(line 71,col 5)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonStreamParser.next()",
      "begin_line": 81,
      "end_line": 95,
      "comment": "\n   * Returns the next available {@link JsonElement} on the reader. Null if none available.\n   * \n   * @return the next available {@link JsonElement} on the reader. Null if none available.\n   * @throws JsonParseException if the incoming stream is malformed JSON.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 84,col 5)",
        "(line 86,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonStreamParser.hasNext()",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\n   * Returns true if a {@link JsonElement} is available on the input for consumption\n   * @return true if a {@link JsonElement} is available on the input, false otherwise\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 111,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.JsonStreamParser.remove()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n   * This optional {@link Iterator} method is not relevant for stream parsing and hence is not\n   * implemented.\n   * @since 1.4\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 46)"
      ]
    }
  ]
}