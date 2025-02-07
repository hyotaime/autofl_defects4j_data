{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/collections/HashCodeAndEqualsMockWrapper.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeAndEqualsMockWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 68,
      "comment": "\n * hashCode and equals safe mock wrapper.\n *\n * \u003cp\u003e\n *     It doesn\u0027t use the actual mock {@link Object#hashCode} and {@link Object#equals} method as they might\n *     throw an NPE if those method cannot be stubbed \u003cem\u003eeven internally\u003c/em\u003e.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n *     Instead the strategy is :\n *     \u003cul\u003e\n *         \u003cli\u003eFor hashCode : \u003cstrong\u003euse {@link System#identityHashCode}\u003c/strong\u003e\u003c/li\u003e\n *         \u003cli\u003eFor equals : \u003cstrong\u003euse the object reference equality\u003c/strong\u003e\u003c/li\u003e\n *     \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @see HashCodeAndEqualsSafeSet\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockInstance"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.HashCodeAndEqualsMockWrapper(java.lang.Object)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.get()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.equals(java.lang.Object)",
      "begin_line": 39,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 35)",
        "(line 42,col 9)-(line 42,col 71)",
        "(line 44,col 9)-(line 44,col 77)",
        "(line 46,col 9)-(line 46,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.hashCode()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.of(java.lang.Object)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.toString()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper.typeInstanceString()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 107)"
      ]
    }
  ]
}