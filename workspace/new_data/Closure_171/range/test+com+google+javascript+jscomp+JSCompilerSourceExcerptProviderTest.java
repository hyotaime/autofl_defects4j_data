{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/JSCompilerSourceExcerptProviderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSCompilerSourceExcerptProviderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 25,
      "end_line": 121,
      "comment": "\n "
    },
    {
      "type": "field",
      "varNames": [
        "provider"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.setUp()",
      "begin_line": 28,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 30,col 5)-(line 31,col 61)",
        "(line 32,col 5)-(line 33,col 78)",
        "(line 34,col 5)-(line 35,col 62)",
        "(line 36,col 5)-(line 36,col 39)",
        "(line 37,col 5)-(line 37,col 52)",
        "(line 38,col 5)-(line 41,col 17)",
        "(line 42,col 5)-(line 42,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptOneLine()",
      "begin_line": 45,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 69)",
        "(line 47,col 5)-(line 47,col 70)",
        "(line 48,col 5)-(line 48,col 69)",
        "(line 49,col 5)-(line 49,col 69)",
        "(line 50,col 5)-(line 50,col 70)",
        "(line 51,col 5)-(line 51,col 69)",
        "(line 52,col 5)-(line 52,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptLineFromInexistantSource()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 64)",
        "(line 57,col 5)-(line 57,col 64)",
        "(line 58,col 5)-(line 58,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptInexistantLine()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 57)",
        "(line 63,col 5)-(line 63,col 57)",
        "(line 64,col 5)-(line 64,col 57)",
        "(line 65,col 5)-(line 65,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExceptNoNewLine()",
      "begin_line": 68,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 71)",
        "(line 70,col 5)-(line 70,col 72)",
        "(line 71,col 5)-(line 71,col 71)",
        "(line 72,col 5)-(line 72,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptRegion()",
      "begin_line": 75,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 37)",
        "(line 77,col 5)-(line 77,col 37)",
        "(line 78,col 5)-(line 78,col 37)",
        "(line 79,col 5)-(line 79,col 37)",
        "(line 80,col 5)-(line 80,col 37)",
        "(line 81,col 5)-(line 81,col 37)",
        "(line 82,col 5)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptRegionFromInexistantSource()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 66)",
        "(line 87,col 5)-(line 87,col 66)",
        "(line 88,col 5)-(line 88,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.testExcerptInexistantRegion()",
      "begin_line": 91,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 59)",
        "(line 93,col 5)-(line 93,col 59)",
        "(line 94,col 5)-(line 94,col 59)",
        "(line 95,col 5)-(line 95,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSCompilerSourceExcerptProviderTest.assertRegionWellFormed(java.lang.String, int)",
      "begin_line": 103,
      "end_line": 120,
      "comment": "\n   * Asserts that a region is \u0027well formed\u0027: it must not be an empty and\n   * cannot start or finish by a carriage return. In addition, it must\n   * contain the line whose region we are taking.\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 69)",
        "(line 105,col 5)-(line 105,col 26)",
        "(line 106,col 5)-(line 106,col 52)",
        "(line 107,col 5)-(line 107,col 32)",
        "(line 108,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 59)",
        "(line 114,col 5)-(line 114,col 58)",
        "(line 115,col 5)-(line 115,col 62)",
        "(line 116,col 5)-(line 117,col 62)",
        "(line 118,col 5)-(line 118,col 65)",
        "(line 119,col 5)-(line 119,col 58)"
      ]
    }
  ]
}