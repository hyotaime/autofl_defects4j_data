{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/HexNumberFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HexNumberFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.NumberFormat"
      ],
      "begin_line": 51,
      "end_line": 157,
      "comment": "\r\n * A custom number formatter that formats numbers as hexadecimal strings.\r\n * There are some limitations, so be careful using this class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Number of hexadecimal digits for a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of hexadecimal digits for a word. "
    },
    {
      "type": "field",
      "varNames": [
        "DWORD"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Number of hexadecimal digits for a double word. "
    },
    {
      "type": "field",
      "varNames": [
        "QWORD"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Number of hexadecimal digits for a quad word. "
    },
    {
      "type": "field",
      "varNames": [
        "m_numDigits"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The number of digits (shorter strings will be left padded). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.HexNumberFormat.HexNumberFormat()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Creates a new instance with 8 digits.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.HexNumberFormat.HexNumberFormat(int)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\r\n     * Creates a new instance with the specified number of digits.\r\n\r\n     * @param digits  the digits.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 16)",
        "(line 82,col 9)-(line 82,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.getNumberOfDigits()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Returns the number of digits.\r\n     * \r\n     * @return The number of digits.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.setNumberOfDigits(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Sets the number of digits.\r\n     * \r\n     * @param digits  the number of digits.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.format(double, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\r\n     * Formats the specified number as a hexadecimal string.  The decimal \r\n     * fraction is ignored.\r\n     * \r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the buffer to append to (ignored here).\r\n     * @param pos  the field position (ignored here).\r\n     * \r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.format(long, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 128,
      "end_line": 142,
      "comment": "\r\n     * Formats the specified number as a hexadecimal string.  The decimal \r\n     * fraction is ignored.\r\n     * \r\n     * @param number  the number to format.\r\n     * @param toAppendTo  the buffer to append to (ignored here).\r\n     * @param pos  the field position (ignored here).\r\n     * \r\n     * @return The string buffer.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 62)",
        "(line 132,col 9)-(line 132,col 54)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 141,col 9)-(line 141,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HexNumberFormat.parse(java.lang.String, java.text.ParsePosition)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Parsing is not implemented, so this method always returns \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param source  ignored.\r\n     * @param parsePosition  ignored.\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 20)"
      ]
    }
  ]
}