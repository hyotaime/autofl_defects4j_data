{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimeTableXYDataset.java",
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
      "begin_line": 84,
      "end_line": 604,
      "comment": "\r\n * A dataset for regular time periods that implements the\r\n * {@link TableXYDataset} interface.  Note that the {@link TableXYDataset}\r\n * interface requires all series to share the same set of x-values.  When\r\n * adding a new item \u003ccode\u003e(x, y)\u003c/code\u003e to one series, all other series\r\n * automatically get a new item \u003ccode\u003e(x, null)\u003c/code\u003e unless a non-null item\r\n * has already been specified.\r\n *\r\n * @see org.jfree.data.xy.TableXYDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\r\n     * The data structure to store the values.  Each column represents\r\n     * a series (elsewhere in JFreeChart rows are typically used for series,\r\n     * but it doesn\u0027t matter that much since this data structure is private\r\n     * and symmetrical anyway), each row contains values for the same\r\n     * {@link RegularTimePeriod} (the rows are sorted into ascending order).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainIsPointsInTime"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\r\n     * A flag that indicates that the domain is \u0027points in time\u0027.  If this flag\r\n     * is true, only the x-value (and not the x-interval) is used to determine\r\n     * the range of values in the domain.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * The point within each time period that is used for the X value when this\r\n     * collection is used as an {@link org.jfree.data.xy.XYDataset}.  This can\r\n     * be the start, middle or end of the time period.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\r\n     * Creates a new dataset with the given time zone.\r\n     *\r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeTableXYDataset.TimeTableXYDataset(java.util.TimeZone, java.util.Locale)",
      "begin_line": 138,
      "end_line": 148,
      "comment": "\r\n     * Creates a new dataset with the given time zone and locale.\r\n     *\r\n     * @param zone  the time zone to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale to use (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 53)",
        "(line 146,col 9)-(line 146,col 66)",
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainIsPointsInTime()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns a flag that controls whether the domain is treated as \u0027points in\r\n     * time\u0027.\r\n     * \u003cP\u003e\r\n     * This flag is used when determining the max and min values for the domain.\r\n     * If true, then only the x-values are considered for the max and min\r\n     * values.  If false, then the start and end x-values will also be taken\r\n     * into consideration.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainIsPointsInTime(boolean)\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setDomainIsPointsInTime(boolean)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\r\n     * Sets a flag that controls whether the domain is treated as \u0027points in\r\n     * time\u0027, or time periods.  A {@link DatasetChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #getDomainIsPointsInTime()\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 41)",
        "(line 178,col 9)-(line 178,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXPosition()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setXPosition(TimePeriodAnchor)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values,\r\n     * then sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getXPosition()\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 207,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, double, java.lang.String)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Adds a new data item to the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period.\r\n     * @param y  the value for this period.\r\n     * @param seriesName  the name of the series to add the value.\r\n     *\r\n     * @see #remove(TimePeriod, String)\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.add(org.jfree.data.time.TimePeriod, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 237,
      "end_line": 252,
      "comment": "\r\n     * Adds a new data item to the dataset and, if requested, sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the value for this period (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param seriesName  the name of the series to add the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     *\r\n     * @see #remove(TimePeriod, String, boolean)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 52)",
        "(line 248,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Removes an existing data item from the dataset.\r\n     *\r\n     * @param period  the (existing!) time period of the value to remove\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(TimePeriod, double, String)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.remove(org.jfree.data.time.TimePeriod, java.lang.String, boolean)",
      "begin_line": 280,
      "end_line": 286,
      "comment": "\r\n     * Removes an existing data item from the dataset and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param period  the (existing!) time period of the value to remove\r\n     *                (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param seriesName  the (existing!) series name to remove the value\r\n     *                    (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  whether dataset listener are notified or not.\r\n     *\r\n     * @see #add(TimePeriod, double, String)\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 52)",
        "(line 282,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clear()",
      "begin_line": 294,
      "end_line": 300,
      "comment": "\r\n     * Removes all data items from the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getTimePeriod(int)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the time period for the specified item.  Bear in mind that all\r\n     * series share the same set of time periods.\r\n     *\r\n     * @param item  the item index (0 \u003c\u003d i \u003c\u003d {@link #getItemCount()}).\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\r\n     * Returns the number of items in ALL series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getItemCount(int)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\r\n     * Returns the number of items in a series.  This is the same value\r\n     * that is returned by {@link #getItemCount()} since all series\r\n     * share the same x-values (time periods).\r\n     *\r\n     * @param series  the series (zero-based index, ignored).\r\n     *\r\n     * @return The number of items within the series.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesCount()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getSeriesKey(int)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getX(int, int)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or\r\n     * may not be returned in ascending order, that is up to the class\r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(int, int)",
      "begin_line": 378,
      "end_line": 381,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 69)",
        "(line 380,col 9)-(line 380,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartX(int, int)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     *\r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartXValue(int, int)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 69)",
        "(line 408,col 9)-(line 408,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndX(int, int)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     *\r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndXValue(int, int)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within\r\n     * a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 69)",
        "(line 436,col 9)-(line 436,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getY(int, int)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getStartY(int, int)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getEndY(int, int)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item within a series (zero-based index).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getXValue(org.jfree.data.time.TimePeriod)",
      "begin_line": 482,
      "end_line": 496,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 25)",
        "(line 484,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 506,
      "end_line": 513,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 35)",
        "(line 508,col 9)-(line 508,col 51)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 523,
      "end_line": 530,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 35)",
        "(line 525,col 9)-(line 525,col 51)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 540,
      "end_line": 556,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that controls whether or not the\r\n     *                         x-intervals are taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 45)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 52)",
        "(line 547,col 9)-(line 547,col 65)",
        "(line 549,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.equals(java.lang.Object)",
      "begin_line": 565,
      "end_line": 588,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 59)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeTableXYDataset.clone()",
      "begin_line": 597,
      "end_line": 602,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 70)",
        "(line 599,col 9)-(line 599,col 66)",
        "(line 600,col 9)-(line 600,col 72)",
        "(line 601,col 9)-(line 601,col 21)"
      ]
    }
  ]
}