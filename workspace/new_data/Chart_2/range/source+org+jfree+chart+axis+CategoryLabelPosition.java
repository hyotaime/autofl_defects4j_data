{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/CategoryLabelPosition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryLabelPosition",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 278,
      "comment": "\r\n * The attributes that control the position of the labels for the categories on\r\n * a {@link CategoryAxis}. Instances of this class are immutable and other\r\n * JFreeChart classes rely upon this.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "categoryAnchor"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The category anchor point. "
    },
    {
      "type": "field",
      "varNames": [
        "labelAnchor"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The text block anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The rotation angle (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "widthType"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The width calculation type. "
    },
    {
      "type": "field",
      "varNames": [
        "widthRatio"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * The maximum label width as a percentage of the category space or the\r\n     * range space.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.CategoryLabelPosition()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\r\n     * Creates a new position record with default settings.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor, org.jfree.chart.text.TextBlockAnchor)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\r\n     * Creates a new category label position record.\r\n     *\r\n     * @param categoryAnchor  the category anchor (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                        permitted).\r\n     * @param labelAnchor  the label anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor, org.jfree.chart.text.TextBlockAnchor, org.jfree.chart.axis.CategoryLabelWidthType, float)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\r\n     * Creates a new category label position record.\r\n     *\r\n     * @param categoryAnchor  the category anchor (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                        permitted).\r\n     * @param labelAnchor  the label anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param widthType  the width type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param widthRatio  the maximum label width as a percentage (of the\r\n     *                    category space or the range space).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 124,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.CategoryLabelPosition(org.jfree.chart.util.RectangleAnchor, org.jfree.chart.text.TextBlockAnchor, org.jfree.chart.text.TextAnchor, double, org.jfree.chart.axis.CategoryLabelWidthType, float)",
      "begin_line": 143,
      "end_line": 173,
      "comment": "\r\n     * Creates a new position record.  The item label anchor is a point\r\n     * relative to the data item (dot, bar or other visual item) on a chart.\r\n     * The item label is aligned by aligning the text anchor with the item\r\n     * label anchor.\r\n     *\r\n     * @param categoryAnchor  the category anchor (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                        permitted).\r\n     * @param labelAnchor  the label anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rotationAnchor  the rotation anchor (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                        permitted).\r\n     * @param angle  the rotation angle (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param widthType  the width type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param widthRatio  the maximum label width as a percentage (of the\r\n     *                    category space or the range space).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 170,col 35)",
        "(line 171,col 9)-(line 171,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getCategoryAnchor()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the item label anchor.\r\n     *\r\n     * @return The item label anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getLabelAnchor()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the text block anchor.\r\n     *\r\n     * @return The text block anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getRotationAnchor()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the rotation anchor point.\r\n     *\r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getAngle()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the angle of rotation for the label.\r\n     *\r\n     * @return The angle (in radians).\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getWidthType()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the width calculation type.\r\n     *\r\n     * @return The width calculation type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.getWidthRatio()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Returns the ratio used to calculate the maximum category label width.\r\n     *\r\n     * @return The ratio.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.equals(java.lang.Object)",
      "begin_line": 236,
      "end_line": 263,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryLabelPosition.hashCode()",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 24)",
        "(line 272,col 9)-(line 272,col 62)",
        "(line 273,col 9)-(line 273,col 59)",
        "(line 274,col 9)-(line 274,col 62)",
        "(line 275,col 9)-(line 275,col 22)"
      ]
    }
  ]
}