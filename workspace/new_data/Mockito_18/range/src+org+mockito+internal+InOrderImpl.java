{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/InOrderImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InOrderImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.InOrder",
        "org.mockito.internal.verification.api.InOrderContext"
      ],
      "begin_line": 25,
      "end_line": 64,
      "comment": "\n * Allows verifying in order. This class should not be exposed, hence default access.\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockitoCore"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporter"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mocksToBeVerifiedInOrder"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inOrderContext"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.getMocksToBeVerifiedInOrder()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.InOrderImpl.InOrderImpl(java.util.List\u003cjava.lang.Object\u003e)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.verify(T)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.verify(T, org.mockito.verification.VerificationMode)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 50,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.isVerified(org.mockito.invocation.Invocation)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.markVerified(org.mockito.invocation.Invocation)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InOrderImpl.verifyNoMoreInteractions()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 84)"
      ]
    }
  ]
}