{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/time/DynamicTimeSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DynamicTimeSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.data.RangeInfo"
      ],
      "begin_line": 84,
      "end_line": 971,
      "comment": "\r\n * A dynamic dataset.\r\n * \u003cp\u003e\r\n * Like FastTimeSeriesCollection, this class is a functional replacement\r\n * for JFreeChart\u0027s TimeSeriesCollection _and_ TimeSeries classes.\r\n * FastTimeSeriesCollection is appropriate for a fixed time range; for\r\n * real-time applications this subclass adds the ability to append new\r\n * data and discard the oldest.\r\n * In this class, the arrays used in FastTimeSeriesCollection become FIFO\u0027s.\r\n * NOTE:As presented here, all data is assumed \u003e\u003d 0, an assumption which is\r\n * embodied only in methods associated with interface RangeInfo.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "START"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " \r\n     * Useful constant for controlling the x-value returned for a time \r\n     * period. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIDDLE"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " \r\n     * Useful constant for controlling the x-value returned for a time period. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "END"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " \r\n     * Useful constant for controlling the x-value returned for a time period. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " an arbitrary safe default value"
    },
    {
      "type": "field",
      "varNames": [
        "historyCount"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The history count. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Storage for the series keys. "
    },
    {
      "type": "field",
      "varNames": [
        "timePeriodClass"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " default value;"
    },
    {
      "type": "field",
      "varNames": [
        "pointsInTime"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Storage for the x-values. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesCount"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The number of series. "
    },
    {
      "type": "class_interface",
      "name": "ValueSequence",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 126,
      "end_line": 170,
      "comment": "\r\n     * A wrapper for a fixed array of float values.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataPoints"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Storage for the float values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.ValueSequence()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n         * Default constructor:\r\n         ",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.ValueSequence(int)",
      "begin_line": 143,
      "end_line": 148,
      "comment": "\r\n         * Creates a sequence with the specified length.\r\n         *\r\n         * @param length  the length.\r\n         ",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 48)",
        "(line 145,col 13)-(line 147,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.enterData(int, float)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n         * Enters data into the storage array.\r\n         *\r\n         * @param index  the index.\r\n         * @param value  the value.\r\n         ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.getData(int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n         * Returns a value from the storage array.\r\n         *\r\n         * @param index  the index.\r\n         *\r\n         * @return The value.\r\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "valueHistory"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " An array for storing the objects that represent each series. "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " \r\n     * The position within a time period to return as the x-value (START, \r\n     * MIDDLE or END). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainIsPointsInTime"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": "\r\n     * A flag that indicates that the domain is \u0027points in time\u0027.  If this flag \r\n     * is true, only the x-value is used to determine the range of values in \r\n     * the domain, the start and end x-values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "oldestAt"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " as a class variable, initializes \u003d\u003d 0"
    },
    {
      "type": "field",
      "varNames": [
        "newestAt"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Index of the newest data item. "
    },
    {
      "type": "field",
      "varNames": [
        "deltaTime"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " the # of msec by which time advances. "
    },
    {
      "type": "field",
      "varNames": [
        "domainStart"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Cached domain start (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "domainEnd"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Cached domain end (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "domainRange"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Cached domain range (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "minValue"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The minimum value. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The maximum value. "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " autoinit\u0027s to null."
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\r\n     * Constructs a dataset with capacity for N series, tied to default \r\n     * timezone.\r\n     *\r\n     * @param nSeries the number of series to be accommodated.\r\n     * @param nMoments the number of TimePeriods to be spanned.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 74)",
        "(line 233,col 9)-(line 233,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, java.util.TimeZone)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\r\n     * Constructs an empty dataset, tied to a specific timezone.\r\n     *\r\n     * @param nSeries the number of series to be accommodated\r\n     * @param nMoments the number of TimePeriods to be spanned\r\n     * @param zone the timezone.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 57)",
        "(line 247,col 9)-(line 247,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param nSeries  the number of series.\r\n     * @param nMoments  the number of items per series.\r\n     * @param timeSample  a time period sample.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, org.jfree.data.time.RegularTimePeriod, java.util.TimeZone)",
      "begin_line": 271,
      "end_line": 302,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param nSeries  the number of series.\r\n     * @param nMoments  the number of items per series.\r\n     * @param timeSample  a time period sample.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 41)",
        "(line 278,col 9)-(line 278,col 37)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 285,col 55)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 289,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 300,col 9)-(line 300,col 30)",
        "(line 301,col 9)-(line 301,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setTimeBase(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 315,
      "end_line": 335,
      "comment": "\r\n     * Fill the pointsInTime with times using TimePeriod.next():\r\n     * Will silently return if the time array was already populated.\r\n     *\r\n     * Also computes the data cached for later use by\r\n     * methods implementing the DomainInfo interface:\r\n     *\r\n     * @param start  the start.\r\n     *\r\n     * @return ??.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 10)",
        "(line 326,col 9)-(line 328,col 10)",
        "(line 329,col 9)-(line 329,col 41)",
        "(line 330,col 9)-(line 330,col 26)",
        "(line 331,col 9)-(line 331,col 46)",
        "(line 332,col 9)-(line 332,col 27)",
        "(line 333,col 9)-(line 333,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.findDomainLimits()",
      "begin_line": 341,
      "end_line": 355,
      "comment": "\r\n     * Finds the domain limits.  Note: this doesn\u0027t need to be synchronized \r\n     * because it\u0027s called from within another method that already is.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 80)",
        "(line 344,col 9)-(line 344,col 18)",
        "(line 345,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 352,col 40)",
        "(line 353,col 9)-(line 353,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getPosition()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\r\n     * Returns the x position type (START, MIDDLE or END).\r\n     *\r\n     * @return The x position type.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setPosition(int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Sets the x position type (START, MIDDLE or END).\r\n     *\r\n     * @param position The x position type.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.addSeries(float[], int, java.lang.Comparable)",
      "begin_line": 386,
      "end_line": 430,
      "comment": "\r\n     * Adds a series to the dataset.  Only the y-values are supplied, the \r\n     * x-values are specified elsewhere.\r\n     *\r\n     * @param values  the y-values.\r\n     * @param seriesNumber  the series index (zero-based).\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * Use this as-is during setup only, or add the synchronized keyword around \r\n     * the copy loop.\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 14)",
        "(line 391,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 403,col 9)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 43)",
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setSeriesKey(int, java.lang.Comparable)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\r\n     * Sets the name of a series.  If planning to add values individually.\r\n     *\r\n     * @param seriesNumber  the series.\r\n     * @param key  the new key.\r\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.addValue(int, int, float)",
      "begin_line": 449,
      "end_line": 469,
      "comment": "\r\n     * Adds a value to a series.\r\n     *\r\n     * @param seriesNumber  the series index.\r\n     * @param index  ??.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 30)",
        "(line 452,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 462,col 9)",
        "(line 466,col 13)-(line 466,col 68)",
        "(line 468,col 9)-(line 468,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getSeriesCount()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getItemCount(int)",
      "begin_line": 489,
      "end_line": 492,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \u003cp\u003e\r\n     * For this implementation, all series have the same number of items.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.translateGet(int)",
      "begin_line": 503,
      "end_line": 513,
      "comment": "\r\n     * Re-map an index, for use in retrieving data.\r\n     *\r\n     * @param toFetch  the index.\r\n     *\r\n     * @return The translated index.\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 508,col 47)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.offsetFromNewest(int)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\r\n     * Returns the actual index to a time offset by \"delta\" from newestAt.\r\n     *\r\n     * @param delta  the delta.\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.offsetFromOldest(int)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\r\n     * ??\r\n     *\r\n     * @param delta ??\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.wrapOffset(int)",
      "begin_line": 544,
      "end_line": 553,
      "comment": "\r\n     * ??\r\n     *\r\n     * @param protoIndex  the index.\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 29)",
        "(line 546,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.advanceTime()",
      "begin_line": 562,
      "end_line": 607,
      "comment": "\r\n     * Adjust the array offset as needed when a new time-period is added:\r\n     * Increments the indices \"oldestAt\" and \"newestAt\", mod(array length),\r\n     * zeroes the series values at newestAt, returns the new TimePeriod.\r\n     *\r\n     * @return The new time period.\r\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 80)",
        "(line 564,col 9)-(line 564,col 38)",
        "(line 571,col 9)-(line 571,col 39)",
        "(line 572,col 9)-(line 572,col 28)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 588,col 34)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 593,col 9)-(line 593,col 55)",
        "(line 595,col 9)-(line 595,col 24)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 600,col 51)",
        "(line 601,col 9)-(line 601,col 61)",
        "(line 602,col 9)-(line 602,col 47)",
        "(line 603,col 9)-(line 603,col 57)",
        "(line 604,col 9)-(line 604,col 51)",
        "(line 605,col 9)-(line 605,col 28)",
        "(line 606,col 9)-(line 606,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.invalidateRangeInfo()",
      "begin_line": 614,
      "end_line": 617,
      "comment": "\r\n     * Invalidates the range info.\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 29)",
        "(line 616,col 9)-(line 616,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.findMaxValue()",
      "begin_line": 624,
      "end_line": 635,
      "comment": "\r\n     * Returns the maximum value.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 26)",
        "(line 626,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getOldestIndex()",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\r\n     * Returns the index of the oldest data item.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getNewestIndex()",
      "begin_line": 653,
      "end_line": 655,
      "comment": "\r\n     * Returns the index of the newest data item.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.appendData(float[])",
      "begin_line": 664,
      "end_line": 681,
      "comment": "\r\n     * Appends new data.\r\n     *\r\n     * @param newData  the data.\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 41)",
        "(line 666,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 14)",
        "(line 672,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.appendData(float[], int, int)",
      "begin_line": 691,
      "end_line": 710,
      "comment": "\r\n     * Appends data at specified index, for loading up with data from file(s).\r\n     *\r\n     * @param  newData  the data\r\n     * @param  insertionIndex  the index value at which to put it\r\n     * @param  refresh  value of n in \"refresh the display on every nth call\"\r\n     *                 (ignored if \u003c\u003d 0 )\r\n     ",
      "child_ranges": [
        "(line 692,col 10)-(line 692,col 42)",
        "(line 693,col 10)-(line 697,col 10)",
        "(line 698,col 10)-(line 703,col 10)",
        "(line 704,col 10)-(line 709,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getNewestTime()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\r\n     * Returns the newest time.\r\n     *\r\n     * @return The newest time.\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getOldestTime()",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\r\n     * Returns the oldest time.\r\n     *\r\n     * @return The oldest time.\r\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getX(int, int)",
      "begin_line": 740,
      "end_line": 743,
      "comment": " Don\u0027t synchronize this!! Instead, synchronize the loop that calls it.",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 69)",
        "(line 742,col 9)-(line 742,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getYValue(int, int)",
      "begin_line": 753,
      "end_line": 758,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 57)",
        "(line 757,col 9)-(line 757,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getY(int, int)",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getStartX(int, int)",
      "begin_line": 780,
      "end_line": 783,
      "comment": "\r\n     * Returns the start x-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 69)",
        "(line 782,col 9)-(line 782,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getEndX(int, int)",
      "begin_line": 793,
      "end_line": 796,
      "comment": "\r\n     * Returns the end x-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 69)",
        "(line 795,col 9)-(line 795,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getStartY(int, int)",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\r\n     * Returns the start y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getEndY(int, int)",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\r\n     * Returns the end y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getSeriesKey(int)",
      "begin_line": 840,
      "end_line": 842,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.fireSeriesChanged()",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\r\n     * Sends a {@link SeriesChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 864,
      "end_line": 867,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 877,
      "end_line": 880,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 890,
      "end_line": 895,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 904,
      "end_line": 915,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeLowerBound(boolean)",
      "begin_line": 931,
      "end_line": 937,
      "comment": "\r\n     * Returns the minimum range value.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The minimum range value.\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 35)",
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeUpperBound(boolean)",
      "begin_line": 947,
      "end_line": 953,
      "comment": "\r\n     * Returns the maximum range value.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The maximum range value.\r\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 35)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeBounds(boolean)",
      "begin_line": 963,
      "end_line": 969,
      "comment": "\r\n     * Returns the value range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 968,col 31)"
      ]
    }
  ]
}