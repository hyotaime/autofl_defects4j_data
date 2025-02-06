{
  "filepath": "/tmp/Mockito-38b/test/org/mockito/internal/InvalidStateDetectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidStateDetectionTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 39,
      "end_line": 284,
      "comment": "\n * invalid state happens if:\n * \n *    -unfinished stubbing\n *    -unfinished stubVoid\n *    -unfinished doReturn()\n *    -stubbing without actual method call\n *    -verify without actual method call\n *    \n * we should aim to detect invalid state in following scenarios:\n * \n *    -on method call on mock\n *    -on verify\n *    -on verifyZeroInteractions\n *    -on verifyNoMoreInteractions\n *    -on verify in order\n *    -on stub\n *    -on stubVoid\n "
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.resetState()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedStubbing()",
      "begin_line": 49,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)",
        "(line 52,col 9)-(line 52,col 88)",
        "(line 54,col 9)-(line 54,col 34)",
        "(line 55,col 9)-(line 55,col 76)",
        "(line 57,col 9)-(line 57,col 34)",
        "(line 58,col 9)-(line 58,col 80)",
        "(line 60,col 9)-(line 60,col 34)",
        "(line 61,col 9)-(line 61,col 78)",
        "(line 63,col 9)-(line 63,col 34)",
        "(line 64,col 9)-(line 64,col 85)",
        "(line 66,col 9)-(line 66,col 34)",
        "(line 67,col 9)-(line 67,col 94)",
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 96)",
        "(line 72,col 9)-(line 72,col 34)",
        "(line 73,col 9)-(line 73,col 80)",
        "(line 75,col 9)-(line 75,col 34)",
        "(line 76,col 9)-(line 76,col 84)",
        "(line 78,col 9)-(line 78,col 34)",
        "(line 79,col 9)-(line 79,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedStubbingVoid()",
      "begin_line": 82,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 85,col 88)",
        "(line 87,col 9)-(line 87,col 23)",
        "(line 88,col 9)-(line 88,col 76)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 80)",
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 94,col 78)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 85)",
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 94)",
        "(line 102,col 9)-(line 102,col 23)",
        "(line 103,col 9)-(line 103,col 96)",
        "(line 105,col 9)-(line 105,col 23)",
        "(line 106,col 9)-(line 106,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedDoAnswerStubbing()",
      "begin_line": 109,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 23)",
        "(line 112,col 9)-(line 112,col 88)",
        "(line 114,col 9)-(line 114,col 23)",
        "(line 115,col 9)-(line 115,col 76)",
        "(line 117,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 118,col 80)",
        "(line 120,col 9)-(line 120,col 23)",
        "(line 121,col 9)-(line 121,col 78)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 124,col 85)",
        "(line 126,col 9)-(line 126,col 23)",
        "(line 127,col 9)-(line 127,col 94)",
        "(line 129,col 9)-(line 129,col 23)",
        "(line 130,col 9)-(line 130,col 96)",
        "(line 132,col 9)-(line 132,col 23)",
        "(line 133,col 9)-(line 133,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedVerification()",
      "begin_line": 136,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)",
        "(line 139,col 9)-(line 139,col 80)",
        "(line 141,col 9)-(line 141,col 21)",
        "(line 142,col 9)-(line 142,col 84)",
        "(line 144,col 9)-(line 144,col 21)",
        "(line 145,col 9)-(line 145,col 82)",
        "(line 147,col 9)-(line 147,col 21)",
        "(line 148,col 9)-(line 148,col 89)",
        "(line 150,col 9)-(line 150,col 21)",
        "(line 151,col 9)-(line 151,col 98)",
        "(line 153,col 9)-(line 153,col 21)",
        "(line 154,col 9)-(line 154,col 100)",
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 157,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectMisplacedArgumentMatcher()",
      "begin_line": 160,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 20)",
        "(line 163,col 9)-(line 163,col 82)",
        "(line 165,col 9)-(line 165,col 20)",
        "(line 166,col 9)-(line 166,col 80)",
        "(line 168,col 9)-(line 168,col 20)",
        "(line 169,col 9)-(line 169,col 87)",
        "(line 171,col 9)-(line 171,col 20)",
        "(line 172,col 9)-(line 172,col 96)",
        "(line 174,col 9)-(line 174,col 20)",
        "(line 175,col 9)-(line 175,col 98)",
        "(line 177,col 9)-(line 177,col 20)",
        "(line 178,col 9)-(line 178,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldCorrectStateAfterDetectingUnfinishedStubbing()",
      "begin_line": 181,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 55)",
        "(line 185,col 9)-(line 188,col 50)",
        "(line 190,col 9)-(line 190,col 73)",
        "(line 191,col 9)-(line 194,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldCorrectStateAfterDetectingUnfinishedVerification()",
      "begin_line": 197,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 28)",
        "(line 200,col 9)-(line 200,col 21)",
        "(line 202,col 9)-(line 205,col 54)",
        "(line 207,col 9)-(line 207,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DetectsInvalidState",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 210,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 211,
      "end_line": 211,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "OnVerify",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 214,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyInOrder",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 220,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyZeroInteractions",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 226,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyNoMoreInteractions",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 232,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnDoAnswer",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 238,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 244,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnStubVoid",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 250,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnMethodCallOnMock",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 256,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnMockCreation",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 262,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnSpyCreation",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 268,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.detectsAndCleansUp(org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState, java.lang.Class)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 37)"
      ]
    }
  ]
}