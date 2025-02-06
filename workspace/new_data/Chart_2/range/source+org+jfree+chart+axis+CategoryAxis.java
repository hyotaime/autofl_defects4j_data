{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/CategoryAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Axis",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 144,
      "end_line": 1476,
      "comment": "\r\n * An axis that displays categories.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_MARGIN"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\r\n     * The default margin for the axis (used for both lower and upper margins).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CATEGORY_MARGIN"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\r\n     * The default margin between categories (a percentage of the overall axis\r\n     * length).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerMargin"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The amount of space reserved at the start of the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "upperMargin"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The amount of space reserved at the end of the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryMargin"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The amount of space reserved between categories. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryLabelLines"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The maximum number of lines for category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryLabelWidthRatio"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\r\n     * A ratio that is multiplied by the width of one category to determine the\r\n     * maximum label width.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelPositionOffset"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The category label offset. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelPositions"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": "\r\n     * A structure defining the category label positions for each axis\r\n     * location.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFontMap"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Storage for tick label font overrides (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaintMap"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Storage for tick label paint overrides (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelToolTips"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Storage for the category label tooltips (if any). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis.CategoryAxis()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Creates a new category axis with no label.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis.CategoryAxis(java.lang.String)",
      "begin_line": 208,
      "end_line": 224,
      "comment": "\r\n     * Constructs a category axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 21)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 214,col 54)",
        "(line 215,col 9)-(line 215,col 43)",
        "(line 216,col 9)-(line 216,col 51)",
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 70)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 221,col 47)",
        "(line 222,col 9)-(line 222,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getLowerMargin()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the lower margin for the axis.\r\n     *\r\n     * @return The margin.\r\n     *\r\n     * @see #getUpperMargin()\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setLowerMargin(double)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\r\n     * Sets the lower margin for the axis and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for\r\n     *                example, 0.05 is five percent).\r\n     *\r\n     * @see #getLowerMargin()\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 34)",
        "(line 249,col 9)-(line 249,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getUpperMargin()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the upper margin for the axis.\r\n     *\r\n     * @return The margin.\r\n     *\r\n     * @see #getLowerMargin()\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setUpperMargin(double)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\r\n     * Sets the upper margin for the axis and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for\r\n     *                example, 0.05 is five percent).\r\n     *\r\n     * @see #getUpperMargin()\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 34)",
        "(line 275,col 9)-(line 275,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryMargin()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the category margin.\r\n     *\r\n     * @return The margin.\r\n     *\r\n     * @see #setCategoryMargin(double)\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryMargin(double)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\r\n     * Sets the category margin and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.  The overall category margin is distributed over\r\n     * N-1 gaps, where N is the number of categories on the axis.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for\r\n     *                example, 0.05 is five percent).\r\n     *\r\n     * @see #getCategoryMargin()\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 37)",
        "(line 301,col 9)-(line 301,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getMaximumCategoryLabelLines()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\r\n     * Returns the maximum number of lines to use for each category label.\r\n     *\r\n     * @return The maximum number of lines.\r\n     *\r\n     * @see #setMaximumCategoryLabelLines(int)\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setMaximumCategoryLabelLines(int)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\r\n     * Sets the maximum number of lines to use for each category label and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param lines  the maximum number of lines.\r\n     *\r\n     * @see #getMaximumCategoryLabelLines()\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 47)",
        "(line 325,col 9)-(line 325,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getMaximumCategoryLabelWidthRatio()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the category label width ratio.\r\n     *\r\n     * @return The ratio.\r\n     *\r\n     * @see #setMaximumCategoryLabelWidthRatio(float)\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setMaximumCategoryLabelWidthRatio(float)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\r\n     * Sets the maximum category label width ratio and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param ratio  the ratio.\r\n     *\r\n     * @see #getMaximumCategoryLabelWidthRatio()\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 52)",
        "(line 349,col 9)-(line 349,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelPositionOffset()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns the offset between the axis and the category labels (before\r\n     * label positioning is taken into account).\r\n     *\r\n     * @return The offset (in Java2D units).\r\n     *\r\n     * @see #setCategoryLabelPositionOffset(int)\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryLabelPositionOffset(int)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\r\n     * Sets the offset between the axis and the category labels (before label\r\n     * positioning is taken into account).\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getCategoryLabelPositionOffset()\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 50)",
        "(line 374,col 9)-(line 374,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelPositions()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\r\n     * Returns the category label position specification (this contains label\r\n     * positioning info for all four possible axis locations).\r\n     *\r\n     * @return The positions (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCategoryLabelPositions(CategoryLabelPositions)\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPositions)",
      "begin_line": 397,
      "end_line": 403,
      "comment": "\r\n     * Sets the category label position specification for the axis and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param positions  the positions (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getCategoryLabelPositions()\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 402,col 9)-(line 402,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getTickLabelFont(java.lang.Comparable)",
      "begin_line": 414,
      "end_line": 424,
      "comment": "\r\n     * Returns the font for the tick label for the given category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFont(Comparable, Font)\r\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 65)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setTickLabelFont(java.lang.Comparable, java.awt.Font)",
      "begin_line": 435,
      "end_line": 446,
      "comment": "\r\n     * Sets the font for the tick label for the specified category and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getTickLabelFont(Comparable)\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getTickLabelPaint(java.lang.Comparable)",
      "begin_line": 457,
      "end_line": 467,
      "comment": "\r\n     * Returns the paint for the tick label for the given category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 68)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setTickLabelPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 478,
      "end_line": 489,
      "comment": "\r\n     * Sets the paint for the tick label for the specified category and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getTickLabelPaint(Comparable)\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.addCategoryLabelToolTip(java.lang.Comparable, java.lang.String)",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\r\n     * Adds a tooltip to the specified category and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003ccode\u003e not permitted).\r\n     * @param tooltip  the tooltip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 58)",
        "(line 505,col 9)-(line 505,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelToolTip(java.lang.Comparable)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\r\n     * Returns the tool tip text for the label belonging to the specified\r\n     * category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.removeCategoryLabelToolTip(java.lang.Comparable)",
      "begin_line": 535,
      "end_line": 541,
      "comment": "\r\n     * Removes the tooltip for the specified category and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003ccode\u003e not permitted).\r\n     *\r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #clearCategoryLabelToolTips()\r\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 52)",
        "(line 540,col 9)-(line 540,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.clearCategoryLabelToolTips()",
      "begin_line": 550,
      "end_line": 553,
      "comment": "\r\n     * Clears the category label tooltips and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 43)",
        "(line 552,col 9)-(line 552,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor, int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 566,
      "end_line": 584,
      "comment": "\r\n     * Returns the Java 2D coordinate for a category.\r\n     *\r\n     * @param anchor  the anchor point.\r\n     * @param category  the category index.\r\n     * @param categoryCount  the category count.\r\n     * @param area  the data area.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 28)",
        "(line 573,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryStart(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 599,
      "end_line": 619,
      "comment": "\r\n     * Returns the starting coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     *\r\n     * @see #getCategoryMiddle(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryEnd(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 28)",
        "(line 604,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 79)",
        "(line 613,col 9)-(line 614,col 22)",
        "(line 616,col 9)-(line 616,col 71)",
        "(line 617,col 9)-(line 617,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryMiddle(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 634,
      "end_line": 644,
      "comment": "\r\n     * Returns the middle coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     *\r\n     * @see #getCategoryStart(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryEnd(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 642,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryEnd(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 659,
      "end_line": 665,
      "comment": "\r\n     * Returns the end coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     *\r\n     * @see #getCategoryStart(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryMiddle(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 663,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryMiddle(java.lang.Comparable, java.util.List, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 684,
      "end_line": 692,
      "comment": "\r\n     * A convenience method that returns the axis coordinate for the centre of\r\n     * a category.\r\n     *\r\n     * @param category  the category key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param categories  the categories (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param area  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge along which the axis lies (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @return The centre coordinate.\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getCategorySeriesMiddle(Comparable, Comparable, CategoryDataset,\r\n     *     double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 57)",
        "(line 690,col 9)-(line 690,col 46)",
        "(line 691,col 9)-(line 691,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategorySeriesMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 709,
      "end_line": 729,
      "comment": "\r\n     * Returns the middle coordinate (in Java2D space) for a series within a\r\n     * category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param itemMargin  the item margin (0.0 \u003c\u003d itemMargin \u003c 1.0);\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The coordinate in Java2D space.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 61)",
        "(line 714,col 9)-(line 714,col 53)",
        "(line 715,col 9)-(line 715,col 57)",
        "(line 716,col 9)-(line 716,col 48)",
        "(line 717,col 9)-(line 718,col 22)",
        "(line 719,col 9)-(line 719,col 78)",
        "(line 720,col 9)-(line 720,col 35)",
        "(line 721,col 9)-(line 728,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategorySeriesMiddle(int, int, int, int, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 747,
      "end_line": 763,
      "comment": "\r\n     * Returns the middle coordinate (in Java2D space) for a series within a\r\n     * category.\r\n     *\r\n     * @param categoryIndex  the category index.\r\n     * @param categoryCount  the category count.\r\n     * @param seriesIndex the series index.\r\n     * @param seriesCount the series count.\r\n     * @param itemMargin  the item margin (0.0 \u003c\u003d itemMargin \u003c 1.0);\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The coordinate in Java2D space.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 752,col 22)",
        "(line 753,col 9)-(line 753,col 78)",
        "(line 754,col 9)-(line 754,col 35)",
        "(line 755,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateCategorySize(int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 775,
      "end_line": 798,
      "comment": "\r\n     * Calculates the size (width or height, depending on the location of the\r\n     * axis) of a category.\r\n     *\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the area within which the categories will be drawn.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The category size.\r\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 28)",
        "(line 779,col 9)-(line 779,col 31)",
        "(line 781,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateCategoryGapSize(int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 810,
      "end_line": 831,
      "comment": "\r\n     * Calculates the size (width or height, depending on the location of the\r\n     * axis) of a category gap.\r\n     *\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the area within which the categories will be drawn.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The category gap width.\r\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 28)",
        "(line 815,col 9)-(line 815,col 31)",
        "(line 817,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 844,
      "end_line": 896,
      "comment": "\r\n     * Estimates the space required for the axis, given a specific drawing area.\r\n     *\r\n     * @param g2  the graphics device (used to obtain font information).\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the axis should be drawn.\r\n     * @param edge  the axis location (top or bottom).\r\n     * @param space  the space already reserved.\r\n     *\r\n     * @return The space required to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 851,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 859,col 9)-(line 859,col 37)",
        "(line 860,col 9)-(line 860,col 36)",
        "(line 861,col 9)-(line 878,col 9)",
        "(line 881,col 9)-(line 881,col 65)",
        "(line 882,col 9)-(line 882,col 33)",
        "(line 883,col 9)-(line 883,col 32)",
        "(line 884,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.configure()",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\r\n     * Configures the axis against the current plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 921,
      "end_line": 947,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axis should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the plot is being drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 928,col 9)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 48)",
        "(line 934,col 9)-(line 936,col 9)",
        "(line 938,col 9)-(line 938,col 69)",
        "(line 941,col 9)-(line 942,col 27)",
        "(line 943,col 9)-(line 944,col 27)",
        "(line 945,col 9)-(line 945,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.drawCategoryLabels(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 965,
      "end_line": 1070,
      "comment": "\r\n     * Draws the category labels and returns the updated axis state.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area inside the axes (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                  permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return The updated axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1082,
      "end_line": 1144,
      "comment": "\r\n     * Creates a temporary list of ticks that can be used when drawing the axis.\r\n     *\r\n     * @param g2  the graphics device (used to get font measurements).\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 47)",
        "(line 1090,col 9)-(line 1092,col 9)",
        "(line 1094,col 9)-(line 1094,col 53)",
        "(line 1095,col 9)-(line 1095,col 58)",
        "(line 1096,col 9)-(line 1096,col 25)",
        "(line 1098,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1141,col 26)",
        "(line 1142,col 9)-(line 1142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.drawTickMarks(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState)",
      "begin_line": 1151,
      "end_line": 1213,
      "comment": "\r\n     * Draws the tick marks.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1154,col 27)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1158,col 45)",
        "(line 1159,col 9)-(line 1159,col 46)",
        "(line 1160,col 9)-(line 1160,col 47)",
        "(line 1161,col 9)-(line 1161,col 42)",
        "(line 1162,col 9)-(line 1162,col 58)",
        "(line 1163,col 9)-(line 1163,col 40)",
        "(line 1164,col 9)-(line 1164,col 42)",
        "(line 1165,col 9)-(line 1212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.createLabel(java.lang.Comparable, float, org.jfree.chart.util.RectangleEdge, java.awt.Graphics2D)",
      "begin_line": 1225,
      "end_line": 1231,
      "comment": "\r\n     * Creates a label.\r\n     *\r\n     * @param category  the category.\r\n     * @param width  the available width.\r\n     * @param edge  the edge on which the axis appears.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return A label.\r\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1229,col 72)",
        "(line 1230,col 9)-(line 1230,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateTextBlockWidth(org.jfree.chart.text.TextBlock, org.jfree.chart.axis.CategoryLabelPosition, java.awt.Graphics2D)",
      "begin_line": 1242,
      "end_line": 1255,
      "comment": "\r\n     * A utility method for determining the width of a text block.\r\n     *\r\n     * @param block  the text block.\r\n     * @param position  the position.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The width.\r\n     ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1245,col 54)",
        "(line 1246,col 9)-(line 1246,col 52)",
        "(line 1247,col 9)-(line 1248,col 34)",
        "(line 1249,col 9)-(line 1250,col 28)",
        "(line 1251,col 9)-(line 1252,col 36)",
        "(line 1253,col 9)-(line 1253,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateTextBlockHeight(org.jfree.chart.text.TextBlock, org.jfree.chart.axis.CategoryLabelPosition, java.awt.Graphics2D)",
      "begin_line": 1266,
      "end_line": 1280,
      "comment": "\r\n     * A utility method for determining the height of a text block.\r\n     *\r\n     * @param block  the text block.\r\n     * @param position  the label position.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The height.\r\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 54)",
        "(line 1271,col 9)-(line 1271,col 52)",
        "(line 1272,col 9)-(line 1273,col 34)",
        "(line 1274,col 9)-(line 1275,col 28)",
        "(line 1276,col 9)-(line 1277,col 58)",
        "(line 1278,col 9)-(line 1278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.clone()",
      "begin_line": 1290,
      "end_line": 1296,
      "comment": "\r\n     * Creates a clone of the axis.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1291,col 58)",
        "(line 1292,col 9)-(line 1292,col 68)",
        "(line 1293,col 9)-(line 1293,col 70)",
        "(line 1294,col 9)-(line 1294,col 78)",
        "(line 1295,col 9)-(line 1295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.equals(java.lang.Object)",
      "begin_line": 1305,
      "end_line": 1349,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1308,col 9)",
        "(line 1309,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 47)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.hashCode()",
      "begin_line": 1356,
      "end_line": 1363,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1372,
      "end_line": 1375,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 36)",
        "(line 1374,col 9)-(line 1374,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1385,
      "end_line": 1389,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 35)",
        "(line 1388,col 9)-(line 1388,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.readPaintMap(java.io.ObjectInputStream)",
      "begin_line": 1404,
      "end_line": 1418,
      "comment": "\r\n     * Reads a \u003ccode\u003eMap\u003c/code\u003e of (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements from a stream.\r\n     *\r\n     * @param in  the input stream.\r\n     *\r\n     * @return The map.\r\n     *\r\n     * @throws IOException\r\n     * @throws ClassNotFoundException\r\n     *\r\n     * @see #writePaintMap(Map, ObjectOutputStream)\r\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 42)",
        "(line 1407,col 9)-(line 1409,col 9)",
        "(line 1410,col 9)-(line 1410,col 35)",
        "(line 1411,col 9)-(line 1411,col 33)",
        "(line 1412,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1417,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.writePaintMap(java.util.Map, java.io.ObjectOutputStream)",
      "begin_line": 1431,
      "end_line": 1448,
      "comment": "\r\n     * Writes a map of (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements to a stream.\r\n     *\r\n     * @param map  the map (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @param out\r\n     * @throws IOException\r\n     *\r\n     * @see #readPaintMap(ObjectInputStream)\r\n     ",
      "child_ranges": [
        "(line 1433,col 9)-(line 1447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.equalPaintMaps(java.util.Map, java.util.Map)",
      "begin_line": 1459,
      "end_line": 1474,
      "comment": "\r\n     * Tests two maps containing (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements for equality.\r\n     *\r\n     * @param map1  the first map (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param map2  the second map (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1462,col 9)",
        "(line 1463,col 9)-(line 1463,col 38)",
        "(line 1464,col 9)-(line 1464,col 47)",
        "(line 1465,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1473,col 20)"
      ]
    }
  ]
}