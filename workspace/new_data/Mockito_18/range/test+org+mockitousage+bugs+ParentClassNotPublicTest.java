{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ParentClassNotPublicTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParentClassNotPublicTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 30,
      "end_line": 100,
      "comment": "\n * See bug 212\n *\n * Mocking methods that are declared on a non-public parent is not supported.\n * We cannot really fail fast during mock creation because one might mock a method that is not declared on a parent - this would be valid.\n "
    },
    {
      "type": "class_interface",
      "name": "SuperClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.SuperClass.isValid()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 11)-(line 34,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.SuperClass.arg(java.lang.Object)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 36,col 36)-(line 36,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassForMocking",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.bugs.ParentClassNotPublicTest.SuperClass"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.only_if_CglibMockMaker()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.hints_that_parent_not_public_during_stubbing()",
      "begin_line": 48,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 64)",
        "(line 51,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.hints_that_parent_not_public_during_stubbing_start()",
      "begin_line": 60,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 64)",
        "(line 63,col 9)-(line 63,col 33)",
        "(line 64,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.hints_that_parent_not_public_during_verify()",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 64)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentClassNotPublicTest.hints_that_parent_not_public_when_misplaced_matchers_detected()",
      "begin_line": 88,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 64)",
        "(line 91,col 9)-(line 98,col 9)"
      ]
    }
  ]
}