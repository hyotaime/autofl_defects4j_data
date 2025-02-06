{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/SeriesRenderingOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SeriesRenderingOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 139,
      "comment": "\r\n * Defines the tokens that indicate the rendering order for series in a\r\n * {@link org.jfree.chart.plot.XYPlot}.\r\n "
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
        "FORWARD"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": "\r\n     * Render series in the order 0, 1, 2, ..., N-1, where N is the number\r\n     * of series.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REVERSE"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": "\r\n     * Render series in the order N-1, N-2, ..., 2, 1, 0, where N is the\r\n     * number of series.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.SeriesRenderingOrder.SeriesRenderingOrder(java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SeriesRenderingOrder.toString()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SeriesRenderingOrder.equals(java.lang.Object)",
      "begin_line": 99,
      "end_line": 111,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SeriesRenderingOrder.hashCode()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.SeriesRenderingOrder.readResolve()",
      "begin_line": 129,
      "end_line": 137,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    }
  ]
}