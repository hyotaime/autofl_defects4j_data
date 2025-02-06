{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/StrokeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrokeMap",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 215,
      "comment": "\r\n * A storage structure that maps \u003ccode\u003eComparable\u003c/code\u003e instances with\r\n * \u003ccode\u003eStroke\u003c/code\u003e instances.  \r\n * \u003cbr\u003e\u003cbr\u003e\r\n * To support cloning and serialization, you should only use keys that are \r\n * cloneable and serializable.  Special handling for the \u003ccode\u003eStroke\u003c/code\u003e\r\n * instances is included in this class.\r\n * \r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "store"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Storage for the keys and values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.StrokeMap.StrokeMap()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Creates a new (empty) map.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.getStroke(java.lang.Comparable)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\r\n     * Returns the stroke associated with the specified key, or \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The stroke, or \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.containsKey(java.lang.Comparable)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @param key  the key.\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.put(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\r\n     * Adds a mapping between the specified \u003ccode\u003ekey\u003c/code\u003e and \r\n     * \u003ccode\u003estroke\u003c/code\u003e values.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.clear()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Resets the map to empty.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 160,
      "comment": "\r\n     * Tests this map for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 44)",
        "(line 151,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.clone()",
      "begin_line": 169,
      "end_line": 173,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eStrokeMap\u003c/code\u003e.\r\n     * \r\n     * @return A clone of this instance.\r\n     * \r\n     * @throws CloneNotSupportedException if any key is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 182,
      "end_line": 193,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 36)",
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 185,col 39)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.StrokeMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 203,
      "end_line": 213,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 35)",
        "(line 206,col 9)-(line 206,col 35)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 212,col 9)"
      ]
    }
  ]
}