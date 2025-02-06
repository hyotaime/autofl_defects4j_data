{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/RectangleAnchor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangleAnchor",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 299,
      "comment": "\n * Used to indicate an anchor point for a rectangle.\n *\n * @author David Gilbert\n "
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
        "CENTER"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " Center. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": " Top. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_LEFT"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " Top-Left. "
    },
    {
      "type": "field",
      "varNames": [
        "TOP_RIGHT"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": " Top-Right. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": " Bottom. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_LEFT"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": " Bottom-Left. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM_RIGHT"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " Bottom-Right. "
    },
    {
      "type": "field",
      "varNames": [
        "LEFT"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " Left. "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": " Right. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The name. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.RectangleAnchor.RectangleAnchor(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.toString()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.equals(java.lang.Object)",
      "begin_line": 127,
      "end_line": 142,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 60)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.hashCode()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return The hashcode\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.coordinates(java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 161,
      "end_line": 192,
      "comment": "\n     * Returns the (x, y) coordinates of the specified anchor.\n     *\n     * @param rectangle  the rectangle.\n     * @param anchor  the anchor.\n     *\n     * @return The (x, y) coordinates.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 46)",
        "(line 164,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.createRectangle(org.jfree.chart.util.Size2D, double, double, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 205,
      "end_line": 258,
      "comment": "\n     * Creates a new rectangle with the specified dimensions that is aligned to\n     * the given anchor point \u003ccode\u003e(anchorX, anchorY)\u003c/code\u003e.\n     *\n     * @param dimensions  the dimensions (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchorX  the x-anchor.\n     * @param anchorY  the y-anchor.\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return A rectangle.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 34)",
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleAnchor.readResolve()",
      "begin_line": 267,
      "end_line": 297,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 38)",
        "(line 269,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    }
  ]
}