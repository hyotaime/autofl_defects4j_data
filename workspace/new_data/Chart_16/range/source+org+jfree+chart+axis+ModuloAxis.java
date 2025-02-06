{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/ModuloAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ModuloAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis"
      ],
      "begin_line": 54,
      "end_line": 407,
      "comment": "\r\n * An axis that displays numerical values within a fixed range using a modulo \r\n * calculation.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRange"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " \r\n     * The fixed range for the axis - all data values will be mapped to this\r\n     * range using a modulo calculation. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "displayStart"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * The display start value (this will sometimes be \u003e displayEnd, in which\r\n     * case the axis wraps around at some point in the middle of the axis).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "displayEnd"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * The display end value.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ModuloAxis.ModuloAxis(java.lang.String, org.jfree.data.Range)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fixedRange  the fixed range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 21)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 34)",
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayStart()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the display start value.\r\n     * \r\n     * @return The display start value.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayEnd()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the display end value.\r\n     * \r\n     * @return The display end value.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.setDisplayRange(double, double)",
      "begin_line": 111,
      "end_line": 125,
      "comment": "\r\n     * Sets the display range.  The values will be mapped to the fixed range if\r\n     * necessary.\r\n     * \r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 56)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.autoAdjustRange()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * This method should calculate a range that will show all the data values.\r\n     * For now, it just sets the axis range to the fixedRange.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 144,
      "end_line": 164,
      "comment": "\r\n     * Translates a data value to a Java2D coordinate.\r\n     * \r\n     * @param value  the value.\r\n     * @param area  the area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return A Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.trans(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 175,
      "end_line": 195,
      "comment": "\r\n     * A regular translation from a data value to a Java2D value.\r\n     * \r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * \r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 25)",
        "(line 177,col 9)-(line 177,col 25)",
        "(line 178,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.transStart(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, double, double)",
      "begin_line": 209,
      "end_line": 234,
      "comment": "\r\n     * Translates a data value to a Java2D value for the first section of the \r\n     * axis.\r\n     * \r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * @param length1  the length of the first section.\r\n     * @param length2  the length of the second section.\r\n     * \r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 25)",
        "(line 213,col 9)-(line 213,col 25)",
        "(line 214,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.transEnd(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, double, double)",
      "begin_line": 248,
      "end_line": 273,
      "comment": "\r\n     * Translates a data value to a Java2D value for the second section of the \r\n     * axis.\r\n     * \r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * @param length1  the length of the first section.\r\n     * @param length2  the length of the second section.\r\n     * \r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.mapValueToFixedRange(double)",
      "begin_line": 282,
      "end_line": 291,
      "comment": "\r\n     * Maps a data value into the fixed range.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @return The mapped value.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 52)",
        "(line 285,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 302,
      "end_line": 312,
      "comment": "\r\n     * Translates a Java2D coordinate into a data value.\r\n     * \r\n     * @param java2DValue  the Java2D coordinate.\r\n     * @param area  the area.\r\n     * @param edge  the edge.\r\n     * \r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 28)",
        "(line 305,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayLength()",
      "begin_line": 319,
      "end_line": 327,
      "comment": "\r\n     * Returns the display length for the axis.\r\n     * \r\n     * @return The display length.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayCentralValue()",
      "begin_line": 334,
      "end_line": 338,
      "comment": "\r\n     * Returns the central value of the current display range.\r\n     * \r\n     * @return The central value.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.resizeRange(double)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about \r\n     * the central value and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.resizeRange(double, double)",
      "begin_line": 365,
      "end_line": 375,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about \r\n     * the specified anchor value and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * @param anchorValue  the new central value after the resize.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.lengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 387,
      "end_line": 405,
      "comment": "\r\n     * Converts a length in data coordinates into the corresponding length in \r\n     * Java2D coordinates.\r\n     * \r\n     * @param length  the length.\r\n     * @param area  the plot area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * \r\n     * @return The length in Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 32)",
        "(line 390,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 32)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 50)"
      ]
    }
  ]
}