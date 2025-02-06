{
  "filepath": "/tmp/Jsoup-89b/src/test/java/org/jsoup/integration/servlets/SlowRider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SlowRider",
      "is_interface": false,
      "parent_types": [
        "BaseServlet"
      ],
      "begin_line": 13,
      "end_line": 62,
      "comment": "\n * Slowly, interminably writes output. For the purposes of testing timeouts and interrupts.\n "
    },
    {
      "type": "field",
      "varNames": [
        "Url"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SleepTime"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MaxTimeParam"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "doGet(HttpServletRequest, HttpServletResponse)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027HttpServletRequest\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 18,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 20)",
        "(line 21,col 9)-(line 21,col 37)",
        "(line 22,col 9)-(line 22,col 49)",
        "(line 23,col 9)-(line 23,col 40)",
        "(line 25,col 9)-(line 25,col 25)",
        "(line 26,col 9)-(line 26,col 57)",
        "(line 27,col 9)-(line 29,col 9)",
        "(line 31,col 9)-(line 31,col 52)",
        "(line 32,col 9)-(line 45,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.servlets.SlowRider.pause(int)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.integration.servlets.SlowRider.main(java.lang.String[])",
      "begin_line": 58,
      "end_line": 61,
      "comment": " allow the servlet to run as a main program, for local test",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)",
        "(line 60,col 9)-(line 60,col 32)"
      ]
    }
  ]
}