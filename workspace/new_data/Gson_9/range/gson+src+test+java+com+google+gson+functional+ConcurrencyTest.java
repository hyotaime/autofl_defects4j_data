{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/ConcurrencyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrencyTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 140,
      "comment": "\r\n * Tests for ensuring Gson thread-safety.\r\n * \r\n * @author Inderjeet Singh\r\n * @author Joel Leitch\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.setUp()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 18)",
        "(line 39,col 5)-(line 39,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.testSingleThreadSerialization()",
      "begin_line": 46,
      "end_line": 51,
      "comment": "\r\n   * Source-code based on\r\n   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081\r\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 36)",
        "(line 48,col 5)-(line 50,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.testSingleThreadDeserialization()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\r\n   * Source-code based on\r\n   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081\r\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.testMultiThreadSerialization()",
      "begin_line": 67,
      "end_line": 92,
      "comment": "\r\n   * Source-code based on\r\n   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081\r\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 60)",
        "(line 69,col 5)-(line 69,col 64)",
        "(line 70,col 5)-(line 70,col 58)",
        "(line 71,col 5)-(line 71,col 64)",
        "(line 72,col 5)-(line 88,col 5)",
        "(line 89,col 5)-(line 89,col 27)",
        "(line 90,col 5)-(line 90,col 26)",
        "(line 91,col 5)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.Anonymous-331dc089-6f06-49ca-8916-948805949480.run()",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 75,col 11)-(line 75,col 42)",
        "(line 76,col 11)-(line 85,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.testMultiThreadDeserialization()",
      "begin_line": 98,
      "end_line": 122,
      "comment": "\r\n   * Source-code based on\r\n   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081\r\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 60)",
        "(line 100,col 5)-(line 100,col 64)",
        "(line 101,col 5)-(line 101,col 58)",
        "(line 102,col 5)-(line 102,col 64)",
        "(line 103,col 5)-(line 118,col 5)",
        "(line 119,col 5)-(line 119,col 27)",
        "(line 120,col 5)-(line 120,col 26)",
        "(line 121,col 5)-(line 121,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ConcurrencyTest.Anonymous-1007514d-8b0a-4514-ae6d-7ff0402834c2.run()",
      "begin_line": 105,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 106,col 11)-(line 115,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 124,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.ConcurrencyTest.MyObject.MyObject()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 131,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.ConcurrencyTest.MyObject.MyObject(java.lang.String, java.lang.String, int)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 17)",
        "(line 136,col 7)-(line 136,col 17)",
        "(line 137,col 7)-(line 137,col 17)"
      ]
    }
  ]
}