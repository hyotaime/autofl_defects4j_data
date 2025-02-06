{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ChartRenderingInfo.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartRenderingInfo",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 80,
      "end_line": 296,
      "comment": "\r\n * A structure for storing rendering information from one call to the\r\n * JFreeChart.draw() method.\r\n * \u003cP\u003e\r\n * An instance of the {@link JFreeChart} class can draw itself within an\r\n * arbitrary rectangle on any \u003ccode\u003eGraphics2D\u003c/code\u003e.  It is assumed that\r\n * client code will sometimes render the same chart in more than one view, so\r\n * the {@link JFreeChart} instance does not retain any information about its\r\n * rendered dimensions.  This information can be useful sometimes, so you have\r\n * the option to collect the information at each call to\r\n * \u003ccode\u003eJFreeChart.draw()\u003c/code\u003e, by passing an instance of this\r\n * \u003ccode\u003eChartRenderingInfo\u003c/code\u003e class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "chartArea"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The area in which the chart is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "plotInfo"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Rendering info for the chart\u0027s plot (and subplots, if any). "
    },
    {
      "type": "field",
      "varNames": [
        "entities"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * Storage for the chart entities.  Since retaining entity information for\r\n     * charts with a large number of data points consumes a lot of memory, it\r\n     * is intended that you can set this to \u003ccode\u003enull\u003c/code\u003e to prevent the\r\n     * information being collected.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "renderingSource"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\r\n     * The rendering source.  This is the object that calls the draw(...)\r\n     * method in the {@link JFreeChart} class, or \u003ccode\u003enull\u003c/code\u003e if the\r\n     * rendering source chooses to remain anonymous.  Our initial use for\r\n     * this is to identify the {@link ChartPanel} that is drawing a chart, so\r\n     * that selection state info can be retrieved from the panel in some\r\n     * cases.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartRenderingInfo.ChartRenderingInfo()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Constructs a new ChartRenderingInfo structure that can be used to\r\n     * collect information about the dimensions of a rendered chart.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.ChartRenderingInfo.ChartRenderingInfo(org.jfree.chart.entity.EntityCollection)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\r\n     * Constructs a new instance. If an entity collection is supplied, it will\r\n     * be populated with information about the entities in a chart.  If it is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no entity information (including tool tips) will\r\n     * be collected.\r\n     *\r\n     * @param entities  an entity collection (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)",
        "(line 129,col 9)-(line 129,col 52)",
        "(line 130,col 9)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getChartArea()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the area in which the chart was drawn.\r\n     *\r\n     * @return The area in which the chart was drawn.\r\n     *\r\n     * @see #setChartArea(Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.setChartArea(java.awt.geom.Rectangle2D)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Sets the area in which the chart was drawn.\r\n     *\r\n     * @param area  the chart area.\r\n     *\r\n     * @see #getChartArea()\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getEntityCollection()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the collection of entities maintained by this instance.\r\n     *\r\n     * @return The entity collection (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setEntityCollection(EntityCollection)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.setEntityCollection(org.jfree.chart.entity.EntityCollection)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Sets the entity collection.\r\n     *\r\n     * @param entities  the entity collection (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getEntityCollection()\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getRenderingSource()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the rendering source, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The rendering source (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderingSource(org.jfree.chart.RenderingSource)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.setRenderingSource(org.jfree.chart.RenderingSource)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Sets the rendering source.\r\n     *\r\n     * @param source  the source (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderingSource()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.clear()",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\r\n     * Clears the information recorded by this object, but not the\r\n     * rendering source.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.getPlotInfo()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Returns the rendering info for the chart\u0027s plot.\r\n     *\r\n     * @return The rendering info for the plot.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.equals(java.lang.Object)",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.clone()",
      "begin_line": 258,
      "end_line": 268,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 70)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartRenderingInfo.readObject(java.io.ObjectInputStream)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 35)",
        "(line 293,col 9)-(line 293,col 73)"
      ]
    }
  ]
}