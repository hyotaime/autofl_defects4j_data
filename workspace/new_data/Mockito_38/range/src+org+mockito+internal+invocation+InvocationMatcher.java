{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/invocation/InvocationMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationMatcher",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.PrintableInvocation",
        "org.mockito.internal.reporting.PrintingFriendlyInvocation"
      ],
      "begin_line": 17,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocation"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchers"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.InvocationMatcher(org.mockito.internal.invocation.Invocation, java.util.List\u003corg.hamcrest.Matcher\u003e)",
      "begin_line": 23,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 37)",
        "(line 25,col 9)-(line 29,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.InvocationMatcher(org.mockito.internal.invocation.Invocation)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getMethod()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getInvocation()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getMatchers()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.toString()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.matches(org.mockito.internal.invocation.Invocation)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.argumentsMatch(java.lang.Object[])",
      "begin_line": 58,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.safelyArgumentsMatch(java.lang.Object[])",
      "begin_line": 70,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.hasSimilarMethod(org.mockito.internal.invocation.Invocation)",
      "begin_line": 82,
      "end_line": 97,
      "comment": "\n     * similar means the same method name, same mock, unverified \n     * and: if arguments are the same cannot be overloaded\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 56)",
        "(line 84,col 9)-(line 84,col 67)",
        "(line 86,col 9)-(line 86,col 84)",
        "(line 87,col 9)-(line 87,col 61)",
        "(line 88,col 9)-(line 88,col 87)",
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 110)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(org.mockito.internal.invocation.Invocation)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getLocation()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.toString(org.mockito.internal.reporting.PrintSettings)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 60)"
      ]
    }
  ]
}