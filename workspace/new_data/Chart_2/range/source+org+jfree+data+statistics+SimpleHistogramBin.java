{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/SimpleHistogramBin.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleHistogramBin",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 318,
      "comment": "\r\n * A bin for the {@link SimpleHistogramDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The lower bound for the bin. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The upper bound for the bin. "
    },
    {
      "type": "field",
      "varNames": [
        "includeLowerBound"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * A flag that controls whether the lower bound is included in the bin\r\n     * range.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "includeUpperBound"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\r\n     * A flag that controls whether the upper bound is included in the bin\r\n     * range.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "itemCount"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The item count. "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * A flag that indicates whether or not the bin is selected.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.SimpleHistogramBin(double, double)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Creates a new bin.\r\n     *\r\n     * @param lowerBound  the lower bound (inclusive).\r\n     * @param upperBound  the upper bound (inclusive);\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.SimpleHistogramBin(double, double, boolean, boolean)",
      "begin_line": 104,
      "end_line": 117,
      "comment": "\r\n     * Creates a new bin.\r\n     *\r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * @param includeLowerBound  include the lower bound?\r\n     * @param includeUpperBound  include the upper bound?\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 37)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 115,col 27)",
        "(line 116,col 9)-(line 116,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getLowerBound()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the lower bound.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getUpperBound()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Return the upper bound.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getItemCount()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns the item count.\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @see #setItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.setItemCount(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Sets the item count.  No event notification occurs when calling this\r\n     * method - if the bin is contained within a\r\n     * {@link SimpleHistogramDataset}, you should not be calling this method\r\n     * directly.  Instead, update the bin using methods such as\r\n     * {@link SimpleHistogramDataset#addObservations(double[])}.\r\n     *\r\n     * @param count  the item count.\r\n     *\r\n     * @see #getItemCount()\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.isSelected()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns a flag indicating whether or not the bin is selected.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSelected(boolean)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.setSelected(boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Sets the flag that indicates whether or not the bin is selected.\r\n     *\r\n     * @param selected  the new flag value.\r\n     *\r\n     * @see #isSelected()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.accepts(double)",
      "begin_line": 201,
      "end_line": 218,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified value belongs in the bin,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.overlapsWith(org.jfree.data.statistics.SimpleHistogramBin)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this bin overlaps with the specified bin,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param bin  the other bin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.compareTo(java.lang.Object)",
      "begin_line": 253,
      "end_line": 272,
      "comment": "\r\n     * Compares the bin to an arbitrary object and returns the relative\r\n     * ordering.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return An integer indicating the relative ordering of the this bin and\r\n     *         the given object.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.equals(java.lang.Object)",
      "begin_line": 281,
      "end_line": 305,
      "comment": "\r\n     * Tests this bin for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 59)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.clone()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\r\n     * Returns a clone of the bin.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 29)"
      ]
    }
  ]
}