{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/PaintList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintList",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.AbstractObjectList"
      ],
      "begin_line": 53,
      "end_line": 166,
      "comment": "\n * A table of {@link Paint} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.PaintList.PaintList()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates a new list.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.getPaint(int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns a {@link Paint} object from the list.\n     *\n     * @param index the index (zero-based).\n     *\n     * @return The object.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.setPaint(int, java.awt.Paint)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the {@link Paint} for an item in the list.  The list is expanded \n     * if necessary.\n     *\n     * @param index  the index (zero-based).\n     * @param paint  the {@link Paint}.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.equals(java.lang.Object)",
      "begin_line": 91,
      "end_line": 108,
      "comment": "\n     * Tests the list for equality with another object (typically also a list).\n     *\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.hashCode()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 126,
      "end_line": 142,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintList.readObject(java.io.ObjectInputStream)",
      "begin_line": 152,
      "end_line": 164,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 35)",
        "(line 156,col 9)-(line 156,col 37)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    }
  ]
}