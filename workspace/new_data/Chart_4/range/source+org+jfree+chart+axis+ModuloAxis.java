{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/ModuloAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ModuloAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.NumberAxis"
      ],
      "begin_line": 55,
      "end_line": 432,
      "comment": "\r\n * An axis that displays numerical values within a fixed range using a modulo\r\n * calculation.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRange"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * The fixed range for the axis - all data values will be mapped to this\r\n     * range using a modulo calculation.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "displayStart"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\r\n     * The display start value (this will sometimes be \u003e displayEnd, in which\r\n     * case the axis wraps around at some point in the middle of the axis).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "displayEnd"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * The display end value.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ModuloAxis.ModuloAxis(java.lang.String, org.jfree.data.Range)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fixedRange  the fixed range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 21)",
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 34)",
        "(line 84,col 9)-(line 84,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayStart()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the display start value.\r\n     *\r\n     * @return The display start value.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayEnd()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the display end value.\r\n     *\r\n     * @return The display end value.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.setDisplayRange(double, double)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "\r\n     * Sets the display range.  The values will be mapped to the fixed range if\r\n     * necessary.\r\n     *\r\n     * @param start  the start value.\r\n     * @param end  the end value.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 56)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 115,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.autoAdjustRange()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * This method should calculate a range that will show all the data values.\r\n     * For now, it just sets the axis range to the fixedRange.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 142,
      "end_line": 162,
      "comment": "\r\n     * Translates a data value to a Java2D coordinate.\r\n     *\r\n     * @param value  the value.\r\n     * @param area  the area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return A Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 28)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.trans(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 173,
      "end_line": 193,
      "comment": "\r\n     * A regular translation from a data value to a Java2D value.\r\n     *\r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 25)",
        "(line 175,col 9)-(line 175,col 25)",
        "(line 176,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.transStart(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, double, double)",
      "begin_line": 207,
      "end_line": 232,
      "comment": "\r\n     * Translates a data value to a Java2D value for the first section of the\r\n     * axis.\r\n     *\r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * @param length1  the length of the first section.\r\n     * @param length2  the length of the second section.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 25)",
        "(line 211,col 9)-(line 211,col 25)",
        "(line 212,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.transEnd(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, double, double)",
      "begin_line": 246,
      "end_line": 271,
      "comment": "\r\n     * Translates a data value to a Java2D value for the second section of the\r\n     * axis.\r\n     *\r\n     * @param value  the value.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * @param length1  the length of the first section.\r\n     * @param length2  the length of the second section.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.mapValueToFixedRange(double)",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\r\n     * Maps a data value into the fixed range.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The mapped value.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 52)",
        "(line 283,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 300,
      "end_line": 310,
      "comment": "\r\n     * Translates a Java2D coordinate into a data value.\r\n     *\r\n     * @param java2DValue  the Java2D coordinate.\r\n     * @param area  the area.\r\n     * @param edge  the edge.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 28)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayLength()",
      "begin_line": 317,
      "end_line": 325,
      "comment": "\r\n     * Returns the display length for the axis.\r\n     *\r\n     * @return The display length.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.getDisplayCentralValue()",
      "begin_line": 332,
      "end_line": 336,
      "comment": "\r\n     * Returns the central value of the current display range.\r\n     *\r\n     * @return The central value.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.resizeRange(double)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the central value and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.resizeRange(double, double)",
      "begin_line": 363,
      "end_line": 373,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the specified anchor value and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * @param anchorValue  the new central value after the resize.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.lengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 385,
      "end_line": 403,
      "comment": "\r\n     * Converts a length in data coordinates into the corresponding length in\r\n     * Java2D coordinates.\r\n     *\r\n     * @param length  the length.\r\n     * @param area  the plot area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The length in Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 32)",
        "(line 388,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 32)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ModuloAxis.equals(java.lang.Object)",
      "begin_line": 412,
      "end_line": 430,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 43)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 33)"
      ]
    }
  ]
}