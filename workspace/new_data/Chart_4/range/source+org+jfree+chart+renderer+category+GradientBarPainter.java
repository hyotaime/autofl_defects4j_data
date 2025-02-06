{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/GradientBarPainter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GradientBarPainter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarPainter",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 380,
      "comment": "\r\n * An implementation of the {@link BarPainter} interface that uses several\r\n * gradient fills to enrich the appearance of the bars.\r\n *\r\n * @since 1.2.0\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "g1"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The division point between the first and second gradient regions. "
    },
    {
      "type": "field",
      "varNames": [
        "g2"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The division point between the second and third gradient regions. "
    },
    {
      "type": "field",
      "varNames": [
        "g3"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The division point between the third and fourth gradient regions. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.GradientBarPainter()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.GradientBarPainter(double, double, double)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param g1\r\n     * @param g2\r\n     * @param g3\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 91,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.paintBar(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 106,
      "end_line": 195,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the item selected?\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 71)",
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 125,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.paintBarShadow(java.awt.Graphics2D, org.jfree.chart.renderer.category.BarRenderer, int, int, boolean, java.awt.geom.RectangularShape, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 209,
      "end_line": 228,
      "comment": "\r\n     * Paints a single bar instance.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param renderer  the renderer.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param bar  the bar\r\n     * @param base  indicates which side of the rectangle is the base of the\r\n     *              bar.\r\n     * @param pegShadow  peg the shadow to the base of the bar?\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 71)",
        "(line 216,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 224,col 62)",
        "(line 225,col 9)-(line 225,col 47)",
        "(line 226,col 9)-(line 226,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.createShadow(java.awt.geom.RectangularShape, double, double, org.jfree.chart.util.RectangleEdge, boolean)",
      "begin_line": 241,
      "end_line": 280,
      "comment": "\r\n     * Creates a shadow for the bar.\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param xOffset  the x-offset for the shadow.\r\n     * @param yOffset  the y-offset for the shadow.\r\n     * @param base  the edge that is the base of the bar.\r\n     * @param pegShadow  peg the shadow to the base?\r\n     *\r\n     * @return A rectangle for the shadow.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)",
        "(line 244,col 9)-(line 244,col 34)",
        "(line 245,col 9)-(line 245,col 34)",
        "(line 246,col 9)-(line 246,col 34)",
        "(line 247,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.splitVerticalBar(java.awt.geom.RectangularShape, double, double, double)",
      "begin_line": 293,
      "end_line": 309,
      "comment": "\r\n     * Splits a bar into subregions (elsewhere, these subregions will have\r\n     * different gradients applied to them).\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param a  the first division.\r\n     * @param b  the second division.\r\n     * @param c  the third division.\r\n     *\r\n     * @return An array containing four subregions.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 50)",
        "(line 296,col 9)-(line 296,col 34)",
        "(line 297,col 9)-(line 297,col 57)",
        "(line 298,col 9)-(line 298,col 57)",
        "(line 299,col 9)-(line 299,col 57)",
        "(line 300,col 9)-(line 301,col 42)",
        "(line 302,col 9)-(line 303,col 33)",
        "(line 304,col 9)-(line 305,col 33)",
        "(line 306,col 9)-(line 307,col 53)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.splitHorizontalBar(java.awt.geom.RectangularShape, double, double, double)",
      "begin_line": 322,
      "end_line": 338,
      "comment": "\r\n     * Splits a bar into subregions (elsewhere, these subregions will have\r\n     * different gradients applied to them).\r\n     *\r\n     * @param bar  the bar shape.\r\n     * @param a  the first division.\r\n     * @param b  the second division.\r\n     * @param c  the third division.\r\n     *\r\n     * @return An array containing four subregions.\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 50)",
        "(line 325,col 9)-(line 325,col 34)",
        "(line 326,col 9)-(line 326,col 58)",
        "(line 327,col 9)-(line 327,col 58)",
        "(line 328,col 9)-(line 328,col 58)",
        "(line 329,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 334,col 25)",
        "(line 335,col 9)-(line 336,col 36)",
        "(line 337,col 9)-(line 337,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.equals(java.lang.Object)",
      "begin_line": 347,
      "end_line": 365,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the obj (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 59)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.GradientBarPainter.hashCode()",
      "begin_line": 372,
      "end_line": 378,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 22)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 53)",
        "(line 376,col 9)-(line 376,col 53)",
        "(line 377,col 9)-(line 377,col 20)"
      ]
    }
  ]
}