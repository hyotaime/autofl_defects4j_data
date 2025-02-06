{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SimpleFunctionAliasAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleFunctionAliasAnalysis",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 119,
      "comment": "\n * Uses {@link SimpleDefinitionFinder} to determine if a function has been\n * aliased or exposed to .call() or .apply().\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "aliasedFunctions"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionsExposedToCallOrApply"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysis.isAliased(com.google.javascript.rhino.Node)",
      "begin_line": 43,
      "end_line": 48,
      "comment": "\n   * Returns true if the function is aliased.\n   *\n   * Must only be called after {@link #analyze(SimpleDefinitionFinder)}\n   * has been called.\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 49)",
        "(line 45,col 5)-(line 45,col 59)",
        "(line 47,col 5)-(line 47,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysis.isExposedToCallOrApply(com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "\n   * Returns true if the function ever exposed to .call() or .apply().\n   *\n   * Must only be called after {@link #analyze(SimpleDefinitionFinder)}\n   * has been called.\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 62)",
        "(line 58,col 5)-(line 58,col 59)",
        "(line 60,col 5)-(line 60,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysis.analyze(com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 67,
      "end_line": 88,
      "comment": "\n   * Uses the provided {@link SimpleDefinitionFinder} to determine\n   * which functions are aliased or exposed to .call() or .apply().\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 55)",
        "(line 70,col 5)-(line 70,col 41)",
        "(line 71,col 5)-(line 71,col 54)",
        "(line 73,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleFunctionAliasAnalysis.updateFunctionForUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 97,
      "end_line": 118,
      "comment": "\n   * Updates alias and exposure information based a site where the function is\n   * used.\n   *\n   * Note: this method may be called multiple times per Function, each time\n   * with a different useNode.\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 41)",
        "(line 99,col 5)-(line 99,col 41)",
        "(line 101,col 5)-(line 117,col 5)"
      ]
    }
  ]
}