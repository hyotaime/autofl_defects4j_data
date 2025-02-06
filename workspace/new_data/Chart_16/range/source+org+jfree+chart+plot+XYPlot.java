{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/XYPlot.java",
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
      "begin_line": 272,
      "end_line": 4951,
      "comment": "\r\n * A general class for plotting data in the form of (x, y) pairs.  This plot can\r\n * use data from any class that implements the {@link XYDataset} interface.\r\n * \u003cP\u003e\r\n * \u003ccode\u003eXYPlot\u003c/code\u003e makes use of an {@link XYItemRenderer} to draw each point\r\n * on the plot.  By using different renderers, various chart types can be\r\n * produced.\r\n * \u003cp\u003e\r\n * The {@link org.jfree.chart.ChartFactory} class contains static methods for\r\n * creating pre-configured charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 282,
      "end_line": 284,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 293,
      "end_line": 294,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 300,
      "end_line": 302,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " The domain axis / axes (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " The domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " The range axis location. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxisMap"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to domain axes.  If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxisMap"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to range axes. If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantOrigin"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " The origin point for the quadrants (if drawn). "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantPaint"
      ],
      "begin_line": 346,
      "end_line": 347,
      "comment": " The paint used for each quadrant. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineVisible"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the domain\r\n     * axis is visible.\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineStroke"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " \r\n     * The stroke used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselinePaint"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " \r\n     * The paint used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " The stroke used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " The paint used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " A flag that controls whether or not a domain crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairValue"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " The domain crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairLockedOnData"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " A flag that controls whether or not a range crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " A map of lists of foreground markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " A map of lists of background markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " A map of lists of foreground markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " A map of lists of background markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " \r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainTickBandPaint"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " The paint used for the domain tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeTickBandPaint"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " The paint used for the range tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " The fixed domain axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " The fixed range axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetRenderingOrder"
      ],
      "begin_line": 472,
      "end_line": 473,
      "comment": "\r\n     * The order of the dataset rendering (REVERSE draws the primary dataset\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRenderingOrder"
      ],
      "begin_line": 479,
      "end_line": 480,
      "comment": "\r\n     * The order of the series rendering (REVERSE draws the primary series\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": "\r\n     * The weight for this plot (only relevant if this is a subplot in a\r\n     * combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYPlot\u003c/code\u003e instance with no dataset, no axes and\r\n     * no renderer.  You should specify these items before using the plot.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 513,
      "end_line": 599,
      "comment": "\r\n     * Creates a new plot with the specified dataset, axes and renderer.  Any\r\n     * of the arguments can be \u003ccode\u003enull\u003c/code\u003e, but in that case you should\r\n     * take care to specify the value before using the plot (otherwise a\r\n     * \u003ccode\u003eNullPointerException\u003c/code\u003e may be thrown).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 16)",
        "(line 520,col 9)-(line 520,col 52)",
        "(line 521,col 9)-(line 521,col 24)",
        "(line 522,col 9)-(line 522,col 66)",
        "(line 525,col 9)-(line 525,col 43)",
        "(line 526,col 9)-(line 526,col 52)",
        "(line 527,col 9)-(line 527,col 53)",
        "(line 528,col 9)-(line 528,col 53)",
        "(line 530,col 9)-(line 530,col 42)",
        "(line 531,col 9)-(line 531,col 51)",
        "(line 532,col 9)-(line 532,col 52)",
        "(line 533,col 9)-(line 533,col 52)",
        "(line 535,col 9)-(line 535,col 41)",
        "(line 536,col 9)-(line 536,col 42)",
        "(line 538,col 9)-(line 538,col 52)",
        "(line 539,col 9)-(line 539,col 51)",
        "(line 541,col 9)-(line 541,col 38)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 40)",
        "(line 547,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 43)",
        "(line 553,col 9)-(line 553,col 42)",
        "(line 554,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 69)",
        "(line 560,col 9)-(line 560,col 41)",
        "(line 561,col 9)-(line 561,col 41)",
        "(line 562,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 68)",
        "(line 568,col 9)-(line 568,col 30)",
        "(line 569,col 9)-(line 569,col 29)",
        "(line 571,col 9)-(line 571,col 43)",
        "(line 572,col 9)-(line 572,col 60)",
        "(line 573,col 9)-(line 573,col 58)",
        "(line 575,col 9)-(line 575,col 47)",
        "(line 576,col 9)-(line 576,col 51)",
        "(line 577,col 9)-(line 577,col 62)",
        "(line 579,col 9)-(line 579,col 42)",
        "(line 580,col 9)-(line 580,col 59)",
        "(line 581,col 9)-(line 581,col 57)",
        "(line 583,col 9)-(line 583,col 46)",
        "(line 584,col 9)-(line 584,col 50)",
        "(line 585,col 9)-(line 585,col 61)",
        "(line 587,col 9)-(line 587,col 44)",
        "(line 588,col 9)-(line 588,col 40)",
        "(line 589,col 9)-(line 589,col 62)",
        "(line 590,col 9)-(line 590,col 60)",
        "(line 592,col 9)-(line 592,col 43)",
        "(line 593,col 9)-(line 593,col 39)",
        "(line 594,col 9)-(line 594,col 61)",
        "(line 595,col 9)-(line 595,col 59)",
        "(line 597,col 9)-(line 597,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getPlotType()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getOrientation()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 629,
      "end_line": 637,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     * \r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 636,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAxisOffset()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 658,
      "end_line": 664,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 33)",
        "(line 663,col 9)-(line 663,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\r\n     * Returns the domain axis with index 0.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s \r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setDomainAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis(int)",
      "begin_line": 689,
      "end_line": 702,
      "comment": "\r\n     * Returns the domain axis with the specified index, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 32)",
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 713,
      "end_line": 715,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis()\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 727,
      "end_line": 729,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 741,
      "end_line": 757,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 50)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 41)",
        "(line 750,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 756,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 767,
      "end_line": 772,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation()",
      "begin_line": 781,
      "end_line": 783,
      "comment": "\r\n     * Returns the location of the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 793,
      "end_line": 796,
      "comment": "\r\n     * Sets the location of the primary domain axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 807,
      "end_line": 810,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "\r\n     * Returns the edge for the primary domain axis (taking into account the\r\n     * plot\u0027s orientation).\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 823,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisCount()",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getRangeAxisCount()\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainAxes()",
      "begin_line": 843,
      "end_line": 852,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearRangeAxes()\r\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 32)",
        "(line 851,col 9)-(line 851,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureDomainAxes()",
      "begin_line": 857,
      "end_line": 864,
      "comment": "\r\n     * Configures the domain axes. \r\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 863,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation(int)",
      "begin_line": 877,
      "end_line": 886,
      "comment": "\r\n     * Returns the location for a domain axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary domain axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 35)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 898,
      "end_line": 901,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for index\r\n     *     0).\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 917,
      "end_line": 928,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 54)",
        "(line 925,col 9)-(line 927,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge(int)",
      "begin_line": 939,
      "end_line": 947,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisEdge(int)\r\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 61)",
        "(line 941,col 9)-(line 942,col 34)",
        "(line 943,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 946,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis()",
      "begin_line": 959,
      "end_line": 961,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s range \r\n     * axis (if there is a parent plot).\r\n     *\r\n     * @return The range axis.\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 972,
      "end_line": 991,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 976,col 9)",
        "(line 979,col 9)-(line 979,col 44)",
        "(line 980,col 9)-(line 982,col 9)",
        "(line 984,col 9)-(line 984,col 36)",
        "(line 985,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\r\n     * Returns the location of the primary range axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1012,
      "end_line": 1015,
      "comment": "\r\n     * Sets the location of the primary range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1026,
      "end_line": 1029,
      "comment": "\r\n     * Sets the location of the primary range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge()",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": "\r\n     * Returns the edge for the primary range axis.\r\n     *\r\n     * @return The range axis edge.\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1041,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis(int)",
      "begin_line": 1053,
      "end_line": 1066,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 32)",
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1065,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1091,
      "end_line": 1107,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 49)",
        "(line 1093,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1099,col 40)",
        "(line 1100,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1117,
      "end_line": 1122,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setDomainAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)",
        "(line 1121,col 9)-(line 1121,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisCount()",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getDomainAxisCount()\r\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1132,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeAxes()",
      "begin_line": 1141,
      "end_line": 1150,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1147,col 9)",
        "(line 1148,col 9)-(line 1148,col 31)",
        "(line 1149,col 9)-(line 1149,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureRangeAxes()",
      "begin_line": 1157,
      "end_line": 1164,
      "comment": "\r\n     * Configures the range axes.\r\n     * \r\n     * @see #configureDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation(int)",
      "begin_line": 1177,
      "end_line": 1186,
      "comment": "\r\n     * Returns the location for a range axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary range axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 35)",
        "(line 1179,col 9)-(line 1181,col 9)",
        "(line 1182,col 9)-(line 1184,col 9)",
        "(line 1185,col 9)-(line 1185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1197,
      "end_line": 1200,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1216,
      "end_line": 1227,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1222,col 9)",
        "(line 1223,col 9)-(line 1223,col 53)",
        "(line 1224,col 9)-(line 1226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge(int)",
      "begin_line": 1239,
      "end_line": 1247,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 60)",
        "(line 1241,col 9)-(line 1242,col 34)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset()",
      "begin_line": 1257,
      "end_line": 1259,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataset(int)\r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset(int)",
      "begin_line": 1270,
      "end_line": 1276,
      "comment": "\r\n     * Returns a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 32)",
        "(line 1272,col 9)-(line 1274,col 9)",
        "(line 1275,col 9)-(line 1275,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1287,
      "end_line": 1289,
      "comment": "\r\n     * Sets the primary dataset for the plot, replacing the existing dataset if\r\n     * there is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1288,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(int, org.jfree.data.xy.XYDataset)",
      "begin_line": 1299,
      "end_line": 1312,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 47)",
        "(line 1301,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1304,col 42)",
        "(line 1305,col 9)-(line 1307,col 9)",
        "(line 1310,col 9)-(line 1310,col 73)",
        "(line 1311,col 9)-(line 1311,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetCount()",
      "begin_line": 1319,
      "end_line": 1321,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.indexOf(org.jfree.data.xy.XYDataset)",
      "begin_line": 1331,
      "end_line": 1340,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 1332,col 9)-(line 1332,col 24)",
        "(line 1333,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1351,
      "end_line": 1356,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1353,col 40)",
        "(line 1355,col 9)-(line 1355,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1367,
      "end_line": 1372,
      "comment": "\r\n     * Maps a dataset to a particular range axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1369,col 40)",
        "(line 1371,col 9)-(line 1371,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer()",
      "begin_line": 1381,
      "end_line": 1383,
      "comment": "\r\n     * Returns the renderer for the primary dataset.\r\n     *\r\n     * @return The item renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1382,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer(int)",
      "begin_line": 1394,
      "end_line": 1401,
      "comment": "\r\n     * Returns the renderer for a dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(int, XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1395,col 9)-(line 1395,col 37)",
        "(line 1396,col 9)-(line 1398,col 9)",
        "(line 1399,col 9)-(line 1399,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1412,
      "end_line": 1414,
      "comment": "\r\n     * Sets the renderer for the primary dataset and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If the renderer\r\n     * is set to \u003ccode\u003enull\u003c/code\u003e, no data will be displayed.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1425,
      "end_line": 1427,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)",
      "begin_line": 1439,
      "end_line": 1455,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 53)",
        "(line 1442,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1445,col 44)",
        "(line 1446,col 9)-(line 1449,col 9)",
        "(line 1450,col 9)-(line 1450,col 30)",
        "(line 1451,col 9)-(line 1451,col 29)",
        "(line 1452,col 9)-(line 1454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])",
      "begin_line": 1463,
      "end_line": 1468,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param renderers  the renderers (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1464,col 9)-(line 1466,col 9)",
        "(line 1467,col 9)-(line 1467,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder()",
      "begin_line": 1477,
      "end_line": 1479,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1491,
      "end_line": 1497,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 43)",
        "(line 1496,col 9)-(line 1496,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder()",
      "begin_line": 1506,
      "end_line": 1508,
      "comment": "\r\n     * Returns the series rendering order.\r\n     *\r\n     * @return the order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesRenderingOrder(SeriesRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1507,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)",
      "begin_line": 1520,
      "end_line": 1526,
      "comment": "\r\n     * Sets the series order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary series\r\n     * last (so that the primary series appears to be on top).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSeriesRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1523,col 9)",
        "(line 1524,col 9)-(line 1524,col 42)",
        "(line 1525,col 9)-(line 1525,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1536,
      "end_line": 1538,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererForDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1549,
      "end_line": 1561,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  The code first\r\n     * determines the index of the dataset, then checks if there is a\r\n     * renderer with the same index (if not, the method returns renderer(0).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1550,col 37)",
        "(line 1551,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1560,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getWeight()",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     * \r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setWeight(int)",
      "begin_line": 1583,
      "end_line": 1586,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     * \r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1584,col 29)",
        "(line 1585,col 9)-(line 1585,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible()",
      "begin_line": 1596,
      "end_line": 1598,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1597,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1611,
      "end_line": 1616,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1612,col 9)-(line 1615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlineStroke()",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1643,
      "end_line": 1649,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1644,col 9)-(line 1646,col 9)",
        "(line 1647,col 9)-(line 1647,col 43)",
        "(line 1648,col 9)-(line 1648,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlinePaint()",
      "begin_line": 1659,
      "end_line": 1661,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1660,col 9)-(line 1660,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1674,
      "end_line": 1680,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1678,col 41)",
        "(line 1679,col 9)-(line 1679,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible()",
      "begin_line": 1690,
      "end_line": 1692,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1691,col 9)-(line 1691,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 1705,
      "end_line": 1710,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1706,col 9)-(line 1709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlineStroke()",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 1732,
      "end_line": 1738,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1735,col 9)",
        "(line 1736,col 9)-(line 1736,col 42)",
        "(line 1737,col 9)-(line 1737,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlinePaint()",
      "begin_line": 1748,
      "end_line": 1750,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1749,col 9)-(line 1749,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 1760,
      "end_line": 1766,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1763,col 9)",
        "(line 1764,col 9)-(line 1764,col 40)",
        "(line 1765,col 9)-(line 1765,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible()",
      "begin_line": 1778,
      "end_line": 1780,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible(boolean)",
      "begin_line": 1793,
      "end_line": 1796,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the domain axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #isDomainZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1794,col 49)",
        "(line 1795,col 9)-(line 1795,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke()",
      "begin_line": 1807,
      "end_line": 1809,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1808,col 9)-(line 1808,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1821,
      "end_line": 1827,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 1822,col 9)-(line 1824,col 9)",
        "(line 1825,col 9)-(line 1825,col 47)",
        "(line 1826,col 9)-(line 1826,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint()",
      "begin_line": 1839,
      "end_line": 1841,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * domain axis.\r\n     * \r\n     * @since 1.0.5\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1840,col 9)-(line 1840,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1853,
      "end_line": 1859,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 1854,col 9)-(line 1856,col 9)",
        "(line 1857,col 9)-(line 1857,col 45)",
        "(line 1858,col 9)-(line 1858,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible()",
      "begin_line": 1869,
      "end_line": 1871,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1870,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 1882,
      "end_line": 1885,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isRangeZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1883,col 48)",
        "(line 1884,col 9)-(line 1884,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke()",
      "begin_line": 1894,
      "end_line": 1896,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1895,col 9)-(line 1895,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1906,
      "end_line": 1912,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 1907,col 9)-(line 1909,col 9)",
        "(line 1910,col 9)-(line 1910,col 46)",
        "(line 1911,col 9)-(line 1911,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint()",
      "begin_line": 1922,
      "end_line": 1924,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1923,col 9)-(line 1923,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1934,
      "end_line": 1940,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1937,col 9)",
        "(line 1938,col 9)-(line 1938,col 44)",
        "(line 1939,col 9)-(line 1939,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainTickBandPaint()",
      "begin_line": 1950,
      "end_line": 1952,
      "comment": "\r\n     * Returns the paint used for the domain tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1951,col 9)-(line 1951,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(java.awt.Paint)",
      "begin_line": 1961,
      "end_line": 1964,
      "comment": "\r\n     * Sets the paint for the domain tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 1962,col 9)-(line 1962,col 41)",
        "(line 1963,col 9)-(line 1963,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeTickBandPaint()",
      "begin_line": 1974,
      "end_line": 1976,
      "comment": "\r\n     * Returns the paint used for the range tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1975,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeTickBandPaint(java.awt.Paint)",
      "begin_line": 1985,
      "end_line": 1988,
      "comment": "\r\n     * Sets the paint for the range tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 1986,col 9)-(line 1986,col 40)",
        "(line 1987,col 9)-(line 1987,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantOrigin()",
      "begin_line": 1998,
      "end_line": 2000,
      "comment": "\r\n     * Returns the origin for the quadrants that can be displayed on the plot.\r\n     * This defaults to (0, 0).\r\n     *\r\n     * @return The origin point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     ",
      "child_ranges": [
        "(line 1999,col 9)-(line 1999,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantOrigin(java.awt.geom.Point2D)",
      "begin_line": 2010,
      "end_line": 2016,
      "comment": "\r\n     * Sets the quadrant origin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param origin  the origin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getQuadrantOrigin()\r\n     ",
      "child_ranges": [
        "(line 2011,col 9)-(line 2013,col 9)",
        "(line 2014,col 9)-(line 2014,col 37)",
        "(line 2015,col 9)-(line 2015,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantPaint(int)",
      "begin_line": 2027,
      "end_line": 2033,
      "comment": "\r\n     * Returns the paint used for the specified quadrant.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 2028,col 9)-(line 2031,col 9)",
        "(line 2032,col 9)-(line 2032,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantPaint(int, java.awt.Paint)",
      "begin_line": 2044,
      "end_line": 2051,
      "comment": "\r\n     * Sets the paint used for the specified quadrant and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getQuadrantPaint(int)\r\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2048,col 9)",
        "(line 2049,col 9)-(line 2049,col 42)",
        "(line 2050,col 9)-(line 2050,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2065,
      "end_line": 2068,
      "comment": "\r\n     * Adds a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addDomainMarker(Marker, Layer)\r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2067,col 9)-(line 2067,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2082,
      "end_line": 2084,
      "comment": "\r\n     * Adds a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2083,col 9)-(line 2083,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers()",
      "begin_line": 2092,
      "end_line": 2112,
      "comment": "\r\n     * Clears all the (foreground and background) domain markers and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2093,col 9)-(line 2101,col 9)",
        "(line 2102,col 9)-(line 2110,col 9)",
        "(line 2111,col 9)-(line 2111,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers(int)",
      "begin_line": 2122,
      "end_line": 2149,
      "comment": "\r\n     * Clears the (foreground and background) domain markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2123,col 9)-(line 2123,col 41)",
        "(line 2124,col 9)-(line 2135,col 9)",
        "(line 2136,col 9)-(line 2147,col 9)",
        "(line 2148,col 9)-(line 2148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2166,
      "end_line": 2194,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearDomainMarkers(int)\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2167,col 9)-(line 2169,col 9)",
        "(line 2170,col 9)-(line 2172,col 9)",
        "(line 2173,col 9)-(line 2173,col 27)",
        "(line 2174,col 9)-(line 2191,col 9)",
        "(line 2192,col 9)-(line 2192,col 39)",
        "(line 2193,col 9)-(line 2193,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2207,
      "end_line": 2209,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2208,col 9)-(line 2208,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2223,
      "end_line": 2225,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2224,col 9)-(line 2224,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2240,
      "end_line": 2255,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2241,col 9)-(line 2241,col 26)",
        "(line 2242,col 9)-(line 2249,col 9)",
        "(line 2250,col 9)-(line 2250,col 49)",
        "(line 2251,col 9)-(line 2253,col 9)",
        "(line 2254,col 9)-(line 2254,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2268,
      "end_line": 2270,
      "comment": "\r\n     * Adds a marker for the range axis and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2269,col 9)-(line 2269,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2284,
      "end_line": 2286,
      "comment": "\r\n     * Adds a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2285,col 9)-(line 2285,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers()",
      "begin_line": 2294,
      "end_line": 2314,
      "comment": "\r\n     * Clears all the range markers and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2303,col 9)",
        "(line 2304,col 9)-(line 2312,col 9)",
        "(line 2313,col 9)-(line 2313,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2330,
      "end_line": 2352,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2331,col 9)-(line 2331,col 27)",
        "(line 2332,col 9)-(line 2349,col 9)",
        "(line 2350,col 9)-(line 2350,col 39)",
        "(line 2351,col 9)-(line 2351,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers(int)",
      "begin_line": 2360,
      "end_line": 2387,
      "comment": "\r\n     * Clears the (foreground and background) range markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     ",
      "child_ranges": [
        "(line 2361,col 9)-(line 2361,col 41)",
        "(line 2362,col 9)-(line 2373,col 9)",
        "(line 2374,col 9)-(line 2385,col 9)",
        "(line 2386,col 9)-(line 2386,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2400,
      "end_line": 2402,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2401,col 9)-(line 2401,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2416,
      "end_line": 2418,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2417,col 9)-(line 2417,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2433,
      "end_line": 2452,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2434,col 9)-(line 2436,col 9)",
        "(line 2437,col 9)-(line 2437,col 26)",
        "(line 2438,col 9)-(line 2445,col 9)",
        "(line 2447,col 9)-(line 2447,col 49)",
        "(line 2448,col 9)-(line 2450,col 9)",
        "(line 2451,col 9)-(line 2451,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2463,
      "end_line": 2469,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAnnotations()\r\n     * @see #removeAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2464,col 9)-(line 2466,col 9)",
        "(line 2467,col 9)-(line 2467,col 41)",
        "(line 2468,col 9)-(line 2468,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2482,
      "end_line": 2491,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     * @see #getAnnotations()\r\n     ",
      "child_ranges": [
        "(line 2483,col 9)-(line 2485,col 9)",
        "(line 2486,col 9)-(line 2486,col 62)",
        "(line 2487,col 9)-(line 2489,col 9)",
        "(line 2490,col 9)-(line 2490,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAnnotations()",
      "begin_line": 2502,
      "end_line": 2504,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations.\r\n     * \r\n     * @since 1.0.1\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2503,col 9)-(line 2503,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearAnnotations()",
      "begin_line": 2512,
      "end_line": 2515,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2513,col 9)-(line 2513,col 33)",
        "(line 2514,col 9)-(line 2514,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2525,
      "end_line": 2531,
      "comment": "\r\n     * Calculates the space required for all the axes in the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2527,col 9)-(line 2527,col 42)",
        "(line 2528,col 9)-(line 2528,col 62)",
        "(line 2529,col 9)-(line 2529,col 61)",
        "(line 2530,col 9)-(line 2530,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2542,
      "end_line": 2578,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2546,col 9)-(line 2548,col 9)",
        "(line 2551,col 9)-(line 2574,col 9)",
        "(line 2576,col 9)-(line 2576,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2589,
      "end_line": 2624,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2593,col 9)-(line 2595,col 9)",
        "(line 2598,col 9)-(line 2621,col 9)",
        "(line 2622,col 9)-(line 2622,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2638,
      "end_line": 2894,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 2645,col 9)-(line 2645,col 64)",
        "(line 2646,col 9)-(line 2646,col 66)",
        "(line 2647,col 9)-(line 2649,col 9)",
        "(line 2652,col 9)-(line 2654,col 9)",
        "(line 2657,col 9)-(line 2657,col 45)",
        "(line 2658,col 9)-(line 2658,col 26)",
        "(line 2660,col 9)-(line 2660,col 55)",
        "(line 2661,col 9)-(line 2661,col 56)",
        "(line 2662,col 9)-(line 2662,col 39)",
        "(line 2664,col 9)-(line 2666,col 9)",
        "(line 2669,col 9)-(line 2669,col 37)",
        "(line 2670,col 9)-(line 2670,col 62)",
        "(line 2672,col 9)-(line 2672,col 50)",
        "(line 2676,col 9)-(line 2678,col 9)",
        "(line 2679,col 9)-(line 2679,col 61)",
        "(line 2680,col 9)-(line 2680,col 70)",
        "(line 2681,col 9)-(line 2681,col 41)",
        "(line 2683,col 9)-(line 2683,col 46)",
        "(line 2684,col 9)-(line 2684,col 46)",
        "(line 2685,col 9)-(line 2712,col 9)",
        "(line 2713,col 9)-(line 2713,col 64)",
        "(line 2714,col 9)-(line 2714,col 63)",
        "(line 2715,col 9)-(line 2715,col 42)",
        "(line 2716,col 9)-(line 2716,col 56)",
        "(line 2718,col 9)-(line 2718,col 26)",
        "(line 2719,col 9)-(line 2720,col 39)",
        "(line 2722,col 9)-(line 2723,col 33)",
        "(line 2724,col 9)-(line 2729,col 9)",
        "(line 2731,col 9)-(line 2731,col 80)",
        "(line 2732,col 9)-(line 2737,col 9)",
        "(line 2738,col 9)-(line 2740,col 9)",
        "(line 2741,col 9)-(line 2743,col 9)",
        "(line 2744,col 9)-(line 2747,col 9)",
        "(line 2748,col 9)-(line 2751,col 9)",
        "(line 2754,col 9)-(line 2756,col 9)",
        "(line 2757,col 9)-(line 2759,col 9)",
        "(line 2762,col 9)-(line 2762,col 34)",
        "(line 2763,col 9)-(line 2763,col 65)",
        "(line 2764,col 9)-(line 2832,col 9)",
        "(line 2835,col 9)-(line 2835,col 61)",
        "(line 2836,col 9)-(line 2836,col 52)",
        "(line 2837,col 9)-(line 2837,col 64)",
        "(line 2838,col 9)-(line 2847,col 9)",
        "(line 2848,col 9)-(line 2848,col 71)",
        "(line 2849,col 9)-(line 2854,col 9)",
        "(line 2857,col 9)-(line 2857,col 60)",
        "(line 2858,col 9)-(line 2858,col 51)",
        "(line 2859,col 9)-(line 2859,col 63)",
        "(line 2860,col 9)-(line 2868,col 9)",
        "(line 2869,col 9)-(line 2869,col 70)",
        "(line 2870,col 9)-(line 2875,col 9)",
        "(line 2877,col 9)-(line 2879,col 9)",
        "(line 2881,col 9)-(line 2883,col 9)",
        "(line 2884,col 9)-(line 2886,col 9)",
        "(line 2888,col 9)-(line 2888,col 44)",
        "(line 2889,col 9)-(line 2889,col 33)",
        "(line 2890,col 9)-(line 2890,col 43)",
        "(line 2892,col 9)-(line 2892,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2902,
      "end_line": 2906,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 2903,col 9)-(line 2903,col 51)",
        "(line 2904,col 9)-(line 2904,col 32)",
        "(line 2905,col 9)-(line 2905,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2917,
      "end_line": 3017,
      "comment": "\r\n     * Draws the quadrants.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 2921,col 9)-(line 2921,col 40)",
        "(line 2923,col 9)-(line 2923,col 42)",
        "(line 2924,col 9)-(line 2924,col 46)",
        "(line 2925,col 9)-(line 2925,col 70)",
        "(line 2927,col 9)-(line 2927,col 41)",
        "(line 2928,col 9)-(line 2928,col 46)",
        "(line 2929,col 9)-(line 2929,col 69)",
        "(line 2931,col 9)-(line 2931,col 44)",
        "(line 2932,col 9)-(line 2932,col 76)",
        "(line 2934,col 9)-(line 2934,col 44)",
        "(line 2935,col 9)-(line 2935,col 76)",
        "(line 2937,col 9)-(line 2937,col 44)",
        "(line 2938,col 9)-(line 2938,col 75)",
        "(line 2940,col 9)-(line 2940,col 44)",
        "(line 2941,col 9)-(line 2941,col 75)",
        "(line 2943,col 9)-(line 2943,col 69)",
        "(line 2944,col 9)-(line 2959,col 9)",
        "(line 2960,col 9)-(line 2974,col 9)",
        "(line 2975,col 9)-(line 2989,col 9)",
        "(line 2990,col 9)-(line 3004,col 9)",
        "(line 3005,col 9)-(line 3016,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3028,
      "end_line": 3052,
      "comment": "\r\n     * Draws the domain tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3030,col 9)-(line 3030,col 51)",
        "(line 3031,col 9)-(line 3051,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3063,
      "end_line": 3087,
      "comment": "\r\n     * Draws the range tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3065,col 9)-(line 3065,col 50)",
        "(line 3066,col 9)-(line 3086,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3100,
      "end_line": 3174,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the state for each axis drawn.\r\n     ",
      "child_ranges": [
        "(line 3105,col 9)-(line 3105,col 61)",
        "(line 3108,col 9)-(line 3113,col 9)",
        "(line 3116,col 9)-(line 3121,col 9)",
        "(line 3123,col 9)-(line 3123,col 41)",
        "(line 3126,col 9)-(line 3127,col 38)",
        "(line 3128,col 9)-(line 3128,col 69)",
        "(line 3129,col 9)-(line 3135,col 9)",
        "(line 3138,col 9)-(line 3139,col 79)",
        "(line 3140,col 9)-(line 3140,col 63)",
        "(line 3141,col 9)-(line 3147,col 9)",
        "(line 3150,col 9)-(line 3151,col 76)",
        "(line 3152,col 9)-(line 3152,col 61)",
        "(line 3153,col 9)-(line 3159,col 9)",
        "(line 3162,col 9)-(line 3163,col 77)",
        "(line 3164,col 9)-(line 3164,col 62)",
        "(line 3165,col 9)-(line 3171,col 9)",
        "(line 3173,col 9)-(line 3173,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 3192,
      "end_line": 3266,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current renderer.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag that indicates whether any data was actually rendered.\r\n     ",
      "child_ranges": [
        "(line 3198,col 9)-(line 3198,col 34)",
        "(line 3199,col 9)-(line 3199,col 46)",
        "(line 3200,col 9)-(line 3264,col 9)",
        "(line 3265,col 9)-(line 3265,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(int)",
      "begin_line": 3275,
      "end_line": 3293,
      "comment": "\r\n     * Returns the domain axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3277,col 9)-(line 3280,col 9)",
        "(line 3282,col 9)-(line 3282,col 35)",
        "(line 3283,col 9)-(line 3284,col 36)",
        "(line 3285,col 9)-(line 3290,col 9)",
        "(line 3291,col 9)-(line 3291,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(int)",
      "begin_line": 3302,
      "end_line": 3320,
      "comment": "\r\n     * Returns the range axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3304,col 9)-(line 3307,col 9)",
        "(line 3309,col 9)-(line 3309,col 35)",
        "(line 3310,col 9)-(line 3311,col 75)",
        "(line 3312,col 9)-(line 3317,col 9)",
        "(line 3318,col 9)-(line 3318,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3331,
      "end_line": 3350,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3335,col 9)-(line 3337,col 9)",
        "(line 3340,col 9)-(line 3349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3362,
      "end_line": 3387,
      "comment": "\r\n     * Draws the gridlines for the plot\u0027s primary range axis, if they are\r\n     * visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3366,col 9)-(line 3368,col 9)",
        "(line 3371,col 9)-(line 3386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3399,
      "end_line": 3406,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 3400,col 9)-(line 3405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3416,
      "end_line": 3421,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 3417,col 9)-(line 3420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3430,
      "end_line": 3442,
      "comment": "\r\n     * Draws the annotations for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 3434,col 9)-(line 3434,col 56)",
        "(line 3435,col 9)-(line 3440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3453,
      "end_line": 3475,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 3456,col 9)-(line 3456,col 46)",
        "(line 3457,col 9)-(line 3459,col 9)",
        "(line 3462,col 9)-(line 3464,col 9)",
        "(line 3465,col 9)-(line 3465,col 60)",
        "(line 3466,col 9)-(line 3466,col 56)",
        "(line 3467,col 9)-(line 3473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3486,
      "end_line": 3507,
      "comment": "\r\n     * Draws the range markers (if any) for a renderer and layer.  This method\r\n     * is typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 3489,col 9)-(line 3489,col 46)",
        "(line 3490,col 9)-(line 3492,col 9)",
        "(line 3495,col 9)-(line 3497,col 9)",
        "(line 3498,col 9)-(line 3498,col 59)",
        "(line 3499,col 9)-(line 3499,col 55)",
        "(line 3500,col 9)-(line 3506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3518,
      "end_line": 3520,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     * \r\n     * @see #getRangeMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 3519,col 9)-(line 3519,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3531,
      "end_line": 3533,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     * \r\n     * @see #getDomainMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 3532,col 9)-(line 3532,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3546,
      "end_line": 3559,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3547,col 9)-(line 3547,col 33)",
        "(line 3548,col 9)-(line 3548,col 41)",
        "(line 3549,col 9)-(line 3554,col 9)",
        "(line 3555,col 9)-(line 3557,col 9)",
        "(line 3558,col 9)-(line 3558,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3572,
      "end_line": 3585,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3573,col 9)-(line 3573,col 33)",
        "(line 3574,col 9)-(line 3574,col 41)",
        "(line 3575,col 9)-(line 3580,col 9)",
        "(line 3581,col 9)-(line 3583,col 9)",
        "(line 3584,col 9)-(line 3584,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3597,
      "end_line": 3614,
      "comment": "\r\n     * Utility method for drawing a horizontal line across the data area of the\r\n     * plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 3601,col 9)-(line 3601,col 40)",
        "(line 3602,col 9)-(line 3604,col 9)",
        "(line 3605,col 9)-(line 3612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3629,
      "end_line": 3652,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 3633,col 9)-(line 3650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3663,
      "end_line": 3680,
      "comment": "\r\n     * Utility method for drawing a vertical line on the data area of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 3666,col 9)-(line 3666,col 41)",
        "(line 3667,col 9)-(line 3669,col 9)",
        "(line 3670,col 9)-(line 3678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3695,
      "end_line": 3718,
      "comment": "\r\n     * Draws a range crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 3699,col 9)-(line 3716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3727,
      "end_line": 3747,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  the x-coordinate, where the click occurred, in Java2D space.\r\n     * @param y  the y-coordinate, where the click occurred, in Java2D space.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 3729,col 9)-(line 3729,col 50)",
        "(line 3730,col 9)-(line 3746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(java.lang.Integer)",
      "begin_line": 3757,
      "end_line": 3777,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3758,col 9)-(line 3760,col 9)",
        "(line 3761,col 9)-(line 3761,col 38)",
        "(line 3762,col 9)-(line 3775,col 9)",
        "(line 3776,col 9)-(line 3776,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(java.lang.Integer)",
      "begin_line": 3787,
      "end_line": 3807,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3788,col 9)-(line 3790,col 9)",
        "(line 3791,col 9)-(line 3791,col 38)",
        "(line 3792,col 9)-(line 3805,col 9)",
        "(line 3806,col 9)-(line 3806,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3818,
      "end_line": 3829,
      "comment": "\r\n     * Returns the index of the given domain axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 3819,col 9)-(line 3819,col 51)",
        "(line 3820,col 9)-(line 3827,col 9)",
        "(line 3828,col 9)-(line 3828,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3840,
      "end_line": 3851,
      "comment": "\r\n     * Returns the index of the given range axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getDomainAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 3841,col 9)-(line 3841,col 50)",
        "(line 3842,col 9)-(line 3849,col 9)",
        "(line 3850,col 9)-(line 3850,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3860,
      "end_line": 3911,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 3862,col 9)-(line 3862,col 28)",
        "(line 3863,col 9)-(line 3863,col 46)",
        "(line 3864,col 9)-(line 3864,col 36)",
        "(line 3867,col 9)-(line 3867,col 51)",
        "(line 3868,col 9)-(line 3872,col 9)",
        "(line 3875,col 9)-(line 3875,col 49)",
        "(line 3876,col 9)-(line 3880,col 9)",
        "(line 3884,col 9)-(line 3884,col 54)",
        "(line 3885,col 9)-(line 3908,col 9)",
        "(line 3909,col 9)-(line 3909,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 3920,
      "end_line": 3931,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 3921,col 9)-(line 3921,col 30)",
        "(line 3922,col 9)-(line 3922,col 29)",
        "(line 3923,col 9)-(line 3930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 3938,
      "end_line": 3940,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 3939,col 9)-(line 3939,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible()",
      "begin_line": 3949,
      "end_line": 3951,
      "comment": "\r\n     * Returns a flag indicating whether or not the domain crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 3950,col 9)-(line 3950,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 3962,
      "end_line": 3967,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair is visible \r\n     * and, if the flag changes, sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 3963,col 9)-(line 3966,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData()",
      "begin_line": 3977,
      "end_line": 3979,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 3978,col 9)-(line 3978,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData(boolean)",
      "begin_line": 3990,
      "end_line": 3995,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this\r\n     * method sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isDomainCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 3991,col 9)-(line 3994,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairValue()",
      "begin_line": 4004,
      "end_line": 4006,
      "comment": "\r\n     * Returns the domain crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setDomainCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4005,col 9)-(line 4005,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double)",
      "begin_line": 4016,
      "end_line": 4018,
      "comment": "\r\n     * Sets the domain crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners (provided that the domain crosshair is visible).\r\n     *\r\n     * @param value  the value.\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4017,col 9)-(line 4017,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double, boolean)",
      "begin_line": 4030,
      "end_line": 4035,
      "comment": "\r\n     * Sets the domain crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (provided that the\r\n     * domain crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4031,col 9)-(line 4031,col 42)",
        "(line 4032,col 9)-(line 4034,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke()",
      "begin_line": 4046,
      "end_line": 4048,
      "comment": "\r\n     * Returns the {@link Stroke} used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4047,col 9)-(line 4047,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4059,
      "end_line": 4065,
      "comment": "\r\n     * Sets the Stroke used to draw the crosshairs (if visible) and notifies\r\n     * registered listeners that the axis has been modified.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     *     \r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4060,col 9)-(line 4062,col 9)",
        "(line 4063,col 9)-(line 4063,col 44)",
        "(line 4064,col 9)-(line 4064,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint()",
      "begin_line": 4076,
      "end_line": 4078,
      "comment": "\r\n     * Returns the domain crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4077,col 9)-(line 4077,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 4088,
      "end_line": 4094,
      "comment": "\r\n     * Sets the paint used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4089,col 9)-(line 4091,col 9)",
        "(line 4092,col 9)-(line 4092,col 42)",
        "(line 4093,col 9)-(line 4093,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible()",
      "begin_line": 4104,
      "end_line": 4106,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4105,col 9)-(line 4105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 4117,
      "end_line": 4122,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     * If the flag value changes, this method sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4118,col 9)-(line 4121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 4132,
      "end_line": 4134,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 4133,col 9)-(line 4133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 4145,
      "end_line": 4150,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this method\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 4146,col 9)-(line 4149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairValue()",
      "begin_line": 4159,
      "end_line": 4161,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4160,col 9)-(line 4160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double)",
      "begin_line": 4173,
      "end_line": 4175,
      "comment": "\r\n     * Sets the range crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4174,col 9)-(line 4174,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 4187,
      "end_line": 4192,
      "comment": "\r\n     * Sets the range crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners, but only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4188,col 9)-(line 4188,col 41)",
        "(line 4189,col 9)-(line 4191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke()",
      "begin_line": 4203,
      "end_line": 4205,
      "comment": "\r\n     * Returns the stroke used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4204,col 9)-(line 4204,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4216,
      "end_line": 4222,
      "comment": "\r\n     * Sets the stroke used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4217,col 9)-(line 4219,col 9)",
        "(line 4220,col 9)-(line 4220,col 43)",
        "(line 4221,col 9)-(line 4221,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint()",
      "begin_line": 4233,
      "end_line": 4235,
      "comment": "\r\n     * Returns the range crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4234,col 9)-(line 4234,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 4245,
      "end_line": 4251,
      "comment": "\r\n     * Sets the paint used to color the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4246,col 9)-(line 4248,col 9)",
        "(line 4249,col 9)-(line 4249,col 41)",
        "(line 4250,col 9)-(line 4250,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace()",
      "begin_line": 4260,
      "end_line": 4262,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4261,col 9)-(line 4261,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4272,
      "end_line": 4274,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4273,col 9)-(line 4273,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4287,
      "end_line": 4292,
      "comment": "\r\n     * Sets the fixed domain axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 4288,col 9)-(line 4288,col 42)",
        "(line 4289,col 9)-(line 4291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace()",
      "begin_line": 4301,
      "end_line": 4303,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4302,col 9)-(line 4302,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4313,
      "end_line": 4315,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4314,col 9)-(line 4314,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4328,
      "end_line": 4333,
      "comment": "\r\n     * Sets the fixed range axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 4329,col 9)-(line 4329,col 41)",
        "(line 4330,col 9)-(line 4332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4344,
      "end_line": 4348,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4347,col 9)-(line 4347,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4362,
      "end_line": 4385,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4366,col 9)-(line 4384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4401,
      "end_line": 4409,
      "comment": "\r\n     * Zooms in on the domain axis/axes.  The new lower and upper bounds are\r\n     * specified as percentages of the current axis range, where 0 percent is\r\n     * the current lower bound and 100 percent is the current upper bound.\r\n     *\r\n     * @param lowerPercent  a percentage that determines the new lower bound\r\n     *                      for the axis (e.g. 0.20 is twenty percent).\r\n     * @param upperPercent  a percentage that determines the new upper bound\r\n     *                      for the axis (e.g. 0.80 is eighty percent).\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (ignored).\r\n     * \r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4403,col 9)-(line 4408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4420,
      "end_line": 4424,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     ",
      "child_ranges": [
        "(line 4423,col 9)-(line 4423,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4439,
      "end_line": 4462,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4443,col 9)-(line 4461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4474,
      "end_line": 4482,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 4476,col 9)-(line 4481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZoomable()",
      "begin_line": 4492,
      "end_line": 4494,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the domain axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 4493,col 9)-(line 4493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZoomable()",
      "begin_line": 4504,
      "end_line": 4506,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the range axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 4505,col 9)-(line 4505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesCount()",
      "begin_line": 4514,
      "end_line": 4521,
      "comment": "\r\n     * Returns the number of series in the primary dataset for this plot.  If\r\n     * the dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 4515,col 9)-(line 4515,col 23)",
        "(line 4516,col 9)-(line 4516,col 41)",
        "(line 4517,col 9)-(line 4519,col 9)",
        "(line 4520,col 9)-(line 4520,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedLegendItems()",
      "begin_line": 4530,
      "end_line": 4532,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 4531,col 9)-(line 4531,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 4543,
      "end_line": 4546,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 4544,col 9)-(line 4544,col 38)",
        "(line 4545,col 9)-(line 4545,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getLegendItems()",
      "begin_line": 4555,
      "end_line": 4584,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s renderer, since the renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 4556,col 9)-(line 4558,col 9)",
        "(line 4559,col 9)-(line 4559,col 65)",
        "(line 4560,col 9)-(line 4560,col 41)",
        "(line 4561,col 9)-(line 4582,col 9)",
        "(line 4583,col 9)-(line 4583,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.equals(java.lang.Object)",
      "begin_line": 4593,
      "end_line": 4768,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 4595,col 9)-(line 4597,col 9)",
        "(line 4598,col 9)-(line 4600,col 9)",
        "(line 4602,col 9)-(line 4602,col 35)",
        "(line 4603,col 9)-(line 4605,col 9)",
        "(line 4606,col 9)-(line 4608,col 9)",
        "(line 4609,col 9)-(line 4611,col 9)",
        "(line 4612,col 9)-(line 4614,col 9)",
        "(line 4615,col 9)-(line 4618,col 9)",
        "(line 4619,col 9)-(line 4621,col 9)",
        "(line 4622,col 9)-(line 4624,col 9)",
        "(line 4625,col 9)-(line 4627,col 9)",
        "(line 4628,col 9)-(line 4630,col 9)",
        "(line 4631,col 9)-(line 4633,col 9)",
        "(line 4634,col 9)-(line 4636,col 9)",
        "(line 4637,col 9)-(line 4640,col 9)",
        "(line 4641,col 9)-(line 4643,col 9)",
        "(line 4644,col 9)-(line 4646,col 9)",
        "(line 4647,col 9)-(line 4649,col 9)",
        "(line 4650,col 9)-(line 4652,col 9)",
        "(line 4653,col 9)-(line 4655,col 9)",
        "(line 4656,col 9)-(line 4658,col 9)",
        "(line 4659,col 9)-(line 4662,col 9)",
        "(line 4663,col 9)-(line 4666,col 9)",
        "(line 4667,col 9)-(line 4670,col 9)",
        "(line 4671,col 9)-(line 4674,col 9)",
        "(line 4675,col 9)-(line 4678,col 9)",
        "(line 4679,col 9)-(line 4682,col 9)",
        "(line 4683,col 9)-(line 4686,col 9)",
        "(line 4687,col 9)-(line 4690,col 9)",
        "(line 4691,col 9)-(line 4694,col 9)",
        "(line 4695,col 9)-(line 4698,col 9)",
        "(line 4699,col 9)-(line 4702,col 9)",
        "(line 4703,col 9)-(line 4706,col 9)",
        "(line 4707,col 9)-(line 4710,col 9)",
        "(line 4711,col 9)-(line 4714,col 9)",
        "(line 4715,col 9)-(line 4718,col 9)",
        "(line 4719,col 9)-(line 4722,col 9)",
        "(line 4723,col 9)-(line 4726,col 9)",
        "(line 4727,col 9)-(line 4730,col 9)",
        "(line 4731,col 9)-(line 4734,col 9)",
        "(line 4735,col 9)-(line 4738,col 9)",
        "(line 4739,col 9)-(line 4742,col 9)",
        "(line 4743,col 9)-(line 4746,col 9)",
        "(line 4747,col 9)-(line 4749,col 9)",
        "(line 4750,col 9)-(line 4753,col 9)",
        "(line 4754,col 9)-(line 4757,col 9)",
        "(line 4758,col 9)-(line 4760,col 9)",
        "(line 4761,col 9)-(line 4766,col 9)",
        "(line 4767,col 9)-(line 4767,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clone()",
      "begin_line": 4778,
      "end_line": 4852,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 4780,col 9)-(line 4780,col 46)",
        "(line 4781,col 9)-(line 4781,col 79)",
        "(line 4782,col 9)-(line 4790,col 9)",
        "(line 4791,col 9)-(line 4792,col 49)",
        "(line 4794,col 9)-(line 4794,col 77)",
        "(line 4795,col 9)-(line 4803,col 9)",
        "(line 4804,col 9)-(line 4805,col 41)",
        "(line 4808,col 9)-(line 4808,col 75)",
        "(line 4809,col 9)-(line 4814,col 9)",
        "(line 4816,col 9)-(line 4816,col 53)",
        "(line 4817,col 9)-(line 4817,col 73)",
        "(line 4818,col 9)-(line 4818,col 52)",
        "(line 4819,col 9)-(line 4819,col 71)",
        "(line 4821,col 9)-(line 4821,col 77)",
        "(line 4822,col 9)-(line 4828,col 9)",
        "(line 4829,col 9)-(line 4830,col 46)",
        "(line 4831,col 9)-(line 4832,col 46)",
        "(line 4833,col 9)-(line 4834,col 45)",
        "(line 4835,col 9)-(line 4836,col 45)",
        "(line 4837,col 9)-(line 4837,col 79)",
        "(line 4838,col 9)-(line 4841,col 9)",
        "(line 4842,col 9)-(line 4845,col 9)",
        "(line 4847,col 9)-(line 4848,col 37)",
        "(line 4849,col 9)-(line 4849,col 67)",
        "(line 4850,col 9)-(line 4850,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 4861,
      "end_line": 4881,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 4862,col 9)-(line 4862,col 36)",
        "(line 4863,col 9)-(line 4863,col 71)",
        "(line 4864,col 9)-(line 4864,col 69)",
        "(line 4865,col 9)-(line 4865,col 70)",
        "(line 4866,col 9)-(line 4866,col 68)",
        "(line 4867,col 9)-(line 4867,col 74)",
        "(line 4868,col 9)-(line 4868,col 72)",
        "(line 4869,col 9)-(line 4869,col 72)",
        "(line 4870,col 9)-(line 4870,col 70)",
        "(line 4871,col 9)-(line 4871,col 71)",
        "(line 4872,col 9)-(line 4872,col 69)",
        "(line 4873,col 9)-(line 4873,col 69)",
        "(line 4874,col 9)-(line 4874,col 68)",
        "(line 4875,col 9)-(line 4875,col 66)",
        "(line 4876,col 9)-(line 4878,col 9)",
        "(line 4879,col 9)-(line 4879,col 75)",
        "(line 4880,col 9)-(line 4880,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 4891,
      "end_line": 4949,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 4894,col 9)-(line 4894,col 35)",
        "(line 4895,col 9)-(line 4895,col 71)",
        "(line 4896,col 9)-(line 4896,col 69)",
        "(line 4897,col 9)-(line 4897,col 70)",
        "(line 4898,col 9)-(line 4898,col 68)",
        "(line 4899,col 9)-(line 4899,col 74)",
        "(line 4900,col 9)-(line 4900,col 72)",
        "(line 4901,col 9)-(line 4901,col 72)",
        "(line 4902,col 9)-(line 4902,col 70)",
        "(line 4903,col 9)-(line 4903,col 71)",
        "(line 4904,col 9)-(line 4904,col 69)",
        "(line 4905,col 9)-(line 4905,col 69)",
        "(line 4906,col 9)-(line 4906,col 68)",
        "(line 4907,col 9)-(line 4907,col 66)",
        "(line 4908,col 9)-(line 4908,col 42)",
        "(line 4909,col 9)-(line 4911,col 9)",
        "(line 4913,col 9)-(line 4913,col 75)",
        "(line 4914,col 9)-(line 4914,col 73)",
        "(line 4918,col 9)-(line 4918,col 53)",
        "(line 4919,col 9)-(line 4925,col 9)",
        "(line 4926,col 9)-(line 4926,col 51)",
        "(line 4927,col 9)-(line 4933,col 9)",
        "(line 4934,col 9)-(line 4934,col 48)",
        "(line 4935,col 9)-(line 4940,col 9)",
        "(line 4941,col 9)-(line 4941,col 50)",
        "(line 4942,col 9)-(line 4947,col 9)"
      ]
    }
  ]
}