{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/ClusteredXYBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClusteredXYBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYBarRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 96,
      "end_line": 352,
      "comment": "\r\n * An extension of {@link XYBarRenderer} that displays bars for different\r\n * series values at the same x next to each other. The assumption here is\r\n * that for each x (time or else) there is a y value for each series. If\r\n * this is not the case, there will be spaces between bars for a given x.\r\n * \u003cP\u003e\r\n * This renderer does not include code to calculate the crosshair point for the\r\n * plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "centerBarAtStartValue"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Determines whether bar center should be interval start. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.ClusteredXYBarRenderer()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Default constructor. Bar margin is set to 0.0.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.ClusteredXYBarRenderer(double, boolean)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\r\n     * Constructs a new XY clustered bar renderer.\r\n     *\r\n     * @param margin  the percentage amount to trim from the width of each bar.\r\n     * @param centerBarAtStartValue  if true, bars will be centered on the start \r\n     *                               of the time period.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 22)",
        "(line 122,col 9)-(line 122,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 132,
      "end_line": 143,
      "comment": "\r\n     * Returns the x-value bounds for the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The bounds (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.findDomainBoundsWithOffset(org.jfree.data.xy.IntervalXYDataset)",
      "begin_line": 154,
      "end_line": 182,
      "comment": "\r\n     * Iterates over the items in an {@link IntervalXYDataset} to find\r\n     * the range of x-values including the interval OFFSET so that it centers\r\n     * the interval around the start value. \r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *   \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 51)",
        "(line 161,col 9)-(line 161,col 22)",
        "(line 162,col 9)-(line 162,col 22)",
        "(line 163,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 207,
      "end_line": 315,
      "comment": "\r\n     * Draws the visual representation of a single data item. This method\r\n     * is mostly copied from the superclass, the change is that in the\r\n     * calculated space for a singe bar we draw bars for each series next to\r\n     * each other. The width of each bar is the available width divided by\r\n     * the number of series. Bars for each series are drawn in order left to\r\n     * right.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 72)",
        "(line 220,col 9)-(line 220,col 18)",
        "(line 221,col 9)-(line 221,col 18)",
        "(line 222,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 237,col 41)",
        "(line 239,col 9)-(line 239,col 63)",
        "(line 240,col 9)-(line 240,col 65)",
        "(line 241,col 9)-(line 241,col 75)",
        "(line 243,col 9)-(line 243,col 63)",
        "(line 244,col 9)-(line 244,col 75)",
        "(line 246,col 9)-(line 246,col 37)",
        "(line 247,col 9)-(line 247,col 27)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 31)",
        "(line 252,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 260,col 9)-(line 260,col 60)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 263,col 9)-(line 263,col 54)",
        "(line 265,col 9)-(line 265,col 31)",
        "(line 266,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 53)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 31)",
        "(line 292,col 9)-(line 292,col 21)",
        "(line 293,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 307,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.equals(java.lang.Object)",
      "begin_line": 327,
      "end_line": 339,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object, returning\r\n     * \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eobj\u003c/code\u003e is a \r\n     * \u003ccode\u003eClusteredXYBarRenderer\u003c/code\u003e with the same settings as this\r\n     * renderer, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 67)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer.clone()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 29)"
      ]
    }
  ]
}