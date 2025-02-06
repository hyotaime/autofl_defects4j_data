{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 410,
      "comment": "\r\n * Represents an immutable range of values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The lower bound of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The upper bound of the range. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.Range.Range(double, double)",
      "begin_line": 86,
      "end_line": 94,
      "comment": "\r\n     * Creates a new range.\r\n     *\r\n     * @param lower  the lower bound (must be \u003c\u003d upper bound).\r\n     * @param upper  the upper bound (must be \u003e\u003d lower bound).\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getLowerBound()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the lower bound for the range.\r\n     *\r\n     * @return The lower bound.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getUpperBound()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns the upper bound for the range.\r\n     *\r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getLength()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the length of the range.\r\n     *\r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getCentralValue()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the central value for the range.\r\n     *\r\n     * @return The central value.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.contains(double)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range contains the specified value and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param value  the value to lookup.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range contains the specified value.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.intersects(double, double)",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range intersects with the specified\r\n     * range, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param b0  the lower bound (should be \u003c\u003d b1).\r\n     * @param b1  the upper bound (should be \u003e\u003d b0).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.intersects(org.jfree.data.Range)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range intersects with the specified\r\n     * range, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param range  another range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.constrain(double)",
      "begin_line": 184,
      "end_line": 195,
      "comment": "\r\n     * Returns the value within the range that is closest to the specified\r\n     * value.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The constrained value.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 30)",
        "(line 186,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.combine(org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 213,
      "end_line": 229,
      "comment": "\r\n     * Creates a new range by combining two existing ranges.\r\n     * \u003cP\u003e\r\n     * Note that:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eeither range can be \u003ccode\u003enull\u003c/code\u003e, in which case the other\r\n     *       range is returned;\u003c/li\u003e\r\n     *   \u003cli\u003eif both ranges are \u003ccode\u003enull\u003c/code\u003e the return value is\r\n     *       \u003ccode\u003enull\u003c/code\u003e.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param range1  the first range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param range2  the second range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A new range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.expandToInclude(org.jfree.data.Range, double)",
      "begin_line": 242,
      "end_line": 255,
      "comment": "\r\n     * Returns a range that includes all the values in the specified\r\n     * \u003ccode\u003erange\u003c/code\u003e AND the specified \u003ccode\u003evalue\u003c/code\u003e.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param value  the value that must be included.\r\n     *\r\n     * @return A range.\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.expand(org.jfree.data.Range, double, double)",
      "begin_line": 268,
      "end_line": 281,
      "comment": "\r\n     * Creates a new range by adding margins to an existing range.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lowerMargin  the lower margin (expressed as a percentage of the\r\n     *                     range length).\r\n     * @param upperMargin  the upper margin (expressed as a percentage of the\r\n     *                     range length).\r\n     *\r\n     * @return The expanded range.\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 68)",
        "(line 275,col 9)-(line 275,col 68)",
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shift(org.jfree.data.Range, double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Shifts the range by the specified amount.\r\n     *\r\n     * @param base  the base range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param delta  the shift amount.\r\n     *\r\n     * @return A new range.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shift(org.jfree.data.Range, double, boolean)",
      "begin_line": 306,
      "end_line": 320,
      "comment": "\r\n     * Shifts the range by the specified amount.\r\n     *\r\n     * @param base  the base range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param delta  the shift amount.\r\n     * @param allowZeroCrossing  a flag that determines whether or not the\r\n     *                           bounds of the range are allowed to cross\r\n     *                           zero after adjustment.\r\n     *\r\n     * @return A new range.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shiftWithNoZeroCrossing(double, double)",
      "begin_line": 331,
      "end_line": 341,
      "comment": "\r\n     * Returns the given \u003ccode\u003evalue\u003c/code\u003e adjusted by \u003ccode\u003edelta\u003c/code\u003e but\r\n     * with a check to prevent the result from crossing \u003ccode\u003e0.0\u003c/code\u003e.\r\n     *\r\n     * @param value  the value.\r\n     * @param delta  the adjustment.\r\n     *\r\n     * @return The adjusted value.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.scale(org.jfree.data.Range, double)",
      "begin_line": 353,
      "end_line": 362,
      "comment": "\r\n     * Scales the range by the specified factor.\r\n     *\r\n     * @param base the base range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param factor the scaling factor (must be non-negative).\r\n     *\r\n     * @return A new range.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 361,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.equals(java.lang.Object)",
      "begin_line": 371,
      "end_line": 383,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.hashCode()",
      "begin_line": 390,
      "end_line": 398,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 19)",
        "(line 392,col 9)-(line 392,col 18)",
        "(line 393,col 9)-(line 393,col 51)",
        "(line 394,col 9)-(line 394,col 46)",
        "(line 395,col 9)-(line 395,col 51)",
        "(line 396,col 9)-(line 396,col 60)",
        "(line 397,col 9)-(line 397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.toString()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\r\n     * Returns a string representation of this Range.\r\n     *\r\n     * @return A String \"Range[lower,upper]\" where lower\u003dlower range and\r\n     *         upper\u003dupper range.\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 64)"
      ]
    }
  ]
}