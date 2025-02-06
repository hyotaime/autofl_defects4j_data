{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/text/TextBlockAnchor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextBlockAnchor",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 185,
      "comment": "\n * Used to indicate the position of an anchor point for a text block.\n "
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
        "TOP_LEFT"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Top/left. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_CENTER"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Top/center. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_RIGHT"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " Top/right. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_LEFT"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": " Middle/left. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": " Middle/center. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_RIGHT"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": " Middle/right. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_LEFT"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": " Bottom/left. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_CENTER"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": " Bottom/center. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_RIGHT"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": " Bottom/right. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBlockAnchor.TextBlockAnchor(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlockAnchor.toString()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlockAnchor.equals(java.lang.Object)",
      "begin_line": 121,
      "end_line": 136,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 54)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlockAnchor.hashCode()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlockAnchor.readResolve()",
      "begin_line": 154,
      "end_line": 183,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 20)"
      ]
    }
  ]
}