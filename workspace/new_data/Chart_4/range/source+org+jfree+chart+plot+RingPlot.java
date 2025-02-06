{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/RingPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RingPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.PiePlot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 85,
      "end_line": 564,
      "comment": "\r\n * A customised pie plot that leaves a hole in the middle.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "separatorsVisible"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\r\n     * A flag that controls whether or not separators are drawn between the\r\n     * sections of the chart.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "separatorStroke"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The stroke used to draw separators. "
    },
    {
      "type": "field",
      "varNames": [
        "separatorPaint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint used to draw separators. "
    },
    {
      "type": "field",
      "varNames": [
        "innerSeparatorExtension"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * The length of the inner separator extension (as a percentage of the\r\n     * depth of the sections).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outerSeparatorExtension"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\r\n     * The length of the outer separator extension (as a percentage of the\r\n     * depth of the sections).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionDepth"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\r\n     * The depth of the section as a percentage of the diameter.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.RingPlot.RingPlot()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Creates a new plot with a \u003ccode\u003enull\u003c/code\u003e dataset.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.RingPlot.RingPlot(org.jfree.data.general.PieDataset)",
      "begin_line": 131,
      "end_line": 139,
      "comment": "\r\n     * Creates a new plot for the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 23)",
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 41)",
        "(line 136,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 137,col 44)",
        "(line 138,col 9)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorsVisible()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns a flag that indicates whether or not separators are drawn between\r\n     * the sections in the chart.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSeparatorsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorsVisible(boolean)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\r\n     * Sets the flag that controls whether or not separators are drawn between\r\n     * the sections in the chart, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getSeparatorsVisible()\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)",
        "(line 164,col 9)-(line 164,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorStroke()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns the separator stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeparatorStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorStroke(java.awt.Stroke)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\r\n     * Sets the stroke used to draw the separator between sections and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSeparatorStroke()\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorPaint()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the separator paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeparatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorPaint(java.awt.Paint)",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\r\n     * Sets the paint used to draw the separator between sections and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSeparatorPaint()\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 218,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getInnerSeparatorExtension()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the length of the inner extension of the separator line that\r\n     * is drawn between sections, expressed as a percentage of the depth of\r\n     * the section.\r\n     *\r\n     * @return The inner separator extension (as a percentage).\r\n     *\r\n     * @see #setInnerSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setInnerSeparatorExtension(double)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\r\n     * Sets the length of the inner extension of the separator line that is\r\n     * drawn between sections, as a percentage of the depth of the\r\n     * sections, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param percent  the percentage.\r\n     *\r\n     * @see #getInnerSeparatorExtension()\r\n     * @see #setOuterSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 47)",
        "(line 247,col 9)-(line 247,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getOuterSeparatorExtension()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns the length of the outer extension of the separator line that\r\n     * is drawn between sections, expressed as a percentage of the depth of\r\n     * the section.\r\n     *\r\n     * @return The outer separator extension (as a percentage).\r\n     *\r\n     * @see #setOuterSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setOuterSeparatorExtension(double)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\r\n     * Sets the length of the outer extension of the separator line that is\r\n     * drawn between sections, as a percentage of the depth of the\r\n     * sections, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param percent  the percentage.\r\n     *\r\n     * @see #getOuterSeparatorExtension()\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 47)",
        "(line 275,col 9)-(line 275,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSectionDepth()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\r\n     * Returns the depth of each section, expressed as a percentage of the\r\n     * plot radius.\r\n     *\r\n     * @return The depth of each section.\r\n     *\r\n     * @see #setSectionDepth(double)\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSectionDepth(double)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\r\n     * The section depth is given as percentage of the plot radius.\r\n     * Specifying 1.0 results in a straightforward pie chart.\r\n     *\r\n     * @param sectionDepth  the section depth.\r\n     *\r\n     * @see #getSectionDepth()\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 41)",
        "(line 302,col 9)-(line 302,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 320,
      "end_line": 327,
      "comment": "\r\n     * Initialises the plot state (which will store the total of all dataset\r\n     * values, among other things).  This method is called once at the\r\n     * beginning of each drawing.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary\r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     *\r\n     * @return A state object (maintains state information relevant to one\r\n     *         chart drawing).\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 79)",
        "(line 324,col 9)-(line 324,col 35)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 338,
      "end_line": 459,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 42)",
        "(line 345,col 9)-(line 345,col 45)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 39)",
        "(line 350,col 9)-(line 350,col 28)",
        "(line 351,col 9)-(line 351,col 28)",
        "(line 353,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 41)",
        "(line 367,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getLabelLinkDepth()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n     * This method overrides the default value for cases where the ring plot\r\n     * is very thin.  This fixes bug 2121818.\r\n     *\r\n     * @return The label link depth, as a percentage of the plot\u0027s radius.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.equals(java.lang.Object)",
      "begin_line": 478,
      "end_line": 506,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 39)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.extendLine(java.awt.geom.Line2D, double, double)",
      "begin_line": 518,
      "end_line": 534,
      "comment": "\r\n     * Creates a new line by extending an existing line.\r\n     *\r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param startPercent  the amount to extend the line at the start point\r\n     *                      end.\r\n     * @param endPercent  the amount to extend the line at the end point end.\r\n     *\r\n     * @return A new line.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 33)",
        "(line 524,col 9)-(line 524,col 33)",
        "(line 525,col 9)-(line 525,col 32)",
        "(line 526,col 9)-(line 526,col 33)",
        "(line 527,col 9)-(line 527,col 33)",
        "(line 528,col 9)-(line 528,col 32)",
        "(line 529,col 9)-(line 529,col 42)",
        "(line 530,col 9)-(line 530,col 42)",
        "(line 531,col 9)-(line 531,col 40)",
        "(line 532,col 9)-(line 532,col 40)",
        "(line 533,col 9)-(line 533,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 543,
      "end_line": 547,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 36)",
        "(line 545,col 9)-(line 545,col 66)",
        "(line 546,col 9)-(line 546,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 557,
      "end_line": 562,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 35)",
        "(line 560,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 561,col 64)"
      ]
    }
  ]
}