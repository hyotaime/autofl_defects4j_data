{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/matchers/CapturingArgumentsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CapturingArgumentsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 17,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 19,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "age"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Person.Person(java.lang.Integer)",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 13)-(line 24,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Person.getAge()",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 13)-(line 28,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Emailer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "service"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Emailer.Emailer(org.mockitousage.matchers.CapturingArgumentsTest.EmailService)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.Emailer.email(java.lang.Integer...)",
      "begin_line": 40,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 44,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EmailService",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.EmailService.sendEmailTo(org.mockitousage.matchers.CapturingArgumentsTest.Person)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "emailService"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emailer"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldAllowAssertionsOnCapturedArgument()",
      "begin_line": 55,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 26)",
        "(line 61,col 9)-(line 61,col 71)",
        "(line 62,col 9)-(line 62,col 61)",
        "(line 64,col 9)-(line 64,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldAllowAssertionsOnAllCapturedArguments()",
      "begin_line": 67,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)",
        "(line 73,col 9)-(line 73,col 71)",
        "(line 74,col 9)-(line 74,col 76)",
        "(line 75,col 9)-(line 75,col 57)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldAllowAssertionsOnLastArgument()",
      "begin_line": 81,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 34)",
        "(line 87,col 9)-(line 87,col 71)",
        "(line 88,col 9)-(line 88,col 76)",
        "(line 90,col 9)-(line 90,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldPrintCaptorMatcher()",
      "begin_line": 93,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 69)",
        "(line 98,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldAllowAssertionsOnCapturedNull()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 39)",
        "(line 114,col 9)-(line 114,col 71)",
        "(line 115,col 9)-(line 115,col 61)",
        "(line 116,col 9)-(line 116,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldAllowCapturingForStubbing()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 71)",
        "(line 123,col 9)-(line 123,col 77)",
        "(line 126,col 9)-(line 126,col 49)",
        "(line 129,col 9)-(line 129,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.matchers.CapturingArgumentsTest.shouldSaySomethingSmartWhenMisused()",
      "begin_line": 132,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 71)",
        "(line 135,col 9)-(line 138,col 39)"
      ]
    }
  ]
}