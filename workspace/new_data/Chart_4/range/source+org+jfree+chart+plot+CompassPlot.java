{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/CompassPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompassPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 108,
      "end_line": 889,
      "comment": "\r\n * A specialised plot that draws a compass to indicate a direction based on the\r\n * value from a {@link ValueDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 114,
      "end_line": 115,
      "comment": " The default label font. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_LABELS"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " A constant for the label type. "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE_LABELS"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " A constant for the label type. "
    },
    {
      "type": "field",
      "varNames": [
        "labelType"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The label type (NO_LABELS, VALUE_LABELS). "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBorder"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " A flag that controls whether or not a border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "roseHighlightPaint"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The rose highlight paint. "
    },
    {
      "type": "field",
      "varNames": [
        "rosePaint"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The rose paint. "
    },
    {
      "type": "field",
      "varNames": [
        "roseCenterPaint"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The rose center paint. "
    },
    {
      "type": "field",
      "varNames": [
        "compassFont"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The compass font. "
    },
    {
      "type": "field",
      "varNames": [
        "circle1"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "circle2"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "a1"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " A working area. "
    },
    {
      "type": "field",
      "varNames": [
        "a2"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " A working area. "
    },
    {
      "type": "field",
      "varNames": [
        "rect1"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " An array of value datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesNeedle"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " An array of needles. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 166,
      "end_line": 168,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "revolutionDistance"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\r\n     * The count to complete one revolution.  Can be arbitrarily set\r\n     * For degrees (the default) it is 360, for radians this is 2*Pi, etc\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CompassPlot.CompassPlot()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CompassPlot.CompassPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 188,
      "end_line": 198,
      "comment": "\r\n     * Constructs a new compass plot.\r\n     *\r\n     * @param dataset  the dataset for the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 16)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 46)",
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLabelType()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\r\n     * Returns the label type.  Defined by the constants: {@link #NO_LABELS}\r\n     * and {@link #VALUE_LABELS}.\r\n     *\r\n     * @return The label type.\r\n     *\r\n     * @see #setLabelType(int)\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setLabelType(int)",
      "begin_line": 220,
      "end_line": 230,
      "comment": "\r\n     * Sets the label type (either {@link #NO_LABELS} or {@link #VALUE_LABELS}.\r\n     *\r\n     * @param type  the type.\r\n     *\r\n     * @see #getLabelType()\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLabelFont()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\r\n     * Returns the label font.\r\n     *\r\n     * @return The label font.\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setLabelFont(java.awt.Font)",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\r\n     * Sets the label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the new label font.\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 30)",
        "(line 258,col 9)-(line 258,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRosePaint()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the paint used to fill the outer circle of the compass.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRosePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRosePaint(java.awt.Paint)",
      "begin_line": 280,
      "end_line": 286,
      "comment": "\r\n     * Sets the paint used to fill the outer circle of the compass,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRosePaint()\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 31)",
        "(line 285,col 9)-(line 285,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRoseCenterPaint()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\r\n     * Returns the paint used to fill the inner background area of the\r\n     * compass.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRoseCenterPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRoseCenterPaint(java.awt.Paint)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\r\n     * Sets the paint used to fill the inner background area of the compass,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRoseCenterPaint()\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 37)",
        "(line 313,col 9)-(line 313,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRoseHighlightPaint()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the paint used to draw the circles, symbols and labels on the\r\n     * compass.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRoseHighlightPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRoseHighlightPaint(java.awt.Paint)",
      "begin_line": 336,
      "end_line": 342,
      "comment": "\r\n     * Sets the paint used to draw the circles, symbols and labels of the\r\n     * compass, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRoseHighlightPaint()\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 40)",
        "(line 341,col 9)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getDrawBorder()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns a flag that controls whether or not a border is drawn.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDrawBorder(boolean)\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setDrawBorder(boolean)",
      "begin_line": 362,
      "end_line": 365,
      "comment": "\r\n     * Sets a flag that controls whether or not a border is drawn.\r\n     *\r\n     * @param status  the flag status.\r\n     *\r\n     * @see #getDrawBorder()\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 33)",
        "(line 364,col 9)-(line 364,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 375,
      "end_line": 380,
      "comment": "\r\n     * Sets the series paint.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 390,
      "end_line": 396,
      "comment": "\r\n     * Sets the series outline paint.\r\n     *\r\n     * @param series  the series index.\r\n     * @param p  the paint.\r\n     *\r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 406,
      "end_line": 412,
      "comment": "\r\n     * Sets the series outline stroke.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Sets the needle type.\r\n     *\r\n     * @param type  the type.\r\n     *\r\n     * @see #setSeriesNeedle(int, int)\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int, int)",
      "begin_line": 444,
      "end_line": 488,
      "comment": "\r\n     * Sets the needle for a series.  The needle type is one of the following:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e0 \u003d {@link ArrowNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e1 \u003d {@link LineNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e2 \u003d {@link LongNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e3 \u003d {@link PinNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e4 \u003d {@link PlumNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e5 \u003d {@link PointerNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e6 \u003d {@link ShipNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e7 \u003d {@link WindNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e8 \u003d {@link ArrowNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e9 \u003d {@link MiddlePinNeedle};\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * @param index  the series index.\r\n     * @param type  the needle type.\r\n     *\r\n     * @see #setSeriesNeedle(int)\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int, org.jfree.chart.needle.MeterNeedle)",
      "begin_line": 497,
      "end_line": 502,
      "comment": "\r\n     * Sets the needle for a series and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the series index.\r\n     * @param needle  the needle.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getDatasets()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\r\n     * Returns an array of dataset references for the plot.\r\n     *\r\n     * @return The dataset for the plot, cast as a ValueDataset.\r\n     *\r\n     * @see #addDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.addDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\r\n     * Adds a dataset to the compass.\r\n     *\r\n     * @param dataset  the new dataset (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #addDataset(ValueDataset, MeterNeedle)\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.addDataset(org.jfree.data.general.ValueDataset, org.jfree.chart.needle.MeterNeedle)",
      "begin_line": 532,
      "end_line": 558,
      "comment": "\r\n     * Adds a dataset to the compass.\r\n     *\r\n     * @param dataset  the new dataset (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * @param needle  the needle (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 570,
      "end_line": 698,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 28)",
        "(line 575,col 9)-(line 575,col 28)",
        "(line 576,col 9)-(line 576,col 27)",
        "(line 577,col 9)-(line 577,col 17)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 584,col 9)-(line 584,col 45)",
        "(line 585,col 9)-(line 585,col 26)",
        "(line 588,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 47)",
        "(line 593,col 9)-(line 593,col 48)",
        "(line 594,col 9)-(line 594,col 26)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 17)",
        "(line 599,col 9)-(line 599,col 34)",
        "(line 601,col 9)-(line 601,col 37)",
        "(line 602,col 9)-(line 602,col 37)",
        "(line 604,col 9)-(line 604,col 80)",
        "(line 605,col 9)-(line 608,col 10)",
        "(line 609,col 9)-(line 609,col 36)",
        "(line 610,col 9)-(line 610,col 41)",
        "(line 611,col 9)-(line 611,col 41)",
        "(line 612,col 9)-(line 612,col 34)",
        "(line 613,col 9)-(line 613,col 25)",
        "(line 615,col 9)-(line 615,col 42)",
        "(line 616,col 9)-(line 616,col 27)",
        "(line 617,col 9)-(line 617,col 68)",
        "(line 618,col 9)-(line 618,col 45)",
        "(line 619,col 9)-(line 619,col 70)",
        "(line 620,col 9)-(line 620,col 27)",
        "(line 621,col 9)-(line 621,col 68)",
        "(line 622,col 9)-(line 622,col 27)",
        "(line 623,col 9)-(line 623,col 68)",
        "(line 624,col 9)-(line 624,col 27)",
        "(line 625,col 9)-(line 625,col 68)",
        "(line 627,col 9)-(line 627,col 34)",
        "(line 628,col 9)-(line 628,col 34)",
        "(line 629,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 45)",
        "(line 639,col 9)-(line 639,col 34)",
        "(line 640,col 9)-(line 640,col 24)",
        "(line 641,col 9)-(line 647,col 9)",
        "(line 650,col 9)-(line 661,col 9)",
        "(line 664,col 9)-(line 664,col 34)",
        "(line 665,col 9)-(line 665,col 40)",
        "(line 666,col 9)-(line 666,col 22)",
        "(line 667,col 9)-(line 667,col 71)",
        "(line 668,col 9)-(line 668,col 61)",
        "(line 669,col 9)-(line 669,col 61)",
        "(line 670,col 9)-(line 670,col 71)",
        "(line 673,col 9)-(line 673,col 24)",
        "(line 674,col 9)-(line 674,col 24)",
        "(line 675,col 9)-(line 677,col 10)",
        "(line 678,col 9)-(line 678,col 41)",
        "(line 679,col 9)-(line 679,col 24)",
        "(line 680,col 9)-(line 680,col 25)",
        "(line 681,col 9)-(line 681,col 43)",
        "(line 682,col 9)-(line 692,col 9)",
        "(line 694,col 9)-(line 696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getPlotType()",
      "begin_line": 705,
      "end_line": 707,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A string describing the plot.\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLegendItems()",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\r\n     * Returns the legend items for the plot.  For now, no legend is available\r\n     * - this method returns null.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.zoom(double)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\r\n     * No zooming is implemented for compass plot, so this method is empty.\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getCompassFont(int)",
      "begin_line": 735,
      "end_line": 742,
      "comment": "\r\n     * Returns the font for the compass, adjusted for the size of the plot.\r\n     *\r\n     * @param radius the radius.\r\n     *\r\n     * @return The font.\r\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 40)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 61)",
        "(line 741,col 9)-(line 741,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.equals(java.lang.Object)",
      "begin_line": 751,
      "end_line": 793,
      "comment": "\r\n     * Tests an object for equality with this plot.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 45)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.clone()",
      "begin_line": 803,
      "end_line": 832,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 56)",
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 821,col 64)",
        "(line 822,col 9)-(line 822,col 71)",
        "(line 825,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRevolutionDistance(double)",
      "begin_line": 842,
      "end_line": 846,
      "comment": "\r\n     * Sets the count to complete one revolution.  Can be arbitrarily set\r\n     * For degrees (the default) it is 360, for radians this is 2*Pi, etc\r\n     *\r\n     * @param size the count to complete one revolution.\r\n     *\r\n     * @see #getRevolutionDistance()\r\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 845,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRevolutionDistance()",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\r\n     * Gets the count to complete one revolution.\r\n     *\r\n     * @return The count to complete one revolution.\r\n     *\r\n     * @see #setRevolutionDistance(double)\r\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 866,
      "end_line": 871,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 36)",
        "(line 868,col 9)-(line 868,col 59)",
        "(line 869,col 9)-(line 869,col 65)",
        "(line 870,col 9)-(line 870,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 881,
      "end_line": 887,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 35)",
        "(line 884,col 9)-(line 884,col 59)",
        "(line 885,col 9)-(line 885,col 65)",
        "(line 886,col 9)-(line 886,col 68)"
      ]
    }
  ]
}