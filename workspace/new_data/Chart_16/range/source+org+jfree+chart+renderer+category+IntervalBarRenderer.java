{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/IntervalBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "org.jfree.chart.renderer.category.CategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 278,
      "comment": "\r\n * A renderer that handles the drawing of bars for a bar plot where\r\n * each bar has a high and low value.\r\n * \u003cp\u003e\r\n * For use with the {@link CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.IntervalBarRenderer.IntervalBarRenderer()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.IntervalBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 119,
      "end_line": 140,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 130,col 10)-(line 138,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.IntervalBarRenderer.drawInterval(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.IntervalCategoryDataset, int, int)",
      "begin_line": 155,
      "end_line": 276,
      "comment": "\r\n      * Draws a single interval.\r\n      *\r\n      * @param g2  the graphics device.\r\n      * @param state  the renderer state.\r\n      * @param dataArea  the data plot area.\r\n      * @param plot  the plot.\r\n      * @param domainAxis  the domain axis.\r\n      * @param rangeAxis  the range axis.\r\n      * @param dataset  the data.\r\n      * @param row  the row index (zero-based).\r\n      * @param column  the column index (zero-based).\r\n      ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 40)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 168,col 9)-(line 168,col 60)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 174,col 66)",
        "(line 177,col 9)-(line 177,col 57)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 10)",
        "(line 186,col 9)-(line 186,col 59)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 191,col 67)",
        "(line 193,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 206,col 9)-(line 206,col 66)",
        "(line 208,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 246,col 28)",
        "(line 247,col 9)-(line 247,col 54)",
        "(line 248,col 9)-(line 248,col 33)",
        "(line 249,col 9)-(line 249,col 21)",
        "(line 252,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 264,col 24)",
        "(line 265,col 9)-(line 268,col 9)",
        "(line 271,col 9)-(line 271,col 64)",
        "(line 272,col 9)-(line 274,col 9)"
      ]
    }
  ]
}