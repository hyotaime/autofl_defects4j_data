{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CrosshairState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrosshairState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 399,
      "comment": "\r\n * Maintains state information about crosshairs on a plot between successive \r\n * calls to the renderer\u0027s draw method.  This class is used internally by \r\n * JFreeChart - it is not intended for external use.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "calculateDistanceInDataSpace"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \r\n     * A flag that controls whether the distance is calculated in data space \r\n     * or Java2D space.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "anchorX"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The x-value (in data space) for the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "anchorY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The y-value (in data space) for the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The anchor point in Java2D space - if null, don\u0027t update crosshair. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairX"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The x-value for the current crosshair point. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairY"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The y-value for the current crosshair point. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisIndex"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\r\n     * The index of the domain axis that the crosshair x-value is measured\r\n     * against.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisIndex"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The index of the range axis that the crosshair y-value is measured\r\n     * against.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "distance"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " \r\n     * The smallest distance (so far) between the anchor point and a data point. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CrosshairState.CrosshairState()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Creates a new \u003ccode\u003eCrosshairState\u003c/code\u003e instance that calculates\r\n     * distance in Java2D space.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CrosshairState.CrosshairState(boolean)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Creates a new \u003ccode\u003eCrosshairState\u003c/code\u003e instance.\r\n     * \r\n     * @param calculateDistanceInDataSpace  a flag that controls whether the \r\n     *                                      distance is calculated in data \r\n     *                                      space or Java2D space.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairDistance()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the distance between the anchor point and the current crosshair\r\n     * point.\r\n     * \r\n     * @return The distance.\r\n     * \r\n     * @see #setCrosshairDistance(double)\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairDistance(double)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Sets the distance between the anchor point and the current crosshair \r\n     * point.  As each data point is processed, its distance to the anchor \r\n     * point is compared with this value and, if it is closer, the data point \r\n     * becomes the new crosshair point.\r\n     *\r\n     * @param distance  the distance.\r\n     * \r\n     * @see #getCrosshairDistance()\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairPoint(double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 171,
      "end_line": 202,
      "comment": "\r\n     * Evaluates a data point and if it is the closest to the anchor point it\r\n     * becomes the new crosshair point.\r\n     * \u003cP\u003e\r\n     * To understand this method, you need to know the context in which it will\r\n     * be called.  An instance of this class is passed to an \r\n     * {@link org.jfree.chart.renderer.xy.XYItemRenderer} as\r\n     * each data point is plotted.  As the point is plotted, it is passed to\r\n     * this method to see if it should be the new crosshair point.\r\n     *\r\n     * @param x  x coordinate (measured against the domain axis).\r\n     * @param y  y coordinate (measured against the range axis).\r\n     * @param domainAxisIndex  the index of the domain axis for this point.\r\n     * @param rangeAxisIndex  the index of the range axis for this point.\r\n     * @param transX  x translated into Java2D space.\r\n     * @param transY  y translated into Java2D space.\r\n     * @param orientation  the plot orientation.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairX(double, int)",
      "begin_line": 216,
      "end_line": 225,
      "comment": "\r\n     * Evaluates an x-value and if it is the closest to the anchor x-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the x-axis is numerical.\r\n     *\r\n     * @param candidateX  x position of the candidate for the new crosshair \r\n     *                    point.\r\n     * @param domainAxisIndex  the index of the domain axis for this x-value.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 55)",
        "(line 219,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairY(double, int)",
      "begin_line": 239,
      "end_line": 247,
      "comment": "\r\n     * Evaluates a y-value and if it is the closest to the anchor y-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the y-axis is numerical.\r\n     *\r\n     * @param candidateY  y position of the candidate for the new crosshair \r\n     *                    point.\r\n     * @param rangeAxisIndex  the index of the range axis for this y-value.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 55)",
        "(line 241,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchor()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the anchor point.\r\n     * \r\n     * @return The anchor point.\r\n     * \r\n     * @see #setAnchor(Point2D)\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchor(java.awt.geom.Point2D)",
      "begin_line": 274,
      "end_line": 276,
      "comment": " \r\n     * Sets the anchor point.  This is usually the mouse click point in a chart\r\n     * panel, and the crosshair point will often be the data item that is \r\n     * closest to the anchor point.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the x and y coordinates (in data space) are not updated by \r\n     * this method - the caller is responsible for ensuring that this happens\r\n     * in sync.\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getAnchor()\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchorX()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the x-coordinate (in data space) for the anchor point.\r\n     * \r\n     * @return The x-coordinate of the anchor point.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchorX(double)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Sets the x-coordinate (in data space) for the anchor point.  Note that\r\n     * this does NOT update the anchor itself - the caller is responsible for\r\n     * ensuring this is done in sync.\r\n     * \r\n     * @param x  the x-coordinate.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchorY()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Returns the y-coordinate (in data space) for the anchor point.\r\n     * \r\n     * @return The y-coordinate of teh anchor point.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchorY(double)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Sets the y-coordinate (in data space) for the anchor point.  Note that\r\n     * this does NOT update the anchor itself - the caller is responsible for\r\n     * ensuring this is done in sync.\r\n     * \r\n     * @param y  the y-coordinate.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairX()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Get the x-value for the crosshair point.\r\n     *\r\n     * @return The x position of the crosshair point.\r\n     * \r\n     * @see #setCrosshairX(double)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairX(double)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\r\n     * Sets the x coordinate for the crosshair.  This is the coordinate in data\r\n     * space measured against the domain axis.\r\n     * \r\n     * @param x the coordinate.\r\n     * \r\n     * @see #getCrosshairX()\r\n     * @see #setCrosshairY(double)\r\n     * @see #updateCrosshairPoint(double, double, int, int, double, double, \r\n     * PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairY()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Get the y-value for the crosshair point.  This is the coordinate in data\r\n     * space measured against the range axis.\r\n     *\r\n     * @return The y position of the crosshair point.\r\n     * \r\n     * @see #setCrosshairY(double)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairY(double)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\r\n     * Sets the y coordinate for the crosshair.\r\n     * \r\n     * @param y  the y coordinate.\r\n     * \r\n     * @see #getCrosshairY()\r\n     * @see #setCrosshairX(double)\r\n     * @see #updateCrosshairPoint(double, double, int, int, double, double, \r\n     * PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getDomainAxisIndex()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\r\n     * Returns the domain axis index for the crosshair x-value.\r\n     * \r\n     * @return The domain axis index.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getRangeAxisIndex()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns the range axis index for the crosshair y-value.\r\n     * \r\n     * @return The range axis index.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 35)"
      ]
    }
  ]
}