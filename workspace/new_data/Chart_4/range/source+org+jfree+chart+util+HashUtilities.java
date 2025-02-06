{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/HashUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 231,
      "comment": "\r\n * Some utility methods for calculating hash codes.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCodeForPaint(java.awt.Paint)",
      "begin_line": 65,
      "end_line": 86,
      "comment": "\r\n     * Returns a hash code for a \u003ccode\u003ePaint\u003c/code\u003e instance.  If\r\n     * \u003ccode\u003ep\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, this method returns zero.\r\n     *\r\n     * @param p  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The hash code.\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 23)",
        "(line 71,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCodeForDoubleArray(double[])",
      "begin_line": 96,
      "end_line": 107,
      "comment": "\r\n     * Returns a hash code for a \u003ccode\u003edouble[]\u003c/code\u003e instance.  If the array\r\n     * is \u003ccode\u003enull\u003c/code\u003e, this method returns zero.\r\n     *\r\n     * @param a  the array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The hash code.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 25)",
        "(line 101,col 9)-(line 101,col 18)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, boolean)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns a hash value based on a seed value and the value of a boolean\r\n     * primitive.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param b  the boolean value.\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns a hash value based on a seed value and the value of an int\r\n     * primitive.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param i  the int value.\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.8\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\r\n     * Returns a hash value based on a seed value and the value of a double\r\n     * primitive.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param d  the double value.\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, java.awt.Paint)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns a hash value based on a seed value and a paint instance.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param p  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, java.awt.Stroke)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\r\n     * Returns a hash value based on a seed value and a stroke instance.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param s  the stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 47)",
        "(line 181,col 9)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, java.lang.String)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\r\n     * Returns a hash value based on a seed value and a string instance.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param s  the string (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 47)",
        "(line 196,col 9)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, java.lang.Comparable)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\r\n     * Returns a hash value based on a seed value and a \u003ccode\u003eComparable\u003c/code\u003e\r\n     * instance.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param c  the comparable (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HashUtilities.hashCode(int, java.lang.Object)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\r\n     * Returns a hash value based on a seed value and an \u003ccode\u003eObject\u003c/code\u003e\r\n     * instance.\r\n     *\r\n     * @param pre  the seed value.\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A hash value.\r\n     *\r\n     * @since 1.0.8\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 228,col 28)"
      ]
    }
  ]
}