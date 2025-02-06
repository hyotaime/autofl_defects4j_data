{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/category/DefaultIntervalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIntervalCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.category.IntervalCategoryDataset"
      ],
      "begin_line": 68,
      "end_line": 809,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link IntervalCategoryDataset} interface.\r\n * \u003cp\u003e\r\n * The standard constructor accepts data in a two dimensional array where the\r\n * first dimension is the series, and the second dimension is the category.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The series keys. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryKeys"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The category keys. "
    },
    {
      "type": "field",
      "varNames": [
        "startData"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Storage for the start value data. "
    },
    {
      "type": "field",
      "varNames": [
        "endData"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Storage for the end value data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(double[][], double[][])",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\r\n     * Creates a new dataset using the specified data values and automatically\r\n     * generated series and category keys.\r\n     *\r\n     * @param starts  the starting values for the intervals (\u003ccode\u003enull\u003c/code\u003e\r\n     *                not permitted).\r\n     * @param ends  the ending values for the intervals (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Constructs a dataset and populates it with data from the array.\r\n     * \u003cp\u003e\r\n     * The arrays are indexed as data[series][category].  Series and category\r\n     * names are automatically generated - you can change them using the\r\n     * {@link #setSeriesKeys(Comparable[])} and\r\n     * {@link #setCategoryKeys(Comparable[])} methods.\r\n     *\r\n     * @param starts  the start values data.\r\n     * @param ends  the end values data.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.String[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series.\r\n     * \u003cp\u003e\r\n     * Category names are generated automatically (\"Category 1\", \"Category 2\",\r\n     * etc).\r\n     *\r\n     * @param seriesNames  the series names (if \u003ccode\u003enull\u003c/code\u003e, series names\r\n     *         will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 144,
      "end_line": 215,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series and the\r\n     * supplied objects for the categories.\r\n     *\r\n     * @param seriesKeys  the series keys (if \u003ccode\u003enull\u003c/code\u003e, series keys\r\n     *         will be generated automatically).\r\n     * @param categoryKeys  the category keys (if \u003ccode\u003enull\u003c/code\u003e, category\r\n     *         keys will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 152,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesCount()",
      "begin_line": 225,
      "end_line": 231,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     *\r\n     * @see #getRowCount()\r\n     * @see #getCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 23)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex(java.lang.Comparable)",
      "begin_line": 243,
      "end_line": 252,
      "comment": "\r\n     * Returns a series index.\r\n     *\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getSeriesKey(int)\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 24)",
        "(line 245,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey(int)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param series  the index of the required series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     *\r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setSeriesKeys(java.lang.Comparable[])",
      "begin_line": 279,
      "end_line": 290,
      "comment": "\r\n     * Sets the names of the series in the dataset.\r\n     *\r\n     * @param seriesKeys  the new keys (\u003ccode\u003enull\u003c/code\u003e not permitted, the\r\n     *         length of the array must match the number of series in the\r\n     *         dataset).\r\n     *\r\n     * @see #setCategoryKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 37)",
        "(line 288,col 9)-(line 288,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount()",
      "begin_line": 299,
      "end_line": 307,
      "comment": "\r\n     * Returns the number of categories in the dataset.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 23)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKeys()",
      "begin_line": 317,
      "end_line": 327,
      "comment": "\r\n     * Returns a list of the categories in the dataset.  This method supports\r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the categories in the dataset.\r\n     *\r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(java.lang.Comparable[])",
      "begin_line": 338,
      "end_line": 356,
      "comment": "\r\n     * Sets the categories for the dataset.\r\n     *\r\n     * @param categoryKeys  an array of objects representing the categories in\r\n     *                      the dataset.\r\n     *\r\n     * @see #getRowKeys()\r\n     * @see #setSeriesKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 41)",
        "(line 354,col 9)-(line 354,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 371,
      "end_line": 381,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     *\r\n     * @param series    The required series (zero based index).\r\n     * @param category  The required category.\r\n     *\r\n     * @return The data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 49)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 49)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(int, int)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 411,
      "end_line": 421,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series\r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 49)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(int, int)",
      "begin_line": 434,
      "end_line": 452,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series\r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 447,col 9)",
        "(line 450,col 9)-(line 450,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 464,
      "end_line": 474,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 49)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(int, int)",
      "begin_line": 486,
      "end_line": 500,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 497,col 9)",
        "(line 499,col 9)-(line 499,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 512,
      "end_line": 534,
      "comment": "\r\n     * Sets the start data value for one category in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @param value The value.\r\n     *\r\n     * @see #setEndValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 519,col 9)",
        "(line 522,col 9)-(line 522,col 55)",
        "(line 523,col 9)-(line 527,col 9)",
        "(line 530,col 9)-(line 530,col 54)",
        "(line 531,col 9)-(line 531,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 546,
      "end_line": 568,
      "comment": "\r\n     * Sets the end data value for one category in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @param value the value.\r\n     *\r\n     * @see #setStartValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 556,col 55)",
        "(line 557,col 9)-(line 561,col 9)",
        "(line 564,col 9)-(line 564,col 52)",
        "(line 565,col 9)-(line 565,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(java.lang.Comparable)",
      "begin_line": 579,
      "end_line": 588,
      "comment": "\r\n     * Returns the index for the given category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 24)",
        "(line 581,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys(int, java.lang.String)",
      "begin_line": 599,
      "end_line": 607,
      "comment": "\r\n     * Generates an array of keys, by appending a space plus an integer\r\n     * (starting with 1) to the supplied prefix string.\r\n     *\r\n     * @param count  the number of keys required.\r\n     * @param prefix  the name prefix.\r\n     *\r\n     * @return An array of \u003ci\u003eprefixN\u003c/i\u003e with N \u003d { 1 .. count}.\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 52)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey(int)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index.\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 631,
      "end_line": 636,
      "comment": "\r\n     * Returns a column index.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getCategoryIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\r\n     * Returns a row index.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKeys()",
      "begin_line": 659,
      "end_line": 668,
      "comment": "\r\n     * Returns a list of the series in the dataset.  This method supports the\r\n     * {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the series in the dataset.\r\n     *\r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKey(int)",
      "begin_line": 679,
      "end_line": 685,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param row  the index of the required row/series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount()",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\r\n     * Returns the number of categories in the dataset.  This method is part of\r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     *\r\n     * @see #getCategoryCount()\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     *\r\n     * @see #getSeriesCount()\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equals(java.lang.Object)",
      "begin_line": 719,
      "end_line": 742,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 727,col 55)",
        "(line 728,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 741,col 9)-(line 741,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone()",
      "begin_line": 752,
      "end_line": 760,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 754,col 65)",
        "(line 755,col 9)-(line 755,col 70)",
        "(line 756,col 9)-(line 756,col 66)",
        "(line 757,col 9)-(line 757,col 48)",
        "(line 758,col 9)-(line 758,col 44)",
        "(line 759,col 9)-(line 759,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equal(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 770,
      "end_line": 786,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     *\r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone(java.lang.Number[][])",
      "begin_line": 795,
      "end_line": 807,
      "comment": "\r\n     * Clones a two dimensional array of \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n     *\r\n     * @param array  the array (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A clone of the array.\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 55)",
        "(line 800,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 22)"
      ]
    }
  ]
}