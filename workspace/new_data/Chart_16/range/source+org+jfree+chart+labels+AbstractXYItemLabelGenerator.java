{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/AbstractXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 354,
      "comment": "\r\n * A base class for creating item label generators.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "formatString"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The item label format string. "
    },
    {
      "type": "field",
      "varNames": [
        "xFormat"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A number formatter for the x value. "
    },
    {
      "type": "field",
      "varNames": [
        "xDateFormat"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A date formatter for the x value. "
    },
    {
      "type": "field",
      "varNames": [
        "yFormat"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A formatter for the y value. "
    },
    {
      "type": "field",
      "varNames": [
        "yDateFormat"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " A date formatter for the y value. "
    },
    {
      "type": "field",
      "varNames": [
        "nullXString"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The string used to represent \u0027null\u0027 for the x-value. "
    },
    {
      "type": "field",
      "varNames": [
        "nullYString"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The string used to represent \u0027null\u0027 for the y-value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 110,
      "end_line": 127,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 31)",
        "(line 125,col 9)-(line 125,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 64)",
        "(line 144,col 9)-(line 144,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\r\n     * Creates an item label generator using the specified formatters (a \r\n     * number formatter for the x-values and a date formatter for the \r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     *                 \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 64)",
        "(line 166,col 9)-(line 166,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.AbstractXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 184,col 44)",
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 186,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getFormatString()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the format string (this controls the overall structure of the \r\n     * label).\r\n     * \r\n     * @return The format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getXFormat()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the number formatter for the x-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getXDateFormat()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the date formatter for the x-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getYFormat()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Returns the number formatter for the y-values.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.getYDateFormat()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the date formatter for the y-values.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.generateLabelString(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\r\n     * Generates a label string for an item in the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 64)",
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 263,
      "end_line": 294,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return An array of three items from the dataset formatted as\r\n     *         \u003ccode\u003eString\u003c/code\u003e objects (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 40)",
        "(line 266,col 9)-(line 266,col 60)",
        "(line 268,col 9)-(line 268,col 51)",
        "(line 269,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 51)",
        "(line 282,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 303,
      "end_line": 327,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 79)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractXYItemLabelGenerator.clone()",
      "begin_line": 336,
      "end_line": 352,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 338,col 63)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 21)"
      ]
    }
  ]
}