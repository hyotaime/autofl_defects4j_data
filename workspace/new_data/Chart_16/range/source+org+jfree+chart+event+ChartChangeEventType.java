{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/event/ChartChangeEventType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartChangeEventType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 138,
      "comment": "\r\n * Defines tokens used to indicate an event type.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "GENERAL"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " GENERAL. "
    },
    {
      "type": "field",
      "varNames": [
        "NEW_DATASET"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " NEW_DATASET. "
    },
    {
      "type": "field",
      "varNames": [
        "DATASET_UPDATED"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " DATASET_UPDATED. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.event.ChartChangeEventType.ChartChangeEventType(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEventType.toString()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEventType.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 107,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 63)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEventType.hashCode()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.event.ChartChangeEventType.readResolve()",
      "begin_line": 125,
      "end_line": 136,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    }
  ]
}