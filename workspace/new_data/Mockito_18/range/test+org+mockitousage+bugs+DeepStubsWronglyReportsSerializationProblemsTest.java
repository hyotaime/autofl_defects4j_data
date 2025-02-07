{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/DeepStubsWronglyReportsSerializationProblemsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeepStubsWronglyReportsSerializationProblemsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 32,
      "comment": "\n * In GH issue 99 : https://github.com/mockito/mockito/issues/99\n "
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.DeepStubsWronglyReportsSerializationProblemsTest.should_not_raise_a_mockito_exception_about_serialization_when_accessing_deep_stub()",
      "begin_line": 14,
      "end_line": 18,
      "comment": "",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 117)",
        "(line 17,col 9)-(line 17,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ToBeDeepStubbed",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.bugs.DeepStubsWronglyReportsSerializationProblemsTest.ToBeDeepStubbed.ToBeDeepStubbed()",
      "begin_line": 21,
      "end_line": 21,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.DeepStubsWronglyReportsSerializationProblemsTest.ToBeDeepStubbed.getSomething()",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 13)-(line 24,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NotSerializableShouldBeMocked",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockitousage.bugs.DeepStubsWronglyReportsSerializationProblemsTest.NotSerializableShouldBeMocked.NotSerializableShouldBeMocked(java.lang.String)",
      "begin_line": 29,
      "end_line": 29,
      "comment": "",
      "child_ranges": []
    }
  ]
}