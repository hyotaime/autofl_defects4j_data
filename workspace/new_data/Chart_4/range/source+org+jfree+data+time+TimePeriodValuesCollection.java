{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/TimePeriodValuesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValuesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 448,
      "comment": "\r\n * A collection of {@link TimePeriodValues} objects.\r\n * \u003cP\u003e\r\n * This class implements the {@link org.jfree.data.xy.XYDataset} interface, as\r\n * well as the extended {@link IntervalXYDataset} interface.  This makes it a\r\n * convenient dataset for use with the {@link org.jfree.chart.plot.XYPlot}\r\n * class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Storage for the time series. "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * The position within a time period to return as the x-value (START,\r\n     * MIDDLE or END).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.TimePeriodValuesCollection()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.TimePeriodValuesCollection(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 100,
      "end_line": 107,
      "comment": "\r\n     * Constructs a dataset containing a single series.  Additional series can\r\n     * be added.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getXPosition()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the position of the X value within each time period.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setXPosition(TimePeriodAnchor)\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\r\n     * Sets the position of the x axis within each time period.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getXPosition()\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeriesCount()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeries(int)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The series.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeriesKey(int)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.addSeries(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 176,
      "end_line": 186,
      "comment": "\r\n     * Adds a series to the collection.  A\r\n     * {@link org.jfree.data.general.DatasetChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param series  the time series.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 30)",
        "(line 183,col 9)-(line 183,col 39)",
        "(line 184,col 9)-(line 184,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.removeSeries(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 193,
      "end_line": 202,
      "comment": "\r\n     * Removes the specified series from the collection.\r\n     *\r\n     * @param series  the series to remove (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 42)",
        "(line 200,col 9)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.removeSeries(int)",
      "begin_line": 209,
      "end_line": 214,
      "comment": "\r\n     * Removes a series from the collection.\r\n     *\r\n     * @param index  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getItemCount(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * \u003cP\u003e\r\n     * This method is provided for convenience.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getX(int, int)",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 239,col 50)",
        "(line 240,col 9)-(line 240,col 43)",
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getX(org.jfree.data.time.TimePeriod)",
      "begin_line": 251,
      "end_line": 267,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getStartX(int, int)",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 71)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 280,col 9)-(line 280,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getEndX(int, int)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 71)",
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getY(int, int)",
      "begin_line": 305,
      "end_line": 309,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 71)",
        "(line 307,col 9)-(line 307,col 50)",
        "(line 308,col 9)-(line 308,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getStartY(int, int)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getEndY(int, int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainLowerBound(boolean)",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 345,col 51)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainUpperBound(boolean)",
      "begin_line": 360,
      "end_line": 367,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 35)",
        "(line 362,col 9)-(line 362,col 51)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainBounds(boolean)",
      "begin_line": 377,
      "end_line": 422,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 28)",
        "(line 379,col 9)-(line 379,col 26)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.equals(java.lang.Object)",
      "begin_line": 431,
      "end_line": 446,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 75)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    }
  ]
}