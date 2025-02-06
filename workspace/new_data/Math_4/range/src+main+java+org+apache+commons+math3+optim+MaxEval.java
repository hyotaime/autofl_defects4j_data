{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/MaxEval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxEval",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 27,
      "end_line": 62,
      "comment": "\n * Maximum number of evaluations of the function to be optimized.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxEval"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Allowed number of evalutations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.MaxEval.MaxEval(int)",
      "begin_line": 35,
      "end_line": 41,
      "comment": "\n     * @param max Allowed number of evalutations.\n     * @throws NotStrictlyPositiveException if {@code max \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 38,col 9)",
        "(line 40,col 9)-(line 40,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.MaxEval.getMaxEval()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Gets the maximum number of evaluations.\n     *\n     * @return the allowed number of evaluations.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.MaxEval.unlimited()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Factory method that creates instance of this class that represents\n     * a virtually unlimited number of evaluations.\n     *\n     * @return a new instance suitable for allowing {@link Integer#MAX_VALUE}\n     * evaluations.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 46)"
      ]
    }
  ]
}