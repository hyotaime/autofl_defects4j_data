{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/SecurityTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecurityTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 86,
      "comment": "\n * Tests for security-related aspects of Gson\n * \n * @author Inderjeet Singh\n "
    },
    {
      "type": "field",
      "varNames": [
        "JSON_NON_EXECUTABLE_PREFIX"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n   * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX\n   "
    },
    {
      "type": "field",
      "varNames": [
        "gsonBuilder"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.setUp()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 18)",
        "(line 41,col 5)-(line 41,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.testNonExecutableJsonSerialization()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 65)",
        "(line 46,col 5)-(line 46,col 53)",
        "(line 47,col 5)-(line 47,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.testNonExecutableJsonDeserialization()",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 63)",
        "(line 52,col 5)-(line 52,col 37)",
        "(line 53,col 5)-(line 53,col 72)",
        "(line 54,col 5)-(line 54,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenSerialization()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 65)",
        "(line 59,col 5)-(line 59,col 58)",
        "(line 60,col 5)-(line 60,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithRegularGsonDeserialization()",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n   *  Gson should be able to deserialize a stream with non-exectuable token even if it is created\n   *  without {@link GsonBuilder#generateNonExecutableJson()}.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 37)",
        "(line 69,col 5)-(line 69,col 79)",
        "(line 70,col 5)-(line 70,col 72)",
        "(line 71,col 5)-(line 71,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.SecurityTest.testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\n   *  Gson should be able to deserialize a stream with non-exectuable token if it is created\n   *  with {@link GsonBuilder#generateNonExecutableJson()}.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 65)",
        "(line 81,col 5)-(line 81,col 90)",
        "(line 82,col 5)-(line 82,col 72)",
        "(line 83,col 5)-(line 83,col 47)",
        "(line 84,col 5)-(line 84,col 37)"
      ]
    }
  ]
}