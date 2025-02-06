{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/TreeTypeAdaptersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeTypeAdaptersTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 178,
      "comment": "\n * Collection of functional tests for DOM tree based type adapters.\n "
    },
    {
      "type": "field",
      "varNames": [
        "STUDENT1_ID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUDENT2_ID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUDENT1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STUDENT2"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_COURSE_HISTORY"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COURSE_ID"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gson"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "course"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.setUp()",
      "begin_line": 54,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 58,col 18)",
        "(line 59,col 5)-(line 60,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.testSerializeId()",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 59)",
        "(line 65,col 5)-(line 65,col 68)",
        "(line 66,col 5)-(line 66,col 70)",
        "(line 67,col 5)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.testDeserializeId()",
      "begin_line": 70,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 72,col 42)",
        "(line 73,col 5)-(line 73,col 76)",
        "(line 74,col 5)-(line 74,col 65)",
        "(line 75,col 5)-(line 75,col 65)",
        "(line 76,col 5)-(line 76,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Id",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeOfId"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Id.Id(java.lang.String, java.lang.reflect.Type)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 25)",
        "(line 86,col 7)-(line 86,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Id.getValue()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdTreeTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Id\u003c?\u003e\u003e",
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Id\u003c?\u003e\u003e"
      ],
      "begin_line": 93,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.IdTreeTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 96,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 100,col 7)-(line 102,col 7)",
        "(line 103,col 7)-(line 103,col 72)",
        "(line 106,col 7)-(line 106,col 68)",
        "(line 107,col 7)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.IdTreeTypeAdapter.serialize(com.google.gson.functional.TreeTypeAdaptersTest.Id\u003c?\u003e, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Student",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 116,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Student.Student()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Student.Student(com.google.gson.functional.TreeTypeAdaptersTest.Id\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Student\u003e, java.lang.String)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 19)",
        "(line 126,col 7)-(line 126,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Course",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "students"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "courseId"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAssignments"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignment"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Course.Course()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Course.Course(com.google.gson.functional.TreeTypeAdaptersTest.Id\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Course\u003cT\u003e\u003e, int, com.google.gson.functional.TreeTypeAdaptersTest.Assignment\u003cT\u003e, java.util.List\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Student\u003e)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 31)",
        "(line 144,col 7)-(line 144,col 43)",
        "(line 145,col 7)-(line 145,col 35)",
        "(line 146,col 7)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Course.getId()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Course.getStudents()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Assignment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 156,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Assignment.Assignment()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.Assignment.Assignment(com.google.gson.functional.TreeTypeAdaptersTest.Id\u003ccom.google.gson.functional.TreeTypeAdaptersTest.Assignment\u003cT\u003e\u003e, T)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 19)",
        "(line 166,col 7)-(line 166,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HistoryCourse",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 170,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numClasses"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TreeTypeAdaptersTest.createList(T...)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 32)"
      ]
    }
  ]
}