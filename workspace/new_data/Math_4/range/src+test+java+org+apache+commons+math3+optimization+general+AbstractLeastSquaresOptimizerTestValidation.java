{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/general/AbstractLeastSquaresOptimizerTestValidation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizerTestValidation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 299,
      "comment": "\n * This class demonstrates the main functionality of the\n * {@link AbstractLeastSquaresOptimizer}, common to the\n * optimizer implementations in package\n * {@link org.apache.commons.math3.optimization.general}.\n * \u003cbr/\u003e\n * Not enabled by default, as the class name does not end with \"Test\".\n * \u003cbr/\u003e\n * Invoke by running\n * \u003cpre\u003e\u003ccode\u003e\n *  mvn test -Dtest\u003dAbstractLeastSquaresOptimizerTestValidation\n * \u003c/code\u003e\u003c/pre\u003e\n * or by running\n * \u003cpre\u003e\u003ccode\u003e\n *  mvn test -Dtest\u003dAbstractLeastSquaresOptimizerTestValidation -DargLine\u003d\"-DmcRuns\u003d1234 -server\"\n * \u003c/code\u003e\u003c/pre\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "MONTE_CARLO_RUNS"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloObservations()",
      "begin_line": 63,
      "end_line": 158,
      "comment": "\n     * Using a Monte-Carlo procedure, this test checks the error estimations\n     * as provided by the square-root of the diagonal elements of the\n     * covariance matrix.\n     * \u003cbr/\u003e\n     * The test generates sets of observations, each sampled from\n     * a Gaussian distribution.\n     * \u003cbr/\u003e\n     * The optimization problem solved is defined in class\n     * {@link StraightLineProblem}.\n     * \u003cbr/\u003e\n     * The output (on stdout) will be a table summarizing the distribution\n     * of parameters generated by the Monte-Carlo process and by the direct\n     * estimation provided by the diagonal elements of the covariance matrix.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 33)",
        "(line 69,col 9)-(line 69,col 37)",
        "(line 70,col 9)-(line 70,col 38)",
        "(line 73,col 9)-(line 77,col 60)",
        "(line 80,col 9)-(line 80,col 31)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 85,col 9)-(line 85,col 97)",
        "(line 88,col 9)-(line 88,col 83)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 24)",
        "(line 103,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 93)",
        "(line 134,col 9)-(line 134,col 90)",
        "(line 135,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 153,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizerTestValidation.testParametersErrorMonteCarloParameters()",
      "begin_line": 184,
      "end_line": 284,
      "comment": "\n     * In this test, the set of observations is fixed.\n     * Using a Monte-Carlo procedure, it generates sets of parameters,\n     * and determine the parameter change that will result in the\n     * normalized chi-square becoming larger by one than the value from\n     * the best fit solution.\n     * \u003cbr/\u003e\n     * The optimization problem solved is defined in class\n     * {@link StraightLineProblem}.\n     * \u003cbr/\u003e\n     * The output (on stdout) will be a list of lines containing:\n     * \u003cul\u003e\n     *  \u003cli\u003eslope of the straight line,\u003c/li\u003e\n     *  \u003cli\u003eintercept of the straight line,\u003c/li\u003e\n     *  \u003cli\u003echi-square of the solution defined by the above two values.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * The output is separated into two blocks (with a blank line between\n     * them); the first block will contain all parameter sets for which\n     * {@code chi2 \u003c chi2_b + 1}\n     * and the second block, all sets for which\n     * {@code chi2 \u003e\u003d chi2_b + 1}\n     * where {@code chi2_b} is the lowest chi-square (corresponding to the\n     * best solution).\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 38)",
        "(line 194,col 9)-(line 198,col 62)",
        "(line 201,col 9)-(line 201,col 30)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 206,col 9)-(line 206,col 68)",
        "(line 208,col 9)-(line 208,col 76)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 49)",
        "(line 218,col 9)-(line 218,col 73)",
        "(line 219,col 9)-(line 219,col 48)",
        "(line 222,col 9)-(line 222,col 67)",
        "(line 223,col 9)-(line 223,col 66)",
        "(line 226,col 9)-(line 226,col 46)",
        "(line 227,col 9)-(line 227,col 59)",
        "(line 233,col 9)-(line 233,col 90)",
        "(line 235,col 9)-(line 235,col 48)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 57)",
        "(line 238,col 9)-(line 238,col 60)",
        "(line 239,col 9)-(line 239,col 56)",
        "(line 240,col 9)-(line 240,col 58)",
        "(line 241,col 9)-(line 249,col 9)",
        "(line 256,col 9)-(line 256,col 50)",
        "(line 257,col 9)-(line 257,col 26)",
        "(line 259,col 9)-(line 259,col 56)",
        "(line 262,col 9)-(line 262,col 70)",
        "(line 263,col 9)-(line 263,col 29)",
        "(line 266,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 29)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 29)",
        "(line 282,col 9)-(line 282,col 64)",
        "(line 283,col 9)-(line 283,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "getChi2N(AbstractLeastSquaresOptimizer, StraightLineProblem, double[])",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027StraightLineProblem\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 289,
      "end_line": 298,
      "comment": "\n     * @return the normalized chi-square.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 44)",
        "(line 295,col 9)-(line 295,col 65)",
        "(line 297,col 9)-(line 297,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 305,
      "end_line": 320,
      "comment": "\n * A dummy optimizer.\n * Used for computing the covariance matrix.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.DummyOptimizer.DummyOptimizer()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.DummyOptimizer.doOptimize()",
      "begin_line": 313,
      "end_line": 319,
      "comment": "\n     * This method does nothing and returns a dummy value.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 48)",
        "(line 316,col 9)-(line 316,col 77)",
        "(line 317,col 9)-(line 317,col 34)",
        "(line 318,col 9)-(line 318,col 54)"
      ]
    }
  ]
}