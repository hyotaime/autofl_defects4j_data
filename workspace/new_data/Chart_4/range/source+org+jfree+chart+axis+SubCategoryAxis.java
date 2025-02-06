{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/SubCategoryAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubCategoryAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.CategoryAxis",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 81,
      "end_line": 453,
      "comment": "\r\n * A specialised category axis that can display sub-categories.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subCategories"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Storage for the sub-categories (these need to be set manually). "
    },
    {
      "type": "field",
      "varNames": [
        "subLabelFont"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The font for the sub-category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "subLabelPaint"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The paint for the sub-category labels. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.SubCategoryAxis(java.lang.String)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)",
        "(line 103,col 9)-(line 103,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.addSubCategory(java.lang.Comparable)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\r\n     * Adds a sub-category to the axis and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param subCategory  the sub-category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 117,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getSubLabelFont()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the font used to display the sub-category labels.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.setSubLabelFont(java.awt.Font)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\r\n     * Sets the font used to display the sub-category labels and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubLabelFont()\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getSubLabelPaint()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Returns the paint used to display the sub-category labels.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.setSubLabelPaint(java.awt.Paint)",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\r\n     * Sets the paint used to display the sub-category labels and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 185,
      "end_line": 208,
      "comment": "\r\n     * Estimates the space required for the axis, given a specific drawing area.\r\n     *\r\n     * @param g2  the graphics device (used to obtain font information).\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the axis should be drawn.\r\n     * @param edge  the axis location (top or bottom).\r\n     * @param space  the space already reserved.\r\n     *\r\n     * @return The space required to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 68)",
        "(line 200,col 9)-(line 200,col 44)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getMaxDim(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 219,
      "end_line": 238,
      "comment": "\r\n     * Returns the maximum of the relevant dimension (height or width) of the\r\n     * subcategory labels.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return The maximum dimension.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 28)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 45)",
        "(line 223,col 9)-(line 223,col 58)",
        "(line 224,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 256,
      "end_line": 283,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axis should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the plot is being drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 273,col 9)-(line 273,col 48)",
        "(line 274,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 277,col 27)",
        "(line 278,col 9)-(line 279,col 27)",
        "(line 281,col 9)-(line 281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.drawSubCategoryLabels(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 299,
      "end_line": 398,
      "comment": "\r\n     * Draws the category labels and returns the updated axis state.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area inside the axes (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                  permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return The updated axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 38)",
        "(line 311,col 9)-(line 311,col 40)",
        "(line 312,col 9)-(line 312,col 53)",
        "(line 313,col 9)-(line 313,col 30)",
        "(line 314,col 9)-(line 314,col 52)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.equals(java.lang.Object)",
      "begin_line": 407,
      "end_line": 425,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 36)",
        "(line 436,col 9)-(line 436,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 447,
      "end_line": 451,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 63)"
      ]
    }
  ]
}