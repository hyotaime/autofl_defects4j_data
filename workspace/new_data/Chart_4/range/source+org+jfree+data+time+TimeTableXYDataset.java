{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/TimeTableXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeTableXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.data.xy.TableXYDataset"
      ],
      "begin_line": 83,
      "end_line": 598,
      "comment": "\r\n * A dataset for regular time periods that implements the\r\n * {@link TableXYDataset} interface.  Note that the {@link TableXYDataset}\r\n * interface requires all series to share the same set of x-values.  When\r\n * adding a new item \u003ccode\u003e(x, y)\u003c/code\u003e to one series, all other series\r\n * automatically get a new item \u003ccode\u003e(x, null)\u003c/code\u003e unless a non-null item\r\n * has already been specified.\r\n *\r\n * @see org.jfree.data.xy.TableXYDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\r\n     * The data structure to store the values.  Each column represents\r\n     * a series (elsewhere in JFreeChart rows are typically used for series,\r\n     * but it doesn\u0027t matter that much since this data structure is private\r\n     * and symmetrical anyway), each row contains values for the same\r\n     * {@link RegularTimePeriod} (the rows are sorted into ascending order).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainIsPointsInTime"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\r\n     * A flag that indicates that the domain is \u0027points in time\u0027.  If this flag\r\n     * is true, only the x-value (and not the x-interval) is used to determine\r\n     * the range of values in the domain.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can\r\n     * be the start, middle or end of the time period.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\r\n     * Creates a new dataset with the given time zone.\r\n     *\r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone, java.util.Locale)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\r\n     * Creates a new dataset with the given time zone and locale.\r\n     *\r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 53)",
        "(line 145,col 9)-(line 145,col 66)",
        "(line 146,col 9)-(line 146,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainIsPointsInTime()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns a flag that controls whether the domain is treated as \u0027points in\r\n     * time\u0027.\r\n     * \u003cP\u003e\r\n     * This flag is used when determining the max and min values for the domain.\r\n     * If true, then only the x-values are considered for the max and min\r\n     * values.  If false, then the start and end x-values will also be taken\r\n     * into consideration.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainIsPointsInTime(boolean)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setDomainIsPointsInTime(boolean)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\r\n     * Sets a flag that controls whether the domain is treated as \u0027points in\r\n     * time\u0027, or time periods.  A {@link DatasetChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #getDomainIsPointsInTime()\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXPosition()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setXPosition(TimePeriodAnchor)\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values,\r\n     * then sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getXPosition()\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 32)",
        "(line 205,col 9)-(line 205,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, double, java.lang.String)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Adds a new data item to the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period.\r\n     * @param y  the value for this period.\r\n     * @param seriesName  the name of the series to add the value.\r\n     *\r\n     * @see #remove(TimePeriod, String)\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 234,
      "end_line": 248,
      "comment": "\r\n     * Adds a new data item to the dataset and, if requested, sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the value for this period (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param seriesName  the name of the series to add the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     *\r\n     * @see #remove(TimePeriod, String, boolean)\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Removes an existing data item from the dataset.\r\n     *\r\n     * @param period  the (existing!) time period of the value to remove\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(TimePeriod, double, String)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String, boolean)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\r\n     * Removes an existing data item from the dataset and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the (existing!) time period of the value to remove\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     *\r\n     * @see #add(TimePeriod, double, String)\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 52)",
        "(line 278,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clear()",
      "begin_line": 289,
      "end_line": 294,
      "comment": "\r\n     * Removes all data items from the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getTimePeriod(int)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\r\n     * Returns the time period for the specified item.  Bear in mind that all\r\n     * series share the same set of time periods.\r\n     *\r\n     * @param item  the item index (0 \u003c\u003d i \u003c\u003d {@link #getItemCount()}).\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\r\n     * Returns the number of items in ALL series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount(int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the number of items in a series.  This is the same value\r\n     * that is returned by {@link #getItemCount()} since all series\r\n     * share the same x-values (time periods).\r\n     *\r\n     * @param series  the series (zero-based index, ignored).\r\n     *\r\n     * @return The number of items within the series.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesCount()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesKey(int)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getX(int, int)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or\r\n     * may not be returned in ascending order, that is up to the class\r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(int, int)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 69)",
        "(line 374,col 9)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartX(int, int)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     *\r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartXValue(int, int)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 69)",
        "(line 402,col 9)-(line 402,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndX(int, int)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     *\r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndXValue(int, int)",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 69)",
        "(line 430,col 9)-(line 430,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getY(int, int)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartY(int, int)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndY(int, int)",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(org.jfree.data.time.TimePeriod)",
      "begin_line": 476,
      "end_line": 490,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 25)",
        "(line 478,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 500,
      "end_line": 507,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 35)",
        "(line 502,col 9)-(line 502,col 51)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 517,
      "end_line": 524,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 35)",
        "(line 519,col 9)-(line 519,col 51)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 534,
      "end_line": 550,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that controls whether or not the\r\n     *                         x-intervals are taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 45)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 52)",
        "(line 541,col 9)-(line 541,col 65)",
        "(line 543,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.equals(java.lang.Object)",
      "begin_line": 559,
      "end_line": 582,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 59)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clone()",
      "begin_line": 591,
      "end_line": 596,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 70)",
        "(line 593,col 9)-(line 593,col 66)",
        "(line 594,col 9)-(line 594,col 72)",
        "(line 595,col 9)-(line 595,col 21)"
      ]
    }
  ]
}