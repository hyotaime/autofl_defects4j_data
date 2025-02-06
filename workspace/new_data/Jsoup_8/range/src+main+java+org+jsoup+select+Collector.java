{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/select/Collector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Collector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 50,
      "comment": "\n * Collects a list of elements that match the supplied criteria.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.Collector()",
      "begin_line": 14,
      "end_line": 15,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.collect(org.jsoup.nodes.Evaluator, org.jsoup.nodes.Element)",
      "begin_line": 23,
      "end_line": 27,
      "comment": "\n     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.\n     @param eval Evaluator to test elements against\n     @param root root of tree to descend\n     @return list of matches; empty if none\n     ",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 43)",
        "(line 25,col 9)-(line 25,col 74)",
        "(line 26,col 9)-(line 26,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Accumulator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 29,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eval"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.Accumulator.Accumulator(org.jsoup.select.Elements, org.jsoup.nodes.Evaluator)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 13)-(line 34,col 37)",
        "(line 35,col 13)-(line 35,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.head(org.jsoup.nodes.Node, int)",
      "begin_line": 38,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 43,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": []
    }
  ]
}