{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CategoryPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryPlot",
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
      "begin_line": 231,
      "end_line": 4117,
      "comment": "\r\n * A general plotting class that uses data from a {@link CategoryDataset} and \r\n * renders each data item using a {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_GRIDLINES_VISIBLE"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " \r\n     * The default visibility of the grid lines plotted against the domain \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_GRIDLINES_VISIBLE"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " \r\n     * The default visibility of the grid lines plotted against the range \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 251,
      "end_line": 253,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 259,
      "end_line": 260,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " \r\n     * The default crosshair visibility. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 274,
      "end_line": 275,
      "comment": " \r\n     * The default crosshair stroke. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " \r\n     * The default crosshair paint. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 285,
      "end_line": 287,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Storage for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " Storage for the domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSharedDomainAxis"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": "\r\n     * A flag that controls whether or not the shared domain axis is drawn \r\n     * (only relevant when the plot is being used as a subplot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Storage for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Storage for the range axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxisMap"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Storage for keys that map datasets to domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxisMap"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Storage for keys that map datasets to range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingOrder"
      ],
      "begin_line": 326,
      "end_line": 327,
      "comment": " The dataset rendering order. "
    },
    {
      "type": "field",
      "varNames": [
        "columnRenderingOrder"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " \r\n     * Controls the order in which the columns are traversed when rendering the \r\n     * data items. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowRenderingOrder"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " \r\n     * Controls the order in which the rows are traversed when rendering the \r\n     * data items. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " \r\n     * A flag that controls whether the grid-lines for the domain axis are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePosition"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " The position of the domain gridlines relative to the category. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " The paint used to draw the domain  grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " \r\n     * A flag that controls whether the grid-lines for the range axis are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " The stroke used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " The paint used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "anchorValue"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " The anchor value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " A flag that controls whether or not a range crosshair is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " \r\n     * A flag that controls whether or not the crosshair locks onto actual \r\n     * data points. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " \r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": "\r\n     * The weight for the plot (only relevant when the plot is used as a subplot\r\n     * within a combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": " The fixed space for the domain axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": " The fixed space for the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " \r\n     * An optional collection of legend items that can be returned by the \r\n     * getLegendItems() method. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 442,
      "end_line": 525,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the item renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 16)",
        "(line 449,col 9)-(line 449,col 52)",
        "(line 452,col 9)-(line 452,col 43)",
        "(line 453,col 9)-(line 453,col 52)",
        "(line 454,col 9)-(line 454,col 42)",
        "(line 455,col 9)-(line 455,col 51)",
        "(line 457,col 9)-(line 457,col 55)",
        "(line 458,col 9)-(line 458,col 54)",
        "(line 460,col 9)-(line 460,col 42)",
        "(line 462,col 9)-(line 462,col 41)",
        "(line 463,col 9)-(line 463,col 38)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 66)",
        "(line 470,col 9)-(line 470,col 66)",
        "(line 471,col 9)-(line 471,col 62)",
        "(line 473,col 9)-(line 473,col 40)",
        "(line 474,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 43)",
        "(line 480,col 9)-(line 480,col 42)",
        "(line 481,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 42)",
        "(line 487,col 9)-(line 487,col 41)",
        "(line 488,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 30)",
        "(line 495,col 9)-(line 495,col 29)",
        "(line 497,col 9)-(line 497,col 71)",
        "(line 498,col 9)-(line 498,col 60)",
        "(line 499,col 9)-(line 499,col 60)",
        "(line 500,col 9)-(line 500,col 58)",
        "(line 502,col 9)-(line 502,col 69)",
        "(line 503,col 9)-(line 503,col 59)",
        "(line 504,col 9)-(line 504,col 57)",
        "(line 506,col 9)-(line 506,col 53)",
        "(line 507,col 9)-(line 507,col 53)",
        "(line 508,col 9)-(line 508,col 52)",
        "(line 509,col 9)-(line 509,col 52)",
        "(line 511,col 9)-(line 513,col 52)",
        "(line 514,col 9)-(line 514,col 51)",
        "(line 516,col 9)-(line 516,col 31)",
        "(line 518,col 9)-(line 518,col 63)",
        "(line 519,col 9)-(line 519,col 39)",
        "(line 520,col 9)-(line 520,col 61)",
        "(line 521,col 9)-(line 521,col 59)",
        "(line 523,col 9)-(line 523,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getPlotType()",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type.\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getOrientation()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation of the plot (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 555,
      "end_line": 561,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 39)",
        "(line 560,col 9)-(line 560,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAxisOffset()",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 582,
      "end_line": 588,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 33)",
        "(line 587,col 9)-(line 587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis()",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\r\n     * Returns the domain axis for the plot.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s \r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #setDomainAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis(int)",
      "begin_line": 612,
      "end_line": 625,
      "comment": "\r\n     * Returns a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setDomainAxis(int, CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 35)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)",
      "begin_line": 660,
      "end_line": 676,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 74)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 41)",
        "(line 669,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxes(org.jfree.chart.axis.CategoryAxis[])",
      "begin_line": 686,
      "end_line": 691,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 706,
      "end_line": 711,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The axis index.\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\r\n     * Returns the domain axis location for the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(int)",
      "begin_line": 733,
      "end_line": 742,
      "comment": "\r\n     * Returns the location for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     * \r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 35)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 753,
      "end_line": 756,
      "comment": "\r\n     * Sets the location of the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 765,
      "end_line": 768,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether listeners are notified.\r\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 780,
      "end_line": 783,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 798,
      "end_line": 808,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 54)",
        "(line 805,col 9)-(line 807,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge()",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\r\n     * Returns the domain axis edge.  This is derived from the axis location\r\n     * and the plot orientation.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(int)",
      "begin_line": 827,
      "end_line": 837,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 36)",
        "(line 829,col 9)-(line 829,col 61)",
        "(line 830,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisCount()",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainAxes()",
      "begin_line": 852,
      "end_line": 861,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 32)",
        "(line 860,col 9)-(line 860,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureDomainAxes()",
      "begin_line": 866,
      "end_line": 873,
      "comment": "\r\n     * Configures the domain axes.\r\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 872,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis()",
      "begin_line": 882,
      "end_line": 884,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * null, then the method will return the parent plot\u0027s range axis (if there\r\n     * is a parent plot).\r\n     *\r\n     * @return The range axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis(int)",
      "begin_line": 893,
      "end_line": 906,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 32)",
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 925,
      "end_line": 927,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 937,
      "end_line": 953,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 67)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 40)",
        "(line 946,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 952,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 963,
      "end_line": 968,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setDomainAxes(CategoryAxis[])\r\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 983,
      "end_line": 996,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     * @see #getDomainAxisIndex(CategoryAxis)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 50)",
        "(line 988,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * Returns the range axis location.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(int)",
      "begin_line": 1016,
      "end_line": 1025,
      "comment": "\r\n     * Returns the location for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     * \r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 35)",
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1024,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1036,
      "end_line": 1039,
      "comment": "\r\n     * Sets the location of the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxisLocation(AxisLocation, boolean)\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "\r\n     * Sets the location of the range axis and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #setDomainAxisLocation(AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1079,
      "end_line": 1089,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 53)",
        "(line 1086,col 9)-(line 1088,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge()",
      "begin_line": 1096,
      "end_line": 1098,
      "comment": "\r\n     * Returns the edge where the primary range axis is located.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(int)",
      "begin_line": 1107,
      "end_line": 1115,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 60)",
        "(line 1109,col 9)-(line 1110,col 34)",
        "(line 1111,col 9)-(line 1113,col 9)",
        "(line 1114,col 9)-(line 1114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisCount()",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeAxes()",
      "begin_line": 1130,
      "end_line": 1139,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 1131,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 31)",
        "(line 1138,col 9)-(line 1138,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureRangeAxes()",
      "begin_line": 1144,
      "end_line": 1151,
      "comment": "\r\n     * Configures the range axes.\r\n     ",
      "child_ranges": [
        "(line 1145,col 9)-(line 1150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset()",
      "begin_line": 1160,
      "end_line": 1162,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset(int)",
      "begin_line": 1173,
      "end_line": 1179,
      "comment": "\r\n     * Returns the dataset at the given index.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(int, CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 38)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1178,col 9)-(line 1178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset, if there \r\n     * is one.  This method also calls the \r\n     * {@link #datasetChanged(DatasetChangeEvent)} method, which adjusts the \r\n     * axis ranges if necessary and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 1193,col 9)-(line 1193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(int, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1204,
      "end_line": 1219,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 78)",
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1210,col 42)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1216,col 9)-(line 1216,col 73)",
        "(line 1217,col 9)-(line 1217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetCount()",
      "begin_line": 1228,
      "end_line": 1230,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1240,
      "end_line": 1244,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.\r\n     * \r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     * \r\n     * @see #getDomainAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1241,col 71)",
        "(line 1243,col 9)-(line 1243,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(int)",
      "begin_line": 1256,
      "end_line": 1263,
      "comment": "\r\n     * Returns the domain axis for a dataset.  You can change the axis for a \r\n     * dataset using the {@link #mapDatasetToDomainAxis(int, int)} method.\r\n     * \r\n     * @param index  the dataset index.\r\n     * \r\n     * @return The domain axis.\r\n     * \r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 46)",
        "(line 1258,col 9)-(line 1258,col 77)",
        "(line 1259,col 9)-(line 1261,col 9)",
        "(line 1262,col 9)-(line 1262,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1273,
      "end_line": 1277,
      "comment": "\r\n     * Maps a dataset to a particular range axis.\r\n     * \r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     * \r\n     * @see #getRangeAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 70)",
        "(line 1276,col 9)-(line 1276,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(int)",
      "begin_line": 1289,
      "end_line": 1296,
      "comment": "\r\n     * Returns the range axis for a dataset.  You can change the axis for a \r\n     * dataset using the {@link #mapDatasetToRangeAxis(int, int)} method.\r\n     * \r\n     * @param index  the dataset index.\r\n     * \r\n     * @return The range axis.\r\n     * \r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 42)",
        "(line 1291,col 9)-(line 1291,col 76)",
        "(line 1292,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer()",
      "begin_line": 1305,
      "end_line": 1307,
      "comment": "\r\n     * Returns a reference to the renderer for the plot.\r\n     *\r\n     * @return The renderer.\r\n     * \r\n     * @see #setRenderer(CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer(int)",
      "begin_line": 1318,
      "end_line": 1324,
      "comment": "\r\n     * Returns the renderer at the given index.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(int, CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 43)",
        "(line 1320,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1335,
      "end_line": 1337,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\" \r\n     * renderer) and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted.\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1356,
      "end_line": 1358,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\" \r\n     * renderer) and, if requested, sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cp\u003e\r\n     * You can set the renderer to \u003ccode\u003enull\u003c/code\u003e, but this is not \r\n     * recommended because:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno data will be displayed;\u003c/li\u003e\r\n     *   \u003cli\u003ethe plot background will not be painted;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1370,
      "end_line": 1372,
      "comment": "\r\n     * Sets the renderer at the specified index and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer(int)\r\n     * @see #setRenderer(int, CategoryItemRenderer, boolean)\r\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1371,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1384,
      "end_line": 1407,
      "comment": "\r\n     * Sets a renderer.  A {@link PlotChangeEvent} is sent to all registered \r\n     * listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1389,col 63)",
        "(line 1390,col 9)-(line 1392,col 9)",
        "(line 1395,col 9)-(line 1395,col 44)",
        "(line 1396,col 9)-(line 1399,col 9)",
        "(line 1401,col 9)-(line 1401,col 30)",
        "(line 1402,col 9)-(line 1402,col 29)",
        "(line 1404,col 9)-(line 1406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])",
      "begin_line": 1415,
      "end_line": 1420,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param renderers  the renderers.\r\n     ",
      "child_ranges": [
        "(line 1416,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererForDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1430,
      "end_line": 1439,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  If the dataset doesn\u0027t\r\n     * belong to the plot, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 43)",
        "(line 1432,col 9)-(line 1437,col 9)",
        "(line 1438,col 9)-(line 1438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1449,
      "end_line": 1451,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     * \r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1450,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetRenderingOrder()",
      "begin_line": 1460,
      "end_line": 1462,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1474,
      "end_line": 1480,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  By default, the plot renders the primary dataset \r\n     * last (so that the primary dataset overlays the secondary datasets).  You \r\n     * can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1475,col 9)-(line 1477,col 9)",
        "(line 1478,col 9)-(line 1478,col 36)",
        "(line 1479,col 9)-(line 1479,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getColumnRenderingOrder()",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "\r\n     * Returns the order in which the columns are rendered.  The default value\r\n     * is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     * \r\n     * @return The column rendering order (never \u003ccode\u003enull\u003c/code).\r\n     * \r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1505,
      "end_line": 1511,
      "comment": "\r\n     * Sets the column order in which the items in each dataset should be \r\n     * rendered and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.  Note that this affects the order in which items are drawn, \r\n     * NOT their position in the chart.\r\n     * \r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getColumnRenderingOrder()\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1509,col 42)",
        "(line 1510,col 9)-(line 1510,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRowRenderingOrder()",
      "begin_line": 1521,
      "end_line": 1523,
      "comment": "\r\n     * Returns the order in which the rows should be rendered.  The default \r\n     * value is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     * \r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1536,
      "end_line": 1542,
      "comment": "\r\n     * Sets the row order in which the items in each dataset should be \r\n     * rendered and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.  Note that this affects the order in which items are drawn, \r\n     * NOT their position in the chart.\r\n     * \r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRowRenderingOrder()\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1540,col 39)",
        "(line 1541,col 9)-(line 1541,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainGridlinesVisible()",
      "begin_line": 1551,
      "end_line": 1553,
      "comment": "\r\n     * Returns the flag that controls whether the domain grid-lines are visible.\r\n     *\r\n     * @return The \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1566,
      "end_line": 1571,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against \r\n     * the domain axis.\r\n     * \u003cp\u003e\r\n     * If the flag value changes, a {@link PlotChangeEvent} is sent to all \r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1567,col 9)-(line 1570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePosition()",
      "begin_line": 1580,
      "end_line": 1582,
      "comment": "\r\n     * Returns the position used for the domain gridlines.\r\n     * \r\n     * @return The gridline position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePosition(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 1592,
      "end_line": 1598,
      "comment": "\r\n     * Sets the position used for the domain gridlines and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlinePosition()\r\n     ",
      "child_ranges": [
        "(line 1593,col 9)-(line 1595,col 9)",
        "(line 1596,col 9)-(line 1596,col 47)",
        "(line 1597,col 9)-(line 1597,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke()",
      "begin_line": 1607,
      "end_line": 1609,
      "comment": "\r\n     * Returns the stroke used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1619,
      "end_line": 1625,
      "comment": "\r\n     * Sets the stroke used to draw grid-lines against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1620,col 9)-(line 1622,col 9)",
        "(line 1623,col 9)-(line 1623,col 43)",
        "(line 1624,col 9)-(line 1624,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePaint()",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\r\n     * Returns the paint used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1646,
      "end_line": 1652,
      "comment": "\r\n     * Sets the paint used to draw the grid-lines (if any) against the domain \r\n     * axis and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1647,col 9)-(line 1649,col 9)",
        "(line 1650,col 9)-(line 1650,col 41)",
        "(line 1651,col 9)-(line 1651,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeGridlinesVisible()",
      "begin_line": 1661,
      "end_line": 1663,
      "comment": "\r\n     * Returns the flag that controls whether the range grid-lines are visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1662,col 9)-(line 1662,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 1674,
      "end_line": 1679,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against \r\n     * the range axis.  If the flag changes value, a {@link PlotChangeEvent} is \r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke()",
      "begin_line": 1688,
      "end_line": 1690,
      "comment": "\r\n     * Returns the stroke used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1689,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 1700,
      "end_line": 1706,
      "comment": "\r\n     * Sets the stroke used to draw the grid-lines against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1701,col 9)-(line 1703,col 9)",
        "(line 1704,col 9)-(line 1704,col 42)",
        "(line 1705,col 9)-(line 1705,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlinePaint()",
      "begin_line": 1715,
      "end_line": 1717,
      "comment": "\r\n     * Returns the paint used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1716,col 9)-(line 1716,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 1727,
      "end_line": 1733,
      "comment": "\r\n     * Sets the paint used to draw the grid lines against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1728,col 9)-(line 1730,col 9)",
        "(line 1731,col 9)-(line 1731,col 40)",
        "(line 1732,col 9)-(line 1732,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedLegendItems()",
      "begin_line": 1742,
      "end_line": 1744,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     * \r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 1743,col 9)-(line 1743,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 1755,
      "end_line": 1758,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to \r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created \r\n     * automatically.\r\n     * \r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 1756,col 9)-(line 1756,col 38)",
        "(line 1757,col 9)-(line 1757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getLegendItems()",
      "begin_line": 1767,
      "end_line": 1791,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method creates \r\n     * a legend item for each series in each of the datasets.  You can change \r\n     * this behaviour by overriding this method.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 1768,col 9)-(line 1768,col 60)",
        "(line 1769,col 9)-(line 1789,col 9)",
        "(line 1790,col 9)-(line 1790,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1801,
      "end_line": 1821,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 1803,col 9)-(line 1803,col 50)",
        "(line 1804,col 9)-(line 1819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoom(double)",
      "begin_line": 1832,
      "end_line": 1844,
      "comment": "\r\n     * Zooms (in or out) on the plot\u0027s value axis.\r\n     * \u003cp\u003e\r\n     * If the value 0.0 is passed in as the zoom percent, the auto-range\r\n     * calculation for the axis is restored (which sets the range to include\r\n     * the minimum and maximum data values, thus displaying all the data).\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": [
        "(line 1834,col 9)-(line 1842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1853,
      "end_line": 1871,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The range axis bounds will be recalculated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1855,col 42)",
        "(line 1856,col 9)-(line 1861,col 9)",
        "(line 1862,col 9)-(line 1869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 1878,
      "end_line": 1897,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 1879,col 9)-(line 1879,col 34)",
        "(line 1880,col 9)-(line 1896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker)",
      "begin_line": 1909,
      "end_line": 1911,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a \r\n     * marker will be drawn by the renderer as a line perpendicular to the \r\n     * domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeDomainMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 1910,col 9)-(line 1910,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 1925,
      "end_line": 1927,
      "comment": "\r\n     * Adds a marker for display against the domain axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker \r\n     * will be drawn by the renderer as a line perpendicular to the domain \r\n     * axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e \r\n     *               not permitted).\r\n     *               \r\n     * @see #removeDomainMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 1926,col 9)-(line 1926,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 1942,
      "end_line": 1944,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeDomainMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 1943,col 9)-(line 1943,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 1962,
      "end_line": 1993,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     * \r\n     * @see #removeDomainMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 1964,col 9)-(line 1966,col 9)",
        "(line 1967,col 9)-(line 1969,col 9)",
        "(line 1970,col 9)-(line 1970,col 27)",
        "(line 1971,col 9)-(line 1988,col 9)",
        "(line 1989,col 9)-(line 1989,col 39)",
        "(line 1990,col 9)-(line 1992,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers()",
      "begin_line": 2001,
      "end_line": 2021,
      "comment": "\r\n     * Clears all the domain markers for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 2002,col 9)-(line 2010,col 9)",
        "(line 2011,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2020,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2030,
      "end_line": 2032,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @return The list of domain markers.\r\n     ",
      "child_ranges": [
        "(line 2031,col 9)-(line 2031,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2043,
      "end_line": 2056,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and \r\n     * layer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     * \r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2044,col 9)-(line 2044,col 33)",
        "(line 2045,col 9)-(line 2045,col 41)",
        "(line 2046,col 9)-(line 2051,col 9)",
        "(line 2052,col 9)-(line 2054,col 9)",
        "(line 2055,col 9)-(line 2055,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(int)",
      "begin_line": 2065,
      "end_line": 2092,
      "comment": "\r\n     * Clears all the domain markers for the specified renderer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2066,col 41)",
        "(line 2067,col 9)-(line 2078,col 9)",
        "(line 2079,col 9)-(line 2090,col 9)",
        "(line 2091,col 9)-(line 2091,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2105,
      "end_line": 2107,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2106,col 9)-(line 2106,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2121,
      "end_line": 2123,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2122,col 9)-(line 2122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2138,
      "end_line": 2140,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2139,col 6)-(line 2139,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2155,
      "end_line": 2171,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested, \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2157,col 9)-(line 2157,col 26)",
        "(line 2158,col 9)-(line 2165,col 9)",
        "(line 2166,col 9)-(line 2166,col 49)",
        "(line 2167,col 9)-(line 2169,col 9)",
        "(line 2170,col 9)-(line 2170,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2183,
      "end_line": 2185,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a \r\n     * marker will be drawn by the renderer as a line perpendicular to the \r\n     * range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2184,col 9)-(line 2184,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2199,
      "end_line": 2201,
      "comment": "\r\n     * Adds a marker for display against the range axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker \r\n     * will be drawn by the renderer as a line perpendicular to the range axis, \r\n     * however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e \r\n     *               not permitted).\r\n     *               \r\n     * @see #removeRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2200,col 9)-(line 2200,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2216,
      "end_line": 2218,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     * \r\n     * @see #removeRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2217,col 6)-(line 2217,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2236,
      "end_line": 2261,
      "comment": "\r\n     * Adds a marker for display by a particular renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     * \r\n     * @see #removeRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2238,col 9)-(line 2238,col 27)",
        "(line 2239,col 9)-(line 2256,col 9)",
        "(line 2257,col 9)-(line 2257,col 39)",
        "(line 2258,col 9)-(line 2260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers()",
      "begin_line": 2269,
      "end_line": 2289,
      "comment": "\r\n     * Clears all the range markers for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2270,col 9)-(line 2278,col 9)",
        "(line 2279,col 9)-(line 2287,col 9)",
        "(line 2288,col 9)-(line 2288,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2300,
      "end_line": 2302,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @return The list of range markers.\r\n     * \r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 2301,col 9)-(line 2301,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2313,
      "end_line": 2326,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and \r\n     * layer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     * \r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2314,col 9)-(line 2314,col 33)",
        "(line 2315,col 9)-(line 2315,col 41)",
        "(line 2316,col 9)-(line 2321,col 9)",
        "(line 2322,col 9)-(line 2324,col 9)",
        "(line 2325,col 9)-(line 2325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(int)",
      "begin_line": 2335,
      "end_line": 2362,
      "comment": "\r\n     * Clears all the range markers for the specified renderer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearDomainMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2336,col 9)-(line 2336,col 41)",
        "(line 2337,col 9)-(line 2348,col 9)",
        "(line 2349,col 9)-(line 2360,col 9)",
        "(line 2361,col 9)-(line 2361,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2377,
      "end_line": 2379,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     * \r\n     * @see #addRangeMarker(Marker)\r\n     ",
      "child_ranges": [
        "(line 2378,col 9)-(line 2378,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2395,
      "end_line": 2397,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     * \r\n     * @see #addRangeMarker(Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2396,col 9)-(line 2396,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2414,
      "end_line": 2416,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     * \r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     ",
      "child_ranges": [
        "(line 2415,col 6)-(line 2415,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2434,
      "end_line": 2453,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     * \r\n     * @see #addRangeMarker(int, Marker, Layer, boolean)\r\n     ",
      "child_ranges": [
        "(line 2436,col 9)-(line 2438,col 9)",
        "(line 2439,col 9)-(line 2439,col 26)",
        "(line 2440,col 9)-(line 2447,col 9)",
        "(line 2448,col 9)-(line 2448,col 49)",
        "(line 2449,col 9)-(line 2451,col 9)",
        "(line 2452,col 9)-(line 2452,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairVisible()",
      "begin_line": 2462,
      "end_line": 2464,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2463,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 2473,
      "end_line": 2478,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 2474,col 9)-(line 2477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 2488,
      "end_line": 2490,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 2489,col 9)-(line 2489,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 2500,
      "end_line": 2505,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should \r\n     * \"lock-on\" to actual data values.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 2501,col 9)-(line 2504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairValue()",
      "begin_line": 2514,
      "end_line": 2516,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 2515,col 9)-(line 2515,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double)",
      "begin_line": 2528,
      "end_line": 2530,
      "comment": "\r\n     * Sets the domain crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 2529,col 9)-(line 2529,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 2543,
      "end_line": 2548,
      "comment": "\r\n     * Sets the range crosshair value and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners (but only if the \r\n     * crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 2544,col 9)-(line 2544,col 41)",
        "(line 2545,col 9)-(line 2547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke()",
      "begin_line": 2560,
      "end_line": 2562,
      "comment": "\r\n     * Returns the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the crosshair \r\n     * (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 2561,col 9)-(line 2561,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 2574,
      "end_line": 2580,
      "comment": "\r\n     * Sets the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the range \r\n     * crosshair (if visible), and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 2575,col 9)-(line 2577,col 9)",
        "(line 2578,col 9)-(line 2578,col 43)",
        "(line 2579,col 9)-(line 2579,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairPaint()",
      "begin_line": 2591,
      "end_line": 2593,
      "comment": "\r\n     * Returns the paint used to draw the range crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 2592,col 9)-(line 2592,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 2603,
      "end_line": 2609,
      "comment": "\r\n     * Sets the paint used to draw the range crosshair (if visible) and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 2604,col 9)-(line 2606,col 9)",
        "(line 2607,col 9)-(line 2607,col 41)",
        "(line 2608,col 9)-(line 2608,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnnotations()",
      "begin_line": 2616,
      "end_line": 2618,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2617,col 9)-(line 2617,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 2628,
      "end_line": 2630,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2629,col 6)-(line 2629,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 2641,
      "end_line": 2649,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2642,col 9)-(line 2644,col 9)",
        "(line 2645,col 9)-(line 2645,col 41)",
        "(line 2646,col 9)-(line 2648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 2661,
      "end_line": 2663,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2662,col 6)-(line 2662,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation, boolean)",
      "begin_line": 2676,
      "end_line": 2686,
      "comment": "\r\n     * Removes an annotation from the plot and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 2678,col 9)-(line 2680,col 9)",
        "(line 2681,col 9)-(line 2681,col 62)",
        "(line 2682,col 9)-(line 2684,col 9)",
        "(line 2685,col 9)-(line 2685,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearAnnotations()",
      "begin_line": 2692,
      "end_line": 2695,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     ",
      "child_ranges": [
        "(line 2693,col 9)-(line 2693,col 33)",
        "(line 2694,col 9)-(line 2694,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2706,
      "end_line": 2750,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2710,col 9)-(line 2712,col 9)",
        "(line 2715,col 9)-(line 2746,col 9)",
        "(line 2748,col 9)-(line 2748,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2761,
      "end_line": 2796,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2765,col 9)-(line 2767,col 9)",
        "(line 2770,col 9)-(line 2793,col 9)",
        "(line 2794,col 9)-(line 2794,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2806,
      "end_line": 2812,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 2808,col 9)-(line 2808,col 42)",
        "(line 2809,col 9)-(line 2809,col 61)",
        "(line 2810,col 9)-(line 2810,col 62)",
        "(line 2811,col 9)-(line 2811,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2830,
      "end_line": 3000,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     * \u003cP\u003e\r\n     * At your option, you may supply an instance of {@link PlotRenderingInfo}.\r\n     * If you do, it will be populated with information about the drawing,\r\n     * including various plot dimensions and tooltip info.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes) should \r\n     *              be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param state  collects info as the chart is drawn (possibly \r\n     *               \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2836,col 9)-(line 2836,col 64)",
        "(line 2837,col 9)-(line 2837,col 66)",
        "(line 2838,col 9)-(line 2840,col 9)",
        "(line 2843,col 9)-(line 2848,col 9)",
        "(line 2849,col 9)-(line 2849,col 32)",
        "(line 2852,col 9)-(line 2852,col 45)",
        "(line 2853,col 9)-(line 2853,col 26)",
        "(line 2856,col 9)-(line 2856,col 55)",
        "(line 2857,col 9)-(line 2857,col 56)",
        "(line 2858,col 9)-(line 2858,col 39)",
        "(line 2860,col 9)-(line 2860,col 36)",
        "(line 2864,col 9)-(line 2869,col 9)",
        "(line 2871,col 9)-(line 2871,col 63)",
        "(line 2874,col 9)-(line 2874,col 39)",
        "(line 2875,col 9)-(line 2875,col 26)",
        "(line 2877,col 9)-(line 2877,col 42)",
        "(line 2879,col 9)-(line 2879,col 80)",
        "(line 2880,col 9)-(line 2885,col 9)",
        "(line 2886,col 9)-(line 2888,col 9)",
        "(line 2891,col 9)-(line 2893,col 9)",
        "(line 2894,col 9)-(line 2896,col 9)",
        "(line 2899,col 9)-(line 2899,col 34)",
        "(line 2902,col 9)-(line 2902,col 56)",
        "(line 2903,col 9)-(line 2904,col 64)",
        "(line 2906,col 9)-(line 2906,col 65)",
        "(line 2907,col 9)-(line 2964,col 9)",
        "(line 2967,col 9)-(line 2969,col 9)",
        "(line 2970,col 9)-(line 2972,col 9)",
        "(line 2975,col 9)-(line 2975,col 45)",
        "(line 2977,col 9)-(line 2977,col 30)",
        "(line 2978,col 9)-(line 2978,col 43)",
        "(line 2980,col 9)-(line 2982,col 9)",
        "(line 2985,col 9)-(line 2990,col 9)",
        "(line 2993,col 9)-(line 2998,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3012,
      "end_line": 3015,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is \r\n     * declared public so that it can be accessed by the renderers used by \r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 3013,col 9)-(line 3013,col 51)",
        "(line 3014,col 9)-(line 3014,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3028,
      "end_line": 3111,
      "comment": "\r\n     * A utility method for drawing the plot\u0027s axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     * \r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 3033,col 9)-(line 3033,col 61)",
        "(line 3036,col 9)-(line 3041,col 9)",
        "(line 3044,col 9)-(line 3049,col 9)",
        "(line 3051,col 9)-(line 3051,col 41)",
        "(line 3054,col 9)-(line 3055,col 38)",
        "(line 3056,col 9)-(line 3056,col 69)",
        "(line 3057,col 9)-(line 3065,col 9)",
        "(line 3068,col 9)-(line 3069,col 79)",
        "(line 3070,col 9)-(line 3070,col 63)",
        "(line 3071,col 9)-(line 3079,col 9)",
        "(line 3082,col 9)-(line 3083,col 76)",
        "(line 3084,col 9)-(line 3084,col 61)",
        "(line 3085,col 9)-(line 3093,col 9)",
        "(line 3096,col 9)-(line 3097,col 77)",
        "(line 3098,col 9)-(line 3098,col 62)",
        "(line 3099,col 9)-(line 3107,col 9)",
        "(line 3109,col 9)-(line 3109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3124,
      "end_line": 3182,
      "comment": "\r\n     * Draws a representation of a dataset within the dataArea region using the\r\n     * appropriate renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset and renderer index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * \r\n     * @return A boolean that indicates whether or not real data was found.\r\n     ",
      "child_ranges": [
        "(line 3127,col 9)-(line 3127,col 34)",
        "(line 3128,col 9)-(line 3128,col 59)",
        "(line 3129,col 9)-(line 3129,col 59)",
        "(line 3130,col 9)-(line 3130,col 65)",
        "(line 3131,col 9)-(line 3131,col 60)",
        "(line 3132,col 9)-(line 3132,col 74)",
        "(line 3133,col 9)-(line 3179,col 9)",
        "(line 3180,col 9)-(line 3180,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3192,
      "end_line": 3221,
      "comment": "\r\n     * Draws the gridlines for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * \r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3195,col 9)-(line 3220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3232,
      "end_line": 3253,
      "comment": "\r\n     * Draws the gridlines for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 3235,col 9)-(line 3252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3262,
      "end_line": 3273,
      "comment": "\r\n     * Draws the annotations.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 3265,col 9)-(line 3265,col 56)",
        "(line 3266,col 9)-(line 3271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3286,
      "end_line": 3304,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is \r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #drawRangeMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3289,col 9)-(line 3289,col 52)",
        "(line 3290,col 9)-(line 3292,col 9)",
        "(line 3294,col 9)-(line 3294,col 60)",
        "(line 3295,col 9)-(line 3295,col 59)",
        "(line 3296,col 9)-(line 3302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3317,
      "end_line": 3335,
      "comment": "\r\n     * Draws the range markers (if any) for an axis and layer.  This method is \r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #drawDomainMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3320,col 9)-(line 3320,col 52)",
        "(line 3321,col 9)-(line 3323,col 9)",
        "(line 3325,col 9)-(line 3325,col 59)",
        "(line 3326,col 9)-(line 3326,col 55)",
        "(line 3327,col 9)-(line 3333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3347,
      "end_line": 3365,
      "comment": "\r\n     * Utility method for drawing a line perpendicular to the range axis (used\r\n     * for crosshairs).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param value  the data value.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 3350,col 9)-(line 3351,col 36)",
        "(line 3352,col 9)-(line 3352,col 27)",
        "(line 3353,col 9)-(line 3360,col 9)",
        "(line 3361,col 9)-(line 3361,col 29)",
        "(line 3362,col 9)-(line 3362,col 27)",
        "(line 3363,col 9)-(line 3363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3380,
      "end_line": 3404,
      "comment": "\r\n     * Draws a range crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 3384,col 9)-(line 3386,col 9)",
        "(line 3387,col 9)-(line 3387,col 27)",
        "(line 3388,col 9)-(line 3399,col 9)",
        "(line 3400,col 9)-(line 3400,col 29)",
        "(line 3401,col 9)-(line 3401,col 27)",
        "(line 3402,col 9)-(line 3402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3415,
      "end_line": 3440,
      "comment": "\r\n     * Returns the range of data values that will be plotted against the range \r\n     * axis.  If the dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The data range.\r\n     ",
      "child_ranges": [
        "(line 3417,col 9)-(line 3417,col 28)",
        "(line 3418,col 9)-(line 3418,col 46)",
        "(line 3420,col 9)-(line 3420,col 54)",
        "(line 3421,col 9)-(line 3426,col 9)",
        "(line 3430,col 9)-(line 3430,col 54)",
        "(line 3431,col 9)-(line 3437,col 9)",
        "(line 3438,col 9)-(line 3438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(int)",
      "begin_line": 3452,
      "end_line": 3474,
      "comment": "\r\n     * Returns a list of the datasets that are mapped to the axis with the\r\n     * specified index.\r\n     * \r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @return The list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 3453,col 9)-(line 3453,col 38)",
        "(line 3454,col 9)-(line 3472,col 9)",
        "(line 3473,col 9)-(line 3473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(int)",
      "begin_line": 3484,
      "end_line": 3504,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a \r\n     * given range axis.\r\n     * \r\n     * @param index  the axis index.\r\n     * \r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3485,col 9)-(line 3485,col 38)",
        "(line 3486,col 9)-(line 3502,col 9)",
        "(line 3503,col 9)-(line 3503,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getWeight()",
      "begin_line": 3514,
      "end_line": 3516,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a \r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     * \r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 3515,col 9)-(line 3515,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setWeight(int)",
      "begin_line": 3526,
      "end_line": 3529,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     * \r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 3527,col 9)-(line 3527,col 29)",
        "(line 3528,col 9)-(line 3528,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedDomainAxisSpace()",
      "begin_line": 3538,
      "end_line": 3540,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 3539,col 9)-(line 3539,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3550,
      "end_line": 3552,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 3551,col 9)-(line 3551,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 3565,
      "end_line": 3570,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 3566,col 9)-(line 3566,col 42)",
        "(line 3567,col 9)-(line 3569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedRangeAxisSpace()",
      "begin_line": 3579,
      "end_line": 3581,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 3580,col 9)-(line 3580,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3591,
      "end_line": 3593,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 3592,col 9)-(line 3592,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 3606,
      "end_line": 3611,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 3607,col 9)-(line 3607,col 41)",
        "(line 3608,col 9)-(line 3610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategories()",
      "begin_line": 3620,
      "end_line": 3626,
      "comment": "\r\n     * Returns a list of the categories in the plot\u0027s primary dataset.\r\n     * \r\n     * @return A list of the categories in the plot\u0027s primary dataset.\r\n     * \r\n     * @see #getCategoriesForAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 3621,col 9)-(line 3621,col 27)",
        "(line 3622,col 9)-(line 3624,col 9)",
        "(line 3625,col 9)-(line 3625,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 3638,
      "end_line": 3654,
      "comment": "\r\n     * Returns a list of the categories that should be displayed for the\r\n     * specified axis.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     * \r\n     * @return The categories.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 3639,col 9)-(line 3639,col 38)",
        "(line 3640,col 9)-(line 3640,col 54)",
        "(line 3641,col 9)-(line 3641,col 62)",
        "(line 3642,col 9)-(line 3642,col 48)",
        "(line 3643,col 9)-(line 3652,col 9)",
        "(line 3653,col 9)-(line 3653,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDrawSharedDomainAxis()",
      "begin_line": 3664,
      "end_line": 3666,
      "comment": "\r\n     * Returns the flag that controls whether or not the shared domain axis is \r\n     * drawn for each subplot.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawSharedDomainAxis(boolean)\r\n     ",
      "child_ranges": [
        "(line 3665,col 9)-(line 3665,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis(boolean)",
      "begin_line": 3676,
      "end_line": 3679,
      "comment": "\r\n     * Sets the flag that controls whether the shared domain axis is drawn when\r\n     * this plot is being used as a subplot.\r\n     * \r\n     * @param draw  a boolean.\r\n     * \r\n     * @see #getDrawSharedDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 3677,col 9)-(line 3677,col 41)",
        "(line 3678,col 9)-(line 3678,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainZoomable()",
      "begin_line": 3689,
      "end_line": 3691,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that the domain axes are not\r\n     * zoomable.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 3690,col 9)-(line 3690,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZoomable()",
      "begin_line": 3700,
      "end_line": 3702,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axes are zoomable.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 3701,col 9)-(line 3701,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3712,
      "end_line": 3715,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3726,
      "end_line": 3729,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     * \r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 3744,
      "end_line": 3747,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3756,
      "end_line": 3760,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 3759,col 9)-(line 3759,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 3775,
      "end_line": 3798,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 3779,col 9)-(line 3797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3808,
      "end_line": 3816,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     * \r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 3810,col 9)-(line 3815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnchorValue()",
      "begin_line": 3825,
      "end_line": 3827,
      "comment": "\r\n     * Returns the anchor value.\r\n     * \r\n     * @return The anchor value.\r\n     * \r\n     * @see #setAnchorValue(double)\r\n     ",
      "child_ranges": [
        "(line 3826,col 9)-(line 3826,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double)",
      "begin_line": 3837,
      "end_line": 3839,
      "comment": "\r\n     * Sets the anchor value and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param value  the anchor value.\r\n     * \r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 3838,col 9)-(line 3838,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double, boolean)",
      "begin_line": 3850,
      "end_line": 3855,
      "comment": "\r\n     * Sets the anchor value and, if requested, sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 3851,col 9)-(line 3851,col 33)",
        "(line 3852,col 9)-(line 3854,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.equals(java.lang.Object)",
      "begin_line": 3864,
      "end_line": 3990,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 3866,col 9)-(line 3868,col 9)",
        "(line 3869,col 9)-(line 3871,col 9)",
        "(line 3872,col 9)-(line 3874,col 9)",
        "(line 3876,col 9)-(line 3876,col 47)",
        "(line 3878,col 9)-(line 3880,col 9)",
        "(line 3881,col 9)-(line 3883,col 9)",
        "(line 3884,col 9)-(line 3886,col 9)",
        "(line 3887,col 9)-(line 3889,col 9)",
        "(line 3890,col 9)-(line 3892,col 9)",
        "(line 3893,col 9)-(line 3895,col 9)",
        "(line 3896,col 9)-(line 3898,col 9)",
        "(line 3899,col 9)-(line 3902,col 9)",
        "(line 3903,col 9)-(line 3906,col 9)",
        "(line 3907,col 9)-(line 3909,col 9)",
        "(line 3910,col 9)-(line 3912,col 9)",
        "(line 3913,col 9)-(line 3915,col 9)",
        "(line 3916,col 9)-(line 3918,col 9)",
        "(line 3919,col 9)-(line 3921,col 9)",
        "(line 3922,col 9)-(line 3924,col 9)",
        "(line 3925,col 9)-(line 3928,col 9)",
        "(line 3929,col 9)-(line 3932,col 9)",
        "(line 3933,col 9)-(line 3935,col 9)",
        "(line 3936,col 9)-(line 3939,col 9)",
        "(line 3940,col 9)-(line 3943,col 9)",
        "(line 3944,col 9)-(line 3946,col 9)",
        "(line 3947,col 9)-(line 3949,col 9)",
        "(line 3950,col 9)-(line 3952,col 9)",
        "(line 3953,col 9)-(line 3956,col 9)",
        "(line 3957,col 9)-(line 3960,col 9)",
        "(line 3961,col 9)-(line 3964,col 9)",
        "(line 3965,col 9)-(line 3968,col 9)",
        "(line 3969,col 9)-(line 3972,col 9)",
        "(line 3973,col 9)-(line 3975,col 9)",
        "(line 3976,col 9)-(line 3978,col 9)",
        "(line 3979,col 9)-(line 3982,col 9)",
        "(line 3983,col 9)-(line 3986,col 9)",
        "(line 3988,col 9)-(line 3988,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clone()",
      "begin_line": 3999,
      "end_line": 4047,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 4001,col 9)-(line 4001,col 58)",
        "(line 4003,col 9)-(line 4003,col 44)",
        "(line 4004,col 9)-(line 4010,col 9)",
        "(line 4011,col 9)-(line 4012,col 60)",
        "(line 4014,col 9)-(line 4014,col 43)",
        "(line 4015,col 9)-(line 4021,col 9)",
        "(line 4022,col 9)-(line 4022,col 80)",
        "(line 4024,col 9)-(line 4024,col 60)",
        "(line 4025,col 9)-(line 4030,col 9)",
        "(line 4031,col 9)-(line 4032,col 63)",
        "(line 4033,col 9)-(line 4034,col 62)",
        "(line 4035,col 9)-(line 4035,col 62)",
        "(line 4036,col 9)-(line 4039,col 9)",
        "(line 4040,col 9)-(line 4043,col 9)",
        "(line 4045,col 9)-(line 4045,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 4056,
      "end_line": 4064,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 4057,col 9)-(line 4057,col 36)",
        "(line 4058,col 9)-(line 4058,col 71)",
        "(line 4059,col 9)-(line 4059,col 69)",
        "(line 4060,col 9)-(line 4060,col 70)",
        "(line 4061,col 9)-(line 4061,col 68)",
        "(line 4062,col 9)-(line 4062,col 71)",
        "(line 4063,col 9)-(line 4063,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 4074,
      "end_line": 4115,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 4077,col 9)-(line 4077,col 35)",
        "(line 4078,col 9)-(line 4078,col 71)",
        "(line 4079,col 9)-(line 4079,col 69)",
        "(line 4080,col 9)-(line 4080,col 70)",
        "(line 4081,col 9)-(line 4081,col 68)",
        "(line 4082,col 9)-(line 4082,col 71)",
        "(line 4083,col 9)-(line 4083,col 69)",
        "(line 4085,col 9)-(line 4091,col 9)",
        "(line 4092,col 9)-(line 4098,col 9)",
        "(line 4099,col 9)-(line 4099,col 48)",
        "(line 4100,col 9)-(line 4105,col 9)",
        "(line 4106,col 9)-(line 4106,col 50)",
        "(line 4107,col 9)-(line 4113,col 9)"
      ]
    }
  ]
}