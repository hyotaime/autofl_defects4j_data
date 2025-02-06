{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/AxisCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisCollection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 144,
      "comment": "\r\n * A collection of axes that have been assigned to the TOP, BOTTOM, LEFT or \r\n * RIGHT of a chart.  This class is used internally by JFreeChart, you won\u0027t\r\n * normally need to use it yourself.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "axesAtTop"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The axes that need to be drawn at the top of the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "axesAtBottom"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The axes that need to be drawn at the bottom of the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "axesAtLeft"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The axes that need to be drawn at the left of the plot area. "
    },
    {
      "type": "field",
      "varNames": [
        "axesAtRight"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The axes that need to be drawn at the right of the plot area. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.AxisCollection.AxisCollection()",
      "begin_line": 69,
      "end_line": 74,
      "comment": "\r\n     * Creates a new empty collection.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 51)",
        "(line 71,col 9)-(line 71,col 54)",
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisCollection.getAxesAtTop()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns a list of the axes (if any) that need to be drawn at the top of \r\n     * the plot area.\r\n     * \r\n     * @return A list of axes.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisCollection.getAxesAtBottom()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n    * Returns a list of the axes (if any) that need to be drawn at the bottom \r\n    * of the plot area.\r\n    * \r\n    * @return A list of axes.\r\n    ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisCollection.getAxesAtLeft()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns a list of the axes (if any) that need to be drawn at the left \r\n     * of the plot area.\r\n     * \r\n     * @return A list of axes.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisCollection.getAxesAtRight()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n    * Returns a list of the axes (if any) that need to be drawn at the right \r\n    * of the plot area.\r\n    * \r\n    * @return A list of axes.\r\n    ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisCollection.add(org.jfree.chart.axis.Axis, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 123,
      "end_line": 142,
      "comment": "\r\n     * Adds an axis to the collection.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge of the plot that the axis should be drawn on \r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 141,col 9)"
      ]
    }
  ]
}