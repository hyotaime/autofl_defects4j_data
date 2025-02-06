{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/DefaultKeyedValue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValue",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.KeyedValue",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 177,
      "comment": "\r\n * A (key, value) pair.  This class provides a default implementation\r\n * of the {@link KeyedValue} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValue.DefaultKeyedValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\r\n     * Creates a new (key, value) item.\r\n     *\r\n     * @param key  the key (should be immutable, \u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getKey()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the key.\r\n     *\r\n     * @return The key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getValue()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.setValue(java.lang.Number)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Sets the value.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.equals(java.lang.Object)",
      "begin_line": 121,
      "end_line": 138,
      "comment": "\r\n     * Tests this key-value pair for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.hashCode()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 19)",
        "(line 147,col 9)-(line 147,col 62)",
        "(line 148,col 9)-(line 148,col 80)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.clone()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\r\n     * Returns a clone.  It is assumed that both the key and value are\r\n     * immutable objects, so only the references are cloned, not the objects\r\n     * themselves.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException Not thrown by this class, but\r\n     *         subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 68)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.toString()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns a string representing this instance, primarily useful for\r\n     * debugging.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 78)"
      ]
    }
  ]
}