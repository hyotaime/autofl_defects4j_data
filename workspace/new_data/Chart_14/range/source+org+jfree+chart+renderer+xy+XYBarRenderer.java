{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 142,
      "end_line": 1025,
      "comment": "\r\n * A renderer that draws bars on an {@link XYPlot} (requires an \r\n * {@link IntervalXYDataset}).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " For serialization. "
    },
    {
      "type": "class_interface",
      "name": "XYBarRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYItemRendererState"
      ],
      "begin_line": 151,
      "end_line": 182,
      "comment": "\r\n     * The state class used by this renderer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "g2Base"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Base for bars against the range axis, in Java 2D space. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState.XYBarRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n         * Creates a new state object.\r\n         * \r\n         * @param info  the plot rendering info.\r\n         ",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState.getG2Base()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n         * Returns the base (range) value in Java 2D space.\r\n         * \r\n         * @return The base value.\r\n         ",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRendererState.setG2Base(double)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n         * Sets the range axis base in Java2D space.\r\n         * \r\n         * @param value  the value.\r\n         ",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The default base value for the bars. "
    },
    {
      "type": "field",
      "varNames": [
        "useYInterval"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " \r\n     * A flag that controls whether the bars use the y-interval supplied by the \r\n     * dataset. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "margin"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Percentage margin (to reduce the width of bars). "
    },
    {
      "type": "field",
      "varNames": [
        "drawBarOutline"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " A flag that controls whether or not bar outlines are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "gradientPaintTransformer"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " \r\n     * An optional class used to transform gradient paint objects to fit each \r\n     * bar. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendBar"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " \r\n     * The shape used to represent a bar in each legend item (this should never\r\n     * be \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positiveItemLabelPositionFallback"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " \r\n     * The fallback position if a positive item label doesn\u0027t fit inside the \r\n     * bar. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "negativeItemLabelPositionFallback"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " \r\n     * The fallback position if a negative item label doesn\u0027t fit inside the \r\n     * bar. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRenderer()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * The default constructor.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.XYBarRenderer(double)",
      "begin_line": 235,
      "end_line": 243,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param margin  the percentage amount to trim from the width of each bar.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 16)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 24)",
        "(line 239,col 9)-(line 239,col 34)",
        "(line 240,col 9)-(line 240,col 79)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 242,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getBase()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the base value for the bars.\r\n     * \r\n     * @return The base value for the bars.\r\n     * \r\n     * @see #setBase(double)\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setBase(double)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\r\n     * Sets the base value for the bars and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.  The base value is not used if the dataset\u0027s\r\n     * y-interval is being used to determine the bar length.\r\n     * \r\n     * @param base  the new base value.\r\n     * \r\n     * @see #getBase()\r\n     * @see #getUseYInterval()\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 25)",
        "(line 268,col 9)-(line 268,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getUseYInterval()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns a flag that determines whether the y-interval from the dataset is\r\n     * used to calculate the length of each bar.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setUseYInterval(boolean)\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setUseYInterval(boolean)",
      "begin_line": 292,
      "end_line": 297,
      "comment": "\r\n     * Sets the flag that determines whether the y-interval from the dataset is\r\n     * used to calculate the length of each bar, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param use  the flag.\r\n     * \r\n     * @see #getUseYInterval()\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getMargin()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the margin which is a percentage amount by which the bars are \r\n     * trimmed.\r\n     *\r\n     * @return The margin.\r\n     * \r\n     * @see #setMargin(double)\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setMargin(double)",
      "begin_line": 319,
      "end_line": 322,
      "comment": "\r\n     * Sets the percentage amount by which the bars are trimmed and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param margin  the new margin.\r\n     * \r\n     * @see #getMargin()\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 321,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.isDrawBarOutline()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns a flag that controls whether or not bar outlines are drawn.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawBarOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setDrawBarOutline(boolean)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "\r\n     * Sets the flag that controls whether or not bar outlines are drawn and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param draw  the flag.\r\n     * \r\n     * @see #isDrawBarOutline()\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 345,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getGradientPaintTransformer()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\r\n     * Returns the gradient paint transformer (an object used to transform \r\n     * gradient paint objects to fit each bar).\r\n     * \r\n     * @return A transformer (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setGradientPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 368,
      "end_line": 372,
      "comment": "\r\n     * Sets the gradient paint transformer and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getGradientPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 52)",
        "(line 371,col 9)-(line 371,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getLegendBar()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Returns the shape used to represent bars in each legend item.\r\n     * \r\n     * @return The shape used to represent bars in each legend item (never \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setLegendBar(Shape)\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setLegendBar(java.awt.Shape)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\r\n     * Sets the shape used to represent bars in each legend item and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param bar  the bar shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendBar()\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 29)",
        "(line 399,col 9)-(line 399,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getPositiveItemLabelPositionFallback()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\r\n     * Returns the fallback position for positive item labels that don\u0027t fit \r\n     * within a bar.\r\n     * \r\n     * @return The fallback position (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setPositiveItemLabelPositionFallback(ItemLabelPosition)\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setPositiveItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 425,
      "end_line": 429,
      "comment": "\r\n     * Sets the fallback position for positive item labels that don\u0027t fit \r\n     * within a bar, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getPositiveItemLabelPositionFallback()\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 428,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getNegativeItemLabelPositionFallback()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\r\n     * Returns the fallback position for negative item labels that don\u0027t fit \r\n     * within a bar.\r\n     * \r\n     * @return The fallback position (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setNegativeItemLabelPositionFallback(ItemLabelPosition)\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.setNegativeItemLabelPositionFallback(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 454,
      "end_line": 458,
      "comment": "\r\n     * Sets the fallback position for negative item labels that don\u0027t fit \r\n     * within a bar, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getNegativeItemLabelPositionFallback()\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 58)",
        "(line 457,col 9)-(line 457,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 475,
      "end_line": 485,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be \r\n     * passed to all subsequent calls to the drawItem() method.  Here we \r\n     * calculate the Java2D y-coordinate for zero, since all the bars have \r\n     * their bases fixed at zero.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return A state object.\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 64)",
        "(line 479,col 9)-(line 480,col 26)",
        "(line 481,col 9)-(line 482,col 42)",
        "(line 483,col 9)-(line 483,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.getLegendItem(int, int)",
      "begin_line": 496,
      "end_line": 538,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses \r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 33)",
        "(line 498,col 9)-(line 498,col 34)",
        "(line 499,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 558,
      "end_line": 701,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 72)",
        "(line 576,col 9)-(line 576,col 22)",
        "(line 577,col 9)-(line 577,col 22)",
        "(line 578,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 601,col 41)",
        "(line 602,col 9)-(line 603,col 41)",
        "(line 604,col 9)-(line 604,col 69)",
        "(line 605,col 9)-(line 605,col 66)",
        "(line 607,col 9)-(line 607,col 69)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 65)",
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 626,col 58)",
        "(line 627,col 9)-(line 628,col 26)",
        "(line 629,col 9)-(line 630,col 26)",
        "(line 632,col 9)-(line 633,col 37)",
        "(line 635,col 9)-(line 635,col 65)",
        "(line 636,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 31)",
        "(line 643,col 9)-(line 643,col 60)",
        "(line 644,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 659,col 53)",
        "(line 660,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 31)",
        "(line 666,col 9)-(line 666,col 21)",
        "(line 667,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 683,col 9)",
        "(line 686,col 9)-(line 686,col 42)",
        "(line 687,col 9)-(line 687,col 52)",
        "(line 688,col 9)-(line 688,col 74)",
        "(line 689,col 9)-(line 690,col 41)",
        "(line 691,col 9)-(line 691,col 66)",
        "(line 692,col 9)-(line 692,col 63)",
        "(line 693,col 9)-(line 694,col 73)",
        "(line 696,col 9)-(line 696,col 64)",
        "(line 697,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.XYPlot, org.jfree.chart.labels.XYItemLabelGenerator, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 719,
      "end_line": 779,
      "comment": "\r\n     * Draws an item label.  This method is provided as an alternative to\r\n     * {@link #drawItemLabel(Graphics2D, PlotOrientation, XYDataset, int, int, \r\n     * double, double, boolean)} so that the bar can be used to calculate the \r\n     * label anchor point. \r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param plot  the plot.\r\n     * @param generator  the label generator (\u003ccode\u003enull\u003c/code\u003e permitted, in \r\n     *         which case the method does nothing, just returns).\r\n     * @param bar  the bar.\r\n     * @param negative  a flag indicating a negative value.\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 70)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 731,col 9)-(line 731,col 56)",
        "(line 732,col 9)-(line 732,col 30)",
        "(line 733,col 9)-(line 733,col 54)",
        "(line 734,col 9)-(line 734,col 27)",
        "(line 737,col 9)-(line 737,col 42)",
        "(line 738,col 9)-(line 743,col 9)",
        "(line 746,col 9)-(line 747,col 75)",
        "(line 749,col 9)-(line 771,col 9)",
        "(line 773,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 790,
      "end_line": 889,
      "comment": "\r\n     * Calculates the item label anchor point.\r\n     *\r\n     * @param anchor  the anchor.\r\n     * @param bar  the bar.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @return The anchor point.\r\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 30)",
        "(line 794,col 9)-(line 794,col 51)",
        "(line 795,col 9)-(line 795,col 40)",
        "(line 796,col 9)-(line 796,col 31)",
        "(line 797,col 9)-(line 797,col 40)",
        "(line 798,col 9)-(line 798,col 37)",
        "(line 799,col 9)-(line 799,col 43)",
        "(line 800,col 9)-(line 800,col 34)",
        "(line 801,col 9)-(line 801,col 43)",
        "(line 803,col 9)-(line 803,col 43)",
        "(line 804,col 9)-(line 804,col 34)",
        "(line 805,col 9)-(line 805,col 43)",
        "(line 806,col 9)-(line 806,col 37)",
        "(line 807,col 9)-(line 807,col 43)",
        "(line 808,col 9)-(line 808,col 34)",
        "(line 809,col 9)-(line 809,col 43)",
        "(line 811,col 9)-(line 885,col 9)",
        "(line 887,col 9)-(line 887,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.isInternalAnchor(org.jfree.chart.labels.ItemLabelAnchor)",
      "begin_line": 898,
      "end_line": 912,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified anchor point is inside a bar.\r\n     * \r\n     * @param anchor  the anchor point.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 911,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 924,
      "end_line": 931,
      "comment": "\r\n     * Returns the lower and upper bounds (range) of the x-values in the \r\n     * specified dataset.  Since this renderer uses the x-interval in the \r\n     * dataset, this is taken into account for the range.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.clone()",
      "begin_line": 940,
      "end_line": 948,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 61)",
        "(line 942,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 946,col 64)",
        "(line 947,col 9)-(line 947,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.equals(java.lang.Object)",
      "begin_line": 957,
      "end_line": 997,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 49)",
        "(line 968,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 1007,
      "end_line": 1011,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 35)",
        "(line 1010,col 9)-(line 1010,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBarRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1020,
      "end_line": 1023,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 36)",
        "(line 1022,col 9)-(line 1022,col 59)"
      ]
    }
  ]
}