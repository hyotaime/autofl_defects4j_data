{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/examples/HtmlToPlainText.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HtmlToPlainText",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 109,
      "comment": "\n * HTML to plain-text. This example program demonstrates the use of jsoup to convert HTML input to lightly-formatted\n * plain-text. That is divergent from the general goal of jsoup\u0027s .text() methods, which is to get clean data from a\n * scrape.\n * \u003cp/\u003e\n * Note that this is a fairly simplistic formatter -- for real world use you\u0027ll want to embrace and extend.\n *\n * @author Jonathan Hedley, jonathan@hedley.net\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.main(java.lang.String...)",
      "begin_line": 25,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 72)",
        "(line 27,col 9)-(line 27,col 29)",
        "(line 30,col 9)-(line 30,col 48)",
        "(line 32,col 9)-(line 32,col 58)",
        "(line 33,col 9)-(line 33,col 55)",
        "(line 34,col 9)-(line 34,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.getPlainText(org.jsoup.nodes.Element)",
      "begin_line": 42,
      "end_line": 48,
      "comment": "\n     * Format an Element to plain-text\n     * @param element the root element to format\n     * @return formatted text\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 62)",
        "(line 44,col 9)-(line 44,col 63)",
        "(line 45,col 9)-(line 45,col 36)",
        "(line 47,col 9)-(line 47,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FormattingVisitor",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 51,
      "end_line": 108,
      "comment": " the formatting rules, implemented in a breadth-first DOM traverse"
    },
    {
      "type": "field",
      "varNames": [
        "maxWidth"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accum"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " holds the accumulated text"
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 57,
      "end_line": 63,
      "comment": " hit when the node is first seen",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 42)",
        "(line 59,col 13)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 66,
      "end_line": 74,
      "comment": " hit when all of the node\u0027s children (if any) have been visited",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 42)",
        "(line 68,col 13)-(line 73,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.append(java.lang.String)",
      "begin_line": 77,
      "end_line": 103,
      "comment": " appends text to the string builder with a simple word wrap method",
      "child_ranges": [
        "(line 78,col 13)-(line 79,col 26)",
        "(line 80,col 13)-(line 82,col 23)",
        "(line 84,col 13)-(line 102,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.examples.HtmlToPlainText.FormattingVisitor.toString()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 36)"
      ]
    }
  ]
}