{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/Evaluator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Evaluator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 753,
      "comment": "\n * Evaluates that an element matches the selector.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Evaluator()",
      "begin_line": 23,
      "end_line": 24,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Test if the element meets the evaluator\u0027s requirements.\n     *\n     * @param root    Root of the matching subtree\n     * @param element tested element\n     * @return Returns \u003ctt\u003etrue\u003c/tt\u003e if the requirements are met or\n     * \u003ctt\u003efalse\u003c/tt\u003e otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Tag",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 39,
      "end_line": 55,
      "comment": "\n     * Evaluator for tag name\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Tag.Tag(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 43,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 13)-(line 48,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Tag.toString()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TagEndsWith",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 61,
      "end_line": 77,
      "comment": "\n     * Evaluator for tag name that ends with\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tagName"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.TagEndsWith(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.TagEndsWith.toString()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Id",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 82,
      "end_line": 99,
      "comment": "\n     * Evaluator for element id\n     "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Id.Id(java.lang.String)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Id.toString()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Class",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 104,
      "end_line": 121,
      "comment": "\n     * Evaluator for element class\n     "
    },
    {
      "type": "field",
      "varNames": [
        "className"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Class.Class(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Class.toString()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 126,
      "end_line": 143,
      "comment": "\n     * Evaluator for attribute name matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Attribute.Attribute(java.lang.String)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Attribute.toString()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 148,
      "end_line": 171,
      "comment": "\n     * Evaluator for attribute name prefix matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "keyPrefix"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.AttributeStarting(java.lang.String)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 41)",
        "(line 153,col 13)-(line 153,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 156,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 83)",
        "(line 159,col 13)-(line 162,col 13)",
        "(line 163,col 13)-(line 163,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeStarting.toString()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValue",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 176,
      "end_line": 191,
      "comment": "\n     * Evaluator for attribute name/value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.AttributeWithValue(java.lang.String, java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 13)-(line 178,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValue.toString()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 13)-(line 188,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueNot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 196,
      "end_line": 211,
      "comment": "\n     * Evaluator for attribute name !\u003d value matching\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.AttributeWithValueNot(java.lang.String, java.lang.String)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 13)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 201,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueNot.toString()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueStarting",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 216,
      "end_line": 231,
      "comment": "\n     * Evaluator for attribute name/value matching (value prefix)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.AttributeWithValueStarting(java.lang.String, java.lang.String)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueStarting.toString()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 13)-(line 228,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueEnding",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 236,
      "end_line": 251,
      "comment": "\n     * Evaluator for attribute name/value matching (value ending)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.AttributeWithValueEnding(java.lang.String, java.lang.String)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 13)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 13)-(line 243,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueEnding.toString()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueContaining",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.AttributeKeyPair"
      ],
      "begin_line": 256,
      "end_line": 271,
      "comment": "\n     * Evaluator for attribute name/value matching (value containing)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.AttributeWithValueContaining(java.lang.String, java.lang.String)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueContaining.toString()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeWithValueMatching",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 276,
      "end_line": 295,
      "comment": "\n     * Evaluator for attribute name/value matching (value regex matching)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.AttributeWithValueMatching(java.lang.String, java.util.regex.Pattern)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 281,col 13)-(line 281,col 38)",
        "(line 282,col 13)-(line 282,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AttributeWithValueMatching.toString()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AttributeKeyPair",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 300,
      "end_line": 315,
      "comment": "\n     * Abstract evaluator for attribute name/value matching\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.AttributeKeyPair.AttributeKeyPair(java.lang.String, java.lang.String)",
      "begin_line": 304,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 35)",
        "(line 306,col 13)-(line 306,col 37)",
        "(line 308,col 13)-(line 308,col 38)",
        "(line 309,col 13)-(line 312,col 13)",
        "(line 313,col 13)-(line 313,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AllElements",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 320,
      "end_line": 331,
      "comment": "\n     * Evaluator for any / all element matching\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 322,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.AllElements.toString()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 13)-(line 329,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexLessThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 336,
      "end_line": 351,
      "comment": "\n     * Evaluator for matching by sibling index number (e {@literal \u003c} idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.IndexLessThan(int)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexLessThan.toString()",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexGreaterThan",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 356,
      "end_line": 371,
      "comment": "\n     * Evaluator for matching by sibling index number (e {@literal \u003e} idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.IndexGreaterThan(int)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 13)-(line 363,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexGreaterThan.toString()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEquals",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IndexEvaluator"
      ],
      "begin_line": 376,
      "end_line": 391,
      "comment": "\n     * Evaluator for matching by sibling index number (e \u003d idx)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.IndexEquals(int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 13)-(line 383,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IndexEquals.toString()",
      "begin_line": 386,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsLastChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 396,
      "end_line": 407,
      "comment": "\n     * Evaluator for matching the last sibling (css :last-child)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 397,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 399,col 4)-(line 399,col 38)",
        "(line 400,col 4)-(line 400,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastChild.toString()",
      "begin_line": 403,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 405,col 4)-(line 405,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsFirstOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IsNthOfType"
      ],
      "begin_line": 409,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsFirstOfType.IsFirstOfType()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 4)-(line 411,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstOfType.toString()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 4)-(line 415,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsLastOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.IsNthLastOfType"
      ],
      "begin_line": 419,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsLastOfType.IsLastOfType()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 421,col 4)-(line 421,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsLastOfType.toString()",
      "begin_line": 423,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 4)-(line 425,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CssNthEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 430,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a",
        "b"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.CssNthEvaluator(int, int)",
      "begin_line": 433,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 434,col 7)-(line 434,col 17)",
        "(line 435,col 7)-(line 435,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.CssNthEvaluator(int)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 7)-(line 438,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 441,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 443,col 7)-(line 443,col 41)",
        "(line 444,col 7)-(line 444,col 61)",
        "(line 446,col 7)-(line 446,col 55)",
        "(line 447,col 7)-(line 447,col 34)",
        "(line 449,col 7)-(line 449,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.toString()",
      "begin_line": 452,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 454,col 4)-(line 455,col 56)",
        "(line 456,col 4)-(line 457,col 57)",
        "(line 458,col 4)-(line 458,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.getPseudoClass()",
      "begin_line": 461,
      "end_line": 461,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.CssNthEvaluator.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 462,
      "end_line": 462,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "IsNthChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 471,
      "end_line": 485,
      "comment": "\n     * css-compatible Evaluator for :eq (css :nth-child)\n     * \n     * @see IndexEquals\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.IsNthChild(int, int)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 474,col 7)-(line 474,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 4)-(line 478,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthChild.getPseudoClass()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 4)-(line 483,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsNthLastChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 492,
      "end_line": 506,
      "comment": "\n     * css pseudo class :nth-last-child)\n     * \n     * @see IndexEquals\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.IsNthLastChild(int, int)",
      "begin_line": 493,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 7)-(line 494,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 497,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 10)-(line 499,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastChild.getPseudoClass()",
      "begin_line": 502,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 504,col 4)-(line 504,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsNthOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 512,
      "end_line": 531,
      "comment": "\n     * css pseudo class nth-of-type\n     * \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.IsNthOfType(int, int)",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 7)-(line 514,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 517,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 518,col 4)-(line 518,col 15)",
        "(line 519,col 10)-(line 519,col 55)",
        "(line 520,col 13)-(line 523,col 13)",
        "(line 524,col 4)-(line 524,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthOfType.getPseudoClass()",
      "begin_line": 527,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 529,col 4)-(line 529,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsNthLastOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator.CssNthEvaluator"
      ],
      "begin_line": 533,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.IsNthLastOfType(int, int)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 4)-(line 536,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.calculatePosition(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 539,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 541,col 4)-(line 541,col 15)",
        "(line 542,col 10)-(line 542,col 55)",
        "(line 543,col 10)-(line 545,col 10)",
        "(line 546,col 4)-(line 546,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsNthLastOfType.getPseudoClass()",
      "begin_line": 549,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 4)-(line 551,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsFirstChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 558,
      "end_line": 569,
      "comment": "\n     * Evaluator for matching the first sibling (css :first-child)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 559,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 561,col 7)-(line 561,col 41)",
        "(line 562,col 7)-(line 562,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsFirstChild.toString()",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 7)-(line 567,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsRoot",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 576,
      "end_line": 586,
      "comment": "\n     * css3 pseudo-class :root\n     * @see \u003ca href\u003d\"http://www.w3.org/TR/selectors/#root-pseudo\"\u003e:root selector\u003c/a\u003e\n     *\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsRoot.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 577,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 579,col 7)-(line 579,col 68)",
        "(line 580,col 7)-(line 580,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsRoot.toString()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 7)-(line 584,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsOnlyChild",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 588,
      "end_line": 598,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyChild.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 589,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 591,col 4)-(line 591,col 38)",
        "(line 592,col 4)-(line 592,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyChild.toString()",
      "begin_line": 594,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 596,col 7)-(line 596,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsOnlyOfType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 600,
      "end_line": 617,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyOfType.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 601,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 603,col 4)-(line 603,col 38)",
        "(line 604,col 4)-(line 604,col 54)",
        "(line 606,col 4)-(line 606,col 15)",
        "(line 607,col 10)-(line 607,col 40)",
        "(line 608,col 13)-(line 610,col 13)",
        "(line 611,col 10)-(line 611,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsOnlyOfType.toString()",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 615,col 7)-(line 615,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IsEmpty",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 619,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsEmpty.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 620,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 622,col 10)-(line 622,col 50)",
        "(line 623,col 13)-(line 625,col 13)",
        "(line 626,col 10)-(line 626,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.IsEmpty.toString()",
      "begin_line": 628,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IndexEvaluator",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 639,
      "end_line": 645,
      "comment": "\n     * Abstract evaluator for sibling index matching\n     *\n     * @author ant\n     "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 640,
      "end_line": 640,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.IndexEvaluator.IndexEvaluator(int)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 650,
      "end_line": 666,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 651,
      "end_line": 651,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsText.ContainsText(java.lang.String)",
      "begin_line": 653,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 657,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 659,col 13)-(line 659,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsText.toString()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 664,col 13)-(line 664,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsData",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 671,
      "end_line": 687,
      "comment": "\n     * Evaluator for matching Element (and its descendants) data\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsData.ContainsData(java.lang.String)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 13)-(line 675,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsData.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 678,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 13)-(line 680,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsData.toString()",
      "begin_line": 683,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContainsOwnText",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 692,
      "end_line": 708,
      "comment": "\n     * Evaluator for matching Element\u0027s own text\n     "
    },
    {
      "type": "field",
      "varNames": [
        "searchText"
      ],
      "begin_line": 693,
      "end_line": 693,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.ContainsOwnText(java.lang.String)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 696,col 13)-(line 696,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 699,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 701,col 13)-(line 701,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.ContainsOwnText.toString()",
      "begin_line": 704,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Matches",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 713,
      "end_line": 730,
      "comment": "\n     * Evaluator for matching Element (and its descendants) text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.Matches.Matches(java.util.regex.Pattern)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 13)-(line 717,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 720,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 722,col 13)-(line 722,col 56)",
        "(line 723,col 13)-(line 723,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.Matches.toString()",
      "begin_line": 726,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 728,col 13)-(line 728,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchesOwn",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.Evaluator"
      ],
      "begin_line": 735,
      "end_line": 752,
      "comment": "\n     * Evaluator for matching Element\u0027s own text with regex\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 736,
      "end_line": 736,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.MatchesOwn(java.util.regex.Pattern)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 739,col 13)-(line 739,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.matches(org.jsoup.nodes.Element, org.jsoup.nodes.Element)",
      "begin_line": 742,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 744,col 13)-(line 744,col 59)",
        "(line 745,col 13)-(line 745,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.Evaluator.MatchesOwn.toString()",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 750,col 13)-(line 750,col 61)"
      ]
    }
  ]
}