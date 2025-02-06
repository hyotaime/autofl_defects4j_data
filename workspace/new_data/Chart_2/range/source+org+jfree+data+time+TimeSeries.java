{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimeSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 115,
      "end_line": 1302,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (period, value)\r\n * where \u0027period\u0027 is some instance of a subclass of {@link RegularTimePeriod}.\r\n * The time series will ensure that (a) all data items have the same type of\r\n * period (for example, {@link Day}) and (b) that each period appears at\r\n * most one time in the series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_DESCRIPTION"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Default value for the domain description. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_DESCRIPTION"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Default value for the range description. "
    },
    {
      "type": "field",
      "varNames": [
        "domain"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " A description of the domain. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " A description of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "timePeriodClass"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The type of period for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The list of data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemAge"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\r\n     * The maximum age of items for the series, specified as a number of\r\n     * time periods.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\r\n     * The minimum y-value in the series.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxY"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\r\n     * The maximum y-value in the series.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Creates a new (empty) time series.  By default, a daily time series is\r\n     * created.  Use one of the other constructors if you require a different\r\n     * time period.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 185,
      "end_line": 195,
      "comment": "\r\n     * Creates a new time series that contains no data.\r\n     * \u003cP\u003e\r\n     * Descriptions can be specified for the domain and range.  One situation\r\n     * where this is helpful is when generating a chart for the time series -\r\n     * axis labels can be taken from the domain and range description.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param domain  the domain description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param range  the range description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 20)",
        "(line 187,col 9)-(line 187,col 29)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 36)",
        "(line 190,col 9)-(line 190,col 46)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 192,col 45)",
        "(line 193,col 9)-(line 193,col 31)",
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDomainDescription()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the domain description.\r\n     *\r\n     * @return The domain description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainDescription(String)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setDomainDescription(java.lang.String)",
      "begin_line": 217,
      "end_line": 221,
      "comment": "\r\n     * Sets the domain description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e\r\n     * (with the property name \u003ccode\u003eDomain\u003c/code\u003e) to all registered\r\n     * property change listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainDescription()\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 33)",
        "(line 219,col 9)-(line 219,col 34)",
        "(line 220,col 9)-(line 220,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRangeDescription()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the range description.\r\n     *\r\n     * @return The range description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeDescription(String)\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setRangeDescription(java.lang.String)",
      "begin_line": 242,
      "end_line": 246,
      "comment": "\r\n     * Sets the range description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e\r\n     * (with the property name \u003ccode\u003eRange\u003c/code\u003e) to all registered listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeDescription()\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)",
        "(line 244,col 9)-(line 244,col 33)",
        "(line 245,col 9)-(line 245,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItemCount()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItems()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains\r\n     * {@link TimeSeriesDataItem} objects and is unmodifiable).\r\n     *\r\n     * @return The list of data items.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemCount()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     *\r\n     * @see #setMaximumItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemCount(int)",
      "begin_line": 291,
      "end_line": 300,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.\r\n     * If you add a new item to the series such that the number of items will\r\n     * exceed the maximum item count, then the FIRST element in the series is\r\n     * automatically removed, ensuring that the maximum item count is not\r\n     * exceeded.\r\n     *\r\n     * @param maximum  the maximum (requires \u003e\u003d 0).\r\n     *\r\n     * @see #getMaximumItemCount()\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 37)",
        "(line 297,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemAge()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Returns the maximum item age (in time periods) for the series.\r\n     *\r\n     * @return The maximum item age.\r\n     *\r\n     * @see #setMaximumItemAge(long)\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemAge(long)",
      "begin_line": 325,
      "end_line": 331,
      "comment": "\r\n     * Sets the number of time units in the \u0027history\u0027 for the series.  This\r\n     * provides one mechanism for automatically dropping old data from the\r\n     * time series. For example, if a series contains daily data, you might set\r\n     * the history count to 30.  Then, when you add a new data item, all data\r\n     * items more than 30 days older than the latest value are automatically\r\n     * dropped from the series.\r\n     *\r\n     * @param periods  the number of time periods.\r\n     *\r\n     * @see #getMaximumItemAge()\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 38)",
        "(line 330,col 9)-(line 330,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMinY()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns the smallest y-value in the series, ignoring any null and\r\n     * Double.NaN values.  This method returns Double.NaN if there is no\r\n     * smallest y-value (for example, when the series is empty).\r\n     *\r\n     * @return The smallest y-value.\r\n     *\r\n     * @see #getMaxY()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaxY()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\r\n     * Returns the largest y-value in the series, ignoring any Double.NaN\r\n     * values.  This method returns Double.NaN if there is no largest y-value\r\n     * (for example, when the series is empty).\r\n     *\r\n     * @return The largest y-value.\r\n     *\r\n     * @see #getMinY()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodClass()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\r\n     * Returns the time period class for this series.\r\n     * \u003cp\u003e\r\n     * Only one time period class can be used within a single series (enforced).\r\n     * If you add a data item with a {@link Year} for the time period, then all\r\n     * subsequent data items must also have a {@link Year} for the time period.\r\n     *\r\n     * @return The time period class (may be \u003ccode\u003enull\u003c/code\u003e but only for\r\n     *     an empty series).\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(int)",
      "begin_line": 388,
      "end_line": 391,
      "comment": "\r\n     * Returns a data item from the dataset.  Note that the returned object\r\n     * is a clone of the item in the series, so modifying it will have no\r\n     * effect on the data series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(RegularTimePeriod)\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 76)",
        "(line 390,col 9)-(line 390,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 405,
      "end_line": 413,
      "comment": "\r\n     * Returns the data item for a specific period.  Note that the returned\r\n     * object is a clone of the item in the series, so modifying it will have\r\n     * no effect on the data series.\r\n     *\r\n     * @param period  the period of interest (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @return The data item matching the specified period (or\r\n     *         \u003ccode\u003enull\u003c/code\u003e if there is no match).\r\n     *\r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 37)",
        "(line 407,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRawDataItem(int)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Returns a data item for the series.  This method returns the object\r\n     * that is used for the underlying storage - you should not modify the\r\n     * contents of the returned value unless you know what you are doing.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(int)\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRawDataItem(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "\r\n     * Returns a data item for the series.  This method returns the object\r\n     * that is used for the underlying storage - you should not modify the\r\n     * contents of the returned value unless you know what you are doing.\r\n     *\r\n     * @param period  the item index (zero-based).\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(RegularTimePeriod)\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 37)",
        "(line 447,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriod(int)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\r\n     * Returns the time period at the specified index.\r\n     *\r\n     * @param index  the index of the data item.\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getNextTimePeriod()",
      "begin_line": 472,
      "end_line": 475,
      "comment": "\r\n     * Returns a time period that would be the next in sequence on the end of\r\n     * the time series.\r\n     *\r\n     * @return The next time period.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 67)",
        "(line 474,col 9)-(line 474,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriods()",
      "begin_line": 482,
      "end_line": 488,
      "comment": "\r\n     * Returns a collection of all the time periods in the time series.\r\n     *\r\n     * @return A collection of all the time periods.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 54)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 498,
      "end_line": 508,
      "comment": "\r\n     * Returns a collection of time periods in the specified series, but not in\r\n     * this series, and therefore unique to the specified series.\r\n     *\r\n     * @param series  the series to check against this one.\r\n     *\r\n     * @return The unique time periods.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 54)",
        "(line 500,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getIndex(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 518,
      "end_line": 525,
      "comment": "\r\n     * Returns the index for the item (if any) that corresponds to a time\r\n     * period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 523,col 41)",
        "(line 524,col 9)-(line 524,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(int)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\r\n     * Returns the value at the specified index.\r\n     *\r\n     * @param index  index of a value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 546,
      "end_line": 554,
      "comment": "\r\n     * Returns the value for a time period.  If there is no data item with the\r\n     * specified period, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param period  time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 37)",
        "(line 548,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem, boolean)",
      "begin_line": 575,
      "end_line": 642,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not\r\n     *              permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 49)",
        "(line 580,col 9)-(line 580,col 46)",
        "(line 581,col 9)-(line 593,col 9)",
        "(line 596,col 9)-(line 596,col 30)",
        "(line 597,col 9)-(line 597,col 35)",
        "(line 598,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 651,
      "end_line": 654,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double, boolean)",
      "begin_line": 664,
      "end_line": 668,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 72)",
        "(line 667,col 9)-(line 667,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 678,
      "end_line": 681,
      "comment": "\r\n     * Adds a new data item to the series and sends\r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)",
      "begin_line": 691,
      "end_line": 695,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 72)",
        "(line 694,col 9)-(line 694,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 704,
      "end_line": 712,
      "comment": "\r\n     * Updates (changes) the value for a time period.  Throws a\r\n     * {@link SeriesException} if the period does not exist.\r\n     *\r\n     * @param period  the period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 72)",
        "(line 706,col 9)-(line 706,col 62)",
        "(line 707,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(int, java.lang.Number)",
      "begin_line": 720,
      "end_line": 740,
      "comment": "\r\n     * Updates (changes) the value of a data item.\r\n     *\r\n     * @param index  the index of the data item.\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 76)",
        "(line 722,col 9)-(line 722,col 32)",
        "(line 723,col 9)-(line 723,col 39)",
        "(line 724,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 29)",
        "(line 731,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addAndOrUpdate(org.jfree.data.time.TimeSeries)",
      "begin_line": 750,
      "end_line": 762,
      "comment": "\r\n     * Adds or updates data from one series to another.  Returns another series\r\n     * containing the values that were overwritten.\r\n     *\r\n     * @param series  the series to merge with this.\r\n     *\r\n     * @return A series containing the values that were overwritten.\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 752,col 28)",
        "(line 753,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 775,
      "end_line": 778,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     * @param value  the new value.\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 791,
      "end_line": 794,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 807,
      "end_line": 864,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the data item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 56)",
        "(line 813,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 46)",
        "(line 824,col 9)-(line 824,col 62)",
        "(line 825,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 858,col 31)",
        "(line 861,col 9)-(line 861,col 28)",
        "(line 862,col 9)-(line 862,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(boolean)",
      "begin_line": 874,
      "end_line": 892,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the youngest to\r\n     * the oldest record in the series does not exceed maximumItemAge time\r\n     * periods.  Oldest items will be removed if required.\r\n     *\r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is\r\n     *                sent to registered listeners IF any items are removed.\r\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 891,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(long, boolean)",
      "begin_line": 904,
      "end_line": 943,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the supplied\r\n     * time to the oldest record in the series does not exceed history count.\r\n     * oldest items will be removed if required.\r\n     *\r\n     * @param latest  the time to be compared against when aging data\r\n     *     (specified in milliseconds).\r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is\r\n     *                sent to registered listeners IF any items are removed.\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 909,col 9)-(line 909,col 36)",
        "(line 910,col 9)-(line 927,col 9)",
        "(line 931,col 9)-(line 931,col 32)",
        "(line 932,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 942,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clear()",
      "begin_line": 949,
      "end_line": 957,
      "comment": "\r\n     * Removes all data items from the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 956,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 967,
      "end_line": 978,
      "comment": "\r\n     * Deletes the data item for the given time period and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.  If there is no\r\n     * item with the specified time period, this method does nothing.\r\n     *\r\n     * @param period  the period of the item to delete (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 37)",
        "(line 969,col 9)-(line 977,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(int, int)",
      "begin_line": 986,
      "end_line": 988,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive).\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(int, int, boolean)",
      "begin_line": 999,
      "end_line": 1013,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive).\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 32)",
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1012,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clone()",
      "begin_line": 1030,
      "end_line": 1034,
      "comment": "\r\n     * Returns a clone of the time series.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno need to clone the domain and range descriptions, since String\r\n     *     object is immutable;\u003c/li\u003e\r\n     *   \u003cli\u003ewe pass over to the more general method clone(start, end).\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the time series.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but\r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 54)",
        "(line 1032,col 9)-(line 1032,col 65)",
        "(line 1033,col 9)-(line 1033,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(int, int)",
      "begin_line": 1048,
      "end_line": 1074,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time\r\n     * series.\r\n     *\r\n     * @param start  the index of the first time period to copy.\r\n     * @param end  the index of the last time period to copy.\r\n     *\r\n     * @return A series containing a copy of this times series from start until\r\n     *         end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1056,col 53)",
        "(line 1057,col 9)-(line 1057,col 31)",
        "(line 1058,col 9)-(line 1058,col 31)",
        "(line 1059,col 9)-(line 1059,col 46)",
        "(line 1060,col 9)-(line 1072,col 9)",
        "(line 1073,col 9)-(line 1073,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 1090,
      "end_line": 1128,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time\r\n     * series.\r\n     *\r\n     * @param start  the first time period to copy (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     * @param end  the last time period to copy (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @return A time series containing a copy of this time series from start\r\n     *         until end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 35)",
        "(line 1104,col 9)-(line 1104,col 41)",
        "(line 1105,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 37)",
        "(line 1112,col 9)-(line 1115,col 9)",
        "(line 1116,col 9)-(line 1118,col 9)",
        "(line 1119,col 9)-(line 1126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.equals(java.lang.Object)",
      "begin_line": 1137,
      "end_line": 1171,
      "comment": "\r\n     * Tests the series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1144,col 9)-(line 1144,col 43)",
        "(line 1145,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1152,col 9)",
        "(line 1153,col 9)-(line 1156,col 9)",
        "(line 1157,col 9)-(line 1159,col 9)",
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1163,col 9)-(line 1163,col 35)",
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1169,col 9)",
        "(line 1170,col 9)-(line 1170,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.hashCode()",
      "begin_line": 1178,
      "end_line": 1203,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 1179,col 9)-(line 1179,col 38)",
        "(line 1180,col 9)-(line 1181,col 21)",
        "(line 1182,col 9)-(line 1182,col 80)",
        "(line 1183,col 9)-(line 1184,col 55)",
        "(line 1187,col 9)-(line 1187,col 35)",
        "(line 1188,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1199,col 9)",
        "(line 1200,col 9)-(line 1200,col 53)",
        "(line 1201,col 9)-(line 1201,col 57)",
        "(line 1202,col 9)-(line 1202,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 1212,
      "end_line": 1219,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 36)",
        "(line 1214,col 9)-(line 1218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 1229,
      "end_line": 1239,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values on\r\n     * the basis that the specified item has just been removed.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 36)",
        "(line 1231,col 9)-(line 1238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.findBoundsByIteration()",
      "begin_line": 1247,
      "end_line": 1255,
      "comment": "\r\n     * Finds the bounds of the x and y values for the series, by iterating\r\n     * through all the data items.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 31)",
        "(line 1249,col 9)-(line 1249,col 31)",
        "(line 1250,col 9)-(line 1250,col 49)",
        "(line 1251,col 9)-(line 1254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.minIgnoreNaN(double, double)",
      "begin_line": 1266,
      "end_line": 1278,
      "comment": "\r\n     * A function to find the minimum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The minimum of the two values.\r\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.maxIgnoreNaN(double, double)",
      "begin_line": 1289,
      "end_line": 1301,
      "comment": "\r\n     * A function to find the maximum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The maximum of the two values.\r\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1300,col 9)"
      ]
    }
  ]
}