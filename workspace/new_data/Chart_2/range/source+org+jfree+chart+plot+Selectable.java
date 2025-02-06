{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/Selectable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Selectable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 101,
      "comment": "\n * An interface that should be implemented by a plot that supports mouse\n * selection of data items.\n *\n * @since 1.2.0\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Selectable.canSelectByPoint()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot supports selection by a point,\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Selectable.canSelectByRegion()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this plot supports selection by a region,\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Selectable.select(double, double, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Set the selection state for the data item(s) at the specified (x, y)\n     * coordinates in Java2D space.\n     *\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     * @param dataArea  the data area.\n     * @param source  the selection source (usually a chart panel, possibly\n     *         \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Selectable.select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 93,
      "end_line": 94,
      "comment": "\n     * Set the selection state for the data item(s) within the specified region\n     * in Java2D space.\n     *\n     * @param region  the region.\n     * @param dataArea  the data area.\n     * @param source  the selection source (usually a chart panel, possibly\n     *         \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Selectable.clearSelection()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Deselects all items.\n     ",
      "child_ranges": []
    }
  ]
}