{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/select/CombiningEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombiningEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 13,
      "end_line": 106,
      "comment": "\n * Base combining (and, or) evaluator.\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluators"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "num"
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
        "(line 19,col 9)-(line 19,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.CombiningEvaluator(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 22,
      "end_line": 26,
      "comment": "",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 15)",
        "(line 24,col 9)-(line 24,col 43)",
        "(line 25,col 9)-(line 25,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.rightMostEvaluator()",
      "begin_line": 28,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.replaceRightMostEvaluator(org.jsoup.select.Evaluator)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.updateNumEvaluators()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "And",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 41,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.And.And(org.jsoup.select.Evaluator...)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 50,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 56,col 13)",
        "(line 57,col 13)-(line 57,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.And.toString()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Or",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.CombiningEvaluator"
      ],
      "begin_line": 66,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or(java.util.Collection\u003corg.jsoup.select.Evaluator\u003e)",
      "begin_line": 71,
      "end_line": 78,
      "comment": "\n         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.\n         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).\n         ",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 20)",
        "(line 73,col 13)-(line 76,col 51)",
        "(line 77,col 13)-(line 77,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or(org.jsoup.select.Evaluator...)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 80,col 39)-(line 80,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.Or()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.add(org.jsoup.select.Evaluator)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 30)",
        "(line 88,col 13)-(line 88,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 91,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 97,col 13)",
        "(line 98,col 13)-(line 98,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.CombiningEvaluator.Or.toString()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 53)"
      ]
    }
  ]
}