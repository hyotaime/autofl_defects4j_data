{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/GradientPaintTransformType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GradientPaintTransformType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 153,
      "comment": "\n * Represents a type of transform for a \u003ccode\u003eGradientPaint\u003c/code\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "VERTICAL"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": " Vertical. "
    },
    {
      "type": "field",
      "varNames": [
        "HORIZONTAL"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": " Horizontal. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_VERTICAL"
      ],
      "begin_line": 65,
      "end_line": 67,
      "comment": " Center/vertical. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_HORIZONTAL"
      ],
      "begin_line": 70,
      "end_line": 72,
      "comment": " Center/horizontal. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.GradientPaintTransformType.GradientPaintTransformType(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.GradientPaintTransformType.toString()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.GradientPaintTransformType.equals(java.lang.Object)",
      "begin_line": 103,
      "end_line": 118,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.GradientPaintTransformType.hashCode()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.GradientPaintTransformType.readResolve()",
      "begin_line": 136,
      "end_line": 151,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     * \n     * @return The object.\n     * \n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    }
  ]
}