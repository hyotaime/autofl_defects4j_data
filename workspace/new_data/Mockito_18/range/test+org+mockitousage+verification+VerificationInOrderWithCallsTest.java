{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/verification/VerificationInOrderWithCallsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerificationInOrderWithCallsTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 20,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockOne"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockTwo"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exceptionRule"
      ],
      "begin_line": 24,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailWhenMethodNotCalled()",
      "begin_line": 27,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailWhenMethodCalledTooFewTimes()",
      "begin_line": 48,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailWhenSingleMethodCallsAreOutOfSequence()",
      "begin_line": 72,
      "end_line": 73,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailWhenDifferentMethodCallsAreOutOfSequence()",
      "begin_line": 95,
      "end_line": 96,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailWhenMethodCallsOnDifferentMocksAreOutOfSequence()",
      "begin_line": 118,
      "end_line": 119,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowSequentialCallsToCallsForSingleMethod()",
      "begin_line": 142,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 28)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 147,col 28)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 150,col 9)-(line 150,col 46)",
        "(line 153,col 9)-(line 153,col 56)",
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 157,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowSequentialCallsToCallsForDifferentMethods()",
      "begin_line": 162,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 28)",
        "(line 166,col 9)-(line 166,col 29)",
        "(line 167,col 9)-(line 167,col 29)",
        "(line 168,col 9)-(line 168,col 28)",
        "(line 170,col 9)-(line 170,col 46)",
        "(line 173,col 9)-(line 173,col 56)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 175,col 54)",
        "(line 176,col 9)-(line 176,col 42)",
        "(line 177,col 9)-(line 177,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowSequentialCallsToCallsForMethodsOnDifferentMocks()",
      "begin_line": 182,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 29)",
        "(line 186,col 9)-(line 186,col 29)",
        "(line 187,col 9)-(line 187,col 29)",
        "(line 188,col 9)-(line 188,col 29)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 193,col 9)-(line 193,col 57)",
        "(line 194,col 9)-(line 194,col 57)",
        "(line 195,col 9)-(line 195,col 57)",
        "(line 196,col 9)-(line 196,col 42)",
        "(line 197,col 9)-(line 197,col 42)",
        "(line 198,col 9)-(line 198,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowFewerCallsForSingleMethod()",
      "begin_line": 204,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 208,col 28)",
        "(line 209,col 9)-(line 209,col 28)",
        "(line 210,col 9)-(line 210,col 28)",
        "(line 211,col 9)-(line 211,col 28)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 216,col 9)-(line 216,col 56)",
        "(line 217,col 9)-(line 217,col 56)",
        "(line 218,col 9)-(line 218,col 56)",
        "(line 219,col 9)-(line 219,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsWhenFewerCallsForSingleMethod()",
      "begin_line": 224,
      "end_line": 225,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsInInOrderWhenFewerCallsForSingleMethod()",
      "begin_line": 248,
      "end_line": 249,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowFewerCallsForDifferentMethods()",
      "begin_line": 271,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 28)",
        "(line 275,col 9)-(line 275,col 29)",
        "(line 276,col 9)-(line 276,col 29)",
        "(line 277,col 9)-(line 277,col 28)",
        "(line 278,col 9)-(line 278,col 29)",
        "(line 280,col 9)-(line 280,col 46)",
        "(line 283,col 9)-(line 283,col 56)",
        "(line 284,col 9)-(line 284,col 57)",
        "(line 285,col 9)-(line 285,col 56)",
        "(line 286,col 9)-(line 286,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsWhenFewerCallsForDifferentMethods()",
      "begin_line": 291,
      "end_line": 292,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsInInOrderWhenFewerCallsForDifferentMethods()",
      "begin_line": 315,
      "end_line": 316,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldAllowFewerCallsForMethodsOnDifferentMocks()",
      "begin_line": 338,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 29)",
        "(line 342,col 9)-(line 342,col 29)",
        "(line 343,col 9)-(line 343,col 29)",
        "(line 344,col 9)-(line 344,col 29)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 347,col 9)-(line 347,col 55)",
        "(line 350,col 9)-(line 350,col 57)",
        "(line 351,col 9)-(line 351,col 57)",
        "(line 352,col 9)-(line 352,col 57)",
        "(line 353,col 9)-(line 353,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsWhenFewerCallsForMethodsOnDifferentMocks()",
      "begin_line": 358,
      "end_line": 359,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldNotVerifySkippedCallsInInOrderWhenFewerCallsForMethodsOnDifferentMocks()",
      "begin_line": 382,
      "end_line": 383,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldVerifyWithCallsAfterUseOfTimes()",
      "begin_line": 405,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 28)",
        "(line 409,col 9)-(line 409,col 28)",
        "(line 410,col 9)-(line 410,col 28)",
        "(line 411,col 9)-(line 411,col 28)",
        "(line 413,col 9)-(line 413,col 46)",
        "(line 416,col 9)-(line 416,col 56)",
        "(line 417,col 9)-(line 417,col 56)",
        "(line 418,col 9)-(line 418,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldVerifyWithCallsAfterUseOfAtLeast()",
      "begin_line": 423,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 28)",
        "(line 427,col 9)-(line 427,col 28)",
        "(line 428,col 9)-(line 428,col 28)",
        "(line 430,col 9)-(line 430,col 46)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldVerifyWithTimesAfterUseOfCalls()",
      "begin_line": 439,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 28)",
        "(line 443,col 9)-(line 443,col 28)",
        "(line 444,col 9)-(line 444,col 28)",
        "(line 445,col 9)-(line 445,col 28)",
        "(line 447,col 9)-(line 447,col 46)",
        "(line 450,col 9)-(line 450,col 56)",
        "(line 451,col 9)-(line 451,col 56)",
        "(line 452,col 9)-(line 452,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldVerifyWithAtLeastAfterUseOfCalls()",
      "begin_line": 457,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 28)",
        "(line 461,col 9)-(line 461,col 28)",
        "(line 462,col 9)-(line 462,col 28)",
        "(line 463,col 9)-(line 463,col 28)",
        "(line 465,col 9)-(line 465,col 46)",
        "(line 468,col 9)-(line 468,col 56)",
        "(line 469,col 9)-(line 469,col 58)",
        "(line 470,col 9)-(line 470,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldVerifyWithTimesAfterCallsInSameChunk()",
      "begin_line": 475,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 28)",
        "(line 479,col 9)-(line 479,col 28)",
        "(line 480,col 9)-(line 480,col 28)",
        "(line 482,col 9)-(line 482,col 46)",
        "(line 485,col 9)-(line 485,col 56)",
        "(line 486,col 9)-(line 486,col 56)",
        "(line 487,col 9)-(line 487,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailToCreateCallsWithZeroArgument()",
      "begin_line": 492,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 55)",
        "(line 497,col 9)-(line 497,col 87)",
        "(line 500,col 9)-(line 500,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailToCreateCallsWithNegativeArgument()",
      "begin_line": 505,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 46)",
        "(line 509,col 9)-(line 509,col 55)",
        "(line 510,col 9)-(line 510,col 87)",
        "(line 513,col 9)-(line 513,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.verification.VerificationInOrderWithCallsTest.shouldFailToCreateCallsForNonInOrderVerification()",
      "begin_line": 518,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 29)",
        "(line 522,col 9)-(line 522,col 55)",
        "(line 523,col 9)-(line 523,col 85)",
        "(line 526,col 9)-(line 526,col 48)"
      ]
    }
  ]
}