{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/correlation/PearsonsCorrelation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PearsonsCorrelation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 284,
      "comment": "\n * Computes Pearson\u0027s product-moment correlation coefficients for pairs of arrays\n * or columns of a matrix.\n *\n * \u003cp\u003eThe constructors that take \u003ccode\u003eRealMatrix\u003c/code\u003e or\n * \u003ccode\u003edouble[][]\u003c/code\u003e arguments generate correlation matrices.  The\n * columns of the input matrices are assumed to represent variable values.\n * Correlations are given by the formula\u003c/p\u003e\n * \u003ccode\u003ecor(X, Y) \u003d \u0026Sigma;[(x\u003csub\u003ei\u003c/sub\u003e - E(X))(y\u003csub\u003ei\u003c/sub\u003e - E(Y))] / [(n - 1)s(X)s(Y)]\u003c/code\u003e\n * where \u003ccode\u003eE(X)\u003c/code\u003e is the mean of \u003ccode\u003eX\u003c/code\u003e, \u003ccode\u003eE(Y)\u003c/code\u003e\n * is the mean of the \u003ccode\u003eY\u003c/code\u003e values and s(X), s(Y) are standard deviations.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "correlationMatrix"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " correlation matrix "
    },
    {
      "type": "field",
      "varNames": [
        "nObs"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " number of observations "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.PearsonsCorrelation()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Create a PearsonsCorrelation instance without data\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(double[][])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create a PearsonsCorrelation from a rectangular array\n     * whose columns represent values of variables to be correlated.\n     *\n     * @param data rectangular array with columns representing variables\n     * @throws IllegalArgumentException if the input data array is not\n     * rectangular with at least two rows and two columns.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Create a PearsonsCorrelation from a RealMatrix whose columns\n     * represent variables to be correlated.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 40)",
        "(line 82,col 9)-(line 82,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math3.stat.correlation.Covariance)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\n     * Create a PearsonsCorrelation from a {@link Covariance}.  The correlation\n     * matrix is computed by scaling the Covariance\u0027s covariance matrix.\n     * The Covariance instance must have been created from a data matrix with\n     * columns representing variable values.\n     *\n     * @param covariance Covariance instance\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 71)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.PearsonsCorrelation(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Create a PearsonsCorrelation from a covariance matrix.  The correlation\n     * matrix is computed by scaling the covariance matrix.\n     *\n     * @param covarianceMatrix covariance matrix\n     * @param numberOfObservations the number of observations in the dataset used to compute\n     * the covariance matrix\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.getCorrelationMatrix()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns the correlation matrix\n     *\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors()",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\n     * Returns a matrix of standard errors associated with the estimates\n     * in the correlation matrix.\u003cbr/\u003e\n     * \u003ccode\u003egetCorrelationStandardErrors().getEntry(i,j)\u003c/code\u003e is the standard\n     * error associated with \u003ccode\u003egetCorrelationMatrix.getEntry(i,j)\u003c/code\u003e\n     * \u003cp\u003eThe formula used to compute the standard error is \u003cbr/\u003e\n     * \u003ccode\u003eSE\u003csub\u003er\u003c/sub\u003e \u003d ((1 - r\u003csup\u003e2\u003c/sup\u003e) / (n - 2))\u003csup\u003e1/2\u003c/sup\u003e\u003c/code\u003e\n     * where \u003ccode\u003er\u003c/code\u003e is the estimated correlation coefficient and\n     * \u003ccode\u003en\u003c/code\u003e is the number of observations in the source dataset.\u003c/p\u003e\n     *\n     * @return matrix of correlation standard errors\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 59)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.getCorrelationPValues()",
      "begin_line": 163,
      "end_line": 179,
      "comment": "\n     * Returns a matrix of p-values associated with the (two-sided) null\n     * hypothesis that the corresponding correlation coefficient is zero.\n     * \u003cp\u003e\u003ccode\u003egetCorrelationPValues().getEntry(i,j)\u003c/code\u003e is the probability\n     * that a random variable distributed as \u003ccode\u003et\u003csub\u003en-2\u003c/sub\u003e\u003c/code\u003e takes\n     * a value with absolute value greater than or equal to \u003cbr\u003e\n     * \u003ccode\u003e|r|((n - 2) / (1 - r\u003csup\u003e2\u003c/sup\u003e))\u003csup\u003e1/2\u003c/sup\u003e\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003eThe values in the matrix are sometimes referred to as the\n     * \u003ci\u003esignificance\u003c/i\u003e of the corresponding correlation coefficients.\u003c/p\u003e\n     *\n     * @return matrix of p-values\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if an error occurs estimating probabilities\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 66)",
        "(line 165,col 9)-(line 165,col 59)",
        "(line 166,col 9)-(line 166,col 50)",
        "(line 167,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 189,
      "end_line": 201,
      "comment": "\n     * Computes the correlation matrix for the columns of the\n     * input matrix.\n     *\n     * @param matrix matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 191,col 65)",
        "(line 192,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(double[][])",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Computes the correlation matrix for the columns of the\n     * input rectangular array.  The colums of the array represent values\n     * of variables to be correlated.\n     *\n     * @param data matrix with columns representing variables to correlate\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 212,col 8)-(line 212,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.correlation(double[], double[])",
      "begin_line": 227,
      "end_line": 240,
      "comment": "\n     * Computes the Pearson\u0027s product-moment correlation coefficient between the two arrays.\n     *\n     * \u003c/p\u003eThrows IllegalArgumentException if the arrays do not have the same length\n     * or their common length is less than 2\u003c/p\u003e\n     *\n     * @param xArray first data array\n     * @param yArray second data array\n     * @return Returns Pearson\u0027s correlation coefficient for the two arrays\n     * @throws DimensionMismatchException if the arrays lengths do not match\n     * @throws MathIllegalArgumentException if there is insufficient data\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 61)",
        "(line 229,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.covarianceToCorrelation(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 253,
      "end_line": 267,
      "comment": "\n     * Derives a correlation matrix from a covariance matrix.\n     *\n     * \u003cp\u003eUses the formula \u003cbr/\u003e\n     * \u003ccode\u003er(X,Y) \u003d cov(X,Y)/s(X)s(Y)\u003c/code\u003e where\n     * \u003ccode\u003er(\u0026middot,\u0026middot;)\u003c/code\u003e is the correlation coefficient and\n     * \u003ccode\u003es(\u0026middot;)\u003c/code\u003e means standard deviation.\u003c/p\u003e\n     *\n     * @param covarianceMatrix the covariance matrix\n     * @return correlation matrix\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 58)",
        "(line 255,col 9)-(line 255,col 65)",
        "(line 256,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.correlation.PearsonsCorrelation.checkSufficientData(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 276,
      "end_line": 283,
      "comment": "\n     * Throws IllegalArgumentException of the matrix does not have at least\n     * two columns and two rows\n     *\n     * @param matrix matrix to check for sufficiency\n     * @throws MathIllegalArgumentException if there is insufficient data\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 48)",
        "(line 279,col 9)-(line 282,col 9)"
      ]
    }
  ]
}