{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/safety/Cleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cleaner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 129,
      "comment": "\n The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes\n that you are expecting; no junk, and no cross-site scripting attacks!\n \u003cp/\u003e\n The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain\n HTML that is allowed by the whitelist.\n \u003cp/\u003e\n It is assumed that the input HTML is a body fragment; the clean methods only pull from the source\u0027s body, and the\n canned white-lists only allow body contained tags.\n \u003cp/\u003e\n Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.Cleaner(org.jsoup.safety.Whitelist)",
      "begin_line": 28,
      "end_line": 31,
      "comment": "\n     Create a new cleaner, that sanitizes documents using the supplied whitelist.\n     @param whitelist white-list to clean with\n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 36)",
        "(line 30,col 9)-(line 30,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.clean(org.jsoup.nodes.Document)",
      "begin_line": 39,
      "end_line": 46,
      "comment": "\n     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.\n     The original document is not modified. Only elements from the dirt document\u0027s \u003ccode\u003ebody\u003c/code\u003e are used.\n     @param dirtyDocument Untrusted base document to clean.\n     @return cleaned document.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 40)",
        "(line 42,col 9)-(line 42,col 71)",
        "(line 43,col 13)-(line 43,col 62)",
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValid(org.jsoup.nodes.Document)",
      "begin_line": 58,
      "end_line": 64,
      "comment": "\n     Determines if the input document is valid, against the whitelist. It is considered valid if all the tags and attributes\n     in the input HTML are allowed by the whitelist.\n     \u003cp/\u003e\n     This method can be used as a validator for user input forms. An invalid document will still be cleaned successfully\n     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document\n     to ensure enforced attributes are set correctly, and that the output is tidied.\n     @param dirtyDocument document to test\n     @return true if no tags or attributes need to be removed; false if they do\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 40)",
        "(line 61,col 9)-(line 61,col 71)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 72,
      "end_line": 98,
      "comment": "\n     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.\n     @param source source of HTML\n     @param dest destination element to copy into\n     @return number of discarded elements (that were considered unsafe)\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 56)",
        "(line 74,col 9)-(line 74,col 29)",
        "(line 76,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.createSafeElement(org.jsoup.nodes.Element)",
      "begin_line": 100,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 48)",
        "(line 103,col 9)-(line 103,col 90)",
        "(line 104,col 9)-(line 104,col 29)",
        "(line 106,col 9)-(line 106,col 55)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 78)",
        "(line 114,col 9)-(line 114,col 40)",
        "(line 116,col 9)-(line 116,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ElementMeta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 119,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "el"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAttribsDiscarded"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.ElementMeta.ElementMeta(org.jsoup.nodes.Element, int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 25)",
        "(line 125,col 13)-(line 125,col 59)"
      ]
    }
  ]
}