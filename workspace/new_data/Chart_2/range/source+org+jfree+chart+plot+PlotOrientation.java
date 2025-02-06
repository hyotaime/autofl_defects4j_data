{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/PlotOrientation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PlotOrientation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 134,
      "comment": "\r\n * Used to indicate the orientation (horizontal or vertical) of a 2D plot.\r\n "
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
        "HORIZONTAL"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " For a plot where the range axis is horizontal. "
    },
    {
      "type": "field",
      "varNames": [
        "VERTICAL"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " For a plot where the range axis is vertical. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PlotOrientation.PlotOrientation(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotOrientation.toString()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotOrientation.equals(java.lang.Object)",
      "begin_line": 93,
      "end_line": 105,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotOrientation.hashCode()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PlotOrientation.readResolve()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    }
  ]
}