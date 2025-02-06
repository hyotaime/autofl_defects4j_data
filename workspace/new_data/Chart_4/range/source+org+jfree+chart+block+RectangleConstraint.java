{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/block/RectangleConstraint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangleConstraint",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 366,
      "comment": "\r\n * A description of a constraint for resizing a rectangle.  Constraints are\r\n * immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": "\r\n     * An instance representing no constraint.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The width. "
    },
    {
      "type": "field",
      "varNames": [
        "widthRange"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The width range. "
    },
    {
      "type": "field",
      "varNames": [
        "widthConstraintType"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The width constraint type. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The fixed or maximum height. "
    },
    {
      "type": "field",
      "varNames": [
        "heightRange"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "heightConstraintType"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The constraint type. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, double)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\r\n     * Creates a new \"fixed width and height\" instance.\r\n     *\r\n     * @param w  the fixed width.\r\n     * @param h  the fixed height.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\r\n     * Creates a new \"range width and height\" instance.\r\n     *\r\n     * @param w  the width range.\r\n     * @param h  the height range.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 100,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(org.jfree.data.Range, double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\r\n     * Creates a new constraint with a range for the width and a\r\n     * fixed height.\r\n     *\r\n     * @param w  the width range.\r\n     * @param h  the fixed height.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, org.jfree.data.Range)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\r\n     * Creates a new constraint with a fixed width and a range for\r\n     * the height.\r\n     *\r\n     * @param w  the fixed width.\r\n     * @param h  the height range.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.RectangleConstraint.RectangleConstraint(double, org.jfree.data.Range, org.jfree.chart.block.LengthConstraintType, double, org.jfree.data.Range, org.jfree.chart.block.LengthConstraintType)",
      "begin_line": 137,
      "end_line": 153,
      "comment": "\r\n     * Creates a new constraint.\r\n     *\r\n     * @param w  the fixed or maximum width.\r\n     * @param widthRange  the width range.\r\n     * @param widthConstraintType  the width type.\r\n     * @param h  the fixed or maximum height.\r\n     * @param heightRange  the height range.\r\n     * @param heightConstraintType  the height type.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 23)",
        "(line 148,col 9)-(line 148,col 37)",
        "(line 149,col 9)-(line 149,col 55)",
        "(line 150,col 9)-(line 150,col 24)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidth()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the fixed width.\r\n     *\r\n     * @return The width.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidthRange()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the width range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getWidthConstraintType()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Returns the constraint type.\r\n     *\r\n     * @return The constraint type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeight()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the fixed height.\r\n     *\r\n     * @return The height.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeightRange()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the width range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.getHeightConstraintType()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the constraint type.\r\n     *\r\n     * @return The constraint type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toUnconstrainedWidth()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has no width constraint.\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toUnconstrainedHeight()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has no height constraint.\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toFixedWidth(double)",
      "begin_line": 251,
      "end_line": 255,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has a fixed width constraint.\r\n     *\r\n     * @param width  the fixed width.\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toFixedHeight(double)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has a fixed height constraint.\r\n     *\r\n     * @param height  the fixed height.\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toRangeWidth(org.jfree.data.Range)",
      "begin_line": 279,
      "end_line": 286,
      "comment": "\r\n     * Returns a constraint that matches this one on the height attributes,\r\n     * but has a range width constraint.\r\n     *\r\n     * @param range  the width range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 285,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toRangeHeight(org.jfree.data.Range)",
      "begin_line": 296,
      "end_line": 303,
      "comment": "\r\n     * Returns a constraint that matches this one on the width attributes,\r\n     * but has a range height constraint.\r\n     *\r\n     * @param range  the height range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A new constraint.\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.toString()",
      "begin_line": 311,
      "end_line": 315,
      "comment": "\r\n     * Returns a string representation of this instance, mostly used for\r\n     * debugging purposes.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.RectangleConstraint.calculateConstrainedSize(org.jfree.chart.util.Size2D)",
      "begin_line": 325,
      "end_line": 364,
      "comment": "\r\n     * Returns the new size that reflects the constraints defined by this\r\n     * instance.\r\n     *\r\n     * @param base  the base size.\r\n     *\r\n     * @return The constrained size.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 37)",
        "(line 327,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    }
  ]
}