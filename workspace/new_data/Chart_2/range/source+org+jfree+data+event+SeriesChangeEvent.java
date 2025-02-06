{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/event/SeriesChangeEvent.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesChangeEvent",
      "is_interface": false,
      "parent_types": [
        "java.util.EventObject",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 108,
      "comment": "\r\n * An event with details of a change to a series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\r\n     * Summary info about the change.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.event.SeriesChangeEvent.SeriesChangeEvent(java.lang.Object)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Constructs a new event.\r\n     *\r\n     * @param source  the source of the change event.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.event.SeriesChangeEvent.SeriesChangeEvent(java.lang.Object, org.jfree.data.general.SeriesChangeInfo)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\r\n     * Constructs a new change event.\r\n     *\r\n     * @param source  the event source.\r\n     * @param summary  a summary of the change (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)",
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.event.SeriesChangeEvent.getSummary()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns a summary of the change for this event.\r\n     *\r\n     * @return The change summary (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.event.SeriesChangeEvent.setSummary(org.jfree.data.general.SeriesChangeInfo)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Sets the change info for this event.\r\n     *\r\n     * @param summary  the info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    }
  ]
}