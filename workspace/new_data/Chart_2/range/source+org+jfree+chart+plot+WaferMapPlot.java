{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/WaferMapPlot.java",
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
      "begin_line": 76,
      "end_line": 434,
      "comment": "\r\n * A wafer map plot.\r\n "
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
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 83,
      "end_line": 88,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 104,
      "end_line": 106,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The plot orientation.\r\n     *  vertical \u003d notch down\r\n     *  horizontal \u003d notch right\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "renderer"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\r\n     * Object responsible for drawing the visual representation of each point\r\n     * on the plot.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Creates a new plot with no dataset.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot(org.jfree.data.general.WaferMapDataset)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.WaferMapPlot.WaferMapPlot(org.jfree.data.general.WaferMapDataset, org.jfree.chart.renderer.WaferMapRenderer)",
      "begin_line": 145,
      "end_line": 162,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 16)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 151,col 9)-(line 151,col 31)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getPlotType()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getDataset()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the dataset\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.setDataset(org.jfree.data.general.WaferMapDataset)",
      "begin_line": 188,
      "end_line": 206,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 196,col 9)-(line 196,col 31)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 204,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.setRenderer(org.jfree.chart.renderer.WaferMapRenderer)",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\r\n     * Sets the item renderer, and notifies all listeners of a change to the\r\n     * plot.  If the renderer is set to \u003ccode\u003enull\u003c/code\u003e, no chart will be\r\n     * drawn.\r\n     *\r\n     * @param renderer  the new renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 235,
      "end_line": 258,
      "comment": "\r\n     * Draws the wafermap view.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param state  the plot state.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 64)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 252,col 9)-(line 252,col 45)",
        "(line 253,col 9)-(line 253,col 26)",
        "(line 255,col 9)-(line 255,col 31)",
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.drawChipGrid(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 266,
      "end_line": 332,
      "comment": "\r\n     * Calculates and draws the chip locations on the wafer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 269,col 43)",
        "(line 270,col 9)-(line 270,col 52)",
        "(line 271,col 9)-(line 271,col 24)",
        "(line 272,col 9)-(line 272,col 24)",
        "(line 273,col 9)-(line 273,col 26)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 40)",
        "(line 281,col 9)-(line 281,col 30)",
        "(line 282,col 9)-(line 282,col 31)",
        "(line 283,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getWaferEdge(java.awt.geom.Rectangle2D)",
      "begin_line": 341,
      "end_line": 370,
      "comment": "\r\n     * Calculates the location of the waferedge.\r\n     *\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The wafer edge.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 48)",
        "(line 343,col 9)-(line 343,col 46)",
        "(line 344,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 347,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 66)",
        "(line 369,col 9)-(line 369,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.drawWaferEdge(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 378,
      "end_line": 414,
      "comment": "\r\n     * Draws the waferedge, including the notch.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 382,col 27)",
        "(line 386,col 9)-(line 386,col 27)",
        "(line 387,col 9)-(line 387,col 54)",
        "(line 388,col 9)-(line 388,col 60)",
        "(line 389,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 33)",
        "(line 410,col 9)-(line 410,col 23)",
        "(line 411,col 9)-(line 411,col 33)",
        "(line 412,col 9)-(line 412,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.getLegendItems()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Return the legend items from the renderer.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.WaferMapPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\r\n     * Notifies all registered listeners of a renderer change.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 26)"
      ]
    }
  ]
}