{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/AreaRendererEndType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AreaRendererEndType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 140,
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
      "end_line": 58,
      "comment": "\r\n     * The area tapers from the first or last value down to zero.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TRUNCATE"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": "\r\n     * The area is truncated at the first or last value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LEVEL"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": "\r\n     * The area is levelled at the first or last value.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.AreaRendererEndType(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Private constructor.\r\n     *\r\n     * @param name  the name.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.toString()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns a string representing the object.\r\n     *\r\n     * @return The string.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 117,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\r\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.AreaRendererEndType.readResolve()",
      "begin_line": 126,
      "end_line": 138,
      "comment": "\r\n     * Ensures that serialization returns the unique instances.\r\n     *\r\n     * @return The object.\r\n     *\r\n     * @throws ObjectStreamException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 22)"
      ]
    }
  ]
}