{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/exceptions/Reporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Reporter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 831,
      "comment": "\n * Reports verification and misusing errors.\n * \u003cp\u003e\n * One of the key points of mocking library is proper verification/exception\n * messages. All messages in one place makes it easier to tune and amend them.\n * \u003cp\u003e\n * Reporter can be injected and therefore is easily testable.\n * \u003cp\u003e\n * Generally, exception messages are full of line breaks to make them easy to\n * read (xunit plugins take only fraction of screen on modern IDEs).\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.checkedExceptionInvalid(java.lang.Throwable)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotStubWithNullThrowable()",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.unfinishedStubbing(org.mockito.invocation.Location)",
      "begin_line": 70,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 85,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.incorrectUseOfApi()",
      "begin_line": 88,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 98,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.missingMethodInvocation()",
      "begin_line": 101,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 113,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.unfinishedVerificationException(org.mockito.invocation.Location)",
      "begin_line": 116,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 128,col 11)",
        "(line 130,col 9)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToVerify(java.lang.Class)",
      "begin_line": 133,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 141,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToVerify()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 153,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToWhenMethod()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 161,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToWhenMethod()",
      "begin_line": 164,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 170,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mocksHaveToBePassedToVerifyNoMoreInteractions()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 180,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedToVerifyNoMoreInteractions()",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 190,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedToVerifyNoMoreInteractions()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 199,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.notAMockPassedWhenCreatingInOrder()",
      "begin_line": 202,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 208,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.nullPassedWhenCreatingInOrder()",
      "begin_line": 211,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 217,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mocksHaveToBePassedWhenCreatingInOrder()",
      "begin_line": 220,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 226,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.inOrderRequiresFamiliarMock()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invalidUseOfMatchers(int, java.util.List\u003corg.mockito.internal.matchers.LocalizedMatcher\u003e)",
      "begin_line": 238,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 254,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.incorrectUseOfAdditionalMatchers(java.lang.String, int, java.util.Collection\u003corg.mockito.internal.matchers.LocalizedMatcher\u003e)",
      "begin_line": 257,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 275,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.stubPassedToVerify()",
      "begin_line": 278,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 282,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.reportNoSubMatchersFound(java.lang.String)",
      "begin_line": 285,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 290,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.locationsOf(java.util.Collection\u003corg.mockito.internal.matchers.LocalizedMatcher\u003e)",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 59)",
        "(line 296,col 9)-(line 297,col 62)",
        "(line 298,col 9)-(line 298,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.argumentsAreDifferent(java.lang.String, java.lang.String, org.mockito.invocation.Location)",
      "begin_line": 301,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 309,col 10)",
        "(line 311,col 9)-(line 311,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvoked(org.mockito.invocation.DescribedInvocation)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvoked(org.mockito.invocation.DescribedInvocation, java.util.List\u003c? extends org.mockito.invocation.DescribedInvocation\u003e)",
      "begin_line": 318,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 30)",
        "(line 320,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 66)",
        "(line 334,col 9)-(line 334,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage(org.mockito.invocation.DescribedInvocation)",
      "begin_line": 337,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 343,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedButNotInvokedInOrder(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.DescribedInvocation)",
      "begin_line": 346,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 356,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooManyActualInvocations(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 107)",
        "(line 361,col 9)-(line 361,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createTooManyInvocationsMessage(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 364,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 373,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.neverWantedButInvoked(org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 376,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 384,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooManyActualInvocationsInOrder(int, int, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 387,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 107)",
        "(line 389,col 9)-(line 391,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.createTooLittleInvocationsMessage(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 394,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 397,col 84)",
        "(line 399,col 9)-(line 405,col 10)",
        "(line 406,col 9)-(line 406,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooLittleActualInvocations(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 409,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 100)",
        "(line 412,col 9)-(line 412,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.tooLittleActualInvocationsInOrder(org.mockito.internal.reporting.Discrepancy, org.mockito.invocation.DescribedInvocation, org.mockito.invocation.Location)",
      "begin_line": 415,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 100)",
        "(line 418,col 9)-(line 420,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.noMoreInteractionsWanted(org.mockito.invocation.Invocation, java.util.List\u003corg.mockito.internal.exceptions.VerificationAwareInvocation\u003e)",
      "begin_line": 423,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 64)",
        "(line 425,col 9)-(line 425,col 61)",
        "(line 427,col 9)-(line 433,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.noMoreInteractionsWantedInOrder(org.mockito.invocation.Invocation)",
      "begin_line": 436,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 442,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotMockFinalClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 452,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotStubVoidMethodWithAReturnValue(java.lang.String)",
      "begin_line": 455,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 469,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.onlyVoidMethodsCanBeSetToDoNothing()",
      "begin_line": 472,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 481,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wrongTypeOfReturnValue(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 484,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 496,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wrongTypeReturnedByDefaultAnswer(java.lang.Object, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 499,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 500,col 9)-(line 507,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wantedAtMostX(int, int)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.misplacedArgumentMatcher(java.util.List\u003corg.mockito.internal.matchers.LocalizedMatcher\u003e)",
      "begin_line": 515,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 530,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.smartNullPointerException(java.lang.String, org.mockito.invocation.Location)",
      "begin_line": 533,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 541,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.noArgumentValueWasCaptured()",
      "begin_line": 544,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 556,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesDoesNotAcceptNullParameters()",
      "begin_line": 559,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesAcceptsOnlyInterfaces(java.lang.Class\u003c?\u003e)",
      "begin_line": 565,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 569,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesCannotContainMockedType(java.lang.Class\u003c?\u003e)",
      "begin_line": 572,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 577,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.extraInterfacesRequiresAtLeastOneInterface()",
      "begin_line": 580,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 586,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 594,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotCallAbstractRealMethod()",
      "begin_line": 597,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 603,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotVerifyToString()",
      "begin_line": 606,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 613,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.moreThanOneAnnotationNotAllowed(java.lang.String)",
      "begin_line": 616,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.unsupportedCombinationOfAnnotations(java.lang.String, java.lang.String)",
      "begin_line": 622,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 624,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotInitializeForSpyAnnotation(java.lang.String, java.lang.Exception)",
      "begin_line": 627,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 635,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotInitializeForInjectMocksAnnotation(java.lang.String, java.lang.Exception)",
      "begin_line": 638,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 639,col 9)-(line 647,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.atMostAndNeverShouldNotBeUsedWithTimeout()",
      "begin_line": 650,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 658,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.fieldInitialisationThrewException(java.lang.reflect.Field, java.lang.Throwable)",
      "begin_line": 661,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 662,col 9)-(line 666,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invocationListenerDoesNotAcceptNullParameters()",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invocationListenersRequiresAtLeastOneListener()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invocationListenerThrewException(org.mockito.listeners.InvocationListener, java.lang.Throwable)",
      "begin_line": 678,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 135)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotInjectDependency(java.lang.reflect.Field, java.lang.Object, java.lang.Exception)",
      "begin_line": 684,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 691,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.exceptionCauseMessageIfAvailable(java.lang.Exception)",
      "begin_line": 694,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(java.lang.Class, java.lang.Object)",
      "begin_line": 701,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 709,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.spyAndDelegateAreMutuallyExclusive()",
      "begin_line": 712,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 715,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invalidArgumentRangeAtIdentityAnswerCreationTime()",
      "begin_line": 718,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 719,col 9)-(line 722,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.invalidArgumentPositionRangeAtInvocationTime(org.mockito.invocation.InvocationOnMock, boolean, int)",
      "begin_line": 725,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 735,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.possibleArgumentTypesOf(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 738,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 79)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 113)",
        "(line 745,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.wrongTypeOfArgumentToReturn(org.mockito.invocation.InvocationOnMock, java.lang.String, java.lang.Class, int)",
      "begin_line": 757,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 776,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.defaultAnswerDoesNotAcceptNullParameter()",
      "begin_line": 779,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.serializableWontWorkForObjectsThatDontImplementSerializable(java.lang.Class)",
      "begin_line": 783,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 792,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.delegatedMethodHasWrongReturnType(java.lang.reflect.Method, java.lang.reflect.Method, java.lang.Object, java.lang.Object)",
      "begin_line": 795,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 802,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.delegatedMethodDoesNotExistOnDelegate(java.lang.reflect.Method, java.lang.Object, java.lang.Object)",
      "begin_line": 805,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 812,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.usingConstructorWithFancySerializable(org.mockito.mock.SerializableMode)",
      "begin_line": 815,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.cannotCreateTimerWithNegativeDurationTime(long)",
      "begin_line": 819,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 825,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.Reporter.safelyGetMockName(java.lang.Object)",
      "begin_line": 828,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 48)"
      ]
    }
  ]
}