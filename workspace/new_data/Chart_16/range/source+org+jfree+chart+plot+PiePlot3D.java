{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PiePlot3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PiePlot3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.PiePlot",
        "java.io.Serializable"
      ],
      "begin_line": 120,
      "end_line": 1028,
      "comment": "\r\n * A plot that displays data in the form of a 3D pie chart, using data from\r\n * any class that implements the {@link PieDataset} interface.\r\n * \u003cP\u003e\r\n * Although this class extends {@link PiePlot}, it does not currently support\r\n * exploded sections.\r\n "
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
        "depthFactor"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The factor of the depth of the pie from the plot height "
    },
    {
      "type": "field",
      "varNames": [
        "darkerSides"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " default preserves previous "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot3D.PiePlot3D()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Creates a new instance with no dataset.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlot3D.PiePlot3D(org.jfree.data.general.PieDataset)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\r\n     * Creates a pie chart with a three dimensional effect using the specified \r\n     * dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 23)",
        "(line 152,col 9)-(line 152,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getDepthFactor()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the depth factor for the chart.\r\n     *\r\n     * @return The depth factor.\r\n     * \r\n     * @see #setDepthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.setDepthFactor(double)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\r\n     * Sets the pie depth as a percentage of the height of the plot area, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param factor  the depth factor (for example, 0.20 is twenty percent).\r\n     * \r\n     * @see #getDepthFactor()\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getDarkerSides()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns a flag that controls whether or not the sides of the pie chart\r\n     * are rendered using a darker colour.  This is only applied if the\r\n     * section colour is an instance of {@link java.awt.Color}.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setDarkerSides(boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.setDarkerSides(boolean)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\r\n     * Sets a flag that controls whether or not the sides of the pie chart\r\n     * are rendered using a darker colour, and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.  This is only applied if the\r\n     * section colour is an instance of {@link java.awt.Color}.\r\n     *\r\n     * @param darker true to darken the sides, false to use the default \r\n     *         behaviour.\r\n     * \r\n     * @see #getDarkerSides()\r\n     * \r\n     * @since 1.0.7.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 34)",
        "(line 209,col 9)-(line 209,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 225,
      "end_line": 591,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).  This method is called by the \r\n     * {@link org.jfree.chart.JFreeChart} class, you don\u0027t normally need \r\n     * to call it yourself.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point.\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing \r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 45)",
        "(line 231,col 9)-(line 231,col 30)",
        "(line 233,col 9)-(line 233,col 70)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 37)",
        "(line 241,col 9)-(line 241,col 39)",
        "(line 242,col 9)-(line 242,col 26)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 34)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 251,col 38)",
        "(line 252,col 9)-(line 252,col 69)",
        "(line 254,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 59)",
        "(line 267,col 9)-(line 267,col 57)",
        "(line 268,col 9)-(line 268,col 59)",
        "(line 269,col 9)-(line 269,col 58)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 72)",
        "(line 284,col 9)-(line 285,col 48)",
        "(line 286,col 9)-(line 286,col 38)",
        "(line 288,col 9)-(line 294,col 9)",
        "(line 299,col 9)-(line 299,col 49)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 302,col 58)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 309,col 9)-(line 309,col 66)",
        "(line 310,col 9)-(line 310,col 79)",
        "(line 312,col 9)-(line 312,col 53)",
        "(line 313,col 9)-(line 313,col 54)",
        "(line 314,col 9)-(line 316,col 75)",
        "(line 320,col 9)-(line 320,col 67)",
        "(line 321,col 9)-(line 322,col 31)",
        "(line 323,col 9)-(line 323,col 36)",
        "(line 325,col 9)-(line 325,col 34)",
        "(line 326,col 9)-(line 326,col 50)",
        "(line 327,col 9)-(line 327,col 64)",
        "(line 328,col 9)-(line 328,col 54)",
        "(line 329,col 9)-(line 329,col 65)",
        "(line 332,col 9)-(line 332,col 42)",
        "(line 333,col 9)-(line 338,col 9)",
        "(line 341,col 9)-(line 352,col 9)",
        "(line 356,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 45)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 370,col 9)-(line 370,col 37)",
        "(line 371,col 9)-(line 371,col 37)",
        "(line 374,col 9)-(line 374,col 56)",
        "(line 375,col 9)-(line 376,col 39)",
        "(line 378,col 9)-(line 378,col 79)",
        "(line 379,col 9)-(line 379,col 32)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 44)",
        "(line 385,col 9)-(line 385,col 25)",
        "(line 386,col 9)-(line 386,col 20)",
        "(line 387,col 9)-(line 387,col 27)",
        "(line 388,col 9)-(line 388,col 29)",
        "(line 390,col 9)-(line 390,col 51)",
        "(line 391,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 37)",
        "(line 423,col 9)-(line 424,col 65)",
        "(line 426,col 9)-(line 427,col 74)",
        "(line 429,col 9)-(line 431,col 36)",
        "(line 433,col 9)-(line 434,col 70)",
        "(line 436,col 9)-(line 436,col 31)",
        "(line 437,col 9)-(line 437,col 31)",
        "(line 438,col 9)-(line 438,col 34)",
        "(line 439,col 9)-(line 439,col 31)",
        "(line 440,col 9)-(line 440,col 31)",
        "(line 441,col 9)-(line 441,col 25)",
        "(line 443,col 9)-(line 443,col 35)",
        "(line 444,col 9)-(line 444,col 38)",
        "(line 446,col 9)-(line 446,col 34)",
        "(line 447,col 9)-(line 447,col 40)",
        "(line 450,col 9)-(line 450,col 17)",
        "(line 451,col 9)-(line 451,col 17)",
        "(line 452,col 9)-(line 453,col 64)",
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 22)",
        "(line 492,col 9)-(line 492,col 23)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 38)",
        "(line 497,col 9)-(line 508,col 9)",
        "(line 511,col 9)-(line 511,col 16)",
        "(line 512,col 9)-(line 512,col 38)",
        "(line 513,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 28)",
        "(line 529,col 9)-(line 529,col 23)",
        "(line 530,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 30)",
        "(line 588,col 9)-(line 588,col 43)",
        "(line 589,col 9)-(line 589,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.drawSide(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Arc2D, java.awt.geom.Area, java.awt.geom.Area, java.awt.Paint, java.awt.Paint, java.awt.Stroke, boolean, boolean)",
      "begin_line": 607,
      "end_line": 967,
      "comment": "\r\n     * Draws the side of a pie section.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param arc  the arc.\r\n     * @param front  the front of the pie.\r\n     * @param back  the back of the pie.\r\n     * @param paint  the color.\r\n     * @param outlinePaint  the outline paint.\r\n     * @param outlineStroke  the outline stroke.\r\n     * @param drawFront  draw the front?\r\n     * @param drawBack  draw the back?\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 626,col 43)",
        "(line 627,col 9)-(line 627,col 45)",
        "(line 628,col 9)-(line 628,col 36)",
        "(line 630,col 9)-(line 630,col 36)",
        "(line 633,col 9)-(line 965,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.getPlotType()",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return \u003ci\u003ePie 3D Plot\u003c/i\u003e.\r\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.isAngleAtFront(double)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\r\n     * A utility method that returns true if the angle represents a point at \r\n     * the front of the 3D pie chart.  0 - 180 degrees is the back, 180 - 360 \r\n     * is the front.\r\n     *\r\n     * @param angle  the angle.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.isAngleAtBack(double)",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\r\n     * A utility method that returns true if the angle represents a point at \r\n     * the back of the 3D pie chart.  0 - 180 degrees is the back, 180 - 360 \r\n     * is the front.\r\n     *\r\n     * @param angle  the angle.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the angle is at the back of the pie.\r\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlot3D.equals(java.lang.Object)",
      "begin_line": 1011,
      "end_line": 1026,
      "comment": "\r\n     * Tests this plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 41)",
        "(line 1019,col 9)-(line 1021,col 9)",
        "(line 1022,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1025,col 33)"
      ]
    }
  ]
}