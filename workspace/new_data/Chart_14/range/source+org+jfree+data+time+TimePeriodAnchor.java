{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/TimePeriodAnchor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimePeriodAnchor",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 143,
      "comment": "\r\n * Used to indicate one of three positions in a time period: \r\n * \u003ccode\u003eSTART\u003c/code\u003e, \u003ccode\u003eMIDDLE\u003c/code\u003e and \u003ccode\u003eEND\u003c/code\u003e.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "START"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Start of period. "
    },
    {
      "type": "field",
      "varNames": [
        "MIDDLE"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Middle of period. "
    },
    {
      "type": "field",
      "varNames": [
        "END"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " End of period. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimePeriodAnchor.TimePeriodAnchor(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodAnchor.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodAnchor.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 112,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 59)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodAnchor.hashCode()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimePeriodAnchor.readResolve()",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 20)"
      ]
    }
  ]
}