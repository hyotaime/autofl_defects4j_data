{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/entity/XYAnnotationEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYAnnotationEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 115,
      "comment": "\r\n * A chart entity that represents an annotation on an\r\n * {@link org.jfree.chart.plot.XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "rendererIndex"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The renderer index. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.XYAnnotationEntity.XYAnnotationEntity(java.awt.Shape, int, java.lang.String, java.lang.String)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\r\n     * Creates a new entity.\r\n     *\r\n     * @param hotspot  the area.\r\n     * @param rendererIndex  the rendererIndex (zero-based index).\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text for HTML image maps.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 45)",
        "(line 70,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYAnnotationEntity.getRendererIndex()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n     * Returns the renderer index.\r\n     *\r\n     * @return The renderer index.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYAnnotationEntity.setRendererIndex(int)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Sets the renderer index.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYAnnotationEntity.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 113,
      "comment": "\r\n     * Tests the entity for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 59)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    }
  ]
}