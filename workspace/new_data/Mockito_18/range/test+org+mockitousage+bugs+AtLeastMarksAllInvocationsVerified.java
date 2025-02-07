{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/AtLeastMarksAllInvocationsVerified.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AtLeastMarksAllInvocationsVerified",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 12,
      "end_line": 31,
      "comment": " see issue 112"
    },
    {
      "type": "class_interface",
      "name": "SomeMethods",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.AtLeastMarksAllInvocationsVerified.SomeMethods.allowedMethod()",
      "begin_line": 15,
      "end_line": 16,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.AtLeastMarksAllInvocationsVerified.SomeMethods.disallowedMethod()",
      "begin_line": 17,
      "end_line": 18,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.AtLeastMarksAllInvocationsVerified.shouldFailBecauseDisallowedMethodWasCalled()",
      "begin_line": 21,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 58)",
        "(line 25,col 9)-(line 25,col 36)",
        "(line 26,col 9)-(line 26,col 39)",
        "(line 28,col 9)-(line 28,col 56)",
        "(line 29,col 9)-(line 29,col 46)"
      ]
    }
  ]
}