{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/TimeSeries.java",
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
      "begin_line": 114,
      "end_line": 1301,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (period, value)\r\n * where \u0027period\u0027 is some instance of a subclass of {@link RegularTimePeriod}.\r\n * The time series will ensure that (a) all data items have the same type of\r\n * period (for example, {@link Day}) and (b) that each period appears at\r\n * most one time in the series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_DESCRIPTION"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Default value for the domain description. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_DESCRIPTION"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Default value for the range description. "
    },
    {
      "type": "field",
      "varNames": [
        "domain"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A description of the domain. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " A description of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "timePeriodClass"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The type of period for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The list of data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemAge"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\r\n     * The maximum age of items for the series, specified as a number of\r\n     * time periods.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\r\n     * The minimum y-value in the series.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxY"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\r\n     * The maximum y-value in the series.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Creates a new (empty) time series.  By default, a daily time series is\r\n     * created.  Use one of the other constructors if you require a different\r\n     * time period.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 184,
      "end_line": 194,
      "comment": "\r\n     * Creates a new time series that contains no data.\r\n     * \u003cP\u003e\r\n     * Descriptions can be specified for the domain and range.  One situation\r\n     * where this is helpful is when generating a chart for the time series -\r\n     * axis labels can be taken from the domain and range description.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param domain  the domain description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param range  the range description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 20)",
        "(line 186,col 9)-(line 186,col 29)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 188,col 36)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 50)",
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 192,col 31)",
        "(line 193,col 9)-(line 193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDomainDescription()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns the domain description.\r\n     *\r\n     * @return The domain description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainDescription(String)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setDomainDescription(java.lang.String)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\r\n     * Sets the domain description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e\r\n     * (with the property name \u003ccode\u003eDomain\u003c/code\u003e) to all registered\r\n     * property change listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainDescription()\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 33)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRangeDescription()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the range description.\r\n     *\r\n     * @return The range description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeDescription(String)\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setRangeDescription(java.lang.String)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\r\n     * Sets the range description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e\r\n     * (with the property name \u003ccode\u003eRange\u003c/code\u003e) to all registered listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeDescription()\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 32)",
        "(line 243,col 9)-(line 243,col 33)",
        "(line 244,col 9)-(line 244,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItemCount()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItems()",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains\r\n     * {@link TimeSeriesDataItem} objects and is unmodifiable).\r\n     *\r\n     * @return The list of data items.\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemCount()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     *\r\n     * @see #setMaximumItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemCount(int)",
      "begin_line": 290,
      "end_line": 299,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.\r\n     * If you add a new item to the series such that the number of items will\r\n     * exceed the maximum item count, then the FIRST element in the series is\r\n     * automatically removed, ensuring that the maximum item count is not\r\n     * exceeded.\r\n     *\r\n     * @param maximum  the maximum (requires \u003e\u003d 0).\r\n     *\r\n     * @see #getMaximumItemCount()\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 37)",
        "(line 296,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemAge()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\r\n     * Returns the maximum item age (in time periods) for the series.\r\n     *\r\n     * @return The maximum item age.\r\n     *\r\n     * @see #setMaximumItemAge(long)\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemAge(long)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\r\n     * Sets the number of time units in the \u0027history\u0027 for the series.  This\r\n     * provides one mechanism for automatically dropping old data from the\r\n     * time series. For example, if a series contains daily data, you might set\r\n     * the history count to 30.  Then, when you add a new data item, all data\r\n     * items more than 30 days older than the latest value are automatically\r\n     * dropped from the series.\r\n     *\r\n     * @param periods  the number of time periods.\r\n     *\r\n     * @see #getMaximumItemAge()\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 38)",
        "(line 329,col 9)-(line 329,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMinY()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the smallest y-value in the series, ignoring any null and\r\n     * Double.NaN values.  This method returns Double.NaN if there is no\r\n     * smallest y-value (for example, when the series is empty).\r\n     *\r\n     * @return The smallest y-value.\r\n     *\r\n     * @see #getMaxY()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaxY()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Returns the largest y-value in the series, ignoring any Double.NaN\r\n     * values.  This method returns Double.NaN if there is no largest y-value\r\n     * (for example, when the series is empty).\r\n     *\r\n     * @return The largest y-value.\r\n     *\r\n     * @see #getMinY()\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodClass()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the time period class for this series.\r\n     * \u003cp\u003e\r\n     * Only one time period class can be used within a single series (enforced).\r\n     * If you add a data item with a {@link Year} for the time period, then all\r\n     * subsequent data items must also have a {@link Year} for the time period.\r\n     *\r\n     * @return The time period class (may be \u003ccode\u003enull\u003c/code\u003e but only for\r\n     *     an empty series).\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(int)",
      "begin_line": 387,
      "end_line": 390,
      "comment": "\r\n     * Returns a data item from the dataset.  Note that the returned object\r\n     * is a clone of the item in the series, so modifying it will have no\r\n     * effect on the data series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(RegularTimePeriod)\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 76)",
        "(line 389,col 9)-(line 389,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 404,
      "end_line": 412,
      "comment": "\r\n     * Returns the data item for a specific period.  Note that the returned\r\n     * object is a clone of the item in the series, so modifying it will have\r\n     * no effect on the data series.\r\n     *\r\n     * @param period  the period of interest (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @return The data item matching the specified period (or\r\n     *         \u003ccode\u003enull\u003c/code\u003e if there is no match).\r\n     *\r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRawDataItem(int)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\r\n     * Returns a data item for the series.  This method returns the object\r\n     * that is used for the underlying storage - you should not modify the\r\n     * contents of the returned value unless you know what you are doing.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(int)\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRawDataItem(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 444,
      "end_line": 452,
      "comment": "\r\n     * Returns a data item for the series.  This method returns the object\r\n     * that is used for the underlying storage - you should not modify the\r\n     * contents of the returned value unless you know what you are doing.\r\n     *\r\n     * @param period  the item index (zero-based).\r\n     *\r\n     * @return The data item.\r\n     *\r\n     * @see #getDataItem(RegularTimePeriod)\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 37)",
        "(line 446,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriod(int)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\r\n     * Returns the time period at the specified index.\r\n     *\r\n     * @param index  the index of the data item.\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getNextTimePeriod()",
      "begin_line": 471,
      "end_line": 474,
      "comment": "\r\n     * Returns a time period that would be the next in sequence on the end of\r\n     * the time series.\r\n     *\r\n     * @return The next time period.\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 67)",
        "(line 473,col 9)-(line 473,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriods()",
      "begin_line": 481,
      "end_line": 487,
      "comment": "\r\n     * Returns a collection of all the time periods in the time series.\r\n     *\r\n     * @return A collection of all the time periods.\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 54)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 497,
      "end_line": 507,
      "comment": "\r\n     * Returns a collection of time periods in the specified series, but not in\r\n     * this series, and therefore unique to the specified series.\r\n     *\r\n     * @param series  the series to check against this one.\r\n     *\r\n     * @return The unique time periods.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 54)",
        "(line 499,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getIndex(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 517,
      "end_line": 524,
      "comment": "\r\n     * Returns the index for the item (if any) that corresponds to a time\r\n     * period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 522,col 41)",
        "(line 523,col 9)-(line 523,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(int)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\r\n     * Returns the value at the specified index.\r\n     *\r\n     * @param index  index of a value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 545,
      "end_line": 553,
      "comment": "\r\n     * Returns the value for a time period.  If there is no data item with the\r\n     * specified period, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param period  time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 37)",
        "(line 547,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not\r\n     *              permitted).\r\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem, boolean)",
      "begin_line": 574,
      "end_line": 641,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not\r\n     *              permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 49)",
        "(line 579,col 9)-(line 579,col 46)",
        "(line 580,col 9)-(line 592,col 9)",
        "(line 595,col 9)-(line 595,col 30)",
        "(line 596,col 9)-(line 596,col 35)",
        "(line 597,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 650,
      "end_line": 653,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double, boolean)",
      "begin_line": 663,
      "end_line": 667,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 72)",
        "(line 666,col 9)-(line 666,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 677,
      "end_line": 680,
      "comment": "\r\n     * Adds a new data item to the series and sends\r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)",
      "begin_line": 690,
      "end_line": 694,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 72)",
        "(line 693,col 9)-(line 693,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 703,
      "end_line": 711,
      "comment": "\r\n     * Updates (changes) the value for a time period.  Throws a\r\n     * {@link SeriesException} if the period does not exist.\r\n     *\r\n     * @param period  the period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 72)",
        "(line 705,col 9)-(line 705,col 62)",
        "(line 706,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(int, java.lang.Number)",
      "begin_line": 719,
      "end_line": 739,
      "comment": "\r\n     * Updates (changes) the value of a data item.\r\n     *\r\n     * @param index  the index of the data item.\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 76)",
        "(line 721,col 9)-(line 721,col 32)",
        "(line 722,col 9)-(line 722,col 39)",
        "(line 723,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 29)",
        "(line 730,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addAndOrUpdate(org.jfree.data.time.TimeSeries)",
      "begin_line": 749,
      "end_line": 761,
      "comment": "\r\n     * Adds or updates data from one series to another.  Returns another series\r\n     * containing the values that were overwritten.\r\n     *\r\n     * @param series  the series to merge with this.\r\n     *\r\n     * @return A series containing the values that were overwritten.\r\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 751,col 28)",
        "(line 752,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 774,
      "end_line": 777,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     * @param value  the new value.\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 790,
      "end_line": 793,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 806,
      "end_line": 863,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the data item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 56)",
        "(line 812,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 46)",
        "(line 823,col 9)-(line 823,col 62)",
        "(line 824,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 31)",
        "(line 860,col 9)-(line 860,col 28)",
        "(line 861,col 9)-(line 861,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(boolean)",
      "begin_line": 873,
      "end_line": 891,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the youngest to\r\n     * the oldest record in the series does not exceed maximumItemAge time\r\n     * periods.  Oldest items will be removed if required.\r\n     *\r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is\r\n     *                sent to registered listeners IF any items are removed.\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(long, boolean)",
      "begin_line": 903,
      "end_line": 942,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the supplied\r\n     * time to the oldest record in the series does not exceed history count.\r\n     * oldest items will be removed if required.\r\n     *\r\n     * @param latest  the time to be compared against when aging data\r\n     *     (specified in milliseconds).\r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is\r\n     *                sent to registered listeners IF any items are removed.\r\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 906,col 9)",
        "(line 908,col 9)-(line 908,col 36)",
        "(line 909,col 9)-(line 926,col 9)",
        "(line 930,col 9)-(line 930,col 32)",
        "(line 931,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 941,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clear()",
      "begin_line": 948,
      "end_line": 956,
      "comment": "\r\n     * Removes all data items from the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 955,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 966,
      "end_line": 977,
      "comment": "\r\n     * Deletes the data item for the given time period and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.  If there is no\r\n     * item with the specified time period, this method does nothing.\r\n     *\r\n     * @param period  the period of the item to delete (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 37)",
        "(line 968,col 9)-(line 976,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(int, int)",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive).\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(int, int, boolean)",
      "begin_line": 998,
      "end_line": 1012,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive).\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 1001,col 9)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1005,col 32)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1009,col 9)-(line 1011,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clone()",
      "begin_line": 1029,
      "end_line": 1033,
      "comment": "\r\n     * Returns a clone of the time series.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno need to clone the domain and range descriptions, since String\r\n     *     object is immutable;\u003c/li\u003e\r\n     *   \u003cli\u003ewe pass over to the more general method clone(start, end).\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the time series.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but\r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 54)",
        "(line 1031,col 9)-(line 1031,col 65)",
        "(line 1032,col 9)-(line 1032,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(int, int)",
      "begin_line": 1047,
      "end_line": 1073,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time\r\n     * series.\r\n     *\r\n     * @param start  the index of the first time period to copy.\r\n     * @param end  the index of the last time period to copy.\r\n     *\r\n     * @return A series containing a copy of this times series from start until\r\n     *         end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1056,col 53)",
        "(line 1058,col 9)-(line 1058,col 46)",
        "(line 1059,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1072,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 1089,
      "end_line": 1127,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time\r\n     * series.\r\n     *\r\n     * @param start  the first time period to copy (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     * @param end  the last time period to copy (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @return A time series containing a copy of this time series from start\r\n     *         until end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 35)",
        "(line 1103,col 9)-(line 1103,col 41)",
        "(line 1104,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 37)",
        "(line 1111,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.equals(java.lang.Object)",
      "begin_line": 1136,
      "end_line": 1170,
      "comment": "\r\n     * Tests the series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1139,col 9)",
        "(line 1140,col 9)-(line 1142,col 9)",
        "(line 1143,col 9)-(line 1143,col 43)",
        "(line 1144,col 9)-(line 1147,col 9)",
        "(line 1148,col 9)-(line 1151,col 9)",
        "(line 1152,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1161,col 9)",
        "(line 1162,col 9)-(line 1162,col 35)",
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.hashCode()",
      "begin_line": 1177,
      "end_line": 1202,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 38)",
        "(line 1179,col 9)-(line 1180,col 21)",
        "(line 1181,col 9)-(line 1181,col 80)",
        "(line 1182,col 9)-(line 1183,col 55)",
        "(line 1186,col 9)-(line 1186,col 35)",
        "(line 1187,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 53)",
        "(line 1200,col 9)-(line 1200,col 57)",
        "(line 1201,col 9)-(line 1201,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.updateBoundsForAddedItem(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 1211,
      "end_line": 1218,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 36)",
        "(line 1213,col 9)-(line 1217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.updateBoundsForRemovedItem(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 1228,
      "end_line": 1238,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values on\r\n     * the basis that the specified item has just been removed.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 36)",
        "(line 1230,col 9)-(line 1237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.findBoundsByIteration()",
      "begin_line": 1246,
      "end_line": 1254,
      "comment": "\r\n     * Finds the bounds of the x and y values for the series, by iterating\r\n     * through all the data items.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 31)",
        "(line 1248,col 9)-(line 1248,col 31)",
        "(line 1249,col 9)-(line 1249,col 49)",
        "(line 1250,col 9)-(line 1253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.minIgnoreNaN(double, double)",
      "begin_line": 1265,
      "end_line": 1277,
      "comment": "\r\n     * A function to find the minimum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The minimum of the two values.\r\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.maxIgnoreNaN(double, double)",
      "begin_line": 1288,
      "end_line": 1300,
      "comment": "\r\n     * A function to find the maximum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The maximum of the two values.\r\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1299,col 9)"
      ]
    }
  ]
}