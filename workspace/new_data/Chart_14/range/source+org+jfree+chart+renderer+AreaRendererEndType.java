{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/AreaRendererEndType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AreaRendererEndType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 143,
      "comment": "\r\n * An enumeration of the \u0027end types\u0027 for an area renderer.\r\n "
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
        "TAPER"
      ],
      "begin_line": 57,
      "end_line": 59,
      "comment": " \r\n     * The area tapers from the first or last value down to zero. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TRUNCATE"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": " \r\n     * The area is truncated at the first or last value. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LEVEL"
      ],
      "begin_line": 71,
      "end_line": 73,
      "comment": " \r\n     * The area is levelled at the first or last value. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.AreaRendererEndType(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.toString()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.equals(java.lang.Object)",
      "begin_line": 104,
      "end_line": 120,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified \r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param o  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 56)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.readResolve()",
      "begin_line": 129,
      "end_line": 141,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     * \r\n     * @return The object.\r\n     * \r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 22)"
      ]
    }
  ]
}