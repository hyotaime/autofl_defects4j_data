{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/DeviationRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeviationRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer"
      ],
      "begin_line": 70,
      "end_line": 365,
      "comment": "\r\n * A specialised subclass of the {@link XYLineAndShapeRenderer} that requires\r\n * an {@link IntervalXYDataset} and represents the y-interval by shading an \r\n * area behind the y-values on the chart.\r\n * \r\n * @since 1.0.5\r\n "
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State"
      ],
      "begin_line": 75,
      "end_line": 100,
      "comment": "\r\n     * A state object that is passed to each call to \u003ccode\u003edrawItem\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperCoordinates"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " \r\n         * A list of coordinates for the upper y-values in the current series \r\n         * (after translation into Java2D space).\r\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lowerCoordinates"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " \r\n         * A list of coordinates for the lower y-values in the current series \r\n         * (after translation into Java2D space).\r\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\r\n         * Creates a new state instance.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 24)",
        "(line 96,col 13)-(line 96,col 62)",
        "(line 97,col 13)-(line 97,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The alpha transparency for the interval shading. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.DeviationRenderer()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Creates a new renderer that displays lines and shapes for the data \r\n     * items, as well as the shaded area for the y-interval.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.DeviationRenderer(boolean, boolean)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param lines  show lines between data items?\r\n     * @param shapes  show a shape for each data item?\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.getAlpha()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the alpha transparency for the background shading.\r\n     * \r\n     * @return The alpha transparency.\r\n     * \r\n     * @see #setAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.setAlpha(float)",
      "begin_line": 144,
      "end_line": 151,
      "comment": "\r\n     * Sets the alpha transparency for the background shading, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param alpha   the alpha (in the range 0.0f to 1.0f).\r\n     * \r\n     * @see #getAlpha()\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 27)",
        "(line 150,col 9)-(line 150,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.setDrawSeriesLineAsPath(boolean)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * This method is overridden so that this flag cannot be changed---it is\r\n     * set to \u003ccode\u003etrue\u003c/code\u003e for this renderer.\r\n     * \r\n     * @param flag  ignored.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\r\n     * Initialises and returns a state object that can be passed to each\r\n     * invocation of the {@link #drawItem} method.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param info  the plot rendering info.\r\n     * \r\n     * @return A newly initialised state object.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 178,col 45)",
        "(line 179,col 9)-(line 179,col 48)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.getPassCount()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the number of passes (through the dataset) used by this \r\n     * renderer.\r\n     * \r\n     * @return \u003ccode\u003e3\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.isItemPass(int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this is the pass where the shapes are\r\n     * drawn.\r\n     * \r\n     * @param pass  the pass index.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isLinePass(int)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.isLinePass(int)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this is the pass where the lines are\r\n     * drawn.\r\n     * \r\n     * @param pass  the pass index.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isItemPass(int)\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 239,
      "end_line": 342,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 258,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.DeviationRenderer.equals(java.lang.Object)",
      "begin_line": 351,
      "end_line": 363,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 33)"
      ]
    }
  ]
}