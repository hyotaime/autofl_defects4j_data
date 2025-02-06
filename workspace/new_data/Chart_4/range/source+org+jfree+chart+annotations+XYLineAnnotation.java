{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYLineAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYLineAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 81,
      "end_line": 312,
      "comment": "\r\n * A simple line annotation that can be placed on an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x1"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "x2"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y2"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The line color. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.XYLineAnnotation(double, double, double, double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Creates a new annotation that draws a line from (x1, y1) to (x2, y2)\r\n     * where the coordinates are measured in data space (that is, against the\r\n     * plot\u0027s axes).\r\n     *\r\n     * @param x1  the x-coordinate for the start of the line.\r\n     * @param y1  the y-coordinate for the start of the line.\r\n     * @param x2  the x-coordinate for the end of the line.\r\n     * @param y2  the y-coordinate for the end of the line.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.XYLineAnnotation(double, double, double, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 131,
      "end_line": 147,
      "comment": "\r\n     * Creates a new annotation that draws a line from (x1, y1) to (x2, y2)\r\n     * where the coordinates are measured in data space (that is, against the\r\n     * plot\u0027s axes).\r\n     *\r\n     * @param x1  the x-coordinate for the start of the line.\r\n     * @param y1  the y-coordinate for the start of the line.\r\n     * @param x2  the x-coordinate for the end of the line.\r\n     * @param y2  the y-coordinate for the end of the line.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 21)",
        "(line 141,col 9)-(line 141,col 21)",
        "(line 142,col 9)-(line 142,col 21)",
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 162,
      "end_line": 212,
      "comment": "\r\n     * Draws the annotation.  This method is called by the {@link XYPlot}\r\n     * class, you won\u0027t normally need to call it yourself.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 60)",
        "(line 168,col 9)-(line 169,col 59)",
        "(line 170,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 175,col 27)",
        "(line 176,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 32)",
        "(line 197,col 9)-(line 197,col 34)",
        "(line 198,col 9)-(line 198,col 67)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 42)",
        "(line 207,col 9)-(line 207,col 30)",
        "(line 208,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.equals(java.lang.Object)",
      "begin_line": 221,
      "end_line": 252,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 55)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.hashCode()",
      "begin_line": 259,
      "end_line": 271,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 19)",
        "(line 261,col 9)-(line 261,col 18)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 263,col 46)",
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 48)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 268,col 48)",
        "(line 269,col 9)-(line 269,col 60)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.clone()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 36)",
        "(line 293,col 9)-(line 293,col 55)",
        "(line 294,col 9)-(line 294,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 35)",
        "(line 308,col 9)-(line 308,col 55)",
        "(line 309,col 9)-(line 309,col 57)"
      ]
    }
  ]
}