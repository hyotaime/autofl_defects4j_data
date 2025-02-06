{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/title/LegendGraphic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendGraphic",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 82,
      "end_line": 763,
      "comment": "\r\n * The graphical item within a legend item.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "shapeVisible"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\r\n     * A flag that controls whether or not the shape is visible - see also\r\n     * lineVisible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\r\n     * The shape to display.  To allow for accurate positioning, the center\r\n     * of the shape should be at (0, 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeLocation"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Defines the location within the block to which the shape will be aligned.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeAnchor"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * Defines the point on the shape\u0027s bounding rectangle that will be\r\n     * aligned to the drawing location when the shape is rendered.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeFilled"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A flag that controls whether or not the shape is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The fill paint for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintTransformer"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * The fill paint transformer (used if the fillPaint is an instance of\r\n     * GradientPaint).\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeOutlineVisible"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A flag that controls whether or not the shape outline is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The outline paint for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The outline stroke for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "lineVisible"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\r\n     * A flag that controls whether or not the line is visible - see also\r\n     * shapeVisible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The line. "
    },
    {
      "type": "field",
      "varNames": [
        "lineStroke"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "linePaint"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The line paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.LegendGraphic.LegendGraphic(java.awt.Shape, java.awt.Paint)",
      "begin_line": 155,
      "end_line": 170,
      "comment": "\r\n     * Creates a new legend graphic.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 33)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 52)",
        "(line 166,col 9)-(line 166,col 32)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 168,col 75)",
        "(line 169,col 9)-(line 169,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeVisible()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns a flag that controls whether or not the shape\r\n     * is visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setShapeVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeVisible(boolean)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape is\r\n     * visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isShapeVisible()\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShape()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the shape.\r\n     *\r\n     * @return The shape.\r\n     *\r\n     * @see #setShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShape(java.awt.Shape)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Sets the shape.\r\n     *\r\n     * @param shape  the shape.\r\n     *\r\n     * @see #getShape()\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeFilled()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns a flag that controls whether or not the shapes\r\n     * are filled.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setShapeFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeFilled(boolean)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape is\r\n     * filled.\r\n     *\r\n     * @param filled  the flag.\r\n     *\r\n     * @see #isShapeFilled()\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getFillPaint()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Returns the paint used to fill the shape.\r\n     *\r\n     * @return The fill paint.\r\n     *\r\n     * @see #setFillPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setFillPaint(java.awt.Paint)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Sets the paint used to fill the shape.\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getFillPaint()\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getFillPaintTransformer()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns the transformer used when the fill paint is an instance of\r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     *\r\n     * @return The transformer (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.4.\r\n     *\r\n     * @see #setFillPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 288,
      "end_line": 293,
      "comment": "\r\n     * Sets the transformer used when the fill paint is an instance of\r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     *\r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @see #getFillPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeOutlineVisible()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns a flag that controls whether the shape outline is visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setShapeOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeOutlineVisible(boolean)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape outline\r\n     * is visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isShapeOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getOutlinePaint()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setOutlinePaint(java.awt.Paint)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\r\n     * Sets the outline paint.\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getOutlineStroke()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The stroke.\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Sets the outline stroke.\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShapeAnchor()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns the shape anchor.\r\n     *\r\n     * @return The shape anchor.\r\n     *\r\n     * @see #getShapeAnchor()\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\r\n     * Sets the shape anchor.  This defines a point on the shapes bounding\r\n     * rectangle that will be used to align the shape to a location.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setShapeAnchor(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShapeLocation()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\r\n     * Returns the shape location.\r\n     *\r\n     * @return The shape location.\r\n     *\r\n     * @see #setShapeLocation(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeLocation(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 407,
      "end_line": 412,
      "comment": "\r\n     * Sets the shape location.  This defines a point within the drawing\r\n     * area that will be used to align the shape to.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getShapeLocation()\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isLineVisible()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns the flag that controls whether or not the line is visible.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setLineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLineVisible(boolean)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Sets the flag that controls whether or not the line is visible.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isLineVisible()\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLine()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\r\n     * Returns the line centered about (0, 0).\r\n     *\r\n     * @return The line.\r\n     *\r\n     * @see #setLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLine(java.awt.Shape)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\r\n     * Sets the line.  A Shape is used here, because then you can use Line2D,\r\n     * GeneralPath or any other Shape to represent the line.\r\n     *\r\n     * @param line  the line.\r\n     *\r\n     * @see #getLine()\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLinePaint()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\r\n     * Returns the line paint.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setLinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLinePaint(java.awt.Paint)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Sets the line paint.\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getLinePaint()\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLineStroke()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Returns the line stroke.\r\n     *\r\n     * @return The stroke.\r\n     *\r\n     * @see #setLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLineStroke(java.awt.Stroke)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Sets the line stroke.\r\n     *\r\n     * @param stroke  the stroke.\r\n     *\r\n     * @see #getLineStroke()\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 512,
      "end_line": 557,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 80)",
        "(line 514,col 9)-(line 514,col 76)",
        "(line 515,col 9)-(line 515,col 77)",
        "(line 516,col 9)-(line 516,col 34)",
        "(line 517,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 556,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.arrangeNN(java.awt.Graphics2D)",
      "begin_line": 568,
      "end_line": 577,
      "comment": "\r\n     * Performs the layout with no constraint, so the content size is\r\n     * determined by the bounds of the shape and/or line drawn to represent\r\n     * the series.\r\n     *\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return  The content size.\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 59)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 585,
      "end_line": 624,
      "comment": "\r\n     * Draws the graphic item within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 32)",
        "(line 588,col 9)-(line 588,col 29)",
        "(line 589,col 9)-(line 589,col 32)",
        "(line 590,col 9)-(line 590,col 33)",
        "(line 592,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 635,
      "end_line": 638,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 23)",
        "(line 637,col 9)-(line 637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.equals(java.lang.Object)",
      "begin_line": 648,
      "end_line": 697,
      "comment": "\r\n     * Tests this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 49)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.hashCode()",
      "begin_line": 704,
      "end_line": 709,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 25)",
        "(line 706,col 9)-(line 706,col 72)",
        "(line 708,col 9)-(line 708,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.clone()",
      "begin_line": 718,
      "end_line": 723,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance.\r\n     *\r\n     * @return A clone of this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 60)",
        "(line 720,col 9)-(line 720,col 55)",
        "(line 721,col 9)-(line 721,col 53)",
        "(line 722,col 9)-(line 722,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 732,
      "end_line": 741,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 36)",
        "(line 734,col 9)-(line 734,col 55)",
        "(line 735,col 9)-(line 735,col 59)",
        "(line 736,col 9)-(line 736,col 62)",
        "(line 737,col 9)-(line 737,col 64)",
        "(line 738,col 9)-(line 738,col 54)",
        "(line 739,col 9)-(line 739,col 59)",
        "(line 740,col 9)-(line 740,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.readObject(java.io.ObjectInputStream)",
      "begin_line": 751,
      "end_line": 761,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 35)",
        "(line 754,col 9)-(line 754,col 55)",
        "(line 755,col 9)-(line 755,col 59)",
        "(line 756,col 9)-(line 756,col 62)",
        "(line 757,col 9)-(line 757,col 64)",
        "(line 758,col 9)-(line 758,col 54)",
        "(line 759,col 9)-(line 759,col 59)",
        "(line 760,col 9)-(line 760,col 61)"
      ]
    }
  ]
}