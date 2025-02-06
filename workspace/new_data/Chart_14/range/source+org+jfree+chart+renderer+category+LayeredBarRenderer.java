{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/LayeredBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LayeredBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 470,
      "comment": "\r\n * A {@link CategoryItemRenderer} that represents data using bars which are \r\n * superimposed.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesBarWidthList"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " A list of the width of each series bar. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.LayeredBarRenderer()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 16)",
        "(line 93,col 9)-(line 93,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.getSeriesBarWidth(int)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\r\n     * Returns the bar width for a series, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no\r\n     * width has been set.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The width for the series (1.0\u003d100%, it is the maximum).\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 106,col 64)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.setSeriesBarWidth(int, double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Sets the width of the bars of a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param width  the width of the series bar in percentage (1.0\u003d100%, it is \r\n     *               the maximum).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 132,
      "end_line": 169,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 69)",
        "(line 142,col 9)-(line 142,col 65)",
        "(line 143,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 185,
      "end_line": 206,
      "comment": "\r\n     * Draws the bar for one item in the dataset.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain (category) axis.\r\n     * @param rangeAxis  the range (value) axis.\r\n     * @param data  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 60)",
        "(line 197,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.drawHorizontalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 221,
      "end_line": 334,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 57)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 238,col 9)-(line 238,col 47)",
        "(line 239,col 9)-(line 239,col 26)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 53)",
        "(line 272,col 9)-(line 272,col 71)",
        "(line 273,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 274,col 50)",
        "(line 275,col 9)-(line 275,col 55)",
        "(line 278,col 9)-(line 279,col 80)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 284,col 9)-(line 284,col 27)",
        "(line 285,col 9)-(line 285,col 32)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 55)",
        "(line 292,col 9)-(line 292,col 70)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 299,col 68)",
        "(line 301,col 9)-(line 301,col 52)",
        "(line 302,col 9)-(line 302,col 67)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 310,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 329,col 64)",
        "(line 330,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.LayeredBarRenderer.drawVerticalItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 349,
      "end_line": 468,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 57)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 367,col 80)",
        "(line 369,col 9)-(line 369,col 40)",
        "(line 372,col 9)-(line 372,col 47)",
        "(line 373,col 9)-(line 373,col 26)",
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 377,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 53)",
        "(line 407,col 9)-(line 407,col 71)",
        "(line 408,col 9)-(line 408,col 72)",
        "(line 409,col 9)-(line 409,col 50)",
        "(line 411,col 9)-(line 411,col 47)",
        "(line 412,col 9)-(line 412,col 56)",
        "(line 415,col 9)-(line 415,col 27)",
        "(line 416,col 9)-(line 416,col 24)",
        "(line 417,col 9)-(line 417,col 33)",
        "(line 418,col 9)-(line 418,col 55)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 54)",
        "(line 423,col 9)-(line 423,col 70)",
        "(line 424,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 431,col 75)",
        "(line 432,col 9)-(line 432,col 52)",
        "(line 433,col 9)-(line 433,col 67)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 31)",
        "(line 438,col 9)-(line 438,col 21)",
        "(line 441,col 9)-(line 450,col 9)",
        "(line 453,col 9)-(line 453,col 71)",
        "(line 454,col 9)-(line 454,col 72)",
        "(line 456,col 9)-(line 457,col 49)",
        "(line 458,col 9)-(line 461,col 9)",
        "(line 464,col 9)-(line 464,col 64)",
        "(line 465,col 9)-(line 467,col 9)"
      ]
    }
  ]
}