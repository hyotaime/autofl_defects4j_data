{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/EnumTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 202,
      "comment": "\n * Functional tests for Java 5.0 enums.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.setUp()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 18)",
        "(line 53,col 5)-(line 53,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testTopLevelEnumSerialization()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 47)",
        "(line 58,col 5)-(line 58,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testTopLevelEnumDeserialization()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 86)",
        "(line 63,col 5)-(line 63,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testCollectionOfEnumsSerialization()",
      "begin_line": 66,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 65)",
        "(line 68,col 5)-(line 68,col 56)",
        "(line 69,col 5)-(line 69,col 30)",
        "(line 70,col 5)-(line 70,col 30)",
        "(line 71,col 5)-(line 71,col 52)",
        "(line 72,col 5)-(line 72,col 44)",
        "(line 73,col 5)-(line 73,col 43)",
        "(line 74,col 5)-(line 74,col 43)",
        "(line 75,col 5)-(line 75,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testCollectionOfEnumsDeserialization()",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 65)",
        "(line 80,col 5)-(line 80,col 44)",
        "(line 81,col 5)-(line 81,col 58)",
        "(line 82,col 5)-(line 82,col 54)",
        "(line 83,col 5)-(line 83,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testClassWithEnumFieldSerialization()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 59)",
        "(line 88,col 5)-(line 88,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testClassWithEnumFieldDeserialization()",
      "begin_line": 91,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 54)",
        "(line 93,col 5)-(line 93,col 80)",
        "(line 94,col 5)-(line 94,col 46)",
        "(line 95,col 5)-(line 95,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithEnumFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value1"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value2"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.ClassWithEnumFields.getExpectedJson()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testEnumSubclass()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n   * Test for issue 226.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 60)",
        "(line 115,col 5)-(line 115,col 57)",
        "(line 116,col 5)-(line 116,col 98)",
        "(line 117,col 5)-(line 117,col 75)",
        "(line 118,col 5)-(line 119,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testEnumSubclassWithRegisteredTypeAdapter()",
      "begin_line": 122,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 18)",
        "(line 126,col 5)-(line 126,col 60)",
        "(line 127,col 5)-(line 127,col 60)",
        "(line 128,col 5)-(line 128,col 107)",
        "(line 129,col 5)-(line 129,col 78)",
        "(line 130,col 5)-(line 131,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testEnumSubclassAsParameterizedType()",
      "begin_line": 134,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 58)",
        "(line 136,col 5)-(line 136,col 28)",
        "(line 137,col 5)-(line 137,col 29)",
        "(line 139,col 5)-(line 139,col 36)",
        "(line 140,col 5)-(line 140,col 47)",
        "(line 142,col 5)-(line 142,col 77)",
        "(line 143,col 5)-(line 143,col 78)",
        "(line 144,col 5)-(line 144,col 62)",
        "(line 145,col 5)-(line 145,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testEnumCaseMapping()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 70)",
        "(line 150,col 5)-(line 150,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.testEnumSet()",
      "begin_line": 153,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 70)",
        "(line 155,col 5)-(line 155,col 35)",
        "(line 156,col 5)-(line 156,col 64)",
        "(line 157,col 5)-(line 157,col 54)",
        "(line 158,col 5)-(line 158,col 44)",
        "(line 159,col 5)-(line 159,col 45)",
        "(line 160,col 5)-(line 160,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.Roshambo.defeats()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.Roshambo.defeats()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.Roshambo.defeats()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.Roshambo.defeats()",
      "begin_line": 180,
      "end_line": 180,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MyEnumTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.functional.EnumTest.Roshambo\u003e",
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.EnumTest.Roshambo\u003e"
      ],
      "begin_line": 183,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.MyEnumTypeAdapter.serialize(com.google.gson.functional.EnumTest.Roshambo, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.EnumTest.MyEnumTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 7)-(line 191,col 63)"
      ]
    }
  ]
}