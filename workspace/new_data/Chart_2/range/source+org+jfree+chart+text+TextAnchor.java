{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/text/TextAnchor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextAnchor",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 52,
      "end_line": 228,
      "comment": "\n * Used to indicate the position of an anchor point for a text string.  This is\n * frequently used to align a string to a fixed point in some coordinate space.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_LEFT"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Top/left. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_CENTER"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " Top/center. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_RIGHT"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " Top/right. "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_ASCENT_LEFT"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": " Half-ascent/left. "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_ASCENT_CENTER"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": " Half-ascent/center. "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_ASCENT_RIGHT"
      ],
      "begin_line": 78,
      "end_line": 79,
      "comment": " Half-ascent/right. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_LEFT"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": " Middle/left. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Middle/center. "
    },
    {
      "type": "field",
      "varNames": [
        "CENTER_RIGHT"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": " Middle/right. "
    },
    {
      "type": "field",
      "varNames": [
        "BASELINE_LEFT"
      ],
      "begin_line": 93,
      "end_line": 94,
      "comment": " Baseline/left. "
    },
    {
      "type": "field",
      "varNames": [
        "BASELINE_CENTER"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": " Baseline/center. "
    },
    {
      "type": "field",
      "varNames": [
        "BASELINE_RIGHT"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": " Baseline/right. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_LEFT"
      ],
      "begin_line": 105,
      "end_line": 106,
      "comment": " Bottom/left. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_CENTER"
      ],
      "begin_line": 109,
      "end_line": 110,
      "comment": " Bottom/center. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_RIGHT"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": " Bottom/right. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextAnchor.TextAnchor(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextAnchor.toString()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextAnchor.equals(java.lang.Object)",
      "begin_line": 145,
      "end_line": 160,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextAnchor.hashCode()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextAnchor.readResolve()",
      "begin_line": 178,
      "end_line": 226,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 33)",
        "(line 180,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    }
  ]
}