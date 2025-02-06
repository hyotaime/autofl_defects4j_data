{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/internal/bind/SqlDateTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SqlDateTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapter\u003cjava.sql.Date\u003e"
      ],
      "begin_line": 38,
      "end_line": 67,
      "comment": "\n * Adapter for java.sql.Date. Although this class appears stateless, it is not.\n * DateFormat captures its time zone and locale when it is created, which gives\n * this class state. DateFormat isn\u0027t thread safe either, so this class has\n * to synchronize its read and write methods.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY"
      ],
      "begin_line": 39,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.SqlDateTypeAdapter.Anonymous-a9e0a357-e4e7-41a2-bece-28e12b028ea7.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 7)-(line 43,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.SqlDateTypeAdapter.read(com.google.gson.stream.JsonReader)",
      "begin_line": 49,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 54,col 5)",
        "(line 55,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.SqlDateTypeAdapter.write(com.google.gson.stream.JsonWriter, java.sql.Date)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 59)"
      ]
    }
  ]
}