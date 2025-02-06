{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/ExposeAnnotationExclusionStrategyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExposeAnnotationExclusionStrategyTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 89,
      "comment": "\n * Unit tests for GsonBuilder.REQUIRE_EXPOSE_DESERIALIZE.\n *\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "excluder"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testNeverSkipClasses()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 63)",
        "(line 36,col 5)-(line 36,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testSkipNonAnnotatedFields()",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 51)",
        "(line 41,col 5)-(line 41,col 47)",
        "(line 42,col 5)-(line 42,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testSkipExplicitlySkippedFields()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 61)",
        "(line 47,col 5)-(line 47,col 47)",
        "(line 48,col 5)-(line 48,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testNeverSkipExposedAnnotatedFields()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 52)",
        "(line 53,col 5)-(line 53,col 48)",
        "(line 54,col 5)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testNeverSkipExplicitlyExposedAnnotatedFields()",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 62)",
        "(line 59,col 5)-(line 59,col 48)",
        "(line 60,col 5)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.testDifferentSerializeAndDeserializeField()",
      "begin_line": 63,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 68)",
        "(line 65,col 5)-(line 65,col 48)",
        "(line 66,col 5)-(line 66,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ExposeAnnotationExclusionStrategyTest.createFieldAttributes(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MockObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exposedField"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "explicitlyExposedField"
      ],
      "begin_line": 78,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "explicitlyHiddenField"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "explicitlyDifferentModeField"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hiddenField"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    }
  ]
}