{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/FieldExclusionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldExclusionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 92,
      "comment": "\n * Performs some functional testing to ensure GSON infrastructure properly serializes/deserializes\n * fields that either should or should not be included in the output based on the GSON\n * configuration.\n *\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.FieldExclusionTest.setUp()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 18)",
        "(line 39,col 5)-(line 39,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.FieldExclusionTest.testDefaultInnerClassExclusion()",
      "begin_line": 42,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 27)",
        "(line 44,col 5)-(line 44,col 48)",
        "(line 45,col 5)-(line 45,col 40)",
        "(line 46,col 5)-(line 46,col 42)",
        "(line 48,col 5)-(line 48,col 38)",
        "(line 49,col 5)-(line 49,col 36)",
        "(line 50,col 5)-(line 50,col 33)",
        "(line 51,col 5)-(line 51,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.FieldExclusionTest.testInnerClassExclusion()",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 76)",
        "(line 56,col 5)-(line 56,col 48)",
        "(line 57,col 5)-(line 57,col 40)",
        "(line 58,col 5)-(line 58,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.FieldExclusionTest.testDefaultNestedStaticClassIncluded()",
      "begin_line": 61,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 27)",
        "(line 63,col 5)-(line 63,col 48)",
        "(line 64,col 5)-(line 64,col 40)",
        "(line 65,col 5)-(line 65,col 42)",
        "(line 67,col 5)-(line 67,col 38)",
        "(line 68,col 5)-(line 68,col 36)",
        "(line 69,col 5)-(line 69,col 33)",
        "(line 70,col 5)-(line 70,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Outer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Inner",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.FieldExclusionTest.NestedClass"
      ],
      "begin_line": 74,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.FieldExclusionTest.Outer.Inner.Inner(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NestedClass",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.FieldExclusionTest.NestedClass.NestedClass(java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.FieldExclusionTest.NestedClass.toJson()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 45)"
      ]
    }
  ]
}