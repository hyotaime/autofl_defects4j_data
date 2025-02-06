{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/general/DatasetUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 137,
      "end_line": 1583,
      "comment": "\r\n * A collection of useful static methods relating to datasets.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetUtilities.DatasetUtilities()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Private constructor for non-instanceability.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.data.general.PieDataset)",
      "begin_line": 155,
      "end_line": 176,
      "comment": "\r\n     * Calculates the total of all the values in a {@link PieDataset}.  If \r\n     * the dataset contains negative or \u003ccode\u003enull\u003c/code\u003e values, they are \r\n     * ignored. \r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 38)",
        "(line 160,col 9)-(line 160,col 30)",
        "(line 161,col 9)-(line 161,col 44)",
        "(line 162,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 59)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 222,
      "end_line": 226,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 55)",
        "(line 225,col 9)-(line 225,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 237,
      "end_line": 246,
      "comment": "\r\n     * Creates a pie dataset from a {@link CategoryDataset} by taking all the \r\n     * values for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 59)",
        "(line 240,col 9)-(line 240,col 45)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double)",
      "begin_line": 261,
      "end_line": 268,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item with the\r\n     * key \"Other\".\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  a new key for the aggregated items (\u003ccode\u003enull\u003c/code\u003e not\r\n     *             permitted).\r\n     * @param minimumPercent  the percent threshold.\r\n     * \r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double, int)",
      "begin_line": 285,
      "end_line": 331,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified \r\n     * by aggregating all the low value items (those whose value is lower \r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item.  The \r\n     * aggregated items are assigned the specified key.  Aggregation only \r\n     * occurs if there are at least \u003ccode\u003eminItems\u003c/code\u003e items to aggregate.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key to represent the aggregated items.\r\n     * @param minimumPercent  the percent threshold (ten percent is 0.10).\r\n     * @param minItems  only aggregate low values if there are at least this \r\n     *                  many.\r\n     * \r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 59)",
        "(line 291,col 9)-(line 291,col 73)",
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 295,col 46)",
        "(line 296,col 9)-(line 296,col 44)",
        "(line 297,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 309,col 35)",
        "(line 310,col 9)-(line 310,col 30)",
        "(line 311,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, double[][])",
      "begin_line": 347,
      "end_line": 361,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in an\r\n     * array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the \r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the \r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 69)",
        "(line 352,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, java.lang.Number[][])",
      "begin_line": 376,
      "end_line": 390,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in \r\n     * an array.\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the \r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 69)",
        "(line 381,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], double[][])",
      "begin_line": 405,
      "end_line": 452,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in \r\n     * an array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the \r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are taken from the supplied arrays.\r\n     *\r\n     * @param rowKeys  the row keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKeys  the column keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 28)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 439,col 9)",
        "(line 442,col 9)-(line 442,col 69)",
        "(line 443,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)",
      "begin_line": 463,
      "end_line": 478,
      "comment": "\r\n     * Creates a {@link CategoryDataset} by copying the data from the supplied \r\n     * {@link KeyedValues} instance.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowData  the row data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 69)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 493,
      "end_line": 517,
      "comment": "\r\n     * Creates an {@link XYDataset} by sampling the specified function over a \r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 509,col 50)",
        "(line 510,col 9)-(line 510,col 52)",
        "(line 511,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 71)",
        "(line 516,col 9)-(line 516,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.general.PieDataset)",
      "begin_line": 527,
      "end_line": 550,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 531,col 9)",
        "(line 533,col 9)-(line 533,col 47)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.category.CategoryDataset)",
      "begin_line": 560,
      "end_line": 583,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 45)",
        "(line 567,col 9)-(line 567,col 51)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 579,col 9)",
        "(line 581,col 9)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.xy.XYDataset)",
      "begin_line": 593,
      "end_line": 602,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 625,
      "end_line": 643,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  determines whether or not the x-interval is taken\r\n     *                         into account (only applies if the dataset is an\r\n     *                         {@link IntervalXYDataset}).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 632,col 28)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.  If the dataset is an instance of \r\n     * {@link IntervalXYDataset}, the starting and ending x-values \r\n     * will be used for the bounds calculation.\r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 670,
      "end_line": 709,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values. \r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an \r\n     *          {@link IntervalXYDataset}, whether the x-interval or just the \r\n     *          x-value is used to determine the overall range.\r\n     *   \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 50)",
        "(line 676,col 9)-(line 676,col 50)",
        "(line 677,col 9)-(line 677,col 51)",
        "(line 678,col 9)-(line 678,col 22)",
        "(line 679,col 9)-(line 679,col 22)",
        "(line 680,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 731,
      "end_line": 745,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 28)",
        "(line 737,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 769,
      "end_line": 783,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 28)",
        "(line 775,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 811,
      "end_line": 847,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 50)",
        "(line 814,col 9)-(line 814,col 50)",
        "(line 815,col 9)-(line 816,col 73)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 51)",
        "(line 819,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 876,
      "end_line": 915,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an \r\n     *          {@link IntervalXYDataset}, whether the y-interval or just the \r\n     *          y-value is used to determine the overall range.\r\n     *          \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 50)",
        "(line 879,col 9)-(line 879,col 50)",
        "(line 880,col 9)-(line 880,col 51)",
        "(line 881,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 930,
      "end_line": 971,
      "comment": "\r\n     * Finds the minimum domain (or X) value for the specified dataset.  This \r\n     * is easy if the dataset implements the {@link DomainInfo} interface (a \r\n     * good idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 29)",
        "(line 936,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 970,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 985,
      "end_line": 1028,
      "comment": "\r\n     * Returns the maximum domain value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link DomainInfo} interface (a good \r\n     * idea if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 988,col 9)",
        "(line 989,col 9)-(line 989,col 29)",
        "(line 991,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1027,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1042,
      "end_line": 1085,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1050,col 9)-(line 1083,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1099,
      "end_line": 1147,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1106,col 9)-(line 1145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1160,
      "end_line": 1203,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is easy\r\n     * if the dataset implements the {@link RangeInfo} interface (a good idea \r\n     * if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1164,col 9)",
        "(line 1167,col 9)-(line 1201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1216,
      "end_line": 1263,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good \r\n     * idea if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1223,col 9)-(line 1261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)",
      "begin_line": 1286,
      "end_line": 1320,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value for the bars.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1290,col 9)",
        "(line 1291,col 9)-(line 1291,col 28)",
        "(line 1292,col 9)-(line 1292,col 50)",
        "(line 1293,col 9)-(line 1293,col 50)",
        "(line 1294,col 9)-(line 1294,col 53)",
        "(line 1295,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)",
      "begin_line": 1332,
      "end_line": 1384,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param map  a structure that maps series to groups.\r\n     *\r\n     * @return The value range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no \r\n     *         values).\r\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 28)",
        "(line 1336,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1382,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1394,
      "end_line": 1421,
      "comment": "\r\n     * Returns the minimum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 29)",
        "(line 1397,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1431,
      "end_line": 1457,
      "comment": "\r\n     * Returns the maximum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1433,col 9)-(line 1433,col 29)",
        "(line 1435,col 9)-(line 1453,col 9)",
        "(line 1455,col 9)-(line 1455,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 1467,
      "end_line": 1469,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range ([0.0, 0.0] if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1468,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)",
      "begin_line": 1480,
      "end_line": 1515,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked, using the specified base value.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1485,col 30)",
        "(line 1486,col 9)-(line 1486,col 30)",
        "(line 1487,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)",
      "begin_line": 1528,
      "end_line": 1538,
      "comment": "\r\n     * Calculates the total for the y-values in all series for a given item\r\n     * index.\r\n     * \r\n     * @param dataset  the dataset.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The total.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1529,col 9)-(line 1529,col 27)",
        "(line 1530,col 9)-(line 1530,col 51)",
        "(line 1531,col 9)-(line 1536,col 9)",
        "(line 1537,col 9)-(line 1537,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1550,
      "end_line": 1581,
      "comment": "\r\n     * Calculates the range of values for a dataset where each item is the \r\n     * running total of the items for the current series.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range.\r\n     * \r\n     * @see #findRangeBounds(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1554,col 9)",
        "(line 1556,col 9)-(line 1556,col 36)",
        "(line 1558,col 9)-(line 1558,col 29)",
        "(line 1559,col 9)-(line 1559,col 29)",
        "(line 1560,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1579,col 9)"
      ]
    }
  ]
}