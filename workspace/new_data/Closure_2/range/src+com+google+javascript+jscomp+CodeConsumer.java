{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodeConsumer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodeConsumer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 313,
      "comment": "\n * Abstracted consumer of the CodeGenerator output.\n *\n * @see CodeGenerator\n * @see CodePrinter\n * @see InlineCostEstimator\n "
    },
    {
      "type": "field",
      "varNames": [
        "statementNeedsEnded"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statementStarted"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sawFunction"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.startSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n   * Starts the source mapping for the given\n   * node at the current position.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 46,
      "comment": "\n   * Finishes the source mapping for the given\n   * node at the current position.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.continueProcessing()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Provides a means of interrupting the CodeGenerator. Derived classes should\n   * return false to stop further processing.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.getLastChar()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n   * Retrieve the last character of the last string sent to append.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addIdentifier(java.lang.String)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.append(java.lang.String)",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n   * Appends a string to the code, keeping track of the current line length.\n   *\n   * NOTE: the string must be a complete token--partial strings or\n   * partial regexes will run the risk of being split across lines.\n   *\n   * Do not directly append newlines with this method. Instead use\n   * {@link #startNewLine}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendBlockStart()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendBlockEnd()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.startNewLine()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeLineBreak()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeCutLine()",
      "begin_line": 91,
      "end_line": 92,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endLine()",
      "begin_line": 94,
      "end_line": 95,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.notePreferredLineBreak()",
      "begin_line": 97,
      "end_line": 98,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.beginBlock()",
      "begin_line": 100,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 104,col 5)",
        "(line 105,col 5)-(line 105,col 23)",
        "(line 107,col 5)-(line 107,col 14)",
        "(line 108,col 5)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endBlock()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endBlock(boolean)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 21)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.listSeparator()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 13)",
        "(line 125,col 5)-(line 125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endStatement()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n   * Indicates the end of a statement and a \u0027;\u0027 may need to be added.\n   * But we don\u0027t add it now, in case we\u0027re at the end of a block (in which\n   * case we don\u0027t have to add the \u0027;\u0027).\n   * See maybeEndStatement()\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endStatement(boolean)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 145,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeEndStatement()",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\n   * This is to be called when we\u0027re in a statement. If the prev statement\n   * needs to be ended, add a \u0027;\u0027.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFunction()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFunction(boolean)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 23)",
        "(line 169,col 5)-(line 171,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.beginCaseBody()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endCaseBody()",
      "begin_line": 178,
      "end_line": 179,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.add(java.lang.String)",
      "begin_line": 181,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 24)",
        "(line 184,col 5)-(line 186,col 5)",
        "(line 188,col 5)-(line 188,col 31)",
        "(line 189,col 5)-(line 201,col 5)",
        "(line 203,col 5)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendOp(java.lang.String, boolean)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addOp(java.lang.String, boolean)",
      "begin_line": 210,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 24)",
        "(line 213,col 5)-(line 213,col 30)",
        "(line 214,col 5)-(line 214,col 30)",
        "(line 216,col 5)-(line 227,col 5)",
        "(line 230,col 5)-(line 230,col 24)",
        "(line 235,col 5)-(line 237,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addNumber(double)",
      "begin_line": 240,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 30)",
        "(line 244,col 5)-(line 244,col 45)",
        "(line 245,col 5)-(line 247,col 5)",
        "(line 249,col 5)-(line 275,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addConstant(java.lang.String)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.isNegativeZero(double)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.isWordChar(char)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 289,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.shouldPreserveExtraBlocks()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n   * If the body of a for loop or the then clause of an if statement has\n   * a single statement, should it be wrapped in a block?  Doing so can\n   * help when pretty-printing the code, and permits putting a debugging\n   * breakpoint on the statement inside the condition.\n   *\n   * @return {@boolean true} if such expressions should be wrapped\n   ",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.breakAfterBlockFor(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n   * @return Whether the a line break can be added after the specified BLOCK.\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFile()",
      "begin_line": 312,
      "end_line": 312,
      "comment": " Called when we\u0027re at the end of a file. ",
      "child_ranges": []
    }
  ]
}