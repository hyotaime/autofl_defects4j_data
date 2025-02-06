{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/DateTickUnitType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTickUnitType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 174,
      "comment": "\r\n * An enumeration of the unit types for a {@link DateTickUnit} instance.\r\n *\r\n * @since 1.0.13\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "YEAR"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " Year. "
    },
    {
      "type": "field",
      "varNames": [
        "MONTH"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Month. "
    },
    {
      "type": "field",
      "varNames": [
        "DAY"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " Day. "
    },
    {
      "type": "field",
      "varNames": [
        "HOUR"
      ],
      "begin_line": 68,
      "end_line": 70,
      "comment": " Hour. "
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " Minute. "
    },
    {
      "type": "field",
      "varNames": [
        "SECOND"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": " Second. "
    },
    {
      "type": "field",
      "varNames": [
        "MILLISECOND"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": " Millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The name. "
    },
    {
      "type": "field",
      "varNames": [
        "calendarField"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The corresponding field value in Java\u0027s Calendar class. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateTickUnitType.DateTickUnitType(java.lang.String, int)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     * @param calendarField  the calendar field.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 25)",
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnitType.getCalendarField()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the calendar field.\r\n     *\r\n     * @return The calendar field.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnitType.toString()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnitType.equals(java.lang.Object)",
      "begin_line": 128,
      "end_line": 140,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateTickUnitType.readResolve()",
      "begin_line": 149,
      "end_line": 172,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    }
  ]
}