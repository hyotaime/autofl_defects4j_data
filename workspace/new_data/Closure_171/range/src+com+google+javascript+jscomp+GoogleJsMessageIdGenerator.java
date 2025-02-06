{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GoogleJsMessageIdGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GoogleJsMessageIdGenerator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessage.IdGenerator"
      ],
      "begin_line": 43,
      "end_line": 247,
      "comment": "\n * An {@link IdGenerator} designed to play nicely with Google\u0027s Translation\n * systems. Each message is scoped to a project id, so that it does\n * not conflict with other messages at Google.\n * \u003cp\u003e\n * Just as reminder what key type used in different formats:\n * \u003col\u003e\n * \u003cli\u003eXMB - id. We export using this format.\n * \u003cli\u003eXTB - id. Internal, result of translation.\n * \u003cli\u003eXLB - name. External, use it if we need to share translation with third\n *     part.\n * \u003cli\u003ePROPERTIES - name.\n * \u003c/ol\u003e\n *\n * @see \u003ca href\u003d\"http://cldr.unicode.org/development/development-process/design-proposals/xmb\"\u003exmb\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "projectId"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.GoogleJsMessageIdGenerator(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Creates an instance.\n   *\n   * @param projectId A TC project name (e.g. \"MyProject\")\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.generateId(java.lang.String, java.util.List\u003cjava.lang.CharSequence\u003e)",
      "begin_line": 56,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 46)",
        "(line 60,col 5)-(line 60,col 43)",
        "(line 61,col 5)-(line 69,col 5)",
        "(line 70,col 5)-(line 70,col 35)",
        "(line 72,col 5)-(line 73,col 64)",
        "(line 74,col 5)-(line 75,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FP",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 224,
      "comment": "\n   * 64-bit fingerprint support.\n   *\n   * Forked from the guava-internal library.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.FP()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.fingerprint(byte[], int, int)",
      "begin_line": 88,
      "end_line": 97,
      "comment": " Generate fingerprint of \"byte[start,limit-1]\". ",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 44)",
        "(line 90,col 7)-(line 90,col 49)",
        "(line 91,col 7)-(line 95,col 7)",
        "(line 96,col 7)-(line 96,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.fingerprint(java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Generate fingerprint of \"str\". Equivalent to UTF-encoding \"str\" into\n     * bytes and then fingerprinting those bytes.\n     ",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 48)",
        "(line 105,col 7)-(line 105,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.hash32(byte[], int, int, int)",
      "begin_line": 108,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 110,col 25)",
        "(line 111,col 7)-(line 111,col 25)",
        "(line 112,col 7)-(line 112,col 12)",
        "(line 113,col 7)-(line 154,col 7)",
        "(line 156,col 7)-(line 156,col 25)",
        "(line 157,col 7)-(line 157,col 26)",
        "(line 158,col 7)-(line 160,col 7)",
        "(line 161,col 7)-(line 163,col 7)",
        "(line 164,col 7)-(line 167,col 7)",
        "(line 168,col 7)-(line 170,col 7)",
        "(line 171,col 7)-(line 173,col 7)",
        "(line 174,col 7)-(line 176,col 7)",
        "(line 177,col 7)-(line 179,col 7)",
        "(line 180,col 7)-(line 182,col 7)",
        "(line 183,col 7)-(line 185,col 7)",
        "(line 186,col 7)-(line 188,col 7)",
        "(line 189,col 7)-(line 192,col 7)",
        "(line 195,col 7)-(line 195,col 13)",
        "(line 196,col 7)-(line 196,col 13)",
        "(line 197,col 7)-(line 197,col 22)",
        "(line 198,col 7)-(line 198,col 13)",
        "(line 199,col 7)-(line 199,col 13)",
        "(line 200,col 7)-(line 200,col 20)",
        "(line 201,col 7)-(line 201,col 13)",
        "(line 202,col 7)-(line 202,col 13)",
        "(line 203,col 7)-(line 203,col 22)",
        "(line 204,col 7)-(line 204,col 13)",
        "(line 205,col 7)-(line 205,col 13)",
        "(line 206,col 7)-(line 206,col 22)",
        "(line 207,col 7)-(line 207,col 13)",
        "(line 208,col 7)-(line 208,col 13)",
        "(line 209,col 7)-(line 209,col 21)",
        "(line 210,col 7)-(line 210,col 13)",
        "(line 211,col 7)-(line 211,col 13)",
        "(line 212,col 7)-(line 212,col 21)",
        "(line 213,col 7)-(line 213,col 13)",
        "(line 214,col 7)-(line 214,col 13)",
        "(line 215,col 7)-(line 215,col 21)",
        "(line 216,col 7)-(line 216,col 13)",
        "(line 217,col 7)-(line 217,col 13)",
        "(line 218,col 7)-(line 218,col 21)",
        "(line 219,col 7)-(line 219,col 13)",
        "(line 220,col 7)-(line 220,col 13)",
        "(line 221,col 7)-(line 221,col 22)",
        "(line 222,col 7)-(line 222,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MessageId",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 235,
      "end_line": 246,
      "comment": "\n   * Generates fingerprint for an English message using the FP package.\n   * This supersedes the message id generation using C fingerprint\n   * functions and JNI.  This is slower than the C implementation (\n   * we\u0027re talking about microseconds here) but it avoids using JNI and\n   * shared libraries.\u003cp\u003e\n   *\n   * Forked from the i18n library.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GoogleJsMessageIdGenerator.MessageId.generateId(java.lang.String, java.lang.String)",
      "begin_line": 236,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 237,col 7)-(line 237,col 40)",
        "(line 238,col 7)-(line 242,col 7)",
        "(line 244,col 7)-(line 244,col 38)"
      ]
    }
  ]
}