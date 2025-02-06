{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/DefaultKeyedValue.java",
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
      "end_line": 178,
      "comment": "\r\n * A (key, value) pair.  This class provides a default implementation \r\n * of the {@link KeyedValue} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValue.DefaultKeyedValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\r\n     * Creates a new (key, value) item.\r\n     *\r\n     * @param key  the key (should be immutable, \u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 6)-(line 83,col 6)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getKey()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the key.\r\n     *\r\n     * @return The key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getValue()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.setValue(java.lang.Number)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Sets the value.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.equals(java.lang.Object)",
      "begin_line": 122,
      "end_line": 139,
      "comment": "\r\n     * Tests this key-value pair for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 57)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.hashCode()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 19)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 149,col 9)-(line 149,col 80)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.clone()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\r\n     * Returns a clone.  It is assumed that both the key and value are \r\n     * immutable objects, so only the references are cloned, not the objects \r\n     * themselves.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException Not thrown by this class, but \r\n     *         subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 68)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.toString()",
      "begin_line": 174,
      "end_line": 176,
      "comment": " \r\n     * Returns a string representing this instance, primarily useful for \r\n     * debugging.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 78)"
      ]
    }
  ]
}