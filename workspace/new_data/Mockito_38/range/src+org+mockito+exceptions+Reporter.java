{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/exceptions/Reporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Reporter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 464,
      "comment": "\n * Reports verification and misusing errors.\n * \u003cp\u003e\n * One of the key points of mocking library is proper verification/exception\n * messages. All messages in one place makes it easier to tune and amend them.\n * \u003cp\u003e\n * Reporter can be injected and therefore is easily testable.\n * \u003cp\u003e\n * Generally, exception messages are full of line breaks to make them easy to\n * read (xunit plugins take only fraction of screen on modern IDEs).\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.checkedExceptionInvalid(java.lang.Throwable)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotStubWithNullThrowable()",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.unfinishedStubbing(org.mockito.internal.debugging.Location)",
      "begin_line": 59,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 73,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.missingMethodInvocation()",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 85,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.unfinishedVerificationException(org.mockito.internal.debugging.Location)",
      "begin_line": 88,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 99,col 11)",
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToVerify()",
      "begin_line": 104,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 111,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToVerify()",
      "begin_line": 114,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 122,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToWhenMethod()",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 130,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToWhenMethod()",
      "begin_line": 133,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 139,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mocksHaveToBePassedToVerifyNoMoreInteractions()",
      "begin_line": 142,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToVerifyNoMoreInteractions()",
      "begin_line": 151,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 157,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToVerifyNoMoreInteractions()",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 166,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedWhenCreatingInOrder()",
      "begin_line": 169,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedWhenCreatingInOrder()",
      "begin_line": 178,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mocksHaveToBePassedWhenCreatingInOrder()",
      "begin_line": 187,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.inOrderRequiresFamiliarMock()",
      "begin_line": 196,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invalidUseOfMatchers(int, int)",
      "begin_line": 205,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 218,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.internal.debugging.Location)",
      "begin_line": 221,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 229,col 18)",
        "(line 231,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvoked(org.mockito.exceptions.PrintableInvocation, java.util.List\u003c? extends org.mockito.exceptions.PrintableInvocation\u003e)",
      "begin_line": 242,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 30)",
        "(line 244,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 66)",
        "(line 256,col 9)-(line 256,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 259,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 265,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder(org.mockito.exceptions.PrintableInvocation, org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 268,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 278,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooManyActualInvocations(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 107)",
        "(line 283,col 9)-(line 283,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 286,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 295,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.neverWantedButInvoked(org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 306,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder(int, int, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 309,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 107)",
        "(line 311,col 9)-(line 313,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 316,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 319,col 79)",
        "(line 321,col 13)-(line 327,col 14)",
        "(line 328,col 13)-(line 328,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooLittleActualInvocations(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 331,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 100)",
        "(line 334,col 9)-(line 334,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(org.mockito.exceptions.Discrepancy, org.mockito.exceptions.PrintableInvocation, org.mockito.internal.debugging.Location)",
      "begin_line": 337,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 100)",
        "(line 340,col 9)-(line 342,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.noMoreInteractionsWanted(org.mockito.exceptions.PrintableInvocation)",
      "begin_line": 345,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotMockFinalClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 355,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 362,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotStubVoidMethodWithAReturnValue()",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 370,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.onlyVoidMethodsCanBeSetToDoNothing()",
      "begin_line": 373,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 382,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wrongTypeOfReturnValue(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 385,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 389,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedAtMostX(int, int)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.misplacedArgumentMatcher(org.mockito.internal.debugging.Location)",
      "begin_line": 396,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 410,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.smartNullPointerException(org.mockito.internal.debugging.Location)",
      "begin_line": 413,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 420,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.noArgumentValueWasCaptured()",
      "begin_line": 423,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesDoesNotAcceptNullParameters()",
      "begin_line": 438,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces(java.lang.Class\u003c?\u003e)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 448,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType(java.lang.Class\u003c?\u003e)",
      "begin_line": 451,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 456,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesRequiresAtLeastOneInterface()",
      "begin_line": 459,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 11)"
      ]
    }
  ]
}