{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/XtbMessageBundle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XtbMessageBundle",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MessageBundle"
      ],
      "begin_line": 45,
      "end_line": 221,
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
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.XtbMessageBundle(java.io.InputStream, java.lang.String)",
      "begin_line": 64,
      "end_line": 83,
      "comment": "\n   * Creates an instance and initializes it with the messages in an XTB file.\n   *\n   * @param xtb  the XTB file as a byte stream\n   * @param projectId  the translation console project id (i.e. name)\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 52)",
        "(line 66,col 5)-(line 66,col 38)",
        "(line 67,col 5)-(line 67,col 65)",
        "(line 69,col 5)-(line 82,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.createSAXParser()",
      "begin_line": 86,
      "end_line": 104,
      "comment": " Inlined from guava-internal.",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 62)",
        "(line 89,col 5)-(line 89,col 33)",
        "(line 90,col 5)-(line 90,col 36)",
        "(line 91,col 5)-(line 92,col 72)",
        "(line 93,col 5)-(line 94,col 73)",
        "(line 95,col 5)-(line 97,col 15)",
        "(line 98,col 5)-(line 98,col 69)",
        "(line 100,col 5)-(line 100,col 46)",
        "(line 101,col 5)-(line 101,col 48)",
        "(line 102,col 5)-(line 102,col 47)",
        "(line 103,col 5)-(line 103,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.getMessage(java.lang.String)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.idGenerator()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.getAllMessages()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Handler",
      "is_interface": false,
      "parent_types": [
        "ContentHandler"
      ],
      "begin_line": 125,
      "end_line": 207,
      "comment": "\n   * A {@link ContentHandler} that creates a {@link JsMessage} for each message\n   * parsed from an XML Translation Bundle (XTB) file.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "BUNDLE_ELEM_NAME"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LANG_ATT_NAME"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TRANSLATION_ELEM_NAME"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MESSAGE_ID_ATT_NAME"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLACEHOLDER_ELEM_NAME"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PLACEHOLDER_NAME_ATT_NAME"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lang"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "msgBuilder"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "setDocumentLocator(Locator)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Locator\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 138,
      "end_line": 139,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.startDocument()",
      "begin_line": 141,
      "end_line": 142,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endDocument()",
      "begin_line": 144,
      "end_line": 145,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.startPrefixMapping(java.lang.String, java.lang.String)",
      "begin_line": 147,
      "end_line": 148,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endPrefixMapping(java.lang.String)",
      "begin_line": 150,
      "end_line": 151,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 153,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 170,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 173,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 183,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.characters(char[], int, int)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 191,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.ignorableWhitespace(char[], int, int)",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 196,col 7)-(line 199,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.processingInstruction(java.lang.String, java.lang.String)",
      "begin_line": 202,
      "end_line": 203,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.Handler.skippedEntity(java.lang.String)",
      "begin_line": 205,
      "end_line": 206,
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
      "begin_line": 214,
      "end_line": 220,
      "comment": "\n   * A secure EntityResolver that returns an empty string in response to\n   * any attempt to resolve an external entity. The class is used by our\n   * secure version of the internal saxon SAX parser.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.XtbMessageBundle.SecureEntityResolver.resolveEntity(java.lang.String, java.lang.String)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 7)-(line 218,col 51)"
      ]
    }
  ]
}