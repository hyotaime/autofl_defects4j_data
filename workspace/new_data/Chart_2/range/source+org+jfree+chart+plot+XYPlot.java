{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/XYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Pannable",
        "org.jfree.chart.plot.Selectable",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 323,
      "end_line": 6028,
      "comment": "\r\n * A general class for plotting data in the form of (x, y) pairs.  This plot can\r\n * use data from any class that implements the {@link XYDataset} interface.\r\n * \u003cP\u003e\r\n * \u003ccode\u003eXYPlot\u003c/code\u003e makes use of an {@link XYItemRenderer} to draw each point\r\n * on the plot.  By using different renderers, various chart types can be\r\n * produced.\r\n * \u003cp\u003e\r\n * The {@link ChartFactory} class contains static methods for\r\n * creating pre-configured charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 331,
      "end_line": 333,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 342,
      "end_line": 343,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 349,
      "end_line": 351,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " The domain axis / axes (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " The domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " The range axis location. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxesMap"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": "\r\n     * Storage for the mapping between datasets/renderers and domain axes.  The\r\n     * keys in the map are Integer objects, corresponding to the dataset\r\n     * index.  The values in the map are List objects containing Integer\r\n     * objects (corresponding to the axis indices).  If the map contains no\r\n     * entry for a dataset, it is assumed to map to the primary domain axis\r\n     * (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxesMap"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": "\r\n     * Storage for the mapping between datasets/renderers and range axes.  The\r\n     * keys in the map are Integer objects, corresponding to the dataset\r\n     * index.  The values in the map are List objects containing Integer\r\n     * objects (corresponding to the axis indices).  If the map contains no\r\n     * entry for a dataset, it is assumed to map to the primary domain axis\r\n     * (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantOrigin"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The origin point for the quadrants (if drawn). "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantPaint"
      ],
      "begin_line": 401,
      "end_line": 402,
      "comment": " The paint used for each quadrant. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlinesVisible"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": "\r\n     * A flag that controls whether the domain minor grid-lines are visible.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlineStroke"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": "\r\n     * The stroke used to draw the domain minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlinePaint"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": "\r\n     * The paint used to draw the domain minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinesVisible"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": "\r\n     * A flag that controls whether the range minor grid-lines are visible.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlineStroke"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": "\r\n     * The stroke used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinePaint"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": "\r\n     * The paint used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineVisible"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the domain\r\n     * axis is visible.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineStroke"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\r\n     * The stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselinePaint"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": "\r\n     * The paint used for the zero baseline against the domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": " The stroke used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": " The paint used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": " A flag that controls whether or not a domain crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairValue"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": " The domain crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairLockedOnData"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": " A flag that controls whether or not a range crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 532,
      "end_line": 532,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": " A map of lists of foreground markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": " A map of lists of background markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": " A map of lists of foreground markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": " A map of lists of background markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": "\r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainTickBandPaint"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": " The paint used for the domain tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeTickBandPaint"
      ],
      "begin_line": 557,
      "end_line": 557,
      "comment": " The paint used for the range tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 560,
      "end_line": 560,
      "comment": " The fixed domain axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 563,
      "end_line": 563,
      "comment": " The fixed range axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetRenderingOrder"
      ],
      "begin_line": 569,
      "end_line": 570,
      "comment": "\r\n     * The order of the dataset rendering (REVERSE draws the primary dataset\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRenderingOrder"
      ],
      "begin_line": 576,
      "end_line": 577,
      "comment": "\r\n     * The order of the series rendering (REVERSE draws the primary series\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": "\r\n     * The weight for this plot (only relevant if this is a subplot in a\r\n     * combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainPannable"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the domain\r\n     * axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangePannable"
      ],
      "begin_line": 605,
      "end_line": 605,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the range\r\n     * axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shadowGenerator"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": "\r\n     * The shadow generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot()",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYPlot\u003c/code\u003e instance with no dataset, no axes and\r\n     * no renderer.  You should specify these items before using the plot.\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 633,
      "end_line": 727,
      "comment": "\r\n     * Creates a new plot with the specified dataset, axes and renderer.  Any\r\n     * of the arguments can be \u003ccode\u003enull\u003c/code\u003e, but in that case you should\r\n     * take care to specify the value before using the plot (otherwise a\r\n     * \u003ccode\u003eNullPointerException\u003c/code\u003e may be thrown).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 16)",
        "(line 640,col 9)-(line 640,col 52)",
        "(line 641,col 9)-(line 641,col 24)",
        "(line 642,col 9)-(line 642,col 66)",
        "(line 645,col 9)-(line 645,col 43)",
        "(line 646,col 9)-(line 646,col 52)",
        "(line 647,col 9)-(line 647,col 53)",
        "(line 648,col 9)-(line 648,col 53)",
        "(line 650,col 9)-(line 650,col 42)",
        "(line 651,col 9)-(line 651,col 51)",
        "(line 652,col 9)-(line 652,col 52)",
        "(line 653,col 9)-(line 653,col 52)",
        "(line 655,col 9)-(line 655,col 41)",
        "(line 656,col 9)-(line 656,col 42)",
        "(line 658,col 9)-(line 658,col 52)",
        "(line 659,col 9)-(line 659,col 51)",
        "(line 661,col 9)-(line 661,col 53)",
        "(line 663,col 9)-(line 663,col 38)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 40)",
        "(line 669,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 43)",
        "(line 675,col 9)-(line 675,col 42)",
        "(line 676,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 69)",
        "(line 682,col 9)-(line 682,col 41)",
        "(line 683,col 9)-(line 683,col 41)",
        "(line 684,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 68)",
        "(line 690,col 9)-(line 690,col 30)",
        "(line 691,col 9)-(line 691,col 29)",
        "(line 693,col 9)-(line 693,col 43)",
        "(line 694,col 9)-(line 694,col 60)",
        "(line 695,col 9)-(line 695,col 58)",
        "(line 697,col 9)-(line 697,col 49)",
        "(line 698,col 9)-(line 698,col 65)",
        "(line 699,col 9)-(line 699,col 52)",
        "(line 701,col 9)-(line 701,col 47)",
        "(line 702,col 9)-(line 702,col 51)",
        "(line 703,col 9)-(line 703,col 62)",
        "(line 705,col 9)-(line 705,col 42)",
        "(line 706,col 9)-(line 706,col 59)",
        "(line 707,col 9)-(line 707,col 57)",
        "(line 709,col 9)-(line 709,col 48)",
        "(line 710,col 9)-(line 710,col 64)",
        "(line 711,col 9)-(line 711,col 51)",
        "(line 713,col 9)-(line 713,col 46)",
        "(line 714,col 9)-(line 714,col 50)",
        "(line 715,col 9)-(line 715,col 61)",
        "(line 717,col 9)-(line 717,col 44)",
        "(line 718,col 9)-(line 718,col 40)",
        "(line 719,col 9)-(line 719,col 62)",
        "(line 720,col 9)-(line 720,col 60)",
        "(line 722,col 9)-(line 722,col 43)",
        "(line 723,col 9)-(line 723,col 39)",
        "(line 724,col 9)-(line 724,col 61)",
        "(line 725,col 9)-(line 725,col 59)",
        "(line 726,col 9)-(line 726,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getPlotType()",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getOrientation()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 757,
      "end_line": 765,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAxisOffset()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 786,
      "end_line": 792,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 33)",
        "(line 791,col 9)-(line 791,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis()",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\r\n     * Returns the domain axis with index 0.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s\r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #setDomainAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis(int)",
      "begin_line": 817,
      "end_line": 830,
      "comment": "\r\n     * Returns the domain axis with the specified index, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 32)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 841,
      "end_line": 843,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis()\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 869,
      "end_line": 885,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 50)",
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 41)",
        "(line 878,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 884,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 895,
      "end_line": 900,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\r\n     * Returns the location of the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 921,
      "end_line": 924,
      "comment": "\r\n     * Sets the location of the primary domain axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 935,
      "end_line": 938,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge()",
      "begin_line": 949,
      "end_line": 952,
      "comment": "\r\n     * Returns the edge for the primary domain axis (taking into account the\r\n     * plot\u0027s orientation).\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 951,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisCount()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     *\r\n     * @see #getRangeAxisCount()\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainAxes()",
      "begin_line": 971,
      "end_line": 980,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #clearRangeAxes()\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 32)",
        "(line 979,col 9)-(line 979,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureDomainAxes()",
      "begin_line": 985,
      "end_line": 992,
      "comment": "\r\n     * Configures the domain axes.\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 991,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation(int)",
      "begin_line": 1005,
      "end_line": 1014,
      "comment": "\r\n     * Returns the location for a domain axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary domain axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 35)",
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1026,
      "end_line": 1029,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for index\r\n     *     0).\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1045,
      "end_line": 1056,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for\r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1052,col 54)",
        "(line 1053,col 9)-(line 1055,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge(int)",
      "begin_line": 1067,
      "end_line": 1075,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getRangeAxisEdge(int)\r\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 61)",
        "(line 1069,col 9)-(line 1070,col 34)",
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis()",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s range\r\n     * axis (if there is a parent plot).\r\n     *\r\n     * @return The range axis.\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1100,
      "end_line": 1119,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1104,col 9)",
        "(line 1107,col 9)-(line 1107,col 44)",
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1112,col 9)-(line 1112,col 36)",
        "(line 1113,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1117,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation()",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\r\n     * Returns the location of the primary range axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1140,
      "end_line": 1143,
      "comment": "\r\n     * Sets the location of the primary range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1154,
      "end_line": 1157,
      "comment": "\r\n     * Sets the location of the primary range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge()",
      "begin_line": 1167,
      "end_line": 1170,
      "comment": "\r\n     * Returns the edge for the primary range axis.\r\n     *\r\n     * @return The range axis edge.\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1169,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis(int)",
      "begin_line": 1181,
      "end_line": 1194,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 32)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1193,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1205,
      "end_line": 1207,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1219,
      "end_line": 1235,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 49)",
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1227,col 40)",
        "(line 1228,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1245,
      "end_line": 1250,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setDomainAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1249,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisCount()",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     *\r\n     * @see #getDomainAxisCount()\r\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeAxes()",
      "begin_line": 1269,
      "end_line": 1278,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #clearDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 31)",
        "(line 1277,col 9)-(line 1277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureRangeAxes()",
      "begin_line": 1285,
      "end_line": 1292,
      "comment": "\r\n     * Configures the range axes.\r\n     *\r\n     * @see #configureDomainAxes()\r\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation(int)",
      "begin_line": 1305,
      "end_line": 1314,
      "comment": "\r\n     * Returns the location for a range axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary range axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 35)",
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1310,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1313,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1325,
      "end_line": 1328,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1344,
      "end_line": 1355,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for\r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1347,col 9)-(line 1350,col 9)",
        "(line 1351,col 9)-(line 1351,col 53)",
        "(line 1352,col 9)-(line 1354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge(int)",
      "begin_line": 1367,
      "end_line": 1375,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1368,col 60)",
        "(line 1369,col 9)-(line 1370,col 34)",
        "(line 1371,col 9)-(line 1373,col 9)",
        "(line 1374,col 9)-(line 1374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset()",
      "begin_line": 1385,
      "end_line": 1387,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDataset(int)\r\n     * @see #setDataset(XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1386,col 9)-(line 1386,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset(int)",
      "begin_line": 1398,
      "end_line": 1404,
      "comment": "\r\n     * Returns a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 32)",
        "(line 1400,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1415,
      "end_line": 1417,
      "comment": "\r\n     * Sets the primary dataset for the plot, replacing the existing dataset if\r\n     * there is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     * @see #setDataset(int, XYDataset)\r\n     ",
      "child_ranges": [
        "(line 1416,col 9)-(line 1416,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(int, org.jfree.data.xy.XYDataset)",
      "begin_line": 1427,
      "end_line": 1442,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1428,col 47)",
        "(line 1429,col 9)-(line 1431,col 9)",
        "(line 1432,col 9)-(line 1432,col 42)",
        "(line 1433,col 9)-(line 1435,col 9)",
        "(line 1438,col 9)-(line 1439,col 41)",
        "(line 1441,col 9)-(line 1441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetCount()",
      "begin_line": 1449,
      "end_line": 1451,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1450,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.indexOf(org.jfree.data.xy.XYDataset)",
      "begin_line": 1461,
      "end_line": 1470,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 24)",
        "(line 1463,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1469,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1481,
      "end_line": 1485,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1482,col 54)",
        "(line 1483,col 9)-(line 1483,col 48)",
        "(line 1484,col 9)-(line 1484,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes(int, java.util.List)",
      "begin_line": 1497,
      "end_line": 1508,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1498,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 38)",
        "(line 1502,col 9)-(line 1502,col 41)",
        "(line 1503,col 9)-(line 1503,col 73)",
        "(line 1505,col 9)-(line 1506,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1519,
      "end_line": 1523,
      "comment": "\r\n     * Maps a dataset to a particular range axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 54)",
        "(line 1521,col 9)-(line 1521,col 48)",
        "(line 1522,col 9)-(line 1522,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes(int, java.util.List)",
      "begin_line": 1535,
      "end_line": 1546,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1536,col 9)-(line 1538,col 9)",
        "(line 1539,col 9)-(line 1539,col 38)",
        "(line 1540,col 9)-(line 1540,col 41)",
        "(line 1541,col 9)-(line 1541,col 72)",
        "(line 1543,col 9)-(line 1544,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.checkAxisIndices(java.util.List)",
      "begin_line": 1555,
      "end_line": 1578,
      "comment": "\r\n     * This method is used to perform argument checking on the list of\r\n     * axis indices passed to mapDatasetToDomainAxes() and\r\n     * mapDatasetToRangeAxes().\r\n     *\r\n     * @param indices  the list of indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1559,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 35)",
        "(line 1563,col 9)-(line 1565,col 9)",
        "(line 1566,col 9)-(line 1566,col 36)",
        "(line 1567,col 9)-(line 1577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererCount()",
      "begin_line": 1587,
      "end_line": 1589,
      "comment": "\r\n     * Returns the number of renderer slots for this plot.\r\n     *\r\n     * @return The number of renderer slots.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer()",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\r\n     * Returns the renderer for the primary dataset.\r\n     *\r\n     * @return The item renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer(int)",
      "begin_line": 1611,
      "end_line": 1618,
      "comment": "\r\n     * Returns the renderer for a dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(int, XYItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1612,col 9)-(line 1612,col 37)",
        "(line 1613,col 9)-(line 1615,col 9)",
        "(line 1616,col 9)-(line 1616,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1629,
      "end_line": 1631,
      "comment": "\r\n     * Sets the renderer for the primary dataset and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If the renderer\r\n     * is set to \u003ccode\u003enull\u003c/code\u003e, no data will be displayed.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1630,col 9)-(line 1630,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1642,
      "end_line": 1644,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     *\r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1643,col 9)-(line 1643,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)",
      "begin_line": 1656,
      "end_line": 1672,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1658,col 9)-(line 1658,col 53)",
        "(line 1659,col 9)-(line 1661,col 9)",
        "(line 1662,col 9)-(line 1662,col 44)",
        "(line 1663,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1667,col 30)",
        "(line 1668,col 9)-(line 1668,col 29)",
        "(line 1669,col 9)-(line 1671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])",
      "begin_line": 1680,
      "end_line": 1685,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param renderers  the renderers (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1683,col 9)",
        "(line 1684,col 9)-(line 1684,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder()",
      "begin_line": 1694,
      "end_line": 1696,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1695,col 9)-(line 1695,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1708,
      "end_line": 1714,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1709,col 9)-(line 1711,col 9)",
        "(line 1712,col 9)-(line 1712,col 43)",
        "(line 1713,col 9)-(line 1713,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder()",
      "begin_line": 1723,
      "end_line": 1725,
      "comment": "\r\n     * Returns the series rendering order.\r\n     *\r\n     * @return the order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesRenderingOrder(SeriesRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1724,col 9)-(line 1724,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)",
      "begin_line": 1737,
      "end_line": 1743,
      "comment": "\r\n     * Sets the series order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary series\r\n     * last (so that the primary series appears to be on top).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSeriesRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1740,col 9)",
        "(line 1741,col 9)-(line 1741,col 42)",
        "(line 1742,col 9)-(line 1742,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1753,
      "end_line": 1755,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1754,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererForDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1766,
      "end_line": 1778,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  The code first\r\n     * determines the index of the dataset, then checks if there is a\r\n     * renderer with the same index (if not, the method returns renderer(0).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1767,col 9)-(line 1767,col 37)",
        "(line 1768,col 9)-(line 1776,col 9)",
        "(line 1777,col 9)-(line 1777,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getWeight()",
      "begin_line": 1788,
      "end_line": 1790,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     *\r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 1789,col 9)-(line 1789,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setWeight(int)",
      "begin_line": 1800,
      "end_line": 1803,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     *\r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 1801,col 9)-(line 1801,col 29)",
        "(line 1802,col 9)-(line 1802,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible()",
      "begin_line": 1813,
      "end_line": 1815,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1814,col 9)-(line 1814,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1828,
      "end_line": 1833,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1829,col 9)-(line 1832,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainMinorGridlinesVisible()",
      "begin_line": 1845,
      "end_line": 1847,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain minor gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1846,col 9)-(line 1846,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlinesVisible(boolean)",
      "begin_line": 1862,
      "end_line": 1867,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain minor grid-lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1866,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlineStroke()",
      "begin_line": 1877,
      "end_line": 1879,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1878,col 9)-(line 1878,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1892,
      "end_line": 1898,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1893,col 9)-(line 1895,col 9)",
        "(line 1896,col 9)-(line 1896,col 43)",
        "(line 1897,col 9)-(line 1897,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMinorGridlineStroke()",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "",
      "child_ranges": [
        "(line 1912,col 9)-(line 1912,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 1928,
      "end_line": 1934,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the domain\r\n     * axis, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1929,col 9)-(line 1931,col 9)",
        "(line 1932,col 9)-(line 1932,col 48)",
        "(line 1933,col 9)-(line 1933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlinePaint()",
      "begin_line": 1944,
      "end_line": 1946,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1945,col 9)-(line 1945,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1959,
      "end_line": 1965,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1962,col 9)",
        "(line 1963,col 9)-(line 1963,col 41)",
        "(line 1964,col 9)-(line 1964,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMinorGridlinePaint()",
      "begin_line": 1977,
      "end_line": 1979,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1978,col 9)-(line 1978,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 1994,
      "end_line": 2000,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1995,col 9)-(line 1997,col 9)",
        "(line 1998,col 9)-(line 1998,col 46)",
        "(line 1999,col 9)-(line 1999,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible()",
      "begin_line": 2010,
      "end_line": 2012,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2011,col 9)-(line 2011,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 2025,
      "end_line": 2030,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 2026,col 9)-(line 2029,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlineStroke()",
      "begin_line": 2040,
      "end_line": 2042,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 2041,col 9)-(line 2041,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 2052,
      "end_line": 2058,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 2053,col 9)-(line 2055,col 9)",
        "(line 2056,col 9)-(line 2056,col 42)",
        "(line 2057,col 9)-(line 2057,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlinePaint()",
      "begin_line": 2068,
      "end_line": 2070,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2069,col 9)-(line 2069,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 2080,
      "end_line": 2086,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 2081,col 9)-(line 2083,col 9)",
        "(line 2084,col 9)-(line 2084,col 40)",
        "(line 2085,col 9)-(line 2085,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeMinorGridlinesVisible()",
      "begin_line": 2098,
      "end_line": 2100,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis minor grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2099,col 9)-(line 2099,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlinesVisible(boolean)",
      "begin_line": 2115,
      "end_line": 2120,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis minor grid\r\n     * lines are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2116,col 9)-(line 2119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMinorGridlineStroke()",
      "begin_line": 2132,
      "end_line": 2134,
      "comment": "\r\n     * Returns the stroke for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2133,col 9)-(line 2133,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 2146,
      "end_line": 2152,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2147,col 9)-(line 2149,col 9)",
        "(line 2150,col 9)-(line 2150,col 47)",
        "(line 2151,col 9)-(line 2151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMinorGridlinePaint()",
      "begin_line": 2164,
      "end_line": 2166,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2165,col 9)-(line 2165,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 2178,
      "end_line": 2184,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the range axis\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 2179,col 9)-(line 2181,col 9)",
        "(line 2182,col 9)-(line 2182,col 45)",
        "(line 2183,col 9)-(line 2183,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible()",
      "begin_line": 2196,
      "end_line": 2198,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2197,col 9)-(line 2197,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible(boolean)",
      "begin_line": 2211,
      "end_line": 2214,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the domain axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #isDomainZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 2212,col 9)-(line 2212,col 49)",
        "(line 2213,col 9)-(line 2213,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke()",
      "begin_line": 2225,
      "end_line": 2227,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setDomainZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 2226,col 9)-(line 2226,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 2239,
      "end_line": 2245,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 2240,col 9)-(line 2242,col 9)",
        "(line 2243,col 9)-(line 2243,col 47)",
        "(line 2244,col 9)-(line 2244,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint()",
      "begin_line": 2257,
      "end_line": 2259,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2258,col 9)-(line 2258,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 2271,
      "end_line": 2277,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 2272,col 9)-(line 2274,col 9)",
        "(line 2275,col 9)-(line 2275,col 45)",
        "(line 2276,col 9)-(line 2276,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible()",
      "begin_line": 2287,
      "end_line": 2289,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2288,col 9)-(line 2288,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 2300,
      "end_line": 2303,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isRangeZeroBaselineVisible()\r\n     ",
      "child_ranges": [
        "(line 2301,col 9)-(line 2301,col 48)",
        "(line 2302,col 9)-(line 2302,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke()",
      "begin_line": 2312,
      "end_line": 2314,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 2313,col 9)-(line 2313,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 2324,
      "end_line": 2330,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     ",
      "child_ranges": [
        "(line 2325,col 9)-(line 2327,col 9)",
        "(line 2328,col 9)-(line 2328,col 46)",
        "(line 2329,col 9)-(line 2329,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint()",
      "begin_line": 2340,
      "end_line": 2342,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 2352,
      "end_line": 2358,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselinePaint()\r\n     ",
      "child_ranges": [
        "(line 2353,col 9)-(line 2355,col 9)",
        "(line 2356,col 9)-(line 2356,col 44)",
        "(line 2357,col 9)-(line 2357,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainTickBandPaint()",
      "begin_line": 2368,
      "end_line": 2370,
      "comment": "\r\n     * Returns the paint used for the domain tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2369,col 9)-(line 2369,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(java.awt.Paint)",
      "begin_line": 2379,
      "end_line": 2382,
      "comment": "\r\n     * Sets the paint for the domain tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 2380,col 9)-(line 2380,col 41)",
        "(line 2381,col 9)-(line 2381,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeTickBandPaint()",
      "begin_line": 2392,
      "end_line": 2394,
      "comment": "\r\n     * Returns the paint used for the range tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2393,col 9)-(line 2393,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeTickBandPaint(java.awt.Paint)",
      "begin_line": 2403,
      "end_line": 2406,
      "comment": "\r\n     * Sets the paint for the range tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeTickBandPaint()\r\n     ",
      "child_ranges": [
        "(line 2404,col 9)-(line 2404,col 40)",
        "(line 2405,col 9)-(line 2405,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantOrigin()",
      "begin_line": 2416,
      "end_line": 2418,
      "comment": "\r\n     * Returns the origin for the quadrants that can be displayed on the plot.\r\n     * This defaults to (0, 0).\r\n     *\r\n     * @return The origin point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setQuadrantOrigin(Point2D)\r\n     ",
      "child_ranges": [
        "(line 2417,col 9)-(line 2417,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantOrigin(java.awt.geom.Point2D)",
      "begin_line": 2428,
      "end_line": 2434,
      "comment": "\r\n     * Sets the quadrant origin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param origin  the origin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getQuadrantOrigin()\r\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2431,col 9)",
        "(line 2432,col 9)-(line 2432,col 37)",
        "(line 2433,col 9)-(line 2433,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantPaint(int)",
      "begin_line": 2445,
      "end_line": 2451,
      "comment": "\r\n     * Returns the paint used for the specified quadrant.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 2446,col 9)-(line 2449,col 9)",
        "(line 2450,col 9)-(line 2450,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantPaint(int, java.awt.Paint)",
      "begin_line": 2462,
      "end_line": 2469,
      "comment": "\r\n     * Sets the paint used for the specified quadrant and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getQuadrantPaint(int)\r\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2466,col 9)",
        "(line 2467,col 9)-(line 2467,col 42)",
        "(line 2468,col 9)-(line 2468,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2483,
      "end_line": 2486,
      "comment": "\r\n     * Adds a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addDomainMarker(Marker, Layer)\r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2485,col 9)-(line 2485,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2500,
      "end_line": 2502,
      "comment": "\r\n     * Adds a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2501,col 9)-(line 2501,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers()",
      "begin_line": 2510,
      "end_line": 2530,
      "comment": "\r\n     * Clears all the (foreground and background) domain markers and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2511,col 9)-(line 2519,col 9)",
        "(line 2520,col 9)-(line 2528,col 9)",
        "(line 2529,col 9)-(line 2529,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers(int)",
      "begin_line": 2540,
      "end_line": 2567,
      "comment": "\r\n     * Clears the (foreground and background) domain markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2541,col 9)-(line 2541,col 41)",
        "(line 2542,col 9)-(line 2553,col 9)",
        "(line 2554,col 9)-(line 2565,col 9)",
        "(line 2566,col 9)-(line 2566,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2584,
      "end_line": 2586,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #clearDomainMarkers(int)\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2585,col 9)-(line 2585,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2603,
      "end_line": 2634,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2605,col 9)-(line 2607,col 9)",
        "(line 2608,col 9)-(line 2610,col 9)",
        "(line 2611,col 9)-(line 2611,col 27)",
        "(line 2612,col 9)-(line 2629,col 9)",
        "(line 2630,col 9)-(line 2630,col 39)",
        "(line 2631,col 9)-(line 2633,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2647,
      "end_line": 2649,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2648,col 9)-(line 2648,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2663,
      "end_line": 2665,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2664,col 9)-(line 2664,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2680,
      "end_line": 2682,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2681,col 9)-(line 2681,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2698,
      "end_line": 2717,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2700,col 9)-(line 2700,col 26)",
        "(line 2701,col 9)-(line 2708,col 9)",
        "(line 2709,col 9)-(line 2711,col 9)",
        "(line 2712,col 9)-(line 2712,col 49)",
        "(line 2713,col 9)-(line 2715,col 9)",
        "(line 2716,col 9)-(line 2716,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2730,
      "end_line": 2732,
      "comment": "\r\n     * Adds a marker for the range axis and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2731,col 9)-(line 2731,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2746,
      "end_line": 2748,
      "comment": "\r\n     * Adds a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2747,col 9)-(line 2747,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers()",
      "begin_line": 2756,
      "end_line": 2776,
      "comment": "\r\n     * Clears all the range markers and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2757,col 9)-(line 2765,col 9)",
        "(line 2766,col 9)-(line 2774,col 9)",
        "(line 2775,col 9)-(line 2775,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2792,
      "end_line": 2794,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2793,col 9)-(line 2793,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2810,
      "end_line": 2835,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2812,col 9)-(line 2812,col 27)",
        "(line 2813,col 9)-(line 2830,col 9)",
        "(line 2831,col 9)-(line 2831,col 39)",
        "(line 2832,col 9)-(line 2834,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers(int)",
      "begin_line": 2843,
      "end_line": 2870,
      "comment": "\r\n     * Clears the (foreground and background) range markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     ",
      "child_ranges": [
        "(line 2844,col 9)-(line 2844,col 41)",
        "(line 2845,col 9)-(line 2856,col 9)",
        "(line 2857,col 9)-(line 2868,col 9)",
        "(line 2869,col 9)-(line 2869,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2883,
      "end_line": 2885,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2884,col 9)-(line 2884,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2899,
      "end_line": 2901,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2900,col 9)-(line 2900,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2916,
      "end_line": 2918,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2917,col 9)-(line 2917,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2934,
      "end_line": 2956,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2936,col 9)-(line 2938,col 9)",
        "(line 2939,col 9)-(line 2939,col 26)",
        "(line 2940,col 9)-(line 2947,col 9)",
        "(line 2948,col 9)-(line 2950,col 9)",
        "(line 2951,col 9)-(line 2951,col 49)",
        "(line 2952,col 9)-(line 2954,col 9)",
        "(line 2955,col 9)-(line 2955,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2967,
      "end_line": 2969,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAnnotations()\r\n     * @see #removeAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2968,col 9)-(line 2968,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2980,
      "end_line": 2989,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2981,col 9)-(line 2983,col 9)",
        "(line 2984,col 9)-(line 2984,col 41)",
        "(line 2985,col 9)-(line 2985,col 43)",
        "(line 2986,col 9)-(line 2988,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 3002,
      "end_line": 3004,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     * @see #getAnnotations()\r\n     ",
      "child_ranges": [
        "(line 3003,col 9)-(line 3003,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 3017,
      "end_line": 3027,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 3018,col 9)-(line 3020,col 9)",
        "(line 3021,col 9)-(line 3021,col 62)",
        "(line 3022,col 9)-(line 3022,col 46)",
        "(line 3023,col 9)-(line 3025,col 9)",
        "(line 3026,col 9)-(line 3026,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAnnotations()",
      "begin_line": 3038,
      "end_line": 3040,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations.\r\n     *\r\n     * @since 1.0.1\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3039,col 9)-(line 3039,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearAnnotations()",
      "begin_line": 3048,
      "end_line": 3055,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3049,col 9)-(line 3052,col 9)",
        "(line 3053,col 9)-(line 3053,col 33)",
        "(line 3054,col 9)-(line 3054,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getShadowGenerator()",
      "begin_line": 3064,
      "end_line": 3066,
      "comment": "\r\n     * Returns the shadow generator for the plot, if any.\r\n     *\r\n     * @return The shadow generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 3065,col 9)-(line 3065,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setShadowGenerator(org.jfree.chart.util.ShadowGenerator)",
      "begin_line": 3079,
      "end_line": 3082,
      "comment": "\r\n     * Sets the shadow generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Note that this is\r\n     * a btmap drop-shadow generation facility and is separate from the\r\n     * vector based show option that is controlled via the\r\n     * {@link setShadowPaint()} method.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 3080,col 9)-(line 3080,col 41)",
        "(line 3081,col 9)-(line 3081,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3092,
      "end_line": 3099,
      "comment": "\r\n     * Calculates the space required for all the axes in the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3094,col 9)-(line 3094,col 42)",
        "(line 3095,col 9)-(line 3095,col 61)",
        "(line 3096,col 9)-(line 3096,col 63)",
        "(line 3097,col 9)-(line 3097,col 65)",
        "(line 3098,col 9)-(line 3098,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3110,
      "end_line": 3146,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3114,col 9)-(line 3116,col 9)",
        "(line 3119,col 9)-(line 3142,col 9)",
        "(line 3144,col 9)-(line 3144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3157,
      "end_line": 3192,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3161,col 9)-(line 3163,col 9)",
        "(line 3166,col 9)-(line 3189,col 9)",
        "(line 3190,col 9)-(line 3190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.integerise(java.awt.geom.Rectangle2D)",
      "begin_line": 3201,
      "end_line": 3207,
      "comment": "\r\n     * Trims a rectangle to integer coordinates.\r\n     *\r\n     * @param rect  the incoming rectangle.\r\n     *\r\n     * @return A rectangle with integer coordinates.\r\n     ",
      "child_ranges": [
        "(line 3202,col 9)-(line 3202,col 49)",
        "(line 3203,col 9)-(line 3203,col 49)",
        "(line 3204,col 9)-(line 3204,col 50)",
        "(line 3205,col 9)-(line 3205,col 50)",
        "(line 3206,col 9)-(line 3206,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3221,
      "end_line": 3503,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 3225,col 9)-(line 3225,col 64)",
        "(line 3226,col 9)-(line 3226,col 66)",
        "(line 3227,col 9)-(line 3229,col 9)",
        "(line 3232,col 9)-(line 3234,col 9)",
        "(line 3237,col 9)-(line 3237,col 45)",
        "(line 3238,col 9)-(line 3238,col 26)",
        "(line 3240,col 9)-(line 3240,col 55)",
        "(line 3241,col 9)-(line 3241,col 56)",
        "(line 3242,col 9)-(line 3242,col 39)",
        "(line 3244,col 9)-(line 3244,col 40)",
        "(line 3245,col 9)-(line 3247,col 9)",
        "(line 3248,col 9)-(line 3248,col 77)",
        "(line 3249,col 9)-(line 3251,col 9)",
        "(line 3254,col 9)-(line 3254,col 37)",
        "(line 3255,col 9)-(line 3255,col 62)",
        "(line 3257,col 9)-(line 3257,col 50)",
        "(line 3261,col 9)-(line 3263,col 9)",
        "(line 3264,col 9)-(line 3264,col 61)",
        "(line 3265,col 9)-(line 3265,col 70)",
        "(line 3266,col 9)-(line 3266,col 41)",
        "(line 3268,col 9)-(line 3268,col 46)",
        "(line 3269,col 9)-(line 3269,col 46)",
        "(line 3270,col 9)-(line 3297,col 9)",
        "(line 3298,col 9)-(line 3298,col 64)",
        "(line 3299,col 9)-(line 3299,col 63)",
        "(line 3300,col 9)-(line 3300,col 42)",
        "(line 3301,col 9)-(line 3301,col 56)",
        "(line 3303,col 9)-(line 3303,col 26)",
        "(line 3304,col 9)-(line 3305,col 39)",
        "(line 3307,col 9)-(line 3308,col 33)",
        "(line 3309,col 9)-(line 3314,col 9)",
        "(line 3316,col 9)-(line 3316,col 80)",
        "(line 3317,col 9)-(line 3322,col 9)",
        "(line 3323,col 9)-(line 3325,col 9)",
        "(line 3326,col 9)-(line 3328,col 9)",
        "(line 3329,col 9)-(line 3332,col 9)",
        "(line 3333,col 9)-(line 3336,col 9)",
        "(line 3338,col 9)-(line 3338,col 32)",
        "(line 3339,col 9)-(line 3339,col 45)",
        "(line 3340,col 9)-(line 3340,col 39)",
        "(line 3341,col 9)-(line 3348,col 9)",
        "(line 3351,col 9)-(line 3353,col 9)",
        "(line 3354,col 9)-(line 3356,col 9)",
        "(line 3359,col 9)-(line 3359,col 34)",
        "(line 3360,col 9)-(line 3360,col 65)",
        "(line 3361,col 9)-(line 3429,col 9)",
        "(line 3432,col 9)-(line 3432,col 61)",
        "(line 3433,col 9)-(line 3433,col 52)",
        "(line 3434,col 9)-(line 3434,col 64)",
        "(line 3435,col 9)-(line 3444,col 9)",
        "(line 3445,col 9)-(line 3445,col 71)",
        "(line 3446,col 9)-(line 3451,col 9)",
        "(line 3454,col 9)-(line 3454,col 60)",
        "(line 3455,col 9)-(line 3455,col 51)",
        "(line 3456,col 9)-(line 3456,col 63)",
        "(line 3457,col 9)-(line 3465,col 9)",
        "(line 3466,col 9)-(line 3466,col 70)",
        "(line 3467,col 9)-(line 3472,col 9)",
        "(line 3474,col 9)-(line 3476,col 9)",
        "(line 3478,col 9)-(line 3480,col 9)",
        "(line 3481,col 9)-(line 3483,col 9)",
        "(line 3485,col 9)-(line 3485,col 44)",
        "(line 3486,col 9)-(line 3497,col 9)",
        "(line 3498,col 9)-(line 3498,col 33)",
        "(line 3499,col 9)-(line 3499,col 43)",
        "(line 3501,col 9)-(line 3501,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3511,
      "end_line": 3515,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 3512,col 9)-(line 3512,col 51)",
        "(line 3513,col 9)-(line 3513,col 32)",
        "(line 3514,col 9)-(line 3514,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3526,
      "end_line": 3631,
      "comment": "\r\n     * Draws the quadrants.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #setQuadrantOrigin(Point2D)\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 3530,col 9)-(line 3530,col 40)",
        "(line 3532,col 9)-(line 3532,col 42)",
        "(line 3533,col 9)-(line 3535,col 9)",
        "(line 3536,col 9)-(line 3536,col 74)",
        "(line 3537,col 9)-(line 3537,col 70)",
        "(line 3539,col 9)-(line 3539,col 41)",
        "(line 3540,col 9)-(line 3542,col 9)",
        "(line 3543,col 9)-(line 3543,col 74)",
        "(line 3544,col 9)-(line 3544,col 69)",
        "(line 3546,col 9)-(line 3546,col 44)",
        "(line 3547,col 9)-(line 3547,col 76)",
        "(line 3549,col 9)-(line 3549,col 44)",
        "(line 3550,col 9)-(line 3550,col 76)",
        "(line 3552,col 9)-(line 3552,col 44)",
        "(line 3553,col 9)-(line 3553,col 75)",
        "(line 3555,col 9)-(line 3555,col 44)",
        "(line 3556,col 9)-(line 3556,col 75)",
        "(line 3558,col 9)-(line 3558,col 69)",
        "(line 3559,col 9)-(line 3573,col 9)",
        "(line 3574,col 9)-(line 3588,col 9)",
        "(line 3589,col 9)-(line 3603,col 9)",
        "(line 3604,col 9)-(line 3618,col 9)",
        "(line 3619,col 9)-(line 3630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3642,
      "end_line": 3666,
      "comment": "\r\n     * Draws the domain tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #setDomainTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3644,col 9)-(line 3644,col 51)",
        "(line 3645,col 9)-(line 3665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3677,
      "end_line": 3701,
      "comment": "\r\n     * Draws the range tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #setRangeTickBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 3679,col 9)-(line 3679,col 50)",
        "(line 3680,col 9)-(line 3700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3714,
      "end_line": 3788,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the state for each axis drawn.\r\n     ",
      "child_ranges": [
        "(line 3719,col 9)-(line 3719,col 61)",
        "(line 3722,col 9)-(line 3727,col 9)",
        "(line 3730,col 9)-(line 3735,col 9)",
        "(line 3737,col 9)-(line 3737,col 41)",
        "(line 3740,col 9)-(line 3741,col 38)",
        "(line 3742,col 9)-(line 3742,col 69)",
        "(line 3743,col 9)-(line 3749,col 9)",
        "(line 3752,col 9)-(line 3753,col 79)",
        "(line 3754,col 9)-(line 3754,col 63)",
        "(line 3755,col 9)-(line 3761,col 9)",
        "(line 3764,col 9)-(line 3765,col 76)",
        "(line 3766,col 9)-(line 3766,col 61)",
        "(line 3767,col 9)-(line 3773,col 9)",
        "(line 3776,col 9)-(line 3777,col 77)",
        "(line 3778,col 9)-(line 3778,col 62)",
        "(line 3779,col 9)-(line 3785,col 9)",
        "(line 3787,col 9)-(line 3787,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 3806,
      "end_line": 3899,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current renderer.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag that indicates whether any data was actually rendered.\r\n     ",
      "child_ranges": [
        "(line 3809,col 9)-(line 3809,col 34)",
        "(line 3810,col 9)-(line 3810,col 46)",
        "(line 3811,col 9)-(line 3897,col 9)",
        "(line 3898,col 9)-(line 3898,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(int)",
      "begin_line": 3908,
      "end_line": 3926,
      "comment": "\r\n     * Returns the domain axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3909,col 9)-(line 3909,col 68)",
        "(line 3910,col 9)-(line 3913,col 9)",
        "(line 3914,col 9)-(line 3914,col 35)",
        "(line 3915,col 9)-(line 3916,col 36)",
        "(line 3917,col 9)-(line 3924,col 9)",
        "(line 3925,col 9)-(line 3925,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(int)",
      "begin_line": 3935,
      "end_line": 3953,
      "comment": "\r\n     * Returns the range axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     ",
      "child_ranges": [
        "(line 3936,col 9)-(line 3936,col 68)",
        "(line 3937,col 9)-(line 3940,col 9)",
        "(line 3941,col 9)-(line 3941,col 35)",
        "(line 3942,col 9)-(line 3943,col 36)",
        "(line 3944,col 9)-(line 3951,col 9)",
        "(line 3952,col 9)-(line 3952,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3964,
      "end_line": 4001,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3968,col 9)-(line 3970,col 9)",
        "(line 3973,col 9)-(line 4000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 4013,
      "end_line": 4052,
      "comment": "\r\n     * Draws the gridlines for the plot\u0027s primary range axis, if they are\r\n     * visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 4017,col 9)-(line 4019,col 9)",
        "(line 4022,col 9)-(line 4051,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 4064,
      "end_line": 4071,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 4065,col 9)-(line 4070,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 4081,
      "end_line": 4086,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 4082,col 9)-(line 4085,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 4095,
      "end_line": 4107,
      "comment": "\r\n     * Draws the annotations for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 4099,col 9)-(line 4099,col 56)",
        "(line 4100,col 9)-(line 4105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4118,
      "end_line": 4140,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 4121,col 9)-(line 4121,col 46)",
        "(line 4122,col 9)-(line 4124,col 9)",
        "(line 4127,col 9)-(line 4129,col 9)",
        "(line 4130,col 9)-(line 4130,col 60)",
        "(line 4131,col 9)-(line 4131,col 56)",
        "(line 4132,col 9)-(line 4138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4151,
      "end_line": 4172,
      "comment": "\r\n     * Draws the range markers (if any) for a renderer and layer.  This method\r\n     * is typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     ",
      "child_ranges": [
        "(line 4154,col 9)-(line 4154,col 46)",
        "(line 4155,col 9)-(line 4157,col 9)",
        "(line 4160,col 9)-(line 4162,col 9)",
        "(line 4163,col 9)-(line 4163,col 59)",
        "(line 4164,col 9)-(line 4164,col 55)",
        "(line 4165,col 9)-(line 4171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 4183,
      "end_line": 4185,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     *\r\n     * @see #getRangeMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 4184,col 9)-(line 4184,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 4196,
      "end_line": 4198,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     *\r\n     * @see #getDomainMarkers(Layer)\r\n     ",
      "child_ranges": [
        "(line 4197,col 9)-(line 4197,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 4211,
      "end_line": 4224,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4212,col 9)-(line 4212,col 33)",
        "(line 4213,col 9)-(line 4213,col 41)",
        "(line 4214,col 9)-(line 4219,col 9)",
        "(line 4220,col 9)-(line 4222,col 9)",
        "(line 4223,col 9)-(line 4223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 4237,
      "end_line": 4250,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDomainMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4238,col 9)-(line 4238,col 33)",
        "(line 4239,col 9)-(line 4239,col 41)",
        "(line 4240,col 9)-(line 4245,col 9)",
        "(line 4246,col 9)-(line 4248,col 9)",
        "(line 4249,col 9)-(line 4249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4262,
      "end_line": 4279,
      "comment": "\r\n     * Utility method for drawing a horizontal line across the data area of the\r\n     * plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 4266,col 9)-(line 4266,col 40)",
        "(line 4267,col 9)-(line 4269,col 9)",
        "(line 4270,col 9)-(line 4277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4294,
      "end_line": 4317,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 4298,col 9)-(line 4315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4328,
      "end_line": 4345,
      "comment": "\r\n     * Utility method for drawing a vertical line on the data area of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     ",
      "child_ranges": [
        "(line 4331,col 9)-(line 4331,col 41)",
        "(line 4332,col 9)-(line 4334,col 9)",
        "(line 4335,col 9)-(line 4343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4360,
      "end_line": 4383,
      "comment": "\r\n     * Draws a range crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 4364,col 9)-(line 4381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 4392,
      "end_line": 4412,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  the x-coordinate, where the click occurred, in Java2D space.\r\n     * @param y  the y-coordinate, where the click occurred, in Java2D space.\r\n     * @param info  object containing information about the plot dimensions.\r\n     ",
      "child_ranges": [
        "(line 4394,col 9)-(line 4394,col 50)",
        "(line 4395,col 9)-(line 4411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(java.lang.Integer)",
      "begin_line": 4422,
      "end_line": 4442,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 4423,col 9)-(line 4425,col 9)",
        "(line 4426,col 9)-(line 4426,col 38)",
        "(line 4427,col 9)-(line 4440,col 9)",
        "(line 4441,col 9)-(line 4441,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(java.lang.Integer)",
      "begin_line": 4452,
      "end_line": 4472,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 4453,col 9)-(line 4455,col 9)",
        "(line 4456,col 9)-(line 4456,col 38)",
        "(line 4457,col 9)-(line 4470,col 9)",
        "(line 4471,col 9)-(line 4471,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4483,
      "end_line": 4494,
      "comment": "\r\n     * Returns the index of the given domain axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 4484,col 9)-(line 4484,col 51)",
        "(line 4485,col 9)-(line 4492,col 9)",
        "(line 4493,col 9)-(line 4493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4505,
      "end_line": 4516,
      "comment": "\r\n     * Returns the index of the given range axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getDomainAxisIndex(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 4506,col 9)-(line 4506,col 50)",
        "(line 4507,col 9)-(line 4514,col 9)",
        "(line 4515,col 9)-(line 4515,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4525,
      "end_line": 4621,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 4527,col 9)-(line 4527,col 28)",
        "(line 4528,col 9)-(line 4528,col 46)",
        "(line 4529,col 9)-(line 4529,col 51)",
        "(line 4530,col 9)-(line 4530,col 36)",
        "(line 4533,col 9)-(line 4533,col 51)",
        "(line 4534,col 9)-(line 4548,col 9)",
        "(line 4551,col 9)-(line 4551,col 49)",
        "(line 4552,col 9)-(line 4565,col 9)",
        "(line 4569,col 9)-(line 4569,col 54)",
        "(line 4570,col 9)-(line 4604,col 9)",
        "(line 4606,col 9)-(line 4606,col 53)",
        "(line 4607,col 9)-(line 4617,col 9)",
        "(line 4619,col 9)-(line 4619,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.annotationChanged(org.jfree.chart.event.AnnotationChangeEvent)",
      "begin_line": 4631,
      "end_line": 4639,
      "comment": "\r\n     * Receives notification of a change to an {@link Annotation} added to\r\n     * this plot.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 4632,col 9)-(line 4638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 4648,
      "end_line": 4659,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 4649,col 9)-(line 4649,col 30)",
        "(line 4650,col 9)-(line 4650,col 29)",
        "(line 4651,col 9)-(line 4658,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 4666,
      "end_line": 4674,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 4669,col 9)-(line 4672,col 9)",
        "(line 4673,col 9)-(line 4673,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible()",
      "begin_line": 4683,
      "end_line": 4685,
      "comment": "\r\n     * Returns a flag indicating whether or not the domain crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 4684,col 9)-(line 4684,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 4696,
      "end_line": 4701,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair is visible\r\n     * and, if the flag changes, sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4697,col 9)-(line 4700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData()",
      "begin_line": 4711,
      "end_line": 4713,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 4712,col 9)-(line 4712,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData(boolean)",
      "begin_line": 4724,
      "end_line": 4729,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this\r\n     * method sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isDomainCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 4725,col 9)-(line 4728,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairValue()",
      "begin_line": 4738,
      "end_line": 4740,
      "comment": "\r\n     * Returns the domain crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setDomainCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4739,col 9)-(line 4739,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double)",
      "begin_line": 4750,
      "end_line": 4752,
      "comment": "\r\n     * Sets the domain crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners (provided that the domain crosshair is visible).\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4751,col 9)-(line 4751,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double, boolean)",
      "begin_line": 4764,
      "end_line": 4769,
      "comment": "\r\n     * Sets the domain crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (provided that the\r\n     * domain crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4765,col 9)-(line 4765,col 42)",
        "(line 4766,col 9)-(line 4768,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke()",
      "begin_line": 4780,
      "end_line": 4782,
      "comment": "\r\n     * Returns the {@link Stroke} used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4781,col 9)-(line 4781,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4793,
      "end_line": 4799,
      "comment": "\r\n     * Sets the Stroke used to draw the crosshairs (if visible) and notifies\r\n     * registered listeners that the axis has been modified.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4794,col 9)-(line 4796,col 9)",
        "(line 4797,col 9)-(line 4797,col 44)",
        "(line 4798,col 9)-(line 4798,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint()",
      "begin_line": 4810,
      "end_line": 4812,
      "comment": "\r\n     * Returns the domain crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4811,col 9)-(line 4811,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 4822,
      "end_line": 4828,
      "comment": "\r\n     * Sets the paint used to draw the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4823,col 9)-(line 4825,col 9)",
        "(line 4826,col 9)-(line 4826,col 42)",
        "(line 4827,col 9)-(line 4827,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible()",
      "begin_line": 4838,
      "end_line": 4840,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     * @see #isDomainCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4839,col 9)-(line 4839,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 4851,
      "end_line": 4856,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     * If the flag value changes, this method sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 4852,col 9)-(line 4855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 4866,
      "end_line": 4868,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 4867,col 9)-(line 4867,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 4879,
      "end_line": 4884,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this method\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 4880,col 9)-(line 4883,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairValue()",
      "begin_line": 4893,
      "end_line": 4895,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 4894,col 9)-(line 4894,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double)",
      "begin_line": 4907,
      "end_line": 4909,
      "comment": "\r\n     * Sets the range crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4908,col 9)-(line 4908,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 4921,
      "end_line": 4926,
      "comment": "\r\n     * Sets the range crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners, but only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 4922,col 9)-(line 4922,col 41)",
        "(line 4923,col 9)-(line 4925,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke()",
      "begin_line": 4937,
      "end_line": 4939,
      "comment": "\r\n     * Returns the stroke used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4938,col 9)-(line 4938,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4950,
      "end_line": 4956,
      "comment": "\r\n     * Sets the stroke used to draw the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4951,col 9)-(line 4953,col 9)",
        "(line 4954,col 9)-(line 4954,col 43)",
        "(line 4955,col 9)-(line 4955,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint()",
      "begin_line": 4967,
      "end_line": 4969,
      "comment": "\r\n     * Returns the range crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 4968,col 9)-(line 4968,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 4979,
      "end_line": 4985,
      "comment": "\r\n     * Sets the paint used to color the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 4980,col 9)-(line 4982,col 9)",
        "(line 4983,col 9)-(line 4983,col 41)",
        "(line 4984,col 9)-(line 4984,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace()",
      "begin_line": 4994,
      "end_line": 4996,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4995,col 9)-(line 4995,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 5006,
      "end_line": 5008,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 5007,col 9)-(line 5007,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 5021,
      "end_line": 5026,
      "comment": "\r\n     * Sets the fixed domain axis space and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 5022,col 9)-(line 5022,col 42)",
        "(line 5023,col 9)-(line 5025,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace()",
      "begin_line": 5035,
      "end_line": 5037,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 5036,col 9)-(line 5036,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 5047,
      "end_line": 5049,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 5048,col 9)-(line 5048,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 5062,
      "end_line": 5067,
      "comment": "\r\n     * Sets the fixed range axis space and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 5063,col 9)-(line 5063,col 41)",
        "(line 5064,col 9)-(line 5066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainPannable()",
      "begin_line": 5077,
      "end_line": 5079,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the domain axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5078,col 9)-(line 5078,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainPannable(boolean)",
      "begin_line": 5089,
      "end_line": 5091,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along the\r\n     * domain axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5090,col 9)-(line 5090,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangePannable()",
      "begin_line": 5101,
      "end_line": 5103,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the range axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5102,col 9)-(line 5102,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangePannable(boolean)",
      "begin_line": 5113,
      "end_line": 5115,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along\r\n     * the range axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5114,col 9)-(line 5114,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5126,
      "end_line": 5142,
      "comment": "\r\n     * Pans the domain axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5128,col 9)-(line 5130,col 9)",
        "(line 5131,col 9)-(line 5131,col 51)",
        "(line 5132,col 9)-(line 5141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5153,
      "end_line": 5169,
      "comment": "\r\n     * Pans the range axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 5155,col 9)-(line 5157,col 9)",
        "(line 5158,col 9)-(line 5158,col 49)",
        "(line 5159,col 9)-(line 5168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5180,
      "end_line": 5184,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 5183,col 9)-(line 5183,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 5198,
      "end_line": 5221,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 5202,col 9)-(line 5220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5237,
      "end_line": 5245,
      "comment": "\r\n     * Zooms in on the domain axis/axes.  The new lower and upper bounds are\r\n     * specified as percentages of the current axis range, where 0 percent is\r\n     * the current lower bound and 100 percent is the current upper bound.\r\n     *\r\n     * @param lowerPercent  a percentage that determines the new lower bound\r\n     *                      for the axis (e.g. 0.20 is twenty percent).\r\n     * @param upperPercent  a percentage that determines the new upper bound\r\n     *                      for the axis (e.g. 0.80 is eighty percent).\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (ignored).\r\n     *\r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 5239,col 9)-(line 5244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5256,
      "end_line": 5260,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     ",
      "child_ranges": [
        "(line 5259,col 9)-(line 5259,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 5275,
      "end_line": 5298,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 5279,col 9)-(line 5297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5310,
      "end_line": 5318,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     *\r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     ",
      "child_ranges": [
        "(line 5312,col 9)-(line 5317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZoomable()",
      "begin_line": 5328,
      "end_line": 5330,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the domain axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 5329,col 9)-(line 5329,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZoomable()",
      "begin_line": 5340,
      "end_line": 5342,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the range axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 5341,col 9)-(line 5341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesCount()",
      "begin_line": 5350,
      "end_line": 5357,
      "comment": "\r\n     * Returns the number of series in the primary dataset for this plot.  If\r\n     * the dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 5351,col 9)-(line 5351,col 23)",
        "(line 5352,col 9)-(line 5352,col 41)",
        "(line 5353,col 9)-(line 5355,col 9)",
        "(line 5356,col 9)-(line 5356,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedLegendItems()",
      "begin_line": 5366,
      "end_line": 5368,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 5367,col 9)-(line 5367,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 5379,
      "end_line": 5382,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 5380,col 9)-(line 5380,col 38)",
        "(line 5381,col 9)-(line 5381,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getLegendItems()",
      "begin_line": 5391,
      "end_line": 5420,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s renderer, since the renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 5392,col 9)-(line 5394,col 9)",
        "(line 5395,col 9)-(line 5395,col 65)",
        "(line 5396,col 9)-(line 5396,col 41)",
        "(line 5397,col 9)-(line 5418,col 9)",
        "(line 5419,col 9)-(line 5419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.equals(java.lang.Object)",
      "begin_line": 5429,
      "end_line": 5634,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 5430,col 9)-(line 5432,col 9)",
        "(line 5433,col 9)-(line 5435,col 9)",
        "(line 5436,col 9)-(line 5436,col 35)",
        "(line 5437,col 9)-(line 5439,col 9)",
        "(line 5440,col 9)-(line 5442,col 9)",
        "(line 5443,col 9)-(line 5445,col 9)",
        "(line 5446,col 9)-(line 5448,col 9)",
        "(line 5449,col 9)-(line 5452,col 9)",
        "(line 5453,col 9)-(line 5455,col 9)",
        "(line 5456,col 9)-(line 5458,col 9)",
        "(line 5459,col 9)-(line 5462,col 9)",
        "(line 5463,col 9)-(line 5466,col 9)",
        "(line 5467,col 9)-(line 5469,col 9)",
        "(line 5470,col 9)-(line 5472,col 9)",
        "(line 5473,col 9)-(line 5475,col 9)",
        "(line 5476,col 9)-(line 5478,col 9)",
        "(line 5479,col 9)-(line 5482,col 9)",
        "(line 5483,col 9)-(line 5485,col 9)",
        "(line 5486,col 9)-(line 5488,col 9)",
        "(line 5489,col 9)-(line 5491,col 9)",
        "(line 5492,col 9)-(line 5494,col 9)",
        "(line 5495,col 9)-(line 5497,col 9)",
        "(line 5498,col 9)-(line 5500,col 9)",
        "(line 5501,col 9)-(line 5504,col 9)",
        "(line 5505,col 9)-(line 5508,col 9)",
        "(line 5509,col 9)-(line 5512,col 9)",
        "(line 5513,col 9)-(line 5516,col 9)",
        "(line 5517,col 9)-(line 5520,col 9)",
        "(line 5521,col 9)-(line 5524,col 9)",
        "(line 5525,col 9)-(line 5528,col 9)",
        "(line 5529,col 9)-(line 5532,col 9)",
        "(line 5533,col 9)-(line 5536,col 9)",
        "(line 5537,col 9)-(line 5540,col 9)",
        "(line 5541,col 9)-(line 5544,col 9)",
        "(line 5545,col 9)-(line 5548,col 9)",
        "(line 5549,col 9)-(line 5552,col 9)",
        "(line 5553,col 9)-(line 5556,col 9)",
        "(line 5557,col 9)-(line 5560,col 9)",
        "(line 5561,col 9)-(line 5564,col 9)",
        "(line 5565,col 9)-(line 5568,col 9)",
        "(line 5569,col 9)-(line 5572,col 9)",
        "(line 5573,col 9)-(line 5576,col 9)",
        "(line 5577,col 9)-(line 5580,col 9)",
        "(line 5581,col 9)-(line 5584,col 9)",
        "(line 5585,col 9)-(line 5588,col 9)",
        "(line 5589,col 9)-(line 5592,col 9)",
        "(line 5593,col 9)-(line 5596,col 9)",
        "(line 5597,col 9)-(line 5600,col 9)",
        "(line 5601,col 9)-(line 5604,col 9)",
        "(line 5605,col 9)-(line 5607,col 9)",
        "(line 5608,col 9)-(line 5611,col 9)",
        "(line 5612,col 9)-(line 5615,col 9)",
        "(line 5616,col 9)-(line 5619,col 9)",
        "(line 5620,col 9)-(line 5622,col 9)",
        "(line 5623,col 9)-(line 5628,col 9)",
        "(line 5629,col 9)-(line 5632,col 9)",
        "(line 5633,col 9)-(line 5633,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clone()",
      "begin_line": 5644,
      "end_line": 5724,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 5646,col 9)-(line 5646,col 46)",
        "(line 5647,col 9)-(line 5647,col 79)",
        "(line 5648,col 9)-(line 5656,col 9)",
        "(line 5657,col 9)-(line 5658,col 49)",
        "(line 5660,col 9)-(line 5660,col 77)",
        "(line 5661,col 9)-(line 5669,col 9)",
        "(line 5670,col 9)-(line 5671,col 41)",
        "(line 5674,col 9)-(line 5674,col 75)",
        "(line 5675,col 9)-(line 5680,col 9)",
        "(line 5682,col 9)-(line 5682,col 53)",
        "(line 5683,col 9)-(line 5683,col 73)",
        "(line 5684,col 9)-(line 5684,col 52)",
        "(line 5685,col 9)-(line 5685,col 71)",
        "(line 5687,col 9)-(line 5687,col 77)",
        "(line 5688,col 9)-(line 5697,col 9)",
        "(line 5698,col 9)-(line 5699,col 46)",
        "(line 5700,col 9)-(line 5701,col 46)",
        "(line 5702,col 9)-(line 5703,col 45)",
        "(line 5704,col 9)-(line 5705,col 45)",
        "(line 5706,col 9)-(line 5706,col 79)",
        "(line 5707,col 9)-(line 5710,col 9)",
        "(line 5711,col 9)-(line 5714,col 9)",
        "(line 5715,col 9)-(line 5718,col 9)",
        "(line 5719,col 9)-(line 5720,col 37)",
        "(line 5721,col 9)-(line 5721,col 67)",
        "(line 5722,col 9)-(line 5722,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 5733,
      "end_line": 5757,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 5734,col 9)-(line 5734,col 36)",
        "(line 5735,col 9)-(line 5735,col 71)",
        "(line 5736,col 9)-(line 5736,col 69)",
        "(line 5737,col 9)-(line 5737,col 70)",
        "(line 5738,col 9)-(line 5738,col 68)",
        "(line 5739,col 9)-(line 5739,col 76)",
        "(line 5740,col 9)-(line 5740,col 74)",
        "(line 5741,col 9)-(line 5741,col 75)",
        "(line 5742,col 9)-(line 5742,col 73)",
        "(line 5743,col 9)-(line 5743,col 74)",
        "(line 5744,col 9)-(line 5744,col 72)",
        "(line 5745,col 9)-(line 5745,col 72)",
        "(line 5746,col 9)-(line 5746,col 70)",
        "(line 5747,col 9)-(line 5747,col 71)",
        "(line 5748,col 9)-(line 5748,col 69)",
        "(line 5749,col 9)-(line 5749,col 69)",
        "(line 5750,col 9)-(line 5750,col 68)",
        "(line 5751,col 9)-(line 5751,col 66)",
        "(line 5752,col 9)-(line 5754,col 9)",
        "(line 5755,col 9)-(line 5755,col 75)",
        "(line 5756,col 9)-(line 5756,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5767,
      "end_line": 5829,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 5770,col 9)-(line 5770,col 35)",
        "(line 5771,col 9)-(line 5771,col 71)",
        "(line 5772,col 9)-(line 5772,col 69)",
        "(line 5773,col 9)-(line 5773,col 70)",
        "(line 5774,col 9)-(line 5774,col 68)",
        "(line 5775,col 9)-(line 5775,col 76)",
        "(line 5776,col 9)-(line 5776,col 74)",
        "(line 5777,col 9)-(line 5777,col 75)",
        "(line 5778,col 9)-(line 5778,col 73)",
        "(line 5779,col 9)-(line 5779,col 74)",
        "(line 5780,col 9)-(line 5780,col 72)",
        "(line 5781,col 9)-(line 5781,col 72)",
        "(line 5782,col 9)-(line 5782,col 70)",
        "(line 5783,col 9)-(line 5783,col 71)",
        "(line 5784,col 9)-(line 5784,col 69)",
        "(line 5785,col 9)-(line 5785,col 69)",
        "(line 5786,col 9)-(line 5786,col 68)",
        "(line 5787,col 9)-(line 5787,col 66)",
        "(line 5788,col 9)-(line 5788,col 42)",
        "(line 5789,col 9)-(line 5791,col 9)",
        "(line 5793,col 9)-(line 5793,col 75)",
        "(line 5794,col 9)-(line 5794,col 73)",
        "(line 5798,col 9)-(line 5798,col 53)",
        "(line 5799,col 9)-(line 5805,col 9)",
        "(line 5806,col 9)-(line 5806,col 51)",
        "(line 5807,col 9)-(line 5813,col 9)",
        "(line 5814,col 9)-(line 5814,col 48)",
        "(line 5815,col 9)-(line 5820,col 9)",
        "(line 5821,col 9)-(line 5821,col 50)",
        "(line 5822,col 9)-(line 5827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.canSelectByPoint()",
      "begin_line": 5840,
      "end_line": 5842,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this plot does not support\r\n     * selection of data items at a point (only because it hasn\u0027t been\r\n     * implemented yet).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5841,col 9)-(line 5841,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.canSelectByRegion()",
      "begin_line": 5852,
      "end_line": 5854,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this plot supports selection\r\n     * of data items by region.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5853,col 9)-(line 5853,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.select(double, double, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5867,
      "end_line": 5899,
      "comment": "\r\n     * Selects a single point.\r\n     *\r\n     * @param xx  the x coordinate in Java 2D space.\r\n     * @param yy  the y coordinate in Java 2D space.\r\n     * @param dataArea  the data area.\r\n     * @param source  the rendering source (can be used to locate the\r\n     *         appropriate selection state).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5869,col 9)-(line 5869,col 48)",
        "(line 5870,col 9)-(line 5898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5910,
      "end_line": 5945,
      "comment": "\r\n     * Selects the data items within the specified region.\r\n     *\r\n     * @param region  the region (in Java2D coordinates).\r\n     * @param dataArea  the data area.\r\n     * @param source  the rendering source.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5915,col 9)-(line 5915,col 48)",
        "(line 5916,col 9)-(line 5944,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.findSelectionStateForDataset(org.jfree.data.xy.XYDataset, java.lang.Object)",
      "begin_line": 5957,
      "end_line": 5966,
      "comment": "\r\n     * Returns the selection state for the specified dataset.  This could be\r\n     * \u003ccode\u003enull\u003c/code\u003e if the dataset hasn\u0027t been set up to support\r\n     * selections.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param source  the selection source.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 5959,col 9)-(line 5963,col 9)",
        "(line 5964,col 9)-(line 5964,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.convertToDataSpace(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.data.xy.XYDataset)",
      "begin_line": 5978,
      "end_line": 6004,
      "comment": "\r\n     * Converts a path from Java2D space to data space.\r\n     *\r\n     * @param path  the path (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area.\r\n     * @param dataset  the dataset which can be used to find the appropriate\r\n     *         axes.\r\n     *\r\n     * @return A path in data space.\r\n     ",
      "child_ranges": [
        "(line 5980,col 9)-(line 5980,col 68)",
        "(line 5981,col 9)-(line 5981,col 44)",
        "(line 5982,col 9)-(line 5982,col 64)",
        "(line 5983,col 9)-(line 5983,col 63)",
        "(line 5984,col 9)-(line 5984,col 54)",
        "(line 5985,col 9)-(line 5985,col 53)",
        "(line 5986,col 9)-(line 5986,col 40)",
        "(line 5987,col 9)-(line 5987,col 59)",
        "(line 5988,col 9)-(line 6002,col 9)",
        "(line 6003,col 9)-(line 6003,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearSelection()",
      "begin_line": 6011,
      "end_line": 6026,
      "comment": "\r\n     * Clears the selection.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 6013,col 9)-(line 6013,col 48)",
        "(line 6014,col 9)-(line 6025,col 9)"
      ]
    }
  ]
}