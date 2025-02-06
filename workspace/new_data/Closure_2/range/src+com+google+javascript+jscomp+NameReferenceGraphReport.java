{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameReferenceGraphReport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameReferenceGraphReport",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.NameReferenceGraphReport(com.google.javascript.jscomp.NameReferenceGraph)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n   * Create a NameReferenceGraphReport object.\n   *\n   * @param g  name reference graph to describe in report.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.getHtmlReport()",
      "begin_line": 71,
      "end_line": 130,
      "comment": "\n   * Generate a nice HTML file describing the name reference graph.\n   * For each declaration, list the sites where the declaration\u0027s name\n   * is referenced, and list all the names that the declaration references.\n   * For each, name exactly where use occurs in the source code.\n   *\n   * \u003cp\u003eThis report should be useful both for internal compiler\n   * developers and for engineers trying to understand running\n   * behavior of their code or who want to understand why\n   * AbstractCompiler won\u0027t move their code into a new module.\n   *\n   * @return String containing the entire HTML for the report.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 48)",
        "(line 73,col 5)-(line 74,col 39)",
        "(line 76,col 5)-(line 76,col 38)",
        "(line 78,col 5)-(line 78,col 59)",
        "(line 79,col 5)-(line 79,col 38)",
        "(line 80,col 5)-(line 80,col 29)",
        "(line 81,col 5)-(line 81,col 55)",
        "(line 82,col 5)-(line 82,col 30)",
        "(line 84,col 5)-(line 84,col 34)",
        "(line 85,col 5)-(line 85,col 29)",
        "(line 88,col 5)-(line 88,col 57)",
        "(line 90,col 5)-(line 126,col 5)",
        "(line 127,col 5)-(line 127,col 30)",
        "(line 128,col 5)-(line 128,col 38)",
        "(line 129,col 5)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.getSourceFile(com.google.javascript.rhino.Node)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n   * Given a node, find the name of the containing source file.\n   *\n   * @param node Parse tree node whose filename is requested\n   * @return String containing name of source file, or empty string if name\n   *     cannot be identified.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 47)",
        "(line 141,col 5)-(line 143,col 5)",
        "(line 144,col 5)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateDeclarationReport(java.lang.StringBuilder, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e)",
      "begin_line": 152,
      "end_line": 189,
      "comment": "\n   * Generate the HTML for describing a specific declaration.\n   * @param builder  contents of report to be generated\n   * @param declarationNode declaration to describe\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 68)",
        "(line 157,col 5)-(line 157,col 59)",
        "(line 159,col 5)-(line 159,col 28)",
        "(line 160,col 5)-(line 160,col 52)",
        "(line 161,col 5)-(line 161,col 29)",
        "(line 162,col 5)-(line 162,col 25)",
        "(line 166,col 5)-(line 166,col 36)",
        "(line 170,col 5)-(line 171,col 53)",
        "(line 173,col 5)-(line 188,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateHtmlReportHeader(java.lang.StringBuilder)",
      "begin_line": 197,
      "end_line": 210,
      "comment": "\n   *  Generate the HTML header for the report style.\n   * Borrowed straight from NameAnalyzer\u0027s report style.\n   *\n   * @param builder contents of the report to be generated\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 204,col 47)",
        "(line 205,col 5)-(line 205,col 62)",
        "(line 206,col 5)-(line 206,col 78)",
        "(line 207,col 5)-(line 208,col 49)",
        "(line 209,col 5)-(line 209,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateHtmlReportFooter(java.lang.StringBuilder)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n   * Generate the HTML footer for the report style.\n   ",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateEdgeReport(java.lang.StringBuilder, com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e)",
      "begin_line": 228,
      "end_line": 244,
      "comment": "\n   * Generate a description of a specific edge between two nodes.\n   * For each edge, name the element being linked, the location of the\n   * reference in the source file, and the type of the reference.\n   *\n   * @param builder contents of the report to be generated\n   * @param referencedDecl name of the declaration being referenced\n   * @param edge the graph edge being described\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 59)",
        "(line 231,col 5)-(line 231,col 60)",
        "(line 232,col 5)-(line 232,col 32)",
        "(line 233,col 5)-(line 233,col 28)",
        "(line 235,col 5)-(line 235,col 41)",
        "(line 236,col 5)-(line 236,col 37)",
        "(line 237,col 5)-(line 237,col 39)",
        "(line 238,col 5)-(line 238,col 43)",
        "(line 240,col 5)-(line 240,col 79)",
        "(line 242,col 5)-(line 242,col 59)",
        "(line 243,col 5)-(line 243,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateSourceReferenceLink(java.lang.StringBuilder, java.lang.String, int, int)",
      "begin_line": 256,
      "end_line": 269,
      "comment": "\n   * Generate a link and text for a reference to a particular location\n   * in a source file.  Selecting the link should take the programmer\n   * to a browsable version of the file.\n   *\n   * @param builder  contents of the report to be generated\n   * @param sourceFile  Path to the file\n   * @param lineNumber  line where the object to view is located\n   * @param columnNumber  column where the object to highlight is located.\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 31)",
        "(line 260,col 5)-(line 260,col 24)",
        "(line 264,col 5)-(line 265,col 41)",
        "(line 268,col 5)-(line 268,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.generateType(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 277,
      "end_line": 286,
      "comment": "\n   * Dump a type in a nice, readable way.\n   *\n   * @param builder contents of the report to be generated.\n   * @param defType type to describe\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 285,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiGraphNodeComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e\u003e"
      ],
      "begin_line": 293,
      "end_line": 319,
      "comment": "\n   * DiGraphNodeComparator gives us a way to generate sorted lists\n   * of DiGraphNodes.  It provides a compare function used by the\n   * String class\u0027s sort method.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphReport.DiGraphNodeComparator.compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003ccom.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference\u003e)",
      "begin_line": 295,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 51)",
        "(line 299,col 7)-(line 299,col 51)",
        "(line 301,col 7)-(line 304,col 7)",
        "(line 307,col 7)-(line 309,col 7)",
        "(line 312,col 7)-(line 314,col 7)",
        "(line 316,col 7)-(line 317,col 47)"
      ]
    }
  ]
}