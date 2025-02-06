{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/stubbing/SmartNullsStubbingTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmartNullsStubbingTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 17,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.setup()",
      "begin_line": 21,
      "end_line": 24,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "unstubbedMethodInvokedHere(IMethods)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027IMethods\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 26,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldSmartNPEPointToUnstubbedCall()",
      "begin_line": 30,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 60)",
        "(line 33,col 9)-(line 38,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bar",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Bar.boo()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Foo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.getSomeClass()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.getSomeInterface()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.Foo.boo()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldThrowSmartNPEWhenMethodReturnsClass()",
      "begin_line": 57,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 56)",
        "(line 60,col 9)-(line 60,col 38)",
        "(line 61,col 9)-(line 64,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldThrowSmartNPEWhenMethodReturnsInterface()",
      "begin_line": 67,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 56)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldReturnOrdinaryEmptyValuesForOrdinaryTypes()",
      "begin_line": 78,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 66)",
        "(line 82,col 9)-(line 82,col 55)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 65)",
        "(line 85,col 9)-(line 85,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldNotThrowSmartNullPointerOnToString()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 56)",
        "(line 91,col 9)-(line 94,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.SmartNullsStubbingTest.shouldNotThrowSmartNullPointerOnObjectMethods()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 56)",
        "(line 100,col 9)-(line 100,col 29)"
      ]
    }
  ]
}