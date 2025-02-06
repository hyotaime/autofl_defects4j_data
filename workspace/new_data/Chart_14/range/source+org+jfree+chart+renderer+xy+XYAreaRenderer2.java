{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYAreaRenderer2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYAreaRenderer2",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 116,
      "end_line": 447,
      "comment": "\r\n * Area item renderer for an {@link XYPlot}.  \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "showOutline"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " A flag that controls whether or not the outline is shown. "
    },
    {
      "type": "field",
      "varNames": [
        "legendArea"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " \r\n     * The shape used to represent an area in each legend item (this should \r\n     * never be \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.XYAreaRenderer2()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.XYAreaRenderer2(org.jfree.chart.labels.XYToolTipGenerator, org.jfree.chart.urls.XYURLGenerator)",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\r\n     * Constructs a new renderer.\r\n     *\r\n     * @param labelGenerator  the tool tip generator to use.  \u003ccode\u003enull\u003c/code\u003e \r\n     *                        is none.\r\n     * @param urlGenerator  the URL generator (null permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 16)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 48)",
        "(line 153,col 9)-(line 153,col 42)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 32)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.isOutline()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns a flag that controls whether or not outlines of the areas are \r\n     * drawn.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setOutline(boolean)\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.setOutline(boolean)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\r\n     * Sets a flag that controls whether or not outlines of the areas are \r\n     * drawn, and sends a {@link RendererChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param show  the flag.\r\n     * \r\n     * @see #isOutline()\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 187,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.getLegendArea()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the shape used to represent an area in the legend.\r\n     * \r\n     * @return The legend area (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendArea(Shape)\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.setLegendArea(java.awt.Shape)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\r\n     * Sets the shape used as an area in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendArea()\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 31)",
        "(line 214,col 9)-(line 214,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.getLegendItem(int, int)",
      "begin_line": 226,
      "end_line": 255,
      "comment": "\r\n     * Returns a default legend item for the specified series.  Subclasses \r\n     * should override this method to generate customised items.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 34)",
        "(line 229,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 275,
      "end_line": 382,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 52)",
        "(line 293,col 9)-(line 293,col 52)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 301,col 41)",
        "(line 305,col 9)-(line 305,col 69)",
        "(line 306,col 9)-(line 306,col 69)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 313,col 41)",
        "(line 315,col 9)-(line 315,col 53)",
        "(line 316,col 9)-(line 317,col 32)",
        "(line 318,col 9)-(line 319,col 32)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 324,col 42)",
        "(line 325,col 9)-(line 326,col 41)",
        "(line 328,col 9)-(line 329,col 41)",
        "(line 330,col 9)-(line 330,col 31)",
        "(line 331,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 60)",
        "(line 357,col 9)-(line 357,col 49)",
        "(line 358,col 9)-(line 358,col 52)",
        "(line 359,col 9)-(line 359,col 27)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 364,col 9)-(line 364,col 25)",
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 66)",
        "(line 373,col 9)-(line 373,col 63)",
        "(line 374,col 9)-(line 375,col 63)",
        "(line 377,col 9)-(line 377,col 64)",
        "(line 378,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.equals(java.lang.Object)",
      "begin_line": 391,
      "end_line": 406,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 53)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.clone()",
      "begin_line": 415,
      "end_line": 419,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 64)",
        "(line 417,col 9)-(line 417,col 65)",
        "(line 418,col 9)-(line 418,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.readObject(java.io.ObjectInputStream)",
      "begin_line": 429,
      "end_line": 433,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 35)",
        "(line 432,col 9)-(line 432,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYAreaRenderer2.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 36)",
        "(line 444,col 9)-(line 444,col 60)"
      ]
    }
  ]
}