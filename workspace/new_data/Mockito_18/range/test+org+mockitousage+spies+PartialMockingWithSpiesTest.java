{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/spies/PartialMockingWithSpiesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PartialMockingWithSpiesTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 15,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.pleaseMakeStackTracesClean()",
      "begin_line": 18,
      "end_line": 21,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InheritMe",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inherited"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.InheritMe.getInherited()",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 13)-(line 26,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.spies.PartialMockingWithSpiesTest.InheritMe"
      ],
      "begin_line": 30,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultName"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.getName()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 13)-(line 34,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.guessName()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.howMuchDidYouInherit()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.getNameButDelegateToMethodThatThrows()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 33)",
        "(line 47,col 13)-(line 47,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Person.throwSomeException()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Name",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.Name.Name(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "spy"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldCallRealMethdsEvenDelegatedToOtherSelfMethod()",
      "begin_line": 65,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 36)",
        "(line 71,col 9)-(line 71,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldAllowStubbingOfMethodsThatDelegateToOtherMethods()",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 46)",
        "(line 80,col 9)-(line 80,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldAllowStubbingWithThrowablesMethodsThatDelegateToOtherMethods()",
      "begin_line": 83,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 62)",
        "(line 90,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldStackTraceGetFilteredOnUserExceptions()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.verifyTheStackTrace()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "    @Test //manual verification",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldVerify()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 22)",
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldStub()",
      "begin_line": 128,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 59)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.spies.PartialMockingWithSpiesTest.shouldDealWithPrivateFieldsOfSubclasses()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 57)"
      ]
    }
  ]
}