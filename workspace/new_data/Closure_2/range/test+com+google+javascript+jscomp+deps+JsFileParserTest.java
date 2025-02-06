{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/deps/JsFileParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsFileParserTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 178,
      "comment": "\n * Tests for {@link JsFileParser}.\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SRC_PATH"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLOSURE_PATH"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.setUp()",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 59)",
        "(line 43,col 5)-(line 43,col 44)",
        "(line 44,col 5)-(line 44,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testParseFile()",
      "begin_line": 53,
      "end_line": 71,
      "comment": "\n   * Tests:\n   *  -Parsing of comments,\n   *  -Parsing of different styles of quotes,\n   *  -Correct recording of what was parsed.\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 62,col 31)",
        "(line 64,col 5)-(line 66,col 90)",
        "(line 68,col 5)-(line 68,col 79)",
        "(line 70,col 5)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testMultiplePerLine()",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 75,col 78)",
        "(line 77,col 5)-(line 78,col 83)",
        "(line 80,col 5)-(line 80,col 79)",
        "(line 82,col 5)-(line 82,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testShortcutMode1()",
      "begin_line": 85,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 91,col 33)",
        "(line 93,col 5)-(line 94,col 75)",
        "(line 95,col 5)-(line 95,col 79)",
        "(line 97,col 5)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testShortcutMode2()",
      "begin_line": 100,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 103,col 36)",
        "(line 105,col 5)-(line 106,col 67)",
        "(line 107,col 5)-(line 107,col 79)",
        "(line 109,col 5)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testShortcutMode3()",
      "begin_line": 112,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 115,col 36)",
        "(line 117,col 5)-(line 118,col 67)",
        "(line 119,col 5)-(line 119,col 79)",
        "(line 121,col 5)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testIncludeGoog1()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 128,col 34)",
        "(line 130,col 5)-(line 131,col 67)",
        "(line 132,col 5)-(line 133,col 42)",
        "(line 134,col 5)-(line 134,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testIncludeGoog2()",
      "begin_line": 137,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 45)",
        "(line 140,col 5)-(line 141,col 69)",
        "(line 142,col 5)-(line 143,col 42)",
        "(line 144,col 5)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testIncludeGoog3()",
      "begin_line": 147,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 153,col 34)",
        "(line 155,col 5)-(line 156,col 57)",
        "(line 157,col 5)-(line 158,col 42)",
        "(line 159,col 5)-(line 159,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.testIncludeGoog4()",
      "begin_line": 162,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 61)",
        "(line 165,col 5)-(line 166,col 62)",
        "(line 167,col 5)-(line 168,col 42)",
        "(line 169,col 5)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParserTest.assertDeps(com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 173,
      "end_line": 177,
      "comment": " Asserts the deps match without errors ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 35)",
        "(line 175,col 5)-(line 175,col 50)",
        "(line 176,col 5)-(line 176,col 52)"
      ]
    }
  ]
}