{
  "filepath": "/tmp/Jsoup-66b/src/test/java/org/jsoup/nodes/BuildEntities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BuildEntities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 135,
      "comment": "\n * Fetches HTML entity names from w3.org json, and outputs data files for optimized used in Entities.\n * I refuse to believe that entity names like \"NotNestedLessLess\" are valuable or useful for HTML authors. Implemented\n * only to be complete.\n "
    },
    {
      "type": "field",
      "varNames": [
        "projectDir"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.main(java.lang.String[])",
      "begin_line": 25,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 82)",
        "(line 27,col 9)-(line 30,col 23)",
        "(line 32,col 9)-(line 32,col 31)",
        "(line 33,col 9)-(line 35,col 25)",
        "(line 39,col 9)-(line 39,col 57)",
        "(line 40,col 9)-(line 40,col 57)",
        "(line 42,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 54,col 39)",
        "(line 57,col 9)-(line 57,col 67)",
        "(line 58,col 9)-(line 58,col 67)",
        "(line 59,col 9)-(line 59,col 45)",
        "(line 60,col 9)-(line 60,col 45)",
        "(line 63,col 9)-(line 63,col 117)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 50)",
        "(line 74,col 9)-(line 74,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.persist(java.lang.String, java.util.ArrayList\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e)",
      "begin_line": 77,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 68)",
        "(line 79,col 9)-(line 79,col 41)",
        "(line 80,col 9)-(line 80,col 56)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharacterRef",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codepoints"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeIndex"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.CharacterRef.toString()",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 99,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.d(int)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ByName",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e"
      ],
      "begin_line": 107,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.ByName.compare(org.jsoup.nodes.BuildEntities.CharacterRef, org.jsoup.nodes.BuildEntities.CharacterRef)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ByCode",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003corg.jsoup.nodes.BuildEntities.CharacterRef\u003e"
      ],
      "begin_line": 113,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.BuildEntities.ByCode.compare(org.jsoup.nodes.BuildEntities.CharacterRef, org.jsoup.nodes.BuildEntities.CharacterRef)",
      "begin_line": 114,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 37)",
        "(line 116,col 13)-(line 116,col 37)",
        "(line 117,col 13)-(line 117,col 38)",
        "(line 118,col 13)-(line 119,col 29)",
        "(line 120,col 13)-(line 125,col 13)",
        "(line 126,col 13)-(line 129,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "byName"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byCode"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    }
  ]
}