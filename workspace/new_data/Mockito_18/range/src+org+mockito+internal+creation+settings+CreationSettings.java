{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/creation/settings/CreationSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CreationSettings",
      "is_interface": false,
      "parent_types": [
        "org.mockito.mock.MockCreationSettings\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 22,
      "end_line": 117,
      "comment": "\n * by Szczepan Faber, created at: 4/9/12\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeToMock"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraInterfaces"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spiedInstance"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultAnswer"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockName"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serializableMode"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocationListeners"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stubOnly"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useConstructor"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outerClassInstance"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.CreationSettings()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.CreationSettings(org.mockito.internal.creation.settings.CreationSettings)",
      "begin_line": 39,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 42)",
        "(line 42,col 9)-(line 42,col 52)",
        "(line 43,col 9)-(line 43,col 30)",
        "(line 44,col 9)-(line 44,col 48)",
        "(line 45,col 9)-(line 45,col 48)",
        "(line 46,col 9)-(line 46,col 38)",
        "(line 47,col 9)-(line 47,col 54)",
        "(line 48,col 9)-(line 48,col 60)",
        "(line 49,col 9)-(line 49,col 38)",
        "(line 50,col 9)-(line 50,col 56)",
        "(line 51,col 9)-(line 51,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getTypeToMock()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.setTypeToMock(java.lang.Class\u003cT\u003e)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 37)",
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getExtraInterfaces()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.setExtraInterfaces(java.util.Set\u003cjava.lang.Class\u003e)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getName()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getSpiedInstance()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getDefaultAnswer()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getMockName()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.setMockName(org.mockito.mock.MockName)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)",
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.isSerializable()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getSerializableMode()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getInvocationListeners()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.isUsingConstructor()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.getOuterClassInstance()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.settings.CreationSettings.isStubOnly()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 24)"
      ]
    }
  ]
}