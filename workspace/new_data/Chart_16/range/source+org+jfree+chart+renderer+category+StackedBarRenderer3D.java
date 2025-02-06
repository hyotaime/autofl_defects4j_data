{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/StackedBarRenderer3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedBarRenderer3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer3D",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 118,
      "end_line": 837,
      "comment": "\r\n * Renders stacked bars with 3D-effect, for use with the \r\n * {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A flag that controls whether the bars display values or percentages. "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreZeroValues"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " \r\n     * A flag that controls whether or not zero values are drawn by the\r\n     * renderer.\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.StackedBarRenderer3D()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Creates a new renderer with no tool tip generator and no URL generator.\r\n     * \u003cP\u003e\r\n     * The defaults (no tool tip or URL generators) have been chosen to \r\n     * minimise the processing required to generate a default chart.  If you \r\n     * require tool tips or URLs, then you can easily add the required \r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.StackedBarRenderer3D(double, double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Constructs a new renderer with the specified \u00273D effect\u0027.\r\n     *\r\n     * @param xOffset  the x-offset for the 3D effect.\r\n     * @param yOffset  the y-offset for the 3D effect.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.StackedBarRenderer3D(boolean)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param renderAsPercentages  a flag that controls whether the data values\r\n     *                             are rendered as percentages.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 16)",
        "(line 168,col 9)-(line 168,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.StackedBarRenderer3D(double, double, boolean)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\r\n     * Constructs a new renderer with the specified \u00273D effect\u0027.\r\n     *\r\n     * @param xOffset  the x-offset for the 3D effect.\r\n     * @param yOffset  the y-offset for the 3D effect.\r\n     * @param renderAsPercentages  a flag that controls whether the data values\r\n     *                             are rendered as percentages.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 32)",
        "(line 184,col 9)-(line 184,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.getRenderAsPercentages()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked bars add to 100%), and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.setRenderAsPercentages(boolean)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked bars add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param asPercentages  the flag.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 211,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.getIgnoreZeroValues()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the flag that controls whether or not zero values are drawn\r\n     * by the renderer.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.setIgnoreZeroValues(boolean)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\r\n     * Sets a flag that controls whether or not zero values are drawn by the\r\n     * renderer, and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param ignore  the new flag value.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 39)",
        "(line 237,col 9)-(line 237,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 265,
      "end_line": 300,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 69)",
        "(line 272,col 9)-(line 272,col 62)",
        "(line 273,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.createStackedValueList(org.jfree.data.category.CategoryDataset, java.lang.Comparable, double, boolean)",
      "begin_line": 316,
      "end_line": 360,
      "comment": "\r\n     * Returns a list containing the stacked values for the specified series\r\n     * in the given dataset, plus the supplied base value.\r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param category  the category key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     * @param asPercentages  a flag that controls whether the values in the\r\n     *     list are converted to percentages of the total.\r\n     *     \r\n     * @return The value list.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 38)",
        "(line 320,col 9)-(line 320,col 30)",
        "(line 321,col 9)-(line 321,col 30)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 27)",
        "(line 329,col 9)-(line 329,col 48)",
        "(line 330,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 378,
      "end_line": 418,
      "comment": "\r\n     * Draws the visual representation of one data item from the chart (in \r\n     * fact, this method does nothing until it reaches the last item for each\r\n     * category, at which point it draws all the items for that category).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain (category) axis.\r\n     * @param rangeAxis  the range (value) axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 59)",
        "(line 396,col 9)-(line 398,col 42)",
        "(line 400,col 9)-(line 403,col 53)",
        "(line 406,col 9)-(line 406,col 60)",
        "(line 409,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.drawStackHorizontal(java.util.List, java.lang.Comparable, java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset)",
      "begin_line": 435,
      "end_line": 528,
      "comment": "\r\n     * Draws a stack of bars for one category, with a horizontal orientation.\r\n     * \r\n     * @param values  the value list.\r\n     * @param category  the category.\r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area (adjusted for the 3D effect).\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 54)",
        "(line 442,col 9)-(line 444,col 44)",
        "(line 445,col 9)-(line 445,col 42)",
        "(line 449,col 9)-(line 449,col 45)",
        "(line 452,col 9)-(line 452,col 50)",
        "(line 453,col 9)-(line 453,col 43)",
        "(line 454,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.createHorizontalBlock(double, double, double, double, boolean)",
      "begin_line": 543,
      "end_line": 614,
      "comment": "\r\n     * Creates an array of shapes representing the six sides of a block in a\r\n     * horizontal stack.\r\n     * \r\n     * @param x0  left edge of bar (in Java2D space).\r\n     * @param width  the width of the bar (in Java2D units).\r\n     * @param y0  the base of the block (in Java2D space).\r\n     * @param y1  the top of the block (in Java2D space).\r\n     * @param inverted  a flag indicating whether or not the block is inverted\r\n     *     (this changes the order of the faces of the block).\r\n     * \r\n     * @return The sides of the block.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 38)",
        "(line 546,col 9)-(line 546,col 49)",
        "(line 547,col 9)-(line 547,col 57)",
        "(line 548,col 9)-(line 549,col 43)",
        "(line 550,col 9)-(line 551,col 43)",
        "(line 553,col 9)-(line 553,col 48)",
        "(line 554,col 9)-(line 554,col 56)",
        "(line 555,col 9)-(line 556,col 42)",
        "(line 557,col 9)-(line 558,col 42)",
        "(line 560,col 9)-(line 560,col 47)",
        "(line 561,col 9)-(line 561,col 60)",
        "(line 562,col 9)-(line 562,col 62)",
        "(line 563,col 9)-(line 563,col 62)",
        "(line 564,col 9)-(line 564,col 60)",
        "(line 565,col 9)-(line 565,col 27)",
        "(line 567,col 9)-(line 567,col 44)",
        "(line 568,col 9)-(line 568,col 57)",
        "(line 569,col 9)-(line 569,col 59)",
        "(line 570,col 9)-(line 570,col 59)",
        "(line 571,col 9)-(line 571,col 57)",
        "(line 572,col 9)-(line 572,col 24)",
        "(line 574,col 9)-(line 574,col 45)",
        "(line 575,col 9)-(line 575,col 58)",
        "(line 576,col 9)-(line 576,col 60)",
        "(line 577,col 9)-(line 577,col 60)",
        "(line 578,col 9)-(line 578,col 58)",
        "(line 579,col 9)-(line 579,col 25)",
        "(line 581,col 9)-(line 581,col 46)",
        "(line 582,col 9)-(line 582,col 59)",
        "(line 583,col 9)-(line 583,col 59)",
        "(line 584,col 9)-(line 584,col 61)",
        "(line 585,col 9)-(line 585,col 61)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 588,col 9)-(line 588,col 45)",
        "(line 589,col 9)-(line 589,col 58)",
        "(line 590,col 9)-(line 590,col 58)",
        "(line 591,col 9)-(line 591,col 58)",
        "(line 592,col 9)-(line 592,col 58)",
        "(line 593,col 9)-(line 593,col 25)",
        "(line 595,col 9)-(line 595,col 46)",
        "(line 596,col 9)-(line 596,col 61)",
        "(line 597,col 9)-(line 597,col 61)",
        "(line 598,col 9)-(line 598,col 61)",
        "(line 599,col 9)-(line 599,col 61)",
        "(line 600,col 9)-(line 600,col 26)",
        "(line 601,col 9)-(line 601,col 27)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 603,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 24)",
        "(line 612,col 9)-(line 612,col 26)",
        "(line 613,col 9)-(line 613,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.drawStackVertical(java.util.List, java.lang.Comparable, java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset)",
      "begin_line": 631,
      "end_line": 725,
      "comment": "\r\n     * Draws a stack of bars for one category, with a vertical orientation.\r\n     * \r\n     * @param values  the value list.\r\n     * @param category  the category.\r\n     * @param g2  the graphics device.\r\n     * @param state  the state.\r\n     * @param dataArea  the data area (adjusted for the 3D effect).\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 54)",
        "(line 638,col 9)-(line 640,col 44)",
        "(line 641,col 9)-(line 641,col 42)",
        "(line 645,col 9)-(line 645,col 45)",
        "(line 648,col 9)-(line 648,col 50)",
        "(line 649,col 9)-(line 649,col 43)",
        "(line 650,col 9)-(line 710,col 9)",
        "(line 712,col 9)-(line 724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.createVerticalBlock(double, double, double, double, boolean)",
      "begin_line": 740,
      "end_line": 811,
      "comment": "\r\n     * Creates an array of shapes representing the six sides of a block in a\r\n     * vertical stack.\r\n     * \r\n     * @param x0  left edge of bar (in Java2D space).\r\n     * @param width  the width of the bar (in Java2D units).\r\n     * @param y0  the base of the block (in Java2D space).\r\n     * @param y1  the top of the block (in Java2D space).\r\n     * @param inverted  a flag indicating whether or not the block is inverted\r\n     *     (this changes the order of the faces of the block).\r\n     * \r\n     * @return The sides of the block.\r\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 38)",
        "(line 743,col 9)-(line 743,col 49)",
        "(line 744,col 9)-(line 744,col 57)",
        "(line 745,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 748,col 43)",
        "(line 751,col 9)-(line 751,col 48)",
        "(line 752,col 9)-(line 752,col 56)",
        "(line 753,col 9)-(line 754,col 42)",
        "(line 755,col 9)-(line 756,col 42)",
        "(line 758,col 9)-(line 758,col 46)",
        "(line 759,col 9)-(line 759,col 59)",
        "(line 760,col 9)-(line 760,col 61)",
        "(line 761,col 9)-(line 761,col 61)",
        "(line 762,col 9)-(line 762,col 59)",
        "(line 763,col 9)-(line 763,col 26)",
        "(line 765,col 9)-(line 765,col 45)",
        "(line 766,col 9)-(line 766,col 58)",
        "(line 767,col 9)-(line 767,col 60)",
        "(line 768,col 9)-(line 768,col 60)",
        "(line 769,col 9)-(line 769,col 58)",
        "(line 770,col 9)-(line 770,col 25)",
        "(line 772,col 9)-(line 772,col 45)",
        "(line 773,col 9)-(line 773,col 58)",
        "(line 774,col 9)-(line 774,col 60)",
        "(line 775,col 9)-(line 775,col 60)",
        "(line 776,col 9)-(line 776,col 58)",
        "(line 777,col 9)-(line 777,col 25)",
        "(line 779,col 9)-(line 779,col 46)",
        "(line 780,col 9)-(line 780,col 59)",
        "(line 781,col 9)-(line 781,col 59)",
        "(line 782,col 9)-(line 782,col 61)",
        "(line 783,col 9)-(line 783,col 61)",
        "(line 784,col 9)-(line 784,col 26)",
        "(line 786,col 9)-(line 786,col 44)",
        "(line 787,col 9)-(line 787,col 57)",
        "(line 788,col 9)-(line 788,col 57)",
        "(line 789,col 9)-(line 789,col 57)",
        "(line 790,col 9)-(line 790,col 57)",
        "(line 791,col 9)-(line 791,col 24)",
        "(line 793,col 9)-(line 793,col 47)",
        "(line 794,col 9)-(line 794,col 62)",
        "(line 795,col 9)-(line 795,col 62)",
        "(line 796,col 9)-(line 796,col 62)",
        "(line 797,col 9)-(line 797,col 62)",
        "(line 798,col 9)-(line 798,col 27)",
        "(line 800,col 9)-(line 800,col 27)",
        "(line 801,col 9)-(line 801,col 25)",
        "(line 802,col 9)-(line 802,col 25)",
        "(line 803,col 9)-(line 803,col 26)",
        "(line 804,col 9)-(line 804,col 24)",
        "(line 805,col 9)-(line 805,col 26)",
        "(line 806,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer3D.equals(java.lang.Object)",
      "begin_line": 820,
      "end_line": 835,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 63)",
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 33)"
      ]
    }
  ]
}