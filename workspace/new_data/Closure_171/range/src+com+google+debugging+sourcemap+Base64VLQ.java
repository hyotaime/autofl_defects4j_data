{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/Base64VLQ.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64VLQ",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 114,
      "comment": "\n * We encode our variable length numbers as base64 encoded strings with\n * the least significant digit coming first.  Each base64 digit encodes\n * a 5-bit value (0-31) and a continuation bit.  Signed values can be\n * represented by using the least significant bit of the value as the\n * sign bit.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.Base64VLQ()",
      "begin_line": 32,
      "end_line": 32,
      "comment": " Utility class.",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE_SHIFT"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " A Base64 VLQ digit can represent 5 bits, so it is base-32."
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE_MASK"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " A mask of bits for a VLQ digit (11111), 31 decimal."
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_CONTINUATION_BIT"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The continuation bit is the 6th bit."
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.toVLQSigned(int)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n   * Converts from a two-complement value to a value where the sign bit is\n   * is placed in the least significant bit.  For example, as decimals:\n   *   1 becomes 2 (10 binary), -1 becomes 3 (11 binary)\n   *   2 becomes 4 (100 binary), -2 becomes 5 (101 binary)\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 55,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.fromVLQSigned(int)",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n   * Converts to a two-complement value from a value where the sign bit is\n   * is placed in the least significant bit.  For example, as decimals:\n   *   2 (10 binary) becomes 1, 3 (11 binary) becomes -1\n   *   4 (100 binary) becomes 2, 5 (101 binary) becomes -2\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 38)",
        "(line 66,col 5)-(line 66,col 23)",
        "(line 67,col 5)-(line 67,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.encode(java.lang.Appendable, int)",
      "begin_line": 74,
      "end_line": 85,
      "comment": "\n   * Writes a VLQ encoded value to the provide appendable.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 31)",
        "(line 77,col 5)-(line 84,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharIterator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n   * A simple interface for advancing through a sequence of characters, that\n   * communicates that advance back to the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.CharIterator.hasNext()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.CharIterator.next()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.decode(com.google.debugging.sourcemap.Base64VLQ.CharIterator)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\n   * Decodes the next VLQValue from the provided CharIterator.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 19)",
        "(line 101,col 5)-(line 101,col 25)",
        "(line 102,col 5)-(line 102,col 18)",
        "(line 103,col 5)-(line 110,col 27)",
        "(line 112,col 5)-(line 112,col 33)"
      ]
    }
  ]
}