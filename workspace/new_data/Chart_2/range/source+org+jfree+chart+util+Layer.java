{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/Layer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Layer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 135,
      "comment": "\n * Used to indicate either the foreground or background layer.\n "
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
        "FOREGROUND"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Foreground. "
    },
    {
      "type": "field",
      "varNames": [
        "BACKGROUND"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Background. "
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
      "signature": "org.jfree.chart.util.Layer.Layer(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Layer.toString()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Layer.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 106,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Layer.hashCode()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Layer.readResolve()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 28)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    }
  ]
}