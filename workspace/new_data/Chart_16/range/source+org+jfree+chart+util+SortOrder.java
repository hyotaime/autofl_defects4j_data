{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/SortOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SortOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 137,
      "comment": "\n * Defines tokens used to indicate sorting order (ascending or descending).\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "ASCENDING"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Ascending order. "
    },
    {
      "type": "field",
      "varNames": [
        "DESCENDING"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " Descending order. "
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
      "signature": "org.jfree.chart.util.SortOrder.SortOrder(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SortOrder.toString()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SortOrder.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SortOrder.hashCode()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.SortOrder.readResolve()",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    }
  ]
}