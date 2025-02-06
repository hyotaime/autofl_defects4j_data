{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealMatrixChangingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixChangingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 56,
      "comment": "\n * Interface defining a visitor for matrix entries.\n *\n * @see DefaultRealMatrixChangingVisitor\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixChangingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * Start visiting a matrix.\n     * \u003cp\u003eThis method is called once before any entry of the matrix is visited.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixChangingVisitor.visit(int, int, double)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Visit one matrix entry.\n     * @param row row index of the entry\n     * @param column column index of the entry\n     * @param value current value of the entry\n     * @return the new value to be set for the entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrixChangingVisitor.end()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * End visiting a matrix.\n     * \u003cp\u003eThis method is called once after all entries of the matrix have been visited.\u003c/p\u003e\n     * @return the value that the \u003ccode\u003ewalkInXxxOrder\u003c/code\u003e must return\n     ",
      "child_ranges": []
    }
  ]
}