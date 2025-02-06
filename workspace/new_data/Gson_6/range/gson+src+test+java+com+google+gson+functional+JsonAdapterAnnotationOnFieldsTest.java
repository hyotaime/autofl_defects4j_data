{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/JsonAdapterAnnotationOnFieldsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonAdapterAnnotationOnFieldsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 223,
      "comment": "\n * Functional tests for the {@link com.google.gson.annotations.JsonAdapter} annotation on fields.\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testClassAnnotationAdapterTakesPrecedenceOverDefault()",
      "begin_line": 34,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 27)",
        "(line 36,col 5)-(line 36,col 73)",
        "(line 37,col 5)-(line 37,col 68)",
        "(line 38,col 5)-(line 38,col 84)",
        "(line 39,col 5)-(line 39,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testClassAnnotationAdapterFactoryTakesPrecedenceOverDefault()",
      "begin_line": 42,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 27)",
        "(line 44,col 5)-(line 44,col 59)",
        "(line 45,col 5)-(line 45,col 69)",
        "(line 46,col 5)-(line 46,col 67)",
        "(line 47,col 5)-(line 47,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testRegisteredTypeAdapterTakesPrecedenceOverClassAnnotationAdapter()",
      "begin_line": 50,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 53,col 18)",
        "(line 54,col 5)-(line 54,col 73)",
        "(line 55,col 5)-(line 55,col 63)",
        "(line 56,col 5)-(line 56,col 84)",
        "(line 57,col 5)-(line 57,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testFieldAnnotationTakesPrecedenceOverRegisteredTypeAdapter()",
      "begin_line": 60,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 70,col 18)",
        "(line 71,col 5)-(line 71,col 62)",
        "(line 72,col 5)-(line 72,col 72)",
        "(line 73,col 5)-(line 73,col 69)",
        "(line 74,col 5)-(line 74,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Anonymous-df7c250c-8b56-4496-b51a-ae566ad56888.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 11)-(line 64,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Anonymous-9e9b7247-08e3-4973-bc51-5c71c7abf9c9.read(com.google.gson.stream.JsonReader)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 11)-(line 68,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testFieldAnnotationTakesPrecedenceOverClassAnnotation()",
      "begin_line": 77,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 27)",
        "(line 79,col 5)-(line 79,col 74)",
        "(line 80,col 5)-(line 80,col 68)",
        "(line 81,col 5)-(line 81,col 84)",
        "(line 82,col 5)-(line 82,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Gadget",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "part"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Gadget.Gadget(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Gizmo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "part"
      ],
      "begin_line": 94,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Gizmo.Gizmo(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 7)-(line 97,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Part",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 101,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part.Part(java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PartJsonFieldAnnotationAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part\u003e"
      ],
      "begin_line": 108,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.PartJsonFieldAnnotationAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.PartJsonFieldAnnotationAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 22)",
        "(line 114,col 7)-(line 114,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GizmoPartTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 118,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.GizmoPartTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 7)-(line 129,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.GizmoPartTypeAdapterFactory.Anonymous-f9194d5c-c214-4db8-81c5-019033b24c0d.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 11)-(line 122,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.GizmoPartTypeAdapterFactory.Anonymous-1c795812-363d-4ce0-9f3a-4967caec503c.read(com.google.gson.stream.JsonReader)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 11)-(line 126,col 26)",
        "(line 127,col 11)-(line 127,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Computer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 133,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "user"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Computer.Computer(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "User",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 140,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User.User(java.lang.String)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UserClassAnnotationAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User\u003e"
      ],
      "begin_line": 148,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.UserClassAnnotationAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.UserClassAnnotationAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 22)",
        "(line 154,col 7)-(line 154,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Computer2",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 158,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "user"
      ],
      "begin_line": 160,
      "end_line": 161,
      "comment": " overrides the JsonAdapter annotation of User with this"
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Computer2.Computer2(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UserFieldAnnotationAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User\u003e"
      ],
      "begin_line": 167,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.UserFieldAnnotationAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.UserFieldAnnotationAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 172,col 22)",
        "(line 173,col 7)-(line 173,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RegisteredUserAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003ccom.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User\u003e"
      ],
      "begin_line": 177,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.RegisteredUserAdapter.write(com.google.gson.stream.JsonWriter, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.User)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 7)-(line 179,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.RegisteredUserAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 22)",
        "(line 183,col 7)-(line 183,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testJsonAdapterInvokedOnlyForAnnotatedFields()",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 27)",
        "(line 189,col 5)-(line 189,col 62)",
        "(line 190,col 5)-(line 190,col 78)",
        "(line 191,col 5)-(line 191,col 70)",
        "(line 192,col 5)-(line 192,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GadgetWithTwoParts",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 195,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "part1"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "part2"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Doesn\u0027t have the JsonAdapter annotation"
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.GadgetWithTwoParts.GadgetWithTwoParts(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part, com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 199,col 25)",
        "(line 200,col 7)-(line 200,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.testJsonAdapterWrappedInNullSafeAsRequested()",
      "begin_line": 204,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 27)",
        "(line 206,col 5)-(line 206,col 38)",
        "(line 208,col 5)-(line 208,col 90)",
        "(line 209,col 5)-(line 209,col 28)",
        "(line 211,col 5)-(line 211,col 40)",
        "(line 212,col 5)-(line 212,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GadgetWithOptionalPart",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 215,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "part"
      ],
      "begin_line": 216,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.GadgetWithOptionalPart.GadgetWithOptionalPart(com.google.gson.functional.JsonAdapterAnnotationOnFieldsTest.Part)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 7)-(line 220,col 23)"
      ]
    }
  ]
}