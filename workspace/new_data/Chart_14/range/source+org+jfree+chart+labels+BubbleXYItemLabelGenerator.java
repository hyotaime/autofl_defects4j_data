{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/BubbleXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BubbleXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 260,
      "comment": "\r\n * An item label generator defined for use with the {@link XYBubbleRenderer}\r\n * class, or any other class that uses an {@link XYZDataset}.\r\n * \r\n * @since 1.0.1\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT_STRING"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "zFormat"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " \r\n     * A number formatter for the z value - if this is \u003ccode\u003enull\u003c/code\u003e, then \r\n     * zDateFormat must be non-null. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zDateFormat"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " \r\n     * A date formatter for the z-value - if this is null, then zFormat must be \r\n     * non-null. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\r\n     * Creates a new tool tip generator using default number formatters for the\r\n     * x, y and z-values.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\r\n     * Constructs a new tool tip generator using the specified number \r\n     * formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\r\n     * Constructs a new item label generator using the specified date \r\n     * formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.getZFormat()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns the number formatter for the z-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.getZDateFormat()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\r\n     * Returns the date formatter for the z-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Generates an item label for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The item label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.generateLabelString(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 174,
      "end_line": 185,
      "comment": "\r\n     * Generates a label string for an item in the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 29)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 64)",
        "(line 184,col 9)-(line 184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.createItemArray(org.jfree.data.xy.XYZDataset, int, int)",
      "begin_line": 197,
      "end_line": 231,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 40)",
        "(line 201,col 9)-(line 201,col 60)",
        "(line 203,col 9)-(line 203,col 46)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 213,col 9)-(line 213,col 41)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 46)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 240,
      "end_line": 258,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 75)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 20)"
      ]
    }
  ]
}