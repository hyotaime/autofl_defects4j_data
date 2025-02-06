{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/WaterfallBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WaterfallBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer"
      ],
      "begin_line": 96,
      "end_line": 533,
      "comment": "\r\n * A renderer that handles the drawing of waterfall bar charts, for use with \r\n * the {@link CategoryPlot} class.  Some quirks to note:\r\n * \u003cul\u003e\r\n * \u003cli\u003ethe value in the last category of the dataset should be (redundantly) \r\n *   specified as the sum of the items in the preceding categories - otherwise\r\n *   the final bar in the plot will be incorrectly plotted;\u003c/li\u003e\r\n * \u003cli\u003ethe bar colors are defined using special methods in this class - the \r\n *   inherited methods (for example, \r\n *   {@link AbstractRenderer#setSeriesPaint(int, Paint)}) are ignored;\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "firstBarPaint"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The paint used to draw the first bar. "
    },
    {
      "type": "field",
      "varNames": [
        "lastBarPaint"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The paint used to draw the last bar. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveBarPaint"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The paint used to draw bars having positive values. "
    },
    {
      "type": "field",
      "varNames": [
        "negativeBarPaint"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The paint used to draw bars having negative values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.WaterfallBarRenderer()",
      "begin_line": 116,
      "end_line": 125,
      "comment": "\r\n     * Constructs a new renderer with default values for the bar colors.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 124,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.WaterfallBarRenderer(java.awt.Paint, java.awt.Paint, java.awt.Paint, java.awt.Paint)",
      "begin_line": 139,
      "end_line": 165,
      "comment": "\r\n     * Constructs a new waterfall renderer.\r\n     *\r\n     * @param firstBarPaint  the color of the first bar (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param positiveBarPaint  the color for bars with positive values \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param negativeBarPaint  the color for bars with negative values \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lastBarPaint  the color of the last bar (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 16)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 49)",
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 163,col 61)",
        "(line 164,col 9)-(line 164,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 175,
      "end_line": 213,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 36)",
        "(line 183,col 9)-(line 183,col 29)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getFirstBarPaint()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Returns the paint used to draw the first bar.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setFirstBarPaint(java.awt.Paint)",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\r\n     * Sets the paint that will be used to draw the first bar and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getLastBarPaint()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the paint used to draw the last bar.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setLastBarPaint(java.awt.Paint)",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\r\n     * Sets the paint that will be used to draw the last bar and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 34)",
        "(line 258,col 9)-(line 258,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getPositiveBarPaint()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the paint used to draw bars with positive values.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setPositiveBarPaint(java.awt.Paint)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\r\n     * Sets the paint that will be used to draw bars having positive values.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 280,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getNegativeBarPaint()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\r\n     * Returns the paint used to draw bars with negative values.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setNegativeBarPaint(java.awt.Paint)",
      "begin_line": 298,
      "end_line": 304,
      "comment": "\r\n     * Sets the paint that will be used to draw bars having negative values,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 38)",
        "(line 303,col 9)-(line 303,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 320,
      "end_line": 462,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 56)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 29)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 45)",
        "(line 342,col 9)-(line 342,col 40)",
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 60)",
        "(line 346,col 9)-(line 346,col 27)",
        "(line 347,col 9)-(line 347,col 27)",
        "(line 349,col 9)-(line 349,col 68)",
        "(line 350,col 9)-(line 350,col 66)",
        "(line 353,col 9)-(line 354,col 35)",
        "(line 357,col 9)-(line 358,col 35)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 47)",
        "(line 371,col 9)-(line 372,col 41)",
        "(line 374,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 410,col 28)",
        "(line 411,col 9)-(line 411,col 47)",
        "(line 412,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 435,col 21)",
        "(line 438,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 450,col 49)",
        "(line 451,col 9)-(line 454,col 9)",
        "(line 457,col 9)-(line 457,col 64)",
        "(line 458,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.equals(java.lang.Object)",
      "begin_line": 471,
      "end_line": 499,
      "comment": "\r\n     * Tests an object for equality with this instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 63)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 508,
      "end_line": 514,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 36)",
        "(line 510,col 9)-(line 510,col 63)",
        "(line 511,col 9)-(line 511,col 62)",
        "(line 512,col 9)-(line 512,col 66)",
        "(line 513,col 9)-(line 513,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 524,
      "end_line": 531,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 35)",
        "(line 527,col 9)-(line 527,col 63)",
        "(line 528,col 9)-(line 528,col 62)",
        "(line 529,col 9)-(line 529,col 66)",
        "(line 530,col 9)-(line 530,col 66)"
      ]
    }
  ]
}