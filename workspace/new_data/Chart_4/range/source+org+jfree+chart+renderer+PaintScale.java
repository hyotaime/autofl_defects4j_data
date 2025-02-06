{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/PaintScale.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintScale",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 88,
      "comment": "\r\n * A source for \u003ccode\u003ePaint\u003c/code\u003e instances, used by the\r\n * {@link XYBlockRenderer}.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * NOTE: Classes that implement this interface should also implement\r\n * \u003ccode\u003ePublicCloneable\u003c/code\u003e and \u003ccode\u003eSerializable\u003c/code\u003e, so\r\n * that any renderer (or other object instance) that references an instance of\r\n * this interface can still be cloned or serialized.\r\n *\r\n * @since 1.0.4\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PaintScale.getLowerBound()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * Returns the lower bound for the scale.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PaintScale.getUpperBound()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * Returns the upper bound for the scale.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.PaintScale.getPaint(double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * Returns a \u003ccode\u003ePaint\u003c/code\u003e instance for the specified value.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return A \u003ccode\u003ePaint\u003c/code\u003e instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}