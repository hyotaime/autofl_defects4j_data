{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/labels/BubbleXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BubbleXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 277,
      "comment": "\r\n * An item label generator defined for use with the {@link XYBubbleRenderer}\r\n * class, or any other class that uses an {@link XYZDataset}.\r\n *\r\n * @since 1.0.1\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT_STRING"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "zFormat"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * A number formatter for the z value - if this is \u003ccode\u003enull\u003c/code\u003e, then\r\n     * zDateFormat must be non-null.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zDateFormat"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * A date formatter for the z-value - if this is null, then zFormat must be\r\n     * non-null.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator()",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\r\n     * Creates a new tool tip generator using default number formatters for the\r\n     * x, y and z-values.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\r\n     * Constructs a new tool tip generator using the specified number\r\n     * formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 46)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.BubbleXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 130,
      "end_line": 137,
      "comment": "\r\n     * Constructs a new item label generator using the specified date\r\n     * formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 46)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.getZFormat()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the number formatter for the z-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.getZDateFormat()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the date formatter for the z-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Generates an item label for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The item label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.generateLabelString(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 179,
      "end_line": 190,
      "comment": "\r\n     * Generates a label string for an item in the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 30)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 64)",
        "(line 189,col 9)-(line 189,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.createItemArray(org.jfree.data.xy.XYZDataset, int, int)",
      "begin_line": 202,
      "end_line": 236,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 40)",
        "(line 206,col 9)-(line 206,col 60)",
        "(line 208,col 9)-(line 208,col 46)",
        "(line 209,col 9)-(line 209,col 41)",
        "(line 210,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 46)",
        "(line 218,col 9)-(line 218,col 41)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 46)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 263,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 75)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BubbleXYItemLabelGenerator.hashCode()",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 33)",
        "(line 272,col 9)-(line 272,col 52)",
        "(line 273,col 9)-(line 273,col 56)",
        "(line 274,col 9)-(line 274,col 17)"
      ]
    }
  ]
}