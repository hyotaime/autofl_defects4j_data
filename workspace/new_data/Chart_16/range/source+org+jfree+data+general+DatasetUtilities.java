{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/DatasetUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 133,
      "end_line": 1546,
      "comment": "\r\n * A collection of useful static methods relating to datasets.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetUtilities.DatasetUtilities()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Private constructor for non-instanceability.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.data.general.PieDataset)",
      "begin_line": 151,
      "end_line": 172,
      "comment": "\r\n     * Calculates the total of all the values in a {@link PieDataset}.  If \r\n     * the dataset contains negative or \u003ccode\u003enull\u003c/code\u003e values, they are \r\n     * ignored. \r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 156,col 30)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 158,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 183,
      "end_line": 187,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 46)",
        "(line 186,col 9)-(line 186,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 198,
      "end_line": 207,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 221,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 233,
      "end_line": 242,
      "comment": "\r\n     * Creates a pie dataset from a {@link CategoryDataset} by taking all the \r\n     * values for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 59)",
        "(line 236,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double)",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item with the\r\n     * key \"Other\".\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  a new key for the aggregated items (\u003ccode\u003enull\u003c/code\u003e not\r\n     *             permitted).\r\n     * @param minimumPercent  the percent threshold.\r\n     * \r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.general.PieDataset, java.lang.Comparable, double, int)",
      "begin_line": 281,
      "end_line": 327,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified \r\n     * by aggregating all the low value items (those whose value is lower \r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item.  The \r\n     * aggregated items are assigned the specified key.  Aggregation only \r\n     * occurs if there are at least \u003ccode\u003eminItems\u003c/code\u003e items to aggregate.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key to represent the aggregated items.\r\n     * @param minimumPercent  the percent threshold (ten percent is 0.10).\r\n     * @param minItems  only aggregate low values if there are at least this \r\n     *                  many.\r\n     * \r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 59)",
        "(line 287,col 9)-(line 287,col 73)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 291,col 9)-(line 291,col 46)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 302,col 9)",
        "(line 305,col 9)-(line 305,col 35)",
        "(line 306,col 9)-(line 306,col 30)",
        "(line 307,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, double[][])",
      "begin_line": 343,
      "end_line": 357,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in an\r\n     * array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the \r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the \r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 69)",
        "(line 348,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, java.lang.Number[][])",
      "begin_line": 372,
      "end_line": 386,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in \r\n     * an array.\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the \r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 69)",
        "(line 377,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], double[][])",
      "begin_line": 401,
      "end_line": 448,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in \r\n     * an array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the \r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are taken from the supplied arrays.\r\n     *\r\n     * @param rowKeys  the row keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKeys  the column keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 28)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 435,col 9)",
        "(line 438,col 9)-(line 438,col 69)",
        "(line 439,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)",
      "begin_line": 459,
      "end_line": 474,
      "comment": "\r\n     * Creates a {@link CategoryDataset} by copying the data from the supplied \r\n     * {@link KeyedValues} instance.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowData  the row data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 69)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 489,
      "end_line": 517,
      "comment": "\r\n     * Creates an {@link XYDataset} by sampling the specified function over a \r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 508,col 50)",
        "(line 509,col 9)-(line 509,col 46)",
        "(line 510,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 71)",
        "(line 515,col 9)-(line 515,col 26)"
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
      "begin_line": 653,
      "end_line": 655,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values. \r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 668,
      "end_line": 707,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values. \r\n     *  \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an IntervalXYDataset,\r\n     *                         whether the x-interval or just the x-value is \r\n     *                         used to determine the overall range.\r\n     *   \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 50)",
        "(line 674,col 9)-(line 674,col 50)",
        "(line 675,col 9)-(line 675,col 51)",
        "(line 676,col 9)-(line 676,col 22)",
        "(line 677,col 9)-(line 677,col 22)",
        "(line 678,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 729,
      "end_line": 743,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 28)",
        "(line 735,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 768,
      "end_line": 782,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 28)",
        "(line 774,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 794,
      "end_line": 830,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 50)",
        "(line 797,col 9)-(line 797,col 50)",
        "(line 798,col 9)-(line 799,col 73)",
        "(line 800,col 9)-(line 800,col 45)",
        "(line 801,col 9)-(line 801,col 51)",
        "(line 802,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 840,
      "end_line": 878,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 50)",
        "(line 842,col 9)-(line 842,col 50)",
        "(line 843,col 9)-(line 843,col 51)",
        "(line 844,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 877,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 893,
      "end_line": 934,
      "comment": "\r\n     * Finds the minimum domain (or X) value for the specified dataset.  This \r\n     * is easy if the dataset implements the {@link DomainInfo} interface (a \r\n     * good idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 897,col 29)",
        "(line 899,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 948,
      "end_line": 991,
      "comment": "\r\n     * Returns the maximum domain value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link DomainInfo} interface (a good \r\n     * idea if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 29)",
        "(line 954,col 9)-(line 988,col 9)",
        "(line 990,col 9)-(line 990,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1005,
      "end_line": 1048,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1013,col 9)-(line 1046,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1062,
      "end_line": 1110,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1069,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1123,
      "end_line": 1166,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is easy\r\n     * if the dataset implements the {@link RangeInfo} interface (a good idea \r\n     * if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1127,col 9)",
        "(line 1130,col 9)-(line 1164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1179,
      "end_line": 1226,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is \r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good \r\n     * idea if there is an efficient way to determine the maximum value).  \r\n     * Otherwise, it involves iterating over the entire data-set.  Returns \r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1186,col 9)-(line 1224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1236,
      "end_line": 1238,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)",
      "begin_line": 1249,
      "end_line": 1283,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value for the bars.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 28)",
        "(line 1255,col 9)-(line 1255,col 50)",
        "(line 1256,col 9)-(line 1256,col 50)",
        "(line 1257,col 9)-(line 1257,col 53)",
        "(line 1258,col 9)-(line 1277,col 9)",
        "(line 1278,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1281,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)",
      "begin_line": 1295,
      "end_line": 1347,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range \r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param map  a structure that maps series to groups.\r\n     *\r\n     * @return The value range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no \r\n     *         values).\r\n     ",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 28)",
        "(line 1299,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1357,
      "end_line": 1384,
      "comment": "\r\n     * Returns the minimum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1359,col 29)",
        "(line 1360,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1382,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1394,
      "end_line": 1420,
      "comment": "\r\n     * Returns the maximum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 29)",
        "(line 1398,col 9)-(line 1416,col 9)",
        "(line 1418,col 9)-(line 1418,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range ([0.0, 0.0] if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)",
      "begin_line": 1443,
      "end_line": 1478,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked, using the specified base value.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1447,col 9)",
        "(line 1448,col 9)-(line 1448,col 30)",
        "(line 1449,col 9)-(line 1449,col 30)",
        "(line 1450,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)",
      "begin_line": 1491,
      "end_line": 1501,
      "comment": "\r\n     * Calculates the total for the y-values in all series for a given item\r\n     * index.\r\n     * \r\n     * @param dataset  the dataset.\r\n     * @param item  the item index.\r\n     * \r\n     * @return The total.\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1492,col 27)",
        "(line 1493,col 9)-(line 1493,col 51)",
        "(line 1494,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1500,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1513,
      "end_line": 1544,
      "comment": "\r\n     * Calculates the range of values for a dataset where each item is the \r\n     * running total of the items for the current series.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The range.\r\n     * \r\n     * @see #findRangeBounds(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1517,col 9)",
        "(line 1519,col 9)-(line 1519,col 36)",
        "(line 1521,col 9)-(line 1521,col 29)",
        "(line 1522,col 9)-(line 1522,col 29)",
        "(line 1523,col 9)-(line 1536,col 9)",
        "(line 1537,col 9)-(line 1542,col 9)"
      ]
    }
  ]
}