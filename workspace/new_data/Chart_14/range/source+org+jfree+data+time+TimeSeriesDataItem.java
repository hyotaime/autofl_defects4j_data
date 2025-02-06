{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/TimeSeriesDataItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesDataItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 236,
      "comment": "\r\n * Represents one data item in a time series.\r\n * \u003cP\u003e\r\n * The time period can be any of the following:\r\n * \u003cul\u003e\r\n * \u003cli\u003e{@link Year}\u003c/li\u003e\r\n * \u003cli\u003e{@link Quarter}\u003c/li\u003e\r\n * \u003cli\u003e{@link Month}\u003c/li\u003e\r\n * \u003cli\u003e{@link Week}\u003c/li\u003e\r\n * \u003cli\u003e{@link Day}\u003c/li\u003e\r\n * \u003cli\u003e{@link Hour}\u003c/li\u003e\r\n * \u003cli\u003e{@link Minute}\u003c/li\u003e\r\n * \u003cli\u003e{@link Second}\u003c/li\u003e\r\n * \u003cli\u003e{@link Millisecond}\u003c/li\u003e\r\n * \u003cli\u003e{@link FixedMillisecond}\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n *\r\n * The time period is an immutable property of the data item.  Data items will\r\n * often be sorted within a list, and allowing the time period to be changed\r\n * could destroy the sort order.\r\n * \u003cP\u003e\r\n * Implements the \u003ccode\u003eComparable\u003c/code\u003e interface so that standard Java \r\n * sorting can be used to keep the data items in order.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The time period. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The value associated with the time period. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\r\n     * Constructs a new data item that associates a value with a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 29)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Constructs a new data item that associates a value with a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.getPeriod()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the time period.\r\n     *\r\n     * @return The time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.getValue()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.setValue(java.lang.Number)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Sets the value for this data item.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.equals(java.lang.Object)",
      "begin_line": 144,
      "end_line": 171,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param o  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 71)",
        "(line 152,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.hashCode()",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 19)",
        "(line 180,col 9)-(line 180,col 68)",
        "(line 181,col 9)-(line 181,col 80)",
        "(line 182,col 9)-(line 182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.compareTo(java.lang.Object)",
      "begin_line": 197,
      "end_line": 217,
      "comment": "\r\n     * Returns an integer indicating the order of this data pair object\r\n     * relative to another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the timing:\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  The object being compared to.\r\n     *\r\n     * @return An integer indicating the order of the data item object \r\n     *         relative to another object.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 19)",
        "(line 203,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.clone()",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\r\n     * Clones the data item.  Note: there is no need to clone the period or \r\n     * value since they are immutable classes.\r\n     *\r\n     * @return A clone of the data item.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 21)"
      ]
    }
  ]
}