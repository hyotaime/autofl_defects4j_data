{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/ImageTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImageTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title"
      ],
      "begin_line": 82,
      "end_line": 316,
      "comment": "\r\n * A chart title that displays an image.  This is useful, for example, if you\r\n * have an image of your corporate logo and want to use as a footnote or part\r\n * of a title in a chart you create.\r\n * \u003cP\u003e\r\n * ImageTitle needs an image passed to it in the constructor.  For ImageTitle\r\n * to work, you must have already loaded this image from its source (disk or\r\n * URL).  It is recomended you use something like\r\n * Toolkit.getDefaultToolkit().getImage() to get the image.  Then, use\r\n * MediaTracker or some other message to make sure the image is fully loaded\r\n * from disk.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The title image. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\r\n     * Creates a new image title.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\r\n     * Creates a new image title.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param position  the title position.\r\n     * @param horizontalAlignment  the horizontal alignment.\r\n     * @param verticalAlignment  the vertical alignment.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image, int, int, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 128,
      "end_line": 142,
      "comment": "\r\n     * Creates a new image title with the given image scaled to the given\r\n     * width and height in the given location.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param height  the height used to draw the image.\r\n     * @param width  the width used to draw the image.\r\n     * @param position  the title position.\r\n     * @param horizontalAlignment  the horizontal alignment.\r\n     * @param verticalAlignment  the vertical alignment.\r\n     * @param padding  the amount of space to leave around the outside of the \r\n     *                 title.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 73)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 26)",
        "(line 140,col 9)-(line 140,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.getImage()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the image for the title.\r\n     *\r\n     * @return The image for the title (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.setImage(java.awt.Image)",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\r\n     * Sets the image for the title and notifies registered listeners that the\r\n     * title has been modified.\r\n     *\r\n     * @param image  the new image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 175,
      "end_line": 188,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param titleArea  the area within which the title (and plot) should be \r\n     *                   drawn.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 47)",
        "(line 178,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.drawHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 200,
      "end_line": 242,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the title (and plot) should be \r\n     *                   drawn.\r\n     *\r\n     * @return The size of the area used by the title.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 28)",
        "(line 203,col 9)-(line 203,col 30)",
        "(line 204,col 9)-(line 204,col 33)",
        "(line 205,col 9)-(line 205,col 31)",
        "(line 206,col 9)-(line 206,col 32)",
        "(line 208,col 9)-(line 208,col 30)",
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 55)",
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 214,col 53)",
        "(line 216,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 75)",
        "(line 225,col 9)-(line 225,col 28)",
        "(line 226,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 237,col 22)",
        "(line 239,col 9)-(line 240,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.drawVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 254,
      "end_line": 300,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the title (and plot) should be \r\n     *                   drawn.\r\n     *\r\n     * @return The size of the area used by the title.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 28)",
        "(line 257,col 9)-(line 257,col 30)",
        "(line 258,col 9)-(line 258,col 33)",
        "(line 259,col 9)-(line 259,col 31)",
        "(line 260,col 9)-(line 260,col 32)",
        "(line 262,col 9)-(line 262,col 30)",
        "(line 263,col 9)-(line 263,col 31)",
        "(line 265,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 281,col 61)",
        "(line 282,col 9)-(line 282,col 28)",
        "(line 283,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 295,col 22)",
        "(line 297,col 9)-(line 298,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 23)",
        "(line 313,col 9)-(line 313,col 20)"
      ]
    }
  ]
}