{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 378,
      "comment": "\n * Parses a CSS selector into an Evaluator tree.\n "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AttributeEvals"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "evals"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.QueryParser.QueryParser(java.lang.String)",
      "begin_line": 29,
      "end_line": 32,
      "comment": "\n     * Create a new QueryParser.\n     * @param query CSS query\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 27)",
        "(line 31,col 9)-(line 31,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse(java.lang.String)",
      "begin_line": 39,
      "end_line": 46,
      "comment": "\n     * Parse a CSS query into an Evaluator.\n     * @param query CSS query\n     * @return Evaluator\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 45,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse()",
      "begin_line": 52,
      "end_line": 79,
      "comment": "\n     * Parse the query\n     * @return Evaluator\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 31)",
        "(line 55,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 76,col 32)",
        "(line 78,col 9)-(line 78,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.combinator(char)",
      "begin_line": 81,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 31)",
        "(line 83,col 9)-(line 83,col 44)",
        "(line 85,col 9)-(line 85,col 27)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 41)",
        "(line 90,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 104,col 9)-(line 125,col 91)",
        "(line 127,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeSubQuery()",
      "begin_line": 133,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 47)",
        "(line 135,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 148,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 204,col 133)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 208,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 30)",
        "(line 211,col 9)-(line 211,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 216,col 37)",
        "(line 217,col 9)-(line 217,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 220,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 53)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 226,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 237,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 67)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 31)",
        "(line 241,col 9)-(line 241,col 31)",
        "(line 243,col 9)-(line 268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 276,
      "end_line": 278,
      "comment": " pseudo selectors :lt, :gt, :eq",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NTH_AB"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": "pseudo selectors :first-child, :last-child, :nth-child, ..."
    },
    {
      "type": "field",
      "varNames": [
        "NTH_B"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.cssNthChild(boolean, boolean)",
      "begin_line": 292,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 293,col 3)-(line 293,col 43)",
        "(line 294,col 3)-(line 294,col 37)",
        "(line 295,col 3)-(line 295,col 35)",
        "(line 296,col 3)-(line 296,col 17)",
        "(line 297,col 3)-(line 311,col 3)",
        "(line 312,col 3)-(line 322,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 325,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 327,col 79)",
        "(line 328,col 9)-(line 328,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 332,
      "end_line": 337,
      "comment": " pseudo selector :has(el)",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 27)",
        "(line 334,col 9)-(line 334,col 53)",
        "(line 335,col 9)-(line 335,col 76)",
        "(line 336,col 9)-(line 336,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 340,
      "end_line": 348,
      "comment": " pseudo selector :contains(text), containsOwn(text)",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 55)",
        "(line 342,col 9)-(line 342,col 76)",
        "(line 343,col 9)-(line 343,col 81)",
        "(line 344,col 9)-(line 347,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.containsData()",
      "begin_line": 351,
      "end_line": 356,
      "comment": " pseudo selector :containsData(data)",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 36)",
        "(line 353,col 9)-(line 353,col 76)",
        "(line 354,col 9)-(line 354,col 85)",
        "(line 355,col 9)-(line 355,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 359,
      "end_line": 368,
      "comment": " :matches(regex), matchesOwn(regex)",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 53)",
        "(line 361,col 9)-(line 361,col 50)",
        "(line 362,col 9)-(line 362,col 76)",
        "(line 364,col 9)-(line 367,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 371,
      "end_line": 377,
      "comment": " :not(selector)",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 27)",
        "(line 373,col 9)-(line 373,col 53)",
        "(line 374,col 9)-(line 374,col 82)",
        "(line 376,col 9)-(line 376,col 64)"
      ]
    }
  ]
}