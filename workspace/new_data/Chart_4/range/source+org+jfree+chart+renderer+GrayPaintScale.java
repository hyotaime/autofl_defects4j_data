{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/GrayPaintScale.java",
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
      "begin_line": 59,
      "end_line": 230,
      "comment": "\r\n * A paint scale that returns shades of gray.\r\n *\r\n * @since 1.0.4\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\r\n     * The alpha transparency (0-255).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.GrayPaintScale()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n     * Creates a new \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance with default values.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.GrayPaintScale(double, double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Creates a new paint scale for values in the specified range.\r\n     *\r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003elowerBound\u003c/code\u003e is not\r\n     *       less than \u003ccode\u003eupperBound\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.GrayPaintScale(double, double, int)",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\r\n     * Creates a new paint scale for values in the specified range.\r\n     *\r\n     * @param lowerBound  the lower bound.\r\n     * @param upperBound  the upper bound.\r\n     * @param alpha  the alpha transparency (0-255).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003elowerBound\u003c/code\u003e is not\r\n     *       less than \u003ccode\u003eupperBound\u003c/code\u003e, or \u003ccode\u003ealpha\u003c/code\u003e is not in\r\n     *       the range 0 to 255.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getLowerBound()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the lower bound.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getUpperBound()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Returns the upper bound.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getAlpha()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the alpha transparency that was specified in the constructor.\r\n     *\r\n     * @return The alpha transparency (in the range 0 to 255).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.getPaint(double)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "\r\n     * Returns a paint for the specified value.\r\n     *\r\n     * @param value  the value (must be within the range specified by the\r\n     *         lower and upper bounds for the scale).\r\n     *\r\n     * @return A paint for the specified value.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 52)",
        "(line 166,col 9)-(line 166,col 41)",
        "(line 167,col 9)-(line 168,col 44)",
        "(line 169,col 9)-(line 169,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.equals(java.lang.Object)",
      "begin_line": 185,
      "end_line": 203,
      "comment": "\r\n     * Tests this \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only\r\n     * if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \u003ccode\u003eGrayPaintScale\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 51)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.hashCode()",
      "begin_line": 210,
      "end_line": 216,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 21)",
        "(line 212,col 9)-(line 212,col 61)",
        "(line 213,col 9)-(line 213,col 61)",
        "(line 214,col 9)-(line 214,col 38)",
        "(line 215,col 9)-(line 215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.GrayPaintScale.clone()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eGrayPaintScale\u003c/code\u003e instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning this\r\n     *     instance.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 29)"
      ]
    }
  ]
}