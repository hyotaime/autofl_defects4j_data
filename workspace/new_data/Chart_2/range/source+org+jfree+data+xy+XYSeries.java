{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 99,
      "end_line": 1006,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (x, y).  By\r\n * default, items in the series will be sorted into ascending order by x-value,\r\n * and duplicate x-values are permitted.  Both the sorting and duplicate\r\n * defaults can be changed in the constructor.  Y-values can be\r\n * \u003ccode\u003enull\u003c/code\u003e to represent missing values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Storage for the data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "autoSort"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\r\n     * A flag that controls whether the items are automatically sorted\r\n     * (by x-value ascending).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowDuplicateXValues"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " A flag that controls whether or not duplicate x-values are allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "minX"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The lowest x-value in the series, excluding Double.NaN values. "
    },
    {
      "type": "field",
      "varNames": [
        "maxX"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The highest x-value in the series, excluding Double.NaN values. "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The lowest y-value in the series, excluding Double.NaN values. "
    },
    {
      "type": "field",
      "varNames": [
        "maxY"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The highest y-value in the series, excluding Double.NaN values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will\r\n     * be sorted into ascending order by x-value, and duplicate x-values will\r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Constructs a new empty series, with the auto-sort flag set as requested,\r\n     * and duplicate values allowed.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify\r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate\r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 33)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 174,col 9)-(line 174,col 31)",
        "(line 175,col 9)-(line 175,col 31)",
        "(line 176,col 9)-(line 176,col 31)",
        "(line 177,col 9)-(line 177,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMinX()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the smallest x-value in the series, ignoring any Double.NaN\r\n     * values.  This method returns Double.NaN if there is no smallest x-value\r\n     * (for example, when the series is empty).\r\n     *\r\n     * @return The smallest x-value.\r\n     *\r\n     * @see #getMaxX()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMaxX()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the largest x-value in the series, ignoring any Double.NaN\r\n     * values.  This method returns Double.NaN if there is no largest x-value\r\n     * (for example, when the series is empty).\r\n     *\r\n     * @return The largest x-value.\r\n     *\r\n     * @see #getMinX()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMinY()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the smallest y-value in the series, ignoring any null and\r\n     * Double.NaN values.  This method returns Double.NaN if there is no\r\n     * smallest y-value (for example, when the series is empty).\r\n     *\r\n     * @return The smallest y-value.\r\n     *\r\n     * @see #getMaxY()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMaxY()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the largest y-value in the series, ignoring any Double.NaN\r\n     * values.  This method returns Double.NaN if there is no largest y-value\r\n     * (for example, when the series is empty).\r\n     *\r\n     * @return The largest y-value.\r\n     *\r\n     * @see #getMinY()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.updateBoundsForAddedItem(org.jfree.data.xy.XYDataItem)",
      "begin_line": 247,
      "end_line": 256,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 250,col 47)",
        "(line 251,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.updateBoundsForRemovedItem(org.jfree.data.xy.XYDataItem)",
      "begin_line": 266,
      "end_line": 295,
      "comment": "\r\n     * Updates the cached values for the minimum and maximum data values on\r\n     * the basis that the specified item has just been removed.\r\n     *\r\n     * @param item  the item added (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 49)",
        "(line 268,col 9)-(line 268,col 49)",
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.findBoundsByIteration()",
      "begin_line": 303,
      "end_line": 313,
      "comment": "\r\n     * Finds the bounds of the x and y values for the series, by iterating\r\n     * through all the data items.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 31)",
        "(line 305,col 9)-(line 305,col 31)",
        "(line 306,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 31)",
        "(line 308,col 9)-(line 308,col 49)",
        "(line 309,col 9)-(line 312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAutoSort()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the flag that controls whether the items in the series are\r\n     * automatically sorted.  There is no setter for this flag, it must be\r\n     * defined in the series constructor.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAllowDuplicateXValues()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\r\n     * Returns a flag that controls whether duplicate x-values are allowed.\r\n     * This flag can only be set in the constructor.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItemCount()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @see #getItems()\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItems()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains\r\n     * {@link XYDataItem} objects and is unmodifiable).\r\n     *\r\n     * @return The list of data items.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMaximumItemCount()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     *\r\n     * @see #setMaximumItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.setMaximumItemCount(int)",
      "begin_line": 383,
      "end_line": 391,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.\r\n     * If you add a new item to the series such that the number of items will\r\n     * exceed the maximum item count, then the first element in the series is\r\n     * automatically removed, ensuring that the maximum item count is not\r\n     * exceeded.\r\n     * \u003cp\u003e\r\n     * Typically this value is set before the series is populated with data,\r\n     * but if it is applied later, it may cause some items to be removed from\r\n     * the series (in which case a {@link SeriesChangeEvent} will be sent to\r\n     * all registered listeners).\r\n     *\r\n     * @param maximum  the maximum number of items for the series.\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 40)",
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double, boolean)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.  The unusual pairing of parameter types is to\r\n     * make it easier to add \u003ccode\u003enull\u003c/code\u003e y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number, boolean)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.  The unusual\r\n     * pairing of parameter types is to make it easier to add null y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\r\n     * Adds a new data item to the series (in the correct position if the\r\n     * \u003ccode\u003eautoSort\u003c/code\u003e flag is set for the series) and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the\r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws SeriesException if the x-value is a duplicate and the\r\n     *     \u003ccode\u003eallowDuplicateXValues\u003c/code\u003e flag is not set for this series.\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 488,
      "end_line": 492,
      "comment": "\r\n     * Adds new data to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the\r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag the controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 47)",
        "(line 491,col 9)-(line 491,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem, boolean)",
      "begin_line": 503,
      "end_line": 552,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 41)",
        "(line 508,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 39)",
        "(line 545,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.delete(int, int)",
      "begin_line": 561,
      "end_line": 565,
      "comment": "\r\n     * Deletes a range of items from the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the start index (zero-based).\r\n     * @param end  the end index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 50)",
        "(line 563,col 9)-(line 563,col 32)",
        "(line 564,col 9)-(line 564,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(int)",
      "begin_line": 575,
      "end_line": 580,
      "comment": "\r\n     * Removes the item at the specified index and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 66)",
        "(line 577,col 9)-(line 577,col 44)",
        "(line 578,col 9)-(line 578,col 28)",
        "(line 579,col 9)-(line 579,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(java.lang.Number)",
      "begin_line": 592,
      "end_line": 594,
      "comment": "\r\n     * Removes an item with the specified x-value and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.  Note that when\r\n     * a series permits multiple items with the same x-value, this method\r\n     * could remove any one of the items with that x-value.\r\n     *\r\n     * @param x  the x-value.\r\n\r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clear()",
      "begin_line": 600,
      "end_line": 609,
      "comment": "\r\n     * Removes all data items from the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getDataItem(int)",
      "begin_line": 618,
      "end_line": 621,
      "comment": "\r\n     * Return the data item with the specified index.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The data item with the specified index.\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 60)",
        "(line 620,col 9)-(line 620,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getRawDataItem(int)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\r\n     * Return the data item with the specified index.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The data item with the specified index.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getX(int)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\r\n     * Returns the x-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getY(int)",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\r\n     * Returns the y-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.updateByIndex(int, java.lang.Number)",
      "begin_line": 667,
      "end_line": 687,
      "comment": "\r\n     * Updates the value of an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the item (zero based index).\r\n     * @param y  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 48)",
        "(line 671,col 9)-(line 671,col 32)",
        "(line 672,col 9)-(line 672,col 39)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 21)",
        "(line 678,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.minIgnoreNaN(double, double)",
      "begin_line": 698,
      "end_line": 710,
      "comment": "\r\n     * A function to find the minimum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The minimum of the two values.\r\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.maxIgnoreNaN(double, double)",
      "begin_line": 721,
      "end_line": 733,
      "comment": "\r\n     * A function to find the maximum of two values, but ignoring any\r\n     * Double.NaN values.\r\n     *\r\n     * @param a  the first value.\r\n     * @param b  the second value.\r\n     *\r\n     * @return The maximum of the two values.\r\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.update(java.lang.Number, java.lang.Number)",
      "begin_line": 744,
      "end_line": 752,
      "comment": "\r\n     * Updates an item in the series.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws SeriesException if there is no existing item with the specified\r\n     *         x-value.\r\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 31)",
        "(line 746,col 9)-(line 751,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(double, double)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\r\n     * Adds or updates an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     *\r\n     * @return The item that was overwritten, if any.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(java.lang.Number, java.lang.Number)",
      "begin_line": 779,
      "end_line": 782,
      "comment": "\r\n     * Adds or updates an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(org.jfree.data.xy.XYDataItem)",
      "begin_line": 796,
      "end_line": 850,
      "comment": "\r\n     * Adds or updates an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 803,col 9)",
        "(line 806,col 9)-(line 806,col 38)",
        "(line 807,col 9)-(line 807,col 41)",
        "(line 808,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 28)",
        "(line 849,col 9)-(line 849,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.indexOf(java.lang.Number)",
      "begin_line": 862,
      "end_line": 875,
      "comment": "\r\n     * Returns the index of the item with the specified x-value, or a negative\r\n     * index if the series does not contain an item with that x-value.  Be\r\n     * aware that for an unsorted series, the index is found by iterating\r\n     * through all items in the series.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.toArray()",
      "begin_line": 884,
      "end_line": 898,
      "comment": "\r\n     * Returns a new array containing the x and y values from this series.\r\n     *\r\n     * @return A new array containing the x and y values from this series.\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 39)",
        "(line 886,col 9)-(line 886,col 53)",
        "(line 887,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clone()",
      "begin_line": 907,
      "end_line": 911,
      "comment": "\r\n     * Returns a clone of the series.\r\n     *\r\n     * @return A clone of the series.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 50)",
        "(line 909,col 9)-(line 909,col 65)",
        "(line 910,col 9)-(line 910,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.createCopy(int, int)",
      "begin_line": 923,
      "end_line": 942,
      "comment": "\r\n     * Creates a new series by copying a subset of the data in this time series.\r\n     *\r\n     * @param start  the index of the first item to copy.\r\n     * @param end  the index of the last item to copy.\r\n     *\r\n     * @return A series containing a copy of this series from start until end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 49)",
        "(line 927,col 9)-(line 927,col 46)",
        "(line 928,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.equals(java.lang.Object)",
      "begin_line": 952,
      "end_line": 976,
      "comment": "\r\n     * Tests this series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against for equality\r\n     *             (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 39)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.hashCode()",
      "begin_line": 983,
      "end_line": 1004,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 38)",
        "(line 987,col 9)-(line 987,col 35)",
        "(line 988,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 53)",
        "(line 1001,col 9)-(line 1001,col 55)",
        "(line 1002,col 9)-(line 1002,col 68)",
        "(line 1003,col 9)-(line 1003,col 22)"
      ]
    }
  ]
}