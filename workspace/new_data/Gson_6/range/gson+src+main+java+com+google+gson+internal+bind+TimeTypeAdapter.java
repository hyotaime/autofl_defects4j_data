{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/TimeTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.sql.Time\u003e"
      ],
      "begin_line": 40,
      "end_line": 66,
      "comment": "\n * Adapter for Time. Although this class appears stateless, it is not.\n * DateFormat captures its time zone and locale when it is created, which gives\n * this class state. DateFormat isn\u0027t thread safe either, so this class has\n * to synchronize its read and write methods.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 41,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TimeTypeAdapter.Anonymous-17c96b41-539d-479d-8d34-b9dd0537bf89.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 98)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TimeTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 50,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 54,col 5)",
        "(line 55,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.TimeTypeAdapter.write(com.google.gson.stream.JsonWriter, java.sql.Time)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 59)"
      ]
    }
  ]
}