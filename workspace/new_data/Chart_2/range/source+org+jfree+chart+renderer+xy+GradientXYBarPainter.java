{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/GradientXYBarPainter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GradientXYBarPainter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYBarPainter",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 383,
      "comment": "\r\n * An implementation of the {@link XYBarPainter} interface that uses several\r\n * gradient fills to enrich the appearance of the bars.\r\n *\r\n * @since 1.0.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "g1"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The division point between the first and second gradient regions. "
    },
    {
      "type": "field",
      "varNames": [
        "g2"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The division point between the second and third gradient regions. "
    },
    {
      "type": "field",
      "varNames": [
        "g3"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The division point between the third and fourth gradient regions. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.GradientXYBarPainter()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.GradientXYBarPainter(double, double, double)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param g1\r\n     * @param g2\r\n     * @param g3\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)",
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.paintBar(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYBarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 107,
      "end_line": 195,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the data item selected?\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 71)",
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 126,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 181,col 9)",
        "(line 184,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.paintBarShadow(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYBarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 212,
      "end_line": 231,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the data item selected?\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     * @param pegShadow  peg the shadow to the base of the bar?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 71)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 227,col 62)",
        "(line 228,col 9)-(line 228,col 32)",
        "(line 229,col 9)-(line 229,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.createShadow(java.awt.geom.RectangularShape, double, double, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 244,
      "end_line": 283,
      "comment": "\r\n     * Creates a shadow for the bar.\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param xOffset  the x-offset for the shadow.\r\n     * @param yOffset  the y-offset for the shadow.\r\n     * @param base  the edge that is the base of the bar.\r\n     * @param pegShadow  peg the shadow to the base?\r\n     *\r\n     * @return A rectangle for the shadow.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 34)",
        "(line 247,col 9)-(line 247,col 34)",
        "(line 248,col 9)-(line 248,col 34)",
        "(line 249,col 9)-(line 249,col 34)",
        "(line 250,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.splitVerticalBar(java.awt.geom.RectangularShape, double, double, double)",
      "begin_line": 296,
      "end_line": 312,
      "comment": "\r\n     * Splits a bar into subregions (elsewhere, these subregions will have\r\n     * different gradients applied to them).\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param a  the first division.\r\n     * @param b  the second division.\r\n     * @param c  the third division.\r\n     *\r\n     * @return An array containing four subregions.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 50)",
        "(line 299,col 9)-(line 299,col 34)",
        "(line 300,col 9)-(line 300,col 57)",
        "(line 301,col 9)-(line 301,col 57)",
        "(line 302,col 9)-(line 302,col 57)",
        "(line 303,col 9)-(line 304,col 42)",
        "(line 305,col 9)-(line 306,col 33)",
        "(line 307,col 9)-(line 308,col 33)",
        "(line 309,col 9)-(line 310,col 53)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.splitHorizontalBar(java.awt.geom.RectangularShape, double, double, double)",
      "begin_line": 325,
      "end_line": 341,
      "comment": "\r\n     * Splits a bar into subregions (elsewhere, these subregions will have\r\n     * different gradients applied to them).\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param a  the first division.\r\n     * @param b  the second division.\r\n     * @param c  the third division.\r\n     *\r\n     * @return An array containing four subregions.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 50)",
        "(line 328,col 9)-(line 328,col 34)",
        "(line 329,col 9)-(line 329,col 58)",
        "(line 330,col 9)-(line 330,col 58)",
        "(line 331,col 9)-(line 331,col 58)",
        "(line 332,col 9)-(line 333,col 41)",
        "(line 334,col 9)-(line 335,col 25)",
        "(line 336,col 9)-(line 337,col 25)",
        "(line 338,col 9)-(line 339,col 36)",
        "(line 340,col 9)-(line 340,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.equals(java.lang.Object)",
      "begin_line": 350,
      "end_line": 368,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the obj (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 63)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.GradientXYBarPainter.hashCode()",
      "begin_line": 375,
      "end_line": 381,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 22)",
        "(line 377,col 9)-(line 377,col 53)",
        "(line 378,col 9)-(line 378,col 53)",
        "(line 379,col 9)-(line 379,col 53)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    }
  ]
}