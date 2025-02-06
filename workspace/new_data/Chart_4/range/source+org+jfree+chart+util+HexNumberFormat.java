{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/HexNumberFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HexNumberFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 53,
      "end_line": 159,
      "comment": "\r\n * A custom number formatter that formats numbers as hexadecimal strings.\r\n * There are some limitations, so be careful using this class.\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of hexadecimal digits for a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of hexadecimal digits for a word. "
    },
    {
      "type": "field",
      "varNames": [
        "DWORD"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Number of hexadecimal digits for a double word. "
    },
    {
      "type": "field",
      "varNames": [
        "QWORD"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of hexadecimal digits for a quad word. "
    },
    {
      "type": "field",
      "varNames": [
        "m_numDigits"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The number of digits (shorter strings will be left padded). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.HexNumberFormat.HexNumberFormat()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new instance with 8 digits.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.HexNumberFormat.HexNumberFormat(int)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\r\n     * Creates a new instance with the specified number of digits.\r\n\r\n     * @param digits  the digits.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 84,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.getNumberOfDigits()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the number of digits.\r\n     *\r\n     * @return The number of digits.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.setNumberOfDigits(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Sets the number of digits.\r\n     *\r\n     * @param digits  the number of digits.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\r\n     * Formats the specified number as a hexadecimal string.  The decimal\r\n     * fraction is ignored.\r\n     *\r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the buffer to append to (ignored here).\r\n     * @param pos  the field position (ignored here).\r\n     *\r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 130,
      "end_line": 144,
      "comment": "\r\n     * Formats the specified number as a hexadecimal string.  The decimal\r\n     * fraction is ignored.\r\n     *\r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the buffer to append to (ignored here).\r\n     * @param pos  the field position (ignored here).\r\n     *\r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 62)",
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 137,col 9)-(line 137,col 57)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 33)",
        "(line 143,col 9)-(line 143,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Parsing is not implemented, so this method always returns\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param source  ignored.\r\n     * @param parsePosition  ignored.\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 20)"
      ]
    }
  ]
}