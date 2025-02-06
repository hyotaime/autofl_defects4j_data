{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/PiePlotState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PiePlotState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 50,
      "end_line": 279,
      "comment": "\r\n * A renderer state.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "passesRequired"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The number of passes required by the renderer. "
    },
    {
      "type": "field",
      "varNames": [
        "total"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The total of the values in the dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "latestAngle"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The latest angle. "
    },
    {
      "type": "field",
      "varNames": [
        "explodedPieArea"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The exploded pie area. "
    },
    {
      "type": "field",
      "varNames": [
        "pieArea"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The pie area. "
    },
    {
      "type": "field",
      "varNames": [
        "pieCenterX"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The center of the pie in Java 2D coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "pieCenterY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The center of the pie in Java 2D coordinates. "
    },
    {
      "type": "field",
      "varNames": [
        "pieHRadius"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The vertical pie radius. "
    },
    {
      "type": "field",
      "varNames": [
        "pieWRadius"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The horizontal pie radius. "
    },
    {
      "type": "field",
      "varNames": [
        "linkArea"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The link area. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.PiePlotState.PiePlotState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\r\n     * Creates a new object for recording temporary state information for a \r\n     * renderer.\r\n     * \r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPassesRequired()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the number of passes required by the renderer.\r\n     * \r\n     * @return The number of passes.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPassesRequired(int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Sets the number of passes required by the renderer.\r\n     * \r\n     * @param passes  the passes.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getTotal()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the total of the values in the dataset.\r\n     * \r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setTotal(double)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Sets the total.\r\n     * \r\n     * @param total  the total.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getLatestAngle()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the latest angle.\r\n     * \r\n     * @return The latest angle.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setLatestAngle(double)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Sets the latest angle.\r\n     * \r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPieArea()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the pie area.\r\n     * \r\n     * @return The pie area.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPieArea(java.awt.geom.Rectangle2D)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Sets the pie area.\r\n     * \r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 163,col 8)-(line 163,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getExplodedPieArea()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Returns the exploded pie area.\r\n     * \r\n     * @return The exploded pie area.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setExplodedPieArea(java.awt.geom.Rectangle2D)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Sets the exploded pie area.\r\n     * \r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPieCenterX()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the x-coordinate of the center of the pie chart.\r\n     * \r\n     * @return The x-coordinate (in Java2D space).\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPieCenterX(double)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Sets the x-coordinate of the center of the pie chart.\r\n     * \r\n     * @param x  the x-coordinate (in Java2D space).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPieCenterY()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the y-coordinate (in Java2D space) of the center of the pie \r\n     * chart.  For the {@link PiePlot3D} class, we derive this from the top of\r\n     * the pie.\r\n     * \r\n     * @return The y-coordinate (in Java2D space).\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPieCenterY(double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Sets the y-coordinate of the center of the pie chart.  This method is \r\n     * used by the plot and typically is not called directly by applications.\r\n     * \r\n     * @param y  the y-coordinate (in Java2D space).\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getLinkArea()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the link area.  This defines the \"dog-leg\" point for the label \r\n     * linking lines.\r\n     * \r\n     * @return The link area.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setLinkArea(java.awt.geom.Rectangle2D)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Sets the label link area.  This defines the \"dog-leg\" point for the \r\n     * label linking lines.\r\n     * \r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPieHRadius()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the vertical pie radius.\r\n     * \r\n     * @return The radius.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPieHRadius(double)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Sets the vertical pie radius.\r\n     * \r\n     * @param radius  the radius.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.getPieWRadius()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the horizontal pie radius.\r\n     * \r\n     * @return The radius.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.PiePlotState.setPieWRadius(double)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Sets the horizontal pie radius.\r\n     * \r\n     * @param radius  the radius.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 33)"
      ]
    }
  ]
}