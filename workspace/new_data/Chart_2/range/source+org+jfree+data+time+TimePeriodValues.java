{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimePeriodValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValues",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 573,
      "comment": "\r\n * A structure containing zero, one or many {@link TimePeriodValue} instances.  \r\n * The time periods can overlap, and are maintained in the order that they are \r\n * added to the collection.\r\n * \u003cp\u003e\r\n * This is similar to the {@link TimeSeries} class, except that the time \r\n * periods can have irregular lengths.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_DESCRIPTION"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Default value for the domain description. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_DESCRIPTION"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Default value for the range description. "
    },
    {
      "type": "field",
      "varNames": [
        "domain"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A description of the domain. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " A description of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The list of data pairs in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "minStartIndex"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Index of the time period with the minimum start milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStartIndex"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Index of the time period with the maximum start milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "minMiddleIndex"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Index of the time period with the minimum middle milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxMiddleIndex"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Index of the time period with the maximum middle milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "minEndIndex"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Index of the time period with the minimum end milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEndIndex"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Index of the time period with the maximum end milliseconds. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValues.TimePeriodValues(java.lang.Comparable)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Creates a new (empty) collection of time period values.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValues.TimePeriodValues(java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\r\n     * Creates a new time series that contains no data.\r\n     * \u003cP\u003e\r\n     * Descriptions can be specified for the domain and range.  One situation\r\n     * where this is helpful is when generating a chart for the time series -\r\n     * axis labels can be taken from the domain and range description.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param domain  the domain description.\r\n     * @param range  the range description.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 20)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 27)",
        "(line 132,col 9)-(line 132,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getDomainDescription()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the domain description.\r\n     *\r\n     * @return The domain description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeDescription()\r\n     * @see #setDomainDescription(String)\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.setDomainDescription(java.lang.String)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "\r\n     * Sets the domain description and fires a property change event (with the\r\n     * property name \u003ccode\u003eDomain\u003c/code\u003e if the description changes).\r\n     *\r\n     * @param description  the new description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainDescription()\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getRangeDescription()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the range description.\r\n     *\r\n     * @return The range description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainDescription()\r\n     * @see #setRangeDescription(String)\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.setRangeDescription(java.lang.String)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\r\n     * Sets the range description and fires a property change event with the\r\n     * name \u003ccode\u003eRange\u003c/code\u003e.\r\n     *\r\n     * @param description  the new description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeDescription()\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 183,col 33)",
        "(line 184,col 9)-(line 184,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getItemCount()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getDataItem(int)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns one data item for the series.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return One data item for the series.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getTimePeriod(int)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the time period at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The time period at the specified index.\r\n     * \r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getValue(int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the value at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The value at the specified index (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriodValue)",
      "begin_line": 242,
      "end_line": 249,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 28)",
        "(line 247,col 9)-(line 247,col 61)",
        "(line 248,col 9)-(line 248,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.updateBounds(org.jfree.data.time.TimePeriod, int)",
      "begin_line": 257,
      "end_line": 335,
      "comment": "\r\n     * Update the index values for the maximum and minimum bounds.\r\n     * \r\n     * @param period  the time period.\r\n     * @param index  the index of the time period.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 260,col 45)",
        "(line 261,col 9)-(line 261,col 50)",
        "(line 263,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.recalculateBounds()",
      "begin_line": 340,
      "end_line": 351,
      "comment": "\r\n     * Recalculates the bounds for the collection of items.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 32)",
        "(line 342,col 9)-(line 342,col 33)",
        "(line 343,col 9)-(line 343,col 30)",
        "(line 344,col 9)-(line 344,col 32)",
        "(line 345,col 9)-(line 345,col 33)",
        "(line 346,col 9)-(line 346,col 30)",
        "(line 347,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriod, double)",
      "begin_line": 362,
      "end_line": 365,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * \r\n     * @see #add(TimePeriod, Number)\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 66)",
        "(line 364,col 9)-(line 364,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriod, java.lang.Number)",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 66)",
        "(line 376,col 9)-(line 376,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.update(int, java.lang.Number)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "\r\n     * Updates (changes) the value of a data item and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index of the data item to update.\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 50)",
        "(line 388,col 9)-(line 388,col 29)",
        "(line 389,col 9)-(line 389,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.delete(int, int)",
      "begin_line": 399,
      "end_line": 405,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive) and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 28)",
        "(line 404,col 9)-(line 404,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.equals(java.lang.Object)",
      "begin_line": 414,
      "end_line": 443,
      "comment": "\r\n     * Tests the series for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 55)",
        "(line 425,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 35)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.hashCode()",
      "begin_line": 450,
      "end_line": 462,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 19)",
        "(line 452,col 9)-(line 452,col 68)",
        "(line 453,col 9)-(line 453,col 80)",
        "(line 454,col 9)-(line 454,col 52)",
        "(line 455,col 9)-(line 455,col 50)",
        "(line 456,col 9)-(line 456,col 50)",
        "(line 457,col 9)-(line 457,col 51)",
        "(line 458,col 9)-(line 458,col 51)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 48)",
        "(line 461,col 9)-(line 461,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.clone()",
      "begin_line": 479,
      "end_line": 482,
      "comment": "\r\n     * Returns a clone of the collection.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno need to clone the domain and range descriptions, since String \r\n     *       object is immutable;\u003c/li\u003e\r\n     *   \u003cli\u003ewe pass over to the more general method createCopy(start, end).\r\n     *   \u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the time series.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 57)",
        "(line 481,col 9)-(line 481,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.createCopy(int, int)",
      "begin_line": 495,
      "end_line": 515,
      "comment": "\r\n     * Creates a new instance by copying a subset of the data in this \r\n     * collection.\r\n     *\r\n     * @param start  the index of the first item to copy.\r\n     * @param end  the index of the last item to copy.\r\n     *\r\n     * @return A copy of a subset of the items.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 65)",
        "(line 500,col 9)-(line 500,col 36)",
        "(line 501,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinStartIndex()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\r\n     * Returns the index of the time period with the minimum start milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxStartIndex()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Returns the index of the time period with the maximum start milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinMiddleIndex()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\r\n     * Returns the index of the time period with the minimum middle \r\n     * milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxMiddleIndex()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\r\n     * Returns the index of the time period with the maximum middle \r\n     * milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinEndIndex()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\r\n     * Returns the index of the time period with the minimum end milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxEndIndex()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\r\n     * Returns the index of the time period with the maximum end milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 32)"
      ]
    }
  ]
}