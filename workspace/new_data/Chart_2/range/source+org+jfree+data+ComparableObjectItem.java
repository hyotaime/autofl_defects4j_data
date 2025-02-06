{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/ComparableObjectItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComparableObjectItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 191,
      "comment": "\r\n * Represents one (Comparable, Object) data item for use in a\r\n * {@link ComparableObjectSeries}.\r\n *\r\n * @since 1.0.3\r\n "
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
        "x"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The x-value. "
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The y-value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.ComparableObjectItem.ComparableObjectItem(java.lang.Comparable, java.lang.Object)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 19)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.getComparable()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.getObject()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.setObject(java.lang.Object)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no\r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.compareTo(java.lang.Object)",
      "begin_line": 120,
      "end_line": 140,
      "comment": "\r\n     * Returns an integer indicating the order of this object relative to\r\n     * another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the x-value:\r\n     * negative \u003d\u003d \"less-than\", zero \u003d\u003d \"equal\", positive \u003d\u003d \"greater-than\".\r\n     *\r\n     * @param o1  the object being compared to.\r\n     *\r\n     * @return An integer indicating the order of this data pair object\r\n     *      relative to another object.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)",
        "(line 126,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.clone()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but\r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.equals(java.lang.Object)",
      "begin_line": 162,
      "end_line": 177,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the object to test against for equality (\u003ccode\u003enull\u003c/code\u003e\r\n     *             permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 63)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.hashCode()",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 19)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 188,col 22)"
      ]
    }
  ]
}