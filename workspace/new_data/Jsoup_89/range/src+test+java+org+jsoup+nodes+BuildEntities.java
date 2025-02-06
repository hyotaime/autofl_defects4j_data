{
  "filepath": "/tmp/Jsoup-89b/src/test/java/org/jsoup/nodes/BuildEntities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BuildEntities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 137,
      "comment": "\n * Fetches HTML entity names from w3.org json, and outputs data files for optimized used in Entities.\n * I refuse to believe that entity names like \"NotNestedLessLess\" are valuable or useful for HTML authors. Implemented\n * only to be complete.\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.main(java.lang.String[])",
      "begin_line": 24,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 82)",
        "(line 26,col 9)-(line 29,col 23)",
        "(line 31,col 9)-(line 31,col 31)",
        "(line 32,col 9)-(line 34,col 25)",
        "(line 38,col 9)-(line 38,col 57)",
        "(line 39,col 9)-(line 39,col 57)",
        "(line 41,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 39)",
        "(line 56,col 9)-(line 56,col 67)",
        "(line 57,col 9)-(line 57,col 67)",
        "(line 58,col 9)-(line 58,col 45)",
        "(line 59,col 9)-(line 59,col 45)",
        "(line 62,col 9)-(line 62,col 117)",
        "(line 63,col 9)-(line 67,col 9)",
        "(line 70,col 9)-(line 70,col 39)",
        "(line 71,col 9)-(line 71,col 39)",
        "(line 73,col 9)-(line 73,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.persist(java.lang.String, java.util.ArrayList\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 64)",
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 86,col 9)-(line 86,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharacterRef",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 90,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codepoints"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeIndex"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.CharacterRef.toString()",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 101,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.d(int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ByName",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e"
      ],
      "begin_line": 109,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.ByName.compare(org.jsoup.nodes.BuildEntities.CharacterRef, org.jsoup.nodes.BuildEntities.CharacterRef)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ByCode",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e"
      ],
      "begin_line": 115,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.ByCode.compare(org.jsoup.nodes.BuildEntities.CharacterRef, org.jsoup.nodes.BuildEntities.CharacterRef)",
      "begin_line": 116,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 37)",
        "(line 118,col 13)-(line 118,col 37)",
        "(line 119,col 13)-(line 119,col 38)",
        "(line 120,col 13)-(line 121,col 29)",
        "(line 122,col 13)-(line 127,col 13)",
        "(line 128,col 13)-(line 131,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "byName"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byCode"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    }
  ]
}