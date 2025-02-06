{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/CompositeTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 249,
      "comment": "\r\n * A title that contains multiple titles within a {@link BlockContainer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\r\n     * The background paint.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "container"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A container for the individual titles. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.CompositeTitle.CompositeTitle()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Creates a new composite title with a default border arrangement.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.CompositeTitle.CompositeTitle(org.jfree.chart.block.BlockContainer)",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\r\n     * Creates a new title using the specified container.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.getBackgroundPaint()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\r\n     * Sets the background paint and sends a {@link TitleChangeEvent} to all\r\n     * registered listeners.  If you set this attribute to \u003ccode\u003enull\u003c/code\u003e,\r\n     * no background is painted (which makes the title background transparent).\r\n     *\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.getContainer()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the container holding the titles.\r\n     *\r\n     * @return The title container (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.setTitleContainer(org.jfree.chart.block.BlockContainer)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\r\n     * Sets the title container.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 80)",
        "(line 162,col 9)-(line 162,col 75)",
        "(line 163,col 9)-(line 164,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 187,
      "end_line": 197,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 32)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 190,col 9)-(line 190,col 32)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 33)",
        "(line 196,col 9)-(line 196,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 221,
      "comment": "\r\n     * Tests this title for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 36)",
        "(line 232,col 9)-(line 232,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.readObject(java.io.ObjectInputStream)",
      "begin_line": 243,
      "end_line": 247,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 246,col 65)"
      ]
    }
  ]
}