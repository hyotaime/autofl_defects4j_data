{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/select/Collector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Collector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 11,
      "end_line": 51,
      "comment": "\n * Collects a list of elements that match the supplied criteria.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Collector.Collector()",
      "begin_line": 13,
      "end_line": 14,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.collect(org.jsoup.select.Evaluator, org.jsoup.nodes.Element)",
      "begin_line": 22,
      "end_line": 26,
      "comment": "\n     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.\n     @param eval Evaluator to test elements against\n     @param root root of tree to descend\n     @return list of matches; empty if none\n     ",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 43)",
        "(line 24,col 9)-(line 24,col 80)",
        "(line 25,col 9)-(line 25,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Accumulator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 28,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 29,
      "end_line": 29,
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
      "signature": "org.jsoup.select.Collector.Accumulator.Accumulator(org.jsoup.nodes.Element, org.jsoup.select.Elements, org.jsoup.select.Evaluator)",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 13)-(line 34,col 29)",
        "(line 35,col 13)-(line 35,col 37)",
        "(line 36,col 13)-(line 36,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.head(org.jsoup.nodes.Node, int)",
      "begin_line": 39,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 40,col 13)-(line 44,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Collector.Accumulator.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    }
  ]
}