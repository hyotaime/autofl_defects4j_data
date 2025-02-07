{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/BDDMockito.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BDDMockito",
      "is_interface": false,
      "parent_types": [
        "org.mockito.Mockito"
      ],
      "begin_line": 66,
      "end_line": 416,
      "comment": "\n * Behavior Driven Development style of writing tests uses \u003cb\u003e//given //when //then\u003c/b\u003e comments as fundamental parts of your test methods.\n * This is exactly how we write our tests and we warmly encourage you to do so!\n * \u003cp\u003e\n * Start learning about BDD here: \u003ca href\u003d\"http://en.wikipedia.org/wiki/Behavior_Driven_Development\"\u003ehttp://en.wikipedia.org/wiki/Behavior_Driven_Development\u003c/a\u003e\n * \u003cp\u003e\n * The problem is that current stubbing api with canonical role of \u003cb\u003ewhen\u003c/b\u003e word does not integrate nicely with \u003cb\u003e//given //when //then\u003c/b\u003e comments.\n * It\u0027s because stubbing belongs to \u003cb\u003egiven\u003c/b\u003e component of the test and not to the \u003cb\u003ewhen\u003c/b\u003e component of the test.\n * Hence {@link BDDMockito} class introduces an alias so that you stub method calls with {@link BDDMockito#given(Object)} method.\n * Now it really nicely integrates with the \u003cb\u003egiven\u003c/b\u003e component of a BDD style test!\n * \u003cp\u003e\n * Here is how the test might look like:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * import static org.mockito.BDDMockito.*;\n *\n * Seller seller \u003d mock(Seller.class);\n * Shop shop \u003d new Shop(seller);\n *\n * public void shouldBuyBread() throws Exception {\n *   //given\n *   given(seller.askForBread()).willReturn(new Bread());\n *\n *   //when\n *   Goods goods \u003d shop.buyBread();\n *\n *   //then\n *   assertThat(goods, containBread());\n * }\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * Stubbing voids with throwables:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //given\n *   willThrow(new RuntimeException(\"boo\")).given(mock).foo();\n *\n *   //when\n *   Result result \u003d systemUnderTest.perform();\n *\n *   //then\n *   assertEquals(failure, result);\n * \u003c/code\u003e\u003c/pre\u003e\n * \u003cp\u003e\n * For BDD style mock verification take a look at {@link Then} in action:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   person.ride(bike);\n *   person.ride(bike);\n *\n *   then(person).should(times(2)).ride(bike);\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * One of the purposes of BDDMockito is also to show how to tailor the mocking syntax to a different programming style.\n *\n * @since 1.8.0\n "
    },
    {
      "type": "class_interface",
      "name": "BDDMyOngoingStubbing",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 122,
      "comment": "\n     * See original {@link OngoingStubbing}\n     * @since 1.8.0\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n         * See original {@link OngoingStubbing#thenAnswer(Answer)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.will(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n         * See original {@link OngoingStubbing#then(Answer)}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willReturn(T)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n         * See original {@link OngoingStubbing#thenReturn(Object)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willReturn(T, T...)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n         * See original {@link OngoingStubbing#thenReturn(Object, Object[])}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willThrow(java.lang.Throwable...)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n         * See original {@link OngoingStubbing#thenThrow(Throwable...)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e...)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n         * See original {@link OngoingStubbing#thenThrow(Class[])}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willCallRealMethod()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n         * See original {@link OngoingStubbing#thenCallRealMethod()}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.getMock()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n         * See original {@link OngoingStubbing#getMock()}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "BDDOngoingStubbingImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.BDDMockito.BDDMyOngoingStubbing\u003cT\u003e"
      ],
      "begin_line": 127,
      "end_line": 184,
      "comment": "\n     * @deprecated not part of the public API, use {@link BDDMyOngoingStubbing} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mockitoOngoingStubbing"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.BDDOngoingStubbingImpl(org.mockito.stubbing.OngoingStubbing\u003cT\u003e)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 139,
      "end_line": 141,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#willAnswer(Answer)\n         ",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.will(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 146,
      "end_line": 148,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#will(Answer)\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willReturn(T)",
      "begin_line": 153,
      "end_line": 155,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#willReturn(java.lang.Object)\n         ",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willReturn(T, T...)",
      "begin_line": 160,
      "end_line": 162,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#willReturn(java.lang.Object, T[])\n         ",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willThrow(java.lang.Throwable...)",
      "begin_line": 167,
      "end_line": 169,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#willThrow(java.lang.Throwable[])\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e...)",
      "begin_line": 173,
      "end_line": 175,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDMyOngoingStubbing#willThrow(java.lang.Class[])\n         ",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willCallRealMethod()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.getMock()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.given(T)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * see original {@link Mockito#when(Object)}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.then(T)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Bdd style verification of mock behavior.\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   person.ride(bike);\n     *   person.ride(bike);\n     *\n     *   then(person).should(times(2)).ride(bike);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @see #verify(Object)\n     * @see #verify(Object, VerificationMode)\n     * @since 1.10.0\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Then",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 219,
      "end_line": 232,
      "comment": "\n     * Provides fluent way of mock verification.\n     *\n     * @param \u003cT\u003e type of the mock\n     *\n     * @since 1.10.5\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.Then.should()",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n         * @see #verify(Object)\n         * @since 1.10.5\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.Then.should(org.mockito.verification.VerificationMode)",
      "begin_line": 231,
      "end_line": 231,
      "comment": "\n         * @see #verify(Object, VerificationMode)\n         * @since 1.10.5\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ThenImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.BDDMockito.Then\u003cT\u003e"
      ],
      "begin_line": 234,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.BDDMockito.ThenImpl.ThenImpl(T)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.ThenImpl.should()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n         * @see #verify(Object)\n         * @since 1.10.5\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.ThenImpl.should(org.mockito.verification.VerificationMode)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n         * @see #verify(Object, VerificationMode)\n         * @since 1.10.5\n         ",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BDDStubber",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 263,
      "end_line": 305,
      "comment": "\n     * See original {@link Stubber}\n     * @since 1.8.0\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 268,
      "end_line": 268,
      "comment": "\n         * See original {@link Stubber#doAnswer(Answer)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willNothing()",
      "begin_line": 274,
      "end_line": 274,
      "comment": "\n         * See original {@link Stubber#doNothing()}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willReturn(java.lang.Object)",
      "begin_line": 280,
      "end_line": 280,
      "comment": "\n         * See original {@link Stubber#doReturn(Object)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willThrow(java.lang.Throwable)",
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n         * See original {@link Stubber#doThrow(Throwable)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e)",
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n         * See original {@link Stubber#doThrow(Class)}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willCallRealMethod()",
      "begin_line": 298,
      "end_line": 298,
      "comment": "\n         * See original {@link Stubber#doCallRealMethod()}\n         * @since 1.9.0\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.given(T)",
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n         * See original {@link Stubber#when(Object)}\n         * @since 1.8.0\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "BDDStubberImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.BDDMockito.BDDStubber"
      ],
      "begin_line": 310,
      "end_line": 367,
      "comment": "\n     * @deprecated not part of the public API, use {@link BDDStubber} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mockitoStubber"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.BDDStubberImpl(org.mockito.stubbing.Stubber)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 13)-(line 316,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.given(T)",
      "begin_line": 322,
      "end_line": 324,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#given(java.lang.Object)\n         ",
      "child_ranges": [
        "(line 323,col 13)-(line 323,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 329,
      "end_line": 331,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willAnswer(Answer)\n         ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willNothing()",
      "begin_line": 336,
      "end_line": 338,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willNothing()\n         ",
      "child_ranges": [
        "(line 337,col 13)-(line 337,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willReturn(java.lang.Object)",
      "begin_line": 343,
      "end_line": 345,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willReturn(java.lang.Object)\n         ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willThrow(java.lang.Throwable)",
      "begin_line": 350,
      "end_line": 352,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willThrow(java.lang.Throwable)\n         ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e)",
      "begin_line": 357,
      "end_line": 359,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willThrow(Class)\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willCallRealMethod()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " (non-Javadoc)\n         * @see BDDMockito.BDDStubber#willCallRealMethod()\n         ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willThrow(java.lang.Throwable)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * see original {@link Mockito#doThrow(Throwable)}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willThrow(java.lang.Class\u003c? extends java.lang.Throwable\u003e)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * see original {@link Mockito#doThrow(Throwable)}\n     * @since 1.9.0\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * see original {@link Mockito#doAnswer(Answer)}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willDoNothing()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * see original {@link Mockito#doNothing()}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willReturn(java.lang.Object)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * see original {@link Mockito#doReturn(Object)}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willCallRealMethod()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * see original {@link Mockito#doCallRealMethod()}\n     * @since 1.8.0\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 62)"
      ]
    }
  ]
}