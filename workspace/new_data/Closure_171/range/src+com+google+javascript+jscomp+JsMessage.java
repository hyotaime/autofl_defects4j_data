{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/JsMessage.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessage",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 697,
      "comment": "\n * A representation of a translatable message in JavaScript source code.\n *\n * \u003cp\u003eInstances are created using a {@link JsMessage.Builder},\n * like this:\n * \u003cpre\u003e\n * JsMessage m \u003d new JsMessage.Builder(key)\n *     .appendPart(\"Hi \")\n *     .appendPlaceholderReference(\"firstName\")\n *     .appendPart(\"!\")\n *     .setDesc(\"A welcome message\")\n *     .build();\n * \u003c/pre\u003e\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Style.getFromParams(boolean, boolean)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "\n     * Calculates current messages {@link Style} based on the given arguments.\n     *\n     * @param useClosure if true then use closure style, otherwise not\n     * @param allowLegacyMessages if true then allow legacy messages otherwise\n     *        not\n     * @return the message style based on the given arguments\n     ",
      "child_ranges": [
        "(line 67,col 7)-(line 71,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_REPRESENTATION_FORMAT"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parts"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeholders"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "desc"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hidden"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meaning"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAnonymous"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExternal"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.JsMessage(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List\u003cjava.lang.CharSequence\u003e, java.util.Set\u003cjava.lang.String\u003e, java.lang.String, boolean, java.lang.String)",
      "begin_line": 100,
      "end_line": 119,
      "comment": "\n   * Creates an instance. Client code should use a {@link JsMessage.Builder}.\n   *\n   * @param key a key that should identify this message in sources; typically\n   *     it is the message\u0027s name (e.g. {@code \"MSG_HELLO\"}).\n   * @param id an id that *uniquely* identifies the message in the bundle.\n   *     It could be either the message name or id generated from the message\n   *     content.\n   * @param meaning The user-specified meaning of the message. May be null if\n   *     the user did not specify an explicit meaning.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 42)",
        "(line 106,col 5)-(line 106,col 41)",
        "(line 108,col 5)-(line 108,col 19)",
        "(line 109,col 5)-(line 109,col 17)",
        "(line 110,col 5)-(line 110,col 53)",
        "(line 111,col 5)-(line 111,col 66)",
        "(line 112,col 5)-(line 112,col 21)",
        "(line 113,col 5)-(line 113,col 25)",
        "(line 114,col 5)-(line 114,col 27)",
        "(line 116,col 5)-(line 116,col 33)",
        "(line 117,col 5)-(line 117,col 35)",
        "(line 118,col 5)-(line 118,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.getSourceName()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n   * Gets the message\u0027s sourceName.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.getKey()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Gets the message\u0027s key, or name (e.g. {@code \"MSG_HELLO\"}).\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.isAnonymous()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.isExternal()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.getId()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n   * Gets the message\u0027s id, or name (e.g. {@code \"92430284230902938293\"}).\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.getDesc()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n   * Gets the description associated with this message, intended to help\n   * translators, or null if this message has no description.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.getMeaning()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n   * Gets the meaning annotated to the message, intended to force different\n   * translations.\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.isHidden()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n   * Gets whether this message should be hidden from volunteer translators (to\n   * reduce the chances of a new feature leak).\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.parts()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n   * Gets a read-only list of the parts of this message. Each part is either a\n   * {@link String} or a {@link PlaceholderReference}.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.placeholders()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " Gets a read-only set of the registered placeholders in this message. ",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.toString()",
      "begin_line": 187,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 43)",
        "(line 190,col 5)-(line 192,col 5)",
        "(line 193,col 5)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.isEmpty()",
      "begin_line": 197,
      "end_line": 205,
      "comment": " @return false iff the message is represented by empty string. ",
      "child_ranges": [
        "(line 198,col 5)-(line 202,col 5)",
        "(line 204,col 5)-(line 204,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.equals(java.lang.Object)",
      "begin_line": 207,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 214,col 5)",
        "(line 215,col 5)-(line 215,col 32)",
        "(line 216,col 5)-(line 226,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.hashCode()",
      "begin_line": 229,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 30)",
        "(line 232,col 5)-(line 232,col 45)",
        "(line 233,col 5)-(line 233,col 37)",
        "(line 234,col 5)-(line 234,col 40)",
        "(line 235,col 5)-(line 235,col 60)",
        "(line 236,col 5)-(line 236,col 40)",
        "(line 237,col 5)-(line 237,col 72)",
        "(line 238,col 5)-(line 238,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PlaceholderReference",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 242,
      "end_line": 285,
      "comment": " A reference to a placeholder in a translatable message. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.PlaceholderReference(java.lang.String)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 7)-(line 247,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.length()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 7)-(line 252,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.charAt(int)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.subSequence(int, int)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.getName()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.toString()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 7)-(line 271,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.equals(java.lang.Object)",
      "begin_line": 274,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 276,col 7)-(line 278,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.hashCode()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 7)-(line 283,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 294,
      "end_line": 454,
      "comment": "\n   * Contains functionality for creating JS messages. Generates authoritative\n   * keys and fingerprints for a message that must stay constant over time.\n   *\n   * This implementation correctly processes unnamed messages and creates a key\n   * for them that looks like MSG_\u003cfingerprint value\u003e.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MSG_EXTERNAL_PATTERN"
      ],
      "begin_line": 296,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getExternalMessageId(java.lang.String)",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * @return an external message id or null if this is not an\n     * external message identifier\n     ",
      "child_ranges": [
        "(line 304,col 7)-(line 304,col 59)",
        "(line 305,col 7)-(line 305,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meaning"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "desc"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hidden"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parts"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeholders"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.Builder()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 7)-(line 321,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.Builder(java.lang.String)",
      "begin_line": 325,
      "end_line": 327,
      "comment": " Creates an instance. ",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getKey()",
      "begin_line": 330,
      "end_line": 332,
      "comment": " Gets the message\u0027s key (e.g. {@code \"MSG_HELLO\"}). ",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setKey(java.lang.String)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\n     * @param key a key that should uniquely identify this message; typically\n     *     it is the message\u0027s name (e.g. {@code \"MSG_HELLO\"}).\n     ",
      "child_ranges": [
        "(line 339,col 7)-(line 339,col 21)",
        "(line 340,col 7)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setSourceName(java.lang.String)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "\n     * @param sourceName The message\u0027s sourceName.\n     ",
      "child_ranges": [
        "(line 347,col 7)-(line 347,col 35)",
        "(line 348,col 7)-(line 348,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.appendPlaceholderReference(java.lang.String)",
      "begin_line": 354,
      "end_line": 359,
      "comment": "\n     * Appends a placeholder reference to the message\n     ",
      "child_ranges": [
        "(line 355,col 7)-(line 355,col 77)",
        "(line 356,col 7)-(line 356,col 48)",
        "(line 357,col 7)-(line 357,col 29)",
        "(line 358,col 7)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.appendStringPart(java.lang.String)",
      "begin_line": 362,
      "end_line": 367,
      "comment": " Appends a translatable string literal to the message. ",
      "child_ranges": [
        "(line 363,col 7)-(line 364,col 58)",
        "(line 365,col 7)-(line 365,col 22)",
        "(line 366,col 7)-(line 366,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getPlaceholders()",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Returns the message registered placeholders ",
      "child_ranges": [
        "(line 371,col 7)-(line 371,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setDesc(java.lang.String)",
      "begin_line": 375,
      "end_line": 378,
      "comment": " Sets the description of the message, which helps translators. ",
      "child_ranges": [
        "(line 376,col 7)-(line 376,col 23)",
        "(line 377,col 7)-(line 377,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setMeaning(java.lang.String)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Sets the programmer-specified meaning of this message, which\n     * forces this message to translate differently.\n     ",
      "child_ranges": [
        "(line 385,col 7)-(line 385,col 29)",
        "(line 386,col 7)-(line 386,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setIsHidden(boolean)",
      "begin_line": 390,
      "end_line": 393,
      "comment": " Sets whether the message should be hidden from volunteer translators. ",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 27)",
        "(line 392,col 7)-(line 392,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.hasParts()",
      "begin_line": 396,
      "end_line": 398,
      "comment": " Gets whether at least one part has been appended. ",
      "child_ranges": [
        "(line 397,col 7)-(line 397,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getParts()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.build()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 7)-(line 405,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.build(com.google.javascript.jscomp.JsMessage.IdGenerator)",
      "begin_line": 408,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 409,col 7)-(line 409,col 34)",
        "(line 410,col 7)-(line 410,col 33)",
        "(line 411,col 7)-(line 411,col 23)",
        "(line 413,col 7)-(line 418,col 7)",
        "(line 420,col 7)-(line 426,col 7)",
        "(line 428,col 7)-(line 432,col 7)",
        "(line 434,col 7)-(line 435,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.fingerprint(java.util.List\u003cjava.lang.CharSequence\u003e)",
      "begin_line": 442,
      "end_line": 453,
      "comment": "\n     * Generates a compact uppercase alphanumeric text representation of a\n     * 63-bit fingerprint of the content parts of a message.\n     ",
      "child_ranges": [
        "(line 443,col 7)-(line 443,col 45)",
        "(line 444,col 7)-(line 450,col 7)",
        "(line 451,col 7)-(line 451,col 73)",
        "(line 452,col 7)-(line 452,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Hash",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 479,
      "end_line": 679,
      "comment": "\n   * This class contains routines for hashing.\n   *\n   * \u003cp\u003eThe hash takes a byte array representing arbitrary data (a\n   * number, String, or Object) and turns it into a small, hopefully\n   * unique, number. There are additional convenience functions which\n   * hash int, long, and String types.\n   *\n   * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: this hash has weaknesses in the two\n   * most-significant key bits and in the three least-significant seed\n   * bits. The weaknesses are small and practically speaking, will not\n   * affect the distribution of hash values. Still, it would be good\n   * practice not to choose seeds 0, 1, 2, 3, ..., n to yield n,\n   * independent hash functions. Use pseudo-random seeds instead.\n   *\n   * \u003cp\u003eThis code is based on the work of Craig Silverstein and Sanjay\n   * Ghemawat in, then forked from com.google.common.\n   *\n   * \u003cp\u003eThe original code for the hash function is courtesy\n   * \u003ca href\u003d\"http://burtleburtle.net/bob/hash/evahash.html\"\u003eBob Jenkins\u003c/a\u003e.\n   *\n   * \u003cp\u003eTODO(anatol): Add stream hashing functionality.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.Hash()",
      "begin_line": 480,
      "end_line": 480,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SEED64"
      ],
      "begin_line": 483,
      "end_line": 484,
      "comment": " Default hash seed (64 bit) "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT64"
      ],
      "begin_line": 487,
      "end_line": 488,
      "comment": " Hash constant (64 bit) "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(java.lang.String)",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Hash a string to a 64 bit value. The digits of pi are used for\n     * the hash seed.\n     *\n     * @param value the string to hash\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(java.lang.String, long)",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * Hash a string to a 64 bit value using the supplied seed.\n     *\n     * @param value the string to hash\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 514,col 7)-(line 516,col 7)",
        "(line 517,col 7)-(line 517,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(byte[], long)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * Hash byte array to a 64 bit value using the supplied seed.\n     *\n     * @param value the bytes to hash\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(byte[], int, int, long)",
      "begin_line": 542,
      "end_line": 648,
      "comment": "\n     * Hash byte array to a 64 bit value using the supplied seed.\n     *\n     * @param value the bytes to hash\n     * @param offset the starting position of value where bytes are\n     * used for the hash computation\n     * @param length number of bytes of value that are used for the\n     * hash computation\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 545,col 7)-(line 545,col 26)",
        "(line 546,col 7)-(line 546,col 17)",
        "(line 547,col 7)-(line 547,col 20)",
        "(line 548,col 7)-(line 548,col 17)",
        "(line 550,col 7)-(line 568,col 7)",
        "(line 570,col 7)-(line 570,col 18)",
        "(line 571,col 7)-(line 646,col 7)",
        "(line 647,col 7)-(line 647,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.word64At(byte[], int)",
      "begin_line": 650,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 651,col 7)-(line 658,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.mix64(long, long, long)",
      "begin_line": 664,
      "end_line": 678,
      "comment": "\n     * Mixes longs a, b, and c, and returns the final value of c.\n     ",
      "child_ranges": [
        "(line 665,col 7)-(line 665,col 13)",
        "(line 665,col 15)-(line 665,col 21)",
        "(line 665,col 23)-(line 665,col 36)",
        "(line 666,col 7)-(line 666,col 13)",
        "(line 666,col 15)-(line 666,col 21)",
        "(line 666,col 23)-(line 666,col 34)",
        "(line 667,col 7)-(line 667,col 13)",
        "(line 667,col 15)-(line 667,col 21)",
        "(line 667,col 23)-(line 667,col 35)",
        "(line 668,col 7)-(line 668,col 13)",
        "(line 668,col 15)-(line 668,col 21)",
        "(line 668,col 23)-(line 668,col 36)",
        "(line 669,col 7)-(line 669,col 13)",
        "(line 669,col 15)-(line 669,col 21)",
        "(line 669,col 23)-(line 669,col 35)",
        "(line 670,col 7)-(line 670,col 13)",
        "(line 670,col 15)-(line 670,col 21)",
        "(line 670,col 23)-(line 670,col 35)",
        "(line 671,col 7)-(line 671,col 13)",
        "(line 671,col 15)-(line 671,col 21)",
        "(line 671,col 23)-(line 671,col 36)",
        "(line 672,col 7)-(line 672,col 13)",
        "(line 672,col 15)-(line 672,col 21)",
        "(line 672,col 23)-(line 672,col 35)",
        "(line 673,col 7)-(line 673,col 13)",
        "(line 673,col 15)-(line 673,col 21)",
        "(line 673,col 23)-(line 673,col 36)",
        "(line 674,col 7)-(line 674,col 13)",
        "(line 674,col 15)-(line 674,col 21)",
        "(line 674,col 23)-(line 674,col 36)",
        "(line 675,col 7)-(line 675,col 13)",
        "(line 675,col 15)-(line 675,col 21)",
        "(line 675,col 23)-(line 675,col 35)",
        "(line 676,col 7)-(line 676,col 13)",
        "(line 676,col 15)-(line 676,col 21)",
        "(line 676,col 23)-(line 676,col 36)",
        "(line 677,col 7)-(line 677,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 682,
      "end_line": 696,
      "comment": " ID generator "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.IdGenerator.generateId(java.lang.String, java.util.List\u003cjava.lang.CharSequence\u003e)",
      "begin_line": 695,
      "end_line": 695,
      "comment": "\n     * Generate the ID for the message. Messages with the same messageParts\n     * and meaning will get the same id. Messages with the same id\n     * will get the same translation.\n     *\n     * @param meaning The programmer-specified meaning. If no {@code @meaning}\n     *     annotation appears, we will use the name of the variable it\u0027s\n     *     assigned to. If the variable is unnamed, then we will just\n     *     use a fingerprint of the message.\n     * @param messageParts The parts of the message, including the main\n     *     message text.\n     ",
      "child_ranges": []
    }
  ]
}