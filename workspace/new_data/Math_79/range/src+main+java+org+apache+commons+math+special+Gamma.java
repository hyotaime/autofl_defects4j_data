{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 336,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Gamma family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "GAMMA"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Euler-Mascheroni_constant\"\u003eEuler-Mascheroni constant\u003c/a\u003e\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 41,
      "end_line": 58,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " S limit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Gamma.Gamma()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.logGamma(double)",
      "begin_line": 94,
      "end_line": 114,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 97,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 157,
      "end_line": 194,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     * Incomplete Gamma Function\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     * Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 19)",
        "(line 165,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 232,
      "end_line": 268,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"    http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     * Regularized incomplete gamma function: Continued fraction representations  (formula 06.08.10.0003)\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 19)",
        "(line 240,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-5057750e-cb4b-4485-a9c9-74dcc55051d1.getA(int, double)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 21)-(line 254,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-e724717b-d8b4-4fa6-a703-e4522c5117ab.getB(int, double)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 21)-(line 259,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.digamma(double)",
      "begin_line": 291,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x  the argument\n     * @return   digamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003e Digamma at wikipedia \u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003e Bernardo\u0027s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.trigamma(double)",
      "begin_line": 320,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eComputes the trigamma function of x.  This function is derived by taking the derivative of\n     * the implementation of digamma.\u003c/p\u003e\n     *\n     * @param x  the argument\n     * @return   trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003e Trigamma at wikipedia \u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 334,col 45)"
      ]
    }
  ]
}