{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/MockInjectionUsingSetterOrPropertyTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockInjectionUsingSetterOrPropertyTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 23,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "superUnderTestWithoutInjection"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "superUnderTest"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUnderTest"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subUnderTest"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "otherBaseUnderTest"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUnderTestingInstance"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initializedBase"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notInitializedBase"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initializedSpy"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notInitializedSpy"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "histogram1"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "histogram2"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "searchTree"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockUtil"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.init()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldKeepSameInstanceIfFieldInitialized()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInitializeAnnotatedFieldIfNull()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldIInjectMocksInSpy()",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInitializeSpyIfNullAndInjectMocks()",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)",
        "(line 70,col 9)-(line 70,col 52)",
        "(line 71,col 9)-(line 71,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInjectMocksIfAnnotated()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 43)",
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldNotInjectIfNotAnnotated()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 43)",
        "(line 83,col 9)-(line 83,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInjectMocksForClassHierarchyIfAnnotated()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 51)",
        "(line 90,col 9)-(line 90,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInjectMocksByName()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)",
        "(line 96,col 9)-(line 96,col 61)",
        "(line 97,col 9)-(line 97,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInjectSpies()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldInstantiateInjectMockFieldIfPossible()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldKeepInstanceOnInjectMockFieldIfPresent()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.shouldReportNicely()",
      "begin_line": 116,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 10)",
        "(line 121,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "failingConstructor"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ThrowingConstructor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.ThrowingConstructor.ThrowingConstructor()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 131,col 33)-(line 131,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SuperUnderTesting",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 134,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aList"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.SuperUnderTesting.getAList()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BaseUnderTesting",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.SuperUnderTesting"
      ],
      "begin_line": 143,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aMap"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.BaseUnderTesting.getAMap()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OtherBaseUnderTesting",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.SuperUnderTesting"
      ],
      "begin_line": 151,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "searchTree"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.OtherBaseUnderTesting.getSearchTree()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SubUnderTesting",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.BaseUnderTesting"
      ],
      "begin_line": 159,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "histogram1"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "histogram2"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.SubUnderTesting.getHistogram1()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.MockInjectionUsingSetterOrPropertyTest.SubUnderTesting.getHistogram2()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 30)"
      ]
    }
  ]
}