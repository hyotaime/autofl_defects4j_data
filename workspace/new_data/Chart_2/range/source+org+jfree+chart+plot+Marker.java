{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/Marker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Marker",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 94,
      "end_line": 681,
      "comment": "\r\n * The base class for markers that can be added to plots to highlight a value\r\n * or range of values.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * An event notification mechanism was added to this class in JFreeChart\r\n * version 1.0.3.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The outline paint. "
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
        "alpha"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The alpha transparency. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The label font. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelAnchor"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The label position. "
    },
    {
      "type": "field",
      "varNames": [
        "labelTextAnchor"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The text anchor for the label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffset"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The label offset from the marker rectangle. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffsetType"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\r\n     * The offset type for the domain or range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Storage for registered change listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Marker.Marker()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Creates a new marker with default attributes.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Marker.Marker(java.awt.Paint)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\r\n     * Constructs a new marker.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 154,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Marker.Marker(java.awt.Paint, java.awt.Stroke, java.awt.Paint, java.awt.Stroke, float)",
      "begin_line": 171,
      "end_line": 199,
      "comment": "\r\n     * Constructs a new marker.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param alpha  the alpha transparency (must be in the range 0.0f to\r\n     *     1.0f).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e or\r\n     *     \u003ccode\u003estroke\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, or \u003ccode\u003ealpha\u003c/code\u003e is\r\n     *     not in the specified range.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 75)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 29)",
        "(line 187,col 9)-(line 187,col 41)",
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 195,col 61)",
        "(line 196,col 9)-(line 196,col 49)",
        "(line 198,col 9)-(line 198,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getPaint()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Returns the paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setPaint(java.awt.Paint)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\r\n     * Sets the paint and sends a {@link MarkerChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 27)",
        "(line 225,col 9)-(line 225,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getStroke()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the stroke.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setStroke(java.awt.Stroke)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\r\n     * Sets the stroke and sends a {@link MarkerChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getStroke()\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getOutlinePaint()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The outline paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setOutlinePaint(java.awt.Paint)",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\r\n     * Sets the outline paint and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 34)",
        "(line 276,col 9)-(line 276,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getOutlineStroke()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The outline stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\r\n     * Sets the outline stroke and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 36)",
        "(line 300,col 9)-(line 300,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getAlpha()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the alpha transparency.\r\n     *\r\n     * @return The alpha transparency.\r\n     *\r\n     * @see #setAlpha(float)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setAlpha(float)",
      "begin_line": 328,
      "end_line": 334,
      "comment": "\r\n     * Sets the alpha transparency that should be used when drawing the\r\n     * marker, and sends a {@link MarkerChangeEvent} to all registered\r\n     * listeners.  The alpha transparency is a value in the range 0.0f\r\n     * (completely transparent) to 1.0f (completely opaque).\r\n     *\r\n     * @param alpha  the alpha transparency (must be in the range 0.0f to\r\n     *     1.0f).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     *\r\n     * @see #getAlpha()\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 75)",
        "(line 332,col 9)-(line 332,col 27)",
        "(line 333,col 9)-(line 333,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabel()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the label (if \u003ccode\u003enull\u003c/code\u003e no label is displayed).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabel(String)\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabel(java.lang.String)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\r\n     * Sets the label (if \u003ccode\u003enull\u003c/code\u003e no label is displayed) and sends a\r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabel()\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 27)",
        "(line 357,col 9)-(line 357,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelFont()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\r\n     * Returns the label font.\r\n     *\r\n     * @return The label font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelFont(java.awt.Font)",
      "begin_line": 379,
      "end_line": 385,
      "comment": "\r\n     * Sets the label font and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 30)",
        "(line 384,col 9)-(line 384,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelPaint()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\r\n     * Returns the label paint.\r\n     *\r\n     * @return The label paint (never \u003c/code\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelPaint(java.awt.Paint)",
      "begin_line": 406,
      "end_line": 412,
      "comment": "\r\n     * Sets the label paint and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 32)",
        "(line 411,col 9)-(line 411,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelAnchor()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Returns the label anchor.  This defines the position of the label\r\n     * anchor, relative to the bounds of the marker.\r\n     *\r\n     * @return The label anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelAnchor(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\r\n     * Sets the label anchor and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.  The anchor defines the position of the label\r\n     * anchor, relative to the bounds of the marker.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelAnchor()\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 34)",
        "(line 440,col 9)-(line 440,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelOffset()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\r\n     * Returns the label offset.\r\n     *\r\n     * @return The label offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelOffset(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\r\n     * Sets the label offset and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param offset  the label offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 34)",
        "(line 467,col 9)-(line 467,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelOffsetType()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns the label offset type.\r\n     *\r\n     * @return The type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelOffsetType(LengthAdjustmentType)\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelOffsetType(org.jfree.chart.util.LengthAdjustmentType)",
      "begin_line": 489,
      "end_line": 495,
      "comment": "\r\n     * Sets the label offset type and sends a {@link MarkerChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param adj  the type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelOffsetType()\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 35)",
        "(line 494,col 9)-(line 494,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getLabelTextAnchor()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\r\n     * Returns the label text anchor.\r\n     *\r\n     * @return The label text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.setLabelTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 516,
      "end_line": 522,
      "comment": "\r\n     * Sets the label text anchor and sends a {@link MarkerChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param anchor  the label text anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 38)",
        "(line 521,col 9)-(line 521,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.addChangeListener(org.jfree.chart.event.MarkerChangeListener)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\r\n     * Registers an object for notification of changes to the marker.\r\n     *\r\n     * @param listener  the object to be registered.\r\n     *\r\n     * @see #removeChangeListener(MarkerChangeListener)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.removeChangeListener(org.jfree.chart.event.MarkerChangeListener)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "\r\n     * Unregisters an object for notification of changes to the marker.\r\n     *\r\n     * @param listener  the object to be unregistered.\r\n     *\r\n     * @see #addChangeListener(MarkerChangeListener)\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.notifyListeners(org.jfree.chart.event.MarkerChangeEvent)",
      "begin_line": 557,
      "end_line": 566,
      "comment": "\r\n     * Notifies all registered listeners that the marker has been modified.\r\n     *\r\n     * @param event  information about the change event.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 65)",
        "(line 560,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.getListeners(java.lang.Class)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\r\n     * Returns an array containing all the listeners of the specified type.\r\n     *\r\n     * @param listenerType  the listener type.\r\n     *\r\n     * @return The array of listeners.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.equals(java.lang.Object)",
      "begin_line": 588,
      "end_line": 633,
      "comment": "\r\n     * Tests the marker for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 35)",
        "(line 596,col 9)-(line 598,col 9)",
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
        "(line 632,col 9)-(line 632,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.clone()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Creates a clone of the marker.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException never.\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 653,
      "end_line": 660,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 36)",
        "(line 655,col 9)-(line 655,col 55)",
        "(line 656,col 9)-(line 656,col 57)",
        "(line 657,col 9)-(line 657,col 62)",
        "(line 658,col 9)-(line 658,col 64)",
        "(line 659,col 9)-(line 659,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Marker.readObject(java.io.ObjectInputStream)",
      "begin_line": 670,
      "end_line": 679,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 35)",
        "(line 673,col 9)-(line 673,col 55)",
        "(line 674,col 9)-(line 674,col 57)",
        "(line 675,col 9)-(line 675,col 62)",
        "(line 676,col 9)-(line 676,col 64)",
        "(line 677,col 9)-(line 677,col 60)",
        "(line 678,col 9)-(line 678,col 52)"
      ]
    }
  ]
}