{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/select/Evaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Evaluator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 454,
      "comment": "\n * Evaluates that an element matches the selector.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Evaluator()",
      "begin_line": 15,
      "end_line": 16,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 24,
      "end_line": 24,
      "comment": "\n     * Test if the element meets the evaluator\u0027s requirements.\n     *\n     * @param root    Root of the matching subtree\n     * @param element tested element\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 29,
      "end_line": 45,
      "comment": "\n     * Evaluator for tag name\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Tag.Tag(java.lang.String)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 13)-(line 33,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.toString()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Id",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 50,
      "end_line": 67,
      "comment": "\n     * Evaluator for element id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Id.Id(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.toString()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Class",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 72,
      "end_line": 89,
      "comment": "\n     * Evaluator for element class\n     "
    },
    {
      "type": "field",
      "varNames": [
        "className"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Class.Class(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.toString()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 94,
      "end_line": 111,
      "comment": "\n     * Evaluator for attribute name matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Attribute.Attribute(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.toString()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 116,
      "end_line": 138,
      "comment": "\n     * Evaluator for attribute name prefix matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keyPrefix"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.AttributeStarting(java.lang.String)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 123,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 83)",
        "(line 126,col 13)-(line 129,col 13)",
        "(line 130,col 13)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.toString()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 143,
      "end_line": 158,
      "comment": "\n     * Evaluator for attribute name/value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.AttributeWithValue(java.lang.String, java.lang.String)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.toString()",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueNot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 163,
      "end_line": 178,
      "comment": "\n     * Evaluator for attribute name !\u003d value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.AttributeWithValueNot(java.lang.String, java.lang.String)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.toString()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 183,
      "end_line": 198,
      "comment": "\n     * Evaluator for attribute name/value matching (value prefix)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.AttributeWithValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 13)-(line 185,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.toString()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueEnding",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 203,
      "end_line": 218,
      "comment": "\n     * Evaluator for attribute name/value matching (value ending)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.AttributeWithValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 13)-(line 205,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.toString()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueContaining",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 223,
      "end_line": 238,
      "comment": "\n     * Evaluator for attribute name/value matching (value containing)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.AttributeWithValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 13)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 13)-(line 230,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.toString()",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueMatching",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 243,
      "end_line": 262,
      "comment": "\n     * Evaluator for attribute name/value matching (value regex matching)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.AttributeWithValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 48)",
        "(line 249,col 13)-(line 249,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.toString()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKeyPair",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 267,
      "end_line": 278,
      "comment": "\n     * Abstract evaluator for attribute name/value matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeKeyPair.AttributeKeyPair(java.lang.String, java.lang.String)",
      "begin_line": 271,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 35)",
        "(line 273,col 13)-(line 273,col 37)",
        "(line 275,col 13)-(line 275,col 48)",
        "(line 276,col 13)-(line 276,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllElements",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 283,
      "end_line": 294,
      "comment": "\n     * Evaluator for any / all element matching\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.toString()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexLessThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 299,
      "end_line": 314,
      "comment": "\n     * Evaluator for matching by sibling index number (e \u003c idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.IndexLessThan(int)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.toString()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexGreaterThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 319,
      "end_line": 334,
      "comment": "\n     * Evaluator for matching by sibling index number (e \u003e idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.IndexGreaterThan(int)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 13)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 13)-(line 326,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.toString()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEquals",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 339,
      "end_line": 354,
      "comment": "\n     * Evaluator for matching by sibling index number (e \u003d idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.IndexEquals(int)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.toString()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 361,
      "end_line": 367,
      "comment": "\n     * Abstract evaluator for sibling index matching\n     *\n     * @author ant\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEvaluator.IndexEvaluator(int)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 372,
      "end_line": 388,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsText.ContainsText(java.lang.String)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.toString()",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsOwnText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 393,
      "end_line": 409,
      "comment": "\n     * Evaluator for matching Element\u0027s own text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.ContainsOwnText(java.lang.String)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 13)-(line 402,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.toString()",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 13)-(line 407,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Matches",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 414,
      "end_line": 431,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Matches.Matches(java.util.regex.Pattern)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 421,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 56)",
        "(line 424,col 13)-(line 424,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.toString()",
      "begin_line": 427,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchesOwn",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 436,
      "end_line": 453,
      "comment": "\n     * Evaluator for matching Element\u0027s own text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.MatchesOwn(java.util.regex.Pattern)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 13)-(line 440,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 443,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 445,col 13)-(line 445,col 59)",
        "(line 446,col 13)-(line 446,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.toString()",
      "begin_line": 449,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 60)"
      ]
    }
  ]
}