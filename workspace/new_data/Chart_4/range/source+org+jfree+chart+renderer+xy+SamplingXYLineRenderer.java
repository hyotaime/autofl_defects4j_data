{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/xy/SamplingXYLineRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SamplingXYLineRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 365,
      "comment": "\n * A renderer that draws line charts.  The renderer doesn\u0027t necessarily plot\n * every data item - instead, it tries to plot only those data items that\n * make a difference to the visual output (the other data items are skipped).\n * This renderer is designed for use with the {@link XYPlot} class.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "legendLine"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The shape that is used to represent a line in the legend. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.SamplingXYLineRenderer()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Creates a new renderer.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 65)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.getPassCount()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns the number of passes through the data that the renderer requires\n     * in order to draw the chart.  Most charts will require a single pass, but\n     * some require two passes.\n     *\n     * @return The pass count.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "State",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 108,
      "end_line": 175,
      "comment": "\n     * Records the state for the renderer.  This is used to preserve state\n     * information between calls to the drawItem() method for a single chart\n     * drawing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesPath"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The path for the current series. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalPath"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n         * A second path that draws vertical intervals to cover any extreme\n         * values.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dX"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n         * The minimum change in the x-value needed to trigger an update to\n         * the seriesPath.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lastX"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The last x-coordinate visited by the seriesPath. "
    },
    {
      "type": "field",
      "varNames": [
        "openY"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The initial y-coordinate for the current x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "highY"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The highest y-coordinate for the current x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "lowY"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The lowest y-coordinate for the current x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "closeY"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The final y-coordinate for the current x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "lastPointGood"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n         * A flag that indicates if the last (x, y) point was \u0027good\u0027\n         * (non-null).\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State.State(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n         * Creates a new state instance.\n         *\n         * @param info  the plot rendering info.\n         ",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.State.startSeriesPass(org.jfree.data.xy.XYDataset, int, int, int, int, int)",
      "begin_line": 166,
      "end_line": 173,
      "comment": "\n         * This method is called by the {@link XYPlot} at the start of each\n         * series pass.  We reset the state for the current series.\n         *\n         * @param dataset  the dataset.\n         * @param series  the series index.\n         * @param firstItem  the first item index for this pass.\n         * @param lastItem  the last item index for this pass.\n         * @param pass  the current pass index.\n         * @param passCount  the number of passes.\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 36)",
        "(line 169,col 13)-(line 169,col 38)",
        "(line 170,col 13)-(line 170,col 39)",
        "(line 171,col 13)-(line 172,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 193,
      "end_line": 207,
      "comment": "\n     * Initialises the renderer.\n     * \u003cP\u003e\n     * This method will be called before the first item is rendered, giving the\n     * renderer an opportunity to initialise any state information it wants to\n     * maintain.  The renderer can do nothing if it chooses.\n     *\n     * @param g2  the graphics device.\n     * @param dataArea  the area inside the axes.\n     * @param plot  the plot.\n     * @param data  the data.\n     * @param info  an optional info collection object to return data back to\n     *              the caller.\n     *\n     * @return The renderer state.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 24)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 45)",
        "(line 204,col 9)-(line 204,col 47)",
        "(line 205,col 9)-(line 205,col 30)",
        "(line 206,col 9)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 224,
      "end_line": 298,
      "comment": "\n     * Draws the visual representation of a single data item.\n     *\n     * @param g2  the graphics device.\n     * @param state  the renderer state.\n     * @param dataArea  the area within which the data is being drawn.\n     * @param plot  the plot (can be used to obtain standard color\n     *              information etc).\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param dataset  the dataset.\n     * @param series  the series index (zero-based).\n     * @param item  the item index (zero-based).\n     * @param pass  the pass index.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 63)",
        "(line 234,col 9)-(line 234,col 62)",
        "(line 237,col 9)-(line 237,col 52)",
        "(line 238,col 9)-(line 238,col 52)",
        "(line 239,col 9)-(line 239,col 79)",
        "(line 240,col 9)-(line 240,col 78)",
        "(line 242,col 9)-(line 242,col 32)",
        "(line 244,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.clone()",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\n     * Returns a clone of the renderer.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if the clone cannot be created.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 78)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.equals(java.lang.Object)",
      "begin_line": 322,
      "end_line": 337,
      "comment": "\n     * Tests this renderer for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 67)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 347,
      "end_line": 351,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 35)",
        "(line 350,col 9)-(line 350,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.SamplingXYLineRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 36)",
        "(line 362,col 9)-(line 362,col 60)"
      ]
    }
  ]
}