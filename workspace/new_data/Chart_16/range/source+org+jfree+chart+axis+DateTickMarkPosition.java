{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/DateTickMarkPosition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTickMarkPosition",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 133,
      "comment": "\r\n * Used to indicate the required position of tick marks on a date axis relative\r\n * to the underlying time period.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "START"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": " Start of period. "
    },
    {
      "type": "field",
      "varNames": [
        "MIDDLE"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": " Middle of period. "
    },
    {
      "type": "field",
      "varNames": [
        "END"
      ],
      "begin_line": 64,
      "end_line": 65,
      "comment": " End of period. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickMarkPosition.DateTickMarkPosition(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickMarkPosition.toString()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickMarkPosition.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 110,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickMarkPosition.readResolve()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 20)"
      ]
    }
  ]
}