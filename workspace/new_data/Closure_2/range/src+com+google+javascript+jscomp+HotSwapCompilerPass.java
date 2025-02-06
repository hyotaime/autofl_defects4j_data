{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/HotSwapCompilerPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HotSwapCompilerPass",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 47,
      "comment": "\n * Interface for compiler passes that can be used in a hot-swap fashion.\n * \u003cp\u003e\n * The additional method is {@code hotSwapScript} which runs this pass on a\n * subtree of the AST. Each pass that is intended to support hot-swap style\n * should implement this interface.\n * \u003cp\u003e\n * It is assumed that {@code Node} argument of {@code hotSwapScript} is the root\n * of a sub-tree in AST that represents a JS file and so is of type {@code\n * Token.SCRIPT}.\n *\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.HotSwapCompilerPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n   * Process the JS with root node root. This is supposed to be significantly\n   * faster compared to corresponding full-compiler passes.\n   *\n   * @param scriptRoot Root node corresponding to the file that is modified,\n   *        should be of type {@code Token.SCRIPT}.\n   * @param originalRoot Root node corresponding to the original version of the\n   *        file that is modified. Should be of type {@code token.SCRIPT}.\n   ",
      "child_ranges": []
    }
  ]
}