{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/DynamicTimeSeriesCollection.java",
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
      "end_line": 969,
      "comment": "\r\n * A dynamic dataset.\r\n * \u003cp\u003e\r\n * Like FastTimeSeriesCollection, this class is a functional replacement\r\n * for JFreeChart\u0027s TimeSeriesCollection _and_ TimeSeries classes.\r\n * FastTimeSeriesCollection is appropriate for a fixed time range; for\r\n * real-time applications this subclass adds the ability to append new\r\n * data and discard the oldest.\r\n * In this class, the arrays used in FastTimeSeriesCollection become FIFO\u0027s.\r\n * NOTE:As presented here, all data is assumed \u003e\u003d 0, an assumption which is\r\n * embodied only in methods associated with interface RangeInfo.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "START"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * Useful constant for controlling the x-value returned for a time\r\n     * period.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIDDLE"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\r\n     * Useful constant for controlling the x-value returned for a time period.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "END"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\r\n     * Useful constant for controlling the x-value returned for a time period.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " an arbitrary safe default value"
    },
    {
      "type": "field",
      "varNames": [
        "historyCount"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The history count. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Storage for the series keys. "
    },
    {
      "type": "field",
      "varNames": [
        "timePeriodClass"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " default value;"
    },
    {
      "type": "field",
      "varNames": [
        "pointsInTime"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Storage for the x-values. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesCount"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The number of series. "
    },
    {
      "type": "class_interface",
      "name": "ValueSequence",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 124,
      "end_line": 168,
      "comment": "\r\n     * A wrapper for a fixed array of float values.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataPoints"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Storage for the float values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.ValueSequence()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n         * Default constructor:\r\n         ",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.ValueSequence(int)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\r\n         * Creates a sequence with the specified length.\r\n         *\r\n         * @param length  the length.\r\n         ",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 48)",
        "(line 143,col 13)-(line 145,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.enterData(int, float)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n         * Enters data into the storage array.\r\n         *\r\n         * @param index  the index.\r\n         * @param value  the value.\r\n         ",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.ValueSequence.getData(int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n         * Returns a value from the storage array.\r\n         *\r\n         * @param index  the index.\r\n         *\r\n         * @return The value.\r\n         ",
      "child_ranges": [
        "(line 166,col 13)-(line 166,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "valueHistory"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " An array for storing the objects that represent each series. "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " A working calendar (to recycle) "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\r\n     * The position within a time period to return as the x-value (START,\r\n     * MIDDLE or END).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainIsPointsInTime"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": "\r\n     * A flag that indicates that the domain is \u0027points in time\u0027.  If this flag\r\n     * is true, only the x-value is used to determine the range of values in\r\n     * the domain, the start and end x-values are ignored.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "oldestAt"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " as a class variable, initializes \u003d\u003d 0"
    },
    {
      "type": "field",
      "varNames": [
        "newestAt"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Index of the newest data item. "
    },
    {
      "type": "field",
      "varNames": [
        "deltaTime"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " the # of msec by which time advances. "
    },
    {
      "type": "field",
      "varNames": [
        "domainStart"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Cached domain start (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "domainEnd"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Cached domain end (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "domainRange"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Cached domain range (for use by DomainInfo). "
    },
    {
      "type": "field",
      "varNames": [
        "minValue"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The minimum value. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " The maximum value. "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " autoinit\u0027s to null."
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int)",
      "begin_line": 228,
      "end_line": 233,
      "comment": "\r\n     * Constructs a dataset with capacity for N series, tied to default\r\n     * timezone.\r\n     *\r\n     * @param nSeries the number of series to be accommodated.\r\n     * @param nMoments the number of TimePeriods to be spanned.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 74)",
        "(line 231,col 9)-(line 231,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, java.util.TimeZone)",
      "begin_line": 242,
      "end_line": 246,
      "comment": "\r\n     * Constructs an empty dataset, tied to a specific timezone.\r\n     *\r\n     * @param nSeries the number of series to be accommodated\r\n     * @param nMoments the number of TimePeriods to be spanned\r\n     * @param zone the timezone.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 57)",
        "(line 245,col 9)-(line 245,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 255,
      "end_line": 259,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param nSeries  the number of series.\r\n     * @param nMoments  the number of items per series.\r\n     * @param timeSample  a time period sample.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.DynamicTimeSeriesCollection(int, int, org.jfree.data.time.RegularTimePeriod, java.util.TimeZone)",
      "begin_line": 269,
      "end_line": 300,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param nSeries  the number of series.\r\n     * @param nMoments  the number of items per series.\r\n     * @param timeSample  a time period sample.\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 37)",
        "(line 277,col 9)-(line 277,col 50)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 37)",
        "(line 283,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 53)",
        "(line 287,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 58)",
        "(line 298,col 9)-(line 298,col 30)",
        "(line 299,col 9)-(line 299,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setTimeBase(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 313,
      "end_line": 333,
      "comment": "\r\n     * Fill the pointsInTime with times using TimePeriod.next():\r\n     * Will silently return if the time array was already populated.\r\n     *\r\n     * Also computes the data cached for later use by\r\n     * methods implementing the DomainInfo interface:\r\n     *\r\n     * @param start  the start.\r\n     *\r\n     * @return ??.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 10)",
        "(line 324,col 9)-(line 326,col 10)",
        "(line 327,col 9)-(line 327,col 41)",
        "(line 328,col 9)-(line 328,col 26)",
        "(line 329,col 9)-(line 329,col 46)",
        "(line 330,col 9)-(line 330,col 27)",
        "(line 331,col 9)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.findDomainLimits()",
      "begin_line": 339,
      "end_line": 353,
      "comment": "\r\n     * Finds the domain limits.  Note: this doesn\u0027t need to be synchronized\r\n     * because it\u0027s called from within another method that already is.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 80)",
        "(line 342,col 9)-(line 342,col 18)",
        "(line 343,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 44)",
        "(line 350,col 9)-(line 350,col 40)",
        "(line 351,col 9)-(line 351,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getPosition()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns the x position type (START, MIDDLE or END).\r\n     *\r\n     * @return The x position type.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setPosition(int)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Sets the x position type (START, MIDDLE or END).\r\n     *\r\n     * @param position The x position type.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.addSeries(float[], int, java.lang.Comparable)",
      "begin_line": 384,
      "end_line": 428,
      "comment": "\r\n     * Adds a series to the dataset.  Only the y-values are supplied, the\r\n     * x-values are specified elsewhere.\r\n     *\r\n     * @param values  the y-values.\r\n     * @param seriesNumber  the series index (zero-based).\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * Use this as-is during setup only, or add the synchronized keyword around\r\n     * the copy loop.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 30)",
        "(line 388,col 9)-(line 388,col 14)",
        "(line 389,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 401,col 9)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 43)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.setSeriesKey(int, java.lang.Comparable)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Sets the name of a series.  If planning to add values individually.\r\n     *\r\n     * @param seriesNumber  the series.\r\n     * @param key  the new key.\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.addValue(int, int, float)",
      "begin_line": 447,
      "end_line": 467,
      "comment": "\r\n     * Adds a value to a series.\r\n     *\r\n     * @param seriesNumber  the series index.\r\n     * @param index  ??.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 30)",
        "(line 450,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 460,col 9)",
        "(line 464,col 13)-(line 464,col 68)",
        "(line 466,col 9)-(line 466,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getSeriesCount()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getItemCount(int)",
      "begin_line": 487,
      "end_line": 490,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \u003cp\u003e\r\n     * For this implementation, all series have the same number of items.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.translateGet(int)",
      "begin_line": 501,
      "end_line": 511,
      "comment": "\r\n     * Re-map an index, for use in retrieving data.\r\n     *\r\n     * @param toFetch  the index.\r\n     *\r\n     * @return The translated index.\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 506,col 47)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 510,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.offsetFromNewest(int)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\r\n     * Returns the actual index to a time offset by \"delta\" from newestAt.\r\n     *\r\n     * @param delta  the delta.\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.offsetFromOldest(int)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * ??\r\n     *\r\n     * @param delta ??\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.wrapOffset(int)",
      "begin_line": 542,
      "end_line": 551,
      "comment": "\r\n     * ??\r\n     *\r\n     * @param protoIndex  the index.\r\n     *\r\n     * @return The offset.\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 29)",
        "(line 544,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.advanceTime()",
      "begin_line": 560,
      "end_line": 605,
      "comment": "\r\n     * Adjust the array offset as needed when a new time-period is added:\r\n     * Increments the indices \"oldestAt\" and \"newestAt\", mod(array length),\r\n     * zeroes the series values at newestAt, returns the new TimePeriod.\r\n     *\r\n     * @return The new time period.\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 80)",
        "(line 562,col 9)-(line 562,col 38)",
        "(line 569,col 9)-(line 569,col 39)",
        "(line 570,col 9)-(line 570,col 28)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 34)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 55)",
        "(line 593,col 9)-(line 593,col 24)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 51)",
        "(line 599,col 9)-(line 599,col 61)",
        "(line 600,col 9)-(line 600,col 47)",
        "(line 601,col 9)-(line 601,col 57)",
        "(line 602,col 9)-(line 602,col 51)",
        "(line 603,col 9)-(line 603,col 28)",
        "(line 604,col 9)-(line 604,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.invalidateRangeInfo()",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\r\n     * Invalidates the range info.\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 29)",
        "(line 614,col 9)-(line 614,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.findMaxValue()",
      "begin_line": 622,
      "end_line": 633,
      "comment": "\r\n     * Returns the maximum value.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 26)",
        "(line 624,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getOldestIndex()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Returns the index of the oldest data item.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getNewestIndex()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\r\n     * Returns the index of the newest data item.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.appendData(float[])",
      "begin_line": 662,
      "end_line": 679,
      "comment": "\r\n     * Appends new data.\r\n     *\r\n     * @param newData  the data.\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 41)",
        "(line 664,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 14)",
        "(line 670,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.appendData(float[], int, int)",
      "begin_line": 689,
      "end_line": 708,
      "comment": "\r\n     * Appends data at specified index, for loading up with data from file(s).\r\n     *\r\n     * @param  newData  the data\r\n     * @param  insertionIndex  the index value at which to put it\r\n     * @param  refresh  value of n in \"refresh the display on every nth call\"\r\n     *                 (ignored if \u003c\u003d 0 )\r\n     ",
      "child_ranges": [
        "(line 690,col 10)-(line 690,col 42)",
        "(line 691,col 10)-(line 695,col 10)",
        "(line 696,col 10)-(line 701,col 10)",
        "(line 702,col 10)-(line 707,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getNewestTime()",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\r\n     * Returns the newest time.\r\n     *\r\n     * @return The newest time.\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getOldestTime()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\r\n     * Returns the oldest time.\r\n     *\r\n     * @return The oldest time.\r\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getX(int, int)",
      "begin_line": 738,
      "end_line": 741,
      "comment": " Don\u0027t synchronize this!! Instead, synchronize the loop that calls it.",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 69)",
        "(line 740,col 9)-(line 740,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getYValue(int, int)",
      "begin_line": 751,
      "end_line": 756,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 57)",
        "(line 755,col 9)-(line 755,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getY(int, int)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getStartX(int, int)",
      "begin_line": 778,
      "end_line": 781,
      "comment": "\r\n     * Returns the start x-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 69)",
        "(line 780,col 9)-(line 780,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getEndX(int, int)",
      "begin_line": 791,
      "end_line": 794,
      "comment": "\r\n     * Returns the end x-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 69)",
        "(line 793,col 9)-(line 793,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getStartY(int, int)",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\r\n     * Returns the start y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getEndY(int, int)",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\r\n     * Returns the end y-value.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getSeriesKey(int)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.fireSeriesChanged()",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\r\n     * Sends a {@link SeriesChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 862,
      "end_line": 865,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 875,
      "end_line": 878,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 888,
      "end_line": 893,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 902,
      "end_line": 913,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 912,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeLowerBound(boolean)",
      "begin_line": 929,
      "end_line": 935,
      "comment": "\r\n     * Returns the minimum range value.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum range value.\r\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 35)",
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeUpperBound(boolean)",
      "begin_line": 945,
      "end_line": 951,
      "comment": "\r\n     * Returns the maximum range value.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum range value.\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 35)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.DynamicTimeSeriesCollection.getRangeBounds(boolean)",
      "begin_line": 961,
      "end_line": 967,
      "comment": "\r\n     * Returns the value range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 966,col 31)"
      ]
    }
  ]
}