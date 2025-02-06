{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/DialValueIndicator.java",
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
      "begin_line": 81,
      "end_line": 795,
      "comment": "\n * A value indicator for a {@link DialPlot}.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetIndex"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The dataset index. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The angle that defines the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The radius that defines the anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "frameAnchor"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The frame anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "templateValue"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The template value. "
    },
    {
      "type": "field",
      "varNames": [
        "maxTemplateValue"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * A data value that will be formatted to determine the maximum size of\n     * the indicator bounds.  If this is null, the indicator bounds can grow\n     * as large as necessary to contain the actual data value.\n     *\n     * @since 1.0.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The insets. "
    },
    {
      "type": "field",
      "varNames": [
        "valueAnchor"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The value anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The text anchor for displaying the value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.DialValueIndicator()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialValueIndicator\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.DialValueIndicator(int)",
      "begin_line": 150,
      "end_line": 166,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialValueIndicator\u003c/code\u003e.\n     *\n     * @param datasetIndex  the dataset index.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 41)",
        "(line 152,col 9)-(line 152,col 27)",
        "(line 153,col 9)-(line 153,col 26)",
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 47)",
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 157,col 50)",
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 54)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getDatasetIndex()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the index of the dataset from which this indicator fetches its\n     * current value.\n     *\n     * @return The dataset index.\n     *\n     * @see #setDatasetIndex(int)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setDatasetIndex(int)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Sets the dataset index and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param index  the index.\n     *\n     * @see #getDatasetIndex()\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 34)",
        "(line 190,col 9)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getAngle()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns the angle for the anchor point.  The angle is specified in\n     * degrees using the same orientation as Java\u0027s \u003ccode\u003eArc2D\u003c/code\u003e class.\n     *\n     * @return The angle (in degrees).\n     *\n     * @see #setAngle(double)\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setAngle(double)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * Sets the angle for the anchor point and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param angle  the angle (in degrees).\n     *\n     * @see #getAngle()\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 27)",
        "(line 215,col 9)-(line 215,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getRadius()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Returns the radius.\n     *\n     * @return The radius.\n     *\n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setRadius(double)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Sets the radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius.\n     *\n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 29)",
        "(line 239,col 9)-(line 239,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getFrameAnchor()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the frame anchor.\n     *\n     * @return The frame anchor.\n     *\n     * @see #setFrameAnchor(RectangleAnchor)\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setFrameAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 261,
      "end_line": 267,
      "comment": "\n     * Sets the frame anchor and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getFrameAnchor()\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 34)",
        "(line 266,col 9)-(line 266,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getTemplateValue()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the template value.\n     *\n     * @return The template value (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setTemplateValue(Number)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setTemplateValue(java.lang.Number)",
      "begin_line": 288,
      "end_line": 294,
      "comment": "\n     * Sets the template value and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #setTemplateValue(Number)\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getMaxTemplateValue()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns the template value for the maximum size of the indicator\n     * bounds.\n     *\n     * @return The template value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @since 1.0.14\n     *\n     * @see #setMaxTemplateValue(java.lang.Number)\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setMaxTemplateValue(java.lang.Number)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\n     * Sets the template value for the maximum size of the indicator bounds\n     * and sends a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @since 1.0.14\n     *\n     * @see #getMaxTemplateValue()\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 38)",
        "(line 322,col 9)-(line 322,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getNumberFormat()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns the formatter used to format the value.\n     *\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setNumberFormat(NumberFormat)\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setNumberFormat(java.text.NumberFormat)",
      "begin_line": 344,
      "end_line": 350,
      "comment": "\n     * Sets the formatter used to format the value and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param formatter  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getNumberFormat()\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 35)",
        "(line 349,col 9)-(line 349,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getFont()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns the font.\n     *\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #getFont()\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setFont(java.awt.Font)",
      "begin_line": 369,
      "end_line": 375,
      "comment": "\n     * Sets the font and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 25)",
        "(line 374,col 9)-(line 374,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getPaint()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Returns the paint.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setPaint(java.awt.Paint)",
      "begin_line": 396,
      "end_line": 402,
      "comment": "\n     * Sets the paint and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 27)",
        "(line 401,col 9)-(line 401,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getBackgroundPaint()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Returns the background paint.\n     *\n     * @return The background paint.\n     *\n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 423,
      "end_line": 429,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 37)",
        "(line 428,col 9)-(line 428,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getOutlineStroke()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Returns the outline stroke.\n     *\n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setOutlineStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 450,
      "end_line": 456,
      "comment": "\n     * Sets the outline stroke and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getOutlineStroke()\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getOutlinePaint()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Returns the outline paint.\n     *\n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setOutlinePaint(Paint)\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setOutlinePaint(java.awt.Paint)",
      "begin_line": 477,
      "end_line": 483,
      "comment": "\n     * Sets the outline paint and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getOutlinePaint()\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 34)",
        "(line 482,col 9)-(line 482,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getInsets()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Returns the insets.\n     *\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setInsets(RectangleInsets)\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 504,
      "end_line": 510,
      "comment": "\n     * Sets the insets and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getInsets()\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 29)",
        "(line 509,col 9)-(line 509,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getValueAnchor()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Returns the value anchor.\n     *\n     * @return The value anchor (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setValueAnchor(RectangleAnchor)\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setValueAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 531,
      "end_line": 537,
      "comment": "\n     * Sets the value anchor and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getValueAnchor()\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 34)",
        "(line 536,col 9)-(line 536,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.getTextAnchor()",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\n     * Returns the text anchor.\n     *\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setTextAnchor(TextAnchor)\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 558,
      "end_line": 564,
      "comment": "\n     * Sets the text anchor and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getTextAnchor()\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 33)",
        "(line 563,col 9)-(line 563,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.isClippedToWindow()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 586,
      "end_line": 647,
      "comment": "\n     * Draws the background to the specified graphics device.  If the dial\n     * frame specifies a window, the clipping region will already have been\n     * set to this window before this method is called.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (ignored here).\n     * @param frame  the dial frame (ignored here).\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 591,col 29)",
        "(line 592,col 9)-(line 592,col 69)",
        "(line 593,col 9)-(line 593,col 41)",
        "(line 598,col 9)-(line 598,col 54)",
        "(line 599,col 9)-(line 599,col 56)",
        "(line 600,col 9)-(line 600,col 55)",
        "(line 601,col 9)-(line 601,col 80)",
        "(line 604,col 9)-(line 604,col 61)",
        "(line 605,col 9)-(line 605,col 64)",
        "(line 606,col 9)-(line 606,col 36)",
        "(line 607,col 9)-(line 607,col 37)",
        "(line 609,col 9)-(line 609,col 39)",
        "(line 610,col 9)-(line 610,col 39)",
        "(line 611,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 66)",
        "(line 618,col 9)-(line 618,col 67)",
        "(line 621,col 9)-(line 622,col 56)",
        "(line 625,col 9)-(line 625,col 67)",
        "(line 628,col 9)-(line 628,col 42)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 632,col 9)-(line 632,col 41)",
        "(line 633,col 9)-(line 633,col 39)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 637,col 9)-(line 637,col 39)",
        "(line 638,col 9)-(line 638,col 20)",
        "(line 640,col 9)-(line 640,col 76)",
        "(line 641,col 9)-(line 641,col 32)",
        "(line 642,col 9)-(line 642,col 30)",
        "(line 643,col 9)-(line 644,col 53)",
        "(line 645,col 9)-(line 645,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.fixToRange(double, double, double)",
      "begin_line": 659,
      "end_line": 672,
      "comment": "\n     * A utility method that adjusts a value, if necessary, to be within a\n     * specified range.\n     *\n     * @param x  the value.\n     * @param minX  the minimum value in the range.\n     * @param maxX  the maximum value in the range.\n     *\n     * @return The adjusted value.\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.equals(java.lang.Object)",
      "begin_line": 681,
      "end_line": 733,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 59)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.hashCode()",
      "begin_line": 740,
      "end_line": 749,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 25)",
        "(line 742,col 9)-(line 742,col 74)",
        "(line 743,col 9)-(line 744,col 38)",
        "(line 745,col 9)-(line 746,col 35)",
        "(line 747,col 9)-(line 747,col 61)",
        "(line 748,col 9)-(line 748,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.clone()",
      "begin_line": 759,
      "end_line": 761,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return The clone.\n     *\n     * @throws CloneNotSupportedException if some attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 770,
      "end_line": 776,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 36)",
        "(line 772,col 9)-(line 772,col 55)",
        "(line 773,col 9)-(line 773,col 65)",
        "(line 774,col 9)-(line 774,col 62)",
        "(line 775,col 9)-(line 775,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialValueIndicator.readObject(java.io.ObjectInputStream)",
      "begin_line": 786,
      "end_line": 793,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 35)",
        "(line 789,col 9)-(line 789,col 55)",
        "(line 790,col 9)-(line 790,col 65)",
        "(line 791,col 9)-(line 791,col 62)",
        "(line 792,col 9)-(line 792,col 64)"
      ]
    }
  ]
}