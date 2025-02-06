{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/RuntimeTypeAdapterFactoryFunctionalTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RuntimeTypeAdapterFactoryFunctionalTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 205,
      "comment": "\n * Functional tests for the RuntimeTypeAdapterFactory feature in extras.\n "
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
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.testSubclassesAutomaticallySerialzed()",
      "begin_line": 48,
      "end_line": 59,
      "comment": "\n   * This test also ensures that {@link TypeAdapterFactory} registered through {@link JsonAdapter}\n   * work correctly for {@link Gson#getDelegateAdapter(TypeAdapterFactory, TypeToken)}.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 33)",
        "(line 50,col 5)-(line 50,col 37)",
        "(line 51,col 5)-(line 51,col 45)",
        "(line 52,col 5)-(line 52,col 45)",
        "(line 54,col 5)-(line 54,col 27)",
        "(line 55,col 5)-(line 55,col 30)",
        "(line 56,col 5)-(line 56,col 45)",
        "(line 57,col 5)-(line 57,col 43)",
        "(line 58,col 5)-(line 58,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Shape",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Shape.Shape(com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.ShapeType)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 64,col 29)-(line 64,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JsonAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory\u003ccom.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Shape\u003e"
      ],
      "begin_line": 65,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Shape.JsonAdapterFactory.JsonAdapterFactory()",
      "begin_line": 66,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 68,col 67)",
        "(line 69,col 9)-(line 69,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Shape"
      ],
      "begin_line": 78,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Circle.Circle(int)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 80,col 26)-(line 80,col 49)",
        "(line 80,col 51)-(line 80,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Square",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Shape"
      ],
      "begin_line": 83,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "side"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.Square.Square(int)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 85,col 24)-(line 85,col 47)",
        "(line 85,col 49)-(line 85,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RuntimeTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 89,
      "end_line": 204,
      "comment": " Copied from the extras package"
    },
    {
      "type": "field",
      "varNames": [
        "baseType"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeFieldName"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "labelToSubtype"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subtypeToLabel"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.RuntimeTypeAdapterFactory(java.lang.Class\u003c?\u003e, java.lang.String)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 96,col 7)-(line 98,col 7)",
        "(line 99,col 7)-(line 99,col 31)",
        "(line 100,col 7)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.of(java.lang.Class\u003cT\u003e, java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new runtime type adapter using for {@code baseType} using {@code\n     * typeFieldName} as the type field name. Type field names are case sensitive.\n     ",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.of(java.lang.Class\u003cT\u003e)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Creates a new runtime type adapter for {@code baseType} using {@code \"type\"} as\n     * the type field name.\n     ",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.registerSubtype(java.lang.Class\u003c? extends T\u003e, java.lang.String)",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Registers {@code type} identified by {@code label}. Labels are case\n     * sensitive.\n     *\n     * @throws IllegalArgumentException if either {@code type} or {@code label}\n     *     have already been registered on this type adapter.\n     ",
      "child_ranges": [
        "(line 127,col 7)-(line 129,col 7)",
        "(line 130,col 7)-(line 132,col 7)",
        "(line 133,col 7)-(line 133,col 38)",
        "(line 134,col 7)-(line 134,col 38)",
        "(line 135,col 7)-(line 135,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.registerSubtype(java.lang.Class\u003c? extends T\u003e)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Registers {@code type} identified by its {@link Class#getSimpleName simple\n     * name}. Labels are case sensitive.\n     *\n     * @throws IllegalArgumentException if either {@code type} or its simple name\n     *     have already been registered on this type adapter.\n     ",
      "child_ranges": [
        "(line 146,col 7)-(line 146,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cR\u003e)",
      "begin_line": 149,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 152,col 7)",
        "(line 154,col 7)-(line 155,col 56)",
        "(line 156,col 7)-(line 157,col 58)",
        "(line 158,col 7)-(line 162,col 7)",
        "(line 164,col 7)-(line 202,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.Anonymous-6b7c6d7f-9a14-4558-ae7d-592e1ea96da5.read(com.google.gson.stream.JsonReader)",
      "begin_line": 165,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 166,col 11)-(line 166,col 54)",
        "(line 167,col 11)-(line 167,col 90)",
        "(line 168,col 11)-(line 171,col 11)",
        "(line 172,col 11)-(line 172,col 56)",
        "(line 173,col 11)-(line 174,col 80)",
        "(line 175,col 11)-(line 178,col 11)",
        "(line 179,col 11)-(line 179,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.RuntimeTypeAdapterFactoryFunctionalTest.RuntimeTypeAdapterFactory.Anonymous-a7204f6d-07ae-4f0b-b650-501569675f31.write(com.google.gson.stream.JsonWriter, R)",
      "begin_line": 182,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 183,col 11)-(line 183,col 46)",
        "(line 184,col 11)-(line 184,col 53)",
        "(line 185,col 11)-(line 186,col 84)",
        "(line 187,col 11)-(line 190,col 11)",
        "(line 191,col 11)-(line 191,col 79)",
        "(line 192,col 11)-(line 199,col 11)",
        "(line 200,col 11)-(line 200,col 41)"
      ]
    }
  ]
}