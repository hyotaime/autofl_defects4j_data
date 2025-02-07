{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/invocation/InvocationsFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationsFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findInvocations(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 19,
      "end_line": 21,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findAllMatchingUnverifiedChunks(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher, org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 23,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 90)",
        "(line 25,col 9)-(line 25,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findMatchingChunk(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher, int, org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 43,
      "end_line": 52,
      "comment": "\n     * some examples how it works:\n     * \n     * Given invocations sequence:\n     * 1,1,2,1\n     * \n     * if wanted is 1 and mode is times(2) then returns\n     * 1,1  \n     * \n     * if wanted is 1 and mode is atLeast() then returns\n     * 1,1,1\n     * \n     * if wanted is 1 and mode is times(x), where x !\u003d 2 then returns\n     * 1,1,1\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 82)",
        "(line 45,col 9)-(line 45,col 80)",
        "(line 47,col 9)-(line 51,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.getFirstMatchingChunk(org.mockito.internal.invocation.InvocationMatcher, java.util.List\u003corg.mockito.invocation.Invocation\u003e)",
      "begin_line": 54,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 67)",
        "(line 56,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstMatchingUnverifiedInvocation(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher, org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findSimilarInvocation(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 75,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstUnverified(java.util.List\u003corg.mockito.invocation.Invocation\u003e)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstUnverified(java.util.List\u003corg.mockito.invocation.Invocation\u003e, java.lang.Object)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.getLastLocation(java.util.List\u003corg.mockito.invocation.Invocation\u003e)",
      "begin_line": 106,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findPreviousVerifiedInOrder(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 115,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 113)",
        "(line 118,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.removeVerifiedInOrder(java.util.List\u003corg.mockito.invocation.Invocation\u003e, org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 125,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveNotMatching",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.collections.ListUtil.Filter\u003corg.mockito.invocation.Invocation\u003e"
      ],
      "begin_line": 137,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wanted"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveNotMatching.RemoveNotMatching(org.mockito.internal.invocation.InvocationMatcher)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveNotMatching.isOut(org.mockito.invocation.Invocation)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveUnverifiedInOrder",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.collections.ListUtil.Filter\u003corg.mockito.invocation.Invocation\u003e"
      ],
      "begin_line": 149,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderingContext"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveUnverifiedInOrder.RemoveUnverifiedInOrder(org.mockito.internal.verification.api.InOrderContext)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.RemoveUnverifiedInOrder.isOut(org.mockito.invocation.Invocation)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.InvocationsFinder.findFirstUnverifiedInOrder(org.mockito.internal.verification.api.InOrderContext, java.util.List\u003corg.mockito.invocation.Invocation\u003e)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * i3 is unverified here:\n     * \n     * i1, i2, i3\n     *     v\n     *     \n     * all good here:\n     * \n     * i1, i2, i3\n     *     v   v\n     * \n     * @param context\n     * @param orderedInvocations\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 36)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 25)"
      ]
    }
  ]
}