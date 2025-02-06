{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/IntervalMarker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalMarker",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Marker",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 219,
      "comment": "\r\n * Represents an interval to be highlighted in some way.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "startValue"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The start value. "
    },
    {
      "type": "field",
      "varNames": [
        "endValue"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The end value. "
    },
    {
      "type": "field",
      "varNames": [
        "gradientPaintTransformer"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The gradient paint transformer (optional). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.IntervalMarker.IntervalMarker(double, double)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\r\n     * Constructs an interval marker.\r\n     *\r\n     * @param start  the start of the interval.\r\n     * @param end  the end of the interval.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.IntervalMarker.IntervalMarker(double, double, java.awt.Paint, java.awt.Stroke, java.awt.Paint, java.awt.Stroke, float)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\r\n     * Constructs an interval marker.\r\n     *\r\n     * @param start  the start of the interval.\r\n     * @param end  the end of the interval.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     * @param outlinePaint  the outline paint.\r\n     * @param outlineStroke  the outline stroke.\r\n     * @param alpha  the alpha transparency.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 65)",
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 105,col 28)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 107,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getStartValue()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the start value for the interval.\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setStartValue(double)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\r\n     * Sets the start value for the marker and sends a \r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getEndValue()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Returns the end value for the interval.\r\n     *\r\n     * @return The end value.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setEndValue(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\r\n     * Sets the end value for the marker and sends a \r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     * \r\n     * @param value  the value.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getGradientPaintTransformer()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the gradient paint transformer.\r\n     * \r\n     * @return The gradient paint transformer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\r\n     * Sets the gradient paint transformer and sends a \r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     * \r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 52)",
        "(line 173,col 9)-(line 173,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.equals(java.lang.Object)",
      "begin_line": 183,
      "end_line": 205,
      "comment": "\r\n     * Tests the marker for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.clone()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns a clone of the marker.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException Not thrown by this class, but the \r\n     *         exception is declared for the use of subclasses.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 29)"
      ]
    }
  ]
}