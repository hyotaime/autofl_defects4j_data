{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/NonSquareMatrixException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NonSquareMatrixException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.DimensionMismatchException"
      ],
      "begin_line": 28,
      "end_line": 42,
      "comment": "\n * Exception to be thrown when a square matrix is expected.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.NonSquareMatrixException.NonSquareMatrixException(int, int)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Construct an exception from the mismatched dimensions.\n     *\n     * @param wrong Row dimension.\n     * @param expected Column dimension.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 67)"
      ]
    }
  ]
}