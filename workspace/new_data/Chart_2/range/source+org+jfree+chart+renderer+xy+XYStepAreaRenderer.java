{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/XYStepAreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYStepAreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 88,
      "end_line": 608,
      "comment": "\r\n * A step chart renderer that fills the area between the step and the x-axis.\r\n * The example shown here is generated by the\r\n * \u003ccode\u003eXYStepAreaRendererDemo1.java\u003c/code\u003e program included in the JFreeChart\r\n * demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/XYStepAreaRendererSample.png\"\r\n * alt\u003d\"XYStepAreaRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Useful constant for specifying the type of rendering (shapes only). "
    },
    {
      "type": "field",
      "varNames": [
        "AREA"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Useful constant for specifying the type of rendering (area only). "
    },
    {
      "type": "field",
      "varNames": [
        "AREA_AND_SHAPES"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Useful constant for specifying the type of rendering (area and shapes).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapesVisible"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " A flag indicating whether or not shapes are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "shapesFilled"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " A flag that controls whether or not shapes are filled for ALL series. "
    },
    {
      "type": "field",
      "varNames": [
        "plotArea"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A flag indicating whether or not Area are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "showOutline"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " A flag that controls whether or not the outline is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "pArea"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Area of the complete series "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBase"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * The value on the range axis which defines the \u0027lower\u0027 border of the\r\n     * area.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer(int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param type  the type of the renderer.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 153,
      "end_line": 172,
      "comment": "\r\n     * Constructs a new renderer.\r\n     * \u003cp\u003e\r\n     * To specify the type of renderer, use one of the constants:\r\n     * AREA, SHAPES or AREA_AND_SHAPES.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the tool tip generator to use\r\n     *                          (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 16)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 42)",
        "(line 161,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.isOutline()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns a flag that controls whether or not outlines of the areas are\r\n     * drawn.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setOutline(boolean)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\r\n     * Sets a flag that controls whether or not outlines of the areas are\r\n     * drawn, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param show  the flag.\r\n     *\r\n     * @see #isOutline()\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 32)",
        "(line 197,col 9)-(line 197,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getShapesVisible()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns true if shapes are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if shapes are being plotted by the renderer.\r\n     *\r\n     * @see #setShapesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setShapesVisible(boolean)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\r\n     * Sets the flag that controls whether or not shapes are displayed for each\r\n     * data item, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getShapesVisible()\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)",
        "(line 222,col 9)-(line 222,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.isShapesFilled()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the flag that controls whether or not the shapes are filled.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setShapesFilled(boolean)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 for ALL series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param filled  the flag.\r\n     *\r\n     * @see #isShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 246,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getPlotArea()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns true if Area is being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if Area is being plotted by the renderer.\r\n     *\r\n     * @see #setPlotArea(boolean)\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setPlotArea(boolean)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\r\n     * Sets a flag that controls whether or not areas are drawn for each data\r\n     * item and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getPlotArea()\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 29)",
        "(line 271,col 9)-(line 271,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getRangeBase()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the value on the range axis which defines the \u0027lower\u0027 border of\r\n     * the area.\r\n     *\r\n     * @return \u003ccode\u003edouble\u003c/code\u003e the value on the range axis which defines\r\n     *         the \u0027lower\u0027 border of the area.\r\n     *\r\n     * @see #setRangeBase(double)\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setRangeBase(double)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\r\n     * Sets the value on the range axis which defines the default border of the\r\n     * area, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.  E.g. setRangeBase(Double.NEGATIVE_INFINITY) lets areas always\r\n     * reach the lower border of the plotArea.\r\n     *\r\n     * @param val  the value on the range axis which defines the default border\r\n     *             of the area.\r\n     *\r\n     * @see #getRangeBase()\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 316,
      "end_line": 330,
      "comment": "\r\n     * Initialises the renderer.  Here we calculate the Java2D y-coordinate for\r\n     * zero, since all the bars have their bases fixed at zero.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 324,col 22)",
        "(line 327,col 9)-(line 327,col 48)",
        "(line 328,col 9)-(line 328,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 348,
      "end_line": 525,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 60)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 359,col 9)-(line 359,col 59)",
        "(line 360,col 9)-(line 360,col 68)",
        "(line 361,col 9)-(line 361,col 27)",
        "(line 362,col 9)-(line 362,col 35)",
        "(line 365,col 9)-(line 365,col 52)",
        "(line 366,col 9)-(line 366,col 52)",
        "(line 367,col 9)-(line 367,col 22)",
        "(line 368,col 9)-(line 368,col 58)",
        "(line 369,col 9)-(line 370,col 42)",
        "(line 371,col 9)-(line 372,col 41)",
        "(line 375,col 9)-(line 375,col 67)",
        "(line 377,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 398,col 27)",
        "(line 399,col 9)-(line 400,col 26)",
        "(line 402,col 9)-(line 402,col 18)",
        "(line 403,col 9)-(line 403,col 18)",
        "(line 404,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 27)",
        "(line 437,col 9)-(line 473,col 9)",
        "(line 478,col 9)-(line 508,col 9)",
        "(line 511,col 9)-(line 517,col 9)",
        "(line 520,col 9)-(line 520,col 64)",
        "(line 521,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.equals(java.lang.Object)",
      "begin_line": 534,
      "end_line": 558,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 59)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.clone()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(double, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 586,
      "end_line": 606,
      "comment": "\r\n     * Helper method which returns a value if it lies\r\n     * inside the visible dataArea and otherwise the corresponding\r\n     * coordinate on the border of the dataArea. The PlotOrientation\r\n     * is taken into account.\r\n     * Useful to avoid possible sun.dc.pr.PRException: endPath: bad path\r\n     * which occurs when trying to draw lines/shapes which in large part\r\n     * lie outside of the visible dataArea.\r\n     *\r\n     * @param value the value which shall be\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @return \u003ccode\u003edouble\u003c/code\u003e value inside the data area.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 23)",
        "(line 590,col 9)-(line 590,col 23)",
        "(line 591,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 21)"
      ]
    }
  ]
}