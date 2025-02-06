{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NameAnalyzer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameAnalyzer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 78,
      "end_line": 1882,
      "comment": "\n * This pass identifies all global names, simple (e.g. \u003ccode\u003ea\u003c/code\u003e) or\n * qualified (e.g. \u003ccode\u003ea.b.c\u003c/code\u003e), and the dependencies between them, then\n * removes code associated with unreferenced names. It starts by assuming that\n * only externally accessible names (e.g. \u003ccode\u003ewindow\u003c/code\u003e) are referenced,\n * then iteratively marks additional names as referenced (e.g. \u003ccode\u003eFoo\u003c/code\u003e\n * in \u003ccode\u003ewindow[\u0027foo\u0027] \u003d new Foo();\u003c/code\u003e). This makes it possible to\n * eliminate code containing circular references.\n *\n * \u003cp\u003eQualified names can be defined using dotted or object literal syntax\n * (\u003ccode\u003ea.b.c \u003d x;\u003c/code\u003e or \u003ccode\u003ea.b \u003d {c: x};\u003c/code\u003e, respectively).\n *\n * \u003cp\u003eRemoval of prototype classes is currently all or nothing. In other words,\n * prototype properties and methods are never individually removed.\n *\n * \u003cp\u003eOptionally generates pretty HTML output of data so that it is easy to\n * analyze dependencies.\n *\n * \u003cp\u003eOnly operates on names defined in the global scope, but it would be easy\n * to extend the pass to names defined in local scopes.\n *\n * TODO(nicksantos): In the initial implementation of this pass, it was\n * important to understand namespaced names (e.g., that a.b is distinct from\n * a.b.c). Now that this pass comes after CollapseProperties, this is no longer\n * necessary. For now, I\u0027ve changed so that {@code referenceParentNames}\n * creates a two-way reference between a.b and a.b.c, so that they\u0027re\n * effectively the same name. When someone has the time, we should completely\n * rip out all the logic that understands namespaces.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Reference to the JS compiler "
    },
    {
      "type": "field",
      "varNames": [
        "allNames"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Map of all JS names found "
    },
    {
      "type": "field",
      "varNames": [
        "referenceGraph"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": " Reference dependency graph "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n   * Map of name scopes - all children of the Node key have a dependency on the\n   * name value.\n   *\n   * If scopes.get(node).equals(name) \u0026\u0026 node2 is a child of node, then node2\n   * will not get executed unless name is referenced via a get operation\n   "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUBSTRING"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Used to parse prototype names "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUBSTRING_LEN"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_SUFFIX_LEN"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Window root "
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Function class name "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GLOBAL_NAMES"
      ],
      "begin_line": 115,
      "end_line": 116,
      "comment": " All of these refer to global scope. These can be moved to config "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnreferenced"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Whether to remove unreferenced variables in main pass "
    },
    {
      "type": "field",
      "varNames": [
        "globalNames"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Names that refer to the global scope "
    },
    {
      "type": "field",
      "varNames": [
        "changeProxy"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Ast change helper "
    },
    {
      "type": "field",
      "varNames": [
        "externalNames"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Names that are externally defined "
    },
    {
      "type": "field",
      "varNames": [
        "refNodes"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Name declarations or assignments, in post-order traversal order "
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n   * When multiple names in the global scope point to the same object, we\n   * call them aliases. Store a map from each alias name to the alias set.\n   "
    },
    {
      "type": "class_interface",
      "name": "AliasSet",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n   * All the aliases in a program form a graph, where each global name is\n   * a node in the graph, and two names are connected if one directly aliases\n   * the other.\n   *\n   * An {@code AliasSet} represents a connected component in that graph. We do\n   * not explicitly track the graph--we just track the connected components.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.AliasSet.AliasSet(java.lang.String, java.lang.String)",
      "begin_line": 151,
      "end_line": 154,
      "comment": " Every alias set starts with exactly 2 names.",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 23)",
        "(line 153,col 7)-(line 153,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferencePropagationCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType\u003e"
      ],
      "begin_line": 170,
      "end_line": 183,
      "comment": "\n   * Callback that propagates reference information.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ReferencePropagationCallback.traverseEdge(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType, com.google.javascript.jscomp.NameAnalyzer.JsName)",
      "begin_line": 172,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 176,col 7)-(line 181,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 189,
      "end_line": 210,
      "comment": "\n   * Class to hold information that can be determined from a node tree about a\n   * given name\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Fully qualified name "
    },
    {
      "type": "field",
      "varNames": [
        "isExternallyReferenceable"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Whether the name is guaranteed to be externally referenceable "
    },
    {
      "type": "field",
      "varNames": [
        "isPrototype"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Whether this name is a prototype function "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeClass"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Name of the prototype class, i.e. \"a\" if name is \"a.prototype.b\" "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeProperty"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Local name of prototype property i.e. \"b\" if name is \"a.prototype.b\" "
    },
    {
      "type": "field",
      "varNames": [
        "superclass"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Name of the super class of name "
    },
    {
      "type": "field",
      "varNames": [
        "onlyAffectsClassDef"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Whether this is a call that only affects the class definition "
    },
    {
      "type": "class_interface",
      "name": "JsName",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003ccom.google.javascript.jscomp.NameAnalyzer.JsName\u003e"
      ],
      "begin_line": 215,
      "end_line": 263,
      "comment": "\n   * Struct to hold information about a fully qualified JS name\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " Fully qualified name "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeNames"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " Name of prototype functions attached to this name "
    },
    {
      "type": "field",
      "varNames": [
        "externallyDefined"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " Whether this is an externally defined name "
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Whether this node is referenced "
    },
    {
      "type": "field",
      "varNames": [
        "hasWrittenDescendants"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " Whether the name has descendants that are written to. "
    },
    {
      "type": "field",
      "varNames": [
        "hasInstanceOfReference"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " Whether the name is used in a instanceof check "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsName.toString()",
      "begin_line": 239,
      "end_line": 257,
      "comment": "\n     * Output the node as a string\n     *\n     * @return Node as a string\n     ",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 46)",
        "(line 242,col 7)-(line 242,col 23)",
        "(line 244,col 7)-(line 254,col 7)",
        "(line 256,col 7)-(line 256,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsName.compareTo(com.google.javascript.jscomp.NameAnalyzer.JsName)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 7)-(line 261,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RefNode",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n   * Interface to get information about and remove unreferenced names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RefNode.name()",
      "begin_line": 269,
      "end_line": 269,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RefNode.remove()",
      "begin_line": 270,
      "end_line": 270,
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
      "begin_line": 278,
      "end_line": 340,
      "comment": "\n   * Class for nodes that reference a fully-qualified JS name. Fully qualified\n   * names are of form A or A.B (A.B.C, etc.). References can get the value or\n   * set the value of the JS name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " JsName node for this reference "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 286,
      "end_line": 287,
      "comment": "\n     * Top GETPROP or NAME or STRING [objlit key] node defining the name of\n     * this node\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * Parent node of the name access\n     * (ASSIGN, VAR, FUNCTION, OBJECTLIT, or CALL)\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.JsNameRefNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 302,
      "end_line": 306,
      "comment": "\n     * Create a node that refers to a name\n     *\n     * @param name The name\n     * @param node The top node representing the name (GETPROP, NAME, STRING)\n     ",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 23)",
        "(line 304,col 7)-(line 304,col 23)",
        "(line 305,col 7)-(line 305,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.name()",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 310,col 7)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.remove()",
      "begin_line": 313,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 317,col 7)-(line 317,col 47)",
        "(line 318,col 7)-(line 338,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrototypeSetNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode"
      ],
      "begin_line": 346,
      "end_line": 370,
      "comment": "\n   * Class for nodes that set prototype properties or methods.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.PrototypeSetNode.PrototypeSetNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 353,
      "end_line": 357,
      "comment": "\n     * Create a set node from the name \u0026 setter node\n     *\n     * @param name The name\n     * @param parent Parent node that assigns the expression (an ASSIGN)\n     ",
      "child_ranges": [
        "(line 354,col 7)-(line 354,col 42)",
        "(line 356,col 7)-(line 356,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.PrototypeSetNode.remove()",
      "begin_line": 359,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 360,col 7)-(line 360,col 39)",
        "(line 361,col 7)-(line 368,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SpecialReferenceNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.RefNode"
      ],
      "begin_line": 375,
      "end_line": 405,
      "comment": "\n   * Base class for special reference nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " JsName node for the function "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " The CALL node "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.SpecialReferenceNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 388,
      "end_line": 391,
      "comment": "\n     * Create a special reference node.\n     *\n     * @param name The name\n     * @param node The CALL node\n     ",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 23)",
        "(line 390,col 7)-(line 390,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.name()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.getParent()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 7)-(line 399,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.getGramps()",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 7)-(line 403,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassDefiningFunctionNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode"
      ],
      "begin_line": 413,
      "end_line": 435,
      "comment": "\n   * Class for nodes that are function calls that may change a function\u0027s\n   * prototype\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ClassDefiningFunctionNode.ClassDefiningFunctionNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\n     * Create a class defining function node from the name \u0026 setter node\n     *\n     * @param name The name\n     * @param node The CALL node\n     ",
      "child_ranges": [
        "(line 421,col 7)-(line 421,col 24)",
        "(line 422,col 7)-(line 422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ClassDefiningFunctionNode.remove()",
      "begin_line": 425,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 427,col 7)-(line 427,col 46)",
        "(line 428,col 7)-(line 428,col 32)",
        "(line 429,col 7)-(line 433,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InstanceOfCheckNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode"
      ],
      "begin_line": 442,
      "end_line": 459,
      "comment": "\n   * Class for nodes that check instanceof\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.InstanceOfCheckNode.InstanceOfCheckNode(com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 453,
      "comment": "\n     * Create an instanceof node from the name and parent node\n     *\n     * @param name The name\n     * @param node The qualified name node\n     ",
      "child_ranges": [
        "(line 450,col 7)-(line 450,col 24)",
        "(line 451,col 7)-(line 451,col 55)",
        "(line 452,col 7)-(line 452,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.InstanceOfCheckNode.remove()",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExternals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 464,
      "end_line": 479,
      "comment": "\n   * Walk through externs and mark nodes as externally declared if declared\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.ProcessExternals.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 465,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 467,col 32)",
        "(line 468,col 7)-(line 472,col 7)",
        "(line 473,col 7)-(line 477,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindDependencyScopes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 502,
      "end_line": 591,
      "comment": "\n   * \u003cp\u003eIdentifies all dependency scopes.\n   *\n   * \u003cp\u003eA dependency scope is a relationship between a node tree and a name that\n   * implies that the node tree will not execute (and thus can be eliminated) if\n   * the name is never referenced.\n   *\n   * \u003cp\u003eThe entire parse tree is ultimately in a dependency scope relationship\n   * with \u003ccode\u003ewindow\u003c/code\u003e (or an equivalent name for the global scope), but\n   * the goal here is to find finer-grained relationships. This callback creates\n   * dependency scopes for every assignment statement, variable declaration, and\n   * function call in the global scope.\n   *\n   * \u003cp\u003eNote that dependency scope node trees aren\u0027t necessarily disjoint.\n   * In the following code snippet, for example, the function definition\n   * forms a dependency scope with the name \u003ccode\u003ef\u003c/code\u003e and the assignment\n   * inside the function forms a dependency scope with the name \u003ccode\u003ex\u003c/code\u003e.\n   * \u003cpre\u003e\n   * var x; function f() { x \u003d 1; }\n   * \u003c/pre\u003e\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 503,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 505,col 7)-(line 507,col 7)",
        "(line 509,col 7)-(line 527,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.recordConsumers(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 530,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 531,col 7)-(line 531,col 34)",
        "(line 532,col 7)-(line 555,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.recordAssignment(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 558,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 559,col 7)-(line 559,col 40)",
        "(line 560,col 7)-(line 560,col 34)",
        "(line 561,col 7)-(line 561,col 62)",
        "(line 562,col 7)-(line 581,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes.recordDepScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation)",
      "begin_line": 587,
      "end_line": 590,
      "comment": "\n     * Defines a dependency scope.\n     ",
      "child_ranges": [
        "(line 588,col 7)-(line 588,col 39)",
        "(line 589,col 7)-(line 589,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HoistVariableAndFunctionDeclarations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 599,
      "end_line": 615,
      "comment": "\n   * Create JsName objects for variable and function declarations in\n   * the global scope before computing name references.  In JavaScript\n   * it is legal to refer to variable and function names before the\n   * actual declaration.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.HoistVariableAndFunctionDeclarations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 602,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 613,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindDeclarationsAndSetters",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 625,
      "end_line": 730,
      "comment": "\n   * Identifies all declarations of global names and setter statements\n   * affecting global symbols (assignments to global names).\n   *\n   * All declarations and setters must be gathered in a single\n   * traversal and stored in traversal order so \"removeUnreferenced\"\n   * can perform modifications in traversal order.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 627,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 631,col 7)-(line 649,col 7)",
        "(line 652,col 7)-(line 670,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordSet(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 680,
      "end_line": 692,
      "comment": "\n     * Records the assignment of a value to a global name.\n     *\n     * @param name Fully qualified name\n     * @param node The top node representing the name (GETPROP, NAME, or STRING\n     * [objlit key])\n     ",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 39)",
        "(line 682,col 7)-(line 682,col 63)",
        "(line 683,col 7)-(line 683,col 32)",
        "(line 687,col 7)-(line 691,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordPrototypeSet(java.lang.String, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 702,
      "end_line": 708,
      "comment": "\n     * Records the assignment to a prototype property of a global name,\n     * if possible.\n     *\n     * @param className The name of the class.\n     * @param prototypeProperty The name of the prototype property.\n     * @param node The top node representing the name (GETPROP)\n     ",
      "child_ranges": [
        "(line 704,col 7)-(line 704,col 45)",
        "(line 705,col 7)-(line 705,col 49)",
        "(line 706,col 7)-(line 706,col 53)",
        "(line 707,col 7)-(line 707,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters.recordWriteOnProperties(java.lang.String)",
      "begin_line": 713,
      "end_line": 729,
      "comment": "\n     * Record that the properties of this name have been written to.\n     ",
      "child_ranges": [
        "(line 714,col 7)-(line 728,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NON_LOCAL_RESULT_PREDICATE"
      ],
      "begin_line": 732,
      "end_line": 744,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.Anonymous-43d3bda6-9922-4810-9455-d577bbb72c96.apply(com.google.javascript.rhino.Node)",
      "begin_line": 734,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 736,col 11)-(line 738,col 11)",
        "(line 742,col 11)-(line 742,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 754,
      "end_line": 1079,
      "comment": "\n   * \u003cp\u003eIdentifies all references between global names.\n   *\n   * \u003cp\u003eA reference from a name \u003ccode\u003ef\u003c/code\u003e to a name \u003ccode\u003eg\u003c/code\u003e means\n   * that if the name \u003ccode\u003ef\u003c/code\u003e must be defined, then the name\n   * \u003ccode\u003eg\u003c/code\u003e must also be defined. This would be the case if, for\n   * example, \u003ccode\u003ef\u003c/code\u003e were a function that called \u003ccode\u003eg\u003c/code\u003e.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodesToKeep"
      ],
      "begin_line": 755,
      "end_line": 755,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.FindReferences()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 7)-(line 757,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addAllChildren(com.google.javascript.rhino.Node)",
      "begin_line": 760,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 761,col 7)-(line 761,col 25)",
        "(line 762,col 7)-(line 766,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addSimplifiedChildren(com.google.javascript.rhino.Node)",
      "begin_line": 769,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 770,col 7)-(line 773,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.addSimplifiedExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 776,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 777,col 7)-(line 794,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 797,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 799,col 7)-(line 801,col 7)",
        "(line 807,col 7)-(line 821,col 7)",
        "(line 823,col 7)-(line 828,col 7)",
        "(line 830,col 7)-(line 837,col 7)",
        "(line 839,col 7)-(line 841,col 7)",
        "(line 843,col 7)-(line 843,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 846,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 848,col 7)-(line 852,col 7)",
        "(line 854,col 7)-(line 854,col 61)",
        "(line 855,col 7)-(line 858,col 7)",
        "(line 860,col 7)-(line 876,col 7)",
        "(line 878,col 7)-(line 886,col 7)",
        "(line 892,col 7)-(line 892,col 61)",
        "(line 893,col 7)-(line 900,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.maybeRecordReferenceOrAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation, com.google.javascript.jscomp.NameAnalyzer.NameInformation)",
      "begin_line": 903,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 906,col 7)-(line 906,col 32)",
        "(line 907,col 7)-(line 911,col 7)",
        "(line 913,col 7)-(line 913,col 34)",
        "(line 919,col 7)-(line 921,col 7)",
        "(line 925,col 7)-(line 929,col 7)",
        "(line 933,col 7)-(line 938,col 7)",
        "(line 940,col 7)-(line 971,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.recordAliases(java.util.List\u003ccom.google.javascript.jscomp.NameAnalyzer.NameInformation\u003e)",
      "begin_line": 974,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 975,col 7)-(line 975,col 33)",
        "(line 976,col 7)-(line 981,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.maybeHiddenAlias(com.google.javascript.rhino.Node)",
      "begin_line": 990,
      "end_line": 999,
      "comment": "\n     * A value whose result is the return value of a function call\n     * can be an alias to global object. The dependency on the call target will\n     * prevent the removal of the function and its dependent values, but won\u0027t\n     * prevent the alias\u0027 removal.\n     ",
      "child_ranges": [
        "(line 991,col 7)-(line 991,col 34)",
        "(line 992,col 7)-(line 997,col 7)",
        "(line 998,col 7)-(line 998,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.maybeRecordAlias(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation, java.lang.String)",
      "begin_line": 1004,
      "end_line": 1036,
      "comment": "\n     * @return Whether the alias was recorded.\n     ",
      "child_ranges": [
        "(line 1023,col 7)-(line 1025,col 66)",
        "(line 1027,col 7)-(line 1034,col 7)",
        "(line 1035,col 7)-(line 1035,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeAccumulator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator"
      ],
      "begin_line": 1042,
      "end_line": 1078,
      "comment": "\n     * Helper class that gathers the list of nodes that would be left\n     * behind after simplification.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.classDefiningCallsHaveSideEffects()",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSubTree(com.google.javascript.rhino.Node)",
      "begin_line": 1050,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 9)-(line 1052,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1055,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 50)",
        "(line 1058,col 9)-(line 1058,col 46)",
        "(line 1059,col 9)-(line 1059,col 34)",
        "(line 1060,col 9)-(line 1060,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator.keepSimplifiedHookExpression(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 1063,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 46)",
        "(line 1068,col 9)-(line 1068,col 46)",
        "(line 1069,col 9)-(line 1069,col 47)",
        "(line 1070,col 9)-(line 1070,col 34)",
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1076,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveListener",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AstChangeProxy.ChangeListener"
      ],
      "begin_line": 1081,
      "end_line": 1086,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.RemoveListener.nodeRemoved(com.google.javascript.rhino.Node)",
      "begin_line": 1082,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1084,col 7)-(line 1084,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.NameAnalyzer(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 1100,
      "end_line": 1105,
      "comment": "\n   * Creates a name analyzer, with option to remove unreferenced variables when\n   * calling process().\n   *\n   * The analyzer make a best guess at whether functions affect global scope\n   * based on usage (no assignment of return value means that a function has\n   * side effects).\n   *\n   * @param compiler The AbstractCompiler\n   * @param removeUnreferenced If true, remove unreferenced variables during\n   *        process()\n   ",
      "child_ranges": [
        "(line 1101,col 5)-(line 1101,col 29)",
        "(line 1102,col 5)-(line 1102,col 49)",
        "(line 1103,col 5)-(line 1103,col 44)",
        "(line 1104,col 5)-(line 1104,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1107,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 5)-(line 1109,col 70)",
        "(line 1110,col 5)-(line 1110,col 71)",
        "(line 1111,col 5)-(line 1112,col 68)",
        "(line 1113,col 5)-(line 1113,col 77)",
        "(line 1114,col 5)-(line 1114,col 65)",
        "(line 1118,col 5)-(line 1118,col 27)",
        "(line 1122,col 5)-(line 1122,col 23)",
        "(line 1124,col 5)-(line 1124,col 26)",
        "(line 1126,col 5)-(line 1128,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.recordAlias(java.lang.String, java.lang.String)",
      "begin_line": 1134,
      "end_line": 1166,
      "comment": "\n   * Records an alias of one name to another name.\n   ",
      "child_ranges": [
        "(line 1135,col 5)-(line 1135,col 55)",
        "(line 1146,col 5)-(line 1146,col 50)",
        "(line 1147,col 5)-(line 1147,col 54)",
        "(line 1148,col 5)-(line 1148,col 30)",
        "(line 1149,col 5)-(line 1163,col 5)",
        "(line 1164,col 5)-(line 1164,col 37)",
        "(line 1165,col 5)-(line 1165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.recordReference(java.lang.String, java.lang.String, com.google.javascript.jscomp.NameAnalyzer.RefType)",
      "begin_line": 1171,
      "end_line": 1185,
      "comment": "\n   * Records a reference from one name to another name.\n   ",
      "child_ranges": [
        "(line 1173,col 5)-(line 1176,col 5)",
        "(line 1178,col 5)-(line 1178,col 42)",
        "(line 1179,col 5)-(line 1179,col 38)",
        "(line 1180,col 5)-(line 1180,col 36)",
        "(line 1181,col 5)-(line 1181,col 34)",
        "(line 1182,col 5)-(line 1184,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.removeUnreferenced()",
      "begin_line": 1190,
      "end_line": 1202,
      "comment": "\n   * Removes all unreferenced variables.\n   ",
      "child_ranges": [
        "(line 1191,col 5)-(line 1191,col 51)",
        "(line 1192,col 5)-(line 1192,col 43)",
        "(line 1194,col 5)-(line 1199,col 5)",
        "(line 1201,col 5)-(line 1201,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getHtmlReport()",
      "begin_line": 1209,
      "end_line": 1279,
      "comment": "\n   * Generates an HTML report\n   *\n   * @return The report\n   ",
      "child_ranges": [
        "(line 1210,col 5)-(line 1210,col 43)",
        "(line 1211,col 5)-(line 1215,col 42)",
        "(line 1216,col 5)-(line 1216,col 35)",
        "(line 1217,col 5)-(line 1217,col 80)",
        "(line 1218,col 5)-(line 1219,col 49)",
        "(line 1220,col 5)-(line 1221,col 50)",
        "(line 1222,col 5)-(line 1223,col 49)",
        "(line 1224,col 5)-(line 1225,col 49)",
        "(line 1226,col 5)-(line 1227,col 50)",
        "(line 1228,col 5)-(line 1228,col 23)",
        "(line 1230,col 5)-(line 1230,col 33)",
        "(line 1231,col 5)-(line 1274,col 5)",
        "(line 1275,col 5)-(line 1275,col 23)",
        "(line 1276,col 5)-(line 1276,col 32)",
        "(line 1278,col 5)-(line 1278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.appendListItem(java.lang.StringBuilder, java.lang.String)",
      "begin_line": 1281,
      "end_line": 1283,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 5)-(line 1282,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.nameLink(java.lang.String)",
      "begin_line": 1285,
      "end_line": 1287,
      "comment": "",
      "child_ranges": [
        "(line 1286,col 5)-(line 1286,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.nameAnchor(java.lang.String)",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1290,col 5)-(line 1290,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getName(java.lang.String, boolean)",
      "begin_line": 1302,
      "end_line": 1307,
      "comment": "\n   * Looks up a {@link JsName} by name, optionally creating one if it doesn\u0027t\n   * already exist.\n   *\n   * @param name A fully qualified name\n   * @param canCreate Whether to create the object if necessary\n   * @return The {@code JsName} object, or null if one can\u0027t be found and\n   *   can\u0027t be created.\n   ",
      "child_ranges": [
        "(line 1303,col 5)-(line 1305,col 5)",
        "(line 1306,col 5)-(line 1306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createName(java.lang.String)",
      "begin_line": 1315,
      "end_line": 1322,
      "comment": "\n   * Creates a {@link JsName} for the given name if it doesn\u0027t already\n   * exist.\n   *\n   * @param name A fully qualified name\n   ",
      "child_ranges": [
        "(line 1316,col 5)-(line 1316,col 36)",
        "(line 1317,col 5)-(line 1321,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.referenceAliases()",
      "begin_line": 1349,
      "end_line": 1358,
      "comment": "\n   * The NameAnalyzer algorithm works best when all objects have a canonical\n   * name in the global scope. When multiple names in the global scope\n   * point to the same object, things start to break down.\n   *\n   * For example, if we have\n   * \u003ccode\u003e\n   * var a \u003d {};\n   * var b \u003d a;\n   * a.foo \u003d 3;\n   * alert(b.foo);\n   * \u003c/code\u003e\n   * then a.foo and b.foo are the same name, even though NameAnalyzer doesn\u0027t\n   * represent them as such.\n   *\n   * To handle this case, we look at all the aliases in the program.\n   * If descendant properties of that alias are assigned, then we create a\n   * directional reference from the original name to the alias. For example,\n   * in this case, the assign to {@code a.foo} triggers a reference from\n   * {@code b} to {@code a}, but NOT from a to b.\n   *\n   * Similarly, \"instanceof\" checks do not prevent the removal\n   * of a unaliased name but an instanceof check on an alias can only be removed\n   * if the other aliases are also removed, so we add a connection here.\n   ",
      "child_ranges": [
        "(line 1350,col 5)-(line 1357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.referenceParentNames()",
      "begin_line": 1364,
      "end_line": 1386,
      "comment": "\n   * Adds mutual references between all known global names and their parent\n   * names. (e.g. between \u003ccode\u003ea.b.c\u003c/code\u003e and \u003ccode\u003ea.b\u003c/code\u003e).\n   ",
      "child_ranges": [
        "(line 1367,col 5)-(line 1367,col 66)",
        "(line 1369,col 5)-(line 1385,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createNameInformation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1396,
      "end_line": 1495,
      "comment": "\n   * Creates name information for the current node during a traversal.\n   *\n   * @param t The node traversal\n   * @param n The current node\n   * @return The name information, or null if the name is irrelevant to this\n   *     pass\n   ",
      "child_ranges": [
        "(line 1397,col 5)-(line 1397,col 32)",
        "(line 1400,col 5)-(line 1400,col 21)",
        "(line 1401,col 5)-(line 1401,col 26)",
        "(line 1402,col 5)-(line 1402,col 38)",
        "(line 1403,col 5)-(line 1435,col 5)",
        "(line 1439,col 5)-(line 1458,col 5)",
        "(line 1460,col 5)-(line 1494,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.createNameInformation(java.lang.String, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 1507,
      "end_line": 1534,
      "comment": "\n   * Creates name information for a particular qualified name that occurs in a\n   * particular scope.\n   *\n   * @param name A qualified name (e.g. \"x\" or \"a.b.c\")\n   * @param scope The scope in which {@code name} occurs\n   * @param rootNameNode The NAME node for the first token of {@code name}\n   * @return The name information, or null if the name is irrelevant to this\n   *     pass\n   ",
      "child_ranges": [
        "(line 1510,col 5)-(line 1510,col 47)",
        "(line 1511,col 5)-(line 1511,col 35)",
        "(line 1512,col 5)-(line 1512,col 71)",
        "(line 1513,col 5)-(line 1514,col 32)",
        "(line 1515,col 5)-(line 1517,col 5)",
        "(line 1519,col 5)-(line 1519,col 53)",
        "(line 1522,col 5)-(line 1522,col 48)",
        "(line 1523,col 5)-(line 1528,col 5)",
        "(line 1530,col 5)-(line 1530,col 25)",
        "(line 1531,col 5)-(line 1532,col 59)",
        "(line 1533,col 5)-(line 1533,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.isExternallyReferenceable(com.google.javascript.jscomp.Scope, java.lang.String)",
      "begin_line": 1544,
      "end_line": 1557,
      "comment": "\n   * Checks whether a name can be referenced outside of the compiled code.\n   * These names will be the root of dependency trees.\n   *\n   * @param scope The current variable scope\n   * @param name The name\n   * @return True if can be referenced outside\n   ",
      "child_ranges": [
        "(line 1545,col 5)-(line 1547,col 5)",
        "(line 1548,col 5)-(line 1550,col 5)",
        "(line 1551,col 5)-(line 1555,col 5)",
        "(line 1556,col 5)-(line 1556,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getDependencyScope(com.google.javascript.rhino.Node)",
      "begin_line": 1562,
      "end_line": 1571,
      "comment": "\n   * Gets the nearest enclosing dependency scope, or null if there isn\u0027t one.\n   ",
      "child_ranges": [
        "(line 1563,col 5)-(line 1568,col 5)",
        "(line 1570,col 5)-(line 1570,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getEnclosingFunctionDependencyScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 1579,
      "end_line": 1611,
      "comment": "\n   * Get dependency scope defined by the enclosing function, or null.\n   * If enclosing function is a function expression, determine scope based on\n   * its parent if the parent node is a variable declaration or\n   * assignment.\n   ",
      "child_ranges": [
        "(line 1581,col 5)-(line 1581,col 45)",
        "(line 1582,col 5)-(line 1584,col 5)",
        "(line 1586,col 5)-(line 1586,col 54)",
        "(line 1587,col 5)-(line 1589,col 5)",
        "(line 1593,col 5)-(line 1593,col 39)",
        "(line 1594,col 5)-(line 1608,col 5)",
        "(line 1610,col 5)-(line 1610,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.calculateReferences()",
      "begin_line": 1616,
      "end_line": 1625,
      "comment": "\n   * Propagate \"referenced\" property down the graph.\n   ",
      "child_ranges": [
        "(line 1617,col 5)-(line 1617,col 42)",
        "(line 1618,col 5)-(line 1618,col 29)",
        "(line 1619,col 5)-(line 1619,col 46)",
        "(line 1620,col 5)-(line 1620,col 31)",
        "(line 1623,col 5)-(line 1624,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.countOf(com.google.javascript.jscomp.NameAnalyzer.TriState, com.google.javascript.jscomp.NameAnalyzer.TriState)",
      "begin_line": 1648,
      "end_line": 1667,
      "comment": "\n   * Gets the count of nodes matching the criteria\n   *\n   * @param isClass Whether the node is a class\n   * @param referenced Whether the node is referenced\n   * @return Number of matches\n   ",
      "child_ranges": [
        "(line 1649,col 5)-(line 1649,col 18)",
        "(line 1650,col 5)-(line 1665,col 5)",
        "(line 1666,col 5)-(line 1666,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getSideEffectNodes(com.google.javascript.rhino.Node)",
      "begin_line": 1673,
      "end_line": 1688,
      "comment": "\n   * Extract a list of replacement nodes to use.\n   ",
      "child_ranges": [
        "(line 1674,col 5)-(line 1674,col 53)",
        "(line 1675,col 5)-(line 1680,col 44)",
        "(line 1682,col 5)-(line 1683,col 66)",
        "(line 1684,col 5)-(line 1686,col 5)",
        "(line 1687,col 5)-(line 1687,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.replaceWithRhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1697,
      "end_line": 1723,
      "comment": "\n   * Replace n with a simpler expression, while preserving program\n   * behavior.\n   *\n   * If the n\u0027s value is used, replace it with its RHS; otherwise\n   * replace it with the subexpressions that have side effects.\n   ",
      "child_ranges": [
        "(line 1698,col 5)-(line 1722,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.replaceTopLevelExpressionWithRhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1729,
      "end_line": 1777,
      "comment": "\n   * Simplify a toplevel expression, while preserving program\n   * behavior.\n   ",
      "child_ranges": [
        "(line 1731,col 5)-(line 1741,col 5)",
        "(line 1743,col 5)-(line 1757,col 5)",
        "(line 1760,col 5)-(line 1760,col 51)",
        "(line 1761,col 5)-(line 1763,col 5)",
        "(line 1765,col 5)-(line 1774,col 5)",
        "(line 1776,col 5)-(line 1776,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.valueConsumedByParent(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1794,
      "end_line": 1817,
      "comment": "\n   * Determine if the parent reads the value of a child expression\n   * directly.  This is true children used in predicates, RETURN\n   * statements and, RHS of variable declarations and assignments.\n   *\n   * In the case of:\n   * if (a) b else c\n   *\n   * This method returns true for \"a\", and false for \"b\" and \"c\": the\n   * IF expression does something special based on \"a\"\u0027s value.  \"b\"\n   * and \"c\" are effectively outputs.  Same logic applies to FOR,\n   * WHILE and DO loop predicates.  AND/OR/HOOK expressions are\n   * syntactic sugar for IF statements; therefore this method returns\n   * true for the predicate and false otherwise.\n   ",
      "child_ranges": [
        "(line 1795,col 5)-(line 1797,col 5)",
        "(line 1799,col 5)-(line 1816,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.collapseReplacements(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1823,
      "end_line": 1839,
      "comment": "\n   * Merge a list of nodes into a single expression.  The value of the\n   * new expression is determined by the last expression in the list.\n   ",
      "child_ranges": [
        "(line 1824,col 5)-(line 1824,col 21)",
        "(line 1825,col 5)-(line 1836,col 5)",
        "(line 1838,col 5)-(line 1838,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnalyzer.getRhsSubexpressions(com.google.javascript.rhino.Node)",
      "begin_line": 1844,
      "end_line": 1881,
      "comment": "\n   * Extract a list of subexpressions that act as right hand sides.\n   ",
      "child_ranges": [
        "(line 1845,col 5)-(line 1880,col 5)"
      ]
    }
  ]
}