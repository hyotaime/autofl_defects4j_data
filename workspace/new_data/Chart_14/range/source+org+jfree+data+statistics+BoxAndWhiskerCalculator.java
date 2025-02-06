{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/statistics/BoxAndWhiskerCalculator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerCalculator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 240,
      "comment": "\r\n * A utility class that calculates the mean, median, quartiles Q1 and Q3, plus\r\n * a list of outlier values...all from an arbitrary list of \r\n * \u003ccode\u003eNumber\u003c/code\u003e objects.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(java.util.List)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\r\n     * Calculates the statistics required for a {@link BoxAndWhiskerItem}\r\n     * from a list of \u003ccode\u003eNumber\u003c/code\u003e objects.  Any items in the list\r\n     * that are \u003ccode\u003enull\u003c/code\u003e, not an instance of \u003ccode\u003eNumber\u003c/code\u003e, or\r\n     * equivalent to \u003ccode\u003eDouble.NaN\u003c/code\u003e, will be ignored.\r\n     * \r\n     * @param values  a list of numbers (a \u003ccode\u003enull\u003c/code\u003e list is not \r\n     *                permitted).\r\n     * \r\n     * @return A box-and-whisker item.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(java.util.List, boolean)",
      "begin_line": 92,
      "end_line": 167,
      "comment": "\r\n     * Calculates the statistics required for a {@link BoxAndWhiskerItem}\r\n     * from a list of \u003ccode\u003eNumber\u003c/code\u003e objects.  Any items in the list\r\n     * that are \u003ccode\u003enull\u003c/code\u003e, not an instance of \u003ccode\u003eNumber\u003c/code\u003e, or\r\n     * equivalent to \u003ccode\u003eDouble.NaN\u003c/code\u003e, will be ignored.\r\n     * \r\n     * @param values  a list of numbers (a \u003ccode\u003enull\u003c/code\u003e list is not \r\n     *                permitted).\r\n     * @param stripNullAndNaNItems  a flag that controls the handling of null\r\n     *     and NaN items.\r\n     * \r\n     * @return A box-and-whisker item.\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 19)",
        "(line 100,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 32)",
        "(line 119,col 9)-(line 119,col 61)",
        "(line 120,col 9)-(line 120,col 65)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 126,col 9)-(line 126,col 71)",
        "(line 127,col 9)-(line 127,col 71)",
        "(line 129,col 9)-(line 129,col 70)",
        "(line 130,col 9)-(line 130,col 70)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 53)",
        "(line 136,col 9)-(line 136,col 40)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateQ1(java.util.List)",
      "begin_line": 181,
      "end_line": 203,
      "comment": "\r\n     * Calculates the first quartile for a list of numbers in ascending order.\r\n     * If the items in the list are not in ascending order, the result is\r\n     * unspecified.  If the list contains items that are \u003ccode\u003enull\u003c/code\u003e, not \r\n     * an instance of \u003ccode\u003eNumber\u003c/code\u003e, or equivalent to \r\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the result is unspecified.\r\n     * \r\n     * @param values  the numbers in ascending order (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * \r\n     * @return The first quartile.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 187,col 34)",
        "(line 188,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateQ3(java.util.List)",
      "begin_line": 216,
      "end_line": 238,
      "comment": "\r\n     * Calculates the third quartile for a list of numbers in ascending order.\r\n     * If the items in the list are not in ascending order, the result is\r\n     * unspecified.  If the list contains items that are \u003ccode\u003enull\u003c/code\u003e, not \r\n     * an instance of \u003ccode\u003eNumber\u003c/code\u003e, or equivalent to \r\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e, the result is unspecified.\r\n     * \r\n     * @param values  the list of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The third quartile.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 34)",
        "(line 222,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 22)"
      ]
    }
  ]
}