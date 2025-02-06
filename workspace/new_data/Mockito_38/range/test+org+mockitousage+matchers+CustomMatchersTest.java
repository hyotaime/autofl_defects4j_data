{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/matchers/CustomMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 17,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ContainsFoo",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.String\u003e"
      ],
      "begin_line": 19,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.ContainsFoo.matches(java.lang.Object)",
      "begin_line": 20,
      "end_line": 22,
      "comment": "",
      "child_ranges": [
        "(line 21,col 13)-(line 21,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsAnyBoolean",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 25,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsAnyBoolean.matches(java.lang.Object)",
      "begin_line": 26,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 13)-(line 27,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsSorZ",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 31,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsSorZ.matches(java.lang.Object)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 33,col 13)-(line 33,col 50)",
        "(line 34,col 13)-(line 34,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsZeroOrOne",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cT\u003e"
      ],
      "begin_line": 38,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.IsZeroOrOne.matches(java.lang.Object)",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 40,col 13)-(line 40,col 41)",
        "(line 41,col 13)-(line 43,col 13)",
        "(line 44,col 13)-(line 44,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.setUp()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomBooleanMatcher()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 77)",
        "(line 59,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 48)",
        "(line 62,col 9)-(line 62,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomCharMatcher()",
      "begin_line": 65,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 68)",
        "(line 69,col 9)-(line 69,col 46)",
        "(line 70,col 9)-(line 70,col 46)",
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Article",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pageNumber"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headline"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.Article(int, java.lang.String)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 20)",
        "(line 81,col 13)-(line 81,col 41)",
        "(line 82,col 13)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.getPageNumber()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Article.getHeadline()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomPrimitiveNumberMatchers()",
      "begin_line": 94,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 80)",
        "(line 97,col 9)-(line 97,col 83)",
        "(line 98,col 9)-(line 98,col 81)",
        "(line 99,col 9)-(line 99,col 80)",
        "(line 100,col 9)-(line 100,col 83)",
        "(line 101,col 9)-(line 101,col 86)",
        "(line 103,col 9)-(line 103,col 52)",
        "(line 104,col 9)-(line 104,col 54)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 47)",
        "(line 108,col 9)-(line 108,col 49)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldUseCustomObjectMatcher()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 72)",
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldCustomMatcherPrintDescriptionBasedOnName()",
      "begin_line": 122,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 33)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.containsTest()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringThatContainsXxx",
      "is_interface": false,
      "parent_types": [
        "org.mockito.ArgumentMatcher\u003cjava.lang.String\u003e"
      ],
      "begin_line": 138,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.StringThatContainsXxx.matches(java.lang.Object)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 43)",
        "(line 141,col 13)-(line 141,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.shouldAnonymousCustomMatcherPrintDefaultDescription()",
      "begin_line": 145,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 33)",
        "(line 149,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CustomMatchersTest.Anonymous-6d684082-a85b-4e1d-9082-e04a348807ba.matches(java.lang.Object)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 21)-(line 152,col 33)"
      ]
    }
  ]
}