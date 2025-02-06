{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CompilerPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerPass",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 41,
      "comment": "\n * \u003cp\u003eInterface for classes that can compile JS.\u003c/p\u003e\n *\n * \u003cp\u003eClass has single function \"process\", which is passed\n * the root node of the parsed JS tree, as well as the\n * root node of the external JS tree (used to provide a public API\n * and prevent renaming of system functions).\u003c/p\u003e\n *\n * \u003cp\u003eUse this class to support testing with BaseCompilerTest\u003c/p\u003e\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n   * Process the JS with root node root.\n   * Can modify the contents of each Node tree\n   * @param externs Top of external JS tree\n   * @param root Top of JS tree\n   ",
      "child_ranges": []
    }
  ]
}