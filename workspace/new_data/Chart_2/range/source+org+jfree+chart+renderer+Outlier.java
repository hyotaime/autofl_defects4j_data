{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/Outlier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Outlier",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable"
      ],
      "begin_line": 55,
      "end_line": 210,
      "comment": "\r\n * Represents one outlier in the box and whisker plot.\r\n * \u003cP\u003e\r\n * All the coordinates in this class are in Java2D space.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\r\n     * The xy coordinates of the bounding box containing the outlier ellipse.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The radius of the ellipse "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.Outlier.Outlier(double, double, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\r\n     * Constructs an outlier item consisting of a point and the radius of the\r\n     * outlier ellipse\r\n     *\r\n     * @param xCoord  the x coordinate of the point.\r\n     * @param yCoord  the y coordinate of the point.\r\n     * @param radius  the radius of the ellipse.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 74)",
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.getPoint()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the xy coordinates of the bounding box containing the outlier\r\n     * ellipse.\r\n     *\r\n     * @return The location of the outlier ellipse.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.setPoint(java.awt.geom.Point2D)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Sets the xy coordinates of the bounding box containing the outlier\r\n     * ellipse.\r\n     *\r\n     * @param point  the location.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.getX()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the x coordinate of the bounding box containing the outlier\r\n     * ellipse.\r\n     *\r\n     * @return The x coordinate.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.getY()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Returns the y coordinate of the bounding box containing the outlier\r\n     * ellipse.\r\n     *\r\n     * @return The y coordinate.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.getRadius()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the radius of the outlier ellipse.\r\n     *\r\n     * @return The radius.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.setRadius(double)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Sets the radius of the outlier ellipse.\r\n     *\r\n     * @param radius  the new radius.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.compareTo(java.lang.Object)",
      "begin_line": 145,
      "end_line": 158,
      "comment": "\r\n     * Compares this object with the specified object for order, based on\r\n     * the outlier\u0027s point.\r\n     *\r\n     * @param   o the Object to be compared.\r\n     * @return A negative integer, zero, or a positive integer as this object\r\n     *      is less than, equal to, or greater than the specified object.\r\n     *\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 38)",
        "(line 147,col 9)-(line 147,col 32)",
        "(line 148,col 9)-(line 148,col 40)",
        "(line 149,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.overlaps(org.jfree.chart.renderer.Outlier)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\r\n     * Returns a true if outlier is overlapped and false if it is not.\r\n     * Overlapping is determined by the respective bounding boxes plus\r\n     * a small margin.\r\n     *\r\n     * @param other  the other outlier.\r\n     *\r\n     * @return A \u003ccode\u003eboolean\u003c/code\u003e indicating whether or not an overlap has\r\n     *         occurred.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.equals(java.lang.Object)",
      "begin_line": 184,
      "end_line": 199,
      "comment": "\r\n     * Tests this outlier for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.Outlier.toString()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns a textual representation of the outlier.\r\n     *\r\n     * @return A \u003ccode\u003eString\u003c/code\u003e representing the outlier.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 49)"
      ]
    }
  ]
}