{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/general/DatasetUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 162,
      "end_line": 2166,
      "comment": "\r\n * A collection of useful static methods relating to datasets.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetUtilities.DatasetUtilities()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Private constructor for non-instanceability.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)",
      "begin_line": 180,
      "end_line": 201,
      "comment": "\r\n     * Calculates the total of all the values in a {@link PieDataset}.  If\r\n     * the dataset contains negative or \u003ccode\u003enull\u003c/code\u003e values, they are\r\n     * ignored.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 185,col 30)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 46)",
        "(line 215,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 227,
      "end_line": 236,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 59)",
        "(line 230,col 9)-(line 230,col 51)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 55)",
        "(line 250,col 9)-(line 250,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 262,
      "end_line": 271,
      "comment": "\r\n     * Creates a pie dataset from a {@link CategoryDataset} by taking all the\r\n     * values for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 59)",
        "(line 265,col 9)-(line 265,col 45)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item with the\r\n     * key \"Other\".\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  a new key for the aggregated items (\u003ccode\u003enull\u003c/code\u003e not\r\n     *             permitted).\r\n     * @param minimumPercent  the percent threshold.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double, int)",
      "begin_line": 307,
      "end_line": 351,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item.  The\r\n     * aggregated items are assigned the specified key.  Aggregation only\r\n     * occurs if there are at least \u003ccode\u003eminItems\u003c/code\u003e items to aggregate.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key to represent the aggregated items.\r\n     * @param minimumPercent  the percent threshold (ten percent is 0.10).\r\n     * @param minItems  only aggregate low values if there are at least this\r\n     *                  many.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 311,col 73)",
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 315,col 46)",
        "(line 316,col 9)-(line 316,col 44)",
        "(line 317,col 9)-(line 326,col 9)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 30)",
        "(line 331,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, double[][])",
      "begin_line": 367,
      "end_line": 380,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in an\r\n     * array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 69)",
        "(line 371,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, java.lang.Number[][])",
      "begin_line": 395,
      "end_line": 408,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array.\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 69)",
        "(line 399,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], double[][])",
      "begin_line": 423,
      "end_line": 466,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are taken from the supplied arrays.\r\n     *\r\n     * @param rowKeys  the row keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKeys  the column keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 28)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 453,col 9)",
        "(line 456,col 9)-(line 456,col 69)",
        "(line 457,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)",
      "begin_line": 477,
      "end_line": 492,
      "comment": "\r\n     * Creates a {@link CategoryDataset} by copying the data from the supplied\r\n     * {@link KeyedValues} instance.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowData  the row data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 69)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 507,
      "end_line": 515,
      "comment": "\r\n     * Creates an {@link XYDataset} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 512,col 27)",
        "(line 513,col 9)-(line 513,col 71)",
        "(line 514,col 9)-(line 514,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 532,
      "end_line": 555,
      "comment": "\r\n     * Creates an {@link XYSeries} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A series.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 548,col 50)",
        "(line 549,col 9)-(line 549,col 52)",
        "(line 550,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.pie.PieDataset)",
      "begin_line": 565,
      "end_line": 588,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 47)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 576,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.category.CategoryDataset)",
      "begin_line": 598,
      "end_line": 621,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 45)",
        "(line 605,col 9)-(line 605,col 51)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.xy.XYDataset)",
      "begin_line": 631,
      "end_line": 640,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 663,
      "end_line": 681,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  determines whether or not the x-interval is taken\r\n     *                         into account (only applies if the dataset is an\r\n     *                         {@link IntervalXYDataset}).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 670,col 28)",
        "(line 672,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 698,
      "end_line": 713,
      "comment": "\r\n     * Returns the bounds of the x-values in the specified \u003ccode\u003edataset\u003c/code\u003e\r\n     * taking into account only the visible series and including any x-interval\r\n     * if requested.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e\r\n     *     not permitted).\r\n     * @param includeInterval  include the x-interval (if any)?\r\n     *\r\n     * @return The bounds (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 28)",
        "(line 704,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.  If the dataset is an instance of\r\n     * {@link IntervalXYDataset}, the starting and ending x-values\r\n     * will be used for the bounds calculation.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 740,
      "end_line": 785,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the x-interval or just the\r\n     *          x-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 50)",
        "(line 746,col 9)-(line 746,col 50)",
        "(line 747,col 9)-(line 747,col 51)",
        "(line 748,col 9)-(line 748,col 22)",
        "(line 749,col 9)-(line 749,col 22)",
        "(line 750,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 807,
      "end_line": 821,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 28)",
        "(line 813,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 837,
      "end_line": 852,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 28)",
        "(line 843,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 877,
      "end_line": 891,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset, boolean)}\r\n     * method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 28)",
        "(line 883,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 909,
      "end_line": 925,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys, and those items\r\n     * whose x-values fall within the specified range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 28)",
        "(line 915,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 940,
      "end_line": 943,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use\r\n     *         {@link #iterateRangeBounds(CategoryDataset, boolean)}.\r\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 971,
      "end_line": 1027,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 50)",
        "(line 974,col 9)-(line 974,col 50)",
        "(line 975,col 9)-(line 975,col 45)",
        "(line 976,col 9)-(line 976,col 51)",
        "(line 977,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1026,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 1042,
      "end_line": 1186,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * @param visibleSeriesKeys  the visible series keys.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1051,col 9)",
        "(line 1053,col 9)-(line 1053,col 50)",
        "(line 1054,col 9)-(line 1054,col 50)",
        "(line 1055,col 9)-(line 1055,col 51)",
        "(line 1056,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1198,
      "end_line": 1200,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use {@link #iterateRangeBounds(XYDataset)}.\r\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1212,
      "end_line": 1214,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1229,
      "end_line": 1289,
      "comment": "\r\n     * Iterates over the data items of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the y-interval or just the\r\n     *          y-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 50)",
        "(line 1232,col 9)-(line 1232,col 50)",
        "(line 1233,col 9)-(line 1233,col 51)",
        "(line 1236,col 9)-(line 1282,col 9)",
        "(line 1283,col 9)-(line 1288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 1306,
      "end_line": 1363,
      "comment": "\r\n     * Returns the range of x-values in the specified dataset for the\r\n     * data items belonging to the visible series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The x-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1311,col 9)",
        "(line 1312,col 9)-(line 1315,col 9)",
        "(line 1317,col 9)-(line 1317,col 50)",
        "(line 1318,col 9)-(line 1318,col 50)",
        "(line 1320,col 9)-(line 1355,col 9)",
        "(line 1357,col 9)-(line 1362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 1382,
      "end_line": 1494,
      "comment": "\r\n     * Returns the range of y-values in the specified dataset for the\r\n     * data items belonging to the visible series and with x-values in the\r\n     * given range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The y-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1394,col 9)",
        "(line 1396,col 9)-(line 1396,col 50)",
        "(line 1397,col 9)-(line 1397,col 50)",
        "(line 1400,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1509,
      "end_line": 1550,
      "comment": "\r\n     * Finds the minimum domain (or X) value for the specified dataset.  This\r\n     * is easy if the dataset implements the {@link DomainInfo} interface (a\r\n     * good idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1513,col 29)",
        "(line 1515,col 9)-(line 1547,col 9)",
        "(line 1549,col 9)-(line 1549,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1564,
      "end_line": 1607,
      "comment": "\r\n     * Returns the maximum domain value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link DomainInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1565,col 9)-(line 1567,col 9)",
        "(line 1568,col 9)-(line 1568,col 29)",
        "(line 1570,col 9)-(line 1604,col 9)",
        "(line 1606,col 9)-(line 1606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1621,
      "end_line": 1662,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1623,col 9)-(line 1625,col 9)",
        "(line 1627,col 9)-(line 1660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1676,
      "end_line": 1724,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1678,col 9)-(line 1680,col 9)",
        "(line 1683,col 9)-(line 1722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1737,
      "end_line": 1780,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is easy\r\n     * if the dataset implements the {@link RangeInfo} interface (a good idea\r\n     * if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1739,col 9)-(line 1741,col 9)",
        "(line 1744,col 9)-(line 1778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1793,
      "end_line": 1840,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1795,col 9)-(line 1797,col 9)",
        "(line 1800,col 9)-(line 1838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1850,
      "end_line": 1852,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1851,col 9)-(line 1851,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)",
      "begin_line": 1863,
      "end_line": 1897,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value for the bars.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1865,col 9)-(line 1867,col 9)",
        "(line 1868,col 9)-(line 1868,col 28)",
        "(line 1869,col 9)-(line 1869,col 50)",
        "(line 1870,col 9)-(line 1870,col 50)",
        "(line 1871,col 9)-(line 1871,col 53)",
        "(line 1872,col 9)-(line 1891,col 9)",
        "(line 1892,col 9)-(line 1894,col 9)",
        "(line 1895,col 9)-(line 1895,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)",
      "begin_line": 1909,
      "end_line": 1962,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param map  a structure that maps series to groups.\r\n     *\r\n     * @return The value range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *         values).\r\n     ",
      "child_ranges": [
        "(line 1911,col 9)-(line 1913,col 9)",
        "(line 1914,col 9)-(line 1914,col 37)",
        "(line 1915,col 9)-(line 1915,col 28)",
        "(line 1918,col 9)-(line 1918,col 58)",
        "(line 1919,col 9)-(line 1922,col 9)",
        "(line 1925,col 9)-(line 1925,col 45)",
        "(line 1926,col 9)-(line 1926,col 50)",
        "(line 1927,col 9)-(line 1927,col 50)",
        "(line 1929,col 9)-(line 1929,col 53)",
        "(line 1930,col 9)-(line 1954,col 9)",
        "(line 1955,col 9)-(line 1960,col 9)",
        "(line 1961,col 9)-(line 1961,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1974,
      "end_line": 2002,
      "comment": "\r\n     * Returns the minimum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value.\r\n     *\r\n     * @see #findMaximumStackedRangeValue(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1975,col 9)-(line 1977,col 9)",
        "(line 1978,col 9)-(line 1978,col 29)",
        "(line 1979,col 9)-(line 1979,col 37)",
        "(line 1980,col 9)-(line 1980,col 29)",
        "(line 1981,col 9)-(line 1981,col 53)",
        "(line 1982,col 9)-(line 1997,col 9)",
        "(line 1998,col 9)-(line 2000,col 9)",
        "(line 2001,col 9)-(line 2001,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2014,
      "end_line": 2041,
      "comment": "\r\n     * Returns the maximum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #findMinimumStackedRangeValue(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 2015,col 9)-(line 2017,col 9)",
        "(line 2018,col 9)-(line 2018,col 29)",
        "(line 2019,col 9)-(line 2019,col 37)",
        "(line 2020,col 9)-(line 2020,col 29)",
        "(line 2021,col 9)-(line 2021,col 53)",
        "(line 2022,col 9)-(line 2036,col 9)",
        "(line 2037,col 9)-(line 2039,col 9)",
        "(line 2040,col 9)-(line 2040,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 2051,
      "end_line": 2053,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range ([0.0, 0.0] if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 2052,col 9)-(line 2052,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)",
      "begin_line": 2064,
      "end_line": 2099,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked, using the specified base value.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2068,col 9)",
        "(line 2069,col 9)-(line 2069,col 30)",
        "(line 2070,col 9)-(line 2070,col 30)",
        "(line 2071,col 9)-(line 2092,col 9)",
        "(line 2093,col 9)-(line 2098,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)",
      "begin_line": 2112,
      "end_line": 2122,
      "comment": "\r\n     * Calculates the total for the y-values in all series for a given item\r\n     * index.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The total.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 2113,col 9)-(line 2113,col 27)",
        "(line 2114,col 9)-(line 2114,col 51)",
        "(line 2115,col 9)-(line 2120,col 9)",
        "(line 2121,col 9)-(line 2121,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2134,
      "end_line": 2164,
      "comment": "\r\n     * Calculates the range of values for a dataset where each item is the\r\n     * running total of the items for the current series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range.\r\n     *\r\n     * @see #findRangeBounds(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 2135,col 9)-(line 2137,col 9)",
        "(line 2138,col 9)-(line 2138,col 36)",
        "(line 2140,col 9)-(line 2140,col 29)",
        "(line 2141,col 9)-(line 2141,col 29)",
        "(line 2142,col 9)-(line 2157,col 9)",
        "(line 2158,col 9)-(line 2163,col 9)"
      ]
    }
  ]
}