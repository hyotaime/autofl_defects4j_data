{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/metrics/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 346,
      "comment": "\n * Tests to measure performance for Gson. All tests in this file will be disabled in code. To run\n * them remove disabled_ prefix from the tests and run them.\n * \n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "COLLECTION_SIZE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_ITERATIONS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.setUp()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 18)",
        "(line 50,col 5)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.testDummy()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testStringDeserialization()",
      "begin_line": 57,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 47)",
        "(line 59,col 5)-(line 59,col 30)",
        "(line 61,col 5)-(line 71,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.parseLongJson(java.lang.String)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 72)",
        "(line 76,col 5)-(line 76,col 49)",
        "(line 77,col 5)-(line 77,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "message"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stackTrace"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ExceptionHolder.ExceptionHolder()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " For use by Gson",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ExceptionHolder.ExceptionHolder(java.lang.String, java.lang.String)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 29)",
        "(line 91,col 7)-(line 91,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectionEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.CollectionEntry.CollectionEntry()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " For use by Gson",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.CollectionEntry.CollectionEntry(java.lang.String, java.lang.String)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 23)",
        "(line 107,col 7)-(line 107,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testLargeCollectionSerialization()",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n   * Created in response to http://code.google.com/p/google-gson/issues/detail?id\u003d96\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 24)",
        "(line 116,col 5)-(line 116,col 71)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testLargeCollectionDeserialization()",
      "begin_line": 126,
      "end_line": 144,
      "comment": "\n   * Created in response to http://code.google.com/p/google-gson/issues/detail?id\u003d96\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 43)",
        "(line 128,col 5)-(line 128,col 22)",
        "(line 129,col 5)-(line 129,col 25)",
        "(line 130,col 5)-(line 130,col 19)",
        "(line 131,col 5)-(line 138,col 5)",
        "(line 139,col 5)-(line 139,col 19)",
        "(line 140,col 5)-(line 140,col 32)",
        "(line 141,col 5)-(line 141,col 82)",
        "(line 142,col 5)-(line 142,col 69)",
        "(line 143,col 5)-(line 143,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testByteArraySerialization()",
      "begin_line": 150,
      "end_line": 159,
      "comment": " Last I tested, Gson was able to serialize upto 14MB byte array",
      "child_ranges": [
        "(line 151,col 5)-(line 158,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disable_testByteArrayDeserialization()",
      "begin_line": 165,
      "end_line": 183,
      "comment": " Last I tested, Gson was able to deserialize a byte array of 11MB",
      "child_ranges": [
        "(line 166,col 5)-(line 182,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testSerializeClasses()",
      "begin_line": 194,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 47)",
        "(line 196,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 40)",
        "(line 200,col 5)-(line 200,col 41)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 204,col 5)-(line 204,col 41)",
        "(line 205,col 5)-(line 205,col 42)",
        "(line 206,col 5)-(line 206,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testDeserializeClasses()",
      "begin_line": 209,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 46)",
        "(line 211,col 5)-(line 211,col 63)",
        "(line 212,col 5)-(line 212,col 41)",
        "(line 213,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 216,col 41)",
        "(line 217,col 5)-(line 217,col 42)",
        "(line 218,col 5)-(line 218,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disable_testLargeObjectSerializationAndDeserialization()",
      "begin_line": 221,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 64)",
        "(line 223,col 5)-(line 225,col 5)",
        "(line 227,col 5)-(line 227,col 41)",
        "(line 228,col 5)-(line 228,col 43)",
        "(line 229,col 5)-(line 229,col 41)",
        "(line 230,col 5)-(line 230,col 72)",
        "(line 232,col 5)-(line 232,col 36)",
        "(line 233,col 5)-(line 233,col 73)",
        "(line 234,col 5)-(line 234,col 36)",
        "(line 235,col 5)-(line 235,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testSerializeExposedClasses()",
      "begin_line": 239,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 66)",
        "(line 241,col 5)-(line 243,col 5)",
        "(line 244,col 5)-(line 244,col 34)",
        "(line 245,col 5)-(line 245,col 40)",
        "(line 246,col 5)-(line 246,col 41)",
        "(line 247,col 5)-(line 249,col 5)",
        "(line 250,col 5)-(line 250,col 41)",
        "(line 251,col 5)-(line 251,col 42)",
        "(line 252,col 5)-(line 252,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testDeserializeExposedClasses()",
      "begin_line": 255,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 46)",
        "(line 257,col 5)-(line 257,col 81)",
        "(line 258,col 5)-(line 258,col 41)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 41)",
        "(line 263,col 5)-(line 263,col 42)",
        "(line 264,col 5)-(line 264,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.disabled_testLargeGsonMapRoundTrip()",
      "begin_line": 267,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 57)",
        "(line 269,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 27)",
        "(line 274,col 5)-(line 274,col 40)",
        "(line 275,col 5)-(line 275,col 67)",
        "(line 276,col 5)-(line 276,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.metrics.PerformanceTest.buildJsonForClassWithList()",
      "begin_line": 279,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 280,col 46)",
        "(line 281,col 5)-(line 281,col 41)",
        "(line 282,col 5)-(line 282,col 24)",
        "(line 283,col 5)-(line 283,col 25)",
        "(line 284,col 5)-(line 291,col 5)",
        "(line 292,col 5)-(line 292,col 19)",
        "(line 293,col 5)-(line 293,col 19)",
        "(line 294,col 5)-(line 294,col 32)",
        "(line 295,col 5)-(line 295,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithList",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 298,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithList.ClassWithList()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithList.ClassWithList(java.lang.String)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 310,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithField.ClassWithField()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 7)-(line 314,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithField.ClassWithField(java.lang.String)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 317,col 7)-(line 317,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithListOfObjects",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 321,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 323,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 325,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithListOfObjects.ClassWithListOfObjects()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithListOfObjects.ClassWithListOfObjects(java.lang.String)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassWithExposedField",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 335,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 337,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithExposedField.ClassWithExposedField()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 340,col 7)-(line 340,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.metrics.PerformanceTest.ClassWithExposedField.ClassWithExposedField(java.lang.String)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 7)-(line 343,col 25)"
      ]
    }
  ]
}