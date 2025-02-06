{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/IntervalMarker.java",
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
      "end_line": 233,
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
      "signature": "org.jfree.chart.plot.IntervalMarker.IntervalMarker(double, double, java.awt.Paint)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Creates a new interval marker with the specified range and fill paint.\r\n     * The outline paint and stroke default to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param start  the lower bound of the interval.\r\n     * @param end  the upper bound of the interval.\r\n     * @param paint  the fill paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.IntervalMarker.IntervalMarker(double, double, java.awt.Paint, java.awt.Stroke, java.awt.Paint, java.awt.Stroke, float)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "\r\n     * Constructs an interval marker.\r\n     *\r\n     * @param start  the start of the interval.\r\n     * @param end  the end of the interval.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlinePaint  the outline paint.\r\n     * @param outlineStroke  the outline stroke.\r\n     * @param alpha  the alpha transparency.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 65)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 28)",
        "(line 120,col 9)-(line 120,col 45)",
        "(line 121,col 9)-(line 121,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getStartValue()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the start value for the interval.\r\n     *\r\n     * @return The start value.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setStartValue(double)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\r\n     * Sets the start value for the marker and sends a\r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 32)",
        "(line 144,col 9)-(line 144,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getEndValue()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the end value for the interval.\r\n     *\r\n     * @return The end value.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setEndValue(double)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\r\n     * Sets the end value for the marker and sends a\r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 30)",
        "(line 166,col 9)-(line 166,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.getGradientPaintTransformer()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns the gradient paint transformer.\r\n     *\r\n     * @return The gradient paint transformer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 184,
      "end_line": 188,
      "comment": "\r\n     * Sets the gradient paint transformer and sends a\r\n     * {@link MarkerChangeEvent} to all registered listeners.\r\n     *\r\n     * @param transformer  the transformer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 187,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.equals(java.lang.Object)",
      "begin_line": 197,
      "end_line": 219,
      "comment": "\r\n     * Tests the marker for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.IntervalMarker.clone()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns a clone of the marker.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException Not thrown by this class, but the\r\n     *         exception is declared for the use of subclasses.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)"
      ]
    }
  ]
}