{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/NPEOnAnyClassMatcherAutounboxTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NPEOnAnyClassMatcherAutounboxTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 14,
      "end_line": 26,
      "comment": "see issue 221"
    },
    {
      "type": "class_interface",
      "name": "Foo",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.NPEOnAnyClassMatcherAutounboxTest.Foo.bar(long)",
      "begin_line": 17,
      "end_line": 17,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.NPEOnAnyClassMatcherAutounboxTest.shouldNotThrowNPE()",
      "begin_line": 20,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 22,col 9)-(line 22,col 32)",
        "(line 23,col 9)-(line 23,col 17)",
        "(line 24,col 9)-(line 24,col 39)"
      ]
    }
  ]
}