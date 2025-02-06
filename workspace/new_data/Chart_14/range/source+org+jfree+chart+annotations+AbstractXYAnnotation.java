{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/AbstractXYAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.XYAnnotation"
      ],
      "begin_line": 61,
      "end_line": 206,
      "comment": "\r\n * The interface that must be supported by annotations that are to be added to \r\n * an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The tool tip text. "
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The URL. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.AbstractXYAnnotation()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\r\n     * Creates a new instance that has no tool tip or URL specified.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 32)",
        "(line 74,col 9)-(line 74,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.getToolTipText()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the tool tip text for the annotation.  This will be displayed in\r\n     * a {@link org.jfree.chart.ChartPanel} when the mouse pointer hovers over \r\n     * the annotation.\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipText(String)\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.setToolTipText(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Sets the tool tip text for the annotation.\r\n     * \r\n     * @param text  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipText()\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.getURL()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns the URL for the annotation.  This URL will be used to provide\r\n     * hyperlinks when an HTML image map is created for the chart.\r\n     * \r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURL(String)\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.setURL(java.lang.String)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Sets the URL for the annotation.\r\n     * \r\n     * @param url  the URL (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURL()\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.addEntity(org.jfree.chart.plot.PlotRenderingInfo, java.awt.Shape, int, java.lang.String, java.lang.String)",
      "begin_line": 151,
      "end_line": 164,
      "comment": "\r\n     * A utility method for adding an {@link XYAnnotationEntity} to \r\n     * a {@link PlotRenderingInfo} instance.\r\n     * \r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param hotspot  the hotspot area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 74)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 162,col 53)",
        "(line 163,col 9)-(line 163,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.equals(java.lang.Object)",
      "begin_line": 173,
      "end_line": 188,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 63)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.hashCode()",
      "begin_line": 195,
      "end_line": 204,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 25)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    }
  ]
}