{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/BDDMockito.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BDDMockito",
      "is_interface": false,
      "parent_types": [
        "org.mockito.Mockito"
      ],
      "begin_line": 43,
      "end_line": 234,
      "comment": "\r\n * Behavior Driven Development style of stubbing that integrates nicely with //given //when //then comments.\r\n * Start learning about BDD here: \u003clink href\u003d\"http://en.wikipedia.org/wiki/Behavior_Driven_Development\"\u003ehttp://en.wikipedia.org/wiki/Behavior_Driven_Development\u003c/link\u003e\r\n * \u003cp\u003e\r\n * The entire test can look like:  \r\n * \u003cpre\u003e\r\n * public void shouldBuyBread() throws Exception {\r\n *   //given\r\n *   given(seller.askForBread()).willReturn(new Bread());\r\n *   \r\n *   //when\r\n *   Goods goods \u003d shopping.shopForBread();\r\n *   \r\n *   //then\r\n *   assertThat(goods, containBread());\r\n * }  \r\n * \u003c/pre\u003e\r\n * \r\n * Stubbing voids with throwables:\r\n * \u003cpre\u003e\r\n *   //given\r\n *   willThrow(new RuntimeException(\"boo\")).given(mock).foo();\r\n *   \r\n *   //when\r\n *   Result result \u003d systemUnderTest.perform();\r\n *   \r\n *   //then\r\n *   assertEquals(failure, result);\r\n * \u003c/pre\u003e\r\n * \u003cp\u003e\r\n * BDDMockito also shows how you can adjust the mocking syntax if you feel like \r\n "
    },
    {
      "type": "class_interface",
      "name": "BDDMyOngoingStubbing",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 76,
      "comment": "\r\n     * See original {@link OngoingStubbing}\r\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\r\n         * See original {@link OngoingStubbing#thenAnswer(Answer)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willReturn(T)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\r\n         * See original {@link OngoingStubbing#thenReturn(Object)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willReturn(T, T...)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\r\n         * See original {@link OngoingStubbing#thenReturn(Object, Object...)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willThrow(java.lang.Throwable...)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n         * See original {@link OngoingStubbing#thenThrow(Throwable...)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDMyOngoingStubbing.willCallRealMethod()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\r\n         * See original {@link OngoingStubbing#thenCallRealMethod()}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "BDDOngoingStubbingImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.BDDMockito.BDDMyOngoingStubbing\u003cT\u003e"
      ],
      "begin_line": 78,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockitoOngoingStubbing"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.BDDOngoingStubbingImpl(org.mockito.stubbing.OngoingStubbing\u003cT\u003e)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willAnswer(org.mockito.stubbing.Answer\u003c?\u003e)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDMyOngoingStubbing#willAnswer(org.mockito.stubbing.Answer)\r\n         ",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willReturn(T)",
      "begin_line": 96,
      "end_line": 98,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDMyOngoingStubbing#willReturn(java.lang.Object)\r\n         ",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willReturn(T, T...)",
      "begin_line": 103,
      "end_line": 105,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDMyOngoingStubbing#willReturn(java.lang.Object, T[])\r\n         ",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willThrow(java.lang.Throwable...)",
      "begin_line": 110,
      "end_line": 112,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDMyOngoingStubbing#willThrow(java.lang.Throwable[])\r\n         ",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDOngoingStubbingImpl.willCallRealMethod()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.given(T)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * see original {@link Mockito#when(Object)}\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BDDStubber",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 129,
      "end_line": 154,
      "comment": "\r\n     * See original {@link Stubber}\r\n     "
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\r\n         * See original {@link Stubber#doAnswer(Answer)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willNothing()",
      "begin_line": 138,
      "end_line": 138,
      "comment": "\r\n         * See original {@link Stubber#doNothing()}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willReturn(java.lang.Object)",
      "begin_line": 143,
      "end_line": 143,
      "comment": "\r\n         * See original {@link Stubber#doReturn(Object)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.willThrow(java.lang.Throwable)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\r\n         * See original {@link Stubber#doThrow(Throwable)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubber.given(T)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\r\n         * See original {@link Stubber#when(Object)}\r\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "BDDStubberImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.BDDMockito.BDDStubber"
      ],
      "begin_line": 156,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockitoStubber"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.BDDStubberImpl(org.mockito.stubbing.Stubber)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.given(T)",
      "begin_line": 167,
      "end_line": 169,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDStubber#given(java.lang.Object)\r\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 174,
      "end_line": 176,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDStubber#willAnswer(org.mockito.stubbing.Answer)\r\n         ",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willNothing()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDStubber#willNothing()\r\n         ",
      "child_ranges": [
        "(line 182,col 13)-(line 182,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willReturn(java.lang.Object)",
      "begin_line": 188,
      "end_line": 190,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDStubber#willReturn(java.lang.Object)\r\n         ",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.BDDStubberImpl.willThrow(java.lang.Throwable)",
      "begin_line": 195,
      "end_line": 197,
      "comment": " (non-Javadoc)\r\n         * @see org.mockitousage.customization.BDDMockito.BDDStubber#willThrow(java.lang.Throwable)\r\n         ",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willThrow(java.lang.Throwable)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * see original {@link Mockito#doThrow(Throwable)}\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * see original {@link Mockito#doAnswer(Answer)}\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willDoNothing()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * see original {@link Mockito#doNothing()}\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willReturn(java.lang.Object)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * see original {@link Mockito#doReturn(Object)}\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.BDDMockito.willCallRealMethod()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * see original {@link Mockito#doCallRealMethod()}\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 62)"
      ]
    }
  ]
}