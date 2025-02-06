{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/examples/HtmlToPlainText.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlToPlainText",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 130,
      "comment": "\n * HTML to plain-text. This example program demonstrates the use of jsoup to convert HTML input to lightly-formatted\n * plain-text. That is divergent from the general goal of jsoup\u0027s .text() methods, which is to get clean data from a\n * scrape.\n * \u003cp\u003e\n * Note that this is a fairly simplistic formatter -- for real world use you\u0027ll want to embrace and extend.\n * \u003c/p\u003e\n * \u003cp\u003e\n * To invoke from the command line, assuming you\u0027ve downloaded the jsoup jar to your current directory:\u003c/p\u003e\n * \u003cp\u003e\u003ccode\u003ejava -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]\u003c/code\u003e\u003c/p\u003e\n * where \u003ci\u003eurl\u003c/i\u003e is the URL to fetch, and \u003ci\u003eselector\u003c/i\u003e is an optional CSS selector.\n * \n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "field",
      "varNames": [
        "userAgent"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeout"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.main(java.lang.String...)",
      "begin_line": 34,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 141)",
        "(line 36,col 9)-(line 36,col 35)",
        "(line 37,col 9)-(line 37,col 66)",
        "(line 40,col 9)-(line 40,col 86)",
        "(line 42,col 9)-(line 42,col 58)",
        "(line 44,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.getPlainText(org.jsoup.nodes.Element)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Format an Element to plain-text\n     * @param element the root element to format\n     * @return formatted text\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 62)",
        "(line 63,col 9)-(line 63,col 51)",
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FormattingVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 69,
      "end_line": 129,
      "comment": " the formatting rules, implemented in a breadth-first DOM traverse"
    },
    {
      "type": "field",
      "varNames": [
        "maxWidth"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " holds the accumulated text"
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 75,
      "end_line": 85,
      "comment": " hit when the node is first seen",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 42)",
        "(line 77,col 13)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 88,
      "end_line": 94,
      "comment": " hit when all of the node\u0027s children (if any) have been visited",
      "child_ranges": [
        "(line 89,col 13)-(line 89,col 42)",
        "(line 90,col 13)-(line 93,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.append(java.lang.String)",
      "begin_line": 97,
      "end_line": 123,
      "comment": " appends text to the string builder with a simple word wrap method",
      "child_ranges": [
        "(line 98,col 13)-(line 99,col 26)",
        "(line 100,col 13)-(line 102,col 23)",
        "(line 104,col 13)-(line 122,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.toString()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 36)"
      ]
    }
  ]
}