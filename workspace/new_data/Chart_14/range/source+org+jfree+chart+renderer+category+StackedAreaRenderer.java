{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/StackedAreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedAreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AreaRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 642,
      "comment": "\r\n * A renderer that draws stacked area charts for a \r\n * {@link org.jfree.chart.plot.CategoryPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " A flag that controls whether the areas display values or percentages. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.StackedAreaRenderer()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.StackedAreaRenderer(boolean)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param renderAsPercentages  a flag that controls whether the data values\r\n     *                             are rendered as percentages.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 114,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.getRenderAsPercentages()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked areas add to 100%), and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.setRenderAsPercentages(boolean)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked areas add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param asPercentages  the flag.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 141,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.getPassCount()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the number of passes (\u003ccode\u003e2\u003c/code\u003e) required by this renderer. \r\n     * The first pass is used to draw the bars, the second pass is used to\r\n     * draw the item labels (if visible).\r\n     * \r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 186,
      "end_line": 368,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 32)",
        "(line 199,col 9)-(line 199,col 64)",
        "(line 201,col 9)-(line 201,col 24)",
        "(line 202,col 9)-(line 202,col 49)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 63)",
        "(line 212,col 9)-(line 213,col 52)",
        "(line 218,col 9)-(line 218,col 24)",
        "(line 219,col 9)-(line 219,col 59)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 80)",
        "(line 226,col 9)-(line 227,col 52)",
        "(line 229,col 9)-(line 229,col 49)",
        "(line 230,col 9)-(line 230,col 24)",
        "(line 231,col 9)-(line 231,col 71)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 236,col 32)",
        "(line 238,col 9)-(line 239,col 52)",
        "(line 242,col 9)-(line 242,col 28)",
        "(line 243,col 9)-(line 243,col 29)",
        "(line 245,col 9)-(line 245,col 64)",
        "(line 246,col 9)-(line 246,col 65)",
        "(line 247,col 9)-(line 247,col 68)",
        "(line 248,col 9)-(line 248,col 69)",
        "(line 250,col 9)-(line 250,col 22)",
        "(line 252,col 9)-(line 252,col 54)",
        "(line 254,col 9)-(line 254,col 45)",
        "(line 255,col 9)-(line 255,col 46)",
        "(line 256,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 47)",
        "(line 350,col 9)-(line 350,col 49)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.getPreviousHeight(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 520,
      "end_line": 541,
      "comment": "\r\n     * Calculates the stacked value of the all series up to, but not including \r\n     * \u003ccode\u003eseries\u003c/code\u003e for the specified category, \u003ccode\u003ecategory\u003c/code\u003e.  \r\n     * It returns 0.0 if \u003ccode\u003eseries\u003c/code\u003e is the first series, i.e. 0.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     * @param category  the category.\r\n     *\r\n     * @return double returns a cumulative value for all series\u0027 values up to \r\n     *         but excluding \u003ccode\u003eseries\u003c/code\u003e for Object \r\n     *         \u003ccode\u003ecategory\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 28)",
        "(line 524,col 9)-(line 524,col 17)",
        "(line 525,col 9)-(line 525,col 27)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.getStackValues(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 556,
      "end_line": 577,
      "comment": "\r\n     * Calculates the stacked values (one positive and one negative) of all \r\n     * series up to, but not including, \u003ccode\u003eseries\u003c/code\u003e for the specified \r\n     * item. It returns [0.0, 0.0] if \u003ccode\u003eseries\u003c/code\u003e is the first series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param index  the item index.\r\n     *\r\n     * @return An array containing the cumulative negative and positive values\r\n     *     for all series values up to but excluding \u003ccode\u003eseries\u003c/code\u003e \r\n     *     for \u003ccode\u003eindex\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 40)",
        "(line 559,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.averageStackValues(double[], double[])",
      "begin_line": 588,
      "end_line": 593,
      "comment": "\r\n     * Returns a pair of \"stack\" values calculated as the mean of the two \r\n     * specified stack value pairs.\r\n     * \r\n     * @param stack1  the first stack pair.\r\n     * @param stack2  the second stack pair.\r\n     * \r\n     * @return A pair of average stack values.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 40)",
        "(line 590,col 9)-(line 590,col 50)",
        "(line 591,col 9)-(line 591,col 50)",
        "(line 592,col 9)-(line 592,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.adjustedStackValues(double[], double[])",
      "begin_line": 605,
      "end_line": 620,
      "comment": "\r\n     * Calculates adjusted stack values from the supplied values.  The value is\r\n     * the mean of the supplied values, unless either of the supplied values\r\n     * is zero, in which case the adjusted value is zero also.\r\n     * \r\n     * @param stack1  the first stack pair.\r\n     * @param stack2  the second stack pair.\r\n     * \r\n     * @return A pair of average stack values.\r\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 40)",
        "(line 607,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedAreaRenderer.equals(java.lang.Object)",
      "begin_line": 629,
      "end_line": 641,
      "comment": "\r\n     * Checks this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 61)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 33)"
      ]
    }
  ]
}