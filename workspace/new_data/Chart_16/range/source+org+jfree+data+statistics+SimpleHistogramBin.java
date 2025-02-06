{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/SimpleHistogramBin.java",
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
      "begin_line": 51,
      "end_line": 268,
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
      "comment": " \r\n     * A flag that controls whether the lower bound is included in the bin \r\n     * range. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "includeUpperBound"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " \r\n     * A flag that controls whether the upper bound is included in the bin \r\n     * range. \r\n     "
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
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.SimpleHistogramBin(double, double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Creates a new bin.\r\n     * \r\n     * @param lowerBound  the lower bound (inclusive).\r\n     * @param upperBound  the upper bound (inclusive);\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.SimpleHistogramBin(double, double, boolean, boolean)",
      "begin_line": 97,
      "end_line": 108,
      "comment": "\r\n     * Creates a new bin.\r\n     * \r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * @param includeLowerBound  include the lower bound?\r\n     * @param includeUpperBound  include the upper bound?\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 106,col 51)",
        "(line 107,col 9)-(line 107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getLowerBound()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the lower bound.\r\n     * \r\n     * @return The lower bound.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getUpperBound()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Return the upper bound.\r\n     * \r\n     * @return The upper bound.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.getItemCount()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the item count.\r\n     * \r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.setItemCount(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Sets the item count.\r\n     * \r\n     * @param count  the item count.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.accepts(double)",
      "begin_line": 154,
      "end_line": 171,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified value belongs in the bin, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.overlapsWith(org.jfree.data.statistics.SimpleHistogramBin)",
      "begin_line": 181,
      "end_line": 195,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this bin overlaps with the specified bin,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param bin  the other bin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.compareTo(java.lang.Object)",
      "begin_line": 206,
      "end_line": 225,
      "comment": "\r\n     * Compares the bin to an arbitrary object and returns the relative \r\n     * ordering.\r\n     * \r\n     * @param obj  the object.\r\n     * \r\n     * @return An integer indicating the relative ordering of the this bin and \r\n     *         the given object.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.equals(java.lang.Object)",
      "begin_line": 234,
      "end_line": 255,
      "comment": "\r\n     * Tests this bin for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramBin.clone()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns a clone of the bin.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 29)"
      ]
    }
  ]
}