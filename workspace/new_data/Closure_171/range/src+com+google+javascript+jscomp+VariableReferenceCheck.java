{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/VariableReferenceCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableReferenceCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 39,
      "end_line": 200,
      "comment": "\n * Checks variables to see if they are referenced before their declaration, or\n * if they are redeclared in a way that is suspicious (i.e. not dictated by\n * control structures). This is a more aggressive version of {@link VarCheck},\n * but it lacks the cross-module checks.\n *\n * @author kushal@google.com (Kushal Dave)\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNDECLARED_REFERENCE"
      ],
      "begin_line": 41,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REDECLARED_VARIABLE"
      ],
      "begin_line": 45,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AMBIGUOUS_FUNCTION_DECL"
      ],
      "begin_line": 49,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkLevel"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blocksWithDeclarations"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " we clear after each method call, because the Set never gets too big."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.VariableReferenceCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 29)",
        "(line 63,col 5)-(line 63,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 51)",
        "(line 70,col 5)-(line 70,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 73,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 76,col 51)",
        "(line 77,col 5)-(line 77,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceCheckingBehavior",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior"
      ],
      "begin_line": 84,
      "end_line": 199,
      "comment": "\n   * Behavior that checks variables for redeclaration or early references\n   * just after they go out of scope.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 86,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 96,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior.checkVar(com.google.javascript.jscomp.Scope.Var, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 105,
      "end_line": 198,
      "comment": "\n     * If the variable is declared more than once in a basic block, generate a\n     * warning. Also check if a variable is used in a given scope before it is\n     * declared, which suggest a likely error. Relies on the fact that\n     * references is in parse-tree order.\n     ",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 37)",
        "(line 107,col 7)-(line 107,col 40)",
        "(line 108,col 7)-(line 108,col 47)",
        "(line 109,col 7)-(line 109,col 33)",
        "(line 112,col 7)-(line 122,col 7)",
        "(line 124,col 7)-(line 197,col 7)"
      ]
    }
  ]
}