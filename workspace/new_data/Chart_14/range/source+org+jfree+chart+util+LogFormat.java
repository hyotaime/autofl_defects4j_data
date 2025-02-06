{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/LogFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 56,
      "end_line": 224,
      "comment": "\n * A number formatter for logarithmic values.  This formatter does not support\n * parsing.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The log base value. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLog"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The natural logarithm of the base value. "
    },
    {
      "type": "field",
      "varNames": [
        "baseLabel"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The label for the log base (for example, \"e\"). "
    },
    {
      "type": "field",
      "varNames": [
        "powerLabel"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " \n     * The label for the power symbol.\n     * \n     * @since 1.0.10\n     "
    },
    {
      "type": "field",
      "varNames": [
        "showBase"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A flag that controls whether or not the base is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The number formatter for the exponent. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.LogFormat.LogFormat(double, java.lang.String, boolean)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Creates a new instance.\n     * \n     * @param base  the base.\n     * @param baseLabel  the base label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param showBase  a flag that controls whether or not the base value is\n     *                  shown.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.LogFormat.LogFormat(double, java.lang.String, java.lang.String, boolean)",
      "begin_line": 103,
      "end_line": 116,
      "comment": "\n     * Creates a new instance.\n     * \n     * @param base  the base.\n     * @param baseLabel  the base label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param powerLabel  the power label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param showBase  a flag that controls whether or not the base value is\n     *                  shown.\n     *                  \n     * @since 1.0.10\n     ",
      "child_ranges": [
        "(line 105,col 6)-(line 107,col 6)",
        "(line 108,col 6)-(line 110,col 6)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.calculateLog(double)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Calculates the log of a given value.\n     * \n     * @param value  the value.\n     * \n     * @return The log of the value.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 138,
      "end_line": 147,
      "comment": "\n     * Returns a formatted representation of the specified number.\n     * \n     * @param number  the number.\n     * @param toAppendTo  the string buffer to append to.\n     * @param pos  the position.\n     * \n     * @return A string buffer containing the formatted value.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 67)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 159,
      "end_line": 168,
      "comment": "\n     * Formats the specified number as a hexadecimal string.  The decimal \n     * fraction is ignored.\n     * \n     * @param number  the number to format.\n     * @param toAppendTo  the buffer to append to (ignored here).\n     * @param pos  the field position (ignored here).\n     * \n     * @return The string buffer.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Parsing is not implemented, so this method always returns \n     * \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param source  ignored.\n     * @param parsePosition  ignored.\n     * \n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.equals(java.lang.Object)",
      "begin_line": 190,
      "end_line": 211,
      "comment": "\n     * Tests this formatter for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 191,col 6)-(line 193,col 6)",
        "(line 194,col 6)-(line 196,col 6)",
        "(line 197,col 6)-(line 197,col 38)",
        "(line 198,col 6)-(line 200,col 6)",
        "(line 201,col 6)-(line 203,col 6)",
        "(line 204,col 6)-(line 206,col 6)",
        "(line 207,col 6)-(line 209,col 6)",
        "(line 210,col 6)-(line 210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LogFormat.clone()",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 52)",
        "(line 220,col 9)-(line 220,col 64)",
        "(line 221,col 9)-(line 221,col 21)"
      ]
    }
  ]
}