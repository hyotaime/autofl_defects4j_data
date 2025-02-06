{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimePeriodValuesCollection.java",
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
      "begin_line": 73,
      "end_line": 451,
      "comment": "\r\n * A collection of {@link TimePeriodValues} objects.\r\n * \u003cP\u003e\r\n * This class implements the {@link org.jfree.data.xy.XYDataset} interface, as\r\n * well as the extended {@link IntervalXYDataset} interface.  This makes it a\r\n * convenient dataset for use with the {@link org.jfree.chart.plot.XYPlot}\r\n * class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Storage for the time series. "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * The position within a time period to return as the x-value (START,\r\n     * MIDDLE or END).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.TimePeriodValuesCollection()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.TimePeriodValuesCollection(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\r\n     * Constructs a dataset containing a single series.  Additional series can\r\n     * be added.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 49)",
        "(line 104,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getXPosition()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the position of the X value within each time period.\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setXPosition(TimePeriodAnchor)\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\r\n     * Sets the position of the x axis within each time period.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getXPosition()\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeriesCount()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeries(int)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\r\n     * Returns a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The series.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getSeriesKey(int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the index of the series (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.addSeries(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 177,
      "end_line": 188,
      "comment": "\r\n     * Adds a series to the collection.  A\r\n     * {@link org.jfree.data.general.DatasetChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param series  the time series.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 30)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 185,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.removeSeries(org.jfree.data.time.TimePeriodValues)",
      "begin_line": 195,
      "end_line": 205,
      "comment": "\r\n     * Removes the specified series from the collection.\r\n     *\r\n     * @param series  the series to remove (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 202,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.removeSeries(int)",
      "begin_line": 212,
      "end_line": 217,
      "comment": "\r\n     * Removes a series from the collection.\r\n     *\r\n     * @param index  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getItemCount(int)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * \u003cP\u003e\r\n     * This method is provided for convenience.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getX(int, int)",
      "begin_line": 240,
      "end_line": 245,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 71)",
        "(line 242,col 9)-(line 242,col 50)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 244,col 9)-(line 244,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getX(org.jfree.data.time.TimePeriod)",
      "begin_line": 254,
      "end_line": 270,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getStartX(int, int)",
      "begin_line": 280,
      "end_line": 284,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 71)",
        "(line 282,col 9)-(line 282,col 50)",
        "(line 283,col 9)-(line 283,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getEndX(int, int)",
      "begin_line": 294,
      "end_line": 298,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 71)",
        "(line 296,col 9)-(line 296,col 50)",
        "(line 297,col 9)-(line 297,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getY(int, int)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 71)",
        "(line 310,col 9)-(line 310,col 50)",
        "(line 311,col 9)-(line 311,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getStartY(int, int)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getEndY(int, int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainLowerBound(boolean)",
      "begin_line": 346,
      "end_line": 353,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 35)",
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainUpperBound(boolean)",
      "begin_line": 363,
      "end_line": 370,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 35)",
        "(line 365,col 9)-(line 365,col 51)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.getDomainBounds(boolean)",
      "begin_line": 380,
      "end_line": 425,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 28)",
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 383,col 49)",
        "(line 384,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValuesCollection.equals(java.lang.Object)",
      "begin_line": 434,
      "end_line": 449,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 75)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 20)"
      ]
    }
  ]
}