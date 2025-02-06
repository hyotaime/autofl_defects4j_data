{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/JsonTreeWriter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonTreeWriter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.stream.JsonWriter"
      ],
      "begin_line": 33,
      "end_line": 200,
      "comment": "\n * This writer creates a JsonElement.\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNWRITABLE_WRITER"
      ],
      "begin_line": 34,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.Anonymous-4f543e7c-0be6-4779-9ad8-cbf07f42cc24.write(char[], int, int)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 7)-(line 36,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.Anonymous-3d536ad8-405d-4233-8469-5f992fe7d671.flush()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 7)-(line 39,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.Anonymous-ca9be0f4-395b-41c8-af3b-b696c45f426c.close()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SENTINEL_CLOSED"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Added to the top of the stack when this writer is closed to cause following ops to fail. "
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The JsonElements and JsonArrays under modification, outermost to innermost. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingName"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The name for the next JSON object value. If non-null, the top of the stack is a JsonObject. "
    },
    {
      "type": "field",
      "varNames": [
        "product"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " TODO: is this really what we want?;"
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.JsonTreeWriter()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.get()",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n   * Returns the top level object produced by this writer.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 67,col 5)",
        "(line 68,col 5)-(line 68,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.peek()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.put(com.google.gson.JsonElement)",
      "begin_line": 75,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 91,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.beginArray()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 38)",
        "(line 96,col 5)-(line 96,col 15)",
        "(line 97,col 5)-(line 97,col 21)",
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.endArray()",
      "begin_line": 101,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 104,col 5)",
        "(line 105,col 5)-(line 105,col 33)",
        "(line 106,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.beginObject()",
      "begin_line": 113,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 41)",
        "(line 115,col 5)-(line 115,col 16)",
        "(line 116,col 5)-(line 116,col 22)",
        "(line 117,col 5)-(line 117,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.endObject()",
      "begin_line": 120,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 123,col 5)",
        "(line 124,col 5)-(line 124,col 33)",
        "(line 125,col 5)-(line 128,col 5)",
        "(line 129,col 5)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.name(java.lang.String)",
      "begin_line": 132,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 135,col 5)",
        "(line 136,col 5)-(line 136,col 33)",
        "(line 137,col 5)-(line 140,col 5)",
        "(line 141,col 5)-(line 141,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.value(java.lang.String)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 147,col 5)",
        "(line 148,col 5)-(line 148,col 34)",
        "(line 149,col 5)-(line 149,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.nullValue()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 27)",
        "(line 154,col 5)-(line 154,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.value(boolean)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 34)",
        "(line 159,col 5)-(line 159,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.value(double)",
      "begin_line": 162,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 165,col 5)",
        "(line 166,col 5)-(line 166,col 34)",
        "(line 167,col 5)-(line 167,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.value(long)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 34)",
        "(line 172,col 5)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.value(java.lang.Number)",
      "begin_line": 175,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 178,col 5)",
        "(line 180,col 5)-(line 185,col 5)",
        "(line 187,col 5)-(line 187,col 34)",
        "(line 188,col 5)-(line 188,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.flush()",
      "begin_line": 191,
      "end_line": 192,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeWriter.close()",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 197,col 5)",
        "(line 198,col 5)-(line 198,col 31)"
      ]
    }
  ]
}