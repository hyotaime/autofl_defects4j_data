{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/InvalidStateDetectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvalidStateDetectionTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 40,
      "end_line": 279,
      "comment": "\n * invalid state happens if:\n * \n *    -unfinished stubbing\n *    -unfinished stubVoid\n *    -unfinished doReturn()\n *    -stubbing without actual method call\n *    -verify without actual method call\n *    \n * we should aim to detect invalid state in following scenarios:\n * \n *    -on method call on mock\n *    -on verify\n *    -on verifyZeroInteractions\n *    -on verifyNoMoreInteractions\n *    -on verify in order\n *    -on stub\n *    -on stubVoid\n "
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.resetState()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedStubbing()",
      "begin_line": 50,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)",
        "(line 53,col 9)-(line 53,col 88)",
        "(line 55,col 9)-(line 55,col 34)",
        "(line 56,col 9)-(line 56,col 76)",
        "(line 58,col 9)-(line 58,col 34)",
        "(line 59,col 9)-(line 59,col 80)",
        "(line 61,col 9)-(line 61,col 34)",
        "(line 62,col 9)-(line 62,col 78)",
        "(line 64,col 9)-(line 64,col 34)",
        "(line 65,col 9)-(line 65,col 85)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 94)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 96)",
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedStubbingVoid()",
      "begin_line": 77,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 80,col 88)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 76)",
        "(line 85,col 9)-(line 85,col 23)",
        "(line 86,col 9)-(line 86,col 80)",
        "(line 88,col 9)-(line 88,col 23)",
        "(line 89,col 9)-(line 89,col 78)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 85)",
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 94)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 96)",
        "(line 100,col 9)-(line 100,col 23)",
        "(line 101,col 9)-(line 101,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedDoAnswerStubbing()",
      "begin_line": 104,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 23)",
        "(line 107,col 9)-(line 107,col 88)",
        "(line 109,col 9)-(line 109,col 23)",
        "(line 110,col 9)-(line 110,col 76)",
        "(line 112,col 9)-(line 112,col 23)",
        "(line 113,col 9)-(line 113,col 80)",
        "(line 115,col 9)-(line 115,col 23)",
        "(line 116,col 9)-(line 116,col 78)",
        "(line 118,col 9)-(line 118,col 23)",
        "(line 119,col 9)-(line 119,col 85)",
        "(line 121,col 9)-(line 121,col 23)",
        "(line 122,col 9)-(line 122,col 94)",
        "(line 124,col 9)-(line 124,col 23)",
        "(line 125,col 9)-(line 125,col 96)",
        "(line 127,col 9)-(line 127,col 23)",
        "(line 128,col 9)-(line 128,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectUnfinishedVerification()",
      "begin_line": 131,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 134,col 80)",
        "(line 136,col 9)-(line 136,col 21)",
        "(line 137,col 9)-(line 137,col 84)",
        "(line 139,col 9)-(line 139,col 21)",
        "(line 140,col 9)-(line 140,col 82)",
        "(line 142,col 9)-(line 142,col 21)",
        "(line 143,col 9)-(line 143,col 89)",
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 146,col 98)",
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 149,col 100)",
        "(line 151,col 9)-(line 151,col 21)",
        "(line 152,col 9)-(line 152,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldDetectMisplacedArgumentMatcher()",
      "begin_line": 155,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 20)",
        "(line 158,col 9)-(line 158,col 82)",
        "(line 160,col 9)-(line 160,col 20)",
        "(line 161,col 9)-(line 161,col 80)",
        "(line 163,col 9)-(line 163,col 20)",
        "(line 164,col 9)-(line 164,col 87)",
        "(line 166,col 9)-(line 166,col 20)",
        "(line 167,col 9)-(line 167,col 96)",
        "(line 169,col 9)-(line 169,col 20)",
        "(line 170,col 9)-(line 170,col 98)",
        "(line 172,col 9)-(line 172,col 20)",
        "(line 173,col 9)-(line 173,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldCorrectStateAfterDetectingUnfinishedStubbing()",
      "begin_line": 176,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 55)",
        "(line 180,col 9)-(line 183,col 50)",
        "(line 185,col 9)-(line 185,col 73)",
        "(line 186,col 9)-(line 189,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.shouldCorrectStateAfterDetectingUnfinishedVerification()",
      "begin_line": 192,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 28)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 197,col 9)-(line 200,col 54)",
        "(line 202,col 9)-(line 202,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DetectsInvalidState",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 205,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 206,
      "end_line": 206,
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
      "begin_line": 209,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyInOrder",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 215,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyZeroInteractions",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 221,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnVerifyNoMoreInteractions",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 227,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnDoAnswer",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 233,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnStub",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 239,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnStubVoid",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 245,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnMethodCallOnMock",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 251,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 252,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnMockCreation",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 257,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 258,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OnSpyCreation",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState"
      ],
      "begin_line": 263,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "detect(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.InvalidStateDetectionTest.detectsAndCleansUp(org.mockito.internal.InvalidStateDetectionTest.DetectsInvalidState, java.lang.Class)",
      "begin_line": 269,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 37)"
      ]
    }
  ]
}