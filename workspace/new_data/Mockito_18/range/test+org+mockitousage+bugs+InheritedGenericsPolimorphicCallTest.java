{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/InheritedGenericsPolimorphicCallTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "//see issue 200\nInheritedGenericsPolimorphicCallTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 22,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MyIterable",
      "is_interface": true,
      "parent_types": [
        "java.lang.Iterable\u003cT\u003e"
      ],
      "begin_line": 26,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InheritedGenericsPolimorphicCallTest.MyIterable.iterator()",
      "begin_line": 27,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MyIterator",
      "is_interface": true,
      "parent_types": [
        "java.util.Iterator\u003cT\u003e"
      ],
      "begin_line": 30,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "myIterator"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InheritedGenericsPolimorphicCallTest.shouldStubbingWork()",
      "begin_line": 37,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 65)",
        "(line 40,col 9)-(line 40,col 63)",
        "(line 41,col 9)-(line 41,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InheritedGenericsPolimorphicCallTest.shouldVerificationWorks()",
      "begin_line": 44,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)",
        "(line 48,col 9)-(line 48,col 36)",
        "(line 49,col 9)-(line 49,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InheritedGenericsPolimorphicCallTest.shouldWorkExactlyAsJavaProxyWould()",
      "begin_line": 52,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 62)",
        "(line 56,col 9)-(line 60,col 11)",
        "(line 62,col 9)-(line 65,col 25)",
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 41)",
        "(line 72,col 9)-(line 72,col 40)",
        "(line 73,col 9)-(line 73,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.InheritedGenericsPolimorphicCallTest.Anonymous-fc89bbfd-ba21-4496-84ed-4c25fa838830.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 32)",
        "(line 59,col 13)-(line 59,col 24)"
      ]
    }
  ]
}