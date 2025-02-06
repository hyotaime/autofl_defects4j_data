{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/DatasetRenderingOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetRenderingOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 141,
      "comment": "\r\n * Defines the tokens that indicate the rendering order for datasets in a\r\n * {@link org.jfree.chart.plot.CategoryPlot} or an\r\n * {@link org.jfree.chart.plot.XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FORWARD"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": "\r\n     * Render datasets in the order 0, 1, 2, ..., N-1, where N is the number\r\n     * of datasets.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "REVERSE"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": "\r\n     * Render datasets in the order N-1, N-2, ..., 2, 1, 0, where N is the\r\n     * number of datasets.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.DatasetRenderingOrder.DatasetRenderingOrder(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DatasetRenderingOrder.toString()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DatasetRenderingOrder.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 113,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DatasetRenderingOrder.hashCode()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DatasetRenderingOrder.readResolve()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    }
  ]
}