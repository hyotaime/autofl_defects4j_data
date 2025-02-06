{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/GrayPaintScale.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GrayPaintScale",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.PaintScale",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 171,
      "comment": "\r\n * A paint scale that returns shades of gray.\r\n * \r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.GrayPaintScale()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Creates a new \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance with default values.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.GrayPaintScale(double, double)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\r\n     * Creates a new paint scale for values in the specified range.\r\n     * \r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003elowerBound\u003c/code\u003e is not\r\n     *       less than \u003ccode\u003eupperBound\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getLowerBound()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the lower bound.\r\n     * \r\n     * @return The lower bound.\r\n     * \r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getUpperBound()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Returns the upper bound.\r\n     * \r\n     * @return The upper bound.\r\n     * \r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getPaint(double)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\r\n     * Returns a paint for the specified value.\r\n     * \r\n     * @param value  the value (must be within the range specified by the\r\n     *         lower and upper bounds for the scale).\r\n     * \r\n     * @return A paint for the specified value.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 52)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.equals(java.lang.Object)",
      "begin_line": 142,
      "end_line": 157,
      "comment": "\r\n     * Tests this \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only\r\n     * if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eGrayPaintScale\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 51)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.clone()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning this\r\n     *     instance.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 29)"
      ]
    }
  ]
}