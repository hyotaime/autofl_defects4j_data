{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYBubbleRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYBubbleRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 91,
      "end_line": 353,
      "comment": "\r\n * A renderer that draws a circle at each data point with a diameter that is\r\n * determined by the z-value in the dataset (the renderer requires the dataset \r\n * to be an instance of {@link XYZDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_BOTH_AXES"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " \r\n     * A constant to specify that the bubbles drawn by this renderer should be \r\n     * scaled on both axes (see {@link #XYBubbleRenderer(int)}). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_DOMAIN_AXIS"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " \r\n     * A constant to specify that the bubbles drawn by this renderer should be \r\n     * scaled on the domain axis (see {@link #XYBubbleRenderer(int)}). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SCALE_ON_RANGE_AXIS"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " \r\n     * A constant to specify that the bubbles drawn by this renderer should be \r\n     * scaled on the range axis (see {@link #XYBubbleRenderer(int)}). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scaleType"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Controls how the width and height of the bubble are scaled. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.XYBubbleRenderer()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Constructs a new renderer.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.XYBubbleRenderer(int)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "\r\n     * Constructs a new renderer with the specified type of scaling. \r\n     *\r\n     * @param scaleType  the type of scaling (must be one of: \r\n     *        {@link #SCALE_ON_BOTH_AXES}, {@link #SCALE_ON_DOMAIN_AXIS}, \r\n     *        {@link #SCALE_ON_RANGE_AXIS}).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 16)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.getScaleType()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the scale type that was set when the renderer was constructed.\r\n     *\r\n     * @return The scale type (one of: {@link #SCALE_ON_BOTH_AXES}, \r\n     *         {@link #SCALE_ON_DOMAIN_AXIS}, {@link #SCALE_ON_RANGE_AXIS}).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 171,
      "end_line": 272,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the data is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain (horizontal) axis.\r\n     * @param rangeAxis  the range (vertical) axis.\r\n     * @param dataset  the dataset (an {@link XYZDataset} is expected).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 60)",
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 51)",
        "(line 186,col 9)-(line 186,col 30)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.getLegendItem(int, int)",
      "begin_line": 283,
      "end_line": 319,
      "comment": "\r\n     * Returns a legend item for the specified series.  The default method\r\n     * is overridden so that the legend displays circles for all series.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return A legend item for the series.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 32)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 58)",
        "(line 291,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.equals(java.lang.Object)",
      "begin_line": 328,
      "end_line": 340,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYBubbleRenderer.clone()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 29)"
      ]
    }
  ]
}