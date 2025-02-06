{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/BlockBorder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockBorder",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.BlockFrame",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 244,
      "comment": "\r\n * A border for a block.  This class is immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " An empty border. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The space reserved for the border. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The border color. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockBorder.BlockBorder()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Creates a default border.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockBorder.BlockBorder(java.awt.Paint)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Creates a new border with the specified color.\r\n     * \r\n     * @param paint  the color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockBorder.BlockBorder(double, double, double, double)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Creates a new border with the specified line widths (in black).\r\n     * \r\n     * @param top  the width of the top border.\r\n     * @param left  the width of the left border.\r\n     * @param bottom  the width of the bottom border.\r\n     * @param right  the width of the right border.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockBorder.BlockBorder(double, double, double, double, java.awt.Paint)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\r\n     * Creates a new border with the specified line widths (in black).\r\n     * \r\n     * @param top  the width of the top border.\r\n     * @param left  the width of the left border.\r\n     * @param bottom  the width of the bottom border.\r\n     * @param right  the width of the right border.\r\n     * @param paint  the border paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockBorder.BlockBorder(org.jfree.chart.util.RectangleInsets, java.awt.Paint)",
      "begin_line": 128,
      "end_line": 137,
      "comment": "\r\n     * Creates a new border.\r\n     * \r\n     * @param insets  the border insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.getInsets()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the space reserved for the border.\r\n     * \r\n     * @return The space (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.getPaint()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the paint used to draw the border.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 163,
      "end_line": 192,
      "comment": "\r\n     * Draws the border by filling in the reserved space.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 168,col 67)",
        "(line 169,col 9)-(line 169,col 68)",
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 35)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 174,col 9)-(line 174,col 32)",
        "(line 175,col 9)-(line 175,col 52)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.equals(java.lang.Object)",
      "begin_line": 201,
      "end_line": 216,
      "comment": "\r\n     * Tests this border for equality with an arbitrary instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 45)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 36)",
        "(line 227,col 9)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockBorder.readObject(java.io.ObjectInputStream)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 55)"
      ]
    }
  ]
}