{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/ChartPanel.java",
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
        "org.jfree.chart.event.OverlayChangeListener",
        "org.jfree.chart.RenderingSource",
        "java.awt.print.Printable",
        "java.io.Serializable"
      ],
      "begin_line": 255,
      "end_line": 3096,
      "comment": "\r\n * A Swing GUI component for displaying a {@link JFreeChart} object.\r\n * \u003cP\u003e\r\n * The panel registers with the chart to receive notification of changes to any\r\n * component of the chart.  The chart is redrawn automatically whenever this\r\n * notification is received.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_USED"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\r\n     * Default setting for buffer usage.  The default has been changed to\r\n     * \u003ccode\u003etrue\u003c/code\u003e from version 1.0.13 onwards, because of a severe\r\n     * performance problem with drawing the zoom rectangle using XOR (which\r\n     * now happens only when the buffer is NOT used).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The default panel width. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HEIGHT"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " The default panel height. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_WIDTH"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_WIDTH"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The default limit above which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The default limit above which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZOOM_TRIGGER_DISTANCE"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The minimum size required to perform a zoom on a rectangle "
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTIES_COMMAND"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Properties action command. "
    },
    {
      "type": "field",
      "varNames": [
        "COPY_COMMAND"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": "\r\n     * Copy action command.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAVE_COMMAND"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Save action command. "
    },
    {
      "type": "field",
      "varNames": [
        "PRINT_COMMAND"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Print action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_BOTH_COMMAND"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Zoom in (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_DOMAIN_COMMAND"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Zoom in (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_RANGE_COMMAND"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Zoom in (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_BOTH_COMMAND"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Zoom out (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_DOMAIN_COMMAND"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Zoom out (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_RANGE_COMMAND"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Zoom out (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_BOTH_COMMAND"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Zoom reset (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_DOMAIN_COMMAND"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Zoom reset (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_RANGE_COMMAND"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Zoom reset (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " The chart that is displayed in the panel. "
    },
    {
      "type": "field",
      "varNames": [
        "chartMouseListeners"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Storage for registered (chart) mouse listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "useBuffer"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " A flag that controls whether or not the off-screen buffer is used. "
    },
    {
      "type": "field",
      "varNames": [
        "refreshBuffer"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " A flag that indicates that the buffer should be refreshed. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBuffer"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " A buffer for the rendered chart. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferHeight"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " The height of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferWidth"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " The width of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawWidth"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": "\r\n     * The minimum width for drawing a chart (uses scaling for smaller widths).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawHeight"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": "\r\n     * The minimum height for drawing a chart (uses scaling for smaller\r\n     * heights).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawWidth"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": "\r\n     * The maximum width for drawing a chart (uses scaling for bigger\r\n     * widths).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawHeight"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": "\r\n     * The maximum height for drawing a chart (uses scaling for bigger\r\n     * heights).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "popup"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " The popup menu for the frame. "
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " The drawing info collected the last time the chart was drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " The chart anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleX"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleY"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZoomable"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " A flag that controls whether or not domain zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZoomable"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " A flag that controls whether or not range zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomPoint"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": "\r\n     * The zoom rectangle starting point (selected by the user with a mouse\r\n     * click).  This is a point on the screen, not the chart (which may have\r\n     * been scaled up or down to fit the panel).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomRectangle"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " The zoom rectangle (selected by the user with the mouse). "
    },
    {
      "type": "field",
      "varNames": [
        "fillZoomRectangle"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Controls if the zoom rectangle is drawn as an outline or filled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomTriggerDistance"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " The minimum distance required to drag the mouse to trigger a zoom. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInBothMenuItem"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " Menu item for zooming in on a chart (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInDomainMenuItem"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " Menu item for zooming in on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInRangeMenuItem"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Menu item for zooming in on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutBothMenuItem"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " Menu item for zooming out on a chart. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutDomainMenuItem"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " Menu item for zooming out on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutRangeMenuItem"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": " Menu item for zooming out on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetBothMenuItem"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " Menu item for resetting the zoom (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetDomainMenuItem"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Menu item for resetting the zoom (domain axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetRangeMenuItem"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " Menu item for resetting the zoom (range axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDirectoryForSaveAs"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": "\r\n     * The default directory for saving charts to file.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enforceFileExtensions"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " A flag that controls whether or not file extensions are enforced. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDelaysActive"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " A flag that indicates if original tooltip delays are changed. "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipInitialDelay"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Original initial tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipReshowDelay"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " Original reshow tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipDismissDelay"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " Original dismiss tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipInitialDelay"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": " Own initial tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipReshowDelay"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": " Own reshow tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDismissDelay"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": " Own dismiss tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInFactor"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": " The factor used to zoom in on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutFactor"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": " The factor used to zoom out on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomAroundAnchor"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": "\r\n     * A flag that controls whether zoom operations are centred on the\r\n     * current anchor point, or the centre point of the relevant axis.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutlinePaint"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": "\r\n     * The paint used to draw the zoom rectangle outline.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomFillPaint"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": "\r\n     * The zoom fill paint (should use transparency).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 506,
      "end_line": 508,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "overlays"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": "\r\n     * A list of overlays for the panel.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "availableMouseHandlers"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": "\r\n     * The mouse handlers that are available to deal with mouse events.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "liveMouseHandler"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": "\r\n     * The current \"live\" mouse handler.  One of the handlers from the\r\n     * \u0027availableMouseHandlers\u0027 list will be selected (typically in the\r\n     * mousePressed() method) to be the live handler.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "auxiliaryMouseHandlers"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": "\r\n     * A list of auxiliary mouse handlers that will be called after the\r\n     * live handler has done it\u0027s work.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomHandler"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": "\r\n     * The zoom handler that is installed by default.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionShape"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": "\r\n     * The selection shape (may be \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionFillPaint"
      ],
      "begin_line": 558,
      "end_line": 558,
      "comment": "\r\n     * The selection fill paint (may be \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionOutlinePaint"
      ],
      "begin_line": 565,
      "end_line": 565,
      "comment": "\r\n     * The paint used to draw the outline of the selection shape.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionOutlineStroke"
      ],
      "begin_line": 572,
      "end_line": 574,
      "comment": "\r\n     * The stroke used to draw the outline of the selection stroke.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart)",
      "begin_line": 581,
      "end_line": 599,
      "comment": "\r\n     * Constructs a panel that displays the specified chart.\r\n     *\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 597,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean)",
      "begin_line": 617,
      "end_line": 629,
      "comment": "\r\n     * Constructs a panel containing a chart.  The \u003ccode\u003euseBuffer\u003c/code\u003e flag\r\n     * controls whether or not an offscreen \u003ccode\u003eBufferedImage\u003c/code\u003e is\r\n     * maintained for the chart.  If the buffer is used, more memory is\r\n     * consumed, but panel repaints will be a lot quicker in cases where the\r\n     * chart itself hasn\u0027t changed (for example, when another frame is moved\r\n     * to reveal the panel).  WARNING: If you set the \u003ccode\u003euseBuffer\u003c/code\u003e\r\n     * flag to false, note that the mouse zooming rectangle will (in that case)\r\n     * be drawn using XOR, and there is a SEVERE performance problem with that\r\n     * on JRE6 on Windows.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param useBuffer  a flag controlling whether or not an off-screen buffer\r\n     *                   is used (read the warning above before setting this\r\n     *                   to \u003ccode\u003efalse\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 627,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 646,
      "end_line": 668,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should\r\n     *              be added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 666,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 694,
      "end_line": 702,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param width  the preferred width of the panel.\r\n     * @param height  the preferred height of the panel.\r\n     * @param minimumDrawWidth  the minimum drawing width.\r\n     * @param minimumDrawHeight  the minimum drawing height.\r\n     * @param maximumDrawWidth  the maximum drawing width.\r\n     * @param maximumDrawHeight  the maximum drawing height.\r\n     * @param useBuffer  a flag that indicates whether to use the off-screen\r\n     *                   buffer to improve performance (at the expense of\r\n     *                   memory).\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should be\r\n     *              added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 701,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 732,
      "end_line": 795,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param width  the preferred width of the panel.\r\n     * @param height  the preferred height of the panel.\r\n     * @param minimumDrawWidth  the minimum drawing width.\r\n     * @param minimumDrawHeight  the minimum drawing height.\r\n     * @param maximumDrawWidth  the maximum drawing width.\r\n     * @param maximumDrawHeight  the maximum drawing height.\r\n     * @param useBuffer  a flag that indicates whether to use the off-screen\r\n     *                   buffer to improve performance (at the expense of\r\n     *                   memory).\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param copy  a flag indicating whether or not a copy option should be\r\n     *              available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should be\r\n     *              added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 24)",
        "(line 739,col 9)-(line 739,col 59)",
        "(line 740,col 9)-(line 740,col 45)",
        "(line 741,col 9)-(line 741,col 43)",
        "(line 742,col 9)-(line 742,col 55)",
        "(line 743,col 9)-(line 743,col 35)",
        "(line 744,col 9)-(line 744,col 35)",
        "(line 745,col 9)-(line 745,col 49)",
        "(line 746,col 9)-(line 746,col 51)",
        "(line 747,col 9)-(line 747,col 49)",
        "(line 748,col 9)-(line 748,col 51)",
        "(line 749,col 9)-(line 749,col 65)",
        "(line 752,col 9)-(line 752,col 26)",
        "(line 753,col 9)-(line 755,col 9)",
        "(line 757,col 9)-(line 757,col 48)",
        "(line 758,col 9)-(line 758,col 55)",
        "(line 759,col 9)-(line 759,col 37)",
        "(line 760,col 9)-(line 760,col 31)",
        "(line 761,col 9)-(line 761,col 37)",
        "(line 763,col 9)-(line 763,col 46)",
        "(line 764,col 9)-(line 764,col 42)",
        "(line 768,col 9)-(line 768,col 61)",
        "(line 769,col 9)-(line 769,col 60)",
        "(line 770,col 9)-(line 770,col 60)",
        "(line 771,col 9)-(line 771,col 58)",
        "(line 773,col 9)-(line 773,col 38)",
        "(line 774,col 9)-(line 774,col 43)",
        "(line 775,col 9)-(line 775,col 54)",
        "(line 777,col 9)-(line 777,col 50)",
        "(line 779,col 9)-(line 779,col 64)",
        "(line 781,col 9)-(line 781,col 45)",
        "(line 782,col 9)-(line 782,col 53)",
        "(line 784,col 9)-(line 784,col 49)",
        "(line 785,col 9)-(line 785,col 43)",
        "(line 788,col 9)-(line 788,col 68)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 40)",
        "(line 793,col 9)-(line 793,col 52)",
        "(line 794,col 9)-(line 794,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChart()",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\r\n     * Returns the chart contained in the panel.\r\n     *\r\n     * @return The chart (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setChart(org.jfree.chart.JFreeChart)",
      "begin_line": 811,
      "end_line": 843,
      "comment": "\r\n     * Sets the chart that is displayed in the panel.\r\n     *\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 817,col 9)",
        "(line 820,col 9)-(line 820,col 27)",
        "(line 821,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawWidth()",
      "begin_line": 853,
      "end_line": 855,
      "comment": "\r\n     * Returns the minimum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is less than this, then the chart is\r\n     * drawn at the minimum width then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing width.\r\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawWidth(int)",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\r\n     * Sets the minimum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * less than this amount, the chart will be drawn using the minimum width\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawWidth()",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\r\n     * Returns the maximum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is greater than this, then the chart\r\n     * is drawn at the maximum width then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing width.\r\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawWidth(int)",
      "begin_line": 891,
      "end_line": 893,
      "comment": "\r\n     * Sets the maximum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * width then scaled up to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawHeight()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\r\n     * Returns the minimum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is less than this, then the chart\r\n     * is drawn at the minimum height then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing height.\r\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawHeight(int)",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\r\n     * Sets the minimum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * less than this amount, the chart will be drawn using the minimum height\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawHeight()",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\r\n     * Returns the maximum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is greater than this, then the\r\n     * chart is drawn at the maximum height then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing height.\r\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawHeight(int)",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\r\n     * Sets the maximum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * height then scaled up to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleX()",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\r\n     * Returns the X scale factor for the chart.  This will be 1.0 if no\r\n     * scaling has been used.\r\n     *\r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleY()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\r\n     * Returns the Y scale factory for the chart.  This will be 1.0 if no\r\n     * scaling has been used.\r\n     *\r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getAnchor()",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\r\n     * Returns the anchor point.\r\n     *\r\n     * @return The anchor point (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setAnchor(java.awt.geom.Point2D)",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\r\n     * Sets the anchor point.  This method is provided for the use of\r\n     * subclasses, not end users.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getPopupMenu()",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\r\n     * Returns the popup menu.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setPopupMenu(javax.swing.JPopupMenu)",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\r\n     * Sets the popup menu for the panel.\r\n     *\r\n     * @param popup  the popup menu (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChartRenderingInfo()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\r\n     * Returns the chart rendering info from the most recent chart redraw.\r\n     *\r\n     * @return The chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming and rectangle fill on\r\n     *              zoom.\r\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean, boolean)",
      "begin_line": 1028,
      "end_line": 1032,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e if zooming enabled\r\n     * @param fillRectangle  \u003ccode\u003etrue\u003c/code\u003e if zoom rectangle is filled,\r\n     *                       false if rectangle is shown as outline only.\r\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 32)",
        "(line 1030,col 9)-(line 1030,col 31)",
        "(line 1031,col 9)-(line 1031,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isDomainZoomable()",
      "begin_line": 1040,
      "end_line": 1042,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for\r\n     * the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDomainZoomable(boolean)",
      "begin_line": 1051,
      "end_line": 1062,
      "comment": "\r\n     * Sets the flag that controls whether or not zooming is enable for the\r\n     * domain axis.  A check is made to ensure that the current plot supports\r\n     * zooming for the domain values.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming if possible.\r\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1061,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isRangeZoomable()",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for\r\n     * the range axis.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRangeZoomable(boolean)",
      "begin_line": 1079,
      "end_line": 1090,
      "comment": "\r\n     * A flag that controls mouse-based zooming on the vertical axis.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming.\r\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1089,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getFillZoomRectangle()",
      "begin_line": 1098,
      "end_line": 1100,
      "comment": "\r\n     * Returns the flag that controls whether or not the zoom rectangle is\r\n     * filled when drawn.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setFillZoomRectangle(boolean)",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "\r\n     * A flag that controls how the zoom rectangle is drawn.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e instructs to fill the rectangle on\r\n     *              zoom, otherwise it will be outlined.\r\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomTriggerDistance()",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "\r\n     * Returns the zoom trigger distance.  This controls how far the mouse must\r\n     * move before a zoom action is triggered.\r\n     *\r\n     * @return The distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomTriggerDistance(int)",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\r\n     * Sets the zoom trigger distance.  This controls how far the mouse must\r\n     * move before a zoom action is triggered.\r\n     *\r\n     * @param distance  the distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDefaultDirectoryForSaveAs()",
      "begin_line": 1139,
      "end_line": 1141,
      "comment": "\r\n     * Returns the default directory for the \"save as\" option.\r\n     *\r\n     * @return The default directory (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDefaultDirectoryForSaveAs(java.io.File)",
      "begin_line": 1151,
      "end_line": 1159,
      "comment": "\r\n     * Sets the default directory for the \"save as\" option.  If you set this\r\n     * to \u003ccode\u003enull\u003c/code\u003e, the user\u0027s default directory will be used.\r\n     *\r\n     * @param directory  the directory (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1158,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isEnforceFileExtensions()",
      "begin_line": 1169,
      "end_line": 1171,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if file extensions should be enforced, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setEnforceFileExtensions(boolean)\r\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setEnforceFileExtensions(boolean)",
      "begin_line": 1180,
      "end_line": 1182,
      "comment": "\r\n     * Sets a flag that controls whether or not file extensions are enforced.\r\n     *\r\n     * @param enforce  the new flag value.\r\n     *\r\n     * @see #isEnforceFileExtensions()\r\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomAroundAnchor()",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": "\r\n     * Returns the flag that controls whether or not zoom operations are\r\n     * centered around the current anchor point.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #setZoomAroundAnchor(boolean)\r\n     ",
      "child_ranges": [
        "(line 1195,col 9)-(line 1195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomAroundAnchor(boolean)",
      "begin_line": 1208,
      "end_line": 1210,
      "comment": "\r\n     * Sets the flag that controls whether or not zoom operations are\r\n     * centered around the current anchor point.\r\n     *\r\n     * @param zoomAroundAnchor  the new flag value.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #getZoomAroundAnchor()\r\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1209,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomFillPaint()",
      "begin_line": 1222,
      "end_line": 1224,
      "comment": "\r\n     * Returns the zoom rectangle fill paint.\r\n     *\r\n     * @return The zoom rectangle fill paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setZoomFillPaint(java.awt.Paint)\r\n     * @see #setFillZoomRectangle(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomFillPaint(java.awt.Paint)",
      "begin_line": 1236,
      "end_line": 1241,
      "comment": "\r\n     * Sets the zoom rectangle fill paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getZoomFillPaint()\r\n     * @see #getFillZoomRectangle()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1240,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomOutlinePaint()",
      "begin_line": 1253,
      "end_line": 1255,
      "comment": "\r\n     * Returns the zoom rectangle outline paint.\r\n     *\r\n     * @return The zoom rectangle outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setZoomOutlinePaint(java.awt.Paint)\r\n     * @see #setFillZoomRectangle(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomOutlinePaint(java.awt.Paint)",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "\r\n     * Sets the zoom rectangle outline paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getZoomOutlinePaint()\r\n     * @see #getFillZoomRectangle()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mouseWheelHandler"
      ],
      "begin_line": 1274,
      "end_line": 1274,
      "comment": "\r\n     * The mouse wheel handler.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isMouseWheelEnabled()",
      "begin_line": 1284,
      "end_line": 1286,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the mouse wheel handler is enabled, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1285,col 9)-(line 1285,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseWheelEnabled(boolean)",
      "begin_line": 1298,
      "end_line": 1308,
      "comment": "\r\n     * Enables or disables mouse wheel support for the panel.\r\n     * Note that this method does nothing when running JFreeChart on JRE 1.3.1,\r\n     * because that older version of the Java runtime does not support\r\n     * mouse wheel events.\r\n     *\r\n     * @param flag  a boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addOverlay(org.jfree.chart.panel.Overlay)",
      "begin_line": 1317,
      "end_line": 1324,
      "comment": "\r\n     * Add an overlay to the panel.\r\n     *\r\n     * @param overlay  the overlay (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1321,col 35)",
        "(line 1322,col 9)-(line 1322,col 40)",
        "(line 1323,col 9)-(line 1323,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeOverlay(org.jfree.chart.panel.Overlay)",
      "begin_line": 1333,
      "end_line": 1342,
      "comment": "\r\n     * Removes an overlay from the panel.\r\n     *\r\n     * @param overlay  the overlay to remove (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1337,col 56)",
        "(line 1338,col 9)-(line 1341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.overlayChanged(org.jfree.chart.event.OverlayChangeEvent)",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\r\n     * Handles a change to an overlay by repainting the panel.\r\n     *\r\n     * @param event  the event.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getUseBuffer()",
      "begin_line": 1363,
      "end_line": 1365,
      "comment": "\r\n     * Returns the value of the \u003ccode\u003euseBuffer\u003c/code\u003e flag as set in the\r\n     * constructor.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1364,col 9)-(line 1364,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getOrientation()",
      "begin_line": 1374,
      "end_line": 1376,
      "comment": "\r\n     * Returns the orientation of the plot in the panel.\r\n     *\r\n     * @return The orientation of the plot.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)",
      "begin_line": 1387,
      "end_line": 1392,
      "comment": "\r\n     * Adds a mouse handler.\r\n     *\r\n     * @param handler  the handler (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1391,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)",
      "begin_line": 1405,
      "end_line": 1410,
      "comment": "\r\n     * Removes a mouse handler.\r\n     *\r\n     * @param handler  the handler (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #addMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1408,col 9)",
        "(line 1409,col 9)-(line 1409,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.clearLiveMouseHandler()",
      "begin_line": 1418,
      "end_line": 1420,
      "comment": "\r\n     * Clears the \u0027liveMouseHandler\u0027 field.  Each handler is responsible for\r\n     * calling this method when they have finished handling mouse events.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomHandler()",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "\r\n     * Returns the zoom handler.\r\n     *\r\n     * @return The zoom handler.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomRectangle()",
      "begin_line": 1440,
      "end_line": 1442,
      "comment": "\r\n     * Returns the zoom rectangle.\r\n     *\r\n     * @return The zoom rectangle (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomRectangle(java.awt.geom.Rectangle2D)",
      "begin_line": 1451,
      "end_line": 1453,
      "comment": "\r\n     * Sets the zoom rectangle for the panel.\r\n     *\r\n     * @param rect  the rectangle (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1452,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDisplayToolTips(boolean)",
      "begin_line": 1463,
      "end_line": 1470,
      "comment": "\r\n     * Switches the display of tooltips for the panel on or off.  Note that\r\n     * tooltips can only be displayed if the chart has been configured to\r\n     * generate tooltip items.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e to enable tooltips, \u003ccode\u003efalse\u003c/code\u003e to\r\n     *              disable tooltips.\r\n     ",
      "child_ranges": [
        "(line 1464,col 9)-(line 1469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getToolTipText(java.awt.event.MouseEvent)",
      "begin_line": 1479,
      "end_line": 1496,
      "comment": "\r\n     * Returns a string for the tooltip.\r\n     *\r\n     * @param e  the mouse event.\r\n     *\r\n     * @return A tool tip or \u003ccode\u003enull\u003c/code\u003e if no tooltip is available.\r\n     ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1481,col 29)",
        "(line 1482,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1494,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateJava2DToScreen(java.awt.geom.Point2D)",
      "begin_line": 1505,
      "end_line": 1510,
      "comment": "\r\n     * Translates a Java2D point on the chart to a screen location.\r\n     *\r\n     * @param java2DPoint  the Java2D point.\r\n     *\r\n     * @return The screen location.\r\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1506,col 36)",
        "(line 1507,col 9)-(line 1507,col 71)",
        "(line 1508,col 9)-(line 1508,col 70)",
        "(line 1509,col 9)-(line 1509,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateScreenToJava2D(java.awt.Point)",
      "begin_line": 1520,
      "end_line": 1525,
      "comment": "\r\n     * Translates a panel (component) location to a Java2D point.\r\n     *\r\n     * @param screenPoint  the screen location (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @return The Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1521,col 36)",
        "(line 1522,col 9)-(line 1522,col 68)",
        "(line 1523,col 9)-(line 1523,col 67)",
        "(line 1524,col 9)-(line 1524,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.scale(java.awt.geom.Rectangle2D)",
      "begin_line": 1535,
      "end_line": 1542,
      "comment": "\r\n     * Applies any scaling that is in effect for the chart drawing to the\r\n     * given rectangle.\r\n     *\r\n     * @param rect  the rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new scaled rectangle.\r\n     ",
      "child_ranges": [
        "(line 1536,col 9)-(line 1536,col 36)",
        "(line 1537,col 9)-(line 1537,col 59)",
        "(line 1538,col 9)-(line 1538,col 58)",
        "(line 1539,col 9)-(line 1539,col 49)",
        "(line 1540,col 9)-(line 1540,col 50)",
        "(line 1541,col 9)-(line 1541,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getEntityForPoint(int, int)",
      "begin_line": 1555,
      "end_line": 1567,
      "comment": "\r\n     * Returns the chart entity at a given point.\r\n     * \u003cP\u003e\r\n     * This method will return null if there is (a) no entity at the given\r\n     * point, or (b) no entity collection has been generated.\r\n     *\r\n     * @param viewX  the x-coordinate.\r\n     * @param viewY  the y-coordinate.\r\n     *\r\n     * @return The chart entity (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1557,col 34)",
        "(line 1558,col 9)-(line 1564,col 9)",
        "(line 1565,col 9)-(line 1565,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getRefreshBuffer()",
      "begin_line": 1575,
      "end_line": 1577,
      "comment": "\r\n     * Returns the flag that controls whether or not the offscreen buffer\r\n     * needs to be refreshed.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1576,col 9)-(line 1576,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRefreshBuffer(boolean)",
      "begin_line": 1586,
      "end_line": 1588,
      "comment": "\r\n     * Sets the refresh buffer flag.  This flag is used to avoid unnecessary\r\n     * redrawing of the chart when the offscreen image buffer is used.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e indicates that the buffer should be\r\n     *              refreshed.\r\n     ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1587,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.paintComponent(java.awt.Graphics)",
      "begin_line": 1598,
      "end_line": 1725,
      "comment": "\r\n     * Paints the component by drawing the chart to fill the entire component,\r\n     * but allowing for the insets (which will be non-zero if a border has been\r\n     * set for this component).  To increase performance (at the expense of\r\n     * memory), an off-screen buffer image can be used.\r\n     *\r\n     * @param g  the graphics device for drawing on.\r\n     ",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 32)",
        "(line 1600,col 9)-(line 1602,col 9)",
        "(line 1603,col 9)-(line 1603,col 48)",
        "(line 1606,col 9)-(line 1606,col 35)",
        "(line 1607,col 9)-(line 1607,col 36)",
        "(line 1608,col 9)-(line 1610,col 63)",
        "(line 1613,col 9)-(line 1613,col 30)",
        "(line 1614,col 9)-(line 1614,col 48)",
        "(line 1615,col 9)-(line 1615,col 50)",
        "(line 1616,col 9)-(line 1616,col 26)",
        "(line 1617,col 9)-(line 1617,col 26)",
        "(line 1619,col 9)-(line 1628,col 9)",
        "(line 1630,col 9)-(line 1639,col 9)",
        "(line 1641,col 9)-(line 1642,col 28)",
        "(line 1645,col 9)-(line 1708,col 9)",
        "(line 1710,col 9)-(line 1710,col 53)",
        "(line 1711,col 9)-(line 1714,col 9)",
        "(line 1719,col 9)-(line 1719,col 47)",
        "(line 1720,col 9)-(line 1720,col 48)",
        "(line 1721,col 9)-(line 1721,col 21)",
        "(line 1723,col 9)-(line 1723,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 1732,
      "end_line": 1740,
      "comment": "\r\n     * Receives notification of changes to the chart, and redraws the chart.\r\n     *\r\n     * @param event  details of the chart change event.\r\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1733,col 34)",
        "(line 1734,col 9)-(line 1734,col 41)",
        "(line 1735,col 9)-(line 1738,col 9)",
        "(line 1739,col 9)-(line 1739,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartProgress(org.jfree.chart.event.ChartProgressEvent)",
      "begin_line": 1747,
      "end_line": 1749,
      "comment": "\r\n     * Receives notification of a chart progress event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 1756,
      "end_line": 1815,
      "comment": "\r\n     * Handles action events generated by the popup menu.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 1758,col 9)-(line 1758,col 50)",
        "(line 1763,col 9)-(line 1763,col 30)",
        "(line 1764,col 9)-(line 1764,col 30)",
        "(line 1765,col 9)-(line 1768,col 9)",
        "(line 1770,col 9)-(line 1813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseEntered(java.awt.event.MouseEvent)",
      "begin_line": 1824,
      "end_line": 1848,
      "comment": "\r\n     * Handles a \u0027mouse entered\u0027 event. This method changes the tooltip delays\r\n     * of ToolTipManager.sharedInstance() to the possibly different values set\r\n     * for this chart panel.\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1825,col 9)-(line 1838,col 9)",
        "(line 1840,col 9)-(line 1842,col 9)",
        "(line 1843,col 9)-(line 1843,col 67)",
        "(line 1844,col 9)-(line 1847,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseExited(java.awt.event.MouseEvent)",
      "begin_line": 1857,
      "end_line": 1875,
      "comment": "\r\n     * Handles a \u0027mouse exited\u0027 event. This method resets the tooltip delays of\r\n     * ToolTipManager.sharedInstance() to their\r\n     * original values in effect before mouseEntered()\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1865,col 9)",
        "(line 1867,col 9)-(line 1869,col 9)",
        "(line 1870,col 9)-(line 1870,col 67)",
        "(line 1871,col 9)-(line 1874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 1885,
      "end_line": 1933,
      "comment": "\r\n     * Handles a \u0027mouse pressed\u0027 event.\r\n     * \u003cP\u003e\r\n     * This event is the popup trigger on Unix/Linux.  For Windows, the popup\r\n     * trigger is the \u0027mouse released\u0027 event.\r\n     *\r\n     * @param e  The mouse event.\r\n     ",
      "child_ranges": [
        "(line 1886,col 9)-(line 1888,col 9)",
        "(line 1889,col 9)-(line 1889,col 36)",
        "(line 1891,col 9)-(line 1896,col 9)",
        "(line 1898,col 9)-(line 1923,col 9)",
        "(line 1926,col 9)-(line 1926,col 67)",
        "(line 1927,col 9)-(line 1931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 1940,
      "end_line": 1958,
      "comment": "\r\n     * Handles a \u0027mouse dragged\u0027 event.\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1943,col 9)-(line 1945,col 9)",
        "(line 1947,col 9)-(line 1949,col 9)",
        "(line 1952,col 9)-(line 1952,col 67)",
        "(line 1953,col 9)-(line 1956,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 1967,
      "end_line": 1987,
      "comment": "\r\n     * Handles a \u0027mouse released\u0027 event.  On Windows, we need to check if this\r\n     * is a popup trigger, but only if we haven\u0027t already been tracking a zoom\r\n     * rectangle.\r\n     *\r\n     * @param e  information about the event.\r\n     ",
      "child_ranges": [
        "(line 1969,col 9)-(line 1974,col 9)",
        "(line 1976,col 9)-(line 1978,col 9)",
        "(line 1981,col 9)-(line 1981,col 67)",
        "(line 1982,col 9)-(line 1985,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseClicked(java.awt.event.MouseEvent)",
      "begin_line": 1995,
      "end_line": 2026,
      "comment": "\r\n     * Receives notification of mouse clicks on the panel. These are\r\n     * translated and passed on to any registered {@link ChartMouseListener}s.\r\n     *\r\n     * @param event  Information about the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1997,col 9)-(line 1997,col 36)",
        "(line 1998,col 9)-(line 1998,col 67)",
        "(line 1999,col 9)-(line 1999,col 66)",
        "(line 2001,col 9)-(line 2001,col 47)",
        "(line 2002,col 9)-(line 2004,col 9)",
        "(line 2005,col 9)-(line 2005,col 35)",
        "(line 2007,col 9)-(line 2008,col 42)",
        "(line 2009,col 9)-(line 2011,col 9)",
        "(line 2013,col 9)-(line 2013,col 34)",
        "(line 2014,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2021,col 24)",
        "(line 2022,col 9)-(line 2024,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseMoved(java.awt.event.MouseEvent)",
      "begin_line": 2033,
      "end_line": 2061,
      "comment": "\r\n     * Implementation of the MouseMotionListener\u0027s method.\r\n     *\r\n     * @param e  the event.\r\n     ",
      "child_ranges": [
        "(line 2035,col 9)-(line 2036,col 42)",
        "(line 2037,col 9)-(line 2039,col 9)",
        "(line 2040,col 9)-(line 2040,col 36)",
        "(line 2041,col 9)-(line 2041,col 63)",
        "(line 2042,col 9)-(line 2042,col 62)",
        "(line 2044,col 9)-(line 2044,col 34)",
        "(line 2045,col 9)-(line 2050,col 9)",
        "(line 2054,col 9)-(line 2059,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInBoth(double, double)",
      "begin_line": 2069,
      "end_line": 2082,
      "comment": "\r\n     * Zooms in on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2070,col 9)-(line 2070,col 41)",
        "(line 2071,col 9)-(line 2073,col 9)",
        "(line 2077,col 9)-(line 2077,col 46)",
        "(line 2078,col 9)-(line 2078,col 30)",
        "(line 2079,col 9)-(line 2079,col 27)",
        "(line 2080,col 9)-(line 2080,col 26)",
        "(line 2081,col 9)-(line 2081,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInDomain(double, double)",
      "begin_line": 2092,
      "end_line": 2106,
      "comment": "\r\n     * Decreases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is reduced\r\n     * by the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2093,col 9)-(line 2093,col 41)",
        "(line 2094,col 9)-(line 2105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInRange(double, double)",
      "begin_line": 2116,
      "end_line": 2130,
      "comment": "\r\n     * Decreases the length of the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is reduced by\r\n     * the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x-coordinate (in screen coordinates).\r\n     * @param y  the y coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2117,col 9)-(line 2117,col 41)",
        "(line 2118,col 9)-(line 2129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutBoth(double, double)",
      "begin_line": 2138,
      "end_line": 2151,
      "comment": "\r\n     * Zooms out on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2139,col 9)-(line 2139,col 41)",
        "(line 2140,col 9)-(line 2142,col 9)",
        "(line 2146,col 9)-(line 2146,col 46)",
        "(line 2147,col 9)-(line 2147,col 30)",
        "(line 2148,col 9)-(line 2148,col 28)",
        "(line 2149,col 9)-(line 2149,col 27)",
        "(line 2150,col 9)-(line 2150,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutDomain(double, double)",
      "begin_line": 2161,
      "end_line": 2175,
      "comment": "\r\n     * Increases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2162,col 9)-(line 2162,col 41)",
        "(line 2163,col 9)-(line 2174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutRange(double, double)",
      "begin_line": 2185,
      "end_line": 2199,
      "comment": "\r\n     * Increases the length the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2186,col 9)-(line 2186,col 41)",
        "(line 2187,col 9)-(line 2198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoom(java.awt.geom.Rectangle2D)",
      "begin_line": 2206,
      "end_line": 2248,
      "comment": "\r\n     * Zooms in on a selected region.\r\n     *\r\n     * @param selection  the selected region.\r\n     ",
      "child_ranges": [
        "(line 2210,col 9)-(line 2212,col 52)",
        "(line 2213,col 9)-(line 2213,col 61)",
        "(line 2214,col 9)-(line 2215,col 76)",
        "(line 2216,col 9)-(line 2246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoBounds()",
      "begin_line": 2253,
      "end_line": 2266,
      "comment": "\r\n     * Restores the auto-range calculation on both axes.\r\n     ",
      "child_ranges": [
        "(line 2254,col 9)-(line 2254,col 41)",
        "(line 2255,col 9)-(line 2257,col 9)",
        "(line 2261,col 9)-(line 2261,col 46)",
        "(line 2262,col 9)-(line 2262,col 30)",
        "(line 2263,col 9)-(line 2263,col 34)",
        "(line 2264,col 9)-(line 2264,col 33)",
        "(line 2265,col 9)-(line 2265,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoDomainBounds()",
      "begin_line": 2271,
      "end_line": 2286,
      "comment": "\r\n     * Restores the auto-range calculation on the domain axis.\r\n     ",
      "child_ranges": [
        "(line 2272,col 9)-(line 2272,col 41)",
        "(line 2273,col 9)-(line 2285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoRangeBounds()",
      "begin_line": 2291,
      "end_line": 2306,
      "comment": "\r\n     * Restores the auto-range calculation on the range axis.\r\n     ",
      "child_ranges": [
        "(line 2292,col 9)-(line 2292,col 41)",
        "(line 2293,col 9)-(line 2305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea()",
      "begin_line": 2314,
      "end_line": 2322,
      "comment": "\r\n     * Returns the data area for the chart (the area inside the axes) with the\r\n     * current scaling applied (that is, the area as it appears on screen).\r\n     *\r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 2315,col 9)-(line 2315,col 69)",
        "(line 2316,col 9)-(line 2316,col 36)",
        "(line 2317,col 9)-(line 2317,col 63)",
        "(line 2318,col 9)-(line 2318,col 62)",
        "(line 2319,col 9)-(line 2319,col 53)",
        "(line 2320,col 9)-(line 2320,col 54)",
        "(line 2321,col 9)-(line 2321,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea(int, int)",
      "begin_line": 2333,
      "end_line": 2350,
      "comment": "\r\n     * Returns the data area (the area inside the axes) for the plot or subplot,\r\n     * with the current scaling applied.\r\n     *\r\n     * @param x  the x-coordinate (for subplot selection).\r\n     * @param y  the y-coordinate (for subplot selection).\r\n     *\r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 2334,col 9)-(line 2334,col 61)",
        "(line 2335,col 9)-(line 2335,col 27)",
        "(line 2336,col 9)-(line 2348,col 9)",
        "(line 2349,col 9)-(line 2349,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getInitialDelay()",
      "begin_line": 2359,
      "end_line": 2361,
      "comment": "\r\n     * Returns the initial tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the initial delay value, in milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getInitialDelay()\r\n     ",
      "child_ranges": [
        "(line 2360,col 9)-(line 2360,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getReshowDelay()",
      "begin_line": 2370,
      "end_line": 2372,
      "comment": "\r\n     * Returns the reshow tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the reshow  delay value, in milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getReshowDelay()\r\n     ",
      "child_ranges": [
        "(line 2371,col 9)-(line 2371,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDismissDelay()",
      "begin_line": 2382,
      "end_line": 2384,
      "comment": "\r\n     * Returns the dismissal tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the dismissal delay value, in\r\n     *         milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getDismissDelay()\r\n     ",
      "child_ranges": [
        "(line 2383,col 9)-(line 2383,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setInitialDelay(int)",
      "begin_line": 2394,
      "end_line": 2396,
      "comment": "\r\n     * Specifies the initial delay value for this chart panel.\r\n     *\r\n     * @param delay  the number of milliseconds to delay (after the cursor has\r\n     *               paused) before displaying.\r\n     *\r\n     * @see javax.swing.ToolTipManager#setInitialDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2395,col 9)-(line 2395,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setReshowDelay(int)",
      "begin_line": 2406,
      "end_line": 2408,
      "comment": "\r\n     * Specifies the amount of time before the user has to wait initialDelay\r\n     * milliseconds before a tooltip will be shown.\r\n     *\r\n     * @param delay  time in milliseconds\r\n     *\r\n     * @see javax.swing.ToolTipManager#setReshowDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2407,col 9)-(line 2407,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDismissDelay(int)",
      "begin_line": 2418,
      "end_line": 2420,
      "comment": "\r\n     * Specifies the dismissal delay value for this chart panel.\r\n     *\r\n     * @param delay the number of milliseconds to delay before taking away the\r\n     *              tooltip\r\n     *\r\n     * @see javax.swing.ToolTipManager#setDismissDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2419,col 9)-(line 2419,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomInFactor()",
      "begin_line": 2429,
      "end_line": 2431,
      "comment": "\r\n     * Returns the zoom in factor.\r\n     *\r\n     * @return The zoom in factor.\r\n     *\r\n     * @see #setZoomInFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2430,col 9)-(line 2430,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomInFactor(double)",
      "begin_line": 2440,
      "end_line": 2442,
      "comment": "\r\n     * Sets the zoom in factor.\r\n     *\r\n     * @param factor  the factor.\r\n     *\r\n     * @see #getZoomInFactor()\r\n     ",
      "child_ranges": [
        "(line 2441,col 9)-(line 2441,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomOutFactor()",
      "begin_line": 2451,
      "end_line": 2453,
      "comment": "\r\n     * Returns the zoom out factor.\r\n     *\r\n     * @return The zoom out factor.\r\n     *\r\n     * @see #setZoomOutFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2452,col 9)-(line 2452,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomOutFactor(double)",
      "begin_line": 2462,
      "end_line": 2464,
      "comment": "\r\n     * Sets the zoom out factor.\r\n     *\r\n     * @param factor  the factor.\r\n     *\r\n     * @see #getZoomOutFactor()\r\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2463,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawZoomRectangle(java.awt.Graphics2D, boolean)",
      "begin_line": 2476,
      "end_line": 2495,
      "comment": "\r\n     * Draws zoom rectangle (if present).\r\n     * The drawing is performed in XOR mode, therefore\r\n     * when this method is called twice in a row,\r\n     * the second call will completely restore the state\r\n     * of the canvas.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param xor  use XOR for drawing?\r\n     ",
      "child_ranges": [
        "(line 2477,col 9)-(line 2494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawSelectionShape(java.awt.Graphics2D, boolean)",
      "begin_line": 2507,
      "end_line": 2527,
      "comment": "\r\n     * Draws zoom rectangle (if present).\r\n     * The drawing is performed in XOR mode, therefore\r\n     * when this method is called twice in a row,\r\n     * the second call will completely restore the state\r\n     * of the canvas.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param xor  use XOR for drawing?\r\n     ",
      "child_ranges": [
        "(line 2508,col 9)-(line 2526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doEditChartProperties()",
      "begin_line": 2535,
      "end_line": 2545,
      "comment": "\r\n     * Displays a dialog that allows the user to edit the properties for the\r\n     * current chart.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 2537,col 9)-(line 2537,col 75)",
        "(line 2538,col 9)-(line 2540,col 73)",
        "(line 2541,col 9)-(line 2543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doCopy()",
      "begin_line": 2552,
      "end_line": 2562,
      "comment": "\r\n     * Copies the current chart to the system clipboard.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2553,col 9)-(line 2554,col 67)",
        "(line 2555,col 9)-(line 2555,col 36)",
        "(line 2556,col 9)-(line 2556,col 56)",
        "(line 2557,col 9)-(line 2557,col 57)",
        "(line 2558,col 9)-(line 2560,col 69)",
        "(line 2561,col 9)-(line 2561,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doSaveAs()",
      "begin_line": 2570,
      "end_line": 2590,
      "comment": "\r\n     * Opens a file chooser and gives the user an opportunity to save the chart\r\n     * in PNG format.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2572,col 9)-(line 2572,col 54)",
        "(line 2573,col 9)-(line 2573,col 72)",
        "(line 2574,col 9)-(line 2575,col 76)",
        "(line 2576,col 9)-(line 2576,col 51)",
        "(line 2578,col 9)-(line 2578,col 54)",
        "(line 2579,col 9)-(line 2588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createChartPrintJob()",
      "begin_line": 2595,
      "end_line": 2612,
      "comment": "\r\n     * Creates a print job for the chart.\r\n     ",
      "child_ranges": [
        "(line 2597,col 9)-(line 2597,col 52)",
        "(line 2598,col 9)-(line 2598,col 42)",
        "(line 2599,col 9)-(line 2599,col 44)",
        "(line 2600,col 9)-(line 2610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.print(java.awt.Graphics, java.awt.print.PageFormat, int)",
      "begin_line": 2624,
      "end_line": 2638,
      "comment": "\r\n     * Prints the chart on a single page.\r\n     *\r\n     * @param g  the graphics context.\r\n     * @param pf  the page format to use.\r\n     * @param pageIndex  the index of the page. If not \u003ccode\u003e0\u003c/code\u003e, nothing\r\n     *                   gets print.\r\n     *\r\n     * @return The result of printing.\r\n     ",
      "child_ranges": [
        "(line 2626,col 9)-(line 2628,col 9)",
        "(line 2629,col 9)-(line 2629,col 39)",
        "(line 2630,col 9)-(line 2630,col 38)",
        "(line 2631,col 9)-(line 2631,col 38)",
        "(line 2632,col 9)-(line 2632,col 42)",
        "(line 2633,col 9)-(line 2633,col 43)",
        "(line 2634,col 9)-(line 2635,col 22)",
        "(line 2636,col 9)-(line 2636,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2645,
      "end_line": 2650,
      "comment": "\r\n     * Adds a listener to the list of objects listening for chart mouse events.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 2646,col 9)-(line 2648,col 9)",
        "(line 2649,col 9)-(line 2649,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2658,
      "end_line": 2660,
      "comment": "\r\n     * Removes a listener from the list of objects listening for chart mouse\r\n     * events.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": [
        "(line 2659,col 9)-(line 2659,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getListeners(java.lang.Class)",
      "begin_line": 2670,
      "end_line": 2678,
      "comment": "\r\n     * Returns an array of the listeners of the given type registered with the\r\n     * panel.\r\n     *\r\n     * @param listenerType  the listener type.\r\n     *\r\n     * @return An array of listeners.\r\n     ",
      "child_ranges": [
        "(line 2671,col 9)-(line 2677,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createPopupMenu(boolean, boolean, boolean, boolean)",
      "begin_line": 2690,
      "end_line": 2693,
      "comment": "\r\n     * Creates a popup menu for the panel.\r\n     *\r\n     * @param properties  include a menu item for the chart property editor.\r\n     * @param save  include a menu item for saving the chart.\r\n     * @param print  include a menu item for printing the chart.\r\n     * @param zoom  include menu items for zooming.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 2692,col 9)-(line 2692,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createPopupMenu(boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 2708,
      "end_line": 2851,
      "comment": "\r\n     * Creates a popup menu for the panel.\r\n     *\r\n     * @param properties  include a menu item for the chart property editor.\r\n     * @param copy include a menu item for copying to the clipboard.\r\n     * @param save  include a menu item for saving the chart.\r\n     * @param print  include a menu item for printing the chart.\r\n     * @param zoom  include menu items for zooming.\r\n     *\r\n     * @return The popup menu.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2711,col 9)-(line 2711,col 53)",
        "(line 2712,col 9)-(line 2712,col 34)",
        "(line 2714,col 9)-(line 2721,col 9)",
        "(line 2723,col 9)-(line 2734,col 9)",
        "(line 2736,col 9)-(line 2747,col 9)",
        "(line 2749,col 9)-(line 2760,col 9)",
        "(line 2762,col 9)-(line 2847,col 9)",
        "(line 2849,col 9)-(line 2849,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.displayPopupMenu(int, int)",
      "begin_line": 2860,
      "end_line": 2912,
      "comment": "\r\n     * The idea is to modify the zooming options depending on the type of chart\r\n     * being displayed by the panel.\r\n     *\r\n     * @param x  horizontal position of the popup.\r\n     * @param y  vertical position of the popup.\r\n     ",
      "child_ranges": [
        "(line 2862,col 9)-(line 2910,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.updateUI()",
      "begin_line": 2917,
      "end_line": 2924,
      "comment": "\r\n     * Updates the UI for a LookAndFeel change.\r\n     ",
      "child_ranges": [
        "(line 2920,col 9)-(line 2922,col 9)",
        "(line 2923,col 9)-(line 2923,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2933,
      "end_line": 2937,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2934,col 9)-(line 2934,col 36)",
        "(line 2935,col 9)-(line 2935,col 63)",
        "(line 2936,col 9)-(line 2936,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.readObject(java.io.ObjectInputStream)",
      "begin_line": 2947,
      "end_line": 2961,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 2949,col 9)-(line 2949,col 35)",
        "(line 2950,col 9)-(line 2950,col 63)",
        "(line 2951,col 9)-(line 2951,col 66)",
        "(line 2954,col 9)-(line 2954,col 59)",
        "(line 2957,col 9)-(line 2959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionShape()",
      "begin_line": 2972,
      "end_line": 2974,
      "comment": "\r\n     * Returns the selection shape.\r\n     *\r\n     * @return The selection shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSelectionShape(java.awt.Shape)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2973,col 9)-(line 2973,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionShape(java.awt.Shape)",
      "begin_line": 2985,
      "end_line": 2987,
      "comment": "\r\n     * Sets the selection shape.\r\n     *\r\n     * @param shape  the selection shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSelectionShape()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2986,col 9)-(line 2986,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionFillPaint()",
      "begin_line": 2998,
      "end_line": 3000,
      "comment": "\r\n     * Returns the selection fill paint.\r\n     *\r\n     * @return The selection fill paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSelectionFillPaint(java.awt.Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2999,col 9)-(line 2999,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionFillPaint(java.awt.Paint)",
      "begin_line": 3011,
      "end_line": 3013,
      "comment": "\r\n     * Sets the selection fill paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSelectionFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3012,col 9)-(line 3012,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionOutlinePaint()",
      "begin_line": 3022,
      "end_line": 3024,
      "comment": "\r\n     * Returns the selection outline paint.\r\n     * \r\n     * @return The selection outline paint.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3023,col 9)-(line 3023,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionOutlinePaint(java.awt.Paint)",
      "begin_line": 3031,
      "end_line": 3033,
      "comment": "\r\n     * Sets the selection outline paint.\r\n     *\r\n     * @param paint\r\n     ",
      "child_ranges": [
        "(line 3032,col 9)-(line 3032,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionOutlineStroke()",
      "begin_line": 3042,
      "end_line": 3044,
      "comment": "\r\n     * Returns the selection outline stroke.\r\n     * \r\n     * @return The selection outline stroke.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3043,col 9)-(line 3043,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 3053,
      "end_line": 3055,
      "comment": "\r\n     * Sets the selection outline stroke.\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3054,col 9)-(line 3054,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "selectionStates"
      ],
      "begin_line": 3060,
      "end_line": 3060,
      "comment": "\r\n     * A list of {@link DatasetAndSelection} objects.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionState(org.jfree.data.general.Dataset)",
      "begin_line": 3071,
      "end_line": 3080,
      "comment": "\r\n     * Returns the selection state for the specified dataset, if any.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3072,col 9)-(line 3072,col 60)",
        "(line 3073,col 9)-(line 3078,col 9)",
        "(line 3079,col 9)-(line 3079,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.putSelectionState(org.jfree.data.general.Dataset, org.jfree.data.general.DatasetSelectionState)",
      "begin_line": 3092,
      "end_line": 3094,
      "comment": "\r\n     * When setting up a selectable panel, you need to create the selection\r\n     * state and register it here (unless the dataset is managing the selection\r\n     * directly).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3093,col 9)-(line 3093,col 74)"
      ]
    }
  ]
}