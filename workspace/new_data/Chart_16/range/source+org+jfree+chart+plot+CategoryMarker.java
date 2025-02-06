{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/CategoryMarker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryMarker",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Marker",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 186,
      "comment": "\r\n * A marker for a category.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * Note that for serialization to work correctly, the category key must be an\r\n * instance of a serializable class.\r\n * \r\n * @see CategoryPlot#addDomainMarker(CategoryMarker)\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The category key. "
    },
    {
      "type": "field",
      "varNames": [
        "drawAsLine"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " \r\n     * A hint that the marker should be drawn as a line rather than a region. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryMarker.CategoryMarker(java.lang.Comparable)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Creates a new category marker for the specified category.\r\n     * \r\n     * @param key  the category key.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryMarker.CategoryMarker(java.lang.Comparable, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Creates a new category marker.\r\n     * \r\n     * @param key  the key.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.CategoryMarker.CategoryMarker(java.lang.Comparable, java.awt.Paint, java.awt.Stroke, java.awt.Paint, java.awt.Stroke, float)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\r\n     * Creates a new category marker.\r\n     * \r\n     * @param key  the key.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param alpha  the alpha transparency.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 65)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryMarker.getKey()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the key.\r\n     * \r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryMarker.setKey(java.lang.Comparable)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\r\n     * Sets the key and sends a {@link MarkerChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 23)",
        "(line 134,col 9)-(line 134,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryMarker.getDrawAsLine()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the flag that controls whether the marker is drawn as a region \r\n     * or a line.\r\n     * \r\n     * @return A line.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryMarker.setDrawAsLine(boolean)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Sets the flag that controls whether the marker is drawn as a region or\r\n     * as a line, and sends a {@link MarkerChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param drawAsLine  the flag.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 37)",
        "(line 156,col 9)-(line 156,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.CategoryMarker.equals(java.lang.Object)",
      "begin_line": 166,
      "end_line": 184,
      "comment": "\r\n     * Tests the marker for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 51)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    }
  ]
}