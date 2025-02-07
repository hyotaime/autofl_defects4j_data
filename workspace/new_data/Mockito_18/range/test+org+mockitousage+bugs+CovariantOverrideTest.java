{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/CovariantOverrideTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CovariantOverrideTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 14,
      "end_line": 53,
      "comment": "see issue 101"
    },
    {
      "type": "class_interface",
      "name": "ReturnsObject",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.ReturnsObject.callMe()",
      "begin_line": 17,
      "end_line": 17,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ReturnsString",
      "is_interface": true,
      "parent_types": [
        "org.mockitousage.bugs.CovariantOverrideTest.ReturnsObject"
      ],
      "begin_line": 20,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.ReturnsString.callMe()",
      "begin_line": 22,
      "end_line": 22,
      "comment": " Java 5 covariant override of method from parent interface",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.returnFoo1()",
      "begin_line": 25,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 55)",
        "(line 28,col 9)-(line 28,col 46)",
        "(line 29,col 9)-(line 29,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.returnFoo2()",
      "begin_line": 32,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 55)",
        "(line 35,col 9)-(line 35,col 46)",
        "(line 36,col 9)-(line 36,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.returnFoo3()",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 55)",
        "(line 42,col 9)-(line 42,col 46)",
        "(line 43,col 9)-(line 43,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.CovariantOverrideTest.returnFoo4()",
      "begin_line": 46,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 55)",
        "(line 49,col 9)-(line 49,col 22)",
        "(line 50,col 9)-(line 50,col 35)",
        "(line 51,col 9)-(line 51,col 31)"
      ]
    }
  ]
}