{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/NullObjectAndFieldTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullObjectAndFieldTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 240,
      "comment": "\r\n * Functional tests for the different cases for serializing (or ignoring) null fields and object.\r\n *\r\n * @author Inderjeet Singh\r\n * @author Joel Leitch\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "gsonBuilder"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.setUp()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)",
        "(line 48,col 5)-(line 48,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testTopLevelNullObjectSerialization()",
      "begin_line": 51,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 37)",
        "(line 53,col 5)-(line 53,col 38)",
        "(line 54,col 5)-(line 54,col 33)",
        "(line 56,col 5)-(line 56,col 45)",
        "(line 57,col 5)-(line 57,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testTopLevelNullObjectDeserialization()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 37)",
        "(line 62,col 5)-(line 62,col 56)",
        "(line 63,col 5)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNulls()",
      "begin_line": 66,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 37)",
        "(line 68,col 5)-(line 68,col 57)",
        "(line 69,col 5)-(line 69,col 40)",
        "(line 70,col 5)-(line 70,col 39)",
        "(line 71,col 5)-(line 71,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitDeserializationOfNulls()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 37)",
        "(line 76,col 5)-(line 76,col 86)",
        "(line 77,col 5)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullArrayMembers()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 37)",
        "(line 82,col 5)-(line 82,col 53)",
        "(line 83,col 5)-(line 83,col 38)",
        "(line 84,col 5)-(line 84,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testNullWrappedPrimitiveMemberSerialization()",
      "begin_line": 90,
      "end_line": 95,
      "comment": " \r\n   * Added to verify http://code.google.com/p/google-gson/issues/detail?id\u003d68\r\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 54)",
        "(line 92,col 5)-(line 92,col 79)",
        "(line 93,col 5)-(line 93,col 38)",
        "(line 94,col 5)-(line 94,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testNullWrappedPrimitiveMemberDeserialization()",
      "begin_line": 100,
      "end_line": 105,
      "comment": " \r\n   * Added to verify http://code.google.com/p/google-gson/issues/detail?id\u003d68\r\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 37)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 100)",
        "(line 104,col 5)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullCollectionMembers()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 37)",
        "(line 109,col 5)-(line 109,col 53)",
        "(line 110,col 5)-(line 110,col 38)",
        "(line 111,col 5)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitSerializationOfNullStringMembers()",
      "begin_line": 114,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 37)",
        "(line 116,col 5)-(line 116,col 53)",
        "(line 117,col 5)-(line 117,col 38)",
        "(line 118,col 5)-(line 118,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testCustomSerializationOfNulls()",
      "begin_line": 121,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 94)",
        "(line 123,col 5)-(line 123,col 37)",
        "(line 124,col 5)-(line 124,col 74)",
        "(line 125,col 5)-(line 125,col 40)",
        "(line 126,col 5)-(line 126,col 39)",
        "(line 127,col 5)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testPrintPrintingObjectWithNulls()",
      "begin_line": 130,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 36)",
        "(line 132,col 5)-(line 132,col 37)",
        "(line 133,col 5)-(line 133,col 56)",
        "(line 134,col 5)-(line 134,col 31)",
        "(line 136,col 5)-(line 136,col 49)",
        "(line 137,col 5)-(line 137,col 49)",
        "(line 138,col 5)-(line 138,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testPrintPrintingArraysWithNulls()",
      "begin_line": 141,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 36)",
        "(line 143,col 5)-(line 143,col 37)",
        "(line 144,col 5)-(line 144,col 65)",
        "(line 145,col 5)-(line 145,col 47)",
        "(line 147,col 5)-(line 147,col 49)",
        "(line 148,col 5)-(line 148,col 58)",
        "(line 149,col 5)-(line 149,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testAbsentJsonElementsAreSetToNull()",
      "begin_line": 153,
      "end_line": 164,
      "comment": " test for issue 389",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 27)",
        "(line 155,col 5)-(line 156,col 76)",
        "(line 157,col 5)-(line 157,col 65)",
        "(line 158,col 5)-(line 158,col 77)",
        "(line 159,col 5)-(line 159,col 28)",
        "(line 160,col 5)-(line 160,col 74)",
        "(line 161,col 5)-(line 161,col 33)",
        "(line 162,col 5)-(line 162,col 79)",
        "(line 163,col 5)-(line 163,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithInitializedMembers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 166,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MY_STRING_DEFAULT"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Also, some fields are intialized and some are not (so initialized per JVM spec)"
    },
    {
      "type": "field",
      "varNames": [
        "MY_INT_DEFAULT"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MY_BOOLEAN_DEFAULT"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "str1",
        "str2"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "int1"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "int2"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bool1"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bool2"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.ClassWithInitializedMembers.ClassWithInitializedMembers()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 7)-(line 179,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithNullWrappedPrimitive",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 183,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithMembers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 187,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "str"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "col"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithObjectsSerializer",
      "is_interface": false,
      "parent_types": [
        "JsonSerializer\u003cClassWithObjects\u003e"
      ],
      "begin_line": 194,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "serialize(ClassWithObjects, Type, JsonSerializationContext)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027ClassWithObjects\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 195,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 40)",
        "(line 198,col 7)-(line 198,col 40)",
        "(line 199,col 7)-(line 199,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testExplicitNullSetsFieldToNullDuringDeserialization()",
      "begin_line": 203,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 27)",
        "(line 205,col 5)-(line 205,col 33)",
        "(line 206,col 5)-(line 206,col 69)",
        "(line 207,col 5)-(line 207,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testCustomTypeAdapterPassesNullSerialization()",
      "begin_line": 210,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 217,col 20)",
        "(line 218,col 5)-(line 218,col 51)",
        "(line 219,col 5)-(line 219,col 28)",
        "(line 220,col 5)-(line 220,col 38)",
        "(line 221,col 5)-(line 221,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.Anonymous-282a8f84-63c3-4ac1-a680-9272a336851b.serialize(com.google.gson.functional.NullObjectAndFieldTest.ObjectWithField, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.testCustomTypeAdapterPassesNullDesrialization()",
      "begin_line": 224,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 231,col 20)",
        "(line 232,col 5)-(line 232,col 37)",
        "(line 233,col 5)-(line 233,col 72)",
        "(line 234,col 5)-(line 234,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.NullObjectAndFieldTest.Anonymous-148002bc-26df-4d13-ab9b-a4a06fb5f288.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 13)-(line 229,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectWithField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 237,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": ""
    }
  ]
}