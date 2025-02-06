{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/MeterInterval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeterInterval",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 227,
      "comment": "\r\n * An interval to be highlighted on a {@link MeterPlot}.  Instances of this\r\n * class are immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The interval label. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The interval range. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The outline paint (used for the arc marking the interval). "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The outline stroke (used for the arc marking the interval). "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The background paint for the interval. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterInterval.MeterInterval(java.lang.String, org.jfree.data.Range)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Creates a new interval.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterInterval.MeterInterval(java.lang.String, org.jfree.data.Range, java.awt.Paint, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 103,
      "end_line": 116,
      "comment": "\r\n     * Creates a new interval.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param outlinePaint  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param outlineStroke  the outline stroke (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param backgroundPaint  the background paint (\u003ccode\u003enull\u003c/code\u003e \r\n     *                         permitted).\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 27)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.getLabel()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the label.\r\n     * \r\n     * @return The label (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.getRange()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the range.\r\n     * \r\n     * @return The range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.getBackgroundPaint()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the background paint.  If \u003ccode\u003enull\u003c/code\u003e, the background\r\n     * should remain unfilled.\r\n     * \r\n     * @return The background paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.getOutlinePaint()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the outline paint.\r\n     * \r\n     * @return The outline paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.getOutlineStroke()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the outline stroke.\r\n     * \r\n     * @return The outline stroke (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.equals(java.lang.Object)",
      "begin_line": 171,
      "end_line": 195,
      "comment": "\r\n     * Checks this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 49)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)",
        "(line 206,col 9)-(line 206,col 62)",
        "(line 207,col 9)-(line 207,col 64)",
        "(line 208,col 9)-(line 208,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterInterval.readObject(java.io.ObjectInputStream)",
      "begin_line": 219,
      "end_line": 225,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 35)",
        "(line 222,col 9)-(line 222,col 62)",
        "(line 223,col 9)-(line 223,col 64)",
        "(line 224,col 9)-(line 224,col 65)"
      ]
    }
  ]
}