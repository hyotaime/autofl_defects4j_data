{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/select/CombiningEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombiningEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 14,
      "end_line": 94,
      "comment": "\n * Base combining (and, or) evaluator.\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluators"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.CombiningEvaluator()",
      "begin_line": 17,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 16)",
        "(line 19,col 9)-(line 19,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.CombiningEvaluator(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 22,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 15)",
        "(line 24,col 9)-(line 24,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.rightMostEvaluator()",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.replaceRightMostEvaluator(org.jsoup.select.Evaluator)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "And",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 35,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(org.jsoup.select.Evaluator...)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 49,col 13)",
        "(line 50,col 13)-(line 50,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.toString()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Or",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 59,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.\n         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).\n         ",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 20)",
        "(line 66,col 13)-(line 69,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.add(org.jsoup.select.Evaluator)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 82,col 13)-(line 85,col 13)",
        "(line 86,col 13)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.toString()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 54)"
      ]
    }
  ]
}