{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/category/DefaultIntervalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIntervalCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.category.IntervalCategoryDataset"
      ],
      "begin_line": 66,
      "end_line": 802,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link IntervalCategoryDataset} interface.\r\n * \u003cp\u003e\r\n * The standard constructor accepts data in a two dimensional array where the\r\n * first dimension is the series, and the second dimension is the category.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The series keys. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryKeys"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The category keys. "
    },
    {
      "type": "field",
      "varNames": [
        "startData"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Storage for the start value data. "
    },
    {
      "type": "field",
      "varNames": [
        "endData"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Storage for the end value data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(double[][], double[][])",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\r\n     * Creates a new dataset using the specified data values and automatically\r\n     * generated series and category keys.\r\n     *\r\n     * @param starts  the starting values for the intervals (\u003ccode\u003enull\u003c/code\u003e\r\n     *                not permitted).\r\n     * @param ends  the ending values for the intervals (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 92,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Constructs a dataset and populates it with data from the array.\r\n     * \u003cp\u003e\r\n     * The arrays are indexed as data[series][category].  Series and category\r\n     * names are automatically generated - you can change them using the\r\n     * {@link #setSeriesKeys(Comparable[])} and \r\n     * {@link #setCategoryKeys(Comparable[])} methods.\r\n     *\r\n     * @param starts  the start values data.\r\n     * @param ends  the end values data.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.String[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 122,
      "end_line": 128,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series.\r\n     * \u003cp\u003e\r\n     * Category names are generated automatically (\"Category 1\", \"Category 2\",\r\n     * etc).\r\n     *\r\n     * @param seriesNames  the series names (if \u003ccode\u003enull\u003c/code\u003e, series names\r\n     *         will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 142,
      "end_line": 212,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series and the\r\n     * supplied objects for the categories.\r\n     *\r\n     * @param seriesKeys  the series keys (if \u003ccode\u003enull\u003c/code\u003e, series keys\r\n     *         will be generated automatically).\r\n     * @param categoryKeys  the category keys (if \u003ccode\u003enull\u003c/code\u003e, category \r\n     *         keys will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 32)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 150,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesCount()",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     * \r\n     * @see #getRowCount()\r\n     * @see #getCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex(java.lang.Comparable)",
      "begin_line": 240,
      "end_line": 249,
      "comment": "\r\n     * Returns a series index.\r\n     *\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * @return The series index.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getSeriesKey(int)\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 24)",
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey(int)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param series  the index of the required series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     * \r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setSeriesKeys(java.lang.Comparable[])",
      "begin_line": 276,
      "end_line": 286,
      "comment": "\r\n     * Sets the names of the series in the dataset.\r\n     *\r\n     * @param seriesKeys  the new keys (\u003ccode\u003enull\u003c/code\u003e not permitted, the \r\n     *         length of the array must match the number of series in the \r\n     *         dataset).\r\n     *         \r\n     * @see #setCategoryKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 285,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount()",
      "begin_line": 295,
      "end_line": 303,
      "comment": "\r\n     * Returns the number of categories in the dataset.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     * \r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 23)",
        "(line 297,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKeys()",
      "begin_line": 313,
      "end_line": 323,
      "comment": "\r\n     * Returns a list of the categories in the dataset.  This method supports \r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the categories in the dataset.\r\n     * \r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(java.lang.Comparable[])",
      "begin_line": 334,
      "end_line": 351,
      "comment": "\r\n     * Sets the categories for the dataset.\r\n     *\r\n     * @param categoryKeys  an array of objects representing the categories in \r\n     *                      the dataset.\r\n     *                      \r\n     * @see #getRowKeys()\r\n     * @see #setSeriesKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 41)",
        "(line 350,col 9)-(line 350,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 366,
      "end_line": 376,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     * \r\n     * @param series    The required series (zero based index).\r\n     * @param category  The required category.\r\n     * \r\n     * @return The data value for one category in a series (null possible).\r\n     * \r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 49)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 49)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(int, int)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The data value for one category in a series (null possible).\r\n     * \r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 406,
      "end_line": 416,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series \r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #getStartValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 49)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 49)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(int, int)",
      "begin_line": 429,
      "end_line": 447,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series \r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 442,col 9)",
        "(line 445,col 9)-(line 445,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 459,
      "end_line": 469,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     * \r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 49)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 49)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(int, int)",
      "begin_line": 481,
      "end_line": 495,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     * \r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 507,
      "end_line": 528,
      "comment": "\r\n     * Sets the start data value for one category in a series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     * \r\n     * @param value The value.\r\n     * \r\n     * @see #setEndValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 514,col 9)",
        "(line 517,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 525,col 9)-(line 525,col 54)",
        "(line 526,col 9)-(line 526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 540,
      "end_line": 561,
      "comment": "\r\n     * Sets the end data value for one category in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @param value the value.\r\n     * \r\n     * @see #setStartValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 547,col 9)",
        "(line 550,col 9)-(line 550,col 55)",
        "(line 551,col 9)-(line 555,col 9)",
        "(line 558,col 9)-(line 558,col 52)",
        "(line 559,col 9)-(line 559,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(java.lang.Comparable)",
      "begin_line": 572,
      "end_line": 581,
      "comment": "\r\n     * Returns the index for the given category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 24)",
        "(line 574,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys(int, java.lang.String)",
      "begin_line": 592,
      "end_line": 600,
      "comment": "\r\n     * Generates an array of keys, by appending a space plus an integer\r\n     * (starting with 1) to the supplied prefix string.\r\n     *\r\n     * @param count  the number of keys required.\r\n     * @param prefix  the name prefix.\r\n     *\r\n     * @return An array of \u003ci\u003eprefixN\u003c/i\u003e with N \u003d { 1 .. count}.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 52)",
        "(line 594,col 9)-(line 594,col 20)",
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey(int)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index.\r\n     *\r\n     * @return The column key.\r\n     * \r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 624,
      "end_line": 629,
      "comment": "\r\n     * Returns a column index.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getCategoryIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 640,
      "end_line": 642,
      "comment": "\r\n     * Returns a row index.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKeys()",
      "begin_line": 652,
      "end_line": 661,
      "comment": "\r\n     * Returns a list of the series in the dataset.  This method supports the \r\n     * {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the series in the dataset.\r\n     * \r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKey(int)",
      "begin_line": 672,
      "end_line": 678,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param row  the index of the required row/series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\r\n     * Returns the number of categories in the dataset.  This method is part of \r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     * \r\n     * @see #getCategoryCount()\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount()",
      "begin_line": 701,
      "end_line": 703,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     * \r\n     * @see #getSeriesCount()\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equals(java.lang.Object)",
      "begin_line": 712,
      "end_line": 735,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 715,col 9)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 720,col 55)",
        "(line 721,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone()",
      "begin_line": 745,
      "end_line": 753,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 747,col 65)",
        "(line 748,col 9)-(line 748,col 70)",
        "(line 749,col 9)-(line 749,col 66)",
        "(line 750,col 9)-(line 750,col 48)",
        "(line 751,col 9)-(line 751,col 44)",
        "(line 752,col 9)-(line 752,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equal(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 763,
      "end_line": 779,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     * \r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone(java.lang.Number[][])",
      "begin_line": 788,
      "end_line": 800,
      "comment": "\r\n     * Clones a two dimensional array of \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n     * \r\n     * @param array  the array (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A clone of the array.\r\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 55)",
        "(line 793,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 22)"
      ]
    }
  ]
}