{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/RectangleEdge.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangleEdge",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 226,
      "comment": "\n * Used to indicate the edge of a rectangle.\n "
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
        "TOP"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": " Top. "
    },
    {
      "type": "field",
      "varNames": [
        "BOTTOM"
      ],
      "begin_line": 61,
      "end_line": 62,
      "comment": " Bottom. "
    },
    {
      "type": "field",
      "varNames": [
        "LEFT"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " Left. "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": " Right. "
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
      "signature": "org.jfree.chart.util.RectangleEdge.RectangleEdge(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Private constructor.\n     *\n     * @param name  the name.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.toString()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns a string representing the object.\n     *\n     * @return The string.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 117,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if this object is equal to the specified\n     * object, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 50)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.hashCode()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.isTopOrBottom(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the edge is \u003ccode\u003eTOP\u003c/code\u003e or\n     * \u003ccode\u003eBOTTOM\u003c/code\u003e, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param edge  the edge.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.isLeftOrRight(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the edge is \u003ccode\u003eLEFT\u003c/code\u003e or\n     * \u003ccode\u003eRIGHT\u003c/code\u003e, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @param edge  the edge.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.opposite(org.jfree.chart.util.RectangleEdge)",
      "begin_line": 159,
      "end_line": 174,
      "comment": "\n     * Returns the opposite edge.\n     *\n     * @param edge  an edge.\n     *\n     * @return The opposite edge.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 36)",
        "(line 161,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.coordinate(java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 184,
      "end_line": 200,
      "comment": "\n     * Returns the x or y coordinate of the specified edge.\n     *\n     * @param rectangle  the rectangle.\n     * @param edge  the edge.\n     *\n     * @return The coordinate.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.RectangleEdge.readResolve()",
      "begin_line": 209,
      "end_line": 224,
      "comment": "\n     * Ensures that serialization returns the unique instances.\n     *\n     * @return The object.\n     *\n     * @throws ObjectStreamException if there is a problem.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 36)",
        "(line 211,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    }
  ]
}