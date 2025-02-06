{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/VerticalAlignment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerticalAlignment",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 143,
      "comment": "\n * An enumeration of the vertical alignment types (\u003ccode\u003eTOP\u003c/code\u003e, \n * \u003ccode\u003eBOTTOM\u003c/code\u003e and \u003ccode\u003eCENTER\u003c/code\u003e).\n "
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
        "TOP"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Top alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Bottom alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " Center alignment. "
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
      "signature": "org.jfree.chart.util.VerticalAlignment.VerticalAlignment(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.VerticalAlignment.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return the string.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.VerticalAlignment.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 110,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return a boolean.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 62)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.VerticalAlignment.hashCode()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.VerticalAlignment.readResolve()",
      "begin_line": 128,
      "end_line": 141,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 140,col 9)"
      ]
    }
  ]
}