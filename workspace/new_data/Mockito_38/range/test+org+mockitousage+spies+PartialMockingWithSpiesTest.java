{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/spies/PartialMockingWithSpiesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PartialMockingWithSpiesTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 14,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.pleaseMakeStackTracesClean()",
      "begin_line": 17,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 19,col 9)-(line 19,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InheritMe",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inherited"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.InheritMe.getInherited()",
      "begin_line": 24,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 25,col 13)-(line 25,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.spies.PartialMockingWithSpiesTest.InheritMe"
      ],
      "begin_line": 29,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultName"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.getName()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 13)-(line 33,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.guessName()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.howMuchDidYouInherit()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.getNameButDelegateToMethodThatThrows()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 33)",
        "(line 46,col 13)-(line 46,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.throwSomeException()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Name",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Name.Name(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "spy"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldCallRealMethdsEvenDelegatedToOtherSelfMethod()",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)",
        "(line 70,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldAllowStubbingOfMethodsThatDelegateToOtherMethods()",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 46)",
        "(line 79,col 9)-(line 79,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldAllowStubbingWithThrowablesMethodsThatDelegateToOtherMethods()",
      "begin_line": 82,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 86,col 62)",
        "(line 89,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldStackTraceGetFilteredOnUserExceptions()",
      "begin_line": 97,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.verifyTheStackTrace()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "    @Test //manual verification",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldVerify()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 22)",
        "(line 124,col 9)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldStub()",
      "begin_line": 127,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 59)",
        "(line 132,col 9)-(line 132,col 36)",
        "(line 134,col 9)-(line 134,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldDealWithPrivateFieldsOfSubclasses()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 57)"
      ]
    }
  ]
}