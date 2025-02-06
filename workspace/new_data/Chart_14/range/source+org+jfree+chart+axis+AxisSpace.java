{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/AxisSpace.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisSpace",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 379,
      "comment": "\r\n * A record that contains the space required at each edge of a plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "top"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The top space. "
    },
    {
      "type": "field",
      "varNames": [
        "bottom"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The bottom space. "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The left space. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The right space. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.AxisSpace.AxisSpace()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\r\n     * Creates a new axis space record.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 24)",
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.getTop()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the space reserved for axes at the top of the plot area.\r\n     * \r\n     * @return The space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.setTop(double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Sets the space reserved for axes at the top of the plot area. \r\n     * \r\n     * @param space  the space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.getBottom()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns the space reserved for axes at the bottom of the plot area.\r\n     * \r\n     * @return The space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.setBottom(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Sets the space reserved for axes at the bottom of the plot area. \r\n     * \r\n     * @param space  the space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.getLeft()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the space reserved for axes at the left of the plot area.\r\n     * \r\n     * @return The space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.setLeft(double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Sets the space reserved for axes at the left of the plot area. \r\n     * \r\n     * @param space  the space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.getRight()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns the space reserved for axes at the right of the plot area.\r\n     * \r\n     * @return The space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.setRight(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Sets the space reserved for axes at the right of the plot area. \r\n     * \r\n     * @param space  the space (in Java2D units).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.add(double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 164,
      "end_line": 183,
      "comment": "\r\n     * Adds space to the top, bottom, left or right edge of the plot area.\r\n     * \r\n     * @param space  the space (in Java2D units).\r\n     * @param edge  the edge (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.ensureAtLeast(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\r\n     * Ensures that this object reserves at least as much space as another.\r\n     * \r\n     * @param space  the other space.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 49)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.ensureAtLeast(double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 204,
      "end_line": 230,
      "comment": "\r\n     * Ensures there is a minimum amount of space at the edge corresponding to \r\n     * the specified axis location.\r\n     * \r\n     * @param space  the space.\r\n     * @param edge  the location.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.shrink(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 240,
      "end_line": 251,
      "comment": "\r\n     * Shrinks an area by the space attributes.\r\n     * \r\n     * @param area  the area to shrink.\r\n     * @param result  an optional carrier for the result.\r\n     * \r\n     * @return The result.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 249,col 10)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.expand(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 261,
      "end_line": 272,
      "comment": "\r\n     * Expands an area by the amount of space represented by this object.\r\n     * \r\n     * @param area  the area to expand.\r\n     * @param result  an optional carrier for the result.\r\n     * \r\n     * @return The result.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 270,col 10)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.reserved(java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 282,
      "end_line": 307,
      "comment": "\r\n     * Calculates the reserved area.\r\n     * \r\n     * @param area  the area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return The reserved area.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 34)",
        "(line 284,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.clone()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\r\n     * Returns a clone of the object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException This class won\u0027t throw this exception,\r\n     *         but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.equals(java.lang.Object)",
      "begin_line": 328,
      "end_line": 349,
      "comment": "\r\n     * Tests this object for equality with another object.\r\n     * \r\n     * @param obj  the object to compare against.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 41)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.hashCode()",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 24)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 54)",
        "(line 360,col 9)-(line 360,col 49)",
        "(line 361,col 9)-(line 361,col 54)",
        "(line 362,col 9)-(line 362,col 47)",
        "(line 363,col 9)-(line 363,col 54)",
        "(line 364,col 9)-(line 364,col 48)",
        "(line 365,col 9)-(line 365,col 54)",
        "(line 366,col 9)-(line 366,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisSpace.toString()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\r\n     * Returns a string representing the object (for debugging purposes).\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 376,col 74)"
      ]
    }
  ]
}