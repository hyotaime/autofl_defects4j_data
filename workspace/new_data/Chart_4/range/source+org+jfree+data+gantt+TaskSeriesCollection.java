{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/gantt/TaskSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TaskSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.gantt.GanttCategoryDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 681,
      "comment": "\r\n * A collection of {@link TaskSeries} objects.  This class provides one\r\n * implementation of the {@link GanttCategoryDataset} interface.\r\n "
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
        "keys"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * Storage for aggregate task keys (the task description is used as the\r\n     * key).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Storage for the series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.TaskSeriesCollection()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 101,
      "end_line": 111,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 33)",
        "(line 106,col 9)-(line 106,col 37)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeries(int)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeriesCount()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeriesKey(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\r\n     * Returns the name of a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The name of a series.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 59)",
        "(line 147,col 9)-(line 147,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowCount()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the number of rows (series) in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowKeys()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns the row keys.  In this case, each series is a key.\r\n     *\r\n     * @return The row keys.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnCount()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the number of column in the dataset.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnKeys()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns a list of the column keys in the dataset.\r\n     *\r\n     * @return The category list.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnKey(int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param index  the column index.\r\n     *\r\n     * @return The column key.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnIndex(java.lang.Comparable)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\r\n     * Returns the column index for a column key.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowIndex(java.lang.Comparable)",
      "begin_line": 218,
      "end_line": 229,
      "comment": "\r\n     * Returns the row index for the given row key.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 221,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowKey(int)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\r\n     * Returns the key for a row.\r\n     *\r\n     * @param index  the row index (zero-based).\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 62)",
        "(line 240,col 9)-(line 240,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.add(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 250,
      "end_line": 268,
      "comment": "\r\n     * Adds a series to the dataset and sends a\r\n     * {@link org.jfree.data.general.DatasetChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 30)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 258,col 9)-(line 258,col 57)",
        "(line 259,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 277,
      "end_line": 286,
      "comment": "\r\n     * Removes a series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(int)",
      "begin_line": 295,
      "end_line": 307,
      "comment": "\r\n     * Removes a series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 299,col 9)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 38)",
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 305,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.removeAll()",
      "begin_line": 314,
      "end_line": 328,
      "comment": "\r\n     * Removes all the series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 49)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 325,col 9)-(line 325,col 26)",
        "(line 326,col 9)-(line 326,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The item value.\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(int, int)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\r\n     * Returns the value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 363,
      "end_line": 375,
      "comment": "\r\n     * Returns the start value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 29)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 60)",
        "(line 367,col 9)-(line 367,col 53)",
        "(line 368,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\r\n     * Returns the start value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 43)",
        "(line 387,col 9)-(line 387,col 52)",
        "(line 388,col 9)-(line 388,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 400,
      "end_line": 412,
      "comment": "\r\n     * Returns the end value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 29)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 60)",
        "(line 404,col 9)-(line 404,col 53)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int)",
      "begin_line": 422,
      "end_line": 426,
      "comment": "\r\n     * Returns the end value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The end value.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 43)",
        "(line 424,col 9)-(line 424,col 52)",
        "(line 425,col 9)-(line 425,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int)",
      "begin_line": 436,
      "end_line": 440,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The percent complete (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 43)",
        "(line 438,col 9)-(line 438,col 52)",
        "(line 439,col 9)-(line 439,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 450,
      "end_line": 459,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 29)",
        "(line 452,col 9)-(line 452,col 38)",
        "(line 453,col 9)-(line 453,col 60)",
        "(line 454,col 9)-(line 454,col 53)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(int, int)",
      "begin_line": 469,
      "end_line": 473,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 43)",
        "(line 471,col 9)-(line 471,col 52)",
        "(line 472,col 9)-(line 472,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 483,
      "end_line": 492,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 23)",
        "(line 485,col 9)-(line 485,col 38)",
        "(line 486,col 9)-(line 486,col 60)",
        "(line 487,col 9)-(line 487,col 53)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int, int)",
      "begin_line": 503,
      "end_line": 507,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 43)",
        "(line 505,col 9)-(line 505,col 52)",
        "(line 506,col 9)-(line 506,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 518,
      "end_line": 532,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 29)",
        "(line 521,col 9)-(line 521,col 38)",
        "(line 522,col 9)-(line 522,col 60)",
        "(line 523,col 9)-(line 523,col 53)",
        "(line 524,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int, int)",
      "begin_line": 543,
      "end_line": 547,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 43)",
        "(line 545,col 9)-(line 545,col 52)",
        "(line 546,col 9)-(line 546,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 558,
      "end_line": 572,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 29)",
        "(line 561,col 9)-(line 561,col 38)",
        "(line 562,col 9)-(line 562,col 60)",
        "(line 563,col 9)-(line 563,col 53)",
        "(line 564,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int, int)",
      "begin_line": 583,
      "end_line": 587,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 43)",
        "(line 585,col 9)-(line 585,col 52)",
        "(line 586,col 9)-(line 586,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 598,
      "end_line": 611,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 29)",
        "(line 601,col 9)-(line 601,col 38)",
        "(line 602,col 9)-(line 602,col 60)",
        "(line 603,col 9)-(line 603,col 53)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 618,
      "end_line": 621,
      "comment": "\r\n     * Called when a series belonging to the dataset changes.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 22)",
        "(line 620,col 9)-(line 620,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.refreshKeys()",
      "begin_line": 626,
      "end_line": 643,
      "comment": "\r\n     * Refreshes the keys.\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 26)",
        "(line 629,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.equals(java.lang.Object)",
      "begin_line": 652,
      "end_line": 664,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 63)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.clone()",
      "begin_line": 674,
      "end_line": 679,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some problem cloning\r\n     *     the dataset.\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 74)",
        "(line 676,col 9)-(line 676,col 65)",
        "(line 677,col 9)-(line 677,col 56)",
        "(line 678,col 9)-(line 678,col 21)"
      ]
    }
  ]
}