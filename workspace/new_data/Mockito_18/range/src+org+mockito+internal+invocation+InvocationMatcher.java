{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/invocation/InvocationMatcher.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationMatcher",
      "is_interface": false,
      "parent_types": [
        "org.mockito.invocation.DescribedInvocation",
        "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
        "java.io.Serializable"
      ],
      "begin_line": 23,
      "end_line": 163,
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
        "invocation"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchers"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.InvocationMatcher(org.mockito.invocation.Invocation, java.util.List\u003corg.hamcrest.Matcher\u003e)",
      "begin_line": 30,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 37)",
        "(line 32,col 9)-(line 36,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.InvocationMatcher(org.mockito.invocation.Invocation)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getMethod()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getInvocation()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getMatchers()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.toString()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.matches(org.mockito.invocation.Invocation)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.safelyArgumentsMatch(java.lang.Object[])",
      "begin_line": 65,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.hasSimilarMethod(org.mockito.invocation.Invocation)",
      "begin_line": 77,
      "end_line": 93,
      "comment": "\n     * similar means the same method name, same mock, unverified \n     * and: if arguments are the same cannot be overloaded\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 67)",
        "(line 81,col 9)-(line 81,col 84)",
        "(line 82,col 9)-(line 82,col 61)",
        "(line 83,col 9)-(line 83,col 87)",
        "(line 84,col 9)-(line 84,col 62)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 110)",
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.hasSameMethod(org.mockito.invocation.Invocation)",
      "begin_line": 95,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 99,col 42)",
        "(line 101,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.getLocation()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.captureArgumentsFrom(org.mockito.invocation.Invocation)",
      "begin_line": 120,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.isVarargMatcher(org.hamcrest.Matcher)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.isVariableArgument(org.mockito.invocation.Invocation, int)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationMatcher.createFrom(java.util.List\u003corg.mockito.invocation.Invocation\u003e)",
      "begin_line": 154,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 80)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    }
  ]
}