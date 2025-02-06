{
  "filepath": "/tmp/Mockito-38b/test/org/mockito/internal/util/copy/LenientCopyToolTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LenientCopyToolTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 16,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tool"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InheritMe",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "protectedInherited"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateInherited"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SomeObject",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.copy.LenientCopyToolTest.InheritMe"
      ],
      "begin_line": 26,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticField"
      ],
      "begin_line": 27,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateField"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "privateTransientField"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultField"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "protectedField"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instancePublicField"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finalField"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.SomeObject.SomeObject(int)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SomeOtherObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "from"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "to"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldShallowCopyBasicFinalField()",
      "begin_line": 48,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 44)",
        "(line 55,col 9)-(line 55,col 34)",
        "(line 58,col 9)-(line 58,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldShallowCopyTransientPrivateFields()",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 42)",
        "(line 65,col 9)-(line 65,col 56)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 71,col 9)-(line 71,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldShallowCopyLinkedListIntoMock()",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 51)",
        "(line 81,col 9)-(line 81,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldShallowCopyFieldValuesIntoMock()",
      "begin_line": 86,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 34)",
        "(line 90,col 9)-(line 90,col 57)",
        "(line 91,col 9)-(line 91,col 30)",
        "(line 92,col 9)-(line 92,col 39)",
        "(line 93,col 9)-(line 93,col 32)",
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 74)",
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 78)",
        "(line 99,col 9)-(line 99,col 64)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 105,col 9)-(line 105,col 57)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 107,col 9)-(line 107,col 57)",
        "(line 108,col 9)-(line 108,col 75)",
        "(line 109,col 9)-(line 109,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldCopyValuesOfInheritedFields()",
      "begin_line": 112,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 54)",
        "(line 118,col 9)-(line 118,col 96)",
        "(line 119,col 9)-(line 119,col 96)",
        "(line 122,col 9)-(line 122,col 34)",
        "(line 125,col 9)-(line 125,col 93)",
        "(line 126,col 9)-(line 126,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldEnableAndThenDisableAccessibility()",
      "begin_line": 129,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 79)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 140,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.copy.LenientCopyToolTest.shouldContinueEvenIfThereAreProblemsCopyingSingleFieldValue()",
      "begin_line": 143,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 51)",
        "(line 148,col 9)-(line 152,col 62)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 158,col 9)-(line 158,col 87)"
      ]
    }
  ]
}