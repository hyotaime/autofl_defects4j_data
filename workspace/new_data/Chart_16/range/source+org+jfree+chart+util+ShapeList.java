{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/util/ShapeList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShapeList",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.AbstractObjectList"
      ],
      "begin_line": 52,
      "end_line": 174,
      "comment": "\n * A table of {@link Shape} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ShapeList.ShapeList()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates a new list.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.getShape(int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns a {@link Shape} object from the list.\n     *\n     * @param index the index (zero-based).\n     *\n     * @return The object.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.setShape(int, java.awt.Shape)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Sets the {@link Shape} for an item in the list.  The list is expanded if necessary.\n     *\n     * @param index  the index (zero-based).\n     * @param shape  the {@link Shape}.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.clone()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns an independent copy of the list.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if an item in the list does not support cloning.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.equals(java.lang.Object)",
      "begin_line": 100,
      "end_line": 116,
      "comment": "\n     * Tests the list for equality with another object (typically also a list).\n     *\n     * @param obj  the other object.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.hashCode()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns a hash code value for the object.\n     *\n     * @return the hashcode\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 134,
      "end_line": 150,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 31)",
        "(line 139,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeList.readObject(java.io.ObjectInputStream)",
      "begin_line": 160,
      "end_line": 172,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 35)",
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 170,col 9)"
      ]
    }
  ]
}