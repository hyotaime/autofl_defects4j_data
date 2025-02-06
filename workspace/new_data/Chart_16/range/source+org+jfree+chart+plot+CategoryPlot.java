{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CategoryPlot.java",
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
      "begin_line": 225,
      "end_line": 3941,
      "comment": "\r\n * A general plotting class that uses data from a {@link CategoryDataset} and \r\n * renders each data item using a {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_GRIDLINES_VISIBLE"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " \r\n     * The default visibility of the grid lines plotted against the domain \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_GRIDLINES_VISIBLE"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " \r\n     * The default visibility of the grid lines plotted against the range \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 245,
      "end_line": 247,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 253,
      "end_line": 254,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " \r\n     * The default crosshair visibility. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 268,
      "end_line": 269,
      "comment": " \r\n     * The default crosshair stroke. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " \r\n     * The default crosshair paint. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 279,
      "end_line": 281,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Storage for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Storage for the domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "drawSharedDomainAxis"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": "\r\n     * A flag that controls whether or not the shared domain axis is drawn \r\n     * (only relevant when the plot is being used as a subplot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Storage for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Storage for the range axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxisMap"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Storage for keys that map datasets to domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxisMap"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Storage for keys that map datasets to range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "renderingOrder"
      ],
      "begin_line": 320,
      "end_line": 321,
      "comment": " The dataset rendering order. "
    },
    {
      "type": "field",
      "varNames": [
        "columnRenderingOrder"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " \r\n     * Controls the order in which the columns are traversed when rendering the \r\n     * data items. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowRenderingOrder"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " \r\n     * Controls the order in which the rows are traversed when rendering the \r\n     * data items. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " \r\n     * A flag that controls whether the grid-lines for the domain axis are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePosition"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " The position of the domain gridlines relative to the category. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " The paint used to draw the domain  grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " \r\n     * A flag that controls whether the grid-lines for the range axis are \r\n     * visible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " The stroke used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " The paint used to draw the range axis grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "anchorValue"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " The anchor value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " A flag that controls whether or not a range crosshair is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " \r\n     * A flag that controls whether or not the crosshair locks onto actual \r\n     * data points. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " A map containing lists of markers for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " A map containing lists of markers for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 400,
      "end_line": 400,
      "comment": " \r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": "\r\n     * The weight for the plot (only relevant when the plot is used as a subplot\r\n     * within a combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " The fixed space for the domain axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": " The fixed space for the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": " \r\n     * An optional collection of legend items that can be returned by the \r\n     * getLegendItems() method. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryPlot.CategoryPlot(org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 436,
      "end_line": 519,
      "comment": "\r\n     * Creates a new plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the item renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 16)",
        "(line 443,col 9)-(line 443,col 52)",
        "(line 446,col 9)-(line 446,col 43)",
        "(line 447,col 9)-(line 447,col 52)",
        "(line 448,col 9)-(line 448,col 42)",
        "(line 449,col 9)-(line 449,col 51)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 452,col 54)",
        "(line 454,col 9)-(line 454,col 42)",
        "(line 456,col 9)-(line 456,col 41)",
        "(line 457,col 9)-(line 457,col 38)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 66)",
        "(line 464,col 9)-(line 464,col 66)",
        "(line 465,col 9)-(line 465,col 62)",
        "(line 467,col 9)-(line 467,col 40)",
        "(line 468,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 43)",
        "(line 474,col 9)-(line 474,col 42)",
        "(line 475,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 42)",
        "(line 481,col 9)-(line 481,col 41)",
        "(line 482,col 9)-(line 482,col 41)",
        "(line 483,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 30)",
        "(line 489,col 9)-(line 489,col 29)",
        "(line 491,col 9)-(line 491,col 71)",
        "(line 492,col 9)-(line 492,col 60)",
        "(line 493,col 9)-(line 493,col 60)",
        "(line 494,col 9)-(line 494,col 58)",
        "(line 496,col 9)-(line 496,col 69)",
        "(line 497,col 9)-(line 497,col 59)",
        "(line 498,col 9)-(line 498,col 57)",
        "(line 500,col 9)-(line 500,col 53)",
        "(line 501,col 9)-(line 501,col 53)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 503,col 9)-(line 503,col 52)",
        "(line 505,col 9)-(line 507,col 52)",
        "(line 508,col 9)-(line 508,col 51)",
        "(line 510,col 9)-(line 510,col 31)",
        "(line 512,col 9)-(line 512,col 63)",
        "(line 513,col 9)-(line 513,col 39)",
        "(line 514,col 9)-(line 514,col 61)",
        "(line 515,col 9)-(line 515,col 59)",
        "(line 517,col 9)-(line 517,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getPlotType()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\r\n     * Returns a string describing the type of plot.\r\n     *\r\n     * @return The type.\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getOrientation()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation of the plot (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOrientation(PlotOrientation)\r\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getOrientation()\r\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 39)",
        "(line 554,col 9)-(line 554,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAxisOffset()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 576,
      "end_line": 582,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 33)",
        "(line 581,col 9)-(line 581,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\r\n     * Returns the domain axis for the plot.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s \r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #setDomainAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxis(int)",
      "begin_line": 606,
      "end_line": 619,
      "comment": "\r\n     * Returns a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setDomainAxis(int, CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 35)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxis(int, org.jfree.chart.axis.CategoryAxis, boolean)",
      "begin_line": 654,
      "end_line": 670,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 74)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 663,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxes(org.jfree.chart.axis.CategoryAxis[])",
      "begin_line": 680,
      "end_line": 685,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxes(ValueAxis[])\r\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 700,
      "end_line": 705,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The axis index.\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation()",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\r\n     * Returns the domain axis location for the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisLocation(int)",
      "begin_line": 727,
      "end_line": 736,
      "comment": "\r\n     * Returns the location for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     * \r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 35)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 747,
      "end_line": 750,
      "comment": "\r\n     * Sets the location of the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 759,
      "end_line": 762,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether listeners are notified.\r\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 774,
      "end_line": 777,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 792,
      "end_line": 802,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 54)",
        "(line 799,col 9)-(line 801,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\r\n     * Returns the domain axis edge.  This is derived from the axis location\r\n     * and the plot orientation.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisEdge(int)",
      "begin_line": 821,
      "end_line": 831,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 36)",
        "(line 823,col 9)-(line 823,col 61)",
        "(line 824,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisCount()",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainAxes()",
      "begin_line": 846,
      "end_line": 855,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 32)",
        "(line 854,col 9)-(line 854,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureDomainAxes()",
      "begin_line": 860,
      "end_line": 867,
      "comment": "\r\n     * Configures the domain axes.\r\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 866,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis()",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * null, then the method will return the parent plot\u0027s range axis (if there\r\n     * is a parent plot).\r\n     *\r\n     * @return The range axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxis(int)",
      "begin_line": 887,
      "end_line": 900,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 32)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 908,
      "end_line": 910,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 919,
      "end_line": 921,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 931,
      "end_line": 947,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 67)",
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 40)",
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 957,
      "end_line": 962,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setDomainAxes(CategoryAxis[])\r\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 977,
      "end_line": 990,
      "comment": "\r\n     * Returns the index of the specified axis, or \u003ccode\u003e-1\u003c/code\u003e if the axis\r\n     * is not assigned to the plot.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     * @see #getDomainAxisIndex(CategoryAxis)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 50)",
        "(line 982,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation()",
      "begin_line": 997,
      "end_line": 999,
      "comment": "\r\n     * Returns the range axis location.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisLocation(int)",
      "begin_line": 1010,
      "end_line": 1019,
      "comment": "\r\n     * Returns the location for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location.\r\n     * \r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 35)",
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1018,col 9)-(line 1018,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": "\r\n     * Sets the location of the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxisLocation(AxisLocation, boolean)\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "\r\n     * Sets the location of the range axis and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #setDomainAxisLocation(AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1073,
      "end_line": 1083,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1079,col 53)",
        "(line 1080,col 9)-(line 1082,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge()",
      "begin_line": 1090,
      "end_line": 1092,
      "comment": "\r\n     * Returns the edge where the primary range axis is located.\r\n     *\r\n     * @return The edge (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisEdge(int)",
      "begin_line": 1101,
      "end_line": 1109,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 60)",
        "(line 1103,col 9)-(line 1104,col 34)",
        "(line 1105,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisCount()",
      "begin_line": 1116,
      "end_line": 1118,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1117,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeAxes()",
      "begin_line": 1124,
      "end_line": 1133,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1131,col 31)",
        "(line 1132,col 9)-(line 1132,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.configureRangeAxes()",
      "begin_line": 1138,
      "end_line": 1145,
      "comment": "\r\n     * Configures the range axes.\r\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset()",
      "begin_line": 1154,
      "end_line": 1156,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataset(int)",
      "begin_line": 1167,
      "end_line": 1173,
      "comment": "\r\n     * Returns the dataset at the given index.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(int, CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 38)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset, if there \r\n     * is one.  This method also calls the \r\n     * {@link #datasetChanged(DatasetChangeEvent)} method, which adjusts the \r\n     * axis ranges if necessary and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1187,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDataset(int, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1198,
      "end_line": 1213,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 78)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 42)",
        "(line 1205,col 9)-(line 1207,col 9)",
        "(line 1210,col 9)-(line 1210,col 73)",
        "(line 1211,col 9)-(line 1211,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetCount()",
      "begin_line": 1222,
      "end_line": 1224,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1234,
      "end_line": 1238,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.\r\n     * \r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     * \r\n     * @see #getDomainAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 71)",
        "(line 1237,col 9)-(line 1237,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainAxisForDataset(int)",
      "begin_line": 1250,
      "end_line": 1257,
      "comment": "\r\n     * Returns the domain axis for a dataset.  You can change the axis for a \r\n     * dataset using the {@link #mapDatasetToDomainAxis(int, int)} method.\r\n     * \r\n     * @param index  the dataset index.\r\n     * \r\n     * @return The domain axis.\r\n     * \r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 46)",
        "(line 1252,col 9)-(line 1252,col 77)",
        "(line 1253,col 9)-(line 1255,col 9)",
        "(line 1256,col 9)-(line 1256,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1267,
      "end_line": 1271,
      "comment": "\r\n     * Maps a dataset to a particular range axis.\r\n     * \r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index (zero-based).\r\n     * \r\n     * @see #getRangeAxisForDataset(int)\r\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 70)",
        "(line 1270,col 9)-(line 1270,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeAxisForDataset(int)",
      "begin_line": 1283,
      "end_line": 1290,
      "comment": "\r\n     * Returns the range axis for a dataset.  You can change the axis for a \r\n     * dataset using the {@link #mapDatasetToRangeAxis(int, int)} method.\r\n     * \r\n     * @param index  the dataset index.\r\n     * \r\n     * @return The range axis.\r\n     * \r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 42)",
        "(line 1285,col 9)-(line 1285,col 76)",
        "(line 1286,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1289,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer()",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "\r\n     * Returns a reference to the renderer for the plot.\r\n     *\r\n     * @return The renderer.\r\n     * \r\n     * @see #setRenderer(CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRenderer(int)",
      "begin_line": 1312,
      "end_line": 1318,
      "comment": "\r\n     * Returns the renderer at the given index.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(int, CategoryItemRenderer)\r\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 43)",
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1317,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1329,
      "end_line": 1331,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\" \r\n     * renderer) and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted.\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1330,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1350,
      "end_line": 1352,
      "comment": "\r\n     * Sets the renderer at index 0 (sometimes referred to as the \"primary\" \r\n     * renderer) and, if requested, sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cp\u003e\r\n     * You can set the renderer to \u003ccode\u003enull\u003c/code\u003e, but this is not \r\n     * recommended because:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno data will be displayed;\u003c/li\u003e\r\n     *   \u003cli\u003ethe plot background will not be painted;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer()\r\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1364,
      "end_line": 1366,
      "comment": "\r\n     * Sets the renderer at the specified index and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer(int)\r\n     * @see #setRenderer(int, CategoryItemRenderer, boolean)\r\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderer(int, org.jfree.chart.renderer.category.CategoryItemRenderer, boolean)",
      "begin_line": 1378,
      "end_line": 1401,
      "comment": "\r\n     * Sets a renderer.  A {@link PlotChangeEvent} is sent to all registered \r\n     * listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer(int)\r\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1383,col 63)",
        "(line 1384,col 9)-(line 1386,col 9)",
        "(line 1389,col 9)-(line 1389,col 44)",
        "(line 1390,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1395,col 30)",
        "(line 1396,col 9)-(line 1396,col 29)",
        "(line 1398,col 9)-(line 1400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[])",
      "begin_line": 1409,
      "end_line": 1414,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param renderers  the renderers.\r\n     ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1412,col 9)",
        "(line 1413,col 9)-(line 1413,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRendererForDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1424,
      "end_line": 1433,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  If the dataset doesn\u0027t\r\n     * belong to the plot, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 43)",
        "(line 1426,col 9)-(line 1431,col 9)",
        "(line 1432,col 9)-(line 1432,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1443,
      "end_line": 1445,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     * \r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 1444,col 9)-(line 1444,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDatasetRenderingOrder()",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     ",
      "child_ranges": [
        "(line 1455,col 9)-(line 1455,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1468,
      "end_line": 1474,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.  By default, the plot renders the primary dataset \r\n     * last (so that the primary dataset overlays the secondary datasets).  You \r\n     * can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDatasetRenderingOrder()\r\n     ",
      "child_ranges": [
        "(line 1469,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1472,col 36)",
        "(line 1473,col 9)-(line 1473,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getColumnRenderingOrder()",
      "begin_line": 1484,
      "end_line": 1486,
      "comment": "\r\n     * Returns the order in which the columns are rendered.  The default value\r\n     * is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     * \r\n     * @return The column rendering order (never \u003ccode\u003enull\u003c/code).\r\n     * \r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setColumnRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1499,
      "end_line": 1505,
      "comment": "\r\n     * Sets the column order in which the items in each dataset should be \r\n     * rendered and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.  Note that this affects the order in which items are drawn, \r\n     * NOT their position in the chart.\r\n     * \r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getColumnRenderingOrder()\r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1500,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1503,col 42)",
        "(line 1504,col 9)-(line 1504,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRowRenderingOrder()",
      "begin_line": 1515,
      "end_line": 1517,
      "comment": "\r\n     * Returns the order in which the rows should be rendered.  The default \r\n     * value is \u003ccode\u003eSortOrder.ASCENDING\u003c/code\u003e.\r\n     * \r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRowRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1516,col 9)-(line 1516,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRowRenderingOrder(org.jfree.chart.util.SortOrder)",
      "begin_line": 1530,
      "end_line": 1536,
      "comment": "\r\n     * Sets the row order in which the items in each dataset should be \r\n     * rendered and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.  Note that this affects the order in which items are drawn, \r\n     * NOT their position in the chart.\r\n     * \r\n     * @param order  the order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRowRenderingOrder()\r\n     * @see #setColumnRenderingOrder(SortOrder)\r\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1533,col 9)",
        "(line 1534,col 9)-(line 1534,col 39)",
        "(line 1535,col 9)-(line 1535,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainGridlinesVisible()",
      "begin_line": 1545,
      "end_line": 1547,
      "comment": "\r\n     * Returns the flag that controls whether the domain grid-lines are visible.\r\n     *\r\n     * @return The \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1560,
      "end_line": 1565,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against \r\n     * the domain axis.\r\n     * \u003cp\u003e\r\n     * If the flag value changes, a {@link PlotChangeEvent} is sent to all \r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isDomainGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1561,col 9)-(line 1564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePosition()",
      "begin_line": 1574,
      "end_line": 1576,
      "comment": "\r\n     * Returns the position used for the domain gridlines.\r\n     * \r\n     * @return The gridline position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePosition(CategoryAnchor)\r\n     ",
      "child_ranges": [
        "(line 1575,col 9)-(line 1575,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor)",
      "begin_line": 1586,
      "end_line": 1592,
      "comment": "\r\n     * Sets the position used for the domain gridlines and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlinePosition()\r\n     ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1589,col 9)",
        "(line 1590,col 9)-(line 1590,col 47)",
        "(line 1591,col 9)-(line 1591,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlineStroke()",
      "begin_line": 1601,
      "end_line": 1603,
      "comment": "\r\n     * Returns the stroke used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1602,col 9)-(line 1602,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1613,
      "end_line": 1619,
      "comment": "\r\n     * Sets the stroke used to draw grid-lines against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1614,col 9)-(line 1616,col 9)",
        "(line 1617,col 9)-(line 1617,col 43)",
        "(line 1618,col 9)-(line 1618,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainGridlinePaint()",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\r\n     * Returns the paint used to draw grid-lines against the domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1640,
      "end_line": 1646,
      "comment": "\r\n     * Sets the paint used to draw the grid-lines (if any) against the domain \r\n     * axis and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1641,col 9)-(line 1643,col 9)",
        "(line 1644,col 9)-(line 1644,col 41)",
        "(line 1645,col 9)-(line 1645,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeGridlinesVisible()",
      "begin_line": 1655,
      "end_line": 1657,
      "comment": "\r\n     * Returns the flag that controls whether the range grid-lines are visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 1668,
      "end_line": 1673,
      "comment": "\r\n     * Sets the flag that controls whether or not grid-lines are drawn against \r\n     * the range axis.  If the flag changes value, a {@link PlotChangeEvent} is \r\n     * sent to all registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     ",
      "child_ranges": [
        "(line 1669,col 9)-(line 1672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlineStroke()",
      "begin_line": 1682,
      "end_line": 1684,
      "comment": "\r\n     * Returns the stroke used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1683,col 9)-(line 1683,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 1694,
      "end_line": 1700,
      "comment": "\r\n     * Sets the stroke used to draw the grid-lines against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1695,col 9)-(line 1697,col 9)",
        "(line 1698,col 9)-(line 1698,col 42)",
        "(line 1699,col 9)-(line 1699,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeGridlinePaint()",
      "begin_line": 1709,
      "end_line": 1711,
      "comment": "\r\n     * Returns the paint used to draw the grid-lines against the range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1710,col 9)-(line 1710,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 1721,
      "end_line": 1727,
      "comment": "\r\n     * Sets the paint used to draw the grid lines against the range axis and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1722,col 9)-(line 1724,col 9)",
        "(line 1725,col 9)-(line 1725,col 40)",
        "(line 1726,col 9)-(line 1726,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedLegendItems()",
      "begin_line": 1736,
      "end_line": 1738,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     * \r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     ",
      "child_ranges": [
        "(line 1737,col 9)-(line 1737,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 1749,
      "end_line": 1752,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to \r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created \r\n     * automatically.\r\n     * \r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedLegendItems()\r\n     ",
      "child_ranges": [
        "(line 1750,col 9)-(line 1750,col 38)",
        "(line 1751,col 9)-(line 1751,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getLegendItems()",
      "begin_line": 1761,
      "end_line": 1785,
      "comment": "\r\n     * Returns the legend items for the plot.  By default, this method creates \r\n     * a legend item for each series in each of the datasets.  You can change \r\n     * this behaviour by overriding this method.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 1762,col 9)-(line 1762,col 60)",
        "(line 1763,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1784,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1795,
      "end_line": 1815,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor value.\r\n     *\r\n     * @param x  x-coordinate of the click (in Java2D space).\r\n     * @param y  y-coordinate of the click (in Java2D space).\r\n     * @param info  information about the plot\u0027s dimensions.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 1797,col 9)-(line 1797,col 50)",
        "(line 1798,col 9)-(line 1813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoom(double)",
      "begin_line": 1826,
      "end_line": 1838,
      "comment": "\r\n     * Zooms (in or out) on the plot\u0027s value axis.\r\n     * \u003cp\u003e\r\n     * If the value 0.0 is passed in as the zoom percent, the auto-range\r\n     * calculation for the axis is restored (which sets the range to include\r\n     * the minimum and maximum data values, thus displaying all the data).\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1847,
      "end_line": 1865,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The range axis bounds will be recalculated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 42)",
        "(line 1850,col 9)-(line 1855,col 9)",
        "(line 1856,col 9)-(line 1863,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 1872,
      "end_line": 1891,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 1873,col 9)-(line 1873,col 34)",
        "(line 1874,col 9)-(line 1890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker)",
      "begin_line": 1901,
      "end_line": 1903,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a \r\n     * marker will be drawn by the renderer as a line perpendicular to the \r\n     * domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1902,col 9)-(line 1902,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 1915,
      "end_line": 1917,
      "comment": "\r\n     * Adds a marker for display against the domain axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker \r\n     * will be drawn by the renderer as a line perpendicular to the domain axis, \r\n     * however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e \r\n     *               not permitted).\r\n     ",
      "child_ranges": [
        "(line 1916,col 9)-(line 1916,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addDomainMarker(int, org.jfree.chart.plot.CategoryMarker, org.jfree.chart.util.Layer)",
      "begin_line": 1929,
      "end_line": 1957,
      "comment": "\r\n     * Adds a marker for display by a particular renderer.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a domain axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1930,col 9)-(line 1932,col 9)",
        "(line 1933,col 9)-(line 1935,col 9)",
        "(line 1936,col 9)-(line 1936,col 27)",
        "(line 1937,col 9)-(line 1954,col 9)",
        "(line 1955,col 9)-(line 1955,col 39)",
        "(line 1956,col 9)-(line 1956,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers()",
      "begin_line": 1965,
      "end_line": 1985,
      "comment": "\r\n     * Clears all the domain markers for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #clearRangeMarkers()\r\n     ",
      "child_ranges": [
        "(line 1966,col 9)-(line 1974,col 9)",
        "(line 1975,col 9)-(line 1983,col 9)",
        "(line 1984,col 9)-(line 1984,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 1994,
      "end_line": 1996,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @return The list of domain markers.\r\n     ",
      "child_ranges": [
        "(line 1995,col 9)-(line 1995,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2007,
      "end_line": 2020,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and \r\n     * layer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     * \r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2008,col 33)",
        "(line 2009,col 9)-(line 2009,col 41)",
        "(line 2010,col 9)-(line 2015,col 9)",
        "(line 2016,col 9)-(line 2018,col 9)",
        "(line 2019,col 9)-(line 2019,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearDomainMarkers(int)",
      "begin_line": 2029,
      "end_line": 2056,
      "comment": "\r\n     * Clears all the domain markers for the specified renderer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2030,col 41)",
        "(line 2031,col 9)-(line 2042,col 9)",
        "(line 2043,col 9)-(line 2054,col 9)",
        "(line 2055,col 9)-(line 2055,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2069,
      "end_line": 2071,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2070,col 9)-(line 2070,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2085,
      "end_line": 2087,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2086,col 9)-(line 2086,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2102,
      "end_line": 2117,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2103,col 9)-(line 2103,col 26)",
        "(line 2104,col 9)-(line 2111,col 9)",
        "(line 2112,col 9)-(line 2112,col 49)",
        "(line 2113,col 9)-(line 2115,col 9)",
        "(line 2116,col 9)-(line 2116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2127,
      "end_line": 2129,
      "comment": "\r\n     * Adds a marker for display (in the foreground) against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners. Typically a \r\n     * marker will be drawn by the renderer as a line perpendicular to the \r\n     * range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 2128,col 9)-(line 2128,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2141,
      "end_line": 2143,
      "comment": "\r\n     * Adds a marker for display against the range axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.  Typically a marker \r\n     * will be drawn by the renderer as a line perpendicular to the range axis, \r\n     * however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background) (\u003ccode\u003enull\u003c/code\u003e \r\n     *               not permitted).\r\n     ",
      "child_ranges": [
        "(line 2142,col 9)-(line 2142,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2155,
      "end_line": 2177,
      "comment": "\r\n     * Adds a marker for display by a particular renderer.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to a range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer.\r\n     ",
      "child_ranges": [
        "(line 2156,col 9)-(line 2156,col 27)",
        "(line 2157,col 9)-(line 2174,col 9)",
        "(line 2175,col 9)-(line 2175,col 39)",
        "(line 2176,col 9)-(line 2176,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers()",
      "begin_line": 2185,
      "end_line": 2205,
      "comment": "\r\n     * Clears all the range markers for the plot and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #clearDomainMarkers()\r\n     ",
      "child_ranges": [
        "(line 2186,col 9)-(line 2194,col 9)",
        "(line 2195,col 9)-(line 2203,col 9)",
        "(line 2204,col 9)-(line 2204,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 2216,
      "end_line": 2218,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @return The list of range markers.\r\n     * \r\n     * @see #getRangeMarkers(int, Layer)\r\n     ",
      "child_ranges": [
        "(line 2217,col 9)-(line 2217,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 2229,
      "end_line": 2242,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and \r\n     * layer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     * \r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2230,col 9)-(line 2230,col 33)",
        "(line 2231,col 9)-(line 2231,col 41)",
        "(line 2232,col 9)-(line 2237,col 9)",
        "(line 2238,col 9)-(line 2240,col 9)",
        "(line 2241,col 9)-(line 2241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearRangeMarkers(int)",
      "begin_line": 2251,
      "end_line": 2278,
      "comment": "\r\n     * Clears all the range markers for the specified renderer.\r\n     * \r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearDomainMarkers(int)\r\n     ",
      "child_ranges": [
        "(line 2252,col 9)-(line 2252,col 41)",
        "(line 2253,col 9)-(line 2264,col 9)",
        "(line 2265,col 9)-(line 2276,col 9)",
        "(line 2277,col 9)-(line 2277,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2291,
      "end_line": 2293,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2292,col 9)-(line 2292,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2307,
      "end_line": 2309,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2308,col 9)-(line 2308,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2324,
      "end_line": 2343,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 2325,col 9)-(line 2327,col 9)",
        "(line 2328,col 9)-(line 2328,col 26)",
        "(line 2329,col 9)-(line 2336,col 9)",
        "(line 2338,col 9)-(line 2338,col 49)",
        "(line 2339,col 9)-(line 2341,col 9)",
        "(line 2342,col 9)-(line 2342,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairVisible()",
      "begin_line": 2352,
      "end_line": 2354,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 2353,col 9)-(line 2353,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 2363,
      "end_line": 2368,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isRangeCrosshairVisible()\r\n     ",
      "child_ranges": [
        "(line 2364,col 9)-(line 2367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 2378,
      "end_line": 2380,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     ",
      "child_ranges": [
        "(line 2379,col 9)-(line 2379,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 2390,
      "end_line": 2397,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should \r\n     * \"lock-on\" to actual data values.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isRangeCrosshairLockedOnData()\r\n     ",
      "child_ranges": [
        "(line 2392,col 9)-(line 2395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairValue()",
      "begin_line": 2406,
      "end_line": 2408,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setRangeCrosshairValue(double)\r\n     ",
      "child_ranges": [
        "(line 2407,col 9)-(line 2407,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double)",
      "begin_line": 2420,
      "end_line": 2422,
      "comment": "\r\n     * Sets the domain crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 2421,col 9)-(line 2421,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 2435,
      "end_line": 2440,
      "comment": "\r\n     * Sets the range crosshair value and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners (but only if the \r\n     * crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getRangeCrosshairValue()\r\n     ",
      "child_ranges": [
        "(line 2436,col 9)-(line 2436,col 41)",
        "(line 2437,col 9)-(line 2439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairStroke()",
      "begin_line": 2452,
      "end_line": 2454,
      "comment": "\r\n     * Returns the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the crosshair \r\n     * (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 2453,col 9)-(line 2453,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 2466,
      "end_line": 2472,
      "comment": "\r\n     * Sets the pen-style (\u003ccode\u003eStroke\u003c/code\u003e) used to draw the range \r\n     * crosshair (if visible), and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 2467,col 9)-(line 2469,col 9)",
        "(line 2470,col 9)-(line 2470,col 43)",
        "(line 2471,col 9)-(line 2471,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getRangeCrosshairPaint()",
      "begin_line": 2483,
      "end_line": 2485,
      "comment": "\r\n     * Returns the paint used to draw the range crosshair.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     ",
      "child_ranges": [
        "(line 2484,col 9)-(line 2484,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 2495,
      "end_line": 2501,
      "comment": "\r\n     * Sets the paint used to draw the range crosshair (if visible) and \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeCrosshairPaint()\r\n     ",
      "child_ranges": [
        "(line 2496,col 9)-(line 2498,col 9)",
        "(line 2499,col 9)-(line 2499,col 41)",
        "(line 2500,col 9)-(line 2500,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnnotations()",
      "begin_line": 2508,
      "end_line": 2510,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2509,col 9)-(line 2509,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 2520,
      "end_line": 2526,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2521,col 9)-(line 2523,col 9)",
        "(line 2524,col 9)-(line 2524,col 41)",
        "(line 2525,col 9)-(line 2525,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 2538,
      "end_line": 2547,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @see #addAnnotation(CategoryAnnotation)\r\n     ",
      "child_ranges": [
        "(line 2539,col 9)-(line 2541,col 9)",
        "(line 2542,col 9)-(line 2542,col 62)",
        "(line 2543,col 9)-(line 2545,col 9)",
        "(line 2546,col 9)-(line 2546,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clearAnnotations()",
      "begin_line": 2553,
      "end_line": 2556,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     ",
      "child_ranges": [
        "(line 2554,col 9)-(line 2554,col 33)",
        "(line 2555,col 9)-(line 2555,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2567,
      "end_line": 2611,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2571,col 9)-(line 2573,col 9)",
        "(line 2576,col 9)-(line 2607,col 9)",
        "(line 2609,col 9)-(line 2609,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2622,
      "end_line": 2657,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The required space.\r\n     ",
      "child_ranges": [
        "(line 2626,col 9)-(line 2628,col 9)",
        "(line 2631,col 9)-(line 2654,col 9)",
        "(line 2655,col 9)-(line 2655,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2667,
      "end_line": 2673,
      "comment": "\r\n     * Calculates the space required for the axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The space required for the axes.\r\n     ",
      "child_ranges": [
        "(line 2669,col 9)-(line 2669,col 42)",
        "(line 2670,col 9)-(line 2670,col 61)",
        "(line 2671,col 9)-(line 2671,col 62)",
        "(line 2672,col 9)-(line 2672,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2691,
      "end_line": 2861,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     * \u003cP\u003e\r\n     * At your option, you may supply an instance of {@link PlotRenderingInfo}.\r\n     * If you do, it will be populated with information about the drawing,\r\n     * including various plot dimensions and tooltip info.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot (including axes) should \r\n     *              be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param state  collects info as the chart is drawn (possibly \r\n     *               \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2697,col 9)-(line 2697,col 64)",
        "(line 2698,col 9)-(line 2698,col 66)",
        "(line 2699,col 9)-(line 2701,col 9)",
        "(line 2704,col 9)-(line 2709,col 9)",
        "(line 2710,col 9)-(line 2710,col 32)",
        "(line 2713,col 9)-(line 2713,col 45)",
        "(line 2714,col 9)-(line 2714,col 26)",
        "(line 2717,col 9)-(line 2717,col 55)",
        "(line 2718,col 9)-(line 2718,col 56)",
        "(line 2719,col 9)-(line 2719,col 39)",
        "(line 2721,col 9)-(line 2721,col 36)",
        "(line 2725,col 9)-(line 2730,col 9)",
        "(line 2732,col 9)-(line 2732,col 63)",
        "(line 2735,col 9)-(line 2735,col 39)",
        "(line 2736,col 9)-(line 2736,col 26)",
        "(line 2738,col 9)-(line 2738,col 42)",
        "(line 2740,col 9)-(line 2740,col 80)",
        "(line 2741,col 9)-(line 2746,col 9)",
        "(line 2747,col 9)-(line 2749,col 9)",
        "(line 2752,col 9)-(line 2754,col 9)",
        "(line 2755,col 9)-(line 2757,col 9)",
        "(line 2760,col 9)-(line 2760,col 34)",
        "(line 2763,col 9)-(line 2763,col 56)",
        "(line 2764,col 9)-(line 2765,col 64)",
        "(line 2767,col 9)-(line 2767,col 65)",
        "(line 2768,col 9)-(line 2825,col 9)",
        "(line 2828,col 9)-(line 2830,col 9)",
        "(line 2831,col 9)-(line 2833,col 9)",
        "(line 2836,col 9)-(line 2836,col 45)",
        "(line 2838,col 9)-(line 2838,col 30)",
        "(line 2839,col 9)-(line 2839,col 43)",
        "(line 2841,col 9)-(line 2843,col 9)",
        "(line 2846,col 9)-(line 2851,col 9)",
        "(line 2854,col 9)-(line 2859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2873,
      "end_line": 2876,
      "comment": "\r\n     * Draws the plot background (the background color and/or image).\r\n     * \u003cP\u003e\r\n     * This method will be called during the chart drawing process and is \r\n     * declared public so that it can be accessed by the renderers used by \r\n     * certain subclasses.  You shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     ",
      "child_ranges": [
        "(line 2874,col 9)-(line 2874,col 51)",
        "(line 2875,col 9)-(line 2875,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2889,
      "end_line": 2972,
      "comment": "\r\n     * A utility method for drawing the plot\u0027s axes.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     * \r\n     * @return A map containing the axis states.\r\n     ",
      "child_ranges": [
        "(line 2894,col 9)-(line 2894,col 61)",
        "(line 2897,col 9)-(line 2902,col 9)",
        "(line 2905,col 9)-(line 2910,col 9)",
        "(line 2912,col 9)-(line 2912,col 41)",
        "(line 2915,col 9)-(line 2916,col 38)",
        "(line 2917,col 9)-(line 2917,col 69)",
        "(line 2918,col 9)-(line 2926,col 9)",
        "(line 2929,col 9)-(line 2930,col 79)",
        "(line 2931,col 9)-(line 2931,col 63)",
        "(line 2932,col 9)-(line 2940,col 9)",
        "(line 2943,col 9)-(line 2944,col 76)",
        "(line 2945,col 9)-(line 2945,col 61)",
        "(line 2946,col 9)-(line 2954,col 9)",
        "(line 2957,col 9)-(line 2958,col 77)",
        "(line 2959,col 9)-(line 2959,col 62)",
        "(line 2960,col 9)-(line 2968,col 9)",
        "(line 2970,col 9)-(line 2970,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2985,
      "end_line": 3043,
      "comment": "\r\n     * Draws a representation of a dataset within the dataArea region using the\r\n     * appropriate renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset and renderer index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * \r\n     * @return A boolean that indicates whether or not real data was found.\r\n     ",
      "child_ranges": [
        "(line 2988,col 9)-(line 2988,col 34)",
        "(line 2989,col 9)-(line 2989,col 59)",
        "(line 2990,col 9)-(line 2990,col 59)",
        "(line 2991,col 9)-(line 2991,col 65)",
        "(line 2992,col 9)-(line 2992,col 60)",
        "(line 2993,col 9)-(line 2993,col 74)",
        "(line 2994,col 9)-(line 3040,col 9)",
        "(line 3041,col 9)-(line 3041,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3053,
      "end_line": 3082,
      "comment": "\r\n     * Draws the gridlines for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * \r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     ",
      "child_ranges": [
        "(line 3056,col 9)-(line 3081,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3093,
      "end_line": 3114,
      "comment": "\r\n     * Draws the gridlines for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 3096,col 9)-(line 3113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3123,
      "end_line": 3134,
      "comment": "\r\n     * Draws the annotations.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 3126,col 9)-(line 3126,col 56)",
        "(line 3127,col 9)-(line 3132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3147,
      "end_line": 3165,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is \r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #drawRangeMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3150,col 9)-(line 3150,col 52)",
        "(line 3151,col 9)-(line 3153,col 9)",
        "(line 3155,col 9)-(line 3155,col 60)",
        "(line 3156,col 9)-(line 3156,col 59)",
        "(line 3157,col 9)-(line 3163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3178,
      "end_line": 3196,
      "comment": "\r\n     * Draws the range markers (if any) for an axis and layer.  This method is \r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #drawDomainMarkers(Graphics2D, Rectangle2D, int, Layer)\r\n     ",
      "child_ranges": [
        "(line 3181,col 9)-(line 3181,col 52)",
        "(line 3182,col 9)-(line 3184,col 9)",
        "(line 3186,col 9)-(line 3186,col 59)",
        "(line 3187,col 9)-(line 3187,col 55)",
        "(line 3188,col 9)-(line 3194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3208,
      "end_line": 3226,
      "comment": "\r\n     * Utility method for drawing a line perpendicular to the range axis (used\r\n     * for crosshairs).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param value  the data value.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 3211,col 9)-(line 3212,col 36)",
        "(line 3213,col 9)-(line 3213,col 27)",
        "(line 3214,col 9)-(line 3221,col 9)",
        "(line 3222,col 9)-(line 3222,col 29)",
        "(line 3223,col 9)-(line 3223,col 27)",
        "(line 3224,col 9)-(line 3224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3241,
      "end_line": 3265,
      "comment": "\r\n     * Draws a range crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 3245,col 9)-(line 3247,col 9)",
        "(line 3248,col 9)-(line 3248,col 27)",
        "(line 3249,col 9)-(line 3260,col 9)",
        "(line 3261,col 9)-(line 3261,col 29)",
        "(line 3262,col 9)-(line 3262,col 27)",
        "(line 3263,col 9)-(line 3263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3276,
      "end_line": 3301,
      "comment": "\r\n     * Returns the range of data values that will be plotted against the range \r\n     * axis.  If the dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The data range.\r\n     ",
      "child_ranges": [
        "(line 3278,col 9)-(line 3278,col 28)",
        "(line 3279,col 9)-(line 3279,col 46)",
        "(line 3281,col 9)-(line 3281,col 54)",
        "(line 3282,col 9)-(line 3287,col 9)",
        "(line 3291,col 9)-(line 3291,col 54)",
        "(line 3292,col 9)-(line 3298,col 9)",
        "(line 3299,col 9)-(line 3299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToDomainAxis(int)",
      "begin_line": 3313,
      "end_line": 3335,
      "comment": "\r\n     * Returns a list of the datasets that are mapped to the axis with the\r\n     * specified index.\r\n     * \r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @return The list (possibly empty, but never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 3314,col 9)-(line 3314,col 38)",
        "(line 3315,col 9)-(line 3333,col 9)",
        "(line 3334,col 9)-(line 3334,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.datasetsMappedToRangeAxis(int)",
      "begin_line": 3345,
      "end_line": 3365,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a \r\n     * given range axis.\r\n     * \r\n     * @param index  the axis index.\r\n     * \r\n     * @return A list of datasets.\r\n     ",
      "child_ranges": [
        "(line 3346,col 9)-(line 3346,col 38)",
        "(line 3347,col 9)-(line 3363,col 9)",
        "(line 3364,col 9)-(line 3364,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getWeight()",
      "begin_line": 3375,
      "end_line": 3377,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a \r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     * \r\n     * @see #setWeight(int)\r\n     ",
      "child_ranges": [
        "(line 3376,col 9)-(line 3376,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setWeight(int)",
      "begin_line": 3386,
      "end_line": 3389,
      "comment": "\r\n     * Sets the weight for the plot.\r\n     *\r\n     * @param weight  the weight.\r\n     * \r\n     * @see #getWeight()\r\n     ",
      "child_ranges": [
        "(line 3387,col 9)-(line 3387,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedDomainAxisSpace()",
      "begin_line": 3398,
      "end_line": 3400,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 3399,col 9)-(line 3399,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3409,
      "end_line": 3412,
      "comment": "\r\n     * Sets the fixed domain axis space.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 3410,col 9)-(line 3410,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getFixedRangeAxisSpace()",
      "begin_line": 3421,
      "end_line": 3423,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     ",
      "child_ranges": [
        "(line 3422,col 9)-(line 3422,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3432,
      "end_line": 3435,
      "comment": "\r\n     * Sets the fixed range axis space.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     ",
      "child_ranges": [
        "(line 3433,col 9)-(line 3433,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategories()",
      "begin_line": 3444,
      "end_line": 3450,
      "comment": "\r\n     * Returns a list of the categories in the plot\u0027s primary dataset.\r\n     * \r\n     * @return A list of the categories in the plot\u0027s primary dataset.\r\n     * \r\n     * @see #getCategoriesForAxis(CategoryAxis)\r\n     ",
      "child_ranges": [
        "(line 3445,col 9)-(line 3445,col 27)",
        "(line 3446,col 9)-(line 3448,col 9)",
        "(line 3449,col 9)-(line 3449,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 3462,
      "end_line": 3478,
      "comment": "\r\n     * Returns a list of the categories that should be displayed for the\r\n     * specified axis.\r\n     * \r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted)\r\n     * \r\n     * @return The categories.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 3463,col 9)-(line 3463,col 38)",
        "(line 3464,col 9)-(line 3464,col 54)",
        "(line 3465,col 9)-(line 3465,col 62)",
        "(line 3466,col 9)-(line 3466,col 48)",
        "(line 3467,col 9)-(line 3476,col 9)",
        "(line 3477,col 9)-(line 3477,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getDrawSharedDomainAxis()",
      "begin_line": 3488,
      "end_line": 3490,
      "comment": "\r\n     * Returns the flag that controls whether or not the shared domain axis is \r\n     * drawn for each subplot.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawSharedDomainAxis(boolean)\r\n     ",
      "child_ranges": [
        "(line 3489,col 9)-(line 3489,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setDrawSharedDomainAxis(boolean)",
      "begin_line": 3500,
      "end_line": 3503,
      "comment": "\r\n     * Sets the flag that controls whether the shared domain axis is drawn when\r\n     * this plot is being used as a subplot.\r\n     * \r\n     * @param draw  a boolean.\r\n     * \r\n     * @see #getDrawSharedDomainAxis()\r\n     ",
      "child_ranges": [
        "(line 3501,col 9)-(line 3501,col 41)",
        "(line 3502,col 9)-(line 3502,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isDomainZoomable()",
      "begin_line": 3513,
      "end_line": 3515,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that the domain axes are not\r\n     * zoomable.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     ",
      "child_ranges": [
        "(line 3514,col 9)-(line 3514,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.isRangeZoomable()",
      "begin_line": 3524,
      "end_line": 3526,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that the range axes are zoomable.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     ",
      "child_ranges": [
        "(line 3525,col 9)-(line 3525,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3536,
      "end_line": 3539,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3550,
      "end_line": 3553,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     * \r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 3568,
      "end_line": 3571,
      "comment": "\r\n     * This method does nothing, because \u003ccode\u003eCategoryPlot\u003c/code\u003e doesn\u0027t \r\n     * support zooming on the domain.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3580,
      "end_line": 3584,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 3583,col 9)-(line 3583,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 3599,
      "end_line": 3622,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 3603,col 9)-(line 3621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 3632,
      "end_line": 3640,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     * \r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param state  the plot state.\r\n     * @param source  the source point (in Java2D space) for the zoom.\r\n     ",
      "child_ranges": [
        "(line 3634,col 9)-(line 3639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.getAnchorValue()",
      "begin_line": 3649,
      "end_line": 3651,
      "comment": "\r\n     * Returns the anchor value.\r\n     * \r\n     * @return The anchor value.\r\n     * \r\n     * @see #setAnchorValue(double)\r\n     ",
      "child_ranges": [
        "(line 3650,col 9)-(line 3650,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double)",
      "begin_line": 3661,
      "end_line": 3663,
      "comment": "\r\n     * Sets the anchor value and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param value  the anchor value.\r\n     * \r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 3662,col 9)-(line 3662,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.setAnchorValue(double, boolean)",
      "begin_line": 3674,
      "end_line": 3679,
      "comment": "\r\n     * Sets the anchor value and, if requested, sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getAnchorValue()\r\n     ",
      "child_ranges": [
        "(line 3675,col 9)-(line 3675,col 33)",
        "(line 3676,col 9)-(line 3678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.equals(java.lang.Object)",
      "begin_line": 3688,
      "end_line": 3814,
      "comment": " \r\n     * Tests the plot for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 3690,col 9)-(line 3692,col 9)",
        "(line 3693,col 9)-(line 3695,col 9)",
        "(line 3696,col 9)-(line 3698,col 9)",
        "(line 3700,col 9)-(line 3700,col 47)",
        "(line 3702,col 9)-(line 3704,col 9)",
        "(line 3705,col 9)-(line 3707,col 9)",
        "(line 3708,col 9)-(line 3710,col 9)",
        "(line 3711,col 9)-(line 3713,col 9)",
        "(line 3714,col 9)-(line 3716,col 9)",
        "(line 3717,col 9)-(line 3719,col 9)",
        "(line 3720,col 9)-(line 3722,col 9)",
        "(line 3723,col 9)-(line 3726,col 9)",
        "(line 3727,col 9)-(line 3730,col 9)",
        "(line 3731,col 9)-(line 3733,col 9)",
        "(line 3734,col 9)-(line 3736,col 9)",
        "(line 3737,col 9)-(line 3739,col 9)",
        "(line 3740,col 9)-(line 3742,col 9)",
        "(line 3743,col 9)-(line 3745,col 9)",
        "(line 3746,col 9)-(line 3748,col 9)",
        "(line 3749,col 9)-(line 3752,col 9)",
        "(line 3753,col 9)-(line 3756,col 9)",
        "(line 3757,col 9)-(line 3759,col 9)",
        "(line 3760,col 9)-(line 3763,col 9)",
        "(line 3764,col 9)-(line 3767,col 9)",
        "(line 3768,col 9)-(line 3770,col 9)",
        "(line 3771,col 9)-(line 3773,col 9)",
        "(line 3774,col 9)-(line 3776,col 9)",
        "(line 3777,col 9)-(line 3780,col 9)",
        "(line 3781,col 9)-(line 3784,col 9)",
        "(line 3785,col 9)-(line 3788,col 9)",
        "(line 3789,col 9)-(line 3792,col 9)",
        "(line 3793,col 9)-(line 3796,col 9)",
        "(line 3797,col 9)-(line 3799,col 9)",
        "(line 3800,col 9)-(line 3802,col 9)",
        "(line 3803,col 9)-(line 3806,col 9)",
        "(line 3807,col 9)-(line 3810,col 9)",
        "(line 3812,col 9)-(line 3812,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.clone()",
      "begin_line": 3823,
      "end_line": 3871,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 3825,col 9)-(line 3825,col 58)",
        "(line 3827,col 9)-(line 3827,col 44)",
        "(line 3828,col 9)-(line 3834,col 9)",
        "(line 3835,col 9)-(line 3836,col 60)",
        "(line 3838,col 9)-(line 3838,col 43)",
        "(line 3839,col 9)-(line 3845,col 9)",
        "(line 3846,col 9)-(line 3846,col 80)",
        "(line 3848,col 9)-(line 3848,col 60)",
        "(line 3849,col 9)-(line 3854,col 9)",
        "(line 3855,col 9)-(line 3856,col 63)",
        "(line 3857,col 9)-(line 3858,col 62)",
        "(line 3859,col 9)-(line 3859,col 62)",
        "(line 3860,col 9)-(line 3863,col 9)",
        "(line 3864,col 9)-(line 3867,col 9)",
        "(line 3869,col 9)-(line 3869,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 3880,
      "end_line": 3888,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 3881,col 9)-(line 3881,col 36)",
        "(line 3882,col 9)-(line 3882,col 71)",
        "(line 3883,col 9)-(line 3883,col 69)",
        "(line 3884,col 9)-(line 3884,col 70)",
        "(line 3885,col 9)-(line 3885,col 68)",
        "(line 3886,col 9)-(line 3886,col 71)",
        "(line 3887,col 9)-(line 3887,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 3898,
      "end_line": 3939,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3901,col 9)-(line 3901,col 35)",
        "(line 3902,col 9)-(line 3902,col 71)",
        "(line 3903,col 9)-(line 3903,col 69)",
        "(line 3904,col 9)-(line 3904,col 70)",
        "(line 3905,col 9)-(line 3905,col 68)",
        "(line 3906,col 9)-(line 3906,col 71)",
        "(line 3907,col 9)-(line 3907,col 69)",
        "(line 3909,col 9)-(line 3915,col 9)",
        "(line 3916,col 9)-(line 3922,col 9)",
        "(line 3923,col 9)-(line 3923,col 48)",
        "(line 3924,col 9)-(line 3929,col 9)",
        "(line 3930,col 9)-(line 3930,col 50)",
        "(line 3931,col 9)-(line 3937,col 9)"
      ]
    }
  ]
}