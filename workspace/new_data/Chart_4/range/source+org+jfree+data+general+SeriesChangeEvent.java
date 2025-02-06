{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/SeriesChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesChangeEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 107,
      "comment": "\r\n * An event with details of a change to a series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * Summary info about the change.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SeriesChangeEvent.SeriesChangeEvent(java.lang.Object)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Constructs a new event.\r\n     *\r\n     * @param source  the source of the change event.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SeriesChangeEvent.SeriesChangeEvent(java.lang.Object, org.jfree.data.general.SeriesChangeInfo)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\r\n     * Constructs a new change event.\r\n     *\r\n     * @param source  the event source.\r\n     * @param summary  a summary of the change (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)",
        "(line 82,col 9)-(line 82,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeEvent.getSummary()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns a summary of the change for this event.\r\n     *\r\n     * @return The change summary (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SeriesChangeEvent.setSummary(org.jfree.data.general.SeriesChangeInfo)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Sets the change info for this event.\r\n     *\r\n     * @param summary  the info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)"
      ]
    }
  ]
}