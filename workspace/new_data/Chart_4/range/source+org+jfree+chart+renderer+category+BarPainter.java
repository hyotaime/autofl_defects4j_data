{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/BarPainter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BarPainter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 64,
      "end_line": 97,
      "comment": "\r\n * The interface for plugin painter for the {@link BarRenderer} class.  When\r\n * developing a class that implements this interface, bear in mind the\r\n * following:\r\n * \u003cul\u003e\r\n * \u003cli\u003ethe \u003ccode\u003eequals(Object)\u003c/code\u003e method should be overridden;\u003c/li\u003e\r\n * \u003cli\u003einstances of the class should be immutable OR implement the\r\n *     \u003ccode\u003ePublicCloneable\u003c/code\u003e interface, so that a renderer using the\r\n *     painter can be cloned reliably;\r\n * \u003cli\u003ethe class should be \u003ccode\u003eSerializable\u003c/code\u003e, otherwise chart\r\n *     serialization will not be supported.\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n *\r\n * @since 1.2.0\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarPainter.paintBar(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Paints a single bar on behalf of a renderer.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index for the item.\r\n     * @param column  the column index for the item.\r\n     * @param selected  is the item selected?\r\n     * @param bar  the bounds for the bar.\r\n     * @param base  the base of the bar.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.BarPainter.paintBarShadow(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Paints the shadow for a single bar on behalf of a renderer.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index for the item.\r\n     * @param column  the column index for the item.\r\n     * @param selected  is the item selected?\r\n     * @param bar  the bounds for the bar.\r\n     * @param base  the base of the bar.\r\n     * @param pegShadow  peg the shadow to the base of the bar?\r\n     ",
      "child_ranges": []
    }
  ]
}