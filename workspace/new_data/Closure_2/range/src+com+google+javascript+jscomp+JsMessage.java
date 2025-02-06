{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/JsMessage.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessage",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 670,
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
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 31)",
        "(line 210,col 5)-(line 210,col 48)",
        "(line 212,col 5)-(line 212,col 32)",
        "(line 213,col 5)-(line 223,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.hashCode()",
      "begin_line": 226,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 30)",
        "(line 229,col 5)-(line 229,col 45)",
        "(line 230,col 5)-(line 230,col 37)",
        "(line 231,col 5)-(line 231,col 40)",
        "(line 232,col 5)-(line 232,col 60)",
        "(line 233,col 5)-(line 233,col 40)",
        "(line 234,col 5)-(line 234,col 72)",
        "(line 235,col 5)-(line 235,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PlaceholderReference",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence"
      ],
      "begin_line": 239,
      "end_line": 282,
      "comment": " A reference to a placeholder in a translatable message. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.PlaceholderReference(java.lang.String)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.length()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.charAt(int)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 7)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.subSequence(int, int)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.getName()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 7)-(line 263,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.toString()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 7)-(line 268,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.equals(java.lang.Object)",
      "begin_line": 271,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 273,col 7)-(line 275,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.PlaceholderReference.hashCode()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 291,
      "end_line": 451,
      "comment": "\n   * Contains functionality for creating JS messages. Generates authoritative\n   * keys and fingerprints for a message that must stay constant over time.\n   *\n   * This implementation correctly processes unnamed messages and creates a key\n   * for them that looks like MSG_\u003cfingerprint value\u003e.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MSG_EXTERNAL_PATTERN"
      ],
      "begin_line": 293,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getExternalMessageId(java.lang.String)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * @return an external message id or null if this is not an\n     * external message identifier\n     ",
      "child_ranges": [
        "(line 301,col 7)-(line 301,col 59)",
        "(line 302,col 7)-(line 302,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "meaning"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "desc"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hidden"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parts"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "placeholders"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.Builder()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 318,col 7)-(line 318,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.Builder(java.lang.String)",
      "begin_line": 322,
      "end_line": 324,
      "comment": " Creates an instance. ",
      "child_ranges": [
        "(line 323,col 7)-(line 323,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getKey()",
      "begin_line": 327,
      "end_line": 329,
      "comment": " Gets the message\u0027s key (e.g. {@code \"MSG_HELLO\"}). ",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setKey(java.lang.String)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "\n     * @param key a key that should uniquely identify this message; typically\n     *     it is the message\u0027s name (e.g. {@code \"MSG_HELLO\"}).\n     ",
      "child_ranges": [
        "(line 336,col 7)-(line 336,col 21)",
        "(line 337,col 7)-(line 337,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setSourceName(java.lang.String)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "\n     * @param sourceName The message\u0027s sourceName.\n     ",
      "child_ranges": [
        "(line 344,col 7)-(line 344,col 35)",
        "(line 345,col 7)-(line 345,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.appendPlaceholderReference(java.lang.String)",
      "begin_line": 351,
      "end_line": 356,
      "comment": "\n     * Appends a placeholder reference to the message\n     ",
      "child_ranges": [
        "(line 352,col 7)-(line 352,col 77)",
        "(line 353,col 7)-(line 353,col 48)",
        "(line 354,col 7)-(line 354,col 29)",
        "(line 355,col 7)-(line 355,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.appendStringPart(java.lang.String)",
      "begin_line": 359,
      "end_line": 364,
      "comment": " Appends a translatable string literal to the message. ",
      "child_ranges": [
        "(line 360,col 7)-(line 361,col 58)",
        "(line 362,col 7)-(line 362,col 22)",
        "(line 363,col 7)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getPlaceholders()",
      "begin_line": 367,
      "end_line": 369,
      "comment": " Returns the message registered placeholders ",
      "child_ranges": [
        "(line 368,col 7)-(line 368,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setDesc(java.lang.String)",
      "begin_line": 372,
      "end_line": 375,
      "comment": " Sets the description of the message, which helps translators. ",
      "child_ranges": [
        "(line 373,col 7)-(line 373,col 23)",
        "(line 374,col 7)-(line 374,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setMeaning(java.lang.String)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\n     * Sets the programmer-specified meaning of this message, which\n     * forces this message to translate differently.\n     ",
      "child_ranges": [
        "(line 382,col 7)-(line 382,col 29)",
        "(line 383,col 7)-(line 383,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.setIsHidden(boolean)",
      "begin_line": 387,
      "end_line": 390,
      "comment": " Sets whether the message should be hidden from volunteer translators. ",
      "child_ranges": [
        "(line 388,col 7)-(line 388,col 27)",
        "(line 389,col 7)-(line 389,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.hasParts()",
      "begin_line": 393,
      "end_line": 395,
      "comment": " Gets whether at least one part has been appended. ",
      "child_ranges": [
        "(line 394,col 7)-(line 394,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.getParts()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 7)-(line 398,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.build()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 7)-(line 402,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.build(com.google.javascript.jscomp.JsMessage.IdGenerator)",
      "begin_line": 405,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 406,col 7)-(line 406,col 34)",
        "(line 407,col 7)-(line 407,col 33)",
        "(line 408,col 7)-(line 408,col 23)",
        "(line 410,col 7)-(line 415,col 7)",
        "(line 417,col 7)-(line 423,col 7)",
        "(line 425,col 7)-(line 429,col 7)",
        "(line 431,col 7)-(line 432,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Builder.fingerprint(java.util.List\u003cjava.lang.CharSequence\u003e)",
      "begin_line": 439,
      "end_line": 450,
      "comment": "\n     * Generates a compact uppercase alphanumeric text representation of a\n     * 63-bit fingerprint of the content parts of a message.\n     ",
      "child_ranges": [
        "(line 440,col 7)-(line 440,col 45)",
        "(line 441,col 7)-(line 447,col 7)",
        "(line 448,col 7)-(line 448,col 73)",
        "(line 449,col 7)-(line 449,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Hash",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 476,
      "end_line": 653,
      "comment": "\n   * This class contains routines for hashing.\n   *\n   * \u003cp\u003eThe hash takes a byte array representing arbitrary data (a\n   * number, String, or Object) and turns it into a small, hopefully\n   * unique, number. There are additional convenience functions which\n   * hash int, long, and String types.\n   *\n   * \u003cp\u003e\u003cb\u003eNote\u003c/b\u003e: this hash has weaknesses in the two\n   * most-significant key bits and in the three least-significant seed\n   * bits. The weaknesses are small and practically speaking, will not\n   * affect the distribution of hash values. Still, it would be good\n   * practice not to choose seeds 0, 1, 2, 3, ..., n to yield n,\n   * independent hash functions. Use pseudo-random seeds instead.\n   *\n   * \u003cp\u003eThis code is based on the work of Craig Silverstein and Sanjay\n   * Ghemawat in, then forked from com.google.common.\n   *\n   * \u003cp\u003eThe original code for the hash function is courtesy\n   * \u003ca href\u003d\"http://burtleburtle.net/bob/hash/evahash.html\"\u003eBob Jenkins\u003c/a\u003e.\n   *\n   * \u003cp\u003eTODO: Add stream hashing functionality.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.Hash()",
      "begin_line": 477,
      "end_line": 477,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SEED64"
      ],
      "begin_line": 480,
      "end_line": 481,
      "comment": " Default hash seed (64 bit) "
    },
    {
      "type": "field",
      "varNames": [
        "CONSTANT64"
      ],
      "begin_line": 484,
      "end_line": 485,
      "comment": " Hash constant (64 bit) "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(java.lang.String)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Hash a string to a 64 bit value. The digits of pi are used for\n     * the hash seed.\n     *\n     * @param value the string to hash\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 500,col 7)-(line 500,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(java.lang.String, long)",
      "begin_line": 510,
      "end_line": 515,
      "comment": "\n     * Hash a string to a 64 bit value using the supplied seed.\n     *\n     * @param value the string to hash\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 511,col 7)-(line 513,col 7)",
        "(line 514,col 7)-(line 514,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(byte[], long)",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Hash byte array to a 64 bit value using the supplied seed.\n     *\n     * @param value the bytes to hash\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 525,col 7)-(line 525,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.hash64(byte[], int, int, long)",
      "begin_line": 539,
      "end_line": 622,
      "comment": "\n     * Hash byte array to a 64 bit value using the supplied seed.\n     *\n     * @param value the bytes to hash\n     * @param offset the starting position of value where bytes are\n     * used for the hash computation\n     * @param length number of bytes of value that are used for the\n     * hash computation\n     * @param seed the seed\n     * @return 64 bit hash value\n     ",
      "child_ranges": [
        "(line 542,col 7)-(line 542,col 26)",
        "(line 543,col 7)-(line 543,col 17)",
        "(line 544,col 7)-(line 544,col 20)",
        "(line 545,col 7)-(line 545,col 17)",
        "(line 547,col 7)-(line 565,col 7)",
        "(line 567,col 7)-(line 567,col 18)",
        "(line 568,col 7)-(line 620,col 7)",
        "(line 621,col 7)-(line 621,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.word64At(byte[], int)",
      "begin_line": 624,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 625,col 7)-(line 632,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.Hash.mix64(long, long, long)",
      "begin_line": 638,
      "end_line": 652,
      "comment": "\n     * Mixes longs a, b, and c, and returns the final value of c.\n     ",
      "child_ranges": [
        "(line 639,col 7)-(line 639,col 13)",
        "(line 639,col 15)-(line 639,col 21)",
        "(line 639,col 23)-(line 639,col 36)",
        "(line 640,col 7)-(line 640,col 13)",
        "(line 640,col 15)-(line 640,col 21)",
        "(line 640,col 23)-(line 640,col 34)",
        "(line 641,col 7)-(line 641,col 13)",
        "(line 641,col 15)-(line 641,col 21)",
        "(line 641,col 23)-(line 641,col 35)",
        "(line 642,col 7)-(line 642,col 13)",
        "(line 642,col 15)-(line 642,col 21)",
        "(line 642,col 23)-(line 642,col 36)",
        "(line 643,col 7)-(line 643,col 13)",
        "(line 643,col 15)-(line 643,col 21)",
        "(line 643,col 23)-(line 643,col 35)",
        "(line 644,col 7)-(line 644,col 13)",
        "(line 644,col 15)-(line 644,col 21)",
        "(line 644,col 23)-(line 644,col 35)",
        "(line 645,col 7)-(line 645,col 13)",
        "(line 645,col 15)-(line 645,col 21)",
        "(line 645,col 23)-(line 645,col 36)",
        "(line 646,col 7)-(line 646,col 13)",
        "(line 646,col 15)-(line 646,col 21)",
        "(line 646,col 23)-(line 646,col 35)",
        "(line 647,col 7)-(line 647,col 13)",
        "(line 647,col 15)-(line 647,col 21)",
        "(line 647,col 23)-(line 647,col 36)",
        "(line 648,col 7)-(line 648,col 13)",
        "(line 648,col 15)-(line 648,col 21)",
        "(line 648,col 23)-(line 648,col 36)",
        "(line 649,col 7)-(line 649,col 13)",
        "(line 649,col 15)-(line 649,col 21)",
        "(line 649,col 23)-(line 649,col 35)",
        "(line 650,col 7)-(line 650,col 13)",
        "(line 650,col 15)-(line 650,col 21)",
        "(line 650,col 23)-(line 650,col 36)",
        "(line 651,col 7)-(line 651,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 655,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessage.IdGenerator.generateId(java.lang.String, java.util.List\u003cjava.lang.CharSequence\u003e)",
      "begin_line": 668,
      "end_line": 668,
      "comment": "\n     * Generate the ID for the message. Messages with the same messageParts\n     * and meaning will get the same id. Messages with the same id\n     * will get the same translation.\n     *\n     * @param meaning The programmer-specified meaning. If no {@code @meaning}\n     *     annotation appears, we will use the name of the variable it\u0027s\n     *     assigned to. If the variable is unnamed, then we will just\n     *     use a fingerprint of the message.\n     * @param messageParts The parts of the message, including the main\n     *     message text.\n     ",
      "child_ranges": []
    }
  ]
}