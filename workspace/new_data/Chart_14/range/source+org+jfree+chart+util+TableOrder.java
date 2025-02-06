{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/TableOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TableOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 130,
      "comment": "\n * Used to indicate the processing order for a table (by row or by column).\n "
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
        "BY_ROW"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " By row. "
    },
    {
      "type": "field",
      "varNames": [
        "BY_COLUMN"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " By column. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.TableOrder.TableOrder(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.TableOrder.toString()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.TableOrder.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 102,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.TableOrder.hashCode()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.TableOrder.readResolve()",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    }
  ]
}