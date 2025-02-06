{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/XYDataItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDataItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 266,
      "comment": "\r\n * Represents one (x, y) data item for an {@link XYSeries}.\r\n "
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
      "comment": " The x-value (\u003ccode\u003enull\u003c/code\u003e not permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The y-value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDataItem.XYDataItem(java.lang.Number, java.lang.Number)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 19)",
        "(line 77,col 9)-(line 77,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDataItem.XYDataItem(double, double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getX()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getXValue()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\r\n     * Returns the x-value as a double primitive.\r\n     * \r\n     * @return The x-value.\r\n     * \r\n     * @see #getX()\r\n     * @see #getYValue()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getY()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getYValue()",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\r\n     * Returns the y-value as a double primitive.\r\n     * \r\n     * @return The y-value.\r\n     * \r\n     * @see #getY()\r\n     * @see #getXValue()\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.setY(double)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no \r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.setY(java.lang.Number)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no \r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.compareTo(java.lang.Object)",
      "begin_line": 173,
      "end_line": 205,
      "comment": "\r\n     * Returns an integer indicating the order of this object relative to \r\n     * another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the x-value:\r\n     * negative \u003d\u003d \"less-than\", zero \u003d\u003d \"equal\", positive \u003d\u003d \"greater-than\".\r\n     *\r\n     * @param o1  the object being compared to.\r\n     *\r\n     * @return An integer indicating the order of this data pair object\r\n     *      relative to another object.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 19)",
        "(line 179,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.clone()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but \r\n     *         subclasses may differ.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.equals(java.lang.Object)",
      "begin_line": 227,
      "end_line": 242,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the object to test against for equality (\u003ccode\u003enull\u003c/code\u003e\r\n     *             permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.hashCode()",
      "begin_line": 249,
      "end_line": 254,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 19)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 72)",
        "(line 253,col 9)-(line 253,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.toString()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Returns a string representing this instance, primarily for debugging\r\n     * use.\r\n     * \r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 60)"
      ]
    }
  ]
}