{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/CategoryAxis3D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryAxis3D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.CategoryAxis",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 226,
      "comment": "\r\n * An axis that displays categories and has a 3D effect.\r\n * Used for bar charts and line charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis3D.CategoryAxis3D()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Creates a new axis.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.CategoryAxis3D.CategoryAxis3D(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Creates a new axis using default attribute values.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis3D.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 111,
      "end_line": 158,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axis should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the plot is being drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 126,col 9)-(line 126,col 53)",
        "(line 128,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 147,col 9)",
        "(line 150,col 9)-(line 150,col 48)",
        "(line 151,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 154,col 27)",
        "(line 156,col 9)-(line 156,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis3D.getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor, int, int, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 171,
      "end_line": 212,
      "comment": "\r\n     * Returns the Java 2D coordinate for a category.\r\n     * \r\n     * @param anchor  the anchor point.\r\n     * @param category  the category index.\r\n     * @param categoryCount  the category count.\r\n     * @param area  the data area.\r\n     * @param edge  the location of the axis.\r\n     * \r\n     * @return The coordinate.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 28)",
        "(line 178,col 9)-(line 178,col 40)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 59)",
        "(line 181,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.CategoryAxis3D.clone()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException If the axis is not cloneable for \r\n     *         some reason.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    }
  ]
}