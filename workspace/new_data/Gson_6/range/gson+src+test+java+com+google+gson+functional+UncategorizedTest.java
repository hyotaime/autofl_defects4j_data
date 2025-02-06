{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/UncategorizedTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UncategorizedTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 134,
      "comment": "\n * Functional tests that do not fall neatly into any of the existing classification.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.setUp()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 18)",
        "(line 47,col 5)-(line 47,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testInvalidJsonDeserializationFails()",
      "begin_line": 50,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 54,col 45)",
        "(line 56,col 5)-(line 59,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testObjectEqualButNotSameSerialization()",
      "begin_line": 62,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 61)",
        "(line 64,col 5)-(line 64,col 61)",
        "(line 65,col 5)-(line 65,col 20)",
        "(line 66,col 5)-(line 66,col 36)",
        "(line 67,col 5)-(line 67,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testStaticFieldsAreNotSerialized()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 51)",
        "(line 72,col 5)-(line 72,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testGsonInstanceReusableForSerializationAndDeserialization()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 48)",
        "(line 77,col 5)-(line 77,col 35)",
        "(line 78,col 5)-(line 78,col 78)",
        "(line 79,col 5)-(line 79,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testReturningDerivedClassesDuringDeserialization()",
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n   * This test ensures that a custom deserializer is able to return a derived class instance for a\n   * base class object. For a motivation for this test, see Issue 37 and\n   * http://groups.google.com/group/google-gson/browse_thread/thread/677d56e9976d7761\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 98)",
        "(line 89,col 5)-(line 89,col 41)",
        "(line 90,col 5)-(line 90,col 48)",
        "(line 91,col 5)-(line 91,col 41)",
        "(line 92,col 5)-(line 92,col 49)",
        "(line 94,col 5)-(line 94,col 34)",
        "(line 95,col 5)-(line 95,col 43)",
        "(line 96,col 5)-(line 96,col 41)",
        "(line 97,col 5)-(line 97,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.testTrailingWhitespace()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n   * Test that trailing whitespace is ignored.\n   * http://code.google.com/p/google-gson/issues/detail?id\u003d302\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 106,col 53)",
        "(line 107,col 5)-(line 107,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "opType"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Derived1",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.UncategorizedTest.Base"
      ],
      "begin_line": 114,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.UncategorizedTest.Derived1.Derived1()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 115,col 18)-(line 115,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Derived2",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.UncategorizedTest.Base"
      ],
      "begin_line": 117,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.UncategorizedTest.Derived2.Derived2()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 118,col 18)-(line 118,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BaseTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.UncategorizedTest.Base\u003e"
      ],
      "begin_line": 120,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.UncategorizedTest.BaseTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 121,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 76)",
        "(line 124,col 7)-(line 124,col 62)",
        "(line 125,col 7)-(line 130,col 7)",
        "(line 131,col 7)-(line 131,col 60)"
      ]
    }
  ]
}