{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/CategoryLabelPositions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLabelPositions",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 460,
      "comment": "\r\n * Records the label positions for a category axis.  Instances of this class\r\n * are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD"
      ],
      "begin_line": 63,
      "end_line": 79,
      "comment": " STANDARD category label positions. "
    },
    {
      "type": "field",
      "varNames": [
        "UP_90"
      ],
      "begin_line": 82,
      "end_line": 104,
      "comment": " UP_90 category label positions. "
    },
    {
      "type": "field",
      "varNames": [
        "DOWN_90"
      ],
      "begin_line": 107,
      "end_line": 129,
      "comment": " DOWN_90 category label positions. "
    },
    {
      "type": "field",
      "varNames": [
        "UP_45"
      ],
      "begin_line": 132,
      "end_line": 133,
      "comment": " UP_45 category label positions. "
    },
    {
      "type": "field",
      "varNames": [
        "DOWN_45"
      ],
      "begin_line": 136,
      "end_line": 137,
      "comment": " DOWN_45 category label positions. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(double)",
      "begin_line": 147,
      "end_line": 171,
      "comment": "\r\n     * Creates a new instance where the category labels angled upwards by the\r\n     * specified amount.\r\n     *\r\n     * @param angle  the rotation angle (should be \u003c Math.PI / 2.0).\r\n     *\r\n     * @return A category label position specification.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 170,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions(double)",
      "begin_line": 181,
      "end_line": 205,
      "comment": "\r\n     * Creates a new instance where the category labels angled downwards by the\r\n     * specified amount.\r\n     *\r\n     * @param angle  the rotation angle (should be \u003c Math.PI / 2.0).\r\n     *\r\n     * @return A category label position specification.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 204,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "positionForAxisAtTop"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\r\n     * The label positioning details used when an axis is at the top of a\r\n     * chart.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positionForAxisAtBottom"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": "\r\n     * The label positioning details used when an axis is at the bottom of a\r\n     * chart.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positionForAxisAtLeft"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * The label positioning details used when an axis is at the left of a\r\n     * chart.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "positionForAxisAtRight"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\r\n     * The label positioning details used when an axis is at the right of a\r\n     * chart.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.CategoryLabelPositions()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 64)",
        "(line 236,col 9)-(line 236,col 67)",
        "(line 237,col 9)-(line 237,col 65)",
        "(line 238,col 9)-(line 238,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.CategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPosition, org.jfree.chart.axis.CategoryLabelPosition, org.jfree.chart.axis.CategoryLabelPosition, org.jfree.chart.axis.CategoryLabelPosition)",
      "begin_line": 253,
      "end_line": 276,
      "comment": "\r\n     * Creates a new position specification.\r\n     *\r\n     * @param top  the label position info used when an axis is at the top\r\n     *             (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param bottom  the label position info used when an axis is at the\r\n     *                bottom (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param left  the label position info used when an axis is at the left\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param right  the label position info used when an axis is at the right\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.getLabelPosition(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 286,
      "end_line": 301,
      "comment": "\r\n     * Returns the category label position specification for an axis at the\r\n     * given location.\r\n     *\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The category label position specification.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 44)",
        "(line 288,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(org.jfree.chart.axis.CategoryLabelPositions, org.jfree.chart.axis.CategoryLabelPosition)",
      "begin_line": 312,
      "end_line": 328,
      "comment": "\r\n     * Returns a new instance based on an existing instance but with the top\r\n     * position changed.\r\n     *\r\n     * @param base  the base (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param top  the top position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 327,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(org.jfree.chart.axis.CategoryLabelPositions, org.jfree.chart.axis.CategoryLabelPosition)",
      "begin_line": 339,
      "end_line": 355,
      "comment": "\r\n     * Returns a new instance based on an existing instance but with the bottom\r\n     * position changed.\r\n     *\r\n     * @param base  the base (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param bottom  the bottom position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 354,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(org.jfree.chart.axis.CategoryLabelPositions, org.jfree.chart.axis.CategoryLabelPosition)",
      "begin_line": 366,
      "end_line": 382,
      "comment": "\r\n     * Returns a new instance based on an existing instance but with the left\r\n     * position changed.\r\n     *\r\n     * @param base  the base (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param left  the left position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 381,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.replaceRightPosition(org.jfree.chart.axis.CategoryLabelPositions, org.jfree.chart.axis.CategoryLabelPosition)",
      "begin_line": 393,
      "end_line": 409,
      "comment": "\r\n     * Returns a new instance based on an existing instance but with the right\r\n     * position changed.\r\n     *\r\n     * @param base  the base (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param right  the right position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 408,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.equals(java.lang.Object)",
      "begin_line": 419,
      "end_line": 445,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 67)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPositions.hashCode()",
      "begin_line": 452,
      "end_line": 459,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 24)",
        "(line 454,col 9)-(line 454,col 68)",
        "(line 455,col 9)-(line 455,col 71)",
        "(line 456,col 9)-(line 456,col 69)",
        "(line 457,col 9)-(line 457,col 70)",
        "(line 458,col 9)-(line 458,col 22)"
      ]
    }
  ]
}