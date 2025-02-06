{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/LegendRenderingOrder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendRenderingOrder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 122,
      "comment": "\r\n * Represents the order for rendering legend items.\r\n "
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
        "STANDARD"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " In order. "
    },
    {
      "type": "field",
      "varNames": [
        "REVERSE"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " In reverse order. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.LegendRenderingOrder.LegendRenderingOrder(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendRenderingOrder.toString()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendRenderingOrder.equals(java.lang.Object)",
      "begin_line": 91,
      "end_line": 103,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 64)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.LegendRenderingOrder.readResolve()",
      "begin_line": 112,
      "end_line": 120,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 20)"
      ]
    }
  ]
}