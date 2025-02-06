{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/verification/BasicVerificationInOrderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicVerificationInOrderTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 19,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockOne"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockTwo"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockThree"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inOrder"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.setUp()",
      "begin_line": 26,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 39)",
        "(line 29,col 9)-(line 29,col 39)",
        "(line 30,col 9)-(line 30,col 41)",
        "(line 32,col 9)-(line 32,col 55)",
        "(line 34,col 9)-(line 34,col 32)",
        "(line 35,col 9)-(line 35,col 32)",
        "(line 36,col 9)-(line 36,col 32)",
        "(line 37,col 9)-(line 37,col 34)",
        "(line 38,col 9)-(line 38,col 32)",
        "(line 39,col 9)-(line 39,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrder()",
      "begin_line": 42,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 48)",
        "(line 45,col 9)-(line 45,col 58)",
        "(line 46,col 9)-(line 46,col 50)",
        "(line 47,col 9)-(line 47,col 48)",
        "(line 48,col 9)-(line 48,col 48)",
        "(line 49,col 9)-(line 49,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrderUsingAtLeastOnce()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 63)",
        "(line 55,col 9)-(line 55,col 58)",
        "(line 56,col 9)-(line 56,col 50)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 63)",
        "(line 59,col 9)-(line 59,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldVerifyInOrderWhenExpectingSomeInvocationsToBeCalledZeroTimes()",
      "begin_line": 62,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 48)",
        "(line 66,col 9)-(line 66,col 58)",
        "(line 67,col 9)-(line 67,col 59)",
        "(line 68,col 9)-(line 68,col 50)",
        "(line 69,col 9)-(line 69,col 48)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 58)",
        "(line 72,col 9)-(line 72,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenFirstMockCalledTwice()",
      "begin_line": 75,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 48)",
        "(line 78,col 9)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenLastMockCalledTwice()",
      "begin_line": 84,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 58)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 94,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseOneInvocationWanted()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseOneInvocationWantedAgain()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseFourInvocationsWanted()",
      "begin_line": 107,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 113,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseTwoInvocationsWantedAgain()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 122,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseOneInvocationWanted()",
      "begin_line": 125,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 63)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 134,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseOneInvocationWantedAgain()",
      "begin_line": 137,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 63)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 65)",
        "(line 142,col 9)-(line 142,col 63)",
        "(line 143,col 9)-(line 146,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseDifferentArgsWanted()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnFirstMethodBecauseDifferentMethodWanted()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseDifferentArgsWanted()",
      "begin_line": 161,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 167,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnSecondMethodBecauseDifferentMethodWanted()",
      "begin_line": 170,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 176,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseDifferentArgsWanted()",
      "begin_line": 179,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 58)",
        "(line 183,col 9)-(line 183,col 50)",
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 188,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnLastMethodBecauseDifferentMethodWanted()",
      "begin_line": 191,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 58)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 200,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenLastMethodVerifiedFirst()",
      "begin_line": 205,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 211,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenMiddleMethodVerifiedFirst()",
      "begin_line": 214,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 58)",
        "(line 217,col 9)-(line 220,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailWhenMiddleMethodVerifiedFirstInAtLeastOnceMode()",
      "begin_line": 223,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 63)",
        "(line 226,col 9)-(line 229,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnVerifyNoMoreInteractions()",
      "begin_line": 232,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 48)",
        "(line 235,col 9)-(line 235,col 58)",
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 237,col 48)",
        "(line 239,col 9)-(line 242,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldFailOnVerifyZeroInteractions()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.BasicVerificationInOrderTest.shouldScreamWhenNullPassed()",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 22)"
      ]
    }
  ]
}