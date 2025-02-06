{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/TimeTableXYDataset.java",
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
      "begin_line": 77,
      "end_line": 565,
      "comment": "\r\n * A dataset for regular time periods that implements the \r\n * {@link TableXYDataset} interface.\r\n * \r\n * @see org.jfree.data.xy.TableXYDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\r\n     * The data structure to store the values.  Each column represents\r\n     * a series (elsewhere in JFreeChart rows are typically used for series,\r\n     * but it doesn\u0027t matter that much since this data structure is private \r\n     * and symmetrical anyway), each row contains values for the same \r\n     * {@link RegularTimePeriod} (the rows are sorted into ascending order).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainIsPointsInTime"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * A flag that indicates that the domain is \u0027points in time\u0027.  If this flag\r\n     * is true, only the x-value (and not the x-interval) is used to determine \r\n     * the range of values in the domain.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " \r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can \r\n     * be the start, middle or end of the time period.   \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\r\n     * Creates a new dataset with the given time zone.\r\n     * \r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone, java.util.Locale)",
      "begin_line": 133,
      "end_line": 143,
      "comment": "\r\n     * Creates a new dataset with the given time zone and locale.\r\n     * \r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 53)",
        "(line 141,col 9)-(line 141,col 66)",
        "(line 142,col 9)-(line 142,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainIsPointsInTime()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns a flag that controls whether the domain is treated as \u0027points in\r\n     * time\u0027.\r\n     * \u003cP\u003e\r\n     * This flag is used when determining the max and min values for the domain.\r\n     * If true, then only the x-values are considered for the max and min \r\n     * values.  If false, then the start and end x-values will also be taken \r\n     * into consideration.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setDomainIsPointsInTime(boolean)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\r\n     * Sets a flag that controls whether the domain is treated as \u0027points in \r\n     * time\u0027, or time periods.  A {@link DatasetChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 41)",
        "(line 169,col 9)-(line 169,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXPosition()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the position within each time period that is used for the X \r\n     * value.\r\n     * \r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 188,
      "end_line": 194,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values,\r\n     * then sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 193,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, double, java.lang.String)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Adds a new data item to the dataset and sends a \r\n     * {@link org.jfree.data.general.DatasetChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param period  the time period.\r\n     * @param y  the value for this period.\r\n     * @param seriesName  the name of the series to add the value.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 218,
      "end_line": 224,
      "comment": "\r\n     * Adds a new data item to the dataset.\r\n     * \r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the value for this period (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param seriesName  the name of the series to add the value \r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 52)",
        "(line 221,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Removes an existing data item from the dataset.\r\n     * \r\n     * @param period  the (existing!) time period of the value to remove \r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value \r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String, boolean)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\r\n     * Removes an existing data item from the dataset.\r\n     * \r\n     * @param period  the (existing!) time period of the value to remove \r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value \r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 52)",
        "(line 249,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clear()",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\r\n     * Removes all data items from the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getTimePeriod(int)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Returns the time period for the specified item.  Bear in mind that all\r\n     * series share the same set of time periods.\r\n     * \r\n     * @param item  the item index (0 \u003c\u003d i \u003c\u003d {@link #getItemCount()}).\r\n     * \r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n     * Returns the number of items in ALL series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount(int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the number of items in a series.  This is the same value\r\n     * that is returned by {@link #getItemCount()} since all series\r\n     * share the same x-values (time periods).\r\n     *\r\n     * @param series  the series (zero-based index, ignored).\r\n     *\r\n     * @return The number of items within the series.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesCount()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesKey(int)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getX(int, int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or \r\n     * may not be returned in ascending order, that is up to the class \r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(int, int)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 69)",
        "(line 345,col 9)-(line 345,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartX(int, int)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartXValue(int, int)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within \r\n     * a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 69)",
        "(line 371,col 9)-(line 371,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndX(int, int)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndXValue(int, int)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within \r\n     * a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 69)",
        "(line 397,col 9)-(line 397,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getY(int, int)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartY(int, int)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndY(int, int)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(org.jfree.data.time.TimePeriod)",
      "begin_line": 443,
      "end_line": 457,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 25)",
        "(line 445,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 467,
      "end_line": 474,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 35)",
        "(line 469,col 9)-(line 469,col 51)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 484,
      "end_line": 491,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 35)",
        "(line 486,col 9)-(line 486,col 51)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 501,
      "end_line": 517,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     * \r\n     * @param includeInterval  a flag that controls whether or not the\r\n     *                         x-intervals are taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 45)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 507,col 9)-(line 507,col 52)",
        "(line 508,col 9)-(line 508,col 65)",
        "(line 510,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.equals(java.lang.Object)",
      "begin_line": 526,
      "end_line": 549,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 59)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clone()",
      "begin_line": 558,
      "end_line": 563,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 70)",
        "(line 560,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 561,col 72)",
        "(line 562,col 9)-(line 562,col 21)"
      ]
    }
  ]
}