{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/io/IOUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 71,
      "comment": "\n * IO utils. A bit of reinventing the wheel but we don\u0027t want extra dependencies at this stage and we want to be java.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.io.IOUtil.writeText(java.lang.String, java.io.File)",
      "begin_line": 18,
      "end_line": 28,
      "comment": "\n     * Writes text to file\n     ",
      "child_ranges": [
        "(line 19,col 9)-(line 19,col 30)",
        "(line 20,col 9)-(line 27,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.io.IOUtil.readLines(java.io.InputStream)",
      "begin_line": 30,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 52)",
        "(line 32,col 9)-(line 32,col 73)",
        "(line 33,col 9)-(line 33,col 20)",
        "(line 34,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 41,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.io.IOUtil.closeQuietly(java.io.Closeable)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Closes the target. Does nothing when target is null. Is silent.\n     *\n     * @param closeable the target, may be null\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 54,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.io.IOUtil.close(java.io.Closeable)",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * Closes the target. Does nothing when target is null. Is not silent and exceptions are rethrown.\n     *\n     * @param closeable the target, may be null\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 69,col 9)"
      ]
    }
  ]
}