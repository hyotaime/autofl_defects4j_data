{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/CategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Pannable",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 251,
      "end_line": 5110,
      "comment": "\r\n * A general plotting class that uses data from a {@link CategoryDataset} and\r\n * renders each data item using a {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_GRIDLINES_VISIBLE"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": "\r\n     * The default visibility of the grid lines plotted against the domain\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_GRIDLINES_VISIBLE"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\r\n     * The default visibility of the grid lines plotted against the range\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 271,
      "end_line": 273,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 279,
      "end_line": 280,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": "\r\n     * The default crosshair visibility.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 294,
      "end_line": 295,
      "comment": "\r\n     * The default crosshair stroke.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": "\r\n     * The default crosshair paint.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 305,
      "end_line": 307,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Storage for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Storage for the domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSharedDomainAxis"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": "\r\n     * A flag that controls whether or not the shared domain axis is drawn\r\n     * (only relevant when the plot is being used as a subplot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Storage for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Storage for the range axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxesMap"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Storage for keys that map datasets to domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxesMap"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Storage for keys that map datasets to range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingOrder"
      ],
      "begin_line": 346,
      "end_line": 347,
      "comment": " The dataset rendering order. "
    },
    {
      "type": "field",
      "varNames": [
        "columnRenderingOrder"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": "\r\n     * Controls the order in which the columns are traversed when rendering the\r\n     * data items.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowRenderingOrder"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": "\r\n     * Controls the order in which the rows are traversed when rendering the\r\n     * data items.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": "\r\n     * A flag that controls whether the grid-lines for the domain axis are\r\n     * visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePosition"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " The position of the domain gridlines relative to the category. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " The paint used to draw the domain  grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": "\r\n     * The stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": "\r\n     * The paint used for the zero baseline against the range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": "\r\n     * A flag that controls whether the grid-lines for the range axis are\r\n     * visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " The stroke used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " The paint used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinesVisible"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": "\r\n     * A flag that controls whether or not gridlines are shown for the minor\r\n     * tick values on the primary range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlineStroke"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": "\r\n     * The stroke used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinePaint"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": "\r\n     * The paint used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "anchorValue"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": " The anchor value. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairDatasetIndex"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": "\r\n     * The index for the dataset that the crosshairs are linked to (this\r\n     * determines which axes the crosshairs are plotted against).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": "\r\n     * A flag that controls the visibility of the domain crosshair.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairRowKey"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": "\r\n     * The row key for the crosshair point.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairColumnKey"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": "\r\n     * The column key for the crosshair point.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": "\r\n     * The stroke used to draw the domain crosshair if it is visible.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": "\r\n     * The paint used to draw the domain crosshair if it is visible.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": " A flag that controls whether or not a range crosshair is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 482,
      "end_line": 482,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": "\r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": "\r\n     * The weight for the plot (only relevant when the plot is used as a subplot\r\n     * within a combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": " The fixed space for the domain axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": " The fixed space for the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangePannable"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the\r\n     * range axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 557,
      "end_line": 648,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the item renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 16)",
        "(line 564,col 9)-(line 564,col 52)",
        "(line 567,col 9)-(line 567,col 43)",
        "(line 568,col 9)-(line 568,col 52)",
        "(line 569,col 9)-(line 569,col 42)",
        "(line 570,col 9)-(line 570,col 51)",
        "(line 572,col 9)-(line 572,col 52)",
        "(line 573,col 9)-(line 573,col 51)",
        "(line 575,col 9)-(line 575,col 42)",
        "(line 577,col 9)-(line 577,col 41)",
        "(line 578,col 9)-(line 578,col 38)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 66)",
        "(line 585,col 9)-(line 585,col 66)",
        "(line 586,col 9)-(line 586,col 62)",
        "(line 588,col 9)-(line 588,col 40)",
        "(line 589,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 43)",
        "(line 595,col 9)-(line 595,col 42)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 42)",
        "(line 602,col 9)-(line 602,col 41)",
        "(line 603,col 9)-(line 603,col 41)",
        "(line 604,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 30)",
        "(line 610,col 9)-(line 610,col 29)",
        "(line 612,col 9)-(line 612,col 71)",
        "(line 613,col 9)-(line 613,col 60)",
        "(line 614,col 9)-(line 614,col 60)",
        "(line 615,col 9)-(line 615,col 58)",
        "(line 617,col 9)-(line 617,col 46)",
        "(line 618,col 9)-(line 618,col 50)",
        "(line 619,col 9)-(line 619,col 61)",
        "(line 621,col 9)-(line 621,col 69)",
        "(line 622,col 9)-(line 622,col 59)",
        "(line 623,col 9)-(line 623,col 57)",
        "(line 625,col 9)-(line 625,col 48)",
        "(line 626,col 9)-(line 626,col 64)",
        "(line 627,col 9)-(line 627,col 51)",
        "(line 629,col 9)-(line 629,col 53)",
        "(line 630,col 9)-(line 630,col 53)",
        "(line 631,col 9)-(line 631,col 52)",
        "(line 632,col 9)-(line 632,col 52)",
        "(line 634,col 9)-(line 634,col 31)",
        "(line 636,col 9)-(line 636,col 44)",
        "(line 637,col 9)-(line 637,col 62)",
        "(line 638,col 9)-(line 638,col 60)",
        "(line 640,col 9)-(line 640,col 63)",
        "(line 641,col 9)-(line 641,col 39)",
        "(line 642,col 9)-(line 642,col 61)",
        "(line 643,col 9)-(line 643,col 59)",
        "(line 645,col 9)-(line 645,col 53)",
        "(line 647,col 9)-(line 647,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getPlotType()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type.\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getOrientation()",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation of the plot (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 678,
      "end_line": 684,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 39)",
        "(line 683,col 9)-(line 683,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAxisOffset()",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 705,
      "end_line": 711,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 33)",
        "(line 710,col 9)-(line 710,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\r\n     * Returns the domain axis for the plot.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s\r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setDomainAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis(int)",
      "begin_line": 735,
      "end_line": 748,
      "comment": "\r\n     * Returns a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setDomainAxis(int, CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 35)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 758,
      "end_line": 760,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)",
      "begin_line": 783,
      "end_line": 799,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 74)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 41)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxes(org.jfree.chart.axis.CategoryAxis[])",
      "begin_line": 809,
      "end_line": 814,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 829,
      "end_line": 834,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation()",
      "begin_line": 843,
      "end_line": 845,
      "comment": "\r\n     * Returns the domain axis location for the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(int)",
      "begin_line": 856,
      "end_line": 865,
      "comment": "\r\n     * Returns the location for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     *\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 35)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 876,
      "end_line": 879,
      "comment": "\r\n     * Sets the location of the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 888,
      "end_line": 891,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether listeners are notified.\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 903,
      "end_line": 906,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 921,
      "end_line": 931,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 54)",
        "(line 928,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge()",
      "begin_line": 939,
      "end_line": 941,
      "comment": "\r\n     * Returns the domain axis edge.  This is derived from the axis location\r\n     * and the plot orientation.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(int)",
      "begin_line": 950,
      "end_line": 960,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 36)",
        "(line 952,col 9)-(line 952,col 61)",
        "(line 953,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisCount()",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainAxes()",
      "begin_line": 975,
      "end_line": 984,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 32)",
        "(line 983,col 9)-(line 983,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureDomainAxes()",
      "begin_line": 989,
      "end_line": 996,
      "comment": "\r\n     * Configures the domain axes.\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 995,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis()",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * null, then the method will return the parent plot\u0027s range axis (if there\r\n     * is a parent plot).\r\n     *\r\n     * @return The range axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis(int)",
      "begin_line": 1016,
      "end_line": 1029,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 32)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1027,col 9)",
        "(line 1028,col 9)-(line 1028,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1048,
      "end_line": 1050,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1060,
      "end_line": 1076,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 67)",
        "(line 1062,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1068,col 40)",
        "(line 1069,col 9)-(line 1072,col 9)",
        "(line 1073,col 9)-(line 1075,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1086,
      "end_line": 1091,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setDomainAxes(CategoryAxis[])\r\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1106,
      "end_line": 1119,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     * @see #getDomainAxisIndex(CategoryAxis)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 50)",
        "(line 1111,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1118,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation()",
      "begin_line": 1126,
      "end_line": 1128,
      "comment": "\r\n     * Returns the range axis location.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1127,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(int)",
      "begin_line": 1139,
      "end_line": 1148,
      "comment": "\r\n     * Returns the location for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     *\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 35)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1159,
      "end_line": 1162,
      "comment": "\r\n     * Sets the location of the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxisLocation(AxisLocation, boolean)\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1173,
      "end_line": 1175,
      "comment": "\r\n     * Sets the location of the range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #setDomainAxisLocation(AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1187,
      "end_line": 1189,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1202,
      "end_line": 1212,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1207,col 9)",
        "(line 1208,col 9)-(line 1208,col 53)",
        "(line 1209,col 9)-(line 1211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge()",
      "begin_line": 1219,
      "end_line": 1221,
      "comment": "\r\n     * Returns the edge where the primary range axis is located.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(int)",
      "begin_line": 1230,
      "end_line": 1238,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 60)",
        "(line 1232,col 9)-(line 1233,col 34)",
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1237,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisCount()",
      "begin_line": 1245,
      "end_line": 1247,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeAxes()",
      "begin_line": 1253,
      "end_line": 1262,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1260,col 31)",
        "(line 1261,col 9)-(line 1261,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureRangeAxes()",
      "begin_line": 1267,
      "end_line": 1274,
      "comment": "\r\n     * Configures the range axes.\r\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset()",
      "begin_line": 1283,
      "end_line": 1285,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset(int)",
      "begin_line": 1296,
      "end_line": 1302,
      "comment": "\r\n     * Returns the dataset at the given index.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(int, CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1297,col 9)-(line 1297,col 38)",
        "(line 1298,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1301,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset, if there\r\n     * is one.  This method also calls the\r\n     * {@link #datasetChanged(DatasetChangeEvent)} method, which adjusts the\r\n     * axis ranges if necessary and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(int, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1327,
      "end_line": 1342,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 78)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1333,col 42)",
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1339,col 9)-(line 1339,col 73)",
        "(line 1340,col 9)-(line 1340,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetCount()",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.indexOf(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1365,
      "end_line": 1374,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1366,col 24)",
        "(line 1367,col 9)-(line 1372,col 9)",
        "(line 1373,col 9)-(line 1373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1384,
      "end_line": 1388,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     *\r\n     * @see #getDomainAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1385,col 54)",
        "(line 1386,col 9)-(line 1386,col 48)",
        "(line 1387,col 9)-(line 1387,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxes(int, java.util.List)",
      "begin_line": 1400,
      "end_line": 1409,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1401,col 9)-(line 1403,col 9)",
        "(line 1404,col 9)-(line 1404,col 38)",
        "(line 1405,col 9)-(line 1405,col 41)",
        "(line 1406,col 9)-(line 1406,col 73)",
        "(line 1408,col 9)-(line 1408,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.checkAxisIndices(java.util.List)",
      "begin_line": 1418,
      "end_line": 1441,
      "comment": "\r\n     * This method is used to perform argument checking on the list of\r\n     * axis indices passed to mapDatasetToDomainAxes() and\r\n     * mapDatasetToRangeAxes().\r\n     *\r\n     * @param indices  the list of indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1424,col 9)",
        "(line 1425,col 9)-(line 1425,col 35)",
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 36)",
        "(line 1430,col 9)-(line 1440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(int)",
      "begin_line": 1453,
      "end_line": 1469,
      "comment": "\r\n     * Returns the domain axis for a dataset.  You can change the axis for a\r\n     * dataset using the {@link #mapDatasetToDomainAxis(int, int)} method.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The domain axis.\r\n     *\r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1454,col 9)-(line 1456,col 9)",
        "(line 1457,col 9)-(line 1457,col 33)",
        "(line 1458,col 9)-(line 1459,col 36)",
        "(line 1460,col 9)-(line 1467,col 9)",
        "(line 1468,col 9)-(line 1468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1479,
      "end_line": 1483,
      "comment": "\r\n     * Maps a dataset to a particular range axis.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     *\r\n     * @see #getRangeAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1480,col 9)-(line 1480,col 54)",
        "(line 1481,col 9)-(line 1481,col 48)",
        "(line 1482,col 9)-(line 1482,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxes(int, java.util.List)",
      "begin_line": 1495,
      "end_line": 1504,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1496,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1499,col 38)",
        "(line 1500,col 9)-(line 1500,col 41)",
        "(line 1501,col 9)-(line 1501,col 72)",
        "(line 1503,col 9)-(line 1503,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(int)",
      "begin_line": 1516,
      "end_line": 1532,
      "comment": "\r\n     * Returns the range axis for a dataset.  You can change the axis for a\r\n     * dataset using the {@link #mapDatasetToRangeAxis(int, int)} method.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The range axis.\r\n     *\r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1519,col 9)",
        "(line 1520,col 9)-(line 1520,col 30)",
        "(line 1521,col 9)-(line 1522,col 36)",
        "(line 1523,col 9)-(line 1530,col 9)",
        "(line 1531,col 9)-(line 1531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererCount()",
      "begin_line": 1541,
      "end_line": 1543,
      "comment": "\r\n     * Returns the number of renderer slots for this plot.\r\n     *\r\n     * @return The number of renderer slots.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer()",
      "begin_line": 1552,
      "end_line": 1554,
      "comment": "\r\n     * Returns a reference to the renderer for the plot.\r\n     *\r\n     * @return The renderer.\r\n     *\r\n     * @see #setRenderer(CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1553,col 9)-(line 1553,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer(int)",
      "begin_line": 1565,
      "end_line": 1571,
      "comment": "\r\n     * Returns the renderer at the given index.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(int, CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1566,col 9)-(line 1566,col 43)",
        "(line 1567,col 9)-(line 1569,col 9)",
        "(line 1570,col 9)-(line 1570,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1582,
      "end_line": 1584,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\"\r\n     * renderer) and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted.\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1583,col 9)-(line 1583,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1603,
      "end_line": 1605,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\"\r\n     * renderer) and, if requested, sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cp\u003e\r\n     * You can set the renderer to \u003ccode\u003enull\u003c/code\u003e, but this is not\r\n     * recommended because:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno data will be displayed;\u003c/li\u003e\r\n     *   \u003cli\u003ethe plot background will not be painted;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1604,col 9)-(line 1604,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1617,
      "end_line": 1619,
      "comment": "\r\n     * Sets the renderer at the specified index and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer(int)\r\n     * @see #setRenderer(int, CategoryItemRenderer, boolean)\r\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1631,
      "end_line": 1654,
      "comment": "\r\n     * Sets a renderer.  A {@link PlotChangeEvent} is sent to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1636,col 63)",
        "(line 1637,col 9)-(line 1639,col 9)",
        "(line 1642,col 9)-(line 1642,col 44)",
        "(line 1643,col 9)-(line 1646,col 9)",
        "(line 1648,col 9)-(line 1648,col 30)",
        "(line 1649,col 9)-(line 1649,col 29)",
        "(line 1651,col 9)-(line 1653,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])",
      "begin_line": 1662,
      "end_line": 1667,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param renderers  the renderers.\r\n     ",
      "child_ranges": [
        "(line 1663,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1666,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererForDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1677,
      "end_line": 1686,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  If the dataset doesn\u0027t\r\n     * belong to the plot, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1678,col 9)-(line 1678,col 43)",
        "(line 1679,col 9)-(line 1684,col 9)",
        "(line 1685,col 9)-(line 1685,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetRenderingOrder()",
      "begin_line": 1707,
      "end_line": 1709,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1721,
      "end_line": 1727,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).  You\r\n     * can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1722,col 9)-(line 1724,col 9)",
        "(line 1725,col 9)-(line 1725,col 36)",
        "(line 1726,col 9)-(line 1726,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getColumnRenderingOrder()",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "\r\n     * Returns the order in which the columns are rendered.  The default value\r\n     * is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     *\r\n     * @return The column rendering order (never \u003ccode\u003enull\u003c/code).\r\n     *\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1752,
      "end_line": 1758,
      "comment": "\r\n     * Sets the column order in which the items in each dataset should be\r\n     * rendered and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.  Note that this affects the order in which items are drawn,\r\n     * NOT their position in the chart.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getColumnRenderingOrder()\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1753,col 9)-(line 1755,col 9)",
        "(line 1756,col 9)-(line 1756,col 42)",
        "(line 1757,col 9)-(line 1757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRowRenderingOrder()",
      "begin_line": 1768,
      "end_line": 1770,
      "comment": "\r\n     * Returns the order in which the rows should be rendered.  The default\r\n     * value is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1769,col 9)-(line 1769,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1783,
      "end_line": 1789,
      "comment": "\r\n     * Sets the row order in which the items in each dataset should be\r\n     * rendered and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.  Note that this affects the order in which items are drawn,\r\n     * NOT their position in the chart.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRowRenderingOrder()\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1784,col 9)-(line 1786,col 9)",
        "(line 1787,col 9)-(line 1787,col 39)",
        "(line 1788,col 9)-(line 1788,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainGridlinesVisible()",
      "begin_line": 1798,
      "end_line": 1800,
      "comment": "\r\n     * Returns the flag that controls whether the domain grid-lines are visible.\r\n     *\r\n     * @return The \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1799,col 9)-(line 1799,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1813,
      "end_line": 1818,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against\r\n     * the domain axis.\r\n     * \u003cp\u003e\r\n     * If the flag value changes, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1814,col 9)-(line 1817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePosition()",
      "begin_line": 1827,
      "end_line": 1829,
      "comment": "\r\n     * Returns the position used for the domain gridlines.\r\n     *\r\n     * @return The gridline position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePosition(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1828,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 1839,
      "end_line": 1845,
      "comment": "\r\n     * Sets the position used for the domain gridlines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePosition()\r\n     ",
      "child_ranges": [
        "(line 1840,col 9)-(line 1842,col 9)",
        "(line 1843,col 9)-(line 1843,col 47)",
        "(line 1844,col 9)-(line 1844,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke()",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": "\r\n     * Returns the stroke used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1855,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1866,
      "end_line": 1872,
      "comment": "\r\n     * Sets the stroke used to draw grid-lines against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1867,col 9)-(line 1869,col 9)",
        "(line 1870,col 9)-(line 1870,col 43)",
        "(line 1871,col 9)-(line 1871,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePaint()",
      "begin_line": 1881,
      "end_line": 1883,
      "comment": "\r\n     * Returns the paint used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1882,col 9)-(line 1882,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1893,
      "end_line": 1899,
      "comment": "\r\n     * Sets the paint used to draw the grid-lines (if any) against the domain\r\n     * axis and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1894,col 9)-(line 1896,col 9)",
        "(line 1897,col 9)-(line 1897,col 41)",
        "(line 1898,col 9)-(line 1898,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZeroBaselineVisible()",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1912,col 9)-(line 1912,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 1926,
      "end_line": 1929,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isRangeZeroBaselineVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1927,col 9)-(line 1927,col 48)",
        "(line 1928,col 9)-(line 1928,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeZeroBaselineStroke()",
      "begin_line": 1940,
      "end_line": 1942,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1941,col 9)-(line 1941,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1954,
      "end_line": 1960,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1955,col 9)-(line 1957,col 9)",
        "(line 1958,col 9)-(line 1958,col 46)",
        "(line 1959,col 9)-(line 1959,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeZeroBaselinePaint()",
      "begin_line": 1972,
      "end_line": 1974,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1973,col 9)-(line 1973,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1986,
      "end_line": 1992,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1987,col 9)-(line 1989,col 9)",
        "(line 1990,col 9)-(line 1990,col 44)",
        "(line 1991,col 9)-(line 1991,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeGridlinesVisible()",
      "begin_line": 2001,
      "end_line": 2003,
      "comment": "\r\n     * Returns the flag that controls whether the range grid-lines are visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2002,col 9)-(line 2002,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 2014,
      "end_line": 2019,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against\r\n     * the range axis.  If the flag changes value, a {@link PlotChangeEvent} is\r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 2015,col 9)-(line 2018,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke()",
      "begin_line": 2028,
      "end_line": 2030,
      "comment": "\r\n     * Returns the stroke used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 2029,col 9)-(line 2029,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 2040,
      "end_line": 2046,
      "comment": "\r\n     * Sets the stroke used to draw the grid-lines against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 2041,col 9)-(line 2043,col 9)",
        "(line 2044,col 9)-(line 2044,col 42)",
        "(line 2045,col 9)-(line 2045,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlinePaint()",
      "begin_line": 2055,
      "end_line": 2057,
      "comment": "\r\n     * Returns the paint used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2056,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 2067,
      "end_line": 2073,
      "comment": "\r\n     * Sets the paint used to draw the grid lines against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 2068,col 9)-(line 2070,col 9)",
        "(line 2071,col 9)-(line 2071,col 40)",
        "(line 2072,col 9)-(line 2072,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeMinorGridlinesVisible()",
      "begin_line": 2085,
      "end_line": 2087,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis minor grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2086,col 9)-(line 2086,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlinesVisible(boolean)",
      "begin_line": 2102,
      "end_line": 2107,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis minor grid\r\n     * lines are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2103,col 9)-(line 2106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMinorGridlineStroke()",
      "begin_line": 2119,
      "end_line": 2121,
      "comment": "\r\n     * Returns the stroke for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2120,col 9)-(line 2120,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 2133,
      "end_line": 2139,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2134,col 9)-(line 2136,col 9)",
        "(line 2137,col 9)-(line 2137,col 47)",
        "(line 2138,col 9)-(line 2138,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMinorGridlinePaint()",
      "begin_line": 2151,
      "end_line": 2153,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2152,col 9)-(line 2152,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 2165,
      "end_line": 2171,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the range axis\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2166,col 9)-(line 2168,col 9)",
        "(line 2169,col 9)-(line 2169,col 45)",
        "(line 2170,col 9)-(line 2170,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedLegendItems()",
      "begin_line": 2180,
      "end_line": 2182,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 2181,col 9)-(line 2181,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 2193,
      "end_line": 2196,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 2194,col 9)-(line 2194,col 38)",
        "(line 2195,col 9)-(line 2195,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getLegendItems()",
      "begin_line": 2205,
      "end_line": 2229,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method creates\r\n     * a legend item for each series in each of the datasets.  You can change\r\n     * this behaviour by overriding this method.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 2206,col 9)-(line 2206,col 60)",
        "(line 2207,col 9)-(line 2227,col 9)",
        "(line 2228,col 9)-(line 2228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2239,
      "end_line": 2259,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 2241,col 9)-(line 2241,col 50)",
        "(line 2242,col 9)-(line 2257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoom(double)",
      "begin_line": 2270,
      "end_line": 2282,
      "comment": "\r\n     * Zooms (in or out) on the plot\u0027s value axis.\r\n     * \u003cp\u003e\r\n     * If the value 0.0 is passed in as the zoom percent, the auto-range\r\n     * calculation for the axis is restored (which sets the range to include\r\n     * the minimum and maximum data values, thus displaying all the data).\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": [
        "(line 2272,col 9)-(line 2280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 2291,
      "end_line": 2309,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The range axis bounds will be recalculated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 2293,col 9)-(line 2293,col 42)",
        "(line 2294,col 9)-(line 2299,col 9)",
        "(line 2300,col 9)-(line 2307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 2316,
      "end_line": 2335,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 2317,col 9)-(line 2317,col 34)",
        "(line 2318,col 9)-(line 2334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker)",
      "begin_line": 2347,
      "end_line": 2349,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a\r\n     * marker will be drawn by the renderer as a line perpendicular to the\r\n     * domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeDomainMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2348,col 9)-(line 2348,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 2363,
      "end_line": 2365,
      "comment": "\r\n     * Adds a marker for display against the domain axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker\r\n     * will be drawn by the renderer as a line perpendicular to the domain\r\n     * axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e\r\n     *               not permitted).\r\n     *\r\n     * @see #removeDomainMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2364,col 9)-(line 2364,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 2380,
      "end_line": 2382,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2381,col 9)-(line 2381,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2400,
      "end_line": 2431,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #removeDomainMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2402,col 9)-(line 2404,col 9)",
        "(line 2405,col 9)-(line 2407,col 9)",
        "(line 2408,col 9)-(line 2408,col 27)",
        "(line 2409,col 9)-(line 2426,col 9)",
        "(line 2427,col 9)-(line 2427,col 39)",
        "(line 2428,col 9)-(line 2430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers()",
      "begin_line": 2439,
      "end_line": 2459,
      "comment": "\r\n     * Clears all the domain markers for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2440,col 9)-(line 2448,col 9)",
        "(line 2449,col 9)-(line 2457,col 9)",
        "(line 2458,col 9)-(line 2458,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2468,
      "end_line": 2470,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     ",
      "child_ranges": [
        "(line 2469,col 9)-(line 2469,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2481,
      "end_line": 2494,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2482,col 9)-(line 2482,col 33)",
        "(line 2483,col 9)-(line 2483,col 41)",
        "(line 2484,col 9)-(line 2489,col 9)",
        "(line 2490,col 9)-(line 2492,col 9)",
        "(line 2493,col 9)-(line 2493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(int)",
      "begin_line": 2503,
      "end_line": 2530,
      "comment": "\r\n     * Clears all the domain markers for the specified renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2504,col 9)-(line 2504,col 41)",
        "(line 2505,col 9)-(line 2516,col 9)",
        "(line 2517,col 9)-(line 2528,col 9)",
        "(line 2529,col 9)-(line 2529,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2543,
      "end_line": 2545,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2544,col 9)-(line 2544,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2559,
      "end_line": 2561,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2560,col 9)-(line 2560,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2576,
      "end_line": 2578,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2577,col 9)-(line 2577,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2594,
      "end_line": 2613,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2596,col 9)-(line 2596,col 26)",
        "(line 2597,col 9)-(line 2604,col 9)",
        "(line 2605,col 9)-(line 2607,col 9)",
        "(line 2608,col 9)-(line 2608,col 49)",
        "(line 2609,col 9)-(line 2611,col 9)",
        "(line 2612,col 9)-(line 2612,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2625,
      "end_line": 2627,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a\r\n     * marker will be drawn by the renderer as a line perpendicular to the\r\n     * range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2626,col 9)-(line 2626,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2641,
      "end_line": 2643,
      "comment": "\r\n     * Adds a marker for display against the range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker\r\n     * will be drawn by the renderer as a line perpendicular to the range axis,\r\n     * however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e\r\n     *               not permitted).\r\n     *\r\n     * @see #removeRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2642,col 9)-(line 2642,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2658,
      "end_line": 2660,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     *\r\n     * @see #removeRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2659,col 9)-(line 2659,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2678,
      "end_line": 2703,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #removeRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2680,col 9)-(line 2680,col 27)",
        "(line 2681,col 9)-(line 2698,col 9)",
        "(line 2699,col 9)-(line 2699,col 39)",
        "(line 2700,col 9)-(line 2702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers()",
      "begin_line": 2711,
      "end_line": 2731,
      "comment": "\r\n     * Clears all the range markers for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2712,col 9)-(line 2720,col 9)",
        "(line 2721,col 9)-(line 2729,col 9)",
        "(line 2730,col 9)-(line 2730,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2742,
      "end_line": 2744,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     *\r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 2743,col 9)-(line 2743,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2755,
      "end_line": 2768,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2756,col 9)-(line 2756,col 33)",
        "(line 2757,col 9)-(line 2757,col 41)",
        "(line 2758,col 9)-(line 2763,col 9)",
        "(line 2764,col 9)-(line 2766,col 9)",
        "(line 2767,col 9)-(line 2767,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(int)",
      "begin_line": 2777,
      "end_line": 2804,
      "comment": "\r\n     * Clears all the range markers for the specified renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearDomainMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2778,col 9)-(line 2778,col 41)",
        "(line 2779,col 9)-(line 2790,col 9)",
        "(line 2791,col 9)-(line 2802,col 9)",
        "(line 2803,col 9)-(line 2803,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2819,
      "end_line": 2821,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2820,col 9)-(line 2820,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2837,
      "end_line": 2839,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2838,col 9)-(line 2838,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2856,
      "end_line": 2858,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2857,col 9)-(line 2857,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2876,
      "end_line": 2898,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2878,col 9)-(line 2880,col 9)",
        "(line 2881,col 9)-(line 2881,col 26)",
        "(line 2882,col 9)-(line 2889,col 9)",
        "(line 2890,col 9)-(line 2892,col 9)",
        "(line 2893,col 9)-(line 2893,col 49)",
        "(line 2894,col 9)-(line 2896,col 9)",
        "(line 2897,col 9)-(line 2897,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainCrosshairVisible()",
      "begin_line": 2910,
      "end_line": 2912,
      "comment": "\r\n     * Returns the flag that controls whether or not the domain crosshair is\r\n     * displayed by the plot.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2911,col 9)-(line 2911,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 2926,
      "end_line": 2931,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain crosshair is\r\n     * displayed by the plot, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new flag value.\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2927,col 9)-(line 2930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairRowKey()",
      "begin_line": 2940,
      "end_line": 2942,
      "comment": "\r\n     * Returns the row key for the domain crosshair.\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2941,col 9)-(line 2941,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairRowKey(java.lang.Comparable)",
      "begin_line": 2952,
      "end_line": 2954,
      "comment": "\r\n     * Sets the row key for the domain crosshair and sends a\r\n     * {PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2953,col 9)-(line 2953,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairRowKey(java.lang.Comparable, boolean)",
      "begin_line": 2965,
      "end_line": 2970,
      "comment": "\r\n     * Sets the row key for the domain crosshair and, if requested, sends a\r\n     * {PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2966,col 9)-(line 2966,col 41)",
        "(line 2967,col 9)-(line 2969,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairColumnKey()",
      "begin_line": 2979,
      "end_line": 2981,
      "comment": "\r\n     * Returns the column key for the domain crosshair.\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2980,col 9)-(line 2980,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairColumnKey(java.lang.Comparable)",
      "begin_line": 2991,
      "end_line": 2993,
      "comment": "\r\n     * Sets the column key for the domain crosshair and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2992,col 9)-(line 2992,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairColumnKey(java.lang.Comparable, boolean)",
      "begin_line": 3004,
      "end_line": 3009,
      "comment": "\r\n     * Sets the column key for the domain crosshair and, if requested, sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3005,col 9)-(line 3005,col 44)",
        "(line 3006,col 9)-(line 3008,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCrosshairDatasetIndex()",
      "begin_line": 3018,
      "end_line": 3020,
      "comment": "\r\n     * Returns the dataset index for the crosshair.\r\n     *\r\n     * @return The dataset index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3019,col 9)-(line 3019,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setCrosshairDatasetIndex(int)",
      "begin_line": 3030,
      "end_line": 3032,
      "comment": "\r\n     * Sets the dataset index for the crosshair and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3031,col 9)-(line 3031,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setCrosshairDatasetIndex(int, boolean)",
      "begin_line": 3043,
      "end_line": 3048,
      "comment": "\r\n     * Sets the dataset index for the crosshair and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3044,col 9)-(line 3044,col 43)",
        "(line 3045,col 9)-(line 3047,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairPaint()",
      "begin_line": 3060,
      "end_line": 3062,
      "comment": "\r\n     * Returns the paint used to draw the domain crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3061,col 9)-(line 3061,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 3073,
      "end_line": 3079,
      "comment": "\r\n     * Sets the paint used to draw the domain crosshair.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3074,col 9)-(line 3076,col 9)",
        "(line 3077,col 9)-(line 3077,col 42)",
        "(line 3078,col 9)-(line 3078,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairStroke()",
      "begin_line": 3091,
      "end_line": 3093,
      "comment": "\r\n     * Returns the stroke used to draw the domain crosshair.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3092,col 9)-(line 3092,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 3105,
      "end_line": 3110,
      "comment": "\r\n     * Sets the stroke used to draw the domain crosshair, and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3106,col 9)-(line 3108,col 9)",
        "(line 3109,col 9)-(line 3109,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairVisible()",
      "begin_line": 3119,
      "end_line": 3121,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 3120,col 9)-(line 3120,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 3130,
      "end_line": 3135,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 3131,col 9)-(line 3134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 3145,
      "end_line": 3147,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 3146,col 9)-(line 3146,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 3158,
      "end_line": 3163,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values, and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 3159,col 9)-(line 3162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairValue()",
      "begin_line": 3172,
      "end_line": 3174,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 3173,col 9)-(line 3173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double)",
      "begin_line": 3184,
      "end_line": 3186,
      "comment": "\r\n     * Sets the range crosshair value and, if the crosshair is visible, sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the new value.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 3185,col 9)-(line 3185,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 3199,
      "end_line": 3204,
      "comment": "\r\n     * Sets the range crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (but only if the\r\n     * crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 3200,col 9)-(line 3200,col 41)",
        "(line 3201,col 9)-(line 3203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke()",
      "begin_line": 3216,
      "end_line": 3218,
      "comment": "\r\n     * Returns the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the crosshair\r\n     * (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3217,col 9)-(line 3217,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 3230,
      "end_line": 3236,
      "comment": "\r\n     * Sets the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the range\r\n     * crosshair (if visible), and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3231,col 9)-(line 3233,col 9)",
        "(line 3234,col 9)-(line 3234,col 43)",
        "(line 3235,col 9)-(line 3235,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairPaint()",
      "begin_line": 3247,
      "end_line": 3249,
      "comment": "\r\n     * Returns the paint used to draw the range crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3248,col 9)-(line 3248,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 3259,
      "end_line": 3265,
      "comment": "\r\n     * Sets the paint used to draw the range crosshair (if visible) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3260,col 9)-(line 3262,col 9)",
        "(line 3263,col 9)-(line 3263,col 41)",
        "(line 3264,col 9)-(line 3264,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnnotations()",
      "begin_line": 3275,
      "end_line": 3277,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     * @see #clearAnnotations()\r\n     ",
      "child_ranges": [
        "(line 3276,col 9)-(line 3276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 3287,
      "end_line": 3289,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3288,col 9)-(line 3288,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 3300,
      "end_line": 3308,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 3301,col 9)-(line 3303,col 9)",
        "(line 3304,col 9)-(line 3304,col 41)",
        "(line 3305,col 9)-(line 3307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 3320,
      "end_line": 3322,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3321,col 9)-(line 3321,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 3335,
      "end_line": 3345,
      "comment": "\r\n     * Removes an annotation from the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 3337,col 9)-(line 3339,col 9)",
        "(line 3340,col 9)-(line 3340,col 62)",
        "(line 3341,col 9)-(line 3343,col 9)",
        "(line 3344,col 9)-(line 3344,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearAnnotations()",
      "begin_line": 3351,
      "end_line": 3354,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     ",
      "child_ranges": [
        "(line 3352,col 9)-(line 3352,col 33)",
        "(line 3353,col 9)-(line 3353,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3365,
      "end_line": 3409,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3369,col 9)-(line 3371,col 9)",
        "(line 3374,col 9)-(line 3405,col 9)",
        "(line 3407,col 9)-(line 3407,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3420,
      "end_line": 3455,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3424,col 9)-(line 3426,col 9)",
        "(line 3429,col 9)-(line 3452,col 9)",
        "(line 3453,col 9)-(line 3453,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3465,
      "end_line": 3471,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 3467,col 9)-(line 3467,col 42)",
        "(line 3468,col 9)-(line 3468,col 61)",
        "(line 3469,col 9)-(line 3469,col 62)",
        "(line 3470,col 9)-(line 3470,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3489,
      "end_line": 3726,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * At your option, you may supply an instance of {@link PlotRenderingInfo}.\r\n     * If you do, it will be populated with information about the drawing,\r\n     * including various plot dimensions and tooltip info.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes) should\r\n     *              be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param state  collects info as the chart is drawn (possibly\r\n     *               \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 3493,col 9)-(line 3493,col 64)",
        "(line 3494,col 9)-(line 3494,col 66)",
        "(line 3495,col 9)-(line 3497,col 9)",
        "(line 3500,col 9)-(line 3505,col 9)",
        "(line 3506,col 9)-(line 3506,col 32)",
        "(line 3509,col 9)-(line 3509,col 45)",
        "(line 3510,col 9)-(line 3510,col 26)",
        "(line 3513,col 9)-(line 3513,col 55)",
        "(line 3514,col 9)-(line 3514,col 56)",
        "(line 3515,col 9)-(line 3515,col 39)",
        "(line 3517,col 9)-(line 3517,col 36)",
        "(line 3518,col 9)-(line 3518,col 78)",
        "(line 3522,col 9)-(line 3527,col 9)",
        "(line 3529,col 9)-(line 3529,col 63)",
        "(line 3533,col 9)-(line 3536,col 9)",
        "(line 3537,col 9)-(line 3537,col 77)",
        "(line 3538,col 9)-(line 3538,col 70)",
        "(line 3539,col 9)-(line 3539,col 41)",
        "(line 3544,col 9)-(line 3544,col 46)",
        "(line 3545,col 9)-(line 3545,col 46)",
        "(line 3546,col 9)-(line 3560,col 9)",
        "(line 3561,col 9)-(line 3561,col 61)",
        "(line 3562,col 9)-(line 3562,col 67)",
        "(line 3563,col 9)-(line 3563,col 63)",
        "(line 3566,col 9)-(line 3566,col 39)",
        "(line 3567,col 9)-(line 3567,col 26)",
        "(line 3569,col 9)-(line 3569,col 42)",
        "(line 3571,col 9)-(line 3571,col 80)",
        "(line 3572,col 9)-(line 3577,col 9)",
        "(line 3578,col 9)-(line 3581,col 9)",
        "(line 3584,col 9)-(line 3586,col 9)",
        "(line 3587,col 9)-(line 3589,col 9)",
        "(line 3592,col 9)-(line 3592,col 34)",
        "(line 3595,col 9)-(line 3595,col 56)",
        "(line 3596,col 9)-(line 3597,col 64)",
        "(line 3599,col 9)-(line 3599,col 65)",
        "(line 3600,col 9)-(line 3659,col 9)",
        "(line 3662,col 9)-(line 3664,col 9)",
        "(line 3665,col 9)-(line 3667,col 9)",
        "(line 3670,col 9)-(line 3670,col 45)",
        "(line 3672,col 9)-(line 3672,col 30)",
        "(line 3673,col 9)-(line 3673,col 43)",
        "(line 3675,col 9)-(line 3677,col 9)",
        "(line 3679,col 9)-(line 3679,col 60)",
        "(line 3680,col 9)-(line 3680,col 54)",
        "(line 3683,col 9)-(line 3683,col 55)",
        "(line 3684,col 9)-(line 3684,col 61)",
        "(line 3685,col 9)-(line 3685,col 48)",
        "(line 3686,col 9)-(line 3686,col 54)",
        "(line 3687,col 9)-(line 3692,col 9)",
        "(line 3695,col 9)-(line 3695,col 63)",
        "(line 3696,col 9)-(line 3696,col 53)",
        "(line 3697,col 9)-(line 3706,col 9)",
        "(line 3707,col 9)-(line 3707,col 70)",
        "(line 3708,col 9)-(line 3714,col 9)",
        "(line 3717,col 9)-(line 3724,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3738,
      "end_line": 3741,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is\r\n     * declared public so that it can be accessed by the renderers used by\r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 3739,col 9)-(line 3739,col 51)",
        "(line 3740,col 9)-(line 3740,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3754,
      "end_line": 3837,
      "comment": "\r\n     * A utility method for drawing the plot\u0027s axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 3759,col 9)-(line 3759,col 61)",
        "(line 3762,col 9)-(line 3767,col 9)",
        "(line 3770,col 9)-(line 3775,col 9)",
        "(line 3777,col 9)-(line 3777,col 41)",
        "(line 3780,col 9)-(line 3781,col 38)",
        "(line 3782,col 9)-(line 3782,col 69)",
        "(line 3783,col 9)-(line 3791,col 9)",
        "(line 3794,col 9)-(line 3795,col 79)",
        "(line 3796,col 9)-(line 3796,col 63)",
        "(line 3797,col 9)-(line 3805,col 9)",
        "(line 3808,col 9)-(line 3809,col 76)",
        "(line 3810,col 9)-(line 3810,col 61)",
        "(line 3811,col 9)-(line 3819,col 9)",
        "(line 3822,col 9)-(line 3823,col 77)",
        "(line 3824,col 9)-(line 3824,col 62)",
        "(line 3825,col 9)-(line 3833,col 9)",
        "(line 3835,col 9)-(line 3835,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CategoryCrosshairState)",
      "begin_line": 3854,
      "end_line": 3913,
      "comment": "\r\n     * Draws a representation of a dataset within the dataArea region using the\r\n     * appropriate renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset and renderer index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  a state object for tracking crosshair info\r\n     *        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean that indicates whether or not real data was found.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3857,col 9)-(line 3857,col 34)",
        "(line 3858,col 9)-(line 3858,col 59)",
        "(line 3859,col 9)-(line 3859,col 59)",
        "(line 3860,col 9)-(line 3860,col 65)",
        "(line 3861,col 9)-(line 3861,col 60)",
        "(line 3862,col 9)-(line 3862,col 74)",
        "(line 3863,col 9)-(line 3910,col 9)",
        "(line 3911,col 9)-(line 3911,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3923,
      "end_line": 3948,
      "comment": "\r\n     * Draws the domain gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     *\r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3925,col 9)-(line 3927,col 9)",
        "(line 3928,col 9)-(line 3928,col 60)",
        "(line 3929,col 9)-(line 3929,col 59)",
        "(line 3930,col 9)-(line 3930,col 47)",
        "(line 3931,col 9)-(line 3933,col 9)",
        "(line 3934,col 9)-(line 3934,col 44)",
        "(line 3935,col 9)-(line 3947,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3959,
      "end_line": 4001,
      "comment": "\r\n     * Draws the range gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 3962,col 9)-(line 3964,col 9)",
        "(line 3966,col 9)-(line 3966,col 40)",
        "(line 3967,col 9)-(line 3969,col 9)",
        "(line 3971,col 9)-(line 3971,col 47)",
        "(line 3972,col 9)-(line 3974,col 9)",
        "(line 3976,col 9)-(line 3976,col 33)",
        "(line 3977,col 9)-(line 3977,col 31)",
        "(line 3978,col 9)-(line 3978,col 34)",
        "(line 3979,col 9)-(line 3979,col 45)",
        "(line 3980,col 9)-(line 4000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 4013,
      "end_line": 4020,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4014,col 9)-(line 4016,col 9)",
        "(line 4017,col 9)-(line 4017,col 47)",
        "(line 4018,col 9)-(line 4019,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 4029,
      "end_line": 4040,
      "comment": "\r\n     * Draws the annotations.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 4032,col 9)-(line 4032,col 56)",
        "(line 4033,col 9)-(line 4038,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4053,
      "end_line": 4071,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #drawRangeMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4056,col 9)-(line 4056,col 52)",
        "(line 4057,col 9)-(line 4059,col 9)",
        "(line 4061,col 9)-(line 4061,col 60)",
        "(line 4062,col 9)-(line 4062,col 59)",
        "(line 4063,col 9)-(line 4069,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4084,
      "end_line": 4102,
      "comment": "\r\n     * Draws the range markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #drawDomainMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4087,col 9)-(line 4087,col 52)",
        "(line 4088,col 9)-(line 4090,col 9)",
        "(line 4092,col 9)-(line 4092,col 59)",
        "(line 4093,col 9)-(line 4093,col 55)",
        "(line 4094,col 9)-(line 4100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4114,
      "end_line": 4132,
      "comment": "\r\n     * Utility method for drawing a line perpendicular to the range axis (used\r\n     * for crosshairs).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param value  the data value.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 4117,col 9)-(line 4118,col 36)",
        "(line 4119,col 9)-(line 4119,col 27)",
        "(line 4120,col 9)-(line 4127,col 9)",
        "(line 4128,col 9)-(line 4128,col 29)",
        "(line 4129,col 9)-(line 4129,col 27)",
        "(line 4130,col 9)-(line 4130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, int, java.lang.Comparable, java.lang.Comparable, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4151,
      "end_line": 4176,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param datasetIndex  the dataset index.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @see #drawRangeCrosshair(Graphics2D, Rectangle2D, PlotOrientation,\r\n     *     double, ValueAxis, Stroke, Paint)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 4156,col 9)-(line 4156,col 59)",
        "(line 4157,col 9)-(line 4157,col 66)",
        "(line 4158,col 9)-(line 4158,col 66)",
        "(line 4159,col 9)-(line 4159,col 27)",
        "(line 4160,col 9)-(line 4171,col 9)",
        "(line 4172,col 9)-(line 4172,col 29)",
        "(line 4173,col 9)-(line 4173,col 27)",
        "(line 4174,col 9)-(line 4174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4194,
      "end_line": 4218,
      "comment": "\r\n     * Draws a range crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @see #drawDomainCrosshair(Graphics2D, Rectangle2D, PlotOrientation, int,\r\n     *      Comparable, Comparable, Stroke, Paint)\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 4198,col 9)-(line 4200,col 9)",
        "(line 4201,col 9)-(line 4201,col 27)",
        "(line 4202,col 9)-(line 4213,col 9)",
        "(line 4214,col 9)-(line 4214,col 29)",
        "(line 4215,col 9)-(line 4215,col 27)",
        "(line 4216,col 9)-(line 4216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4229,
      "end_line": 4254,
      "comment": "\r\n     * Returns the range of data values that will be plotted against the range\r\n     * axis.  If the dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The data range.\r\n     ",
      "child_ranges": [
        "(line 4231,col 9)-(line 4231,col 28)",
        "(line 4232,col 9)-(line 4232,col 46)",
        "(line 4234,col 9)-(line 4234,col 54)",
        "(line 4235,col 9)-(line 4240,col 9)",
        "(line 4244,col 9)-(line 4244,col 54)",
        "(line 4245,col 9)-(line 4251,col 9)",
        "(line 4252,col 9)-(line 4252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(int)",
      "begin_line": 4266,
      "end_line": 4289,
      "comment": "\r\n     * Returns a list of the datasets that are mapped to the axis with the\r\n     * specified index.\r\n     *\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @return The list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 4267,col 9)-(line 4267,col 45)",
        "(line 4268,col 9)-(line 4268,col 38)",
        "(line 4269,col 9)-(line 4287,col 9)",
        "(line 4288,col 9)-(line 4288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(int)",
      "begin_line": 4299,
      "end_line": 4317,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * given range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 4300,col 9)-(line 4300,col 41)",
        "(line 4301,col 9)-(line 4301,col 38)",
        "(line 4302,col 9)-(line 4315,col 9)",
        "(line 4316,col 9)-(line 4316,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getWeight()",
      "begin_line": 4327,
      "end_line": 4329,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     *\r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 4328,col 9)-(line 4328,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setWeight(int)",
      "begin_line": 4339,
      "end_line": 4342,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     *\r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 4340,col 9)-(line 4340,col 29)",
        "(line 4341,col 9)-(line 4341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedDomainAxisSpace()",
      "begin_line": 4351,
      "end_line": 4353,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4352,col 9)-(line 4352,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4363,
      "end_line": 4365,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4364,col 9)-(line 4364,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4378,
      "end_line": 4383,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4379,col 9)-(line 4379,col 42)",
        "(line 4380,col 9)-(line 4382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedRangeAxisSpace()",
      "begin_line": 4392,
      "end_line": 4394,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4393,col 9)-(line 4393,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4404,
      "end_line": 4406,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4405,col 9)-(line 4405,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4419,
      "end_line": 4424,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4420,col 9)-(line 4420,col 41)",
        "(line 4421,col 9)-(line 4423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategories()",
      "begin_line": 4433,
      "end_line": 4439,
      "comment": "\r\n     * Returns a list of the categories in the plot\u0027s primary dataset.\r\n     *\r\n     * @return A list of the categories in the plot\u0027s primary dataset.\r\n     *\r\n     * @see #getCategoriesForAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 4434,col 9)-(line 4434,col 27)",
        "(line 4435,col 9)-(line 4437,col 9)",
        "(line 4438,col 9)-(line 4438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 4451,
      "end_line": 4467,
      "comment": "\r\n     * Returns a list of the categories that should be displayed for the\r\n     * specified axis.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     *\r\n     * @return The categories.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 4452,col 9)-(line 4452,col 38)",
        "(line 4453,col 9)-(line 4453,col 54)",
        "(line 4454,col 9)-(line 4454,col 62)",
        "(line 4455,col 9)-(line 4455,col 48)",
        "(line 4456,col 9)-(line 4465,col 9)",
        "(line 4466,col 9)-(line 4466,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDrawSharedDomainAxis()",
      "begin_line": 4477,
      "end_line": 4479,
      "comment": "\r\n     * Returns the flag that controls whether or not the shared domain axis is\r\n     * drawn for each subplot.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setDrawSharedDomainAxis(boolean)\r\n     ",
      "child_ranges": [
        "(line 4478,col 9)-(line 4478,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis(boolean)",
      "begin_line": 4489,
      "end_line": 4492,
      "comment": "\r\n     * Sets the flag that controls whether the shared domain axis is drawn when\r\n     * this plot is being used as a subplot.\r\n     *\r\n     * @param draw  a boolean.\r\n     *\r\n     * @see #getDrawSharedDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 4490,col 9)-(line 4490,col 41)",
        "(line 4491,col 9)-(line 4491,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainPannable()",
      "begin_line": 4502,
      "end_line": 4504,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always, because the plot cannot be panned\r\n     * along the domain axis/axes.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4503,col 9)-(line 4503,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangePannable()",
      "begin_line": 4514,
      "end_line": 4516,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the range axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4515,col 9)-(line 4515,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangePannable(boolean)",
      "begin_line": 4526,
      "end_line": 4528,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along\r\n     * the range axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4527,col 9)-(line 4527,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4539,
      "end_line": 4542,
      "comment": "\r\n     * Pans the domain axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4553,
      "end_line": 4572,
      "comment": "\r\n     * Pans the range axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4555,col 9)-(line 4557,col 9)",
        "(line 4558,col 9)-(line 4558,col 49)",
        "(line 4559,col 9)-(line 4571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainZoomable()",
      "begin_line": 4582,
      "end_line": 4584,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that the domain axes are not\r\n     * zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 4583,col 9)-(line 4583,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZoomable()",
      "begin_line": 4593,
      "end_line": 4595,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axes are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 4594,col 9)-(line 4594,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4605,
      "end_line": 4608,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4619,
      "end_line": 4622,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4637,
      "end_line": 4640,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4649,
      "end_line": 4653,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 4652,col 9)-(line 4652,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4668,
      "end_line": 4691,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4672,col 9)-(line 4690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4701,
      "end_line": 4709,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 4703,col 9)-(line 4708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnchorValue()",
      "begin_line": 4718,
      "end_line": 4720,
      "comment": "\r\n     * Returns the anchor value.\r\n     *\r\n     * @return The anchor value.\r\n     *\r\n     * @see #setAnchorValue(double)\r\n     ",
      "child_ranges": [
        "(line 4719,col 9)-(line 4719,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double)",
      "begin_line": 4730,
      "end_line": 4732,
      "comment": "\r\n     * Sets the anchor value and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param value  the anchor value.\r\n     *\r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 4731,col 9)-(line 4731,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double, boolean)",
      "begin_line": 4743,
      "end_line": 4748,
      "comment": "\r\n     * Sets the anchor value and, if requested, sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 4744,col 9)-(line 4744,col 33)",
        "(line 4745,col 9)-(line 4747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.equals(java.lang.Object)",
      "begin_line": 4757,
      "end_line": 4934,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 4759,col 9)-(line 4761,col 9)",
        "(line 4762,col 9)-(line 4764,col 9)",
        "(line 4765,col 9)-(line 4765,col 47)",
        "(line 4766,col 9)-(line 4768,col 9)",
        "(line 4769,col 9)-(line 4771,col 9)",
        "(line 4772,col 9)-(line 4774,col 9)",
        "(line 4775,col 9)-(line 4777,col 9)",
        "(line 4778,col 9)-(line 4780,col 9)",
        "(line 4781,col 9)-(line 4783,col 9)",
        "(line 4784,col 9)-(line 4786,col 9)",
        "(line 4787,col 9)-(line 4790,col 9)",
        "(line 4791,col 9)-(line 4794,col 9)",
        "(line 4795,col 9)-(line 4797,col 9)",
        "(line 4798,col 9)-(line 4800,col 9)",
        "(line 4801,col 9)-(line 4803,col 9)",
        "(line 4804,col 9)-(line 4806,col 9)",
        "(line 4807,col 9)-(line 4809,col 9)",
        "(line 4810,col 9)-(line 4812,col 9)",
        "(line 4813,col 9)-(line 4816,col 9)",
        "(line 4817,col 9)-(line 4820,col 9)",
        "(line 4821,col 9)-(line 4823,col 9)",
        "(line 4824,col 9)-(line 4827,col 9)",
        "(line 4828,col 9)-(line 4831,col 9)",
        "(line 4832,col 9)-(line 4834,col 9)",
        "(line 4835,col 9)-(line 4837,col 9)",
        "(line 4838,col 9)-(line 4840,col 9)",
        "(line 4841,col 9)-(line 4844,col 9)",
        "(line 4845,col 9)-(line 4848,col 9)",
        "(line 4849,col 9)-(line 4852,col 9)",
        "(line 4853,col 9)-(line 4856,col 9)",
        "(line 4857,col 9)-(line 4860,col 9)",
        "(line 4861,col 9)-(line 4864,col 9)",
        "(line 4865,col 9)-(line 4868,col 9)",
        "(line 4869,col 9)-(line 4871,col 9)",
        "(line 4872,col 9)-(line 4874,col 9)",
        "(line 4875,col 9)-(line 4878,col 9)",
        "(line 4879,col 9)-(line 4882,col 9)",
        "(line 4883,col 9)-(line 4886,col 9)",
        "(line 4887,col 9)-(line 4889,col 9)",
        "(line 4890,col 9)-(line 4892,col 9)",
        "(line 4893,col 9)-(line 4896,col 9)",
        "(line 4897,col 9)-(line 4900,col 9)",
        "(line 4901,col 9)-(line 4904,col 9)",
        "(line 4905,col 9)-(line 4908,col 9)",
        "(line 4909,col 9)-(line 4912,col 9)",
        "(line 4913,col 9)-(line 4916,col 9)",
        "(line 4917,col 9)-(line 4920,col 9)",
        "(line 4921,col 9)-(line 4923,col 9)",
        "(line 4924,col 9)-(line 4927,col 9)",
        "(line 4928,col 9)-(line 4931,col 9)",
        "(line 4932,col 9)-(line 4932,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clone()",
      "begin_line": 4943,
      "end_line": 5005,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 4945,col 9)-(line 4945,col 58)",
        "(line 4947,col 9)-(line 4947,col 44)",
        "(line 4948,col 9)-(line 4954,col 9)",
        "(line 4955,col 9)-(line 4956,col 64)",
        "(line 4958,col 9)-(line 4958,col 43)",
        "(line 4959,col 9)-(line 4965,col 9)",
        "(line 4966,col 9)-(line 4966,col 80)",
        "(line 4968,col 9)-(line 4968,col 60)",
        "(line 4969,col 9)-(line 4974,col 9)",
        "(line 4975,col 9)-(line 4975,col 53)",
        "(line 4976,col 9)-(line 4976,col 73)",
        "(line 4977,col 9)-(line 4977,col 52)",
        "(line 4978,col 9)-(line 4978,col 71)",
        "(line 4980,col 9)-(line 4980,col 62)",
        "(line 4981,col 9)-(line 4984,col 9)",
        "(line 4985,col 9)-(line 4988,col 9)",
        "(line 4990,col 9)-(line 4990,col 79)",
        "(line 4991,col 9)-(line 4992,col 46)",
        "(line 4993,col 9)-(line 4994,col 46)",
        "(line 4995,col 9)-(line 4996,col 45)",
        "(line 4997,col 9)-(line 4998,col 45)",
        "(line 4999,col 9)-(line 5002,col 9)",
        "(line 5003,col 9)-(line 5003,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.cloneMarkerMap(java.util.Map)",
      "begin_line": 5017,
      "end_line": 5028,
      "comment": "\r\n     * A utility method to clone the marker maps.\r\n     *\r\n     * @param map  the map to clone.\r\n     *\r\n     * @return A clone of the map.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some problem cloning the\r\n     *                                    map.\r\n     ",
      "child_ranges": [
        "(line 5018,col 9)-(line 5018,col 34)",
        "(line 5019,col 9)-(line 5019,col 32)",
        "(line 5020,col 9)-(line 5020,col 44)",
        "(line 5021,col 9)-(line 5026,col 9)",
        "(line 5027,col 9)-(line 5027,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 5037,
      "end_line": 5051,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 5038,col 9)-(line 5038,col 36)",
        "(line 5039,col 9)-(line 5039,col 71)",
        "(line 5040,col 9)-(line 5040,col 69)",
        "(line 5041,col 9)-(line 5041,col 70)",
        "(line 5042,col 9)-(line 5042,col 68)",
        "(line 5043,col 9)-(line 5043,col 71)",
        "(line 5044,col 9)-(line 5044,col 69)",
        "(line 5045,col 9)-(line 5045,col 72)",
        "(line 5046,col 9)-(line 5046,col 70)",
        "(line 5047,col 9)-(line 5047,col 75)",
        "(line 5048,col 9)-(line 5048,col 73)",
        "(line 5049,col 9)-(line 5049,col 74)",
        "(line 5050,col 9)-(line 5050,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5061,
      "end_line": 5108,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 5064,col 9)-(line 5064,col 35)",
        "(line 5065,col 9)-(line 5065,col 71)",
        "(line 5066,col 9)-(line 5066,col 69)",
        "(line 5067,col 9)-(line 5067,col 70)",
        "(line 5068,col 9)-(line 5068,col 68)",
        "(line 5069,col 9)-(line 5069,col 71)",
        "(line 5070,col 9)-(line 5070,col 69)",
        "(line 5071,col 9)-(line 5071,col 72)",
        "(line 5072,col 9)-(line 5072,col 70)",
        "(line 5073,col 9)-(line 5073,col 75)",
        "(line 5074,col 9)-(line 5074,col 73)",
        "(line 5075,col 9)-(line 5075,col 74)",
        "(line 5076,col 9)-(line 5076,col 72)",
        "(line 5078,col 9)-(line 5084,col 9)",
        "(line 5085,col 9)-(line 5091,col 9)",
        "(line 5092,col 9)-(line 5092,col 48)",
        "(line 5093,col 9)-(line 5098,col 9)",
        "(line 5099,col 9)-(line 5099,col 50)",
        "(line 5100,col 9)-(line 5106,col 9)"
      ]
    }
  ]
}