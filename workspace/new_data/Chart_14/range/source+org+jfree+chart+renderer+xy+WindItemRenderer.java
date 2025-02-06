{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/WindItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WindItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 213,
      "comment": "\r\n * A specialised renderer for displaying wind intensity/direction data.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.WindItemRenderer.WindItemRenderer()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.WindItemRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 116,
      "end_line": 200,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param plotArea  the area within which the plot is being drawn.\r\n     * @param info  optional information collection.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the horizontal axis.\r\n     * @param rangeAxis  the vertical axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 53)",
        "(line 131,col 9)-(line 131,col 55)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 139,col 9)-(line 139,col 65)",
        "(line 140,col 9)-(line 140,col 60)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 143,col 9)-(line 143,col 78)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 66)",
        "(line 149,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 72)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 156,col 9)-(line 156,col 75)",
        "(line 157,col 9)-(line 157,col 73)",
        "(line 159,col 9)-(line 159,col 38)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 60)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 32)",
        "(line 166,col 9)-(line 166,col 42)",
        "(line 168,col 9)-(line 168,col 58)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 35)",
        "(line 173,col 9)-(line 173,col 38)",
        "(line 174,col 9)-(line 174,col 42)",
        "(line 176,col 9)-(line 177,col 40)",
        "(line 178,col 9)-(line 179,col 26)",
        "(line 180,col 9)-(line 180,col 61)",
        "(line 182,col 9)-(line 182,col 77)",
        "(line 183,col 9)-(line 183,col 75)",
        "(line 185,col 9)-(line 185,col 55)",
        "(line 186,col 9)-(line 186,col 22)",
        "(line 188,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 191,col 34)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 75)",
        "(line 197,col 9)-(line 197,col 55)",
        "(line 198,col 9)-(line 198,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.WindItemRenderer.clone()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 29)"
      ]
    }
  ]
}