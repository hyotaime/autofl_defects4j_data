{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReplaceMessages.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReplaceMessages",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessageVisitor"
      ],
      "begin_line": 32,
      "end_line": 376,
      "comment": "\n * ReplaceMessages replaces user-visible messages with alternatives.\n * It uses Google specific JsMessageVisitor implementation.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "bundle"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strictReplacement"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUNDLE_DOES_NOT_HAVE_THE_MESSAGE"
      ],
      "begin_line": 36,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.ReplaceMessages(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.MessageBundle, boolean, com.google.javascript.jscomp.JsMessage.Style, boolean)",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 74)",
        "(line 46,col 5)-(line 46,col 25)",
        "(line 47,col 5)-(line 47,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.processMessageFallback(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessage)",
      "begin_line": 50,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 54,col 54)",
        "(line 55,col 5)-(line 56,col 54)",
        "(line 57,col 5)-(line 59,col 66)",
        "(line 60,col 5)-(line 61,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 64,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 63)",
        "(line 70,col 5)-(line 82,col 5)",
        "(line 85,col 5)-(line 85,col 18)",
        "(line 86,col 5)-(line 86,col 47)",
        "(line 87,col 5)-(line 93,col 5)",
        "(line 95,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.getNewValueNode(com.google.javascript.jscomp.JsMessage, com.google.javascript.rhino.Node)",
      "begin_line": 114,
      "end_line": 140,
      "comment": "\n   * Constructs a node representing a message\u0027s value, or, if possible, just\n   * modifies {@code origValueNode} so that it accurately represents the\n   * message\u0027s value.\n   *\n   * @param message  a message\n   * @param origValueNode  the message\u0027s original value node\n   * @return a Node that can replace {@code origValueNode}\n   *\n   * @throws MalformedException if the passed node\u0027s subtree structure is\n   *   not as expected\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.updateFunctionNode(com.google.javascript.jscomp.JsMessage, com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 190,
      "comment": "\n   * Updates the descendants of a FUNCTION node to represent a message\u0027s value.\n   * \u003cp\u003e\n   * The tree looks something like:\n   * \u003cpre\u003e\n   * function\n   *  |-- name\n   *  |-- lp\n   *  |   |-- name \u003carg1\u003e\n   *  |    -- name \u003carg2\u003e\n   *   -- block\n   *      |\n   *       --return\n   *           |\n   *            --add\n   *               |-- string foo\n   *                -- name \u003carg1\u003e\n   * \u003c/pre\u003e\n   *\n   * @param message  a message\n   * @param functionNode  the message\u0027s original FUNCTION value node\n   *\n   * @throws MalformedException if the passed node\u0027s subtree structure is\n   *         not as expected\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 44)",
        "(line 170,col 5)-(line 170,col 49)",
        "(line 171,col 5)-(line 171,col 36)",
        "(line 172,col 5)-(line 172,col 42)",
        "(line 173,col 5)-(line 173,col 45)",
        "(line 174,col 5)-(line 174,col 46)",
        "(line 175,col 5)-(line 175,col 41)",
        "(line 177,col 5)-(line 177,col 65)",
        "(line 178,col 5)-(line 180,col 24)",
        "(line 181,col 5)-(line 181,col 59)",
        "(line 185,col 5)-(line 189,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.constructAddOrStringNode(java.util.Iterator\u003cjava.lang.CharSequence\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 244,
      "comment": "\n   * Creates a parse tree corresponding to the remaining message parts in\n   * an iteration. The result will contain only STRING nodes, NAME nodes\n   * (corresponding to placeholder references), and/or ADD nodes used to\n   * combine the other two types.\n   *\n   * @param partsIterator  an iterator over message parts\n   * @param argListNode  an LP node whose children are valid placeholder names\n   * @return the root of the constructed parse tree\n   *\n   * @throws MalformedException if {@code partsIterator} contains a\n   *   placeholder reference that does not correspond to a valid argument in\n   *   the arg list\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 45)",
        "(line 210,col 5)-(line 210,col 25)",
        "(line 211,col 5)-(line 236,col 5)",
        "(line 238,col 5)-(line 243,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.replaceCallNode(com.google.javascript.jscomp.JsMessage, com.google.javascript.rhino.Node)",
      "begin_line": 286,
      "end_line": 297,
      "comment": "\n   * Replaces a CALL node with an inlined message value.\n   *  \u003cp\u003e\n   * The call tree looks something like:\n   * \u003cpre\u003e\n   * call\n   *  |-- getprop\n   *  |   |-- name \u0027goog\u0027\n   *  |   +-- string \u0027getMsg\u0027\n   *  |\n   *  |-- string \u0027Hi {$userName}! Welcome to {$product}.\u0027\n   *  +-- objlit\n   *      |-- string \u0027userName\u0027\n   *      |-- name \u0027someUserName\u0027\n   *      |-- string \u0027product\u0027\n   *      +-- call\n   *          +-- name \u0027getProductName\u0027\n   * \u003cpre\u003e\n   * \u003cp\u003e\n   * For that example, we\u0027d return:\n   * \u003cpre\u003e\n   * add\n   *  |-- string \u0027Hi \u0027\n   *  +-- add\n   *      |-- name someUserName\n   *      +-- add\n   *          |-- string \u0027! Welcome to \u0027\n   *          +-- add\n   *              |-- call\n   *              |   +-- name \u0027getProductName\u0027\n   *              +-- string \u0027.\u0027\n   * \u003c/pre\u003e\n   * @param message  a message\n   * @param callNode  the message\u0027s original CALL value node\n   * @return a STRING node, or an ADD node that does string concatenation, if\n   *   the message has one or more placeholders\n   *\n   * @throws MalformedException if the passed node\u0027s subtree structure is\n   *   not as expected\n   ",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 36)",
        "(line 289,col 5)-(line 289,col 48)",
        "(line 290,col 5)-(line 290,col 42)",
        "(line 291,col 5)-(line 291,col 48)",
        "(line 292,col 5)-(line 292,col 40)",
        "(line 293,col 5)-(line 293,col 47)",
        "(line 296,col 5)-(line 296,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.constructStringExprNode(java.util.Iterator\u003cjava.lang.CharSequence\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 351,
      "comment": "\n   * Creates a parse tree corresponding to the remaining message parts in an\n   * iteration. The result consists of one or more STRING nodes, placeholder\n   * replacement value nodes (which can be arbitrary expressions), and ADD\n   * nodes.\n   *\n   * @param parts  an iterator over message parts\n   * @param objLitNode  an OBJLIT node mapping placeholder names to values\n   * @return the root of the constructed parse tree\n   *\n   * @throws MalformedException if {@code parts} contains a placeholder\n   *   reference that does not correspond to a valid placeholder name\n   ",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 37)",
        "(line 316,col 5)-(line 316,col 25)",
        "(line 317,col 5)-(line 343,col 5)",
        "(line 345,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReplaceMessages.checkStringExprNode(com.google.javascript.rhino.Node)",
      "begin_line": 359,
      "end_line": 375,
      "comment": "\n   * Checks that a node is a valid string expression (either a string literal\n   * or a concatenation of string literals).\n   *\n   * @throws IllegalArgumentException if the node is null or the wrong type\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 362,col 5)",
        "(line 363,col 5)-(line 374,col 5)"
      ]
    }
  ]
}