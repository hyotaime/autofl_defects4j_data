{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/ValueMarker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueMarker",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Marker"
      ],
      "begin_line": 57,
      "end_line": 156,
      "comment": "\r\n * A marker that represents a single value.  Markers can be added to plots to\r\n * highlight specific values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ValueMarker.ValueMarker(double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\r\n     * Creates a new marker.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 16)",
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ValueMarker.ValueMarker(double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Creates a new marker.\r\n     *\r\n     * @param value  the value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ValueMarker.ValueMarker(double, java.awt.Paint, java.awt.Stroke, java.awt.Paint, java.awt.Stroke, float)",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\r\n     * Creates a new value marker.\r\n     *\r\n     * @param value  the value.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param alpha  the alpha transparency (in the range 0.0f to 1.0f).\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 65)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ValueMarker.getValue()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setValue(double)\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ValueMarker.setValue(double)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\r\n     * Sets the value for the marker and sends a {@link MarkerChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getValue()\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ValueMarker.equals(java.lang.Object)",
      "begin_line": 140,
      "end_line": 155,
      "comment": "\r\n     * Tests this marker for equality with an arbitrary object.  This method\r\n     * returns \u003ccode\u003etrue\u003c/code\u003e if:\r\n     *\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eValueMarker\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e has the same value as this marker;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003esuper.equals(obj)\u003c/code\u003e returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    }
  ]
}