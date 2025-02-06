{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AnalyzeNameReferences.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnalyzeNameReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 42,
      "end_line": 145,
      "comment": "\n * Analyzes names and references usage by determining:\n * \u003cp\u003e\u003col\u003e\n * \u003cli\u003eIf the name is reachable from the {@link NameReferenceGraph#MAIN}.\u003c/li\u003e\n * \u003cli\u003eas well as the deepest common module that references it.\u003c/li\u003e\n * \u003c/ol\u003e\n *\n * The two pieces of information will be annotated to {@link NameReferenceGraph}\n * by {@link NameInfo} objects.\n *\n * This is an analysis based on {@link AnalyzeNameReferences} using the more\n * accurate graph and will soon replace it.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.AnalyzeNameReferences(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 29)",
        "(line 50,col 5)-(line 50,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 53,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 56,col 53)",
        "(line 57,col 5)-(line 57,col 30)",
        "(line 58,col 5)-(line 58,col 39)",
        "(line 59,col 5)-(line 60,col 73)",
        "(line 61,col 5)-(line 61,col 44)",
        "(line 62,col 5)-(line 62,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.getGraph()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropagateReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e"
      ],
      "begin_line": 69,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.PropagateReferences.traverseEdge(com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference, com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 70,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 72,col 7)-(line 72,col 42)",
        "(line 73,col 7)-(line 73,col 40)",
        "(line 74,col 7)-(line 82,col 7)",
        "(line 83,col 7)-(line 83,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.getInfo(com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 60)",
        "(line 89,col 5)-(line 89,col 41)",
        "(line 90,col 5)-(line 93,col 5)",
        "(line 94,col 5)-(line 94,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameInfo",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotation"
      ],
      "begin_line": 97,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deepestCommonModuleRef"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo.isReferenced()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Determines whether we\u0027ve marked a reference to this property name. ",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo.getDeepestCommonModuleRef()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the deepest common module of all the references to this\n     * property.\n     ",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo.markReference(com.google.javascript.jscomp.JSModule)",
      "begin_line": 120,
      "end_line": 143,
      "comment": "\n     * Mark a reference in a given module to this property name, and record\n     * the deepest common module reference.\n     * @param module The module where it was referenced.\n     * @return Whether the name info has changed.\n     ",
      "child_ranges": [
        "(line 121,col 7)-(line 121,col 33)",
        "(line 122,col 7)-(line 125,col 7)",
        "(line 127,col 7)-(line 141,col 7)",
        "(line 142,col 7)-(line 142,col 24)"
      ]
    }
  ]
}