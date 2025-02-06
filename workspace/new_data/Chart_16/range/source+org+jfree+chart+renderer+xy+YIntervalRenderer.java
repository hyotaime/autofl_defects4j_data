{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/YIntervalRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YIntervalRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 228,
      "comment": "\r\n * A renderer that draws a line connecting the start and end Y values for an \r\n * {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.YIntervalRenderer.YIntervalRenderer()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * The default constructor.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.YIntervalRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 111,
      "end_line": 174,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index (ignored here).\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 41)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 72)",
        "(line 132,col 9)-(line 132,col 59)",
        "(line 133,col 9)-(line 133,col 69)",
        "(line 134,col 9)-(line 134,col 67)",
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 140,col 78)",
        "(line 141,col 9)-(line 141,col 80)",
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 60)",
        "(line 151,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 23)",
        "(line 162,col 9)-(line 162,col 24)",
        "(line 163,col 9)-(line 163,col 22)",
        "(line 165,col 9)-(line 165,col 21)",
        "(line 166,col 9)-(line 166,col 24)",
        "(line 169,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.YIntervalRenderer.getLegendItem(int, int)",
      "begin_line": 185,
      "end_line": 215,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses\r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 33)",
        "(line 187,col 9)-(line 187,col 34)",
        "(line 188,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.YIntervalRenderer.clone()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 29)"
      ]
    }
  ]
}