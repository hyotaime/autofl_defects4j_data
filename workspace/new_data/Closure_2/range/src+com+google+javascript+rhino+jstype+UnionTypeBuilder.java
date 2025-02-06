{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/UnionTypeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnionTypeBuilder",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 329,
      "comment": "\n * A builder for union types.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_UNION_SIZE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " then we should just give up and admit that we have no clue."
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternates"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAllType"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isNativeUnknownType"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "areAllUnknownsChecked"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxUnionSize"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionTypePosition"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " one structural function, or just bails out and uses the top function type."
    },
    {
      "type": "field",
      "varNames": [
        "result"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Memoize the result, in case build() is called multiple times."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.UnionTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry, int)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 29)",
        "(line 105,col 5)-(line 105,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.getAlternates()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 60)",
        "(line 110,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 120,
      "end_line": 281,
      "comment": "\n   * Adds an alternate to the union type under construction. Returns this\n   * for easy chaining.\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 5)",
        "(line 127,col 5)-(line 127,col 51)",
        "(line 129,col 5)-(line 129,col 66)",
        "(line 130,col 5)-(line 130,col 68)",
        "(line 131,col 5)-(line 134,col 5)",
        "(line 135,col 5)-(line 279,col 5)",
        "(line 280,col 5)-(line 280,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion()",
      "begin_line": 288,
      "end_line": 309,
      "comment": "\n   * Reduce the alternates into a non-union type.\n   * If the alternates can\u0027t be accurately represented with a non-union\n   * type, return null.\n   ",
      "child_ranges": [
        "(line 289,col 5)-(line 308,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.build()",
      "begin_line": 316,
      "end_line": 324,
      "comment": "\n   * Creates a union.\n   * @return A UnionType if it has two or more alternates, the\n   *    only alternate if it has one and otherwise {@code NO_TYPE}.\n   ",
      "child_ranges": [
        "(line 317,col 5)-(line 322,col 5)",
        "(line 323,col 5)-(line 323,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnionTypeBuilder.getAlternateListCopy()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 44)"
      ]
    }
  ]
}