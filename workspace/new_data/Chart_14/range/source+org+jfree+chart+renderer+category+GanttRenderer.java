{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/GanttRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GanttRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.IntervalBarRenderer",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 577,
      "comment": "\r\n * A renderer for simple Gantt charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "completePaint"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The paint for displaying the percentage complete. "
    },
    {
      "type": "field",
      "varNames": [
        "incompletePaint"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The paint for displaying the incomplete part of a task. "
    },
    {
      "type": "field",
      "varNames": [
        "startPercent"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " \r\n     * Controls the starting edge of the progress indicator (expressed as a \r\n     * percentage of the overall bar width).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endPercent"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * Controls the ending edge of the progress indicator (expressed as a \r\n     * percentage of the overall bar width). \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.GanttRenderer()",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 16)",
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.getCompletePaint()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the paint used to show the percentage complete.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #setCompletePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.setCompletePaint(java.awt.Paint)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\r\n     * Sets the paint used to show the percentage complete and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCompletePaint()\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.getIncompletePaint()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the paint used to show the percentage incomplete.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setCompletePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.setIncompletePaint(java.awt.Paint)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\r\n     * Sets the paint used to show the percentage incomplete and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getIncompletePaint()\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 169,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.getStartPercent()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the position of the start of the progress indicator, as a \r\n     * percentage of the bar width.\r\n     * \r\n     * @return The start percent.\r\n     * \r\n     * @see #setStartPercent(double)\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.setStartPercent(double)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\r\n     * Sets the position of the start of the progress indicator, as a \r\n     * percentage of the bar width.\r\n     * \r\n     * @param percent  the percent.\r\n     * \r\n     * @see #getStartPercent()\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 36)",
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.getEndPercent()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the position of the end of the progress indicator, as a \r\n     * percentage of the bar width.\r\n     * \r\n     * @return The end percent.\r\n     * \r\n     * @see #setEndPercent(double)\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.setEndPercent(double)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\r\n     * Sets the position of the end of the progress indicator, as a percentage \r\n     * of the bar width.\r\n     * \r\n     * @param percent  the percent.\r\n     * \r\n     * @see #getEndPercent()\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 236,
      "end_line": 257,
      "comment": "\r\n     * Draws the bar for a single (series, category) data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 247,col 10)-(line 255,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.drawTasks(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.gantt.GanttCategoryDataset, int, int)",
      "begin_line": 272,
      "end_line": 385,
      "comment": "\r\n     * Draws the tasks/subtasks for one item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 61)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.drawTask(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.gantt.GanttCategoryDataset, int, int)",
      "begin_line": 400,
      "end_line": 517,
      "comment": "\r\n     * Draws a single task.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 60)",
        "(line 412,col 9)-(line 412,col 66)",
        "(line 415,col 9)-(line 415,col 57)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 420,col 45)",
        "(line 423,col 9)-(line 423,col 59)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 428,col 45)",
        "(line 430,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 440,col 48)",
        "(line 441,col 9)-(line 441,col 49)",
        "(line 442,col 9)-(line 442,col 66)",
        "(line 444,col 9)-(line 444,col 31)",
        "(line 445,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 39)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 65)",
        "(line 457,col 9)-(line 457,col 41)",
        "(line 458,col 9)-(line 458,col 37)",
        "(line 459,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 54)",
        "(line 481,col 9)-(line 481,col 33)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 484,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 491,col 9)",
        "(line 494,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 506,col 24)",
        "(line 507,col 9)-(line 510,col 9)",
        "(line 513,col 9)-(line 513,col 64)",
        "(line 514,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.equals(java.lang.Object)",
      "begin_line": 526,
      "end_line": 547,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 49)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 556,
      "end_line": 560,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 36)",
        "(line 558,col 9)-(line 558,col 63)",
        "(line 559,col 9)-(line 559,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GanttRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 570,
      "end_line": 575,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 35)",
        "(line 573,col 9)-(line 573,col 63)",
        "(line 574,col 9)-(line 574,col 65)"
      ]
    }
  ]
}