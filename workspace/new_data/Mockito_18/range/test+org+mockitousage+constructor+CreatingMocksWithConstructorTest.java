{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/constructor/CreatingMocksWithConstructorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CreatingMocksWithConstructorTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 15,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AbstractMessage",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "message"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractMessage.AbstractMessage()",
      "begin_line": 19,
      "end_line": 21,
      "comment": "",
      "child_ranges": [
        "(line 20,col 13)-(line 20,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractMessage.getMessage()",
      "begin_line": 22,
      "end_line": 24,
      "comment": "",
      "child_ranges": [
        "(line 23,col 13)-(line 23,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Message",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractMessage"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InnerClass",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractMessage"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.can_create_mock_with_constructor()",
      "begin_line": 30,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 110)",
        "(line 34,col 9)-(line 34,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.can_mock_abstract_classes()",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 126)",
        "(line 40,col 9)-(line 40,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.can_spy_abstract_classes()",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 58)",
        "(line 46,col 9)-(line 46,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.can_mock_inner_classes()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 136)",
        "(line 52,col 9)-(line 52,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HasConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.HasConstructor.HasConstructor(java.lang.String)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.exception_message_when_constructor_not_found()",
      "begin_line": 59,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.mocking_inner_classes_with_wrong_outer_instance()",
      "begin_line": 72,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.mocking_interfaces_with_constructor()",
      "begin_line": 85,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.prevents_across_jvm_serialization_with_constructor()",
      "begin_line": 93,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractThing",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 105,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractThing.name()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.AbstractThing.fullName()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.abstract_method_returns_default()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 55)",
        "(line 115,col 9)-(line 115,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.abstract_method_stubbed()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 55)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.constructor.CreatingMocksWithConstructorTest.calls_real_interface_method()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 87)",
        "(line 128,col 9)-(line 128,col 32)"
      ]
    }
  ]
}