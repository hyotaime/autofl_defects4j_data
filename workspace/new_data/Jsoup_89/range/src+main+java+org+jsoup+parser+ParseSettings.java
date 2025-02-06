{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/ParseSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParseSettings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 64,
      "comment": "\n * Controls parser settings, to optionally preserve tag and/or attribute name case.\n "
    },
    {
      "type": "field",
      "varNames": [
        "htmlDefault"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": "\n     * HTML default settings: both tag and attribute names are lower-cased during parsing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "preserveCase"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": "\n     * Preserve both tag and attribute case.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "preserveTagCase"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveAttributeCase"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.ParseSettings.ParseSettings(boolean, boolean)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "\n     * Define parse settings.\n     * @param tag preserve tag case?\n     * @param attribute preserve attribute name case?\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 30)",
        "(line 35,col 9)-(line 35,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeTag(java.lang.String)",
      "begin_line": 41,
      "end_line": 46,
      "comment": "\n     * Normalizes a tag name according to the case preservation setting.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)",
        "(line 43,col 9)-(line 44,col 35)",
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttribute(java.lang.String)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * Normalizes an attribute according to the case preservation setting.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)",
        "(line 53,col 9)-(line 54,col 35)",
        "(line 55,col 9)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttributes(org.jsoup.nodes.Attributes)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 26)"
      ]
    }
  ]
}