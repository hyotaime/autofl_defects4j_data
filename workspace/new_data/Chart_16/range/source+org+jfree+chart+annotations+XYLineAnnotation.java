{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/annotations/XYLineAnnotation.java",
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
      "begin_line": 79,
      "end_line": 306,
      "comment": "\r\n * A simple line annotation that can be placed on an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x1"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "x2"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y2"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The line color. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.XYLineAnnotation(double, double, double, double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Creates a new annotation that draws a line from (x1, y1) to (x2, y2) \r\n     * where the coordinates are measured in data space (that is, against the \r\n     * plot\u0027s axes).\r\n     * \r\n     * @param x1  the x-coordinate for the start of the line.\r\n     * @param y1  the y-coordinate for the start of the line.\r\n     * @param x2  the x-coordinate for the end of the line.\r\n     * @param y2  the y-coordinate for the end of the line.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.XYLineAnnotation(double, double, double, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 130,
      "end_line": 146,
      "comment": "\r\n     * Creates a new annotation that draws a line from (x1, y1) to (x2, y2) \r\n     * where the coordinates are measured in data space (that is, against the \r\n     * plot\u0027s axes).\r\n     *\r\n     * @param x1  the x-coordinate for the start of the line.\r\n     * @param y1  the y-coordinate for the start of the line.\r\n     * @param x2  the x-coordinate for the end of the line.\r\n     * @param y2  the y-coordinate for the end of the line.\r\n     * @param stroke  the line stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the line color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 21)",
        "(line 140,col 9)-(line 140,col 21)",
        "(line 141,col 9)-(line 141,col 21)",
        "(line 142,col 9)-(line 142,col 21)",
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 144,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 161,
      "end_line": 206,
      "comment": "\r\n     * Draws the annotation.  This method is called by the {@link XYPlot} \r\n     * class, you won\u0027t normally need to call it yourself.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 60)",
        "(line 167,col 9)-(line 168,col 59)",
        "(line 169,col 9)-(line 170,col 58)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 32)",
        "(line 196,col 9)-(line 196,col 34)",
        "(line 197,col 9)-(line 197,col 67)",
        "(line 198,col 9)-(line 198,col 22)",
        "(line 200,col 9)-(line 200,col 42)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 202,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.equals(java.lang.Object)",
      "begin_line": 215,
      "end_line": 246,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.hashCode()",
      "begin_line": 253,
      "end_line": 265,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 19)",
        "(line 255,col 9)-(line 255,col 18)",
        "(line 256,col 9)-(line 256,col 48)",
        "(line 257,col 9)-(line 257,col 46)",
        "(line 258,col 9)-(line 258,col 48)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 48)",
        "(line 261,col 9)-(line 261,col 60)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 263,col 60)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.clone()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 36)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYLineAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 35)",
        "(line 302,col 9)-(line 302,col 55)",
        "(line 303,col 9)-(line 303,col 57)"
      ]
    }
  ]
}