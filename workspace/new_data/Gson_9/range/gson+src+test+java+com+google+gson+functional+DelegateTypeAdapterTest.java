{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/DelegateTypeAdapterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DelegateTypeAdapterTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 94,
      "comment": "\n * Functional tests for {@link Gson#getDelegateAdapter(TypeAdapterFactory, TypeToken)} method.\n *\n * @author Inderjeet Singh\n "
    },
    {
      "type": "field",
      "varNames": [
        "stats"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.setUp()",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 18)",
        "(line 46,col 5)-(line 46,col 42)",
        "(line 47,col 5)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvoked()",
      "begin_line": 52,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 66)",
        "(line 54,col 5)-(line 56,col 5)",
        "(line 57,col 5)-(line 57,col 36)",
        "(line 58,col 5)-(line 58,col 83)",
        "(line 60,col 5)-(line 60,col 37)",
        "(line 61,col 5)-(line 61,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.testDelegateInvokedOnStrings()",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 41)",
        "(line 66,col 5)-(line 66,col 36)",
        "(line 67,col 5)-(line 67,col 47)",
        "(line 69,col 5)-(line 69,col 36)",
        "(line 70,col 5)-(line 70,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StatsTypeAdapterFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.TypeAdapterFactory"
      ],
      "begin_line": 73,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numReads"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numWrites"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.StatsTypeAdapterFactory.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken\u003cT\u003e)",
      "begin_line": 77,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 78,col 7)-(line 78,col 74)",
        "(line 79,col 7)-(line 91,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.StatsTypeAdapterFactory.Anonymous-21e9e876-4063-4481-b4a4-77620412bc77.write(com.google.gson.stream.JsonWriter, T)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 11)-(line 82,col 22)",
        "(line 83,col 11)-(line 83,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.DelegateTypeAdapterTest.StatsTypeAdapterFactory.Anonymous-6da44667-9a6a-4968-b3c2-6d56d01517a1.read(com.google.gson.stream.JsonReader)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 11)-(line 88,col 21)",
        "(line 89,col 11)-(line 89,col 35)"
      ]
    }
  ]
}