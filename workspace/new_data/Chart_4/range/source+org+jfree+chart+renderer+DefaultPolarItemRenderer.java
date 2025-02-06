{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/DefaultPolarItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPolarItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer",
        "org.jfree.chart.renderer.PolarItemRenderer"
      ],
      "begin_line": 82,
      "end_line": 341,
      "comment": "\r\n * A renderer that can be used with the {@link PolarPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The plot that the renderer is assigned to. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesFilled"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Flags that control whether the renderer fills each series or not. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.DefaultPolarItemRenderer()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a new instance of DefaultPolarItemRenderer\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.setPlot(org.jfree.chart.plot.PolarPlot)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Set the plot associated with this renderer.\r\n     *\r\n     * @param plot  the plot.\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.getPlot()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Return the plot associated with this renderer.\r\n     *\r\n     * @return The plot.\r\n     *\r\n     * @see #setPlot(PolarPlot)\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.getDrawingSupplier()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.isSeriesFilled(int)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should fill the specified\r\n     * series, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 31)",
        "(line 144,col 9)-(line 144,col 57)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.setSeriesFilled(int, boolean)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Sets a flag that controls whether or not a series is filled.\r\n     *\r\n     * @param series  the series index.\r\n     * @param filled  the flag.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.drawSeries(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.PolarPlot, org.jfree.data.xy.XYDataset, int)",
      "begin_line": 171,
      "end_line": 199,
      "comment": "\r\n     * Plots the data for a given series.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param dataArea  the data area.\r\n     * @param info  collects plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param dataset  the dataset.\r\n     * @param seriesIndex  the series index.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 58)",
        "(line 180,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.drawAngularGridLines(java.awt.Graphics2D, org.jfree.chart.plot.PolarPlot, java.util.List, java.awt.geom.Rectangle2D)",
      "begin_line": 209,
      "end_line": 238,
      "comment": "\r\n     * Draw the angular gridlines - the spokes.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param plot  the plot.\r\n     * @param ticks  the ticks.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 45)",
        "(line 215,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 216,col 50)",
        "(line 218,col 9)-(line 218,col 56)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 221,col 9)-(line 222,col 26)",
        "(line 223,col 9)-(line 223,col 45)",
        "(line 224,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.drawRadialGridLines(java.awt.Graphics2D, org.jfree.chart.plot.PolarPlot, org.jfree.chart.axis.ValueAxis, java.util.List, java.awt.geom.Rectangle2D)",
      "begin_line": 249,
      "end_line": 276,
      "comment": "\r\n     * Draw the radial gridlines - the rings.\r\n     *\r\n     * @param g2  the drawing surface.\r\n     * @param plot  the plot.\r\n     * @param radialAxis  the radial axis.\r\n     * @param ticks  the ticks.\r\n     * @param dataArea  the data area.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 50)",
        "(line 256,col 9)-(line 256,col 51)",
        "(line 257,col 9)-(line 257,col 53)",
        "(line 259,col 9)-(line 259,col 52)",
        "(line 260,col 9)-(line 261,col 26)",
        "(line 263,col 9)-(line 263,col 45)",
        "(line 264,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.getLegendItem(int)",
      "begin_line": 285,
      "end_line": 303,
      "comment": "\r\n     * Return the legend for the given series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.equals(java.lang.Object)",
      "begin_line": 313,
      "end_line": 325,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this renderer is equal to \u003ccode\u003eobj\u003c/code\u003e,\r\n     *     and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 71)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.DefaultPolarItemRenderer.clone()",
      "begin_line": 334,
      "end_line": 339,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 336,col 59)",
        "(line 337,col 9)-(line 337,col 69)",
        "(line 338,col 9)-(line 338,col 21)"
      ]
    }
  ]
}