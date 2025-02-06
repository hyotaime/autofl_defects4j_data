{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameAnalyzer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameAnalyzer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 76,
      "end_line": 1813,
      "comment": "\n * This pass identifies all global names, simple (e.g. \u003ccode\u003ea\u003c/code\u003e) or\n * qualified (e.g. \u003ccode\u003ea.b.c\u003c/code\u003e), and the dependencies between them, then\n * removes code associated with unreferenced names. It starts by assuming that\n * only externally accessible names (e.g. \u003ccode\u003ewindow\u003c/code\u003e) are referenced,\n * then iteratively marks additional names as referenced (e.g. \u003ccode\u003eFoo\u003c/code\u003e\n * in \u003ccode\u003ewindow[\u0027foo\u0027] \u003d new Foo();\u003c/code\u003e). This makes it possible to\n * eliminate code containing circular references.\n *\n * \u003cp\u003eQualified names can be defined using dotted or object literal syntax\n * (\u003ccode\u003ea.b.c \u003d x;\u003c/code\u003e or \u003ccode\u003ea.b \u003d {c: x};\u003c/code\u003e, respectively).\n *\n * \u003cp\u003eRemoval of prototype classes is currently all or nothing. In other words,\n * prototype properties and methods are never individually removed.\n *\n * \u003cp\u003eOptionally generates pretty HTML output of data so that it is easy to\n * analyze dependencies.\n *\n * \u003cp\u003eOnly operates on names defined in the global scope, but it would be easy\n * to extend the pass to names defined in local scopes.\n *\n * TODO(nicksantos): In the initial implementation of this pass, it was\n * important to understand namespaced names (e.g., that a.b is distinct from\n * a.b.c). Now that this pass comes after CollapseProperties, this is no longer\n * necessary. For now, I\u0027ve changed so that {@code referenceParentNames}\n * creates a two-way reference between a.b and a.b.c, so that they\u0027re\n * effectively the same name. When someone has the time, we should completely\n * rip out all the logic that understands namespaces.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Reference to the JS compiler "
    },
    {
      "type": "field",
      "varNames": [
        "allNames"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Map of all JS names found "
    },
    {
      "type": "field",
      "varNames": [
        "referenceGraph"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": " Reference dependency graph "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n   * Map of name scopes - all children of the Node key have a dependency on the\n   * name value.\n   *\n   * If scopes.get(node).equals(name) \u0026\u0026 node2 is a child of node, then node2\n   * will not get executed unless name is referenced via a get operation\n   "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUBSTRING"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Used to parse prototype names "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUBSTRING_LEN"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUFFIX_LEN"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Window root "
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Function class name "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GLOBAL_NAMES"
      ],
      "begin_line": 112,
      "end_line": 113,
      "comment": " All of these refer to global scope. These can be moved to config "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnreferenced"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Whether to remove unreferenced variables in main pass "
    },
    {
      "type": "field",
      "varNames": [
        "globalNames"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Names that refer to the global scope "
    },
    {
      "type": "field",
      "varNames": [
        "changeProxy"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Ast change helper "
    },
    {
      "type": "field",
      "varNames": [
        "externalNames"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Names that are externally defined "
    },
    {
      "type": "field",
      "varNames": [
        "refNodes"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Name declarations or assignments, in post-order traversal order "
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n   * When multiple names in the global scope point to the same object, we\n   * call them aliases. Store a map from each alias name to the alias set.\n   "
    },
    {
      "type": "class_interface",
      "name": "AliasSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n   * All the aliases in a program form a graph, where each global name is\n   * a node in the graph, and two names are connected if one directly aliases\n   * the other.\n   *\n   * An {@code AliasSet} represents a connected component in that graph. We do\n   * not explicitly track the graph--we just track the connected components.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.AliasSet.AliasSet(java.lang.String, java.lang.String)",
      "begin_line": 148,
      "end_line": 151,
      "comment": " Every alias set starts with exactly 2 names.",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 23)",
        "(line 150,col 7)-(line 150,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferencePropagationCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType\u003e"
      ],
      "begin_line": 167,
      "end_line": 180,
      "comment": "\n   * Callback that propagates reference information.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ReferencePropagationCallback.traverseEdge(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType, com.google.javascript.jscomp.NameAnalyzer.JsName)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 178,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 186,
      "end_line": 207,
      "comment": "\n   * Class to hold information that can be determined from a node tree about a\n   * given name\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Fully qualified name "
    },
    {
      "type": "field",
      "varNames": [
        "isExternallyReferenceable"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Whether the name is guaranteed to be externally referenceable "
    },
    {
      "type": "field",
      "varNames": [
        "isPrototype"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Whether this name is a prototype function "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeClass"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Name of the prototype class, i.e. \"a\" if name is \"a.prototype.b\" "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeProperty"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Local name of prototype property i.e. \"b\" if name is \"a.prototype.b\" "
    },
    {
      "type": "field",
      "varNames": [
        "superclass"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Name of the super class of name "
    },
    {
      "type": "field",
      "varNames": [
        "onlyAffectsClassDef"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Whether this is a call that only affects the class definition "
    },
    {
      "type": "class_interface",
      "name": "JsName",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003ccom.google.javascript.jscomp.NameAnalyzer.JsName\u003e"
      ],
      "begin_line": 212,
      "end_line": 260,
      "comment": "\n   * Struct to hold information about a fully qualified JS name\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Fully qualified name "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeNames"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " Name of prototype functions attached to this name "
    },
    {
      "type": "field",
      "varNames": [
        "externallyDefined"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " Whether this is an externally defined name "
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " Whether this node is referenced "
    },
    {
      "type": "field",
      "varNames": [
        "hasWrittenDescendants"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Whether the name has descendants that are written to. "
    },
    {
      "type": "field",
      "varNames": [
        "hasInstanceOfReference"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " Whether the name is used in a instanceof check "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsName.toString()",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\n     * Output the node as a string\n     *\n     * @return Node as a string\n     ",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 46)",
        "(line 239,col 7)-(line 239,col 23)",
        "(line 241,col 7)-(line 251,col 7)",
        "(line 253,col 7)-(line 253,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsName.compareTo(com.google.javascript.jscomp.NameAnalyzer.JsName)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 7)-(line 258,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RefNode",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n   * Interface to get information about and remove unreferenced names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RefNode.name()",
      "begin_line": 266,
      "end_line": 266,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RefNode.remove()",
      "begin_line": 267,
      "end_line": 267,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "JsNameRefNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.RefNode"
      ],
      "begin_line": 275,
      "end_line": 337,
      "comment": "\n   * Class for nodes that reference a fully-qualified JS name. Fully qualified\n   * names are of form A or A.B (A.B.C, etc.). References can get the value or\n   * set the value of the JS name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " JsName node for this reference "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 283,
      "end_line": 284,
      "comment": "\n     * Top GETPROP or NAME or STRING [objlit key] node defining the name of\n     * this node\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n     * Parent node of the name access\n     * (ASSIGN, VAR, FUNCTION, OBJECTLIT, or CALL)\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.JsNameRefNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 303,
      "comment": "\n     * Create a node that refers to a name\n     *\n     * @param name The name\n     * @param node The top node representing the name (GETPROP, NAME, STRING)\n     ",
      "child_ranges": [
        "(line 300,col 7)-(line 300,col 23)",
        "(line 301,col 7)-(line 301,col 23)",
        "(line 302,col 7)-(line 302,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.name()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 7)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.remove()",
      "begin_line": 310,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 47)",
        "(line 315,col 7)-(line 335,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeSetNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode"
      ],
      "begin_line": 343,
      "end_line": 367,
      "comment": "\n   * Class for nodes that set prototype properties or methods.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.PrototypeSetNode.PrototypeSetNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 350,
      "end_line": 354,
      "comment": "\n     * Create a set node from the name \u0026 setter node\n     *\n     * @param name The name\n     * @param parent Parent node that assigns the expression (an ASSIGN)\n     ",
      "child_ranges": [
        "(line 351,col 7)-(line 351,col 42)",
        "(line 353,col 7)-(line 353,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.PrototypeSetNode.remove()",
      "begin_line": 356,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 357,col 7)-(line 357,col 39)",
        "(line 358,col 7)-(line 365,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpecialReferenceNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.RefNode"
      ],
      "begin_line": 372,
      "end_line": 402,
      "comment": "\n   * Base class for special reference nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " JsName node for the function "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " The CALL node "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.SpecialReferenceNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 385,
      "end_line": 388,
      "comment": "\n     * Create a special reference node.\n     *\n     * @param name The name\n     * @param node The CALL node\n     ",
      "child_ranges": [
        "(line 386,col 7)-(line 386,col 23)",
        "(line 387,col 7)-(line 387,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.name()",
      "begin_line": 390,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 392,col 7)-(line 392,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.getParent()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.getGramps()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassDefiningFunctionNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode"
      ],
      "begin_line": 410,
      "end_line": 432,
      "comment": "\n   * Class for nodes that are function calls that may change a function\u0027s\n   * prototype\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ClassDefiningFunctionNode.ClassDefiningFunctionNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n     * Create a class defining function node from the name \u0026 setter node\n     *\n     * @param name The name\n     * @param node The CALL node\n     ",
      "child_ranges": [
        "(line 418,col 7)-(line 418,col 24)",
        "(line 419,col 7)-(line 419,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ClassDefiningFunctionNode.remove()",
      "begin_line": 422,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 424,col 7)-(line 424,col 46)",
        "(line 425,col 7)-(line 425,col 32)",
        "(line 426,col 7)-(line 430,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InstanceOfCheckNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode"
      ],
      "begin_line": 439,
      "end_line": 456,
      "comment": "\n   * Class for nodes that check instanceof\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.InstanceOfCheckNode.InstanceOfCheckNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 446,
      "end_line": 450,
      "comment": "\n     * Create an instanceof node from the name and parent node\n     *\n     * @param name The name\n     * @param node The qualified name node\n     ",
      "child_ranges": [
        "(line 447,col 7)-(line 447,col 24)",
        "(line 448,col 7)-(line 448,col 55)",
        "(line 449,col 7)-(line 449,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.InstanceOfCheckNode.remove()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 454,col 7)-(line 454,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExternals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 461,
      "end_line": 476,
      "comment": "\n   * Walk through externs and mark nodes as externally declared if declared\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ProcessExternals.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 462,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 464,col 7)-(line 464,col 32)",
        "(line 465,col 7)-(line 469,col 7)",
        "(line 470,col 7)-(line 474,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindDependencyScopes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 499,
      "end_line": 551,
      "comment": "\n   * \u003cp\u003eIdentifies all dependency scopes.\n   *\n   * \u003cp\u003eA dependency scope is a relationship between a node tree and a name that\n   * implies that the node tree will not execute (and thus can be eliminated) if\n   * the name is never referenced.\n   *\n   * \u003cp\u003eThe entire parse tree is ultimately in a dependency scope relationship\n   * with \u003ccode\u003ewindow\u003c/code\u003e (or an equivalent name for the global scope), but\n   * the goal here is to find finer-grained relationships. This callback creates\n   * dependency scopes for every assignment statement, variable declaration, and\n   * function call in the global scope.\n   *\n   * \u003cp\u003eNote that dependency scope node trees aren\u0027t necessarily disjoint.\n   * In the following code snippet, for example, the function definition\n   * forms a dependency scope with the name \u003ccode\u003ef\u003c/code\u003e and the assignment\n   * inside the function forms a dependency scope with the name \u003ccode\u003ex\u003c/code\u003e.\n   * \u003cpre\u003e\n   * var x; function f() { x \u003d 1; }\n   * \u003c/pre\u003e\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 500,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 502,col 7)-(line 504,col 7)",
        "(line 506,col 7)-(line 542,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.recordDepScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * Defines a dependency scope.\n     ",
      "child_ranges": [
        "(line 549,col 7)-(line 549,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HoistVariableAndFunctionDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 559,
      "end_line": 575,
      "comment": "\n   * Create JsName objects for variable and function declarations in\n   * the global scope before computing name references.  In JavaScript\n   * it is legal to refer to variable and function names before the\n   * actual declaration.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.HoistVariableAndFunctionDeclarations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 562,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 564,col 7)-(line 573,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindDeclarationsAndSetters",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 585,
      "end_line": 690,
      "comment": "\n   * Identifies all declarations of global names and setter statements\n   * affecting global symbols (assignments to global names).\n   *\n   * All declarations and setters must be gathered in a single\n   * traversal and stored in traversal order so \"removeUnreferenced\"\n   * can perform modifications in traversal order.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 587,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 591,col 7)-(line 609,col 7)",
        "(line 612,col 7)-(line 630,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordSet(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 640,
      "end_line": 652,
      "comment": "\n     * Records the assignment of a value to a global name.\n     *\n     * @param name Fully qualified name\n     * @param node The top node representing the name (GETPROP, NAME, or STRING\n     * [objlit key])\n     ",
      "child_ranges": [
        "(line 641,col 7)-(line 641,col 39)",
        "(line 642,col 7)-(line 642,col 63)",
        "(line 643,col 7)-(line 643,col 32)",
        "(line 647,col 7)-(line 651,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordPrototypeSet(java.lang.String, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 662,
      "end_line": 668,
      "comment": "\n     * Records the assignment to a prototype property of a global name,\n     * if possible.\n     *\n     * @param className The name of the class.\n     * @param prototypeProperty The name of the prototype property.\n     * @param node The top node representing the name (GETPROP)\n     ",
      "child_ranges": [
        "(line 664,col 7)-(line 664,col 45)",
        "(line 665,col 7)-(line 665,col 49)",
        "(line 666,col 7)-(line 666,col 53)",
        "(line 667,col 7)-(line 667,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordWriteOnProperties(java.lang.String)",
      "begin_line": 673,
      "end_line": 689,
      "comment": "\n     * Record that the properties of this name have been written to.\n     ",
      "child_ranges": [
        "(line 674,col 7)-(line 688,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NON_LOCAL_RESULT_PREDICATE"
      ],
      "begin_line": 692,
      "end_line": 704,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.Anonymous-a4808f73-04eb-4133-b50e-94d0068c93bc.apply(com.google.javascript.rhino.Node)",
      "begin_line": 694,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 696,col 11)-(line 698,col 11)",
        "(line 702,col 11)-(line 702,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 714,
      "end_line": 1010,
      "comment": "\n   * \u003cp\u003eIdentifies all references between global names.\n   *\n   * \u003cp\u003eA reference from a name \u003ccode\u003ef\u003c/code\u003e to a name \u003ccode\u003eg\u003c/code\u003e means\n   * that if the name \u003ccode\u003ef\u003c/code\u003e must be defined, then the name\n   * \u003ccode\u003eg\u003c/code\u003e must also be defined. This would be the case if, for\n   * example, \u003ccode\u003ef\u003c/code\u003e were a function that called \u003ccode\u003eg\u003c/code\u003e.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodesToKeep"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.FindReferences()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 7)-(line 717,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addAllChildren(com.google.javascript.rhino.Node)",
      "begin_line": 720,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 721,col 7)-(line 721,col 25)",
        "(line 722,col 7)-(line 726,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addSimplifiedChildren(com.google.javascript.rhino.Node)",
      "begin_line": 729,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 730,col 7)-(line 733,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addSimplifiedExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 736,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 737,col 7)-(line 754,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 757,
      "end_line": 804,
      "comment": "",
      "child_ranges": [
        "(line 759,col 7)-(line 761,col 7)",
        "(line 767,col 7)-(line 781,col 7)",
        "(line 783,col 7)-(line 788,col 7)",
        "(line 790,col 7)-(line 797,col 7)",
        "(line 799,col 7)-(line 801,col 7)",
        "(line 803,col 7)-(line 803,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 806,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 808,col 7)-(line 812,col 7)",
        "(line 814,col 7)-(line 814,col 69)",
        "(line 815,col 7)-(line 818,col 7)",
        "(line 820,col 7)-(line 836,col 7)",
        "(line 838,col 7)-(line 846,col 7)",
        "(line 852,col 7)-(line 852,col 56)",
        "(line 853,col 7)-(line 853,col 32)",
        "(line 854,col 7)-(line 858,col 7)",
        "(line 860,col 7)-(line 860,col 34)",
        "(line 866,col 7)-(line 868,col 7)",
        "(line 872,col 7)-(line 876,col 7)",
        "(line 880,col 7)-(line 885,col 7)",
        "(line 887,col 7)-(line 912,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.maybeHiddenAlias(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 921,
      "end_line": 930,
      "comment": "\n     * A value whose result is the return value of a function call\n     * can be an alias to global object. The dependency on the call target will\n     * prevent the removal of the function and its dependent values, but won\u0027t\n     * prevent the alias\u0027 removal.\n     ",
      "child_ranges": [
        "(line 922,col 7)-(line 922,col 34)",
        "(line 923,col 7)-(line 928,col 7)",
        "(line 929,col 7)-(line 929,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.maybeRecordAlias(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation, java.lang.String)",
      "begin_line": 935,
      "end_line": 967,
      "comment": "\n     * @return Whether the alias was recorded.\n     ",
      "child_ranges": [
        "(line 954,col 7)-(line 956,col 66)",
        "(line 958,col 7)-(line 965,col 7)",
        "(line 966,col 7)-(line 966,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeAccumulator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator"
      ],
      "begin_line": 973,
      "end_line": 1009,
      "comment": "\n     * Helper class that gathers the list of nodes that would be left\n     * behind after simplification.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.classDefiningCallsHaveSideEffects()",
      "begin_line": 976,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSubTree(com.google.javascript.rhino.Node)",
      "begin_line": 981,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node)",
      "begin_line": 986,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 50)",
        "(line 989,col 9)-(line 989,col 46)",
        "(line 990,col 9)-(line 990,col 34)",
        "(line 991,col 9)-(line 991,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSimplifiedHookExpression(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 994,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 46)",
        "(line 999,col 9)-(line 999,col 46)",
        "(line 1000,col 9)-(line 1000,col 47)",
        "(line 1001,col 9)-(line 1001,col 34)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1007,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveListener",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AstChangeProxy.ChangeListener"
      ],
      "begin_line": 1012,
      "end_line": 1017,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RemoveListener.nodeRemoved(com.google.javascript.rhino.Node)",
      "begin_line": 1013,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 7)-(line 1015,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.NameAnalyzer(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 1031,
      "end_line": 1036,
      "comment": "\n   * Creates a name analyzer, with option to remove unreferenced variables when\n   * calling process().\n   *\n   * The analyzer make a best guess at whether functions affect global scope\n   * based on usage (no assignment of return value means that a function has\n   * side effects).\n   *\n   * @param compiler The AbstractCompiler\n   * @param removeUnreferenced If true, remove unreferenced variables during\n   *        process()\n   ",
      "child_ranges": [
        "(line 1032,col 5)-(line 1032,col 29)",
        "(line 1033,col 5)-(line 1033,col 49)",
        "(line 1034,col 5)-(line 1034,col 44)",
        "(line 1035,col 5)-(line 1035,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1038,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 5)-(line 1040,col 70)",
        "(line 1041,col 5)-(line 1041,col 71)",
        "(line 1042,col 5)-(line 1043,col 68)",
        "(line 1044,col 5)-(line 1044,col 77)",
        "(line 1045,col 5)-(line 1045,col 65)",
        "(line 1049,col 5)-(line 1049,col 27)",
        "(line 1053,col 5)-(line 1053,col 23)",
        "(line 1055,col 5)-(line 1055,col 26)",
        "(line 1057,col 5)-(line 1059,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.recordAlias(java.lang.String, java.lang.String)",
      "begin_line": 1065,
      "end_line": 1097,
      "comment": "\n   * Records an alias of one name to another name.\n   ",
      "child_ranges": [
        "(line 1066,col 5)-(line 1066,col 55)",
        "(line 1077,col 5)-(line 1077,col 50)",
        "(line 1078,col 5)-(line 1078,col 54)",
        "(line 1079,col 5)-(line 1079,col 30)",
        "(line 1080,col 5)-(line 1094,col 5)",
        "(line 1095,col 5)-(line 1095,col 37)",
        "(line 1096,col 5)-(line 1096,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.recordReference(java.lang.String, java.lang.String, com.google.javascript.jscomp.NameAnalyzer.RefType)",
      "begin_line": 1102,
      "end_line": 1116,
      "comment": "\n   * Records a reference from one name to another name.\n   ",
      "child_ranges": [
        "(line 1104,col 5)-(line 1107,col 5)",
        "(line 1109,col 5)-(line 1109,col 42)",
        "(line 1110,col 5)-(line 1110,col 38)",
        "(line 1111,col 5)-(line 1111,col 36)",
        "(line 1112,col 5)-(line 1112,col 34)",
        "(line 1113,col 5)-(line 1115,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.removeUnreferenced()",
      "begin_line": 1121,
      "end_line": 1133,
      "comment": "\n   * Removes all unreferenced variables.\n   ",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 51)",
        "(line 1123,col 5)-(line 1123,col 43)",
        "(line 1125,col 5)-(line 1130,col 5)",
        "(line 1132,col 5)-(line 1132,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getHtmlReport()",
      "begin_line": 1140,
      "end_line": 1210,
      "comment": "\n   * Generates an HTML report\n   *\n   * @return The report\n   ",
      "child_ranges": [
        "(line 1141,col 5)-(line 1141,col 43)",
        "(line 1142,col 5)-(line 1146,col 42)",
        "(line 1147,col 5)-(line 1147,col 35)",
        "(line 1148,col 5)-(line 1148,col 80)",
        "(line 1149,col 5)-(line 1150,col 49)",
        "(line 1151,col 5)-(line 1152,col 50)",
        "(line 1153,col 5)-(line 1154,col 49)",
        "(line 1155,col 5)-(line 1156,col 49)",
        "(line 1157,col 5)-(line 1158,col 50)",
        "(line 1159,col 5)-(line 1159,col 23)",
        "(line 1161,col 5)-(line 1161,col 33)",
        "(line 1162,col 5)-(line 1205,col 5)",
        "(line 1206,col 5)-(line 1206,col 23)",
        "(line 1207,col 5)-(line 1207,col 32)",
        "(line 1209,col 5)-(line 1209,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.appendListItem(java.lang.StringBuilder, java.lang.String)",
      "begin_line": 1212,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1213,col 5)-(line 1213,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.nameLink(java.lang.String)",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 5)-(line 1217,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.nameAnchor(java.lang.String)",
      "begin_line": 1220,
      "end_line": 1222,
      "comment": "",
      "child_ranges": [
        "(line 1221,col 5)-(line 1221,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getName(java.lang.String, boolean)",
      "begin_line": 1233,
      "end_line": 1238,
      "comment": "\n   * Looks up a {@link JsName} by name, optionally creating one if it doesn\u0027t\n   * already exist.\n   *\n   * @param name A fully qualified name\n   * @param canCreate Whether to create the object if necessary\n   * @return The {@code JsName} object, or null if one can\u0027t be found and\n   *   can\u0027t be created.\n   ",
      "child_ranges": [
        "(line 1234,col 5)-(line 1236,col 5)",
        "(line 1237,col 5)-(line 1237,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createName(java.lang.String)",
      "begin_line": 1246,
      "end_line": 1253,
      "comment": "\n   * Creates a {@link JsName} for the given name if it doesn\u0027t already\n   * exist.\n   *\n   * @param name A fully qualified name\n   ",
      "child_ranges": [
        "(line 1247,col 5)-(line 1247,col 36)",
        "(line 1248,col 5)-(line 1252,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.referenceAliases()",
      "begin_line": 1280,
      "end_line": 1289,
      "comment": "\n   * The NameAnalyzer algorithm works best when all objects have a canonical\n   * name in the global scope. When multiple names in the global scope\n   * point to the same object, things start to break down.\n   *\n   * For example, if we have\n   * \u003ccode\u003e\n   * var a \u003d {};\n   * var b \u003d a;\n   * a.foo \u003d 3;\n   * alert(b.foo);\n   * \u003c/code\u003e\n   * then a.foo and b.foo are the same name, even though NameAnalyzer doesn\u0027t\n   * represent them as such.\n   *\n   * To handle this case, we look at all the aliases in the program.\n   * If descendant properties of that alias are assigned, then we create a\n   * directional reference from the original name to the alias. For example,\n   * in this case, the assign to {@code a.foo} triggers a reference from\n   * {@code b} to {@code a}, but NOT from a to b.\n   *\n   * Similarly, \"instanceof\" checks do not prevent the removal\n   * of a unaliased name but an instanceof check on an alias can only be removed\n   * if the other aliases are also removed, so we add a connection here.\n   ",
      "child_ranges": [
        "(line 1281,col 5)-(line 1288,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.referenceParentNames()",
      "begin_line": 1295,
      "end_line": 1317,
      "comment": "\n   * Adds mutual references between all known global names and their parent\n   * names. (e.g. between \u003ccode\u003ea.b.c\u003c/code\u003e and \u003ccode\u003ea.b\u003c/code\u003e).\n   ",
      "child_ranges": [
        "(line 1298,col 5)-(line 1298,col 66)",
        "(line 1300,col 5)-(line 1316,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createNameInformation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1328,
      "end_line": 1428,
      "comment": "\n   * Creates name information for the current node during a traversal.\n   *\n   * @param t The node traversal\n   * @param n The current node\n   * @param parent The parent of n\n   * @return The name information, or null if the name is irrelevant to this\n   *     pass\n   ",
      "child_ranges": [
        "(line 1332,col 5)-(line 1332,col 21)",
        "(line 1333,col 5)-(line 1333,col 26)",
        "(line 1334,col 5)-(line 1334,col 38)",
        "(line 1335,col 5)-(line 1368,col 5)",
        "(line 1372,col 5)-(line 1391,col 5)",
        "(line 1393,col 5)-(line 1427,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createNameInformation(java.lang.String, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 1440,
      "end_line": 1467,
      "comment": "\n   * Creates name information for a particular qualified name that occurs in a\n   * particular scope.\n   *\n   * @param name A qualified name (e.g. \"x\" or \"a.b.c\")\n   * @param scope The scope in which {@code name} occurs\n   * @param rootNameNode The NAME node for the first token of {@code name}\n   * @return The name information, or null if the name is irrelevant to this\n   *     pass\n   ",
      "child_ranges": [
        "(line 1443,col 5)-(line 1443,col 47)",
        "(line 1444,col 5)-(line 1444,col 35)",
        "(line 1445,col 5)-(line 1445,col 71)",
        "(line 1446,col 5)-(line 1447,col 32)",
        "(line 1448,col 5)-(line 1450,col 5)",
        "(line 1452,col 5)-(line 1452,col 53)",
        "(line 1455,col 5)-(line 1455,col 48)",
        "(line 1456,col 5)-(line 1461,col 5)",
        "(line 1463,col 5)-(line 1463,col 25)",
        "(line 1464,col 5)-(line 1465,col 59)",
        "(line 1466,col 5)-(line 1466,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.isExternallyReferenceable(com.google.javascript.jscomp.Scope, java.lang.String)",
      "begin_line": 1477,
      "end_line": 1490,
      "comment": "\n   * Checks whether a name can be referenced outside of the compiled code.\n   * These names will be the root of dependency trees.\n   *\n   * @param scope The current variable scope\n   * @param name The name\n   * @return True if can be referenced outside\n   ",
      "child_ranges": [
        "(line 1478,col 5)-(line 1480,col 5)",
        "(line 1481,col 5)-(line 1483,col 5)",
        "(line 1484,col 5)-(line 1488,col 5)",
        "(line 1489,col 5)-(line 1489,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getDependencyScope(com.google.javascript.rhino.Node)",
      "begin_line": 1495,
      "end_line": 1504,
      "comment": "\n   * Gets the nearest enclosing dependency scope, or null if there isn\u0027t one.\n   ",
      "child_ranges": [
        "(line 1496,col 5)-(line 1501,col 5)",
        "(line 1503,col 5)-(line 1503,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getEnclosingFunctionDependencyScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1512,
      "end_line": 1543,
      "comment": "\n   * Get dependency scope defined by the enclosing function, or null.\n   * If enclosing function is a function expression, determine scope based on\n   * its parent if the parent node is a variable declaration or\n   * assignment.\n   ",
      "child_ranges": [
        "(line 1513,col 5)-(line 1513,col 45)",
        "(line 1514,col 5)-(line 1516,col 5)",
        "(line 1518,col 5)-(line 1518,col 47)",
        "(line 1519,col 5)-(line 1521,col 5)",
        "(line 1525,col 5)-(line 1525,col 39)",
        "(line 1526,col 5)-(line 1540,col 5)",
        "(line 1542,col 5)-(line 1542,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.calculateReferences()",
      "begin_line": 1548,
      "end_line": 1557,
      "comment": "\n   * Propagate \"referenced\" property down the graph.\n   ",
      "child_ranges": [
        "(line 1549,col 5)-(line 1549,col 42)",
        "(line 1550,col 5)-(line 1550,col 29)",
        "(line 1551,col 5)-(line 1551,col 46)",
        "(line 1552,col 5)-(line 1552,col 31)",
        "(line 1555,col 5)-(line 1556,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.countOf(com.google.javascript.jscomp.NameAnalyzer.TriState, com.google.javascript.jscomp.NameAnalyzer.TriState)",
      "begin_line": 1580,
      "end_line": 1599,
      "comment": "\n   * Gets the count of nodes matching the criteria\n   *\n   * @param isClass Whether the node is a class\n   * @param referenced Whether the node is referenced\n   * @return Number of matches\n   ",
      "child_ranges": [
        "(line 1581,col 5)-(line 1581,col 18)",
        "(line 1582,col 5)-(line 1597,col 5)",
        "(line 1598,col 5)-(line 1598,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getSideEffectNodes(com.google.javascript.rhino.Node)",
      "begin_line": 1605,
      "end_line": 1620,
      "comment": "\n   * Extract a list of replacement nodes to use.\n   ",
      "child_ranges": [
        "(line 1606,col 5)-(line 1606,col 53)",
        "(line 1607,col 5)-(line 1612,col 44)",
        "(line 1614,col 5)-(line 1615,col 66)",
        "(line 1616,col 5)-(line 1618,col 5)",
        "(line 1619,col 5)-(line 1619,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.replaceWithRhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1629,
      "end_line": 1655,
      "comment": "\n   * Replace n with a simpler expression, while preserving program\n   * behavior.\n   *\n   * If the n\u0027s value is used, replace it with its RHS; otherwise\n   * replace it with the subexpressions that have side effects.\n   ",
      "child_ranges": [
        "(line 1630,col 5)-(line 1654,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.replaceTopLevelExpressionWithRhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1661,
      "end_line": 1708,
      "comment": "\n   * Simplify a toplevel expression, while preserving program\n   * behavior.\n   ",
      "child_ranges": [
        "(line 1663,col 5)-(line 1673,col 5)",
        "(line 1675,col 5)-(line 1688,col 5)",
        "(line 1691,col 5)-(line 1691,col 51)",
        "(line 1692,col 5)-(line 1694,col 5)",
        "(line 1696,col 5)-(line 1705,col 5)",
        "(line 1707,col 5)-(line 1707,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.valueConsumedByParent(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1725,
      "end_line": 1748,
      "comment": "\n   * Determine if the parent reads the value of a child expression\n   * directly.  This is true children used in predicates, RETURN\n   * statements and, RHS of variable declarations and assignments.\n   *\n   * In the case of:\n   * if (a) b else c\n   *\n   * This method returns true for \"a\", and false for \"b\" and \"c\": the\n   * IF expression does something special based on \"a\"\u0027s value.  \"b\"\n   * and \"c\" are effectively outputs.  Same logic applies to FOR,\n   * WHILE and DO loop predicates.  AND/OR/HOOK expressions are\n   * syntactic sugar for IF statements; therefore this method returns\n   * true for the predicate and false otherwise.\n   ",
      "child_ranges": [
        "(line 1726,col 5)-(line 1728,col 5)",
        "(line 1730,col 5)-(line 1747,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.collapseReplacements(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1754,
      "end_line": 1770,
      "comment": "\n   * Merge a list of nodes into a single expression.  The value of the\n   * new expression is determined by the last expression in the list.\n   ",
      "child_ranges": [
        "(line 1755,col 5)-(line 1755,col 21)",
        "(line 1756,col 5)-(line 1767,col 5)",
        "(line 1769,col 5)-(line 1769,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getRhsSubexpressions(com.google.javascript.rhino.Node)",
      "begin_line": 1775,
      "end_line": 1812,
      "comment": "\n   * Extract a list of subexpressions that act as right hand sides.\n   ",
      "child_ranges": [
        "(line 1776,col 5)-(line 1811,col 5)"
      ]
    }
  ]
}