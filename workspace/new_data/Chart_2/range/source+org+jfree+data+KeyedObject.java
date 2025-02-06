{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/KeyedObject.java",
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
      "begin_line": 54,
      "end_line": 150,
      "comment": "\r\n * A (key, object) pair.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The object. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObject.KeyedObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\r\n     * Creates a new (key, object) pair.\r\n     *\r\n     * @param key  the key.\r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 23)",
        "(line 73,col 9)-(line 73,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.getKey()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the key.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.getObject()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Returns the object.\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.setObject(java.lang.Object)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Sets the object.\r\n     *\r\n     * @param object  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.clone()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\r\n     * Returns a clone of this object.  It is assumed that the key is an\r\n     * immutable object, so it is not deep-cloned.  The object is deep-cloned\r\n     * if it implements {@link PublicCloneable}, otherwise a shallow clone is\r\n     * made.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObject.equals(java.lang.Object)",
      "begin_line": 129,
      "end_line": 148,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    }
  ]
}