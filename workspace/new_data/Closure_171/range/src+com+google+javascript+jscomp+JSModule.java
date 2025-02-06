{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JSModule.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSModule",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.deps.DependencyInfo",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 304,
      "comment": "\n * A JavaScript module has a unique name, consists of a list of compiler inputs,\n * and can depend on other modules.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CIRCULAR_DEPENDENCY_ERROR"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Module name "
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Source code inputs "
    },
    {
      "type": "field",
      "varNames": [
        "deps"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Modules that this module depends on "
    },
    {
      "type": "field",
      "varNames": [
        "depth"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSModule.JSModule(java.lang.String)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n   * Creates an instance.\n   *\n   * @param name A unique name for the module\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 21)",
        "(line 64,col 5)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getName()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " Gets the module name. ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getProvides()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getRequires()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 68)",
        "(line 81,col 5)-(line 83,col 5)",
        "(line 84,col 5)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getPathRelativeToClosureBase()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.add(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Adds a source file input to this module. ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.addFirst(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 98,
      "end_line": 100,
      "comment": " Adds a source file input to this module. ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.add(com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 103,
      "end_line": 106,
      "comment": " Adds a source code input to this module. ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 22)",
        "(line 105,col 5)-(line 105,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.addAndOverrideModule(com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n   * Adds a source code input to this module. Call only if the input might\n   * already be associated with a module. Otherwise, use\n   * add(CompilerInput input).\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 22)",
        "(line 115,col 5)-(line 115,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.addFirst(com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 119,
      "end_line": 122,
      "comment": " Adds a source code input to this module. ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 25)",
        "(line 121,col 5)-(line 121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.addAfter(com.google.javascript.jscomp.CompilerInput, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 125,
      "end_line": 129,
      "comment": " Adds a source code input to this module directly after other. ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 53)",
        "(line 127,col 5)-(line 127,col 45)",
        "(line 128,col 5)-(line 128,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.addDependency(com.google.javascript.jscomp.JSModule)",
      "begin_line": 132,
      "end_line": 136,
      "comment": " Adds a dependency on another module. ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 36)",
        "(line 134,col 5)-(line 134,col 42)",
        "(line 135,col 5)-(line 135,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.remove(com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 139,
      "end_line": 142,
      "comment": " Removes an input from this module. ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 26)",
        "(line 141,col 5)-(line 141,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.removeAll()",
      "begin_line": 145,
      "end_line": 150,
      "comment": " Removes all of the inputs from this module. ",
      "child_ranges": [
        "(line 146,col 5)-(line 148,col 5)",
        "(line 149,col 5)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getDependencies()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n   * Gets the list of modules that this module depends on.\n   *\n   * @return A list that may be empty but not null\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getSortedDependencyNames()",
      "begin_line": 165,
      "end_line": 172,
      "comment": "\n   * Gets the names of the modules that this module depends on,\n   * sorted alphabetically.\n   ",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 46)",
        "(line 167,col 5)-(line 169,col 5)",
        "(line 170,col 5)-(line 170,col 28)",
        "(line 171,col 5)-(line 171,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getAllDependencies()",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n   * Returns the transitive closure of dependencies starting from the\n   * dependencies of this module.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 50)",
        "(line 180,col 5)-(line 180,col 55)",
        "(line 181,col 5)-(line 188,col 5)",
        "(line 189,col 5)-(line 189,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getThisAndAllDependencies()",
      "begin_line": 193,
      "end_line": 197,
      "comment": " Returns this module and all of its dependencies in one list. ",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 46)",
        "(line 195,col 5)-(line 195,col 19)",
        "(line 196,col 5)-(line 196,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getInputs()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n   * Gets this module\u0027s list of source code inputs.\n   *\n   * @return A list that may be empty but not null\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getByName(java.lang.String)",
      "begin_line": 209,
      "end_line": 216,
      "comment": " Returns the input with the given name or null if none. ",
      "child_ranges": [
        "(line 210,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 215,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.removeByName(java.lang.String)",
      "begin_line": 221,
      "end_line": 233,
      "comment": "\n   * Removes any input with the given name. Returns whether any were removed.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 26)",
        "(line 223,col 5)-(line 223,col 53)",
        "(line 224,col 5)-(line 231,col 5)",
        "(line 232,col 5)-(line 232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.toString()",
      "begin_line": 236,
      "end_line": 239,
      "comment": " Returns the module name (primarily for debugging). ",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.clearAsts()",
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n   * Removes any references to nodes of the AST.  This method is needed to\n   * allow the ASTs to be garbage collected if the modules are kept around.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 248,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.sortInputsByDeps(com.google.javascript.jscomp.Compiler)",
      "begin_line": 254,
      "end_line": 273,
      "comment": "\n   * Puts the JS files into a topologically sorted order by their dependencies.\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 259,col 5)",
        "(line 262,col 5)-(line 272,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.sortJsModules(java.util.Collection\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n   * Returns the given collection of modules in topological order.\n   *\n   * Note that this will return the modules in the same order if they are\n   * already sorted, and in general, will only change the order as necessary to\n   * satisfy the ordering dependencies.  This can be important for cases where\n   * the modules do not properly specify all dependencies.\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 287,col 58)",
        "(line 288,col 5)-(line 288,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.setDepth(int)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n   * @param dep the depth to set\n   ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModule.getDepth()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n   * @return the depth\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 17)"
      ]
    }
  ]
}