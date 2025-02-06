{
  "filepath": "/tmp/Mockito-38b/test/org/mockito/internal/verification/checkers/MissingInvocationInOrderCheckerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingInvocationInOrderCheckerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 21,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporterStub"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocations"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finderStub"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.setup()",
      "begin_line": 29,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 42)",
        "(line 32,col 9)-(line 32,col 49)",
        "(line 33,col 9)-(line 33,col 80)",
        "(line 35,col 9)-(line 35,col 63)",
        "(line 36,col 9)-(line 36,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldPassWhenMatchingInteractionFound()",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 67)",
        "(line 42,col 9)-(line 42,col 67)",
        "(line 44,col 9)-(line 44,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldReportWantedButNotInvoked()",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 77)",
        "(line 50,col 9)-(line 50,col 84)",
        "(line 52,col 9)-(line 52,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldReportWantedDiffersFromActual()",
      "begin_line": 55,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 69)",
        "(line 58,col 9)-(line 58,col 54)",
        "(line 60,col 9)-(line 60,col 84)",
        "(line 62,col 9)-(line 62,col 50)",
        "(line 63,col 9)-(line 63,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReporterStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.Reporter"
      ],
      "begin_line": 66,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.ReporterStub.wantedButNotInvokedInOrder(org.mockito.exceptions.PrintableInvocation, org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 33)",
        "(line 72,col 13)-(line 72,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.ReporterStub.wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 33)"
      ]
    }
  ]
}