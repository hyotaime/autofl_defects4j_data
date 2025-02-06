{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/DialShape.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialShape",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 137,
      "comment": "\r\n * Used to indicate the background shape for a \r\n * {@link org.jfree.chart.plot.MeterPlot}.\r\n "
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
        "CIRCLE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Circle. "
    },
    {
      "type": "field",
      "varNames": [
        "CHORD"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Chord. "
    },
    {
      "type": "field",
      "varNames": [
        "PIE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Pie. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.DialShape.DialShape(java.lang.String)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DialShape.toString()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DialShape.equals(java.lang.Object)",
      "begin_line": 94,
      "end_line": 106,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DialShape.hashCode()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DialShape.readResolve()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    }
  ]
}