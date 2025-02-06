{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/DatasetUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 159,
      "end_line": 2152,
      "comment": "\r\n * A collection of useful static methods relating to datasets.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetUtilities.DatasetUtilities()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Private constructor for non-instanceability.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.data.general.PieDataset)",
      "begin_line": 177,
      "end_line": 198,
      "comment": "\r\n     * Calculates the total of all the values in a {@link PieDataset}.  If\r\n     * the dataset contains negative or \u003ccode\u003enull\u003c/code\u003e values, they are\r\n     * ignored.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 38)",
        "(line 182,col 9)-(line 182,col 30)",
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 209,
      "end_line": 213,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 224,
      "end_line": 233,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 59)",
        "(line 227,col 9)-(line 227,col 51)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 247,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 259,
      "end_line": 268,
      "comment": "\r\n     * Creates a pie dataset from a {@link CategoryDataset} by taking all the\r\n     * values for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 59)",
        "(line 262,col 9)-(line 262,col 45)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double)",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item with the\r\n     * key \"Other\".\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  a new key for the aggregated items (\u003ccode\u003enull\u003c/code\u003e not\r\n     *             permitted).\r\n     * @param minimumPercent  the percent threshold.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 286,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double, int)",
      "begin_line": 304,
      "end_line": 348,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item.  The\r\n     * aggregated items are assigned the specified key.  Aggregation only\r\n     * occurs if there are at least \u003ccode\u003eminItems\u003c/code\u003e items to aggregate.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key to represent the aggregated items.\r\n     * @param minimumPercent  the percent threshold (ten percent is 0.10).\r\n     * @param minItems  only aggregate low values if there are at least this\r\n     *                  many.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 73)",
        "(line 311,col 9)-(line 311,col 37)",
        "(line 312,col 9)-(line 312,col 46)",
        "(line 313,col 9)-(line 313,col 44)",
        "(line 314,col 9)-(line 323,col 9)",
        "(line 326,col 9)-(line 326,col 35)",
        "(line 327,col 9)-(line 327,col 30)",
        "(line 328,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, double[][])",
      "begin_line": 364,
      "end_line": 377,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in an\r\n     * array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 69)",
        "(line 368,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, java.lang.Number[][])",
      "begin_line": 392,
      "end_line": 405,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array.\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 69)",
        "(line 396,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], double[][])",
      "begin_line": 420,
      "end_line": 463,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are taken from the supplied arrays.\r\n     *\r\n     * @param rowKeys  the row keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKeys  the column keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 28)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 450,col 9)",
        "(line 453,col 9)-(line 453,col 69)",
        "(line 454,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)",
      "begin_line": 474,
      "end_line": 489,
      "comment": "\r\n     * Creates a {@link CategoryDataset} by copying the data from the supplied\r\n     * {@link KeyedValues} instance.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowData  the row data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 69)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 504,
      "end_line": 512,
      "comment": "\r\n     * Creates an {@link XYDataset} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 509,col 27)",
        "(line 510,col 9)-(line 510,col 71)",
        "(line 511,col 9)-(line 511,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 529,
      "end_line": 552,
      "comment": "\r\n     * Creates an {@link XYSeries} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A series.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 50)",
        "(line 546,col 9)-(line 546,col 52)",
        "(line 547,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.general.PieDataset)",
      "begin_line": 562,
      "end_line": 585,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 568,col 47)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.category.CategoryDataset)",
      "begin_line": 595,
      "end_line": 618,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 45)",
        "(line 602,col 9)-(line 602,col 51)",
        "(line 603,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.xy.XYDataset)",
      "begin_line": 628,
      "end_line": 637,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 660,
      "end_line": 678,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  determines whether or not the x-interval is taken\r\n     *                         into account (only applies if the dataset is an\r\n     *                         {@link IntervalXYDataset}).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 28)",
        "(line 669,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 695,
      "end_line": 710,
      "comment": "\r\n     * Returns the bounds of the x-values in the specified \u003ccode\u003edataset\u003c/code\u003e\r\n     * taking into account only the visible series and including any x-interval\r\n     * if requested.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e\r\n     *     not permitted).\r\n     * @param includeInterval  include the x-interval (if any)?\r\n     *\r\n     * @return The bounds (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 28)",
        "(line 701,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.  If the dataset is an instance of\r\n     * {@link IntervalXYDataset}, the starting and ending x-values\r\n     * will be used for the bounds calculation.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 737,
      "end_line": 782,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the x-interval or just the\r\n     *          x-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 50)",
        "(line 743,col 9)-(line 743,col 50)",
        "(line 744,col 9)-(line 744,col 51)",
        "(line 745,col 9)-(line 745,col 22)",
        "(line 746,col 9)-(line 746,col 22)",
        "(line 747,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 791,
      "end_line": 793,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 804,
      "end_line": 818,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 28)",
        "(line 810,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 817,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 834,
      "end_line": 849,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 28)",
        "(line 840,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 874,
      "end_line": 888,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset, boolean)}\r\n     * method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 28)",
        "(line 880,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 906,
      "end_line": 922,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys, and those items\r\n     * whose x-values fall within the specified range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 911,col 28)",
        "(line 912,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 937,
      "end_line": 940,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use\r\n     *         {@link #iterateRangeBounds(CategoryDataset, boolean)}.\r\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 968,
      "end_line": 1013,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 50)",
        "(line 971,col 9)-(line 971,col 50)",
        "(line 972,col 9)-(line 972,col 45)",
        "(line 973,col 9)-(line 973,col 51)",
        "(line 974,col 9)-(line 1006,col 9)",
        "(line 1007,col 9)-(line 1012,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 1028,
      "end_line": 1172,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * @param visibleSeriesKeys  the visible series keys.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 50)",
        "(line 1040,col 9)-(line 1040,col 50)",
        "(line 1041,col 9)-(line 1041,col 51)",
        "(line 1042,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1184,
      "end_line": 1186,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use {@link #iterateRangeBounds(XYDataset)}.\r\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1198,
      "end_line": 1200,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1215,
      "end_line": 1275,
      "comment": "\r\n     * Iterates over the data items of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the y-interval or just the\r\n     *          y-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 50)",
        "(line 1218,col 9)-(line 1218,col 50)",
        "(line 1219,col 9)-(line 1219,col 51)",
        "(line 1222,col 9)-(line 1268,col 9)",
        "(line 1269,col 9)-(line 1274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 1292,
      "end_line": 1349,
      "comment": "\r\n     * Returns the range of x-values in the specified dataset for the\r\n     * data items belonging to the visible series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The x-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1301,col 9)",
        "(line 1303,col 9)-(line 1303,col 50)",
        "(line 1304,col 9)-(line 1304,col 50)",
        "(line 1306,col 9)-(line 1341,col 9)",
        "(line 1343,col 9)-(line 1348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 1368,
      "end_line": 1480,
      "comment": "\r\n     * Returns the range of y-values in the specified dataset for the\r\n     * data items belonging to the visible series and with x-values in the\r\n     * given range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The y-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1373,col 9)",
        "(line 1374,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1380,col 9)",
        "(line 1382,col 9)-(line 1382,col 50)",
        "(line 1383,col 9)-(line 1383,col 50)",
        "(line 1386,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1495,
      "end_line": 1536,
      "comment": "\r\n     * Finds the minimum domain (or X) value for the specified dataset.  This\r\n     * is easy if the dataset implements the {@link DomainInfo} interface (a\r\n     * good idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1496,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1499,col 29)",
        "(line 1501,col 9)-(line 1533,col 9)",
        "(line 1535,col 9)-(line 1535,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1550,
      "end_line": 1593,
      "comment": "\r\n     * Returns the maximum domain value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link DomainInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1554,col 29)",
        "(line 1556,col 9)-(line 1590,col 9)",
        "(line 1592,col 9)-(line 1592,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1607,
      "end_line": 1648,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1611,col 9)",
        "(line 1613,col 9)-(line 1646,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1662,
      "end_line": 1710,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1664,col 9)-(line 1666,col 9)",
        "(line 1669,col 9)-(line 1708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1723,
      "end_line": 1766,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is easy\r\n     * if the dataset implements the {@link RangeInfo} interface (a good idea\r\n     * if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1725,col 9)-(line 1727,col 9)",
        "(line 1730,col 9)-(line 1764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1779,
      "end_line": 1826,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1786,col 9)-(line 1824,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1836,
      "end_line": 1838,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1837,col 9)-(line 1837,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)",
      "begin_line": 1849,
      "end_line": 1883,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value for the bars.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1851,col 9)-(line 1853,col 9)",
        "(line 1854,col 9)-(line 1854,col 28)",
        "(line 1855,col 9)-(line 1855,col 50)",
        "(line 1856,col 9)-(line 1856,col 50)",
        "(line 1857,col 9)-(line 1857,col 53)",
        "(line 1858,col 9)-(line 1877,col 9)",
        "(line 1878,col 9)-(line 1880,col 9)",
        "(line 1881,col 9)-(line 1881,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)",
      "begin_line": 1895,
      "end_line": 1948,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param map  a structure that maps series to groups.\r\n     *\r\n     * @return The value range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *         values).\r\n     ",
      "child_ranges": [
        "(line 1897,col 9)-(line 1899,col 9)",
        "(line 1900,col 9)-(line 1900,col 37)",
        "(line 1901,col 9)-(line 1901,col 28)",
        "(line 1904,col 9)-(line 1904,col 58)",
        "(line 1905,col 9)-(line 1908,col 9)",
        "(line 1911,col 9)-(line 1911,col 45)",
        "(line 1912,col 9)-(line 1912,col 50)",
        "(line 1913,col 9)-(line 1913,col 50)",
        "(line 1915,col 9)-(line 1915,col 53)",
        "(line 1916,col 9)-(line 1940,col 9)",
        "(line 1941,col 9)-(line 1946,col 9)",
        "(line 1947,col 9)-(line 1947,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1960,
      "end_line": 1988,
      "comment": "\r\n     * Returns the minimum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value.\r\n     *\r\n     * @see #findMaximumStackedRangeValue(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1961,col 9)-(line 1963,col 9)",
        "(line 1964,col 9)-(line 1964,col 29)",
        "(line 1965,col 9)-(line 1965,col 37)",
        "(line 1966,col 9)-(line 1966,col 29)",
        "(line 1967,col 9)-(line 1967,col 53)",
        "(line 1968,col 9)-(line 1983,col 9)",
        "(line 1984,col 9)-(line 1986,col 9)",
        "(line 1987,col 9)-(line 1987,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2000,
      "end_line": 2027,
      "comment": "\r\n     * Returns the maximum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #findMinimumStackedRangeValue(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 2001,col 9)-(line 2003,col 9)",
        "(line 2004,col 9)-(line 2004,col 29)",
        "(line 2005,col 9)-(line 2005,col 37)",
        "(line 2006,col 9)-(line 2006,col 29)",
        "(line 2007,col 9)-(line 2007,col 53)",
        "(line 2008,col 9)-(line 2022,col 9)",
        "(line 2023,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2026,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 2037,
      "end_line": 2039,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range ([0.0, 0.0] if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 2038,col 9)-(line 2038,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)",
      "begin_line": 2050,
      "end_line": 2085,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked, using the specified base value.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 2052,col 9)-(line 2054,col 9)",
        "(line 2055,col 9)-(line 2055,col 30)",
        "(line 2056,col 9)-(line 2056,col 30)",
        "(line 2057,col 9)-(line 2078,col 9)",
        "(line 2079,col 9)-(line 2084,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)",
      "begin_line": 2098,
      "end_line": 2108,
      "comment": "\r\n     * Calculates the total for the y-values in all series for a given item\r\n     * index.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The total.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 2099,col 9)-(line 2099,col 27)",
        "(line 2100,col 9)-(line 2100,col 51)",
        "(line 2101,col 9)-(line 2106,col 9)",
        "(line 2107,col 9)-(line 2107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2120,
      "end_line": 2150,
      "comment": "\r\n     * Calculates the range of values for a dataset where each item is the\r\n     * running total of the items for the current series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range.\r\n     *\r\n     * @see #findRangeBounds(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 2121,col 9)-(line 2123,col 9)",
        "(line 2124,col 9)-(line 2124,col 36)",
        "(line 2126,col 9)-(line 2126,col 29)",
        "(line 2127,col 9)-(line 2127,col 29)",
        "(line 2128,col 9)-(line 2143,col 9)",
        "(line 2144,col 9)-(line 2149,col 9)"
      ]
    }
  ]
}