{
  "filepath": "/tmp/Mockito-18b/test/org/mockitousage/bugs/varargs/VarargsNotPlayingWithAnyObjectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarargsNotPlayingWithAnyObjectTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 16,
      "end_line": 55,
      "comment": "see issue 62"
    },
    {
      "type": "class_interface",
      "name": "VarargMethod",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.varargs.VarargsNotPlayingWithAnyObjectTest.VarargMethod.run(java.lang.String...)",
      "begin_line": 19,
      "end_line": 19,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.varargs.VarargsNotPlayingWithAnyObjectTest.shouldMatchAnyVararg()",
      "begin_line": 24,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 27)",
        "(line 28,col 9)-(line 28,col 51)",
        "(line 29,col 9)-(line 29,col 69)",
        "(line 31,col 9)-(line 31,col 49)",
        "(line 33,col 9)-(line 33,col 36)",
        "(line 34,col 9)-(line 34,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.varargs.VarargsNotPlayingWithAnyObjectTest.shouldNotAllowUsingAnyObjectForVarArgs()",
      "begin_line": 39,
      "end_line": 47,
      "comment": "see other tests in this package",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 27)",
        "(line 43,col 9)-(line 46,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.varargs.VarargsNotPlayingWithAnyObjectTest.shouldStubUsingAnyVarargs()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 65)",
        "(line 53,col 9)-(line 53,col 48)"
      ]
    }
  ]
}