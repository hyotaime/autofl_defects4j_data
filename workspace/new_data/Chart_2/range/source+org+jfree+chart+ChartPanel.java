{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ChartPanel.java",
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
      "begin_line": 258,
      "end_line": 3127,
      "comment": "\r\n * A Swing GUI component for displaying a {@link JFreeChart} object.\r\n * \u003cP\u003e\r\n * The panel registers with the chart to receive notification of changes to any\r\n * component of the chart.  The chart is redrawn automatically whenever this\r\n * notification is received.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUFFER_USED"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": "\r\n     * Default setting for buffer usage.  The default has been changed to\r\n     * \u003ccode\u003etrue\u003c/code\u003e from version 1.0.13 onwards, because of a severe\r\n     * performance problem with drawing the zoom rectangle using XOR (which\r\n     * now happens only when the buffer is NOT used).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_WIDTH"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " The default panel width. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_HEIGHT"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " The default panel height. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_WIDTH"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MINIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The default limit below which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_WIDTH"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The default limit above which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_DRAW_HEIGHT"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The default limit above which chart scaling kicks in. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ZOOM_TRIGGER_DISTANCE"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " The minimum size required to perform a zoom on a rectangle "
    },
    {
      "type": "field",
      "varNames": [
        "PROPERTIES_COMMAND"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Properties action command. "
    },
    {
      "type": "field",
      "varNames": [
        "COPY_COMMAND"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": "\r\n     * Copy action command.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAVE_COMMAND"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Save action command. "
    },
    {
      "type": "field",
      "varNames": [
        "PRINT_COMMAND"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Print action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_BOTH_COMMAND"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Zoom in (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_DOMAIN_COMMAND"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Zoom in (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_IN_RANGE_COMMAND"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Zoom in (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_BOTH_COMMAND"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Zoom out (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_DOMAIN_COMMAND"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Zoom out (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_OUT_RANGE_COMMAND"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Zoom out (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_BOTH_COMMAND"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Zoom reset (both axes) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_DOMAIN_COMMAND"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Zoom reset (domain axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "ZOOM_RESET_RANGE_COMMAND"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Zoom reset (range axis only) action command. "
    },
    {
      "type": "field",
      "varNames": [
        "chart"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " The chart that is displayed in the panel. "
    },
    {
      "type": "field",
      "varNames": [
        "chartMouseListeners"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Storage for registered (chart) mouse listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "useBuffer"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " A flag that controls whether or not the off-screen buffer is used. "
    },
    {
      "type": "field",
      "varNames": [
        "refreshBuffer"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " A flag that indicates that the buffer should be refreshed. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBuffer"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " A buffer for the rendered chart. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferHeight"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " The height of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBufferWidth"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " The width of the chart buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawWidth"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": "\r\n     * The minimum width for drawing a chart (uses scaling for smaller widths).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumDrawHeight"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": "\r\n     * The minimum height for drawing a chart (uses scaling for smaller\r\n     * heights).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawWidth"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": "\r\n     * The maximum width for drawing a chart (uses scaling for bigger\r\n     * widths).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumDrawHeight"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": "\r\n     * The maximum height for drawing a chart (uses scaling for bigger\r\n     * heights).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "popup"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " The popup menu for the frame. "
    },
    {
      "type": "field",
      "varNames": [
        "info"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " The drawing info collected the last time the chart was drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " The chart anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleX"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleY"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " The scale factor used to draw the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZoomable"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " A flag that controls whether or not domain zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZoomable"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " A flag that controls whether or not range zooming is enabled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomPoint"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": "\r\n     * The zoom rectangle starting point (selected by the user with a mouse\r\n     * click).  This is a point on the screen, not the chart (which may have\r\n     * been scaled up or down to fit the panel).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomRectangle"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " The zoom rectangle (selected by the user with the mouse). "
    },
    {
      "type": "field",
      "varNames": [
        "fillZoomRectangle"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Controls if the zoom rectangle is drawn as an outline or filled. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomTriggerDistance"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " The minimum distance required to drag the mouse to trigger a zoom. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInBothMenuItem"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " Menu item for zooming in on a chart (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInDomainMenuItem"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Menu item for zooming in on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInRangeMenuItem"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " Menu item for zooming in on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutBothMenuItem"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " Menu item for zooming out on a chart. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutDomainMenuItem"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": " Menu item for zooming out on a chart (domain axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutRangeMenuItem"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " Menu item for zooming out on a chart (range axis). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetBothMenuItem"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Menu item for resetting the zoom (both axes). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetDomainMenuItem"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " Menu item for resetting the zoom (domain axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "zoomResetRangeMenuItem"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " Menu item for resetting the zoom (range axis only). "
    },
    {
      "type": "field",
      "varNames": [
        "defaultDirectoryForSaveAs"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": "\r\n     * The default directory for saving charts to file.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "enforceFileExtensions"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " A flag that controls whether or not file extensions are enforced. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDelaysActive"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " A flag that indicates if original tooltip delays are changed. "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipInitialDelay"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " Original initial tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipReshowDelay"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " Original reshow tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "originalToolTipDismissDelay"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": " Original dismiss tooltip delay of ToolTipManager.sharedInstance(). "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipInitialDelay"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": " Own initial tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipReshowDelay"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": " Own reshow tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "ownToolTipDismissDelay"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": " Own dismiss tooltip delay to be used in this chart panel. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomInFactor"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": " The factor used to zoom in on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutFactor"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": " The factor used to zoom out on an axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "zoomAroundAnchor"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": "\r\n     * A flag that controls whether zoom operations are centred on the\r\n     * current anchor point, or the centre point of the relevant axis.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomOutlinePaint"
      ],
      "begin_line": 499,
      "end_line": 499,
      "comment": "\r\n     * The paint used to draw the zoom rectangle outline.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomFillPaint"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": "\r\n     * The zoom fill paint (should use transparency).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 509,
      "end_line": 511,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "overlays"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": "\r\n     * A list of overlays for the panel.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "availableMouseHandlers"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": "\r\n     * The mouse handlers that are available to deal with mouse events.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "liveMouseHandler"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": "\r\n     * The current \"live\" mouse handler.  One of the handlers from the\r\n     * \u0027availableMouseHandlers\u0027 list will be selected (typically in the\r\n     * mousePressed() method) to be the live handler.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "auxiliaryMouseHandlers"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": "\r\n     * A list of auxiliary mouse handlers that will be called after the\r\n     * live handler has done it\u0027s work.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zoomHandler"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": "\r\n     * The zoom handler that is installed by default.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionStates"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": "\r\n     * A list of {@link DatasetAndSelection} objects.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionShape"
      ],
      "begin_line": 561,
      "end_line": 561,
      "comment": "\r\n     * The selection shape (may be \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionFillPaint"
      ],
      "begin_line": 568,
      "end_line": 568,
      "comment": "\r\n     * The selection fill paint (may be \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionOutlinePaint"
      ],
      "begin_line": 575,
      "end_line": 575,
      "comment": "\r\n     * The paint used to draw the outline of the selection shape.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionOutlineStroke"
      ],
      "begin_line": 582,
      "end_line": 584,
      "comment": "\r\n     * The stroke used to draw the outline of the selection stroke.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart)",
      "begin_line": 591,
      "end_line": 609,
      "comment": "\r\n     * Constructs a panel that displays the specified chart.\r\n     *\r\n     * @param chart  the chart.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 607,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean)",
      "begin_line": 627,
      "end_line": 639,
      "comment": "\r\n     * Constructs a panel containing a chart.  The \u003ccode\u003euseBuffer\u003c/code\u003e flag\r\n     * controls whether or not an offscreen \u003ccode\u003eBufferedImage\u003c/code\u003e is\r\n     * maintained for the chart.  If the buffer is used, more memory is\r\n     * consumed, but panel repaints will be a lot quicker in cases where the\r\n     * chart itself hasn\u0027t changed (for example, when another frame is moved\r\n     * to reveal the panel).  WARNING: If you set the \u003ccode\u003euseBuffer\u003c/code\u003e\r\n     * flag to false, note that the mouse zooming rectangle will (in that case)\r\n     * be drawn using XOR, and there is a SEVERE performance problem with that\r\n     * on JRE6 on Windows.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param useBuffer  a flag controlling whether or not an off-screen buffer\r\n     *                   is used (read the warning above before setting this\r\n     *                   to \u003ccode\u003efalse\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 637,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 656,
      "end_line": 678,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should\r\n     *              be added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 676,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 704,
      "end_line": 712,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param width  the preferred width of the panel.\r\n     * @param height  the preferred height of the panel.\r\n     * @param minimumDrawWidth  the minimum drawing width.\r\n     * @param minimumDrawHeight  the minimum drawing height.\r\n     * @param maximumDrawWidth  the maximum drawing width.\r\n     * @param maximumDrawHeight  the maximum drawing height.\r\n     * @param useBuffer  a flag that indicates whether to use the off-screen\r\n     *                   buffer to improve performance (at the expense of\r\n     *                   memory).\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should be\r\n     *              added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 711,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartPanel.ChartPanel(org.jfree.chart.JFreeChart, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 742,
      "end_line": 805,
      "comment": "\r\n     * Constructs a JFreeChart panel.\r\n     *\r\n     * @param chart  the chart.\r\n     * @param width  the preferred width of the panel.\r\n     * @param height  the preferred height of the panel.\r\n     * @param minimumDrawWidth  the minimum drawing width.\r\n     * @param minimumDrawHeight  the minimum drawing height.\r\n     * @param maximumDrawWidth  the maximum drawing width.\r\n     * @param maximumDrawHeight  the maximum drawing height.\r\n     * @param useBuffer  a flag that indicates whether to use the off-screen\r\n     *                   buffer to improve performance (at the expense of\r\n     *                   memory).\r\n     * @param properties  a flag indicating whether or not the chart property\r\n     *                    editor should be available via the popup menu.\r\n     * @param copy  a flag indicating whether or not a copy option should be\r\n     *              available via the popup menu.\r\n     * @param save  a flag indicating whether or not save options should be\r\n     *              available via the popup menu.\r\n     * @param print  a flag indicating whether or not the print option\r\n     *               should be available via the popup menu.\r\n     * @param zoom  a flag indicating whether or not zoom options should be\r\n     *              added to the popup menu.\r\n     * @param tooltips  a flag indicating whether or not tooltips should be\r\n     *                  enabled for the chart.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 24)",
        "(line 749,col 9)-(line 749,col 59)",
        "(line 750,col 9)-(line 750,col 45)",
        "(line 751,col 9)-(line 751,col 43)",
        "(line 752,col 9)-(line 752,col 55)",
        "(line 753,col 9)-(line 753,col 35)",
        "(line 754,col 9)-(line 754,col 35)",
        "(line 755,col 9)-(line 755,col 49)",
        "(line 756,col 9)-(line 756,col 51)",
        "(line 757,col 9)-(line 757,col 49)",
        "(line 758,col 9)-(line 758,col 51)",
        "(line 759,col 9)-(line 759,col 65)",
        "(line 762,col 9)-(line 762,col 26)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 48)",
        "(line 768,col 9)-(line 768,col 55)",
        "(line 769,col 9)-(line 769,col 37)",
        "(line 770,col 9)-(line 770,col 31)",
        "(line 771,col 9)-(line 771,col 37)",
        "(line 773,col 9)-(line 773,col 46)",
        "(line 774,col 9)-(line 774,col 42)",
        "(line 778,col 9)-(line 778,col 61)",
        "(line 779,col 9)-(line 779,col 60)",
        "(line 780,col 9)-(line 780,col 60)",
        "(line 781,col 9)-(line 781,col 58)",
        "(line 783,col 9)-(line 783,col 38)",
        "(line 784,col 9)-(line 784,col 43)",
        "(line 785,col 9)-(line 785,col 54)",
        "(line 787,col 9)-(line 787,col 50)",
        "(line 789,col 9)-(line 789,col 64)",
        "(line 791,col 9)-(line 791,col 45)",
        "(line 792,col 9)-(line 792,col 53)",
        "(line 794,col 9)-(line 794,col 49)",
        "(line 795,col 9)-(line 795,col 43)",
        "(line 798,col 9)-(line 798,col 68)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 40)",
        "(line 803,col 9)-(line 803,col 52)",
        "(line 804,col 9)-(line 804,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChart()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\r\n     * Returns the chart contained in the panel.\r\n     *\r\n     * @return The chart (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setChart(org.jfree.chart.JFreeChart)",
      "begin_line": 821,
      "end_line": 853,
      "comment": "\r\n     * Sets the chart that is displayed in the panel.\r\n     *\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 827,col 9)",
        "(line 830,col 9)-(line 830,col 27)",
        "(line 831,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawWidth()",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\r\n     * Returns the minimum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is less than this, then the chart is\r\n     * drawn at the minimum width then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing width.\r\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawWidth(int)",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\r\n     * Sets the minimum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * less than this amount, the chart will be drawn using the minimum width\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawWidth()",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\r\n     * Returns the maximum drawing width for charts.\r\n     * \u003cP\u003e\r\n     * If the width available on the panel is greater than this, then the chart\r\n     * is drawn at the maximum width then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing width.\r\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawWidth(int)",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\r\n     * Sets the maximum drawing width for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available width is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * width then scaled up to fit the available space.\r\n     *\r\n     * @param width  The width.\r\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMinimumDrawHeight()",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\r\n     * Returns the minimum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is less than this, then the chart\r\n     * is drawn at the minimum height then scaled down to fit.\r\n     *\r\n     * @return The minimum drawing height.\r\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMinimumDrawHeight(int)",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\r\n     * Sets the minimum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * less than this amount, the chart will be drawn using the minimum height\r\n     * then scaled down to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getMaximumDrawHeight()",
      "begin_line": 938,
      "end_line": 940,
      "comment": "\r\n     * Returns the maximum drawing height for charts.\r\n     * \u003cP\u003e\r\n     * If the height available on the panel is greater than this, then the\r\n     * chart is drawn at the maximum height then scaled up to fit.\r\n     *\r\n     * @return The maximum drawing height.\r\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMaximumDrawHeight(int)",
      "begin_line": 951,
      "end_line": 953,
      "comment": "\r\n     * Sets the maximum drawing height for the chart on this panel.\r\n     * \u003cP\u003e\r\n     * At the time the chart is drawn on the panel, if the available height is\r\n     * greater than this amount, the chart will be drawn using the maximum\r\n     * height then scaled up to fit the available space.\r\n     *\r\n     * @param height  The height.\r\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleX()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\r\n     * Returns the X scale factor for the chart.  This will be 1.0 if no\r\n     * scaling has been used.\r\n     *\r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScaleY()",
      "begin_line": 971,
      "end_line": 973,
      "comment": "\r\n     * Returns the Y scale factory for the chart.  This will be 1.0 if no\r\n     * scaling has been used.\r\n     *\r\n     * @return The scale factor.\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getAnchor()",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\r\n     * Returns the anchor point.\r\n     *\r\n     * @return The anchor point (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setAnchor(java.awt.geom.Point2D)",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\r\n     * Sets the anchor point.  This method is provided for the use of\r\n     * subclasses, not end users.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getPopupMenu()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\r\n     * Returns the popup menu.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setPopupMenu(javax.swing.JPopupMenu)",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\r\n     * Sets the popup menu for the panel.\r\n     *\r\n     * @param popup  the popup menu (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getChartRenderingInfo()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\r\n     * Returns the chart rendering info from the most recent chart redraw.\r\n     *\r\n     * @return The chart rendering info.\r\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean)",
      "begin_line": 1027,
      "end_line": 1029,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming and rectangle fill on\r\n     *              zoom.\r\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseZoomable(boolean, boolean)",
      "begin_line": 1038,
      "end_line": 1042,
      "comment": "\r\n     * A convenience method that switches on mouse-based zooming.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e if zooming enabled\r\n     * @param fillRectangle  \u003ccode\u003etrue\u003c/code\u003e if zoom rectangle is filled,\r\n     *                       false if rectangle is shown as outline only.\r\n     ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 32)",
        "(line 1040,col 9)-(line 1040,col 31)",
        "(line 1041,col 9)-(line 1041,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isDomainZoomable()",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for\r\n     * the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDomainZoomable(boolean)",
      "begin_line": 1061,
      "end_line": 1072,
      "comment": "\r\n     * Sets the flag that controls whether or not zooming is enable for the\r\n     * domain axis.  A check is made to ensure that the current plot supports\r\n     * zooming for the domain values.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming if possible.\r\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isRangeZoomable()",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "\r\n     * Returns the flag that determines whether or not zooming is enabled for\r\n     * the range axis.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRangeZoomable(boolean)",
      "begin_line": 1089,
      "end_line": 1100,
      "comment": "\r\n     * A flag that controls mouse-based zooming on the vertical axis.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e enables zooming.\r\n     ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1099,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getFillZoomRectangle()",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "\r\n     * Returns the flag that controls whether or not the zoom rectangle is\r\n     * filled when drawn.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setFillZoomRectangle(boolean)",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "\r\n     * A flag that controls how the zoom rectangle is drawn.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e instructs to fill the rectangle on\r\n     *              zoom, otherwise it will be outlined.\r\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomTriggerDistance()",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\r\n     * Returns the zoom trigger distance.  This controls how far the mouse must\r\n     * move before a zoom action is triggered.\r\n     *\r\n     * @return The distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomTriggerDistance(int)",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": "\r\n     * Sets the zoom trigger distance.  This controls how far the mouse must\r\n     * move before a zoom action is triggered.\r\n     *\r\n     * @param distance  the distance (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDefaultDirectoryForSaveAs()",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\r\n     * Returns the default directory for the \"save as\" option.\r\n     *\r\n     * @return The default directory (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDefaultDirectoryForSaveAs(java.io.File)",
      "begin_line": 1161,
      "end_line": 1169,
      "comment": "\r\n     * Sets the default directory for the \"save as\" option.  If you set this\r\n     * to \u003ccode\u003enull\u003c/code\u003e, the user\u0027s default directory will be used.\r\n     *\r\n     * @param directory  the directory (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isEnforceFileExtensions()",
      "begin_line": 1179,
      "end_line": 1181,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if file extensions should be enforced, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setEnforceFileExtensions(boolean)\r\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setEnforceFileExtensions(boolean)",
      "begin_line": 1190,
      "end_line": 1192,
      "comment": "\r\n     * Sets a flag that controls whether or not file extensions are enforced.\r\n     *\r\n     * @param enforce  the new flag value.\r\n     *\r\n     * @see #isEnforceFileExtensions()\r\n     ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomAroundAnchor()",
      "begin_line": 1204,
      "end_line": 1206,
      "comment": "\r\n     * Returns the flag that controls whether or not zoom operations are\r\n     * centered around the current anchor point.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #setZoomAroundAnchor(boolean)\r\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1205,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomAroundAnchor(boolean)",
      "begin_line": 1218,
      "end_line": 1220,
      "comment": "\r\n     * Sets the flag that controls whether or not zoom operations are\r\n     * centered around the current anchor point.\r\n     *\r\n     * @param zoomAroundAnchor  the new flag value.\r\n     *\r\n     * @since 1.0.7\r\n     *\r\n     * @see #getZoomAroundAnchor()\r\n     ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomFillPaint()",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": "\r\n     * Returns the zoom rectangle fill paint.\r\n     *\r\n     * @return The zoom rectangle fill paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setZoomFillPaint(java.awt.Paint)\r\n     * @see #setFillZoomRectangle(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1233,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomFillPaint(java.awt.Paint)",
      "begin_line": 1246,
      "end_line": 1251,
      "comment": "\r\n     * Sets the zoom rectangle fill paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getZoomFillPaint()\r\n     * @see #getFillZoomRectangle()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1250,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomOutlinePaint()",
      "begin_line": 1263,
      "end_line": 1265,
      "comment": "\r\n     * Returns the zoom rectangle outline paint.\r\n     *\r\n     * @return The zoom rectangle outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setZoomOutlinePaint(java.awt.Paint)\r\n     * @see #setFillZoomRectangle(boolean)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomOutlinePaint(java.awt.Paint)",
      "begin_line": 1277,
      "end_line": 1279,
      "comment": "\r\n     * Sets the zoom rectangle outline paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getZoomOutlinePaint()\r\n     * @see #getFillZoomRectangle()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1278,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mouseWheelHandler"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": "\r\n     * The mouse wheel handler.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.isMouseWheelEnabled()",
      "begin_line": 1294,
      "end_line": 1296,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the mouse wheel handler is enabled, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setMouseWheelEnabled(boolean)",
      "begin_line": 1308,
      "end_line": 1316,
      "comment": "\r\n     * Enables or disables mouse wheel support for the panel.\r\n     * Note that this method does nothing when running JFreeChart on JRE 1.3.1,\r\n     * because that older version of the Java runtime does not support\r\n     * mouse wheel events.\r\n     *\r\n     * @param flag  a boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addOverlay(org.jfree.chart.panel.Overlay)",
      "begin_line": 1325,
      "end_line": 1332,
      "comment": "\r\n     * Add an overlay to the panel.\r\n     *\r\n     * @param overlay  the overlay (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 35)",
        "(line 1330,col 9)-(line 1330,col 40)",
        "(line 1331,col 9)-(line 1331,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeOverlay(org.jfree.chart.panel.Overlay)",
      "begin_line": 1341,
      "end_line": 1350,
      "comment": "\r\n     * Removes an overlay from the panel.\r\n     *\r\n     * @param overlay  the overlay to remove (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 56)",
        "(line 1346,col 9)-(line 1349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.overlayChanged(org.jfree.chart.event.OverlayChangeEvent)",
      "begin_line": 1359,
      "end_line": 1361,
      "comment": "\r\n     * Handles a change to an overlay by repainting the panel.\r\n     *\r\n     * @param event  the event.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getUseBuffer()",
      "begin_line": 1371,
      "end_line": 1373,
      "comment": "\r\n     * Returns the value of the \u003ccode\u003euseBuffer\u003c/code\u003e flag as set in the\r\n     * constructor.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1372,col 9)-(line 1372,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getOrientation()",
      "begin_line": 1382,
      "end_line": 1384,
      "comment": "\r\n     * Returns the orientation of the plot in the panel.\r\n     *\r\n     * @return The orientation of the plot.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1383,col 9)-(line 1383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)",
      "begin_line": 1395,
      "end_line": 1400,
      "comment": "\r\n     * Adds a mouse handler.\r\n     *\r\n     * @param handler  the handler (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1398,col 9)",
        "(line 1399,col 9)-(line 1399,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)",
      "begin_line": 1413,
      "end_line": 1418,
      "comment": "\r\n     * Removes a mouse handler.\r\n     *\r\n     * @param handler  the handler (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #addMouseHandler(org.jfree.chart.panel.AbstractMouseHandler)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1414,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1417,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.clearLiveMouseHandler()",
      "begin_line": 1426,
      "end_line": 1428,
      "comment": "\r\n     * Clears the \u0027liveMouseHandler\u0027 field.  Each handler is responsible for\r\n     * calling this method when they have finished handling mouse events.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1427,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomHandler()",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\r\n     * Returns the zoom handler.\r\n     *\r\n     * @return The zoom handler.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomRectangle()",
      "begin_line": 1448,
      "end_line": 1450,
      "comment": "\r\n     * Returns the zoom rectangle.\r\n     *\r\n     * @return The zoom rectangle (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1449,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomRectangle(java.awt.geom.Rectangle2D)",
      "begin_line": 1459,
      "end_line": 1461,
      "comment": "\r\n     * Sets the zoom rectangle for the panel.\r\n     *\r\n     * @param rect  the rectangle (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1460,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDisplayToolTips(boolean)",
      "begin_line": 1471,
      "end_line": 1478,
      "comment": "\r\n     * Switches the display of tooltips for the panel on or off.  Note that\r\n     * tooltips can only be displayed if the chart has been configured to\r\n     * generate tooltip items.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e to enable tooltips, \u003ccode\u003efalse\u003c/code\u003e to\r\n     *              disable tooltips.\r\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getToolTipText(java.awt.event.MouseEvent)",
      "begin_line": 1487,
      "end_line": 1504,
      "comment": "\r\n     * Returns a string for the tooltip.\r\n     *\r\n     * @param e  the mouse event.\r\n     *\r\n     * @return A tool tip or \u003ccode\u003enull\u003c/code\u003e if no tooltip is available.\r\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 29)",
        "(line 1490,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1502,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateJava2DToScreen(java.awt.geom.Point2D)",
      "begin_line": 1513,
      "end_line": 1518,
      "comment": "\r\n     * Translates a Java2D point on the chart to a screen location.\r\n     *\r\n     * @param java2DPoint  the Java2D point.\r\n     *\r\n     * @return The screen location.\r\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 36)",
        "(line 1515,col 9)-(line 1515,col 71)",
        "(line 1516,col 9)-(line 1516,col 70)",
        "(line 1517,col 9)-(line 1517,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.translateScreenToJava2D(java.awt.Point)",
      "begin_line": 1528,
      "end_line": 1533,
      "comment": "\r\n     * Translates a panel (component) location to a Java2D point.\r\n     *\r\n     * @param screenPoint  the screen location (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @return The Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 1529,col 9)-(line 1529,col 36)",
        "(line 1530,col 9)-(line 1530,col 68)",
        "(line 1531,col 9)-(line 1531,col 67)",
        "(line 1532,col 9)-(line 1532,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.scale(java.awt.geom.Rectangle2D)",
      "begin_line": 1543,
      "end_line": 1550,
      "comment": "\r\n     * Applies any scaling that is in effect for the chart drawing to the\r\n     * given rectangle.\r\n     *\r\n     * @param rect  the rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new scaled rectangle.\r\n     ",
      "child_ranges": [
        "(line 1544,col 9)-(line 1544,col 36)",
        "(line 1545,col 9)-(line 1545,col 59)",
        "(line 1546,col 9)-(line 1546,col 58)",
        "(line 1547,col 9)-(line 1547,col 49)",
        "(line 1548,col 9)-(line 1548,col 50)",
        "(line 1549,col 9)-(line 1549,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getEntityForPoint(int, int)",
      "begin_line": 1563,
      "end_line": 1575,
      "comment": "\r\n     * Returns the chart entity at a given point.\r\n     * \u003cP\u003e\r\n     * This method will return null if there is (a) no entity at the given\r\n     * point, or (b) no entity collection has been generated.\r\n     *\r\n     * @param viewX  the x-coordinate.\r\n     * @param viewY  the y-coordinate.\r\n     *\r\n     * @return The chart entity (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1565,col 9)-(line 1565,col 34)",
        "(line 1566,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1573,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getRefreshBuffer()",
      "begin_line": 1583,
      "end_line": 1585,
      "comment": "\r\n     * Returns the flag that controls whether or not the offscreen buffer\r\n     * needs to be refreshed.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1584,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setRefreshBuffer(boolean)",
      "begin_line": 1594,
      "end_line": 1596,
      "comment": "\r\n     * Sets the refresh buffer flag.  This flag is used to avoid unnecessary\r\n     * redrawing of the chart when the offscreen image buffer is used.\r\n     *\r\n     * @param flag  \u003ccode\u003etrue\u003c/code\u003e indicates that the buffer should be\r\n     *              refreshed.\r\n     ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1595,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.paintComponent(java.awt.Graphics)",
      "begin_line": 1606,
      "end_line": 1738,
      "comment": "\r\n     * Paints the component by drawing the chart to fill the entire component,\r\n     * but allowing for the insets (which will be non-zero if a border has been\r\n     * set for this component).  To increase performance (at the expense of\r\n     * memory), an off-screen buffer image can be used.\r\n     *\r\n     * @param g  the graphics device for drawing on.\r\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 32)",
        "(line 1608,col 9)-(line 1610,col 9)",
        "(line 1611,col 9)-(line 1611,col 48)",
        "(line 1614,col 9)-(line 1614,col 35)",
        "(line 1615,col 9)-(line 1615,col 36)",
        "(line 1616,col 9)-(line 1618,col 63)",
        "(line 1621,col 9)-(line 1621,col 30)",
        "(line 1622,col 9)-(line 1622,col 48)",
        "(line 1623,col 9)-(line 1623,col 50)",
        "(line 1624,col 9)-(line 1624,col 26)",
        "(line 1625,col 9)-(line 1625,col 26)",
        "(line 1627,col 9)-(line 1636,col 9)",
        "(line 1638,col 9)-(line 1647,col 9)",
        "(line 1649,col 9)-(line 1650,col 28)",
        "(line 1653,col 9)-(line 1721,col 9)",
        "(line 1723,col 9)-(line 1723,col 53)",
        "(line 1724,col 9)-(line 1727,col 9)",
        "(line 1732,col 9)-(line 1732,col 47)",
        "(line 1733,col 9)-(line 1733,col 48)",
        "(line 1734,col 9)-(line 1734,col 21)",
        "(line 1736,col 9)-(line 1736,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartChanged(org.jfree.chart.event.ChartChangeEvent)",
      "begin_line": 1745,
      "end_line": 1753,
      "comment": "\r\n     * Receives notification of changes to the chart, and redraws the chart.\r\n     *\r\n     * @param event  details of the chart change event.\r\n     ",
      "child_ranges": [
        "(line 1746,col 9)-(line 1746,col 34)",
        "(line 1747,col 9)-(line 1747,col 41)",
        "(line 1748,col 9)-(line 1751,col 9)",
        "(line 1752,col 9)-(line 1752,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.chartProgress(org.jfree.chart.event.ChartProgressEvent)",
      "begin_line": 1760,
      "end_line": 1762,
      "comment": "\r\n     * Receives notification of a chart progress event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.actionPerformed(java.awt.event.ActionEvent)",
      "begin_line": 1769,
      "end_line": 1828,
      "comment": "\r\n     * Handles action events generated by the popup menu.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 1771,col 9)-(line 1771,col 50)",
        "(line 1776,col 9)-(line 1776,col 30)",
        "(line 1777,col 9)-(line 1777,col 30)",
        "(line 1778,col 9)-(line 1781,col 9)",
        "(line 1783,col 9)-(line 1826,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseEntered(java.awt.event.MouseEvent)",
      "begin_line": 1837,
      "end_line": 1861,
      "comment": "\r\n     * Handles a \u0027mouse entered\u0027 event. This method changes the tooltip delays\r\n     * of ToolTipManager.sharedInstance() to the possibly different values set\r\n     * for this chart panel.\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1838,col 9)-(line 1851,col 9)",
        "(line 1853,col 9)-(line 1855,col 9)",
        "(line 1856,col 9)-(line 1856,col 67)",
        "(line 1857,col 9)-(line 1860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseExited(java.awt.event.MouseEvent)",
      "begin_line": 1870,
      "end_line": 1888,
      "comment": "\r\n     * Handles a \u0027mouse exited\u0027 event. This method resets the tooltip delays of\r\n     * ToolTipManager.sharedInstance() to their\r\n     * original values in effect before mouseEntered()\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1871,col 9)-(line 1878,col 9)",
        "(line 1880,col 9)-(line 1882,col 9)",
        "(line 1883,col 9)-(line 1883,col 67)",
        "(line 1884,col 9)-(line 1887,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mousePressed(java.awt.event.MouseEvent)",
      "begin_line": 1898,
      "end_line": 1946,
      "comment": "\r\n     * Handles a \u0027mouse pressed\u0027 event.\r\n     * \u003cP\u003e\r\n     * This event is the popup trigger on Unix/Linux.  For Windows, the popup\r\n     * trigger is the \u0027mouse released\u0027 event.\r\n     *\r\n     * @param e  The mouse event.\r\n     ",
      "child_ranges": [
        "(line 1899,col 9)-(line 1901,col 9)",
        "(line 1902,col 9)-(line 1902,col 36)",
        "(line 1904,col 9)-(line 1909,col 9)",
        "(line 1911,col 9)-(line 1936,col 9)",
        "(line 1939,col 9)-(line 1939,col 67)",
        "(line 1940,col 9)-(line 1944,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseDragged(java.awt.event.MouseEvent)",
      "begin_line": 1953,
      "end_line": 1971,
      "comment": "\r\n     * Handles a \u0027mouse dragged\u0027 event.\r\n     *\r\n     * @param e  the mouse event.\r\n     ",
      "child_ranges": [
        "(line 1956,col 9)-(line 1958,col 9)",
        "(line 1960,col 9)-(line 1962,col 9)",
        "(line 1965,col 9)-(line 1965,col 67)",
        "(line 1966,col 9)-(line 1969,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseReleased(java.awt.event.MouseEvent)",
      "begin_line": 1980,
      "end_line": 1999,
      "comment": "\r\n     * Handles a \u0027mouse released\u0027 event.  On Windows, we need to check if this\r\n     * is a popup trigger, but only if we haven\u0027t already been tracking a zoom\r\n     * rectangle.\r\n     *\r\n     * @param e  information about the event.\r\n     ",
      "child_ranges": [
        "(line 1981,col 9)-(line 1986,col 9)",
        "(line 1988,col 9)-(line 1990,col 9)",
        "(line 1993,col 9)-(line 1993,col 67)",
        "(line 1994,col 9)-(line 1997,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseClicked(java.awt.event.MouseEvent)",
      "begin_line": 2007,
      "end_line": 2048,
      "comment": "\r\n     * Receives notification of mouse clicks on the panel.  These are\r\n     * translated and passed on to any registered {@link ChartMouseListener}s.\r\n     *\r\n     * @param event  Information about the mouse event.\r\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2010,col 9)",
        "(line 2013,col 9)-(line 2013,col 67)",
        "(line 2014,col 9)-(line 2017,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.mouseMoved(java.awt.event.MouseEvent)",
      "begin_line": 2055,
      "end_line": 2083,
      "comment": "\r\n     * Implementation of the MouseMotionListener\u0027s method.\r\n     *\r\n     * @param e  the event.\r\n     ",
      "child_ranges": [
        "(line 2057,col 9)-(line 2058,col 42)",
        "(line 2059,col 9)-(line 2061,col 9)",
        "(line 2062,col 9)-(line 2062,col 36)",
        "(line 2063,col 9)-(line 2063,col 63)",
        "(line 2064,col 9)-(line 2064,col 62)",
        "(line 2066,col 9)-(line 2066,col 34)",
        "(line 2067,col 9)-(line 2072,col 9)",
        "(line 2076,col 9)-(line 2081,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInBoth(double, double)",
      "begin_line": 2091,
      "end_line": 2104,
      "comment": "\r\n     * Zooms in on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2092,col 9)-(line 2092,col 41)",
        "(line 2093,col 9)-(line 2095,col 9)",
        "(line 2099,col 9)-(line 2099,col 46)",
        "(line 2100,col 9)-(line 2100,col 30)",
        "(line 2101,col 9)-(line 2101,col 27)",
        "(line 2102,col 9)-(line 2102,col 26)",
        "(line 2103,col 9)-(line 2103,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInDomain(double, double)",
      "begin_line": 2114,
      "end_line": 2128,
      "comment": "\r\n     * Decreases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is reduced\r\n     * by the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2115,col 9)-(line 2115,col 41)",
        "(line 2116,col 9)-(line 2127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomInRange(double, double)",
      "begin_line": 2138,
      "end_line": 2152,
      "comment": "\r\n     * Decreases the length of the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is reduced by\r\n     * the value of {@link #getZoomInFactor()}.\r\n     *\r\n     * @param x  the x-coordinate (in screen coordinates).\r\n     * @param y  the y coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2139,col 9)-(line 2139,col 41)",
        "(line 2140,col 9)-(line 2151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutBoth(double, double)",
      "begin_line": 2160,
      "end_line": 2173,
      "comment": "\r\n     * Zooms out on an anchor point (specified in screen coordinate space).\r\n     *\r\n     * @param x  the x value (in screen coordinates).\r\n     * @param y  the y value (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2161,col 9)-(line 2161,col 41)",
        "(line 2162,col 9)-(line 2164,col 9)",
        "(line 2168,col 9)-(line 2168,col 46)",
        "(line 2169,col 9)-(line 2169,col 30)",
        "(line 2170,col 9)-(line 2170,col 28)",
        "(line 2171,col 9)-(line 2171,col 27)",
        "(line 2172,col 9)-(line 2172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutDomain(double, double)",
      "begin_line": 2183,
      "end_line": 2197,
      "comment": "\r\n     * Increases the length of the domain axis, centered about the given\r\n     * coordinate on the screen.  The length of the domain axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2184,col 9)-(line 2184,col 41)",
        "(line 2185,col 9)-(line 2196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoomOutRange(double, double)",
      "begin_line": 2207,
      "end_line": 2221,
      "comment": "\r\n     * Increases the length the range axis, centered about the given\r\n     * coordinate on the screen.  The length of the range axis is increased\r\n     * by the value of {@link #getZoomOutFactor()}.\r\n     *\r\n     * @param x  the x coordinate (in screen coordinates).\r\n     * @param y  the y-coordinate (in screen coordinates).\r\n     ",
      "child_ranges": [
        "(line 2208,col 9)-(line 2208,col 41)",
        "(line 2209,col 9)-(line 2220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.zoom(java.awt.geom.Rectangle2D)",
      "begin_line": 2228,
      "end_line": 2270,
      "comment": "\r\n     * Zooms in on a selected region.\r\n     *\r\n     * @param selection  the selected region.\r\n     ",
      "child_ranges": [
        "(line 2232,col 9)-(line 2234,col 52)",
        "(line 2235,col 9)-(line 2235,col 61)",
        "(line 2236,col 9)-(line 2237,col 76)",
        "(line 2238,col 9)-(line 2268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoBounds()",
      "begin_line": 2275,
      "end_line": 2288,
      "comment": "\r\n     * Restores the auto-range calculation on both axes.\r\n     ",
      "child_ranges": [
        "(line 2276,col 9)-(line 2276,col 41)",
        "(line 2277,col 9)-(line 2279,col 9)",
        "(line 2283,col 9)-(line 2283,col 46)",
        "(line 2284,col 9)-(line 2284,col 30)",
        "(line 2285,col 9)-(line 2285,col 34)",
        "(line 2286,col 9)-(line 2286,col 33)",
        "(line 2287,col 9)-(line 2287,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoDomainBounds()",
      "begin_line": 2293,
      "end_line": 2308,
      "comment": "\r\n     * Restores the auto-range calculation on the domain axis.\r\n     ",
      "child_ranges": [
        "(line 2294,col 9)-(line 2294,col 41)",
        "(line 2295,col 9)-(line 2307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.restoreAutoRangeBounds()",
      "begin_line": 2313,
      "end_line": 2328,
      "comment": "\r\n     * Restores the auto-range calculation on the range axis.\r\n     ",
      "child_ranges": [
        "(line 2314,col 9)-(line 2314,col 41)",
        "(line 2315,col 9)-(line 2327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea()",
      "begin_line": 2336,
      "end_line": 2344,
      "comment": "\r\n     * Returns the data area for the chart (the area inside the axes) with the\r\n     * current scaling applied (that is, the area as it appears on screen).\r\n     *\r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 2337,col 9)-(line 2337,col 69)",
        "(line 2338,col 9)-(line 2338,col 36)",
        "(line 2339,col 9)-(line 2339,col 63)",
        "(line 2340,col 9)-(line 2340,col 62)",
        "(line 2341,col 9)-(line 2341,col 53)",
        "(line 2342,col 9)-(line 2342,col 54)",
        "(line 2343,col 9)-(line 2343,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getScreenDataArea(int, int)",
      "begin_line": 2355,
      "end_line": 2372,
      "comment": "\r\n     * Returns the data area (the area inside the axes) for the plot or subplot,\r\n     * with the current scaling applied.\r\n     *\r\n     * @param x  the x-coordinate (for subplot selection).\r\n     * @param y  the y-coordinate (for subplot selection).\r\n     *\r\n     * @return The scaled data area.\r\n     ",
      "child_ranges": [
        "(line 2356,col 9)-(line 2356,col 61)",
        "(line 2357,col 9)-(line 2357,col 27)",
        "(line 2358,col 9)-(line 2370,col 9)",
        "(line 2371,col 9)-(line 2371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getInitialDelay()",
      "begin_line": 2381,
      "end_line": 2383,
      "comment": "\r\n     * Returns the initial tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the initial delay value, in milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getInitialDelay()\r\n     ",
      "child_ranges": [
        "(line 2382,col 9)-(line 2382,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getReshowDelay()",
      "begin_line": 2392,
      "end_line": 2394,
      "comment": "\r\n     * Returns the reshow tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the reshow  delay value, in milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getReshowDelay()\r\n     ",
      "child_ranges": [
        "(line 2393,col 9)-(line 2393,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getDismissDelay()",
      "begin_line": 2404,
      "end_line": 2406,
      "comment": "\r\n     * Returns the dismissal tooltip delay value used inside this chart panel.\r\n     *\r\n     * @return An integer representing the dismissal delay value, in\r\n     *         milliseconds.\r\n     *\r\n     * @see javax.swing.ToolTipManager#getDismissDelay()\r\n     ",
      "child_ranges": [
        "(line 2405,col 9)-(line 2405,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setInitialDelay(int)",
      "begin_line": 2416,
      "end_line": 2418,
      "comment": "\r\n     * Specifies the initial delay value for this chart panel.\r\n     *\r\n     * @param delay  the number of milliseconds to delay (after the cursor has\r\n     *               paused) before displaying.\r\n     *\r\n     * @see javax.swing.ToolTipManager#setInitialDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2417,col 9)-(line 2417,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setReshowDelay(int)",
      "begin_line": 2428,
      "end_line": 2430,
      "comment": "\r\n     * Specifies the amount of time before the user has to wait initialDelay\r\n     * milliseconds before a tooltip will be shown.\r\n     *\r\n     * @param delay  time in milliseconds\r\n     *\r\n     * @see javax.swing.ToolTipManager#setReshowDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2429,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setDismissDelay(int)",
      "begin_line": 2440,
      "end_line": 2442,
      "comment": "\r\n     * Specifies the dismissal delay value for this chart panel.\r\n     *\r\n     * @param delay the number of milliseconds to delay before taking away the\r\n     *              tooltip\r\n     *\r\n     * @see javax.swing.ToolTipManager#setDismissDelay(int)\r\n     ",
      "child_ranges": [
        "(line 2441,col 9)-(line 2441,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomInFactor()",
      "begin_line": 2451,
      "end_line": 2453,
      "comment": "\r\n     * Returns the zoom in factor.\r\n     *\r\n     * @return The zoom in factor.\r\n     *\r\n     * @see #setZoomInFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2452,col 9)-(line 2452,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomInFactor(double)",
      "begin_line": 2462,
      "end_line": 2464,
      "comment": "\r\n     * Sets the zoom in factor.\r\n     *\r\n     * @param factor  the factor.\r\n     *\r\n     * @see #getZoomInFactor()\r\n     ",
      "child_ranges": [
        "(line 2463,col 9)-(line 2463,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getZoomOutFactor()",
      "begin_line": 2473,
      "end_line": 2475,
      "comment": "\r\n     * Returns the zoom out factor.\r\n     *\r\n     * @return The zoom out factor.\r\n     *\r\n     * @see #setZoomOutFactor(double)\r\n     ",
      "child_ranges": [
        "(line 2474,col 9)-(line 2474,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setZoomOutFactor(double)",
      "begin_line": 2484,
      "end_line": 2486,
      "comment": "\r\n     * Sets the zoom out factor.\r\n     *\r\n     * @param factor  the factor.\r\n     *\r\n     * @see #getZoomOutFactor()\r\n     ",
      "child_ranges": [
        "(line 2485,col 9)-(line 2485,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawZoomRectangle(java.awt.Graphics2D, boolean)",
      "begin_line": 2498,
      "end_line": 2517,
      "comment": "\r\n     * Draws zoom rectangle (if present).\r\n     * The drawing is performed in XOR mode, therefore\r\n     * when this method is called twice in a row,\r\n     * the second call will completely restore the state\r\n     * of the canvas.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param xor  use XOR for drawing?\r\n     ",
      "child_ranges": [
        "(line 2499,col 9)-(line 2516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.drawSelectionShape(java.awt.Graphics2D, boolean)",
      "begin_line": 2529,
      "end_line": 2549,
      "comment": "\r\n     * Draws zoom rectangle (if present).\r\n     * The drawing is performed in XOR mode, therefore\r\n     * when this method is called twice in a row,\r\n     * the second call will completely restore the state\r\n     * of the canvas.\r\n     *\r\n     * @param g2 the graphics device.\r\n     * @param xor  use XOR for drawing?\r\n     ",
      "child_ranges": [
        "(line 2530,col 9)-(line 2548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doEditChartProperties()",
      "begin_line": 2557,
      "end_line": 2567,
      "comment": "\r\n     * Displays a dialog that allows the user to edit the properties for the\r\n     * current chart.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 2559,col 9)-(line 2559,col 75)",
        "(line 2560,col 9)-(line 2562,col 73)",
        "(line 2563,col 9)-(line 2565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doCopy()",
      "begin_line": 2574,
      "end_line": 2584,
      "comment": "\r\n     * Copies the current chart to the system clipboard.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2575,col 9)-(line 2576,col 67)",
        "(line 2577,col 9)-(line 2577,col 36)",
        "(line 2578,col 9)-(line 2578,col 56)",
        "(line 2579,col 9)-(line 2579,col 57)",
        "(line 2580,col 9)-(line 2582,col 69)",
        "(line 2583,col 9)-(line 2583,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.doSaveAs()",
      "begin_line": 2592,
      "end_line": 2612,
      "comment": "\r\n     * Opens a file chooser and gives the user an opportunity to save the chart\r\n     * in PNG format.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2594,col 9)-(line 2594,col 54)",
        "(line 2595,col 9)-(line 2595,col 72)",
        "(line 2596,col 9)-(line 2597,col 76)",
        "(line 2598,col 9)-(line 2598,col 51)",
        "(line 2600,col 9)-(line 2600,col 54)",
        "(line 2601,col 9)-(line 2610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createChartPrintJob()",
      "begin_line": 2617,
      "end_line": 2634,
      "comment": "\r\n     * Creates a print job for the chart.\r\n     ",
      "child_ranges": [
        "(line 2619,col 9)-(line 2619,col 52)",
        "(line 2620,col 9)-(line 2620,col 42)",
        "(line 2621,col 9)-(line 2621,col 44)",
        "(line 2622,col 9)-(line 2632,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.print(java.awt.Graphics, java.awt.print.PageFormat, int)",
      "begin_line": 2646,
      "end_line": 2660,
      "comment": "\r\n     * Prints the chart on a single page.\r\n     *\r\n     * @param g  the graphics context.\r\n     * @param pf  the page format to use.\r\n     * @param pageIndex  the index of the page. If not \u003ccode\u003e0\u003c/code\u003e, nothing\r\n     *                   gets print.\r\n     *\r\n     * @return The result of printing.\r\n     ",
      "child_ranges": [
        "(line 2648,col 9)-(line 2650,col 9)",
        "(line 2651,col 9)-(line 2651,col 39)",
        "(line 2652,col 9)-(line 2652,col 38)",
        "(line 2653,col 9)-(line 2653,col 38)",
        "(line 2654,col 9)-(line 2654,col 42)",
        "(line 2655,col 9)-(line 2655,col 43)",
        "(line 2656,col 9)-(line 2657,col 22)",
        "(line 2658,col 9)-(line 2658,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.addChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2667,
      "end_line": 2672,
      "comment": "\r\n     * Adds a listener to the list of objects listening for chart mouse events.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 2668,col 9)-(line 2670,col 9)",
        "(line 2671,col 9)-(line 2671,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.removeChartMouseListener(org.jfree.chart.ChartMouseListener)",
      "begin_line": 2680,
      "end_line": 2682,
      "comment": "\r\n     * Removes a listener from the list of objects listening for chart mouse\r\n     * events.\r\n     *\r\n     * @param listener  the listener.\r\n     ",
      "child_ranges": [
        "(line 2681,col 9)-(line 2681,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getListeners(java.lang.Class)",
      "begin_line": 2692,
      "end_line": 2700,
      "comment": "\r\n     * Returns an array of the listeners of the given type registered with the\r\n     * panel.\r\n     *\r\n     * @param listenerType  the listener type.\r\n     *\r\n     * @return An array of listeners.\r\n     ",
      "child_ranges": [
        "(line 2693,col 9)-(line 2699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createPopupMenu(boolean, boolean, boolean, boolean)",
      "begin_line": 2712,
      "end_line": 2715,
      "comment": "\r\n     * Creates a popup menu for the panel.\r\n     *\r\n     * @param properties  include a menu item for the chart property editor.\r\n     * @param save  include a menu item for saving the chart.\r\n     * @param print  include a menu item for printing the chart.\r\n     * @param zoom  include menu items for zooming.\r\n     *\r\n     * @return The popup menu.\r\n     ",
      "child_ranges": [
        "(line 2714,col 9)-(line 2714,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createPopupMenu(boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 2730,
      "end_line": 2873,
      "comment": "\r\n     * Creates a popup menu for the panel.\r\n     *\r\n     * @param properties  include a menu item for the chart property editor.\r\n     * @param copy include a menu item for copying to the clipboard.\r\n     * @param save  include a menu item for saving the chart.\r\n     * @param print  include a menu item for printing the chart.\r\n     * @param zoom  include menu items for zooming.\r\n     *\r\n     * @return The popup menu.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2733,col 9)-(line 2733,col 53)",
        "(line 2734,col 9)-(line 2734,col 34)",
        "(line 2736,col 9)-(line 2743,col 9)",
        "(line 2745,col 9)-(line 2756,col 9)",
        "(line 2758,col 9)-(line 2769,col 9)",
        "(line 2771,col 9)-(line 2782,col 9)",
        "(line 2784,col 9)-(line 2869,col 9)",
        "(line 2871,col 9)-(line 2871,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.displayPopupMenu(int, int)",
      "begin_line": 2882,
      "end_line": 2934,
      "comment": "\r\n     * The idea is to modify the zooming options depending on the type of chart\r\n     * being displayed by the panel.\r\n     *\r\n     * @param x  horizontal position of the popup.\r\n     * @param y  vertical position of the popup.\r\n     ",
      "child_ranges": [
        "(line 2884,col 9)-(line 2932,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.updateUI()",
      "begin_line": 2939,
      "end_line": 2946,
      "comment": "\r\n     * Updates the UI for a LookAndFeel change.\r\n     ",
      "child_ranges": [
        "(line 2942,col 9)-(line 2944,col 9)",
        "(line 2945,col 9)-(line 2945,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2955,
      "end_line": 2959,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2956,col 9)-(line 2956,col 36)",
        "(line 2957,col 9)-(line 2957,col 63)",
        "(line 2958,col 9)-(line 2958,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.readObject(java.io.ObjectInputStream)",
      "begin_line": 2969,
      "end_line": 2983,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 2971,col 9)-(line 2971,col 35)",
        "(line 2972,col 9)-(line 2972,col 63)",
        "(line 2973,col 9)-(line 2973,col 66)",
        "(line 2976,col 9)-(line 2976,col 59)",
        "(line 2979,col 9)-(line 2981,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionShape()",
      "begin_line": 2994,
      "end_line": 2996,
      "comment": "\r\n     * Returns the selection shape.\r\n     *\r\n     * @return The selection shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSelectionShape(java.awt.Shape)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2995,col 9)-(line 2995,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionShape(java.awt.Shape)",
      "begin_line": 3007,
      "end_line": 3009,
      "comment": "\r\n     * Sets the selection shape.\r\n     *\r\n     * @param shape  the selection shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSelectionShape()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3008,col 9)-(line 3008,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionFillPaint()",
      "begin_line": 3020,
      "end_line": 3022,
      "comment": "\r\n     * Returns the selection fill paint.\r\n     *\r\n     * @return The selection fill paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSelectionFillPaint(java.awt.Paint)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3021,col 9)-(line 3021,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionFillPaint(java.awt.Paint)",
      "begin_line": 3033,
      "end_line": 3035,
      "comment": "\r\n     * Sets the selection fill paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSelectionFillPaint()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3034,col 9)-(line 3034,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionOutlinePaint()",
      "begin_line": 3044,
      "end_line": 3046,
      "comment": "\r\n     * Returns the selection outline paint.\r\n     * \r\n     * @return The selection outline paint.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3045,col 9)-(line 3045,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionOutlinePaint(java.awt.Paint)",
      "begin_line": 3053,
      "end_line": 3055,
      "comment": "\r\n     * Sets the selection outline paint.\r\n     *\r\n     * @param paint\r\n     ",
      "child_ranges": [
        "(line 3054,col 9)-(line 3054,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionOutlineStroke()",
      "begin_line": 3064,
      "end_line": 3066,
      "comment": "\r\n     * Returns the selection outline stroke.\r\n     * \r\n     * @return The selection outline stroke.\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3065,col 9)-(line 3065,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.setSelectionOutlineStroke(java.awt.Stroke)",
      "begin_line": 3075,
      "end_line": 3077,
      "comment": "\r\n     * Sets the selection outline stroke.\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3076,col 9)-(line 3076,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.getSelectionState(org.jfree.data.general.Dataset)",
      "begin_line": 3088,
      "end_line": 3098,
      "comment": "\r\n     * Returns the selection state for the specified dataset, if any.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3089,col 9)-(line 3089,col 60)",
        "(line 3090,col 9)-(line 3095,col 9)",
        "(line 3097,col 9)-(line 3097,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.putSelectionState(org.jfree.data.general.Dataset, org.jfree.data.general.DatasetSelectionState)",
      "begin_line": 3110,
      "end_line": 3113,
      "comment": "\r\n     * When setting up a selectable panel, you need to create the selection\r\n     * state and register it here (unless the dataset is managing the selection\r\n     * directly).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3112,col 9)-(line 3112,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartPanel.createGraphics2D()",
      "begin_line": 3123,
      "end_line": 3125,
      "comment": "\r\n     * Returns a graphics context that a renderer can use to calculate\r\n     * selection bounds.\r\n     *\r\n     * @return A graphics context.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 3124,col 9)-(line 3124,col 51)"
      ]
    }
  ]
}