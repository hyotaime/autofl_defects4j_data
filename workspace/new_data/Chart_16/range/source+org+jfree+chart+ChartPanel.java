{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/ChartPanel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartPanel",
      "is_interface": false,
      "parent_types": [
        "javax.swing.JPanel",
        "org.jfree.chart.event.ChartChangeListener",
        "org.jfree.chart.event.ChartProgressListener",
        "java.awt.event.ActionListener",
        "java.awt.event.MouseListener",
        "java.awt.event.MouseMotionListener",
        "java.awt.print.Printable",
        "java.io.Serializable"
      ],
      "begin_line": 201,
      "end_line": 2538,
      "comment": "\r\n * A Swing GUI component for displaying a {@link JFreeChart} object.\r\n * \u003cP\u003e\r\n * The panel registers with the chart to receive notification of changes to any\r\n * component of the chart.  The chart is redrawn automatically whenever this \r\n * notification is received.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_USED"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Default setting for buffer usage. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The default panel width. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HEIGHT"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The default panel height. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_WIDTH"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_WIDTH"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZOOM_TRIGGER_DISTANCE"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " The minimum size required to perform a zoom on a rectangle "
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTIES_COMMAND"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Properties action command. "
    },
    {
      "type": "field",
      "varNames": [
        "SAVE_COMMAND"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Save action command. "
    },
    {
      "type": "field",
      "varNames": [
        "PRINT_COMMAND"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Print action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_BOTH_COMMAND"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " Zoom in (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_DOMAIN_COMMAND"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Zoom in (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_RANGE_COMMAND"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Zoom in (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_BOTH_COMMAND"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Zoom out (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_DOMAIN_COMMAND"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " Zoom out (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_RANGE_COMMAND"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": " Zoom out (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_BOTH_COMMAND"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " Zoom reset (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_DOMAIN_COMMAND"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " Zoom reset (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_RANGE_COMMAND"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " Zoom reset (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The chart that is displayed in the panel. "
    },
    {
      "type": "field",
      "varNames": [
        "chartMouseListeners"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " Storage for registered (chart) mouse listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "useBuffer"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " A flag that controls whether or not the off-screen buffer is used. "
    },
    {
      "type": "field",
      "varNames": [
        "refreshBuffer"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " A flag that indicates that the buffer should be refreshed. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBuffer"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " A buffer for the rendered chart. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferHeight"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The height of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferWidth"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The width of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawWidth"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " \r\n     * The minimum width for drawing a chart (uses scaling for smaller widths). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawHeight"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " \r\n     * The minimum height for drawing a chart (uses scaling for smaller \r\n     * heights). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawWidth"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " \r\n     * The maximum width for drawing a chart (uses scaling for bigger \r\n     * widths). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawHeight"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " \r\n     * The maximum height for drawing a chart (uses scaling for bigger \r\n     * heights). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "popup"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The popup menu for the frame. "
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The drawing info collected the last time the chart was drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The chart anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleX"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleY"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZoomable"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " A flag that controls whether or not domain zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZoomable"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " A flag that controls whether or not range zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomPoint"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " \r\n     * The zoom rectangle starting point (selected by the user with a mouse \r\n     * click).  This is a point on the screen, not the chart (which may have\r\n     * been scaled up or down to fit the panel).  \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomRectangle"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The zoom rectangle (selected by the user with the mouse). "
    },
    {
      "type": "field",
      "varNames": [
        "fillZoomRectangle"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " Controls if the zoom rectangle is drawn as an outline or filled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomTriggerDistance"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " The minimum distance required to drag the mouse to trigger a zoom. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalAxisTrace"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " A flag that controls whether or not horizontal tracing is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalAxisTrace"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " A flag that controls whether or not vertical tracing is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalTraceLine"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " A vertical trace line. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalTraceLine"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " A horizontal trace line. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInBothMenuItem"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Menu item for zooming in on a chart (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInDomainMenuItem"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " Menu item for zooming in on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInRangeMenuItem"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " Menu item for zooming in on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutBothMenuItem"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Menu item for zooming out on a chart. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutDomainMenuItem"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Menu item for zooming out on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutRangeMenuItem"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Menu item for zooming out on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetBothMenuItem"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Menu item for resetting the zoom (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetDomainMenuItem"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " Menu item for resetting the zoom (domain axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetRangeMenuItem"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " Menu item for resetting the zoom (range axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDirectoryForSaveAs"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": "\r\n     * The default directory for saving charts to file.\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enforceFileExtensions"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " A flag that controls whether or not file extensions are enforced. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDelaysActive"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " A flag that indicates if original tooltip delays are changed. "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipInitialDelay"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Original initial tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipReshowDelay"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Original reshow tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipDismissDelay"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " Original dismiss tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipInitialDelay"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Own initial tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipReshowDelay"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Own reshow tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDismissDelay"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " Own dismiss tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInFactor"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " The factor used to zoom in on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutFactor"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " The factor used to zoom out on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomAroundAnchor"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": "\r\n     * A flag that controls whether zoom operations are centred on the\r\n     * current anchor point, or the centre point of the relevant axis.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 437,
      "end_line": 438,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart)",
      "begin_line": 445,
      "end_line": 463,
      "comment": "\r\n     * Constructs a panel that displays the specified chart.\r\n     *\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 461,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean)",
      "begin_line": 472,
      "end_line": 489,
      "comment": "\r\n     * Constructs a panel containing a chart.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param useBuffer  a flag controlling whether or not an off-screen buffer\r\n     *                   is used.\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 487,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 506,
      "end_line": 528,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should\r\n     *              be added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 526,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 554,
      "end_line": 603,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param width  the preferred width of the panel.\r\n     * @param height  the preferred height of the panel.\r\n     * @param minimumDrawWidth  the minimum drawing width.\r\n     * @param minimumDrawHeight  the minimum drawing height.\r\n     * @param maximumDrawWidth  the maximum drawing width.\r\n     * @param maximumDrawHeight  the maximum drawing height.\r\n     * @param useBuffer  a flag that indicates whether to use the off-screen\r\n     *                   buffer to improve performance (at the expense of \r\n     *                   memory).\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should be \r\n     *              added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be \r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 29)",
        "(line 569,col 9)-(line 569,col 59)",
        "(line 570,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 571,col 55)",
        "(line 572,col 9)-(line 572,col 35)",
        "(line 573,col 9)-(line 573,col 35)",
        "(line 574,col 9)-(line 574,col 49)",
        "(line 575,col 9)-(line 575,col 51)",
        "(line 576,col 9)-(line 576,col 49)",
        "(line 577,col 9)-(line 577,col 51)",
        "(line 578,col 9)-(line 578,col 65)",
        "(line 581,col 9)-(line 581,col 26)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 48)",
        "(line 587,col 9)-(line 587,col 55)",
        "(line 588,col 9)-(line 588,col 37)",
        "(line 589,col 9)-(line 589,col 31)",
        "(line 590,col 9)-(line 590,col 37)",
        "(line 592,col 9)-(line 592,col 46)",
        "(line 593,col 9)-(line 593,col 42)",
        "(line 597,col 9)-(line 597,col 61)",
        "(line 598,col 9)-(line 598,col 60)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 58)",
        "(line 602,col 9)-(line 602,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChart()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\r\n     * Returns the chart contained in the panel.\r\n     *\r\n     * @return The chart (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setChart(org.jfree.chart.JFreeChart)",
      "begin_line": 619,
      "end_line": 651,
      "comment": "\r\n     * Sets the chart that is displayed in the panel.\r\n     *\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 625,col 9)",
        "(line 628,col 9)-(line 628,col 27)",
        "(line 629,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawWidth()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "\r\n     * Returns the minimum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is less than this, then the chart is\r\n     * drawn at the minimum width then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing width.\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawWidth(int)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\r\n     * Sets the minimum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * less than this amount, the chart will be drawn using the minimum width\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawWidth()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\r\n     * Returns the maximum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is greater than this, then the chart\r\n     * is drawn at the maximum width then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing width.\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawWidth(int)",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\r\n     * Sets the maximum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * width then scaled up to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawHeight()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\r\n     * Returns the minimum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is less than this, then the chart\r\n     * is drawn at the minimum height then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing height.\r\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawHeight(int)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\r\n     * Sets the minimum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * less than this amount, the chart will be drawn using the minimum height\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawHeight()",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\r\n     * Returns the maximum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is greater than this, then the\r\n     * chart is drawn at the maximum height then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing height.\r\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawHeight(int)",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\r\n     * Sets the maximum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * height then scaled up to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleX()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\r\n     * Returns the X scale factor for the chart.  This will be 1.0 if no \r\n     * scaling has been used.\r\n     * \r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleY()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\r\n     * Returns the Y scale factory for the chart.  This will be 1.0 if no \r\n     * scaling has been used.\r\n     * \r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getAnchor()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\r\n     * Returns the anchor point.\r\n     * \r\n     * @return The anchor point (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setAnchor(java.awt.geom.Point2D)",
      "begin_line": 788,
      "end_line": 790,
      "comment": "\r\n     * Sets the anchor point.  This method is provided for the use of \r\n     * subclasses, not end users.\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getPopupMenu()",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\r\n     * Returns the popup menu.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setPopupMenu(javax.swing.JPopupMenu)",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\r\n     * Sets the popup menu for the panel.\r\n     *\r\n     * @param popup  the popup menu (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChartRenderingInfo()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\r\n     * Returns the chart rendering info from the most recent chart redraw.\r\n     *\r\n     * @return The chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean)",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming and rectangle fill on \r\n     *              zoom.\r\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean, boolean)",
      "begin_line": 836,
      "end_line": 840,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e if zooming enabled\r\n     * @param fillRectangle  \u003ccode\u003etrue\u003c/code\u003e if zoom rectangle is filled,\r\n     *                       false if rectangle is shown as outline only.\r\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 32)",
        "(line 838,col 9)-(line 838,col 31)",
        "(line 839,col 9)-(line 839,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isDomainZoomable()",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for \r\n     * the domain axis.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDomainZoomable(boolean)",
      "begin_line": 859,
      "end_line": 870,
      "comment": "\r\n     * Sets the flag that controls whether or not zooming is enable for the \r\n     * domain axis.  A check is made to ensure that the current plot supports\r\n     * zooming for the domain values.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming if possible.\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isRangeZoomable()",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for \r\n     * the range axis.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRangeZoomable(boolean)",
      "begin_line": 887,
      "end_line": 898,
      "comment": "\r\n     * A flag that controls mouse-based zooming on the vertical axis.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming.\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 897,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getFillZoomRectangle()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\r\n     * Returns the flag that controls whether or not the zoom rectangle is\r\n     * filled when drawn.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setFillZoomRectangle(boolean)",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\r\n     * A flag that controls how the zoom rectangle is drawn.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e instructs to fill the rectangle on\r\n     *              zoom, otherwise it will be outlined.\r\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomTriggerDistance()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\r\n     * Returns the zoom trigger distance.  This controls how far the mouse must\r\n     * move before a zoom action is triggered.\r\n     * \r\n     * @return The distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomTriggerDistance(int)",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\r\n     * Sets the zoom trigger distance.  This controls how far the mouse must \r\n     * move before a zoom action is triggered.\r\n     * \r\n     * @param distance  the distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getHorizontalAxisTrace()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\r\n     * Returns the flag that controls whether or not a horizontal axis trace\r\n     * line is drawn over the plot area at the current mouse location.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setHorizontalAxisTrace(boolean)",
      "begin_line": 956,
      "end_line": 958,
      "comment": "\r\n     * A flag that controls trace lines on the horizontal axis.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables trace lines for the mouse\r\n     *      pointer on the horizontal axis.\r\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getHorizontalTraceLine()",
      "begin_line": 965,
      "end_line": 967,
      "comment": "\r\n     * Returns the horizontal trace line.\r\n     * \r\n     * @return The horizontal trace line (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setHorizontalTraceLine(java.awt.geom.Line2D)",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\r\n     * Sets the horizontal trace line.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getVerticalAxisTrace()",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\r\n     * Returns the flag that controls whether or not a vertical axis trace\r\n     * line is drawn over the plot area at the current mouse location.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setVerticalAxisTrace(boolean)",
      "begin_line": 994,
      "end_line": 996,
      "comment": "\r\n     * A flag that controls trace lines on the vertical axis.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables trace lines for the mouse\r\n     *              pointer on the vertical axis.\r\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getVerticalTraceLine()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * Returns the vertical trace line.\r\n     * \r\n     * @return The vertical trace line (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setVerticalTraceLine(java.awt.geom.Line2D)",
      "begin_line": 1012,
      "end_line": 1014,
      "comment": "\r\n     * Sets the vertical trace line.\r\n     * \r\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDefaultDirectoryForSaveAs()",
      "begin_line": 1023,
      "end_line": 1025,
      "comment": "\r\n     * Returns the default directory for the \"save as\" option.\r\n     * \r\n     * @return The default directory (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDefaultDirectoryForSaveAs(java.io.File)",
      "begin_line": 1035,
      "end_line": 1043,
      "comment": "\r\n     * Sets the default directory for the \"save as\" option.  If you set this\r\n     * to \u003ccode\u003enull\u003c/code\u003e, the user\u0027s default directory will be used.\r\n     * \r\n     * @param directory  the directory (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1042,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isEnforceFileExtensions()",
      "begin_line": 1053,
      "end_line": 1055,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if file extensions should be enforced, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setEnforceFileExtensions(boolean)\r\n     ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setEnforceFileExtensions(boolean)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\r\n     * Sets a flag that controls whether or not file extensions are enforced.\r\n     *\r\n     * @param enforce  the new flag value.\r\n     * \r\n     * @see #isEnforceFileExtensions()\r\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomAroundAnchor()",
      "begin_line": 1078,
      "end_line": 1080,
      "comment": "\r\n     * Returns the flag that controls whether or not zoom operations are \r\n     * centered around the current anchor point.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #setZoomAroundAnchor(boolean)\r\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomAroundAnchor(boolean)",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "\r\n     * Sets the flag that controls whether or not zoom operations are\r\n     * centered around the current anchor point.\r\n     * \r\n     * @param zoomAroundAnchor  the new flag value.\r\n     * \r\n     * @since 1.0.7\r\n     * \r\n     * @see #getZoomAroundAnchor()\r\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDisplayToolTips(boolean)",
      "begin_line": 1104,
      "end_line": 1111,
      "comment": "\r\n     * Switches the display of tooltips for the panel on or off.  Note that \r\n     * tooltips can only be displayed if the chart has been configured to\r\n     * generate tooltip items.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e to enable tooltips, \u003ccode\u003efalse\u003c/code\u003e to\r\n     *              disable tooltips.\r\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getToolTipText(java.awt.event.MouseEvent)",
      "begin_line": 1120,
      "end_line": 1137,
      "comment": "\r\n     * Returns a string for the tooltip.\r\n     *\r\n     * @param e  the mouse event.\r\n     *\r\n     * @return A tool tip or \u003ccode\u003enull\u003c/code\u003e if no tooltip is available.\r\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 29)",
        "(line 1123,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateJava2DToScreen(java.awt.geom.Point2D)",
      "begin_line": 1146,
      "end_line": 1151,
      "comment": "\r\n     * Translates a Java2D point on the chart to a screen location.\r\n     *\r\n     * @param java2DPoint  the Java2D point.\r\n     *\r\n     * @return The screen location.\r\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 36)",
        "(line 1148,col 9)-(line 1148,col 71)",
        "(line 1149,col 9)-(line 1149,col 70)",
        "(line 1150,col 9)-(line 1150,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateScreenToJava2D(java.awt.Point)",
      "begin_line": 1161,
      "end_line": 1166,
      "comment": "\r\n     * Translates a panel (component) location to a Java2D point.\r\n     *\r\n     * @param screenPoint  the screen location (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     *\r\n     * @return The Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 36)",
        "(line 1163,col 9)-(line 1163,col 68)",
        "(line 1164,col 9)-(line 1164,col 67)",
        "(line 1165,col 9)-(line 1165,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.scale(java.awt.geom.Rectangle2D)",
      "begin_line": 1176,
      "end_line": 1183,
      "comment": "\r\n     * Applies any scaling that is in effect for the chart drawing to the\r\n     * given rectangle.\r\n     *  \r\n     * @param rect  the rectangle.\r\n     * \r\n     * @return A new scaled rectangle.\r\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 36)",
        "(line 1178,col 9)-(line 1178,col 59)",
        "(line 1179,col 9)-(line 1179,col 63)",
        "(line 1180,col 9)-(line 1180,col 54)",
        "(line 1181,col 9)-(line 1181,col 55)",
        "(line 1182,col 9)-(line 1182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getEntityForPoint(int, int)",
      "begin_line": 1196,
      "end_line": 1208,
      "comment": "\r\n     * Returns the chart entity at a given point.\r\n     * \u003cP\u003e\r\n     * This method will return null if there is (a) no entity at the given \r\n     * point, or (b) no entity collection has been generated.\r\n     *\r\n     * @param viewX  the x-coordinate.\r\n     * @param viewY  the y-coordinate.\r\n     *\r\n     * @return The chart entity (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 34)",
        "(line 1199,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getRefreshBuffer()",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "\r\n     * Returns the flag that controls whether or not the offscreen buffer\r\n     * needs to be refreshed.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRefreshBuffer(boolean)",
      "begin_line": 1227,
      "end_line": 1229,
      "comment": "\r\n     * Sets the refresh buffer flag.  This flag is used to avoid unnecessary\r\n     * redrawing of the chart when the offscreen image buffer is used.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e indicates that the buffer should be \r\n     *              refreshed.\r\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1228,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.paintComponent(java.awt.Graphics)",
      "begin_line": 1239,
      "end_line": 1367,
      "comment": "\r\n     * Paints the component by drawing the chart to fill the entire component,\r\n     * but allowing for the insets (which will be non-zero if a border has been\r\n     * set for this component).  To increase performance (at the expense of\r\n     * memory), an off-screen buffer image can be used.\r\n     *\r\n     * @param g  the graphics device for drawing on.\r\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 32)",
        "(line 1241,col 9)-(line 1243,col 9)",
        "(line 1244,col 9)-(line 1244,col 48)",
        "(line 1247,col 9)-(line 1247,col 35)",
        "(line 1248,col 9)-(line 1248,col 36)",
        "(line 1249,col 9)-(line 1251,col 63)",
        "(line 1254,col 9)-(line 1254,col 30)",
        "(line 1255,col 9)-(line 1255,col 48)",
        "(line 1256,col 9)-(line 1256,col 50)",
        "(line 1257,col 9)-(line 1257,col 26)",
        "(line 1258,col 9)-(line 1258,col 26)",
        "(line 1260,col 9)-(line 1269,col 9)",
        "(line 1271,col 9)-(line 1280,col 9)",
        "(line 1282,col 9)-(line 1283,col 28)",
        "(line 1286,col 9)-(line 1356,col 9)",
        "(line 1359,col 9)-(line 1359,col 30)",
        "(line 1361,col 9)-(line 1361,col 21)",
        "(line 1363,col 9)-(line 1363,col 27)",
        "(line 1364,col 9)-(line 1364,col 38)",
        "(line 1365,col 9)-(line 1365,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 1374,
      "end_line": 1382,
      "comment": "\r\n     * Receives notification of changes to the chart, and redraws the chart.\r\n     *\r\n     * @param event  details of the chart change event.\r\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 34)",
        "(line 1376,col 9)-(line 1376,col 41)",
        "(line 1377,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1381,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartProgress(org.jfree.chart.event.ChartProgressEvent)",
      "begin_line": 1389,
      "end_line": 1391,
      "comment": "\r\n     * Receives notification of a chart progress event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 1398,
      "end_line": 1454,
      "comment": "\r\n     * Handles action events generated by the popup menu.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 50)",
        "(line 1405,col 9)-(line 1405,col 30)",
        "(line 1406,col 9)-(line 1406,col 30)",
        "(line 1407,col 9)-(line 1410,col 9)",
        "(line 1412,col 9)-(line 1452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseEntered(java.awt.event.MouseEvent)",
      "begin_line": 1463,
      "end_line": 1478,
      "comment": "\r\n     * Handles a \u0027mouse entered\u0027 event. This method changes the tooltip delays\r\n     * of ToolTipManager.sharedInstance() to the possibly different values set \r\n     * for this chart panel. \r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1464,col 9)-(line 1477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseExited(java.awt.event.MouseEvent)",
      "begin_line": 1487,
      "end_line": 1496,
      "comment": "\r\n     * Handles a \u0027mouse exited\u0027 event. This method resets the tooltip delays of\r\n     * ToolTipManager.sharedInstance() to their\r\n     * original values in effect before mouseEntered()\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1488,col 9)-(line 1495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 1506,
      "end_line": 1522,
      "comment": "\r\n     * Handles a \u0027mouse pressed\u0027 event.\r\n     * \u003cP\u003e\r\n     * This event is the popup trigger on Unix/Linux.  For Windows, the popup\r\n     * trigger is the \u0027mouse released\u0027 event.\r\n     *\r\n     * @param e  The mouse event.\r\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getPointInRectangle(int, int, java.awt.geom.Rectangle2D)",
      "begin_line": 1534,
      "end_line": 1540,
      "comment": "\r\n     * Returns a point based on (x, y) but constrained to be within the bounds\r\n     * of the given rectangle.  This method could be moved to JCommon.\r\n     * \r\n     * @param x  the x-coordinate.\r\n     * @param y  the y-coordinate.\r\n     * @param area  the rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A point within the rectangle.\r\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1536,col 45)",
        "(line 1537,col 9)-(line 1538,col 45)",
        "(line 1539,col 9)-(line 1539,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 1547,
      "end_line": 1600,
      "comment": "\r\n     * Handles a \u0027mouse dragged\u0027 event.\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1554,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 51)",
        "(line 1560,col 9)-(line 1560,col 30)",
        "(line 1562,col 9)-(line 1562,col 30)",
        "(line 1563,col 9)-(line 1563,col 30)",
        "(line 1564,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1573,col 74)",
        "(line 1574,col 9)-(line 1593,col 9)",
        "(line 1596,col 9)-(line 1596,col 30)",
        "(line 1598,col 9)-(line 1598,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 1609,
      "end_line": 1689,
      "comment": "\r\n     * Handles a \u0027mouse released\u0027 event.  On Windows, we need to check if this \r\n     * is a popup trigger, but only if we haven\u0027t already been tracking a zoom\r\n     * rectangle.\r\n     *\r\n     * @param e  information about the event.\r\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseClicked(java.awt.event.MouseEvent)",
      "begin_line": 1697,
      "end_line": 1728,
      "comment": "\r\n     * Receives notification of mouse clicks on the panel. These are\r\n     * translated and passed on to any registered chart mouse click listeners.\r\n     *\r\n     * @param event  Information about the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1699,col 9)-(line 1699,col 36)",
        "(line 1700,col 9)-(line 1700,col 67)",
        "(line 1701,col 9)-(line 1701,col 66)",
        "(line 1703,col 9)-(line 1703,col 47)",
        "(line 1704,col 9)-(line 1706,col 9)",
        "(line 1707,col 9)-(line 1707,col 35)",
        "(line 1709,col 9)-(line 1710,col 42)",
        "(line 1711,col 9)-(line 1713,col 9)",
        "(line 1715,col 9)-(line 1715,col 34)",
        "(line 1716,col 9)-(line 1721,col 9)",
        "(line 1722,col 9)-(line 1723,col 24)",
        "(line 1724,col 9)-(line 1726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseMoved(java.awt.event.MouseEvent)",
      "begin_line": 1735,
      "end_line": 1771,
      "comment": "\r\n     * Implementation of the MouseMotionListener\u0027s method.\r\n     *\r\n     * @param e  the event.\r\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1736,col 51)",
        "(line 1737,col 9)-(line 1739,col 9)",
        "(line 1740,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 21)",
        "(line 1745,col 9)-(line 1746,col 42)",
        "(line 1747,col 9)-(line 1749,col 9)",
        "(line 1750,col 9)-(line 1750,col 36)",
        "(line 1751,col 9)-(line 1751,col 63)",
        "(line 1752,col 9)-(line 1752,col 62)",
        "(line 1754,col 9)-(line 1754,col 34)",
        "(line 1755,col 9)-(line 1760,col 9)",
        "(line 1764,col 9)-(line 1769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInBoth(double, double)",
      "begin_line": 1779,
      "end_line": 1782,
      "comment": "\r\n     * Zooms in on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1780,col 9)-(line 1780,col 27)",
        "(line 1781,col 9)-(line 1781,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInDomain(double, double)",
      "begin_line": 1792,
      "end_line": 1800,
      "comment": "\r\n     * Decreases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is reduced\r\n     * by the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1793,col 38)",
        "(line 1794,col 9)-(line 1799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInRange(double, double)",
      "begin_line": 1810,
      "end_line": 1818,
      "comment": "\r\n     * Decreases the length of the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is reduced by\r\n     * the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x-coordinate (in screen coordinates).\r\n     * @param y  the y coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1811,col 9)-(line 1811,col 38)",
        "(line 1812,col 9)-(line 1817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutBoth(double, double)",
      "begin_line": 1826,
      "end_line": 1829,
      "comment": "\r\n     * Zooms out on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1827,col 9)-(line 1827,col 28)",
        "(line 1828,col 9)-(line 1828,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutDomain(double, double)",
      "begin_line": 1839,
      "end_line": 1847,
      "comment": "\r\n     * Increases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1840,col 9)-(line 1840,col 38)",
        "(line 1841,col 9)-(line 1846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutRange(double, double)",
      "begin_line": 1857,
      "end_line": 1865,
      "comment": "\r\n     * Increases the length the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1858,col 38)",
        "(line 1859,col 9)-(line 1864,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoom(java.awt.geom.Rectangle2D)",
      "begin_line": 1872,
      "end_line": 1908,
      "comment": "\r\n     * Zooms in on a selected region.\r\n     *\r\n     * @param selection  the selected region.\r\n     ",
      "child_ranges": [
        "(line 1876,col 9)-(line 1878,col 52)",
        "(line 1879,col 9)-(line 1879,col 61)",
        "(line 1880,col 9)-(line 1881,col 76)",
        "(line 1882,col 9)-(line 1906,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoBounds()",
      "begin_line": 1913,
      "end_line": 1916,
      "comment": "\r\n     * Restores the auto-range calculation on both axes.\r\n     ",
      "child_ranges": [
        "(line 1914,col 9)-(line 1914,col 34)",
        "(line 1915,col 9)-(line 1915,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoDomainBounds()",
      "begin_line": 1921,
      "end_line": 1929,
      "comment": "\r\n     * Restores the auto-range calculation on the domain axis.\r\n     ",
      "child_ranges": [
        "(line 1922,col 9)-(line 1922,col 38)",
        "(line 1923,col 9)-(line 1928,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoRangeBounds()",
      "begin_line": 1934,
      "end_line": 1942,
      "comment": "\r\n     * Restores the auto-range calculation on the range axis.\r\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1935,col 38)",
        "(line 1936,col 9)-(line 1941,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea()",
      "begin_line": 1950,
      "end_line": 1958,
      "comment": "\r\n     * Returns the data area for the chart (the area inside the axes) with the\r\n     * current scaling applied (that is, the area as it appears on screen).\r\n     *\r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 1951,col 9)-(line 1951,col 69)",
        "(line 1952,col 9)-(line 1952,col 36)",
        "(line 1953,col 9)-(line 1953,col 63)",
        "(line 1954,col 9)-(line 1954,col 62)",
        "(line 1955,col 9)-(line 1955,col 53)",
        "(line 1956,col 9)-(line 1956,col 54)",
        "(line 1957,col 9)-(line 1957,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea(int, int)",
      "begin_line": 1969,
      "end_line": 1986,
      "comment": "\r\n     * Returns the data area (the area inside the axes) for the plot or subplot,\r\n     * with the current scaling applied.\r\n     *\r\n     * @param x  the x-coordinate (for subplot selection).\r\n     * @param y  the y-coordinate (for subplot selection).\r\n     * \r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 1970,col 9)-(line 1970,col 61)",
        "(line 1971,col 9)-(line 1971,col 27)",
        "(line 1972,col 9)-(line 1984,col 9)",
        "(line 1985,col 9)-(line 1985,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getInitialDelay()",
      "begin_line": 1995,
      "end_line": 1997,
      "comment": "\r\n     * Returns the initial tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the initial delay value, in milliseconds.\r\n     * \r\n     * @see javax.swing.ToolTipManager#getInitialDelay()\r\n     ",
      "child_ranges": [
        "(line 1996,col 9)-(line 1996,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getReshowDelay()",
      "begin_line": 2006,
      "end_line": 2008,
      "comment": "\r\n     * Returns the reshow tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the reshow  delay value, in milliseconds.\r\n     * \r\n     * @see javax.swing.ToolTipManager#getReshowDelay()\r\n     ",
      "child_ranges": [
        "(line 2007,col 9)-(line 2007,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDismissDelay()",
      "begin_line": 2018,
      "end_line": 2020,
      "comment": "\r\n     * Returns the dismissal tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the dismissal delay value, in \r\n     *         milliseconds.\r\n     * \r\n     * @see javax.swing.ToolTipManager#getDismissDelay()\r\n     ",
      "child_ranges": [
        "(line 2019,col 9)-(line 2019,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setInitialDelay(int)",
      "begin_line": 2030,
      "end_line": 2032,
      "comment": "\r\n     * Specifies the initial delay value for this chart panel.\r\n     *\r\n     * @param delay  the number of milliseconds to delay (after the cursor has \r\n     *               paused) before displaying. \r\n     * \r\n     * @see javax.swing.ToolTipManager#setInitialDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2031,col 9)-(line 2031,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setReshowDelay(int)",
      "begin_line": 2042,
      "end_line": 2044,
      "comment": "\r\n     * Specifies the amount of time before the user has to wait initialDelay \r\n     * milliseconds before a tooltip will be shown.\r\n     *\r\n     * @param delay  time in milliseconds\r\n     * \r\n     * @see javax.swing.ToolTipManager#setReshowDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2043,col 9)-(line 2043,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDismissDelay(int)",
      "begin_line": 2054,
      "end_line": 2056,
      "comment": "\r\n     * Specifies the dismissal delay value for this chart panel.\r\n     *\r\n     * @param delay the number of milliseconds to delay before taking away the \r\n     *              tooltip\r\n     * \r\n     * @see javax.swing.ToolTipManager#setDismissDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2055,col 9)-(line 2055,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomInFactor()",
      "begin_line": 2065,
      "end_line": 2067,
      "comment": "\r\n     * Returns the zoom in factor.\r\n     * \r\n     * @return The zoom in factor.\r\n     * \r\n     * @see #setZoomInFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2066,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomInFactor(double)",
      "begin_line": 2076,
      "end_line": 2078,
      "comment": "\r\n     * Sets the zoom in factor.\r\n     * \r\n     * @param factor  the factor.\r\n     * \r\n     * @see #getZoomInFactor()\r\n     ",
      "child_ranges": [
        "(line 2077,col 9)-(line 2077,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomOutFactor()",
      "begin_line": 2087,
      "end_line": 2089,
      "comment": "\r\n     * Returns the zoom out factor.\r\n     * \r\n     * @return The zoom out factor.\r\n     * \r\n     * @see #setZoomOutFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2088,col 9)-(line 2088,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomOutFactor(double)",
      "begin_line": 2098,
      "end_line": 2100,
      "comment": "\r\n     * Sets the zoom out factor.\r\n     * \r\n     * @param factor  the factor.\r\n     * \r\n     * @see #getZoomOutFactor()\r\n     ",
      "child_ranges": [
        "(line 2099,col 9)-(line 2099,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawZoomRectangle(java.awt.Graphics2D)",
      "begin_line": 2111,
      "end_line": 2124,
      "comment": "\r\n     * Draws zoom rectangle (if present).\r\n     * The drawing is performed in XOR mode, therefore\r\n     * when this method is called twice in a row,\r\n     * the second call will completely restore the state\r\n     * of the canvas.\r\n     * \r\n     * @param g2 the graphics device. \r\n     ",
      "child_ranges": [
        "(line 2113,col 9)-(line 2113,col 34)",
        "(line 2114,col 9)-(line 2121,col 9)",
        "(line 2123,col 9)-(line 2123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawHorizontalAxisTrace(java.awt.Graphics2D, int)",
      "begin_line": 2133,
      "end_line": 2154,
      "comment": "\r\n     * Draws a vertical line used to trace the mouse position to the horizontal \r\n     * axis.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param x  the x-coordinate of the trace line.\r\n     ",
      "child_ranges": [
        "(line 2135,col 9)-(line 2135,col 51)",
        "(line 2137,col 9)-(line 2137,col 36)",
        "(line 2138,col 9)-(line 2150,col 9)",
        "(line 2153,col 9)-(line 2153,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawVerticalAxisTrace(java.awt.Graphics2D, int)",
      "begin_line": 2163,
      "end_line": 2185,
      "comment": "\r\n     * Draws a horizontal line used to trace the mouse position to the vertical\r\n     * axis.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param y  the y-coordinate of the trace line.\r\n     ",
      "child_ranges": [
        "(line 2165,col 9)-(line 2165,col 51)",
        "(line 2167,col 9)-(line 2167,col 36)",
        "(line 2168,col 9)-(line 2181,col 9)",
        "(line 2184,col 9)-(line 2184,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doEditChartProperties()",
      "begin_line": 2193,
      "end_line": 2203,
      "comment": "\r\n     * Displays a dialog that allows the user to edit the properties for the\r\n     * current chart.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 2195,col 9)-(line 2195,col 75)",
        "(line 2196,col 9)-(line 2198,col 73)",
        "(line 2199,col 9)-(line 2201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doSaveAs()",
      "begin_line": 2211,
      "end_line": 2231,
      "comment": "\r\n     * Opens a file chooser and gives the user an opportunity to save the chart\r\n     * in PNG format.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2213,col 9)-(line 2213,col 54)",
        "(line 2214,col 9)-(line 2214,col 72)",
        "(line 2215,col 9)-(line 2216,col 76)",
        "(line 2217,col 9)-(line 2217,col 51)",
        "(line 2219,col 9)-(line 2219,col 54)",
        "(line 2220,col 9)-(line 2229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createChartPrintJob()",
      "begin_line": 2236,
      "end_line": 2253,
      "comment": "\r\n     * Creates a print job for the chart.\r\n     ",
      "child_ranges": [
        "(line 2238,col 9)-(line 2238,col 52)",
        "(line 2239,col 9)-(line 2239,col 42)",
        "(line 2240,col 9)-(line 2240,col 44)",
        "(line 2241,col 9)-(line 2251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.print(java.awt.Graphics, java.awt.print.PageFormat, int)",
      "begin_line": 2265,
      "end_line": 2279,
      "comment": "\r\n     * Prints the chart on a single page.\r\n     *\r\n     * @param g  the graphics context.\r\n     * @param pf  the page format to use.\r\n     * @param pageIndex  the index of the page. If not \u003ccode\u003e0\u003c/code\u003e, nothing \r\n     *                   gets print.\r\n     *\r\n     * @return The result of printing.\r\n     ",
      "child_ranges": [
        "(line 2267,col 9)-(line 2269,col 9)",
        "(line 2270,col 9)-(line 2270,col 39)",
        "(line 2271,col 9)-(line 2271,col 38)",
        "(line 2272,col 9)-(line 2272,col 38)",
        "(line 2273,col 9)-(line 2273,col 42)",
        "(line 2274,col 9)-(line 2274,col 43)",
        "(line 2275,col 9)-(line 2276,col 22)",
        "(line 2277,col 9)-(line 2277,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2286,
      "end_line": 2291,
      "comment": "\r\n     * Adds a listener to the list of objects listening for chart mouse events.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 2287,col 9)-(line 2289,col 9)",
        "(line 2290,col 9)-(line 2290,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2299,
      "end_line": 2301,
      "comment": "\r\n     * Removes a listener from the list of objects listening for chart mouse \r\n     * events.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": [
        "(line 2300,col 9)-(line 2300,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getListeners(java.lang.Class)",
      "begin_line": 2311,
      "end_line": 2319,
      "comment": "\r\n     * Returns an array of the listeners of the given type registered with the\r\n     * panel.\r\n     * \r\n     * @param listenerType  the listener type.\r\n     * \r\n     * @return An array of listeners.\r\n     ",
      "child_ranges": [
        "(line 2312,col 9)-(line 2318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createPopupMenu(boolean, boolean, boolean, boolean)",
      "begin_line": 2331,
      "end_line": 2463,
      "comment": "\r\n     * Creates a popup menu for the panel.\r\n     *\r\n     * @param properties  include a menu item for the chart property editor.\r\n     * @param save  include a menu item for saving the chart.\r\n     * @param print  include a menu item for printing the chart.\r\n     * @param zoom  include menu items for zooming.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 2336,col 9)-(line 2336,col 53)",
        "(line 2337,col 9)-(line 2337,col 34)",
        "(line 2339,col 9)-(line 2346,col 9)",
        "(line 2348,col 9)-(line 2359,col 9)",
        "(line 2361,col 9)-(line 2372,col 9)",
        "(line 2374,col 9)-(line 2459,col 9)",
        "(line 2461,col 9)-(line 2461,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.displayPopupMenu(int, int)",
      "begin_line": 2472,
      "end_line": 2524,
      "comment": "\r\n     * The idea is to modify the zooming options depending on the type of chart \r\n     * being displayed by the panel.\r\n     *\r\n     * @param x  horizontal position of the popup.\r\n     * @param y  vertical position of the popup.\r\n     ",
      "child_ranges": [
        "(line 2474,col 9)-(line 2522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.updateUI()",
      "begin_line": 2529,
      "end_line": 2536,
      "comment": " (non-Javadoc)\r\n     * @see javax.swing.JPanel#updateUI()\r\n     ",
      "child_ranges": [
        "(line 2532,col 9)-(line 2534,col 9)",
        "(line 2535,col 9)-(line 2535,col 25)"
      ]
    }
  ]
}