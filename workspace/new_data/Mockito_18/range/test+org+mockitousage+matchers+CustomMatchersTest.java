{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/matchers/CustomMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 18,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ContainsFoo",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.String\u003e"
      ],
      "begin_line": 20,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.ContainsFoo.matches(java.lang.Object)",
      "begin_line": 21,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 22,col 13)-(line 22,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsAnyBoolean",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 26,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsAnyBoolean.matches(java.lang.Object)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 13)-(line 28,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsSorZ",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 32,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsSorZ.matches(java.lang.Object)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 13)-(line 34,col 50)",
        "(line 35,col 13)-(line 35,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsZeroOrOne",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cT\u003e"
      ],
      "begin_line": 39,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsZeroOrOne.matches(java.lang.Object)",
      "begin_line": 40,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 41)",
        "(line 42,col 13)-(line 44,col 13)",
        "(line 45,col 13)-(line 45,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.setUp()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomBooleanMatcher()",
      "begin_line": 56,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 77)",
        "(line 60,col 9)-(line 60,col 47)",
        "(line 61,col 9)-(line 61,col 48)",
        "(line 63,col 9)-(line 63,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomCharMatcher()",
      "begin_line": 66,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 68)",
        "(line 70,col 9)-(line 70,col 46)",
        "(line 71,col 9)-(line 71,col 46)",
        "(line 72,col 9)-(line 72,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Article",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pageNumber"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headline"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.Article(int, java.lang.String)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 20)",
        "(line 82,col 13)-(line 82,col 41)",
        "(line 83,col 13)-(line 83,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.getPageNumber()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.getHeadline()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomPrimitiveNumberMatchers()",
      "begin_line": 95,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 98,col 83)",
        "(line 99,col 9)-(line 99,col 81)",
        "(line 100,col 9)-(line 100,col 80)",
        "(line 101,col 9)-(line 101,col 83)",
        "(line 102,col 9)-(line 102,col 86)",
        "(line 104,col 9)-(line 104,col 52)",
        "(line 105,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 106,col 44)",
        "(line 107,col 9)-(line 107,col 46)",
        "(line 108,col 9)-(line 108,col 47)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomObjectMatcher()",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 72)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldCustomMatcherPrintDescriptionBasedOnName()",
      "begin_line": 123,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 33)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.containsTest()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringThatContainsXxx",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.String\u003e"
      ],
      "begin_line": 139,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.StringThatContainsXxx.matches(java.lang.Object)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 43)",
        "(line 142,col 13)-(line 142,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldAnonymousCustomMatcherPrintDefaultDescription()",
      "begin_line": 146,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)",
        "(line 150,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Anonymous-37a02e1d-cf9e-4119-aa6b-d3201c18b211.matches(java.lang.Object)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 21)-(line 153,col 33)"
      ]
    }
  ]
}