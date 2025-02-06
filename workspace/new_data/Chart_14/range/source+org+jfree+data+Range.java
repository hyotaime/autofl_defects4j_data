{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 366,
      "comment": "\r\n * Represents an immutable range of values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The lower bound of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The upper bound of the range. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.Range.Range(double, double)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\r\n     * Creates a new range.\r\n     *\r\n     * @param lower  the lower bound (must be \u003c\u003d upper bound).\r\n     * @param upper  the upper bound (must be \u003e\u003d lower bound).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getLowerBound()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the lower bound for the range.\r\n     *\r\n     * @return The lower bound.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getUpperBound()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the upper bound for the range.\r\n     *\r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getLength()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the length of the range.\r\n     *\r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.getCentralValue()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the central value for the range.\r\n     *\r\n     * @return The central value.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.contains(double)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range contains the specified value and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param value  the value to lookup.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range contains the specified value.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.intersects(double, double)",
      "begin_line": 150,
      "end_line": 157,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range intersects with the specified \r\n     * range, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param b0  the lower bound (should be \u003c\u003d b1).\r\n     * @param b1  the upper bound (should be \u003e\u003d b0).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.constrain(double)",
      "begin_line": 167,
      "end_line": 178,
      "comment": "\r\n     * Returns the value within the range that is closest to the specified \r\n     * value.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @return The constrained value.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 30)",
        "(line 169,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.combine(org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 196,
      "end_line": 212,
      "comment": "\r\n     * Creates a new range by combining two existing ranges.\r\n     * \u003cP\u003e\r\n     * Note that:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eeither range can be \u003ccode\u003enull\u003c/code\u003e, in which case the other \r\n     *       range is returned;\u003c/li\u003e\r\n     *   \u003cli\u003eif both ranges are \u003ccode\u003enull\u003c/code\u003e the return value is \r\n     *       \u003ccode\u003enull\u003c/code\u003e.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param range1  the first range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param range2  the second range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A new range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.expandToInclude(org.jfree.data.Range, double)",
      "begin_line": 225,
      "end_line": 238,
      "comment": "\r\n     * Returns a range that includes all the values in the specified \r\n     * \u003ccode\u003erange\u003c/code\u003e AND the specified \u003ccode\u003evalue\u003c/code\u003e.\r\n     * \r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param value  the value that must be included.\r\n     * \r\n     * @return A range.\r\n     * \r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.expand(org.jfree.data.Range, double, double)",
      "begin_line": 251,
      "end_line": 261,
      "comment": "\r\n     * Creates a new range by adding margins to an existing range.\r\n     * \r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param lowerMargin  the lower margin (expressed as a percentage of the \r\n     *                     range length).\r\n     * @param upperMargin  the upper margin (expressed as a percentage of the \r\n     *                     range length).\r\n     * \r\n     * @return The expanded range.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 44)",
        "(line 259,col 9)-(line 260,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shift(org.jfree.data.Range, double)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\r\n     * Shifts the range by the specified amount.\r\n     * \r\n     * @param base  the base range.\r\n     * @param delta  the shift amount.\r\n     * \r\n     * @return A new range.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shift(org.jfree.data.Range, double, boolean)",
      "begin_line": 286,
      "end_line": 297,
      "comment": "\r\n     * Shifts the range by the specified amount.\r\n     * \r\n     * @param base  the base range.\r\n     * @param delta  the shift amount.\r\n     * @param allowZeroCrossing  a flag that determines whether or not the \r\n     *                           bounds of the range are allowed to cross\r\n     *                           zero after adjustment.\r\n     * \r\n     * @return A new range.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.shiftWithNoZeroCrossing(double, double)",
      "begin_line": 308,
      "end_line": 318,
      "comment": "\r\n     * Returns the given \u003ccode\u003evalue\u003c/code\u003e adjusted by \u003ccode\u003edelta\u003c/code\u003e but\r\n     * with a check to prevent the result from crossing \u003ccode\u003e0.0\u003c/code\u003e.\r\n     * \r\n     * @param value  the value.\r\n     * @param delta  the adjustment.\r\n     * \r\n     * @return The adjusted value.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.equals(java.lang.Object)",
      "begin_line": 327,
      "end_line": 339,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 34)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.hashCode()",
      "begin_line": 346,
      "end_line": 354,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 348,col 18)",
        "(line 349,col 9)-(line 349,col 51)",
        "(line 350,col 9)-(line 350,col 46)",
        "(line 351,col 9)-(line 351,col 51)",
        "(line 352,col 9)-(line 352,col 60)",
        "(line 353,col 9)-(line 353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.Range.toString()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\r\n     * Returns a string representation of this Range.\r\n     *\r\n     * @return A String \"Range[lower,upper]\" where lower\u003dlower range and \r\n     *         upper\u003dupper range.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 64)"
      ]
    }
  ]
}