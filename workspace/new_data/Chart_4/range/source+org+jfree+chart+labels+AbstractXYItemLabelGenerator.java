{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/labels/AbstractXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 379,
      "comment": "\r\n * A base class for creating item label generators.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "formatString"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The item label format string. "
    },
    {
      "type": "field",
      "varNames": [
        "xFormat"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A number formatter for the x value. "
    },
    {
      "type": "field",
      "varNames": [
        "xDateFormat"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A date formatter for the x value. "
    },
    {
      "type": "field",
      "varNames": [
        "yFormat"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " A formatter for the y value. "
    },
    {
      "type": "field",
      "varNames": [
        "yDateFormat"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " A date formatter for the y value. "
    },
    {
      "type": "field",
      "varNames": [
        "nullYString"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The string used to represent \u0027null\u0027 for the y-value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 111,
      "end_line": 128,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 31)",
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 64)",
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\r\n     * Creates an item label generator using the specified formatters (a\r\n     * number formatter for the x-values and a date formatter for the\r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 185,col 44)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 187,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getFormatString()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the format string (this controls the overall structure of the\r\n     * label).\r\n     *\r\n     * @return The format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getXFormat()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the number formatter for the x-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getXDateFormat()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the date formatter for the x-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getYFormat()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the number formatter for the y-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getYDateFormat()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n     * Returns the date formatter for the y-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.generateLabelString(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\r\n     * Generates a label string for an item in the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 29)",
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 249,col 64)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getNullYString()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the string representing a null value.\r\n     *\r\n     * @return The string representing a null value.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 275,
      "end_line": 301,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return An array of three items from the dataset formatted as\r\n     *         \u003ccode\u003eString\u003c/code\u003e objects (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 60)",
        "(line 280,col 9)-(line 280,col 51)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 310,
      "end_line": 337,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 79)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.hashCode()",
      "begin_line": 344,
      "end_line": 352,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 347,col 62)",
        "(line 348,col 9)-(line 348,col 66)",
        "(line 349,col 9)-(line 349,col 62)",
        "(line 350,col 9)-(line 350,col 66)",
        "(line 351,col 9)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.clone()",
      "begin_line": 361,
      "end_line": 377,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 363,col 63)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 21)"
      ]
    }
  ]
}