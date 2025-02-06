{
  "filepath": "/tmp/Closure-2b/src/com/google/debugging/sourcemap/Base64VLQ.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64VLQ",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 127,
      "comment": "\n * We encode our variable length numbers as base64 encoded strings with\n * the least significant digit coming first.  Each base64 digit encodes\n * a 5-bit value (0-31) and a continuation bit.  Signed values can be\n * represented by using the least significant bit of the value as the\n * sign bit.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.Base64VLQ()",
      "begin_line": 45,
      "end_line": 45,
      "comment": " Utility class.",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE_SHIFT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A Base64 VLQ digit can represent 5 bits, so it is base-32."
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_BASE_MASK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " A mask of bits for a VLQ digit (11111), 31 decimal."
    },
    {
      "type": "field",
      "varNames": [
        "VLQ_CONTINUATION_BIT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The continuation bit is the 6th bit."
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.toVLQSigned(int)",
      "begin_line": 63,
      "end_line": 69,
      "comment": "\n   * Converts from a two-complement value to a value where the sign bit is\n   * is placed in the least significant bit.  For example, as decimals:\n   *   1 becomes 2 (10 binary), -1 becomes 3 (11 binary)\n   *   2 becomes 4 (100 binary), -2 becomes 5 (101 binary)\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 68,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.fromVLQSigned(int)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n   * Converts to a two-complement value from a value where the sign bit is\n   * is placed in the least significant bit.  For example, as decimals:\n   *   2 (10 binary) becomes 1, 3 (11 binary) becomes -1\n   *   4 (100 binary) becomes 2, 5 (101 binary) becomes -2\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 38)",
        "(line 79,col 5)-(line 79,col 23)",
        "(line 80,col 5)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.encode(java.lang.Appendable, int)",
      "begin_line": 87,
      "end_line": 98,
      "comment": "\n   * Writes a VLQ encoded value to the provide appendable.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 31)",
        "(line 90,col 5)-(line 97,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharIterator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n   * A simple interface for advancing through a sequence of characters, that\n   * communicates that advance back to the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.CharIterator.hasNext()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.CharIterator.next()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64VLQ.decode(com.google.debugging.sourcemap.Base64VLQ.CharIterator)",
      "begin_line": 112,
      "end_line": 126,
      "comment": "\n   * Decodes the next VLQValue from the provided CharIterator.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 19)",
        "(line 114,col 5)-(line 114,col 25)",
        "(line 115,col 5)-(line 115,col 18)",
        "(line 116,col 5)-(line 123,col 27)",
        "(line 125,col 5)-(line 125,col 33)"
      ]
    }
  ]
}