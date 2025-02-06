{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/Entities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Entities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 184,
      "comment": "\n * HTML entities, and escape routines.\n * Source: \u003ca href\u003d\"http://www.w3.org/TR/html5/named-character-references.html#named-character-references\"\u003eW3C HTML\n * named character references\u003c/a\u003e.\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.EscapeMode(java.util.Map\u003cjava.lang.Character, java.lang.String\u003e)",
      "begin_line": 26,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 13)-(line 27,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.EscapeMode.getMap()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 13)-(line 31,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlByVal"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseByVal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fullByVal"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unescapePattern"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strictUnescapePattern"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Entities.Entities()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.isNamedEntity(java.lang.String)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Check if the input is a known named entity\n     * @param name the possible entity name (e.g. \"lt\" or \"amp\"\n     * @return true if a known named entity\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.getCharacterByName(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Get the Character value of the named entity\n     * @param name named entity (e.g. \"lt\" or \"amp\")\n     * @return the Character value of the named entity (e.g. \u0027\u003c\u0027 or \u0027\u0026\u0027)\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.escape(java.lang.String, java.nio.charset.CharsetEncoder, org.jsoup.nodes.Entities.EscapeMode)",
      "begin_line": 66,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 69)",
        "(line 68,col 9)-(line 68,col 57)",
        "(line 70,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.unescape(java.lang.String, boolean)",
      "begin_line": 93,
      "end_line": 126,
      "comment": "\n     * Unescape the input string.\n     * @param string\n     * @param strict if \"strict\" (that is, requires trailing \u0027;\u0027 char, otherwise that\u0027s optional)\n     * @return\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 26)",
        "(line 98,col 9)-(line 98,col 100)",
        "(line 99,col 9)-(line 99,col 63)",
        "(line 102,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 28)",
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "xhtmlArray"
      ],
      "begin_line": 129,
      "end_line": 135,
      "comment": " xhtml has restricted entities"
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.loadEntities(java.lang.String)",
      "begin_line": 149,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 151,col 75)",
        "(line 152,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Entities.toCharacterKey(java.util.Map\u003cjava.lang.String, java.lang.Character\u003e)",
      "begin_line": 168,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 73)",
        "(line 170,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 22)"
      ]
    }
  ]
}