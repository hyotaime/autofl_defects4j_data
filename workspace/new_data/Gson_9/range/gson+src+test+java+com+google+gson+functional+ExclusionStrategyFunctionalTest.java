{
  "filepath": "/tmp/Gson-9b/gson/src/test/java/com/google/gson/functional/ExclusionStrategyFunctionalTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExclusionStrategyFunctionalTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 202,
      "comment": "\n * Performs some functional tests when Gson is instantiated with some common user defined\n * {@link ExclusionStrategy} objects.\n *\n * @author Inderjeet Singh\n * @author Joel Leitch\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXCLUDE_SAMPLE_OBJECT_FOR_TEST"
      ],
      "begin_line": 39,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.Anonymous-aa7e701e-f1b6-44bf-b542-c9dcb019e62a.shouldSkipField(com.google.gson.FieldAttributes)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 7)-(line 41,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.Anonymous-f91f9b23-96e8-4155-afe0-4edb8abc29f3.shouldSkipClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "src"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.setUp()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 18)",
        "(line 53,col 5)-(line 53,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategySerialization()",
      "begin_line": 56,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 72)",
        "(line 58,col 5)-(line 58,col 35)",
        "(line 59,col 5)-(line 59,col 50)",
        "(line 60,col 5)-(line 60,col 53)",
        "(line 61,col 5)-(line 61,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategySerializationDoesNotImpactDeserialization()",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 81)",
        "(line 66,col 5)-(line 66,col 72)",
        "(line 67,col 5)-(line 67,col 79)",
        "(line 68,col 5)-(line 68,col 42)",
        "(line 69,col 5)-(line 69,col 41)",
        "(line 70,col 5)-(line 70,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategyDeserialization()",
      "begin_line": 73,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 73)",
        "(line 75,col 5)-(line 75,col 39)",
        "(line 76,col 5)-(line 76,col 74)",
        "(line 77,col 5)-(line 77,col 78)",
        "(line 78,col 5)-(line 78,col 55)",
        "(line 80,col 5)-(line 80,col 80)",
        "(line 81,col 5)-(line 81,col 45)",
        "(line 84,col 5)-(line 84,col 60)",
        "(line 85,col 5)-(line 85,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategySerializationDoesNotImpactSerialization()",
      "begin_line": 88,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 73)",
        "(line 90,col 5)-(line 90,col 35)",
        "(line 91,col 5)-(line 91,col 49)",
        "(line 92,col 5)-(line 92,col 52)",
        "(line 93,col 5)-(line 93,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExclusionStrategyWithMode()",
      "begin_line": 96,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 99,col 30)",
        "(line 101,col 5)-(line 101,col 73)",
        "(line 102,col 5)-(line 102,col 65)",
        "(line 103,col 5)-(line 103,col 80)",
        "(line 104,col 5)-(line 104,col 77)",
        "(line 105,col 5)-(line 105,col 71)",
        "(line 107,col 5)-(line 107,col 80)",
        "(line 108,col 5)-(line 108,col 54)",
        "(line 111,col 5)-(line 111,col 60)",
        "(line 112,col 5)-(line 112,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExcludeTopLevelClassSerialization()",
      "begin_line": 115,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 118,col 18)",
        "(line 119,col 5)-(line 119,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExcludeTopLevelClassSerializationDoesNotImpactDeserialization()",
      "begin_line": 122,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 18)",
        "(line 126,col 5)-(line 126,col 81)",
        "(line 127,col 5)-(line 127,col 79)",
        "(line 128,col 5)-(line 128,col 42)",
        "(line 129,col 5)-(line 129,col 41)",
        "(line 130,col 5)-(line 130,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExcludeTopLevelClassDeserialization()",
      "begin_line": 133,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 136,col 18)",
        "(line 137,col 5)-(line 137,col 81)",
        "(line 138,col 5)-(line 138,col 79)",
        "(line 139,col 5)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.testExcludeTopLevelClassDeserializationDoesNotImpactSerialization()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 145,col 18)",
        "(line 146,col 5)-(line 146,col 84)",
        "(line 147,col 5)-(line 147,col 49)",
        "(line 148,col 5)-(line 148,col 52)",
        "(line 149,col 5)-(line 149,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.createGson(com.google.gson.ExclusionStrategy, boolean)",
      "begin_line": 152,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 48)",
        "(line 154,col 5)-(line 158,col 5)",
        "(line 159,col 5)-(line 161,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SampleObjectForTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 170,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotatedField"
      ],
      "begin_line": 171,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringField"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longField"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.SampleObjectForTest.SampleObjectForTest()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 7)-(line 177,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.SampleObjectForTest.SampleObjectForTest(int, java.lang.String, long)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 7)-(line 181,col 43)",
        "(line 182,col 7)-(line 182,col 37)",
        "(line 183,col 7)-(line 183,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MyExclusionStrategy",
      "is_interface": false,
      "parent_types": [
        "com.google.gson.ExclusionStrategy"
      ],
      "begin_line": 187,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeToSkip"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.MyExclusionStrategy.MyExclusionStrategy(java.lang.Class\u003c?\u003e)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 7)-(line 191,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.MyExclusionStrategy.shouldSkipClass(java.lang.Class\u003c?\u003e)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.gson.functional.ExclusionStrategyFunctionalTest.MyExclusionStrategy.shouldSkipField(com.google.gson.FieldAttributes)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 199,col 48)"
      ]
    }
  ]
}