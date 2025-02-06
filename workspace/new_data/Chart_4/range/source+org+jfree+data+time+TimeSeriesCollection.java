{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/TimeSeriesCollection.java",
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
      "begin_line": 119,
      "end_line": 774,
      "comment": "\r\n * A collection of time series objects.  This class implements the\r\n * {@link XYDataset} interface, as well as the extended\r\n * {@link IntervalXYDataset} interface.  This makes it a convenient dataset for\r\n * use with the {@link org.jfree.chart.plot.XYPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Storage for the time series. "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can\r\n     * be the start, middle or end of the time period.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Constructs an empty dataset, tied to the default timezone.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(java.util.TimeZone)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\r\n     * Constructs an empty dataset, tied to a specific timezone.\r\n     *\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use\r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to the default timezone.\r\n     *\r\n     * @param series the series (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries, java.util.TimeZone)",
      "begin_line": 177,
      "end_line": 191,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to a specific timezone.\r\n     *\r\n     * @param series  a series to add to the collection (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use\r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 16)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 58)",
        "(line 184,col 9)-(line 184,col 36)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 48)",
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainOrder()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the order of the domain values in this dataset.\r\n     *\r\n     * @return {@link DomainOrder#ASCENDING}\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXPosition()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value when the collection is used as an\r\n     * {@link org.jfree.data.xy.XYDataset}.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values\r\n     * when the collection is used as an {@link XYDataset}, then sends a\r\n     * {@link DatasetChangeEvent} is sent to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 32)",
        "(line 225,col 9)-(line 225,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n     * Returns a list of all the series in the collection.\r\n     *\r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesCount()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.indexOf(org.jfree.data.time.TimeSeries)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(int)",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The series.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 286,
      "end_line": 297,
      "comment": "\r\n     * Returns the series with the specified key, or \u003ccode\u003enull\u003c/code\u003e if\r\n     * there is no such series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The series with the given key.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 49)",
        "(line 289,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesKey(int)",
      "begin_line": 306,
      "end_line": 310,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.addSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 318,
      "end_line": 325,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 30)",
        "(line 323,col 9)-(line 323,col 39)",
        "(line 324,col 9)-(line 324,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "\r\n     * Removes the specified series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 42)",
        "(line 339,col 9)-(line 339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(int)",
      "begin_line": 347,
      "end_line": 352,
      "comment": "\r\n     * Removes a series from the collection.\r\n     *\r\n     * @param index  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 45)",
        "(line 349,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeAllSeries()",
      "begin_line": 358,
      "end_line": 371,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 26)",
        "(line 369,col 9)-(line 369,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getItemCount(int)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns the number of items in the specified series.  This method is\r\n     * provided for convenience.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXValue(int, int)",
      "begin_line": 393,
      "end_line": 397,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 58)",
        "(line 395,col 9)-(line 395,col 57)",
        "(line 396,col 9)-(line 396,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(int, int)",
      "begin_line": 407,
      "end_line": 411,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 59)",
        "(line 409,col 9)-(line 409,col 58)",
        "(line 410,col 9)-(line 410,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 420,
      "end_line": 432,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 25)",
        "(line 422,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartX(int, int)",
      "begin_line": 442,
      "end_line": 446,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 59)",
        "(line 444,col 9)-(line 445,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndX(int, int)",
      "begin_line": 456,
      "end_line": 460,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series The series (zero-based index).\r\n     * @param item  The item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 59)",
        "(line 458,col 9)-(line 459,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getY(int, int)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 59)",
        "(line 472,col 9)-(line 472,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartY(int, int)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndY(int, int)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  te series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.isSelected(int, int)",
      "begin_line": 510,
      "end_line": 514,
      "comment": "\r\n     * Returns the selection state for the specified data item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the item is selected, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 41)",
        "(line 512,col 9)-(line 512,col 54)",
        "(line 513,col 9)-(line 513,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setSelected(int, int, boolean)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\r\n     * Sets the selection state for the specified data item and\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setSelected(int, int, boolean, boolean)",
      "begin_line": 541,
      "end_line": 549,
      "comment": "\r\n     * Sets the selection state for the specified data item and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 41)",
        "(line 544,col 9)-(line 544,col 54)",
        "(line 545,col 9)-(line 545,col 32)",
        "(line 546,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.clearSelection()",
      "begin_line": 556,
      "end_line": 564,
      "comment": "\r\n     * Clears the selection state for all data items.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 43)",
        "(line 558,col 9)-(line 563,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSurroundingItems(int, long)",
      "begin_line": 576,
      "end_line": 591,
      "comment": "\r\n     * Returns the indices of the two data items surrounding a particular\r\n     * millisecond value.\r\n     *\r\n     * @param series  the series index.\r\n     * @param milliseconds  the time.\r\n     *\r\n     * @return An array containing the (two) indices of the items surrounding\r\n     *         the time.\r\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 42)",
        "(line 578,col 9)-(line 578,col 50)",
        "(line 579,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 601,
      "end_line": 608,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 35)",
        "(line 603,col 9)-(line 603,col 51)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 618,
      "end_line": 625,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 35)",
        "(line 620,col 9)-(line 620,col 51)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 635,
      "end_line": 657,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 28)",
        "(line 637,col 9)-(line 637,col 49)",
        "(line 638,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainBounds(java.util.List, boolean)",
      "begin_line": 669,
      "end_line": 693,
      "comment": "\r\n     * Returns the bounds of the domain values for the specified series.\r\n     *\r\n     * @param visibleSeriesKeys  a list of keys for the visible series.\r\n     * @param includeInterval  include the x-interval?\r\n     *\r\n     * @return A range.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 28)",
        "(line 672,col 9)-(line 672,col 57)",
        "(line 673,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getRangeBounds(java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 706,
      "end_line": 719,
      "comment": "\r\n     * Returns the bounds for the y-values in the dataset.\r\n     *\r\n     * @param visibleSeriesKeys  the visible series keys.\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  ignored.\r\n     *\r\n     * @return The bounds.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 28)",
        "(line 709,col 9)-(line 709,col 57)",
        "(line 710,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.equals(java.lang.Object)",
      "begin_line": 728,
      "end_line": 743,
      "comment": "\r\n     * Tests this time series collection for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 63)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.hashCode()",
      "begin_line": 750,
      "end_line": 758,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 19)",
        "(line 752,col 9)-(line 752,col 38)",
        "(line 753,col 9)-(line 754,col 55)",
        "(line 755,col 9)-(line 756,col 49)",
        "(line 757,col 9)-(line 757,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.clone()",
      "begin_line": 767,
      "end_line": 772,
      "comment": "\r\n     * Returns a clone of this time series collection.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws java.lang.CloneNotSupportedException\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 74)",
        "(line 769,col 9)-(line 769,col 65)",
        "(line 770,col 9)-(line 770,col 72)",
        "(line 771,col 9)-(line 771,col 21)"
      ]
    }
  ]
}