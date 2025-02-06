{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/HorizontalAlignment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HorizontalAlignment",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 141,
      "comment": "\n * An enumeration of the horizontal alignment types (\u003ccode\u003eLEFT\u003c/code\u003e, \n * \u003ccode\u003eRIGHT\u003c/code\u003e and \u003ccode\u003eCENTER\u003c/code\u003e).\n "
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
        "LEFT"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Left alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Right alignment. "
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
      "signature": "org.jfree.chart.util.HorizontalAlignment.HorizontalAlignment(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HorizontalAlignment.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HorizontalAlignment.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 61)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HorizontalAlignment.hashCode()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.HorizontalAlignment.readResolve()",
      "begin_line": 127,
      "end_line": 139,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    }
  ]
}