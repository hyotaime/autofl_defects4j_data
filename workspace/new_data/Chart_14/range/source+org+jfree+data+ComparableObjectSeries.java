{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/ComparableObjectSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparableObjectSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 451,
      "comment": "\r\n * A (possibly ordered) list of (Comparable, Object) data items.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "autoSort"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A flag that controls whether the items are automatically sorted. "
    },
    {
      "type": "field",
      "varNames": [
        "allowDuplicateXValues"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " A flag that controls whether or not duplicate x-values are allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.ComparableObjectSeries.ComparableObjectSeries(java.lang.Comparable)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will \r\n     * be sorted into ascending order by x-value, and duplicate x-values will \r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.ComparableObjectSeries.ComparableObjectSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\r\n     * Constructs a new series that contains no data.  You can specify \r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the \r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate \r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 19)",
        "(line 99,col 9)-(line 99,col 46)",
        "(line 100,col 9)-(line 100,col 33)",
        "(line 101,col 9)-(line 101,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.getAutoSort()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Returns the flag that controls whether the items in the series are \r\n     * automatically sorted.  There is no setter for this flag, it must be \r\n     * defined in the series constructor.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.getAllowDuplicateXValues()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns a flag that controls whether duplicate x-values are allowed.  \r\n     * This flag can only be set in the constructor.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.getItemCount()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.getMaximumItemCount()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     * @see #setMaximumItemCount(int)\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.setMaximumItemCount(int)",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.  \r\n     * If you add a new item to the series such that the number of items will \r\n     * exceed the maximum item count, then the first element in the series is \r\n     * automatically removed, ensuring that the maximum item count is not \r\n     * exceeded.\r\n     * \u003cp\u003e\r\n     * Typically this value is set before the series is populated with data,\r\n     * but if it is applied later, it may cause some items to be removed from\r\n     * the series (in which case a {@link SeriesChangeEvent} will be sent to\r\n     * all registered listeners.\r\n     *\r\n     * @param maximum  the maximum number of items for the series.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.add(java.lang.Comparable, java.lang.Object)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\r\n     * Adds new data to the series and sends a {@link SeriesChangeEvent} to \r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the \r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.add(java.lang.Comparable, java.lang.Object, boolean)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\r\n     * Adds new data to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the \r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag the controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 67)",
        "(line 202,col 9)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.add(org.jfree.data.ComparableObjectItem, boolean)",
      "begin_line": 214,
      "end_line": 262,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not a \r\n     *                {@link SeriesChangeEvent} is sent to all registered \r\n     *                listeners.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.indexOf(java.lang.Comparable)",
      "begin_line": 274,
      "end_line": 289,
      "comment": "\r\n     * Returns the index of the item with the specified x-value, or a negative \r\n     * index if the series does not contain an item with that x-value.  Be \r\n     * aware that for an unsorted series, the index is found by iterating \r\n     * through all items in the series.\r\n     * \r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.update(java.lang.Comparable, java.lang.Object)",
      "begin_line": 300,
      "end_line": 310,
      "comment": "\r\n     * Updates an item in the series.\r\n     * \r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @throws SeriesException if there is no existing item with the specified\r\n     *         x-value.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 31)",
        "(line 302,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.updateByIndex(int, java.lang.Object)",
      "begin_line": 319,
      "end_line": 323,
      "comment": "\r\n     * Updates the value of an item in the series and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the item (zero based index).\r\n     * @param y  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 55)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 322,col 9)-(line 322,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.getDataItem(int)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\r\n     * Return the data item with the specified index.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The data item with the specified index.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.delete(int, int)",
      "begin_line": 343,
      "end_line": 348,
      "comment": "\r\n     * Deletes a range of items from the series and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the start index (zero-based).\r\n     * @param end  the end index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.clear()",
      "begin_line": 355,
      "end_line": 360,
      "comment": "\r\n     * Removes all data items from the series and, unless the series is \r\n     * already empty, sends a {@link SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.remove(int)",
      "begin_line": 370,
      "end_line": 375,
      "comment": "\r\n     * Removes the item at the specified index and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the index.\r\n     * \r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 372,col 23)",
        "(line 373,col 9)-(line 373,col 28)",
        "(line 374,col 9)-(line 374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.remove(java.lang.Comparable)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\r\n     * Removes the item with the specified x-value and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \r\n     * @param x  the x-value.\r\n\r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.equals(java.lang.Object)",
      "begin_line": 397,
      "end_line": 421,
      "comment": "\r\n     * Tests this series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against for equality \r\n     *             (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 67)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectSeries.hashCode()",
      "begin_line": 428,
      "end_line": 449,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 38)",
        "(line 432,col 9)-(line 432,col 35)",
        "(line 433,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 53)",
        "(line 446,col 9)-(line 446,col 55)",
        "(line 447,col 9)-(line 447,col 68)",
        "(line 448,col 9)-(line 448,col 22)"
      ]
    }
  ]
}