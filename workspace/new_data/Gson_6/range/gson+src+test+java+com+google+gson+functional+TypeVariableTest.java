{
  "filepath": "/tmp/Gson-6b/gson/src/test/java/com/google/gson/functional/TypeVariableTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeVariableTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 140,
      "comment": "\n * Functional test for Gson serialization and deserialization of\n * classes with type variables.\n *\n * @author Joel Leitch\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeVariableTest.testAdvancedTypeVariables()",
      "begin_line": 38,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 27)",
        "(line 40,col 5)-(line 40,col 46)",
        "(line 41,col 5)-(line 41,col 60)",
        "(line 42,col 5)-(line 42,col 21)",
        "(line 43,col 5)-(line 43,col 21)",
        "(line 44,col 5)-(line 44,col 21)",
        "(line 45,col 5)-(line 45,col 36)",
        "(line 46,col 5)-(line 46,col 51)",
        "(line 47,col 5)-(line 47,col 36)",
        "(line 49,col 5)-(line 49,col 46)",
        "(line 50,col 5)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeVariableTest.testTypeVariablesViaTypeParameter()",
      "begin_line": 53,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 27)",
        "(line 55,col 5)-(line 55,col 76)",
        "(line 56,col 5)-(line 56,col 47)",
        "(line 57,col 5)-(line 57,col 67)",
        "(line 58,col 5)-(line 58,col 46)",
        "(line 59,col 5)-(line 60,col 14)",
        "(line 61,col 5)-(line 61,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeVariableTest.testBasicTypeVariables()",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 27)",
        "(line 66,col 5)-(line 66,col 32)",
        "(line 67,col 5)-(line 67,col 37)",
        "(line 69,col 5)-(line 69,col 49)",
        "(line 70,col 5)-(line 70,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Blue",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.TypeVariableTest.Red\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 73,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Blue.Blue()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 7)-(line 75,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Blue.Blue(boolean)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 7)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeVariableTest.Blue.equals(java.lang.Object)",
      "begin_line": 83,
      "end_line": 90,
      "comment": " Technically, we should implement hashcode too",
      "child_ranges": [
        "(line 85,col 7)-(line 87,col 7)",
        "(line 88,col 7)-(line 88,col 27)",
        "(line 89,col 7)-(line 89,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Red",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "redField"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Red.Red()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Red.Red(S)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Foo",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.TypeVariableTest.Red\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 103,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someSField"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "someTField"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Foo.Foo()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Foo.Foo(S, T, java.lang.Boolean)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 22)",
        "(line 112,col 7)-(line 112,col 31)",
        "(line 113,col 7)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeVariableTest.Foo.equals(java.lang.Object)",
      "begin_line": 117,
      "end_line": 128,
      "comment": " Technically, we should implement hashcode too",
      "child_ranges": [
        "(line 120,col 7)-(line 122,col 7)",
        "(line 123,col 7)-(line 123,col 40)",
        "(line 124,col 7)-(line 127,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Bar",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.TypeVariableTest.Foo\u003cjava.lang.String, java.lang.Integer\u003e"
      ],
      "begin_line": 131,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Bar.Bar()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeVariableTest.Bar.Bar(java.lang.String, java.lang.Integer, boolean)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 7)-(line 137,col 21)"
      ]
    }
  ]
}