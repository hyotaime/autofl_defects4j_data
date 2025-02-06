{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/ImageTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImageTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title"
      ],
      "begin_line": 90,
      "end_line": 366,
      "comment": "\r\n * A chart title that displays an image.  This is useful, for example, if you\r\n * have an image of your corporate logo and want to use as a footnote or part\r\n * of a title in a chart you create.\r\n * \u003cP\u003e\r\n * ImageTitle needs an image passed to it in the constructor.  For ImageTitle\r\n * to work, you must have already loaded this image from its source (disk or\r\n * URL).  It is recommended you use something like\r\n * Toolkit.getDefaultToolkit().getImage() to get the image.  Then, use\r\n * MediaTracker or some other message to make sure the image is fully loaded\r\n * from disk.\r\n * \u003cP\u003e\r\n * SPECIAL NOTE:  this class fails to serialize, so if you are\r\n * relying on your charts to be serializable, please avoid using this class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The title image. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\r\n     * Creates a new image title.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\r\n     * Creates a new image title.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param position  the title position.\r\n     * @param horizontalAlignment  the horizontal alignment.\r\n     * @param verticalAlignment  the vertical alignment.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.ImageTitle.ImageTitle(java.awt.Image, int, int, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 136,
      "end_line": 150,
      "comment": "\r\n     * Creates a new image title with the given image scaled to the given\r\n     * width and height in the given location.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param height  the height used to draw the image.\r\n     * @param width  the width used to draw the image.\r\n     * @param position  the title position.\r\n     * @param horizontalAlignment  the horizontal alignment.\r\n     * @param verticalAlignment  the vertical alignment.\r\n     * @param padding  the amount of space to leave around the outside of the\r\n     *                 title.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 73)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 26)",
        "(line 148,col 9)-(line 148,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.getImage()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns the image for the title.\r\n     *\r\n     * @return The image for the title (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.setImage(java.awt.Image)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\r\n     * Sets the image for the title and notifies registered listeners that the\r\n     * title has been modified.\r\n     *\r\n     * @param image  the new image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 188,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 198,
      "end_line": 210,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 47)",
        "(line 200,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.drawHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 222,
      "end_line": 264,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the title (and plot) should be\r\n     *                   drawn.\r\n     *\r\n     * @return The size of the area used by the title.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 28)",
        "(line 225,col 9)-(line 225,col 30)",
        "(line 226,col 9)-(line 226,col 33)",
        "(line 227,col 9)-(line 227,col 31)",
        "(line 228,col 9)-(line 228,col 32)",
        "(line 230,col 9)-(line 230,col 30)",
        "(line 231,col 9)-(line 231,col 31)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 233,col 49)",
        "(line 234,col 9)-(line 234,col 55)",
        "(line 235,col 9)-(line 235,col 51)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 238,col 9)-(line 243,col 9)",
        "(line 246,col 9)-(line 246,col 75)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 248,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 259,col 22)",
        "(line 261,col 9)-(line 262,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.drawVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 276,
      "end_line": 322,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param chartArea  the area within which the title (and plot) should be\r\n     *                   drawn.\r\n     *\r\n     * @return The size of the area used by the title.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 31)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 284,col 9)-(line 284,col 30)",
        "(line 285,col 9)-(line 285,col 31)",
        "(line 287,col 9)-(line 287,col 47)",
        "(line 288,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 300,col 9)",
        "(line 303,col 9)-(line 303,col 61)",
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 317,col 22)",
        "(line 319,col 9)-(line 320,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.ImageTitle.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 364,
      "comment": "\r\n     * Tests this \u003ccode\u003eImageTitle\u003c/code\u003e for equality with an arbitrary\r\n     * object.  Returns \u003ccode\u003etrue\u003c/code\u003e if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eImageTitle\u003c/code\u003e;\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e references the same image as this\r\n     *     \u003ccode\u003eImageTitle\u003c/code\u003e;\r\n     * \u003cli\u003e\u003ccode\u003esuper.equals(obj)\u003ccode\u003e returns \u003ccode\u003etrue\u003c/code\u003e;\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 43)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 33)"
      ]
    }
  ]
}