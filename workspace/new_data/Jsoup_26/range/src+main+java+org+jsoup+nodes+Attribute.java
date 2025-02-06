{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/Attribute.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Attribute",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cjava.lang.String, java.lang.String\u003e",
        "java.lang.Cloneable"
      ],
      "begin_line": 11,
      "end_line": 131,
      "comment": "\n A single key + value attribute. Keys are trimmed and normalised to lower-case.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 12,
      "end_line": 12,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Attribute.Attribute(java.lang.String, java.lang.String)",
      "begin_line": 21,
      "end_line": 26,
      "comment": "\n     * Create a new attribute from unencoded (raw) key and value.\n     * @param key attribute key\n     * @param value attribute value\n     * @see #createFromEncoded\n     ",
      "child_ranges": [
        "(line 22,col 9)-(line 22,col 31)",
        "(line 23,col 9)-(line 23,col 32)",
        "(line 24,col 9)-(line 24,col 44)",
        "(line 25,col 9)-(line 25,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getKey()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     Get the attribute key.\n     @return the attribute key\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setKey(java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     Set the attribute key. Gets normalised as per the constructor method.\n     @param key the new key; must not be null\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 31)",
        "(line 42,col 9)-(line 42,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.getValue()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     Get the attribute value.\n     @return the attribute value\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.setValue(java.lang.String)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n     Set the attribute value.\n     @param value the new attribute value; must not be null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 32)",
        "(line 59,col 9)-(line 59,col 32)",
        "(line 60,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     Get the HTML representation of this attribute; e.g. {@code href\u003d\"index.html\"}.\n     @return HTML\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.html(java.lang.StringBuilder, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.toString()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     Get the string representation of this attribute, implemented as {@link #html()}.\n     @return string\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.\n     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \\w chars.\n     * @param encodedValue HTML attribute encoded value\n     * @return attribute\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.isDataAttribute()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.equals(java.lang.Object)",
      "begin_line": 103,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 106,col 52)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 110,col 9)-(line 110,col 91)",
        "(line 111,col 9)-(line 111,col 99)",
        "(line 113,col 9)-(line 113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.hashCode()",
      "begin_line": 116,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 54)",
        "(line 119,col 9)-(line 119,col 70)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Attribute.clone()",
      "begin_line": 123,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 129,col 9)"
      ]
    }
  ]
}