{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/stubbing/SmartNullsStubbingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmartNullsStubbingTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 18,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.setup()",
      "begin_line": 22,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "unstubbedMethodInvokedHere(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldSmartNPEPointToUnstubbedCall()",
      "begin_line": 31,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 60)",
        "(line 34,col 9)-(line 39,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bar",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Bar.boo()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Foo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.getSomeClass()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.getSomeInterface()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.getBarWithParams(int, java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.boo()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldThrowSmartNPEWhenMethodReturnsClass()",
      "begin_line": 62,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 38)",
        "(line 66,col 9)-(line 69,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldThrowSmartNPEWhenMethodReturnsInterface()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 56)",
        "(line 75,col 9)-(line 75,col 42)",
        "(line 76,col 9)-(line 79,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldReturnOrdinaryEmptyValuesForOrdinaryTypes()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 66)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 51)",
        "(line 89,col 9)-(line 89,col 65)",
        "(line 90,col 9)-(line 90,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldNotThrowSmartNullPointerOnToString()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 99,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldNotThrowSmartNullPointerOnObjectMethods()",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldShowParameters()",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 55)",
        "(line 111,col 9)-(line 111,col 60)",
        "(line 113,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldShowParametersWhenParamsAreHuge()",
      "begin_line": 121,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 55)",
        "(line 124,col 9)-(line 124,col 602)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    }
  ]
}