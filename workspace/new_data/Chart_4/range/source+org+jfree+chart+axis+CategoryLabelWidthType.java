{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/CategoryLabelWidthType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLabelWidthType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 129,
      "comment": "\r\n * Represents the width types for a category label.\r\n "
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
        "CATEGORY"
      ],
      "begin_line": 55,
      "end_line": 58,
      "comment": " Percentage of category. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Percentage of range. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelWidthType.CategoryLabelWidthType(java.lang.String)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelWidthType.toString()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string (never \u003c/code\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelWidthType.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 110,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 64)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelWidthType.readResolve()",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 20)"
      ]
    }
  ]
}