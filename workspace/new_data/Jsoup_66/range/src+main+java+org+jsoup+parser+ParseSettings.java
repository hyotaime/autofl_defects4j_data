{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/ParseSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParseSettings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 58,
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
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 27)",
        "(line 40,col 9)-(line 41,col 35)",
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttribute(java.lang.String)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)",
        "(line 47,col 9)-(line 48,col 35)",
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseSettings.normalizeAttributes(org.jsoup.nodes.Attributes)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 26)"
      ]
    }
  ]
}