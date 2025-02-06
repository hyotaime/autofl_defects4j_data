{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/deps/DepsFileParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DepsFileParserTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 115,
      "comment": "\n * Tests for {@link DepsFileParser}.\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SRC_PATH"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.setUp()",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 59)",
        "(line 45,col 5)-(line 45,col 46)",
        "(line 46,col 5)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.testGoodParse()",
      "begin_line": 57,
      "end_line": 80,
      "comment": "\n   * Tests:\n   *  -Parsing of comments,\n   *  -Parsing of different styles of quotes,\n   *  -Parsing of empty arrays,\n   *  -Parsing of non-empty arrays,\n   *  -Correct recording of what was parsed.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 65,col 88)",
        "(line 67,col 5)-(line 67,col 71)",
        "(line 68,col 5)-(line 75,col 6)",
        "(line 77,col 5)-(line 77,col 35)",
        "(line 78,col 5)-(line 78,col 50)",
        "(line 79,col 5)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.testTooFewArgs()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 63)",
        "(line 84,col 5)-(line 84,col 50)",
        "(line 85,col 5)-(line 85,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.testTooManyArgs()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 71)",
        "(line 90,col 5)-(line 90,col 50)",
        "(line 91,col 5)-(line 91,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.testShortcutMode()",
      "begin_line": 94,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 98,col 46)",
        "(line 99,col 5)-(line 100,col 66)",
        "(line 101,col 5)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsFileParserTest.testNoShortcutMode()",
      "begin_line": 104,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 34)",
        "(line 106,col 5)-(line 109,col 47)",
        "(line 110,col 5)-(line 112,col 66)",
        "(line 113,col 5)-(line 113,col 35)"
      ]
    }
  ]
}