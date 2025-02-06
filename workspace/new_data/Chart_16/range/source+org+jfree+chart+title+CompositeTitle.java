{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/CompositeTitle.java",
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
      "begin_line": 60,
      "end_line": 179,
      "comment": "\r\n * A title that contains multiple titles within a {@link BlockContainer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "container"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A container for the individual titles. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.CompositeTitle.CompositeTitle()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Creates a new composite title with a default border arrangement.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.CompositeTitle.CompositeTitle(org.jfree.chart.block.BlockContainer)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\r\n     * Creates a new title using the specified container. \r\n     * \r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.getContainer()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the container holding the titles.\r\n     * \r\n     * @return The title container (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.setTitleContainer(org.jfree.chart.block.BlockContainer)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\r\n     * Sets the title container.\r\n     * \r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 80)",
        "(line 119,col 9)-(line 119,col 75)",
        "(line 120,col 9)-(line 123,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 32)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 23)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.CompositeTitle.equals(java.lang.Object)",
      "begin_line": 162,
      "end_line": 177,
      "comment": "\r\n     * Tests this title for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    }
  ]
}