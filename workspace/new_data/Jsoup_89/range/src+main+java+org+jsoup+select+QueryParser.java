{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 380,
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
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 148,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 206,col 133)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 210,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 46)",
        "(line 212,col 9)-(line 212,col 30)",
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 218,col 37)",
        "(line 219,col 9)-(line 219,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 222,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 53)",
        "(line 225,col 9)-(line 225,col 35)",
        "(line 228,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 239,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 241,col 53)",
        "(line 242,col 9)-(line 242,col 31)",
        "(line 243,col 9)-(line 243,col 31)",
        "(line 245,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " pseudo selectors :lt, :gt, :eq",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NTH_AB"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": "pseudo selectors :first-child, :last-child, :nth-child, ..."
    },
    {
      "type": "field",
      "varNames": [
        "NTH_B"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.cssNthChild(boolean, boolean)",
      "begin_line": 294,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 295,col 3)-(line 295,col 43)",
        "(line 296,col 3)-(line 296,col 37)",
        "(line 297,col 3)-(line 297,col 35)",
        "(line 298,col 3)-(line 298,col 17)",
        "(line 299,col 3)-(line 313,col 3)",
        "(line 314,col 3)-(line 324,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 47)",
        "(line 329,col 9)-(line 329,col 79)",
        "(line 330,col 9)-(line 330,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 334,
      "end_line": 339,
      "comment": " pseudo selector :has(el)",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 27)",
        "(line 336,col 9)-(line 336,col 53)",
        "(line 337,col 9)-(line 337,col 76)",
        "(line 338,col 9)-(line 338,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 342,
      "end_line": 350,
      "comment": " pseudo selector :contains(text), containsOwn(text)",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 55)",
        "(line 344,col 9)-(line 344,col 76)",
        "(line 345,col 9)-(line 345,col 81)",
        "(line 346,col 9)-(line 349,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.containsData()",
      "begin_line": 353,
      "end_line": 358,
      "comment": " pseudo selector :containsData(data)",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 36)",
        "(line 355,col 9)-(line 355,col 76)",
        "(line 356,col 9)-(line 356,col 85)",
        "(line 357,col 9)-(line 357,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 361,
      "end_line": 370,
      "comment": " :matches(regex), matchesOwn(regex)",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 53)",
        "(line 363,col 9)-(line 363,col 50)",
        "(line 364,col 9)-(line 364,col 76)",
        "(line 366,col 9)-(line 369,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 373,
      "end_line": 379,
      "comment": " :not(selector)",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 27)",
        "(line 375,col 9)-(line 375,col 53)",
        "(line 376,col 9)-(line 376,col 82)",
        "(line 378,col 9)-(line 378,col 64)"
      ]
    }
  ]
}