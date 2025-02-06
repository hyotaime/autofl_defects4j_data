{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 218,
      "comment": "\n * Parses HTML into a {@link org.jsoup.nodes.Document}. Generally best to use one of the  more convenient parse methods\n * in {@link org.jsoup.Jsoup}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "treeBuilder"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "settings"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(org.jsoup.parser.TreeBuilder)",
      "begin_line": 24,
      "end_line": 28,
      "comment": "\n     * Create a new Parser, using the specified TreeBuilder\n     * @param treeBuilder TreeBuilder to use to parse input into Documents.\n     ",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 39)",
        "(line 26,col 9)-(line 26,col 49)",
        "(line 27,col 9)-(line 27,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseInput(java.lang.String, java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseInput(java.io.Reader, java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseFragmentInput(java.lang.String, org.jsoup.nodes.Element, java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.getTreeBuilder()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Get the TreeBuilder currently in use.\n     * @return current TreeBuilder.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTreeBuilder(org.jsoup.parser.TreeBuilder)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Update the TreeBuilder used when parsing content.\n     * @param treeBuilder current TreeBuilder\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 57,col 34)",
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
        "(line 66,col 9)-(line 66,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.setTrackErrors(int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Enable or disable parse error tracking for the next parse.\n     * @param maxErrors the maximum number of errors to track. Set to 0 to disable.\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 98)",
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
        "(line 107,col 9)-(line 107,col 91)"
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
        "(line 122,col 9)-(line 122,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\n     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.\n     *\n     * @param fragmentHtml the fragment of HTML to parse\n     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This\n     * provides stack context (for implicit element creation).\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     * @param errorList list to add errors to\n     *\n     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 60)",
        "(line 138,col 9)-(line 138,col 48)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 140,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlFragment(java.lang.String, java.lang.String)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Parse a fragment of XML into a list of nodes.\n     *\n     * @param fragmentXml the fragment of XML to parse\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     * @return list of nodes parsed from the input XML.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 58)",
        "(line 152,col 9)-(line 152,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 163,
      "end_line": 175,
      "comment": "\n     * Parse a fragment of HTML into the {@code body} of a Document.\n     *\n     * @param bodyHtml fragment of HTML\n     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return Document, with empty head, and HTML parsed into body\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 53)",
        "(line 165,col 9)-(line 165,col 34)",
        "(line 166,col 9)-(line 166,col 69)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.unescapeEntities(java.lang.String, boolean)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Utility method to unescape HTML entities from a string\n     * @param string HTML escaped string\n     * @param inAttribute if the string is to be escaped in strict mode (as attributes are)\n     * @return an unescaped string\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 102)",
        "(line 185,col 9)-(line 185,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * @param bodyHtml HTML to parse\n     * @param baseUri baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     *\n     * @return parsed Document\n     * @deprecated Use {@link #parseBodyFragment} or {@link #parseFragment} instead.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.htmlParser()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Create a new HTML parser. This parser treats input as HTML5, and enforces the creation of a normalised document,\n     * based on a knowledge of the semantics of the incoming tags.\n     * @return a new HTML parser.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.xmlParser()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Create a new XML parser. This parser assumes no knowledge of the incoming tags and does not treat it as HTML,\n     * rather creates a simple tree directly from the input.\n     * @return a new simple XML parser.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 48)"
      ]
    }
  ]
}