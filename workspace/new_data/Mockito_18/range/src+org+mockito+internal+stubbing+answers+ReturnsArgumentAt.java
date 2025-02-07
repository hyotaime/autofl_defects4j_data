{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/answers/ReturnsArgumentAt.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsArgumentAt",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 22,
      "end_line": 111,
      "comment": "\n * Returns the passed parameter identity at specified index.\n *\n * \u003cp\u003eThe \u003ccode\u003eargumentIndex\u003c/code\u003e represents the index in the argument array of the invocation.\u003c/p\u003e\n * \u003cp\u003eIf this number equals -1 then the last argument is returned.\u003c/p\u003e\n *\n * @see org.mockito.AdditionalAnswers\n * @since 1.9.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_ARGUMENT"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wantedArgumentPosition"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.ReturnsArgumentAt(int)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Build the identity answer to return the argument at the given position in the argument array.\n     *\n     * @param wantedArgumentPosition The position of the argument identity to return in the invocation.\n     *                      Using \u003ccode\u003e-1\u003c/code\u003e indicates the last argument.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 55)",
        "(line 42,col 9)-(line 42,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.actualArgumentPosition(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.returningLastArg()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.argumentIndexOf(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.lastArgumentIndexOf(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.checkWithinAllowedRange(int)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.wantedArgumentPosition()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.validateIndexWithinInvocationRange(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.argumentPositionInRange(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 83,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 72)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.answers.ReturnsArgumentAt.returnedTypeOnSignature(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 95,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 72)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 79)",
        "(line 103,col 9)-(line 103,col 55)",
        "(line 105,col 9)-(line 109,col 9)"
      ]
    }
  ]
}