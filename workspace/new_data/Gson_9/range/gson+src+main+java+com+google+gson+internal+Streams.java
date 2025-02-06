{
  "filepath": "/tmp/Gson-9b/gson/src/main/java/com/google/gson/internal/Streams.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Streams",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 121,
      "comment": "\n * Reads and writes GSON parse trees over streams.\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.Streams.Streams()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.parse(com.google.gson.stream.JsonReader)",
      "begin_line": 43,
      "end_line": 66,
      "comment": "\n   * Takes a reader in any state and returns the next value as a JsonElement.\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 27)",
        "(line 45,col 5)-(line 65,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.write(com.google.gson.JsonElement, com.google.gson.stream.JsonWriter)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n   * Writes the JSON element to the writer, recursively.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.writerForAppendable(java.lang.Appendable)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 97)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AppendableWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 84,
      "end_line": 119,
      "comment": "\n   * Adapts an {@link Appendable} so it can be passed anywhere a {@link Writer}\n   * is used.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "appendable"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentWrite"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.AppendableWriter(java.lang.Appendable)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.write(char[], int, int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 93,col 33)",
        "(line 94,col 7)-(line 94,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.write(int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.flush()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.close()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CurrentWrite",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 107,
      "end_line": 118,
      "comment": "\n     * A mutable char sequence pointing at a single char[].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "chars"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.CurrentWrite.length()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.CurrentWrite.charAt(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.internal.Streams.AppendableWriter.CurrentWrite.subSequence(int, int)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 53)"
      ]
    }
  ]
}