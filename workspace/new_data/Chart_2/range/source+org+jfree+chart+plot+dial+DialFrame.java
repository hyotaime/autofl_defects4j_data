{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/DialFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialFrame",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.plot.dial.DialLayer"
      ],
      "begin_line": 57,
      "end_line": 70,
      "comment": "\n * A dial frame is the face plate for a dial plot - it is always drawn last.\n * JFreeChart includes a couple of implementations of this interface\n * ({@link StandardDialFrame} and {@link ArcDialFrame}).\n * \u003cbr\u003e\u003cbr\u003e\n * Classes that implement this interface should be {@link Serializable},\n * otherwise chart serialization may fail.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialFrame.getWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Returns the shape of the viewing window for the dial, or\n     * \u003ccode\u003enull\u003c/code\u003e if the dial is completely open.  Other layers in the\n     * plot will rely on their drawing to be clipped within this window.\n     *\n     * @param frame  the reference frame for the dial.\n     *\n     * @return The window.\n     ",
      "child_ranges": []
    }
  ]
}