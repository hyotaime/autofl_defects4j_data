{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/ScatterRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScatterRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 552,
      "comment": "\n * A renderer that handles the multiple values from a \n * {@link MultiValueCategoryDataset} by plotting a shape for each value for \n * each given item in the dataset.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesShapesFilled"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * A table of flags that control (per series) whether or not shapes are\n     * filled.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseShapesFilled"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The default value returned by the getShapeFilled() method.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useFillPaint"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * A flag that controls whether the fill paint is used for filling\n     * shapes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawOutlines"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * A flag that controls whether outlines are drawn for shapes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useOutlinePaint"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * A flag that controls whether the outline paint is used for drawing shape\n     * outlines - if not, the regular series paint is used.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useSeriesOffset"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * A flag that controls whether or not the x-position for each item is\n     * offset within the category according to the series.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "itemMargin"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The item margin used for series offsetting - this allows the positioning\n     * to match the bar positions of the {@link BarRenderer} class.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.ScatterRenderer()",
      "begin_line": 122,
      "end_line": 130,
      "comment": "\n     * Constructs a new renderer.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 52)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getUseSeriesOffset()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns the flag that controls whether or not the x-position for each\n     * data item is offset within the category according to the series.\n     * \n     * @return A boolean.\n     * \n     * @see #setUseSeriesOffset(boolean)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setUseSeriesOffset(boolean)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Sets the flag that controls whether or not the x-position for each \n     * data item is offset within its category according to the series, and\n     * sends a {@link RendererChangeEvent} to all registered listeners.\n     * \n     * @param offset  the offset.\n     * \n     * @see #getUseSeriesOffset()\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)",
        "(line 155,col 9)-(line 155,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getItemMargin()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the item margin, which is the gap between items within a \n     * category (expressed as a percentage of the overall category width).  \n     * This can be used to match the offset alignment with the bars drawn by \n     * a {@link BarRenderer}).\n     * \n     * @return The item margin.\n     * \n     * @see #setItemMargin(double)\n     * @see #getUseSeriesOffset()\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setItemMargin(double)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Sets the item margin, which is the gap between items within a category\n     * (expressed as a percentage of the overall category width), and sends\n     * a {@link RendererChangeEvent} to all registered listeners.\n     * \n     * @param margin  the margin (0.0 \u003c\u003d margin \u003c 1.0).\n     * \n     * @see #getItemMargin()\n     * @see #getUseSeriesOffset()\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 33)",
        "(line 188,col 9)-(line 188,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getDrawOutlines()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if outlines should be drawn for shapes, and\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     *\n     * @return A boolean.\n     * \n     * @see #setDrawOutlines(boolean)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setDrawOutlines(boolean)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Sets the flag that controls whether outlines are drawn for\n     * shapes, and sends a {@link RendererChangeEvent} to all registered\n     * listeners.\n     * \u003cp/\u003e\n     * In some cases, shapes look better if they do NOT have an outline, but\n     * this flag allows you to set your own preference.\n     *\n     * @param flag the flag.\n     * \n     * @see #getDrawOutlines()\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 217,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getUseOutlinePaint()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Returns the flag that controls whether the outline paint is used for\n     * shape outlines.  If not, the regular series paint is used.\n     *\n     * @return A boolean.\n     * \n     * @see #setUseOutlinePaint(boolean)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setUseOutlinePaint(boolean)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Sets the flag that controls whether the outline paint is used for shape\n     * outlines.\n     *\n     * @param use the flag.\n     * \n     * @see #getUseOutlinePaint()\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getItemShapeFilled(int, int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Returns the flag used to control whether or not the shape for an item\n     * is filled. The default implementation passes control to the\n     * \u003ccode\u003egetSeriesShapesFilled\u003c/code\u003e method. You can override this method\n     * if you require different behaviour.\n     *\n     * @param series the series index (zero-based).\n     * @param item   the item index (zero-based).\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getSeriesShapesFilled(int)",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n     * Returns the flag used to control whether or not the shapes for a series\n     * are filled.\n     *\n     * @param series the series index (zero-based).\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setSeriesShapesFilled(int, java.lang.Boolean)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Sets the \u0027shapes filled\u0027 flag for a series.\n     *\n     * @param series the series index (zero-based).\n     * @param filled the flag.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 59)",
        "(line 287,col 9)-(line 287,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setSeriesShapesFilled(int, boolean)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * Sets the \u0027shapes filled\u0027 flag for a series.\n     *\n     * @param series the series index (zero-based).\n     * @param filled the flag.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 76)",
        "(line 298,col 9)-(line 298,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getBaseShapesFilled()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns the base \u0027shape filled\u0027 attribute.\n     *\n     * @return The base flag.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setBaseShapesFilled(boolean)",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Sets the base \u0027shapes filled\u0027 flag.\n     *\n     * @param flag the flag.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 317,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getUseFillPaint()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer should use the fill paint\n     * setting to fill shapes, and \u003ccode\u003efalse\u003c/code\u003e if it should just\n     * use the regular paint.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.setUseFillPaint(boolean)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * Sets the flag that controls whether the fill paint is used to fill\n     * shapes, and sends a {@link RendererChangeEvent} to all\n     * registered listeners.\n     *\n     * @param flag the flag.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 33)",
        "(line 340,col 9)-(line 340,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 357,
      "end_line": 420,
      "comment": "\n     * Draw a single data item.\n     *\n     * @param g2  the graphics device.\n     * @param state  the renderer state.\n     * @param dataArea  the area in which the data is drawn.\n     * @param plot  the plot.\n     * @param domainAxis  the domain axis.\n     * @param rangeAxis  the range axis.\n     * @param dataset  the dataset.\n     * @param row  the row index (zero-based).\n     * @param column  the column index (zero-based).\n     * @param pass  the pass index.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 369,col 9)-(line 369,col 74)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 39)",
        "(line 375,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.getLegendItem(int, int)",
      "begin_line": 430,
      "end_line": 473,
      "comment": "\n     * Returns a legend item for a series.\n     *\n     * @param datasetIndex  the dataset index (zero-based).\n     * @param series  the series index (zero-based).\n     *\n     * @return The legend item.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 36)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.equals(java.lang.Object)",
      "begin_line": 481,
      "end_line": 512,
      "comment": "\n     * Tests this renderer for equality with an arbitrary object.\n     *\n     * @param obj the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 53)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.clone()",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * Returns an independent copy of the renderer.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException  should not happen.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 64)",
        "(line 523,col 9)-(line 524,col 64)",
        "(line 525,col 9)-(line 525,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream the output stream.\n     * @throws java.io.IOException if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.ScatterRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream the input stream.\n     * @throws java.io.IOException    if there is an I/O error.\n     * @throws ClassNotFoundException if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 35)"
      ]
    }
  ]
}