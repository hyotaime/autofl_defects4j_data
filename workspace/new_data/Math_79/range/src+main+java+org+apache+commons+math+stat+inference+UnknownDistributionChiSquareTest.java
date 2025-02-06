{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/inference/UnknownDistributionChiSquareTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnknownDistributionChiSquareTest",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.stat.inference.ChiSquareTest"
      ],
      "begin_line": 29,
      "end_line": 144,
      "comment": "\n * An interface for Chi-Square tests for unknown distributions.\n * \u003cp\u003eTwo samples tests are used when the distribution is unknown \u003ci\u003ea priori\u003c/i\u003e\n * but provided by one sample. We compare the second sample against the first.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest.chiSquareDataSetsComparison(long[], long[])",
      "begin_line": 64,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003eComputes a\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/software/dataplot/refman1/auxillar/chi2samp.htm\"\u003e\n     * Chi-Square two sample test statistic\u003c/a\u003e comparing bin frequency counts\n     * in \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e.  The\n     * sums of frequency counts in the two samples are not required to be the\n     * same.  The formula used to compute the test statistic is\u003c/p\u003e\n     * \u003ccode\u003e\n     * \u0026sum;[(K * observed1[i] - observed2[i]/K)\u003csup\u003e2\u003c/sup\u003e / (observed1[i] + observed2[i])]\n     * \u003c/code\u003e where\n     * \u003cbr/\u003e\u003ccode\u003eK \u003d \u0026sqrt;[\u0026sum(observed2 / \u0026sum;(observed1)]\u003c/code\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThis statistic can be used to perform a Chi-Square test evaluating the null hypothesis that\n     * both observed counts follow the same distribution.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must have the same length and\n     * their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return chiSquare statistic\n     * @throws IllegalArgumentException if preconditions are not met\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest.chiSquareTestDataSetsComparison(long[], long[])",
      "begin_line": 103,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eReturns the \u003ci\u003eobserved significance level\u003c/i\u003e, or \u003ca href\u003d\n     * \"http://www.cas.lancs.ac.uk/glossary_v1.1/hyptest.html#pvalue\"\u003e\n     * p-value\u003c/a\u003e, associated with a Chi-Square two sample test comparing\n     * bin frequency counts in \u003ccode\u003eobserved1\u003c/code\u003e and\n     * \u003ccode\u003eobserved2\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe number returned is the smallest significance level at which one\n     * can reject the null hypothesis that the observed counts conform to the\n     * same distribution.\n     * \u003c/p\u003e\n     * \u003cp\u003eSee {@link #chiSquareDataSetsComparison(long[], long[])} for details\n     * on the formula used to compute the test statistic. The degrees of\n     * of freedom used to perform the test is one less than the common length\n     * of the input observed count arrays.\n     * \u003c/p\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must\n     * have the same length and\n     * their common length must be at least 2.\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @return p-value\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs computing the p-value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.inference.UnknownDistributionChiSquareTest.chiSquareTestDataSetsComparison(long[], long[], double)",
      "begin_line": 141,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003ePerforms a Chi-Square two sample test comparing two binned data\n     * sets. The test evaluates the null hypothesis that the two lists of\n     * observed counts conform to the same frequency distribution, with\n     * significance level \u003ccode\u003ealpha\u003c/code\u003e.  Returns true iff the null\n     * hypothesis can be rejected with 100 * (1 - alpha) percent confidence.\n     * \u003c/p\u003e\n     * \u003cp\u003eSee {@link #chiSquareDataSetsComparison(long[], long[])} for\n     * details on the formula used to compute the Chisquare statistic used\n     * in the test. The degrees of of freedom used to perform the test is\n     * one less than the common length of the input observed count arrays.\n     * \u003c/p\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eObserved counts must be non-negative.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific bin must not both be zero.\n     * \u003c/li\u003e\n     * \u003cli\u003eObserved counts for a specific sample must not all be 0.\n     * \u003c/li\u003e\n     * \u003cli\u003eThe arrays \u003ccode\u003eobserved1\u003c/code\u003e and \u003ccode\u003eobserved2\u003c/code\u003e must\n     * have the same length and their common length must be at least 2.\n     * \u003c/li\u003e\n     * \u003cli\u003e \u003ccode\u003e 0 \u003c alpha \u003c 0.5 \u003c/code\u003e\n     * \u003c/li\u003e\u003c/ul\u003e\u003cp\u003e\n     * If any of the preconditions are not met, an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param observed1 array of observed frequency counts of the first data set\n     * @param observed2 array of observed frequency counts of the second data set\n     * @param alpha significance level of the test\n     * @return true iff null hypothesis can be rejected with confidence\n     * 1 - alpha\n     * @throws IllegalArgumentException if preconditions are not met\n     * @throws MathException if an error occurs performing the test\n     ",
      "child_ranges": []
    }
  ]
}