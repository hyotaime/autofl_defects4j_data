{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/MoreSpecificTypeSerializationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MoreSpecificTypeSerializationTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 178,
      "comment": "\n * Tests for Gson serialization of a sub-class object while encountering a base-class type\n *\n * @author Inderjeet Singh\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.setUp()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 18)",
        "(line 41,col 5)-(line 41,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testSubclassFields()",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 72)",
        "(line 46,col 5)-(line 46,col 38)",
        "(line 47,col 5)-(line 47,col 41)",
        "(line 48,col 5)-(line 48,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfSubclassFields()",
      "begin_line": 51,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 50)",
        "(line 53,col 5)-(line 53,col 26)",
        "(line 54,col 5)-(line 54,col 28)",
        "(line 55,col 5)-(line 55,col 93)",
        "(line 56,col 5)-(line 56,col 38)",
        "(line 57,col 5)-(line 57,col 49)",
        "(line 58,col 5)-(line 58,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfSubclassFields()",
      "begin_line": 61,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 56)",
        "(line 63,col 5)-(line 63,col 33)",
        "(line 64,col 5)-(line 64,col 34)",
        "(line 65,col 5)-(line 65,col 92)",
        "(line 66,col 5)-(line 66,col 93)",
        "(line 67,col 5)-(line 67,col 76)",
        "(line 68,col 5)-(line 68,col 55)",
        "(line 69,col 5)-(line 69,col 45)",
        "(line 70,col 5)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testParameterizedSubclassFields()",
      "begin_line": 76,
      "end_line": 82,
      "comment": "\n   * For parameterized type, Gson ignores the more-specific type and sticks to the declared type\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 78,col 52)",
        "(line 79,col 5)-(line 79,col 38)",
        "(line 80,col 5)-(line 80,col 47)",
        "(line 81,col 5)-(line 81,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testListOfParameterizedSubclassFields()",
      "begin_line": 88,
      "end_line": 97,
      "comment": "\n   * For parameterized type in a List, Gson ignores the more-specific type and sticks to\n   * the declared type\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 92)",
        "(line 90,col 5)-(line 90,col 51)",
        "(line 91,col 5)-(line 91,col 59)",
        "(line 92,col 5)-(line 93,col 67)",
        "(line 94,col 5)-(line 94,col 38)",
        "(line 95,col 5)-(line 95,col 55)",
        "(line 96,col 5)-(line 96,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.testMapOfParameterizedSubclassFields()",
      "begin_line": 103,
      "end_line": 114,
      "comment": "\n   * For parameterized type in a map, Gson ignores the more-specific type and sticks to the\n   * declared type\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 98)",
        "(line 105,col 5)-(line 105,col 58)",
        "(line 106,col 5)-(line 106,col 65)",
        "(line 107,col 5)-(line 108,col 66)",
        "(line 109,col 5)-(line 109,col 93)",
        "(line 110,col 5)-(line 110,col 83)",
        "(line 111,col 5)-(line 111,col 55)",
        "(line 112,col 5)-(line 112,col 52)",
        "(line 113,col 5)-(line 113,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 116,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.Base.Base(int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.MoreSpecificTypeSerializationTest.Base"
      ],
      "begin_line": 123,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.Sub.Sub(int, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 15)",
        "(line 127,col 7)-(line 127,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBaseFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 131,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ClassWithBaseFields.ClassWithBaseFields(com.google.gson.functional.MoreSpecificTypeSerializationTest.Base)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithContainersOfBaseFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 138,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ClassWithContainersOfBaseFields.ClassWithContainersOfBaseFields(java.util.Collection\u003ccom.google.gson.functional.MoreSpecificTypeSerializationTest.Base\u003e, java.util.Map\u003cjava.lang.String, com.google.gson.functional.MoreSpecificTypeSerializationTest.Base\u003e)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 35)",
        "(line 143,col 7)-(line 143,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterizedBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 147,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedBase.ParameterizedBase(T)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ParameterizedSub",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedBase\u003cT\u003e"
      ],
      "begin_line": 154,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedSub.ParameterizedSub(T, T)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 15)",
        "(line 158,col 7)-(line 158,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithParameterizedBaseFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 162,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ClassWithParameterizedBaseFields.ClassWithParameterizedBaseFields(com.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedBase\u003cjava.lang.String\u003e)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithContainersOfParameterizedBaseFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 169,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.MoreSpecificTypeSerializationTest.ClassWithContainersOfParameterizedBaseFields.ClassWithContainersOfParameterizedBaseFields(java.util.Collection\u003ccom.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedBase\u003cjava.lang.String\u003e\u003e, java.util.Map\u003cjava.lang.String, com.google.gson.functional.MoreSpecificTypeSerializationTest.ParameterizedBase\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 174,col 35)",
        "(line 175,col 7)-(line 175,col 21)"
      ]
    }
  ]
}