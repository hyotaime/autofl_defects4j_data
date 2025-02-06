{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/VariableVisibilityAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableVisibilityAnalysis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 37,
      "end_line": 150,
      "comment": "\n * An analysis pass that determines the visibility of variables -- that is,\n * whether a variable is truly local, a local captured by an inner scope, a\n * parameter, or a global variable.\n *\n * SideEffectsAnalysis uses this class to partition a potentially infinite\n * number of concrete storage locations into a (small) finite number of\n * abstract storage locations based on a variable\u0027s storage visibility.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "visibilityByDeclaringNameNode"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Maps the declaring name node for a variable to that variable\u0027s\n   * visibility.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysis.VariableVisibilityAnalysis(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 29)",
        "(line 70,col 5)-(line 70,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysis.getVariableVisibility(com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n   * Returns the visibility of of a variable, given that variable\u0027s declaring\n   * name node.\n   *\n   * The name node\u0027s parent must be one of:\n   * \u003cpre\u003e\n   *    Token.VAR (for a variable declaration)\n   *    Token.FUNCTION (for a function declaration)\n   *    Token.PARAM_LIST (for a function formal parameter)\n   * \u003c/pre\u003e\n   *\n   * The returned visibility will be one of:\n   * \u003cpre\u003e\n   *    LOCAL_VARIABLE : the variable is a local variable used only in its\n   *        declared scope\n   *    CAPTURED_LOCAL_VARIABLE : A local variable that is used in a capturing\n   *        closure\n   *     PARAMETER_VARIABLE : the variable is a formal parameter\n   *     GLOBAL_VARIABLE : the variable is declared in the global scope\n   *  \u003c/pre\u003e\n   *\n   * @param declaringNameNode The name node for a declaration.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 48)",
        "(line 99,col 5)-(line 101,col 33)",
        "(line 103,col 5)-(line 103,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysis.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 140,
      "comment": "\n   * Determines the visibility class for each variable in root.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 113,col 59)",
        "(line 115,col 5)-(line 115,col 53)",
        "(line 117,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableVisibilityAnalysis.variableIsParameter(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "\n   * Returns true if the variable is a formal parameter.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 51)",
        "(line 148,col 5)-(line 148,col 66)"
      ]
    }
  ]
}