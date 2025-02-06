{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/RectangleInsets.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangleInsets",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 554,
      "comment": "\n * Represents the insets for a rectangle, specified in absolute or relative \n * terms. This class is immutable.\n "
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
        "ZERO_INSETS"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * A useful constant representing zero insets.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "unitType"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Absolute or relative units. "
    },
    {
      "type": "field",
      "varNames": [
        "top"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The top insets. "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The left insets. "
    },
    {
      "type": "field",
      "varNames": [
        "bottom"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The bottom insets. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The right insets. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RectangleInsets.RectangleInsets()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Creates a new instance with all insets initialised to \u003ccode\u003e1.0\u003c/code\u003e.\n     * \n     * @since 1.0.9\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RectangleInsets.RectangleInsets(double, double, double, double)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Creates a new instance with the specified insets (as \u0027absolute\u0027 units).\n     * \n     * @param top  the top insets.\n     * @param left  the left insets.\n     * @param bottom  the bottom insets.\n     * @param right  the right insets.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RectangleInsets.RectangleInsets(org.jfree.chart.util.UnitType, double, double, double, double)",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Creates a new instance.\n     * \n     * @param unitType  absolute or relative units (\u003ccode\u003enull\u003c/code\u003e not \n     *                  permitted).\n     * @param top  the top insets.\n     * @param left  the left insets.\n     * @param bottom  the bottom insets.\n     * @param right  the right insets.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 23)",
        "(line 122,col 9)-(line 122,col 29)",
        "(line 123,col 9)-(line 123,col 25)",
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.getUnitType()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns the unit type (absolute or relative).  This specifies whether \n     * the insets are measured as Java2D units or percentages.\n     * \n     * @return The unit type (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.getTop()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns the top insets.\n     * \n     * @return The top insets.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.getBottom()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the bottom insets.\n     * \n     * @return The bottom insets.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.getLeft()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the left insets.\n     * \n     * @return The left insets.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.getRight()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the right insets.\n     * \n     * @return The right insets.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.equals(java.lang.Object)",
      "begin_line": 180,
      "end_line": 204,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 59)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.hashCode()",
      "begin_line": 211,
      "end_line": 224,
      "comment": "\n     * Returns a hash code for the object.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 19)",
        "(line 213,col 9)-(line 213,col 18)",
        "(line 214,col 9)-(line 214,col 72)",
        "(line 215,col 9)-(line 215,col 74)",
        "(line 216,col 9)-(line 216,col 60)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 218,col 60)",
        "(line 219,col 9)-(line 219,col 76)",
        "(line 220,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 221,col 78)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.toString()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Returns a textual representation of this instance, useful for debugging\n     * purposes.\n     * \n     * @return A string representing this instance.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 234,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.createAdjustedRectangle(java.awt.geom.Rectangle2D, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.LengthAdjustmentType)",
      "begin_line": 250,
      "end_line": 280,
      "comment": "\n     * Creates an adjusted rectangle using the supplied rectangle, the insets\n     * specified by this instance, and the horizontal and vertical \n     * adjustment types.\n     * \n     * @param base  the base rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param horizontal  the horizontal adjustment type (\u003ccode\u003enull\u003c/code\u003e not\n     *                    permitted).\n     * @param vertical  the vertical adjustment type (\u003ccode\u003enull\u003c/code\u003e not \n     *                  permitted).\n     * \n     * @return The inset rectangle.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 31)",
        "(line 256,col 9)-(line 256,col 31)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 36)",
        "(line 259,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.createInsetRectangle(java.awt.geom.Rectangle2D)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Creates an \u0027inset\u0027 rectangle.\n     * \n     * @param base  the base rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @return The inset rectangle.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.createInsetRectangle(java.awt.geom.Rectangle2D, boolean, boolean)",
      "begin_line": 302,
      "end_line": 325,
      "comment": "\n     * Creates an \u0027inset\u0027 rectangle.\n     * \n     * @param base  the base rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param horizontal  apply horizontal insets?\n     * @param vertical  apply vertical insets?\n     * \n     * @return The inset rectangle.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 31)",
        "(line 308,col 9)-(line 308,col 34)",
        "(line 309,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 32)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 324,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.createOutsetRectangle(java.awt.geom.Rectangle2D)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Creates an outset rectangle.\n     * \n     * @param base  the base rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @return An outset rectangle.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.createOutsetRectangle(java.awt.geom.Rectangle2D, boolean, boolean)",
      "begin_line": 347,
      "end_line": 371,
      "comment": "\n     * Creates an outset rectangle.\n     * \n     * @param base  the base rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param horizontal  apply horizontal insets?\n     * @param vertical  apply vertical insets? \n     * \n     * @return An outset rectangle.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 34)",
        "(line 355,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 32)",
        "(line 360,col 9)-(line 360,col 33)",
        "(line 361,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 370,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateTopInset(double)",
      "begin_line": 380,
      "end_line": 386,
      "comment": "\n     * Returns the top margin.\n     * \n     * @param height  the height of the base rectangle.\n     * \n     * @return The top margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 33)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateTopOutset(double)",
      "begin_line": 395,
      "end_line": 401,
      "comment": "\n     * Returns the top margin.\n     * \n     * @param height  the height of the base rectangle.\n     * \n     * @return The top margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 33)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateBottomInset(double)",
      "begin_line": 410,
      "end_line": 416,
      "comment": "\n     * Returns the bottom margin.\n     * \n     * @param height  the height of the base rectangle.\n     * \n     * @return The bottom margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 36)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateBottomOutset(double)",
      "begin_line": 425,
      "end_line": 431,
      "comment": "\n     * Returns the bottom margin.\n     * \n     * @param height  the height of the base rectangle.\n     * \n     * @return The bottom margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 36)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateLeftInset(double)",
      "begin_line": 440,
      "end_line": 446,
      "comment": "\n     * Returns the left margin.\n     * \n     * @param width  the width of the base rectangle.\n     * \n     * @return The left margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 34)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateLeftOutset(double)",
      "begin_line": 455,
      "end_line": 461,
      "comment": "\n     * Returns the left margin.\n     * \n     * @param width  the width of the base rectangle.\n     * \n     * @return The left margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 34)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateRightInset(double)",
      "begin_line": 470,
      "end_line": 476,
      "comment": "\n     * Returns the right margin.\n     * \n     * @param width  the width of the base rectangle.\n     * \n     * @return The right margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 35)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.calculateRightOutset(double)",
      "begin_line": 485,
      "end_line": 491,
      "comment": "\n     * Returns the right margin.\n     * \n     * @param width  the width of the base rectangle.\n     * \n     * @return The right margin (in Java2D units).\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 35)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.trimWidth(double)",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * Trims the given width to allow for the insets.\n     * \n     * @param width  the width.\n     * \n     * @return The trimmed width.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.extendWidth(double)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Extends the given width to allow for the insets.\n     * \n     * @param width  the width.\n     * \n     * @return The extended width.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.trimHeight(double)",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * Trims the given height to allow for the insets.\n     * \n     * @param height  the height.\n     * \n     * @return The trimmed height.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 524,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.extendHeight(double)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\n     * Extends the given height to allow for the insets.\n     * \n     * @param height  the height.\n     * \n     * @return The extended height.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 536,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleInsets.trim(java.awt.geom.Rectangle2D)",
      "begin_line": 544,
      "end_line": 552,
      "comment": "\n     * Shrinks the given rectangle by the amount of these insets.\n     * \n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 35)",
        "(line 546,col 9)-(line 546,col 36)",
        "(line 547,col 9)-(line 547,col 41)",
        "(line 548,col 9)-(line 548,col 42)",
        "(line 549,col 9)-(line 549,col 40)",
        "(line 550,col 9)-(line 550,col 43)",
        "(line 551,col 9)-(line 551,col 77)"
      ]
    }
  ]
}