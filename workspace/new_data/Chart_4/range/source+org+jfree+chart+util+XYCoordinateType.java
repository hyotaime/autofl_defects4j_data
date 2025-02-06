{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/XYCoordinateType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYCoordinateType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 132,
      "comment": "\n * Represents several possible interpretations for an (x, y) coordinate.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATA"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": " The (x, y) coordinates represent a point in the data space. "
    },
    {
      "type": "field",
      "varNames": [
        "RELATIVE"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * The (x, y) coordinates represent a relative position in the data space.\n     * In this case, the values should be in the range (0.0 to 1.0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": "\n     * The (x, y) coordinates represent indices in a dataset.\n     * In this case, the values should be in the range (0.0 to 1.0).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.XYCoordinateType.XYCoordinateType(java.lang.String)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.XYCoordinateType.toString()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.XYCoordinateType.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 110,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 56)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.XYCoordinateType.readResolve()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 20)"
      ]
    }
  ]
}