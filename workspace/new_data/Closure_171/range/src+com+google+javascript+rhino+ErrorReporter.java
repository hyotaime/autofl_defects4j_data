{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/ErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ErrorReporter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Report a warning.\n     *\n     * The implementing class may choose to ignore the warning\n     * if it desires.\n     *\n     * @param message a String describing the warning\n     * @param sourceName a String describing the JavaScript source\n     * where the warning occurred; typically a filename or URL\n     * @param line the line number associated with the warning\n     * @param lineOffset the offset into lineSource where problem was detected\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.ErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Report an error.\n     *\n     * The implementing class is free to throw an exception if\n     * it desires.\n     *\n     * If execution has not yet begun, the JavaScript engine is\n     * free to find additional errors rather than terminating\n     * the translation. It will not execute a script that had\n     * errors, however.\n     *\n     * @param message a String describing the error\n     * @param sourceName a String describing the JavaScript source\n     * where the error occurred; typically a filename or URL\n     * @param line the line number associated with the error\n     * @param lineOffset the offset into lineSource where problem was detected\n     ",
      "child_ranges": []
    }
  ]
}