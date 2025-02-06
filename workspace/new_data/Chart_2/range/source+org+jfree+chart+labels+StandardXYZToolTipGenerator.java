{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/StandardXYZToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYZToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.StandardXYToolTipGenerator",
        "org.jfree.chart.labels.XYZToolTipGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 260,
      "comment": "\r\n * A standard item label generator for use with {@link XYZDataset} data.  Each\r\n * value can be formatted as a number or as a date.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The default tooltip format. "
    },
    {
      "type": "field",
      "varNames": [
        "zFormat"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * A number formatter for the z value - if this is null, then zDateFormat\r\n     * must be non-null.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zDateFormat"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * A date formatter for the z-value - if this is null, then zFormat must be\r\n     * non-null.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.StandardXYZToolTipGenerator()",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\r\n     * Creates a new tool tip generator using default number formatters for the\r\n     * x, y and z-values.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 89,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.StandardXYZToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 104,
      "end_line": 113,
      "comment": "\r\n     * Constructs a new tool tip generator using the specified number\r\n     * formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.StandardXYZToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\r\n     * Constructs a new tool tip generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the format string.\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param zFormat  the format object for the z values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 46)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.getZFormat()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the number formatter for the z-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.getZDateFormat()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the date formatter for the z-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.generateToolTip(org.jfree.data.xy.XYZDataset, int, int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Generates a tool tip text item for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The tooltip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.generateLabelString(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\r\n     * Generates a label string for an item in the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 77)",
        "(line 182,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.createItemArray(org.jfree.data.xy.XYZDataset, int, int)",
      "begin_line": 196,
      "end_line": 230,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 40)",
        "(line 200,col 9)-(line 200,col 60)",
        "(line 202,col 9)-(line 202,col 46)",
        "(line 203,col 9)-(line 203,col 41)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 41)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYZToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 239,
      "end_line": 258,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 77)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 20)"
      ]
    }
  ]
}