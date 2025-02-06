{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/util/StrokeMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrokeMap",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 216,
      "comment": "\r\n * A storage structure that maps \u003ccode\u003eComparable\u003c/code\u003e instances with\r\n * \u003ccode\u003eStroke\u003c/code\u003e instances.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * To support cloning and serialization, you should only use keys that are\r\n * cloneable and serializable.  Special handling for the \u003ccode\u003eStroke\u003c/code\u003e\r\n * instances is included in this class.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "store"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Storage for the keys and values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.StrokeMap.StrokeMap()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Creates a new (empty) map.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.getStroke(java.lang.Comparable)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\r\n     * Returns the stroke associated with the specified key, or\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The stroke, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.containsKey(java.lang.Comparable)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the map contains the specified key, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.put(java.lang.Comparable, java.awt.Stroke)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\r\n     * Adds a mapping between the specified \u003ccode\u003ekey\u003c/code\u003e and\r\n     * \u003ccode\u003estroke\u003c/code\u003e values.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.clear()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Resets the map to empty.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.equals(java.lang.Object)",
      "begin_line": 139,
      "end_line": 161,
      "comment": "\r\n     * Tests this map for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.clone()",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eStrokeMap\u003c/code\u003e.\r\n     *\r\n     * @return A clone of this instance.\r\n     *\r\n     * @throws CloneNotSupportedException if any key is not cloneable.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 183,
      "end_line": 194,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 36)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 186,col 9)-(line 186,col 39)",
        "(line 187,col 9)-(line 187,col 44)",
        "(line 188,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.StrokeMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)",
        "(line 207,col 9)-(line 207,col 35)",
        "(line 208,col 9)-(line 208,col 40)",
        "(line 209,col 9)-(line 213,col 9)"
      ]
    }
  ]
}