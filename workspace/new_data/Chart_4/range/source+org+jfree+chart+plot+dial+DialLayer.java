{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/DialLayer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialLayer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 118,
      "comment": "\n * A dial layer draws itself within a reference frame.  The view frame is a\n * subset of the reference frame, and defines the area that is actually\n * visible.\n * \u003cbr\u003e\u003cbr\u003e\n * Classes that implement this interface should be {@link Serializable},\n * otherwise chart serialization may fail.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.isVisible()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns a flag that indicates whether or not the layer is visible.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.addChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Registers a listener with this layer, so that it receives notification\n     * of changes to this layer.\n     *\n     * @param listener  the listener.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.removeChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Deregisters a listener, so that it no longer receives notification of\n     * changes to this layer.\n     *\n     * @param listener  the listener.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.hasListener(java.util.EventListener)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified listener is currently\n     * registered with the this layer.\n     *\n     * @param listener  the listener.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.isClippedToWindow()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the drawing should be clipped to the\n     * dial window (which is defined by the {@link DialFrame}), and\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialLayer.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 115,
      "end_line": 116,
      "comment": "\n     * Draws the content of this layer.\n     *\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (typically this should not be \u003ccode\u003enull\u003c/code\u003e,\n     *     but for a layer that doesn\u0027t need to reference the plot, it may\n     *     be permitted).\n     * @param frame  the reference frame for the dial\u0027s geometry\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).  This is typically larger than\n     *     the visible area of the dial (see the next parameter).\n     * @param view  the visible area for the dial (\u003ccode\u003enull\u003c/code\u003e not\n     *     permitted).\n     ",
      "child_ranges": []
    }
  ]
}