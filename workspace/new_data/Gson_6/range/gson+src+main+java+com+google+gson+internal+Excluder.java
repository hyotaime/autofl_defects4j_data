{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/Excluder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Excluder",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory",
        "java.lang.Cloneable"
      ],
      "begin_line": 50,
      "end_line": 251,
      "comment": "\n * This class selects which fields and types to omit. It is configurable,\n * supporting version attributes {@link Since} and {@link Until}, modifiers,\n * synthetic fields, anonymous and local classes, inner classes, and fields with\n * the {@link Expose} annotation.\n *\n * \u003cp\u003eThis class is a type adapter factory; types that are excluded will be\n * adapted to null. It may delegate to another type adapter if only one\n * direction is excluded.\n *\n * @author Joel Leitch\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "IGNORE_VERSIONS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifiers"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializeInnerClasses"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requireExpose"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializationStrategies"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deserializationStrategies"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.clone()",
      "begin_line": 61,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 66,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.withVersion(double)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 30)",
        "(line 71,col 5)-(line 71,col 41)",
        "(line 72,col 5)-(line 72,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.withModifiers(int...)",
      "begin_line": 75,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 30)",
        "(line 77,col 5)-(line 77,col 25)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.disableInnerClassSerialization()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 30)",
        "(line 86,col 5)-(line 86,col 41)",
        "(line 87,col 5)-(line 87,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.excludeFieldsWithoutExposeAnnotation()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 30)",
        "(line 92,col 5)-(line 92,col 32)",
        "(line 93,col 5)-(line 93,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.withExclusionStrategy(com.google.gson.ExclusionStrategy, boolean, boolean)",
      "begin_line": 96,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 30)",
        "(line 99,col 5)-(line 102,col 5)",
        "(line 103,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 111,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 41)",
        "(line 113,col 5)-(line 113,col 62)",
        "(line 114,col 5)-(line 114,col 65)",
        "(line 116,col 5)-(line 118,col 5)",
        "(line 120,col 5)-(line 146,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The delegate is lazily created because it may not be needed, and creating it may fail. "
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.Anonymous-18da8bdb-6dd7-47bb-9fa4-9f3a9c1b9d1e.read(com.google.gson.stream.JsonReader)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.Anonymous-9cffd4f5-def0-48fa-ae35-c311c056ee76.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.Anonymous-08b36c8c-493d-4e07-924c-41922d56648d.delegate()",
      "begin_line": 140,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 144,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.excludeField(java.lang.reflect.Field, boolean)",
      "begin_line": 149,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 157,col 5)",
        "(line 159,col 5)-(line 161,col 5)",
        "(line 163,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 172,col 5)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 178,col 5)-(line 178,col 99)",
        "(line 179,col 5)-(line 186,col 5)",
        "(line 188,col 5)-(line 188,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.excludeClass(java.lang.Class\u003c?\u003e, boolean)",
      "begin_line": 191,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 195,col 5)",
        "(line 197,col 5)-(line 199,col 5)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 205,col 5)-(line 205,col 99)",
        "(line 206,col 5)-(line 210,col 5)",
        "(line 212,col 5)-(line 212,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isAnonymousOrLocal(java.lang.Class\u003c?\u003e)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 217,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isInnerClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isStatic(java.lang.Class\u003c?\u003e)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isValidVersion(com.google.gson.annotations.Since, com.google.gson.annotations.Until)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isValidSince(com.google.gson.annotations.Since)",
      "begin_line": 232,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 238,col 5)",
        "(line 239,col 5)-(line 239,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Excluder.isValidUntil(com.google.gson.annotations.Until)",
      "begin_line": 242,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 248,col 5)",
        "(line 249,col 5)-(line 249,col 16)"
      ]
    }
  ]
}