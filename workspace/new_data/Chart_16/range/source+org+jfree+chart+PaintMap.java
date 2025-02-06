{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/PaintMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintMap",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 220,
      "comment": "\r\n * A storage structure that maps \u003ccode\u003eComparable\u003c/code\u003e instances with\r\n * \u003ccode\u003ePaint\u003c/code\u003e instances.  \r\n * \u003cbr\u003e\u003cbr\u003e\r\n * To support cloning and serialization, you should only use keys that are \r\n * cloneable and serializable.  Special handling for the \u003ccode\u003ePaint\u003c/code\u003e\r\n * instances is included in this class.\r\n * \r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "store"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Storage for the keys and values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.PaintMap.PaintMap()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Creates a new (empty) map.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.getPaint(java.lang.Comparable)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\r\n     * Returns the paint associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The paint, or \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.containsKey(java.lang.Comparable)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param key  the key.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.put(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\r\n     * Adds a mapping between the specified \u003ccode\u003ekey\u003c/code\u003e and \r\n     * \u003ccode\u003epaint\u003c/code\u003e values.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.clear()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Resets the map to empty.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.equals(java.lang.Object)",
      "begin_line": 143,
      "end_line": 165,
      "comment": "\r\n     * Tests this map for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 39)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.clone()",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003ePaintMap\u003c/code\u003e.\r\n     * \r\n     * @return A clone of this instance.\r\n     * \r\n     * @throws CloneNotSupportedException if any key is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 187,
      "end_line": 198,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 36)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.PaintMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 211,col 35)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 213,col 9)-(line 217,col 9)"
      ]
    }
  ]
}