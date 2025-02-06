{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/StandardChartTheme.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardChartTheme",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.ChartTheme",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 115,
      "end_line": 1882,
      "comment": "\r\n * A default implementation of the {@link ChartTheme} interface.  This\r\n * implementation just collects a whole bunch of chart attributes and mimics\r\n * the manual process of applying each attribute to the right sub-object\r\n * within the JFreeChart instance.  It\u0027s not elegant code, but it works.\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The name of this theme. "
    },
    {
      "type": "field",
      "varNames": [
        "extraLargeFont"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * The largest font size.  Use for the main chart title.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "largeFont"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\r\n     * A large font.  Used for subtitles.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "regularFont"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\r\n     * The regular font size.  Used for axis tick labels, legend items etc.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "smallFont"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * The small font size.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "titlePaint"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The paint used to display the main chart title. "
    },
    {
      "type": "field",
      "varNames": [
        "subtitlePaint"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The paint used to display subtitles. "
    },
    {
      "type": "field",
      "varNames": [
        "chartBackgroundPaint"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The background paint for the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "legendBackgroundPaint"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The legend background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemPaint"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The legend item paint. "
    },
    {
      "type": "field",
      "varNames": [
        "drawingSupplier"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The drawing supplier. "
    },
    {
      "type": "field",
      "varNames": [
        "plotBackgroundPaint"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The background paint for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "plotOutlinePaint"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The plot outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkStyle"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The label link style for pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "labelLinkPaint"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The label link paint for pie charts. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The domain grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The range grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "baselinePaint"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": "\r\n     * The baseline paint (used for domain and range zero baselines)\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairPaint"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The axis offsets. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLabelPaint"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The axis label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelPaint"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The item label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowVisible"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": "\r\n     * A flag that controls whether or not shadows are visible (for example,\r\n     * in a bar renderer).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "barPainter"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The bar painter. "
    },
    {
      "type": "field",
      "varNames": [
        "xyBarPainter"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The XY bar painter. "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerPaint"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The thermometer paint. "
    },
    {
      "type": "field",
      "varNames": [
        "wallPaint"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\r\n     * The paint used to fill the interior of the \u0027walls\u0027 in the background\r\n     * of a plot with a 3D effect.  Applied to BarRenderer3D.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "errorIndicatorPaint"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " The error indicator paint for the {@link StatisticalBarRenderer}. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandPaint"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The grid band paint for a {@link SymbolAxis}. "
    },
    {
      "type": "field",
      "varNames": [
        "gridBandAlternatePaint"
      ],
      "begin_line": 230,
      "end_line": 231,
      "comment": " The grid band alternate paint for a {@link SymbolAxis}. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.createJFreeTheme()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Creates and returns the default \u0027JFree\u0027 chart theme.\r\n     *\r\n     * @return A chart theme.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.createDarknessTheme()",
      "begin_line": 248,
      "end_line": 281,
      "comment": "\r\n     * Creates and returns a theme called \"Darkness\".  In this theme, the\r\n     * charts have a black background.\r\n     *\r\n     * @return The \"Darkness\" theme.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 70)",
        "(line 250,col 9)-(line 250,col 39)",
        "(line 251,col 9)-(line 251,col 42)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 48)",
        "(line 256,col 9)-(line 256,col 46)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 260,col 43)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 43)",
        "(line 263,col 9)-(line 263,col 43)",
        "(line 264,col 9)-(line 275,col 63)",
        "(line 276,col 9)-(line 276,col 41)",
        "(line 277,col 9)-(line 277,col 52)",
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 279,col 68)",
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.createLegacyTheme()",
      "begin_line": 289,
      "end_line": 296,
      "comment": "\r\n     * Creates and returns a {@link ChartTheme} that doesn\u0027t apply any changes\r\n     * to the JFreeChart defaults.  This produces the \"legacy\" look for\r\n     * JFreeChart.\r\n     *\r\n     * @return A legacy theme.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 294,col 10)",
        "(line 295,col 9)-(line 295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.Anonymous-5a454261-621f-4f3f-937e-adfc52abebf1.apply(org.jfree.chart.JFreeChart)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.StandardChartTheme.StandardChartTheme(java.lang.String)",
      "begin_line": 303,
      "end_line": 337,
      "comment": "\r\n     * Creates a new default instance.\r\n     *\r\n     * @param name  the name of the theme (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 308,col 64)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 310,col 9)-(line 310,col 62)",
        "(line 311,col 9)-(line 311,col 60)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 41)",
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 315,col 46)",
        "(line 316,col 9)-(line 316,col 48)",
        "(line 317,col 9)-(line 317,col 60)",
        "(line 318,col 9)-(line 318,col 51)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 320,col 42)",
        "(line 321,col 9)-(line 321,col 60)",
        "(line 322,col 9)-(line 322,col 58)",
        "(line 323,col 9)-(line 323,col 47)",
        "(line 324,col 9)-(line 324,col 46)",
        "(line 325,col 9)-(line 325,col 41)",
        "(line 326,col 9)-(line 326,col 41)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 329,col 9)-(line 329,col 51)",
        "(line 330,col 9)-(line 330,col 55)",
        "(line 331,col 9)-(line 331,col 34)",
        "(line 332,col 9)-(line 332,col 38)",
        "(line 333,col 9)-(line 333,col 42)",
        "(line 334,col 9)-(line 334,col 44)",
        "(line 335,col 9)-(line 335,col 58)",
        "(line 336,col 9)-(line 336,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getExtraLargeFont()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns the largest font for this theme.\r\n     *\r\n     * @return The largest font for this theme.\r\n     *\r\n     * @see #setExtraLargeFont(Font)\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setExtraLargeFont(java.awt.Font)",
      "begin_line": 357,
      "end_line": 362,
      "comment": "\r\n     * Sets the largest font for this theme.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getExtraLargeFont()\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getLargeFont()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Returns the large font for this theme.\r\n     *\r\n     * @return The large font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLargeFont(Font)\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setLargeFont(java.awt.Font)",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\r\n     * Sets the large font for this theme.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLargeFont()\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getRegularFont()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns the regular font.\r\n     *\r\n     * @return The regular font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRegularFont(Font)\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setRegularFont(java.awt.Font)",
      "begin_line": 407,
      "end_line": 412,
      "comment": "\r\n     * Sets the regular font for this theme.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRegularFont()\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getSmallFont()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\r\n     * Returns the small font.\r\n     *\r\n     * @return The small font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSmallFont(Font)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setSmallFont(java.awt.Font)",
      "begin_line": 436,
      "end_line": 441,
      "comment": "\r\n     * Sets the small font for this theme.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSmallFont()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getTitlePaint()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\r\n     * Returns the title paint.\r\n     *\r\n     * @return The title paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTitlePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setTitlePaint(java.awt.Paint)",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\r\n     * Sets the title paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTitlePaint()\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getSubtitlePaint()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Returns the subtitle paint.\r\n     *\r\n     * @return The subtitle paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSubtitlePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setSubtitlePaint(java.awt.Paint)",
      "begin_line": 486,
      "end_line": 491,
      "comment": "\r\n     * Sets the subtitle paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubtitlePaint()\r\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getChartBackgroundPaint()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Returns the chart background paint.\r\n     *\r\n     * @return The chart background paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setChartBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setChartBackgroundPaint(java.awt.Paint)",
      "begin_line": 511,
      "end_line": 516,
      "comment": "\r\n     * Sets the chart background paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getChartBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getLegendBackgroundPaint()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\r\n     * Returns the legend background paint.\r\n     *\r\n     * @return The legend background paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setLegendBackgroundPaint(java.awt.Paint)",
      "begin_line": 536,
      "end_line": 541,
      "comment": "\r\n     * Sets the legend background paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getLegendItemPaint()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\r\n     * Returns the legend item paint.\r\n     *\r\n     * @return The legend item paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setLegendItemPaint(java.awt.Paint)",
      "begin_line": 561,
      "end_line": 566,
      "comment": "\r\n     * Sets the legend item paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemPaint()\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getPlotBackgroundPaint()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\r\n     * Returns the plot background paint.\r\n     *\r\n     * @return The plot background paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlotBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setPlotBackgroundPaint(java.awt.Paint)",
      "begin_line": 586,
      "end_line": 591,
      "comment": "\r\n     * Sets the plot background paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlotBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getPlotOutlinePaint()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\r\n     * Returns the plot outline paint.\r\n     *\r\n     * @return The plot outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlotOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setPlotOutlinePaint(java.awt.Paint)",
      "begin_line": 611,
      "end_line": 616,
      "comment": "\r\n     * Sets the plot outline paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlotOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getLabelLinkStyle()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Returns the label link style for pie charts.\r\n     *\r\n     * @return The label link style (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelLinkStyle(PieLabelLinkStyle)\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setLabelLinkStyle(org.jfree.chart.plot.PieLabelLinkStyle)",
      "begin_line": 636,
      "end_line": 641,
      "comment": "\r\n     * Sets the label link style for pie charts.\r\n     *\r\n     * @param style  the style (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelLinkStyle()\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getLabelLinkPaint()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\r\n     * Returns the label link paint for pie charts.\r\n     *\r\n     * @return The label link paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelLinkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setLabelLinkPaint(java.awt.Paint)",
      "begin_line": 661,
      "end_line": 666,
      "comment": "\r\n     * Sets the label link paint for pie charts.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelLinkPaint()\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getDomainGridlinePaint()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\r\n     * Returns the domain grid line paint.\r\n     *\r\n     * @return The domain grid line paint (never \u003ccode\u003enull\u003ccode\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 686,
      "end_line": 691,
      "comment": "\r\n     * Sets the domain grid line paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getRangeGridlinePaint()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\r\n     * Returns the range grid line paint.\r\n     *\r\n     * @return The range grid line paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 711,
      "end_line": 716,
      "comment": "\r\n     * Sets the range grid line paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getBaselinePaint()",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\r\n     * Returns the baseline paint.\r\n     *\r\n     * @return The baseline paint.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setBaselinePaint(java.awt.Paint)",
      "begin_line": 736,
      "end_line": 741,
      "comment": "\r\n     * Sets the baseline paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getCrosshairPaint()",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\r\n     * Returns the crosshair paint.\r\n     *\r\n     * @return The crosshair paint.\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setCrosshairPaint(java.awt.Paint)",
      "begin_line": 757,
      "end_line": 762,
      "comment": "\r\n     * Sets the crosshair paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getAxisOffset()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\r\n     * Returns the axis offsets.\r\n     *\r\n     * @return The axis offsets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 782,
      "end_line": 787,
      "comment": "\r\n     * Sets the axis offset.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisOffset()\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getAxisLabelPaint()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "\r\n     * Returns the axis label paint.\r\n     *\r\n     * @return The axis label paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setAxisLabelPaint(java.awt.Paint)",
      "begin_line": 807,
      "end_line": 812,
      "comment": "\r\n     * Sets the axis label paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getTickLabelPaint()",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\r\n     * Returns the tick label paint.\r\n     *\r\n     * @return The tick label paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 832,
      "end_line": 837,
      "comment": "\r\n     * Sets the tick label paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getItemLabelPaint()",
      "begin_line": 846,
      "end_line": 848,
      "comment": "\r\n     * Returns the item label paint.\r\n     *\r\n     * @return The item label paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setItemLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setItemLabelPaint(java.awt.Paint)",
      "begin_line": 857,
      "end_line": 862,
      "comment": "\r\n     * Sets the item label paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getItemLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 861,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.isShadowVisible()",
      "begin_line": 871,
      "end_line": 873,
      "comment": "\r\n     * Returns the shadow visibility flag.\r\n     *\r\n     * @return The shadow visibility flag.\r\n     *\r\n     * @see #setShadowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setShadowVisible(boolean)",
      "begin_line": 882,
      "end_line": 884,
      "comment": "\r\n     * Sets the shadow visibility flag.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isShadowVisible()\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getShadowPaint()",
      "begin_line": 893,
      "end_line": 895,
      "comment": "\r\n     * Returns the shadow paint.\r\n     *\r\n     * @return The shadow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setShadowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setShadowPaint(java.awt.Paint)",
      "begin_line": 904,
      "end_line": 909,
      "comment": "\r\n     * Sets the shadow paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getShadowPaint()\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getBarPainter()",
      "begin_line": 918,
      "end_line": 920,
      "comment": "\r\n     * Returns the bar painter.\r\n     *\r\n     * @return The bar painter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBarPainter(BarPainter)\r\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setBarPainter(org.jfree.chart.renderer.category.BarPainter)",
      "begin_line": 929,
      "end_line": 934,
      "comment": "\r\n     * Sets the bar painter.\r\n     *\r\n     * @param painter  the painter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBarPainter()\r\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getXYBarPainter()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\r\n     * Returns the XY bar painter.\r\n     *\r\n     * @return The XY bar painter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setXYBarPainter(XYBarPainter)\r\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setXYBarPainter(org.jfree.chart.renderer.xy.XYBarPainter)",
      "begin_line": 954,
      "end_line": 959,
      "comment": "\r\n     * Sets the XY bar painter.\r\n     *\r\n     * @param painter  the painter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getXYBarPainter()\r\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getThermometerPaint()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\r\n     * Returns the thermometer paint.\r\n     *\r\n     * @return The thermometer paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setThermometerPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setThermometerPaint(java.awt.Paint)",
      "begin_line": 979,
      "end_line": 984,
      "comment": "\r\n     * Sets the thermometer paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getWallPaint()",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\r\n     * Returns the wall paint for charts with a 3D effect.\r\n     *\r\n     * @return The wall paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setWallPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setWallPaint(java.awt.Paint)",
      "begin_line": 1004,
      "end_line": 1009,
      "comment": "\r\n     * Sets the wall paint for charts with a 3D effect.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getWallPaint()\r\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getErrorIndicatorPaint()",
      "begin_line": 1018,
      "end_line": 1020,
      "comment": "\r\n     * Returns the error indicator paint.\r\n     *\r\n     * @return The error indicator paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setErrorIndicatorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setErrorIndicatorPaint(java.awt.Paint)",
      "begin_line": 1029,
      "end_line": 1034,
      "comment": "\r\n     * Sets the error indicator paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getErrorIndicatorPaint()\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getGridBandPaint()",
      "begin_line": 1043,
      "end_line": 1045,
      "comment": "\r\n     * Returns the grid band paint.\r\n     *\r\n     * @return The grid band paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setGridBandPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setGridBandPaint(java.awt.Paint)",
      "begin_line": 1054,
      "end_line": 1059,
      "comment": "\r\n     * Sets the grid band paint.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGridBandPaint()\r\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1058,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getGridBandAlternatePaint()",
      "begin_line": 1068,
      "end_line": 1070,
      "comment": "\r\n     * Returns the grid band alternate paint (used for a {@link SymbolAxis}).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setGridBandAlternatePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 1069,col 9)-(line 1069,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setGridBandAlternatePaint(java.awt.Paint)",
      "begin_line": 1079,
      "end_line": 1084,
      "comment": "\r\n     * Sets the grid band alternate paint (used for a {@link SymbolAxis}).\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getGridBandAlternatePaint()\r\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1083,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getName()",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "\r\n     * Returns the name of this theme.\r\n     *\r\n     * @return The name of this theme.\r\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.getDrawingSupplier()",
      "begin_line": 1100,
      "end_line": 1112,
      "comment": "\r\n     * Returns a clone of the drawing supplier for this theme.\r\n     *\r\n     * @return A clone of the drawing supplier.\r\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 38)",
        "(line 1102,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier)",
      "begin_line": 1121,
      "end_line": 1126,
      "comment": "\r\n     * Sets the drawing supplier for this theme.\r\n     *\r\n     * @param supplier  the supplier (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDrawingSupplier()\r\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1124,col 9)",
        "(line 1125,col 9)-(line 1125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.apply(org.jfree.chart.JFreeChart)",
      "begin_line": 1133,
      "end_line": 1155,
      "comment": "\r\n     * Applies this theme to the supplied chart.\r\n     *\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 43)",
        "(line 1138,col 9)-(line 1141,col 9)",
        "(line 1143,col 9)-(line 1143,col 53)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1148,col 60)",
        "(line 1151,col 9)-(line 1151,col 36)",
        "(line 1152,col 9)-(line 1154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToTitle(org.jfree.chart.title.Title)",
      "begin_line": 1162,
      "end_line": 1199,
      "comment": "\r\n     * Applies the attributes of this theme to the specified title.\r\n     *\r\n     * @param title  the title.\r\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToBlockContainer(org.jfree.chart.block.BlockContainer)",
      "begin_line": 1206,
      "end_line": 1212,
      "comment": "\r\n     * Applies the attributes of this theme to the specified container.\r\n     *\r\n     * @param bc  a block container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 54)",
        "(line 1208,col 9)-(line 1211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToBlock(org.jfree.chart.block.Block)",
      "begin_line": 1219,
      "end_line": 1228,
      "comment": "\r\n     * Applies the attributes of this theme to the specified block.\r\n     *\r\n     * @param b  the block.\r\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToPlot(org.jfree.chart.plot.Plot)",
      "begin_line": 1235,
      "end_line": 1278,
      "comment": "\r\n     * Applies the attributes of this theme to a plot.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1238,col 9)",
        "(line 1239,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1245,col 52)",
        "(line 1251,col 9)-(line 1277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToPiePlot(org.jfree.chart.plot.PiePlot)",
      "begin_line": 1287,
      "end_line": 1303,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link PiePlot} instance.\r\n     * This method also clears any set values for the section paint, outline\r\n     * etc, so that the theme\u0027s {@link DrawingSupplier} will be used.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1288,col 52)",
        "(line 1289,col 9)-(line 1289,col 52)",
        "(line 1290,col 9)-(line 1290,col 44)",
        "(line 1294,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToMultiplePiePlot(org.jfree.chart.plot.MultiplePiePlot)",
      "begin_line": 1310,
      "end_line": 1312,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link MultiplePiePlot}.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToCategoryPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 1319,
      "end_line": 1372,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link CategoryPlot}.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 44)",
        "(line 1321,col 9)-(line 1321,col 62)",
        "(line 1322,col 9)-(line 1322,col 60)",
        "(line 1323,col 9)-(line 1323,col 59)",
        "(line 1326,col 9)-(line 1326,col 56)",
        "(line 1327,col 9)-(line 1332,col 9)",
        "(line 1335,col 9)-(line 1335,col 54)",
        "(line 1336,col 9)-(line 1341,col 9)",
        "(line 1344,col 9)-(line 1344,col 52)",
        "(line 1345,col 9)-(line 1350,col 9)",
        "(line 1352,col 9)-(line 1361,col 9)",
        "(line 1362,col 9)-(line 1371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToXYPlot(org.jfree.chart.plot.XYPlot)",
      "begin_line": 1379,
      "end_line": 1441,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link XYPlot}.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 44)",
        "(line 1381,col 9)-(line 1381,col 60)",
        "(line 1382,col 9)-(line 1382,col 59)",
        "(line 1383,col 9)-(line 1383,col 62)",
        "(line 1384,col 9)-(line 1384,col 60)",
        "(line 1385,col 9)-(line 1385,col 58)",
        "(line 1386,col 9)-(line 1386,col 57)",
        "(line 1388,col 9)-(line 1388,col 56)",
        "(line 1389,col 9)-(line 1394,col 9)",
        "(line 1397,col 9)-(line 1397,col 54)",
        "(line 1398,col 9)-(line 1403,col 9)",
        "(line 1406,col 9)-(line 1406,col 52)",
        "(line 1407,col 9)-(line 1412,col 9)",
        "(line 1415,col 9)-(line 1415,col 57)",
        "(line 1416,col 9)-(line 1419,col 9)",
        "(line 1421,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToFastScatterPlot(org.jfree.chart.plot.FastScatterPlot)",
      "begin_line": 1447,
      "end_line": 1459,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link FastScatterPlot}.\r\n     * @param plot\r\n     ",
      "child_ranges": [
        "(line 1448,col 9)-(line 1448,col 62)",
        "(line 1449,col 9)-(line 1449,col 60)",
        "(line 1450,col 9)-(line 1450,col 47)",
        "(line 1451,col 9)-(line 1453,col 9)",
        "(line 1454,col 9)-(line 1454,col 46)",
        "(line 1455,col 9)-(line 1457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToPolarPlot(org.jfree.chart.plot.PolarPlot)",
      "begin_line": 1467,
      "end_line": 1476,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link PolarPlot}.  This\r\n     * method is called from the {@link #applyToPlot(Plot)} method.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1468,col 49)",
        "(line 1469,col 9)-(line 1469,col 53)",
        "(line 1470,col 9)-(line 1470,col 61)",
        "(line 1471,col 9)-(line 1471,col 61)",
        "(line 1472,col 9)-(line 1472,col 40)",
        "(line 1473,col 9)-(line 1475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToSpiderWebPlot(org.jfree.chart.plot.SpiderWebPlot)",
      "begin_line": 1483,
      "end_line": 1487,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link SpiderWebPlot}.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1484,col 9)-(line 1484,col 44)",
        "(line 1485,col 9)-(line 1485,col 48)",
        "(line 1486,col 9)-(line 1486,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToMeterPlot(org.jfree.chart.plot.MeterPlot)",
      "begin_line": 1494,
      "end_line": 1502,
      "comment": "\r\n     * Applies the attributes of this theme to a {@link MeterPlot}.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1495,col 62)",
        "(line 1496,col 9)-(line 1496,col 42)",
        "(line 1497,col 9)-(line 1497,col 48)",
        "(line 1498,col 9)-(line 1498,col 56)",
        "(line 1499,col 9)-(line 1499,col 51)",
        "(line 1500,col 9)-(line 1500,col 48)",
        "(line 1501,col 9)-(line 1501,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToThermometerPlot(org.jfree.chart.plot.ThermometerPlot)",
      "begin_line": 1510,
      "end_line": 1517,
      "comment": "\r\n     * Applies the attributes for this theme to a {@link ThermometerPlot}.\r\n     * This method is called from the {@link #applyToPlot(Plot)} method.\r\n     *\r\n     * @param plot  the plot.\r\n     ",
      "child_ranges": [
        "(line 1511,col 9)-(line 1511,col 42)",
        "(line 1512,col 9)-(line 1512,col 56)",
        "(line 1513,col 9)-(line 1513,col 45)",
        "(line 1514,col 9)-(line 1516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToCategoryAxis(org.jfree.chart.axis.CategoryAxis)",
      "begin_line": 1524,
      "end_line": 1534,
      "comment": "\r\n     * Applies the attributes for this theme to a {@link CategoryAxis}.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 42)",
        "(line 1526,col 9)-(line 1526,col 48)",
        "(line 1527,col 9)-(line 1527,col 48)",
        "(line 1528,col 9)-(line 1528,col 52)",
        "(line 1529,col 9)-(line 1533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToValueAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1541,
      "end_line": 1552,
      "comment": "\r\n     * Applies the attributes for this theme to a {@link ValueAxis}.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 42)",
        "(line 1543,col 9)-(line 1543,col 48)",
        "(line 1544,col 9)-(line 1544,col 48)",
        "(line 1545,col 9)-(line 1545,col 52)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToSymbolAxis(org.jfree.chart.axis.SymbolAxis)",
      "begin_line": 1559,
      "end_line": 1562,
      "comment": "\r\n     * Applies the attributes for this theme to a {@link SymbolAxis}.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1560,col 9)-(line 1560,col 50)",
        "(line 1561,col 9)-(line 1561,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToPeriodAxis(org.jfree.chart.axis.PeriodAxis)",
      "begin_line": 1569,
      "end_line": 1580,
      "comment": "\r\n     * Applies the attributes for this theme to a {@link PeriodAxis}.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1570,col 9)-(line 1570,col 57)",
        "(line 1571,col 9)-(line 1578,col 9)",
        "(line 1579,col 9)-(line 1579,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToAbstractRenderer(org.jfree.chart.renderer.AbstractRenderer)",
      "begin_line": 1587,
      "end_line": 1594,
      "comment": "\r\n     * Applies the attributes for this theme to an {@link AbstractRenderer}.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToCategoryItemRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer)",
      "begin_line": 1601,
      "end_line": 1646,
      "comment": "\r\n     * Applies the settings of this theme to the specified renderer.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1602,col 9)-(line 1604,col 9)",
        "(line 1606,col 9)-(line 1608,col 9)",
        "(line 1610,col 9)-(line 1610,col 56)",
        "(line 1611,col 9)-(line 1611,col 60)",
        "(line 1616,col 9)-(line 1621,col 9)",
        "(line 1624,col 9)-(line 1627,col 9)",
        "(line 1630,col 9)-(line 1633,col 9)",
        "(line 1636,col 9)-(line 1639,col 9)",
        "(line 1642,col 9)-(line 1645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToXYItemRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1653,
      "end_line": 1667,
      "comment": "\r\n     * Applies the settings of this theme to the specified renderer.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1654,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1659,col 9)",
        "(line 1660,col 9)-(line 1660,col 56)",
        "(line 1661,col 9)-(line 1661,col 60)",
        "(line 1662,col 9)-(line 1666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.applyToXYAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 1674,
      "end_line": 1683,
      "comment": "\r\n     * Applies the settings of this theme to the specified annotation.\r\n     *\r\n     * @param annotation  the annotation.\r\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.equals(java.lang.Object)",
      "begin_line": 1692,
      "end_line": 1803,
      "comment": "\r\n     * Tests this theme for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1693,col 9)-(line 1695,col 9)",
        "(line 1696,col 9)-(line 1698,col 9)",
        "(line 1699,col 9)-(line 1699,col 59)",
        "(line 1700,col 9)-(line 1702,col 9)",
        "(line 1703,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1708,col 9)",
        "(line 1709,col 9)-(line 1711,col 9)",
        "(line 1712,col 9)-(line 1714,col 9)",
        "(line 1715,col 9)-(line 1717,col 9)",
        "(line 1718,col 9)-(line 1720,col 9)",
        "(line 1721,col 9)-(line 1724,col 9)",
        "(line 1725,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1731,col 9)",
        "(line 1732,col 9)-(line 1734,col 9)",
        "(line 1735,col 9)-(line 1738,col 9)",
        "(line 1739,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1745,col 9)",
        "(line 1746,col 9)-(line 1748,col 9)",
        "(line 1749,col 9)-(line 1752,col 9)",
        "(line 1753,col 9)-(line 1756,col 9)",
        "(line 1757,col 9)-(line 1759,col 9)",
        "(line 1760,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1771,col 9)",
        "(line 1772,col 9)-(line 1774,col 9)",
        "(line 1775,col 9)-(line 1777,col 9)",
        "(line 1778,col 9)-(line 1780,col 9)",
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1787,col 9)",
        "(line 1788,col 9)-(line 1790,col 9)",
        "(line 1791,col 9)-(line 1794,col 9)",
        "(line 1795,col 9)-(line 1797,col 9)",
        "(line 1798,col 9)-(line 1801,col 9)",
        "(line 1802,col 9)-(line 1802,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.clone()",
      "begin_line": 1812,
      "end_line": 1814,
      "comment": "\r\n     * Returns a clone of this theme.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the theme cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1813,col 9)-(line 1813,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1823,
      "end_line": 1846,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 36)",
        "(line 1825,col 9)-(line 1825,col 60)",
        "(line 1826,col 9)-(line 1826,col 63)",
        "(line 1827,col 9)-(line 1827,col 70)",
        "(line 1828,col 9)-(line 1828,col 71)",
        "(line 1829,col 9)-(line 1829,col 65)",
        "(line 1830,col 9)-(line 1830,col 69)",
        "(line 1831,col 9)-(line 1831,col 66)",
        "(line 1832,col 9)-(line 1832,col 64)",
        "(line 1833,col 9)-(line 1833,col 63)",
        "(line 1834,col 9)-(line 1834,col 69)",
        "(line 1835,col 9)-(line 1835,col 68)",
        "(line 1836,col 9)-(line 1836,col 64)",
        "(line 1837,col 9)-(line 1837,col 64)",
        "(line 1838,col 9)-(line 1838,col 64)",
        "(line 1839,col 9)-(line 1839,col 64)",
        "(line 1840,col 9)-(line 1840,col 61)",
        "(line 1841,col 9)-(line 1841,col 66)",
        "(line 1842,col 9)-(line 1842,col 59)",
        "(line 1843,col 9)-(line 1843,col 69)",
        "(line 1844,col 9)-(line 1844,col 63)",
        "(line 1845,col 9)-(line 1845,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StandardChartTheme.readObject(java.io.ObjectInputStream)",
      "begin_line": 1856,
      "end_line": 1880,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1858,col 9)-(line 1858,col 35)",
        "(line 1859,col 9)-(line 1859,col 60)",
        "(line 1860,col 9)-(line 1860,col 63)",
        "(line 1861,col 9)-(line 1861,col 70)",
        "(line 1862,col 9)-(line 1862,col 71)",
        "(line 1863,col 9)-(line 1863,col 65)",
        "(line 1864,col 9)-(line 1864,col 69)",
        "(line 1865,col 9)-(line 1865,col 66)",
        "(line 1866,col 9)-(line 1866,col 64)",
        "(line 1867,col 9)-(line 1867,col 63)",
        "(line 1868,col 9)-(line 1868,col 69)",
        "(line 1869,col 9)-(line 1869,col 68)",
        "(line 1870,col 9)-(line 1870,col 64)",
        "(line 1871,col 9)-(line 1871,col 64)",
        "(line 1872,col 9)-(line 1872,col 64)",
        "(line 1873,col 9)-(line 1873,col 64)",
        "(line 1874,col 9)-(line 1874,col 61)",
        "(line 1875,col 9)-(line 1875,col 66)",
        "(line 1876,col 9)-(line 1876,col 59)",
        "(line 1877,col 9)-(line 1877,col 69)",
        "(line 1878,col 9)-(line 1878,col 63)",
        "(line 1879,col 9)-(line 1879,col 72)"
      ]
    }
  ]
}