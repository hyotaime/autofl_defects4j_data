{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYAreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYAreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 117,
      "end_line": 639,
      "comment": "\r\n * Area item renderer for an {@link XYPlot}.  This class can draw (a) shapes at\r\n * each point, or (b) lines between points, or (c) both shapes and lines, \r\n * or (d) filled areas, or (e) filled areas and shapes.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " For serialization. "
    },
    {
      "type": "class_interface",
      "name": "XYAreaRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 129,
      "end_line": 148,
      "comment": "\r\n     * A state object used by this renderer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "area"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Working storage for the area under one series. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Working line that can be recycled. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.XYAreaRendererState.XYAreaRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\r\n         * Creates a new state.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 24)",
        "(line 144,col 13)-(line 144,col 38)",
        "(line 145,col 13)-(line 145,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Useful constant for specifying the type of rendering (shapes only). "
    },
    {
      "type": "field",
      "varNames": [
        "LINES"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Useful constant for specifying the type of rendering (lines only). "
    },
    {
      "type": "field",
      "varNames": [
        "SHAPES_AND_LINES"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " \r\n     * Useful constant for specifying the type of rendering (shapes and lines).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AREA"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Useful constant for specifying the type of rendering (area only). "
    },
    {
      "type": "field",
      "varNames": [
        "AREA_AND_SHAPES"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " \r\n     * Useful constant for specifying the type of rendering (area and shapes). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "plotShapes"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " A flag indicating whether or not shapes are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "plotLines"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " A flag indicating whether or not lines are drawn between XY points. "
    },
    {
      "type": "field",
      "varNames": [
        "plotArea"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " A flag indicating whether or not Area are drawn at each XY point. "
    },
    {
      "type": "field",
      "varNames": [
        "showOutline"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " A flag that controls whether or not the outline is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "legendArea"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " \r\n     * The shape used to represent an area in each legend item (this should \r\n     * never be \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.XYAreaRenderer()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.XYAreaRenderer(int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param type  the type of the renderer.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.XYAreaRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 214,
      "end_line": 248,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of \r\n     * the constants: \u003ccode\u003eSHAPES\u003c/code\u003e, \u003ccode\u003eLINES\u003c/code\u003e,\r\n     * \u003ccode\u003eSHAPES_AND_LINES\u003c/code\u003e, \u003ccode\u003eAREA\u003c/code\u003e or \r\n     * \u003ccode\u003eAREA_AND_SHAPES\u003c/code\u003e.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param toolTipGenerator  the tool tip generator to use \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 16)",
        "(line 218,col 9)-(line 218,col 50)",
        "(line 219,col 9)-(line 219,col 42)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 239,col 9)-(line 239,col 45)",
        "(line 240,col 9)-(line 240,col 33)",
        "(line 241,col 9)-(line 241,col 33)",
        "(line 242,col 9)-(line 242,col 32)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 244,col 9)-(line 244,col 34)",
        "(line 245,col 9)-(line 245,col 25)",
        "(line 246,col 9)-(line 246,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.getPlotShapes()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns true if shapes are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if shapes are being plotted by the renderer.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.getPlotLines()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns true if lines are being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if lines are being plotted by the renderer.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.getPlotArea()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns true if Area is being plotted by the renderer.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if Area is being plotted by the renderer.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.isOutline()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns a flag that controls whether or not outlines of the areas are \r\n     * drawn.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.setOutline(boolean)",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\r\n     * Sets a flag that controls whether or not outlines of the areas are drawn\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param show  the flag.\r\n     * \r\n     * @see #isOutline()\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 299,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.getLegendArea()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the shape used to represent an area in the legend.\r\n     * \r\n     * @return The legend area (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.setLegendArea(java.awt.Shape)",
      "begin_line": 317,
      "end_line": 323,
      "comment": "\r\n     * Sets the shape used as an area in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 31)",
        "(line 322,col 9)-(line 322,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 338,
      "end_line": 346,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be \r\n     * passed to all subsequent calls to the drawItem() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return A state object for use by the renderer.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 66)",
        "(line 344,col 9)-(line 344,col 48)",
        "(line 345,col 9)-(line 345,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.getLegendItem(int, int)",
      "begin_line": 357,
      "end_line": 386,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses \r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 359,col 34)",
        "(line 360,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 406,
      "end_line": 566,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 52)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 423,col 42)",
        "(line 424,col 9)-(line 425,col 41)",
        "(line 429,col 9)-(line 429,col 53)",
        "(line 430,col 9)-(line 430,col 69)",
        "(line 431,col 9)-(line 431,col 69)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 436,col 42)",
        "(line 437,col 9)-(line 438,col 41)",
        "(line 440,col 9)-(line 441,col 32)",
        "(line 442,col 9)-(line 443,col 32)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 448,col 42)",
        "(line 449,col 9)-(line 450,col 41)",
        "(line 452,col 9)-(line 453,col 41)",
        "(line 454,col 9)-(line 454,col 31)",
        "(line 455,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 491,col 9)",
        "(line 494,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 501,col 60)",
        "(line 502,col 9)-(line 502,col 49)",
        "(line 503,col 9)-(line 503,col 52)",
        "(line 504,col 9)-(line 504,col 27)",
        "(line 505,col 9)-(line 505,col 29)",
        "(line 507,col 9)-(line 507,col 27)",
        "(line 508,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 531,col 9)",
        "(line 535,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 66)",
        "(line 557,col 9)-(line 557,col 63)",
        "(line 558,col 9)-(line 559,col 63)",
        "(line 561,col 9)-(line 561,col 64)",
        "(line 562,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.clone()",
      "begin_line": 575,
      "end_line": 579,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 62)",
        "(line 577,col 9)-(line 577,col 65)",
        "(line 578,col 9)-(line 578,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.equals(java.lang.Object)",
      "begin_line": 588,
      "end_line": 612,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 51)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 622,
      "end_line": 626,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 35)",
        "(line 625,col 9)-(line 625,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 635,
      "end_line": 638,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 36)",
        "(line 637,col 9)-(line 637,col 60)"
      ]
    }
  ]
}