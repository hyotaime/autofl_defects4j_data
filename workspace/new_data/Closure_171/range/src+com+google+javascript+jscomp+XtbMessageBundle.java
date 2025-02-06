{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/XtbMessageBundle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XtbMessageBundle",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MessageBundle"
      ],
      "begin_line": 45,
      "end_line": 222,
      "comment": "\n * A MessageBundle that parses messages from an XML Translation Bundle (XTB)\n * file.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NOOP_RESOLVER"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idGenerator"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.XtbMessageBundle(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.XtbMessageBundle(java.io.InputStream, java.lang.String)",
      "begin_line": 65,
      "end_line": 84,
      "comment": "\n   * Creates an instance and initializes it with the messages in an XTB file.\n   *\n   * @param xtb  the XTB file as a byte stream\n   * @param projectId  the translation console project id (i.e. name)\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 52)",
        "(line 67,col 5)-(line 67,col 38)",
        "(line 68,col 5)-(line 68,col 65)",
        "(line 70,col 5)-(line 83,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.createSAXParser()",
      "begin_line": 87,
      "end_line": 105,
      "comment": " Inlined from guava-internal.",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 62)",
        "(line 90,col 5)-(line 90,col 33)",
        "(line 91,col 5)-(line 91,col 36)",
        "(line 92,col 5)-(line 93,col 72)",
        "(line 94,col 5)-(line 95,col 74)",
        "(line 96,col 5)-(line 98,col 15)",
        "(line 99,col 5)-(line 99,col 69)",
        "(line 101,col 5)-(line 101,col 46)",
        "(line 102,col 5)-(line 102,col 48)",
        "(line 103,col 5)-(line 103,col 47)",
        "(line 104,col 5)-(line 104,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.getMessage(java.lang.String)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.idGenerator()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.getAllMessages()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Handler",
      "is_interface": false,
      "parent_types": [
        "ContentHandler"
      ],
      "begin_line": 126,
      "end_line": 208,
      "comment": "\n   * A {@link ContentHandler} that creates a {@link JsMessage} for each message\n   * parsed from an XML Translation Bundle (XTB) file.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "BUNDLE_ELEM_NAME"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANG_ATT_NAME"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRANSLATION_ELEM_NAME"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_ID_ATT_NAME"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLACEHOLDER_ELEM_NAME"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLACEHOLDER_NAME_ATT_NAME"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lang"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "msgBuilder"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "setDocumentLocator(Locator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Locator\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 139,
      "end_line": 140,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.startDocument()",
      "begin_line": 142,
      "end_line": 143,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endDocument()",
      "begin_line": 145,
      "end_line": 146,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.startPrefixMapping(java.lang.String, java.lang.String)",
      "begin_line": 148,
      "end_line": 149,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endPrefixMapping(java.lang.String)",
      "begin_line": 151,
      "end_line": 152,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 154,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 171,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 174,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 176,col 7)-(line 184,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.characters(char[], int, int)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 189,col 7)-(line 192,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.ignorableWhitespace(char[], int, int)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 200,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.processingInstruction(java.lang.String, java.lang.String)",
      "begin_line": 203,
      "end_line": 204,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.skippedEntity(java.lang.String)",
      "begin_line": 206,
      "end_line": 207,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SecureEntityResolver",
      "is_interface": false,
      "parent_types": [
        "EntityResolver"
      ],
      "begin_line": 215,
      "end_line": 221,
      "comment": "\n   * A secure EntityResolver that returns an empty string in response to\n   * any attempt to resolve an external entity. The class is used by our\n   * secure version of the internal saxon SAX parser.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.SecureEntityResolver.resolveEntity(java.lang.String, java.lang.String)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 7)-(line 219,col 51)"
      ]
    }
  ]
}