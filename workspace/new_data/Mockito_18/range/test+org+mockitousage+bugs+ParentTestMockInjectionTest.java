{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/ParentTestMockInjectionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParentTestMockInjectionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 71,
      "comment": " issue 229 : @Mock fields in super test class are not injected on @InjectMocks fields"
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.injectMocksShouldInjectMocksFromTestSuperClasses()",
      "begin_line": 19,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 45)",
        "(line 22,col 9)-(line 22,col 41)",
        "(line 24,col 9)-(line 24,col 40)",
        "(line 25,col 9)-(line 25,col 37)",
        "(line 26,col 9)-(line 26,col 44)",
        "(line 27,col 9)-(line 27,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BaseTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "daoFromParent"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ImplicitTest",
      "is_interface": false,
      "parent_types": [
        "org.mockitousage.bugs.ParentTestMockInjectionTest.BaseTest"
      ],
      "begin_line": 35,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sut"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "daoFromSub"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.ImplicitTest.setup()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.ImplicitTest.noNullPointerException()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestedSystem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "daoFromParent"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "daoFromSub"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.TestedSystem.businessMethod()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 36)",
        "(line 58,col 13)-(line 58,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DaoA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.DaoA.doQuery()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DaoB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.ParentTestMockInjectionTest.DaoB.doQuery()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "",
      "child_ranges": []
    }
  ]
}