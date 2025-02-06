{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/CyclicXYItemRenderer.java",
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
      "end_line": 492,
      "comment": "\r\n * The Cyclic XY item renderer is specially designed to handle cyclic axis.\r\n * While the standard renderer would draw a line across the plot when a cycling\r\n * occurs, the cyclic renderer splits the line at each cycle end instead. This\r\n * is done by interpolating new points at cycle boundary. Thus, correct\r\n * appearance is restored.\r\n *\r\n * The Cyclic XY item renderer works exactly like a standard XY item renderer\r\n * with non-cyclic axis.\r\n "
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
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param type  the renderer type.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param type  the renderer type.\r\n     * @param labelGenerator  the tooltip generator.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.CyclicXYItemRenderer(int, org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param type  the renderer type.\r\n     * @param labelGenerator  the tooltip generator.\r\n     * @param urlGenerator  the url generator.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 140,
      "end_line": 312,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     * When using cyclic axis, do not draw a line from right to left when\r\n     * cycling as would a standard XY item renderer, but instead draw a line\r\n     * from the previous point to the cycle bound in the last cycle, and a line\r\n     * from the cycle bound to current point in the current cycle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param pass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 150,col 9)",
        "(line 153,col 9)-(line 153,col 56)",
        "(line 154,col 9)-(line 154,col 56)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 18)",
        "(line 164,col 9)-(line 164,col 18)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 18)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 177,col 9)-(line 177,col 40)",
        "(line 178,col 9)-(line 178,col 40)",
        "(line 179,col 9)-(line 179,col 61)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 182,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 70)",
        "(line 247,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 264,col 51)",
        "(line 266,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 283,col 51)",
        "(line 285,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OverwriteDataSet",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 317,
      "end_line": 490,
      "comment": "\r\n     * A dataset to hold the interpolated points when drawing new lines.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegateSet"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " The delegate dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Storage for the x and y values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.OverwriteDataSet(double[], double[], org.jfree.data.xy.XYDataset)",
      "begin_line": 332,
      "end_line": 340,
      "comment": "\r\n         * Creates a new dataset.\r\n         *\r\n         * @param x  the x values.\r\n         * @param y  the y values.\r\n         * @param delegateSet  the dataset.\r\n         ",
      "child_ranges": [
        "(line 334,col 13)-(line 334,col 43)",
        "(line 335,col 13)-(line 335,col 42)",
        "(line 335,col 44)-(line 335,col 73)",
        "(line 336,col 13)-(line 339,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getDomainOrder()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n         * Returns the order of the domain (X) values.\r\n         *\r\n         * @return The domain order.\r\n         ",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getItemCount(int)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n         * Returns the number of items for the given series.\r\n         *\r\n         * @param series  the series index (zero-based).\r\n         *\r\n         * @return The item count.\r\n         ",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getX(int, int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n         * Returns the x-value.\r\n         *\r\n         * @param series  the series index (zero-based).\r\n         * @param item  the item index (zero-based).\r\n         *\r\n         * @return The x-value.\r\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getXValue(int, int)",
      "begin_line": 383,
      "end_line": 390,
      "comment": "\r\n         * Returns the x-value (as a double primitive) for an item within a\r\n         * series.\r\n         *\r\n         * @param series  the series (zero-based index).\r\n         * @param item  the item (zero-based index).\r\n         *\r\n         * @return The x-value.\r\n         ",
      "child_ranges": [
        "(line 384,col 13)-(line 384,col 39)",
        "(line 385,col 13)-(line 385,col 42)",
        "(line 386,col 13)-(line 388,col 13)",
        "(line 389,col 13)-(line 389,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getY(int, int)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\r\n         * Returns the y-value.\r\n         *\r\n         * @param series  the series index (zero-based).\r\n         * @param item  the item index (zero-based).\r\n         *\r\n         * @return The y-value.\r\n         ",
      "child_ranges": [
        "(line 401,col 13)-(line 401,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getYValue(int, int)",
      "begin_line": 413,
      "end_line": 420,
      "comment": "\r\n         * Returns the y-value (as a double primitive) for an item within a\r\n         * series.\r\n         *\r\n         * @param series  the series (zero-based index).\r\n         * @param item  the item (zero-based index).\r\n         *\r\n         * @return The y-value.\r\n         ",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 39)",
        "(line 415,col 13)-(line 415,col 42)",
        "(line 416,col 13)-(line 418,col 13)",
        "(line 419,col 13)-(line 419,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getSeriesCount()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\r\n         * Returns the number of series in the dataset.\r\n         *\r\n         * @return The series count.\r\n         ",
      "child_ranges": [
        "(line 428,col 13)-(line 428,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getSeriesKey(int)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\r\n         * Returns the name of the given series.\r\n         *\r\n         * @param series  the series index (zero-based).\r\n         *\r\n         * @return The series name.\r\n         ",
      "child_ranges": [
        "(line 439,col 13)-(line 439,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.indexOf(java.lang.Comparable)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\r\n         * Returns the index of the named series, or -1.\r\n         *\r\n         * @param seriesName  the series name.\r\n         *\r\n         * @return The index.\r\n         ",
      "child_ranges": [
        "(line 450,col 13)-(line 450,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.addChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\r\n         * Does nothing.\r\n         *\r\n         * @param listener  ignored.\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.removeChangeListener(org.jfree.data.event.DatasetChangeListener)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n         * Does nothing.\r\n         *\r\n         * @param listener  ignored.\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.getGroup()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\r\n         * Returns the dataset group.\r\n         *\r\n         * @return The dataset group.\r\n         ",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CyclicXYItemRenderer.OverwriteDataSet.setGroup(org.jfree.data.general.DatasetGroup)",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\r\n         * Does nothing.\r\n         *\r\n         * @param group  ignored.\r\n         ",
      "child_ranges": []
    }
  ]
}