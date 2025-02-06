{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/GsonTypeAdapterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GsonTypeAdapterTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 148,
      "comment": "\n * Contains numerous tests involving registered type converters with a Gson instance.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.setUp()",
      "begin_line": 34,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 18)",
        "(line 37,col 5)-(line 40,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.testDefaultTypeAdapterThrowsParseException()",
      "begin_line": 43,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 47,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.testTypeAdapterThrowsException()",
      "begin_line": 50,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 54,col 48)",
        "(line 56,col 5)-(line 59,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.testTypeAdapterProperlyConvertsTypes()",
      "begin_line": 62,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 24)",
        "(line 64,col 5)-(line 64,col 61)",
        "(line 65,col 5)-(line 65,col 41)",
        "(line 66,col 5)-(line 66,col 58)",
        "(line 68,col 5)-(line 68,col 57)",
        "(line 69,col 5)-(line 69,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.testTypeAdapterDoesNotAffectNonAdaptedTypes()",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 29)",
        "(line 74,col 5)-(line 74,col 42)",
        "(line 75,col 5)-(line 75,col 49)",
        "(line 77,col 5)-(line 77,col 49)",
        "(line 78,col 5)-(line 78,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003cjava.util.concurrent.atomic.AtomicLong\u003e",
        "com.google.gson.JsonDeserializer\u003cjava.util.concurrent.atomic.AtomicLong\u003e"
      ],
      "begin_line": 81,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.ExceptionTypeAdapter.serialize(java.util.concurrent.atomic.AtomicLong, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.ExceptionTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AtomicIntegerTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003cjava.util.concurrent.atomic.AtomicInteger\u003e",
        "com.google.gson.JsonDeserializer\u003cjava.util.concurrent.atomic.AtomicInteger\u003e"
      ],
      "begin_line": 94,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.AtomicIntegerTypeAdapter.serialize(java.util.concurrent.atomic.AtomicInteger, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 7)-(line 97,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.AtomicIntegerTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 37)",
        "(line 103,col 7)-(line 103,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Abstract",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Concrete",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.GsonTypeAdapterTest.Abstract"
      ],
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.testDeserializerForAbstractClass()",
      "begin_line": 116,
      "end_line": 128,
      "comment": " https://groups.google.com/d/topic/google-gson/EBmOCa8kJPE/discussion",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 39)",
        "(line 118,col 5)-(line 118,col 27)",
        "(line 119,col 5)-(line 119,col 24)",
        "(line 120,col 5)-(line 120,col 82)",
        "(line 121,col 5)-(line 121,col 83)",
        "(line 122,col 5)-(line 122,col 83)",
        "(line 123,col 5)-(line 123,col 84)",
        "(line 124,col 5)-(line 124,col 97)",
        "(line 125,col 5)-(line 125,col 98)",
        "(line 126,col 5)-(line 126,col 98)",
        "(line 127,col 5)-(line 127,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.assertSerialized(java.lang.String, java.lang.Class\u003c?\u003e, boolean, boolean, java.lang.Object)",
      "begin_line": 130,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 137,col 6)",
        "(line 138,col 5)-(line 138,col 44)",
        "(line 139,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 33)",
        "(line 146,col 5)-(line 146,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.GsonTypeAdapterTest.Anonymous-c0621021-b262-4cd3-b14f-329dc56eaaea.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)"
      ]
    }
  ]
}