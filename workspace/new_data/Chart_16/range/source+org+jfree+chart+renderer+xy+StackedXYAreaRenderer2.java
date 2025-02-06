{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/StackedXYAreaRenderer2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedXYAreaRenderer2",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYAreaRenderer2",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 83,
      "end_line": 501,
      "comment": "\r\n * A stacked area renderer for the {@link XYPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "roundXCoordinates"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\r\n     * This flag controls whether or not the x-coordinates (in Java2D space) \r\n     * are rounded to integers.  When set to true, this can avoid the vertical\r\n     * striping that anti-aliasing can generate.  However, the rounding may not\r\n     * be appropriate for output in high resolution formats (for example, \r\n     * vector graphics formats such as SVG and PDF).\r\n     * \r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.StackedXYAreaRenderer2()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.StackedXYAreaRenderer2(org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param labelGenerator  the tool tip generator to use.  \u003ccode\u003enull\u003c/code\u003e\r\n     *                        is none.\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.getRoundXCoordinates()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the flag that controls whether or not the x-coordinates (in\r\n     * Java2D space) are rounded to integer values.\r\n     * \r\n     * @return The flag.\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #setRoundXCoordinates(boolean)\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.setRoundXCoordinates(boolean)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\r\n     * Sets the flag that controls whether or not the x-coordinates (in \r\n     * Java2D space) are rounded to integer values, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param round  the new flag value.\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #getRoundXCoordinates()\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 39)",
        "(line 149,col 9)-(line 149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 161,
      "end_line": 179,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 46)",
        "(line 167,col 9)-(line 167,col 52)",
        "(line 168,col 9)-(line 168,col 41)",
        "(line 169,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.getPassCount()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the number of passes required by the renderer.\r\n     * \r\n     * @return 1.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 207,
      "end_line": 394,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  information about crosshairs on a plot.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 59)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 65)",
        "(line 239,col 9)-(line 239,col 69)",
        "(line 240,col 9)-(line 240,col 69)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 245,col 20)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 251,col 32)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 256,col 32)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 259,col 40)",
        "(line 260,col 9)-(line 260,col 64)",
        "(line 261,col 9)-(line 261,col 65)",
        "(line 262,col 9)-(line 262,col 68)",
        "(line 263,col 9)-(line 263,col 69)",
        "(line 265,col 9)-(line 265,col 55)",
        "(line 267,col 9)-(line 267,col 78)",
        "(line 268,col 9)-(line 269,col 23)",
        "(line 270,col 9)-(line 271,col 23)",
        "(line 273,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 22)",
        "(line 280,col 9)-(line 280,col 54)",
        "(line 282,col 9)-(line 282,col 45)",
        "(line 283,col 9)-(line 283,col 46)",
        "(line 284,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 383,col 9)",
        "(line 386,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.getStackValues(org.jfree.data.xy.TableXYDataset, int, int)",
      "begin_line": 409,
      "end_line": 424,
      "comment": "\r\n     * Calculates the stacked values (one positive and one negative) of all \r\n     * series up to, but not including, \u003ccode\u003eseries\u003c/code\u003e for the specified \r\n     * item. It returns [0.0, 0.0] if \u003ccode\u003eseries\u003c/code\u003e is the first series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param index  the item index.\r\n     *\r\n     * @return An array containing the cumulative negative and positive values\r\n     *     for all series values up to but excluding \u003ccode\u003eseries\u003c/code\u003e \r\n     *     for \u003ccode\u003eindex\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 40)",
        "(line 412,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.averageStackValues(double[], double[])",
      "begin_line": 435,
      "end_line": 440,
      "comment": "\r\n     * Returns a pair of \"stack\" values calculated as the mean of the two \r\n     * specified stack value pairs.\r\n     * \r\n     * @param stack1  the first stack pair.\r\n     * @param stack2  the second stack pair.\r\n     * \r\n     * @return A pair of average stack values.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 40)",
        "(line 437,col 9)-(line 437,col 50)",
        "(line 438,col 9)-(line 438,col 50)",
        "(line 439,col 9)-(line 439,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.adjustedStackValues(double[], double[])",
      "begin_line": 452,
      "end_line": 467,
      "comment": "\r\n     * Calculates adjusted stack values from the supplied values.  The value is\r\n     * the mean of the supplied values, unless either of the supplied values\r\n     * is zero, in which case the adjusted value is zero also.\r\n     * \r\n     * @param stack1  the first stack pair.\r\n     * @param stack2  the second stack pair.\r\n     * \r\n     * @return A pair of average stack values.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 40)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.equals(java.lang.Object)",
      "begin_line": 476,
      "end_line": 488,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 67)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2.clone()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 29)"
      ]
    }
  ]
}