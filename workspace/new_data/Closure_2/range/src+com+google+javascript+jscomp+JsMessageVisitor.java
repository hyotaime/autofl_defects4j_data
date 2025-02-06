{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/JsMessageVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessageVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 41,
      "end_line": 943,
      "comment": "\n * Traverses across parsed tree and finds I18N messages. Then it passes it to\n * {@link JsMessageVisitor#processJsMessage(JsMessage, JsMessageDefinition)}.\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "MSG_FUNCTION_NAME"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MSG_FALLBACK_FUNCTION_NAME"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_HAS_NO_DESCRIPTION"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_HAS_NO_TEXT"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_TREE_MALFORMED"
      ],
      "begin_line": 57,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_HAS_NO_VALUE"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_DUPLICATE_KEY"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_NODE_IS_ORPHANED"
      ],
      "begin_line": 70,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_NOT_INITIALIZED_USING_NEW_SYNTAX"
      ],
      "begin_line": 74,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_FALLBACK_SYNTAX"
      ],
      "begin_line": 78,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FALLBACK_ARG_ERROR"
      ],
      "begin_line": 85,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PH_JS_PREFIX"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PH_JS_SUFFIX"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MSG_PREFIX"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MSG_UNNAMED_PATTERN"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": "\n   * Pattern for unnamed messages.\n   * \u003cp\u003e\n   * All JS messages in JS code should have unique name but messages in\n   * generated code (i.e. from soy template) could have duplicated message names.\n   * Later we replace the message names with ids constructed as a hash of the\n   * message content.\n   * \u003cp\u003e\n   * \u003clink href\u003d\"http://code.google.com/p/closure-templates/\"\u003e\n   * Soy\u003c/link\u003e generates messages with names MSG_UNNAMED_\u003cNUMBER\u003e . This\n   * pattern recognizes such messages.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "CAMELCASE_PATTERN"
      ],
      "begin_line": 109,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_DESC_PREFIX"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DESC_SUFFIX"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " For old-style JS messages"
    },
    {
      "type": "field",
      "varNames": [
        "needToCheckDuplications"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGenerator"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messageNames"
      ],
      "begin_line": 126,
      "end_line": 127,
      "comment": "\n   * The names encountered associated with their defining node and source. We\n   * use it for tracking duplicated message ids in the source code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "unnamedMessages"
      ],
      "begin_line": 129,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "googMsgNodes"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n   * List of found goog.getMsg call nodes.\n   *\n   * When we visit goog.getMsg() node we add a pair node:sourcename and later\n   * when we visit its parent we remove this pair. All nodes that are left at\n   * the end of traversing are orphaned nodes. It means have no corresponding\n   * var or property node.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "checkLevel"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.JsMessageVisitor(com.google.javascript.jscomp.AbstractCompiler, boolean, com.google.javascript.jscomp.JsMessage.Style, com.google.javascript.jscomp.JsMessage.IdGenerator)",
      "begin_line": 154,
      "end_line": 169,
      "comment": "\n   * Creates JS message visitor.\n   *\n   * @param compiler the compiler instance\n   * @param needToCheckDuplications whether to check duplicated messages in\n   *        traversed\n   * @param style style that should be used during parsing\n   * @param idGenerator generator that used for creating unique ID for the\n   *        message\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 29)",
        "(line 159,col 5)-(line 159,col 59)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 161,col 35)",
        "(line 163,col 5)-(line 164,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 49)",
        "(line 175,col 5)-(line 178,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 22)",
        "(line 184,col 5)-(line 184,col 18)",
        "(line 185,col 5)-(line 185,col 32)",
        "(line 187,col 5)-(line 226,col 5)",
        "(line 229,col 5)-(line 230,col 44)",
        "(line 231,col 5)-(line 233,col 5)",
        "(line 235,col 5)-(line 239,col 5)",
        "(line 243,col 5)-(line 248,col 5)",
        "(line 250,col 5)-(line 250,col 60)",
        "(line 252,col 5)-(line 253,col 42)",
        "(line 254,col 5)-(line 254,col 53)",
        "(line 256,col 5)-(line 266,col 5)",
        "(line 268,col 5)-(line 268,col 60)",
        "(line 271,col 5)-(line 275,col 5)",
        "(line 276,col 5)-(line 277,col 43)",
        "(line 279,col 5)-(line 283,col 5)",
        "(line 289,col 5)-(line 289,col 45)",
        "(line 290,col 5)-(line 295,col 5)",
        "(line 297,col 5)-(line 298,col 38)",
        "(line 299,col 5)-(line 299,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.trackMessage(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.JsMessage, java.lang.String, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 310,
      "end_line": 322,
      "comment": "\n   * Track a message for later retrieval.\n   *\n   * This is used for tracking duplicates, and for figuring out message\n   * fallback. Not all message types are trackable, because that would\n   * require a more sophisticated analysis. e.g.,\n   * function f(s) { s.MSG_UNNAMED_X \u003d \u0027Some untrackable message\u0027; }\n   ",
      "child_ranges": [
        "(line 313,col 5)-(line 321,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.getTrackedMessage(com.google.javascript.jscomp.NodeTraversal, java.lang.String)",
      "begin_line": 325,
      "end_line": 337,
      "comment": " Get a previously tracked message. ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 61)",
        "(line 327,col 5)-(line 335,col 5)",
        "(line 336,col 5)-(line 336,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.checkIfMessageDuplicated(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 346,
      "end_line": 353,
      "comment": "\n   * Checks if message already processed. If so - it generates \u0027message\n   * duplicated\u0027 compiler error.\n   *\n   * @param msgName the name of the message\n   * @param msgNode the node that represents JS message\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractMessageFromVariable(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 369,
      "end_line": 395,
      "comment": "\n   * Creates a {@link JsMessage} for a JS message defined using a JS variable\n   * declaration (e.g \u003ccode\u003evar MSG_X \u003d ...;\u003c/code\u003e).\n   *\n   * @param builder the message builder\n   * @param nameNode a NAME node for a JS message variable\n   * @param parentNode a VAR node, parent of {@code nameNode}\n   * @param grandParentNode the grandparent of {@code nameNode}. This node is\n   *        only used to get meta data about the message that might be\n   *        surrounding it (e.g. a message description). This argument may be\n   *        null if the meta data is not needed.\n   * @throws MalformedException if {@code varNode} does not\n   *         correspond to a valid JS message VAR node\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 46)",
        "(line 375,col 5)-(line 394,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractMessageFromProperty(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n   * Creates a {@link JsMessage} for a JS message defined using an assignment to\n   * a qualified name (e.g \u003ccode\u003ea.b.MSG_X \u003d goog.getMsg(...);\u003c/code\u003e).\n   *\n   * @param builder the message builder\n   * @param getPropNode a GETPROP node in a JS message assignment\n   * @param assignNode an ASSIGN node, parent of {@code getPropNode}.\n   * @throws MalformedException if {@code getPropNode} does not\n   *         correspond to a valid JS message node\n   ",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 42)",
        "(line 411,col 5)-(line 411,col 52)",
        "(line 412,col 5)-(line 412,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.maybeInitMetaDataFromJsDocOrHelpVar(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 423,
      "end_line": 441,
      "comment": "\n   * Initializes the meta data in a JsMessage by examining the nodes just before\n   * and after a message VAR node.\n   *\n   * @param builder the message builder whose meta data will be initialized\n   * @param varNode the message VAR node\n   * @param parentOfVarNode {@code varNode}\u0027s parent node\n   ",
      "child_ranges": [
        "(line 428,col 5)-(line 430,col 5)",
        "(line 433,col 5)-(line 437,col 5)",
        "(line 440,col 5)-(line 440,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.maybeInitMetaDataFromHelpVar(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 451,
      "end_line": 469,
      "comment": "\n   * Initializes the meta data in a JsMessage by examining a node just before or\n   * after a message VAR node.\n   *\n   * @param builder the message builder whose meta data will be initialized\n   * @param sibling a node adjacent to the message VAR node\n   * @return true iff message has corresponding description variable\n   ",
      "child_ranges": [
        "(line 453,col 5)-(line 467,col 5)",
        "(line 468,col 5)-(line 468,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.maybeInitMetaDataFromJsDoc(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 480,
      "end_line": 498,
      "comment": "\n   * Initializes the meta data in a message builder given a node that may\n   * contain JsDoc properties.\n   *\n   * @param builder the message builder whose meta data will be initialized\n   * @param node the node with the message\u0027s JSDoc properties\n   * @return true if message has JsDoc with valid description in @desc\n   *         annotation\n   ",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 35)",
        "(line 482,col 5)-(line 482,col 41)",
        "(line 483,col 5)-(line 495,col 5)",
        "(line 497,col 5)-(line 497,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractStringFromStringExprNode(com.google.javascript.rhino.Node)",
      "begin_line": 509,
      "end_line": 524,
      "comment": "\n   * Returns the string value associated with a node representing a JS string or\n   * several JS strings added together (e.g. {@code \u0027str\u0027} or {@code \u0027s\u0027 + \u0027t\u0027 +\n   * \u0027r\u0027}).\n   *\n   * @param node the node from where we extract the string\n   * @return String representation of the node\n   * @throws MalformedException if the parsed message is invalid\n   ",
      "child_ranges": [
        "(line 511,col 5)-(line 523,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractFromFunctionNode(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 550,
      "end_line": 600,
      "comment": "\n   * Initializes a message builder from a FUNCTION node.\n   * \u003cp\u003e\n   * \u003cpre\u003e\n   * The tree should look something like:\n   *\n   * function\n   *  |-- name\n   *  |-- lp\n   *  |   |-- name \u003carg1\u003e\n   *  |    -- name \u003carg2\u003e\n   *   -- block\n   *      |\n   *       --return\n   *           |\n   *            --add\n   *               |-- string foo\n   *                -- name \u003carg1\u003e\n   * \u003c/pre\u003e\n   *\n   * @param builder the message builder\n   * @param node the function node that contains a message\n   * @throws MalformedException if the parsed message is invalid\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 44)",
        "(line 554,col 5)-(line 599,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractFromReturnDescendant(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 610,
      "end_line": 630,
      "comment": "\n   * Appends value parts to the message builder by traversing the descendants\n   * of the given RETURN node.\n   *\n   * @param builder the message builder\n   * @param node the node from where we extract a message\n   * @throws MalformedException if the parsed message is invalid\n   ",
      "child_ranges": [
        "(line 613,col 5)-(line 629,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.extractFromCallNode(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 656,
      "end_line": 729,
      "comment": "\n   * Initializes a message builder from a CALL node.\n   * \u003cp\u003e\n   * The tree should look something like:\n   *\n   * \u003cpre\u003e\n   * call\n   *  |-- getprop\n   *  |   |-- name \u0027goog\u0027\n   *  |   +-- string \u0027getMsg\u0027\n   *  |\n   *  |-- string \u0027Hi {$userName}! Welcome to {$product}.\u0027\n   *  +-- objlit\n   *      |-- string \u0027userName\u0027\n   *      |-- name \u0027someUserName\u0027\n   *      |-- string \u0027product\u0027\n   *      +-- call\n   *          +-- name \u0027getProductName\u0027\n   * \u003c/pre\u003e\n   *\n   * @param builder the message builder\n   * @param node the call node from where we extract the message\n   * @throws MalformedException if the parsed message is invalid\n   ",
      "child_ranges": [
        "(line 659,col 5)-(line 663,col 5)",
        "(line 665,col 5)-(line 665,col 43)",
        "(line 666,col 5)-(line 670,col 5)",
        "(line 673,col 5)-(line 673,col 50)",
        "(line 674,col 5)-(line 677,col 5)",
        "(line 679,col 5)-(line 679,col 53)",
        "(line 681,col 5)-(line 681,col 50)",
        "(line 682,col 5)-(line 682,col 44)",
        "(line 683,col 5)-(line 707,col 5)",
        "(line 711,col 5)-(line 711,col 61)",
        "(line 712,col 5)-(line 718,col 5)",
        "(line 722,col 5)-(line 728,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.parseMessageTextNode(com.google.javascript.jscomp.JsMessage.Builder, com.google.javascript.rhino.Node)",
      "begin_line": 740,
      "end_line": 777,
      "comment": "\n   * Appends the message parts in a JS message value extracted from the given\n   * text node.\n   *\n   * @param builder the JS message builder to append parts to\n   * @param node the node with string literal that contains the message text\n   * @throws MalformedException if {@code value} contains a reference to\n   *         an unregistered placeholder\n   ",
      "child_ranges": [
        "(line 742,col 5)-(line 742,col 57)",
        "(line 744,col 5)-(line 776,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.visitFallbackFunctionCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 780,
      "end_line": 808,
      "comment": " Visit a call to goog.getMsgWithFallback. ",
      "child_ranges": [
        "(line 783,col 5)-(line 788,col 5)",
        "(line 790,col 5)-(line 790,col 44)",
        "(line 791,col 5)-(line 791,col 72)",
        "(line 792,col 5)-(line 796,col 5)",
        "(line 798,col 5)-(line 798,col 40)",
        "(line 799,col 5)-(line 800,col 48)",
        "(line 801,col 5)-(line 805,col 5)",
        "(line 807,col 5)-(line 807,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 825,
      "end_line": 826,
      "comment": "\n   * Processes found JS message. Several examples of \"standard\" processing\n   * routines are:\n   * \u003col\u003e\n   * \u003cli\u003eextract all JS messages\n   * \u003cli\u003ereplace JS messages with localized versions for some specific language\n   * \u003cli\u003echeck that messages have correct syntax and present in localization\n   *     bundle\n   * \u003c/ol\u003e\n   *\n   * @param message the found message\n   * @param definition the definition of the object and usually contains all\n   *        additional message information like message node/parent\u0027s node\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.processMessageFallback(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessage)",
      "begin_line": 834,
      "end_line": 835,
      "comment": "\n   * Processes the goog.getMsgWithFallback primitive.\n   * goog.getMsgWithFallback(MSG_1, MSG_2);\n   *\n   * By default, does nothing.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.isMessageName(java.lang.String, boolean)",
      "begin_line": 840,
      "end_line": 844,
      "comment": "\n   * Returns whether the given JS identifier is a valid JS message name.\n   ",
      "child_ranges": [
        "(line 841,col 5)-(line 843,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.isUnnamedMessageName(java.lang.String)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\n   * Returns whether the given message name is in the unnamed namespace.\n   ",
      "child_ranges": [
        "(line 850,col 5)-(line 850,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.isLowerCamelCaseWithNumericSuffixes(java.lang.String)",
      "begin_line": 857,
      "end_line": 859,
      "comment": "\n   * Returns whether a string is nonempty, begins with a lowercase letter, and\n   * contains only digits and underscores after the first underscore.\n   ",
      "child_ranges": [
        "(line 858,col 5)-(line 858,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.getReadableTokenName(com.google.javascript.rhino.Node)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n   * Returns human-readable name of the given node\u0027s type.\n   ",
      "child_ranges": [
        "(line 865,col 5)-(line 865,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(java.lang.String)",
      "begin_line": 873,
      "end_line": 901,
      "comment": "\n   * Converts the given string from upper-underscore case to lower-camel case,\n   * preserving numeric suffixes. For example: \"NAME\" -\u003e \"name\" \"A4_LETTER\" -\u003e\n   * \"a4Letter\" \"START_SPAN_1_23\" -\u003e \"startSpan_1_23\".\n   ",
      "child_ranges": [
        "(line 875,col 5)-(line 875,col 37)",
        "(line 876,col 5)-(line 892,col 5)",
        "(line 894,col 5)-(line 900,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.checkNode(com.google.javascript.rhino.Node, int)",
      "begin_line": 908,
      "end_line": 917,
      "comment": "\n   * Checks a node\u0027s type.\n   *\n   * @throws MalformedException if the node is null or the wrong type\n   ",
      "child_ranges": [
        "(line 909,col 5)-(line 912,col 5)",
        "(line 913,col 5)-(line 916,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MalformedException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 919,
      "end_line": 932,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.MalformedException.MalformedException(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 924,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 925,col 7)-(line 925,col 21)",
        "(line 926,col 7)-(line 926,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.MalformedException.getNode()",
      "begin_line": 929,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 930,col 7)-(line 930,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MessageLocation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 934,
      "end_line": 942,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "message"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messageNode"
      ],
      "begin_line": 936,
      "end_line": 936,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageVisitor.MessageLocation.MessageLocation(com.google.javascript.jscomp.JsMessage, com.google.javascript.rhino.Node)",
      "begin_line": 938,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 939,col 7)-(line 939,col 29)",
        "(line 940,col 7)-(line 940,col 37)"
      ]
    }
  ]
}