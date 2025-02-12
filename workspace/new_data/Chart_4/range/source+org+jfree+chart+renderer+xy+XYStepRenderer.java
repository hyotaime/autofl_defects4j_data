{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/xy/XYStepRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYStepRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 106,
      "end_line": 362,
      "comment": "\r\n * Line/Step item renderer for an {@link XYPlot}.  This class draws lines\r\n * between data points, only allowing horizontal or vertical lines (steps).\r\n * The example shown here is generated by the\r\n * \u003ccode\u003eXYStepRendererDemo1.java\u003c/code\u003e program included in the JFreeChart\r\n * demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/XYStepRendererSample.png\"\r\n * alt\u003d\"XYStepRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "stepPoint"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\r\n     * The factor (from 0.0 to 1.0) that determines the position of the\r\n     * step.\r\n     *\r\n     * @since 1.0.10.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.XYStepRenderer()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Constructs a new renderer with no tooltip or URL generation.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.XYStepRenderer(org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\r\n     * Constructs a new renderer with the specified tool tip and URL\r\n     * generators.\r\n     *\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e\r\n     *     permitted).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 16)",
        "(line 138,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 140,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.getStepPoint()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the fraction of the domain position between two points on which\r\n     * the step is drawn.  The default is 1.0d, which means the step is drawn\r\n     * at the domain position of the second`point. If the stepPoint is 0.5d the\r\n     * step is drawn at half between the two points.\r\n     *\r\n     * @return The fraction of the domain position between two points where the\r\n     *         step is drawn.\r\n     *\r\n     * @see #setStepPoint(double)\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.setStepPoint(double)",
      "begin_line": 170,
      "end_line": 177,
      "comment": "\r\n     * Sets the step point and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stepPoint  the step point (in the range 0.0 to 1.0)\r\n     *\r\n     * @see #getStepPoint()\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 35)",
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 194,
      "end_line": 298,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the vertical axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 60)",
        "(line 206,col 9)-(line 206,col 65)",
        "(line 207,col 9)-(line 207,col 68)",
        "(line 208,col 9)-(line 208,col 33)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 215,col 9)-(line 215,col 63)",
        "(line 216,col 9)-(line 216,col 62)",
        "(line 217,col 9)-(line 217,col 79)",
        "(line 218,col 9)-(line 219,col 72)",
        "(line 221,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.drawLine(java.awt.Graphics2D, java.awt.geom.Line2D, double, double, double, double)",
      "begin_line": 311,
      "end_line": 319,
      "comment": "\r\n     * A utility method that draws a line but only if none of the coordinates\r\n     * are NaN values.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param line  the line object.\r\n     * @param x0  the x-coordinate for the starting point of the line.\r\n     * @param y0  the y-coordinate for the starting point of the line.\r\n     * @param x1  the x-coordinate for the ending point of the line.\r\n     * @param y1  the y-coordinate for the ending point of the line.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 37)",
        "(line 318,col 9)-(line 318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.equals(java.lang.Object)",
      "begin_line": 328,
      "end_line": 340,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.hashCode()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.clone()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 29)"
      ]
    }
  ]
}