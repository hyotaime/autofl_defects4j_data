{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/safety/Cleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Cleaner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 175,
      "comment": "\n The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes\n that you are expecting; no junk, and no cross-site scripting attacks!\n \u003cp\u003e\n The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain\n HTML that is allowed by the whitelist.\n \u003c/p\u003e\n \u003cp\u003e\n It is assumed that the input HTML is a body fragment; the clean methods only pull from the source\u0027s body, and the\n canned white-lists only allow body contained tags.\n \u003c/p\u003e\n \u003cp\u003e\n Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.\n \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.Cleaner(org.jsoup.safety.Whitelist)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     Create a new cleaner, that sanitizes documents using the supplied whitelist.\n     @param whitelist white-list to clean with\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 36)",
        "(line 44,col 9)-(line 44,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.clean(org.jsoup.nodes.Document)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "\n     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.\n     The original document is not modified. Only elements from the dirt document\u0027s \u003ccode\u003ebody\u003c/code\u003e are used.\n     @param dirtyDocument Untrusted base document to clean.\n     @return cleaned document.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 40)",
        "(line 56,col 9)-(line 56,col 71)",
        "(line 57,col 9)-(line 58,col 62)",
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValid(org.jsoup.nodes.Document)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "\n     Determines if the input document \u003cb\u003ebody\u003c/b\u003eis valid, against the whitelist. It is considered valid if all the tags and attributes\n     in the input HTML are allowed by the whitelist, and that there is no content in the \u003ccode\u003ehead\u003c/code\u003e.\n     \u003cp\u003e\n     This method can be used as a validator for user input. An invalid document will still be cleaned successfully\n     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document\n     to ensure enforced attributes are set correctly, and that the output is tidied.\n     \u003c/p\u003e\n     @param dirtyDocument document to test\n     @return true if no tags or attributes need to be removed; false if they do\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 40)",
        "(line 77,col 9)-(line 77,col 71)",
        "(line 78,col 9)-(line 78,col 77)",
        "(line 79,col 9)-(line 80,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.isValidBodyHtml(java.lang.String)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 62)",
        "(line 87,col 9)-(line 87,col 87)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 69)",
        "(line 90,col 9)-(line 90,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CleaningVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 96,
      "end_line": 138,
      "comment": "\n     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numDiscarded"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destination"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " current element to append nodes to"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.CleaningVisitor(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 29)",
        "(line 103,col 13)-(line 103,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 106,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 130,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.CleaningVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 136,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.copySafeNodes(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 76)",
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.safety.Cleaner.createSafeElement(org.jsoup.nodes.Element)",
      "begin_line": 146,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 46)",
        "(line 148,col 9)-(line 148,col 48)",
        "(line 149,col 9)-(line 149,col 90)",
        "(line 150,col 9)-(line 150,col 29)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 78)",
        "(line 160,col 9)-(line 160,col 40)",
        "(line 162,col 9)-(line 162,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ElementMeta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 165,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "el"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numAttribsDiscarded"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.safety.Cleaner.ElementMeta.ElementMeta(org.jsoup.nodes.Element, int)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 25)",
        "(line 171,col 13)-(line 171,col 59)"
      ]
    }
  ]
}