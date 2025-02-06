{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/DateTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.util.Date\u003e"
      ],
      "begin_line": 41,
      "end_line": 88,
      "comment": "\n * Adapter for Date. Although this class appears stateless, it is not.\n * DateFormat captures its time zone and locale when it is created, which gives\n * this class state. DateFormat isn\u0027t thread safe either, so this class has\n * to synchronize its read and write methods.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 42,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.DateTypeAdapter.Anonymous-0694f3ed-6db7-47a7-95e6-a56efc23fae0.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 7)-(line 45,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "enUsFormat"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localFormat"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.DateTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 58,col 5)",
        "(line 59,col 5)-(line 59,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.DateTypeAdapter.deserializeToDate(java.lang.String)",
      "begin_line": 62,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 66,col 5)",
        "(line 67,col 5)-(line 70,col 5)",
        "(line 71,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.DateTypeAdapter.write(com.google.gson.stream.JsonWriter, java.util.Date)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 82,col 5)",
        "(line 83,col 5)-(line 83,col 57)",
        "(line 84,col 5)-(line 84,col 34)"
      ]
    }
  ]
}