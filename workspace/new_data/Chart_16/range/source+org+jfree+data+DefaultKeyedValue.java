{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/DefaultKeyedValue.java",
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
      "begin_line": 58,
      "end_line": 176,
      "comment": "\r\n * A (key, value) pair.  This class provides a default implementation \r\n * of the {@link KeyedValue} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValue.DefaultKeyedValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\r\n     * Creates a new (key, value) item.\r\n     *\r\n     * @param key  the key (should be immutable).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 23)",
        "(line 79,col 9)-(line 79,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getKey()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the key.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.getValue()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.setValue(java.lang.Number)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Sets the value.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.equals(java.lang.Object)",
      "begin_line": 116,
      "end_line": 137,
      "comment": "\r\n     * Tests this key-value pair for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 57)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.hashCode()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 19)",
        "(line 146,col 9)-(line 146,col 62)",
        "(line 147,col 9)-(line 147,col 80)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.clone()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\r\n     * Returns a clone.  It is assumed that both the key and value are \r\n     * immutable objects, so only the references are cloned, not the objects \r\n     * themselves.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException Not thrown by this class, but \r\n     *         subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 68)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValue.toString()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " \r\n     * Returns a string representing this instance, primarily useful for \r\n     * debugging.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 78)"
      ]
    }
  ]
}