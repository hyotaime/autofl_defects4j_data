{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/CrosshairState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrosshairState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 502,
      "comment": "\r\n * Maintains state information about crosshairs on a plot between successive\r\n * calls to the renderer\u0027s draw method.  This class is used internally by\r\n * JFreeChart - it is not intended for external use.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "calculateDistanceInDataSpace"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * A flag that controls whether the distance is calculated in data space\r\n     * or Java2D space.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "anchorX"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The x-value (in data space) for the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "anchorY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The y-value (in data space) for the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The anchor point in Java2D space - if null, don\u0027t update crosshair. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairX"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The x-value for the current crosshair point. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairY"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The y-value for the current crosshair point. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * The dataset index that the crosshair point relates to (this determines\r\n     * the axes that the crosshairs will be plotted against).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisIndex"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * The index of the domain axis that the crosshair x-value is measured\r\n     * against.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisIndex"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\r\n     * The index of the range axis that the crosshair y-value is measured\r\n     * against.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "distance"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\r\n     * The smallest distance (so far) between the anchor point and a data\r\n     * point.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CrosshairState.CrosshairState()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Creates a new \u003ccode\u003eCrosshairState\u003c/code\u003e instance that calculates\r\n     * distance in Java2D space.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CrosshairState.CrosshairState(boolean)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Creates a new \u003ccode\u003eCrosshairState\u003c/code\u003e instance.\r\n     *\r\n     * @param calculateDistanceInDataSpace  a flag that controls whether the\r\n     *                                      distance is calculated in data\r\n     *                                      space or Java2D space.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairDistance()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the distance between the anchor point and the current crosshair\r\n     * point.\r\n     *\r\n     * @return The distance.\r\n     *\r\n     * @see #setCrosshairDistance(double)\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairDistance(double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Sets the distance between the anchor point and the current crosshair\r\n     * point.  As each data point is processed, its distance to the anchor\r\n     * point is compared with this value and, if it is closer, the data point\r\n     * becomes the new crosshair point.\r\n     *\r\n     * @param distance  the distance.\r\n     *\r\n     * @see #getCrosshairDistance()\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairPoint(double, double, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "\r\n     * Evaluates a data point and if it is the closest to the anchor point it\r\n     * becomes the new crosshair point.\r\n     * \u003cP\u003e\r\n     * To understand this method, you need to know the context in which it will\r\n     * be called.  An instance of this class is passed to an\r\n     * {@link org.jfree.chart.renderer.xy.XYItemRenderer} as\r\n     * each data point is plotted.  As the point is plotted, it is passed to\r\n     * this method to see if it should be the new crosshair point.\r\n     *\r\n     * @param x  x coordinate (measured against the domain axis).\r\n     * @param y  y coordinate (measured against the range axis).\r\n     * @param transX  x translated into Java2D space.\r\n     * @param transY  y translated into Java2D space.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @deprecated Use {@link #updateCrosshairPoint(double, double, int, int,\r\n     *     double, double, PlotOrientation)}.  See bug report 1086307.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairPoint(double, double, int, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 206,
      "end_line": 237,
      "comment": "\r\n     * Evaluates a data point and if it is the closest to the anchor point it\r\n     * becomes the new crosshair point.\r\n     * \u003cP\u003e\r\n     * To understand this method, you need to know the context in which it will\r\n     * be called.  An instance of this class is passed to an\r\n     * {@link org.jfree.chart.renderer.xy.XYItemRenderer} as\r\n     * each data point is plotted.  As the point is plotted, it is passed to\r\n     * this method to see if it should be the new crosshair point.\r\n     *\r\n     * @param x  x coordinate (measured against the domain axis).\r\n     * @param y  y coordinate (measured against the range axis).\r\n     * @param domainAxisIndex  the index of the domain axis for this point.\r\n     * @param rangeAxisIndex  the index of the range axis for this point.\r\n     * @param transX  x translated into Java2D space.\r\n     * @param transY  y translated into Java2D space.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairX(double)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Evaluates an x-value and if it is the closest to the anchor x-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the x-axis is numerical.\r\n     *\r\n     * @param candidateX  x position of the candidate for the new crosshair\r\n     *                    point.\r\n     *\r\n     * @deprecated Use {@link #updateCrosshairX(double, int)}.  See bug report\r\n     *     1086307.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairX(double, int)",
      "begin_line": 267,
      "end_line": 276,
      "comment": "\r\n     * Evaluates an x-value and if it is the closest to the anchor x-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the x-axis is numerical.\r\n     *\r\n     * @param candidateX  x position of the candidate for the new crosshair\r\n     *                    point.\r\n     * @param domainAxisIndex  the index of the domain axis for this x-value.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 55)",
        "(line 270,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairY(double)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Evaluates a y-value and if it is the closest to the anchor y-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the y-axis is numerical.\r\n     *\r\n     * @param candidateY  y position of the candidate for the new crosshair\r\n     *                    point.\r\n     *\r\n     * @deprecated Use {@link #updateCrosshairY(double, int)}.  See bug report\r\n     *     1086307.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.updateCrosshairY(double, int)",
      "begin_line": 306,
      "end_line": 314,
      "comment": "\r\n     * Evaluates a y-value and if it is the closest to the anchor y-value it\r\n     * becomes the new crosshair value.\r\n     * \u003cP\u003e\r\n     * Used in cases where only the y-axis is numerical.\r\n     *\r\n     * @param candidateY  y position of the candidate for the new crosshair\r\n     *                    point.\r\n     * @param rangeAxisIndex  the index of the range axis for this y-value.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 55)",
        "(line 308,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchor()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\r\n     * Returns the anchor point.\r\n     *\r\n     * @return The anchor point.\r\n     *\r\n     * @see #setAnchor(Point2D)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchor(java.awt.geom.Point2D)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Sets the anchor point.  This is usually the mouse click point in a chart\r\n     * panel, and the crosshair point will often be the data item that is\r\n     * closest to the anchor point.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * Note that the x and y coordinates (in data space) are not updated by\r\n     * this method - the caller is responsible for ensuring that this happens\r\n     * in sync.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getAnchor()\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchorX()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\r\n     * Returns the x-coordinate (in data space) for the anchor point.\r\n     *\r\n     * @return The x-coordinate of the anchor point.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchorX(double)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Sets the x-coordinate (in data space) for the anchor point.  Note that\r\n     * this does NOT update the anchor itself - the caller is responsible for\r\n     * ensuring this is done in sync.\r\n     *\r\n     * @param x  the x-coordinate.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getAnchorY()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns the y-coordinate (in data space) for the anchor point.\r\n     *\r\n     * @return The y-coordinate of teh anchor point.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setAnchorY(double)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\r\n     * Sets the y-coordinate (in data space) for the anchor point.  Note that\r\n     * this does NOT update the anchor itself - the caller is responsible for\r\n     * ensuring this is done in sync.\r\n     *\r\n     * @param y  the y-coordinate.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairX()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\r\n     * Get the x-value for the crosshair point.\r\n     *\r\n     * @return The x position of the crosshair point.\r\n     *\r\n     * @see #setCrosshairX(double)\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairX(double)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\r\n     * Sets the x coordinate for the crosshair.  This is the coordinate in data\r\n     * space measured against the domain axis.\r\n     *\r\n     * @param x the coordinate.\r\n     *\r\n     * @see #getCrosshairX()\r\n     * @see #setCrosshairY(double)\r\n     * @see #updateCrosshairPoint(double, double, double, double,\r\n     * PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getCrosshairY()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Get the y-value for the crosshair point.  This is the coordinate in data\r\n     * space measured against the range axis.\r\n     *\r\n     * @return The y position of the crosshair point.\r\n     *\r\n     * @see #setCrosshairY(double)\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setCrosshairY(double)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\r\n     * Sets the y coordinate for the crosshair.\r\n     *\r\n     * @param y  the y coordinate.\r\n     *\r\n     * @see #getCrosshairY()\r\n     * @see #setCrosshairX(double)\r\n     * @see #updateCrosshairPoint(double, double, double, double,\r\n     * PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getDatasetIndex()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\r\n     * Returns the dataset index that the crosshair values relate to.  The\r\n     * dataset is mapped to specific axes, and this is how the crosshairs are\r\n     * mapped also.\r\n     *\r\n     * @return The dataset index.\r\n     *\r\n     * @see #setDatasetIndex(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.setDatasetIndex(int)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\r\n     * Sets the dataset index that the current crosshair values relate to.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @see #getDatasetIndex()\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getDomainAxisIndex()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\r\n     * Returns the domain axis index for the crosshair x-value.\r\n     *\r\n     * @return The domain axis index.\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @deprecated As of version 1.0.11, the domain axis should be determined\r\n     *     using the dataset index.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CrosshairState.getRangeAxisIndex()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\r\n     * Returns the range axis index for the crosshair y-value.\r\n     *\r\n     * @return The range axis index.\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @deprecated As of version 1.0.11, the domain axis should be determined\r\n     *     using the dataset index.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 35)"
      ]
    }
  ]
}