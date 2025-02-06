{
  "filepath": "/tmp/Gson-6b/gson/src/main/java/com/google/gson/internal/bind/JsonTreeReader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsonTreeReader",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.stream.JsonReader"
      ],
      "begin_line": 39,
      "end_line": 226,
      "comment": "\n * This reader walks the elements of a JsonElement as if it was coming from a\n * character stream.\n *\n * @author Jesse Wilson\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNREADABLE_READER"
      ],
      "begin_line": 40,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.Anonymous-5c75f50e-37f8-4782-a6bb-93da62aa6e32.read(char[], int, int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.Anonymous-cfdf5a32-7e57-4cdb-9c07-2e32a633ff8b.close()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 7)-(line 45,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SENTINEL_CLOSED"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.JsonTreeReader(com.google.gson.JsonElement)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 29)",
        "(line 54,col 5)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.beginArray()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 34)",
        "(line 59,col 5)-(line 59,col 46)",
        "(line 60,col 5)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.endArray()",
      "begin_line": 63,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 32)",
        "(line 65,col 5)-(line 65,col 15)",
        "(line 66,col 5)-(line 66,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.beginObject()",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 35)",
        "(line 71,col 5)-(line 71,col 49)",
        "(line 72,col 5)-(line 72,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.endObject()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 33)",
        "(line 77,col 5)-(line 77,col 15)",
        "(line 78,col 5)-(line 78,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.hasNext()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 29)",
        "(line 83,col 5)-(line 83,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.peek()",
      "begin_line": 86,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 5)",
        "(line 91,col 5)-(line 91,col 27)",
        "(line 92,col 5)-(line 126,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.peekStack()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.popStack()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.expect(com.google.gson.stream.JsonToken)",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextName()",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 27)",
        "(line 145,col 5)-(line 145,col 46)",
        "(line 146,col 5)-(line 146,col 55)",
        "(line 147,col 5)-(line 147,col 32)",
        "(line 148,col 5)-(line 148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextString()",
      "begin_line": 151,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 29)",
        "(line 153,col 5)-(line 155,col 5)",
        "(line 156,col 5)-(line 156,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextBoolean()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 30)",
        "(line 161,col 5)-(line 161,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextNull()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 27)",
        "(line 166,col 5)-(line 166,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextDouble()",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 29)",
        "(line 171,col 5)-(line 173,col 5)",
        "(line 174,col 5)-(line 174,col 64)",
        "(line 175,col 5)-(line 177,col 5)",
        "(line 178,col 5)-(line 178,col 15)",
        "(line 179,col 5)-(line 179,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextLong()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 29)",
        "(line 184,col 5)-(line 186,col 5)",
        "(line 187,col 5)-(line 187,col 60)",
        "(line 188,col 5)-(line 188,col 15)",
        "(line 189,col 5)-(line 189,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.nextInt()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 29)",
        "(line 194,col 5)-(line 196,col 5)",
        "(line 197,col 5)-(line 197,col 58)",
        "(line 198,col 5)-(line 198,col 15)",
        "(line 199,col 5)-(line 199,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.close()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 18)",
        "(line 204,col 5)-(line 204,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.skipValue()",
      "begin_line": 207,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.toString()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.bind.JsonTreeReader.promoteNameToValue()",
      "begin_line": 219,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 27)",
        "(line 221,col 5)-(line 221,col 46)",
        "(line 222,col 5)-(line 222,col 55)",
        "(line 223,col 5)-(line 223,col 32)",
        "(line 224,col 5)-(line 224,col 57)"
      ]
    }
  ]
}