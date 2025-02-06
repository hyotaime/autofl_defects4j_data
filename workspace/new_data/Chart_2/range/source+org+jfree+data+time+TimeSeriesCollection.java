{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimeSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.XYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.data.xy.XYDomainInfo",
        "org.jfree.data.xy.XYRangeInfo",
        "org.jfree.data.xy.XYDatasetSelectionState",
        "org.jfree.data.xy.SelectableXYDataset",
        "java.io.Serializable"
      ],
      "begin_line": 120,
      "end_line": 790,
      "comment": "\r\n * A collection of time series objects.  This class implements the\r\n * {@link XYDataset} interface, as well as the extended\r\n * {@link IntervalXYDataset} interface.  This makes it a convenient dataset for\r\n * use with the {@link org.jfree.chart.plot.XYPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Storage for the time series. "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can\r\n     * be the start, middle or end of the time period.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Constructs an empty dataset, tied to the default timezone.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(java.util.TimeZone)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Constructs an empty dataset, tied to a specific timezone.\r\n     *\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use\r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to the default timezone.\r\n     *\r\n     * @param series the series (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries, java.util.TimeZone)",
      "begin_line": 178,
      "end_line": 192,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to a specific timezone.\r\n     *\r\n     * @param series  a series to add to the collection (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use\r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 16)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 58)",
        "(line 185,col 9)-(line 185,col 36)",
        "(line 186,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainOrder()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the order of the domain values in this dataset.\r\n     *\r\n     * @return {@link DomainOrder#ASCENDING}\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXPosition()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value when the collection is used as an\r\n     * {@link org.jfree.data.xy.XYDataset}.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values\r\n     * when the collection is used as an {@link XYDataset}, then sends a\r\n     * {@link DatasetChangeEvent} is sent to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 32)",
        "(line 226,col 9)-(line 226,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns a list of all the series in the collection.\r\n     *\r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesCount()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.indexOf(org.jfree.data.time.TimeSeries)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(int)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The series.\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 288,
      "end_line": 299,
      "comment": "\r\n     * Returns the series with the specified key, or \u003ccode\u003enull\u003c/code\u003e if\r\n     * there is no such series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The series with the given key.\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 33)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesKey(int)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.addSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 320,
      "end_line": 328,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 30)",
        "(line 325,col 9)-(line 325,col 39)",
        "(line 326,col 9)-(line 326,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 336,
      "end_line": 344,
      "comment": "\r\n     * Removes the specified series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 33)",
        "(line 341,col 9)-(line 341,col 42)",
        "(line 342,col 9)-(line 342,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(int)",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\r\n     * Removes a series from the collection.\r\n     *\r\n     * @param index  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 45)",
        "(line 353,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeAllSeries()",
      "begin_line": 362,
      "end_line": 376,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 369,col 9)",
        "(line 372,col 9)-(line 372,col 26)",
        "(line 373,col 9)-(line 373,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getItemCount(int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns the number of items in the specified series.  This method is\r\n     * provided for convenience.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXValue(int, int)",
      "begin_line": 398,
      "end_line": 402,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 58)",
        "(line 400,col 9)-(line 400,col 57)",
        "(line 401,col 9)-(line 401,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(int, int)",
      "begin_line": 412,
      "end_line": 416,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 59)",
        "(line 414,col 9)-(line 414,col 58)",
        "(line 415,col 9)-(line 415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 425,
      "end_line": 437,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 25)",
        "(line 427,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartX(int, int)",
      "begin_line": 447,
      "end_line": 451,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 59)",
        "(line 449,col 9)-(line 450,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndX(int, int)",
      "begin_line": 461,
      "end_line": 465,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series The series (zero-based index).\r\n     * @param item  The item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 59)",
        "(line 463,col 9)-(line 464,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getY(int, int)",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 59)",
        "(line 477,col 9)-(line 477,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartY(int, int)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndY(int, int)",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  te series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.isSelected(int, int)",
      "begin_line": 515,
      "end_line": 519,
      "comment": "\r\n     * Returns the selection state for the specified data item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the item is selected, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 41)",
        "(line 517,col 9)-(line 517,col 54)",
        "(line 518,col 9)-(line 518,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setSelected(int, int, boolean)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Sets the selection state for the specified data item and\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setSelected(int, int, boolean, boolean)",
      "begin_line": 546,
      "end_line": 554,
      "comment": "\r\n     * Sets the selection state for the specified data item and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 41)",
        "(line 549,col 9)-(line 549,col 54)",
        "(line 550,col 9)-(line 550,col 32)",
        "(line 551,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.clearSelection()",
      "begin_line": 561,
      "end_line": 569,
      "comment": "\r\n     * Clears the selection state for all data items.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 43)",
        "(line 563,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.fireSelectionEvent()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "\r\n     * Sends an event to all registered listeners to indicate that the\r\n     * selection has changed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSurroundingItems(int, long)",
      "begin_line": 592,
      "end_line": 607,
      "comment": "\r\n     * Returns the indices of the two data items surrounding a particular\r\n     * millisecond value.\r\n     *\r\n     * @param series  the series index.\r\n     * @param milliseconds  the time.\r\n     *\r\n     * @return An array containing the (two) indices of the items surrounding\r\n     *         the time.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 42)",
        "(line 594,col 9)-(line 594,col 50)",
        "(line 595,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 617,
      "end_line": 624,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 35)",
        "(line 619,col 9)-(line 619,col 51)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 634,
      "end_line": 641,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 35)",
        "(line 636,col 9)-(line 636,col 51)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 651,
      "end_line": 673,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 28)",
        "(line 653,col 9)-(line 653,col 49)",
        "(line 654,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainBounds(java.util.List, boolean)",
      "begin_line": 685,
      "end_line": 709,
      "comment": "\r\n     * Returns the bounds of the domain values for the specified series.\r\n     *\r\n     * @param visibleSeriesKeys  a list of keys for the visible series.\r\n     * @param includeInterval  include the x-interval?\r\n     *\r\n     * @return A range.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 28)",
        "(line 688,col 9)-(line 688,col 57)",
        "(line 689,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getRangeBounds(java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 722,
      "end_line": 735,
      "comment": "\r\n     * Returns the bounds for the y-values in the dataset.\r\n     *\r\n     * @param visibleSeriesKeys  the visible series keys.\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  ignored.\r\n     *\r\n     * @return The bounds.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 28)",
        "(line 725,col 9)-(line 725,col 57)",
        "(line 726,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.equals(java.lang.Object)",
      "begin_line": 744,
      "end_line": 759,
      "comment": "\r\n     * Tests this time series collection for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 63)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.hashCode()",
      "begin_line": 766,
      "end_line": 774,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 19)",
        "(line 768,col 9)-(line 768,col 38)",
        "(line 769,col 9)-(line 770,col 55)",
        "(line 771,col 9)-(line 772,col 49)",
        "(line 773,col 9)-(line 773,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.clone()",
      "begin_line": 783,
      "end_line": 788,
      "comment": "\r\n     * Returns a clone of this time series collection.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws java.lang.CloneNotSupportedException\r\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 74)",
        "(line 785,col 9)-(line 785,col 65)",
        "(line 786,col 9)-(line 786,col 72)",
        "(line 787,col 9)-(line 787,col 21)"
      ]
    }
  ]
}