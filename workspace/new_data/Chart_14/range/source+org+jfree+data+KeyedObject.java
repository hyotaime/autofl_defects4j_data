{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/KeyedObject.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 151,
      "comment": "\r\n * A (key, object) pair.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The object. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObject.KeyedObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\r\n     * Creates a new (key, object) pair.\r\n     *\r\n     * @param key  the key.\r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 74,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.getKey()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns the key.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.getObject()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the object.\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.setObject(java.lang.Object)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Sets the object.\r\n     *\r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.clone()",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\r\n     * Returns a clone of this object.  It is assumed that the key is an \r\n     * immutable object, so it is not deep-cloned.  The object is deep-cloned \r\n     * if it implements {@link PublicCloneable}, otherwise a shallow clone is \r\n     * made.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 56)",
        "(line 116,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.equals(java.lang.Object)",
      "begin_line": 130,
      "end_line": 149,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 20)"
      ]
    }
  ]
}