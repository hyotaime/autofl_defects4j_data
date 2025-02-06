{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/select/QueryParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueryParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 293,
      "comment": "\n * Parses a CSS selector into an Evaluator tree.\n "
    },
    {
      "type": "field",
      "varNames": [
        "combinators"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "query"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "evals"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.QueryParser.QueryParser(java.lang.String)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "\n     * Create a new QueryParser.\n     * @param query CSS query\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 27)",
        "(line 27,col 9)-(line 27,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse(java.lang.String)",
      "begin_line": 35,
      "end_line": 38,
      "comment": "\n     * Parse a CSS query into an Evaluator.\n     * @param query CSS query\n     * @return Evaluator\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 47)",
        "(line 37,col 9)-(line 37,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.parse()",
      "begin_line": 44,
      "end_line": 71,
      "comment": "\n     * Parse the query\n     * @return Evaluator\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 31)",
        "(line 47,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 68,col 32)",
        "(line 70,col 9)-(line 70,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.combinator(char)",
      "begin_line": 73,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 44)",
        "(line 77,col 9)-(line 77,col 27)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 44)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 82,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 96,col 9)-(line 117,col 91)",
        "(line 119,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeSubQuery()",
      "begin_line": 125,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 47)",
        "(line 127,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.findElements()",
      "begin_line": 140,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 170,col 133)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byId()",
      "begin_line": 174,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 46)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 177,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byClass()",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byTag()",
      "begin_line": 186,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 35)",
        "(line 191,col 9)-(line 192,col 48)",
        "(line 194,col 9)-(line 194,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.byAttribute()",
      "begin_line": 197,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 67)",
        "(line 199,col 9)-(line 199,col 72)",
        "(line 200,col 9)-(line 200,col 31)",
        "(line 201,col 9)-(line 201,col 31)",
        "(line 203,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.allElements()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexLessThan()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " pseudo selectors :lt, :gt, :eq",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexGreaterThan()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.indexEquals()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.consumeIndex()",
      "begin_line": 248,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 250,col 79)",
        "(line 251,col 9)-(line 251,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.has()",
      "begin_line": 255,
      "end_line": 260,
      "comment": " pseudo selector :has(el)",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 53)",
        "(line 258,col 9)-(line 258,col 76)",
        "(line 259,col 9)-(line 259,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.contains(boolean)",
      "begin_line": 263,
      "end_line": 271,
      "comment": " pseudo selector :contains(text), containsOwn(text)",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 55)",
        "(line 265,col 9)-(line 265,col 76)",
        "(line 266,col 9)-(line 266,col 81)",
        "(line 267,col 9)-(line 270,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.matches(boolean)",
      "begin_line": 274,
      "end_line": 283,
      "comment": " :matches(regex), matchesOwn(regex)",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 53)",
        "(line 276,col 9)-(line 276,col 50)",
        "(line 277,col 9)-(line 277,col 76)",
        "(line 279,col 9)-(line 282,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.QueryParser.not()",
      "begin_line": 286,
      "end_line": 292,
      "comment": " :not(selector)",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 27)",
        "(line 288,col 9)-(line 288,col 53)",
        "(line 289,col 9)-(line 289,col 82)",
        "(line 291,col 9)-(line 291,col 64)"
      ]
    }
  ]
}