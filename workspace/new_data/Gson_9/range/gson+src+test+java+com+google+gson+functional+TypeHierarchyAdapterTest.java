{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/TypeHierarchyAdapterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHierarchyAdapterTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 221,
      "comment": "\n * Test that the hierarchy adapter works when subtypes are used.\n "
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.testTypeHierarchy()",
      "begin_line": 37,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 33)",
        "(line 39,col 5)-(line 39,col 25)",
        "(line 40,col 5)-(line 40,col 26)",
        "(line 41,col 5)-(line 45,col 6)",
        "(line 47,col 5)-(line 47,col 25)",
        "(line 48,col 5)-(line 48,col 25)",
        "(line 49,col 5)-(line 49,col 26)",
        "(line 50,col 5)-(line 50,col 50)",
        "(line 52,col 5)-(line 56,col 6)",
        "(line 58,col 5)-(line 61,col 18)",
        "(line 63,col 5)-(line 63,col 36)",
        "(line 64,col 5)-(line 64,col 23)",
        "(line 66,col 5)-(line 66,col 54)",
        "(line 67,col 5)-(line 104,col 19)",
        "(line 106,col 5)-(line 106,col 56)",
        "(line 107,col 5)-(line 107,col 59)",
        "(line 108,col 5)-(line 108,col 56)",
        "(line 109,col 5)-(line 109,col 76)",
        "(line 110,col 5)-(line 110,col 78)",
        "(line 111,col 5)-(line 111,col 78)",
        "(line 112,col 5)-(line 112,col 78)",
        "(line 113,col 5)-(line 114,col 62)",
        "(line 115,col 5)-(line 116,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.testRegisterSuperTypeFirst()",
      "begin_line": 119,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 123,col 18)",
        "(line 125,col 5)-(line 125,col 36)",
        "(line 126,col 5)-(line 126,col 29)",
        "(line 128,col 5)-(line 128,col 54)",
        "(line 129,col 5)-(line 129,col 36)",
        "(line 130,col 5)-(line 130,col 56)",
        "(line 131,col 5)-(line 131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.testRegisterSubTypeFirstAllowed()",
      "begin_line": 135,
      "end_line": 140,
      "comment": " This behaviour changed in Gson 2.1; it used to throw. ",
      "child_ranges": [
        "(line 136,col 5)-(line 139,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ManagerAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.functional.TypeHierarchyAdapterTest.Manager\u003e",
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.TypeHierarchyAdapterTest.Manager\u003e"
      ],
      "begin_line": 142,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.ManagerAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 37)",
        "(line 145,col 7)-(line 145,col 41)",
        "(line 146,col 7)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.ManagerAdapter.serialize(com.google.gson.functional.TypeHierarchyAdapterTest.Manager, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EmployeeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.functional.TypeHierarchyAdapterTest.Employee\u003e",
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.functional.TypeHierarchyAdapterTest.Employee\u003e"
      ],
      "begin_line": 153,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.EmployeeAdapter.serialize(com.google.gson.functional.TypeHierarchyAdapterTest.Employee, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 154,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 43)",
        "(line 157,col 7)-(line 157,col 77)",
        "(line 158,col 7)-(line 158,col 81)",
        "(line 159,col 7)-(line 164,col 7)",
        "(line 165,col 7)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.EmployeeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 168,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 170,col 7)-(line 170,col 49)",
        "(line 171,col 7)-(line 171,col 29)",
        "(line 174,col 7)-(line 174,col 54)",
        "(line 175,col 7)-(line 178,col 7)",
        "(line 181,col 7)-(line 181,col 49)",
        "(line 182,col 7)-(line 187,col 7)",
        "(line 189,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 192,col 78)",
        "(line 193,col 7)-(line 193,col 88)",
        "(line 194,col 7)-(line 194,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Employee",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 198,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "userid"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startDate"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.Employee.Employee(java.lang.String, long)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 7)-(line 203,col 27)",
        "(line 204,col 7)-(line 204,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.TypeHierarchyAdapterTest.Employee.Employee()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Manager",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.TypeHierarchyAdapterTest.Employee"
      ],
      "begin_line": 210,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minions"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CEO",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.functional.TypeHierarchyAdapterTest.Manager"
      ],
      "begin_line": 214,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assistant"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Company",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 218,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ceo"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    }
  ]
}