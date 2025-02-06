{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/regression/JsonAdapterNullSafeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonAdapterNullSafeTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.regression.JsonAdapterNullSafeTest.testNullSafeBugSerialize()",
      "begin_line": 29,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 30,col 5)-(line 30,col 43)",
        "(line 31,col 5)-(line 31,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.regression.JsonAdapterNullSafeTest.testNullSafeBugDeserialize()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 70)",
        "(line 36,col 5)-(line 36,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Device",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.regression.JsonAdapterNullSafeTest.Device.Device(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 7)-(line 43,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JsonAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 46,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recursiveCall"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " because we use it to return a null type adapter on a recursive call."
    },
    {
      "type": "method",
      "signature": "com.google.gson.regression.JsonAdapterNullSafeTest.Device.JsonAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 51,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 40)",
        "(line 58,col 9)-(line 58,col 65)"
      ]
    }
  ]
}