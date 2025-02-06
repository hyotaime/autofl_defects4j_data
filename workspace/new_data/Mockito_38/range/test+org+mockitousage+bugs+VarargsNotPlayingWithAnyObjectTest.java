{
  "filepath": "/tmp/Mockito-38b/test/org/mockitousage/bugs/VarargsNotPlayingWithAnyObjectTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarargsNotPlayingWithAnyObjectTest",
      "is_interface": false,
      "parent_types": [
        "TestBase"
      ],
      "begin_line": 16,
      "end_line": 46,
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
      "signature": "org.mockitousage.bugs.VarargsNotPlayingWithAnyObjectTest.VarargMethod.run(java.lang.String...)",
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
      "signature": "org.mockitousage.bugs.VarargsNotPlayingWithAnyObjectTest.shouldAllowAnyObjectForVarArgs()",
      "begin_line": 25,
      "end_line": 37,
      "comment": "TODO: not yet implemented, reverted fix for issue 62 as it introduced a regression",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 27)",
        "(line 30,col 9)-(line 30,col 49)",
        "(line 31,col 9)-(line 31,col 51)",
        "(line 32,col 9)-(line 32,col 69)",
        "(line 33,col 9)-(line 33,col 53)",
        "(line 35,col 9)-(line 35,col 36)",
        "(line 36,col 9)-(line 36,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitousage.bugs.VarargsNotPlayingWithAnyObjectTest.shouldAllowAnyObjectForVarArgsStubbing()",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 65)",
        "(line 44,col 9)-(line 44,col 48)"
      ]
    }
  ]
}