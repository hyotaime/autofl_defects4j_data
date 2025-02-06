{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/ItemLabelPosition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ItemLabelPosition",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 196,
      "comment": "\r\n * The attributes that control the position of the label for each data item on \r\n * a chart.  Instances of this class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelAnchor"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The item label anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The rotation angle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.ItemLabelPosition()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\r\n     * Creates a new position record with default settings.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 78,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor, org.jfree.chart.text.TextAnchor)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\r\n     * Creates a new position record (with zero rotation).\r\n     * \r\n     * @param itemLabelAnchor  the item label anchor (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     * @param textAnchor  the text anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor, org.jfree.chart.text.TextAnchor, org.jfree.chart.text.TextAnchor, double)",
      "begin_line": 106,
      "end_line": 128,
      "comment": "\r\n     * Creates a new position record.  The item label anchor is a point \r\n     * relative to the data item (dot, bar or other visual item) on a chart.  \r\n     * The item label is aligned by aligning the text anchor with the \r\n     * item label anchor.\r\n     * \r\n     * @param itemLabelAnchor  the item label anchor (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     * @param textAnchor  the text anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rotationAnchor  the rotation anchor (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                        permitted).\r\n     * @param angle  the rotation angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 47)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.getItemLabelAnchor()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the item label anchor.\r\n     * \r\n     * @return The item label anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.getTextAnchor()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the text anchor.\r\n     * \r\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.getRotationAnchor()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the rotation anchor point.\r\n     * \r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.getAngle()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the angle of rotation for the label.\r\n     * \r\n     * @return The angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.ItemLabelPosition.equals(java.lang.Object)",
      "begin_line": 173,
      "end_line": 194,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 57)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 20)"
      ]
    }
  ]
}