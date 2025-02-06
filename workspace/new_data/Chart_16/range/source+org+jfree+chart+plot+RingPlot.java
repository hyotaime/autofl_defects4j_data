{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/RingPlot.java",
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
      "begin_line": 84,
      "end_line": 553,
      "comment": "\r\n * A customised pie plot that leaves a hole in the middle.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "separatorsVisible"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " \r\n     * A flag that controls whether or not separators are drawn between the\r\n     * sections of the chart.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "separatorStroke"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The stroke used to draw separators. "
    },
    {
      "type": "field",
      "varNames": [
        "separatorPaint"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The paint used to draw separators. "
    },
    {
      "type": "field",
      "varNames": [
        "innerSeparatorExtension"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " \r\n     * The length of the inner separator extension (as a percentage of the\r\n     * depth of the sections). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outerSeparatorExtension"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " \r\n     * The length of the outer separator extension (as a percentage of the\r\n     * depth of the sections). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sectionDepth"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " \r\n     * The depth of the section as a percentage of the diameter.  \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.RingPlot.RingPlot()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Creates a new plot with a \u003ccode\u003enull\u003c/code\u003e dataset.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.RingPlot.RingPlot(org.jfree.data.general.PieDataset)",
      "begin_line": 130,
      "end_line": 138,
      "comment": "\r\n     * Creates a new plot for the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 137,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorsVisible()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns a flag that indicates whether or not separators are drawn between\r\n     * the sections in the chart.\r\n     * \r\n     * @return A boolean.\r\n     *\r\n     * @see #setSeparatorsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorsVisible(boolean)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\r\n     * Sets the flag that controls whether or not separators are drawn between \r\n     * the sections in the chart, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getSeparatorsVisible()\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 41)",
        "(line 163,col 9)-(line 163,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorStroke()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the separator stroke.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeparatorStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorStroke(java.awt.Stroke)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\r\n     * Sets the stroke used to draw the separator between sections and sends \r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSeparatorStroke()\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 190,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSeparatorPaint()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the separator paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeparatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSeparatorPaint(java.awt.Paint)",
      "begin_line": 212,
      "end_line": 218,
      "comment": "\r\n     * Sets the paint used to draw the separator between sections and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSeparatorPaint()\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 217,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getInnerSeparatorExtension()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the length of the inner extension of the separator line that\r\n     * is drawn between sections, expressed as a percentage of the depth of\r\n     * the section.\r\n     * \r\n     * @return The inner separator extension (as a percentage).\r\n     * \r\n     * @see #setInnerSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setInnerSeparatorExtension(double)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\r\n     * Sets the length of the inner extension of the separator line that is\r\n     * drawn between sections, as a percentage of the depth of the \r\n     * sections, and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param percent  the percentage.\r\n     * \r\n     * @see #getInnerSeparatorExtension()\r\n     * @see #setOuterSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 47)",
        "(line 246,col 9)-(line 246,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getOuterSeparatorExtension()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the length of the outer extension of the separator line that\r\n     * is drawn between sections, expressed as a percentage of the depth of\r\n     * the section.\r\n     * \r\n     * @return The outer separator extension (as a percentage).\r\n     * \r\n     * @see #setOuterSeparatorExtension(double)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setOuterSeparatorExtension(double)",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\r\n     * Sets the length of the outer extension of the separator line that is\r\n     * drawn between sections, as a percentage of the depth of the \r\n     * sections, and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param percent  the percentage.\r\n     * \r\n     * @see #getOuterSeparatorExtension()\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 47)",
        "(line 274,col 9)-(line 274,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.getSectionDepth()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the depth of each section, expressed as a percentage of the\r\n     * plot radius.\r\n     * \r\n     * @return The depth of each section.\r\n     * \r\n     * @see #setSectionDepth(double)\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.setSectionDepth(double)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\r\n     * The section depth is given as percentage of the plot radius.\r\n     * Specifying 1.0 results in a straightforward pie chart.\r\n     * \r\n     * @param sectionDepth  the section depth.\r\n     *\r\n     * @see #getSectionDepth()\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 41)",
        "(line 301,col 9)-(line 301,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlot, java.lang.Integer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 319,
      "end_line": 326,
      "comment": "\r\n     * Initialises the plot state (which will store the total of all dataset\r\n     * values, among other things).  This method is called once at the \r\n     * beginning of each drawing.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plot  the plot.\r\n     * @param index  the secondary index (\u003ccode\u003enull\u003c/code\u003e for primary \r\n     *               renderer).\r\n     * @param info  collects chart rendering information for return to caller.\r\n     * \r\n     * @return A state object (maintains state information relevant to one \r\n     *         chart drawing).\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 79)",
        "(line 323,col 9)-(line 323,col 35)",
        "(line 324,col 9)-(line 324,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.drawItem(java.awt.Graphics2D, int, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PiePlotState, int)",
      "begin_line": 337,
      "end_line": 458,
      "comment": "\r\n     * Draws a single data item.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param section  the section index.\r\n     * @param dataArea  the data plot area.\r\n     * @param state  state information for one chart.\r\n     * @param currentPass  the current pass index.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 45)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 39)",
        "(line 349,col 9)-(line 349,col 28)",
        "(line 350,col 9)-(line 350,col 28)",
        "(line 352,col 9)-(line 352,col 44)",
        "(line 353,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 41)",
        "(line 366,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.equals(java.lang.Object)",
      "begin_line": 467,
      "end_line": 495,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 39)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.extendLine(java.awt.geom.Line2D, double, double)",
      "begin_line": 507,
      "end_line": 523,
      "comment": "\r\n     * Creates a new line by extending an existing line.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param startPercent  the amount to extend the line at the start point \r\n     *                      end.\r\n     * @param endPercent  the amount to extend the line at the end point end.\r\n     * \r\n     * @return A new line.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 33)",
        "(line 513,col 9)-(line 513,col 33)",
        "(line 514,col 9)-(line 514,col 32)",
        "(line 515,col 9)-(line 515,col 33)",
        "(line 516,col 9)-(line 516,col 33)",
        "(line 517,col 9)-(line 517,col 32)",
        "(line 518,col 9)-(line 518,col 42)",
        "(line 519,col 9)-(line 519,col 42)",
        "(line 520,col 9)-(line 520,col 40)",
        "(line 521,col 9)-(line 521,col 40)",
        "(line 522,col 9)-(line 522,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 532,
      "end_line": 536,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 36)",
        "(line 534,col 9)-(line 534,col 66)",
        "(line 535,col 9)-(line 535,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.RingPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 546,
      "end_line": 551,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 35)",
        "(line 549,col 9)-(line 549,col 66)",
        "(line 550,col 9)-(line 550,col 64)"
      ]
    }
  ]
}