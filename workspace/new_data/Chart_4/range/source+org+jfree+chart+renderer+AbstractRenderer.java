{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/AbstractRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRenderer",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 143,
      "end_line": 3263,
      "comment": "\r\n * Base class providing common services for renderers.  Most methods that update\r\n * attributes of the renderer will fire a {@link RendererChangeEvent}, which\r\n * normally means the plot that owns the renderer will receive notification that\r\n * the renderer has been changed (the plot will, in turn, notify the chart).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Zero represented as a \u003ccode\u003eDouble\u003c/code\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The default outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STROKE"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The default stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SHAPE"
      ],
      "begin_line": 164,
      "end_line": 165,
      "comment": " The default shape. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 168,
      "end_line": 169,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_PAINT"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The default value label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleList"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " A list of flags that controls whether or not each series is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisible"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The default visibility for each series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleInLegendList"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\r\n     * A list of flags that controls whether or not each series is visible in\r\n     * the legend.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisibleInLegend"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The default visibility for each series in the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "paintList"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesPaint"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\r\n     * A flag that controls whether or not the paintList is auto-populated\r\n     * in the {@link #lookupSeriesPaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "basePaint"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The base paint. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintList"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The fill paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesFillPaint"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\r\n     * A flag that controls whether or not the fillPaintList is auto-populated\r\n     * in the {@link #lookupSeriesFillPaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseFillPaint"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The base fill paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintList"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlinePaint"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": "\r\n     * A flag that controls whether or not the outlinePaintList is\r\n     * auto-populated in the {@link #lookupSeriesOutlinePaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlinePaint"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The base outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "strokeList"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesStroke"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": "\r\n     * A flag that controls whether or not the strokeList is auto-populated\r\n     * in the {@link #lookupSeriesStroke(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseStroke"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " The base stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeList"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " The outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlineStroke"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " The base outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlineStroke"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": "\r\n     * A flag that controls whether or not the outlineStrokeList is\r\n     * auto-populated in the {@link #lookupSeriesOutlineStroke(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeList"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " A shape list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesShape"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\r\n     * A flag that controls whether or not the shapeList is auto-populated\r\n     * in the {@link #lookupSeriesShape(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShape"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The base shape. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelsVisibleList"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Visibility of the item labels PER series. "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelsVisible"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The base item labels visible. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelFontList"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " The item label font list (one font per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelFont"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The base item label font. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelPaintList"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The item label paint list (one paint per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelPaint"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The base item label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveItemLabelPositionList"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The positive item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "basePositiveItemLabelPosition"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " The fallback positive item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "negativeItemLabelPositionList"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " The negative item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseNegativeItemLabelPosition"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " The fallback negative item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelAnchorOffset"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " The item label anchor offset. "
    },
    {
      "type": "field",
      "varNames": [
        "createEntitiesList"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": "\r\n     * Flags that control whether or not entities are generated for each\r\n     * series.  This will be overridden by \u0027createEntities\u0027.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseCreateEntities"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": "\r\n     * The default flag that controls whether or not entities are generated.\r\n     * This flag is used when both the above flags return null.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendShapeList"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": "\r\n     * The per-series legend shape settings.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendShape"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": "\r\n     * The base shape for legend items.  If this is \u003ccode\u003enull\u003c/code\u003e, the\r\n     * series shape will be used.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "treatLegendShapeAsLine"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": "\r\n     * A special flag that, if true, will cause the getLegendItem() method\r\n     * to configure the legend shape as if it were a line.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendTextFont"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": "\r\n     * The per-series legend text font.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendTextFont"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": "\r\n     * The base legend font.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendTextPaint"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": "\r\n     * The per series legend text paint settings.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendTextPaint"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": "\r\n     * The default paint for the legend text items (if this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, the {@link LegendTitle} class will determine the\r\n     * text paint to use.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataBoundsIncludesVisibleSeriesOnly"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": "\r\n     * A flag that controls whether or not the renderer will include the\r\n     * non-visible series when calculating the data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultEntityRadius"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " The default radius for the entity \u0027hotspot\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "event"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " An event for re-use. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.AbstractRenderer()",
      "begin_line": 391,
      "end_line": 458,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 51)",
        "(line 394,col 9)-(line 394,col 38)",
        "(line 396,col 9)-(line 396,col 59)",
        "(line 397,col 9)-(line 397,col 46)",
        "(line 399,col 9)-(line 399,col 41)",
        "(line 400,col 9)-(line 400,col 39)",
        "(line 401,col 9)-(line 401,col 44)",
        "(line 403,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 49)",
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 408,col 54)",
        "(line 409,col 9)-(line 409,col 52)",
        "(line 411,col 9)-(line 411,col 43)",
        "(line 412,col 9)-(line 412,col 41)",
        "(line 413,col 9)-(line 413,col 45)",
        "(line 415,col 9)-(line 415,col 50)",
        "(line 416,col 9)-(line 416,col 56)",
        "(line 417,col 9)-(line 417,col 53)",
        "(line 419,col 9)-(line 419,col 41)",
        "(line 420,col 9)-(line 420,col 39)",
        "(line 421,col 9)-(line 421,col 44)",
        "(line 423,col 9)-(line 423,col 55)",
        "(line 424,col 9)-(line 424,col 43)",
        "(line 426,col 9)-(line 426,col 50)",
        "(line 427,col 9)-(line 427,col 68)",
        "(line 429,col 9)-(line 429,col 50)",
        "(line 430,col 9)-(line 430,col 46)",
        "(line 432,col 9)-(line 432,col 62)",
        "(line 433,col 9)-(line 434,col 69)",
        "(line 436,col 9)-(line 436,col 62)",
        "(line 437,col 9)-(line 438,col 65)",
        "(line 440,col 9)-(line 440,col 52)",
        "(line 441,col 9)-(line 441,col 39)",
        "(line 443,col 9)-(line 443,col 37)",
        "(line 445,col 9)-(line 445,col 47)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 448,col 9)-(line 448,col 44)",
        "(line 450,col 9)-(line 450,col 47)",
        "(line 451,col 9)-(line 451,col 39)",
        "(line 453,col 9)-(line 453,col 47)",
        "(line 454,col 9)-(line 454,col 40)",
        "(line 456,col 9)-(line 456,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDrawingSupplier()",
      "begin_line": 465,
      "end_line": 465,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemVisible(int, int)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(int)",
      "begin_line": 490,
      "end_line": 497,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series\r\n     * should be drawn.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 48)",
        "(line 492,col 9)-(line 492,col 62)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisible(int)",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 536,
      "end_line": 546,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 59)",
        "(line 538,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisible()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 581,
      "end_line": 591,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 41)",
        "(line 583,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 603,
      "end_line": 610,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 56)",
        "(line 605,col 9)-(line 605,col 70)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the\r\n     * legend.  This method returns only the \"per series\" settings - to\r\n     * do a lookup that falls back to the default, you need to use the\r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 652,
      "end_line": 658,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 67)",
        "(line 655,col 9)-(line 657,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 679,
      "end_line": 682,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 693,
      "end_line": 698,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 49)",
        "(line 695,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemPaint(int, int, boolean)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesPaint(int)}  method. You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesPaint(int)",
      "begin_line": 729,
      "end_line": 745,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 51)",
        "(line 733,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPaint(int)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 783,
      "end_line": 788,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 47)",
        "(line 785,col 9)-(line 787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clearSeriesPaints(boolean)",
      "begin_line": 798,
      "end_line": 803,
      "comment": "\r\n     * Clears the series paint settings for this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 31)",
        "(line 800,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePaint()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 824,
      "end_line": 827,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 838,
      "end_line": 843,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 31)",
        "(line 840,col 9)-(line 842,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesPaint()",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\r\n     * Returns the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesPaint(boolean)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "\r\n     * Sets the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemFillPaint(int, int, boolean)",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesFillPaint(int)} method - you can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesFillPaint(int)",
      "begin_line": 902,
      "end_line": 918,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 59)",
        "(line 906,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesFillPaint(int)",
      "begin_line": 929,
      "end_line": 931,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\r\n     * Sets the paint used for a series fill and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\r\n     * Sets the paint used to fill a series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 51)",
        "(line 958,col 9)-(line 960,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseFillPaint()",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseFillPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 982,
      "end_line": 985,
      "comment": "\r\n     * Sets the base fill paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 996,
      "end_line": 1004,
      "comment": "\r\n     * Sets the base fill paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 35)",
        "(line 1001,col 9)-(line 1003,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesFillPaint()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\r\n     * Returns the flag that controls whether or not the series fill paint list\r\n     * is automatically populated when {@link #lookupSeriesFillPaint(int)} is\r\n     * called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesFillPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesFillPaint(boolean)",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\r\n     * Sets the flag that controls whether or not the series fill paint list is\r\n     * automatically populated when {@link #lookupSeriesFillPaint(int)} is\r\n     * called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesFillPaint()\r\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlinePaint(int, int, boolean)",
      "begin_line": 1052,
      "end_line": 1054,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesOutlinePaint(int)} method.  You can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlinePaint(int)",
      "begin_line": 1065,
      "end_line": 1081,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 65)",
        "(line 1069,col 9)-(line 1075,col 9)",
        "(line 1076,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1079,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 1105,
      "end_line": 1107,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "\r\n     * Sets the paint used to draw the outline for a series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 54)",
        "(line 1121,col 9)-(line 1123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlinePaint()",
      "begin_line": 1133,
      "end_line": 1135,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 1145,
      "end_line": 1148,
      "comment": "\r\n     * Sets the base outline paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 1159,
      "end_line": 1167,
      "comment": "\r\n     * Sets the base outline paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1163,col 9)-(line 1163,col 38)",
        "(line 1164,col 9)-(line 1166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlinePaint()",
      "begin_line": 1180,
      "end_line": 1182,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline paint\r\n     * list is automatically populated when\r\n     * {@link #lookupSeriesOutlinePaint(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlinePaint(boolean)",
      "begin_line": 1195,
      "end_line": 1197,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline paint list\r\n     * is automatically populated when {@link #lookupSeriesOutlinePaint(int)}\r\n     * is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1196,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemStroke(int, int, boolean)",
      "begin_line": 1214,
      "end_line": 1216,
      "comment": "\r\n     * Returns the stroke used to draw data items. The default implementation\r\n     * passes control to the {@link #lookupSeriesStroke(int)} method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesStroke(int)",
      "begin_line": 1227,
      "end_line": 1243,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 48)",
        "(line 1231,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1240,col 9)",
        "(line 1241,col 9)-(line 1241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesStroke(int)",
      "begin_line": 1254,
      "end_line": 1256,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "\r\n     * Sets the stroke used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1268,col 9)-(line 1268,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1281,
      "end_line": 1286,
      "comment": "\r\n     * Sets the stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 50)",
        "(line 1283,col 9)-(line 1285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clearSeriesStrokes(boolean)",
      "begin_line": 1296,
      "end_line": 1301,
      "comment": "\r\n     * Clears the series stroke settings for this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1297,col 9)-(line 1297,col 32)",
        "(line 1298,col 9)-(line 1300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseStroke()",
      "begin_line": 1310,
      "end_line": 1312,
      "comment": "\r\n     * Returns the base stroke.\r\n     *\r\n     * @return The base stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 1322,
      "end_line": 1325,
      "comment": "\r\n     * Sets the base stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1324,col 9)-(line 1324,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 1336,
      "end_line": 1344,
      "comment": "\r\n     * Sets the base stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1340,col 33)",
        "(line 1341,col 9)-(line 1343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesStroke()",
      "begin_line": 1356,
      "end_line": 1358,
      "comment": "\r\n     * Returns the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesStroke(boolean)",
      "begin_line": 1370,
      "end_line": 1372,
      "comment": "\r\n     * Sets the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesStroke()\r\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1371,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlineStroke(int, int, boolean)",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\r\n     * Returns the stroke used to outline data items.  The default\r\n     * implementation passes control to the\r\n     * {@link #lookupSeriesOutlineStroke(int)} method. You can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlineStroke(int)",
      "begin_line": 1403,
      "end_line": 1419,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 55)",
        "(line 1407,col 9)-(line 1413,col 9)",
        "(line 1414,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1417,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 1443,
      "end_line": 1445,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1444,col 9)-(line 1444,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1457,
      "end_line": 1463,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1459,col 9)-(line 1459,col 57)",
        "(line 1460,col 9)-(line 1462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlineStroke()",
      "begin_line": 1472,
      "end_line": 1474,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1473,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 1484,
      "end_line": 1486,
      "comment": "\r\n     * Sets the base outline stroke and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 1498,
      "end_line": 1506,
      "comment": "\r\n     * Sets the base outline stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1499,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1502,col 40)",
        "(line 1503,col 9)-(line 1505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlineStroke()",
      "begin_line": 1519,
      "end_line": 1521,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline stroke\r\n     * list is automatically populated when\r\n     * {@link #lookupSeriesOutlineStroke(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesOutlineStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlineStroke(boolean)",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline stroke list\r\n     * is automatically populated when {@link #lookupSeriesOutlineStroke(int)}\r\n     * is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemShape(int, int, boolean)",
      "begin_line": 1554,
      "end_line": 1556,
      "comment": "\r\n     * Returns a shape used to represent a data item. The default\r\n     * implementation passes control to the {@link #lookupSeriesShape(int)}\r\n     * method.  You can override this method if you require different\r\n     * behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1555,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesShape(int)",
      "begin_line": 1567,
      "end_line": 1583,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1570,col 9)-(line 1570,col 46)",
        "(line 1571,col 9)-(line 1577,col 9)",
        "(line 1578,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesShape(int)",
      "begin_line": 1594,
      "end_line": 1596,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1595,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 1607,
      "end_line": 1609,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 1621,
      "end_line": 1626,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1622,col 9)-(line 1622,col 47)",
        "(line 1623,col 9)-(line 1625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseShape()",
      "begin_line": 1635,
      "end_line": 1637,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 1636,col 9)-(line 1636,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 1647,
      "end_line": 1650,
      "comment": "\r\n     * Sets the base shape and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1649,col 9)-(line 1649,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 1661,
      "end_line": 1669,
      "comment": "\r\n     * Sets the base shape and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1662,col 9)-(line 1664,col 9)",
        "(line 1665,col 9)-(line 1665,col 31)",
        "(line 1666,col 9)-(line 1668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesShape()",
      "begin_line": 1681,
      "end_line": 1683,
      "comment": "\r\n     * Returns the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesShape(boolean)\r\n     ",
      "child_ranges": [
        "(line 1682,col 9)-(line 1682,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesShape(boolean)",
      "begin_line": 1695,
      "end_line": 1697,
      "comment": "\r\n     * Sets the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesShape()\r\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isItemLabelVisible(int, int, boolean)",
      "begin_line": 1713,
      "end_line": 1715,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1714,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1725,
      "end_line": 1731,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 66)",
        "(line 1727,col 9)-(line 1729,col 9)",
        "(line 1730,col 9)-(line 1730,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1745,
      "end_line": 1747,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": [
        "(line 1746,col 9)-(line 1746,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1756,
      "end_line": 1758,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 1757,col 9)-(line 1757,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1767,
      "end_line": 1769,
      "comment": "\r\n     * Sets the visibility of the item labels for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1768,col 9)-(line 1768,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1780,
      "end_line": 1786,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 1782,col 9)-(line 1782,col 63)",
        "(line 1783,col 9)-(line 1785,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1796,
      "end_line": 1798,
      "comment": "\r\n     * Returns the base setting for item label visibility.  A \u003ccode\u003enull\u003c/code\u003e\r\n     * result should be interpreted as equivalent to \u003ccode\u003eBoolean.FALSE\u003c/code\u003e.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1797,col 9)-(line 1797,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1808,
      "end_line": 1810,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1821,
      "end_line": 1826,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1822,col 9)-(line 1822,col 45)",
        "(line 1823,col 9)-(line 1825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(int, int, boolean)",
      "begin_line": 1841,
      "end_line": 1847,
      "comment": "\r\n     * Returns the font for an item label.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1842,col 9)-(line 1842,col 50)",
        "(line 1843,col 9)-(line 1845,col 9)",
        "(line 1846,col 9)-(line 1846,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1858,
      "end_line": 1860,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": [
        "(line 1859,col 9)-(line 1859,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1871,
      "end_line": 1873,
      "comment": "\r\n     * Sets the item label font for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1872,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1886,
      "end_line": 1891,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1887,col 9)-(line 1887,col 49)",
        "(line 1888,col 9)-(line 1890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelFont()",
      "begin_line": 1901,
      "end_line": 1903,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font\r\n     * setting is available).\r\n     *\r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     *\r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1902,col 9)-(line 1902,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1913,
      "end_line": 1918,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1914,col 9)-(line 1916,col 9)",
        "(line 1917,col 9)-(line 1917,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1930,
      "end_line": 1935,
      "comment": "\r\n     * Sets the base item label font and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1931,col 9)-(line 1931,col 38)",
        "(line 1932,col 9)-(line 1934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelPaint(int, int, boolean)",
      "begin_line": 1950,
      "end_line": 1956,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1951,col 9)-(line 1951,col 52)",
        "(line 1952,col 9)-(line 1954,col 9)",
        "(line 1955,col 9)-(line 1955,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1967,
      "end_line": 1969,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 1968,col 9)-(line 1968,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1980,
      "end_line": 1982,
      "comment": "\r\n     * Sets the item label paint for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 1981,col 9)-(line 1981,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1995,
      "end_line": 2001,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 1997,col 9)-(line 1997,col 56)",
        "(line 1998,col 9)-(line 2000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelPaint()",
      "begin_line": 2010,
      "end_line": 2012,
      "comment": "\r\n     * Returns the base item label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2011,col 9)-(line 2011,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 2022,
      "end_line": 2025,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 2024,col 9)-(line 2024,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 2037,
      "end_line": 2045,
      "comment": "\r\n     * Sets the base item label paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners..\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 2038,col 9)-(line 2040,col 9)",
        "(line 2041,col 9)-(line 2041,col 40)",
        "(line 2042,col 9)-(line 2044,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getPositiveItemLabelPosition(int, int, boolean)",
      "begin_line": 2060,
      "end_line": 2063,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getNegativeItemLabelPosition(int, int)\r\n     ",
      "child_ranges": [
        "(line 2062,col 9)-(line 2062,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 2074,
      "end_line": 2086,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2079,col 9)-(line 2080,col 59)",
        "(line 2081,col 9)-(line 2083,col 9)",
        "(line 2084,col 9)-(line 2084,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2097,
      "end_line": 2100,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2099,col 9)-(line 2099,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2113,
      "end_line": 2120,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2116,col 9)-(line 2116,col 65)",
        "(line 2117,col 9)-(line 2119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 2129,
      "end_line": 2131,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2130,col 9)-(line 2130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2140,
      "end_line": 2143,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2142,col 9)-(line 2142,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2154,
      "end_line": 2163,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2156,col 9)-(line 2158,col 9)",
        "(line 2159,col 9)-(line 2159,col 54)",
        "(line 2160,col 9)-(line 2162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getNegativeItemLabelPosition(int, int, boolean)",
      "begin_line": 2182,
      "end_line": 2185,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for\r\n     * individual data items.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPositiveItemLabelPosition(int, int, selected)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2184,col 9)-(line 2184,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 2196,
      "end_line": 2206,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2199,col 9)-(line 2200,col 59)",
        "(line 2201,col 9)-(line 2203,col 9)",
        "(line 2204,col 9)-(line 2204,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2217,
      "end_line": 2220,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2219,col 9)-(line 2219,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2233,
      "end_line": 2240,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2236,col 9)-(line 2236,col 65)",
        "(line 2237,col 9)-(line 2239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 2249,
      "end_line": 2251,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2250,col 9)-(line 2250,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2261,
      "end_line": 2263,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2262,col 9)-(line 2262,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2274,
      "end_line": 2283,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2276,col 9)-(line 2278,col 9)",
        "(line 2279,col 9)-(line 2279,col 54)",
        "(line 2280,col 9)-(line 2282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelAnchorOffset()",
      "begin_line": 2292,
      "end_line": 2294,
      "comment": "\r\n     * Returns the item label anchor offset.\r\n     *\r\n     * @return The offset.\r\n     *\r\n     * @see #setItemLabelAnchorOffset(double)\r\n     ",
      "child_ranges": [
        "(line 2293,col 9)-(line 2293,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setItemLabelAnchorOffset(double)",
      "begin_line": 2303,
      "end_line": 2306,
      "comment": "\r\n     * Sets the item label anchor offset.\r\n     *\r\n     * @param offset  the offset.\r\n     *\r\n     * @see #getItemLabelAnchorOffset()\r\n     ",
      "child_ranges": [
        "(line 2304,col 9)-(line 2304,col 44)",
        "(line 2305,col 9)-(line 2305,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(int, int, boolean)",
      "begin_line": 2320,
      "end_line": 2328,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should have a chart entity created for it.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2321,col 9)-(line 2321,col 52)",
        "(line 2322,col 9)-(line 2327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(int)",
      "begin_line": 2340,
      "end_line": 2342,
      "comment": "\r\n     * Returns the flag that controls whether entities are created for a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesCreateEntities(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 2353,
      "end_line": 2355,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2354,col 9)-(line 2354,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 2368,
      "end_line": 2374,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2370,col 9)-(line 2370,col 59)",
        "(line 2371,col 9)-(line 2373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseCreateEntities()",
      "begin_line": 2383,
      "end_line": 2385,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseCreateEntities(boolean)\r\n     ",
      "child_ranges": [
        "(line 2384,col 9)-(line 2384,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 2396,
      "end_line": 2399,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created\r\n     * for a series, and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param create  the flag.\r\n     *\r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2398,col 9)-(line 2398,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 2411,
      "end_line": 2416,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created and,\r\n     * if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param create  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2412,col 9)-(line 2412,col 41)",
        "(line 2413,col 9)-(line 2415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDefaultEntityRadius()",
      "begin_line": 2426,
      "end_line": 2428,
      "comment": "\r\n     * Returns the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @return A radius.\r\n     *\r\n     * @see #setDefaultEntityRadius(int)\r\n     ",
      "child_ranges": [
        "(line 2427,col 9)-(line 2427,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setDefaultEntityRadius(int)",
      "begin_line": 2438,
      "end_line": 2440,
      "comment": "\r\n     * Sets the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @param radius  the radius.\r\n     *\r\n     * @see #getDefaultEntityRadius()\r\n     ",
      "child_ranges": [
        "(line 2439,col 9)-(line 2439,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendShape(int)",
      "begin_line": 2451,
      "end_line": 2460,
      "comment": "\r\n     * Performs a lookup for the legend shape.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2452,col 9)-(line 2452,col 46)",
        "(line 2453,col 9)-(line 2455,col 9)",
        "(line 2456,col 9)-(line 2458,col 9)",
        "(line 2459,col 9)-(line 2459,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendShape(int)",
      "begin_line": 2474,
      "end_line": 2476,
      "comment": "\r\n     * Returns the legend shape defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendShape(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2475,col 9)-(line 2475,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendShape(int, java.awt.Shape)",
      "begin_line": 2487,
      "end_line": 2490,
      "comment": "\r\n     * Sets the shape used for the legend item for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2488,col 9)-(line 2488,col 53)",
        "(line 2489,col 9)-(line 2489,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendShape()",
      "begin_line": 2499,
      "end_line": 2501,
      "comment": "\r\n     * Returns the default legend shape, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend shape.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2500,col 9)-(line 2500,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendShape(java.awt.Shape)",
      "begin_line": 2511,
      "end_line": 2514,
      "comment": "\r\n     * Sets the default legend shape and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2512,col 9)-(line 2512,col 37)",
        "(line 2513,col 9)-(line 2513,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getTreatLegendShapeAsLine()",
      "begin_line": 2524,
      "end_line": 2526,
      "comment": "\r\n     * Returns the flag that controls whether or not the legend shape is\r\n     * treated as a line when creating legend items.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 2525,col 9)-(line 2525,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setTreatLegendShapeAsLine(boolean)",
      "begin_line": 2536,
      "end_line": 2541,
      "comment": "\r\n     * Sets the flag that controls whether or not the legend shape is\r\n     * treated as a line when creating legend items.\r\n     *\r\n     * @param treatAsLine  the new flag value.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 2537,col 9)-(line 2540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendTextFont(int)",
      "begin_line": 2552,
      "end_line": 2558,
      "comment": "\r\n     * Performs a lookup for the legend text font.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2553,col 9)-(line 2553,col 48)",
        "(line 2554,col 9)-(line 2556,col 9)",
        "(line 2557,col 9)-(line 2557,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendTextFont(int)",
      "begin_line": 2572,
      "end_line": 2574,
      "comment": "\r\n     * Returns the legend text font defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendTextFont(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2573,col 9)-(line 2573,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendTextFont(int, java.awt.Font)",
      "begin_line": 2585,
      "end_line": 2588,
      "comment": "\r\n     * Sets the font used for the legend text for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2586,col 9)-(line 2586,col 46)",
        "(line 2587,col 9)-(line 2587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendTextFont()",
      "begin_line": 2597,
      "end_line": 2599,
      "comment": "\r\n     * Returns the default legend text font, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend text font.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2598,col 9)-(line 2598,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendTextFont(java.awt.Font)",
      "begin_line": 2609,
      "end_line": 2612,
      "comment": "\r\n     * Sets the default legend text font and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2610,col 9)-(line 2610,col 39)",
        "(line 2611,col 9)-(line 2611,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendTextPaint(int)",
      "begin_line": 2623,
      "end_line": 2629,
      "comment": "\r\n     * Performs a lookup for the legend text paint.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2624,col 9)-(line 2624,col 50)",
        "(line 2625,col 9)-(line 2627,col 9)",
        "(line 2628,col 9)-(line 2628,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendTextPaint(int)",
      "begin_line": 2643,
      "end_line": 2645,
      "comment": "\r\n     * Returns the legend text paint defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendTextPaint(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2644,col 9)-(line 2644,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendTextPaint(int, java.awt.Paint)",
      "begin_line": 2656,
      "end_line": 2659,
      "comment": "\r\n     * Sets the paint used for the legend text for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2657,col 9)-(line 2657,col 53)",
        "(line 2658,col 9)-(line 2658,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendTextPaint()",
      "begin_line": 2668,
      "end_line": 2670,
      "comment": "\r\n     * Returns the default legend text paint, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend text paint.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2669,col 9)-(line 2669,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendTextPaint(java.awt.Paint)",
      "begin_line": 2680,
      "end_line": 2683,
      "comment": "\r\n     * Sets the default legend text paint and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2681,col 9)-(line 2681,col 41)",
        "(line 2682,col 9)-(line 2682,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDataBoundsIncludesVisibleSeriesOnly()",
      "begin_line": 2693,
      "end_line": 2695,
      "comment": "\r\n     * Returns the flag that controls whether or not the data bounds reported\r\n     * by this renderer will exclude non-visible series.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2694,col 9)-(line 2694,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setDataBoundsIncludesVisibleSeriesOnly(boolean)",
      "begin_line": 2706,
      "end_line": 2709,
      "comment": "\r\n     * Sets the flag that controls whether or not the data bounds reported\r\n     * by this renderer will exclude non-visible series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visibleOnly  include only visible series.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2707,col 9)-(line 2707,col 63)",
        "(line 2708,col 9)-(line 2708,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ADJ"
      ],
      "begin_line": 2712,
      "end_line": 2712,
      "comment": " The adjacent offset. "
    },
    {
      "type": "field",
      "varNames": [
        "OPP"
      ],
      "begin_line": 2715,
      "end_line": 2715,
      "comment": " The opposite offset. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 2727,
      "end_line": 2834,
      "comment": "\r\n     * Calculates the item label anchor point.\r\n     *\r\n     * @param anchor  the anchor.\r\n     * @param x  the x coordinate.\r\n     * @param y  the y coordinate.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @return The anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2729,col 9)-(line 2729,col 30)",
        "(line 2730,col 9)-(line 2832,col 9)",
        "(line 2833,col 9)-(line 2833,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2843,
      "end_line": 2848,
      "comment": "\r\n     * Registers an object to receive notification of changes to the renderer.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2844,col 9)-(line 2846,col 9)",
        "(line 2847,col 9)-(line 2847,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2858,
      "end_line": 2863,
      "comment": "\r\n     * Deregisters an object so that it no longer receives\r\n     * notification of changes to the renderer.\r\n     *\r\n     * @param listener  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2859,col 9)-(line 2861,col 9)",
        "(line 2862,col 9)-(line 2862,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hasListener(java.util.EventListener)",
      "begin_line": 2874,
      "end_line": 2877,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this\r\n     * method, it exists mainly for use by unit testing code.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 2875,col 9)-(line 2875,col 71)",
        "(line 2876,col 9)-(line 2876,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.fireChangeEvent()",
      "begin_line": 2884,
      "end_line": 2896,
      "comment": "\r\n     * Sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 2895,col 9)-(line 2895,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.notifyListeners(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 2903,
      "end_line": 2910,
      "comment": "\r\n     * Notifies all registered listeners that the renderer has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 2904,col 9)-(line 2904,col 58)",
        "(line 2905,col 9)-(line 2909,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.equals(java.lang.Object)",
      "begin_line": 2919,
      "end_line": 3064,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 2920,col 9)-(line 2922,col 9)",
        "(line 2923,col 9)-(line 2925,col 9)",
        "(line 2926,col 9)-(line 2926,col 55)",
        "(line 2927,col 9)-(line 2930,col 9)",
        "(line 2931,col 9)-(line 2933,col 9)",
        "(line 2934,col 9)-(line 2936,col 9)",
        "(line 2937,col 9)-(line 2939,col 9)",
        "(line 2940,col 9)-(line 2942,col 9)",
        "(line 2943,col 9)-(line 2946,col 9)",
        "(line 2947,col 9)-(line 2949,col 9)",
        "(line 2950,col 9)-(line 2952,col 9)",
        "(line 2953,col 9)-(line 2955,col 9)",
        "(line 2956,col 9)-(line 2958,col 9)",
        "(line 2959,col 9)-(line 2961,col 9)",
        "(line 2962,col 9)-(line 2965,col 9)",
        "(line 2966,col 9)-(line 2969,col 9)",
        "(line 2970,col 9)-(line 2972,col 9)",
        "(line 2973,col 9)-(line 2975,col 9)",
        "(line 2976,col 9)-(line 2979,col 9)",
        "(line 2980,col 9)-(line 2984,col 9)",
        "(line 2985,col 9)-(line 2987,col 9)",
        "(line 2988,col 9)-(line 2990,col 9)",
        "(line 2991,col 9)-(line 2994,col 9)",
        "(line 2995,col 9)-(line 2997,col 9)",
        "(line 2998,col 9)-(line 3001,col 9)",
        "(line 3002,col 9)-(line 3005,col 9)",
        "(line 3006,col 9)-(line 3009,col 9)",
        "(line 3010,col 9)-(line 3013,col 9)",
        "(line 3014,col 9)-(line 3017,col 9)",
        "(line 3018,col 9)-(line 3021,col 9)",
        "(line 3022,col 9)-(line 3025,col 9)",
        "(line 3026,col 9)-(line 3029,col 9)",
        "(line 3030,col 9)-(line 3032,col 9)",
        "(line 3033,col 9)-(line 3036,col 9)",
        "(line 3037,col 9)-(line 3039,col 9)",
        "(line 3040,col 9)-(line 3043,col 9)",
        "(line 3044,col 9)-(line 3047,col 9)",
        "(line 3048,col 9)-(line 3050,col 9)",
        "(line 3051,col 9)-(line 3054,col 9)",
        "(line 3055,col 9)-(line 3058,col 9)",
        "(line 3059,col 9)-(line 3062,col 9)",
        "(line 3063,col 9)-(line 3063,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hashCode()",
      "begin_line": 3071,
      "end_line": 3103,
      "comment": "\r\n     * Returns a hashcode for the renderer.\r\n     *\r\n     * @return The hashcode.\r\n     ",
      "child_ranges": [
        "(line 3072,col 9)-(line 3072,col 25)",
        "(line 3073,col 9)-(line 3073,col 72)",
        "(line 3074,col 9)-(line 3074,col 72)",
        "(line 3075,col 9)-(line 3075,col 80)",
        "(line 3076,col 9)-(line 3076,col 80)",
        "(line 3077,col 9)-(line 3077,col 64)",
        "(line 3078,col 9)-(line 3078,col 64)",
        "(line 3079,col 9)-(line 3079,col 68)",
        "(line 3080,col 9)-(line 3080,col 68)",
        "(line 3081,col 9)-(line 3081,col 71)",
        "(line 3082,col 9)-(line 3082,col 71)",
        "(line 3083,col 9)-(line 3083,col 65)",
        "(line 3084,col 9)-(line 3084,col 65)",
        "(line 3085,col 9)-(line 3085,col 72)",
        "(line 3086,col 9)-(line 3086,col 72)",
        "(line 3089,col 9)-(line 3089,col 76)",
        "(line 3090,col 9)-(line 3090,col 76)",
        "(line 3102,col 9)-(line 3102,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clone()",
      "begin_line": 3113,
      "end_line": 3213,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the renderer\r\n     *         does not support cloning.\r\n     ",
      "child_ranges": [
        "(line 3114,col 9)-(line 3114,col 66)",
        "(line 3116,col 9)-(line 3119,col 9)",
        "(line 3121,col 9)-(line 3124,col 9)",
        "(line 3127,col 9)-(line 3129,col 9)",
        "(line 3132,col 9)-(line 3134,col 9)",
        "(line 3136,col 9)-(line 3138,col 9)",
        "(line 3142,col 9)-(line 3144,col 9)",
        "(line 3148,col 9)-(line 3151,col 9)",
        "(line 3154,col 9)-(line 3156,col 9)",
        "(line 3157,col 9)-(line 3159,col 9)",
        "(line 3162,col 9)-(line 3165,col 9)",
        "(line 3169,col 9)-(line 3172,col 9)",
        "(line 3176,col 9)-(line 3179,col 9)",
        "(line 3183,col 9)-(line 3186,col 9)",
        "(line 3190,col 9)-(line 3193,col 9)",
        "(line 3196,col 9)-(line 3199,col 9)",
        "(line 3201,col 9)-(line 3203,col 9)",
        "(line 3204,col 9)-(line 3206,col 9)",
        "(line 3207,col 9)-(line 3209,col 9)",
        "(line 3210,col 9)-(line 3210,col 53)",
        "(line 3211,col 9)-(line 3211,col 27)",
        "(line 3212,col 9)-(line 3212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 3222,
      "end_line": 3233,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 3223,col 9)-(line 3223,col 36)",
        "(line 3224,col 9)-(line 3224,col 59)",
        "(line 3225,col 9)-(line 3225,col 63)",
        "(line 3226,col 9)-(line 3226,col 66)",
        "(line 3227,col 9)-(line 3227,col 61)",
        "(line 3228,col 9)-(line 3228,col 68)",
        "(line 3229,col 9)-(line 3229,col 59)",
        "(line 3230,col 9)-(line 3230,col 68)",
        "(line 3231,col 9)-(line 3231,col 65)",
        "(line 3232,col 9)-(line 3232,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 3243,
      "end_line": 3261,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3246,col 9)-(line 3246,col 35)",
        "(line 3247,col 9)-(line 3247,col 59)",
        "(line 3248,col 9)-(line 3248,col 63)",
        "(line 3249,col 9)-(line 3249,col 66)",
        "(line 3250,col 9)-(line 3250,col 61)",
        "(line 3251,col 9)-(line 3251,col 68)",
        "(line 3252,col 9)-(line 3252,col 59)",
        "(line 3253,col 9)-(line 3253,col 68)",
        "(line 3254,col 9)-(line 3254,col 65)",
        "(line 3255,col 9)-(line 3255,col 69)",
        "(line 3259,col 9)-(line 3259,col 52)"
      ]
    }
  ]
}