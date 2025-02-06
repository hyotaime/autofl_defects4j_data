{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/StandardBarPainter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardBarPainter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarPainter",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 226,
      "comment": "\r\n * An implementation of the {@link BarPainter} interface that preserves the\r\n * behaviour of bar painting that existed prior to the introduction of the\r\n * {@link BarPainter} interface.\r\n *\r\n * @see GradientBarPainter\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.StandardBarPainter()",
      "begin_line": 71,
      "end_line": 72,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.paintBar(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 86,
      "end_line": 111,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the item selected?\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 71)",
        "(line 91,col 9)-(line 91,col 76)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 96,col 21)",
        "(line 99,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.paintBarShadow(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 125,
      "end_line": 144,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     * @param pegShadow  peg the shadow to the base of the bar?\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 71)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 47)",
        "(line 142,col 9)-(line 142,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.createShadow(java.awt.geom.RectangularShape, double, double, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 157,
      "end_line": 196,
      "comment": "\r\n     * Creates a shadow for the bar.\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param xOffset  the x-offset for the shadow.\r\n     * @param yOffset  the y-offset for the shadow.\r\n     * @param base  the edge that is the base of the bar.\r\n     * @param pegShadow  peg the shadow to the base?\r\n     *\r\n     * @return A rectangle for the shadow.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 34)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 34)",
        "(line 163,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.equals(java.lang.Object)",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the obj (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StandardBarPainter.hashCode()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 22)",
        "(line 223,col 9)-(line 223,col 20)"
      ]
    }
  ]
}