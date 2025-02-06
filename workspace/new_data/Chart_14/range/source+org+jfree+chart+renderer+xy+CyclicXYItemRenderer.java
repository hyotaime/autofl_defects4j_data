{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/CyclicXYItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CyclicXYItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 505,
      "comment": "\r\n * The Cyclic XY item renderer is specially designed to handle cyclic axis. \r\n * While the standard renderer would draw a line across the plot when a cycling \r\n * occurs, the cyclic renderer splits the line at each cycle end instead. This \r\n * is done by interpolating new points at cycle boundary. Thus, correct \r\n * appearance is restored. \r\n * \r\n * The Cyclic XY item renderer works exactly like a standard XY item renderer \r\n * with non-cyclic axis. \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param type  the renderer type.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param type  the renderer type.\r\n     * @param labelGenerator  the tooltip generator.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param type  the renderer type.\r\n     * @param labelGenerator  the tooltip generator.\r\n     * @param urlGenerator  the url generator.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 143,
      "end_line": 325,
      "comment": " \r\n     * Draws the visual representation of a single data item.\r\n     * When using cyclic axis, do not draw a line from right to left when \r\n     * cycling as would a standard XY item renderer, but instead draw a line \r\n     * from the previous point to the cycle bound in the last cycle, and a line\r\n     * from the cycle bound to current point in the current cycle.  \r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 161,col 9)",
        "(line 164,col 9)-(line 164,col 56)",
        "(line 165,col 9)-(line 165,col 56)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 35)",
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 175,col 9)-(line 175,col 18)",
        "(line 178,col 9)-(line 178,col 45)",
        "(line 179,col 9)-(line 179,col 45)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 18)",
        "(line 185,col 9)-(line 185,col 18)",
        "(line 188,col 9)-(line 188,col 40)",
        "(line 189,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 190,col 61)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 193,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 70)",
        "(line 258,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 277,col 10)",
        "(line 279,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 296,col 57)",
        "(line 298,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OverwriteDataSet",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 330,
      "end_line": 503,
      "comment": " \r\n     * A dataset to hold the interpolated points when drawing new lines. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegateSet"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " The delegate dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Storage for the x and y values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.OverwriteDataSet(double[], double[], org.jfree.data.xy.XYDataset)",
      "begin_line": 345,
      "end_line": 353,
      "comment": "\r\n         * Creates a new dataset.\r\n         * \r\n         * @param x  the x values.\r\n         * @param y  the y values.\r\n         * @param delegateSet  the dataset.\r\n         ",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 43)",
        "(line 348,col 13)-(line 348,col 42)",
        "(line 348,col 44)-(line 348,col 73)",
        "(line 349,col 13)-(line 352,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getDomainOrder()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n         * Returns the order of the domain (X) values.\r\n         * \r\n         * @return The domain order.\r\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getItemCount(int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n         * Returns the number of items for the given series.\r\n         * \r\n         * @param series  the series index (zero-based).\r\n         * \r\n         * @return The item count.\r\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getX(int, int)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\r\n         * Returns the x-value.\r\n         * \r\n         * @param series  the series index (zero-based).\r\n         * @param item  the item index (zero-based).\r\n         * \r\n         * @return The x-value.\r\n         ",
      "child_ranges": [
        "(line 384,col 13)-(line 384,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getXValue(int, int)",
      "begin_line": 396,
      "end_line": 403,
      "comment": "\r\n         * Returns the x-value (as a double primitive) for an item within a \r\n         * series.\r\n         * \r\n         * @param series  the series (zero-based index).\r\n         * @param item  the item (zero-based index).\r\n         * \r\n         * @return The x-value.\r\n         ",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 39)",
        "(line 398,col 13)-(line 398,col 42)",
        "(line 399,col 13)-(line 401,col 13)",
        "(line 402,col 13)-(line 402,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getY(int, int)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\r\n         * Returns the y-value.\r\n         * \r\n         * @param series  the series index (zero-based).\r\n         * @param item  the item index (zero-based).\r\n         * \r\n         * @return The y-value.\r\n         ",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getYValue(int, int)",
      "begin_line": 426,
      "end_line": 433,
      "comment": "\r\n         * Returns the y-value (as a double primitive) for an item within a \r\n         * series.\r\n         * \r\n         * @param series  the series (zero-based index).\r\n         * @param item  the item (zero-based index).\r\n         * \r\n         * @return The y-value.\r\n         ",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 39)",
        "(line 428,col 13)-(line 428,col 42)",
        "(line 429,col 13)-(line 431,col 13)",
        "(line 432,col 13)-(line 432,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getSeriesCount()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\r\n         * Returns the number of series in the dataset.\r\n         * \r\n         * @return The series count.\r\n         ",
      "child_ranges": [
        "(line 441,col 13)-(line 441,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getSeriesKey(int)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\r\n         * Returns the name of the given series.\r\n         * \r\n         * @param series  the series index (zero-based).\r\n         * \r\n         * @return The series name.\r\n         ",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.indexOf(java.lang.Comparable)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\r\n         * Returns the index of the named series, or -1.\r\n         * \r\n         * @param seriesName  the series name.\r\n         * \r\n         * @return The index.\r\n         ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.addChangeListener(org.jfree.data.general.DatasetChangeListener)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\r\n         * Does nothing.\r\n         * \r\n         * @param listener  ignored.\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.removeChangeListener(org.jfree.data.general.DatasetChangeListener)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n         * Does nothing.\r\n         * \r\n         * @param listener  ignored.\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getGroup()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\r\n         * Returns the dataset group.\r\n         * \r\n         * @return The dataset group.\r\n         ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.setGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n         * Does nothing.\r\n         * \r\n         * @param group  ignored.\r\n         ",
      "child_ranges": []
    }
  ]
}