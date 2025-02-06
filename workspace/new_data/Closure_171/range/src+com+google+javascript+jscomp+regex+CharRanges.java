{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/regex/CharRanges.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharRanges",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 425,
      "comment": "\n * An immutable sparse bitset that deals well where the data is chunky:\n * where P(bit[x+1] \u003d\u003d bit[x]).  E.g. [101,102,103,104,105,1001,1002,1003,1004]\n * is chunky.\n *\n * @author mikesamuel@gmail.com (Mike Samuel)\n "
    },
    {
      "type": "field",
      "varNames": [
        "ranges"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n   * A strictly increasing set of bit indices where even members are the\n   * inclusive starts of ranges, and odd members are the exclusive ends.\n   * \u003cp\u003e\n   * E.g., { 1, 5, 6, 10 } represents the set ( 1, 2, 3, 4, 6, 7, 8, 9 ).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_CODE_UNITS"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.inclusive(int, int)",
      "begin_line": 42,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 45,col 5)",
        "(line 46,col 5)-(line 46,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.withMembers(int...)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Returns an instance containing all and only the given members.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.withRanges(int...)",
      "begin_line": 61,
      "end_line": 70,
      "comment": "\n   * Returns an instance containing the given ranges.\n   * @param ranges An even-length ordered sequence of non-overlapping,\n   *     non-contiguous, [inclusive start, exclusive end) ranges.\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 28)",
        "(line 63,col 5)-(line 63,col 75)",
        "(line 64,col 5)-(line 68,col 5)",
        "(line 69,col 5)-(line 69,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.CharRanges(int[])",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.intArrayToRanges(int[])",
      "begin_line": 76,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 34)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 82,col 5)-(line 82,col 25)",
        "(line 85,col 5)-(line 85,col 18)",
        "(line 86,col 5)-(line 90,col 5)",
        "(line 92,col 5)-(line 92,col 38)",
        "(line 93,col 5)-(line 93,col 27)",
        "(line 94,col 5)-(line 94,col 14)",
        "(line 95,col 5)-(line 102,col 5)",
        "(line 103,col 5)-(line 103,col 44)",
        "(line 104,col 5)-(line 104,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.contains(int)",
      "begin_line": 107,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.minSetBit()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.isEmpty()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.getNumRanges()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 149,col 31)-(line 149,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.start(int)",
      "begin_line": 151,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 151,col 29)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.end(int)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 153,col 27)-(line 153,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.union(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 155,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 44)",
        "(line 159,col 5)-(line 159,col 35)",
        "(line 161,col 5)-(line 161,col 33)",
        "(line 162,col 5)-(line 162,col 32)",
        "(line 166,col 5)-(line 166,col 31)",
        "(line 169,col 5)-(line 169,col 28)",
        "(line 178,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 230,col 5)",
        "(line 232,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.intersection(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 240,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 51)",
        "(line 242,col 5)-(line 242,col 53)",
        "(line 243,col 5)-(line 243,col 35)",
        "(line 244,col 5)-(line 244,col 36)",
        "(line 245,col 5)-(line 245,col 27)",
        "(line 246,col 5)-(line 246,col 55)",
        "(line 247,col 5)-(line 247,col 28)",
        "(line 248,col 5)-(line 248,col 47)",
        "(line 249,col 5)-(line 277,col 5)",
        "(line 278,col 5)-(line 282,col 5)",
        "(line 283,col 5)-(line 283,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.difference(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 286,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 32)",
        "(line 289,col 5)-(line 289,col 47)",
        "(line 291,col 5)-(line 291,col 52)",
        "(line 292,col 5)-(line 292,col 44)",
        "(line 294,col 5)-(line 294,col 47)",
        "(line 297,col 5)-(line 297,col 37)",
        "(line 299,col 5)-(line 299,col 25)",
        "(line 300,col 5)-(line 328,col 5)",
        "(line 330,col 5)-(line 334,col 5)",
        "(line 336,col 5)-(line 336,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.containsAll(com.google.javascript.jscomp.regex.CharRanges)",
      "begin_line": 339,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 36)",
        "(line 341,col 5)-(line 341,col 33)",
        "(line 343,col 5)-(line 343,col 33)",
        "(line 344,col 5)-(line 344,col 65)",
        "(line 345,col 5)-(line 364,col 5)",
        "(line 365,col 5)-(line 365,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.shift(int)",
      "begin_line": 379,
      "end_line": 396,
      "comment": "\n   * Shifts the bits matched by the given delta.\n   * So if this has the bits (a, b, c, ..., z) set then the result has the bits\n   * ((a - delta), (b - delta), (c - delta), ...., (z - delta)) set.\n   *\n   * @throws IndexOutOfBoundsException if shifting by delta would cause an\n   *     overflow or underflow in a 32 bit {@code signed int} range boundary.\n   *     Since the end boundaries of ranges are exclusive, even if there is no\n   *     range containing {@link Integer#MAX_VALUE}, shifting by a delta of 1\n   *     can cause an overflow.\n   ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 26)",
        "(line 381,col 5)-(line 381,col 46)",
        "(line 383,col 5)-(line 389,col 5)",
        "(line 391,col 5)-(line 391,col 37)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 395,col 5)-(line 395,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.toString()",
      "begin_line": 398,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 400,col 43)",
        "(line 401,col 5)-(line 401,col 19)",
        "(line 402,col 5)-(line 406,col 5)",
        "(line 407,col 5)-(line 407,col 19)",
        "(line 408,col 5)-(line 408,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.equals(java.lang.Object)",
      "begin_line": 411,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 413,col 53)",
        "(line 414,col 5)-(line 414,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.regex.CharRanges.hashCode()",
      "begin_line": 417,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 15)",
        "(line 420,col 5)-(line 422,col 5)",
        "(line 423,col 5)-(line 423,col 14)"
      ]
    }
  ]
}