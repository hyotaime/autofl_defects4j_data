{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/VariableReferenceCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableReferenceCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 38,
      "end_line": 199,
      "comment": "\n * Checks variables to see if they are referenced before their declaration, or\n * if they are redeclared in a way that is suspicious (i.e. not dictated by\n * control structures). This is a more aggressive version of {@link VarCheck},\n * but it lacks the cross-module checks.\n *\n * @author kushal@google.com (Kushal Dave)\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNDECLARED_REFERENCE"
      ],
      "begin_line": 40,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REDECLARED_VARIABLE"
      ],
      "begin_line": 44,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AMBIGUOUS_FUNCTION_DECL"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkLevel"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blocksWithDeclarations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " we clear after each method call, because the Set never gets too big."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.VariableReferenceCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 29)",
        "(line 62,col 5)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 68,col 51)",
        "(line 69,col 5)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 75,col 51)",
        "(line 76,col 5)-(line 76,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferenceCheckingBehavior",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior"
      ],
      "begin_line": 83,
      "end_line": 198,
      "comment": "\n   * Behavior that checks variables for redeclaration or early references\n   * just after they go out of scope.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 85,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 92,col 7)-(line 95,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheck.ReferenceCheckingBehavior.checkVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope.Var, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 104,
      "end_line": 197,
      "comment": "\n     * If the variable is declared more than once in a basic block, generate a\n     * warning. Also check if a variable is used in a given scope before it is\n     * declared, which suggest a likely error. Relies on the fact that\n     * references is in parse-tree order.\n     ",
      "child_ranges": [
        "(line 105,col 7)-(line 105,col 37)",
        "(line 106,col 7)-(line 106,col 40)",
        "(line 107,col 7)-(line 107,col 47)",
        "(line 108,col 7)-(line 108,col 33)",
        "(line 111,col 7)-(line 121,col 7)",
        "(line 123,col 7)-(line 196,col 7)"
      ]
    }
  ]
}