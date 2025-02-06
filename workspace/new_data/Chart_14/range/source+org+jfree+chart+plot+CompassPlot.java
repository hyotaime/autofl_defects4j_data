{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/CompassPlot.java",
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
      "begin_line": 107,
      "end_line": 890,
      "comment": "\r\n * A specialised plot that draws a compass to indicate a direction based on the\r\n * value from a {@link ValueDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": " The default label font. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_LABELS"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " A constant for the label type. "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE_LABELS"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " A constant for the label type. "
    },
    {
      "type": "field",
      "varNames": [
        "labelType"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The label type (NO_LABELS, VALUE_LABELS). "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBorder"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " A flag that controls whether or not a border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "roseHighlightPaint"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The rose highlight paint. "
    },
    {
      "type": "field",
      "varNames": [
        "rosePaint"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The rose paint. "
    },
    {
      "type": "field",
      "varNames": [
        "roseCenterPaint"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The rose center paint. "
    },
    {
      "type": "field",
      "varNames": [
        "compassFont"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The compass font. "
    },
    {
      "type": "field",
      "varNames": [
        "circle1"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "circle2"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "a1"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " A working area. "
    },
    {
      "type": "field",
      "varNames": [
        "a2"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " A working area. "
    },
    {
      "type": "field",
      "varNames": [
        "rect1"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " A working shape. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " An array of value datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesNeedle"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " An array of needles. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 165,
      "end_line": 167,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "revolutionDistance"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " \r\n     * The count to complete one revolution.  Can be arbitrarily set\r\n     * For degrees (the default) it is 360, for radians this is 2*Pi, etc\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CompassPlot.CompassPlot()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CompassPlot.CompassPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 187,
      "end_line": 197,
      "comment": "\r\n     * Constructs a new compass plot.\r\n     *\r\n     * @param dataset  the dataset for the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 16)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 195,col 48)",
        "(line 196,col 9)-(line 196,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLabelType()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\r\n     * Returns the label type.  Defined by the constants: {@link #NO_LABELS}\r\n     * and {@link #VALUE_LABELS}.\r\n     *\r\n     * @return The label type.\r\n     * \r\n     * @see #setLabelType(int)\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setLabelType(int)",
      "begin_line": 219,
      "end_line": 229,
      "comment": "\r\n     * Sets the label type (either {@link #NO_LABELS} or {@link #VALUE_LABELS}.\r\n     *\r\n     * @param type  the type.\r\n     * \r\n     * @see #getLabelType()\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLabelFont()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\r\n     * Returns the label font.\r\n     *\r\n     * @return The label font.\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setLabelFont(java.awt.Font)",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\r\n     * Sets the label font and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param font  the new label font.\r\n     * \r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 30)",
        "(line 257,col 9)-(line 257,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRosePaint()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Returns the paint used to fill the outer circle of the compass.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRosePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRosePaint(java.awt.Paint)",
      "begin_line": 279,
      "end_line": 285,
      "comment": "\r\n     * Sets the paint used to fill the outer circle of the compass, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRosePaint()\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 31)",
        "(line 284,col 9)-(line 284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRoseCenterPaint()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the paint used to fill the inner background area of the \r\n     * compass.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRoseCenterPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRoseCenterPaint(java.awt.Paint)",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\r\n     * Sets the paint used to fill the inner background area of the compass, \r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRoseCenterPaint()\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 37)",
        "(line 312,col 9)-(line 312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRoseHighlightPaint()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\r\n     * Returns the paint used to draw the circles, symbols and labels on the\r\n     * compass.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRoseHighlightPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRoseHighlightPaint(java.awt.Paint)",
      "begin_line": 335,
      "end_line": 341,
      "comment": "\r\n     * Sets the paint used to draw the circles, symbols and labels of the \r\n     * compass, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRoseHighlightPaint()\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 340,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getDrawBorder()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\r\n     * Returns a flag that controls whether or not a border is drawn.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDrawBorder(boolean)\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setDrawBorder(boolean)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\r\n     * Sets a flag that controls whether or not a border is drawn.\r\n     *\r\n     * @param status  the flag status.\r\n     * \r\n     * @see #getDrawBorder()\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 33)",
        "(line 363,col 9)-(line 363,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesPaint(int, java.awt.Paint)",
      "begin_line": 374,
      "end_line": 379,
      "comment": "\r\n     * Sets the series paint.\r\n     *\r\n     * @param series  the series index.\r\n     * @param paint  the paint.\r\n     * \r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesOutlinePaint(int, java.awt.Paint)",
      "begin_line": 389,
      "end_line": 395,
      "comment": "\r\n     * Sets the series outline paint.\r\n     *\r\n     * @param series  the series index.\r\n     * @param p  the paint.\r\n     * \r\n     * @see #setSeriesPaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesOutlineStroke(int, java.awt.Stroke)",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\r\n     * Sets the series outline stroke.\r\n     *\r\n     * @param series  the series index.\r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #setSeriesOutlinePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\r\n     * Sets the needle type.\r\n     *\r\n     * @param type  the type.\r\n     * \r\n     * @see #setSeriesNeedle(int, int)\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int, int)",
      "begin_line": 443,
      "end_line": 487,
      "comment": "\r\n     * Sets the needle for a series.  The needle type is one of the following:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e0 \u003d {@link ArrowNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e1 \u003d {@link LineNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e2 \u003d {@link LongNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e3 \u003d {@link PinNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e4 \u003d {@link PlumNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e5 \u003d {@link PointerNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e6 \u003d {@link ShipNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e7 \u003d {@link WindNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e8 \u003d {@link ArrowNeedle};\u003c/li\u003e\r\n     * \u003cli\u003e9 \u003d {@link MiddlePinNeedle};\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * @param index  the series index.\r\n     * @param type  the needle type.\r\n     * \r\n     * @see #setSeriesNeedle(int)\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 485,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setSeriesNeedle(int, org.jfree.chart.needle.MeterNeedle)",
      "begin_line": 496,
      "end_line": 503,
      "comment": "\r\n     * Sets the needle for a series and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the series index.\r\n     * @param needle  the needle.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getDatasets()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\r\n     * Returns an array of dataset references for the plot.\r\n     *\r\n     * @return The dataset for the plot, cast as a ValueDataset.\r\n     * \r\n     * @see #addDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.addDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\r\n     * Adds a dataset to the compass.\r\n     *\r\n     * @param dataset  the new dataset (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * \r\n     * @see #addDataset(ValueDataset, MeterNeedle)\r\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.addDataset(org.jfree.data.general.ValueDataset, org.jfree.chart.needle.MeterNeedle)",
      "begin_line": 533,
      "end_line": 559,
      "comment": "\r\n     * Adds a dataset to the compass.\r\n     *\r\n     * @param dataset  the new dataset (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * @param needle  the needle (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 571,
      "end_line": 699,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 28)",
        "(line 576,col 9)-(line 576,col 28)",
        "(line 577,col 9)-(line 577,col 27)",
        "(line 578,col 9)-(line 578,col 17)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 594,col 48)",
        "(line 595,col 9)-(line 595,col 26)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 17)",
        "(line 600,col 9)-(line 600,col 34)",
        "(line 602,col 9)-(line 602,col 37)",
        "(line 603,col 9)-(line 603,col 37)",
        "(line 605,col 9)-(line 605,col 80)",
        "(line 606,col 9)-(line 609,col 10)",
        "(line 610,col 9)-(line 610,col 36)",
        "(line 611,col 9)-(line 611,col 41)",
        "(line 612,col 9)-(line 612,col 41)",
        "(line 613,col 9)-(line 613,col 34)",
        "(line 614,col 9)-(line 614,col 25)",
        "(line 616,col 9)-(line 616,col 42)",
        "(line 617,col 9)-(line 617,col 27)",
        "(line 618,col 9)-(line 618,col 68)",
        "(line 619,col 9)-(line 619,col 45)",
        "(line 620,col 9)-(line 620,col 70)",
        "(line 621,col 9)-(line 621,col 27)",
        "(line 622,col 9)-(line 622,col 68)",
        "(line 623,col 9)-(line 623,col 27)",
        "(line 624,col 9)-(line 624,col 68)",
        "(line 625,col 9)-(line 625,col 27)",
        "(line 626,col 9)-(line 626,col 68)",
        "(line 628,col 9)-(line 628,col 34)",
        "(line 629,col 9)-(line 629,col 34)",
        "(line 630,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 45)",
        "(line 640,col 9)-(line 640,col 34)",
        "(line 641,col 9)-(line 641,col 24)",
        "(line 642,col 9)-(line 648,col 9)",
        "(line 651,col 9)-(line 662,col 9)",
        "(line 665,col 9)-(line 665,col 34)",
        "(line 666,col 9)-(line 666,col 40)",
        "(line 667,col 9)-(line 667,col 22)",
        "(line 668,col 9)-(line 668,col 71)",
        "(line 669,col 9)-(line 669,col 61)",
        "(line 670,col 9)-(line 670,col 61)",
        "(line 671,col 9)-(line 671,col 71)",
        "(line 674,col 9)-(line 674,col 24)",
        "(line 675,col 9)-(line 675,col 24)",
        "(line 676,col 9)-(line 678,col 10)",
        "(line 679,col 9)-(line 679,col 41)",
        "(line 680,col 9)-(line 680,col 24)",
        "(line 681,col 9)-(line 681,col 25)",
        "(line 682,col 9)-(line 682,col 43)",
        "(line 683,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getPlotType()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A string describing the plot.\r\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getLegendItems()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\r\n     * Returns the legend items for the plot.  For now, no legend is available \r\n     * - this method returns null.\r\n     *\r\n     * @return The legend items.\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.zoom(double)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\r\n     * No zooming is implemented for compass plot, so this method is empty.\r\n     *\r\n     * @param percent  the zoom amount.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getCompassFont(int)",
      "begin_line": 736,
      "end_line": 743,
      "comment": "\r\n     * Returns the font for the compass, adjusted for the size of the plot.\r\n     *\r\n     * @param radius the radius.\r\n     *\r\n     * @return The font.\r\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 40)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 61)",
        "(line 742,col 9)-(line 742,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.equals(java.lang.Object)",
      "begin_line": 752,
      "end_line": 794,
      "comment": "\r\n     * Tests an object for equality with this plot.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 45)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.clone()",
      "begin_line": 804,
      "end_line": 833,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 56)",
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 64)",
        "(line 823,col 9)-(line 823,col 71)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.setRevolutionDistance(double)",
      "begin_line": 843,
      "end_line": 847,
      "comment": "\r\n     * Sets the count to complete one revolution.  Can be arbitrarily set\r\n     * For degrees (the default) it is 360, for radians this is 2*Pi, etc\r\n     *\r\n     * @param size the count to complete one revolution.\r\n     * \r\n     * @see #getRevolutionDistance()\r\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.getRevolutionDistance()",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\r\n     * Gets the count to complete one revolution.\r\n     *\r\n     * @return The count to complete one revolution.\r\n     * \r\n     * @see #setRevolutionDistance(double)\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 867,
      "end_line": 872,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 36)",
        "(line 869,col 9)-(line 869,col 59)",
        "(line 870,col 9)-(line 870,col 65)",
        "(line 871,col 9)-(line 871,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CompassPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 882,
      "end_line": 888,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 35)",
        "(line 885,col 9)-(line 885,col 59)",
        "(line 886,col 9)-(line 886,col 65)",
        "(line 887,col 9)-(line 887,col 68)"
      ]
    }
  ]
}