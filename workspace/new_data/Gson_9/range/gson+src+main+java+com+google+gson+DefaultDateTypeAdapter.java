{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/DefaultDateTypeAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultDateTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003cjava.util.Date\u003e",
        "com.google.gson.JsonDeserializer\u003cjava.util.Date\u003e"
      ],
      "begin_line": 38,
      "end_line": 119,
      "comment": "\n * This type adapter supports three subclasses of date: Date, Timestamp, and\n * java.sql.Date.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "enUsFormat"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localFormat"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.DefaultDateTypeAdapter.DefaultDateTypeAdapter()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 47,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.DefaultDateTypeAdapter.DefaultDateTypeAdapter(java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.DefaultDateTypeAdapter.DefaultDateTypeAdapter(int)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 90)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.DefaultDateTypeAdapter.DefaultDateTypeAdapter(int, int)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 60,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.DefaultDateTypeAdapter.DefaultDateTypeAdapter(java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 33)",
        "(line 65,col 5)-(line 65,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.DefaultDateTypeAdapter.serialize(java.util.Date, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 70,
      "end_line": 76,
      "comment": " See issue 162",
      "child_ranges": [
        "(line 72,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.DefaultDateTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 78,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 5)",
        "(line 84,col 5)-(line 84,col 40)",
        "(line 85,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.DefaultDateTypeAdapter.deserializeToDate(com.google.gson.JsonElement)",
      "begin_line": 96,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 109,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.DefaultDateTypeAdapter.toString()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 43)",
        "(line 115,col 5)-(line 115,col 60)",
        "(line 116,col 5)-(line 116,col 78)",
        "(line 117,col 5)-(line 117,col 25)"
      ]
    }
  ]
}