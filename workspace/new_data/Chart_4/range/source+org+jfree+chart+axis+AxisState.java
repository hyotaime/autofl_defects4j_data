{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/AxisState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AxisState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 193,
      "comment": "\r\n * Instances of this class are used to carry state information for an axis\r\n * during the drawing process.  By retaining this information in a separate\r\n * object, it is possible for multiple threads to draw the same axis to\r\n * different output targets (each drawing will maintain separate state\r\n * information).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "cursor"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The cursor position. "
    },
    {
      "type": "field",
      "varNames": [
        "ticks"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The axis ticks. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The maximum width/height. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.AxisState.AxisState()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Creates a new axis state.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.AxisState.AxisState(double)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\r\n     * Creates a new axis state.\r\n     *\r\n     * @param cursor  the cursor.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)",
        "(line 80,col 9)-(line 80,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.getCursor()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Returns the cursor position.\r\n     *\r\n     * @return The cursor position.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.setCursor(double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Sets the cursor position.\r\n     *\r\n     * @param cursor  the cursor position.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.moveCursor(double, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 107,
      "end_line": 120,
      "comment": "\r\n     * Moves the cursor outwards by the specified number of units.\r\n     *\r\n     * @param units  the units.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.cursorUp(double)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Moves the cursor up by the specified number of Java 2D units.\r\n     *\r\n     * @param units  the units.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.cursorDown(double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Moves the cursor down by the specified number of Java 2D units.\r\n     *\r\n     * @param units  the units.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.cursorLeft(double)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Moves the cursor left by the specified number of Java 2D units.\r\n     *\r\n     * @param units  the units.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.cursorRight(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\r\n     * Moves the cursor right by the specified number of Java 2D units.\r\n     *\r\n     * @param units  the units.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.getTicks()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the list of ticks.\r\n     *\r\n     * @return The list of ticks.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.setTicks(java.util.List)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Sets the list of ticks.\r\n     *\r\n     * @param ticks  the ticks.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.getMax()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Returns the maximum width/height.\r\n     *\r\n     * @return The maximum width/height.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.AxisState.setMax(double)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Sets the maximum width/height.\r\n     *\r\n     * @param max the maximum width/height.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 23)"
      ]
    }
  ]
}