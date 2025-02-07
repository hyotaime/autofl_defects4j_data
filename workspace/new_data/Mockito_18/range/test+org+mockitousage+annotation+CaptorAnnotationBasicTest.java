{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/annotation/CaptorAnnotationBasicTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CaptorAnnotationBasicTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 20,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Person",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "surname"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.Person.Person(java.lang.String, java.lang.String)",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 28,col 13)-(line 28,col 29)",
        "(line 29,col 13)-(line 29,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.Person.getName()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 13)-(line 33,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.Person.getSurname()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PeopleRepository",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.PeopleRepository.save(org.mockitousage.annotation.CaptorAnnotationBasicTest.Person)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "peopleRepository"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.createPerson(java.lang.String, java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.shouldUseCaptorInOrdinaryWay()",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 40)",
        "(line 57,col 9)-(line 57,col 78)",
        "(line 58,col 9)-(line 58,col 56)",
        "(line 59,col 9)-(line 59,col 57)",
        "(line 60,col 9)-(line 60,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "captor"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.shouldUseAnnotatedCaptor()",
      "begin_line": 65,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)",
        "(line 71,col 9)-(line 71,col 56)",
        "(line 72,col 9)-(line 72,col 57)",
        "(line 73,col 9)-(line 73,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "genericLessCaptor"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.shouldUseGenericlessAnnotatedCaptor()",
      "begin_line": 78,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 40)",
        "(line 84,col 9)-(line 84,col 76)",
        "(line 85,col 9)-(line 85,col 79)",
        "(line 86,col 9)-(line 86,col 87)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "genericListCaptor"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.annotation.CaptorAnnotationBasicTest.shouldCaptureGenericList()",
      "begin_line": 92,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 99,col 9)-(line 99,col 64)",
        "(line 102,col 9)-(line 102,col 55)"
      ]
    }
  ]
}