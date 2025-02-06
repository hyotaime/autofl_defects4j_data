{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/Base64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 81,
      "comment": "\n * A utility class for working with Base64 values.\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.Base64.Base64()",
      "begin_line": 28,
      "end_line": 28,
      "comment": " This is a utility class",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "BASE64_MAP"
      ],
      "begin_line": 34,
      "end_line": 37,
      "comment": "\n   *  A map used to convert integer values in the range 0-63 to their base64\n   *  values.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "BASE64_DECODE_MAP"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * A map used to convert base64 character into integer values.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64.toBase64(int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n   * @param value A value in the range of 0-63.\n   * @return a base64 digit.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 71)",
        "(line 56,col 5)-(line 56,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64.fromBase64(char)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n   * @param c A base64 digit.\n   * @return A value in the range of 0-63.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 38)",
        "(line 65,col 5)-(line 65,col 43)",
        "(line 66,col 5)-(line 66,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Base64.base64EncodeInt(int)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\n   * @param value an integer to base64 encode.\n   * @return the six digit long base64 encoded value of the integer.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 27)",
        "(line 75,col 5)-(line 77,col 5)",
        "(line 78,col 5)-(line 78,col 48)",
        "(line 79,col 5)-(line 79,col 25)"
      ]
    }
  ]
}