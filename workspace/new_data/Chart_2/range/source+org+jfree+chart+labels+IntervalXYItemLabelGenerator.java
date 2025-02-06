{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/IntervalXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 268,
      "comment": "\r\n * An item label generator for datasets that implement the\r\n * {@link IntervalXYDataset} interface.\r\n *\r\n * @since 1.0.10\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_LABEL_FORMAT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The default item label format. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.IntervalXYItemLabelGenerator()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.IntervalXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.IntervalXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\r\n     * Creates an item label generator using the specified formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.IntervalXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\r\n     * Creates an item label generator using the specified formatters (a\r\n     * number formatter for the x-values and a date formatter for the\r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.IntervalXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\r\n     * Creates a label generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 151,
      "end_line": 225,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return An array of seven items from the dataset formatted as\r\n     *         \u003ccode\u003eString\u003c/code\u003e objects (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 159,col 60)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 162,col 22)",
        "(line 163,col 9)-(line 163,col 22)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 165,col 9)-(line 165,col 22)",
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 42)",
        "(line 175,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Generates the item label text for an item in a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The label text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.clone()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 258,
      "end_line": 266,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 33)"
      ]
    }
  ]
}