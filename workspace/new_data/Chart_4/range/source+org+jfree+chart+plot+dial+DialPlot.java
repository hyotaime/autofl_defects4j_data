{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/DialPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.dial.DialLayerChangeListener"
      ],
      "begin_line": 74,
      "end_line": 838,
      "comment": "\n * A dial plot composed of user-definable layers.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "background"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The background layer (optional).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cap"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The needle cap (optional).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dialFrame"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The dial frame.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The dataset(s) for the dial plot.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scales"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * The scale(s) for the dial plot.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToScaleMap"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Storage for keys that map datasets to scales. "
    },
    {
      "type": "field",
      "varNames": [
        "layers"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * The drawing layers for the dial plot.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The pointer(s) for the dial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "viewX"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The x-coordinate for the view window.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "viewY"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * The y-coordinate for the view window.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "viewW"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The width of the view window, expressed as a percentage.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "viewH"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The height of the view window, expressed as a percentage.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPlot.DialPlot()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialPlot\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialPlot.DialPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 146,
      "end_line": 162,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialPlot\u003c/code\u003e.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 24)",
        "(line 149,col 9)-(line 149,col 44)",
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 48)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 159,col 9)-(line 159,col 25)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getBackground()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the background.\n     *\n     * @return The background (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setBackground(DialLayer)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setBackground(org.jfree.chart.plot.dial.DialLayer)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Sets the background layer and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param background  the background layer (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @see #getBackground()\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getCap()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns the cap.\n     *\n     * @return The cap (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setCap(DialLayer)\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setCap(org.jfree.chart.plot.dial.DialLayer)",
      "begin_line": 213,
      "end_line": 222,
      "comment": "\n     * Sets the cap and sends a {@link PlotChangeEvent} to all registered\n     * listeners.\n     *\n     * @param cap  the cap (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @see #getCap()\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 23)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getDialFrame()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the dial\u0027s frame.\n     *\n     * @return The dial\u0027s frame (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setDialFrame(DialFrame)\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setDialFrame(org.jfree.chart.plot.dial.DialFrame)",
      "begin_line": 243,
      "end_line": 251,
      "comment": "\n     * Sets the dial\u0027s frame and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param frame  the frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getDialFrame()\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 50)",
        "(line 248,col 9)-(line 248,col 31)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getViewX()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the x-coordinate of the viewing rectangle.  This is specified\n     * in the range 0.0 to 1.0, relative to the dial\u0027s framing rectangle.\n     *\n     * @return The x-coordinate of the viewing rectangle.\n     *\n     * @see #setView(double, double, double, double)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getViewY()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns the y-coordinate of the viewing rectangle.  This is specified\n     * in the range 0.0 to 1.0, relative to the dial\u0027s framing rectangle.\n     *\n     * @return The y-coordinate of the viewing rectangle.\n     *\n     * @see #setView(double, double, double, double)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getViewWidth()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Returns the width of the viewing rectangle.  This is specified\n     * in the range 0.0 to 1.0, relative to the dial\u0027s framing rectangle.\n     *\n     * @return The width of the viewing rectangle.\n     *\n     * @see #setView(double, double, double, double)\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getViewHeight()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Returns the height of the viewing rectangle.  This is specified\n     * in the range 0.0 to 1.0, relative to the dial\u0027s framing rectangle.\n     *\n     * @return The height of the viewing rectangle.\n     *\n     * @see #setView(double, double, double, double)\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setView(double, double, double, double)",
      "begin_line": 315,
      "end_line": 321,
      "comment": "\n     * Sets the viewing rectangle, relative to the dial\u0027s framing rectangle,\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\n     *\n     * @param x  the x-coordinate (in the range 0.0 to 1.0).\n     * @param y  the y-coordinate (in the range 0.0 to 1.0).\n     * @param w  the width (in the range 0.0 to 1.0).\n     * @param h  the height (in the range 0.0 to 1.0).\n     *\n     * @see #getViewX()\n     * @see #getViewY()\n     * @see #getViewWidth()\n     * @see #getViewHeight()\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 317,col 23)",
        "(line 318,col 9)-(line 318,col 23)",
        "(line 319,col 9)-(line 319,col 23)",
        "(line 320,col 9)-(line 320,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.addLayer(org.jfree.chart.plot.dial.DialLayer)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * Adds a layer to the plot and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 31)",
        "(line 334,col 9)-(line 334,col 38)",
        "(line 335,col 9)-(line 335,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getLayerIndex(org.jfree.chart.plot.dial.DialLayer)",
      "begin_line": 345,
      "end_line": 350,
      "comment": "\n     * Returns the index for the specified layer.\n     *\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The layer index.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.removeLayer(int)",
      "begin_line": 358,
      "end_line": 365,
      "comment": "\n     * Removes the layer at the specified index and sends a\n     * {@link PlotChangeEvent} to all registered listeners.\n     *\n     * @param index  the index.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 61)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 34)",
        "(line 364,col 9)-(line 364,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.removeLayer(org.jfree.chart.plot.dial.DialLayer)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\n     * Removes the specified layer and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.addPointer(org.jfree.chart.plot.dial.DialPointer)",
      "begin_line": 384,
      "end_line": 391,
      "comment": "\n     * Adds a pointer to the plot and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param pointer  the pointer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 35)",
        "(line 389,col 9)-(line 389,col 40)",
        "(line 390,col 9)-(line 390,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getPointerIndex(org.jfree.chart.plot.dial.DialPointer)",
      "begin_line": 400,
      "end_line": 405,
      "comment": "\n     * Returns the index for the specified pointer.\n     *\n     * @param pointer  the pointer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The pointer index.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.removePointer(int)",
      "begin_line": 413,
      "end_line": 420,
      "comment": "\n     * Removes the pointer at the specified index and sends a\n     * {@link PlotChangeEvent} to all registered listeners.\n     *\n     * @param index  the index.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 69)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 36)",
        "(line 419,col 9)-(line 419,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.removePointer(org.jfree.chart.plot.dial.DialPointer)",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\n     * Removes the specified pointer and sends a {@link PlotChangeEvent} to all\n     * registered listeners.\n     *\n     * @param pointer  the pointer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getPointerForDataset(int)",
      "begin_line": 441,
      "end_line": 451,
      "comment": "\n     * Returns the dial pointer that is associated with the specified\n     * dataset, or \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param datasetIndex  the dataset index.\n     *\n     * @return The pointer.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 34)",
        "(line 443,col 9)-(line 443,col 53)",
        "(line 444,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getDataset()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * Returns the primary dataset for the plot.\n     *\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getDataset(int)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\n     * Returns the dataset at the given index.\n     *\n     * @param index  the dataset index.\n     *\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 35)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Sets the dataset for the plot, replacing the existing dataset, if there\n     * is one, and sends a {@link PlotChangeEvent} to all registered\n     * listeners.\n     *\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.setDataset(int, org.jfree.data.general.ValueDataset)",
      "begin_line": 494,
      "end_line": 509,
      "comment": "\n     * Sets a dataset for the plot.\n     *\n     * @param index  the dataset index.\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 72)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 42)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 506,col 73)",
        "(line 507,col 9)-(line 507,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getDatasetCount()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Returns the number of datasets.\n     *\n     * @return The number of datasets.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 532,
      "end_line": 606,
      "comment": "\n     * Draws the plot.  This method is usually called by the {@link JFreeChart}\n     * instance that manages the plot.\n     *\n     * @param g2  the graphics target.\n     * @param area  the area in which the plot should be drawn.\n     * @param anchor  the anchor point (typically the last point that the\n     *     mouse clicked on, \u003ccode\u003enull\u003c/code\u003e is permitted).\n     * @param parentState  the state for the parent plot (if any).\n     * @param info  used to collect plot rendering info (\u003ccode\u003enull\u003c/code\u003e\n     *     permitted).\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 38)",
        "(line 536,col 9)-(line 536,col 25)",
        "(line 539,col 9)-(line 539,col 46)",
        "(line 542,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 51)",
        "(line 555,col 9)-(line 568,col 9)",
        "(line 571,col 9)-(line 571,col 44)",
        "(line 572,col 9)-(line 585,col 9)",
        "(line 588,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.viewToFrame(java.awt.geom.Rectangle2D)",
      "begin_line": 615,
      "end_line": 621,
      "comment": "\n     * Returns the frame surrounding the specified view rectangle.\n     *\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The frame rectangle.\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 52)",
        "(line 617,col 9)-(line 617,col 54)",
        "(line 618,col 9)-(line 618,col 54)",
        "(line 619,col 9)-(line 619,col 55)",
        "(line 620,col 9)-(line 620,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getValue(int)",
      "begin_line": 630,
      "end_line": 640,
      "comment": "\n     * Returns the value from the specified dataset.\n     *\n     * @param datasetIndex  the dataset index.\n     *\n     * @return The data value.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 35)",
        "(line 632,col 9)-(line 632,col 56)",
        "(line 633,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.addScale(int, org.jfree.chart.plot.dial.DialScale)",
      "begin_line": 649,
      "end_line": 661,
      "comment": "\n     * Adds a dial scale to the plot and sends a {@link PlotChangeEvent} to\n     * all registered listeners.\n     *\n     * @param index  the scale index.\n     * @param scale  the scale (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 64)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 31)",
        "(line 658,col 9)-(line 658,col 38)",
        "(line 659,col 9)-(line 659,col 38)",
        "(line 660,col 9)-(line 660,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getScale(int)",
      "begin_line": 670,
      "end_line": 676,
      "comment": "\n     * Returns the scale at the given index.\n     *\n     * @param index  the scale index.\n     *\n     * @return The scale (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 32)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.mapDatasetToScale(int, int)",
      "begin_line": 684,
      "end_line": 687,
      "comment": "\n     * Maps a dataset to a particular scale.\n     *\n     * @param index  the dataset index (zero-based).\n     * @param scaleIndex  the scale index (zero-based).\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 67)",
        "(line 686,col 9)-(line 686,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getScaleForDataset(int)",
      "begin_line": 696,
      "end_line": 703,
      "comment": "\n     * Returns the dial scale for a specific dataset.\n     *\n     * @param datasetIndex  the dataset index.\n     *\n     * @return The dial scale.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 58)",
        "(line 698,col 9)-(line 698,col 80)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.rectangleByRadius(java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 714,
      "end_line": 724,
      "comment": "\n     * A utility method that computes a rectangle using relative radius values.\n     *\n     * @param rect  the reference rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param radiusW  the width radius (must be \u003e 0.0)\n     * @param radiusH  the height radius.\n     *\n     * @return A new rectangle.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 37)",
        "(line 720,col 9)-(line 720,col 37)",
        "(line 721,col 9)-(line 721,col 45)",
        "(line 722,col 9)-(line 722,col 46)",
        "(line 723,col 9)-(line 723,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.dialLayerChanged(org.jfree.chart.plot.dial.DialLayerChangeEvent)",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * Receives notification when a layer has changed, and responds by\n     * forwarding a {@link PlotChangeEvent} to all registered listeners.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.equals(java.lang.Object)",
      "begin_line": 745,
      "end_line": 781,
      "comment": "\n     * Tests this \u003ccode\u003eDialPlot\u003c/code\u003e instance for equality with an\n     * arbitrary object.  The plot\u0027s dataset(s) is (are) not included in\n     * the test.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 39)",
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.hashCode()",
      "begin_line": 788,
      "end_line": 802,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 25)",
        "(line 790,col 9)-(line 790,col 73)",
        "(line 791,col 9)-(line 791,col 66)",
        "(line 792,col 9)-(line 792,col 57)",
        "(line 793,col 9)-(line 793,col 56)",
        "(line 794,col 9)-(line 794,col 60)",
        "(line 795,col 9)-(line 795,col 51)",
        "(line 796,col 9)-(line 796,col 60)",
        "(line 797,col 9)-(line 797,col 51)",
        "(line 798,col 9)-(line 798,col 60)",
        "(line 799,col 9)-(line 799,col 51)",
        "(line 800,col 9)-(line 800,col 60)",
        "(line 801,col 9)-(line 801,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.getPlotType()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * Returns the plot type.\n     *\n     * @return \u003ccode\u003e\"DialPlot\"\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 820,
      "end_line": 822,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 832,
      "end_line": 835,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 35)"
      ]
    }
  ]
}