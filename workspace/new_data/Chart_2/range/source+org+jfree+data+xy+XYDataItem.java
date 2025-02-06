{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYDataItem.java",
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
      "begin_line": 59,
      "end_line": 313,
      "comment": "\r\n * Represents one (x, y) data item for an {@link XYSeries}.  Note that\r\n * subclasses are REQUIRED to support cloning.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The x-value (\u003ccode\u003enull\u003c/code\u003e not permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The y-value. "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\r\n     * A flag that indicates whether or not the item is \"selected\".\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDataItem.XYDataItem(java.lang.Number, java.lang.Number)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e NOT permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 19)",
        "(line 88,col 9)-(line 88,col 19)",
        "(line 89,col 9)-(line 89,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDataItem.XYDataItem(double, double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Constructs a new data item.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getX()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the x-value.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getXValue()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\r\n     * Returns the x-value as a double primitive.\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @see #getX()\r\n     * @see #getYValue()\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getY()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.getYValue()",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\r\n     * Returns the y-value as a double primitive.\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @see #getY()\r\n     * @see #getXValue()\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.setY(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no\r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.setY(java.lang.Number)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Sets the y-value for this data item.  Note that there is no\r\n     * corresponding method to change the x-value.\r\n     *\r\n     * @param y  the new y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.isSelected()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the data item is selected, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setSelected(boolean)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.setSelected(boolean)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Sets the selection state for this item.\r\n     *\r\n     * @param selected  the new selection state.\r\n     *\r\n     * @see #isSelected()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.compareTo(java.lang.Object)",
      "begin_line": 212,
      "end_line": 244,
      "comment": "\r\n     * Returns an integer indicating the order of this object relative to\r\n     * another object.\r\n     * \u003cP\u003e\r\n     * For the order we consider only the x-value:\r\n     * negative \u003d\u003d \"less-than\", zero \u003d\u003d \"equal\", positive \u003d\u003d \"greater-than\".\r\n     *\r\n     * @param o1  the object being compared to.\r\n     *\r\n     * @return An integer indicating the order of this data pair object\r\n     *      relative to another object.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 19)",
        "(line 218,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.clone()",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 28)",
        "(line 253,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.equals(java.lang.Object)",
      "begin_line": 270,
      "end_line": 288,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the object to test against for equality (\u003ccode\u003enull\u003c/code\u003e\r\n     *             permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 43)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.hashCode()",
      "begin_line": 295,
      "end_line": 301,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 19)",
        "(line 297,col 9)-(line 297,col 35)",
        "(line 298,col 9)-(line 298,col 72)",
        "(line 299,col 9)-(line 299,col 63)",
        "(line 300,col 9)-(line 300,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataItem.toString()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Returns a string representing this instance, primarily for debugging\r\n     * use.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 60)"
      ]
    }
  ]
}