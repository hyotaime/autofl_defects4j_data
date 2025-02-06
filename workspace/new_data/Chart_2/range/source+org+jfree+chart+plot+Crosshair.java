{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/Crosshair.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Crosshair",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 736,
      "comment": "\n * A crosshair for display on a plot.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Flag controlling visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The paint for the crosshair line. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The stroke for the crosshair line. "
    },
    {
      "type": "field",
      "varNames": [
        "labelVisible"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * A flag that controls whether or not the crosshair has a label\n     * visible.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelAnchor"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The label anchor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelGenerator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " A label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "labelXOffset"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * The x-offset in Java2D units.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelYOffset"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * The y-offset in Java2D units.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * The label font.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * The label paint.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelBackgroundPaint"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The label background paint.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineVisible"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " A flag that controls the visibility of the label outline. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlineStroke"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The label outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOutlinePaint"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The label outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "pcs"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Property change support. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Crosshair.Crosshair()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Creates a new crosshair with value 0.0.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Crosshair.Crosshair(double)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Creates a new crosshair with the specified value.\n     *\n     * @param value  the value.\n     ",
      "child_ranges": [
        "(line 145,col 8)-(line 145,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.Crosshair.Crosshair(double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 155,
      "end_line": 178,
      "comment": "\n     * Creates a new crosshair value with the specified value and line style.\n     *\n     * @param value  the value.\n     * @param paint  the line paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 29)",
        "(line 166,col 9)-(line 166,col 34)",
        "(line 167,col 9)-(line 167,col 68)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 170,col 9)-(line 170,col 32)",
        "(line 171,col 9)-(line 171,col 60)",
        "(line 172,col 9)-(line 172,col 38)",
        "(line 173,col 9)-(line 173,col 61)",
        "(line 174,col 9)-(line 174,col 40)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 56)",
        "(line 177,col 9)-(line 177,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.isVisible()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the flag that indicates whether or not the crosshair is\n     * currently visible.\n     *\n     * @return A boolean.\n     *\n     * @see #setVisible(boolean)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setVisible(boolean)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Sets the flag that controls the visibility of the crosshair and sends\n     * a proerty change event (with the name \u0027visible\u0027) to all registered\n     * listeners.\n     *\n     * @param visible  the new flag value.\n     *\n     * @see #isVisible()\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 35)",
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 204,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getValue()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Returns the crosshair value.\n     *\n     * @return The crosshair value.\n     *\n     * @see #setValue(double)\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setValue(double)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * Sets the crosshair value and sends a property change event with the name\n     * \u0027value\u0027 to all registered listeners.\n     *\n     * @param value  the value.\n     *\n     * @see #getValue()\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 49)",
        "(line 228,col 9)-(line 228,col 27)",
        "(line 229,col 9)-(line 229,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getPaint()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns the paint for the crosshair line.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setPaint(java.awt.Paint)\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setPaint(java.awt.Paint)",
      "begin_line": 251,
      "end_line": 255,
      "comment": "\n     * Sets the paint for the crosshair line and sends a property change event\n     * with the name \"paint\" to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 31)",
        "(line 253,col 9)-(line 253,col 27)",
        "(line 254,col 9)-(line 254,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getStroke()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns the stroke for the crosshair line.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setStroke(java.awt.Stroke)\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setStroke(java.awt.Stroke)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\n     * Sets the stroke for the crosshair line and sends a property change event\n     * with the name \"stroke\" to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getStroke()\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 29)",
        "(line 279,col 9)-(line 279,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.isLabelVisible()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Returns the flag that controls whether or not a label is drawn for\n     * this crosshair.\n     *\n     * @return A boolean.\n     *\n     * @see #setLabelVisible(boolean)\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelVisible(boolean)",
      "begin_line": 303,
      "end_line": 307,
      "comment": "\n     * Sets the flag that controls whether or not a label is drawn for the\n     * crosshair and sends a property change event (with the name\n     * \u0027labelVisible\u0027) to all registered listeners.\n     *\n     * @param visible  the new flag value.\n     *\n     * @see #isLabelVisible()\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 40)",
        "(line 305,col 9)-(line 305,col 36)",
        "(line 306,col 9)-(line 306,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelGenerator()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Returns the crosshair label generator.\n     *\n     * @return The label crosshair generator (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelGenerator(org.jfree.chart.labels.CrosshairLabelGenerator)\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelGenerator(org.jfree.chart.labels.CrosshairLabelGenerator)",
      "begin_line": 328,
      "end_line": 335,
      "comment": "\n     * Sets the crosshair label generator and sends a property change event\n     * (with the name \u0027labelGenerator\u0027) to all registered listeners.\n     *\n     * @param generator  the new generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelGenerator()\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 58)",
        "(line 333,col 9)-(line 333,col 40)",
        "(line 334,col 9)-(line 334,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelAnchor()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Returns the label anchor point.\n     *\n     * @return the label anchor point (never \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @see #setLabelAnchor(org.jfree.ui.RectangleAnchor)\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Sets the label anchor point and sends a property change event (with the\n     * name \u0027labelAnchor\u0027) to all registered listeners.\n     *\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelAnchor()\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 358,col 34)",
        "(line 359,col 9)-(line 359,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelXOffset()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * Returns the x-offset for the label (in Java2D units).\n     *\n     * @return The x-offset.\n     *\n     * @see #setLabelXOffset(double)\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelXOffset(double)",
      "begin_line": 381,
      "end_line": 385,
      "comment": "\n     * Sets the x-offset and sends a property change event (with the name\n     * \u0027labelXOffset\u0027) to all registered listeners.\n     *\n     * @param offset  the new offset.\n     *\n     * @see #getLabelXOffset()\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 51)",
        "(line 383,col 9)-(line 383,col 35)",
        "(line 384,col 9)-(line 384,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelYOffset()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Returns the y-offset for the label (in Java2D units).\n     *\n     * @return The y-offset.\n     *\n     * @see #setLabelYOffset(double)\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelYOffset(double)",
      "begin_line": 406,
      "end_line": 410,
      "comment": "\n     * Sets the y-offset and sends a property change event (with the name\n     * \u0027labelYOffset\u0027) to all registered listeners.\n     *\n     * @param offset  the new offset.\n     *\n     * @see #getLabelYOffset()\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 51)",
        "(line 408,col 9)-(line 408,col 35)",
        "(line 409,col 9)-(line 409,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelFont()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Returns the label font.\n     *\n     * @return The label font (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelFont(java.awt.Font)\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelFont(java.awt.Font)",
      "begin_line": 431,
      "end_line": 438,
      "comment": "\n     * Sets the label font and sends a property change event (with the name\n     * \u0027labelFont\u0027) to all registered listeners.\n     *\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelFont()\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 34)",
        "(line 436,col 9)-(line 436,col 30)",
        "(line 437,col 9)-(line 437,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelPaint()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Returns the label paint.\n     *\n     * @return The label paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelPaint\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelPaint(java.awt.Paint)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "\n     * Sets the label paint and sends a property change event (with the name\n     * \u0027labelPaint\u0027) to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelPaint()\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 32)",
        "(line 465,col 9)-(line 465,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelBackgroundPaint()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Returns the label background paint.\n     *\n     * @return The label background paint (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelBackgroundPaint(java.awt.Paint)\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelBackgroundPaint(java.awt.Paint)",
      "begin_line": 487,
      "end_line": 491,
      "comment": "\n     * Sets the label background paint and sends a property change event with\n     * the name \u0027labelBackgroundPaint\u0027) to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @see #getLabelBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 46)",
        "(line 489,col 9)-(line 489,col 42)",
        "(line 490,col 9)-(line 490,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.isLabelOutlineVisible()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Returns the flag that controls the visibility of the label outline.\n     *\n     * @return A boolean.\n     *\n     * @see #setLabelOutlineVisible(boolean)\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelOutlineVisible(boolean)",
      "begin_line": 513,
      "end_line": 517,
      "comment": "\n     * Sets the flag that controls the visibility of the label outlines and\n     * sends a property change event (with the name \"labelOutlineVisible\") to\n     * all registered listeners.\n     *\n     * @param visible  the new flag value.\n     *\n     * @see #isLabelOutlineVisible()\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 47)",
        "(line 515,col 9)-(line 515,col 43)",
        "(line 516,col 9)-(line 516,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelOutlinePaint()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Returns the label outline paint.\n     *\n     * @return The label outline paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelOutlinePaint(java.awt.Paint)\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelOutlinePaint(java.awt.Paint)",
      "begin_line": 538,
      "end_line": 545,
      "comment": "\n     * Sets the label outline paint and sends a property change event (with the\n     * name \"labelOutlinePaint\") to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelOutlinePaint()\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 43)",
        "(line 543,col 9)-(line 543,col 39)",
        "(line 544,col 9)-(line 544,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.getLabelOutlineStroke()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Returns the label outline stroke.\n     *\n     * @return The label outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setLabelOutlineStroke(java.awt.Stroke)\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.setLabelOutlineStroke(java.awt.Stroke)",
      "begin_line": 566,
      "end_line": 573,
      "comment": "\n     * Sets the label outline stroke and sends a property change event (with\n     * the name \u0027labelOutlineStroke\u0027) to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabelOutlineStroke()\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 571,col 41)",
        "(line 572,col 9)-(line 572,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.equals(java.lang.Object)",
      "begin_line": 582,
      "end_line": 638,
      "comment": "\n     * Tests this crosshair for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 41)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.hashCode()",
      "begin_line": 645,
      "end_line": 663,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 21)",
        "(line 647,col 9)-(line 647,col 58)",
        "(line 648,col 9)-(line 648,col 56)",
        "(line 649,col 9)-(line 649,col 56)",
        "(line 650,col 9)-(line 650,col 57)",
        "(line 651,col 9)-(line 651,col 63)",
        "(line 652,col 9)-(line 652,col 62)",
        "(line 653,col 9)-(line 653,col 65)",
        "(line 654,col 9)-(line 654,col 63)",
        "(line 655,col 9)-(line 655,col 63)",
        "(line 656,col 9)-(line 656,col 60)",
        "(line 657,col 9)-(line 657,col 61)",
        "(line 658,col 9)-(line 658,col 71)",
        "(line 659,col 9)-(line 659,col 70)",
        "(line 660,col 9)-(line 660,col 69)",
        "(line 661,col 9)-(line 661,col 68)",
        "(line 662,col 9)-(line 662,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.clone()",
      "begin_line": 672,
      "end_line": 675,
      "comment": "\n     * Returns an independent copy of this instance.\n     *\n     * @return An independent copy of this instance.\n     *\n     * @throws java.lang.CloneNotSupportedException\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.addPropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Adds a property change listener.\n     *\n     * @param l  the listener.\n     *\n     * @see #removePropertyChangeListener(java.beans.PropertyChangeListener)\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.removePropertyChangeListener(java.beans.PropertyChangeListener)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * Removes a property change listener.\n     *\n     * @param l  the listener.\n     *\n     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 706,
      "end_line": 714,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 36)",
        "(line 708,col 9)-(line 708,col 55)",
        "(line 709,col 9)-(line 709,col 57)",
        "(line 710,col 9)-(line 710,col 60)",
        "(line 711,col 9)-(line 711,col 70)",
        "(line 712,col 9)-(line 712,col 69)",
        "(line 713,col 9)-(line 713,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.Crosshair.readObject(java.io.ObjectInputStream)",
      "begin_line": 724,
      "end_line": 734,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 35)",
        "(line 727,col 9)-(line 727,col 55)",
        "(line 728,col 9)-(line 728,col 57)",
        "(line 729,col 9)-(line 729,col 60)",
        "(line 730,col 9)-(line 730,col 70)",
        "(line 731,col 9)-(line 731,col 69)",
        "(line 732,col 9)-(line 732,col 67)",
        "(line 733,col 9)-(line 733,col 51)"
      ]
    }
  ]
}