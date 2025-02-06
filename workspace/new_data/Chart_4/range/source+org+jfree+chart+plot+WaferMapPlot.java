{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/WaferMapPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WaferMapPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 431,
      "comment": "\r\n * A wafer map plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 82,
      "end_line": 87,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 103,
      "end_line": 105,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The plot orientation.\r\n     *  vertical \u003d notch down\r\n     *  horizontal \u003d notch right\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\r\n     * Object responsible for drawing the visual representation of each point\r\n     * on the plot.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Creates a new plot with no dataset.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot(org.jfree.data.general.WaferMapDataset)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot(org.jfree.data.general.WaferMapDataset, org.jfree.chart.renderer.WaferMapRenderer)",
      "begin_line": 144,
      "end_line": 161,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 16)",
        "(line 148,col 9)-(line 148,col 52)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getPlotType()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getDataset()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns the dataset\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.setDataset(org.jfree.data.general.WaferMapDataset)",
      "begin_line": 187,
      "end_line": 203,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 195,col 31)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.setRenderer(org.jfree.chart.renderer.WaferMapRenderer)",
      "begin_line": 212,
      "end_line": 221,
      "comment": "\r\n     * Sets the item renderer, and notifies all listeners of a change to the\r\n     * plot.  If the renderer is set to \u003ccode\u003enull\u003c/code\u003e, no chart will be\r\n     * drawn.\r\n     *\r\n     * @param renderer  the new renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 232,
      "end_line": 255,
      "comment": "\r\n     * Draws the wafermap view.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param state  the plot state.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 64)",
        "(line 238,col 9)-(line 238,col 66)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 249,col 45)",
        "(line 250,col 9)-(line 250,col 26)",
        "(line 252,col 9)-(line 252,col 31)",
        "(line 253,col 9)-(line 253,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.drawChipGrid(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 263,
      "end_line": 329,
      "comment": "\r\n     * Calculates and draws the chip locations on the wafer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 39)",
        "(line 266,col 9)-(line 266,col 43)",
        "(line 267,col 9)-(line 267,col 52)",
        "(line 268,col 9)-(line 268,col 24)",
        "(line 269,col 9)-(line 269,col 24)",
        "(line 270,col 9)-(line 270,col 26)",
        "(line 271,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 31)",
        "(line 280,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getWaferEdge(java.awt.geom.Rectangle2D)",
      "begin_line": 338,
      "end_line": 367,
      "comment": "\r\n     * Calculates the location of the waferedge.\r\n     *\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The wafer edge.\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 48)",
        "(line 340,col 9)-(line 340,col 46)",
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 44)",
        "(line 344,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 66)",
        "(line 366,col 9)-(line 366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.drawWaferEdge(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 375,
      "end_line": 411,
      "comment": "\r\n     * Draws the waferedge, including the notch.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 378,col 33)",
        "(line 379,col 9)-(line 379,col 27)",
        "(line 383,col 9)-(line 383,col 27)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 33)",
        "(line 407,col 9)-(line 407,col 23)",
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 409,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getLegendItems()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\r\n     * Return the legend items from the renderer.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\r\n     * Notifies all registered listeners of a renderer change.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 26)"
      ]
    }
  ]
}