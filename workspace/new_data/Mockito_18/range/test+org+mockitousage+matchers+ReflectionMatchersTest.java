{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/matchers/ReflectionMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 16,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Parent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentField"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "protectedParentField"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.Parent.Parent(int, java.lang.String)",
      "begin_line": 22,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 23,col 13)-(line 23,col 43)",
        "(line 24,col 13)-(line 24,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Child",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.matchers.ReflectionMatchersTest.Parent"
      ],
      "begin_line": 28,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childFieldOne"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childFieldTwo"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.Child.Child(int, java.lang.String, int, java.lang.Object)",
      "begin_line": 31,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 13)-(line 32,col 53)",
        "(line 33,col 13)-(line 33,col 47)",
        "(line 34,col 13)-(line 34,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockMe",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.MockMe.run(org.mockitousage.matchers.ReflectionMatchersTest.Child)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.setup()",
      "begin_line": 44,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 34)",
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 49,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqual()",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 53)",
        "(line 55,col 9)-(line 55,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchWhenFieldValuesDiffer()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 57)",
        "(line 61,col 9)-(line 61,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchAgain()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 55)",
        "(line 67,col 9)-(line 67,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchYetAgain()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 55)",
        "(line 73,col 9)-(line 73,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatch()",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 58)",
        "(line 79,col 9)-(line 79,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqualWithOneFieldExcluded()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 58)",
        "(line 85,col 9)-(line 85,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqualWithTwoFieldsExcluded()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 63)",
        "(line 91,col 9)-(line 91,col 72)",
        "(line 92,col 9)-(line 92,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchWithFieldsExclusion()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 63)",
        "(line 98,col 9)-(line 98,col 57)"
      ]
    }
  ]
}