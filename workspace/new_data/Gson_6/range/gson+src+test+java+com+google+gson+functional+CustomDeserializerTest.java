{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/CustomDeserializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CustomDeserializerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 39,
      "end_line": 212,
      "comment": "\n * Functional Test exercising custom deserialization only.  When test applies to both\n * serialization and deserialization then add it to CustomTypeAdapterTest.\n *\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUFFIX"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.setUp()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)",
        "(line 48,col 5)-(line 48,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testDefaultConstructorNotCalledOnObject()",
      "begin_line": 51,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 52)",
        "(line 53,col 5)-(line 53,col 36)",
        "(line 55,col 5)-(line 55,col 62)",
        "(line 56,col 5)-(line 56,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testDefaultConstructorNotCalledOnField()",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 89)",
        "(line 61,col 5)-(line 61,col 43)",
        "(line 63,col 5)-(line 63,col 76)",
        "(line 64,col 5)-(line 64,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolder.DataHolder()",
      "begin_line": 71,
      "end_line": 74,
      "comment": " For use by Gson",
      "child_ranges": [
        "(line 73,col 7)-(line 73,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolder.DataHolder(java.lang.String)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 7)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolder.getData()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 7)-(line 81,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataHolderWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrappedData"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolderWrapper.DataHolderWrapper()",
      "begin_line": 89,
      "end_line": 92,
      "comment": " For use by Gson",
      "child_ranges": [
        "(line 91,col 7)-(line 91,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolderWrapper.DataHolderWrapper(com.google.gson.functional.CustomDeserializerTest.DataHolder)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolderWrapper.getWrappedData()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataHolderDeserializer",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.CustomDeserializerTest.DataHolder\u003e"
      ],
      "begin_line": 103,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.DataHolderDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 50)",
        "(line 108,col 7)-(line 108,col 60)",
        "(line 109,col 7)-(line 109,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testJsonTypeFieldBasedDeserialization()",
      "begin_line": 113,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 69)",
        "(line 115,col 5)-(line 121,col 16)",
        "(line 122,col 5)-(line 122,col 67)",
        "(line 123,col 5)-(line 123,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.Anonymous-aca518f7-f711-433b-ab75-e511c10a262b.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 83)",
        "(line 119,col 9)-(line 119,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 126,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_ACCESS"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subClass"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.CustomDeserializerTest.SubTypes.SubTypes(java.lang.reflect.Type)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.SubTypes.getSubclass()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubType1",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.CustomDeserializerTest.MyBase"
      ],
      "begin_line": 142,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field1"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SubType2",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.CustomDeserializerTest.MyBase"
      ],
      "begin_line": 146,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field2"
      ],
      "begin_line": 147,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForTopLevelObject()",
      "begin_line": 151,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 159,col 18)",
        "(line 160,col 5)-(line 160,col 59)",
        "(line 161,col 5)-(line 161,col 50)",
        "(line 162,col 5)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.Anonymous-ce771abe-bea0-4947-937a-68653e5ccd47.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 11)-(line 157,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNull()",
      "begin_line": 165,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 173,col 18)",
        "(line 174,col 5)-(line 174,col 66)",
        "(line 175,col 5)-(line 175,col 78)",
        "(line 176,col 5)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.Anonymous-eeb78271-5c6d-40de-a29c-03e9ec2f8db4.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 11)-(line 171,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForArrayElements()",
      "begin_line": 179,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 187,col 18)",
        "(line 188,col 5)-(line 188,col 58)",
        "(line 189,col 5)-(line 189,col 54)",
        "(line 190,col 5)-(line 190,col 26)",
        "(line 191,col 5)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.Anonymous-6f5d0337-68e8-4973-899f-e271e6fb6937.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 11)-(line 185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.testCustomDeserializerReturnsNullForArrayElementsForArrayField()",
      "begin_line": 194,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 202,col 18)",
        "(line 203,col 5)-(line 203,col 66)",
        "(line 204,col 5)-(line 204,col 78)",
        "(line 205,col 5)-(line 205,col 32)",
        "(line 206,col 5)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.CustomDeserializerTest.Anonymous-2dbe510f-1ac1-4e48-97bb-7b756e2d3421.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 11)-(line 200,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBaseArray",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 209,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bases"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    }
  ]
}