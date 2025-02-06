{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/RangeType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RangeType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 139,
      "comment": "\r\n * Used to indicate the type of range to display on an axis (full, positive or\r\n * negative).\r\n "
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
        "FULL"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Full range (positive and negative). "
    },
    {
      "type": "field",
      "varNames": [
        "POSITIVE"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Positive range. "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " Negative range. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.RangeType.RangeType(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.RangeType.toString()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.RangeType.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 108,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.RangeType.hashCode()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.RangeType.readResolve()",
      "begin_line": 126,
      "end_line": 137,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    }
  ]
}