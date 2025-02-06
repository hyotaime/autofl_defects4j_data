{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/WaterfallBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WaterfallBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 92,
      "end_line": 493,
      "comment": "\r\n * A renderer that handles the drawing of waterfall bar charts, for use with \r\n * the {@link CategoryPlot} class.  Note that the bar colors are defined \r\n * using special methods in this class - the inherited methods (for example,\r\n * {@link AbstractRenderer#setSeriesPaint(int, Paint)}) are ignored.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "firstBarPaint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint used to draw the first bar. "
    },
    {
      "type": "field",
      "varNames": [
        "lastBarPaint"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The paint used to draw the last bar. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveBarPaint"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The paint used to draw bars having positive values. "
    },
    {
      "type": "field",
      "varNames": [
        "negativeBarPaint"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The paint used to draw bars having negative values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.WaterfallBarRenderer()",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\r\n     * Constructs a new renderer with default values for the bar colors.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 122,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.WaterfallBarRenderer(java.awt.Paint, java.awt.Paint, java.awt.Paint, java.awt.Paint)",
      "begin_line": 137,
      "end_line": 163,
      "comment": "\r\n     * Constructs a new waterfall renderer.\r\n     *\r\n     * @param firstBarPaint  the color of the first bar (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param positiveBarPaint  the color for bars with positive values \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param negativeBarPaint  the color for bars with negative values \r\n     *                          (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lastBarPaint  the color of the last bar (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 43)",
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 49)",
        "(line 159,col 9)-(line 159,col 49)",
        "(line 160,col 9)-(line 161,col 61)",
        "(line 162,col 9)-(line 162,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getFirstBarPaint()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the paint used to draw the first bar.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setFirstBarPaint(java.awt.Paint)",
      "begin_line": 192,
      "end_line": 198,
      "comment": "\r\n     * Sets the paint that will be used to draw the first bar and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getLastBarPaint()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the paint used to draw the last bar.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setLastBarPaint(java.awt.Paint)",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\r\n     * Sets the paint that will be used to draw the last bar.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getPositiveBarPaint()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Returns the paint used to draw bars with positive values.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setPositiveBarPaint(java.awt.Paint)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\r\n     * Sets the paint that will be used to draw bars having positive values.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.getNegativeBarPaint()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Returns the paint used to draw bars with negative values.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.setNegativeBarPaint(java.awt.Paint)",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\r\n     * Sets the paint that will be used to draw bars having negative values.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 38)",
        "(line 263,col 9)-(line 263,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 280,
      "end_line": 422,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 56)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 29)",
        "(line 296,col 9)-(line 296,col 49)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 45)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 45)",
        "(line 304,col 9)-(line 304,col 60)",
        "(line 306,col 9)-(line 306,col 27)",
        "(line 307,col 9)-(line 307,col 27)",
        "(line 309,col 9)-(line 309,col 68)",
        "(line 310,col 9)-(line 310,col 66)",
        "(line 313,col 9)-(line 314,col 35)",
        "(line 317,col 9)-(line 318,col 35)",
        "(line 320,col 9)-(line 320,col 44)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 328,col 9)-(line 328,col 47)",
        "(line 331,col 9)-(line 332,col 41)",
        "(line 334,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 370,col 28)",
        "(line 371,col 9)-(line 371,col 47)",
        "(line 372,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 33)",
        "(line 395,col 9)-(line 395,col 21)",
        "(line 398,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 410,col 49)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 417,col 9)-(line 417,col 64)",
        "(line 418,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.equals(java.lang.Object)",
      "begin_line": 431,
      "end_line": 459,
      "comment": "\r\n     * Tests an object for equality with this instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 63)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 468,
      "end_line": 474,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 63)",
        "(line 471,col 9)-(line 471,col 62)",
        "(line 472,col 9)-(line 472,col 66)",
        "(line 473,col 9)-(line 473,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.WaterfallBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 484,
      "end_line": 491,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 35)",
        "(line 487,col 9)-(line 487,col 63)",
        "(line 488,col 9)-(line 488,col 62)",
        "(line 489,col 9)-(line 489,col 66)",
        "(line 490,col 9)-(line 490,col 66)"
      ]
    }
  ]
}