{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/LogFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 58,
      "end_line": 263,
      "comment": "\n * A number formatter for logarithmic values.  This formatter does not support\n * parsing.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The log base value. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLog"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The natural logarithm of the base value. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLabel"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The label for the log base (for example, \"e\"). "
    },
    {
      "type": "field",
      "varNames": [
        "powerLabel"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The label for the power symbol.\n     *\n     * @since 1.0.10\n     "
    },
    {
      "type": "field",
      "varNames": [
        "showBase"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A flag that controls whether or not the base is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The number formatter for the exponent. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.LogFormat.LogFormat()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Creates a new instance using base 10.\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.LogFormat.LogFormat(double, java.lang.String, boolean)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param base  the base.\n     * @param baseLabel  the base label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param showBase  a flag that controls whether or not the base value is\n     *                  shown.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.LogFormat.LogFormat(double, java.lang.String, java.lang.String, boolean)",
      "begin_line": 114,
      "end_line": 127,
      "comment": "\n     * Creates a new instance.\n     *\n     * @param base  the base.\n     * @param baseLabel  the base label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param powerLabel  the power label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param showBase  a flag that controls whether or not the base value is\n     *                  shown.\n     *\n     * @since 1.0.10\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 25)",
        "(line 123,col 9)-(line 123,col 43)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 126,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.getExponentFormat()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns the number format used for the exponent.\n     *\n     * @return The number format (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @since 1.0.13.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.setExponentFormat(java.text.NumberFormat)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * Sets the number format used for the exponent.\n     *\n     * @param format  the formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @since 1.0.13\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.calculateLog(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Calculates the log of a given value.\n     *\n     * @param value  the value.\n     *\n     * @return The log of the value.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * Returns a formatted representation of the specified number.\n     *\n     * @param number  the number.\n     * @param toAppendTo  the string buffer to append to.\n     * @param pos  the position.\n     *\n     * @return A string buffer containing the formatted value.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 49)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 67)",
        "(line 182,col 9)-(line 182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 195,
      "end_line": 204,
      "comment": "\n     * Formats the specified number as a hexadecimal string.  The decimal\n     * fraction is ignored.\n     *\n     * @param number  the number to format.\n     * @param toAppendTo  the buffer to append to (ignored here).\n     * @param pos  the field position (ignored here).\n     *\n     * @return The string buffer.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 67)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Parsing is not implemented, so this method always returns\n     * \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param source  ignored.\n     * @param parsePosition  ignored.\n     *\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.equals(java.lang.Object)",
      "begin_line": 226,
      "end_line": 250,
      "comment": "\n     * Tests this formatter for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 41)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.clone()",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 52)",
        "(line 259,col 9)-(line 259,col 64)",
        "(line 260,col 9)-(line 260,col 21)"
      ]
    }
  ]
}