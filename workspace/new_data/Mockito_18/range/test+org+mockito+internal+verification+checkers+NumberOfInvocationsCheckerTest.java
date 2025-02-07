{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/verification/checkers/NumberOfInvocationsCheckerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberOfInvocationsCheckerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 22,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporterStub"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocations"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finderStub"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.setup()",
      "begin_line": 30,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 42)",
        "(line 33,col 9)-(line 33,col 49)",
        "(line 34,col 9)-(line 34,col 75)",
        "(line 36,col 9)-(line 36,col 63)",
        "(line 37,col 9)-(line 37,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldReportTooLittleActual()",
      "begin_line": 40,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 78)",
        "(line 44,col 9)-(line 44,col 48)",
        "(line 46,col 9)-(line 46,col 50)",
        "(line 47,col 9)-(line 47,col 52)",
        "(line 48,col 9)-(line 48,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldReportWithLastInvocationStackTrace()",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 66)",
        "(line 54,col 9)-(line 54,col 67)",
        "(line 56,col 9)-(line 56,col 64)",
        "(line 58,col 9)-(line 58,col 48)",
        "(line 60,col 9)-(line 60,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldNotReportWithLastInvocationStackTraceIfNoInvocationsFound()",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 56)",
        "(line 67,col 9)-(line 67,col 48)",
        "(line 69,col 9)-(line 69,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldReportWithFirstUndesiredInvocationStackTrace()",
      "begin_line": 72,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 66)",
        "(line 75,col 9)-(line 75,col 67)",
        "(line 76,col 9)-(line 76,col 66)",
        "(line 78,col 9)-(line 78,col 71)",
        "(line 80,col 9)-(line 80,col 46)",
        "(line 82,col 9)-(line 82,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldReportTooManyActual()",
      "begin_line": 85,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 78)",
        "(line 88,col 9)-(line 88,col 78)",
        "(line 90,col 9)-(line 90,col 46)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldReportNeverWantedButInvoked()",
      "begin_line": 97,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 71)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 105,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.shouldMarkInvocationsAsVerified()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 71)",
        "(line 111,col 9)-(line 111,col 50)",
        "(line 112,col 9)-(line 112,col 45)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 116,col 9)-(line 116,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReporterStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.Reporter"
      ],
      "begin_line": 119,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wantedCount"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualCount"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.ReporterStub.tooLittleActualInvocations(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 21)-(line 125,col 68)",
        "(line 126,col 21)-(line 126,col 68)",
        "(line 127,col 21)-(line 127,col 41)",
        "(line 128,col 21)-(line 128,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.ReporterStub.tooManyActualInvocations(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 132,col 21)-(line 132,col 51)",
        "(line 133,col 21)-(line 133,col 51)",
        "(line 134,col 21)-(line 134,col 41)",
        "(line 135,col 21)-(line 135,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.NumberOfInvocationsCheckerTest.ReporterStub.neverWantedButInvoked(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 33)",
        "(line 141,col 13)-(line 141,col 43)"
      ]
    }
  ]
}