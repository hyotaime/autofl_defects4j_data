{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/verification/checkers/MissingInvocationCheckerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingInvocationCheckerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 22,
      "end_line": 107,
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
        "finderStub"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporterStub"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocations"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.setup()",
      "begin_line": 32,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 42)",
        "(line 35,col 9)-(line 35,col 49)",
        "(line 36,col 9)-(line 36,col 73)",
        "(line 38,col 9)-(line 38,col 63)",
        "(line 39,col 9)-(line 39,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldAskFinderForActualInvocations()",
      "begin_line": 42,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 78)",
        "(line 45,col 9)-(line 45,col 43)",
        "(line 47,col 9)-(line 47,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldPassBecauseActualInvocationFound()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 78)",
        "(line 53,col 9)-(line 53,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldAskAnalyzerForSimilarInvocation()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 43)",
        "(line 60,col 9)-(line 60,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldReportWantedButNotInvoked()",
      "begin_line": 63,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 42)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 73,col 9)-(line 73,col 50)",
        "(line 74,col 9)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldReportWantedInvocationDiffersFromActual()",
      "begin_line": 77,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 56)",
        "(line 80,col 9)-(line 80,col 77)",
        "(line 81,col 9)-(line 81,col 54)",
        "(line 83,col 9)-(line 83,col 43)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 86,col 9)-(line 86,col 43)",
        "(line 88,col 9)-(line 88,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReporterStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.Reporter"
      ],
      "begin_line": 91,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actual"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualLocation"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.ReporterStub.wantedButNotInvoked(org.mockito.invocation.DescribedInvocation, java.util.List\u003c? extends org.mockito.invocation.DescribedInvocation\u003e)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.ReporterStub.argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.invocation.Location)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 21)-(line 102,col 41)",
        "(line 103,col 21)-(line 103,col 41)",
        "(line 104,col 21)-(line 104,col 57)"
      ]
    }
  ]
}