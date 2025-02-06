{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/Tick.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Tick",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 57,
      "end_line": 186,
      "comment": "\r\n * The base class used to represent labelled ticks along an axis.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A text version of the tick value. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The text anchor for the tick label. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The rotation anchor for the tick label. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The rotation angle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.Tick.Tick(java.lang.String, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 83,
      "end_line": 97,
      "comment": "\r\n     * Creates a new tick.\r\n     *\r\n     * @param text  the formatted version of the tick value.\r\n     * @param textAnchor  the text anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rotationAnchor  the rotation anchor (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                        permitted).\r\n     * @param angle  the angle. \r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 94,col 9)-(line 94,col 37)",
        "(line 95,col 9)-(line 95,col 45)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.getText()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the text version of the tick value.\r\n     *\r\n     * @return A string (possibly \u003ccode\u003enull\u003c/code\u003e;\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.getTextAnchor()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns the text anchor.\r\n     * \r\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.getRotationAnchor()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the text anchor that defines the point around which the label is\r\n     * rotated.\r\n     * \r\n     * @return A text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.getAngle()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the angle.\r\n     * \r\n     * @return The angle.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.equals(java.lang.Object)",
      "begin_line": 143,
      "end_line": 164,
      "comment": "\r\n     * Tests this tick for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.clone()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " \r\n     * Returns a clone of the tick.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 42)",
        "(line 175,col 9)-(line 175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Tick.toString()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns a string representation of the tick.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)"
      ]
    }
  ]
}