{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/matchers/ReflectionMatchersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReflectionMatchersTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 15,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Parent",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentField"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "protectedParentField"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.Parent.Parent(int, java.lang.String)",
      "begin_line": 21,
      "end_line": 24,
      "comment": "",
      "child_ranges": [
        "(line 22,col 13)-(line 22,col 43)",
        "(line 23,col 13)-(line 23,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Child",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.matchers.ReflectionMatchersTest.Parent"
      ],
      "begin_line": 27,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childFieldOne"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "childFieldTwo"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.Child.Child(int, java.lang.String, int, java.lang.Object)",
      "begin_line": 30,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 31,col 13)-(line 31,col 53)",
        "(line 32,col 13)-(line 32,col 47)",
        "(line 33,col 13)-(line 33,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockMe",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.MockMe.run(org.mockitousage.matchers.ReflectionMatchersTest.Child)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.setup()",
      "begin_line": 43,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 34)",
        "(line 47,col 9)-(line 47,col 53)",
        "(line 48,col 9)-(line 48,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqual()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 53)",
        "(line 54,col 9)-(line 54,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchWhenFieldValuesDiffer()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 60,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchAgain()",
      "begin_line": 63,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 55)",
        "(line 66,col 9)-(line 66,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchYetAgain()",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 55)",
        "(line 72,col 9)-(line 72,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatch()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 58)",
        "(line 78,col 9)-(line 78,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqualWithOneFieldExcluded()",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 58)",
        "(line 84,col 9)-(line 84,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldMatchWhenFieldValuesEqualWithTwoFieldsExcluded()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 63)",
        "(line 90,col 9)-(line 90,col 72)",
        "(line 91,col 9)-(line 91,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.ReflectionMatchersTest.shouldNotMatchWithFieldsExclusion()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 63)",
        "(line 97,col 9)-(line 97,col 57)"
      ]
    }
  ]
}