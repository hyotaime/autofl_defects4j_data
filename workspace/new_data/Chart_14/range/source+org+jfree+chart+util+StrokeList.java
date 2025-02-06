{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/StrokeList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrokeList",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.AbstractObjectList"
      ],
      "begin_line": 52,
      "end_line": 175,
      "comment": "\n * A table of {@link Stroke} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.StrokeList.StrokeList()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates a new list.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.getStroke(int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns a {@link Stroke} object from the list.\n     *\n     * @param index the index (zero-based).\n     *\n     * @return The object.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.setStroke(int, java.awt.Stroke)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Sets the {@link Stroke} for an item in the list.  The list is expanded \n     * if necessary.\n     *\n     * @param index  the index (zero-based).\n     * @param stroke  the {@link Stroke}.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.clone()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Returns an independent copy of the list.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if an item in the list cannot be cloned.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 117,
      "comment": "\n     * Tests the list for equality with another object (typically also a list).\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.hashCode()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 135,
      "end_line": 151,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 31)",
        "(line 140,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeList.readObject(java.io.ObjectInputStream)",
      "begin_line": 161,
      "end_line": 173,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 35)",
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 171,col 9)"
      ]
    }
  ]
}