{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/AbstractRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRenderer",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 131,
      "end_line": 2758,
      "comment": "\r\n * Base class providing common services for renderers.  Most methods that update\r\n * attributes of the renderer will fire a {@link RendererChangeEvent}, which \r\n * normally means the plot that owns the renderer will receive notification that\r\n * the renderer has been changed (the plot will, in turn, notify the chart).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Zero represented as a \u003ccode\u003eDouble\u003c/code\u003e. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_PAINT"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The default outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STROKE"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The default stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_OUTLINE_STROKE"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The default outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SHAPE"
      ],
      "begin_line": 152,
      "end_line": 153,
      "comment": " The default shape. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_FONT"
      ],
      "begin_line": 156,
      "end_line": 157,
      "comment": " The default value label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_LABEL_PAINT"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The default value label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleList"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " A list of flags that controls whether or not each series is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisible"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The default visibility for each series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesVisibleInLegendList"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " \r\n     * A list of flags that controls whether or not each series is visible in \r\n     * the legend. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeriesVisibleInLegend"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The default visibility for each series in the legend. "
    },
    {
      "type": "field",
      "varNames": [
        "paintList"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesPaint"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\r\n     * A flag that controls whether or not the paintList is auto-populated\r\n     * in the {@link #lookupSeriesPaint(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "basePaint"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The base paint. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintList"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The fill paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesFillPaint"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\r\n     * A flag that controls whether or not the fillPaintList is auto-populated\r\n     * in the {@link #lookupSeriesFillPaint(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseFillPaint"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The base fill paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaintList"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The outline paint list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlinePaint"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": "\r\n     * A flag that controls whether or not the outlinePaintList is auto-populated\r\n     * in the {@link #lookupSeriesOutlinePaint(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlinePaint"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The base outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "strokeList"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesStroke"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": "\r\n     * A flag that controls whether or not the strokeList is auto-populated\r\n     * in the {@link #lookupSeriesStroke(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseStroke"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " The base stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStrokeList"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " The outline stroke list. "
    },
    {
      "type": "field",
      "varNames": [
        "baseOutlineStroke"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " The base outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesOutlineStroke"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": "\r\n     * A flag that controls whether or not the outlineStrokeList is \r\n     * auto-populated in the {@link #lookupSeriesOutlineStroke(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeList"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " A shape list. "
    },
    {
      "type": "field",
      "varNames": [
        "autoPopulateSeriesShape"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": "\r\n     * A flag that controls whether or not the shapeList is auto-populated\r\n     * in the {@link #lookupSeriesShape(int)} method.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShape"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " The base shape. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelsVisibleList"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " Visibility of the item labels PER series. "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelsVisible"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " The base item labels visible. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelFontList"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " The item label font list (one font per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelFont"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " The base item label font. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelPaintList"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " The item label paint list (one paint per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelPaint"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " The base item label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveItemLabelPositionList"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " The positive item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "basePositiveItemLabelPosition"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The fallback positive item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "negativeItemLabelPositionList"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The negative item label position (per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseNegativeItemLabelPosition"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The fallback negative item label position. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelAnchorOffset"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The item label anchor offset. "
    },
    {
      "type": "field",
      "varNames": [
        "createEntitiesList"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " \r\n     * Flags that control whether or not entities are generated for each \r\n     * series.  This will be overridden by \u0027createEntities\u0027. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseCreateEntities"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": "\r\n     * The default flag that controls whether or not entities are generated.\r\n     * This flag is used when both the above flags return null. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "field",
      "varNames": [
        "event"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " An event for re-use. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.AbstractRenderer()",
      "begin_line": 315,
      "end_line": 369,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 51)",
        "(line 318,col 9)-(line 318,col 38)",
        "(line 320,col 9)-(line 320,col 59)",
        "(line 321,col 9)-(line 321,col 46)",
        "(line 323,col 9)-(line 323,col 41)",
        "(line 324,col 9)-(line 324,col 39)",
        "(line 325,col 9)-(line 325,col 44)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 328,col 9)-(line 328,col 41)",
        "(line 329,col 9)-(line 329,col 49)",
        "(line 331,col 9)-(line 331,col 48)",
        "(line 332,col 9)-(line 332,col 54)",
        "(line 333,col 9)-(line 333,col 52)",
        "(line 335,col 9)-(line 335,col 43)",
        "(line 336,col 9)-(line 336,col 41)",
        "(line 337,col 9)-(line 337,col 46)",
        "(line 339,col 9)-(line 339,col 50)",
        "(line 340,col 9)-(line 340,col 56)",
        "(line 341,col 9)-(line 341,col 53)",
        "(line 343,col 9)-(line 343,col 41)",
        "(line 344,col 9)-(line 344,col 39)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 347,col 9)-(line 347,col 55)",
        "(line 348,col 9)-(line 348,col 43)",
        "(line 350,col 9)-(line 350,col 50)",
        "(line 351,col 9)-(line 351,col 71)",
        "(line 353,col 9)-(line 353,col 50)",
        "(line 354,col 9)-(line 354,col 46)",
        "(line 356,col 9)-(line 356,col 62)",
        "(line 357,col 9)-(line 358,col 69)",
        "(line 360,col 9)-(line 360,col 62)",
        "(line 361,col 9)-(line 362,col 65)",
        "(line 364,col 9)-(line 364,col 52)",
        "(line 365,col 9)-(line 365,col 39)",
        "(line 367,col 9)-(line 367,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getDrawingSupplier()",
      "begin_line": 376,
      "end_line": 376,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     * \r\n     * @return The drawing supplier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemVisible(int, int)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item \r\n     * should be drawn (this is typically used to hide an entire series).\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisible(int)",
      "begin_line": 401,
      "end_line": 408,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified series \r\n     * should be drawn.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 62)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisible(int)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisible(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 447,
      "end_line": 452,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible and, if \r\n     * requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisible(int)\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 59)",
        "(line 449,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisible()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean)",
      "begin_line": 473,
      "end_line": 476,
      "comment": "\r\n     * Sets the base visibility and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisible(boolean, boolean)",
      "begin_line": 487,
      "end_line": 492,
      "comment": "\r\n     * Sets the base visibility and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisible()\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesVisibleInLegend(int)",
      "begin_line": 504,
      "end_line": 511,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the series should be shown in the legend,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 56)",
        "(line 506,col 9)-(line 506,col 70)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesVisibleInLegend(int)",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\r\n     * Returns the flag that controls whether a series is visible in the \r\n     * legend.  This method returns only the \"per series\" settings - to \r\n     * do a lookup that falls back to the default, you need to use the \r\n     * {@link #isSeriesVisibleInLegend(int)} method.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesVisibleInLegend(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend \r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesVisibleInLegend(int, java.lang.Boolean, boolean)",
      "begin_line": 553,
      "end_line": 559,
      "comment": "\r\n     * Sets the flag that controls whether a series is visible in the legend\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesVisibleInLegend(int)\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 67)",
        "(line 556,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseSeriesVisibleInLegend()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\r\n     * Returns the base visibility in the legend for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseSeriesVisibleInLegend(boolean)\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean)",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\r\n     * Sets the base visibility in the legend and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseSeriesVisibleInLegend(boolean, boolean)",
      "begin_line": 594,
      "end_line": 599,
      "comment": "\r\n     * Sets the base visibility in the legend and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseSeriesVisibleInLegend()\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 49)",
        "(line 596,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemPaint(int, int)",
      "begin_line": 615,
      "end_line": 617,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * \u003ccode\u003egetSeriesPaint\u003c/code\u003e method. You can override this method if you \r\n     * require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesPaint(int)",
      "begin_line": 628,
      "end_line": 644,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 51)",
        "(line 632,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPaint(int)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\r\n     * Sets the paint used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPaint(int, java.awt.Paint, boolean)",
      "begin_line": 682,
      "end_line": 687,
      "comment": "\r\n     * Sets the paint used for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesPaint(int)\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 47)",
        "(line 684,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePaint()",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\r\n     * Returns the base paint.\r\n     *\r\n     * @return The base paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBasePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint)",
      "begin_line": 708,
      "end_line": 711,
      "comment": "\r\n     * Sets the base paint and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePaint(java.awt.Paint, boolean)",
      "begin_line": 722,
      "end_line": 727,
      "comment": "\r\n     * Sets the base paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBasePaint()\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 31)",
        "(line 724,col 9)-(line 726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesPaint()",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\r\n     * Returns the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesPaint(boolean)",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\r\n     * Sets the flag that controls whether or not the series paint list is\r\n     * automatically populated when {@link #lookupSeriesPaint(int)} is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesPaint()\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemFillPaint(int, int)",
      "begin_line": 770,
      "end_line": 772,
      "comment": "\r\n     * Returns the paint used to fill data items as they are drawn.  The \r\n     * default implementation passes control to the \r\n     * {@link #lookupSeriesFillPaint(int)} method - you can override this \r\n     * method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesFillPaint(int)",
      "begin_line": 783,
      "end_line": 799,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 59)",
        "(line 787,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesFillPaint(int)",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\r\n     * Returns the paint used to fill an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesFillPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint)",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\r\n     * Sets the paint used for a series fill and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesFillPaint(int, java.awt.Paint, boolean)",
      "begin_line": 837,
      "end_line": 842,
      "comment": "\r\n     * Sets the paint used to fill a series and, if requested, \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesFillPaint(int)\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 51)",
        "(line 839,col 9)-(line 841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseFillPaint()",
      "begin_line": 851,
      "end_line": 853,
      "comment": "\r\n     * Returns the base fill paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseFillPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint)",
      "begin_line": 863,
      "end_line": 866,
      "comment": "\r\n     * Sets the base fill paint and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseFillPaint(java.awt.Paint, boolean)",
      "begin_line": 877,
      "end_line": 885,
      "comment": "\r\n     * Sets the base fill paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseFillPaint()\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 35)",
        "(line 882,col 9)-(line 884,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesFillPaint()",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\r\n     * Returns the flag that controls whether or not the series fill paint list\r\n     * is automatically populated when {@link #lookupSeriesFillPaint(int)} is \r\n     * called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesFillPaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesFillPaint(boolean)",
      "begin_line": 912,
      "end_line": 914,
      "comment": "\r\n     * Sets the flag that controls whether or not the series fill paint list is\r\n     * automatically populated when {@link #lookupSeriesFillPaint(int)} is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesFillPaint()\r\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlinePaint(int, int)",
      "begin_line": 930,
      "end_line": 932,
      "comment": "\r\n     * Returns the paint used to outline data items as they are drawn.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the \r\n     * {@link #lookupSeriesOutlinePaint} method.  You can override this method \r\n     * if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlinePaint(int)",
      "begin_line": 943,
      "end_line": 959,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 65)",
        "(line 947,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlinePaint(int)",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\r\n     * Returns the paint used to outline an item drawn by the renderer.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\r\n     * Sets the paint used for a series outline and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlinePaint(int, java.awt.Paint, boolean)",
      "begin_line": 997,
      "end_line": 1002,
      "comment": "\r\n     * Sets the paint used to draw the outline for a series and, if requested, \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesOutlinePaint(int)\r\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 54)",
        "(line 999,col 9)-(line 1001,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlinePaint()",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\r\n     * Returns the base outline paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint)",
      "begin_line": 1021,
      "end_line": 1024,
      "comment": "\r\n     * Sets the base outline paint and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlinePaint(java.awt.Paint, boolean)",
      "begin_line": 1035,
      "end_line": 1043,
      "comment": "\r\n     * Sets the base outline paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 38)",
        "(line 1040,col 9)-(line 1042,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlinePaint()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline paint \r\n     * list is automatically populated when \r\n     * {@link #lookupSeriesOutlinePaint(int)} is called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlinePaint(boolean)",
      "begin_line": 1071,
      "end_line": 1073,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline paint list\r\n     * is automatically populated when {@link #lookupSeriesOutlinePaint(int)} \r\n     * is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemStroke(int, int)",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "\r\n     * Returns the stroke used to draw data items.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the getSeriesStroke method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesStroke(int)",
      "begin_line": 1101,
      "end_line": 1117,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 48)",
        "(line 1105,col 9)-(line 1111,col 9)",
        "(line 1112,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesStroke(int)",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "\r\n     * Returns the stroke used to draw the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke)",
      "begin_line": 1141,
      "end_line": 1143,
      "comment": "\r\n     * Sets the stroke used for a series and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1155,
      "end_line": 1160,
      "comment": "\r\n     * Sets the stroke for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 50)",
        "(line 1157,col 9)-(line 1159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseStroke()",
      "begin_line": 1169,
      "end_line": 1171,
      "comment": "\r\n     * Returns the base stroke.\r\n     *\r\n     * @return The base stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke)",
      "begin_line": 1181,
      "end_line": 1184,
      "comment": "\r\n     * Sets the base stroke and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseStroke(java.awt.Stroke, boolean)",
      "begin_line": 1195,
      "end_line": 1203,
      "comment": "\r\n     * Sets the base stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseStroke()\r\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 33)",
        "(line 1200,col 9)-(line 1202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesStroke()",
      "begin_line": 1215,
      "end_line": 1217,
      "comment": "\r\n     * Returns the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1216,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesStroke(boolean)",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\r\n     * Sets the flag that controls whether or not the series stroke list is\r\n     * automatically populated when {@link #lookupSeriesStroke(int)} is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesStroke()\r\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemOutlineStroke(int, int)",
      "begin_line": 1246,
      "end_line": 1248,
      "comment": "\r\n     * Returns the stroke used to outline data items.  The default \r\n     * implementation passes control to the \r\n     * {@link #lookupSeriesOutlineStroke(int)} method. You can override this \r\n     * method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesOutlineStroke(int)",
      "begin_line": 1259,
      "end_line": 1275,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 55)",
        "(line 1263,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesOutlineStroke(int)",
      "begin_line": 1286,
      "end_line": 1288,
      "comment": "\r\n     * Returns the stroke used to outline the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesOutlineStroke(int, Stroke)\r\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "\r\n     * Sets the outline stroke used for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesOutlineStroke(int, java.awt.Stroke, boolean)",
      "begin_line": 1313,
      "end_line": 1319,
      "comment": "\r\n     * Sets the outline stroke for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesOutlineStroke(int)\r\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1315,col 57)",
        "(line 1316,col 9)-(line 1318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseOutlineStroke()",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\r\n     * Returns the base outline stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke)",
      "begin_line": 1340,
      "end_line": 1342,
      "comment": "\r\n     * Sets the base outline stroke and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1341,col 9)-(line 1341,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseOutlineStroke(java.awt.Stroke, boolean)",
      "begin_line": 1354,
      "end_line": 1362,
      "comment": "\r\n     * Sets the base outline stroke and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getBaseOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1357,col 9)",
        "(line 1358,col 9)-(line 1358,col 40)",
        "(line 1359,col 9)-(line 1361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesOutlineStroke()",
      "begin_line": 1375,
      "end_line": 1377,
      "comment": "\r\n     * Returns the flag that controls whether or not the series outline stroke \r\n     * list is automatically populated when \r\n     * {@link #lookupSeriesOutlineStroke(int)} is called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesOutlineStroke(boolean)\r\n     ",
      "child_ranges": [
        "(line 1376,col 9)-(line 1376,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesOutlineStroke(boolean)",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\r\n     * Sets the flag that controls whether or not the series outline stroke list\r\n     * is automatically populated when {@link #lookupSeriesOutlineStroke(int)} \r\n     * is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 1391,col 9)-(line 1391,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemShape(int, int)",
      "begin_line": 1407,
      "end_line": 1409,
      "comment": "\r\n     * Returns a shape used to represent a data item.\r\n     * \u003cp\u003e\r\n     * The default implementation passes control to the getSeriesShape method.\r\n     * You can override this method if you require different behaviour.\r\n     *\r\n     * @param row  the row (or series) index (zero-based).\r\n     * @param column  the column (or category) index (zero-based).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.lookupSeriesShape(int)",
      "begin_line": 1420,
      "end_line": 1436,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 46)",
        "(line 1424,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1433,col 9)",
        "(line 1434,col 9)-(line 1434,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesShape(int)",
      "begin_line": 1447,
      "end_line": 1449,
      "comment": "\r\n     * Returns a shape used to represent the items in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The shape (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesShape(int, Shape)\r\n     ",
      "child_ranges": [
        "(line 1448,col 9)-(line 1448,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape)",
      "begin_line": 1460,
      "end_line": 1462,
      "comment": "\r\n     * Sets the shape used for a series and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesShape(int, java.awt.Shape, boolean)",
      "begin_line": 1474,
      "end_line": 1479,
      "comment": "\r\n     * Sets the shape for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesShape(int)\r\n     ",
      "child_ranges": [
        "(line 1475,col 9)-(line 1475,col 47)",
        "(line 1476,col 9)-(line 1478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseShape()",
      "begin_line": 1488,
      "end_line": 1490,
      "comment": "\r\n     * Returns the base shape.\r\n     *\r\n     * @return The shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape)",
      "begin_line": 1500,
      "end_line": 1503,
      "comment": "\r\n     * Sets the base shape and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1502,col 9)-(line 1502,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseShape(java.awt.Shape, boolean)",
      "begin_line": 1514,
      "end_line": 1522,
      "comment": "\r\n     * Sets the base shape and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted). \r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseShape()\r\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1517,col 9)",
        "(line 1518,col 9)-(line 1518,col 31)",
        "(line 1519,col 9)-(line 1521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getAutoPopulateSeriesShape()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\r\n     * Returns the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setAutoPopulateSeriesShape(boolean)\r\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setAutoPopulateSeriesShape(boolean)",
      "begin_line": 1548,
      "end_line": 1550,
      "comment": "\r\n     * Sets the flag that controls whether or not the series shape list is\r\n     * automatically populated when {@link #lookupSeriesShape(int)} is called.\r\n     * \r\n     * @param auto  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getAutoPopulateSeriesShape()\r\n     ",
      "child_ranges": [
        "(line 1549,col 9)-(line 1549,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isItemLabelVisible(int, int)",
      "begin_line": 1563,
      "end_line": 1565,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if an item label is visible, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1564,col 9)-(line 1564,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.isSeriesItemLabelsVisible(int)",
      "begin_line": 1575,
      "end_line": 1581,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the item labels for a series are visible, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1576,col 9)-(line 1576,col 66)",
        "(line 1577,col 9)-(line 1579,col 9)",
        "(line 1580,col 9)-(line 1580,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelsVisible(int)",
      "begin_line": 1595,
      "end_line": 1597,
      "comment": "\r\n     * Returns a flag that controls whether or not item labels are displayed\r\n     * for the data items in the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * \r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     * \r\n     * @see #isSeriesItemLabelsVisible(int)\r\n     ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1596,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, boolean)",
      "begin_line": 1606,
      "end_line": 1608,
      "comment": "\r\n     * Sets a flag that controls the visibility of the item labels for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean)",
      "begin_line": 1617,
      "end_line": 1619,
      "comment": "\r\n     * Sets the visibility of the item labels for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelsVisible(int, java.lang.Boolean, boolean)",
      "begin_line": 1630,
      "end_line": 1636,
      "comment": "\r\n     * Sets the visibility of item labels for a series and, if requested, sends \r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param visible  the visible flag.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 1632,col 9)-(line 1632,col 63)",
        "(line 1633,col 9)-(line 1635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelsVisible()",
      "begin_line": 1646,
      "end_line": 1648,
      "comment": "\r\n     * Returns the base setting for item label visibility.  A \u003ccode\u003enull\u003c/code\u003e\r\n     * result should be interpreted as equivalent to \u003ccode\u003eBoolean.FALSE\u003c/code\u003e.\r\n     * \r\n     * @return A flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseItemLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 1647,col 9)-(line 1647,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean)",
      "begin_line": 1658,
      "end_line": 1660,
      "comment": "\r\n     * Sets the base flag that controls whether or not item labels are visible,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1659,col 9)-(line 1659,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelsVisible(boolean, boolean)",
      "begin_line": 1671,
      "end_line": 1676,
      "comment": "\r\n     * Sets the base visibility for item labels and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * @param notify  notify listeners?\r\n     *                \r\n     * @see #getBaseItemLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1672,col 45)",
        "(line 1673,col 9)-(line 1675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelFont(int, int)",
      "begin_line": 1688,
      "end_line": 1694,
      "comment": "\r\n     * Returns the font for an item label.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1689,col 50)",
        "(line 1690,col 9)-(line 1692,col 9)",
        "(line 1693,col 9)-(line 1693,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelFont(int)",
      "begin_line": 1705,
      "end_line": 1707,
      "comment": "\r\n     * Returns the font for all the item labels in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The font (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelFont(int, Font)\r\n     ",
      "child_ranges": [
        "(line 1706,col 9)-(line 1706,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font)",
      "begin_line": 1718,
      "end_line": 1720,
      "comment": "\r\n     * Sets the item label font for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  \r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelFont(int, java.awt.Font, boolean)",
      "begin_line": 1733,
      "end_line": 1738,
      "comment": "\r\n     * Sets the item label font for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getSeriesItemLabelFont(int)\r\n     ",
      "child_ranges": [
        "(line 1734,col 9)-(line 1734,col 49)",
        "(line 1735,col 9)-(line 1737,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelFont()",
      "begin_line": 1748,
      "end_line": 1750,
      "comment": "\r\n     * Returns the base item label font (this is used when no other font \r\n     * setting is available).\r\n     * \r\n     * @return The font (\u003ccode\u003enever\u003c/code\u003e null).\r\n     * \r\n     * @see #setBaseItemLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 1749,col 9)-(line 1749,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font)",
      "begin_line": 1760,
      "end_line": 1765,
      "comment": "\r\n     * Sets the base item label font and sends a {@link RendererChangeEvent} to \r\n     * all registered listeners.  \r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1763,col 9)",
        "(line 1764,col 9)-(line 1764,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelFont(java.awt.Font, boolean)",
      "begin_line": 1777,
      "end_line": 1782,
      "comment": "\r\n     * Sets the base item label font and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getBaseItemLabelFont()\r\n     ",
      "child_ranges": [
        "(line 1778,col 9)-(line 1778,col 38)",
        "(line 1779,col 9)-(line 1781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelPaint(int, int)",
      "begin_line": 1794,
      "end_line": 1800,
      "comment": "\r\n     * Returns the paint used to draw an item label.\r\n     * \r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1795,col 52)",
        "(line 1796,col 9)-(line 1798,col 9)",
        "(line 1799,col 9)-(line 1799,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesItemLabelPaint(int)",
      "begin_line": 1811,
      "end_line": 1813,
      "comment": "\r\n     * Returns the paint used to draw the item labels for a series.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setSeriesItemLabelPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 1812,col 9)-(line 1812,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint)",
      "begin_line": 1824,
      "end_line": 1826,
      "comment": "\r\n     * Sets the item label paint for a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series (zero based index).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 1825,col 9)-(line 1825,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesItemLabelPaint(int, java.awt.Paint, boolean)",
      "begin_line": 1839,
      "end_line": 1845,
      "comment": "\r\n     * Sets the item label paint for a series and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero based).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getSeriesItemLabelPaint(int)\r\n     ",
      "child_ranges": [
        "(line 1841,col 9)-(line 1841,col 56)",
        "(line 1842,col 9)-(line 1844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseItemLabelPaint()",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": "\r\n     * Returns the base item label paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     * \r\n     * @see #setBaseItemLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1855,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint)",
      "begin_line": 1866,
      "end_line": 1869,
      "comment": "\r\n     * Sets the base item label paint and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 1868,col 9)-(line 1868,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseItemLabelPaint(java.awt.Paint, boolean)",
      "begin_line": 1881,
      "end_line": 1889,
      "comment": "\r\n     * Sets the base item label paint and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners..\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getBaseItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 1882,col 9)-(line 1884,col 9)",
        "(line 1885,col 9)-(line 1885,col 40)",
        "(line 1886,col 9)-(line 1888,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getPositiveItemLabelPosition(int, int)",
      "begin_line": 1903,
      "end_line": 1905,
      "comment": "\r\n     * Returns the item label position for positive values.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getNegativeItemLabelPosition(int, int)\r\n     ",
      "child_ranges": [
        "(line 1904,col 9)-(line 1904,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesPositiveItemLabelPosition(int)",
      "begin_line": 1916,
      "end_line": 1926,
      "comment": "\r\n     * Returns the item label position for all positive values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesPositiveItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 1919,col 9)-(line 1920,col 59)",
        "(line 1921,col 9)-(line 1923,col 9)",
        "(line 1924,col 9)-(line 1924,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1937,
      "end_line": 1940,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and \r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 1939,col 9)-(line 1939,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesPositiveItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1953,
      "end_line": 1960,
      "comment": "\r\n     * Sets the item label position for all positive values in a series and (if\r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getSeriesPositiveItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 1956,col 9)-(line 1956,col 65)",
        "(line 1957,col 9)-(line 1959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBasePositiveItemLabelPosition()",
      "begin_line": 1969,
      "end_line": 1971,
      "comment": "\r\n     * Returns the base positive item label position.\r\n     * \r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBasePositiveItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 1970,col 9)-(line 1970,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 1980,
      "end_line": 1983,
      "comment": "\r\n     * Sets the base positive item label position.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 1982,col 9)-(line 1982,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 1994,
      "end_line": 2003,
      "comment": "\r\n     * Sets the base positive item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getBasePositiveItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 1996,col 9)-(line 1998,col 9)",
        "(line 1999,col 9)-(line 1999,col 54)",
        "(line 2000,col 9)-(line 2002,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getNegativeItemLabelPosition(int, int)",
      "begin_line": 2019,
      "end_line": 2021,
      "comment": "\r\n     * Returns the item label position for negative values.  This method can be \r\n     * overridden to provide customisation of the item label position for \r\n     * individual data items.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getPositiveItemLabelPosition(int, int)\r\n     ",
      "child_ranges": [
        "(line 2020,col 9)-(line 2020,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesNegativeItemLabelPosition(int)",
      "begin_line": 2032,
      "end_line": 2042,
      "comment": "\r\n     * Returns the item label position for all negative values in a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * \r\n     * @return The item label position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesNegativeItemLabelPosition(int, ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2035,col 9)-(line 2036,col 59)",
        "(line 2037,col 9)-(line 2039,col 9)",
        "(line 2040,col 9)-(line 2040,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2053,
      "end_line": 2056,
      "comment": "\r\n     * Sets the item label position for negative values in a series and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2055,col 9)-(line 2055,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesNegativeItemLabelPosition(int, org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2069,
      "end_line": 2076,
      "comment": "\r\n     * Sets the item label position for negative values in a series and (if \r\n     * requested) sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getSeriesNegativeItemLabelPosition(int)\r\n     ",
      "child_ranges": [
        "(line 2072,col 9)-(line 2072,col 65)",
        "(line 2073,col 9)-(line 2075,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseNegativeItemLabelPosition()",
      "begin_line": 2085,
      "end_line": 2087,
      "comment": "\r\n     * Returns the base item label position for negative values.\r\n     * \r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setBaseNegativeItemLabelPosition(ItemLabelPosition)\r\n     ",
      "child_ranges": [
        "(line 2086,col 9)-(line 2086,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition)",
      "begin_line": 2097,
      "end_line": 2099,
      "comment": "\r\n     * Sets the base item label position for negative values and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2098,col 9)-(line 2098,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition, boolean)",
      "begin_line": 2110,
      "end_line": 2119,
      "comment": "\r\n     * Sets the base negative item label position and, if requested, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify registered listeners?\r\n     * \r\n     * @see #getBaseNegativeItemLabelPosition()\r\n     ",
      "child_ranges": [
        "(line 2112,col 9)-(line 2114,col 9)",
        "(line 2115,col 9)-(line 2115,col 54)",
        "(line 2116,col 9)-(line 2118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemLabelAnchorOffset()",
      "begin_line": 2128,
      "end_line": 2130,
      "comment": "\r\n     * Returns the item label anchor offset.\r\n     *\r\n     * @return The offset.\r\n     * \r\n     * @see #setItemLabelAnchorOffset(double)\r\n     ",
      "child_ranges": [
        "(line 2129,col 9)-(line 2129,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setItemLabelAnchorOffset(double)",
      "begin_line": 2139,
      "end_line": 2142,
      "comment": "\r\n     * Sets the item label anchor offset.\r\n     *\r\n     * @param offset  the offset.\r\n     * \r\n     * @see #getItemLabelAnchorOffset()\r\n     ",
      "child_ranges": [
        "(line 2140,col 9)-(line 2140,col 44)",
        "(line 2141,col 9)-(line 2141,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getItemCreateEntity(int, int)",
      "begin_line": 2153,
      "end_line": 2161,
      "comment": "\r\n     * Returns a boolean that indicates whether or not the specified item \r\n     * should have a chart entity created for it.\r\n     * \r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 2154,col 9)-(line 2154,col 52)",
        "(line 2155,col 9)-(line 2160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getSeriesCreateEntities(int)",
      "begin_line": 2173,
      "end_line": 2175,
      "comment": "\r\n     * Returns the flag that controls whether entities are created for a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The flag (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesCreateEntities(int, Boolean)\r\n     ",
      "child_ranges": [
        "(line 2174,col 9)-(line 2174,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean)",
      "begin_line": 2186,
      "end_line": 2188,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series,\r\n     * and sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2187,col 9)-(line 2187,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setSeriesCreateEntities(int, java.lang.Boolean, boolean)",
      "begin_line": 2201,
      "end_line": 2207,
      "comment": "\r\n     * Sets the flag that controls whether entities are created for a series\r\n     * and, if requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param series  the series index.\r\n     * @param create  the flag (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getSeriesCreateEntities(int)\r\n     ",
      "child_ranges": [
        "(line 2203,col 9)-(line 2203,col 59)",
        "(line 2204,col 9)-(line 2206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.getBaseCreateEntities()",
      "begin_line": 2216,
      "end_line": 2218,
      "comment": "\r\n     * Returns the base visibility for all series.\r\n     *\r\n     * @return The base visibility.\r\n     * \r\n     * @see #setBaseCreateEntities(boolean)\r\n     ",
      "child_ranges": [
        "(line 2217,col 9)-(line 2217,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean)",
      "begin_line": 2229,
      "end_line": 2232,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created\r\n     * for a series, and sends a {@link RendererChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param create  the flag.\r\n     * \r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2231,col 9)-(line 2231,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.setBaseCreateEntities(boolean, boolean)",
      "begin_line": 2244,
      "end_line": 2249,
      "comment": "\r\n     * Sets the base flag that controls whether entities are created and, \r\n     * if requested, sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param create  the visibility.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getBaseCreateEntities()\r\n     ",
      "child_ranges": [
        "(line 2245,col 9)-(line 2245,col 41)",
        "(line 2246,col 9)-(line 2248,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ADJ"
      ],
      "begin_line": 2252,
      "end_line": 2252,
      "comment": " The adjacent offset. "
    },
    {
      "type": "field",
      "varNames": [
        "OPP"
      ],
      "begin_line": 2255,
      "end_line": 2255,
      "comment": " The opposite offset. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 2267,
      "end_line": 2374,
      "comment": "\r\n     * Calculates the item label anchor point.\r\n     *\r\n     * @param anchor  the anchor.\r\n     * @param x  the x coordinate.\r\n     * @param y  the y coordinate.\r\n     * @param orientation  the plot orientation.\r\n     *\r\n     * @return The anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 2269,col 9)-(line 2269,col 30)",
        "(line 2270,col 9)-(line 2372,col 9)",
        "(line 2373,col 9)-(line 2373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.addChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2383,
      "end_line": 2388,
      "comment": "\r\n     * Registers an object to receive notification of changes to the renderer.\r\n     *\r\n     * @param listener  the listener (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2384,col 9)-(line 2386,col 9)",
        "(line 2387,col 9)-(line 2387,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.removeChangeListener(org.jfree.chart.event.RendererChangeListener)",
      "begin_line": 2398,
      "end_line": 2403,
      "comment": "\r\n     * Deregisters an object so that it no longer receives \r\n     * notification of changes to the renderer.\r\n     *\r\n     * @param listener  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addChangeListener(RendererChangeListener)\r\n     ",
      "child_ranges": [
        "(line 2399,col 9)-(line 2401,col 9)",
        "(line 2402,col 9)-(line 2402,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hasListener(java.util.EventListener)",
      "begin_line": 2414,
      "end_line": 2417,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this \r\n     * method, it exists mainly for use by unit testing code.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 2415,col 9)-(line 2415,col 71)",
        "(line 2416,col 9)-(line 2416,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.fireChangeEvent()",
      "begin_line": 2424,
      "end_line": 2436,
      "comment": "\r\n     * Sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 2435,col 9)-(line 2435,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.notifyListeners(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 2443,
      "end_line": 2450,
      "comment": "\r\n     * Notifies all registered listeners that the renderer has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     ",
      "child_ranges": [
        "(line 2444,col 9)-(line 2444,col 58)",
        "(line 2445,col 9)-(line 2449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.equals(java.lang.Object)",
      "begin_line": 2459,
      "end_line": 2571,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 2460,col 9)-(line 2462,col 9)",
        "(line 2463,col 9)-(line 2465,col 9)",
        "(line 2466,col 9)-(line 2466,col 55)",
        "(line 2467,col 9)-(line 2469,col 9)",
        "(line 2470,col 9)-(line 2472,col 9)",
        "(line 2473,col 9)-(line 2476,col 9)",
        "(line 2477,col 9)-(line 2479,col 9)",
        "(line 2480,col 9)-(line 2482,col 9)",
        "(line 2483,col 9)-(line 2485,col 9)",
        "(line 2486,col 9)-(line 2488,col 9)",
        "(line 2489,col 9)-(line 2491,col 9)",
        "(line 2492,col 9)-(line 2495,col 9)",
        "(line 2496,col 9)-(line 2499,col 9)",
        "(line 2500,col 9)-(line 2502,col 9)",
        "(line 2503,col 9)-(line 2505,col 9)",
        "(line 2506,col 9)-(line 2509,col 9)",
        "(line 2510,col 9)-(line 2514,col 9)",
        "(line 2515,col 9)-(line 2517,col 9)",
        "(line 2518,col 9)-(line 2520,col 9)",
        "(line 2521,col 9)-(line 2524,col 9)",
        "(line 2525,col 9)-(line 2527,col 9)",
        "(line 2528,col 9)-(line 2531,col 9)",
        "(line 2532,col 9)-(line 2535,col 9)",
        "(line 2536,col 9)-(line 2539,col 9)",
        "(line 2540,col 9)-(line 2543,col 9)",
        "(line 2544,col 9)-(line 2547,col 9)",
        "(line 2548,col 9)-(line 2551,col 9)",
        "(line 2552,col 9)-(line 2555,col 9)",
        "(line 2556,col 9)-(line 2559,col 9)",
        "(line 2560,col 9)-(line 2562,col 9)",
        "(line 2563,col 9)-(line 2566,col 9)",
        "(line 2567,col 9)-(line 2569,col 9)",
        "(line 2570,col 9)-(line 2570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.hashCode()",
      "begin_line": 2578,
      "end_line": 2610,
      "comment": "\r\n     * Returns a hashcode for the renderer.\r\n     * \r\n     * @return The hashcode.\r\n     ",
      "child_ranges": [
        "(line 2579,col 9)-(line 2579,col 25)",
        "(line 2580,col 9)-(line 2580,col 72)",
        "(line 2581,col 9)-(line 2581,col 72)",
        "(line 2582,col 9)-(line 2582,col 80)",
        "(line 2583,col 9)-(line 2583,col 80)",
        "(line 2584,col 9)-(line 2584,col 64)",
        "(line 2585,col 9)-(line 2585,col 64)",
        "(line 2586,col 9)-(line 2586,col 68)",
        "(line 2587,col 9)-(line 2587,col 68)",
        "(line 2588,col 9)-(line 2588,col 71)",
        "(line 2589,col 9)-(line 2589,col 71)",
        "(line 2590,col 9)-(line 2590,col 65)",
        "(line 2591,col 9)-(line 2591,col 65)",
        "(line 2592,col 9)-(line 2592,col 72)",
        "(line 2593,col 9)-(line 2593,col 72)",
        "(line 2596,col 9)-(line 2596,col 76)",
        "(line 2597,col 9)-(line 2597,col 76)",
        "(line 2609,col 9)-(line 2609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.clone()",
      "begin_line": 2620,
      "end_line": 2710,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the renderer \r\n     *         does not support cloning.\r\n     ",
      "child_ranges": [
        "(line 2621,col 9)-(line 2621,col 66)",
        "(line 2623,col 9)-(line 2626,col 9)",
        "(line 2628,col 9)-(line 2631,col 9)",
        "(line 2634,col 9)-(line 2636,col 9)",
        "(line 2639,col 9)-(line 2641,col 9)",
        "(line 2643,col 9)-(line 2645,col 9)",
        "(line 2649,col 9)-(line 2651,col 9)",
        "(line 2655,col 9)-(line 2658,col 9)",
        "(line 2661,col 9)-(line 2663,col 9)",
        "(line 2664,col 9)-(line 2666,col 9)",
        "(line 2669,col 9)-(line 2672,col 9)",
        "(line 2676,col 9)-(line 2679,col 9)",
        "(line 2683,col 9)-(line 2686,col 9)",
        "(line 2690,col 9)-(line 2693,col 9)",
        "(line 2697,col 9)-(line 2700,col 9)",
        "(line 2703,col 9)-(line 2706,col 9)",
        "(line 2707,col 9)-(line 2707,col 53)",
        "(line 2708,col 9)-(line 2708,col 27)",
        "(line 2709,col 9)-(line 2709,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2719,
      "end_line": 2730,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 2721,col 9)-(line 2721,col 36)",
        "(line 2722,col 9)-(line 2722,col 59)",
        "(line 2723,col 9)-(line 2723,col 63)",
        "(line 2724,col 9)-(line 2724,col 66)",
        "(line 2725,col 9)-(line 2725,col 61)",
        "(line 2726,col 9)-(line 2726,col 68)",
        "(line 2727,col 9)-(line 2727,col 59)",
        "(line 2728,col 9)-(line 2728,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AbstractRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 2740,
      "end_line": 2756,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 2743,col 9)-(line 2743,col 35)",
        "(line 2744,col 9)-(line 2744,col 59)",
        "(line 2745,col 9)-(line 2745,col 63)",
        "(line 2746,col 9)-(line 2746,col 66)",
        "(line 2747,col 9)-(line 2747,col 61)",
        "(line 2748,col 9)-(line 2748,col 68)",
        "(line 2749,col 9)-(line 2749,col 59)",
        "(line 2750,col 9)-(line 2750,col 68)",
        "(line 2754,col 9)-(line 2754,col 52)"
      ]
    }
  ]
}