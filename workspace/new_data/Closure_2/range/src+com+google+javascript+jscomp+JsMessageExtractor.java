{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/JsMessageExtractor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessageExtractor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 150,
      "comment": "\n * Extracts messages and message comments from JS code.\n *\n * \u003cp\u003e Uses a special prefix (e.g. {@code MSG_}) to determine which variables\n * are messages. Here are the recognized formats:\n *\n *   \u003ccode\u003e\n *   var MSG_FOO \u003d \"foo\";\n *   var MSG_FOO_HELP \u003d \"this message is used for foo\";\n *   \u003c/code\u003e\n *\n *   \u003ccode\u003e\n *   var MSG_BAR \u003d function(a, b) {\n *     return a + \" bar \" + b;\n *   }\n *   var MSG_BAR_HELP \u003d \"the bar message\";\n *   \u003c/code\u003e\n *\n * \u003cp\u003eThis class enforces the policy that message variable names must be unique\n * across all JS files.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "style"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGenerator"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.JsMessageExtractor(com.google.javascript.jscomp.JsMessage.IdGenerator, com.google.javascript.jscomp.JsMessage.Style)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.JsMessageExtractor(com.google.javascript.jscomp.JsMessage.IdGenerator, com.google.javascript.jscomp.JsMessage.Style, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 61,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 35)",
        "(line 66,col 5)-(line 66,col 23)",
        "(line 67,col 5)-(line 67,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExtractMessagesVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessageVisitor"
      ],
      "begin_line": 73,
      "end_line": 101,
      "comment": "\n   * Visitor that collects messages.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " unnamed and have the same text but located in different source files."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.ExtractMessagesVisitor.ExtractMessagesVisitor(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 7)-(line 82,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.ExtractMessagesVisitor.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 88,col 7)-(line 90,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.ExtractMessagesVisitor.getMessages()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns extracted messages.\n     *\n     * @return collection of JsMessage objects that was found in js sources.\n     ",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.extractMessages(com.google.javascript.jscomp.SourceFile...)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n   * Extracts JS messages from JavaScript code.\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageExtractor.extractMessages(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 121,
      "end_line": 149,
      "comment": "\n   * Extracts JS messages from JavaScript code.\n   *\n   * @param inputs  the JavaScript source code inputs\n   * @return the extracted messages collection\n   * @throws IOException if there is a problem reading the JS code\n   * @throws RuntimeException if there are problems parsing the JS code or the\n   *     JS messages, or if two messages have the same key\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 39)",
        "(line 125,col 5)-(line 128,col 17)",
        "(line 129,col 5)-(line 129,col 27)",
        "(line 131,col 5)-(line 132,col 45)",
        "(line 133,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 44)",
        "(line 139,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 148,col 45)"
      ]
    }
  ]
}