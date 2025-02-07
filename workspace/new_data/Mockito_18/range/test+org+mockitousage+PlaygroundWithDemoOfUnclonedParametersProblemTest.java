{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/PlaygroundWithDemoOfUnclonedParametersProblemTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PlaygroundWithDemoOfUnclonedParametersProblemTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 23,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "importManager"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "importLogDao"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "importHandler"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.setUp()",
      "begin_line": 30,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 56)",
        "(line 33,col 9)-(line 33,col 59)",
        "(line 34,col 9)-(line 34,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.shouldIncludeInitialLog()",
      "begin_line": 37,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 27)",
        "(line 41,col 9)-(line 41,col 73)",
        "(line 43,col 9)-(line 43,col 78)",
        "(line 44,col 9)-(line 44,col 32)",
        "(line 46,col 9)-(line 46,col 101)",
        "(line 47,col 9)-(line 47,col 106)",
        "(line 50,col 9)-(line 50,col 66)",
        "(line 53,col 9)-(line 53,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.shouldAlterFinalLog()",
      "begin_line": 56,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)",
        "(line 60,col 9)-(line 60,col 73)",
        "(line 62,col 9)-(line 62,col 76)",
        "(line 63,col 9)-(line 63,col 30)",
        "(line 65,col 9)-(line 65,col 101)",
        "(line 66,col 9)-(line 66,col 102)",
        "(line 69,col 9)-(line 69,col 66)",
        "(line 72,col 9)-(line 72,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.byCheckingLogEquals(org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 82,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.Anonymous-f4a1e43f-860a-40dc-9ba9-dab136ae63de.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 17)-(line 78,col 82)",
        "(line 79,col 17)-(line 79,col 43)",
        "(line 80,col 17)-(line 80,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImportManager",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportManager.ImportManager(org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogDao)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 13)-(line 88,col 20)",
        "(line 89,col 13)-(line 89,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "importLogDao"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportManager.startImportProcess(int, java.util.Date)",
      "begin_line": 94,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 47)",
        "(line 97,col 13)-(line 115,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportManager.isOkToImport(int, java.util.Date)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportManager.createResume(int, java.util.Date)",
      "begin_line": 122,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 124,col 32)",
        "(line 126,col 13)-(line 126,col 39)",
        "(line 127,col 13)-(line 127,col 48)",
        "(line 128,col 13)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportManager.finalizeResume(org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImportLogDao",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 136,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogDao.anyImportRunningOrRunnedToday(int, java.util.Date)",
      "begin_line": 137,
      "end_line": 137,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogDao.include(org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean)",
      "begin_line": 139,
      "end_line": 139,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogDao.alter(org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "IImportHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 144,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ImportLogBean",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 147,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentDate"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "importType"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "status"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean.ImportLogBean(java.util.Date, int)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 43)",
        "(line 154,col 13)-(line 154,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean.setStatus(int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean.equals(java.lang.Object)",
      "begin_line": 161,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 39)",
        "(line 164,col 13)-(line 164,col 60)",
        "(line 166,col 13)-(line 166,col 51)",
        "(line 168,col 13)-(line 168,col 60)",
        "(line 169,col 13)-(line 169,col 52)",
        "(line 170,col 13)-(line 170,col 117)",
        "(line 172,col 13)-(line 172,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.PlaygroundWithDemoOfUnclonedParametersProblemTest.ImportLogBean.hashCode()",
      "begin_line": 175,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 74)",
        "(line 178,col 13)-(line 178,col 46)",
        "(line 179,col 13)-(line 179,col 42)",
        "(line 180,col 13)-(line 180,col 26)"
      ]
    }
  ]
}