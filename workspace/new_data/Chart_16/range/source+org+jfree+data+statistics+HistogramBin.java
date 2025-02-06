{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/HistogramBin.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HistogramBin",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 160,
      "comment": "\r\n * A bin for the {@link HistogramDataset} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The number of items in the bin. "
    },
    {
      "type": "field",
      "varNames": [
        "startBoundary"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The start boundary. "
    },
    {
      "type": "field",
      "varNames": [
        "endBoundary"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The end boundary. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.HistogramBin.HistogramBin(double, double)",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\r\n     * Creates a new bin.\r\n     * \r\n     * @param startBoundary  the start boundary.\r\n     * @param endBoundary  the end boundary.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 23)",
        "(line 78,col 9)-(line 78,col 43)",
        "(line 79,col 9)-(line 79,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.getCount()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the number of items in the bin.\r\n     * \r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.incrementCount()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Increments the item count.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.getStartBoundary()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the start boundary.\r\n     * \r\n     * @return The start boundary.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.getEndBoundary()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the end boundary.\r\n     * \r\n     * @return The end boundary.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.getBinWidth()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the bin width.\r\n     * \r\n     * @return The bin width.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.equals(java.lang.Object)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramBin.clone()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns a clone of the bin.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 29)"
      ]
    }
  ]
}