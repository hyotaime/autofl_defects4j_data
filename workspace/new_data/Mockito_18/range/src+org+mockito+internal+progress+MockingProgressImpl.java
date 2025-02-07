{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/progress/MockingProgressImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockingProgressImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.progress.MockingProgress"
      ],
      "begin_line": 18,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporter"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argumentMatcherStorage"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iOngoingStubbing"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "verificationMode"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stubbingInProgress"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "listener"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.reportOngoingStubbing(org.mockito.internal.progress.IOngoingStubbing)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.pullOngoingStubbing()",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 49)",
        "(line 35,col 9)-(line 35,col 32)",
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.verificationStarted(org.mockito.verification.VerificationMode)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 24)",
        "(line 41,col 9)-(line 41,col 31)",
        "(line 42,col 9)-(line 42,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.resetOngoingStubbing()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " (non-Javadoc)\n     * @see org.mockito.internal.progress.MockingProgress#resetOngoingStubbing()\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.pullVerificationMode()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 61)",
        "(line 58,col 9)-(line 58,col 32)",
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.stubbingStarted()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 24)",
        "(line 64,col 9)-(line 64,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.validateState()",
      "begin_line": 67,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)",
        "(line 71,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.validateMostStuff()",
      "begin_line": 78,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 39)",
        "(line 83,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.stubbingCompleted(org.mockito.invocation.Invocation)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.toString()",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.reset()",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 34)",
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 105,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.getArgumentMatcherStorage()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.mockingStarted(java.lang.Object, java.lang.Class)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.progress.MockingProgressImpl.setListener(org.mockito.internal.listeners.MockingProgressListener)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 33)"
      ]
    }
  ]
}