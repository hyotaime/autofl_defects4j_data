{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/function/PolynomialFunction2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction2D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.function.Function2D",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 131,
      "comment": "\n * A function in the form \u003ccode\u003ey \u003d a0 + a1 * x + a2 * x^2 + ... + an *\n * x^n\u003c/code\u003e.  Instances of this class are immutable.\n *\n * @since 1.0.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The coefficients. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.function.PolynomialFunction2D.PolynomialFunction2D(double[])",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * Constructs a new polynomial function \u003ccode\u003ey \u003d a0 + a1 * x + a2 * x^2 +\n     * ... + an * x^n\u003c/code\u003e\n     *\n     * @param coefficients  an array with the coefficients [a0, a1, ..., an]\n     *         (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.PolynomialFunction2D.getCoefficients()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns a copy of the coefficients array that was specified in the\n     * constructor.\n     *\n     * @return The coefficients array.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.PolynomialFunction2D.getOrder()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Returns the order of the polynomial.\n     *\n     * @return The order.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.PolynomialFunction2D.getValue(double)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * Returns the function value.\n     *\n     * @param x  the x-value.\n     *\n     * @return The value.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.PolynomialFunction2D.equals(java.lang.Object)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Tests this function for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 63)",
        "(line 119,col 9)-(line 119,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.PolynomialFunction2D.hashCode()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 71)"
      ]
    }
  ]
}