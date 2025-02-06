{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/select/StructuralEvaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StructuralEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 8,
      "end_line": 132,
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
      "end_line": 33,
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
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 13)-(line 31,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Not",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 35,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.Not(org.jsoup.select.Evaluator)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Not.toString()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parent",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 49,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.Parent(org.jsoup.select.Evaluator)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 13)-(line 51,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 54,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 56,col 29)",
        "(line 58,col 13)-(line 58,col 46)",
        "(line 59,col 13)-(line 63,col 13)",
        "(line 64,col 13)-(line 64,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.Parent.toString()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImmediateParent",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 72,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.ImmediateParent(org.jsoup.select.Evaluator)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 77,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 79,col 29)",
        "(line 81,col 13)-(line 81,col 46)",
        "(line 82,col 13)-(line 82,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediateParent.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PreviousSibling",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 90,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.PreviousSibling(org.jsoup.select.Evaluator)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 95,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 97,col 29)",
        "(line 99,col 13)-(line 99,col 60)",
        "(line 101,col 13)-(line 106,col 13)",
        "(line 107,col 13)-(line 107,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.PreviousSibling.toString()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImmediatePreviousSibling",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.StructuralEvaluator"
      ],
      "begin_line": 115,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.ImmediatePreviousSibling(org.jsoup.select.Evaluator)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 120,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 122,col 29)",
        "(line 124,col 13)-(line 124,col 60)",
        "(line 125,col 13)-(line 125,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling.toString()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 55)"
      ]
    }
  ]
}