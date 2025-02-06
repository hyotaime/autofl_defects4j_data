{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimeSeriesDataItem.java",
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
      "begin_line": 81,
      "end_line": 276,
      "comment": "\r\n * Represents one data item in a time series.\r\n * \u003cP\u003e\r\n * The time period can be any of the following:\r\n * \u003cul\u003e\r\n * \u003cli\u003e{@link Year}\u003c/li\u003e\r\n * \u003cli\u003e{@link Quarter}\u003c/li\u003e\r\n * \u003cli\u003e{@link Month}\u003c/li\u003e\r\n * \u003cli\u003e{@link Week}\u003c/li\u003e\r\n * \u003cli\u003e{@link Day}\u003c/li\u003e\r\n * \u003cli\u003e{@link Hour}\u003c/li\u003e\r\n * \u003cli\u003e{@link Minute}\u003c/li\u003e\r\n * \u003cli\u003e{@link Second}\u003c/li\u003e\r\n * \u003cli\u003e{@link Millisecond}\u003c/li\u003e\r\n * \u003cli\u003e{@link FixedMillisecond}\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n *\r\n * The time period is an immutable property of the data item.  Data items will\r\n * often be sorted within a list, and allowing the time period to be changed\r\n * could destroy the sort order.\r\n * \u003cP\u003e\r\n * Implements the \u003ccode\u003eComparable\u003c/code\u003e interface so that standard Java\r\n * sorting can be used to keep the data items in order.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "period"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The time period. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The value associated with the time period. "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * A flag that indicates whether or not the item is \"selected\".\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\r\n     * Constructs a new data item that associates a value with a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 29)",
        "(line 110,col 9)-(line 110,col 27)",
        "(line 111,col 9)-(line 111,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.TimeSeriesDataItem(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Constructs a new data item that associates a value with a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value associated with the time period.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.getPeriod()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the time period.\r\n     *\r\n     * @return The time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.getValue()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setValue(java.lang.Number)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.setValue(java.lang.Number)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Sets the value for this data item.  This method provides no notification\r\n     * of the value change - if this item belongs to a {@link TimeSeries} you\r\n     * should use the {@link TimeSeries#update(int, java.lang.Number)} method\r\n     * to change the value, because this will trigger a change event.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getValue()\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.isSelected()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the data item is selected, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSelected(boolean)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.setSelected(boolean)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Sets the selection state for this item.\r\n     *\r\n     * @param selected  the new selection state.\r\n     *\r\n     * @see #isSelected()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.equals(java.lang.Object)",
      "begin_line": 192,
      "end_line": 210,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.hashCode()",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 19)",
        "(line 219,col 9)-(line 219,col 68)",
        "(line 220,col 9)-(line 220,col 80)",
        "(line 221,col 9)-(line 221,col 63)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.compareTo(java.lang.Object)",
      "begin_line": 237,
      "end_line": 257,
      "comment": "\r\n     * Returns an integer indicating the order of this data pair object\r\n     * relative to another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the timing:\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  The object being compared to.\r\n     *\r\n     * @return An integer indicating the order of the data item object\r\n     *         relative to another object.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 19)",
        "(line 243,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesDataItem.clone()",
      "begin_line": 265,
      "end_line": 274,
      "comment": "\r\n     * Clones the data item.  Note: there is no need to clone the period or\r\n     * value since they are immutable instances.\r\n     *\r\n     * @return A clone of the data item.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 28)",
        "(line 267,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 21)"
      ]
    }
  ]
}