{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/CategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Pannable",
        "org.jfree.chart.plot.Selectable",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.AnnotationChangeListener",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 266,
      "end_line": 5402,
      "comment": "\r\n * A general plotting class that uses data from a {@link CategoryDataset} and\r\n * renders each data item using a {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_GRIDLINES_VISIBLE"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": "\r\n     * The default visibility of the grid lines plotted against the domain\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_GRIDLINES_VISIBLE"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\r\n     * The default visibility of the grid lines plotted against the range\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 286,
      "end_line": 288,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 294,
      "end_line": 295,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": "\r\n     * The default crosshair visibility.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 309,
      "end_line": 310,
      "comment": "\r\n     * The default crosshair stroke.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": "\r\n     * The default crosshair paint.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 320,
      "end_line": 322,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Storage for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Storage for the domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSharedDomainAxis"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\r\n     * A flag that controls whether or not the shared domain axis is drawn\r\n     * (only relevant when the plot is being used as a subplot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Storage for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Storage for the range axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxesMap"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Storage for keys that map datasets to domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxesMap"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " Storage for keys that map datasets to range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingOrder"
      ],
      "begin_line": 361,
      "end_line": 362,
      "comment": " The dataset rendering order. "
    },
    {
      "type": "field",
      "varNames": [
        "columnRenderingOrder"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": "\r\n     * Controls the order in which the columns are traversed when rendering the\r\n     * data items.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowRenderingOrder"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": "\r\n     * Controls the order in which the rows are traversed when rendering the\r\n     * data items.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": "\r\n     * A flag that controls whether the grid-lines for the domain axis are\r\n     * visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePosition"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " The position of the domain gridlines relative to the category. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " The paint used to draw the domain  grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": "\r\n     * The stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": "\r\n     * The paint used for the zero baseline against the range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": "\r\n     * A flag that controls whether the grid-lines for the range axis are\r\n     * visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " The stroke used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " The paint used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinesVisible"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": "\r\n     * A flag that controls whether or not gridlines are shown for the minor\r\n     * tick values on the primary range axis.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlineStroke"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": "\r\n     * The stroke used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinePaint"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": "\r\n     * The paint used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "anchorValue"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": " The anchor value. "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairDatasetIndex"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": "\r\n     * The index for the dataset that the crosshairs are linked to (this\r\n     * determines which axes the crosshairs are plotted against).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": "\r\n     * A flag that controls the visibility of the domain crosshair.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairRowKey"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": "\r\n     * The row key for the crosshair point.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairColumnKey"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\r\n     * The column key for the crosshair point.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": "\r\n     * The stroke used to draw the domain crosshair if it is visible.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": "\r\n     * The paint used to draw the domain crosshair if it is visible.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": " A flag that controls whether or not a range crosshair is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": "\r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": "\r\n     * The weight for the plot (only relevant when the plot is used as a subplot\r\n     * within a combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": " The fixed space for the domain axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": " The fixed space for the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangePannable"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the\r\n     * range axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shadowGenerator"
      ],
      "begin_line": 561,
      "end_line": 561,
      "comment": "\r\n     * The shadow generator for the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 579,
      "end_line": 671,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the item renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 16)",
        "(line 586,col 9)-(line 586,col 52)",
        "(line 589,col 9)-(line 589,col 43)",
        "(line 590,col 9)-(line 590,col 52)",
        "(line 591,col 9)-(line 591,col 42)",
        "(line 592,col 9)-(line 592,col 51)",
        "(line 594,col 9)-(line 594,col 52)",
        "(line 595,col 9)-(line 595,col 51)",
        "(line 597,col 9)-(line 597,col 42)",
        "(line 599,col 9)-(line 599,col 41)",
        "(line 600,col 9)-(line 600,col 38)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 605,col 66)",
        "(line 607,col 9)-(line 607,col 66)",
        "(line 608,col 9)-(line 608,col 62)",
        "(line 610,col 9)-(line 610,col 40)",
        "(line 611,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 43)",
        "(line 617,col 9)-(line 617,col 42)",
        "(line 618,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 42)",
        "(line 624,col 9)-(line 624,col 41)",
        "(line 625,col 9)-(line 625,col 41)",
        "(line 626,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 30)",
        "(line 632,col 9)-(line 632,col 29)",
        "(line 634,col 9)-(line 634,col 71)",
        "(line 635,col 9)-(line 635,col 60)",
        "(line 636,col 9)-(line 636,col 60)",
        "(line 637,col 9)-(line 637,col 58)",
        "(line 639,col 9)-(line 639,col 46)",
        "(line 640,col 9)-(line 640,col 50)",
        "(line 641,col 9)-(line 641,col 61)",
        "(line 643,col 9)-(line 643,col 69)",
        "(line 644,col 9)-(line 644,col 59)",
        "(line 645,col 9)-(line 645,col 57)",
        "(line 647,col 9)-(line 647,col 48)",
        "(line 648,col 9)-(line 648,col 64)",
        "(line 649,col 9)-(line 649,col 51)",
        "(line 651,col 9)-(line 651,col 53)",
        "(line 652,col 9)-(line 652,col 53)",
        "(line 653,col 9)-(line 653,col 52)",
        "(line 654,col 9)-(line 654,col 52)",
        "(line 656,col 9)-(line 656,col 31)",
        "(line 658,col 9)-(line 658,col 44)",
        "(line 659,col 9)-(line 659,col 62)",
        "(line 660,col 9)-(line 660,col 60)",
        "(line 662,col 9)-(line 662,col 63)",
        "(line 663,col 9)-(line 663,col 39)",
        "(line 664,col 9)-(line 664,col 61)",
        "(line 665,col 9)-(line 665,col 59)",
        "(line 667,col 9)-(line 667,col 53)",
        "(line 669,col 9)-(line 669,col 35)",
        "(line 670,col 9)-(line 670,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getPlotType()",
      "begin_line": 678,
      "end_line": 680,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type.\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getOrientation()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation of the plot (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 701,
      "end_line": 707,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 39)",
        "(line 706,col 9)-(line 706,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAxisOffset()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 728,
      "end_line": 734,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 33)",
        "(line 733,col 9)-(line 733,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\r\n     * Returns the domain axis for the plot.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s\r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setDomainAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis(int)",
      "begin_line": 758,
      "end_line": 771,
      "comment": "\r\n     * Returns a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setDomainAxis(int, CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 35)",
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 781,
      "end_line": 783,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)",
      "begin_line": 806,
      "end_line": 822,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 74)",
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 41)",
        "(line 815,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 821,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxes(org.jfree.chart.axis.CategoryAxis[])",
      "begin_line": 832,
      "end_line": 837,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 852,
      "end_line": 857,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation()",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\r\n     * Returns the domain axis location for the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(int)",
      "begin_line": 879,
      "end_line": 888,
      "comment": "\r\n     * Returns the location for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     *\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 35)",
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "\r\n     * Sets the location of the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 911,
      "end_line": 914,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether listeners are notified.\r\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 926,
      "end_line": 929,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 944,
      "end_line": 954,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 54)",
        "(line 951,col 9)-(line 953,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge()",
      "begin_line": 962,
      "end_line": 964,
      "comment": "\r\n     * Returns the domain axis edge.  This is derived from the axis location\r\n     * and the plot orientation.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(int)",
      "begin_line": 973,
      "end_line": 983,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 36)",
        "(line 975,col 9)-(line 975,col 61)",
        "(line 976,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisCount()",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainAxes()",
      "begin_line": 998,
      "end_line": 1007,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1005,col 32)",
        "(line 1006,col 9)-(line 1006,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureDomainAxes()",
      "begin_line": 1012,
      "end_line": 1019,
      "comment": "\r\n     * Configures the domain axes.\r\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1018,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis()",
      "begin_line": 1028,
      "end_line": 1030,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * null, then the method will return the parent plot\u0027s range axis (if there\r\n     * is a parent plot).\r\n     *\r\n     * @return The range axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis(int)",
      "begin_line": 1039,
      "end_line": 1052,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 32)",
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1071,
      "end_line": 1073,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1083,
      "end_line": 1099,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 67)",
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1091,col 40)",
        "(line 1092,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1098,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1109,
      "end_line": 1114,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setDomainAxes(CategoryAxis[])\r\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1112,col 9)",
        "(line 1113,col 9)-(line 1113,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1129,
      "end_line": 1142,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     * @see #getDomainAxisIndex(CategoryAxis)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 50)",
        "(line 1134,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation()",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\r\n     * Returns the range axis location.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(int)",
      "begin_line": 1162,
      "end_line": 1171,
      "comment": "\r\n     * Returns the location for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     *\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 35)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1182,
      "end_line": 1185,
      "comment": "\r\n     * Sets the location of the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxisLocation(AxisLocation, boolean)\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1196,
      "end_line": 1198,
      "comment": "\r\n     * Sets the location of the range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #setDomainAxisLocation(AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1197,col 9)-(line 1197,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1210,
      "end_line": 1212,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1225,
      "end_line": 1235,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1231,col 53)",
        "(line 1232,col 9)-(line 1234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge()",
      "begin_line": 1242,
      "end_line": 1244,
      "comment": "\r\n     * Returns the edge where the primary range axis is located.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(int)",
      "begin_line": 1253,
      "end_line": 1261,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 60)",
        "(line 1255,col 9)-(line 1256,col 34)",
        "(line 1257,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisCount()",
      "begin_line": 1268,
      "end_line": 1270,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1269,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeAxes()",
      "begin_line": 1276,
      "end_line": 1285,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1282,col 9)",
        "(line 1283,col 9)-(line 1283,col 31)",
        "(line 1284,col 9)-(line 1284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureRangeAxes()",
      "begin_line": 1290,
      "end_line": 1297,
      "comment": "\r\n     * Configures the range axes.\r\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset(int)",
      "begin_line": 1319,
      "end_line": 1325,
      "comment": "\r\n     * Returns the dataset at the given index.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(int, CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 38)",
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1338,
      "end_line": 1340,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset, if there\r\n     * is one.  This method also calls the\r\n     * {@link #datasetChanged(DatasetChangeEvent)} method, which adjusts the\r\n     * axis ranges if necessary and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(int, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1350,
      "end_line": 1367,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 78)",
        "(line 1353,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1356,col 42)",
        "(line 1357,col 9)-(line 1359,col 9)",
        "(line 1362,col 9)-(line 1363,col 41)",
        "(line 1365,col 9)-(line 1365,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetCount()",
      "begin_line": 1376,
      "end_line": 1378,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1377,col 9)-(line 1377,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.indexOf(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1390,
      "end_line": 1399,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 24)",
        "(line 1392,col 9)-(line 1397,col 9)",
        "(line 1398,col 9)-(line 1398,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1409,
      "end_line": 1413,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     *\r\n     * @see #getDomainAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 54)",
        "(line 1411,col 9)-(line 1411,col 48)",
        "(line 1412,col 9)-(line 1412,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxes(int, java.util.List)",
      "begin_line": 1425,
      "end_line": 1436,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 38)",
        "(line 1430,col 9)-(line 1430,col 41)",
        "(line 1431,col 9)-(line 1431,col 73)",
        "(line 1433,col 9)-(line 1434,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.checkAxisIndices(java.util.List)",
      "begin_line": 1445,
      "end_line": 1468,
      "comment": "\r\n     * This method is used to perform argument checking on the list of\r\n     * axis indices passed to mapDatasetToDomainAxes() and\r\n     * mapDatasetToRangeAxes().\r\n     *\r\n     * @param indices  the list of indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1452,col 35)",
        "(line 1453,col 9)-(line 1455,col 9)",
        "(line 1456,col 9)-(line 1456,col 36)",
        "(line 1457,col 9)-(line 1467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(int)",
      "begin_line": 1480,
      "end_line": 1496,
      "comment": "\r\n     * Returns the domain axis for a dataset.  You can change the axis for a\r\n     * dataset using the {@link #mapDatasetToDomainAxis(int, int)} method.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The domain axis.\r\n     *\r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 33)",
        "(line 1485,col 9)-(line 1486,col 36)",
        "(line 1487,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1506,
      "end_line": 1510,
      "comment": "\r\n     * Maps a dataset to a particular range axis.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     *\r\n     * @see #getRangeAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1507,col 54)",
        "(line 1508,col 9)-(line 1508,col 48)",
        "(line 1509,col 9)-(line 1509,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxes(int, java.util.List)",
      "begin_line": 1522,
      "end_line": 1534,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 38)",
        "(line 1527,col 9)-(line 1527,col 41)",
        "(line 1528,col 9)-(line 1528,col 72)",
        "(line 1530,col 9)-(line 1531,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(int)",
      "begin_line": 1546,
      "end_line": 1562,
      "comment": "\r\n     * Returns the range axis for a dataset.  You can change the axis for a\r\n     * dataset using the {@link #mapDatasetToRangeAxis(int, int)} method.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The range axis.\r\n     *\r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1550,col 9)-(line 1550,col 30)",
        "(line 1551,col 9)-(line 1552,col 36)",
        "(line 1553,col 9)-(line 1560,col 9)",
        "(line 1561,col 9)-(line 1561,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererCount()",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "\r\n     * Returns the number of renderer slots for this plot.\r\n     *\r\n     * @return The number of renderer slots.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer()",
      "begin_line": 1582,
      "end_line": 1584,
      "comment": "\r\n     * Returns a reference to the renderer for the plot.\r\n     *\r\n     * @return The renderer.\r\n     *\r\n     * @see #setRenderer(CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1583,col 9)-(line 1583,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer(int)",
      "begin_line": 1595,
      "end_line": 1601,
      "comment": "\r\n     * Returns the renderer at the given index.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(int, CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1596,col 43)",
        "(line 1597,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1600,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\"\r\n     * renderer) and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted.\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1613,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1633,
      "end_line": 1635,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\"\r\n     * renderer) and, if requested, sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cp\u003e\r\n     * You can set the renderer to \u003ccode\u003enull\u003c/code\u003e, but this is not\r\n     * recommended because:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno data will be displayed;\u003c/li\u003e\r\n     *   \u003cli\u003ethe plot background will not be painted;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1634,col 9)-(line 1634,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1647,
      "end_line": 1649,
      "comment": "\r\n     * Sets the renderer at the specified index and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer(int)\r\n     * @see #setRenderer(int, CategoryItemRenderer, boolean)\r\n     ",
      "child_ranges": [
        "(line 1648,col 9)-(line 1648,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1661,
      "end_line": 1684,
      "comment": "\r\n     * Sets a renderer.  A {@link PlotChangeEvent} is sent to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1666,col 63)",
        "(line 1667,col 9)-(line 1669,col 9)",
        "(line 1672,col 9)-(line 1672,col 44)",
        "(line 1673,col 9)-(line 1676,col 9)",
        "(line 1678,col 9)-(line 1678,col 30)",
        "(line 1679,col 9)-(line 1679,col 29)",
        "(line 1681,col 9)-(line 1683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])",
      "begin_line": 1692,
      "end_line": 1697,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param renderers  the renderers.\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1695,col 9)",
        "(line 1696,col 9)-(line 1696,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererForDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1707,
      "end_line": 1716,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  If the dataset doesn\u0027t\r\n     * belong to the plot, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 43)",
        "(line 1709,col 9)-(line 1714,col 9)",
        "(line 1715,col 9)-(line 1715,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1726,
      "end_line": 1728,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1727,col 9)-(line 1727,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetRenderingOrder()",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1751,
      "end_line": 1757,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).  You\r\n     * can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1752,col 9)-(line 1754,col 9)",
        "(line 1755,col 9)-(line 1755,col 36)",
        "(line 1756,col 9)-(line 1756,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getColumnRenderingOrder()",
      "begin_line": 1767,
      "end_line": 1769,
      "comment": "\r\n     * Returns the order in which the columns are rendered.  The default value\r\n     * is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     *\r\n     * @return The column rendering order (never \u003ccode\u003enull\u003c/code).\r\n     *\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1768,col 9)-(line 1768,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1782,
      "end_line": 1788,
      "comment": "\r\n     * Sets the column order in which the items in each dataset should be\r\n     * rendered and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.  Note that this affects the order in which items are drawn,\r\n     * NOT their position in the chart.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getColumnRenderingOrder()\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1783,col 9)-(line 1785,col 9)",
        "(line 1786,col 9)-(line 1786,col 42)",
        "(line 1787,col 9)-(line 1787,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRowRenderingOrder()",
      "begin_line": 1798,
      "end_line": 1800,
      "comment": "\r\n     * Returns the order in which the rows should be rendered.  The default\r\n     * value is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1799,col 9)-(line 1799,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1813,
      "end_line": 1819,
      "comment": "\r\n     * Sets the row order in which the items in each dataset should be\r\n     * rendered and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.  Note that this affects the order in which items are drawn,\r\n     * NOT their position in the chart.\r\n     *\r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRowRenderingOrder()\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1814,col 9)-(line 1816,col 9)",
        "(line 1817,col 9)-(line 1817,col 39)",
        "(line 1818,col 9)-(line 1818,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainGridlinesVisible()",
      "begin_line": 1828,
      "end_line": 1830,
      "comment": "\r\n     * Returns the flag that controls whether the domain grid-lines are visible.\r\n     *\r\n     * @return The \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1829,col 9)-(line 1829,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1843,
      "end_line": 1848,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against\r\n     * the domain axis.\r\n     * \u003cp\u003e\r\n     * If the flag value changes, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1844,col 9)-(line 1847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePosition()",
      "begin_line": 1857,
      "end_line": 1859,
      "comment": "\r\n     * Returns the position used for the domain gridlines.\r\n     *\r\n     * @return The gridline position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePosition(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1858,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 1869,
      "end_line": 1875,
      "comment": "\r\n     * Sets the position used for the domain gridlines and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePosition()\r\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1872,col 9)",
        "(line 1873,col 9)-(line 1873,col 47)",
        "(line 1874,col 9)-(line 1874,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke()",
      "begin_line": 1884,
      "end_line": 1886,
      "comment": "\r\n     * Returns the stroke used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1885,col 9)-(line 1885,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1896,
      "end_line": 1902,
      "comment": "\r\n     * Sets the stroke used to draw grid-lines against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1899,col 9)",
        "(line 1900,col 9)-(line 1900,col 43)",
        "(line 1901,col 9)-(line 1901,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePaint()",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "\r\n     * Returns the paint used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1912,col 9)-(line 1912,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1923,
      "end_line": 1929,
      "comment": "\r\n     * Sets the paint used to draw the grid-lines (if any) against the domain\r\n     * axis and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1924,col 9)-(line 1926,col 9)",
        "(line 1927,col 9)-(line 1927,col 41)",
        "(line 1928,col 9)-(line 1928,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZeroBaselineVisible()",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1942,col 9)-(line 1942,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 1956,
      "end_line": 1959,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isRangeZeroBaselineVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1957,col 9)-(line 1957,col 48)",
        "(line 1958,col 9)-(line 1958,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeZeroBaselineStroke()",
      "begin_line": 1970,
      "end_line": 1972,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1971,col 9)-(line 1971,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1984,
      "end_line": 1990,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1985,col 9)-(line 1987,col 9)",
        "(line 1988,col 9)-(line 1988,col 46)",
        "(line 1989,col 9)-(line 1989,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeZeroBaselinePaint()",
      "begin_line": 2002,
      "end_line": 2004,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2003,col 9)-(line 2003,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 2016,
      "end_line": 2022,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2017,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2020,col 44)",
        "(line 2021,col 9)-(line 2021,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeGridlinesVisible()",
      "begin_line": 2031,
      "end_line": 2033,
      "comment": "\r\n     * Returns the flag that controls whether the range grid-lines are visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2032,col 9)-(line 2032,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 2044,
      "end_line": 2049,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against\r\n     * the range axis.  If the flag changes value, a {@link PlotChangeEvent} is\r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2048,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke()",
      "begin_line": 2058,
      "end_line": 2060,
      "comment": "\r\n     * Returns the stroke used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 2059,col 9)-(line 2059,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 2070,
      "end_line": 2076,
      "comment": "\r\n     * Sets the stroke used to draw the grid-lines against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 2071,col 9)-(line 2073,col 9)",
        "(line 2074,col 9)-(line 2074,col 42)",
        "(line 2075,col 9)-(line 2075,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlinePaint()",
      "begin_line": 2085,
      "end_line": 2087,
      "comment": "\r\n     * Returns the paint used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2086,col 9)-(line 2086,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 2097,
      "end_line": 2103,
      "comment": "\r\n     * Sets the paint used to draw the grid lines against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 2098,col 9)-(line 2100,col 9)",
        "(line 2101,col 9)-(line 2101,col 40)",
        "(line 2102,col 9)-(line 2102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeMinorGridlinesVisible()",
      "begin_line": 2115,
      "end_line": 2117,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis minor grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2116,col 9)-(line 2116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlinesVisible(boolean)",
      "begin_line": 2132,
      "end_line": 2137,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis minor grid\r\n     * lines are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2133,col 9)-(line 2136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMinorGridlineStroke()",
      "begin_line": 2149,
      "end_line": 2151,
      "comment": "\r\n     * Returns the stroke for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2150,col 9)-(line 2150,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 2163,
      "end_line": 2169,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2164,col 9)-(line 2166,col 9)",
        "(line 2167,col 9)-(line 2167,col 47)",
        "(line 2168,col 9)-(line 2168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMinorGridlinePaint()",
      "begin_line": 2181,
      "end_line": 2183,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2182,col 9)-(line 2182,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 2195,
      "end_line": 2201,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the range axis\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2196,col 9)-(line 2198,col 9)",
        "(line 2199,col 9)-(line 2199,col 45)",
        "(line 2200,col 9)-(line 2200,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedLegendItems()",
      "begin_line": 2210,
      "end_line": 2212,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 2211,col 9)-(line 2211,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 2223,
      "end_line": 2226,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 2224,col 9)-(line 2224,col 38)",
        "(line 2225,col 9)-(line 2225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getLegendItems()",
      "begin_line": 2235,
      "end_line": 2259,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method creates\r\n     * a legend item for each series in each of the datasets.  You can change\r\n     * this behaviour by overriding this method.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 2236,col 9)-(line 2236,col 60)",
        "(line 2237,col 9)-(line 2257,col 9)",
        "(line 2258,col 9)-(line 2258,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2269,
      "end_line": 2289,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 2271,col 9)-(line 2271,col 50)",
        "(line 2272,col 9)-(line 2287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoom(double)",
      "begin_line": 2300,
      "end_line": 2312,
      "comment": "\r\n     * Zooms (in or out) on the plot\u0027s value axis.\r\n     * \u003cp\u003e\r\n     * If the value 0.0 is passed in as the zoom percent, the auto-range\r\n     * calculation for the axis is restored (which sets the range to include\r\n     * the minimum and maximum data values, thus displaying all the data).\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": [
        "(line 2302,col 9)-(line 2310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.annotationChanged(org.jfree.chart.event.AnnotationChangeEvent)",
      "begin_line": 2322,
      "end_line": 2330,
      "comment": "\r\n     * Receives notification of a change to an {@link Annotation} added to\r\n     * this plot.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 2323,col 9)-(line 2329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 2339,
      "end_line": 2357,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The range axis bounds will be recalculated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 42)",
        "(line 2342,col 9)-(line 2347,col 9)",
        "(line 2348,col 9)-(line 2355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 2364,
      "end_line": 2383,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 2365,col 9)-(line 2365,col 34)",
        "(line 2366,col 9)-(line 2382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker)",
      "begin_line": 2395,
      "end_line": 2397,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a\r\n     * marker will be drawn by the renderer as a line perpendicular to the\r\n     * domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeDomainMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2396,col 9)-(line 2396,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 2411,
      "end_line": 2413,
      "comment": "\r\n     * Adds a marker for display against the domain axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker\r\n     * will be drawn by the renderer as a line perpendicular to the domain\r\n     * axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e\r\n     *               not permitted).\r\n     *\r\n     * @see #removeDomainMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2412,col 9)-(line 2412,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 2428,
      "end_line": 2430,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2429,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2448,
      "end_line": 2479,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #removeDomainMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2450,col 9)-(line 2452,col 9)",
        "(line 2453,col 9)-(line 2455,col 9)",
        "(line 2456,col 9)-(line 2456,col 27)",
        "(line 2457,col 9)-(line 2474,col 9)",
        "(line 2475,col 9)-(line 2475,col 39)",
        "(line 2476,col 9)-(line 2478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers()",
      "begin_line": 2487,
      "end_line": 2507,
      "comment": "\r\n     * Clears all the domain markers for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2488,col 9)-(line 2496,col 9)",
        "(line 2497,col 9)-(line 2505,col 9)",
        "(line 2506,col 9)-(line 2506,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2516,
      "end_line": 2518,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     ",
      "child_ranges": [
        "(line 2517,col 9)-(line 2517,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2529,
      "end_line": 2542,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2530,col 9)-(line 2530,col 33)",
        "(line 2531,col 9)-(line 2531,col 41)",
        "(line 2532,col 9)-(line 2537,col 9)",
        "(line 2538,col 9)-(line 2540,col 9)",
        "(line 2541,col 9)-(line 2541,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(int)",
      "begin_line": 2551,
      "end_line": 2578,
      "comment": "\r\n     * Clears all the domain markers for the specified renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2552,col 9)-(line 2552,col 41)",
        "(line 2553,col 9)-(line 2564,col 9)",
        "(line 2565,col 9)-(line 2576,col 9)",
        "(line 2577,col 9)-(line 2577,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2591,
      "end_line": 2593,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2592,col 9)-(line 2592,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2607,
      "end_line": 2609,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2608,col 9)-(line 2608,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2624,
      "end_line": 2626,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2625,col 9)-(line 2625,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2642,
      "end_line": 2661,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2644,col 26)",
        "(line 2645,col 9)-(line 2652,col 9)",
        "(line 2653,col 9)-(line 2655,col 9)",
        "(line 2656,col 9)-(line 2656,col 49)",
        "(line 2657,col 9)-(line 2659,col 9)",
        "(line 2660,col 9)-(line 2660,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2673,
      "end_line": 2675,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a\r\n     * marker will be drawn by the renderer as a line perpendicular to the\r\n     * range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2674,col 9)-(line 2674,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2689,
      "end_line": 2691,
      "comment": "\r\n     * Adds a marker for display against the range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker\r\n     * will be drawn by the renderer as a line perpendicular to the range axis,\r\n     * however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e\r\n     *               not permitted).\r\n     *\r\n     * @see #removeRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2690,col 9)-(line 2690,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2706,
      "end_line": 2708,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     *\r\n     * @see #removeRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2707,col 9)-(line 2707,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2726,
      "end_line": 2751,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #removeRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2728,col 9)-(line 2728,col 27)",
        "(line 2729,col 9)-(line 2746,col 9)",
        "(line 2747,col 9)-(line 2747,col 39)",
        "(line 2748,col 9)-(line 2750,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers()",
      "begin_line": 2759,
      "end_line": 2779,
      "comment": "\r\n     * Clears all the range markers for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2760,col 9)-(line 2768,col 9)",
        "(line 2769,col 9)-(line 2777,col 9)",
        "(line 2778,col 9)-(line 2778,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2790,
      "end_line": 2792,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     *\r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 2791,col 9)-(line 2791,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2803,
      "end_line": 2816,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2804,col 9)-(line 2804,col 33)",
        "(line 2805,col 9)-(line 2805,col 41)",
        "(line 2806,col 9)-(line 2811,col 9)",
        "(line 2812,col 9)-(line 2814,col 9)",
        "(line 2815,col 9)-(line 2815,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(int)",
      "begin_line": 2825,
      "end_line": 2852,
      "comment": "\r\n     * Clears all the range markers for the specified renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearDomainMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2826,col 9)-(line 2826,col 41)",
        "(line 2827,col 9)-(line 2838,col 9)",
        "(line 2839,col 9)-(line 2850,col 9)",
        "(line 2851,col 9)-(line 2851,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2867,
      "end_line": 2869,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2868,col 9)-(line 2868,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2885,
      "end_line": 2887,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2886,col 9)-(line 2886,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2904,
      "end_line": 2906,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2905,col 9)-(line 2905,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2924,
      "end_line": 2946,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2926,col 9)-(line 2928,col 9)",
        "(line 2929,col 9)-(line 2929,col 26)",
        "(line 2930,col 9)-(line 2937,col 9)",
        "(line 2938,col 9)-(line 2940,col 9)",
        "(line 2941,col 9)-(line 2941,col 49)",
        "(line 2942,col 9)-(line 2944,col 9)",
        "(line 2945,col 9)-(line 2945,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainCrosshairVisible()",
      "begin_line": 2958,
      "end_line": 2960,
      "comment": "\r\n     * Returns the flag that controls whether or not the domain crosshair is\r\n     * displayed by the plot.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2959,col 9)-(line 2959,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 2974,
      "end_line": 2979,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain crosshair is\r\n     * displayed by the plot, and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new flag value.\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2975,col 9)-(line 2978,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairRowKey()",
      "begin_line": 2988,
      "end_line": 2990,
      "comment": "\r\n     * Returns the row key for the domain crosshair.\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2989,col 9)-(line 2989,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairRowKey(java.lang.Comparable)",
      "begin_line": 3000,
      "end_line": 3002,
      "comment": "\r\n     * Sets the row key for the domain crosshair and sends a\r\n     * {PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3001,col 9)-(line 3001,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairRowKey(java.lang.Comparable, boolean)",
      "begin_line": 3013,
      "end_line": 3018,
      "comment": "\r\n     * Sets the row key for the domain crosshair and, if requested, sends a\r\n     * {PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3014,col 9)-(line 3014,col 41)",
        "(line 3015,col 9)-(line 3017,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairColumnKey()",
      "begin_line": 3027,
      "end_line": 3029,
      "comment": "\r\n     * Returns the column key for the domain crosshair.\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3028,col 9)-(line 3028,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairColumnKey(java.lang.Comparable)",
      "begin_line": 3039,
      "end_line": 3041,
      "comment": "\r\n     * Sets the column key for the domain crosshair and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3040,col 9)-(line 3040,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairColumnKey(java.lang.Comparable, boolean)",
      "begin_line": 3052,
      "end_line": 3057,
      "comment": "\r\n     * Sets the column key for the domain crosshair and, if requested, sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param key  the key.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3053,col 9)-(line 3053,col 44)",
        "(line 3054,col 9)-(line 3056,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCrosshairDatasetIndex()",
      "begin_line": 3066,
      "end_line": 3068,
      "comment": "\r\n     * Returns the dataset index for the crosshair.\r\n     *\r\n     * @return The dataset index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3067,col 9)-(line 3067,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setCrosshairDatasetIndex(int)",
      "begin_line": 3078,
      "end_line": 3080,
      "comment": "\r\n     * Sets the dataset index for the crosshair and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3079,col 9)-(line 3079,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setCrosshairDatasetIndex(int, boolean)",
      "begin_line": 3091,
      "end_line": 3096,
      "comment": "\r\n     * Sets the dataset index for the crosshair and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3092,col 9)-(line 3092,col 43)",
        "(line 3093,col 9)-(line 3095,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairPaint()",
      "begin_line": 3108,
      "end_line": 3110,
      "comment": "\r\n     * Returns the paint used to draw the domain crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3109,col 9)-(line 3109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 3121,
      "end_line": 3127,
      "comment": "\r\n     * Sets the paint used to draw the domain crosshair.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3122,col 9)-(line 3124,col 9)",
        "(line 3125,col 9)-(line 3125,col 42)",
        "(line 3126,col 9)-(line 3126,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainCrosshairStroke()",
      "begin_line": 3139,
      "end_line": 3141,
      "comment": "\r\n     * Returns the stroke used to draw the domain crosshair.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #getDomainCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3140,col 9)-(line 3140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 3153,
      "end_line": 3158,
      "comment": "\r\n     * Sets the stroke used to draw the domain crosshair, and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getDomainCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3154,col 9)-(line 3156,col 9)",
        "(line 3157,col 9)-(line 3157,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairVisible()",
      "begin_line": 3167,
      "end_line": 3169,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 3168,col 9)-(line 3168,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 3178,
      "end_line": 3183,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 3179,col 9)-(line 3182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 3193,
      "end_line": 3195,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 3194,col 9)-(line 3194,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 3206,
      "end_line": 3211,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values, and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 3207,col 9)-(line 3210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairValue()",
      "begin_line": 3220,
      "end_line": 3222,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 3221,col 9)-(line 3221,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double)",
      "begin_line": 3232,
      "end_line": 3234,
      "comment": "\r\n     * Sets the range crosshair value and, if the crosshair is visible, sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the new value.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 3233,col 9)-(line 3233,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 3247,
      "end_line": 3252,
      "comment": "\r\n     * Sets the range crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (but only if the\r\n     * crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 3248,col 9)-(line 3248,col 41)",
        "(line 3249,col 9)-(line 3251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke()",
      "begin_line": 3264,
      "end_line": 3266,
      "comment": "\r\n     * Returns the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the crosshair\r\n     * (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3265,col 9)-(line 3265,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 3278,
      "end_line": 3284,
      "comment": "\r\n     * Sets the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the range\r\n     * crosshair (if visible), and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3279,col 9)-(line 3281,col 9)",
        "(line 3282,col 9)-(line 3282,col 43)",
        "(line 3283,col 9)-(line 3283,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairPaint()",
      "begin_line": 3295,
      "end_line": 3297,
      "comment": "\r\n     * Returns the paint used to draw the range crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 3296,col 9)-(line 3296,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 3307,
      "end_line": 3313,
      "comment": "\r\n     * Sets the paint used to draw the range crosshair (if visible) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 3308,col 9)-(line 3310,col 9)",
        "(line 3311,col 9)-(line 3311,col 41)",
        "(line 3312,col 9)-(line 3312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnnotations()",
      "begin_line": 3323,
      "end_line": 3325,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     * @see #clearAnnotations()\r\n     ",
      "child_ranges": [
        "(line 3324,col 9)-(line 3324,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 3335,
      "end_line": 3337,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3336,col 9)-(line 3336,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 3348,
      "end_line": 3356,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 3349,col 9)-(line 3351,col 9)",
        "(line 3352,col 9)-(line 3352,col 41)",
        "(line 3353,col 9)-(line 3355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 3368,
      "end_line": 3370,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 3369,col 9)-(line 3369,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 3383,
      "end_line": 3394,
      "comment": "\r\n     * Removes an annotation from the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 3385,col 9)-(line 3387,col 9)",
        "(line 3388,col 9)-(line 3388,col 62)",
        "(line 3389,col 9)-(line 3389,col 46)",
        "(line 3390,col 9)-(line 3392,col 9)",
        "(line 3393,col 9)-(line 3393,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearAnnotations()",
      "begin_line": 3400,
      "end_line": 3408,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     ",
      "child_ranges": [
        "(line 3401,col 9)-(line 3405,col 9)",
        "(line 3406,col 9)-(line 3406,col 33)",
        "(line 3407,col 9)-(line 3407,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getShadowGenerator()",
      "begin_line": 3417,
      "end_line": 3419,
      "comment": "\r\n     * Returns the shadow generator for the plot, if any.\r\n     *\r\n     * @return The shadow generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 3418,col 9)-(line 3418,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setShadowGenerator(org.jfree.chart.util.ShadowGenerator)",
      "begin_line": 3432,
      "end_line": 3435,
      "comment": "\r\n     * Sets the shadow generator for the plot and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  Note that this is\r\n     * a btmap drop-shadow generation facility and is separate from the\r\n     * vector based show option that is controlled via the\r\n     * {@link setShadowPaint()} method.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 3433,col 9)-(line 3433,col 41)",
        "(line 3434,col 9)-(line 3434,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3446,
      "end_line": 3490,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3450,col 9)-(line 3452,col 9)",
        "(line 3455,col 9)-(line 3486,col 9)",
        "(line 3488,col 9)-(line 3488,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3501,
      "end_line": 3536,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 3505,col 9)-(line 3507,col 9)",
        "(line 3510,col 9)-(line 3533,col 9)",
        "(line 3534,col 9)-(line 3534,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.integerise(java.awt.geom.Rectangle2D)",
      "begin_line": 3545,
      "end_line": 3551,
      "comment": "\r\n     * Trims a rectangle to integer coordinates.\r\n     *\r\n     * @param rect  the incoming rectangle.\r\n     *\r\n     * @return A rectangle with integer coordinates.\r\n     ",
      "child_ranges": [
        "(line 3546,col 9)-(line 3546,col 49)",
        "(line 3547,col 9)-(line 3547,col 49)",
        "(line 3548,col 9)-(line 3548,col 50)",
        "(line 3549,col 9)-(line 3549,col 50)",
        "(line 3550,col 9)-(line 3550,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3561,
      "end_line": 3567,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 3563,col 9)-(line 3563,col 42)",
        "(line 3564,col 9)-(line 3564,col 61)",
        "(line 3565,col 9)-(line 3565,col 62)",
        "(line 3566,col 9)-(line 3566,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3585,
      "end_line": 3849,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     * \u003cP\u003e\r\n     * At your option, you may supply an instance of {@link PlotRenderingInfo}.\r\n     * If you do, it will be populated with information about the drawing,\r\n     * including various plot dimensions and tooltip info.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes) should\r\n     *              be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param state  collects info as the chart is drawn (possibly\r\n     *               \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 3589,col 9)-(line 3589,col 64)",
        "(line 3590,col 9)-(line 3590,col 66)",
        "(line 3591,col 9)-(line 3593,col 9)",
        "(line 3596,col 9)-(line 3601,col 9)",
        "(line 3602,col 9)-(line 3602,col 32)",
        "(line 3605,col 9)-(line 3605,col 45)",
        "(line 3606,col 9)-(line 3606,col 26)",
        "(line 3609,col 9)-(line 3609,col 55)",
        "(line 3610,col 9)-(line 3610,col 56)",
        "(line 3611,col 9)-(line 3611,col 39)",
        "(line 3612,col 9)-(line 3612,col 40)",
        "(line 3613,col 9)-(line 3615,col 9)",
        "(line 3616,col 9)-(line 3616,col 36)",
        "(line 3617,col 9)-(line 3617,col 78)",
        "(line 3621,col 9)-(line 3626,col 9)",
        "(line 3628,col 9)-(line 3628,col 63)",
        "(line 3632,col 9)-(line 3635,col 9)",
        "(line 3636,col 9)-(line 3636,col 77)",
        "(line 3637,col 9)-(line 3637,col 70)",
        "(line 3638,col 9)-(line 3638,col 41)",
        "(line 3643,col 9)-(line 3643,col 46)",
        "(line 3644,col 9)-(line 3644,col 46)",
        "(line 3645,col 9)-(line 3659,col 9)",
        "(line 3660,col 9)-(line 3660,col 61)",
        "(line 3661,col 9)-(line 3661,col 67)",
        "(line 3662,col 9)-(line 3662,col 63)",
        "(line 3665,col 9)-(line 3665,col 39)",
        "(line 3666,col 9)-(line 3666,col 26)",
        "(line 3668,col 9)-(line 3668,col 42)",
        "(line 3670,col 9)-(line 3670,col 80)",
        "(line 3671,col 9)-(line 3676,col 9)",
        "(line 3677,col 9)-(line 3680,col 9)",
        "(line 3682,col 9)-(line 3682,col 32)",
        "(line 3683,col 9)-(line 3683,col 45)",
        "(line 3684,col 9)-(line 3684,col 39)",
        "(line 3685,col 9)-(line 3692,col 9)",
        "(line 3695,col 9)-(line 3697,col 9)",
        "(line 3698,col 9)-(line 3700,col 9)",
        "(line 3703,col 9)-(line 3703,col 34)",
        "(line 3706,col 9)-(line 3706,col 56)",
        "(line 3707,col 9)-(line 3708,col 64)",
        "(line 3710,col 9)-(line 3710,col 65)",
        "(line 3711,col 9)-(line 3770,col 9)",
        "(line 3773,col 9)-(line 3775,col 9)",
        "(line 3776,col 9)-(line 3778,col 9)",
        "(line 3781,col 9)-(line 3781,col 45)",
        "(line 3783,col 9)-(line 3794,col 9)",
        "(line 3795,col 9)-(line 3795,col 30)",
        "(line 3796,col 9)-(line 3796,col 43)",
        "(line 3798,col 9)-(line 3800,col 9)",
        "(line 3802,col 9)-(line 3802,col 60)",
        "(line 3803,col 9)-(line 3803,col 54)",
        "(line 3806,col 9)-(line 3806,col 55)",
        "(line 3807,col 9)-(line 3807,col 61)",
        "(line 3808,col 9)-(line 3808,col 48)",
        "(line 3809,col 9)-(line 3809,col 54)",
        "(line 3810,col 9)-(line 3815,col 9)",
        "(line 3818,col 9)-(line 3818,col 63)",
        "(line 3819,col 9)-(line 3819,col 53)",
        "(line 3820,col 9)-(line 3829,col 9)",
        "(line 3830,col 9)-(line 3830,col 70)",
        "(line 3831,col 9)-(line 3837,col 9)",
        "(line 3840,col 9)-(line 3847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3861,
      "end_line": 3864,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is\r\n     * declared public so that it can be accessed by the renderers used by\r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 3862,col 9)-(line 3862,col 51)",
        "(line 3863,col 9)-(line 3863,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3877,
      "end_line": 3960,
      "comment": "\r\n     * A utility method for drawing the plot\u0027s axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 3882,col 9)-(line 3882,col 61)",
        "(line 3885,col 9)-(line 3890,col 9)",
        "(line 3893,col 9)-(line 3898,col 9)",
        "(line 3900,col 9)-(line 3900,col 41)",
        "(line 3903,col 9)-(line 3904,col 38)",
        "(line 3905,col 9)-(line 3905,col 69)",
        "(line 3906,col 9)-(line 3914,col 9)",
        "(line 3917,col 9)-(line 3918,col 79)",
        "(line 3919,col 9)-(line 3919,col 63)",
        "(line 3920,col 9)-(line 3928,col 9)",
        "(line 3931,col 9)-(line 3932,col 76)",
        "(line 3933,col 9)-(line 3933,col 61)",
        "(line 3934,col 9)-(line 3942,col 9)",
        "(line 3945,col 9)-(line 3946,col 77)",
        "(line 3947,col 9)-(line 3947,col 62)",
        "(line 3948,col 9)-(line 3956,col 9)",
        "(line 3958,col 9)-(line 3958,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CategoryCrosshairState)",
      "begin_line": 3977,
      "end_line": 4057,
      "comment": "\r\n     * Draws a representation of a dataset within the dataArea region using the\r\n     * appropriate renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset and renderer index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  a state object for tracking crosshair info\r\n     *        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean that indicates whether or not real data was found.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 3980,col 9)-(line 3980,col 34)",
        "(line 3981,col 9)-(line 3981,col 59)",
        "(line 3982,col 9)-(line 3982,col 59)",
        "(line 3983,col 9)-(line 3983,col 65)",
        "(line 3984,col 9)-(line 3984,col 60)",
        "(line 3985,col 9)-(line 3985,col 74)",
        "(line 3986,col 9)-(line 4054,col 9)",
        "(line 4055,col 9)-(line 4055,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 4067,
      "end_line": 4092,
      "comment": "\r\n     * Draws the domain gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     *\r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 4069,col 9)-(line 4071,col 9)",
        "(line 4072,col 9)-(line 4072,col 60)",
        "(line 4073,col 9)-(line 4073,col 59)",
        "(line 4074,col 9)-(line 4074,col 47)",
        "(line 4075,col 9)-(line 4077,col 9)",
        "(line 4078,col 9)-(line 4078,col 44)",
        "(line 4079,col 9)-(line 4091,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 4103,
      "end_line": 4145,
      "comment": "\r\n     * Draws the range gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 4106,col 9)-(line 4108,col 9)",
        "(line 4110,col 9)-(line 4110,col 40)",
        "(line 4111,col 9)-(line 4113,col 9)",
        "(line 4115,col 9)-(line 4115,col 47)",
        "(line 4116,col 9)-(line 4118,col 9)",
        "(line 4120,col 9)-(line 4120,col 33)",
        "(line 4121,col 9)-(line 4121,col 31)",
        "(line 4122,col 9)-(line 4122,col 34)",
        "(line 4123,col 9)-(line 4123,col 45)",
        "(line 4124,col 9)-(line 4144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 4157,
      "end_line": 4164,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4158,col 9)-(line 4160,col 9)",
        "(line 4161,col 9)-(line 4161,col 47)",
        "(line 4162,col 9)-(line 4163,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 4173,
      "end_line": 4184,
      "comment": "\r\n     * Draws the annotations.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 4176,col 9)-(line 4176,col 56)",
        "(line 4177,col 9)-(line 4182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4197,
      "end_line": 4215,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #drawRangeMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4200,col 9)-(line 4200,col 52)",
        "(line 4201,col 9)-(line 4203,col 9)",
        "(line 4205,col 9)-(line 4205,col 60)",
        "(line 4206,col 9)-(line 4206,col 59)",
        "(line 4207,col 9)-(line 4213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4228,
      "end_line": 4246,
      "comment": "\r\n     * Draws the range markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #drawDomainMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 4231,col 9)-(line 4231,col 52)",
        "(line 4232,col 9)-(line 4234,col 9)",
        "(line 4236,col 9)-(line 4236,col 59)",
        "(line 4237,col 9)-(line 4237,col 55)",
        "(line 4238,col 9)-(line 4244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4258,
      "end_line": 4276,
      "comment": "\r\n     * Utility method for drawing a line perpendicular to the range axis (used\r\n     * for crosshairs).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param value  the data value.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 4261,col 9)-(line 4262,col 36)",
        "(line 4263,col 9)-(line 4263,col 27)",
        "(line 4264,col 9)-(line 4271,col 9)",
        "(line 4272,col 9)-(line 4272,col 29)",
        "(line 4273,col 9)-(line 4273,col 27)",
        "(line 4274,col 9)-(line 4274,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, int, java.lang.Comparable, java.lang.Comparable, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4295,
      "end_line": 4320,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param datasetIndex  the dataset index.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @see #drawRangeCrosshair(Graphics2D, Rectangle2D, PlotOrientation,\r\n     *     double, ValueAxis, Stroke, Paint)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 4300,col 9)-(line 4300,col 59)",
        "(line 4301,col 9)-(line 4301,col 66)",
        "(line 4302,col 9)-(line 4302,col 66)",
        "(line 4303,col 9)-(line 4303,col 27)",
        "(line 4304,col 9)-(line 4315,col 9)",
        "(line 4316,col 9)-(line 4316,col 29)",
        "(line 4317,col 9)-(line 4317,col 27)",
        "(line 4318,col 9)-(line 4318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4338,
      "end_line": 4362,
      "comment": "\r\n     * Draws a range crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @see #drawDomainCrosshair(Graphics2D, Rectangle2D, PlotOrientation, int,\r\n     *      Comparable, Comparable, Stroke, Paint)\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 4342,col 9)-(line 4344,col 9)",
        "(line 4345,col 9)-(line 4345,col 27)",
        "(line 4346,col 9)-(line 4357,col 9)",
        "(line 4358,col 9)-(line 4358,col 29)",
        "(line 4359,col 9)-(line 4359,col 27)",
        "(line 4360,col 9)-(line 4360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4373,
      "end_line": 4398,
      "comment": "\r\n     * Returns the range of data values that will be plotted against the range\r\n     * axis.  If the dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The data range.\r\n     ",
      "child_ranges": [
        "(line 4375,col 9)-(line 4375,col 28)",
        "(line 4376,col 9)-(line 4376,col 46)",
        "(line 4378,col 9)-(line 4378,col 54)",
        "(line 4379,col 9)-(line 4384,col 9)",
        "(line 4388,col 9)-(line 4388,col 54)",
        "(line 4389,col 9)-(line 4395,col 9)",
        "(line 4396,col 9)-(line 4396,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(int)",
      "begin_line": 4410,
      "end_line": 4433,
      "comment": "\r\n     * Returns a list of the datasets that are mapped to the axis with the\r\n     * specified index.\r\n     *\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @return The list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 4411,col 9)-(line 4411,col 45)",
        "(line 4412,col 9)-(line 4412,col 38)",
        "(line 4413,col 9)-(line 4431,col 9)",
        "(line 4432,col 9)-(line 4432,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(int)",
      "begin_line": 4443,
      "end_line": 4461,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * given range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 4444,col 9)-(line 4444,col 41)",
        "(line 4445,col 9)-(line 4445,col 38)",
        "(line 4446,col 9)-(line 4459,col 9)",
        "(line 4460,col 9)-(line 4460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getWeight()",
      "begin_line": 4471,
      "end_line": 4473,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     *\r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 4472,col 9)-(line 4472,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setWeight(int)",
      "begin_line": 4483,
      "end_line": 4486,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     *\r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 4484,col 9)-(line 4484,col 29)",
        "(line 4485,col 9)-(line 4485,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedDomainAxisSpace()",
      "begin_line": 4495,
      "end_line": 4497,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4496,col 9)-(line 4496,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4507,
      "end_line": 4509,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4508,col 9)-(line 4508,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4522,
      "end_line": 4527,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4523,col 9)-(line 4523,col 42)",
        "(line 4524,col 9)-(line 4526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedRangeAxisSpace()",
      "begin_line": 4536,
      "end_line": 4538,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 4537,col 9)-(line 4537,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4548,
      "end_line": 4550,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 4549,col 9)-(line 4549,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4563,
      "end_line": 4568,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4564,col 9)-(line 4564,col 41)",
        "(line 4565,col 9)-(line 4567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategories()",
      "begin_line": 4577,
      "end_line": 4583,
      "comment": "\r\n     * Returns a list of the categories in the plot\u0027s primary dataset.\r\n     *\r\n     * @return A list of the categories in the plot\u0027s primary dataset.\r\n     *\r\n     * @see #getCategoriesForAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 4578,col 9)-(line 4578,col 27)",
        "(line 4579,col 9)-(line 4581,col 9)",
        "(line 4582,col 9)-(line 4582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 4595,
      "end_line": 4611,
      "comment": "\r\n     * Returns a list of the categories that should be displayed for the\r\n     * specified axis.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     *\r\n     * @return The categories.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 4596,col 9)-(line 4596,col 38)",
        "(line 4597,col 9)-(line 4597,col 54)",
        "(line 4598,col 9)-(line 4598,col 62)",
        "(line 4599,col 9)-(line 4599,col 48)",
        "(line 4600,col 9)-(line 4609,col 9)",
        "(line 4610,col 9)-(line 4610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDrawSharedDomainAxis()",
      "begin_line": 4621,
      "end_line": 4623,
      "comment": "\r\n     * Returns the flag that controls whether or not the shared domain axis is\r\n     * drawn for each subplot.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setDrawSharedDomainAxis(boolean)\r\n     ",
      "child_ranges": [
        "(line 4622,col 9)-(line 4622,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis(boolean)",
      "begin_line": 4633,
      "end_line": 4636,
      "comment": "\r\n     * Sets the flag that controls whether the shared domain axis is drawn when\r\n     * this plot is being used as a subplot.\r\n     *\r\n     * @param draw  a boolean.\r\n     *\r\n     * @see #getDrawSharedDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 4634,col 9)-(line 4634,col 41)",
        "(line 4635,col 9)-(line 4635,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainPannable()",
      "begin_line": 4648,
      "end_line": 4650,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always, because the plot cannot be panned\r\n     * along the domain axis/axes.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isRangePannable()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4649,col 9)-(line 4649,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangePannable()",
      "begin_line": 4663,
      "end_line": 4665,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the range axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangePannable(boolean)\r\n     * @see #isDomainPannable()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4664,col 9)-(line 4664,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangePannable(boolean)",
      "begin_line": 4677,
      "end_line": 4679,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along\r\n     * the range axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @see #isRangePannable()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4678,col 9)-(line 4678,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4690,
      "end_line": 4693,
      "comment": "\r\n     * Pans the domain axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4704,
      "end_line": 4723,
      "comment": "\r\n     * Pans the range axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 4706,col 9)-(line 4708,col 9)",
        "(line 4709,col 9)-(line 4709,col 49)",
        "(line 4710,col 9)-(line 4722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainZoomable()",
      "begin_line": 4733,
      "end_line": 4735,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that the domain axes are not\r\n     * zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 4734,col 9)-(line 4734,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZoomable()",
      "begin_line": 4744,
      "end_line": 4746,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axes are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 4745,col 9)-(line 4745,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4756,
      "end_line": 4759,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4770,
      "end_line": 4773,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4788,
      "end_line": 4791,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t\r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4800,
      "end_line": 4804,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 4803,col 9)-(line 4803,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4819,
      "end_line": 4842,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 4823,col 9)-(line 4841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4852,
      "end_line": 4860,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 4854,col 9)-(line 4859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnchorValue()",
      "begin_line": 4869,
      "end_line": 4871,
      "comment": "\r\n     * Returns the anchor value.\r\n     *\r\n     * @return The anchor value.\r\n     *\r\n     * @see #setAnchorValue(double)\r\n     ",
      "child_ranges": [
        "(line 4870,col 9)-(line 4870,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double)",
      "begin_line": 4881,
      "end_line": 4883,
      "comment": "\r\n     * Sets the anchor value and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param value  the anchor value.\r\n     *\r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 4882,col 9)-(line 4882,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double, boolean)",
      "begin_line": 4894,
      "end_line": 4899,
      "comment": "\r\n     * Sets the anchor value and, if requested, sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 4895,col 9)-(line 4895,col 33)",
        "(line 4896,col 9)-(line 4898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.equals(java.lang.Object)",
      "begin_line": 4908,
      "end_line": 5087,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 4909,col 9)-(line 4911,col 9)",
        "(line 4912,col 9)-(line 4914,col 9)",
        "(line 4915,col 9)-(line 4915,col 47)",
        "(line 4916,col 9)-(line 4918,col 9)",
        "(line 4919,col 9)-(line 4921,col 9)",
        "(line 4922,col 9)-(line 4924,col 9)",
        "(line 4925,col 9)-(line 4927,col 9)",
        "(line 4928,col 9)-(line 4930,col 9)",
        "(line 4931,col 9)-(line 4933,col 9)",
        "(line 4934,col 9)-(line 4936,col 9)",
        "(line 4937,col 9)-(line 4940,col 9)",
        "(line 4941,col 9)-(line 4944,col 9)",
        "(line 4945,col 9)-(line 4947,col 9)",
        "(line 4948,col 9)-(line 4950,col 9)",
        "(line 4951,col 9)-(line 4953,col 9)",
        "(line 4954,col 9)-(line 4956,col 9)",
        "(line 4957,col 9)-(line 4959,col 9)",
        "(line 4960,col 9)-(line 4962,col 9)",
        "(line 4963,col 9)-(line 4966,col 9)",
        "(line 4967,col 9)-(line 4970,col 9)",
        "(line 4971,col 9)-(line 4973,col 9)",
        "(line 4974,col 9)-(line 4977,col 9)",
        "(line 4978,col 9)-(line 4981,col 9)",
        "(line 4982,col 9)-(line 4984,col 9)",
        "(line 4985,col 9)-(line 4987,col 9)",
        "(line 4988,col 9)-(line 4990,col 9)",
        "(line 4991,col 9)-(line 4994,col 9)",
        "(line 4995,col 9)-(line 4998,col 9)",
        "(line 4999,col 9)-(line 5002,col 9)",
        "(line 5003,col 9)-(line 5006,col 9)",
        "(line 5007,col 9)-(line 5010,col 9)",
        "(line 5011,col 9)-(line 5014,col 9)",
        "(line 5015,col 9)-(line 5018,col 9)",
        "(line 5019,col 9)-(line 5021,col 9)",
        "(line 5022,col 9)-(line 5024,col 9)",
        "(line 5025,col 9)-(line 5028,col 9)",
        "(line 5029,col 9)-(line 5032,col 9)",
        "(line 5033,col 9)-(line 5036,col 9)",
        "(line 5037,col 9)-(line 5039,col 9)",
        "(line 5040,col 9)-(line 5042,col 9)",
        "(line 5043,col 9)-(line 5046,col 9)",
        "(line 5047,col 9)-(line 5050,col 9)",
        "(line 5051,col 9)-(line 5054,col 9)",
        "(line 5055,col 9)-(line 5058,col 9)",
        "(line 5059,col 9)-(line 5062,col 9)",
        "(line 5063,col 9)-(line 5066,col 9)",
        "(line 5067,col 9)-(line 5070,col 9)",
        "(line 5071,col 9)-(line 5073,col 9)",
        "(line 5074,col 9)-(line 5077,col 9)",
        "(line 5078,col 9)-(line 5081,col 9)",
        "(line 5082,col 9)-(line 5085,col 9)",
        "(line 5086,col 9)-(line 5086,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clone()",
      "begin_line": 5096,
      "end_line": 5169,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 5098,col 9)-(line 5098,col 58)",
        "(line 5100,col 9)-(line 5100,col 44)",
        "(line 5101,col 9)-(line 5107,col 9)",
        "(line 5108,col 9)-(line 5109,col 64)",
        "(line 5111,col 9)-(line 5111,col 43)",
        "(line 5112,col 9)-(line 5118,col 9)",
        "(line 5119,col 9)-(line 5119,col 80)",
        "(line 5121,col 9)-(line 5121,col 60)",
        "(line 5122,col 9)-(line 5127,col 9)",
        "(line 5128,col 9)-(line 5128,col 53)",
        "(line 5129,col 9)-(line 5129,col 73)",
        "(line 5130,col 9)-(line 5130,col 52)",
        "(line 5131,col 9)-(line 5131,col 71)",
        "(line 5133,col 9)-(line 5133,col 62)",
        "(line 5134,col 9)-(line 5144,col 9)",
        "(line 5145,col 9)-(line 5148,col 9)",
        "(line 5149,col 9)-(line 5152,col 9)",
        "(line 5154,col 9)-(line 5154,col 79)",
        "(line 5155,col 9)-(line 5156,col 46)",
        "(line 5157,col 9)-(line 5158,col 46)",
        "(line 5159,col 9)-(line 5160,col 45)",
        "(line 5161,col 9)-(line 5162,col 45)",
        "(line 5163,col 9)-(line 5166,col 9)",
        "(line 5167,col 9)-(line 5167,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.cloneMarkerMap(java.util.Map)",
      "begin_line": 5181,
      "end_line": 5192,
      "comment": "\r\n     * A utility method to clone the marker maps.\r\n     *\r\n     * @param map  the map to clone.\r\n     *\r\n     * @return A clone of the map.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some problem cloning the\r\n     *                                    map.\r\n     ",
      "child_ranges": [
        "(line 5182,col 9)-(line 5182,col 34)",
        "(line 5183,col 9)-(line 5183,col 32)",
        "(line 5184,col 9)-(line 5184,col 44)",
        "(line 5185,col 9)-(line 5190,col 9)",
        "(line 5191,col 9)-(line 5191,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 5201,
      "end_line": 5215,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 5202,col 9)-(line 5202,col 36)",
        "(line 5203,col 9)-(line 5203,col 71)",
        "(line 5204,col 9)-(line 5204,col 69)",
        "(line 5205,col 9)-(line 5205,col 70)",
        "(line 5206,col 9)-(line 5206,col 68)",
        "(line 5207,col 9)-(line 5207,col 71)",
        "(line 5208,col 9)-(line 5208,col 69)",
        "(line 5209,col 9)-(line 5209,col 72)",
        "(line 5210,col 9)-(line 5210,col 70)",
        "(line 5211,col 9)-(line 5211,col 75)",
        "(line 5212,col 9)-(line 5212,col 73)",
        "(line 5213,col 9)-(line 5213,col 74)",
        "(line 5214,col 9)-(line 5214,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5225,
      "end_line": 5272,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 5228,col 9)-(line 5228,col 35)",
        "(line 5229,col 9)-(line 5229,col 71)",
        "(line 5230,col 9)-(line 5230,col 69)",
        "(line 5231,col 9)-(line 5231,col 70)",
        "(line 5232,col 9)-(line 5232,col 68)",
        "(line 5233,col 9)-(line 5233,col 71)",
        "(line 5234,col 9)-(line 5234,col 69)",
        "(line 5235,col 9)-(line 5235,col 72)",
        "(line 5236,col 9)-(line 5236,col 70)",
        "(line 5237,col 9)-(line 5237,col 75)",
        "(line 5238,col 9)-(line 5238,col 73)",
        "(line 5239,col 9)-(line 5239,col 74)",
        "(line 5240,col 9)-(line 5240,col 72)",
        "(line 5242,col 9)-(line 5248,col 9)",
        "(line 5249,col 9)-(line 5255,col 9)",
        "(line 5256,col 9)-(line 5256,col 48)",
        "(line 5257,col 9)-(line 5262,col 9)",
        "(line 5263,col 9)-(line 5263,col 50)",
        "(line 5264,col 9)-(line 5270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.canSelectByPoint()",
      "begin_line": 5282,
      "end_line": 5284,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the plot supports selection by point,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5283,col 9)-(line 5283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.canSelectByRegion()",
      "begin_line": 5294,
      "end_line": 5296,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the plot supports selection by region,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5295,col 9)-(line 5295,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.select(double, double, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5309,
      "end_line": 5340,
      "comment": "\r\n     * Perform a select for the item(s) at the specified (x, y) coordinates\r\n     * in Java2D space.\r\n     *\r\n     * @param x  the x-coordinate.\r\n     * @param y  the y-coordinate.\r\n     * @param dataArea  the data area.\r\n     * @param source  the rendering source.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5312,col 9)-(line 5312,col 48)",
        "(line 5313,col 9)-(line 5339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5352,
      "end_line": 5356,
      "comment": "\r\n     * Perform a select for the item(s) within the specified region\r\n     * in Java2D space.\r\n     *\r\n     * @param region  the region.\r\n     * @param dataArea  the data area.\r\n     * @param source  the rendering source.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5354,col 9)-(line 5354,col 35)",
        "(line 5355,col 9)-(line 5355,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearSelection()",
      "begin_line": 5363,
      "end_line": 5380,
      "comment": "\r\n     * Clears the selection.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 5365,col 9)-(line 5365,col 48)",
        "(line 5366,col 9)-(line 5379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.findSelectionStateForDataset(org.jfree.data.category.CategoryDataset, java.lang.Object)",
      "begin_line": 5392,
      "end_line": 5401,
      "comment": "\r\n     * Returns the selection state for the specified dataset.  This could be\r\n     * \u003ccode\u003enull\u003c/code\u003e if the dataset hasn\u0027t been set up to support\r\n     * selections.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param source  the selection source.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 5394,col 9)-(line 5398,col 9)",
        "(line 5399,col 9)-(line 5399,col 37)"
      ]
    }
  ]
}