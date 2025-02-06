{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/GatherSideEffectSubexpressionsCallbackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GatherSideEffectSubexpressionsCallbackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 192,
      "comment": "\n * Tests for {@link GatherSideEffectSubexpressionsCallback}\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testAndOr()",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 43)",
        "(line 36,col 5)-(line 37,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testIllegalArgumentIfNotAndOr()",
      "begin_line": 40,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 54)",
        "(line 42,col 5)-(line 48,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testIllegalArgumentIfNoSideEffectAndOr()",
      "begin_line": 51,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 45)",
        "(line 53,col 5)-(line 59,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testHook()",
      "begin_line": 62,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 41)",
        "(line 65,col 5)-(line 68,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testIllegalArgumentIfNotHook()",
      "begin_line": 71,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 54)",
        "(line 73,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testIllegalArgumentIfNoSideEffectHook()",
      "begin_line": 84,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 47)",
        "(line 86,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.testIllegalArgumentIfHookKeepNeitherBranch()",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 45)",
        "(line 99,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.getNoSideEffectsAndNode()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 39)",
        "(line 113,col 5)-(line 113,col 62)",
        "(line 114,col 5)-(line 114,col 62)",
        "(line 116,col 5)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.getSideEffectsAndNode()",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 39)",
        "(line 122,col 5)-(line 122,col 41)",
        "(line 123,col 5)-(line 123,col 61)",
        "(line 124,col 5)-(line 124,col 45)",
        "(line 126,col 5)-(line 126,col 62)",
        "(line 127,col 5)-(line 127,col 35)",
        "(line 129,col 5)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.getNoSideEffectsHookNode()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 41)",
        "(line 135,col 5)-(line 135,col 63)",
        "(line 136,col 5)-(line 136,col 63)",
        "(line 137,col 5)-(line 137,col 63)",
        "(line 139,col 5)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.getSideEffectsHookNode()",
      "begin_line": 142,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 41)",
        "(line 145,col 5)-(line 145,col 42)",
        "(line 146,col 5)-(line 146,col 62)",
        "(line 147,col 5)-(line 147,col 46)",
        "(line 149,col 5)-(line 149,col 42)",
        "(line 150,col 5)-(line 150,col 62)",
        "(line 151,col 5)-(line 151,col 46)",
        "(line 153,col 5)-(line 153,col 63)",
        "(line 154,col 5)-(line 154,col 37)",
        "(line 155,col 5)-(line 155,col 37)",
        "(line 157,col 5)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.checkKeepSimplifiedShortCircuitExpr(com.google.javascript.rhino.Node, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 160,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 39)",
        "(line 163,col 5)-(line 163,col 51)",
        "(line 164,col 5)-(line 165,col 75)",
        "(line 166,col 5)-(line 166,col 59)",
        "(line 168,col 5)-(line 168,col 47)",
        "(line 169,col 5)-(line 171,col 5)",
        "(line 172,col 5)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallbackTest.checkKeepSimplifiedHookExpr(com.google.javascript.rhino.Node, boolean, boolean, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 175,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 39)",
        "(line 180,col 5)-(line 180,col 51)",
        "(line 181,col 5)-(line 182,col 75)",
        "(line 183,col 5)-(line 185,col 65)",
        "(line 186,col 5)-(line 186,col 47)",
        "(line 187,col 5)-(line 189,col 5)",
        "(line 190,col 5)-(line 190,col 35)"
      ]
    }
  ]
}