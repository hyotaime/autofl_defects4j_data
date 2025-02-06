{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/AreaRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AreaRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 104,
      "end_line": 368,
      "comment": "\r\n * A category item renderer that draws area charts.  You can use this renderer\r\n * with the {@link CategoryPlot} class.  The example shown here is generated\r\n * by the \u003ccode\u003eAreaChartDemo1.java\u003c/code\u003e program included in the JFreeChart\r\n * Demo Collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/AreaRendererSample.png\"\r\n * alt\u003d\"AreaRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "endType"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " A flag that controls how the ends of the areas are drawn. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.AreaRenderer()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)",
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.getEndType()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns a token that controls how the renderer draws the end points.\r\n     * The default value is {@link AreaRendererEndType#TAPER}.\r\n     *\r\n     * @return The end type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setEndType\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.setEndType(org.jfree.chart.renderer.AreaRendererEndType)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\r\n     * Sets a token that controls how the renderer draws the end points, and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param type  the end type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getEndType()\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.getLegendItem(int, int)",
      "begin_line": 158,
      "end_line": 203,
      "comment": "\r\n     * Returns a legend item for a series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 173,col 24)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 48)",
        "(line 186,col 9)-(line 186,col 48)",
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 65)",
        "(line 190,col 9)-(line 191,col 68)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 57)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 45)",
        "(line 199,col 9)-(line 199,col 55)",
        "(line 200,col 9)-(line 200,col 38)",
        "(line 201,col 9)-(line 201,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 222,
      "end_line": 334,
      "comment": "\r\n     * Draw a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 60)",
        "(line 236,col 9)-(line 236,col 58)",
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 239,col 26)",
        "(line 240,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 243,col 26)",
        "(line 245,col 9)-(line 245,col 28)",
        "(line 246,col 9)-(line 246,col 28)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 249,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 25)",
        "(line 272,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 53)",
        "(line 283,col 9)-(line 283,col 72)",
        "(line 284,col 9)-(line 284,col 72)",
        "(line 285,col 9)-(line 285,col 72)",
        "(line 286,col 9)-(line 286,col 72)",
        "(line 287,col 9)-(line 287,col 28)",
        "(line 288,col 9)-(line 288,col 28)",
        "(line 289,col 9)-(line 289,col 57)",
        "(line 290,col 9)-(line 290,col 59)",
        "(line 292,col 9)-(line 292,col 45)",
        "(line 294,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 313,col 9)-(line 313,col 57)",
        "(line 314,col 9)-(line 314,col 22)",
        "(line 317,col 9)-(line 320,col 9)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 326,col 51)",
        "(line 329,col 9)-(line 329,col 64)",
        "(line 330,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.equals(java.lang.Object)",
      "begin_line": 343,
      "end_line": 355,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 47)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AreaRenderer.clone()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\r\n     * Returns an independent copy of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 29)"
      ]
    }
  ]
}