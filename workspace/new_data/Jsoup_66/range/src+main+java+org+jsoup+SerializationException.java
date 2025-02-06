{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/SerializationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 7,
      "end_line": 48,
      "comment": "\n * A SerializationException is raised whenever serialization of a DOM element fails. This exception usually wraps an\n * {@link java.io.IOException} that may be thrown due to an inaccessible output stream.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.SerializationException.SerializationException()",
      "begin_line": 11,
      "end_line": 13,
      "comment": "\n\t * Creates and initializes a new serialization exception with no error message and cause.\n\t ",
      "child_ranges": [
        "(line 12,col 3)-(line 12,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.SerializationException.SerializationException(java.lang.String)",
      "begin_line": 21,
      "end_line": 23,
      "comment": "\n\t * Creates and initializes a new serialization exception with the given error message and no cause.\n\t * \n\t * @param message\n\t *            the error message of the new serialization exception (may be \u003ccode\u003enull\u003c/code\u003e).\n\t ",
      "child_ranges": [
        "(line 22,col 3)-(line 22,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.SerializationException.SerializationException(java.lang.Throwable)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n\t * Creates and initializes a new serialization exception with the specified cause and an error message of\n     * \u003ccode\u003e(cause\u003d\u003dnull ? null : cause.toString())\u003c/code\u003e (which typically contains the class and error message of\n     * \u003ccode\u003ecause\u003c/code\u003e).\n\t * \n\t * @param cause\n\t *            the cause of the new serialization exception (may be \u003ccode\u003enull\u003c/code\u003e).\n\t ",
      "child_ranges": [
        "(line 34,col 3)-(line 34,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.SerializationException.SerializationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n\t * Creates and initializes a new serialization exception with the given error message and cause.\n\t * \n\t * @param message\n\t *            the error message of the new serialization exception.\n\t * @param cause\n\t *            the cause of the new serialization exception.\n\t ",
      "child_ranges": [
        "(line 46,col 3)-(line 46,col 24)"
      ]
    }
  ]
}