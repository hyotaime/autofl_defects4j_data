{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/DrawingSupplier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DrawingSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 107,
      "comment": "\r\n * A supplier of \u003ccode\u003ePaint\u003c/code\u003e, \u003ccode\u003eStroke\u003c/code\u003e and \u003ccode\u003eShape\u003c/code\u003e\r\n * objects for use by plots and renderers.  By providing a central place for\r\n * obtaining these items, we can ensure that duplication is avoided.\r\n * \u003cp\u003e\r\n * To support the cloning of charts, classes that implement this interface \r\n * should also implement \u003ccode\u003ePublicCloneable\u003c/code\u003e.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextPaint()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\r\n     * Returns the next paint in a sequence maintained by the supplier.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextOutlinePaint()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Returns the next outline paint in a sequence maintained by the supplier.\r\n     *\r\n     * @return The paint.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextFillPaint()",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * Returns the next fill paint in a sequence maintained by the supplier.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextStroke()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\r\n     * Returns the next \u003ccode\u003eStroke\u003c/code\u003e object in a sequence maintained by\r\n     * the supplier.\r\n     *\r\n     * @return The stroke.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextOutlineStroke()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * Returns the next \u003ccode\u003eStroke\u003c/code\u003e object in a sequence maintained by\r\n     * the supplier.\r\n     *\r\n     * @return The stroke.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.DrawingSupplier.getNextShape()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * Returns the next \u003ccode\u003eShape\u003c/code\u003e object in a sequence maintained by\r\n     * the supplier.\r\n     *\r\n     * @return The shape.\r\n     ",
      "child_ranges": []
    }
  ]
}