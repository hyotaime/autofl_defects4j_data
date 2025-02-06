{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/invocation/InvocationsFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationsFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findInvocations(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 16,
      "end_line": 18,
      "comment": "",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findAllMatchingUnverifiedChunks(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 20,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 73)",
        "(line 22,col 9)-(line 22,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findMatchingChunk(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher, int)",
      "begin_line": 40,
      "end_line": 49,
      "comment": "\n     * some examples how it works:\n     * \n     * Given invocations sequence:\n     * 1,1,2,1\n     * \n     * if wanted is 1 and mode is times(2) then returns\n     * 1,1  \n     * \n     * if wanted is 1 and mode is atLeast() then returns\n     * 1,1,1\n     * \n     * if wanted is 1 and mode is times(x), where x !\u003d 2 then returns\n     * 1,1,1\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 73)",
        "(line 42,col 9)-(line 42,col 80)",
        "(line 44,col 9)-(line 48,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.getFirstMatchingChunk(org.mockito.internal.invocation.InvocationMatcher, java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 67)",
        "(line 53,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findSimilarInvocation(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 63,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 39)",
        "(line 65,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstUnverified(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstUnverified(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e, java.lang.Object)",
      "begin_line": 84,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.getLastLocation(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e)",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findPreviousVerifiedInOrder(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e)",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 106)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.removeVerifiedInOrder(java.util.List\u003corg.mockito.internal.invocation.Invocation\u003e)",
      "begin_line": 113,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 67)",
        "(line 115,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveNotMatching",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.ListUtil.Filter\u003corg.mockito.internal.invocation.Invocation\u003e"
      ],
      "begin_line": 125,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveNotMatching.RemoveNotMatching(org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveNotMatching.isOut(org.mockito.internal.invocation.Invocation)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveUnverifiedInOrder",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.ListUtil.Filter\u003corg.mockito.internal.invocation.Invocation\u003e"
      ],
      "begin_line": 137,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveUnverifiedInOrder.isOut(org.mockito.internal.invocation.Invocation)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 13)-(line 139,col 51)"
      ]
    }
  ]
}