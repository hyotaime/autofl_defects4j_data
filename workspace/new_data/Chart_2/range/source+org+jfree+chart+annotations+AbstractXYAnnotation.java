{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/AbstractXYAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractXYAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractAnnotation",
        "org.jfree.chart.annotations.XYAnnotation"
      ],
      "begin_line": 62,
      "end_line": 209,
      "comment": "\r\n * The interface that must be supported by annotations that are to be added to\r\n * an {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The tool tip text. "
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The URL. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.AbstractXYAnnotation()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\r\n     * Creates a new instance that has no tool tip or URL specified.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.getToolTipText()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns the tool tip text for the annotation.  This will be displayed in\r\n     * a {@link org.jfree.chart.ChartPanel} when the mouse pointer hovers over\r\n     * the annotation.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipText(String)\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.setToolTipText(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Sets the tool tip text for the annotation.\r\n     *\r\n     * @param text  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipText()\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.getURL()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the URL for the annotation.  This URL will be used to provide\r\n     * hyperlinks when an HTML image map is created for the chart.\r\n     *\r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURL(String)\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.setURL(java.lang.String)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Sets the URL for the annotation.\r\n     *\r\n     * @param url  the URL (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURL()\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  if supplied, this info object will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.addEntity(org.jfree.chart.plot.PlotRenderingInfo, java.awt.Shape, int, java.lang.String, java.lang.String)",
      "begin_line": 154,
      "end_line": 167,
      "comment": "\r\n     * A utility method for adding an {@link XYAnnotationEntity} to\r\n     * a {@link PlotRenderingInfo} instance.\r\n     *\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param hotspot  the hotspot area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 74)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.equals(java.lang.Object)",
      "begin_line": 176,
      "end_line": 191,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 63)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.AbstractXYAnnotation.hashCode()",
      "begin_line": 198,
      "end_line": 207,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 25)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    }
  ]
}