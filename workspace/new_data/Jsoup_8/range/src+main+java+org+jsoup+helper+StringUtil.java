{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/helper/StringUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 9,
      "end_line": 123,
      "comment": "\n * A minimal String utility class. Designed for interal jsoup use only.\n "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": " memoised padding up to 10"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Collection\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 19,
      "end_line": 21,
      "comment": "\n     * Join a collection of strings by a seperator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Iterator\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n     * Join a collection of strings by a seperator\n     * @param strings iterator of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 31,col 22)",
        "(line 33,col 9)-(line 33,col 38)",
        "(line 34,col 9)-(line 35,col 25)",
        "(line 37,col 9)-(line 37,col 63)",
        "(line 38,col 9)-(line 41,col 9)",
        "(line 42,col 9)-(line 42,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.padding(int)",
      "begin_line": 50,
      "end_line": 61,
      "comment": "\n     * Returns space padding\n     * @param width amount of padding desired\n     * @return string of spaces * width\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 68)",
        "(line 54,col 9)-(line 55,col 34)",
        "(line 57,col 9)-(line 57,col 37)",
        "(line 58,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isBlank(java.lang.String)",
      "begin_line": 68,
      "end_line": 78,
      "comment": "\n     * Tests if a string is blank: null, emtpy, or only whitespace (\" \", \\r\\n, \\t, etc)\n     * @param string string to test\n     * @return if string is blank\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 70,col 24)",
        "(line 72,col 9)-(line 72,col 32)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isNumeric(java.lang.String)",
      "begin_line": 85,
      "end_line": 95,
      "comment": "\n     * Tests if a string is numeric, i.e. contains only digit characters\n     * @param string string to test\n     * @return true if only digit chars, false if empty or null or contains non-digit chrs\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 25)",
        "(line 89,col 9)-(line 89,col 32)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.normaliseWhitespace(java.lang.String)",
      "begin_line": 97,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 62)",
        "(line 100,col 9)-(line 100,col 37)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 103,col 9)-(line 103,col 32)",
        "(line 104,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 49)"
      ]
    }
  ]
}