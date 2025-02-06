{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/LengthAdjustmentType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LengthAdjustmentType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 140,
      "comment": "\n * Represents the three options for adjusting a length:  expand, contract, and\n * no change.\n "
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
        "NO_CHANGE"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " NO_CHANGE. "
    },
    {
      "type": "field",
      "varNames": [
        "EXPAND"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " EXPAND. "
    },
    {
      "type": "field",
      "varNames": [
        "CONTRACT"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " CONTRACT. "
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
      "signature": "org.jfree.chart.util.LengthAdjustmentType.LengthAdjustmentType(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LengthAdjustmentType.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LengthAdjustmentType.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 69)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LengthAdjustmentType.hashCode()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.LengthAdjustmentType.readResolve()",
      "begin_line": 127,
      "end_line": 138,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    }
  ]
}