{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/XYDotRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDotRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 81,
      "end_line": 390,
      "comment": "\r\n * A renderer that draws a small dot at each data point for an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dotWidth"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The dot width. "
    },
    {
      "type": "field",
      "varNames": [
        "dotHeight"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The dot height. "
    },
    {
      "type": "field",
      "varNames": [
        "legendShape"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " \r\n     * The shape that is used to represent an item in the legend. \r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.XYDotRenderer()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 108,col 26)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 110,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.getDotWidth()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the dot width (the default value is 1).\r\n     * \r\n     * @return The dot width.\r\n     * \r\n     * @since 1.0.2\r\n     * @see #setDotWidth(int)\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.setDotWidth(int)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\r\n     * Sets the dot width and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param w  the new width (must be greater than zero).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ew\u003c/code\u003e is less than one.\r\n     * \r\n     * @since 1.0.2\r\n     * @see #getDotWidth()\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 141,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.getDotHeight()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the dot height (the default value is 1).\r\n     * \r\n     * @return The dot height.\r\n     * \r\n     * @since 1.0.2\r\n     * @see #setDotHeight(int)\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.setDotHeight(int)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\r\n     * Sets the dot height and sends a {@link RendererChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param h  the new height (must be greater than zero).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eh\u003c/code\u003e is less than one.\r\n     * \r\n     * @since 1.0.2\r\n     * @see #getDotHeight()\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.getLegendShape()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the shape used to represent an item in the legend.\r\n     * \r\n     * @return The legend shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLegendShape(Shape)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.setLegendShape(java.awt.Shape)",
      "begin_line": 198,
      "end_line": 204,
      "comment": "\r\n     * Sets the shape used as a line in each legend item and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLegendShape()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 33)",
        "(line 203,col 9)-(line 203,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 224,
      "end_line": 267,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain (horizontal) axis.\r\n     * @param rangeAxis  the range (vertical) axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)",
        "(line 239,col 9)-(line 239,col 51)",
        "(line 240,col 9)-(line 240,col 48)",
        "(line 241,col 9)-(line 241,col 49)",
        "(line 242,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.getLegendItem(int, int)",
      "begin_line": 277,
      "end_line": 317,
      "comment": "\r\n     * Returns a legend item for the specified series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 32)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 58)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.equals(java.lang.Object)",
      "begin_line": 333,
      "end_line": 351,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.  This method\r\n     * returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eXYDotRenderer\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth renderers have the same attribute values.\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 49)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.clone()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 372,
      "end_line": 376,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 35)",
        "(line 375,col 9)-(line 375,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYDotRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 36)",
        "(line 387,col 9)-(line 387,col 61)"
      ]
    }
  ]
}