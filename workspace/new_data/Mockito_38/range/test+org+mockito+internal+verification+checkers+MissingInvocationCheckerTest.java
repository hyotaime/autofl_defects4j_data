{
  "filepath": "/tmp/Mockito-38b/test/org/mockito/internal/verification/checkers/MissingInvocationCheckerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingInvocationCheckerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 21,
      "end_line": 106,
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
        "finderStub"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporterStub"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocations"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.setup()",
      "begin_line": 31,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 42)",
        "(line 34,col 9)-(line 34,col 49)",
        "(line 35,col 9)-(line 35,col 73)",
        "(line 37,col 9)-(line 37,col 63)",
        "(line 38,col 9)-(line 38,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldAskFinderForActualInvocations()",
      "begin_line": 41,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 78)",
        "(line 44,col 9)-(line 44,col 43)",
        "(line 46,col 9)-(line 46,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldPassBecauseActualInvocationFound()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 78)",
        "(line 52,col 9)-(line 52,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldAskAnalyzerForSimilarInvocation()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 43)",
        "(line 59,col 9)-(line 59,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldReportWantedButNotInvoked()",
      "begin_line": 62,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 42)",
        "(line 69,col 9)-(line 69,col 43)",
        "(line 72,col 9)-(line 72,col 50)",
        "(line 73,col 9)-(line 73,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.shouldReportWantedInvocationDiffersFromActual()",
      "begin_line": 76,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 77)",
        "(line 80,col 9)-(line 80,col 54)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 85,col 9)-(line 85,col 43)",
        "(line 87,col 9)-(line 87,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReporterStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.Reporter"
      ],
      "begin_line": 90,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actual"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualLocation"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.ReporterStub.wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation, java.util.List\u003c? extends org.mockito.exceptions.PrintableInvocation\u003e)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationCheckerTest.ReporterStub.argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.internal.debugging.Location)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 101,col 21)-(line 101,col 41)",
        "(line 102,col 21)-(line 102,col 41)",
        "(line 103,col 21)-(line 103,col 57)"
      ]
    }
  ]
}