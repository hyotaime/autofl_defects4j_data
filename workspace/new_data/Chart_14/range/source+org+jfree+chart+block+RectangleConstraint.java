{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/RectangleConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangleConstraint",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 381,
      "comment": "\r\n * A description of a constraint for resizing a rectangle.  Constraints are\r\n * immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 60,
      "end_line": 63,
      "comment": "\r\n     * An instance representing no constraint. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The width. "
    },
    {
      "type": "field",
      "varNames": [
        "widthRange"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The width range. "
    },
    {
      "type": "field",
      "varNames": [
        "widthConstraintType"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The width constraint type. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The fixed or maximum height. "
    },
    {
      "type": "field",
      "varNames": [
        "heightRange"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "heightConstraintType"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The constraint type. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, double)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\r\n     * Creates a new \"fixed width and height\" instance.\r\n     * \r\n     * @param w  the fixed width.\r\n     * @param h  the fixed height.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\r\n     * Creates a new \"range width and height\" instance.\r\n     * \r\n     * @param w  the width range.\r\n     * @param h  the height range.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(org.jfree.data.Range, double)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\r\n     * Creates a new constraint with a range for the width and a\r\n     * fixed height.\r\n     * \r\n     * @param w  the width range.\r\n     * @param h  the fixed height.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 119,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, org.jfree.data.Range)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\r\n     * Creates a new constraint with a fixed width and a range for\r\n     * the height.\r\n     * \r\n     * @param w  the fixed width.\r\n     * @param h  the height range.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, org.jfree.data.Range, org.jfree.chart.block.LengthConstraintType, double, org.jfree.data.Range, org.jfree.chart.block.LengthConstraintType)",
      "begin_line": 146,
      "end_line": 162,
      "comment": "\r\n     * Creates a new constraint.\r\n     * \r\n     * @param w  the fixed or maximum width.\r\n     * @param widthRange  the width range.\r\n     * @param widthConstraintType  the width type.\r\n     * @param h  the fixed or maximum height.\r\n     * @param heightRange  the height range.\r\n     * @param heightConstraintType  the height type.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 23)",
        "(line 157,col 9)-(line 157,col 37)",
        "(line 158,col 9)-(line 158,col 55)",
        "(line 159,col 9)-(line 159,col 24)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidth()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the fixed width.\r\n     * \r\n     * @return The width.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidthRange()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the width range.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidthConstraintType()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the constraint type.\r\n     * \r\n     * @return The constraint type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeight()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the fixed height.\r\n     * \r\n     * @return The height.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeightRange()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the width range.\r\n     * \r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeightConstraintType()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the constraint type.\r\n     * \r\n     * @return The constraint type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toUnconstrainedWidth()",
      "begin_line": 224,
      "end_line": 234,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has no width constraint.\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toUnconstrainedHeight()",
      "begin_line": 242,
      "end_line": 252,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has no height constraint.\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toFixedWidth(double)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has a fixed width constraint.\r\n     * \r\n     * @param width  the fixed width.\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 266,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toFixedHeight(double)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has a fixed height constraint.\r\n     * \r\n     * @param height  the fixed height.\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 281,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toRangeWidth(org.jfree.data.Range)",
      "begin_line": 292,
      "end_line": 300,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has a range width constraint.\r\n     * \r\n     * @param range  the width range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 299,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toRangeHeight(org.jfree.data.Range)",
      "begin_line": 310,
      "end_line": 318,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has a range height constraint.\r\n     * \r\n     * @param range  the height range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 317,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toString()",
      "begin_line": 326,
      "end_line": 330,
      "comment": "\r\n     * Returns a string representation of this instance, mostly used for\r\n     * debugging purposes.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.calculateConstrainedSize(org.jfree.chart.util.Size2D)",
      "begin_line": 340,
      "end_line": 379,
      "comment": "\r\n     * Returns the new size that reflects the constraints defined by this \r\n     * instance.\r\n     * \r\n     * @param base  the base size.\r\n     * \r\n     * @return The constrained size.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 37)",
        "(line 342,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 22)"
      ]
    }
  ]
}