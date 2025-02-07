{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/creation/MockSettingsImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockSettingsImplTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 19,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockSettingsImpl"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invocationListener"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowSettingNullInterface()",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowNonInterfaces()",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowUsingTheSameInterfaceAsExtra()",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowEmptyExtraInterfaces()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowNullArrayOfExtraInterfaces()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldAllowMultipleInterfaces()",
      "begin_line": 50,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 64)",
        "(line 56,col 9)-(line 56,col 70)",
        "(line 57,col 9)-(line 57,col 79)",
        "(line 58,col 9)-(line 58,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldSetMockToBeSerializable()",
      "begin_line": 61,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 40)",
        "(line 67,col 9)-(line 67,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldKnowIfIsSerializable()",
      "begin_line": 70,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 55)",
        "(line 76,col 9)-(line 76,col 40)",
        "(line 79,col 9)-(line 79,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldAddVerboseLoggingListener()",
      "begin_line": 82,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 63)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 91,col 9)-(line 91,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldAddVerboseLoggingListenerOnlyOnce()",
      "begin_line": 94,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 63)",
        "(line 100,col 9)-(line 100,col 59)",
        "(line 103,col 9)-(line 103,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldNotAllowNullListener()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldAddInvocationListener()",
      "begin_line": 112,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 63)",
        "(line 118,col 9)-(line 118,col 65)",
        "(line 121,col 9)-(line 121,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.canAddDuplicateInvocationListeners_ItsNotOurBusinessThere()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 63)",
        "(line 130,col 9)-(line 130,col 125)",
        "(line 133,col 9)-(line 133,col 150)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldReportErrorWhenAddingNoInvocationListeners()",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.creation.MockSettingsImplTest.shouldReportErrorWhenAddingANullInvocationListener()",
      "begin_line": 146,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 153,col 9)"
      ]
    }
  ]
}