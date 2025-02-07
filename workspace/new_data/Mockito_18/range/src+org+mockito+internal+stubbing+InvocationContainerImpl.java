{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/InvocationContainerImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationContainerImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.stubbing.InvocationContainer",
        "java.io.Serializable"
      ],
      "begin_line": 23,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stubbed"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockingProgress"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "answersForStubbing"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registeredInvocations"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocationForStubbing"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.InvocationContainerImpl(org.mockito.internal.progress.MockingProgress, org.mockito.mock.MockCreationSettings)",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 47)",
        "(line 36,col 9)-(line 36,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.setInvocationForPotentialStubbing(org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 62)",
        "(line 41,col 9)-(line 41,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.resetInvocationForPotentialStubbing(org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.addAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.addConsecutiveAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.addAnswer(org.mockito.stubbing.Answer, boolean)",
      "begin_line": 57,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 70)",
        "(line 59,col 9)-(line 59,col 54)",
        "(line 60,col 9)-(line 60,col 67)",
        "(line 61,col 9)-(line 61,col 54)",
        "(line 63,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.answerTo(org.mockito.invocation.Invocation)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.findAnswerFor(org.mockito.invocation.Invocation)",
      "begin_line": 76,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.addAnswerForVoidMethod(org.mockito.stubbing.Answer)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.setAnswersForStubbing(java.util.List\u003corg.mockito.stubbing.Answer\u003e)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.hasAnswersForStubbing()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.hasInvocationForPotentialStubbing()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.setMethodForStubbing(org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.toString()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.getInvocations()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.getStubbedInvocations()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.invokedMock()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.getInvocationForStubbing()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.InvocationContainerImpl.createRegisteredInvocations(org.mockito.mock.MockCreationSettings)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 47)"
      ]
    }
  ]
}