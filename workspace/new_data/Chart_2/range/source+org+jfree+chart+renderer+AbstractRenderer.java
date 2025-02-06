{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/AbstractRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRenderer",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 144,
      "end_line": 3311,
      "comment": "\r\n * Base class providing common services for renderers.  Most methods that update\r\n * attributes of the renderer will fire a {@link RendererChangeEvent}, which\r\n * normally means the plot that owns the renderer will receive notification that\r\n * the renderer has been changed (the plot will, in turn, notify the chart).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Zero represented as a \u003ccode\u003eDouble\u003c/code\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The default outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STROKE"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The default stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SHAPE"
      ],
      "begin_line": 165,
      "end_line": 166,
      "comment": " The default shape. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 169,
      "end_line": 170,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_PAINT"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The default value label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleList"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " A list of flags that controls whether or not each series is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisible"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The default visibility for each series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleInLegendList"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\r\n     * A list of flags that controls whether or not each series is visible in\r\n     * the legend.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisibleInLegend"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The default visibility for each series in the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "paintList"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesPaint"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": "\r\n     * A flag that controls whether or not the paintList is auto-populated\r\n     * in the {@link #lookupSeriesPaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "basePaint"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " The base paint. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintList"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " The fill paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesFillPaint"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\r\n     * A flag that controls whether or not the fillPaintList is auto-populated\r\n     * in the {@link #lookupSeriesFillPaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseFillPaint"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The base fill paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintList"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " The outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlinePaint"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": "\r\n     * A flag that controls whether or not the outlinePaintList is\r\n     * auto-populated in the {@link #lookupSeriesOutlinePaint(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlinePaint"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " The base outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "strokeList"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesStroke"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": "\r\n     * A flag that controls whether or not the strokeList is auto-populated\r\n     * in the {@link #lookupSeriesStroke(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseStroke"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " The base stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeList"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " The outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlineStroke"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The base outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlineStroke"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": "\r\n     * A flag that controls whether or not the outlineStrokeList is\r\n     * auto-populated in the {@link #lookupSeriesOutlineStroke(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeList"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " A shape list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesShape"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\r\n     * A flag that controls whether or not the shapeList is auto-populated\r\n     * in the {@link #lookupSeriesShape(int)} method.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShape"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The base shape. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelsVisibleList"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " Visibility of the item labels PER series. "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelsVisible"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " The base item labels visible. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelFontList"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " The item label font list (one font per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelFont"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The base item label font. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelPaintList"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The item label paint list (one paint per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelPaint"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " The base item label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveItemLabelPositionList"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " The positive item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "basePositiveItemLabelPosition"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " The fallback positive item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "negativeItemLabelPositionList"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " The negative item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseNegativeItemLabelPosition"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " The fallback negative item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelAnchorOffset"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " The item label anchor offset. "
    },
    {
      "type": "field",
      "varNames": [
        "createEntitiesList"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": "\r\n     * Flags that control whether or not entities are generated for each\r\n     * series.  This will be overridden by \u0027createEntities\u0027.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseCreateEntities"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": "\r\n     * The default flag that controls whether or not entities are generated.\r\n     * This flag is used when both the above flags return null.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendShapeList"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": "\r\n     * The per-series legend shape settings.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendShape"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": "\r\n     * The base shape for legend items.  If this is \u003ccode\u003enull\u003c/code\u003e, the\r\n     * series shape will be used.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "treatLegendShapeAsLine"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\r\n     * A special flag that, if true, will cause the getLegendItem() method\r\n     * to configure the legend shape as if it were a line.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendTextFont"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": "\r\n     * The per-series legend text font.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendTextFont"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": "\r\n     * The base legend font.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "legendTextPaint"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": "\r\n     * The per series legend text paint settings.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseLegendTextPaint"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": "\r\n     * The default paint for the legend text items (if this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, the {@link LegendTitle} class will determine the\r\n     * text paint to use.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataBoundsIncludesVisibleSeriesOnly"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": "\r\n     * A flag that controls whether or not the renderer will include the\r\n     * non-visible series when calculating the data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultEntityRadius"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " The default radius for the entity \u0027hotspot\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "selectedItemAttributes"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": "\r\n     * Attributes for selected items.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.AbstractRenderer()",
      "begin_line": 396,
      "end_line": 465,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 51)",
        "(line 399,col 9)-(line 399,col 38)",
        "(line 401,col 9)-(line 401,col 59)",
        "(line 402,col 9)-(line 402,col 46)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 405,col 9)-(line 405,col 39)",
        "(line 406,col 9)-(line 406,col 44)",
        "(line 408,col 9)-(line 408,col 45)",
        "(line 409,col 9)-(line 409,col 41)",
        "(line 410,col 9)-(line 410,col 49)",
        "(line 412,col 9)-(line 412,col 48)",
        "(line 413,col 9)-(line 413,col 54)",
        "(line 414,col 9)-(line 414,col 52)",
        "(line 416,col 9)-(line 416,col 43)",
        "(line 417,col 9)-(line 417,col 41)",
        "(line 418,col 9)-(line 418,col 45)",
        "(line 420,col 9)-(line 420,col 50)",
        "(line 421,col 9)-(line 421,col 56)",
        "(line 422,col 9)-(line 422,col 53)",
        "(line 424,col 9)-(line 424,col 41)",
        "(line 425,col 9)-(line 425,col 39)",
        "(line 426,col 9)-(line 426,col 44)",
        "(line 428,col 9)-(line 428,col 55)",
        "(line 429,col 9)-(line 429,col 43)",
        "(line 431,col 9)-(line 431,col 50)",
        "(line 432,col 9)-(line 432,col 68)",
        "(line 434,col 9)-(line 434,col 50)",
        "(line 435,col 9)-(line 435,col 46)",
        "(line 437,col 9)-(line 437,col 62)",
        "(line 438,col 9)-(line 439,col 69)",
        "(line 441,col 9)-(line 441,col 62)",
        "(line 442,col 9)-(line 443,col 65)",
        "(line 445,col 9)-(line 445,col 52)",
        "(line 446,col 9)-(line 446,col 39)",
        "(line 448,col 9)-(line 448,col 37)",
        "(line 450,col 9)-(line 450,col 47)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 453,col 9)-(line 453,col 44)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 456,col 9)-(line 456,col 39)",
        "(line 458,col 9)-(line 458,col 47)",
        "(line 459,col 9)-(line 459,col 40)",
        "(line 461,col 9)-(line 461,col 52)",
        "(line 463,col 9)-(line 463,col 61)",
        "(line 464,col 9)-(line 464,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDrawingSupplier()",
      "begin_line": 472,
      "end_line": 472,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSelectedItemAttributes()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\r\n     * Returns the set of attributes that will override the standard\r\n     * attributes for selected items.\r\n     *\r\n     * @return The attributes (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemVisible(int, int)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should be drawn (this is typically used to hide an entire series).\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(int)",
      "begin_line": 509,
      "end_line": 516,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series\r\n     * should be drawn.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 48)",
        "(line 511,col 9)-(line 511,col 62)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisible(int)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 555,
      "end_line": 565,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if\r\n     * requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 59)",
        "(line 557,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisible()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 586,
      "end_line": 589,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 600,
      "end_line": 610,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 41)",
        "(line 602,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 622,
      "end_line": 629,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 56)",
        "(line 624,col 9)-(line 624,col 70)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the\r\n     * legend.  This method returns only the \"per series\" settings - to\r\n     * do a lookup that falls back to the default, you need to use the\r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 671,
      "end_line": 677,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 67)",
        "(line 674,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 698,
      "end_line": 701,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 712,
      "end_line": 717,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 49)",
        "(line 714,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemPaint(int, int, boolean)",
      "begin_line": 735,
      "end_line": 744,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesPaint(int)}  method. You can override this method\r\n     * if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 28)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesPaint(int)",
      "begin_line": 755,
      "end_line": 771,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 51)",
        "(line 759,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPaint(int)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 809,
      "end_line": 814,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 47)",
        "(line 811,col 9)-(line 813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clearSeriesPaints(boolean)",
      "begin_line": 824,
      "end_line": 829,
      "comment": "\r\n     * Clears the series paint settings for this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 31)",
        "(line 826,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePaint()",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 850,
      "end_line": 853,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 864,
      "end_line": 869,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 31)",
        "(line 866,col 9)-(line 868,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesPaint()",
      "begin_line": 881,
      "end_line": 883,
      "comment": "\r\n     * Returns the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesPaint(boolean)",
      "begin_line": 895,
      "end_line": 897,
      "comment": "\r\n     * Sets the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemFillPaint(int, int, boolean)",
      "begin_line": 915,
      "end_line": 924,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesFillPaint(int)} method - you can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 28)",
        "(line 917,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesFillPaint(int)",
      "begin_line": 935,
      "end_line": 951,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 59)",
        "(line 939,col 9)-(line 945,col 9)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesFillPaint(int)",
      "begin_line": 962,
      "end_line": 964,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 975,
      "end_line": 977,
      "comment": "\r\n     * Sets the paint used for a series fill and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 989,
      "end_line": 994,
      "comment": "\r\n     * Sets the paint used to fill a series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 51)",
        "(line 991,col 9)-(line 993,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseFillPaint()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseFillPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 1015,
      "end_line": 1018,
      "comment": "\r\n     * Sets the base fill paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 1029,
      "end_line": 1037,
      "comment": "\r\n     * Sets the base fill paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 35)",
        "(line 1034,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesFillPaint()",
      "begin_line": 1050,
      "end_line": 1052,
      "comment": "\r\n     * Returns the flag that controls whether or not the series fill paint list\r\n     * is automatically populated when {@link #lookupSeriesFillPaint(int)} is\r\n     * called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesFillPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1051,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesFillPaint(boolean)",
      "begin_line": 1065,
      "end_line": 1067,
      "comment": "\r\n     * Sets the flag that controls whether or not the series fill paint list is\r\n     * automatically populated when {@link #lookupSeriesFillPaint(int)} is\r\n     * called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesFillPaint()\r\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlinePaint(int, int, boolean)",
      "begin_line": 1085,
      "end_line": 1095,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.  The\r\n     * default implementation passes control to the\r\n     * {@link #lookupSeriesOutlinePaint(int)} method.  You can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 28)",
        "(line 1087,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1094,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlinePaint(int)",
      "begin_line": 1106,
      "end_line": 1122,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 65)",
        "(line 1110,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1120,col 9)-(line 1120,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 1133,
      "end_line": 1135,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 1146,
      "end_line": 1148,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 1160,
      "end_line": 1165,
      "comment": "\r\n     * Sets the paint used to draw the outline for a series and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 54)",
        "(line 1162,col 9)-(line 1164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlinePaint()",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": "\r\n     * Sets the base outline paint and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 1200,
      "end_line": 1208,
      "comment": "\r\n     * Sets the base outline paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 38)",
        "(line 1205,col 9)-(line 1207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlinePaint()",
      "begin_line": 1221,
      "end_line": 1223,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline paint\r\n     * list is automatically populated when\r\n     * {@link #lookupSeriesOutlinePaint(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1222,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlinePaint(boolean)",
      "begin_line": 1236,
      "end_line": 1238,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline paint list\r\n     * is automatically populated when {@link #lookupSeriesOutlinePaint(int)}\r\n     * is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemStroke(int, int, boolean)",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "\r\n     * Returns the stroke used to draw data items. The default implementation\r\n     * passes control to the {@link #lookupSeriesStroke(int)} method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesStroke(int)",
      "begin_line": 1268,
      "end_line": 1284,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 48)",
        "(line 1272,col 9)-(line 1278,col 9)",
        "(line 1279,col 9)-(line 1281,col 9)",
        "(line 1282,col 9)-(line 1282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesStroke(int)",
      "begin_line": 1295,
      "end_line": 1297,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 1308,
      "end_line": 1310,
      "comment": "\r\n     * Sets the stroke used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1309,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1322,
      "end_line": 1327,
      "comment": "\r\n     * Sets the stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 50)",
        "(line 1324,col 9)-(line 1326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clearSeriesStrokes(boolean)",
      "begin_line": 1337,
      "end_line": 1342,
      "comment": "\r\n     * Clears the series stroke settings for this renderer and, if requested,\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 32)",
        "(line 1339,col 9)-(line 1341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseStroke()",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\r\n     * Returns the base stroke.\r\n     *\r\n     * @return The base stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 1363,
      "end_line": 1366,
      "comment": "\r\n     * Sets the base stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 1377,
      "end_line": 1385,
      "comment": "\r\n     * Sets the base stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1381,col 33)",
        "(line 1382,col 9)-(line 1384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesStroke()",
      "begin_line": 1397,
      "end_line": 1399,
      "comment": "\r\n     * Returns the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1398,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesStroke(boolean)",
      "begin_line": 1411,
      "end_line": 1413,
      "comment": "\r\n     * Sets the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesStroke()\r\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlineStroke(int, int, boolean)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "\r\n     * Returns the stroke used to outline data items.  The default\r\n     * implementation passes control to the\r\n     * {@link #lookupSeriesOutlineStroke(int)} method. You can override this\r\n     * method if you require different behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlineStroke(int)",
      "begin_line": 1444,
      "end_line": 1460,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1447,col 9)-(line 1447,col 55)",
        "(line 1448,col 9)-(line 1454,col 9)",
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1458,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 1471,
      "end_line": 1473,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1472,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 1484,
      "end_line": 1486,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1498,
      "end_line": 1504,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1500,col 9)-(line 1500,col 57)",
        "(line 1501,col 9)-(line 1503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlineStroke()",
      "begin_line": 1513,
      "end_line": 1515,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 1525,
      "end_line": 1527,
      "comment": "\r\n     * Sets the base outline stroke and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1526,col 9)-(line 1526,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 1539,
      "end_line": 1547,
      "comment": "\r\n     * Sets the base outline stroke and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1543,col 40)",
        "(line 1544,col 9)-(line 1546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlineStroke()",
      "begin_line": 1560,
      "end_line": 1562,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline stroke\r\n     * list is automatically populated when\r\n     * {@link #lookupSeriesOutlineStroke(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesOutlineStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1561,col 9)-(line 1561,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlineStroke(boolean)",
      "begin_line": 1575,
      "end_line": 1577,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline stroke list\r\n     * is automatically populated when {@link #lookupSeriesOutlineStroke(int)}\r\n     * is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1576,col 9)-(line 1576,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemShape(int, int, boolean)",
      "begin_line": 1595,
      "end_line": 1604,
      "comment": "\r\n     * Returns a shape used to represent a data item. The default\r\n     * implementation passes control to the {@link #lookupSeriesShape(int)}\r\n     * method.  You can override this method if you require different\r\n     * behaviour.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1596,col 28)",
        "(line 1597,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1602,col 9)",
        "(line 1603,col 9)-(line 1603,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesShape(int)",
      "begin_line": 1615,
      "end_line": 1631,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 46)",
        "(line 1619,col 9)-(line 1625,col 9)",
        "(line 1626,col 9)-(line 1628,col 9)",
        "(line 1629,col 9)-(line 1629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesShape(int)",
      "begin_line": 1642,
      "end_line": 1644,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": [
        "(line 1643,col 9)-(line 1643,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 1655,
      "end_line": 1657,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 1669,
      "end_line": 1674,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1670,col 9)-(line 1670,col 47)",
        "(line 1671,col 9)-(line 1673,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseShape()",
      "begin_line": 1683,
      "end_line": 1685,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 1695,
      "end_line": 1698,
      "comment": "\r\n     * Sets the base shape and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 1709,
      "end_line": 1717,
      "comment": "\r\n     * Sets the base shape and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1710,col 9)-(line 1712,col 9)",
        "(line 1713,col 9)-(line 1713,col 31)",
        "(line 1714,col 9)-(line 1716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesShape()",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "\r\n     * Returns the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setAutoPopulateSeriesShape(boolean)\r\n     ",
      "child_ranges": [
        "(line 1730,col 9)-(line 1730,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesShape(boolean)",
      "begin_line": 1743,
      "end_line": 1745,
      "comment": "\r\n     * Sets the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     *\r\n     * @param auto  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getAutoPopulateSeriesShape()\r\n     ",
      "child_ranges": [
        "(line 1744,col 9)-(line 1744,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isItemLabelVisible(int, int, boolean)",
      "begin_line": 1761,
      "end_line": 1763,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1762,col 9)-(line 1762,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1773,
      "end_line": 1779,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1774,col 9)-(line 1774,col 66)",
        "(line 1775,col 9)-(line 1777,col 9)",
        "(line 1778,col 9)-(line 1778,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1793,
      "end_line": 1795,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1794,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1804,
      "end_line": 1806,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 1805,col 9)-(line 1805,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1815,
      "end_line": 1817,
      "comment": "\r\n     * Sets the visibility of the item labels for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1828,
      "end_line": 1834,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 1830,col 9)-(line 1830,col 63)",
        "(line 1831,col 9)-(line 1833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1844,
      "end_line": 1846,
      "comment": "\r\n     * Returns the base setting for item label visibility.  A \u003ccode\u003enull\u003c/code\u003e\r\n     * result should be interpreted as equivalent to \u003ccode\u003eBoolean.FALSE\u003c/code\u003e.\r\n     *\r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1845,col 9)-(line 1845,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1856,
      "end_line": 1858,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1857,col 9)-(line 1857,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1869,
      "end_line": 1874,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1870,col 45)",
        "(line 1871,col 9)-(line 1873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(int, int, boolean)",
      "begin_line": 1889,
      "end_line": 1895,
      "comment": "\r\n     * Returns the font for an item label.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1890,col 9)-(line 1890,col 53)",
        "(line 1891,col 9)-(line 1893,col 9)",
        "(line 1894,col 9)-(line 1894,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1906,
      "end_line": 1908,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": [
        "(line 1907,col 9)-(line 1907,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1919,
      "end_line": 1921,
      "comment": "\r\n     * Sets the item label font for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1920,col 9)-(line 1920,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1934,
      "end_line": 1939,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1935,col 49)",
        "(line 1936,col 9)-(line 1938,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelFont()",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font\r\n     * setting is available).\r\n     *\r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     *\r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1950,col 9)-(line 1950,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1961,
      "end_line": 1966,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1962,col 9)-(line 1964,col 9)",
        "(line 1965,col 9)-(line 1965,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1978,
      "end_line": 1983,
      "comment": "\r\n     * Sets the base item label font and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1979,col 9)-(line 1979,col 38)",
        "(line 1980,col 9)-(line 1982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelPaint(int, int, boolean)",
      "begin_line": 1998,
      "end_line": 2004,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param item  the item index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 1999,col 9)-(line 1999,col 55)",
        "(line 2000,col 9)-(line 2002,col 9)",
        "(line 2003,col 9)-(line 2003,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 2015,
      "end_line": 2017,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 2016,col 9)-(line 2016,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 2028,
      "end_line": 2030,
      "comment": "\r\n     * Sets the item label paint for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 2029,col 9)-(line 2029,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 2043,
      "end_line": 2049,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 2045,col 9)-(line 2045,col 56)",
        "(line 2046,col 9)-(line 2048,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelPaint()",
      "begin_line": 2058,
      "end_line": 2060,
      "comment": "\r\n     * Returns the base item label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 2059,col 9)-(line 2059,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 2070,
      "end_line": 2073,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 2072,col 9)-(line 2072,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 2085,
      "end_line": 2093,
      "comment": "\r\n     * Sets the base item label paint and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners..\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 2086,col 9)-(line 2088,col 9)",
        "(line 2089,col 9)-(line 2089,col 40)",
        "(line 2090,col 9)-(line 2092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getPositiveItemLabelPosition(int, int, boolean)",
      "begin_line": 2108,
      "end_line": 2111,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getNegativeItemLabelPosition(int, int)\r\n     ",
      "child_ranges": [
        "(line 2110,col 9)-(line 2110,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 2122,
      "end_line": 2134,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2127,col 9)-(line 2128,col 59)",
        "(line 2129,col 9)-(line 2131,col 9)",
        "(line 2132,col 9)-(line 2132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2145,
      "end_line": 2148,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2147,col 9)-(line 2147,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2161,
      "end_line": 2168,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2164,col 9)-(line 2164,col 65)",
        "(line 2165,col 9)-(line 2167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 2177,
      "end_line": 2179,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2178,col 9)-(line 2178,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2188,
      "end_line": 2191,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2190,col 9)-(line 2190,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2202,
      "end_line": 2211,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2204,col 9)-(line 2206,col 9)",
        "(line 2207,col 9)-(line 2207,col 54)",
        "(line 2208,col 9)-(line 2210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getNegativeItemLabelPosition(int, int, boolean)",
      "begin_line": 2230,
      "end_line": 2233,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be\r\n     * overridden to provide customisation of the item label position for\r\n     * individual data items.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPositiveItemLabelPosition(int, int, selected)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2232,col 9)-(line 2232,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 2244,
      "end_line": 2254,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2247,col 9)-(line 2248,col 59)",
        "(line 2249,col 9)-(line 2251,col 9)",
        "(line 2252,col 9)-(line 2252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2265,
      "end_line": 2268,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2267,col 9)-(line 2267,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2281,
      "end_line": 2288,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2284,col 9)-(line 2284,col 65)",
        "(line 2285,col 9)-(line 2287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 2297,
      "end_line": 2299,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2298,col 9)-(line 2298,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2309,
      "end_line": 2311,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2310,col 9)-(line 2310,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2322,
      "end_line": 2331,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     *\r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2324,col 9)-(line 2326,col 9)",
        "(line 2327,col 9)-(line 2327,col 54)",
        "(line 2328,col 9)-(line 2330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelAnchorOffset()",
      "begin_line": 2340,
      "end_line": 2342,
      "comment": "\r\n     * Returns the item label anchor offset.\r\n     *\r\n     * @return The offset.\r\n     *\r\n     * @see #setItemLabelAnchorOffset(double)\r\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setItemLabelAnchorOffset(double)",
      "begin_line": 2351,
      "end_line": 2354,
      "comment": "\r\n     * Sets the item label anchor offset.\r\n     *\r\n     * @param offset  the offset.\r\n     *\r\n     * @see #getItemLabelAnchorOffset()\r\n     ",
      "child_ranges": [
        "(line 2352,col 9)-(line 2352,col 44)",
        "(line 2353,col 9)-(line 2353,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(int, int, boolean)",
      "begin_line": 2368,
      "end_line": 2376,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item\r\n     * should have a chart entity created for it.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 2369,col 9)-(line 2369,col 52)",
        "(line 2370,col 9)-(line 2375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(int)",
      "begin_line": 2388,
      "end_line": 2390,
      "comment": "\r\n     * Returns the flag that controls whether entities are created for a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesCreateEntities(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 2389,col 9)-(line 2389,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 2401,
      "end_line": 2403,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2402,col 9)-(line 2402,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 2416,
      "end_line": 2422,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2418,col 9)-(line 2418,col 59)",
        "(line 2419,col 9)-(line 2421,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseCreateEntities()",
      "begin_line": 2431,
      "end_line": 2433,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     *\r\n     * @see #setBaseCreateEntities(boolean)\r\n     ",
      "child_ranges": [
        "(line 2432,col 9)-(line 2432,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 2444,
      "end_line": 2447,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created\r\n     * for a series, and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param create  the flag.\r\n     *\r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2446,col 9)-(line 2446,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 2459,
      "end_line": 2464,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created and,\r\n     * if requested, sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param create  the visibility.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2460,col 9)-(line 2460,col 41)",
        "(line 2461,col 9)-(line 2463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDefaultEntityRadius()",
      "begin_line": 2474,
      "end_line": 2476,
      "comment": "\r\n     * Returns the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @return A radius.\r\n     *\r\n     * @see #setDefaultEntityRadius(int)\r\n     ",
      "child_ranges": [
        "(line 2475,col 9)-(line 2475,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setDefaultEntityRadius(int)",
      "begin_line": 2486,
      "end_line": 2488,
      "comment": "\r\n     * Sets the radius of the circle used for the default entity area\r\n     * when no area is specified.\r\n     *\r\n     * @param radius  the radius.\r\n     *\r\n     * @see #getDefaultEntityRadius()\r\n     ",
      "child_ranges": [
        "(line 2487,col 9)-(line 2487,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendShape(int)",
      "begin_line": 2499,
      "end_line": 2508,
      "comment": "\r\n     * Performs a lookup for the legend shape.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2500,col 9)-(line 2500,col 46)",
        "(line 2501,col 9)-(line 2503,col 9)",
        "(line 2504,col 9)-(line 2506,col 9)",
        "(line 2507,col 9)-(line 2507,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendShape(int)",
      "begin_line": 2522,
      "end_line": 2524,
      "comment": "\r\n     * Returns the legend shape defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendShape(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2523,col 9)-(line 2523,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendShape(int, java.awt.Shape)",
      "begin_line": 2535,
      "end_line": 2538,
      "comment": "\r\n     * Sets the shape used for the legend item for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2536,col 9)-(line 2536,col 53)",
        "(line 2537,col 9)-(line 2537,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendShape()",
      "begin_line": 2547,
      "end_line": 2549,
      "comment": "\r\n     * Returns the default legend shape, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend shape.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2548,col 9)-(line 2548,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendShape(java.awt.Shape)",
      "begin_line": 2559,
      "end_line": 2562,
      "comment": "\r\n     * Sets the default legend shape and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2560,col 9)-(line 2560,col 37)",
        "(line 2561,col 9)-(line 2561,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getTreatLegendShapeAsLine()",
      "begin_line": 2572,
      "end_line": 2574,
      "comment": "\r\n     * Returns the flag that controls whether or not the legend shape is\r\n     * treated as a line when creating legend items.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 2573,col 9)-(line 2573,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setTreatLegendShapeAsLine(boolean)",
      "begin_line": 2584,
      "end_line": 2589,
      "comment": "\r\n     * Sets the flag that controls whether or not the legend shape is\r\n     * treated as a line when creating legend items.\r\n     *\r\n     * @param treatAsLine  the new flag value.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 2585,col 9)-(line 2588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendTextFont(int)",
      "begin_line": 2600,
      "end_line": 2606,
      "comment": "\r\n     * Performs a lookup for the legend text font.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2601,col 9)-(line 2601,col 48)",
        "(line 2602,col 9)-(line 2604,col 9)",
        "(line 2605,col 9)-(line 2605,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendTextFont(int)",
      "begin_line": 2620,
      "end_line": 2622,
      "comment": "\r\n     * Returns the legend text font defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendTextFont(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2621,col 9)-(line 2621,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendTextFont(int, java.awt.Font)",
      "begin_line": 2633,
      "end_line": 2636,
      "comment": "\r\n     * Sets the font used for the legend text for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2634,col 9)-(line 2634,col 46)",
        "(line 2635,col 9)-(line 2635,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendTextFont()",
      "begin_line": 2645,
      "end_line": 2647,
      "comment": "\r\n     * Returns the default legend text font, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend text font.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2646,col 9)-(line 2646,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendTextFont(java.awt.Font)",
      "begin_line": 2657,
      "end_line": 2660,
      "comment": "\r\n     * Sets the default legend text font and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2658,col 9)-(line 2658,col 39)",
        "(line 2659,col 9)-(line 2659,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupLegendTextPaint(int)",
      "begin_line": 2671,
      "end_line": 2677,
      "comment": "\r\n     * Performs a lookup for the legend text paint.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2672,col 9)-(line 2672,col 50)",
        "(line 2673,col 9)-(line 2675,col 9)",
        "(line 2676,col 9)-(line 2676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getLegendTextPaint(int)",
      "begin_line": 2691,
      "end_line": 2693,
      "comment": "\r\n     * Returns the legend text paint defined for the specified series (possibly\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #lookupLegendTextPaint(int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2692,col 9)-(line 2692,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setLegendTextPaint(int, java.awt.Paint)",
      "begin_line": 2704,
      "end_line": 2707,
      "comment": "\r\n     * Sets the paint used for the legend text for the specified series, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2705,col 9)-(line 2705,col 53)",
        "(line 2706,col 9)-(line 2706,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseLegendTextPaint()",
      "begin_line": 2716,
      "end_line": 2718,
      "comment": "\r\n     * Returns the default legend text paint, which may be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The default legend text paint.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2717,col 9)-(line 2717,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseLegendTextPaint(java.awt.Paint)",
      "begin_line": 2728,
      "end_line": 2731,
      "comment": "\r\n     * Sets the default legend text paint and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 2729,col 9)-(line 2729,col 41)",
        "(line 2730,col 9)-(line 2730,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDataBoundsIncludesVisibleSeriesOnly()",
      "begin_line": 2741,
      "end_line": 2743,
      "comment": "\r\n     * Returns the flag that controls whether or not the data bounds reported\r\n     * by this renderer will exclude non-visible series.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2742,col 9)-(line 2742,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setDataBoundsIncludesVisibleSeriesOnly(boolean)",
      "begin_line": 2754,
      "end_line": 2757,
      "comment": "\r\n     * Sets the flag that controls whether or not the data bounds reported\r\n     * by this renderer will exclude non-visible series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visibleOnly  include only visible series.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 2755,col 9)-(line 2755,col 63)",
        "(line 2756,col 9)-(line 2756,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ADJ"
      ],
      "begin_line": 2760,
      "end_line": 2760,
      "comment": " The adjacent offset. "
    },
    {
      "type": "field",
      "varNames": [
        "OPP"
      ],
      "begin_line": 2763,
      "end_line": 2763,
      "comment": " The opposite offset. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 2775,
      "end_line": 2882,
      "comment": "\r\n     * Calculates the item label anchor point.\r\n     *\r\n     * @param anchor  the anchor.\r\n     * @param x  the x coordinate.\r\n     * @param y  the y coordinate.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @return The anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2777,col 9)-(line 2777,col 30)",
        "(line 2778,col 9)-(line 2880,col 9)",
        "(line 2881,col 9)-(line 2881,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2891,
      "end_line": 2896,
      "comment": "\r\n     * Registers an object to receive notification of changes to the renderer.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2892,col 9)-(line 2894,col 9)",
        "(line 2895,col 9)-(line 2895,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2906,
      "end_line": 2911,
      "comment": "\r\n     * Deregisters an object so that it no longer receives\r\n     * notification of changes to the renderer.\r\n     *\r\n     * @param listener  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2907,col 9)-(line 2909,col 9)",
        "(line 2910,col 9)-(line 2910,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hasListener(java.util.EventListener)",
      "begin_line": 2922,
      "end_line": 2925,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this\r\n     * method, it exists mainly for use by unit testing code.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 2923,col 9)-(line 2923,col 71)",
        "(line 2924,col 9)-(line 2924,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.fireChangeEvent()",
      "begin_line": 2932,
      "end_line": 2944,
      "comment": "\r\n     * Sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 2943,col 9)-(line 2943,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.notifyListeners(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 2951,
      "end_line": 2958,
      "comment": "\r\n     * Notifies all registered listeners that the renderer has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 2952,col 9)-(line 2952,col 58)",
        "(line 2953,col 9)-(line 2957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.equals(java.lang.Object)",
      "begin_line": 2967,
      "end_line": 3112,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 2968,col 9)-(line 2970,col 9)",
        "(line 2971,col 9)-(line 2973,col 9)",
        "(line 2974,col 9)-(line 2974,col 55)",
        "(line 2975,col 9)-(line 2978,col 9)",
        "(line 2979,col 9)-(line 2981,col 9)",
        "(line 2982,col 9)-(line 2984,col 9)",
        "(line 2985,col 9)-(line 2987,col 9)",
        "(line 2988,col 9)-(line 2990,col 9)",
        "(line 2991,col 9)-(line 2994,col 9)",
        "(line 2995,col 9)-(line 2997,col 9)",
        "(line 2998,col 9)-(line 3000,col 9)",
        "(line 3001,col 9)-(line 3003,col 9)",
        "(line 3004,col 9)-(line 3006,col 9)",
        "(line 3007,col 9)-(line 3009,col 9)",
        "(line 3010,col 9)-(line 3013,col 9)",
        "(line 3014,col 9)-(line 3017,col 9)",
        "(line 3018,col 9)-(line 3020,col 9)",
        "(line 3021,col 9)-(line 3023,col 9)",
        "(line 3024,col 9)-(line 3027,col 9)",
        "(line 3028,col 9)-(line 3032,col 9)",
        "(line 3033,col 9)-(line 3035,col 9)",
        "(line 3036,col 9)-(line 3038,col 9)",
        "(line 3039,col 9)-(line 3042,col 9)",
        "(line 3043,col 9)-(line 3045,col 9)",
        "(line 3046,col 9)-(line 3049,col 9)",
        "(line 3050,col 9)-(line 3053,col 9)",
        "(line 3054,col 9)-(line 3057,col 9)",
        "(line 3058,col 9)-(line 3061,col 9)",
        "(line 3062,col 9)-(line 3065,col 9)",
        "(line 3066,col 9)-(line 3069,col 9)",
        "(line 3070,col 9)-(line 3073,col 9)",
        "(line 3074,col 9)-(line 3077,col 9)",
        "(line 3078,col 9)-(line 3080,col 9)",
        "(line 3081,col 9)-(line 3084,col 9)",
        "(line 3085,col 9)-(line 3087,col 9)",
        "(line 3088,col 9)-(line 3091,col 9)",
        "(line 3092,col 9)-(line 3095,col 9)",
        "(line 3096,col 9)-(line 3098,col 9)",
        "(line 3099,col 9)-(line 3102,col 9)",
        "(line 3103,col 9)-(line 3106,col 9)",
        "(line 3107,col 9)-(line 3110,col 9)",
        "(line 3111,col 9)-(line 3111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hashCode()",
      "begin_line": 3119,
      "end_line": 3151,
      "comment": "\r\n     * Returns a hashcode for the renderer.\r\n     *\r\n     * @return The hashcode.\r\n     ",
      "child_ranges": [
        "(line 3120,col 9)-(line 3120,col 25)",
        "(line 3121,col 9)-(line 3121,col 72)",
        "(line 3122,col 9)-(line 3122,col 72)",
        "(line 3123,col 9)-(line 3123,col 80)",
        "(line 3124,col 9)-(line 3124,col 80)",
        "(line 3125,col 9)-(line 3125,col 64)",
        "(line 3126,col 9)-(line 3126,col 64)",
        "(line 3127,col 9)-(line 3127,col 68)",
        "(line 3128,col 9)-(line 3128,col 68)",
        "(line 3129,col 9)-(line 3129,col 71)",
        "(line 3130,col 9)-(line 3130,col 71)",
        "(line 3131,col 9)-(line 3131,col 65)",
        "(line 3132,col 9)-(line 3132,col 65)",
        "(line 3133,col 9)-(line 3133,col 72)",
        "(line 3134,col 9)-(line 3134,col 72)",
        "(line 3137,col 9)-(line 3137,col 76)",
        "(line 3138,col 9)-(line 3138,col 76)",
        "(line 3150,col 9)-(line 3150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clone()",
      "begin_line": 3161,
      "end_line": 3261,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the renderer\r\n     *         does not support cloning.\r\n     ",
      "child_ranges": [
        "(line 3162,col 9)-(line 3162,col 66)",
        "(line 3164,col 9)-(line 3167,col 9)",
        "(line 3169,col 9)-(line 3172,col 9)",
        "(line 3175,col 9)-(line 3177,col 9)",
        "(line 3180,col 9)-(line 3182,col 9)",
        "(line 3184,col 9)-(line 3186,col 9)",
        "(line 3190,col 9)-(line 3192,col 9)",
        "(line 3196,col 9)-(line 3199,col 9)",
        "(line 3202,col 9)-(line 3204,col 9)",
        "(line 3205,col 9)-(line 3207,col 9)",
        "(line 3210,col 9)-(line 3213,col 9)",
        "(line 3217,col 9)-(line 3220,col 9)",
        "(line 3224,col 9)-(line 3227,col 9)",
        "(line 3231,col 9)-(line 3234,col 9)",
        "(line 3238,col 9)-(line 3241,col 9)",
        "(line 3244,col 9)-(line 3247,col 9)",
        "(line 3249,col 9)-(line 3251,col 9)",
        "(line 3252,col 9)-(line 3254,col 9)",
        "(line 3255,col 9)-(line 3257,col 9)",
        "(line 3258,col 9)-(line 3258,col 53)",
        "(line 3260,col 9)-(line 3260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 3270,
      "end_line": 3281,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 3271,col 9)-(line 3271,col 36)",
        "(line 3272,col 9)-(line 3272,col 59)",
        "(line 3273,col 9)-(line 3273,col 63)",
        "(line 3274,col 9)-(line 3274,col 66)",
        "(line 3275,col 9)-(line 3275,col 61)",
        "(line 3276,col 9)-(line 3276,col 68)",
        "(line 3277,col 9)-(line 3277,col 59)",
        "(line 3278,col 9)-(line 3278,col 68)",
        "(line 3279,col 9)-(line 3279,col 65)",
        "(line 3280,col 9)-(line 3280,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 3291,
      "end_line": 3309,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 3294,col 9)-(line 3294,col 35)",
        "(line 3295,col 9)-(line 3295,col 59)",
        "(line 3296,col 9)-(line 3296,col 63)",
        "(line 3297,col 9)-(line 3297,col 66)",
        "(line 3298,col 9)-(line 3298,col 61)",
        "(line 3299,col 9)-(line 3299,col 68)",
        "(line 3300,col 9)-(line 3300,col 59)",
        "(line 3301,col 9)-(line 3301,col 68)",
        "(line 3302,col 9)-(line 3302,col 65)",
        "(line 3303,col 9)-(line 3303,col 69)",
        "(line 3307,col 9)-(line 3307,col 52)"
      ]
    }
  ]
}