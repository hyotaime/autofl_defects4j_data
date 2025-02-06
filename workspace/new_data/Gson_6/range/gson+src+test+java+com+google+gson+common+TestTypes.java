{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/common/TestTypes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestTypes",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 421,
      "comment": "\n * Types used for testing JSON serialization and deserialization\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE_NAME"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE_FIELD_KEY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SERIALIZER_KEY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseName"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializerName"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Sub",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.common.TestTypes.Base"
      ],
      "begin_line": 48,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUB_NAME"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUB_FIELD_KEY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subName"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ClassWithBaseField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FIELD_KEY"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithBaseField.ClassWithBaseField(com.google.gson.common.TestTypes.Base)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBaseArrayField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FIELD_KEY"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithBaseArrayField.ClassWithBaseArrayField(com.google.gson.common.TestTypes.Base[])",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithBaseCollectionField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FIELD_KEY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithBaseCollectionField.ClassWithBaseCollectionField(java.util.Collection\u003ccom.google.gson.common.TestTypes.Base\u003e)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 7)-(line 74,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BaseSerializer",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.common.TestTypes.Base\u003e"
      ],
      "begin_line": 78,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BaseSerializer.serialize(com.google.gson.common.TestTypes.Base, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 82,col 7)-(line 82,col 40)",
        "(line 83,col 7)-(line 83,col 49)",
        "(line 84,col 7)-(line 84,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubSerializer",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.common.TestTypes.Sub\u003e"
      ],
      "begin_line": 87,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.SubSerializer.serialize(com.google.gson.common.TestTypes.Sub, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 7)-(line 91,col 40)",
        "(line 92,col 7)-(line 92,col 49)",
        "(line 93,col 7)-(line 93,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 97,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someConstantStringInstanceField"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.StringWrapper.StringWrapper(java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 7)-(line 101,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BagOfPrimitives",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 105,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longValue"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intValue"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "booleanValue"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringValue"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.BagOfPrimitives()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.BagOfPrimitives(long, int, boolean, java.lang.String)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 117,col 33)",
        "(line 118,col 7)-(line 118,col 31)",
        "(line 119,col 7)-(line 119,col 39)",
        "(line 120,col 7)-(line 120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.getIntValue()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 7)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.getExpectedJson()",
      "begin_line": 127,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 45)",
        "(line 129,col 7)-(line 129,col 21)",
        "(line 130,col 7)-(line 130,col 64)",
        "(line 131,col 7)-(line 131,col 62)",
        "(line 132,col 7)-(line 132,col 70)",
        "(line 133,col 7)-(line 133,col 71)",
        "(line 134,col 7)-(line 134,col 21)",
        "(line 135,col 7)-(line 135,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.hashCode()",
      "begin_line": 138,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 27)",
        "(line 141,col 7)-(line 141,col 21)",
        "(line 142,col 7)-(line 142,col 61)",
        "(line 143,col 7)-(line 143,col 41)",
        "(line 144,col 7)-(line 144,col 71)",
        "(line 145,col 7)-(line 145,col 85)",
        "(line 146,col 7)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 151,col 7)-(line 152,col 20)",
        "(line 153,col 7)-(line 154,col 21)",
        "(line 155,col 7)-(line 156,col 21)",
        "(line 157,col 7)-(line 157,col 52)",
        "(line 158,col 7)-(line 159,col 21)",
        "(line 160,col 7)-(line 161,col 21)",
        "(line 162,col 7)-(line 163,col 21)",
        "(line 164,col 7)-(line 168,col 21)",
        "(line 169,col 7)-(line 169,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitives.toString()",
      "begin_line": 172,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 175,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BagOfPrimitiveWrappers",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 179,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longValue"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "intValue"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "booleanValue"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitiveWrappers.BagOfPrimitiveWrappers(java.lang.Long, java.lang.Integer, java.lang.Boolean)",
      "begin_line": 184,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 33)",
        "(line 186,col 7)-(line 186,col 31)",
        "(line 187,col 7)-(line 187,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.BagOfPrimitiveWrappers.getExpectedJson()",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 191,col 7)-(line 191,col 45)",
        "(line 192,col 7)-(line 192,col 21)",
        "(line 193,col 7)-(line 193,col 64)",
        "(line 194,col 7)-(line 194,col 62)",
        "(line 195,col 7)-(line 195,col 58)",
        "(line 196,col 7)-(line 196,col 21)",
        "(line 197,col 7)-(line 197,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrimitiveArray",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 201,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longArray"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.PrimitiveArray.PrimitiveArray()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 7)-(line 205,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.PrimitiveArray.PrimitiveArray(long[])",
      "begin_line": 208,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 7)-(line 209,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.PrimitiveArray.getExpectedJson()",
      "begin_line": 212,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 213,col 7)-(line 213,col 45)",
        "(line 214,col 7)-(line 214,col 36)",
        "(line 216,col 7)-(line 216,col 27)",
        "(line 217,col 7)-(line 224,col 7)",
        "(line 226,col 7)-(line 226,col 22)",
        "(line 227,col 7)-(line 227,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithNoFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 231,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithNoFields.equals(java.lang.Object)",
      "begin_line": 233,
      "end_line": 236,
      "comment": " Nothing here..",
      "child_ranges": [
        "(line 235,col 7)-(line 235,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Nested",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 239,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "primitive1"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "primitive2"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.Nested.Nested()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.Nested.Nested(com.google.gson.common.TestTypes.BagOfPrimitives, com.google.gson.common.TestTypes.BagOfPrimitives)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 7)-(line 248,col 35)",
        "(line 249,col 7)-(line 249,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.Nested.getExpectedJson()",
      "begin_line": 252,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 45)",
        "(line 254,col 7)-(line 254,col 21)",
        "(line 255,col 7)-(line 255,col 23)",
        "(line 256,col 7)-(line 256,col 21)",
        "(line 257,col 7)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.Nested.appendFields(java.lang.StringBuilder)",
      "begin_line": 260,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 261,col 7)-(line 263,col 7)",
        "(line 264,col 7)-(line 266,col 7)",
        "(line 267,col 7)-(line 269,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithTransientFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 273,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientT"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientLongValue"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longValue"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithTransientFields.ClassWithTransientFields()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithTransientFields.ClassWithTransientFields(long)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 283,col 7)-(line 283,col 39)",
        "(line 284,col 7)-(line 284,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithTransientFields.getExpectedJson()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 45)",
        "(line 289,col 7)-(line 289,col 21)",
        "(line 290,col 7)-(line 290,col 68)",
        "(line 291,col 7)-(line 291,col 21)",
        "(line 292,col 7)-(line 292,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithCustomTypeConverter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 296,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bag"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.ClassWithCustomTypeConverter()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.ClassWithCustomTypeConverter(int)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 305,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.ClassWithCustomTypeConverter(com.google.gson.common.TestTypes.BagOfPrimitives, int)",
      "begin_line": 308,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 309,col 7)-(line 309,col 21)",
        "(line 310,col 7)-(line 310,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.getBag()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.getExpectedJson()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 7)-(line 318,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.getValue()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 7)-(line 322,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArrayOfObjects",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 326,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ArrayOfObjects.ArrayOfObjects()",
      "begin_line": 328,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 329,col 40)",
        "(line 330,col 7)-(line 332,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ArrayOfObjects.getExpectedJson()",
      "begin_line": 334,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 62)",
        "(line 336,col 7)-(line 336,col 27)",
        "(line 337,col 7)-(line 344,col 7)",
        "(line 345,col 7)-(line 345,col 22)",
        "(line 346,col 7)-(line 346,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassOverridingEquals",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 350,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ref"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassOverridingEquals.getExpectedJson()",
      "begin_line": 353,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 7)-(line 356,col 7)",
        "(line 357,col 7)-(line 357,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassOverridingEquals.equals(java.lang.Object)",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 7)-(line 361,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassOverridingEquals.hashCode()",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithArray",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 370,
      "end_line": 379,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "array"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithArray.ClassWithArray()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 7)-(line 373,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithArray.ClassWithArray(java.lang.Object[])",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 377,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithObjects",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 381,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bag"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithObjects.ClassWithObjects()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 7)-(line 384,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithObjects.ClassWithObjects(com.google.gson.common.TestTypes.BagOfPrimitives)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 7)-(line 387,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithSerializedNameFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 391,
      "end_line": 406,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "g"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithSerializedNameFields.ClassWithSerializedNameFields()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.common.TestTypes.ClassWithSerializedNameFields.ClassWithSerializedNameFields(int, int)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 399,col 7)-(line 399,col 17)",
        "(line 400,col 7)-(line 400,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.ClassWithSerializedNameFields.getExpectedJson()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 7)-(line 404,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CrazyLongTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003cjava.lang.Long\u003e",
        "com.google.gson.JsonDeserializer\u003cjava.lang.Long\u003e"
      ],
      "begin_line": 408,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DIFFERENCE"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.CrazyLongTypeAdapter.serialize(java.lang.Long, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 7)-(line 413,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.common.TestTypes.CrazyLongTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 415,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 7)-(line 418,col 43)"
      ]
    }
  ]
}