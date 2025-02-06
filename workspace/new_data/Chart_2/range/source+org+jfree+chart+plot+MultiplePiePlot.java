{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/MultiplePiePlot.java",
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
      "begin_line": 103,
      "end_line": 694,
      "comment": "\r\n * A plot that displays multiple pie plots using data from a\r\n * {@link CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "pieChart"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The chart object that draws the individual pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "dataExtractOrder"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The data extract order (by row or by column). "
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The pie section limit percentage. "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsKey"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\r\n     * The key for the aggregated items.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aggregatedItemsPaint"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\r\n     * The paint for the aggregated items.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionPaints"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * The colors to use for each section.\r\n     *\r\n     * @since 1.0.2\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemShape"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\r\n     * The legend item shape (never null).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Creates a new plot with no data.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.MultiplePiePlot(org.jfree.data.category.CategoryDataset)",
      "begin_line": 160,
      "end_line": 177,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 16)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 44)",
        "(line 164,col 9)-(line 164,col 42)",
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 168,col 47)",
        "(line 169,col 9)-(line 170,col 51)",
        "(line 171,col 9)-(line 171,col 54)",
        "(line 172,col 9)-(line 172,col 44)",
        "(line 173,col 9)-(line 173,col 42)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataset()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the dataset used by the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 194,
      "end_line": 212,
      "comment": "\r\n     * Sets the dataset used by the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 31)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 210,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPieChart()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the pie chart that is used to draw the individual pie plots.\r\n     * Note that there are some attributes on this chart instance that will\r\n     * be ignored at rendering time (for example, legend item settings).\r\n     *\r\n     * @return The pie chart (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPieChart(JFreeChart)\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setPieChart(org.jfree.chart.JFreeChart)",
      "begin_line": 235,
      "end_line": 245,
      "comment": "\r\n     * Sets the chart that is used to draw the individual pie plots.  The\r\n     * chart\u0027s plot must be an instance of {@link PiePlot}.\r\n     *\r\n     * @param pieChart  the pie chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPieChart()\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 244,col 9)-(line 244,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getDataExtractOrder()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the data extract order (by row or by column).\r\n     *\r\n     * @return The data extract order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setDataExtractOrder(org.jfree.chart.util.TableOrder)",
      "begin_line": 262,
      "end_line": 268,
      "comment": "\r\n     * Sets the data extract order (by row or by column) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 38)",
        "(line 267,col 9)-(line 267,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLimit()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the limit (as a percentage) below which small pie sections are\r\n     * aggregated.\r\n     *\r\n     * @return The limit percentage.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLimit(double)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\r\n     * Sets the limit below which pie sections are aggregated.\r\n     * Set this to 0.0 if you don\u0027t want any aggregation to occur.\r\n     *\r\n     * @param limit  the limit percent.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 27)",
        "(line 288,col 9)-(line 288,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsKey()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns the key for aggregated items in the pie plots, if there are any.\r\n     * The default value is \"Other\".\r\n     *\r\n     * @return The aggregated items key.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsKey(java.lang.Comparable)",
      "begin_line": 311,
      "end_line": 317,
      "comment": "\r\n     * Sets the key for aggregated items in the pie plots.  You must ensure\r\n     * that this doesn\u0027t clash with any keys in the dataset.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getAggregatedItemsPaint()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the paint used to draw the pie section representing the\r\n     * aggregated items.  The default value is \u003ccode\u003eColor.lightGray\u003c/code\u003e.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setAggregatedItemsPaint(java.awt.Paint)",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\r\n     * Sets the paint used to draw the pie section representing the aggregated\r\n     * items and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getPlotType()",
      "begin_line": 352,
      "end_line": 355,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return The plot type.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItemShape()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the shape used for legend items.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemShape(Shape)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.setLegendItemShape(java.awt.Shape)",
      "begin_line": 380,
      "end_line": 386,
      "comment": "\r\n     * Sets the shape used for legend items and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemShape()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 37)",
        "(line 385,col 9)-(line 385,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 398,
      "end_line": 511,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 45)",
        "(line 407,col 9)-(line 407,col 26)",
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 409,col 30)",
        "(line 412,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 25)",
        "(line 418,col 9)-(line 423,col 9)",
        "(line 426,col 9)-(line 426,col 63)",
        "(line 427,col 9)-(line 428,col 72)",
        "(line 431,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 32)",
        "(line 439,col 9)-(line 439,col 34)",
        "(line 440,col 9)-(line 440,col 34)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 60)",
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 23)",
        "(line 445,col 9)-(line 445,col 58)",
        "(line 446,col 9)-(line 446,col 24)",
        "(line 447,col 9)-(line 447,col 41)",
        "(line 449,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.prefetchSectionPaints()",
      "begin_line": 519,
      "end_line": 556,
      "comment": "\r\n     * For each key in the dataset, check the \u003ccode\u003esectionPaints\u003c/code\u003e\r\n     * cache to see if a paint is associated with that key and, if not,\r\n     * fetch one from the drawing supplier.  These colors are cached so that\r\n     * the legend and all the subplots use consistent colors.\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 60)",
        "(line 527,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.getLegendItems()",
      "begin_line": 563,
      "end_line": 605,
      "comment": "\r\n     * Returns a collection of legend items for the pie chart.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 65)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 570,col 25)",
        "(line 571,col 9)-(line 571,col 32)",
        "(line 572,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 24)",
        "(line 582,col 9)-(line 582,col 44)",
        "(line 583,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.equals(java.lang.Object)",
      "begin_line": 616,
      "end_line": 647,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.  Note that the\r\n     * plot\u0027s dataset is not considered in the equality test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this plot is equal to \u003ccode\u003eobj\u003c/code\u003e, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 53)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.clone()",
      "begin_line": 657,
      "end_line": 663,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 64)",
        "(line 659,col 9)-(line 659,col 60)",
        "(line 660,col 9)-(line 660,col 62)",
        "(line 661,col 9)-(line 661,col 75)",
        "(line 662,col 9)-(line 662,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 672,
      "end_line": 676,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 36)",
        "(line 674,col 9)-(line 674,col 70)",
        "(line 675,col 9)-(line 675,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MultiplePiePlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 686,
      "end_line": 692,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 35)",
        "(line 689,col 9)-(line 689,col 70)",
        "(line 690,col 9)-(line 690,col 65)",
        "(line 691,col 9)-(line 691,col 43)"
      ]
    }
  ]
}