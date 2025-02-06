{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/PiePlot3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PiePlot3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.PiePlot",
        "java.io.Serializable"
      ],
      "begin_line": 122,
      "end_line": 1031,
      "comment": "\r\n * A plot that displays data in the form of a 3D pie chart, using data from\r\n * any class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Although this class extends {@link PiePlot}, it does not currently support\r\n * exploded sections.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "depthFactor"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The factor of the depth of the pie from the plot height "
    },
    {
      "type": "field",
      "varNames": [
        "darkerSides"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " default preserves previous "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot3D.PiePlot3D()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Creates a new instance with no dataset.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot3D.PiePlot3D(org.jfree.data.general.PieDataset)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\r\n     * Creates a pie chart with a three dimensional effect using the specified \r\n     * dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 23)",
        "(line 154,col 9)-(line 154,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getDepthFactor()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns the depth factor for the chart.\r\n     *\r\n     * @return The depth factor.\r\n     * \r\n     * @see #setDepthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.setDepthFactor(double)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * Sets the pie depth as a percentage of the height of the plot area, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param factor  the depth factor (for example, 0.20 is twenty percent).\r\n     * \r\n     * @see #getDepthFactor()\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getDarkerSides()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns a flag that controls whether or not the sides of the pie chart\r\n     * are rendered using a darker colour.  This is only applied if the\r\n     * section colour is an instance of {@link java.awt.Color}.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setDarkerSides(boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.setDarkerSides(boolean)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\r\n     * Sets a flag that controls whether or not the sides of the pie chart\r\n     * are rendered using a darker colour, and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.  This is only applied if the\r\n     * section colour is an instance of {@link java.awt.Color}.\r\n     *\r\n     * @param darker true to darken the sides, false to use the default \r\n     *         behaviour.\r\n     * \r\n     * @see #getDarkerSides()\r\n     * \r\n     * @since 1.0.7.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 34)",
        "(line 211,col 9)-(line 211,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 227,
      "end_line": 594,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  This method is called by the \r\n     * {@link org.jfree.chart.JFreeChart} class, you don\u0027t normally need \r\n     * to call it yourself.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point.\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing \r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 45)",
        "(line 233,col 9)-(line 233,col 30)",
        "(line 235,col 9)-(line 235,col 70)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 37)",
        "(line 243,col 9)-(line 243,col 39)",
        "(line 244,col 9)-(line 244,col 26)",
        "(line 247,col 9)-(line 247,col 45)",
        "(line 248,col 9)-(line 248,col 34)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 253,col 38)",
        "(line 254,col 9)-(line 254,col 69)",
        "(line 256,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 59)",
        "(line 269,col 9)-(line 269,col 57)",
        "(line 270,col 9)-(line 270,col 59)",
        "(line 271,col 9)-(line 271,col 58)",
        "(line 274,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 72)",
        "(line 286,col 9)-(line 287,col 48)",
        "(line 288,col 9)-(line 288,col 38)",
        "(line 290,col 9)-(line 296,col 9)",
        "(line 301,col 9)-(line 301,col 49)",
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 304,col 58)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 311,col 9)-(line 311,col 66)",
        "(line 312,col 9)-(line 312,col 79)",
        "(line 314,col 9)-(line 314,col 53)",
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 318,col 75)",
        "(line 322,col 9)-(line 322,col 67)",
        "(line 323,col 9)-(line 324,col 31)",
        "(line 325,col 9)-(line 325,col 36)",
        "(line 327,col 9)-(line 327,col 34)",
        "(line 328,col 9)-(line 328,col 50)",
        "(line 329,col 9)-(line 329,col 64)",
        "(line 330,col 9)-(line 330,col 54)",
        "(line 331,col 9)-(line 331,col 65)",
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 340,col 9)",
        "(line 343,col 9)-(line 354,col 9)",
        "(line 358,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 372,col 9)-(line 372,col 37)",
        "(line 373,col 9)-(line 373,col 37)",
        "(line 376,col 9)-(line 376,col 56)",
        "(line 377,col 9)-(line 378,col 39)",
        "(line 380,col 9)-(line 380,col 79)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 44)",
        "(line 387,col 9)-(line 387,col 25)",
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 27)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 392,col 9)-(line 392,col 51)",
        "(line 393,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 37)",
        "(line 425,col 9)-(line 426,col 65)",
        "(line 428,col 9)-(line 429,col 74)",
        "(line 431,col 9)-(line 433,col 36)",
        "(line 435,col 9)-(line 436,col 70)",
        "(line 438,col 9)-(line 438,col 31)",
        "(line 439,col 9)-(line 439,col 31)",
        "(line 440,col 9)-(line 440,col 34)",
        "(line 441,col 9)-(line 441,col 31)",
        "(line 442,col 9)-(line 442,col 31)",
        "(line 443,col 9)-(line 443,col 25)",
        "(line 445,col 9)-(line 445,col 35)",
        "(line 446,col 9)-(line 446,col 38)",
        "(line 448,col 9)-(line 448,col 34)",
        "(line 449,col 9)-(line 449,col 40)",
        "(line 452,col 9)-(line 452,col 17)",
        "(line 453,col 9)-(line 453,col 17)",
        "(line 454,col 9)-(line 455,col 64)",
        "(line 457,col 9)-(line 457,col 43)",
        "(line 458,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 32)",
        "(line 493,col 9)-(line 493,col 22)",
        "(line 494,col 9)-(line 494,col 23)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 38)",
        "(line 499,col 9)-(line 510,col 9)",
        "(line 513,col 9)-(line 513,col 16)",
        "(line 514,col 9)-(line 514,col 38)",
        "(line 515,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 528,col 28)",
        "(line 531,col 9)-(line 531,col 23)",
        "(line 532,col 9)-(line 574,col 9)",
        "(line 576,col 9)-(line 576,col 38)",
        "(line 577,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 588,col 9)",
        "(line 590,col 9)-(line 590,col 30)",
        "(line 591,col 9)-(line 591,col 43)",
        "(line 592,col 9)-(line 592,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.drawSide(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Arc2D, java.awt.geom.Area, java.awt.geom.Area, java.awt.Paint, java.awt.Paint, java.awt.Stroke, boolean, boolean)",
      "begin_line": 610,
      "end_line": 970,
      "comment": "\r\n     * Draws the side of a pie section.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param arc  the arc.\r\n     * @param front  the front of the pie.\r\n     * @param back  the back of the pie.\r\n     * @param paint  the color.\r\n     * @param outlinePaint  the outline paint.\r\n     * @param outlineStroke  the outline stroke.\r\n     * @param drawFront  draw the front?\r\n     * @param drawBack  draw the back?\r\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 627,col 9)",
        "(line 629,col 9)-(line 629,col 43)",
        "(line 630,col 9)-(line 630,col 45)",
        "(line 631,col 9)-(line 631,col 36)",
        "(line 633,col 9)-(line 633,col 36)",
        "(line 636,col 9)-(line 968,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getPlotType()",
      "begin_line": 977,
      "end_line": 979,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return \u003ci\u003ePie 3D Plot\u003c/i\u003e.\r\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.isAngleAtFront(double)",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\r\n     * A utility method that returns true if the angle represents a point at \r\n     * the front of the 3D pie chart.  0 - 180 degrees is the back, 180 - 360 \r\n     * is the front.\r\n     *\r\n     * @param angle  the angle.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.isAngleAtBack(double)",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * A utility method that returns true if the angle represents a point at \r\n     * the back of the 3D pie chart.  0 - 180 degrees is the back, 180 - 360 \r\n     * is the front.\r\n     *\r\n     * @param angle  the angle.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the angle is at the back of the pie.\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.equals(java.lang.Object)",
      "begin_line": 1014,
      "end_line": 1029,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1021,col 41)",
        "(line 1022,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 33)"
      ]
    }
  ]
}