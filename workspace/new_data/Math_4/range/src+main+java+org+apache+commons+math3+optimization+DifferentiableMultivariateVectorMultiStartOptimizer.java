{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/DifferentiableMultivariateVectorMultiStartOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DifferentiableMultivariateVectorMultiStartOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorMultiStartOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer"
      ],
      "begin_line": 35,
      "end_line": 54,
      "comment": "\n * Special implementation of the {@link DifferentiableMultivariateVectorOptimizer}\n * interface addind multi-start features to an existing optimizer.\n *\n * This class wraps a classical optimizer to use it several times in\n * turn with different starting points in order to avoid being trapped\n * into a local extremum when looking for a global one.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer.DifferentiableMultivariateVectorMultiStartOptimizer(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, int, org.apache.commons.math3.random.RandomVectorGenerator)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Create a multi-start optimizer from a single-start optimizer.\n     *\n     * @param optimizer Single-start optimizer to wrap.\n     * @param starts Number of starts to perform (including the\n     * first one), multi-start is disabled if value is less than or\n     * equal to 1.\n     * @param generator Random vector generator to use for restarts.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    }
  ]
}