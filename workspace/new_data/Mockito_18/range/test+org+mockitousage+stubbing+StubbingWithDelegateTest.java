{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/stubbing/StubbingWithDelegateTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StubbingWithDelegateTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FakeList",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeList.get(int)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 13)-(line 28,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeList.set(int, T)",
      "begin_line": 31,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 13)-(line 32,col 31)",
        "(line 33,col 13)-(line 33,col 31)",
        "(line 34,col 13)-(line 34,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeList.size()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeList.subList(int, int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FakeListWithWrongMethods",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeListWithWrongMethods.size()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.FakeListWithWrongMethods.subList(int, int)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.when_not_stubbed_delegate_should_be_called()",
      "begin_line": 56,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 61)",
        "(line 59,col 9)-(line 59,col 32)",
        "(line 61,col 9)-(line 61,col 73)",
        "(line 63,col 9)-(line 63,col 24)",
        "(line 65,col 9)-(line 65,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.when_stubbed_the_delegate_should_not_be_called()",
      "begin_line": 68,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 61)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 72,col 73)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 76,col 9)-(line 76,col 24)",
        "(line 78,col 9)-(line 78,col 38)",
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.delegate_should_not_be_called_when_stubbed2()",
      "begin_line": 82,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 61)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 86,col 9)-(line 86,col 79)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 90,col 9)-(line 90,col 30)",
        "(line 92,col 9)-(line 92,col 43)",
        "(line 93,col 9)-(line 93,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.null_wrapper_dont_throw_exception_from_org_mockito_package()",
      "begin_line": 96,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 80)",
        "(line 100,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.instance_of_different_class_can_be_called()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 82)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.method_with_subtype_return_can_be_called()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 82)",
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.calling_missing_method_should_throw_exception()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 82)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.calling_method_with_wrong_primitive_return_should_throw_exception()",
      "begin_line": 136,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 98)",
        "(line 140,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.calling_method_with_wrong_reference_return_should_throw_exception()",
      "begin_line": 148,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 98)",
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.stubbing.StubbingWithDelegateTest.exception_should_be_propagated_from_delegate()",
      "begin_line": 160,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 78)",
        "(line 163,col 9)-(line 168,col 12)",
        "(line 170,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "simpleMethod()",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Corresponding declaration not available for unsolved symbol.\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 17)-(line 166,col 30)"
      ]
    }
  ]
}