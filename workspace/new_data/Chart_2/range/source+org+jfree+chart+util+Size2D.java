{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/util/Size2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Size2D",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 167,
      "comment": "\n * A simple class for representing the dimensions of an object.  It would be\n * better to use \u003ccode\u003eDimension2D\u003c/code\u003e, but this class is broken on various\n * JDK releases (particularly JDK 1.3.1, refer to bugs 4189446 and 4976448 on\n * the Java bug parade).\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The width. "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The height. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.Size2D.Size2D()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Creates a new instance with zero width and height.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.Size2D.Size2D(double, double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Creates a new instance with the specified width and height.\n     *\n     * @param width  the width.\n     * @param height  the height.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 27)",
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.getWidth()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Returns the width.\n     *\n     * @return The width.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.setWidth(double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets the width.\n     *\n     * @param width  the width.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.getHeight()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the height.\n     *\n     * @return The height.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.setHeight(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Sets the height.\n     *\n     * @param height  the height.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.toString()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Returns a string representation of this instance, mostly used for\n     * debugging purposes.\n     *\n     * @return A string.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.equals(java.lang.Object)",
      "begin_line": 139,
      "end_line": 154,
      "comment": "\n     * Compares this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 41)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.Size2D.clone()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns a clone of this object.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if the object cannot be cloned.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)"
      ]
    }
  ]
}