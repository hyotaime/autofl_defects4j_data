{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYStepRenderer.java",
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
      "begin_line": 98,
      "end_line": 359,
      "comment": "\r\n * Line/Step item renderer for an {@link XYPlot}.  This class draws lines \r\n * between data points, only allowing horizontal or vertical lines (steps).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "stepPoint"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " \r\n     * The factor (from 0.0 to 1.0) that determines the position of the \r\n     * step.  \r\n     *\r\n     * @since 1.0.10. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.XYStepRenderer()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Constructs a new renderer with no tooltip or URL generation.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.XYStepRenderer(org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 127,
      "end_line": 133,
      "comment": "\r\n     * Constructs a new renderer with the specified tool tip and URL \r\n     * generators.\r\n     *\r\n     * @param toolTipGenerator  the item label generator (\u003ccode\u003enull\u003c/code\u003e \r\n     *     permitted).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 130,col 50)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.getStepPoint()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns the fraction of the domain position between two points on which\r\n     * the step is drawn.  The default is 1.0d, which means the step is drawn \r\n     * at the domain position of the second`point. If the stepPoint is 0.5d the\r\n     * step is drawn at half between the two points.\r\n     * \r\n     * @return The fraction of the domain position between two points where the\r\n     *         step is drawn.\r\n     *         \r\n     * @see #setStepPoint(double)\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.setStepPoint(double)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\r\n     * Sets the step point and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param stepPoint  the step point (in the range 0.0 to 1.0)\r\n     * \r\n     * @see #getStepPoint()\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 189,
      "end_line": 295,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the vertical axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index (ignored here).\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 60)",
        "(line 209,col 9)-(line 209,col 55)",
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 212,col 9)-(line 212,col 35)",
        "(line 215,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 216,col 52)",
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 219,col 62)",
        "(line 220,col 9)-(line 220,col 79)",
        "(line 221,col 9)-(line 222,col 66)",
        "(line 224,col 9)-(line 272,col 9)",
        "(line 275,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 66)",
        "(line 287,col 9)-(line 287,col 63)",
        "(line 288,col 9)-(line 289,col 63)",
        "(line 291,col 9)-(line 291,col 64)",
        "(line 292,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.drawLine(java.awt.Graphics2D, java.awt.geom.Line2D, double, double, double, double)",
      "begin_line": 308,
      "end_line": 316,
      "comment": "\r\n     * A utility method that draws a line but only if none of the coordinates\r\n     * are NaN values.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param line  the line object.\r\n     * @param x0  the x-coordinate for the starting point of the line.\r\n     * @param y0  the y-coordinate for the starting point of the line.\r\n     * @param x1  the x-coordinate for the ending point of the line.\r\n     * @param y1  the y-coordinate for the ending point of the line.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.equals(java.lang.Object)",
      "begin_line": 325,
      "end_line": 337,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 51)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 3)-(line 336,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.hashCode()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepRenderer.clone()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 29)"
      ]
    }
  ]
}