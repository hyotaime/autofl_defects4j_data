{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineCostEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineCostEstimator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 107,
      "comment": "\n * For use with CodeGenerator to determine the cost of generated code.\n *\n * @see CodeGenerator\n * @see CodePrinter\n "
    },
    {
      "type": "field",
      "varNames": [
        "ESTIMATED_IDENTIFIER"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " For now simply assume identifiers are 2 characters."
    },
    {
      "type": "field",
      "varNames": [
        "ESTIMATED_IDENTIFIER_COST"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.InlineCostEstimator()",
      "begin_line": 32,
      "end_line": 33,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.getCost(com.google.javascript.rhino.Node)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n   * Determines the size of the JS code.\n   ",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.getCost(com.google.javascript.rhino.Node, int)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n   * Determines the estimated size of the JS snippet represented by the node.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 80)",
        "(line 47,col 5)-(line 47,col 24)",
        "(line 48,col 5)-(line 48,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CompiledSizeEstimator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeConsumer"
      ],
      "begin_line": 55,
      "end_line": 106,
      "comment": "\n   * Code consumer that estimates compiled size by assuming names are\n   * shortened and all whitespace is stripped.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "maxCost"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "continueProcessing"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.CompiledSizeEstimator(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.add(com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 63)",
        "(line 67,col 7)-(line 67,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.getCost()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.continueProcessing()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 7)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.getLastChar()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 7)-(line 81,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.append(java.lang.String)",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 86,col 42)",
        "(line 87,col 7)-(line 87,col 27)",
        "(line 88,col 7)-(line 90,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.addIdentifier(java.lang.String)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineCostEstimator.CompiledSizeEstimator.addConstant(java.lang.String)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Constants (true, false, null) are considered basically free,\n     * because it\u0027s likely that they will get folded when we\u0027re done.\n     ",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 15)"
      ]
    }
  ]
}