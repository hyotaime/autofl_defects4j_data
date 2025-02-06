{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/TimePeriodValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodValues",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 572,
      "comment": "\r\n * A structure containing zero, one or many {@link TimePeriodValue} instances.  \r\n * The time periods can overlap, and are maintained in the order that they are \r\n * added to the collection.\r\n * \u003cp\u003e\r\n * This is similar to the {@link TimeSeries} class, except that the time \r\n * periods can have irregular lengths.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_DESCRIPTION"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Default value for the domain description. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_DESCRIPTION"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Default value for the range description. "
    },
    {
      "type": "field",
      "varNames": [
        "domain"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A description of the domain. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " A description of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The list of data pairs in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "minStartIndex"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Index of the time period with the minimum start milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStartIndex"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Index of the time period with the maximum start milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "minMiddleIndex"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Index of the time period with the minimum middle milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxMiddleIndex"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Index of the time period with the maximum middle milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "minEndIndex"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Index of the time period with the minimum end milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEndIndex"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Index of the time period with the maximum end milliseconds. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValues.TimePeriodValues(java.lang.Comparable)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Creates a new (empty) collection of time period values.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodValues.TimePeriodValues(java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\r\n     * Creates a new time series that contains no data.\r\n     * \u003cP\u003e\r\n     * Descriptions can be specified for the domain and range.  One situation\r\n     * where this is helpful is when generating a chart for the time series -\r\n     * axis labels can be taken from the domain and range description.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param domain  the domain description.\r\n     * @param range  the range description.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 20)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 27)",
        "(line 131,col 9)-(line 131,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getDomainDescription()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the domain description.\r\n     *\r\n     * @return The domain description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeDescription()\r\n     * @see #setDomainDescription(String)\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.setDomainDescription(java.lang.String)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\r\n     * Sets the domain description and fires a property change event (with the\r\n     * property name \u003ccode\u003eDomain\u003c/code\u003e if the description changes).\r\n     *\r\n     * @param description  the new description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainDescription()\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 157,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getRangeDescription()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the range description.\r\n     *\r\n     * @return The range description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainDescription()\r\n     * @see #setRangeDescription(String)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.setRangeDescription(java.lang.String)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "\r\n     * Sets the range description and fires a property change event with the\r\n     * name \u003ccode\u003eRange\u003c/code\u003e.\r\n     *\r\n     * @param description  the new description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeDescription()\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 33)",
        "(line 183,col 9)-(line 183,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getItemCount()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getDataItem(int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Returns one data item for the series.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return One data item for the series.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getTimePeriod(int)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the time period at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The time period at the specified index.\r\n     * \r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getValue(int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the value at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The value at the specified index (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataItem(int)\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriodValue)",
      "begin_line": 241,
      "end_line": 248,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 28)",
        "(line 246,col 9)-(line 246,col 61)",
        "(line 247,col 9)-(line 247,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.updateBounds(org.jfree.data.time.TimePeriod, int)",
      "begin_line": 256,
      "end_line": 334,
      "comment": "\r\n     * Update the index values for the maximum and minimum bounds.\r\n     * \r\n     * @param period  the time period.\r\n     * @param index  the index of the time period.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 45)",
        "(line 260,col 9)-(line 260,col 50)",
        "(line 262,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.recalculateBounds()",
      "begin_line": 339,
      "end_line": 350,
      "comment": "\r\n     * Recalculates the bounds for the collection of items.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 32)",
        "(line 341,col 9)-(line 341,col 33)",
        "(line 342,col 9)-(line 342,col 30)",
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 30)",
        "(line 346,col 9)-(line 349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriod, double)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * \r\n     * @see #add(TimePeriod, Number)\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 66)",
        "(line 363,col 9)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.add(org.jfree.data.time.TimePeriod, java.lang.Number)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 66)",
        "(line 375,col 9)-(line 375,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.update(int, java.lang.Number)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\r\n     * Updates (changes) the value of a data item and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index of the data item to update.\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 50)",
        "(line 387,col 9)-(line 387,col 29)",
        "(line 388,col 9)-(line 388,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.delete(int, int)",
      "begin_line": 398,
      "end_line": 404,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive) and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 28)",
        "(line 403,col 9)-(line 403,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.equals(java.lang.Object)",
      "begin_line": 413,
      "end_line": 442,
      "comment": "\r\n     * Tests the series for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 55)",
        "(line 424,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 35)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.hashCode()",
      "begin_line": 449,
      "end_line": 461,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 19)",
        "(line 451,col 9)-(line 451,col 68)",
        "(line 452,col 9)-(line 452,col 80)",
        "(line 453,col 9)-(line 453,col 52)",
        "(line 454,col 9)-(line 454,col 50)",
        "(line 455,col 9)-(line 455,col 50)",
        "(line 456,col 9)-(line 456,col 51)",
        "(line 457,col 9)-(line 457,col 51)",
        "(line 458,col 9)-(line 458,col 48)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.clone()",
      "begin_line": 478,
      "end_line": 481,
      "comment": "\r\n     * Returns a clone of the collection.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno need to clone the domain and range descriptions, since String \r\n     *       object is immutable;\u003c/li\u003e\r\n     *   \u003cli\u003ewe pass over to the more general method createCopy(start, end).\r\n     *   \u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the time series.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 57)",
        "(line 480,col 9)-(line 480,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.createCopy(int, int)",
      "begin_line": 494,
      "end_line": 514,
      "comment": "\r\n     * Creates a new instance by copying a subset of the data in this \r\n     * collection.\r\n     *\r\n     * @param start  the index of the first item to copy.\r\n     * @param end  the index of the last item to copy.\r\n     *\r\n     * @return A copy of a subset of the items.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 65)",
        "(line 499,col 9)-(line 499,col 36)",
        "(line 500,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinStartIndex()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\r\n     * Returns the index of the time period with the minimum start milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxStartIndex()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\r\n     * Returns the index of the time period with the maximum start milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinMiddleIndex()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\r\n     * Returns the index of the time period with the minimum middle \r\n     * milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxMiddleIndex()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\r\n     * Returns the index of the time period with the maximum middle \r\n     * milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMinEndIndex()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\r\n     * Returns the index of the time period with the minimum end milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodValues.getMaxEndIndex()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\r\n     * Returns the index of the time period with the maximum end milliseconds.\r\n     * \r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 32)"
      ]
    }
  ]
}