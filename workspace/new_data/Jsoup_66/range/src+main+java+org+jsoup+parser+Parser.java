{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 216,
      "comment": "\n * Parses HTML into a {@link org.jsoup.nodes.Document}. Generally best to use one of the  more convenient parse methods\n * in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ERRORS"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": " by default, error tracking is disabled."
    },
    {
      "type": "field",
      "varNames": [
        "treeBuilder"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxErrors"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "settings"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(org.jsoup.parser.TreeBuilder)",
      "begin_line": 27,
      "end_line": 30,
      "comment": "\n     * Create a new Parser, using the specified TreeBuilder\n     * @param treeBuilder TreeBuilder to use to parse input into Documents.\n     ",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 39)",
        "(line 29,col 9)-(line 29,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseInput(java.lang.String, java.lang.String)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 100)",
        "(line 34,col 9)-(line 34,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseInput(java.io.Reader, java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 100)",
        "(line 39,col 9)-(line 39,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.getTreeBuilder()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Get the TreeBuilder currently in use.\n     * @return current TreeBuilder.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTreeBuilder(org.jsoup.parser.TreeBuilder)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Update the TreeBuilder used when parsing content.\n     * @param treeBuilder current TreeBuilder\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.isTrackErrors()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Check if parse error tracking is enabled.\n     * @return current track error state.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTrackErrors(int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Enable or disable parse error tracking for the next parse.\n     * @param maxErrors the maximum number of errors to track. Set to 0 to disable.\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 35)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.getErrors()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Retrieve the parse errors, if any, from the last parse.\n     * @return list of parse errors, up to the size of the maximum errors tracked.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.settings(org.jsoup.parser.ParseSettings)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 33)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.settings()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Parse HTML into a Document.\n     *\n     * @param html HTML to parse\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return parsed Document\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 56)",
        "(line 107,col 9)-(line 107,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.\n     *\n     * @param fragmentHtml the fragment of HTML to parse\n     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This\n     * provides stack context (for implicit element creation).\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 60)",
        "(line 122,col 9)-(line 122,col 133)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.\n     *\n     * @param fragmentHtml the fragment of HTML to parse\n     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This\n     * provides stack context (for implicit element creation).\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     * @param errorList list to add errors to\n     *\n     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 60)",
        "(line 138,col 9)-(line 138,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlFragment(java.lang.String, java.lang.String)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Parse a fragment of XML into a list of nodes.\n     *\n     * @param fragmentXml the fragment of XML to parse\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     * @return list of nodes parsed from the input XML.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 58)",
        "(line 150,col 9)-(line 150,col 123)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 161,
      "end_line": 173,
      "comment": "\n     * Parse a fragment of HTML into the {@code body} of a Document.\n     *\n     * @param bodyHtml fragment of HTML\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return Document, with empty head, and HTML parsed into body\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 53)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 69)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.unescapeEntities(java.lang.String, boolean)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Utility method to unescape HTML entities from a string\n     * @param string HTML escaped string\n     * @param inAttribute if the string is to be escaped in strict mode (as attributes are)\n     * @return an unescaped string\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 102)",
        "(line 183,col 9)-(line 183,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * @param bodyHtml HTML to parse\n     * @param baseUri baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return parsed Document\n     * @deprecated Use {@link #parseBodyFragment} or {@link #parseFragment} instead.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.htmlParser()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Create a new HTML parser. This parser treats input as HTML5, and enforces the creation of a normalised document,\n     * based on a knowledge of the semantics of the incoming tags.\n     * @return a new HTML parser.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.xmlParser()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Create a new XML parser. This parser assumes no knowledge of the incoming tags and does not treat it as HTML,\n     * rather creates a simple tree directly from the input.\n     * @return a new simple XML parser.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)"
      ]
    }
  ]
}