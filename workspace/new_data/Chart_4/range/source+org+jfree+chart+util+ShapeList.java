{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/ShapeList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShapeList",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.AbstractObjectList"
      ],
      "begin_line": 53,
      "end_line": 178,
      "comment": "\n * A table of {@link Shape} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ShapeList.ShapeList()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates a new list.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.getShape(int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns a {@link Shape} object from the list.\n     *\n     * @param index the index (zero-based).\n     *\n     * @return The object.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.setShape(int, java.awt.Shape)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Sets the {@link Shape} for an item in the list.  The list is expanded\n     * if necessary.\n     *\n     * @param index  the index (zero-based).\n     * @param shape  the {@link Shape}.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.clone()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns an independent copy of the list.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if an item in the list does not\n     *         support cloning.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.equals(java.lang.Object)",
      "begin_line": 103,
      "end_line": 120,
      "comment": "\n     * Tests the list for equality with another object (typically also a list).\n     *\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 30)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.hashCode()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 138,
      "end_line": 154,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 27)",
        "(line 142,col 9)-(line 142,col 31)",
        "(line 143,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.readObject(java.io.ObjectInputStream)",
      "begin_line": 164,
      "end_line": 176,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 174,col 9)"
      ]
    }
  ]
}