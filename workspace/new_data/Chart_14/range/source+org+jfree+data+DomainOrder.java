{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/DomainOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DomainOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 138,
      "comment": "\r\n * Used to indicate sorting order if any (ascending, descending or none).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " No order. "
    },
    {
      "type": "field",
      "varNames": [
        "ASCENDING"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Ascending order. "
    },
    {
      "type": "field",
      "varNames": [
        "DESCENDING"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " Descending order. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DomainOrder.DomainOrder(java.lang.String)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DomainOrder.toString()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DomainOrder.equals(java.lang.Object)",
      "begin_line": 94,
      "end_line": 107,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DomainOrder.hashCode()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DomainOrder.readResolve()",
      "begin_line": 125,
      "end_line": 136,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    }
  ]
}