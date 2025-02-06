{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/category/DefaultIntervalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIntervalCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractSeriesDataset",
        "org.jfree.data.category.IntervalCategoryDataset"
      ],
      "begin_line": 67,
      "end_line": 804,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link IntervalCategoryDataset} interface.\r\n * \u003cp\u003e\r\n * The standard constructor accepts data in a two dimensional array where the\r\n * first dimension is the series, and the second dimension is the category.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The series keys. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryKeys"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The category keys. "
    },
    {
      "type": "field",
      "varNames": [
        "startData"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the start value data. "
    },
    {
      "type": "field",
      "varNames": [
        "endData"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Storage for the end value data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(double[][], double[][])",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\r\n     * Creates a new dataset using the specified data values and automatically\r\n     * generated series and category keys.\r\n     *\r\n     * @param starts  the starting values for the intervals (\u003ccode\u003enull\u003c/code\u003e\r\n     *                not permitted).\r\n     * @param ends  the ending values for the intervals (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                permitted).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 93,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Constructs a dataset and populates it with data from the array.\r\n     * \u003cp\u003e\r\n     * The arrays are indexed as data[series][category].  Series and category\r\n     * names are automatically generated - you can change them using the\r\n     * {@link #setSeriesKeys(Comparable[])} and\r\n     * {@link #setCategoryKeys(Comparable[])} methods.\r\n     *\r\n     * @param starts  the start values data.\r\n     * @param ends  the end values data.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.String[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 123,
      "end_line": 129,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series.\r\n     * \u003cp\u003e\r\n     * Category names are generated automatically (\"Category 1\", \"Category 2\",\r\n     * etc).\r\n     *\r\n     * @param seriesNames  the series names (if \u003ccode\u003enull\u003c/code\u003e, series names\r\n     *         will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.DefaultIntervalCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 143,
      "end_line": 214,
      "comment": "\r\n     * Constructs a DefaultIntervalCategoryDataset, populates it with data\r\n     * from the arrays, and uses the supplied names for the series and the\r\n     * supplied objects for the categories.\r\n     *\r\n     * @param seriesKeys  the series keys (if \u003ccode\u003enull\u003c/code\u003e, series keys\r\n     *         will be generated automatically).\r\n     * @param categoryKeys  the category keys (if \u003ccode\u003enull\u003c/code\u003e, category\r\n     *         keys will be generated automatically).\r\n     * @param starts  the start values data, indexed as data[series][category].\r\n     * @param ends  the end values data, indexed as data[series][category].\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 151,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesCount()",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     *\r\n     * @see #getRowCount()\r\n     * @see #getCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 23)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesIndex(java.lang.Comparable)",
      "begin_line": 242,
      "end_line": 251,
      "comment": "\r\n     * Returns a series index.\r\n     *\r\n     * @param seriesKey  the series key.\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getSeriesKey(int)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getSeriesKey(int)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param series  the index of the required series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     *\r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setSeriesKeys(java.lang.Comparable[])",
      "begin_line": 278,
      "end_line": 288,
      "comment": "\r\n     * Sets the names of the series in the dataset.\r\n     *\r\n     * @param seriesKeys  the new keys (\u003ccode\u003enull\u003c/code\u003e not permitted, the\r\n     *         length of the array must match the number of series in the\r\n     *         dataset).\r\n     *\r\n     * @see #setCategoryKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 37)",
        "(line 287,col 9)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryCount()",
      "begin_line": 297,
      "end_line": 305,
      "comment": "\r\n     * Returns the number of categories in the dataset.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 23)",
        "(line 299,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKeys()",
      "begin_line": 315,
      "end_line": 325,
      "comment": "\r\n     * Returns a list of the categories in the dataset.  This method supports\r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the categories in the dataset.\r\n     *\r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setCategoryKeys(java.lang.Comparable[])",
      "begin_line": 336,
      "end_line": 353,
      "comment": "\r\n     * Sets the categories for the dataset.\r\n     *\r\n     * @param categoryKeys  an array of objects representing the categories in\r\n     *                      the dataset.\r\n     *\r\n     * @see #getRowKeys()\r\n     * @see #setSeriesKeys(Comparable[])\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 41)",
        "(line 352,col 9)-(line 352,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 368,
      "end_line": 378,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     *\r\n     * @param series    The required series (zero based index).\r\n     * @param category  The required category.\r\n     *\r\n     * @return The data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 49)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getValue(int, int)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns the data value for one category in a series.\r\n     * \u003cP\u003e\r\n     * This method is part of the CategoryDataset interface.  Not particularly\r\n     * meaningful for this class...returns the end value.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 408,
      "end_line": 418,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series\r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 49)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 49)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getStartValue(int, int)",
      "begin_line": 431,
      "end_line": 449,
      "comment": "\r\n     * Returns the start data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The start data value for one category in a series\r\n     *         (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 444,col 9)",
        "(line 447,col 9)-(line 447,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 461,
      "end_line": 471,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series.\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 49)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 49)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getEndValue(int, int)",
      "begin_line": 483,
      "end_line": 497,
      "comment": "\r\n     * Returns the end data value for one category in a series.\r\n     *\r\n     * @param series  the required series (zero based index).\r\n     * @param category  the required category.\r\n     *\r\n     * @return The end data value for one category in a series (null possible).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setStartValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 509,
      "end_line": 530,
      "comment": "\r\n     * Sets the start data value for one category in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @param value The value.\r\n     *\r\n     * @see #setEndValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 516,col 9)",
        "(line 519,col 9)-(line 519,col 55)",
        "(line 520,col 9)-(line 524,col 9)",
        "(line 527,col 9)-(line 527,col 54)",
        "(line 528,col 9)-(line 528,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.setEndValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 542,
      "end_line": 563,
      "comment": "\r\n     * Sets the end data value for one category in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category.\r\n     *\r\n     * @param value the value.\r\n     *\r\n     * @see #setStartValue(int, Comparable, Number)\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 552,col 55)",
        "(line 553,col 9)-(line 557,col 9)",
        "(line 560,col 9)-(line 560,col 52)",
        "(line 561,col 9)-(line 561,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getCategoryIndex(java.lang.Comparable)",
      "begin_line": 574,
      "end_line": 583,
      "comment": "\r\n     * Returns the index for the given category.\r\n     *\r\n     * @param category  the category (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 24)",
        "(line 576,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.generateKeys(int, java.lang.String)",
      "begin_line": 594,
      "end_line": 602,
      "comment": "\r\n     * Generates an array of keys, by appending a space plus an integer\r\n     * (starting with 1) to the supplied prefix string.\r\n     *\r\n     * @param count  the number of keys required.\r\n     * @param prefix  the name prefix.\r\n     *\r\n     * @return An array of \u003ci\u003eprefixN\u003c/i\u003e with N \u003d { 1 .. count}.\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 52)",
        "(line 596,col 9)-(line 596,col 20)",
        "(line 597,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnKey(int)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index.\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\r\n     * Returns a column index.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getCategoryIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Returns a row index.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getSeriesIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKeys()",
      "begin_line": 654,
      "end_line": 663,
      "comment": "\r\n     * Returns a list of the series in the dataset.  This method supports the\r\n     * {@link CategoryDataset} interface.\r\n     *\r\n     * @return A list of the series in the dataset.\r\n     *\r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowKey(int)",
      "begin_line": 674,
      "end_line": 680,
      "comment": "\r\n     * Returns the name of the specified series.\r\n     *\r\n     * @param row  the index of the required row/series (zero-based).\r\n     *\r\n     * @return The name of the specified series.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getColumnCount()",
      "begin_line": 691,
      "end_line": 693,
      "comment": "\r\n     * Returns the number of categories in the dataset.  This method is part of\r\n     * the {@link CategoryDataset} interface.\r\n     *\r\n     * @return The number of categories in the dataset.\r\n     *\r\n     * @see #getCategoryCount()\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.getRowCount()",
      "begin_line": 703,
      "end_line": 705,
      "comment": "\r\n     * Returns the number of series in the dataset (possibly zero).\r\n     *\r\n     * @return The number of series in the dataset.\r\n     *\r\n     * @see #getSeriesCount()\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equals(java.lang.Object)",
      "begin_line": 714,
      "end_line": 737,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 722,col 55)",
        "(line 723,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 736,col 9)-(line 736,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone()",
      "begin_line": 747,
      "end_line": 755,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 749,col 65)",
        "(line 750,col 9)-(line 750,col 70)",
        "(line 751,col 9)-(line 751,col 66)",
        "(line 752,col 9)-(line 752,col 48)",
        "(line 753,col 9)-(line 753,col 44)",
        "(line 754,col 9)-(line 754,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.equal(java.lang.Number[][], java.lang.Number[][])",
      "begin_line": 765,
      "end_line": 781,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     *\r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultIntervalCategoryDataset.clone(java.lang.Number[][])",
      "begin_line": 790,
      "end_line": 802,
      "comment": "\r\n     * Clones a two dimensional array of \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n     *\r\n     * @param array  the array (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A clone of the array.\r\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 55)",
        "(line 795,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 22)"
      ]
    }
  ]
}