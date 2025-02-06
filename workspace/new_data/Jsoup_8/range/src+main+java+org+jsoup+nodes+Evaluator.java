{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/Evaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Evaluator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 253,
      "comment": "\n * Evaluates that an element matches the selector.\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Evaluator()",
      "begin_line": 16,
      "end_line": 16,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.matches(org.jsoup.nodes.Element)",
      "begin_line": 21,
      "end_line": 21,
      "comment": "\n     * Test if the element meets the evaluator\u0027s requirements.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 23,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Tag.Tag(java.lang.String)",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 13)-(line 26,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.Tag.matches(org.jsoup.nodes.Element)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 13)-(line 30,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Id",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 34,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Id.Id(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 13)-(line 37,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.Id.matches(org.jsoup.nodes.Element)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Class",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 45,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "className"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Class.Class(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.Class.matches(org.jsoup.nodes.Element)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 56,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Attribute.Attribute(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.Attribute.matches(org.jsoup.nodes.Element)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 68,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyPrefix"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeStarting.AttributeStarting(java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeStarting.matches(org.jsoup.nodes.Element)",
      "begin_line": 75,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 81)",
        "(line 77,col 13)-(line 80,col 13)",
        "(line 81,col 13)-(line 81,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 85,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValue.AttributeWithValue(java.lang.String, java.lang.String)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValue.matches(org.jsoup.nodes.Element)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 85)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueNot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 95,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueNot.AttributeWithValueNot(java.lang.String, java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueNot.matches(org.jsoup.nodes.Element)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 105,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueStarting.AttributeWithValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueStarting.matches(org.jsoup.nodes.Element)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 93)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueEnding",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 115,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueEnding.AttributeWithValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueEnding.matches(org.jsoup.nodes.Element)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 91)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueContaining",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 125,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueContaining.AttributeWithValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueContaining.matches(org.jsoup.nodes.Element)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 91)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueMatching",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 135,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueMatching.AttributeWithValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 48)",
        "(line 141,col 13)-(line 141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AttributeWithValueMatching.matches(org.jsoup.nodes.Element)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 85)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKeyPair",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 149,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.AttributeKeyPair.AttributeKeyPair(java.lang.String, java.lang.String)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 35)",
        "(line 155,col 13)-(line 155,col 37)",
        "(line 157,col 13)-(line 157,col 48)",
        "(line 158,col 13)-(line 158,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllElements",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 162,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.AllElements.matches(org.jsoup.nodes.Element)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexLessThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.IndexEvaluator"
      ],
      "begin_line": 168,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.IndexLessThan.IndexLessThan(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.IndexLessThan.matches(org.jsoup.nodes.Element)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexGreaterThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.IndexEvaluator"
      ],
      "begin_line": 178,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.IndexGreaterThan.IndexGreaterThan(int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.IndexGreaterThan.matches(org.jsoup.nodes.Element)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEquals",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator.IndexEvaluator"
      ],
      "begin_line": 188,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.IndexEquals.IndexEquals(int)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.IndexEquals.matches(org.jsoup.nodes.Element)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 13)-(line 194,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 198,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.IndexEvaluator.IndexEvaluator(int)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 206,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.ContainsText.ContainsText(java.lang.String)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.ContainsText.matches(org.jsoup.nodes.Element)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsOwnText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 217,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.ContainsOwnText.ContainsOwnText(java.lang.String)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.ContainsOwnText.matches(org.jsoup.nodes.Element)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 13)-(line 224,col 74)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Matches",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 228,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.Matches.Matches(java.util.regex.Pattern)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.Matches.matches(org.jsoup.nodes.Element)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 56)",
        "(line 236,col 13)-(line 236,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchesOwn",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Evaluator"
      ],
      "begin_line": 240,
      "end_line": 250,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Evaluator.MatchesOwn.MatchesOwn(java.util.regex.Pattern)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Evaluator.MatchesOwn.matches(org.jsoup.nodes.Element)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 59)",
        "(line 248,col 13)-(line 248,col 28)"
      ]
    }
  ]
}