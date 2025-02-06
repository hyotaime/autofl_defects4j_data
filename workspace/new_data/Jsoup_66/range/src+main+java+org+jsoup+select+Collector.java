{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/Collector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Collector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 89,
      "comment": "\n * Collects a list of elements that match the supplied criteria.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.Collector()",
      "begin_line": 16,
      "end_line": 17,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.collect(org.jsoup.select.Evaluator, org.jsoup.nodes.Element)",
      "begin_line": 25,
      "end_line": 29,
      "comment": "\n     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.\n     @param eval Evaluator to test elements against\n     @param root root of tree to descend\n     @return list of matches; empty if none\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 43)",
        "(line 27,col 9)-(line 27,col 76)",
        "(line 28,col 9)-(line 28,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Accumulator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 31,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eval"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.Accumulator.Accumulator(org.jsoup.nodes.Element, org.jsoup.select.Elements, org.jsoup.select.Evaluator)",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 29)",
        "(line 38,col 13)-(line 38,col 37)",
        "(line 39,col 13)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.head(org.jsoup.nodes.Node, int)",
      "begin_line": 42,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 47,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.findFirst(org.jsoup.select.Evaluator, org.jsoup.nodes.Element)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 57)",
        "(line 57,col 9)-(line 57,col 43)",
        "(line 58,col 9)-(line 58,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FirstFinder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeFilter"
      ],
      "begin_line": 61,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "match"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eval"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.FirstFinder.FirstFinder(org.jsoup.nodes.Element, org.jsoup.select.Evaluator)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 29)",
        "(line 68,col 13)-(line 68,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.FirstFinder.head(org.jsoup.nodes.Node, int)",
      "begin_line": 71,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 79,col 13)",
        "(line 80,col 13)-(line 80,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.FirstFinder.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 28)"
      ]
    }
  ]
}