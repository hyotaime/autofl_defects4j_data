{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/ParameterizedTypeFixtures.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterizedTypeFixtures",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 177,
      "comment": "\n * This class contains some test fixtures for Parameterized types. These classes should ideally\n * belong either in the common or functional package, but they are placed here because they need\n * access to package protected elements of com.google.gson.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "class_interface",
      "name": "MyParameterizedType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.MyParameterizedType(T)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 41,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.getValue()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.getExpectedJson()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 7)-(line 48,col 50)",
        "(line 49,col 7)-(line 49,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.getExpectedJson(java.lang.Object)",
      "begin_line": 52,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 53,col 38)",
        "(line 54,col 7)-(line 75,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.hashCode()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 7)-(line 80,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedType.equals(java.lang.Object)",
      "begin_line": 83,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 88,col 7)",
        "(line 89,col 7)-(line 91,col 7)",
        "(line 92,col 7)-(line 94,col 7)",
        "(line 95,col 7)-(line 95,col 66)",
        "(line 96,col 7)-(line 102,col 7)",
        "(line 103,col 7)-(line 103,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyParameterizedTypeInstanceCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.InstanceCreator\u003ccom.google.gson.ParameterizedTypeFixtures.MyParameterizedType\u003cT\u003e\u003e"
      ],
      "begin_line": 107,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceOfT"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator.MyParameterizedTypeInstanceCreator(T)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Caution the specified instance is reused by the instance creator for each call.\n     * This means that the fields of the same objects will be overwritten by Gson.\n     * This is usually fine in tests since there we deserialize just once, but quite\n     * dangerous in practice.\n     *\n     * @param instanceOfT\n     ",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeInstanceCreator.createInstance(java.lang.reflect.Type)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyParameterizedTypeAdapter",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.JsonSerializer\u003ccom.google.gson.ParameterizedTypeFixtures.MyParameterizedType\u003cT\u003e\u003e",
        "com.google.gson.JsonDeserializer\u003ccom.google.gson.ParameterizedTypeFixtures.MyParameterizedType\u003cT\u003e\u003e"
      ],
      "begin_line": 126,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.getExpectedJson(com.google.gson.ParameterizedTypeFixtures.MyParameterizedType\u003cT\u003e)",
      "begin_line": 128,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 55)",
        "(line 131,col 7)-(line 131,col 86)",
        "(line 132,col 7)-(line 132,col 50)",
        "(line 133,col 7)-(line 133,col 68)",
        "(line 134,col 7)-(line 136,col 7)",
        "(line 137,col 7)-(line 137,col 38)",
        "(line 138,col 7)-(line 140,col 7)",
        "(line 141,col 7)-(line 141,col 21)",
        "(line 142,col 7)-(line 142,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.serialize(com.google.gson.ParameterizedTypeFixtures.MyParameterizedType\u003cT\u003e, java.lang.reflect.Type, com.google.gson.JsonSerializationContext)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 41)",
        "(line 148,col 7)-(line 148,col 31)",
        "(line 149,col 7)-(line 149,col 75)",
        "(line 150,col 7)-(line 150,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.ParameterizedTypeFixtures.MyParameterizedTypeAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)",
      "begin_line": 153,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 84)",
        "(line 157,col 7)-(line 157,col 62)",
        "(line 158,col 7)-(line 158,col 49)",
        "(line 159,col 7)-(line 159,col 70)",
        "(line 161,col 7)-(line 161,col 14)",
        "(line 162,col 7)-(line 168,col 7)",
        "(line 170,col 7)-(line 173,col 7)",
        "(line 174,col 7)-(line 174,col 47)"
      ]
    }
  ]
}