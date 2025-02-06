{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/TimeSeriesCollection.java",
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
        "java.io.Serializable"
      ],
      "begin_line": 109,
      "end_line": 626,
      "comment": "\r\n * A collection of time series objects.  This class implements the \r\n * {@link org.jfree.data.xy.XYDataset} interface, as well as the extended \r\n * {@link IntervalXYDataset} interface.  This makes it a convenient dataset for\r\n * use with the {@link org.jfree.chart.plot.XYPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Storage for the time series. "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " \r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can \r\n     * be the start, middle or end of the time period.   \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Constructs an empty dataset, tied to the default timezone.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(java.util.TimeZone)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Constructs an empty dataset, tied to a specific timezone.\r\n     *\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use \r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to the default timezone.\r\n     *\r\n     * @param series the series (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesCollection.TimeSeriesCollection(org.jfree.data.time.TimeSeries, java.util.TimeZone)",
      "begin_line": 167,
      "end_line": 180,
      "comment": "\r\n     * Constructs a dataset containing a single series (more can be added),\r\n     * tied to a specific timezone.\r\n     *\r\n     * @param series  a series to add to the collection (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     * @param zone  the timezone (\u003ccode\u003enull\u003c/code\u003e permitted, will use \r\n     *              \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e in that case).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 36)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainOrder()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the order of the domain values in this dataset.\r\n     *\r\n     * @return {@link DomainOrder#ASCENDING}\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXPosition()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the position within each time period that is used for the X \r\n     * value when the collection is used as an \r\n     * {@link org.jfree.data.xy.XYDataset}.\r\n     * \r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values \r\n     * when the collection is used as an {@link XYDataset}, then sends a \r\n     * {@link DatasetChangeEvent} is sent to all registered listeners.\r\n     * \r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 32)",
        "(line 214,col 9)-(line 214,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns a list of all the series in the collection.  \r\n     * \r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesCount()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.indexOf(org.jfree.data.time.TimeSeries)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     * \r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The series index.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(int)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The series.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeries(java.lang.String)",
      "begin_line": 275,
      "end_line": 286,
      "comment": "\r\n     * Returns the series with the specified key, or \u003ccode\u003enull\u003c/code\u003e if \r\n     * there is no such series.\r\n     * \r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The series with the given key.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 33)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 278,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSeriesKey(int)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "\r\n     * Returns the key for a series.  \r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.addSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 307,
      "end_line": 314,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 30)",
        "(line 312,col 9)-(line 312,col 39)",
        "(line 313,col 9)-(line 313,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 322,
      "end_line": 329,
      "comment": "\r\n     * Removes the specified series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 33)",
        "(line 327,col 9)-(line 327,col 42)",
        "(line 328,col 9)-(line 328,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeSeries(int)",
      "begin_line": 336,
      "end_line": 341,
      "comment": "\r\n     * Removes a series from the collection.\r\n     *\r\n     * @param index  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 45)",
        "(line 338,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.removeAllSeries()",
      "begin_line": 347,
      "end_line": 360,
      "comment": "\r\n     * Removes all the series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 354,col 9)",
        "(line 357,col 9)-(line 357,col 26)",
        "(line 358,col 9)-(line 358,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getItemCount(int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns the number of items in the specified series.  This method is \r\n     * provided for convenience.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getXValue(int, int)",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 58)",
        "(line 384,col 9)-(line 384,col 51)",
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 386,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(int, int)",
      "begin_line": 397,
      "end_line": 402,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 59)",
        "(line 399,col 9)-(line 399,col 53)",
        "(line 400,col 9)-(line 400,col 50)",
        "(line 401,col 9)-(line 401,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 411,
      "end_line": 423,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 25)",
        "(line 413,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartX(int, int)",
      "begin_line": 433,
      "end_line": 438,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 59)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 437,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndX(int, int)",
      "begin_line": 448,
      "end_line": 453,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series The series (zero-based index).\r\n     * @param item  The item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 59)",
        "(line 450,col 9)-(line 450,col 53)",
        "(line 451,col 9)-(line 452,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getY(int, int)",
      "begin_line": 463,
      "end_line": 467,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 59)",
        "(line 465,col 9)-(line 465,col 53)",
        "(line 466,col 9)-(line 466,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getStartY(int, int)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getEndY(int, int)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  te series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getSurroundingItems(int, long)",
      "begin_line": 504,
      "end_line": 519,
      "comment": "\r\n     * Returns the indices of the two data items surrounding a particular \r\n     * millisecond value.  \r\n     * \r\n     * @param series  the series index.\r\n     * @param milliseconds  the time.\r\n     * \r\n     * @return An array containing the (two) indices of the items surrounding \r\n     *         the time.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 42)",
        "(line 506,col 9)-(line 506,col 50)",
        "(line 507,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 529,
      "end_line": 536,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 35)",
        "(line 531,col 9)-(line 531,col 51)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 546,
      "end_line": 553,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 35)",
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 563,
      "end_line": 585,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 28)",
        "(line 565,col 9)-(line 565,col 49)",
        "(line 566,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.equals(java.lang.Object)",
      "begin_line": 594,
      "end_line": 609,
      "comment": "\r\n     * Tests this time series collection for equality with another object.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 63)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesCollection.hashCode()",
      "begin_line": 616,
      "end_line": 624,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 19)",
        "(line 618,col 9)-(line 618,col 38)",
        "(line 619,col 9)-(line 620,col 55)",
        "(line 621,col 9)-(line 622,col 49)",
        "(line 623,col 9)-(line 623,col 22)"
      ]
    }
  ]
}