{
  "filepath": "/tmp/Mockito-18b/test/org/mockito/internal/junit/JUnitRuleTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JUnitRuleTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jUnitRule"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectTestCase"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.shouldInjectIntoTestCase()",
      "begin_line": 19,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 73)",
        "(line 22,col 9)-(line 22,col 81)",
        "(line 23,col 9)-(line 23,col 85)",
        "(line 24,col 9)-(line 24,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.shouldRethrowException()",
      "begin_line": 27,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 34,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.shouldDetectUnfinishedStubbing()",
      "begin_line": 37,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyStatement",
      "is_interface": false,
      "parent_types": [
        "org.junit.runners.model.Statement"
      ],
      "begin_line": 46,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.DummyStatement.evaluate()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ExceptionStatement",
      "is_interface": false,
      "parent_types": [
        "org.junit.runners.model.Statement"
      ],
      "begin_line": 52,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.ExceptionStatement.evaluate()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnfinishedStubbingStatement",
      "is_interface": false,
      "parent_types": [
        "org.junit.runners.model.Statement"
      ],
      "begin_line": 59,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.UnfinishedStubbingStatement.evaluate()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 65)",
        "(line 63,col 13)-(line 63,col 57)",
        "(line 64,col 13)-(line 64,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InjectTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injected"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectInto"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.dummy()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.unfinishedStubbingThrowsException()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.getInjected()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.getInjectInto()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Injected",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.Injected.stringMethod()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 17)-(line 94,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InjectInto",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 98,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injected"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.junit.JUnitRuleTest.InjectTestCase.InjectInto.getInjected()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 17)-(line 102,col 32)"
      ]
    }
  ]
}