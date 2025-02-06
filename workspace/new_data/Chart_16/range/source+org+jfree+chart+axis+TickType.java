{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/TickType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TickType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 121,
      "comment": "\n * Used to indicate the tick type (MAJOR or MINOR).\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAJOR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Major tick. "
    },
    {
      "type": "field",
      "varNames": [
        "MINOR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Minor tick. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.TickType.TickType(java.lang.String)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickType.toString()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickType.equals(java.lang.Object)",
      "begin_line": 88,
      "end_line": 101,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.TickType.readResolve()",
      "begin_line": 110,
      "end_line": 119,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)",
        "(line 112,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 22)"
      ]
    }
  ]
}