{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 2306,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.util.Map\u003cjava.lang.Character, java.lang.String\u003e)",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 13)-(line 26,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.getMap()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 13)-(line 30,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlByVal"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseByVal"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fullByVal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unescapePattern"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strictUnescapePattern"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Check if the input is a known named entity\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\"\n     * @return true if a known named entity\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get the Character value of the named entity\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027\u003c\u0027 or \u0027\u0026\u0027)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 65,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 69)",
        "(line 67,col 9)-(line 67,col 57)",
        "(line 69,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 92,
      "end_line": 125,
      "comment": "\n     * Unescape the input string.\n     * @param string\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 26)",
        "(line 97,col 9)-(line 97,col 100)",
        "(line 98,col 9)-(line 98,col 63)",
        "(line 101,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 28)",
        "(line 124,col 9)-(line 124,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlArray"
      ],
      "begin_line": 128,
      "end_line": 134,
      "comment": " xhtml has restricted entities"
    },
    {
      "type": "field",
      "varNames": [
        "baseArray"
      ],
      "begin_line": 138,
      "end_line": 245,
      "comment": " e.g. \u0026amp"
    },
    {
      "type": "field",
      "varNames": [
        "fullArray"
      ],
      "begin_line": 249,
      "end_line": 2282,
      "comment": " are people really likely to remember \"\u0026CounterClockwiseContourIntegral;\"? good grief."
    }
  ]
}