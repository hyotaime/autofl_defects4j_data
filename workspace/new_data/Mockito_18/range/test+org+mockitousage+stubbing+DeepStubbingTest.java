{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/stubbing/DeepStubbingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeepStubbingTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 32,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "address"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Person.getAddress()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Person.getAddress(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Person.getFinalClass()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Address",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "street"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Address.getStreet()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Address.getStreet(java.util.Locale)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Street",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Street.getName()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.Street.getLongName()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FinalClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.myTest()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 73)",
        "(line 79,col 9)-(line 79,col 68)",
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.simpleCase()",
      "begin_line": 83,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 55)",
        "(line 86,col 9)-(line 86,col 43)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.oneLevelDeep()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * Test that deep stubbing works for one intermediate level\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 55)",
        "(line 99,col 9)-(line 99,col 84)",
        "(line 100,col 9)-(line 100,col 77)",
        "(line 102,col 9)-(line 102,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.interactions()",
      "begin_line": 108,
      "end_line": 121,
      "comment": "\n     * Test that stubbing of two mocks stubs don\u0027t interfere\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 56)",
        "(line 111,col 9)-(line 111,col 56)",
        "(line 113,col 9)-(line 113,col 74)",
        "(line 114,col 9)-(line 114,col 68)",
        "(line 116,col 9)-(line 116,col 74)",
        "(line 117,col 9)-(line 117,col 68)",
        "(line 119,col 9)-(line 119,col 63)",
        "(line 120,col 9)-(line 120,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.withArguments()",
      "begin_line": 126,
      "end_line": 140,
      "comment": "\n     * Test that stubbing of methods of different arguments don\u0027t interfere\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 56)",
        "(line 130,col 9)-(line 130,col 56)",
        "(line 132,col 9)-(line 132,col 73)",
        "(line 133,col 9)-(line 133,col 67)",
        "(line 134,col 9)-(line 134,col 83)",
        "(line 135,col 9)-(line 135,col 90)",
        "(line 137,col 9)-(line 137,col 62)",
        "(line 138,col 9)-(line 138,col 78)",
        "(line 139,col 9)-(line 139,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.withAnyPatternArguments()",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * Test that deep stubbing work with argument patterns\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 55)",
        "(line 150,col 9)-(line 150,col 73)",
        "(line 151,col 9)-(line 151,col 87)",
        "(line 153,col 9)-(line 153,col 77)",
        "(line 154,col 9)-(line 154,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.withComplexPatternArguments()",
      "begin_line": 160,
      "end_line": 173,
      "comment": "\n     * Test that deep stubbing work with argument patterns\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 56)",
        "(line 163,col 9)-(line 163,col 56)",
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 166,col 86)",
        "(line 167,col 9)-(line 167,col 88)",
        "(line 169,col 9)-(line 169,col 87)",
        "(line 170,col 9)-(line 170,col 78)",
        "(line 171,col 9)-(line 171,col 80)",
        "(line 172,col 9)-(line 172,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.withSimplePrimitive()",
      "begin_line": 178,
      "end_line": 186,
      "comment": "\n     * Test that deep stubbing work with primitive expected values\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 19)",
        "(line 182,col 9)-(line 182,col 73)",
        "(line 183,col 9)-(line 183,col 56)",
        "(line 185,col 9)-(line 185,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.withPatternPrimitive()",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\n     * Test that deep stubbing work with primitive expected values with\n     * pattern method arguments\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 35)",
        "(line 196,col 9)-(line 196,col 73)",
        "(line 197,col 9)-(line 197,col 87)",
        "(line 198,col 9)-(line 198,col 82)",
        "(line 199,col 9)-(line 199,col 89)",
        "(line 201,col 9)-(line 201,col 69)",
        "(line 202,col 9)-(line 202,col 78)",
        "(line 203,col 9)-(line 203,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "person"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.shouldStubbingBasicallyWorkFine()",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 83)",
        "(line 214,col 9)-(line 214,col 66)",
        "(line 217,col 9)-(line 217,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.shouldVerificationBasicallyWorkFine()",
      "begin_line": 220,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 50)",
        "(line 226,col 9)-(line 226,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.verification_work_with_argument_Matchers_in_nested_calls()",
      "begin_line": 229,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 55)",
        "(line 233,col 9)-(line 233,col 79)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 237,col 9)-(line 237,col 92)",
        "(line 238,col 9)-(line 238,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.deep_stub_return_same_mock_instance_if_invocation_matchers_matches()",
      "begin_line": 241,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 86)",
        "(line 245,col 9)-(line 245,col 61)",
        "(line 247,col 9)-(line 247,col 107)",
        "(line 248,col 9)-(line 248,col 107)",
        "(line 249,col 9)-(line 249,col 107)",
        "(line 250,col 9)-(line 250,col 107)",
        "(line 251,col 9)-(line 251,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.times_never_atLeast_atMost_verificationModes_should_work()",
      "begin_line": 254,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 86)",
        "(line 258,col 9)-(line 258,col 61)",
        "(line 259,col 9)-(line 259,col 61)",
        "(line 260,col 9)-(line 260,col 61)",
        "(line 261,col 9)-(line 261,col 75)",
        "(line 263,col 9)-(line 263,col 79)",
        "(line 264,col 9)-(line 264,col 92)",
        "(line 265,col 9)-(line 265,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.inOrder_only_work_on_the_very_last_mock_but_it_works()",
      "begin_line": 269,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 86)",
        "(line 272,col 9)-(line 272,col 100)",
        "(line 273,col 9)-(line 273,col 100)",
        "(line 275,col 9)-(line 275,col 61)",
        "(line 276,col 9)-(line 276,col 65)",
        "(line 277,col 9)-(line 277,col 75)",
        "(line 278,col 9)-(line 278,col 75)",
        "(line 280,col 9)-(line 284,col 10)",
        "(line 285,col 9)-(line 285,col 87)",
        "(line 286,col 9)-(line 286,col 81)",
        "(line 287,col 9)-(line 287,col 103)",
        "(line 288,col 9)-(line 288,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.verificationMode_only_work_on_the_last_returned_mock()",
      "begin_line": 291,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 86)",
        "(line 297,col 9)-(line 297,col 61)",
        "(line 300,col 9)-(line 300,col 69)",
        "(line 302,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.DeepStubbingTest.shouldFailGracefullyWhenClassIsFinal()",
      "begin_line": 312,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 44)",
        "(line 316,col 9)-(line 316,col 56)",
        "(line 319,col 9)-(line 319,col 52)"
      ]
    }
  ]
}