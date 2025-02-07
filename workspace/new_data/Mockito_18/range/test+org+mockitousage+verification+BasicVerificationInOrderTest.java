{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/verification/BasicVerificationInOrderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicVerificationInOrderTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 21,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockOne"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockTwo"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockThree"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inOrder"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.setUp()",
      "begin_line": 28,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 39)",
        "(line 31,col 9)-(line 31,col 39)",
        "(line 32,col 9)-(line 32,col 41)",
        "(line 34,col 9)-(line 34,col 55)",
        "(line 36,col 9)-(line 36,col 32)",
        "(line 37,col 9)-(line 37,col 32)",
        "(line 38,col 9)-(line 38,col 32)",
        "(line 39,col 9)-(line 39,col 34)",
        "(line 40,col 9)-(line 40,col 32)",
        "(line 41,col 9)-(line 41,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrder()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 48)",
        "(line 47,col 9)-(line 47,col 58)",
        "(line 48,col 9)-(line 48,col 50)",
        "(line 49,col 9)-(line 49,col 48)",
        "(line 50,col 9)-(line 50,col 48)",
        "(line 51,col 9)-(line 51,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrderUsingAtLeastOnce()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 63)",
        "(line 57,col 9)-(line 57,col 58)",
        "(line 58,col 9)-(line 58,col 50)",
        "(line 59,col 9)-(line 59,col 48)",
        "(line 60,col 9)-(line 60,col 63)",
        "(line 61,col 9)-(line 61,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrderWhenExpectingSomeInvocationsToBeCalledZeroTimes()",
      "begin_line": 64,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 48)",
        "(line 68,col 9)-(line 68,col 58)",
        "(line 69,col 9)-(line 69,col 59)",
        "(line 70,col 9)-(line 70,col 50)",
        "(line 71,col 9)-(line 71,col 48)",
        "(line 72,col 9)-(line 72,col 48)",
        "(line 73,col 9)-(line 73,col 58)",
        "(line 74,col 9)-(line 74,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenFirstMockCalledTwice()",
      "begin_line": 77,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 48)",
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenLastMockCalledTwice()",
      "begin_line": 87,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 58)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseOneInvocationWanted()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseOneInvocationWantedAgain()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseFourInvocationsWanted()",
      "begin_line": 111,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseTwoInvocationsWantedAgain()",
      "begin_line": 121,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseOneInvocationWanted()",
      "begin_line": 131,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 63)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseOneInvocationWantedAgain()",
      "begin_line": 144,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 63)",
        "(line 147,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 63)",
        "(line 150,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseDifferentArgsWanted()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseDifferentMethodWanted()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseDifferentArgsWanted()",
      "begin_line": 169,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 48)",
        "(line 172,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseDifferentMethodWanted()",
      "begin_line": 179,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 58)",
        "(line 182,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseDifferentArgsWanted()",
      "begin_line": 189,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 48)",
        "(line 195,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseDifferentMethodWanted()",
      "begin_line": 202,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 48)",
        "(line 205,col 9)-(line 205,col 58)",
        "(line 206,col 9)-(line 206,col 50)",
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenLastMethodVerifiedFirst()",
      "begin_line": 217,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 48)",
        "(line 220,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenMiddleMethodVerifiedFirst()",
      "begin_line": 227,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 58)",
        "(line 230,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenMiddleMethodVerifiedFirstInAtLeastOnceMode()",
      "begin_line": 237,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 63)",
        "(line 240,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnVerifyNoMoreInteractions()",
      "begin_line": 247,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 48)",
        "(line 250,col 9)-(line 250,col 58)",
        "(line 251,col 9)-(line 251,col 50)",
        "(line 252,col 9)-(line 252,col 48)",
        "(line 254,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnVerifyZeroInteractions()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldScreamWhenNullPassed()",
      "begin_line": 266,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 32)"
      ]
    }
  ]
}