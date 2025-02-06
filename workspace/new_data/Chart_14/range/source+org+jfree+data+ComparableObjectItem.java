{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/ComparableObjectItem.java",
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
      "end_line": 190,
      "comment": "\r\n * Represents one (Comparable, Object) data item for use in a \r\n * {@link ComparableObjectSeries}.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The x-value. "
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The y-value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.ComparableObjectItem.ComparableObjectItem(java.lang.Comparable, java.lang.Object)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 19)",
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.getComparable()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.getObject()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.setObject(java.lang.Object)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no \r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.compareTo(java.lang.Object)",
      "begin_line": 119,
      "end_line": 139,
      "comment": "\r\n     * Returns an integer indicating the order of this object relative to \r\n     * another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the x-value:\r\n     * negative \u003d\u003d \"less-than\", zero \u003d\u003d \"equal\", positive \u003d\u003d \"greater-than\".\r\n     *\r\n     * @param o1  the object being compared to.\r\n     *\r\n     * @return An integer indicating the order of this data pair object\r\n     *      relative to another object.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 19)",
        "(line 125,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.clone()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but \r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.equals(java.lang.Object)",
      "begin_line": 161,
      "end_line": 176,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the object to test against for equality (\u003ccode\u003enull\u003c/code\u003e\r\n     *             permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 63)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.ComparableObjectItem.hashCode()",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 19)",
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 186,col 76)",
        "(line 187,col 9)-(line 187,col 22)"
      ]
    }
  ]
}