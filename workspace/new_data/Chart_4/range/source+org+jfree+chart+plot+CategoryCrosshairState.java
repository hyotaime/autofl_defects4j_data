{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/CategoryCrosshairState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryCrosshairState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.CrosshairState"
      ],
      "begin_line": 56,
      "end_line": 181,
      "comment": "\r\n * Represents state information for the crosshairs in a {@link CategoryPlot}.\r\n * An instance of this class is created at the start of the rendering process,\r\n * and updated as each data item is rendered.  At the end of the rendering\r\n * process, this class holds the row key, column key and value for the\r\n * crosshair location.\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "rowKey"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * The row key for the crosshair point.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columnKey"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * The column key for the crosshair point.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.CategoryCrosshairState()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.getRowKey()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the row key.\r\n     *\r\n     * @return The row key.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.setRowKey(java.lang.Comparable)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Sets the row key.\r\n     *\r\n     * @param key  the row key.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.getColumnKey()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the column key.\r\n     *\r\n     * @return The column key.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.setColumnKey(java.lang.Comparable)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Sets the column key.\r\n     *\r\n     * @param key  the key.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.updateCrosshairPoint(java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 124,
      "end_line": 149,
      "comment": "\r\n     * Evaluates a data point from a {@link CategoryItemRenderer} and if it is\r\n     * the closest to the anchor point it becomes the new crosshair point.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param value  y coordinate (measured against the range axis).\r\n     * @param datasetIndex  the dataset index for this point.\r\n     * @param transX  x translated into Java2D space.\r\n     * @param transY  y translated into Java2D space.\r\n     * @param orientation  the plot orientation.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 37)",
        "(line 129,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryCrosshairState.updateCrosshairX(java.lang.Comparable, java.lang.Comparable, int, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 161,
      "end_line": 179,
      "comment": "\r\n     * Updates only the crosshair row and column keys (this is for the case\r\n     * where the range crosshair does NOT lock onto the nearest data value).\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param datasetIndex  the dataset axis index.\r\n     * @param transX  the translated x-value.\r\n     * @param orientation  the plot orientation.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 177,col 9)"
      ]
    }
  ]
}