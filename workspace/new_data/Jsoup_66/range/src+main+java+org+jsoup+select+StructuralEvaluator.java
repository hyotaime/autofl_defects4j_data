{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/StructuralEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StructuralEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 8,
      "end_line": 140,
      "comment": "\n * Base structural evaluator.\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluator"
      ],
      "begin_line": 9,
      "end_line": 9,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Root",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 11,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Root.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 12,
      "end_line": 14,
      "comment": "",
      "child_ranges": [
        "(line 13,col 13)-(line 13,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Has",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 17,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.Has.Has(org.jsoup.select.Evaluator)",
      "begin_line": 18,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 19,col 13)-(line 19,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Has.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 22,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 23,col 13)-(line 26,col 13)",
        "(line 27,col 13)-(line 27,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Has.toString()",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 13)-(line 32,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Not",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 36,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.Not(org.jsoup.select.Evaluator)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.toString()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 13)-(line 47,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parent",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 51,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.Parent(org.jsoup.select.Evaluator)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 56,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 58,col 29)",
        "(line 60,col 13)-(line 60,col 46)",
        "(line 61,col 13)-(line 67,col 13)",
        "(line 68,col 13)-(line 68,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.toString()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImmediateParent",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 77,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.ImmediateParent(org.jsoup.select.Evaluator)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 84,col 29)",
        "(line 86,col 13)-(line 86,col 46)",
        "(line 87,col 13)-(line 87,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.toString()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PreviousSibling",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 96,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.PreviousSibling(org.jsoup.select.Evaluator)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 101,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 103,col 29)",
        "(line 105,col 13)-(line 105,col 60)",
        "(line 107,col 13)-(line 112,col 13)",
        "(line 113,col 13)-(line 113,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.toString()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImmediatePreviousSibling",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 122,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.ImmediatePreviousSibling(org.jsoup.select.Evaluator)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 127,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 129,col 29)",
        "(line 131,col 13)-(line 131,col 60)",
        "(line 132,col 13)-(line 132,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.toString()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 55)"
      ]
    }
  ]
}