{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/XYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 277,
      "end_line": 5063,
      "comment": "\r\n * A general class for plotting data in the form of (x, y) pairs.  This plot can\r\n * use data from any class that implements the {@link XYDataset} interface.\r\n * \u003cP\u003e\r\n * \u003ccode\u003eXYPlot\u003c/code\u003e makes use of an {@link XYItemRenderer} to draw each point\r\n * on the plot.  By using different renderers, various chart types can be\r\n * produced.\r\n * \u003cp\u003e\r\n * The {@link org.jfree.chart.ChartFactory} class contains static methods for\r\n * creating pre-configured charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 284,
      "end_line": 286,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 295,
      "end_line": 296,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 302,
      "end_line": 304,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The domain axis / axes (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The range axis location. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxisMap"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to domain axes.  If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxisMap"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to range axes. If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantOrigin"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " The origin point for the quadrants (if drawn). "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantPaint"
      ],
      "begin_line": 348,
      "end_line": 349,
      "comment": " The paint used for each quadrant. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineVisible"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the domain\r\n     * axis is visible.\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineStroke"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " \r\n     * The stroke used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselinePaint"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " \r\n     * The paint used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The stroke used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " The paint used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " A flag that controls whether or not a domain crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairValue"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " The domain crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairLockedOnData"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " A flag that controls whether or not a range crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": " A map of lists of foreground markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": " A map of lists of background markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": " A map of lists of foreground markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": " A map of lists of background markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": " \r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainTickBandPaint"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " The paint used for the domain tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeTickBandPaint"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " The paint used for the range tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": " The fixed domain axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " The fixed range axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetRenderingOrder"
      ],
      "begin_line": 474,
      "end_line": 475,
      "comment": "\r\n     * The order of the dataset rendering (REVERSE draws the primary dataset\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRenderingOrder"
      ],
      "begin_line": 481,
      "end_line": 482,
      "comment": "\r\n     * The order of the series rendering (REVERSE draws the primary series\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": "\r\n     * The weight for this plot (only relevant if this is a subplot in a\r\n     * combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYPlot\u003c/code\u003e instance with no dataset, no axes and\r\n     * no renderer.  You should specify these items before using the plot.\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 515,
      "end_line": 601,
      "comment": "\r\n     * Creates a new plot with the specified dataset, axes and renderer.  Any\r\n     * of the arguments can be \u003ccode\u003enull\u003c/code\u003e, but in that case you should\r\n     * take care to specify the value before using the plot (otherwise a\r\n     * \u003ccode\u003eNullPointerException\u003c/code\u003e may be thrown).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 16)",
        "(line 522,col 9)-(line 522,col 52)",
        "(line 523,col 9)-(line 523,col 24)",
        "(line 524,col 9)-(line 524,col 66)",
        "(line 527,col 9)-(line 527,col 43)",
        "(line 528,col 9)-(line 528,col 52)",
        "(line 529,col 9)-(line 529,col 53)",
        "(line 530,col 9)-(line 530,col 53)",
        "(line 532,col 9)-(line 532,col 42)",
        "(line 533,col 9)-(line 533,col 51)",
        "(line 534,col 9)-(line 534,col 52)",
        "(line 535,col 9)-(line 535,col 52)",
        "(line 537,col 9)-(line 537,col 41)",
        "(line 538,col 9)-(line 538,col 42)",
        "(line 540,col 9)-(line 540,col 52)",
        "(line 541,col 9)-(line 541,col 51)",
        "(line 543,col 9)-(line 543,col 38)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 548,col 40)",
        "(line 549,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 43)",
        "(line 555,col 9)-(line 555,col 42)",
        "(line 556,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 69)",
        "(line 562,col 9)-(line 562,col 41)",
        "(line 563,col 9)-(line 563,col 41)",
        "(line 564,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 68)",
        "(line 570,col 9)-(line 570,col 30)",
        "(line 571,col 9)-(line 571,col 29)",
        "(line 573,col 9)-(line 573,col 43)",
        "(line 574,col 9)-(line 574,col 60)",
        "(line 575,col 9)-(line 575,col 58)",
        "(line 577,col 9)-(line 577,col 47)",
        "(line 578,col 9)-(line 578,col 51)",
        "(line 579,col 9)-(line 579,col 62)",
        "(line 581,col 9)-(line 581,col 42)",
        "(line 582,col 9)-(line 582,col 59)",
        "(line 583,col 9)-(line 583,col 57)",
        "(line 585,col 9)-(line 585,col 46)",
        "(line 586,col 9)-(line 586,col 50)",
        "(line 587,col 9)-(line 587,col 61)",
        "(line 589,col 9)-(line 589,col 44)",
        "(line 590,col 9)-(line 590,col 40)",
        "(line 591,col 9)-(line 591,col 62)",
        "(line 592,col 9)-(line 592,col 60)",
        "(line 594,col 9)-(line 594,col 43)",
        "(line 595,col 9)-(line 595,col 39)",
        "(line 596,col 9)-(line 596,col 61)",
        "(line 597,col 9)-(line 597,col 59)",
        "(line 599,col 9)-(line 599,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getPlotType()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getOrientation()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 631,
      "end_line": 639,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     * \r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAxisOffset()",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 33)",
        "(line 665,col 9)-(line 665,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis()",
      "begin_line": 678,
      "end_line": 680,
      "comment": "\r\n     * Returns the domain axis with index 0.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s \r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setDomainAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis(int)",
      "begin_line": 691,
      "end_line": 704,
      "comment": "\r\n     * Returns the domain axis with the specified index, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 32)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis()\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 743,
      "end_line": 759,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 50)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 41)",
        "(line 752,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 758,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 769,
      "end_line": 774,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\r\n     * Returns the location of the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 795,
      "end_line": 798,
      "comment": "\r\n     * Sets the location of the primary domain axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 809,
      "end_line": 812,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge()",
      "begin_line": 823,
      "end_line": 826,
      "comment": "\r\n     * Returns the edge for the primary domain axis (taking into account the\r\n     * plot\u0027s orientation).\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 825,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisCount()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getRangeAxisCount()\r\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainAxes()",
      "begin_line": 845,
      "end_line": 854,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearRangeAxes()\r\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 32)",
        "(line 853,col 9)-(line 853,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureDomainAxes()",
      "begin_line": 859,
      "end_line": 866,
      "comment": "\r\n     * Configures the domain axes. \r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 865,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation(int)",
      "begin_line": 879,
      "end_line": 888,
      "comment": "\r\n     * Returns the location for a domain axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary domain axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 35)",
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 900,
      "end_line": 903,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for index\r\n     *     0).\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 919,
      "end_line": 930,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 925,col 9)",
        "(line 926,col 9)-(line 926,col 54)",
        "(line 927,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge(int)",
      "begin_line": 941,
      "end_line": 949,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisEdge(int)\r\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 61)",
        "(line 943,col 9)-(line 944,col 34)",
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 948,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s range \r\n     * axis (if there is a parent plot).\r\n     *\r\n     * @return The range axis.\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 974,
      "end_line": 993,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 981,col 9)-(line 981,col 44)",
        "(line 982,col 9)-(line 984,col 9)",
        "(line 986,col 9)-(line 986,col 36)",
        "(line 987,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\r\n     * Returns the location of the primary range axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1014,
      "end_line": 1017,
      "comment": "\r\n     * Sets the location of the primary range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1028,
      "end_line": 1031,
      "comment": "\r\n     * Sets the location of the primary range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge()",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "\r\n     * Returns the edge for the primary range axis.\r\n     *\r\n     * @return The range axis edge.\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1043,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis(int)",
      "begin_line": 1055,
      "end_line": 1068,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 32)",
        "(line 1057,col 9)-(line 1059,col 9)",
        "(line 1060,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1093,
      "end_line": 1109,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 49)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1101,col 40)",
        "(line 1102,col 9)-(line 1105,col 9)",
        "(line 1106,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setDomainAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1122,col 9)",
        "(line 1123,col 9)-(line 1123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisCount()",
      "begin_line": 1133,
      "end_line": 1135,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getDomainAxisCount()\r\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeAxes()",
      "begin_line": 1143,
      "end_line": 1152,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1149,col 9)",
        "(line 1150,col 9)-(line 1150,col 31)",
        "(line 1151,col 9)-(line 1151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureRangeAxes()",
      "begin_line": 1159,
      "end_line": 1166,
      "comment": "\r\n     * Configures the range axes.\r\n     * \r\n     * @see #configureDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation(int)",
      "begin_line": 1179,
      "end_line": 1188,
      "comment": "\r\n     * Returns the location for a range axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary range axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 35)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1187,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1199,
      "end_line": 1202,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1218,
      "end_line": 1229,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 53)",
        "(line 1226,col 9)-(line 1228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge(int)",
      "begin_line": 1241,
      "end_line": 1249,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 60)",
        "(line 1243,col 9)-(line 1244,col 34)",
        "(line 1245,col 9)-(line 1247,col 9)",
        "(line 1248,col 9)-(line 1248,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset()",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataset(int)\r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset(int)",
      "begin_line": 1272,
      "end_line": 1278,
      "comment": "\r\n     * Returns a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 32)",
        "(line 1274,col 9)-(line 1276,col 9)",
        "(line 1277,col 9)-(line 1277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": "\r\n     * Sets the primary dataset for the plot, replacing the existing dataset if\r\n     * there is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(int, org.jfree.data.xy.XYDataset)",
      "begin_line": 1301,
      "end_line": 1314,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1302,col 9)-(line 1302,col 47)",
        "(line 1303,col 9)-(line 1305,col 9)",
        "(line 1306,col 9)-(line 1306,col 42)",
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1312,col 9)-(line 1312,col 73)",
        "(line 1313,col 9)-(line 1313,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetCount()",
      "begin_line": 1321,
      "end_line": 1323,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1322,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.indexOf(org.jfree.data.xy.XYDataset)",
      "begin_line": 1333,
      "end_line": 1342,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1334,col 24)",
        "(line 1335,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1353,
      "end_line": 1358,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1354,col 9)-(line 1355,col 40)",
        "(line 1357,col 9)-(line 1357,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1369,
      "end_line": 1374,
      "comment": "\r\n     * Maps a dataset to a particular range axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1370,col 9)-(line 1371,col 40)",
        "(line 1373,col 9)-(line 1373,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer()",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\r\n     * Returns the renderer for the primary dataset.\r\n     *\r\n     * @return The item renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer(int)",
      "begin_line": 1396,
      "end_line": 1403,
      "comment": "\r\n     * Returns the renderer for a dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(int, XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 37)",
        "(line 1398,col 9)-(line 1400,col 9)",
        "(line 1401,col 9)-(line 1401,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1414,
      "end_line": 1416,
      "comment": "\r\n     * Sets the renderer for the primary dataset and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If the renderer\r\n     * is set to \u003ccode\u003enull\u003c/code\u003e, no data will be displayed.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1427,
      "end_line": 1429,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1428,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)",
      "begin_line": 1441,
      "end_line": 1457,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1443,col 9)-(line 1443,col 53)",
        "(line 1444,col 9)-(line 1446,col 9)",
        "(line 1447,col 9)-(line 1447,col 44)",
        "(line 1448,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1452,col 30)",
        "(line 1453,col 9)-(line 1453,col 29)",
        "(line 1454,col 9)-(line 1456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])",
      "begin_line": 1465,
      "end_line": 1470,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param renderers  the renderers (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1466,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1469,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder()",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1480,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1493,
      "end_line": 1499,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1494,col 9)-(line 1496,col 9)",
        "(line 1497,col 9)-(line 1497,col 43)",
        "(line 1498,col 9)-(line 1498,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder()",
      "begin_line": 1508,
      "end_line": 1510,
      "comment": "\r\n     * Returns the series rendering order.\r\n     *\r\n     * @return the order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesRenderingOrder(SeriesRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1509,col 9)-(line 1509,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)",
      "begin_line": 1522,
      "end_line": 1528,
      "comment": "\r\n     * Sets the series order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary series\r\n     * last (so that the primary series appears to be on top).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSeriesRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 42)",
        "(line 1527,col 9)-(line 1527,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1538,
      "end_line": 1540,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1539,col 9)-(line 1539,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererForDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1551,
      "end_line": 1563,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  The code first\r\n     * determines the index of the dataset, then checks if there is a\r\n     * renderer with the same index (if not, the method returns renderer(0).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 37)",
        "(line 1553,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getWeight()",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     * \r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 1574,col 9)-(line 1574,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setWeight(int)",
      "begin_line": 1585,
      "end_line": 1588,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     * \r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 29)",
        "(line 1587,col 9)-(line 1587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible()",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1613,
      "end_line": 1618,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1614,col 9)-(line 1617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlineStroke()",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1645,
      "end_line": 1651,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1646,col 9)-(line 1648,col 9)",
        "(line 1649,col 9)-(line 1649,col 43)",
        "(line 1650,col 9)-(line 1650,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlinePaint()",
      "begin_line": 1661,
      "end_line": 1663,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1662,col 9)-(line 1662,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1676,
      "end_line": 1682,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1679,col 9)",
        "(line 1680,col 9)-(line 1680,col 41)",
        "(line 1681,col 9)-(line 1681,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible()",
      "begin_line": 1692,
      "end_line": 1694,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1693,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 1707,
      "end_line": 1712,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlineStroke()",
      "begin_line": 1722,
      "end_line": 1724,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1723,col 9)-(line 1723,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 1734,
      "end_line": 1740,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1735,col 9)-(line 1737,col 9)",
        "(line 1738,col 9)-(line 1738,col 42)",
        "(line 1739,col 9)-(line 1739,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlinePaint()",
      "begin_line": 1750,
      "end_line": 1752,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 1762,
      "end_line": 1768,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1766,col 40)",
        "(line 1767,col 9)-(line 1767,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible()",
      "begin_line": 1780,
      "end_line": 1782,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1781,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible(boolean)",
      "begin_line": 1795,
      "end_line": 1798,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the domain axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #isDomainZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 1796,col 9)-(line 1796,col 49)",
        "(line 1797,col 9)-(line 1797,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke()",
      "begin_line": 1809,
      "end_line": 1811,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1810,col 9)-(line 1810,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1823,
      "end_line": 1829,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1826,col 9)",
        "(line 1827,col 9)-(line 1827,col 47)",
        "(line 1828,col 9)-(line 1828,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint()",
      "begin_line": 1841,
      "end_line": 1843,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * domain axis.\r\n     * \r\n     * @since 1.0.5\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1842,col 9)-(line 1842,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1855,
      "end_line": 1861,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 1856,col 9)-(line 1858,col 9)",
        "(line 1859,col 9)-(line 1859,col 45)",
        "(line 1860,col 9)-(line 1860,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible()",
      "begin_line": 1871,
      "end_line": 1873,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1872,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 1884,
      "end_line": 1887,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isRangeZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 1885,col 9)-(line 1885,col 48)",
        "(line 1886,col 9)-(line 1886,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke()",
      "begin_line": 1896,
      "end_line": 1898,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1897,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1908,
      "end_line": 1914,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 1909,col 9)-(line 1911,col 9)",
        "(line 1912,col 9)-(line 1912,col 46)",
        "(line 1913,col 9)-(line 1913,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint()",
      "begin_line": 1924,
      "end_line": 1926,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1925,col 9)-(line 1925,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1936,
      "end_line": 1942,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 1937,col 9)-(line 1939,col 9)",
        "(line 1940,col 9)-(line 1940,col 44)",
        "(line 1941,col 9)-(line 1941,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainTickBandPaint()",
      "begin_line": 1952,
      "end_line": 1954,
      "comment": "\r\n     * Returns the paint used for the domain tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1953,col 9)-(line 1953,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(java.awt.Paint)",
      "begin_line": 1963,
      "end_line": 1966,
      "comment": "\r\n     * Sets the paint for the domain tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 1964,col 9)-(line 1964,col 41)",
        "(line 1965,col 9)-(line 1965,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeTickBandPaint()",
      "begin_line": 1976,
      "end_line": 1978,
      "comment": "\r\n     * Returns the paint used for the range tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1977,col 9)-(line 1977,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeTickBandPaint(java.awt.Paint)",
      "begin_line": 1987,
      "end_line": 1990,
      "comment": "\r\n     * Sets the paint for the range tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 1988,col 9)-(line 1988,col 40)",
        "(line 1989,col 9)-(line 1989,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantOrigin()",
      "begin_line": 2000,
      "end_line": 2002,
      "comment": "\r\n     * Returns the origin for the quadrants that can be displayed on the plot.\r\n     * This defaults to (0, 0).\r\n     *\r\n     * @return The origin point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     ",
      "child_ranges": [
        "(line 2001,col 9)-(line 2001,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantOrigin(java.awt.geom.Point2D)",
      "begin_line": 2012,
      "end_line": 2018,
      "comment": "\r\n     * Sets the quadrant origin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param origin  the origin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getQuadrantOrigin()\r\n     ",
      "child_ranges": [
        "(line 2013,col 9)-(line 2015,col 9)",
        "(line 2016,col 9)-(line 2016,col 37)",
        "(line 2017,col 9)-(line 2017,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantPaint(int)",
      "begin_line": 2029,
      "end_line": 2035,
      "comment": "\r\n     * Returns the paint used for the specified quadrant.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2033,col 9)",
        "(line 2034,col 9)-(line 2034,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantPaint(int, java.awt.Paint)",
      "begin_line": 2046,
      "end_line": 2053,
      "comment": "\r\n     * Sets the paint used for the specified quadrant and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getQuadrantPaint(int)\r\n     ",
      "child_ranges": [
        "(line 2047,col 9)-(line 2050,col 9)",
        "(line 2051,col 9)-(line 2051,col 42)",
        "(line 2052,col 9)-(line 2052,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2067,
      "end_line": 2070,
      "comment": "\r\n     * Adds a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addDomainMarker(Marker, Layer)\r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2069,col 9)-(line 2069,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2084,
      "end_line": 2086,
      "comment": "\r\n     * Adds a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2085,col 9)-(line 2085,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers()",
      "begin_line": 2094,
      "end_line": 2114,
      "comment": "\r\n     * Clears all the (foreground and background) domain markers and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2095,col 9)-(line 2103,col 9)",
        "(line 2104,col 9)-(line 2112,col 9)",
        "(line 2113,col 9)-(line 2113,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers(int)",
      "begin_line": 2124,
      "end_line": 2151,
      "comment": "\r\n     * Clears the (foreground and background) domain markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2125,col 9)-(line 2125,col 41)",
        "(line 2126,col 9)-(line 2137,col 9)",
        "(line 2138,col 9)-(line 2149,col 9)",
        "(line 2150,col 9)-(line 2150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2168,
      "end_line": 2170,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearDomainMarkers(int)\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2169,col 6)-(line 2169,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2187,
      "end_line": 2218,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2189,col 9)-(line 2191,col 9)",
        "(line 2192,col 9)-(line 2194,col 9)",
        "(line 2195,col 9)-(line 2195,col 27)",
        "(line 2196,col 9)-(line 2213,col 9)",
        "(line 2214,col 9)-(line 2214,col 39)",
        "(line 2215,col 9)-(line 2217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2231,
      "end_line": 2233,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2232,col 9)-(line 2232,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2247,
      "end_line": 2249,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2248,col 9)-(line 2248,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2264,
      "end_line": 2266,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2265,col 6)-(line 2265,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2282,
      "end_line": 2298,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested, \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2284,col 9)-(line 2284,col 26)",
        "(line 2285,col 9)-(line 2292,col 9)",
        "(line 2293,col 9)-(line 2293,col 49)",
        "(line 2294,col 9)-(line 2296,col 9)",
        "(line 2297,col 9)-(line 2297,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2311,
      "end_line": 2313,
      "comment": "\r\n     * Adds a marker for the range axis and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2312,col 9)-(line 2312,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2327,
      "end_line": 2329,
      "comment": "\r\n     * Adds a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2328,col 9)-(line 2328,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers()",
      "begin_line": 2337,
      "end_line": 2357,
      "comment": "\r\n     * Clears all the range markers and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2338,col 9)-(line 2346,col 9)",
        "(line 2347,col 9)-(line 2355,col 9)",
        "(line 2356,col 9)-(line 2356,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2373,
      "end_line": 2375,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2374,col 6)-(line 2374,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2391,
      "end_line": 2416,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2393,col 9)-(line 2393,col 27)",
        "(line 2394,col 9)-(line 2411,col 9)",
        "(line 2412,col 9)-(line 2412,col 39)",
        "(line 2413,col 9)-(line 2415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers(int)",
      "begin_line": 2424,
      "end_line": 2451,
      "comment": "\r\n     * Clears the (foreground and background) range markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     ",
      "child_ranges": [
        "(line 2425,col 9)-(line 2425,col 41)",
        "(line 2426,col 9)-(line 2437,col 9)",
        "(line 2438,col 9)-(line 2449,col 9)",
        "(line 2450,col 9)-(line 2450,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2464,
      "end_line": 2466,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2465,col 9)-(line 2465,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2480,
      "end_line": 2482,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2481,col 9)-(line 2481,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2497,
      "end_line": 2499,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2498,col 6)-(line 2498,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2515,
      "end_line": 2534,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2517,col 9)-(line 2519,col 9)",
        "(line 2520,col 9)-(line 2520,col 26)",
        "(line 2521,col 9)-(line 2528,col 9)",
        "(line 2529,col 9)-(line 2529,col 49)",
        "(line 2530,col 9)-(line 2532,col 9)",
        "(line 2533,col 9)-(line 2533,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2545,
      "end_line": 2547,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAnnotations()\r\n     * @see #removeAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2546,col 9)-(line 2546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2558,
      "end_line": 2566,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2559,col 9)-(line 2561,col 9)",
        "(line 2562,col 9)-(line 2562,col 41)",
        "(line 2563,col 9)-(line 2565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2579,
      "end_line": 2581,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     * @see #getAnnotations()\r\n     ",
      "child_ranges": [
        "(line 2580,col 6)-(line 2580,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2594,
      "end_line": 2603,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2595,col 9)-(line 2597,col 9)",
        "(line 2598,col 9)-(line 2598,col 62)",
        "(line 2599,col 9)-(line 2601,col 9)",
        "(line 2602,col 9)-(line 2602,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAnnotations()",
      "begin_line": 2614,
      "end_line": 2616,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations.\r\n     * \r\n     * @since 1.0.1\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2615,col 9)-(line 2615,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearAnnotations()",
      "begin_line": 2624,
      "end_line": 2627,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2625,col 9)-(line 2625,col 33)",
        "(line 2626,col 9)-(line 2626,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2637,
      "end_line": 2643,
      "comment": "\r\n     * Calculates the space required for all the axes in the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2639,col 9)-(line 2639,col 42)",
        "(line 2640,col 9)-(line 2640,col 62)",
        "(line 2641,col 9)-(line 2641,col 61)",
        "(line 2642,col 9)-(line 2642,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2654,
      "end_line": 2690,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2658,col 9)-(line 2660,col 9)",
        "(line 2663,col 9)-(line 2686,col 9)",
        "(line 2688,col 9)-(line 2688,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2701,
      "end_line": 2736,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2705,col 9)-(line 2707,col 9)",
        "(line 2710,col 9)-(line 2733,col 9)",
        "(line 2734,col 9)-(line 2734,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2750,
      "end_line": 3006,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 2757,col 9)-(line 2757,col 64)",
        "(line 2758,col 9)-(line 2758,col 66)",
        "(line 2759,col 9)-(line 2761,col 9)",
        "(line 2764,col 9)-(line 2766,col 9)",
        "(line 2769,col 9)-(line 2769,col 45)",
        "(line 2770,col 9)-(line 2770,col 26)",
        "(line 2772,col 9)-(line 2772,col 55)",
        "(line 2773,col 9)-(line 2773,col 56)",
        "(line 2774,col 9)-(line 2774,col 39)",
        "(line 2776,col 9)-(line 2778,col 9)",
        "(line 2781,col 9)-(line 2781,col 37)",
        "(line 2782,col 9)-(line 2782,col 62)",
        "(line 2784,col 9)-(line 2784,col 50)",
        "(line 2788,col 9)-(line 2790,col 9)",
        "(line 2791,col 9)-(line 2791,col 61)",
        "(line 2792,col 9)-(line 2792,col 70)",
        "(line 2793,col 9)-(line 2793,col 41)",
        "(line 2795,col 9)-(line 2795,col 46)",
        "(line 2796,col 9)-(line 2796,col 46)",
        "(line 2797,col 9)-(line 2824,col 9)",
        "(line 2825,col 9)-(line 2825,col 64)",
        "(line 2826,col 9)-(line 2826,col 63)",
        "(line 2827,col 9)-(line 2827,col 42)",
        "(line 2828,col 9)-(line 2828,col 56)",
        "(line 2830,col 9)-(line 2830,col 26)",
        "(line 2831,col 9)-(line 2832,col 39)",
        "(line 2834,col 9)-(line 2835,col 33)",
        "(line 2836,col 9)-(line 2841,col 9)",
        "(line 2843,col 9)-(line 2843,col 80)",
        "(line 2844,col 9)-(line 2849,col 9)",
        "(line 2850,col 9)-(line 2852,col 9)",
        "(line 2853,col 9)-(line 2855,col 9)",
        "(line 2856,col 9)-(line 2859,col 9)",
        "(line 2860,col 9)-(line 2863,col 9)",
        "(line 2866,col 9)-(line 2868,col 9)",
        "(line 2869,col 9)-(line 2871,col 9)",
        "(line 2874,col 9)-(line 2874,col 34)",
        "(line 2875,col 9)-(line 2875,col 65)",
        "(line 2876,col 9)-(line 2944,col 9)",
        "(line 2947,col 9)-(line 2947,col 61)",
        "(line 2948,col 9)-(line 2948,col 52)",
        "(line 2949,col 9)-(line 2949,col 64)",
        "(line 2950,col 9)-(line 2959,col 9)",
        "(line 2960,col 9)-(line 2960,col 71)",
        "(line 2961,col 9)-(line 2966,col 9)",
        "(line 2969,col 9)-(line 2969,col 60)",
        "(line 2970,col 9)-(line 2970,col 51)",
        "(line 2971,col 9)-(line 2971,col 63)",
        "(line 2972,col 9)-(line 2980,col 9)",
        "(line 2981,col 9)-(line 2981,col 70)",
        "(line 2982,col 9)-(line 2987,col 9)",
        "(line 2989,col 9)-(line 2991,col 9)",
        "(line 2993,col 9)-(line 2995,col 9)",
        "(line 2996,col 9)-(line 2998,col 9)",
        "(line 3000,col 9)-(line 3000,col 44)",
        "(line 3001,col 9)-(line 3001,col 33)",
        "(line 3002,col 9)-(line 3002,col 43)",
        "(line 3004,col 9)-(line 3004,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3014,
      "end_line": 3018,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 3015,col 9)-(line 3015,col 51)",
        "(line 3016,col 9)-(line 3016,col 32)",
        "(line 3017,col 9)-(line 3017,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3029,
      "end_line": 3129,
      "comment": "\r\n     * Draws the quadrants.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 3033,col 9)-(line 3033,col 40)",
        "(line 3035,col 9)-(line 3035,col 42)",
        "(line 3036,col 9)-(line 3036,col 74)",
        "(line 3037,col 9)-(line 3037,col 70)",
        "(line 3039,col 9)-(line 3039,col 41)",
        "(line 3040,col 9)-(line 3040,col 74)",
        "(line 3041,col 9)-(line 3041,col 69)",
        "(line 3043,col 9)-(line 3043,col 44)",
        "(line 3044,col 9)-(line 3044,col 76)",
        "(line 3046,col 9)-(line 3046,col 44)",
        "(line 3047,col 9)-(line 3047,col 76)",
        "(line 3049,col 9)-(line 3049,col 44)",
        "(line 3050,col 9)-(line 3050,col 75)",
        "(line 3052,col 9)-(line 3052,col 44)",
        "(line 3053,col 9)-(line 3053,col 75)",
        "(line 3055,col 9)-(line 3055,col 69)",
        "(line 3056,col 9)-(line 3071,col 9)",
        "(line 3072,col 9)-(line 3086,col 9)",
        "(line 3087,col 9)-(line 3101,col 9)",
        "(line 3102,col 9)-(line 3116,col 9)",
        "(line 3117,col 9)-(line 3128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3140,
      "end_line": 3164,
      "comment": "\r\n     * Draws the domain tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3142,col 9)-(line 3142,col 51)",
        "(line 3143,col 9)-(line 3163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3175,
      "end_line": 3199,
      "comment": "\r\n     * Draws the range tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3177,col 9)-(line 3177,col 50)",
        "(line 3178,col 9)-(line 3198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3212,
      "end_line": 3286,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the state for each axis drawn.\r\n     ",
      "child_ranges": [
        "(line 3217,col 9)-(line 3217,col 61)",
        "(line 3220,col 9)-(line 3225,col 9)",
        "(line 3228,col 9)-(line 3233,col 9)",
        "(line 3235,col 9)-(line 3235,col 41)",
        "(line 3238,col 9)-(line 3239,col 38)",
        "(line 3240,col 9)-(line 3240,col 69)",
        "(line 3241,col 9)-(line 3247,col 9)",
        "(line 3250,col 9)-(line 3251,col 79)",
        "(line 3252,col 9)-(line 3252,col 63)",
        "(line 3253,col 9)-(line 3259,col 9)",
        "(line 3262,col 9)-(line 3263,col 76)",
        "(line 3264,col 9)-(line 3264,col 61)",
        "(line 3265,col 9)-(line 3271,col 9)",
        "(line 3274,col 9)-(line 3275,col 77)",
        "(line 3276,col 9)-(line 3276,col 62)",
        "(line 3277,col 9)-(line 3283,col 9)",
        "(line 3285,col 9)-(line 3285,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 3304,
      "end_line": 3378,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current renderer.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag that indicates whether any data was actually rendered.\r\n     ",
      "child_ranges": [
        "(line 3310,col 9)-(line 3310,col 34)",
        "(line 3311,col 9)-(line 3311,col 46)",
        "(line 3312,col 9)-(line 3376,col 9)",
        "(line 3377,col 9)-(line 3377,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(int)",
      "begin_line": 3387,
      "end_line": 3405,
      "comment": "\r\n     * Returns the domain axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3389,col 9)-(line 3392,col 9)",
        "(line 3394,col 9)-(line 3394,col 35)",
        "(line 3395,col 9)-(line 3396,col 36)",
        "(line 3397,col 9)-(line 3402,col 9)",
        "(line 3403,col 9)-(line 3403,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(int)",
      "begin_line": 3414,
      "end_line": 3432,
      "comment": "\r\n     * Returns the range axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3416,col 9)-(line 3419,col 9)",
        "(line 3421,col 9)-(line 3421,col 35)",
        "(line 3422,col 9)-(line 3423,col 75)",
        "(line 3424,col 9)-(line 3429,col 9)",
        "(line 3430,col 9)-(line 3430,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3443,
      "end_line": 3462,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3447,col 9)-(line 3449,col 9)",
        "(line 3452,col 9)-(line 3461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3474,
      "end_line": 3499,
      "comment": "\r\n     * Draws the gridlines for the plot\u0027s primary range axis, if they are\r\n     * visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3478,col 9)-(line 3480,col 9)",
        "(line 3483,col 9)-(line 3498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3511,
      "end_line": 3518,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 3512,col 9)-(line 3517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3528,
      "end_line": 3533,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 3529,col 9)-(line 3532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3542,
      "end_line": 3554,
      "comment": "\r\n     * Draws the annotations for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 3546,col 9)-(line 3546,col 56)",
        "(line 3547,col 9)-(line 3552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3565,
      "end_line": 3587,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 3568,col 9)-(line 3568,col 46)",
        "(line 3569,col 9)-(line 3571,col 9)",
        "(line 3574,col 9)-(line 3576,col 9)",
        "(line 3577,col 9)-(line 3577,col 60)",
        "(line 3578,col 9)-(line 3578,col 56)",
        "(line 3579,col 9)-(line 3585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3598,
      "end_line": 3619,
      "comment": "\r\n     * Draws the range markers (if any) for a renderer and layer.  This method\r\n     * is typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 3601,col 9)-(line 3601,col 46)",
        "(line 3602,col 9)-(line 3604,col 9)",
        "(line 3607,col 9)-(line 3609,col 9)",
        "(line 3610,col 9)-(line 3610,col 59)",
        "(line 3611,col 9)-(line 3611,col 55)",
        "(line 3612,col 9)-(line 3618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3630,
      "end_line": 3632,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     * \r\n     * @see #getRangeMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 3631,col 9)-(line 3631,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3643,
      "end_line": 3645,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     * \r\n     * @see #getDomainMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 3644,col 9)-(line 3644,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3658,
      "end_line": 3671,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3659,col 9)-(line 3659,col 33)",
        "(line 3660,col 9)-(line 3660,col 41)",
        "(line 3661,col 9)-(line 3666,col 9)",
        "(line 3667,col 9)-(line 3669,col 9)",
        "(line 3670,col 9)-(line 3670,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3684,
      "end_line": 3697,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3685,col 9)-(line 3685,col 33)",
        "(line 3686,col 9)-(line 3686,col 41)",
        "(line 3687,col 9)-(line 3692,col 9)",
        "(line 3693,col 9)-(line 3695,col 9)",
        "(line 3696,col 9)-(line 3696,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3709,
      "end_line": 3726,
      "comment": "\r\n     * Utility method for drawing a horizontal line across the data area of the\r\n     * plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 3713,col 9)-(line 3713,col 40)",
        "(line 3714,col 9)-(line 3716,col 9)",
        "(line 3717,col 9)-(line 3724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3741,
      "end_line": 3764,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 3745,col 9)-(line 3762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3775,
      "end_line": 3792,
      "comment": "\r\n     * Utility method for drawing a vertical line on the data area of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 3778,col 9)-(line 3778,col 41)",
        "(line 3779,col 9)-(line 3781,col 9)",
        "(line 3782,col 9)-(line 3790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3807,
      "end_line": 3830,
      "comment": "\r\n     * Draws a range crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 3811,col 9)-(line 3828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3839,
      "end_line": 3859,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  the x-coordinate, where the click occurred, in Java2D space.\r\n     * @param y  the y-coordinate, where the click occurred, in Java2D space.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 3841,col 9)-(line 3841,col 50)",
        "(line 3842,col 9)-(line 3858,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(java.lang.Integer)",
      "begin_line": 3869,
      "end_line": 3889,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3870,col 9)-(line 3872,col 9)",
        "(line 3873,col 9)-(line 3873,col 38)",
        "(line 3874,col 9)-(line 3887,col 9)",
        "(line 3888,col 9)-(line 3888,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(java.lang.Integer)",
      "begin_line": 3899,
      "end_line": 3919,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3900,col 9)-(line 3902,col 9)",
        "(line 3903,col 9)-(line 3903,col 38)",
        "(line 3904,col 9)-(line 3917,col 9)",
        "(line 3918,col 9)-(line 3918,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3930,
      "end_line": 3941,
      "comment": "\r\n     * Returns the index of the given domain axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 3931,col 9)-(line 3931,col 51)",
        "(line 3932,col 9)-(line 3939,col 9)",
        "(line 3940,col 9)-(line 3940,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3952,
      "end_line": 3963,
      "comment": "\r\n     * Returns the index of the given range axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getDomainAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 3953,col 9)-(line 3953,col 50)",
        "(line 3954,col 9)-(line 3961,col 9)",
        "(line 3962,col 9)-(line 3962,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3972,
      "end_line": 4023,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 3974,col 9)-(line 3974,col 28)",
        "(line 3975,col 9)-(line 3975,col 46)",
        "(line 3976,col 9)-(line 3976,col 36)",
        "(line 3979,col 9)-(line 3979,col 51)",
        "(line 3980,col 9)-(line 3984,col 9)",
        "(line 3987,col 9)-(line 3987,col 49)",
        "(line 3988,col 9)-(line 3992,col 9)",
        "(line 3996,col 9)-(line 3996,col 54)",
        "(line 3997,col 9)-(line 4020,col 9)",
        "(line 4021,col 9)-(line 4021,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 4032,
      "end_line": 4043,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 4033,col 9)-(line 4033,col 30)",
        "(line 4034,col 9)-(line 4034,col 29)",
        "(line 4035,col 9)-(line 4042,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 4050,
      "end_line": 4052,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 4051,col 9)-(line 4051,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible()",
      "begin_line": 4061,
      "end_line": 4063,
      "comment": "\r\n     * Returns a flag indicating whether or not the domain crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 4062,col 9)-(line 4062,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 4074,
      "end_line": 4079,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair is visible \r\n     * and, if the flag changes, sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4075,col 9)-(line 4078,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData()",
      "begin_line": 4089,
      "end_line": 4091,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 4090,col 9)-(line 4090,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData(boolean)",
      "begin_line": 4102,
      "end_line": 4107,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this\r\n     * method sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isDomainCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 4103,col 9)-(line 4106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairValue()",
      "begin_line": 4116,
      "end_line": 4118,
      "comment": "\r\n     * Returns the domain crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setDomainCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4117,col 9)-(line 4117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double)",
      "begin_line": 4128,
      "end_line": 4130,
      "comment": "\r\n     * Sets the domain crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners (provided that the domain crosshair is visible).\r\n     *\r\n     * @param value  the value.\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4129,col 9)-(line 4129,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double, boolean)",
      "begin_line": 4142,
      "end_line": 4147,
      "comment": "\r\n     * Sets the domain crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (provided that the\r\n     * domain crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4143,col 9)-(line 4143,col 42)",
        "(line 4144,col 9)-(line 4146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke()",
      "begin_line": 4158,
      "end_line": 4160,
      "comment": "\r\n     * Returns the {@link Stroke} used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4159,col 9)-(line 4159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4171,
      "end_line": 4177,
      "comment": "\r\n     * Sets the Stroke used to draw the crosshairs (if visible) and notifies\r\n     * registered listeners that the axis has been modified.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     *     \r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4172,col 9)-(line 4174,col 9)",
        "(line 4175,col 9)-(line 4175,col 44)",
        "(line 4176,col 9)-(line 4176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint()",
      "begin_line": 4188,
      "end_line": 4190,
      "comment": "\r\n     * Returns the domain crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4189,col 9)-(line 4189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 4200,
      "end_line": 4206,
      "comment": "\r\n     * Sets the paint used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4201,col 9)-(line 4203,col 9)",
        "(line 4204,col 9)-(line 4204,col 42)",
        "(line 4205,col 9)-(line 4205,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible()",
      "begin_line": 4216,
      "end_line": 4218,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4217,col 9)-(line 4217,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 4229,
      "end_line": 4234,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     * If the flag value changes, this method sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4230,col 9)-(line 4233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 4244,
      "end_line": 4246,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 4245,col 9)-(line 4245,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 4257,
      "end_line": 4262,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this method\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 4258,col 9)-(line 4261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairValue()",
      "begin_line": 4271,
      "end_line": 4273,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4272,col 9)-(line 4272,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double)",
      "begin_line": 4285,
      "end_line": 4287,
      "comment": "\r\n     * Sets the range crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4286,col 9)-(line 4286,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 4299,
      "end_line": 4304,
      "comment": "\r\n     * Sets the range crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners, but only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4300,col 9)-(line 4300,col 41)",
        "(line 4301,col 9)-(line 4303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke()",
      "begin_line": 4315,
      "end_line": 4317,
      "comment": "\r\n     * Returns the stroke used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4316,col 9)-(line 4316,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4328,
      "end_line": 4334,
      "comment": "\r\n     * Sets the stroke used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4329,col 9)-(line 4331,col 9)",
        "(line 4332,col 9)-(line 4332,col 43)",
        "(line 4333,col 9)-(line 4333,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint()",
      "begin_line": 4345,
      "end_line": 4347,
      "comment": "\r\n     * Returns the range crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4346,col 9)-(line 4346,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 4357,
      "end_line": 4363,
      "comment": "\r\n     * Sets the paint used to color the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4358,col 9)-(line 4360,col 9)",
        "(line 4361,col 9)-(line 4361,col 41)",
        "(line 4362,col 9)-(line 4362,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace()",
      "begin_line": 4372,
      "end_line": 4374,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4373,col 9)-(line 4373,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4384,
      "end_line": 4386,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4385,col 9)-(line 4385,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4399,
      "end_line": 4404,
      "comment": "\r\n     * Sets the fixed domain axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 4400,col 9)-(line 4400,col 42)",
        "(line 4401,col 9)-(line 4403,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace()",
      "begin_line": 4413,
      "end_line": 4415,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4414,col 9)-(line 4414,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4425,
      "end_line": 4427,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4426,col 9)-(line 4426,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4440,
      "end_line": 4445,
      "comment": "\r\n     * Sets the fixed range axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 4441,col 9)-(line 4441,col 41)",
        "(line 4442,col 9)-(line 4444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4456,
      "end_line": 4460,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4459,col 9)-(line 4459,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4474,
      "end_line": 4497,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4478,col 9)-(line 4496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4513,
      "end_line": 4521,
      "comment": "\r\n     * Zooms in on the domain axis/axes.  The new lower and upper bounds are\r\n     * specified as percentages of the current axis range, where 0 percent is\r\n     * the current lower bound and 100 percent is the current upper bound.\r\n     *\r\n     * @param lowerPercent  a percentage that determines the new lower bound\r\n     *                      for the axis (e.g. 0.20 is twenty percent).\r\n     * @param upperPercent  a percentage that determines the new upper bound\r\n     *                      for the axis (e.g. 0.80 is eighty percent).\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (ignored).\r\n     * \r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4515,col 9)-(line 4520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4532,
      "end_line": 4536,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     ",
      "child_ranges": [
        "(line 4535,col 9)-(line 4535,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4551,
      "end_line": 4574,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4555,col 9)-(line 4573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4586,
      "end_line": 4594,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4588,col 9)-(line 4593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZoomable()",
      "begin_line": 4604,
      "end_line": 4606,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the domain axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 4605,col 9)-(line 4605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZoomable()",
      "begin_line": 4616,
      "end_line": 4618,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the range axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 4617,col 9)-(line 4617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesCount()",
      "begin_line": 4626,
      "end_line": 4633,
      "comment": "\r\n     * Returns the number of series in the primary dataset for this plot.  If\r\n     * the dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 4627,col 9)-(line 4627,col 23)",
        "(line 4628,col 9)-(line 4628,col 41)",
        "(line 4629,col 9)-(line 4631,col 9)",
        "(line 4632,col 9)-(line 4632,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedLegendItems()",
      "begin_line": 4642,
      "end_line": 4644,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 4643,col 9)-(line 4643,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 4655,
      "end_line": 4658,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 4656,col 9)-(line 4656,col 38)",
        "(line 4657,col 9)-(line 4657,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getLegendItems()",
      "begin_line": 4667,
      "end_line": 4696,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s renderer, since the renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 4668,col 9)-(line 4670,col 9)",
        "(line 4671,col 9)-(line 4671,col 65)",
        "(line 4672,col 9)-(line 4672,col 41)",
        "(line 4673,col 9)-(line 4694,col 9)",
        "(line 4695,col 9)-(line 4695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.equals(java.lang.Object)",
      "begin_line": 4705,
      "end_line": 4880,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 4707,col 9)-(line 4709,col 9)",
        "(line 4710,col 9)-(line 4712,col 9)",
        "(line 4714,col 9)-(line 4714,col 35)",
        "(line 4715,col 9)-(line 4717,col 9)",
        "(line 4718,col 9)-(line 4720,col 9)",
        "(line 4721,col 9)-(line 4723,col 9)",
        "(line 4724,col 9)-(line 4726,col 9)",
        "(line 4727,col 9)-(line 4730,col 9)",
        "(line 4731,col 9)-(line 4733,col 9)",
        "(line 4734,col 9)-(line 4736,col 9)",
        "(line 4737,col 9)-(line 4739,col 9)",
        "(line 4740,col 9)-(line 4742,col 9)",
        "(line 4743,col 9)-(line 4745,col 9)",
        "(line 4746,col 9)-(line 4748,col 9)",
        "(line 4749,col 9)-(line 4752,col 9)",
        "(line 4753,col 9)-(line 4755,col 9)",
        "(line 4756,col 9)-(line 4758,col 9)",
        "(line 4759,col 9)-(line 4761,col 9)",
        "(line 4762,col 9)-(line 4764,col 9)",
        "(line 4765,col 9)-(line 4767,col 9)",
        "(line 4768,col 9)-(line 4770,col 9)",
        "(line 4771,col 9)-(line 4774,col 9)",
        "(line 4775,col 9)-(line 4778,col 9)",
        "(line 4779,col 9)-(line 4782,col 9)",
        "(line 4783,col 9)-(line 4786,col 9)",
        "(line 4787,col 9)-(line 4790,col 9)",
        "(line 4791,col 9)-(line 4794,col 9)",
        "(line 4795,col 9)-(line 4798,col 9)",
        "(line 4799,col 9)-(line 4802,col 9)",
        "(line 4803,col 9)-(line 4806,col 9)",
        "(line 4807,col 9)-(line 4810,col 9)",
        "(line 4811,col 9)-(line 4814,col 9)",
        "(line 4815,col 9)-(line 4818,col 9)",
        "(line 4819,col 9)-(line 4822,col 9)",
        "(line 4823,col 9)-(line 4826,col 9)",
        "(line 4827,col 9)-(line 4830,col 9)",
        "(line 4831,col 9)-(line 4834,col 9)",
        "(line 4835,col 9)-(line 4838,col 9)",
        "(line 4839,col 9)-(line 4842,col 9)",
        "(line 4843,col 9)-(line 4846,col 9)",
        "(line 4847,col 9)-(line 4850,col 9)",
        "(line 4851,col 9)-(line 4854,col 9)",
        "(line 4855,col 9)-(line 4858,col 9)",
        "(line 4859,col 9)-(line 4861,col 9)",
        "(line 4862,col 9)-(line 4865,col 9)",
        "(line 4866,col 9)-(line 4869,col 9)",
        "(line 4870,col 9)-(line 4872,col 9)",
        "(line 4873,col 9)-(line 4878,col 9)",
        "(line 4879,col 9)-(line 4879,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clone()",
      "begin_line": 4890,
      "end_line": 4964,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 4892,col 9)-(line 4892,col 46)",
        "(line 4893,col 9)-(line 4893,col 79)",
        "(line 4894,col 9)-(line 4902,col 9)",
        "(line 4903,col 9)-(line 4904,col 49)",
        "(line 4906,col 9)-(line 4906,col 77)",
        "(line 4907,col 9)-(line 4915,col 9)",
        "(line 4916,col 9)-(line 4917,col 41)",
        "(line 4920,col 9)-(line 4920,col 75)",
        "(line 4921,col 9)-(line 4926,col 9)",
        "(line 4928,col 9)-(line 4928,col 53)",
        "(line 4929,col 9)-(line 4929,col 73)",
        "(line 4930,col 9)-(line 4930,col 52)",
        "(line 4931,col 9)-(line 4931,col 71)",
        "(line 4933,col 9)-(line 4933,col 77)",
        "(line 4934,col 9)-(line 4940,col 9)",
        "(line 4941,col 9)-(line 4942,col 46)",
        "(line 4943,col 9)-(line 4944,col 46)",
        "(line 4945,col 9)-(line 4946,col 45)",
        "(line 4947,col 9)-(line 4948,col 45)",
        "(line 4949,col 9)-(line 4949,col 79)",
        "(line 4950,col 9)-(line 4953,col 9)",
        "(line 4954,col 9)-(line 4957,col 9)",
        "(line 4959,col 9)-(line 4960,col 37)",
        "(line 4961,col 9)-(line 4961,col 67)",
        "(line 4962,col 9)-(line 4962,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 4973,
      "end_line": 4993,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 4974,col 9)-(line 4974,col 36)",
        "(line 4975,col 9)-(line 4975,col 71)",
        "(line 4976,col 9)-(line 4976,col 69)",
        "(line 4977,col 9)-(line 4977,col 70)",
        "(line 4978,col 9)-(line 4978,col 68)",
        "(line 4979,col 9)-(line 4979,col 74)",
        "(line 4980,col 9)-(line 4980,col 72)",
        "(line 4981,col 9)-(line 4981,col 72)",
        "(line 4982,col 9)-(line 4982,col 70)",
        "(line 4983,col 9)-(line 4983,col 71)",
        "(line 4984,col 9)-(line 4984,col 69)",
        "(line 4985,col 9)-(line 4985,col 69)",
        "(line 4986,col 9)-(line 4986,col 68)",
        "(line 4987,col 9)-(line 4987,col 66)",
        "(line 4988,col 9)-(line 4990,col 9)",
        "(line 4991,col 9)-(line 4991,col 75)",
        "(line 4992,col 9)-(line 4992,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5003,
      "end_line": 5061,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 5006,col 9)-(line 5006,col 35)",
        "(line 5007,col 9)-(line 5007,col 71)",
        "(line 5008,col 9)-(line 5008,col 69)",
        "(line 5009,col 9)-(line 5009,col 70)",
        "(line 5010,col 9)-(line 5010,col 68)",
        "(line 5011,col 9)-(line 5011,col 74)",
        "(line 5012,col 9)-(line 5012,col 72)",
        "(line 5013,col 9)-(line 5013,col 72)",
        "(line 5014,col 9)-(line 5014,col 70)",
        "(line 5015,col 9)-(line 5015,col 71)",
        "(line 5016,col 9)-(line 5016,col 69)",
        "(line 5017,col 9)-(line 5017,col 69)",
        "(line 5018,col 9)-(line 5018,col 68)",
        "(line 5019,col 9)-(line 5019,col 66)",
        "(line 5020,col 9)-(line 5020,col 42)",
        "(line 5021,col 9)-(line 5023,col 9)",
        "(line 5025,col 9)-(line 5025,col 75)",
        "(line 5026,col 9)-(line 5026,col 73)",
        "(line 5030,col 9)-(line 5030,col 53)",
        "(line 5031,col 9)-(line 5037,col 9)",
        "(line 5038,col 9)-(line 5038,col 51)",
        "(line 5039,col 9)-(line 5045,col 9)",
        "(line 5046,col 9)-(line 5046,col 48)",
        "(line 5047,col 9)-(line 5052,col 9)",
        "(line 5053,col 9)-(line 5053,col 50)",
        "(line 5054,col 9)-(line 5059,col 9)"
      ]
    }
  ]
}