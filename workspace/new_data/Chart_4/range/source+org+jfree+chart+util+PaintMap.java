{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/PaintMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PaintMap",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 221,
      "comment": "\r\n * A storage structure that maps \u003ccode\u003eComparable\u003c/code\u003e instances with\r\n * \u003ccode\u003ePaint\u003c/code\u003e instances.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * To support cloning and serialization, you should only use keys that are\r\n * cloneable and serializable.  Special handling for the \u003ccode\u003ePaint\u003c/code\u003e\r\n * instances is included in this class.\r\n *\r\n * @since 1.2.0\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "store"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Storage for the keys and values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.PaintMap.PaintMap()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n     * Creates a new (empty) map.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.getPaint(java.lang.Comparable)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\r\n     * Returns the paint associated with the specified key, or\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The paint, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.containsKey(java.lang.Comparable)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.put(java.lang.Comparable, java.awt.Paint)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\r\n     * Adds a mapping between the specified \u003ccode\u003ekey\u003c/code\u003e and\r\n     * \u003ccode\u003epaint\u003c/code\u003e values.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the paint.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.clear()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Resets the map to empty.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.equals(java.lang.Object)",
      "begin_line": 144,
      "end_line": 166,
      "comment": "\r\n     * Tests this map for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 39)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.clone()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003ePaintMap\u003c/code\u003e.\r\n     *\r\n     * @return A clone of this instance.\r\n     *\r\n     * @throws CloneNotSupportedException if any key is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 188,
      "end_line": 199,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 36)",
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 39)",
        "(line 192,col 9)-(line 192,col 44)",
        "(line 193,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.PaintMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 209,
      "end_line": 219,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 35)",
        "(line 212,col 9)-(line 212,col 35)",
        "(line 213,col 9)-(line 213,col 40)",
        "(line 214,col 9)-(line 218,col 9)"
      ]
    }
  ]
}