{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/XYSeries.java",
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
      "begin_line": 92,
      "end_line": 708,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (x, y).  By \r\n * default, items in the series will be sorted into ascending order by x-value,\r\n * and duplicate x-values are permitted.  Both the sorting and duplicate \r\n * defaults can be changed in the constructor.  Y-values can be \r\n * \u003ccode\u003enull\u003c/code\u003e to represent missing values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Storage for the data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "autoSort"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " A flag that controls whether the items are automatically sorted. "
    },
    {
      "type": "field",
      "varNames": [
        "allowDuplicateXValues"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " A flag that controls whether or not duplicate x-values are allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will \r\n     * be sorted into ascending order by x-value, and duplicate x-values will \r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Constructs a new empty series, with the auto-sort flag set as requested,\r\n     * and duplicate values allowed.  \r\n     * \r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the \r\n     *                  series are sorted.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify \r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the \r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate \r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 150,col 46)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAutoSort()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the flag that controls whether the items in the series are \r\n     * automatically sorted.  There is no setter for this flag, it must be \r\n     * defined in the series constructor.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAllowDuplicateXValues()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns a flag that controls whether duplicate x-values are allowed.  \r\n     * This flag can only be set in the constructor.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItemCount()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItems()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains \r\n     * {@link XYDataItem} objects and is unmodifiable).\r\n     * \r\n     * @return The list of data items.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMaximumItemCount()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     * @see #setMaximumItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.setMaximumItemCount(int)",
      "begin_line": 220,
      "end_line": 230,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.  \r\n     * If you add a new item to the series such that the number of items will \r\n     * exceed the maximum item count, then the first element in the series is \r\n     * automatically removed, ensuring that the maximum item count is not \r\n     * exceeded.\r\n     * \u003cp\u003e\r\n     * Typically this value is set before the series is populated with data,\r\n     * but if it is applied later, it may cause some items to be removed from\r\n     * the series (in which case a {@link SeriesChangeEvent} will be sent to\r\n     * all registered listeners.\r\n     *\r\n     * @param maximum  the maximum number of items for the series.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 40)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double, boolean)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param notify  a flag that controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to \r\n     * all registered listeners.  The unusual pairing of parameter types is to \r\n     * make it easier to add \u003ccode\u003enull\u003c/code\u003e y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number, boolean)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.  The unusual \r\n     * pairing of parameter types is to make it easier to add null y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\r\n     * Adds new data to the series and sends a {@link SeriesChangeEvent} to \r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the \r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 323,
      "end_line": 327,
      "comment": "\r\n     * Adds new data to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the \r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag the controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 47)",
        "(line 326,col 9)-(line 326,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem, boolean)",
      "begin_line": 338,
      "end_line": 386,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.delete(int, int)",
      "begin_line": 395,
      "end_line": 400,
      "comment": "\r\n     * Deletes a range of items from the series and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the start index (zero-based).\r\n     * @param end  the end index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(int)",
      "begin_line": 410,
      "end_line": 414,
      "comment": "\r\n     * Removes the item at the specified index and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 65)",
        "(line 412,col 9)-(line 412,col 28)",
        "(line 413,col 9)-(line 413,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(java.lang.Number)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\r\n     * Removes the item with the specified x-value and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \r\n     * @param x  the x-value.\r\n\r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clear()",
      "begin_line": 431,
      "end_line": 436,
      "comment": "\r\n     * Removes all data items from the series.\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getDataItem(int)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\r\n     * Return the data item with the specified index.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The data item with the specified index.\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getX(int)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\r\n     * Returns the x-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getY(int)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n     * Returns the y-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.updateByIndex(int, java.lang.Number)",
      "begin_line": 480,
      "end_line": 484,
      "comment": "\r\n     * Updates the value of an item in the series and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the item (zero based index).\r\n     * @param y  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 45)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 483,col 9)-(line 483,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.update(java.lang.Number, java.lang.Number)",
      "begin_line": 495,
      "end_line": 505,
      "comment": "\r\n     * Updates an item in the series.\r\n     * \r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @throws SeriesException if there is no existing item with the specified\r\n     *         x-value.\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 31)",
        "(line 497,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(java.lang.Number, java.lang.Number)",
      "begin_line": 518,
      "end_line": 552,
      "comment": "\r\n     * Adds or updates an item in the series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no \r\n     *         item was overwritten.\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 31)",
        "(line 524,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 28)",
        "(line 551,col 9)-(line 551,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.indexOf(java.lang.Number)",
      "begin_line": 564,
      "end_line": 577,
      "comment": "\r\n     * Returns the index of the item with the specified x-value, or a negative \r\n     * index if the series does not contain an item with that x-value.  Be \r\n     * aware that for an unsorted series, the index is found by iterating \r\n     * through all items in the series.\r\n     * \r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.toArray()",
      "begin_line": 586,
      "end_line": 600,
      "comment": "\r\n     * Returns a new array containing the x and y values from this series.\r\n     * \r\n     * @return A new array containing the x and y values from this series.\r\n     * \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 39)",
        "(line 588,col 9)-(line 588,col 53)",
        "(line 589,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clone()",
      "begin_line": 609,
      "end_line": 613,
      "comment": "\r\n     * Returns a clone of the series.\r\n     *\r\n     * @return A clone of the series.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 50)",
        "(line 611,col 9)-(line 611,col 65)",
        "(line 612,col 9)-(line 612,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.createCopy(int, int)",
      "begin_line": 625,
      "end_line": 644,
      "comment": "\r\n     * Creates a new series by copying a subset of the data in this time series.\r\n     *\r\n     * @param start  the index of the first item to copy.\r\n     * @param end  the index of the last item to copy.\r\n     *\r\n     * @return A series containing a copy of this series from start until end.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 49)",
        "(line 629,col 9)-(line 629,col 46)",
        "(line 630,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.equals(java.lang.Object)",
      "begin_line": 654,
      "end_line": 678,
      "comment": "\r\n     * Tests this series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against for equality \r\n     *             (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 39)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.hashCode()",
      "begin_line": 685,
      "end_line": 706,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 38)",
        "(line 689,col 9)-(line 689,col 35)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 53)",
        "(line 703,col 9)-(line 703,col 55)",
        "(line 704,col 9)-(line 704,col 68)",
        "(line 705,col 9)-(line 705,col 22)"
      ]
    }
  ]
}