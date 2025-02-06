{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/MultiplePiePlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiplePiePlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 94,
      "end_line": 617,
      "comment": "\r\n * A plot that displays multiple pie plots using data from a \r\n * {@link CategoryDataset}.\r\n "
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
        "pieChart"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The chart object that draws the individual pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The data extract order (by row or by column). "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The pie section limit percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsKey"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " \r\n     * The key for the aggregated items. \r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsPaint"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \r\n     * The paint for the aggregated items. \r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaints"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " \r\n     * The colors to use for each section. \r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Creates a new plot with no data.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 141,
      "end_line": 156,
      "comment": "\r\n     * Creates a new plot.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)",
        "(line 143,col 9)-(line 143,col 31)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 54)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 42)",
        "(line 154,col 9)-(line 154,col 52)",
        "(line 155,col 9)-(line 155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataset()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the dataset used by the plot.\r\n     * \r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 173,
      "end_line": 189,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 185,col 9)",
        "(line 188,col 9)-(line 188,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPieChart()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the pie chart that is used to draw the individual pie plots.\r\n     * \r\n     * @return The pie chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPieChart(JFreeChart)\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setPieChart(org.jfree.chart.JFreeChart)",
      "begin_line": 210,
      "end_line": 220,
      "comment": "\r\n     * Sets the chart that is used to draw the individual pie plots.  The\r\n     * chart\u0027s plot must be an instance of {@link PiePlot}.\r\n     * \r\n     * @param pieChart  the pie chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPieChart()\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 33)",
        "(line 219,col 9)-(line 219,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataExtractOrder()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     * \r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLimit()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the limit (as a percentage) below which small pie sections are \r\n     * aggregated.\r\n     * \r\n     * @return The limit percentage.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLimit(double)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\r\n     * Sets the limit below which pie sections are aggregated.  \r\n     * Set this to 0.0 if you don\u0027t want any aggregation to occur.\r\n     * \r\n     * @param limit  the limit percent.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 263,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsKey()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns the key for aggregated items in the pie plots, if there are any.\r\n     * The default value is \"Other\".\r\n     * \r\n     * @return The aggregated items key.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey(java.lang.Comparable)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "\r\n     * Sets the key for aggregated items in the pie plots.  You must ensure \r\n     * that this doesn\u0027t clash with any keys in the dataset.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 38)",
        "(line 291,col 9)-(line 291,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsPaint()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns the paint used to draw the pie section representing the \r\n     * aggregated items.  The default value is \u003ccode\u003eColor.lightGray\u003c/code\u003e.\r\n     * \r\n     * @return The paint.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint(java.awt.Paint)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "\r\n     * Sets the paint used to draw the pie section representing the aggregated\r\n     * items and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 42)",
        "(line 319,col 9)-(line 319,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPlotType()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 342,
      "end_line": 455,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 45)",
        "(line 351,col 9)-(line 351,col 26)",
        "(line 352,col 9)-(line 352,col 33)",
        "(line 353,col 9)-(line 353,col 30)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 25)",
        "(line 362,col 9)-(line 367,col 9)",
        "(line 370,col 9)-(line 370,col 63)",
        "(line 371,col 9)-(line 372,col 72)",
        "(line 375,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 383,col 9)-(line 383,col 34)",
        "(line 384,col 9)-(line 384,col 34)",
        "(line 385,col 9)-(line 385,col 58)",
        "(line 386,col 9)-(line 386,col 60)",
        "(line 387,col 9)-(line 387,col 20)",
        "(line 388,col 9)-(line 388,col 23)",
        "(line 389,col 9)-(line 389,col 58)",
        "(line 390,col 9)-(line 390,col 24)",
        "(line 391,col 9)-(line 391,col 41)",
        "(line 393,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints()",
      "begin_line": 463,
      "end_line": 500,
      "comment": "\r\n     * For each key in the dataset, check the \u003ccode\u003esectionPaints\u003c/code\u003e\r\n     * cache to see if a paint is associated with that key and, if not, \r\n     * fetch one from the drawing supplier.  These colors are cached so that\r\n     * the legend and all the subplots use consistent colors.\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 60)",
        "(line 471,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItems()",
      "begin_line": 507,
      "end_line": 548,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 65)",
        "(line 511,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.equals(java.lang.Object)",
      "begin_line": 559,
      "end_line": 587,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the \r\n     * plot\u0027s dataset is not considered in the equality test.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is equal to \u003ccode\u003eobj\u003c/code\u003e, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 53)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 596,
      "end_line": 599,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 36)",
        "(line 598,col 9)-(line 598,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 609,
      "end_line": 614,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 35)",
        "(line 612,col 9)-(line 612,col 70)",
        "(line 613,col 9)-(line 613,col 43)"
      ]
    }
  ]
}