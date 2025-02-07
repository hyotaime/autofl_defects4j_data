{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/verification/checkers/MissingInvocationInOrderCheckerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingInvocationInOrderCheckerTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 26,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reporterStub"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocations"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finderStub"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.setup()",
      "begin_line": 35,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 42)",
        "(line 38,col 9)-(line 38,col 49)",
        "(line 39,col 9)-(line 39,col 80)",
        "(line 41,col 9)-(line 41,col 63)",
        "(line 42,col 9)-(line 42,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldPassWhenMatchingInteractionFound()",
      "begin_line": 45,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 67)",
        "(line 48,col 9)-(line 48,col 67)",
        "(line 50,col 9)-(line 50,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldReportWantedButNotInvoked()",
      "begin_line": 53,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 77)",
        "(line 56,col 9)-(line 56,col 93)",
        "(line 58,col 9)-(line 58,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldReportArgumentsAreDifferent()",
      "begin_line": 61,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 78)",
        "(line 64,col 9)-(line 64,col 76)",
        "(line 65,col 9)-(line 65,col 93)",
        "(line 66,col 9)-(line 66,col 87)",
        "(line 67,col 9)-(line 67,col 69)",
        "(line 68,col 9)-(line 68,col 63)",
        "(line 69,col 9)-(line 69,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.shouldReportWantedDiffersFromActual()",
      "begin_line": 72,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 75,col 54)",
        "(line 77,col 9)-(line 77,col 93)",
        "(line 79,col 9)-(line 79,col 50)",
        "(line 80,col 9)-(line 80,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReporterStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.Reporter"
      ],
      "begin_line": 83,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wantedString"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actual"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualLocation"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.ReporterStub.wantedButNotInvokedInOrder(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.DescribedInvocation)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 33)",
        "(line 92,col 13)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.ReporterStub.wantedButNotInvoked(org.mockito.invocation.DescribedInvocation)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.checkers.MissingInvocationInOrderCheckerTest.ReporterStub.argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.invocation.Location)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 39)",
        "(line 101,col 13)-(line 101,col 33)",
        "(line 102,col 13)-(line 102,col 49)"
      ]
    }
  ]
}