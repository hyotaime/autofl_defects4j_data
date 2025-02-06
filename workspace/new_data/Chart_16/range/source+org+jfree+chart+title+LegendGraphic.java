{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/LegendGraphic.java",
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
      "end_line": 760,
      "comment": "\r\n * The graphical item within a legend item.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "shapeVisible"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " \r\n     * A flag that controls whether or not the shape is visible - see also \r\n     * lineVisible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " \r\n     * The shape to display.  To allow for accurate positioning, the center\r\n     * of the shape should be at (0, 0). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeLocation"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\r\n     * Defines the location within the block to which the shape will be aligned.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeAnchor"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " \r\n     * Defines the point on the shape\u0027s bounding rectangle that will be \r\n     * aligned to the drawing location when the shape is rendered.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeFilled"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " A flag that controls whether or not the shape is filled. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The fill paint for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaintTransformer"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\r\n     * The fill paint transformer (used if the fillPaint is an instance of\r\n     * GradientPaint).\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "shapeOutlineVisible"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " A flag that controls whether or not the shape outline is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The outline paint for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The outline stroke for the shape. "
    },
    {
      "type": "field",
      "varNames": [
        "lineVisible"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " \r\n     * A flag that controls whether or not the line is visible - see also \r\n     * shapeVisible. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The line. "
    },
    {
      "type": "field",
      "varNames": [
        "lineStroke"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "linePaint"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The line paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.LegendGraphic.LegendGraphic(java.awt.Shape, java.awt.Paint)",
      "begin_line": 152,
      "end_line": 167,
      "comment": "\r\n     * Creates a new legend graphic.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param fillPaint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 161,col 50)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 165,col 9)-(line 165,col 75)",
        "(line 166,col 9)-(line 166,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeVisible()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns a flag that controls whether or not the shape\r\n     * is visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setShapeVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeVisible(boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape is \r\n     * visible.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isShapeVisible()\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShape()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the shape.\r\n     * \r\n     * @return The shape.\r\n     * \r\n     * @see #setShape(Shape)\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShape(java.awt.Shape)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Sets the shape.\r\n     * \r\n     * @param shape  the shape.\r\n     * \r\n     * @see #getShape()\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeFilled()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns a flag that controls whether or not the shapes\r\n     * are filled.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setShapeFilled(boolean)\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeFilled(boolean)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape is\r\n     * filled.\r\n     * \r\n     * @param filled  the flag.\r\n     * \r\n     * @see #isShapeFilled()\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getFillPaint()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Returns the paint used to fill the shape.\r\n     * \r\n     * @return The fill paint.\r\n     * \r\n     * @see #setFillPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setFillPaint(java.awt.Paint)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Sets the paint used to fill the shape.\r\n     * \r\n     * @param paint  the paint.\r\n     * \r\n     * @see #getFillPaint()\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getFillPaintTransformer()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\r\n     * Returns the transformer used when the fill paint is an instance of \r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     * \r\n     * @return The transformer (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.4.\r\n     * \r\n     * @see #setFillPaintTransformer(GradientPaintTransformer)\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setFillPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 285,
      "end_line": 290,
      "comment": "\r\n     * Sets the transformer used when the fill paint is an instance of \r\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\r\n     * \r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.4\r\n     * \r\n     * @see #getFillPaintTransformer()\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isShapeOutlineVisible()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns a flag that controls whether the shape outline is visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setShapeOutlineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeOutlineVisible(boolean)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\r\n     * Sets a flag that controls whether or not the shape outline\r\n     * is visible.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isShapeOutlineVisible()\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getOutlinePaint()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the outline paint.\r\n     * \r\n     * @return The paint.\r\n     * \r\n     * @see #setOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setOutlinePaint(java.awt.Paint)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Sets the outline paint.\r\n     * \r\n     * @param paint  the paint.\r\n     * \r\n     * @see #getOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getOutlineStroke()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns the outline stroke.\r\n     * \r\n     * @return The stroke.\r\n     * \r\n     * @see #setOutlineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Sets the outline stroke.\r\n     * \r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getOutlineStroke()\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShapeAnchor()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the shape anchor.\r\n     * \r\n     * @return The shape anchor.\r\n     * \r\n     * @see #getShapeAnchor()\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 378,
      "end_line": 383,
      "comment": "\r\n     * Sets the shape anchor.  This defines a point on the shapes bounding\r\n     * rectangle that will be used to align the shape to a location.\r\n     * \r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setShapeAnchor(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getShapeLocation()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Returns the shape location.\r\n     * \r\n     * @return The shape location.\r\n     * \r\n     * @see #setShapeLocation(RectangleAnchor)\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setShapeLocation(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 404,
      "end_line": 409,
      "comment": "\r\n     * Sets the shape location.  This defines a point within the drawing\r\n     * area that will be used to align the shape to.\r\n     * \r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getShapeLocation()\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.isLineVisible()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\r\n     * Returns the flag that controls whether or not the line is visible.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setLineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLineVisible(boolean)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\r\n     * Sets the flag that controls whether or not the line is visible.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isLineVisible()\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLine()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\r\n     * Returns the line centered about (0, 0).\r\n     * \r\n     * @return The line.\r\n     * \r\n     * @see #setLine(Shape)\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLine(java.awt.Shape)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\r\n     * Sets the line.  A Shape is used here, because then you can use Line2D, \r\n     * GeneralPath or any other Shape to represent the line.\r\n     * \r\n     * @param line  the line.\r\n     * \r\n     * @see #getLine()\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLinePaint()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\r\n     * Returns the line paint.\r\n     * \r\n     * @return The paint.\r\n     * \r\n     * @see #setLinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLinePaint(java.awt.Paint)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\r\n     * Sets the line paint.\r\n     * \r\n     * @param paint  the paint.\r\n     * \r\n     * @see #getLinePaint()\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.getLineStroke()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\r\n     * Returns the line stroke.\r\n     * \r\n     * @return The stroke.\r\n     * \r\n     * @see #setLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.setLineStroke(java.awt.Stroke)",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\r\n     * Sets the line stroke.\r\n     * \r\n     * @param stroke  the stroke.\r\n     * \r\n     * @see #getLineStroke()\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 509,
      "end_line": 554,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 80)",
        "(line 511,col 9)-(line 511,col 76)",
        "(line 512,col 9)-(line 512,col 77)",
        "(line 513,col 9)-(line 513,col 34)",
        "(line 514,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 553,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.arrangeNN(java.awt.Graphics2D)",
      "begin_line": 565,
      "end_line": 574,
      "comment": "\r\n     * Performs the layout with no constraint, so the content size is \r\n     * determined by the bounds of the shape and/or line drawn to represent \r\n     * the series.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return  The content size.\r\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 59)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 582,
      "end_line": 621,
      "comment": "\r\n     * Draws the graphic item within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 32)",
        "(line 585,col 9)-(line 585,col 29)",
        "(line 586,col 9)-(line 586,col 32)",
        "(line 587,col 9)-(line 587,col 33)",
        "(line 589,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 632,
      "end_line": 635,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 23)",
        "(line 634,col 9)-(line 634,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.equals(java.lang.Object)",
      "begin_line": 645,
      "end_line": 694,
      "comment": "\r\n     * Tests this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 49)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.hashCode()",
      "begin_line": 701,
      "end_line": 706,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 25)",
        "(line 703,col 9)-(line 703,col 72)",
        "(line 705,col 9)-(line 705,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.clone()",
      "begin_line": 715,
      "end_line": 720,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance.\r\n     * \r\n     * @return A clone of this \u003ccode\u003eLegendGraphic\u003c/code\u003e instance.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 60)",
        "(line 717,col 9)-(line 717,col 55)",
        "(line 718,col 9)-(line 718,col 53)",
        "(line 719,col 9)-(line 719,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 729,
      "end_line": 738,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 36)",
        "(line 731,col 9)-(line 731,col 55)",
        "(line 732,col 9)-(line 732,col 59)",
        "(line 733,col 9)-(line 733,col 62)",
        "(line 734,col 9)-(line 734,col 64)",
        "(line 735,col 9)-(line 735,col 54)",
        "(line 736,col 9)-(line 736,col 59)",
        "(line 737,col 9)-(line 737,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.LegendGraphic.readObject(java.io.ObjectInputStream)",
      "begin_line": 748,
      "end_line": 758,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 35)",
        "(line 751,col 9)-(line 751,col 55)",
        "(line 752,col 9)-(line 752,col 59)",
        "(line 753,col 9)-(line 753,col 62)",
        "(line 754,col 9)-(line 754,col 64)",
        "(line 755,col 9)-(line 755,col 54)",
        "(line 756,col 9)-(line 756,col 59)",
        "(line 757,col 9)-(line 757,col 61)"
      ]
    }
  ]
}