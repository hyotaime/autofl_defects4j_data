{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/function/NormalDistributionFunction2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionFunction2D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.function.Function2D",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 149,
      "comment": "\r\n * A normal distribution function.  See\r\n * http://en.wikipedia.org/wiki/Normal_distribution.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The mean. "
    },
    {
      "type": "field",
      "varNames": [
        "std"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "factor"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Precomputed factor for the function value. "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Precomputed denominator for the function value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.NormalDistributionFunction2D(double, double)",
      "begin_line": 75,
      "end_line": 84,
      "comment": "\r\n     * Constructs a new normal distribution function.\r\n     *\r\n     * @param mean  the mean.\r\n     * @param std  the standard deviation (\u003e 0).\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.getMean()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the mean for the function.\r\n     *\r\n     * @return The mean.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.getStandardDeviation()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the standard deviation for the function.\r\n     *\r\n     * @return The standard deviation.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.getValue(double)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\r\n     * Returns the function value.\r\n     *\r\n     * @param x  the x-value.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 33)",
        "(line 113,col 9)-(line 113,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.equals(java.lang.Object)",
      "begin_line": 123,
      "end_line": 135,
      "comment": "\r\n     * Tests this function for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 79)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.function.NormalDistributionFunction2D.hashCode()",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 145,col 9)-(line 145,col 58)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    }
  ]
}