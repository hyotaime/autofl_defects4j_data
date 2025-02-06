{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JoinOp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JoinOp",
      "is_interface": true,
      "parent_types": [
        "com.google.common.base.Function\u003cjava.util.List\u003cL\u003e, L\u003e"
      ],
      "begin_line": 28,
      "end_line": 76,
      "comment": "\n * Defines a way join a list of LatticeElements.\n "
    },
    {
      "type": "class_interface",
      "name": "BinaryJoinOp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp\u003cL\u003e"
      ],
      "begin_line": 34,
      "end_line": 75,
      "comment": "\n   * An implementation of {@code JoinOp} that makes it easy to join to\n   * lattice elements at a time.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JoinOp.BinaryJoinOp.apply(java.util.List\u003cL\u003e)",
      "begin_line": 36,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 38,col 7)-(line 38,col 53)",
        "(line 39,col 7)-(line 39,col 31)",
        "(line 40,col 7)-(line 49,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JoinOp.BinaryJoinOp.apply(L, L)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Creates a new lattice that will be the join of two input lattices.\n     *\n     * @return The join of {@code latticeA} and {@code latticeB}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JoinOp.BinaryJoinOp.computeMidPoint(int)",
      "begin_line": 66,
      "end_line": 74,
      "comment": "\n     * Finds the midpoint of a list. The function will favor two lists of\n     * even length instead of two lists of the same odd length. The list\n     * must be at least length two.\n     *\n     * @param size Size of the list.\n     ",
      "child_ranges": [
        "(line 67,col 7)-(line 67,col 32)",
        "(line 68,col 7)-(line 72,col 7)",
        "(line 73,col 7)-(line 73,col 22)"
      ]
    }
  ]
}