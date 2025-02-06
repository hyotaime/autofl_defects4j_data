{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/SubCategoryAxis.java",
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
      "begin_line": 79,
      "end_line": 449,
      "comment": "\r\n * A specialised category axis that can display sub-categories.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "subCategories"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Storage for the sub-categories (these need to be set manually). "
    },
    {
      "type": "field",
      "varNames": [
        "subLabelFont"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The font for the sub-category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "subLabelPaint"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The paint for the sub-category labels. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.SubCategoryAxis(java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 101,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.addSubCategory(java.lang.Comparable)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\r\n     * Adds a sub-category to the axis and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param subCategory  the sub-category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 44)",
        "(line 115,col 9)-(line 115,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getSubLabelFont()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the font used to display the sub-category labels.\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSubLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.setSubLabelFont(java.awt.Font)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\r\n     * Sets the font used to display the sub-category labels and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubLabelFont()\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 33)",
        "(line 142,col 9)-(line 142,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getSubLabelPaint()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the paint used to display the sub-category labels.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSubLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.setSubLabelPaint(java.awt.Paint)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\r\n     * Sets the paint used to display the sub-category labels and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 183,
      "end_line": 206,
      "comment": "\r\n     * Estimates the space required for the axis, given a specific drawing area.\r\n     *\r\n     * @param g2  the graphics device (used to obtain font information).\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the axis should be drawn.\r\n     * @param edge  the axis location (top or bottom).\r\n     * @param space  the space already reserved.\r\n     *\r\n     * @return The space required to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 68)",
        "(line 198,col 9)-(line 198,col 44)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.getMaxDim(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 217,
      "end_line": 236,
      "comment": "\r\n     * Returns the maximum of the relevant dimension (height or width) of the \r\n     * subcategory labels.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return The maximum dimension.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 28)",
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 220,col 45)",
        "(line 221,col 9)-(line 221,col 58)",
        "(line 222,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 254,
      "end_line": 282,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axis should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the plot is being drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 48)",
        "(line 272,col 9)-(line 274,col 10)",
        "(line 275,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 278,col 27)",
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.drawSubCategoryLabels(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 298,
      "end_line": 394,
      "comment": "\r\n     * Draws the category labels and returns the updated axis state.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area inside the axes (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                  permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e \r\n     *                   permitted).\r\n     * \r\n     * @return The updated axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 38)",
        "(line 310,col 9)-(line 310,col 40)",
        "(line 311,col 9)-(line 311,col 53)",
        "(line 312,col 9)-(line 312,col 52)",
        "(line 313,col 9)-(line 313,col 53)",
        "(line 315,col 9)-(line 315,col 44)",
        "(line 316,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.equals(java.lang.Object)",
      "begin_line": 403,
      "end_line": 421,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SubCategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 443,
      "end_line": 447,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 35)",
        "(line 446,col 9)-(line 446,col 63)"
      ]
    }
  ]
}