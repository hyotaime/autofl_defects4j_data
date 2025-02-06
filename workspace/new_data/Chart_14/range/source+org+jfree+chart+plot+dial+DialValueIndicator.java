{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/dial/DialValueIndicator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialValueIndicator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 78,
      "end_line": 702,
      "comment": "\n * A value indicator for a {@link DialPlot}.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The dataset index. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The angle that defines the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The radius that defines the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "frameAnchor"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The frame anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "templateValue"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The template value. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The insets. "
    },
    {
      "type": "field",
      "varNames": [
        "valueAnchor"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The value anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The text anchor for displaying the value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.DialValueIndicator()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialValueIndicator\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.DialValueIndicator(int)",
      "begin_line": 135,
      "end_line": 150,
      "comment": " \n     * Creates a new instance of \u003ccode\u003eDialValueIndicator\u003c/code\u003e.\n     * \n     * @param datasetIndex  the dataset index.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 41)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 26)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 47)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 54)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 51)",
        "(line 146,col 9)-(line 146,col 39)",
        "(line 147,col 9)-(line 147,col 54)",
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getDatasetIndex()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the index of the dataset from which this indicator fetches its \n     * current value.\n     * \n     * @return The dataset index.\n     * \n     * @see #setDatasetIndex(int)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setDatasetIndex(int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Sets the dataset index and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param index  the index.\n     * \n     * @see #getDatasetIndex()\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getAngle()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Returns the angle for the anchor point.  The angle is specified in \n     * degrees using the same orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class.\n     * \n     * @return The angle (in degrees).\n     * \n     * @see #setAngle(double)\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setAngle(double)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Sets the angle for the anchor point and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param angle  the angle (in degrees).\n     * \n     * @see #getAngle()\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 27)",
        "(line 199,col 9)-(line 199,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getRadius()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns the radius.\n     * \n     * @return The radius.\n     * \n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setRadius(double)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Sets the radius and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param radius  the radius.\n     * \n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 223,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getFrameAnchor()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns the frame anchor.\n     * \n     * @return The frame anchor.\n     * \n     * @see #setFrameAnchor(RectangleAnchor)\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setFrameAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * Sets the frame anchor and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     * \n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getFrameAnchor()\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 34)",
        "(line 250,col 9)-(line 250,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getTemplateValue()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the template value.\n     * \n     * @return The template value (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setTemplateValue(Number)\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setTemplateValue(java.lang.Number)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * Sets the template value and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     * \n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #setTemplateValue(Number)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 35)",
        "(line 277,col 9)-(line 277,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getNumberFormat()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns the formatter used to format the value.\n     * \n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setNumberFormat(NumberFormat)\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setNumberFormat(java.text.NumberFormat)",
      "begin_line": 299,
      "end_line": 305,
      "comment": "\n     * Sets the formatter used to format the value and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getNumberFormat()\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 35)",
        "(line 304,col 9)-(line 304,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getFont()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Returns the font.\n     * \n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #getFont()\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setFont(java.awt.Font)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n     * Sets the font and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     * \n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 25)",
        "(line 329,col 9)-(line 329,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getPaint()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Returns the paint.\n     * \n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setPaint(java.awt.Paint)",
      "begin_line": 351,
      "end_line": 357,
      "comment": "\n     * Sets the paint and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 27)",
        "(line 356,col 9)-(line 356,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getBackgroundPaint()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Returns the background paint.\n     * \n     * @return The background paint.\n     * \n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 37)",
        "(line 383,col 9)-(line 383,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getOutlineStroke()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * Returns the outline stroke.\n     * \n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setOutlineStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\n     * Sets the outline stroke and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     * \n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getOutlineStroke()\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 36)",
        "(line 410,col 9)-(line 410,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getOutlinePaint()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Returns the outline paint.\n     * \n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setOutlinePaint(Paint)\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setOutlinePaint(java.awt.Paint)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\n     * Sets the outline paint and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getOutlinePaint()\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 437,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getInsets()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Returns the insets.\n     * \n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setInsets(RectangleInsets)\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 459,
      "end_line": 465,
      "comment": "\n     * Sets the insets and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getInsets()\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 29)",
        "(line 464,col 9)-(line 464,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getValueAnchor()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Returns the value anchor.\n     * \n     * @return The value anchor (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setValueAnchor(RectangleAnchor)\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setValueAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 486,
      "end_line": 492,
      "comment": "\n     * Sets the value anchor and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     * \n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getValueAnchor()\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 34)",
        "(line 491,col 9)-(line 491,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getTextAnchor()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * Returns the text anchor.\n     * \n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setTextAnchor(TextAnchor)\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 513,
      "end_line": 519,
      "comment": "\n     * Sets the text anchor and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getTextAnchor()\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 33)",
        "(line 518,col 9)-(line 518,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.isClippedToWindow()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be \n     * clipped within the dial window. \n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 541,
      "end_line": 582,
      "comment": "\n     * Draws the background to the specified graphics device.  If the dial\n     * frame specifies a window, the clipping region will already have been \n     * set to this window before this method is called.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (ignored here).\n     * @param frame  the dial frame (ignored here).\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted). \n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 546,col 29)",
        "(line 547,col 9)-(line 547,col 69)",
        "(line 548,col 9)-(line 548,col 41)",
        "(line 551,col 9)-(line 551,col 54)",
        "(line 552,col 9)-(line 552,col 61)",
        "(line 553,col 9)-(line 553,col 64)",
        "(line 556,col 9)-(line 558,col 34)",
        "(line 561,col 9)-(line 561,col 67)",
        "(line 564,col 9)-(line 564,col 42)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 568,col 9)-(line 568,col 41)",
        "(line 569,col 9)-(line 569,col 39)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 574,col 9)-(line 574,col 56)",
        "(line 575,col 9)-(line 575,col 55)",
        "(line 576,col 9)-(line 576,col 76)",
        "(line 577,col 9)-(line 577,col 32)",
        "(line 578,col 9)-(line 578,col 30)",
        "(line 579,col 9)-(line 580,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.equals(java.lang.Object)",
      "begin_line": 591,
      "end_line": 640,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 59)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.hashCode()",
      "begin_line": 647,
      "end_line": 656,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 25)",
        "(line 649,col 9)-(line 649,col 74)",
        "(line 650,col 9)-(line 651,col 38)",
        "(line 652,col 9)-(line 653,col 35)",
        "(line 654,col 9)-(line 654,col 61)",
        "(line 655,col 9)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.clone()",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return The clone.\n     *\n     * @throws CloneNotSupportedException if some attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 677,
      "end_line": 683,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 36)",
        "(line 679,col 9)-(line 679,col 55)",
        "(line 680,col 9)-(line 680,col 65)",
        "(line 681,col 9)-(line 681,col 62)",
        "(line 682,col 9)-(line 682,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.readObject(java.io.ObjectInputStream)",
      "begin_line": 693,
      "end_line": 700,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 35)",
        "(line 696,col 9)-(line 696,col 55)",
        "(line 697,col 9)-(line 697,col 65)",
        "(line 698,col 9)-(line 698,col 62)",
        "(line 699,col 9)-(line 699,col 64)"
      ]
    }
  ]
}