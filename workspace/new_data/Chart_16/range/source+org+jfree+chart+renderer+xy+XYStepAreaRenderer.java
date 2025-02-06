{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYStepAreaRenderer.java",
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
      "begin_line": 82,
      "end_line": 610,
      "comment": "\r\n * A step chart renderer that fills the area between the step and the x-axis.\r\n "
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
        "SHAPES"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Useful constant for specifying the type of rendering (shapes only). "
    },
    {
      "type": "field",
      "varNames": [
        "AREA"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Useful constant for specifying the type of rendering (area only). "
    },
    {
      "type": "field",
      "varNames": [
        "AREA_AND_SHAPES"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " \r\n     * Useful constant for specifying the type of rendering (area and shapes). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapesVisible"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " A flag indicating whether or not shapes are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "shapesFilled"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " A flag that controls whether or not shapes are filled for ALL series. "
    },
    {
      "type": "field",
      "varNames": [
        "plotArea"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " A flag indicating whether or not Area are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "showOutline"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A flag that controls whether or not the outline is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "pArea"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Area of the complete series "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBase"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \r\n     * The value on the range axis which defines the \u0027lower\u0027 border of the \r\n     * area. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param type  the type of the renderer.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.XYStepAreaRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 150,
      "end_line": 169,
      "comment": "\r\n     * Constructs a new renderer.\r\n     * \u003cp\u003e\r\n     * To specify the type of renderer, use one of the constants:\r\n     * AREA, SHAPES or AREA_AND_SHAPES.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the tool tip generator to use \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 16)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 158,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.isOutline()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns a flag that controls whether or not outlines of the areas are \r\n     * drawn.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setOutline(boolean)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\r\n     * Sets a flag that controls whether or not outlines of the areas are \r\n     * drawn, and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param show  the flag.\r\n     * \r\n     * @see #isOutline()\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getShapesVisible()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns true if shapes are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if shapes are being plotted by the renderer.\r\n     * \r\n     * @see #setShapesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setShapesVisible(boolean)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\r\n     * Sets the flag that controls whether or not shapes are displayed for each \r\n     * data item, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getShapesVisible()\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.isShapesFilled()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the flag that controls whether or not the shapes are filled.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setShapesFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setShapesFilled(boolean)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\r\n     * Sets the \u0027shapes filled\u0027 for ALL series.\r\n     *\r\n     * @param filled  the flag.\r\n     * \r\n     * @see #isShapesFilled()\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getPlotArea()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns true if Area is being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if Area is being plotted by the renderer.\r\n     * \r\n     * @see #setPlotArea(boolean)\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setPlotArea(boolean)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Sets a flag that controls whether or not areas are drawn for each data \r\n     * item.\r\n     * \r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getPlotArea()\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 29)",
        "(line 266,col 9)-(line 266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.getRangeBase()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the value on the range axis which defines the \u0027lower\u0027 border of\r\n     * the area.\r\n     *\r\n     * @return \u003ccode\u003edouble\u003c/code\u003e the value on the range axis which defines \r\n     *         the \u0027lower\u0027 border of the area.\r\n     *         \r\n     * @see #setRangeBase(double)\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.setRangeBase(double)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\r\n     * Sets the value on the range axis which defines the default border of the \r\n     * area.  E.g. setRangeBase(Double.NEGATIVE_INFINITY) lets areas always \r\n     * reach the lower border of the plotArea. \r\n     * \r\n     * @param val  the value on the range axis which defines the default border\r\n     *             of the area.\r\n     *             \r\n     * @see #getRangeBase()\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 29)",
        "(line 294,col 9)-(line 294,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 310,
      "end_line": 324,
      "comment": "\r\n     * Initialises the renderer.  Here we calculate the Java2D y-coordinate for\r\n     * zero, since all the bars have their bases fixed at zero.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 22)",
        "(line 321,col 9)-(line 321,col 48)",
        "(line 322,col 9)-(line 322,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 345,
      "end_line": 527,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 60)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 364,col 9)-(line 364,col 49)",
        "(line 365,col 9)-(line 365,col 58)",
        "(line 366,col 9)-(line 366,col 27)",
        "(line 367,col 9)-(line 367,col 35)",
        "(line 370,col 9)-(line 370,col 52)",
        "(line 371,col 9)-(line 371,col 52)",
        "(line 372,col 9)-(line 372,col 22)",
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 375,col 42)",
        "(line 376,col 9)-(line 377,col 41)",
        "(line 380,col 9)-(line 380,col 67)",
        "(line 382,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 27)",
        "(line 404,col 9)-(line 405,col 26)",
        "(line 407,col 9)-(line 407,col 18)",
        "(line 408,col 9)-(line 408,col 18)",
        "(line 409,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 27)",
        "(line 442,col 9)-(line 478,col 9)",
        "(line 483,col 9)-(line 513,col 9)",
        "(line 516,col 9)-(line 521,col 9)",
        "(line 523,col 9)-(line 523,col 64)",
        "(line 524,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.equals(java.lang.Object)",
      "begin_line": 536,
      "end_line": 560,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 59)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.clone()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(double, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 588,
      "end_line": 608,
      "comment": "\r\n     * Helper method which returns a value if it lies\r\n     * inside the visible dataArea and otherwise the corresponding\r\n     * coordinate on the border of the dataArea. The PlotOrientation\r\n     * is taken into account. \r\n     * Useful to avoid possible sun.dc.pr.PRException: endPath: bad path\r\n     * which occurs when trying to draw lines/shapes which in large part\r\n     * lie outside of the visible dataArea.\r\n     * \r\n     * @param value the value which shall be \r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @return \u003ccode\u003edouble\u003c/code\u003e value inside the data area.\r\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 23)",
        "(line 592,col 9)-(line 592,col 23)",
        "(line 593,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 21)"
      ]
    }
  ]
}