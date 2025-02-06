{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/select/CombiningEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombiningEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 14,
      "end_line": 96,
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
      "end_line": 58,
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
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 50,col 13)",
        "(line 51,col 13)-(line 51,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.toString()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Or",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 60,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "\n         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.\n         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).\n         ",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 20)",
        "(line 67,col 13)-(line 70,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.add(org.jsoup.select.Evaluator)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 87,col 13)",
        "(line 88,col 13)-(line 88,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.toString()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 54)"
      ]
    }
  ]
}