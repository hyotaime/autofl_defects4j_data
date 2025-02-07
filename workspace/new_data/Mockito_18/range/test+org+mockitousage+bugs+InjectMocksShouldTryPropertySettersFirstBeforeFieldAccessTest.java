{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/InjectMocksShouldTryPropertySettersFirstBeforeFieldAccessTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InjectMocksShouldTryPropertySettersFirstBeforeFieldAccessTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 48,
      "comment": "\n * Issue 211 : @InjectMocks should carry out their work by the method (and not by field) if available \n "
    },
    {
      "type": "field",
      "varNames": [
        "fieldAccess"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertySetterAccess"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "awaitingInjection"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectMocksShouldTryPropertySettersFirstBeforeFieldAccessTest.shouldInjectUsingPropertySetterIfAvailable()",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectMocksShouldTryPropertySettersFirstBeforeFieldAccessTest.shouldInjectFieldIfNoSetter()",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BeanAwaitingInjection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldAccess"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertySetterAccess"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertySetterUsed"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InjectMocksShouldTryPropertySettersFirstBeforeFieldAccessTest.BeanAwaitingInjection.setPropertySetterAccess(java.util.List\u003c?\u003e)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 38)"
      ]
    }
  ]
}