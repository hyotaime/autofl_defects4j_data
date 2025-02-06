{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckRegExp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckRegExp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 83,
      "comment": "\n * Look for references to the global RegExp object that would cause\n * regular expressions to be unoptimizable, and checks that regular expressions\n * are syntactically valid.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_REFERENCE"
      ],
      "begin_line": 32,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MALFORMED_REGEXP"
      ],
      "begin_line": 36,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalRegExpPropertiesUsed"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRegExp.isGlobalRegExpPropertiesUsed()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckRegExp.CheckRegExp(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRegExp.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRegExp.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 81,col 5)"
      ]
    }
  ]
}