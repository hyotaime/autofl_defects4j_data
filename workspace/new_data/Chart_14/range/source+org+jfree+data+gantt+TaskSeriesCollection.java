{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/gantt/TaskSeriesCollection.java",
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
      "begin_line": 67,
      "end_line": 663,
      "comment": "\r\n * A collection of {@link TaskSeries} objects.  This class provides one \r\n * implementation of the {@link GanttCategoryDataset} interface.\r\n "
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
      "comment": " \r\n     * Storage for aggregate task keys (the task description is used as the \r\n     * key). \r\n     "
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
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @since 1.0.1\r\n     ",
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
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @since 1.0.1\r\n     ",
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
      "end_line": 206,
      "comment": "\r\n     * Returns the column index for a column key.\r\n     *\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The column index.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowIndex(java.lang.Comparable)",
      "begin_line": 215,
      "end_line": 226,
      "comment": "\r\n     * Returns the row index for the given row key.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 24)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowKey(int)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\r\n     * Returns the key for a row.\r\n     *\r\n     * @param index  the row index (zero-based).\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 62)",
        "(line 237,col 9)-(line 237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.add(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 247,
      "end_line": 265,
      "comment": "\r\n     * Adds a series to the dataset and sends a \r\n     * {@link org.jfree.data.general.DatasetChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 39)",
        "(line 255,col 9)-(line 255,col 57)",
        "(line 256,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "\r\n     * Removes a series from the collection and sends \r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(int)",
      "begin_line": 292,
      "end_line": 304,
      "comment": "\r\n     * Removes a series from the collection and sends \r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 296,col 9)",
        "(line 299,col 9)-(line 299,col 59)",
        "(line 300,col 9)-(line 300,col 38)",
        "(line 301,col 9)-(line 301,col 33)",
        "(line 302,col 9)-(line 302,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.removeAll()",
      "begin_line": 311,
      "end_line": 325,
      "comment": "\r\n     * Removes all the series from the collection and sends \r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 49)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 322,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The item value.\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(int, int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns the value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 360,
      "end_line": 372,
      "comment": "\r\n     * Returns the start value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 362,col 38)",
        "(line 363,col 9)-(line 363,col 60)",
        "(line 364,col 9)-(line 364,col 53)",
        "(line 365,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int)",
      "begin_line": 382,
      "end_line": 386,
      "comment": "\r\n     * Returns the start value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 43)",
        "(line 384,col 9)-(line 384,col 52)",
        "(line 385,col 9)-(line 385,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 397,
      "end_line": 409,
      "comment": "\r\n     * Returns the end value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 29)",
        "(line 399,col 9)-(line 399,col 38)",
        "(line 400,col 9)-(line 400,col 60)",
        "(line 401,col 9)-(line 401,col 53)",
        "(line 402,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int)",
      "begin_line": 419,
      "end_line": 423,
      "comment": "\r\n     * Returns the end value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The end value.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 43)",
        "(line 421,col 9)-(line 421,col 52)",
        "(line 422,col 9)-(line 422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int)",
      "begin_line": 433,
      "end_line": 437,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The percent complete (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 43)",
        "(line 435,col 9)-(line 435,col 52)",
        "(line 436,col 9)-(line 436,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 447,
      "end_line": 456,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 29)",
        "(line 449,col 9)-(line 449,col 38)",
        "(line 450,col 9)-(line 450,col 60)",
        "(line 451,col 9)-(line 451,col 53)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(int, int)",
      "begin_line": 466,
      "end_line": 470,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 43)",
        "(line 468,col 9)-(line 468,col 52)",
        "(line 469,col 9)-(line 469,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 480,
      "end_line": 489,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 23)",
        "(line 482,col 9)-(line 482,col 38)",
        "(line 483,col 9)-(line 483,col 60)",
        "(line 484,col 9)-(line 484,col 53)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int, int)",
      "begin_line": 500,
      "end_line": 504,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 43)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 503,col 9)-(line 503,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 515,
      "end_line": 529,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 29)",
        "(line 518,col 9)-(line 518,col 38)",
        "(line 519,col 9)-(line 519,col 60)",
        "(line 520,col 9)-(line 520,col 53)",
        "(line 521,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int, int)",
      "begin_line": 540,
      "end_line": 544,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 43)",
        "(line 542,col 9)-(line 542,col 52)",
        "(line 543,col 9)-(line 543,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 555,
      "end_line": 569,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 29)",
        "(line 558,col 9)-(line 558,col 38)",
        "(line 559,col 9)-(line 559,col 60)",
        "(line 560,col 9)-(line 560,col 53)",
        "(line 561,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int, int)",
      "begin_line": 580,
      "end_line": 584,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 43)",
        "(line 582,col 9)-(line 582,col 52)",
        "(line 583,col 9)-(line 583,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 595,
      "end_line": 608,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The precent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 29)",
        "(line 598,col 9)-(line 598,col 38)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 53)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\r\n     * Called when a series belonging to the dataset changes.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 22)",
        "(line 617,col 9)-(line 617,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.refreshKeys()",
      "begin_line": 623,
      "end_line": 640,
      "comment": "\r\n     * Refreshes the keys.\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 26)",
        "(line 626,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.equals(java.lang.Object)",
      "begin_line": 649,
      "end_line": 661,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 63)",
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 660,col 20)"
      ]
    }
  ]
}