{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/CategoryAxis.java",
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
      "begin_line": 133,
      "end_line": 1332,
      "comment": "\r\n * An axis that displays categories.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_MARGIN"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " \r\n     * The default margin for the axis (used for both lower and upper margins).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CATEGORY_MARGIN"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " \r\n     * The default margin between categories (a percentage of the overall axis\r\n     * length). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerMargin"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The amount of space reserved at the start of the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "upperMargin"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The amount of space reserved at the end of the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryMargin"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The amount of space reserved between categories. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryLabelLines"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The maximum number of lines for category labels. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryLabelWidthRatio"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " \r\n     * A ratio that is multiplied by the width of one category to determine the \r\n     * maximum label width. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelPositionOffset"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The category label offset. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelPositions"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " \r\n     * A structure defining the category label positions for each axis \r\n     * location. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFontMap"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Storage for tick label font overrides (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaintMap"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Storage for tick label paint overrides (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "categoryLabelToolTips"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Storage for the category label tooltips (if any). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis.CategoryAxis()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Creates a new category axis with no label.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis.CategoryAxis(java.lang.String)",
      "begin_line": 197,
      "end_line": 215,
      "comment": "\r\n     * Constructs a category axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 21)",
        "(line 201,col 9)-(line 201,col 47)",
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 203,col 54)",
        "(line 204,col 9)-(line 204,col 43)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 207,col 9)-(line 207,col 35)",
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 70)",
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getLowerMargin()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Returns the lower margin for the axis.\r\n     *\r\n     * @return The margin.\r\n     * \r\n     * @see #getUpperMargin()\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setLowerMargin(double)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\r\n     * Sets the lower margin for the axis and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for \r\n     *                example, 0.05 is five percent).\r\n     *                \r\n     * @see #getLowerMargin()\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 34)",
        "(line 240,col 9)-(line 240,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getUpperMargin()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the upper margin for the axis.\r\n     *\r\n     * @return The margin.\r\n     * \r\n     * @see #getLowerMargin()\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setUpperMargin(double)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Sets the upper margin for the axis and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for \r\n     *                example, 0.05 is five percent).\r\n     *                \r\n     * @see #getUpperMargin()\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 34)",
        "(line 266,col 9)-(line 266,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryMargin()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the category margin.\r\n     *\r\n     * @return The margin.\r\n     * \r\n     * @see #setCategoryMargin(double)\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryMargin(double)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\r\n     * Sets the category margin and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.  The overall category margin is distributed over \r\n     * N-1 gaps, where N is the number of categories on the axis.\r\n     *\r\n     * @param margin  the margin as a percentage of the axis length (for \r\n     *                example, 0.05 is five percent).\r\n     *                \r\n     * @see #getCategoryMargin()\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 292,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getMaximumCategoryLabelLines()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns the maximum number of lines to use for each category label.\r\n     * \r\n     * @return The maximum number of lines.\r\n     * \r\n     * @see #setMaximumCategoryLabelLines(int)\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setMaximumCategoryLabelLines(int)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\r\n     * Sets the maximum number of lines to use for each category label and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param lines  the maximum number of lines.\r\n     * \r\n     * @see #getMaximumCategoryLabelLines()\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 47)",
        "(line 316,col 9)-(line 316,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getMaximumCategoryLabelWidthRatio()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the category label width ratio.\r\n     * \r\n     * @return The ratio.\r\n     * \r\n     * @see #setMaximumCategoryLabelWidthRatio(float)\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setMaximumCategoryLabelWidthRatio(float)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\r\n     * Sets the maximum category label width ratio and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param ratio  the ratio.\r\n     * \r\n     * @see #getMaximumCategoryLabelWidthRatio()\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 52)",
        "(line 340,col 9)-(line 340,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelPositionOffset()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns the offset between the axis and the category labels (before \r\n     * label positioning is taken into account).\r\n     * \r\n     * @return The offset (in Java2D units).\r\n     * \r\n     * @see #setCategoryLabelPositionOffset(int)\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryLabelPositionOffset(int)",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\r\n     * Sets the offset between the axis and the category labels (before label \r\n     * positioning is taken into account).\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getCategoryLabelPositionOffset()\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 50)",
        "(line 365,col 9)-(line 365,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelPositions()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\r\n     * Returns the category label position specification (this contains label \r\n     * positioning info for all four possible axis locations).\r\n     * \r\n     * @return The positions (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setCategoryLabelPositions(CategoryLabelPositions)\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setCategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPositions)",
      "begin_line": 388,
      "end_line": 394,
      "comment": "\r\n     * Sets the category label position specification for the axis and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param positions  the positions (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getCategoryLabelPositions()\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 48)",
        "(line 393,col 9)-(line 393,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getTickLabelFont(java.lang.Comparable)",
      "begin_line": 405,
      "end_line": 415,
      "comment": "\r\n     * Returns the font for the tick label for the given category.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelFont(Comparable, Font)\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 65)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setTickLabelFont(java.lang.Comparable, java.awt.Font)",
      "begin_line": 426,
      "end_line": 437,
      "comment": "\r\n     * Sets the font for the tick label for the specified category and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getTickLabelFont(Comparable)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getTickLabelPaint(java.lang.Comparable)",
      "begin_line": 448,
      "end_line": 458,
      "comment": "\r\n     * Returns the paint for the tick label for the given category.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 68)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.setTickLabelPaint(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 469,
      "end_line": 480,
      "comment": "\r\n     * Sets the paint for the tick label for the specified category and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getTickLabelPaint(Comparable)\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.addCategoryLabelToolTip(java.lang.Comparable, java.lang.String)",
      "begin_line": 491,
      "end_line": 497,
      "comment": "\r\n     * Adds a tooltip to the specified category and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003ccode\u003e not permitted).\r\n     * @param tooltip  the tooltip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 58)",
        "(line 496,col 9)-(line 496,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryLabelToolTip(java.lang.Comparable)",
      "begin_line": 510,
      "end_line": 515,
      "comment": "\r\n     * Returns the tool tip text for the label belonging to the specified \r\n     * category.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.removeCategoryLabelToolTip(java.lang.Comparable)",
      "begin_line": 526,
      "end_line": 532,
      "comment": "\r\n     * Removes the tooltip for the specified category and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003ccode\u003e not permitted).\r\n     * \r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #clearCategoryLabelToolTips()\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 52)",
        "(line 531,col 9)-(line 531,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.clearCategoryLabelToolTips()",
      "begin_line": 541,
      "end_line": 544,
      "comment": "\r\n     * Clears the category label tooltips and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @see #addCategoryLabelToolTip(Comparable, String)\r\n     * @see #removeCategoryLabelToolTip(Comparable)\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 43)",
        "(line 543,col 9)-(line 543,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor, int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 557,
      "end_line": 575,
      "comment": "\r\n     * Returns the Java 2D coordinate for a category.\r\n     * \r\n     * @param anchor  the anchor point.\r\n     * @param category  the category index.\r\n     * @param categoryCount  the category count.\r\n     * @param area  the data area.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 28)",
        "(line 564,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryStart(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 590,
      "end_line": 610,
      "comment": "\r\n     * Returns the starting coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     * \r\n     * @see #getCategoryMiddle(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryEnd(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 28)",
        "(line 595,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 79)",
        "(line 604,col 9)-(line 605,col 22)",
        "(line 607,col 9)-(line 607,col 71)",
        "(line 608,col 9)-(line 608,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryMiddle(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 625,
      "end_line": 631,
      "comment": "\r\n     * Returns the middle coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     * \r\n     * @see #getCategoryStart(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryEnd(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 629,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategoryEnd(int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 646,
      "end_line": 652,
      "comment": "\r\n     * Returns the end coordinate for the specified category.\r\n     *\r\n     * @param category  the category.\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the data area.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate.\r\n     * \r\n     * @see #getCategoryStart(int, int, Rectangle2D, RectangleEdge)\r\n     * @see #getCategoryMiddle(int, int, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 650,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.getCategorySeriesMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 669,
      "end_line": 689,
      "comment": "\r\n     * Returns the middle coordinate (in Java2D space) for a series within a \r\n     * category.\r\n     * \r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param itemMargin  the item margin (0.0 \u003c\u003d itemMargin \u003c 1.0);\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The coordinate in Java2D space.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 61)",
        "(line 674,col 9)-(line 674,col 53)",
        "(line 675,col 9)-(line 675,col 57)",
        "(line 676,col 9)-(line 676,col 48)",
        "(line 677,col 9)-(line 678,col 22)",
        "(line 679,col 9)-(line 679,col 78)",
        "(line 680,col 9)-(line 680,col 35)",
        "(line 681,col 9)-(line 688,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateCategorySize(int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 701,
      "end_line": 724,
      "comment": "\r\n     * Calculates the size (width or height, depending on the location of the \r\n     * axis) of a category.\r\n     *\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the area within which the categories will be drawn.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The category size.\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 28)",
        "(line 705,col 9)-(line 705,col 31)",
        "(line 707,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateCategoryGapSize(int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 736,
      "end_line": 757,
      "comment": "\r\n     * Calculates the size (width or height, depending on the location of the \r\n     * axis) of a category gap.\r\n     *\r\n     * @param categoryCount  the number of categories.\r\n     * @param area  the area within which the categories will be drawn.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The category gap width.\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 28)",
        "(line 741,col 9)-(line 741,col 31)",
        "(line 743,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 755,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 770,
      "end_line": 822,
      "comment": "\r\n     * Estimates the space required for the axis, given a specific drawing area.\r\n     *\r\n     * @param g2  the graphics device (used to obtain font information).\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the axis should be drawn.\r\n     * @param edge  the axis location (top or bottom).\r\n     * @param space  the space already reserved.\r\n     *\r\n     * @return The space required to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 785,col 9)-(line 785,col 37)",
        "(line 786,col 9)-(line 786,col 36)",
        "(line 787,col 9)-(line 804,col 9)",
        "(line 807,col 9)-(line 807,col 65)",
        "(line 808,col 9)-(line 808,col 33)",
        "(line 809,col 9)-(line 809,col 32)",
        "(line 810,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.configure()",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\r\n     * Configures the axis against the current plot.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 847,
      "end_line": 872,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axis should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the plot is being drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 857,col 9)",
        "(line 859,col 9)-(line 861,col 9)",
        "(line 864,col 9)-(line 864,col 48)",
        "(line 865,col 9)-(line 866,col 27)",
        "(line 867,col 9)-(line 868,col 27)",
        "(line 870,col 9)-(line 870,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.drawCategoryLabels(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 890,
      "end_line": 995,
      "comment": "\r\n     * Draws the category labels and returns the updated axis state.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area inside the axes (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                  permitted).\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     * \r\n     * @return The updated axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 899,col 9)",
        "(line 901,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1007,
      "end_line": 1068,
      "comment": "\r\n     * Creates a temporary list of ticks that can be used when drawing the axis.\r\n     *\r\n     * @param g2  the graphics device (used to get font measurements).\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 47)",
        "(line 1015,col 9)-(line 1017,col 9)",
        "(line 1019,col 9)-(line 1019,col 53)",
        "(line 1020,col 9)-(line 1020,col 58)",
        "(line 1021,col 9)-(line 1021,col 25)",
        "(line 1023,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1065,col 26)",
        "(line 1066,col 9)-(line 1066,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.createLabel(java.lang.Comparable, float, org.jfree.chart.util.RectangleEdge, java.awt.Graphics2D)",
      "begin_line": 1080,
      "end_line": 1086,
      "comment": "\r\n     * Creates a label.\r\n     *\r\n     * @param category  the category.\r\n     * @param width  the available width. \r\n     * @param edge  the edge on which the axis appears.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return A label.\r\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1084,col 72)",
        "(line 1085,col 9)-(line 1085,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateTextBlockWidth(org.jfree.chart.text.TextBlock, org.jfree.chart.axis.CategoryLabelPosition, java.awt.Graphics2D)",
      "begin_line": 1097,
      "end_line": 1111,
      "comment": "\r\n     * A utility method for determining the width of a text block.\r\n     *\r\n     * @param block  the text block.\r\n     * @param position  the position.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The width.\r\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 54)",
        "(line 1102,col 9)-(line 1102,col 52)",
        "(line 1103,col 9)-(line 1104,col 34)",
        "(line 1105,col 9)-(line 1106,col 28)",
        "(line 1107,col 9)-(line 1108,col 37)",
        "(line 1109,col 9)-(line 1109,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.calculateTextBlockHeight(org.jfree.chart.text.TextBlock, org.jfree.chart.axis.CategoryLabelPosition, java.awt.Graphics2D)",
      "begin_line": 1122,
      "end_line": 1136,
      "comment": "\r\n     * A utility method for determining the height of a text block.\r\n     *\r\n     * @param block  the text block.\r\n     * @param position  the label position.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The height.\r\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 54)",
        "(line 1127,col 9)-(line 1127,col 52)",
        "(line 1128,col 9)-(line 1129,col 34)",
        "(line 1130,col 9)-(line 1131,col 28)",
        "(line 1132,col 9)-(line 1133,col 58)",
        "(line 1134,col 9)-(line 1134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.clone()",
      "begin_line": 1146,
      "end_line": 1152,
      "comment": "\r\n     * Creates a clone of the axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 58)",
        "(line 1148,col 9)-(line 1148,col 68)",
        "(line 1149,col 9)-(line 1149,col 70)",
        "(line 1150,col 9)-(line 1150,col 78)",
        "(line 1151,col 9)-(line 1151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.equals(java.lang.Object)",
      "begin_line": 1161,
      "end_line": 1205,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 47)",
        "(line 1172,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1178,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1184,col 9)",
        "(line 1185,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1196,col 9)",
        "(line 1197,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1204,col 9)-(line 1204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.hashCode()",
      "begin_line": 1212,
      "end_line": 1219,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1228,
      "end_line": 1231,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 36)",
        "(line 1230,col 9)-(line 1230,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1241,
      "end_line": 1245,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 35)",
        "(line 1244,col 9)-(line 1244,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.readPaintMap(java.io.ObjectInputStream)",
      "begin_line": 1260,
      "end_line": 1274,
      "comment": "\r\n     * Reads a \u003ccode\u003eMap\u003c/code\u003e of (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements from a stream.\r\n     * \r\n     * @param in  the input stream.\r\n     * \r\n     * @return The map.\r\n     * \r\n     * @throws IOException\r\n     * @throws ClassNotFoundException\r\n     * \r\n     * @see #writePaintMap(Map, ObjectOutputStream)\r\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 42)",
        "(line 1263,col 9)-(line 1265,col 9)",
        "(line 1266,col 9)-(line 1266,col 35)",
        "(line 1267,col 9)-(line 1267,col 33)",
        "(line 1268,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.writePaintMap(java.util.Map, java.io.ObjectOutputStream)",
      "begin_line": 1287,
      "end_line": 1304,
      "comment": "\r\n     * Writes a map of (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements to a stream.\r\n     * \r\n     * @param map  the map (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @param out\r\n     * @throws IOException\r\n     * \r\n     * @see #readPaintMap(ObjectInputStream)\r\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis.equalPaintMaps(java.util.Map, java.util.Map)",
      "begin_line": 1315,
      "end_line": 1330,
      "comment": "\r\n     * Tests two maps containing (\u003ccode\u003eComparable\u003c/code\u003e, \u003ccode\u003ePaint\u003c/code\u003e)\r\n     * elements for equality.\r\n     * \r\n     * @param map1  the first map (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param map2  the second map (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1319,col 38)",
        "(line 1320,col 9)-(line 1320,col 47)",
        "(line 1321,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1329,col 20)"
      ]
    }
  ]
}