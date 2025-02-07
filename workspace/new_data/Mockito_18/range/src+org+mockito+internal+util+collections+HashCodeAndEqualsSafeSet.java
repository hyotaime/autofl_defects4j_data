{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/util/collections/HashCodeAndEqualsSafeSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashCodeAndEqualsSafeSet",
      "is_interface": false,
      "parent_types": [
        "java.util.Set\u003cjava.lang.Object\u003e"
      ],
      "begin_line": 32,
      "end_line": 158,
      "comment": "\n * hashCode and equals safe hash based set.\n *\n * \u003cp\u003e\n *     Useful for holding mocks that have un-stubbable hashCode or equals method,\n *     meaning that in this scenario the real code is always called and will most probably\n *     cause an {@link NullPointerException}.\n * \u003c/p\u003e\n * \u003cp\u003e\n *     This collection wraps the mock in an augmented type {@link HashCodeAndEqualsMockWrapper}\n *     that have his own implementation.\n * \u003c/p\u003e\n *\n * @see HashCodeAndEqualsMockWrapper\n "
    },
    {
      "type": "field",
      "varNames": [
        "backingHashSet"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.iterator()",
      "begin_line": 36,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 51,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.Anonymous-f02ce482-6f1b-4919-b89a-14ada9848b3d.hasNext()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 17)-(line 41,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.Anonymous-e2ed5a0b-b325-4f5e-906f-88f45643c1a6.next()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 17)-(line 45,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.Anonymous-01f77d52-09a5-42f0-9989-df7d806c177f.remove()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 17)-(line 49,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.size()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.isEmpty()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.contains(java.lang.Object)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.add(java.lang.Object)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.remove(java.lang.Object)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.clear()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.clone()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.equals(java.lang.Object)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 69)",
        "(line 87,col 9)-(line 87,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.hashCode()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.toArray()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.unwrapTo(T[])",
      "begin_line": 98,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)",
        "(line 100,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.toArray(T[])",
      "begin_line": 109,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 111,col 84)",
        "(line 112,col 9)-(line 112,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.addAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.asWrappedMocks(java.util.Collection\u003c?\u003e)",
      "begin_line": 131,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 80)",
        "(line 133,col 9)-(line 133,col 100)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.toString()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of(java.lang.Object...)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet.of(java.lang.Iterable\u003cjava.lang.Object\u003e)",
      "begin_line": 149,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 91)",
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 40)"
      ]
    }
  ]
}