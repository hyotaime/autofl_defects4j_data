{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CodeConsumer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodeConsumer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 312,
      "comment": "\n * Abstracted consumer of the CodeGenerator output.\n *\n * @see CodeGenerator\n * @see CodePrinter\n * @see InlineCostEstimator\n "
    },
    {
      "type": "field",
      "varNames": [
        "statementNeedsEnded"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statementStarted"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sawFunction"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.startSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n   * Starts the source mapping for the given\n   * node at the current position.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n   * Finishes the source mapping for the given\n   * node at the current position.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.continueProcessing()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n   * Provides a means of interrupting the CodeGenerator. Derived classes should\n   * return false to stop further processing.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.getLastChar()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n   * Retrieve the last character of the last string sent to append.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addIdentifier(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.append(java.lang.String)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n   * Appends a string to the code, keeping track of the current line length.\n   *\n   * NOTE: the string must be a complete token--partial strings or\n   * partial regexes will run the risk of being split across lines.\n   *\n   * Do not directly append newlines with this method. Instead use\n   * {@link #startNewLine}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendBlockStart()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendBlockEnd()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.startNewLine()",
      "begin_line": 83,
      "end_line": 84,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeLineBreak()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeCutLine()",
      "begin_line": 90,
      "end_line": 91,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endLine()",
      "begin_line": 93,
      "end_line": 94,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.notePreferredLineBreak()",
      "begin_line": 96,
      "end_line": 97,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.beginBlock()",
      "begin_line": 99,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 103,col 5)",
        "(line 104,col 5)-(line 104,col 23)",
        "(line 106,col 5)-(line 106,col 14)",
        "(line 107,col 5)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endBlock()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endBlock(boolean)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 21)",
        "(line 116,col 5)-(line 118,col 5)",
        "(line 119,col 5)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.listSeparator()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 13)",
        "(line 124,col 5)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endStatement()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n   * Indicates the end of a statement and a \u0027;\u0027 may need to be added.\n   * But we don\u0027t add it now, in case we\u0027re at the end of a block (in which\n   * case we don\u0027t have to add the \u0027;\u0027).\n   * See maybeEndStatement()\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endStatement(boolean)",
      "begin_line": 137,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 144,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.maybeEndStatement()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n   * This is to be called when we\u0027re in a statement. If the prev statement\n   * needs to be ended, add a \u0027;\u0027.\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 158,col 5)",
        "(line 159,col 5)-(line 159,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFunction()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFunction(boolean)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 23)",
        "(line 168,col 5)-(line 170,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.beginCaseBody()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endCaseBody()",
      "begin_line": 177,
      "end_line": 178,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.add(java.lang.String)",
      "begin_line": 180,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 24)",
        "(line 183,col 5)-(line 185,col 5)",
        "(line 187,col 5)-(line 187,col 31)",
        "(line 188,col 5)-(line 200,col 5)",
        "(line 202,col 5)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.appendOp(java.lang.String, boolean)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addOp(java.lang.String, boolean)",
      "begin_line": 209,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 24)",
        "(line 212,col 5)-(line 212,col 30)",
        "(line 213,col 5)-(line 213,col 30)",
        "(line 215,col 5)-(line 226,col 5)",
        "(line 229,col 5)-(line 229,col 24)",
        "(line 234,col 5)-(line 236,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addNumber(double)",
      "begin_line": 239,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 30)",
        "(line 243,col 5)-(line 243,col 45)",
        "(line 244,col 5)-(line 246,col 5)",
        "(line 248,col 5)-(line 274,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.addConstant(java.lang.String)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.isNegativeZero(double)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.isWordChar(char)",
      "begin_line": 285,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 288,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.shouldPreserveExtraBlocks()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n   * If the body of a for loop or the then clause of an if statement has\n   * a single statement, should it be wrapped in a block?  Doing so can\n   * help when pretty-printing the code, and permits putting a debugging\n   * breakpoint on the statement inside the condition.\n   *\n   * @return {@boolean true} if such expressions should be wrapped\n   ",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.breakAfterBlockFor(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n   * @return Whether the a line break can be added after the specified BLOCK.\n   ",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeConsumer.endFile()",
      "begin_line": 311,
      "end_line": 311,
      "comment": " Called when we\u0027re at the end of a file. ",
      "child_ranges": []
    }
  ]
}