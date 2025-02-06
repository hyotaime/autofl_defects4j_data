{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/StackedXYAreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedXYAreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYAreaRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 113,
      "end_line": 675,
      "comment": "\r\n * A stacked area renderer for the {@link XYPlot} class.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * SPECIAL NOTE:  This renderer does not currently handle negative data values\r\n * correctly.  This should get fixed at some point, but the current workaround\r\n * is to use the {@link StackedXYAreaRenderer2} class instead.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " For serialization. "
    },
    {
      "type": "class_interface",
      "name": "StackedXYAreaRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 124,
      "end_line": 214,
      "comment": "\r\n     * A state object for use by this renderer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesArea"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The area for the current series. "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The line. "
    },
    {
      "type": "field",
      "varNames": [
        "lastSeriesPoints"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The points from the last series. "
    },
    {
      "type": "field",
      "varNames": [
        "currentSeriesPoints"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The points for the current series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.StackedXYAreaRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\r\n         * Creates a new state for the renderer.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 24)",
        "(line 145,col 13)-(line 145,col 35)",
        "(line 146,col 13)-(line 146,col 44)",
        "(line 147,col 13)-(line 147,col 48)",
        "(line 148,col 13)-(line 148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.getSeriesArea()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n         * Returns the series area.\r\n         * \r\n         * @return The series area.\r\n         ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.setSeriesArea(java.awt.Polygon)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n         * Sets the series area.\r\n         * \r\n         * @param area  the area.\r\n         ",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.getLine()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n         * Returns the working line.\r\n         * \r\n         * @return The working line.\r\n         ",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.getCurrentSeriesPoints()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n         * Returns the current series points.\r\n         * \r\n         * @return The current series points.\r\n         ",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.setCurrentSeriesPoints(java.util.Stack)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n         * Sets the current series points.\r\n         * \r\n         * @param points  the points.\r\n         ",
      "child_ranges": [
        "(line 193,col 13)-(line 193,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.getLastSeriesPoints()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n         * Returns the last series points.\r\n         * \r\n         * @return The last series points.\r\n         ",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.setLastSeriesPoints(java.util.Stack)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n         * Sets the last series points.\r\n         * \r\n         * @param points  the points.\r\n         ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "shapePaint"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " \r\n     * Custom Paint for drawing all shapes, if null defaults to series shapes \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeStroke"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " \r\n     * Custom Stroke for drawing all shapes, if null defaults to series \r\n     * strokes.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRenderer()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRenderer(int)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param type  the type of the renderer.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 254,
      "end_line": 259,
      "comment": "\r\n     * Constructs a new renderer.  To specify the type of renderer, use one of \r\n     * the constants: \u003ccode\u003eSHAPES\u003c/code\u003e, \u003ccode\u003eLINES\u003c/code\u003e, \r\n     * \u003ccode\u003eSHAPES_AND_LINES\u003c/code\u003e, \u003ccode\u003eAREA\u003c/code\u003e or \r\n     * \u003ccode\u003eAREA_AND_SHAPES\u003c/code\u003e.\r\n     *\r\n     * @param type  the type of renderer.\r\n     * @param labelGenerator  the tool tip generator to use (\u003ccode\u003enull\u003c/code\u003e \r\n     *                        is none).\r\n     * @param urlGenerator  the URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.getShapePaint()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\r\n     * Returns the paint used for rendering shapes, or \u003ccode\u003enull\u003c/code\u003e if \r\n     * using series paints.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setShapePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.setShapePaint(java.awt.Paint)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\r\n     * Sets the paint for rendering shapes and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shapePaint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getShapePaint()\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 37)",
        "(line 283,col 9)-(line 283,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.getShapeStroke()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns the stroke used for rendering shapes, or \u003ccode\u003enull\u003c/code\u003e if \r\n     * using series strokes.\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setShapeStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.setShapeStroke(java.awt.Stroke)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\r\n     * Sets the stroke for rendering shapes and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shapeStroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getShapeStroke()\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 39)",
        "(line 308,col 9)-(line 308,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 326,
      "end_line": 337,
      "comment": "\r\n     * Initialises the renderer. This method will be called before the first\r\n     * item is rendered, giving the renderer an opportunity to initialise any \r\n     * state information it wants to maintain.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return A state object that should be passed to subsequent calls to the \r\n     *         drawItem() method.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 73)",
        "(line 335,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.getPassCount()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns the number of passes required by the renderer.\r\n     * \r\n     * @return 2.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 360,
      "end_line": 368,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range ([0.0, 0.0] if the dataset contains no values, and \r\n     *         \u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @throws ClassCastException if \u003ccode\u003edataset\u003c/code\u003e is not an instance\r\n     *         of {@link TableXYDataset}.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 391,
      "end_line": 586,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  information about crosshairs on a plot.\r\n     * @param pass  the pass index.\r\n     * \r\n     * @throws ClassCastException if \u003ccode\u003estate\u003c/code\u003e is not an instance of\r\n     *         \u003ccode\u003eStackedXYAreaRendererState\u003c/code\u003e or \u003ccode\u003edataset\u003c/code\u003e\r\n     *         is not an instance of {@link TableXYDataset}.\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 60)",
        "(line 405,col 9)-(line 406,col 49)",
        "(line 409,col 9)-(line 409,col 59)",
        "(line 410,col 9)-(line 410,col 48)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 414,col 52)",
        "(line 415,col 9)-(line 415,col 34)",
        "(line 416,col 9)-(line 419,col 9)",
        "(line 422,col 9)-(line 422,col 63)",
        "(line 423,col 9)-(line 424,col 42)",
        "(line 425,col 9)-(line 426,col 41)",
        "(line 429,col 9)-(line 429,col 55)",
        "(line 430,col 9)-(line 430,col 58)",
        "(line 432,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.getPreviousHeight(org.jfree.data.xy.TableXYDataset, int, int)",
      "begin_line": 600,
      "end_line": 610,
      "comment": "\r\n     * Calculates the stacked value of the all series up to, but not including \r\n     * \u003ccode\u003eseries\u003c/code\u003e for the specified item. It returns 0.0 if \r\n     * \u003ccode\u003eseries\u003c/code\u003e is the first series, i.e. 0.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series.\r\n     * @param index  the index.\r\n     *\r\n     * @return The cumulative value for all series\u0027 values up to but excluding \r\n     *         \u003ccode\u003eseries\u003c/code\u003e for \u003ccode\u003eindex\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 28)",
        "(line 603,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.equals(java.lang.Object)",
      "begin_line": 619,
      "end_line": 634,
      "comment": "\r\n     * Tests the renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 65)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.clone()",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 655,
      "end_line": 660,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 35)",
        "(line 658,col 9)-(line 658,col 60)",
        "(line 659,col 9)-(line 659,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYAreaRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 669,
      "end_line": 673,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 36)",
        "(line 671,col 9)-(line 671,col 60)",
        "(line 672,col 9)-(line 672,col 62)"
      ]
    }
  ]
}