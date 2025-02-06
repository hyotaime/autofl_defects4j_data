{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/gantt/TaskSeriesCollection.java",
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
      "begin_line": 69,
      "end_line": 687,
      "comment": "\r\n * A collection of {@link TaskSeries} objects.  This class provides one\r\n * implementation of the {@link GanttCategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\r\n     * Storage for aggregate task keys (the task description is used as the\r\n     * key).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Storage for the series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.TaskSeriesCollection()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 46)",
        "(line 90,col 9)-(line 90,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeries(int)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @since 1.0.1\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeriesCount()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSeriesKey(int)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\r\n     * Returns the name of a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The name of a series.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 148,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowCount()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the number of rows (series) in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowKeys()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns the row keys.  In this case, each series is a key.\r\n     *\r\n     * @return The row keys.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnCount()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns the number of column in the dataset.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnKeys()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns a list of the column keys in the dataset.\r\n     *\r\n     * @return The category list.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnKey(int)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param index  the column index.\r\n     *\r\n     * @return The column key.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getColumnIndex(java.lang.Comparable)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\r\n     * Returns the column index for a column key.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowIndex(java.lang.Comparable)",
      "begin_line": 219,
      "end_line": 230,
      "comment": "\r\n     * Returns the row index for the given row key.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 24)",
        "(line 221,col 9)-(line 221,col 37)",
        "(line 222,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getRowKey(int)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\r\n     * Returns the key for a row.\r\n     *\r\n     * @param index  the row index (zero-based).\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 62)",
        "(line 241,col 9)-(line 241,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.add(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 251,
      "end_line": 270,
      "comment": "\r\n     * Adds a series to the dataset and sends a\r\n     * {@link org.jfree.data.general.DatasetChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 30)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 259,col 9)-(line 259,col 57)",
        "(line 260,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(org.jfree.data.gantt.TaskSeries)",
      "begin_line": 279,
      "end_line": 289,
      "comment": "\r\n     * Removes a series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.remove(int)",
      "begin_line": 298,
      "end_line": 311,
      "comment": "\r\n     * Removes a series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 302,col 9)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 38)",
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.removeAll()",
      "begin_line": 318,
      "end_line": 333,
      "comment": "\r\n     * Removes all the series from the collection and sends\r\n     * a {@link org.jfree.data.general.DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 329,col 26)",
        "(line 330,col 9)-(line 330,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The item value.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getValue(int, int)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns the value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 368,
      "end_line": 380,
      "comment": "\r\n     * Returns the start value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 29)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 60)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 373,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int)",
      "begin_line": 390,
      "end_line": 394,
      "comment": "\r\n     * Returns the start value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 392,col 52)",
        "(line 393,col 9)-(line 393,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 405,
      "end_line": 417,
      "comment": "\r\n     * Returns the end value for a task.  This is a date/time value, measured\r\n     * in milliseconds since 1-Jan-1970.\r\n     *\r\n     * @param rowKey  the series.\r\n     * @param columnKey  the category.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 29)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 60)",
        "(line 409,col 9)-(line 409,col 53)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int)",
      "begin_line": 427,
      "end_line": 431,
      "comment": "\r\n     * Returns the end value for a task.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The end value.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 43)",
        "(line 429,col 9)-(line 429,col 52)",
        "(line 430,col 9)-(line 430,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int)",
      "begin_line": 441,
      "end_line": 445,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The percent complete (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 43)",
        "(line 443,col 9)-(line 443,col 52)",
        "(line 444,col 9)-(line 444,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 455,
      "end_line": 464,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 29)",
        "(line 457,col 9)-(line 457,col 38)",
        "(line 458,col 9)-(line 458,col 60)",
        "(line 459,col 9)-(line 459,col 53)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(int, int)",
      "begin_line": 474,
      "end_line": 478,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 43)",
        "(line 476,col 9)-(line 476,col 52)",
        "(line 477,col 9)-(line 477,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 488,
      "end_line": 497,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 23)",
        "(line 490,col 9)-(line 490,col 38)",
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 53)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(int, int, int)",
      "begin_line": 508,
      "end_line": 512,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 43)",
        "(line 510,col 9)-(line 510,col 52)",
        "(line 511,col 9)-(line 511,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 523,
      "end_line": 537,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 29)",
        "(line 526,col 9)-(line 526,col 38)",
        "(line 527,col 9)-(line 527,col 60)",
        "(line 528,col 9)-(line 528,col 53)",
        "(line 529,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(int, int, int)",
      "begin_line": 548,
      "end_line": 552,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 43)",
        "(line 550,col 9)-(line 550,col 52)",
        "(line 551,col 9)-(line 551,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 563,
      "end_line": 577,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the subinterval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 29)",
        "(line 566,col 9)-(line 566,col 38)",
        "(line 567,col 9)-(line 567,col 60)",
        "(line 568,col 9)-(line 568,col 53)",
        "(line 569,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(int, int, int)",
      "begin_line": 588,
      "end_line": 592,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 43)",
        "(line 590,col 9)-(line 590,col 52)",
        "(line 591,col 9)-(line 591,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 603,
      "end_line": 616,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 29)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 60)",
        "(line 608,col 9)-(line 608,col 53)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 623,
      "end_line": 627,
      "comment": "\r\n     * Called when a series belonging to the dataset changes.\r\n     *\r\n     * @param event  information about the change.\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 22)",
        "(line 625,col 9)-(line 625,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.refreshKeys()",
      "begin_line": 632,
      "end_line": 649,
      "comment": "\r\n     * Refreshes the keys.\r\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 26)",
        "(line 635,col 9)-(line 647,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.equals(java.lang.Object)",
      "begin_line": 658,
      "end_line": 670,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 63)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.TaskSeriesCollection.clone()",
      "begin_line": 680,
      "end_line": 685,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some problem cloning\r\n     *     the dataset.\r\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 74)",
        "(line 682,col 9)-(line 682,col 65)",
        "(line 683,col 9)-(line 683,col 56)",
        "(line 684,col 9)-(line 684,col 21)"
      ]
    }
  ]
}