{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/StandardXYBarPainter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYBarPainter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYBarPainter",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 229,
      "comment": "\r\n * An implementation of the {@link XYBarPainter} interface that preserves the\r\n * behaviour of bar painting that existed prior to the introduction of the\r\n * {@link XYBarPainter} interface.\r\n *\r\n * @see GradientXYBarPainter\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.StandardXYBarPainter()",
      "begin_line": 69,
      "end_line": 70,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.paintBar(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYBarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 86,
      "end_line": 111,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the data item selected?\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     *\r\n     * @since 1.2.0\r\n     ",
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
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.paintBarShadow(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYBarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 128,
      "end_line": 147,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the data item selected?\r\n     * @param bar  the bar.\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     * @param pegShadow  peg the shadow to the base of the bar?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 71)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 143,col 62)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 145,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.createShadow(java.awt.geom.RectangularShape, double, double, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 160,
      "end_line": 199,
      "comment": "\r\n     * Creates a shadow for the bar.\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param xOffset  the x-offset for the shadow.\r\n     * @param yOffset  the y-offset for the shadow.\r\n     * @param base  the edge that is the base of the bar.\r\n     * @param pegShadow  peg the shadow to the base?\r\n     *\r\n     * @return A rectangle for the shadow.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 34)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 34)",
        "(line 165,col 9)-(line 165,col 34)",
        "(line 166,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.equals(java.lang.Object)",
      "begin_line": 208,
      "end_line": 216,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the obj (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StandardXYBarPainter.hashCode()",
      "begin_line": 223,
      "end_line": 227,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 22)",
        "(line 226,col 9)-(line 226,col 20)"
      ]
    }
  ]
}