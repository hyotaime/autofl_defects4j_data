{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/MultiplePiePlot.java",
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
      "begin_line": 102,
      "end_line": 691,
      "comment": "\r\n * A plot that displays multiple pie plots using data from a\r\n * {@link CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "pieChart"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The chart object that draws the individual pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The data extract order (by row or by column). "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The pie section limit percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsKey"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * The key for the aggregated items.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsPaint"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\r\n     * The paint for the aggregated items.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaints"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\r\n     * The colors to use for each section.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\r\n     * The legend item shape (never null).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Creates a new plot with no data.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 159,
      "end_line": 176,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 16)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 164,col 48)",
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 167,col 9)-(line 167,col 47)",
        "(line 168,col 9)-(line 169,col 51)",
        "(line 170,col 9)-(line 170,col 54)",
        "(line 171,col 9)-(line 171,col 44)",
        "(line 172,col 9)-(line 172,col 42)",
        "(line 173,col 9)-(line 173,col 52)",
        "(line 174,col 9)-(line 174,col 43)",
        "(line 175,col 9)-(line 175,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataset()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns the dataset used by the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 193,
      "end_line": 209,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 201,col 9)-(line 201,col 31)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPieChart()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Returns the pie chart that is used to draw the individual pie plots.\r\n     * Note that there are some attributes on this chart instance that will\r\n     * be ignored at rendering time (for example, legend item settings).\r\n     *\r\n     * @return The pie chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPieChart(JFreeChart)\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setPieChart(org.jfree.chart.JFreeChart)",
      "begin_line": 232,
      "end_line": 242,
      "comment": "\r\n     * Sets the chart that is used to draw the individual pie plots.  The\r\n     * chart\u0027s plot must be an instance of {@link PiePlot}.\r\n     *\r\n     * @param pieChart  the pie chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPieChart()\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 33)",
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataExtractOrder()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     *\r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLimit()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns the limit (as a percentage) below which small pie sections are\r\n     * aggregated.\r\n     *\r\n     * @return The limit percentage.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLimit(double)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\r\n     * Sets the limit below which pie sections are aggregated.\r\n     * Set this to 0.0 if you don\u0027t want any aggregation to occur.\r\n     *\r\n     * @param limit  the limit percent.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 27)",
        "(line 285,col 9)-(line 285,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsKey()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\r\n     * Returns the key for aggregated items in the pie plots, if there are any.\r\n     * The default value is \"Other\".\r\n     *\r\n     * @return The aggregated items key.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey(java.lang.Comparable)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\r\n     * Sets the key for aggregated items in the pie plots.  You must ensure\r\n     * that this doesn\u0027t clash with any keys in the dataset.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsPaint()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the paint used to draw the pie section representing the\r\n     * aggregated items.  The default value is \u003ccode\u003eColor.lightGray\u003c/code\u003e.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint(java.awt.Paint)",
      "begin_line": 336,
      "end_line": 342,
      "comment": "\r\n     * Sets the paint used to draw the pie section representing the aggregated\r\n     * items and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 42)",
        "(line 341,col 9)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPlotType()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItemShape()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemShape(Shape)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemShape()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 37)",
        "(line 382,col 9)-(line 382,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 395,
      "end_line": 508,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 404,col 26)",
        "(line 405,col 9)-(line 405,col 33)",
        "(line 406,col 9)-(line 406,col 30)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 25)",
        "(line 415,col 9)-(line 420,col 9)",
        "(line 423,col 9)-(line 423,col 63)",
        "(line 424,col 9)-(line 425,col 72)",
        "(line 428,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 32)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 20)",
        "(line 441,col 9)-(line 441,col 23)",
        "(line 442,col 9)-(line 442,col 58)",
        "(line 443,col 9)-(line 443,col 24)",
        "(line 444,col 9)-(line 444,col 41)",
        "(line 446,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints()",
      "begin_line": 516,
      "end_line": 553,
      "comment": "\r\n     * For each key in the dataset, check the \u003ccode\u003esectionPaints\u003c/code\u003e\r\n     * cache to see if a paint is associated with that key and, if not,\r\n     * fetch one from the drawing supplier.  These colors are cached so that\r\n     * the legend and all the subplots use consistent colors.\r\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 60)",
        "(line 524,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItems()",
      "begin_line": 560,
      "end_line": 602,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 65)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 567,col 25)",
        "(line 568,col 9)-(line 568,col 32)",
        "(line 569,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 24)",
        "(line 579,col 9)-(line 579,col 44)",
        "(line 580,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.equals(java.lang.Object)",
      "begin_line": 613,
      "end_line": 644,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the\r\n     * plot\u0027s dataset is not considered in the equality test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is equal to \u003ccode\u003eobj\u003c/code\u003e, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 53)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.clone()",
      "begin_line": 654,
      "end_line": 660,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 64)",
        "(line 656,col 9)-(line 656,col 60)",
        "(line 657,col 9)-(line 657,col 62)",
        "(line 658,col 9)-(line 658,col 75)",
        "(line 659,col 9)-(line 659,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 669,
      "end_line": 673,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 36)",
        "(line 671,col 9)-(line 671,col 70)",
        "(line 672,col 9)-(line 672,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 683,
      "end_line": 689,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 35)",
        "(line 686,col 9)-(line 686,col 70)",
        "(line 687,col 9)-(line 687,col 65)",
        "(line 688,col 9)-(line 688,col 43)"
      ]
    }
  ]
}