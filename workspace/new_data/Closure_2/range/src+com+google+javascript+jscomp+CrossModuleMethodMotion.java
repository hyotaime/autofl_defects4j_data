{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CrossModuleMethodMotion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CrossModuleMethodMotion",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 33,
      "end_line": 220,
      "comment": "\n * Move prototype methods into later modules.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "NULL_COMMON_MODULE_ERROR"
      ],
      "begin_line": 36,
      "end_line": 38,
      "comment": " Internal errors"
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
        "idGenerator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "analyzer"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUB_METHOD_NAME"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNSTUB_METHOD_NAME"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUB_DECLARATIONS"
      ],
      "begin_line": 49,
      "end_line": 61,
      "comment": " Visible for testing"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotion.CrossModuleMethodMotion(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator, boolean)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n   * Creates a new pass for moving prototype properties.\n   * @param compiler The compiler.\n   * @param idGenerator An id generator for method stubs.\n   * @param canModifyExterns If true, then we can move prototype\n   *     properties that are declared in the externs file.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 29)",
        "(line 73,col 5)-(line 73,col 35)",
        "(line 74,col 5)-(line 74,col 49)",
        "(line 75,col 5)-(line 76,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotion.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 86,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotion.moveMethods(java.util.Collection\u003ccom.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo\u003e)",
      "begin_line": 92,
      "end_line": 195,
      "comment": "\n   * Move methods deeper in the module graph when possible.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 66)",
        "(line 94,col 5)-(line 187,col 5)",
        "(line 189,col 5)-(line 194,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdGenerator",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 197,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentId"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * Ids for cross-module method stubbing, so that each method has\n     * a unique id.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator.hasGeneratedAnyIds()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns whether we\u0027ve generated any new ids.\n     ",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CrossModuleMethodMotion.IdGenerator.newId()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Creates a new id for stubbing a method.\n     ",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 25)"
      ]
    }
  ]
}