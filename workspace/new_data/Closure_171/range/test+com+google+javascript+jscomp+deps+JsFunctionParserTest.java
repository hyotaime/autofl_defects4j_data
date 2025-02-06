{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/deps/JsFunctionParserTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsFunctionParserTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 171,
      "comment": "\n * Tests for {@link JsFunctionParser}\n *\n * @author agrieve@google.com (Andrew Grieve)\n * @author ielashi@google.com (Islam El-Ashi)\n "
    },
    {
      "type": "field",
      "varNames": [
        "SRC_PATH"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
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
        "functions"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.setUp()",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 59)",
        "(line 45,col 5)-(line 45,col 59)",
        "(line 46,col 5)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.testParseFile()",
      "begin_line": 55,
      "end_line": 90,
      "comment": "\n   * Tests:\n   *  -Parsing of comments,\n   *  -Parsing of different styles of quotes,\n   *  -Correct recording of what was parsed.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 65,col 31)",
        "(line 67,col 5)-(line 67,col 74)",
        "(line 69,col 5)-(line 69,col 48)",
        "(line 70,col 5)-(line 70,col 37)",
        "(line 71,col 5)-(line 71,col 44)",
        "(line 72,col 5)-(line 72,col 58)",
        "(line 74,col 5)-(line 74,col 26)",
        "(line 75,col 5)-(line 75,col 44)",
        "(line 76,col 5)-(line 76,col 58)",
        "(line 78,col 5)-(line 78,col 26)",
        "(line 79,col 5)-(line 79,col 44)",
        "(line 80,col 5)-(line 80,col 58)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 84,col 64)",
        "(line 85,col 5)-(line 85,col 58)",
        "(line 87,col 5)-(line 87,col 36)",
        "(line 88,col 5)-(line 88,col 50)",
        "(line 89,col 5)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.testMultiplePerLine()",
      "begin_line": 92,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 94,col 78)",
        "(line 96,col 5)-(line 96,col 74)",
        "(line 98,col 5)-(line 98,col 48)",
        "(line 99,col 5)-(line 99,col 37)",
        "(line 100,col 5)-(line 100,col 44)",
        "(line 101,col 5)-(line 101,col 58)",
        "(line 103,col 5)-(line 103,col 26)",
        "(line 104,col 5)-(line 104,col 44)",
        "(line 105,col 5)-(line 105,col 58)",
        "(line 107,col 5)-(line 107,col 26)",
        "(line 108,col 5)-(line 108,col 44)",
        "(line 109,col 5)-(line 109,col 58)",
        "(line 111,col 5)-(line 111,col 36)",
        "(line 112,col 5)-(line 112,col 50)",
        "(line 113,col 5)-(line 113,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.testShortcutMode1()",
      "begin_line": 116,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 122,col 33)",
        "(line 124,col 5)-(line 124,col 74)",
        "(line 126,col 5)-(line 126,col 48)",
        "(line 127,col 5)-(line 127,col 37)",
        "(line 128,col 5)-(line 128,col 44)",
        "(line 129,col 5)-(line 129,col 58)",
        "(line 131,col 5)-(line 131,col 26)",
        "(line 132,col 5)-(line 132,col 44)",
        "(line 133,col 5)-(line 133,col 58)",
        "(line 135,col 5)-(line 135,col 36)",
        "(line 136,col 5)-(line 136,col 50)",
        "(line 137,col 5)-(line 137,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.testShortcutMode2()",
      "begin_line": 140,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 143,col 36)",
        "(line 145,col 5)-(line 145,col 74)",
        "(line 147,col 5)-(line 147,col 48)",
        "(line 148,col 5)-(line 148,col 37)",
        "(line 149,col 5)-(line 149,col 44)",
        "(line 150,col 5)-(line 150,col 58)",
        "(line 152,col 5)-(line 152,col 36)",
        "(line 153,col 5)-(line 153,col 50)",
        "(line 154,col 5)-(line 154,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParserTest.testShortcutMode3()",
      "begin_line": 157,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 160,col 36)",
        "(line 162,col 5)-(line 162,col 74)",
        "(line 164,col 5)-(line 164,col 48)",
        "(line 165,col 5)-(line 165,col 37)",
        "(line 166,col 5)-(line 166,col 44)",
        "(line 167,col 5)-(line 167,col 58)",
        "(line 168,col 5)-(line 168,col 50)",
        "(line 169,col 5)-(line 169,col 52)"
      ]
    }
  ]
}