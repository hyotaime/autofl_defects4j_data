{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ChildWithSameParentFieldInjectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChildWithSameParentFieldInjectionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 54,
      "comment": " issue 289"
    },
    {
      "type": "field",
      "varNames": [
        "system"
      ],
      "begin_line": 18,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someService"
      ],
      "begin_line": 21,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.parent_field_is_not_null()",
      "begin_line": 24,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.child_field_is_not_null()",
      "begin_line": 29,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "System",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.AbstractSystem"
      ],
      "begin_line": 34,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someService"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.System.doSomethingElse()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractSystem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someService"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.AbstractSystem.doSomething()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeService",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ChildWithSameParentFieldInjectionTest.SomeService.doSomething()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "",
      "child_ranges": []
    }
  ]
}