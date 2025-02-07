{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/invocation/InvocationImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.invocation.Invocation",
        "org.mockito.internal.exceptions.VerificationAwareInvocation"
      ],
      "begin_line": 26,
      "end_line": 138,
      "comment": "\n * Method call on a mock object.\n * \u003cp\u003e\n * Contains sequence number which should be globally unique and is used for\n * verification in order.\n * \u003cp\u003e\n * Contains stack trace of invocation\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sequenceNumber"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawArguments"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "verified"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isIgnoredForVerification"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "realMethod"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stubInfo"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationImpl.InvocationImpl(java.lang.Object, org.mockito.internal.invocation.MockitoMethod, java.lang.Object[], int, org.mockito.internal.invocation.realmethod.RealMethod)",
      "begin_line": 43,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 36)",
        "(line 45,col 9)-(line 45,col 25)",
        "(line 46,col 9)-(line 46,col 37)",
        "(line 47,col 9)-(line 47,col 91)",
        "(line 48,col 9)-(line 48,col 33)",
        "(line 49,col 9)-(line 49,col 45)",
        "(line 50,col 9)-(line 50,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getMock()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getMethod()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getArguments()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getArgumentAt(int, java.lang.Class\u003cT\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.isVerified()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getSequenceNumber()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.equals(java.lang.Object)",
      "begin_line": 77,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 50)",
        "(line 84,col 9)-(line 84,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.equalArguments(java.lang.Object[])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.hashCode()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.toString()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getLocation()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getRawArguments()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.getRawReturnType()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.callRealMethod()",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.markVerified()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.stubInfo()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.markStubbed(org.mockito.invocation.StubInfo)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.isIgnoredForVerification()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationImpl.ignoreForVerification()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 40)"
      ]
    }
  ]
}