{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/exceptions/base/StackTraceFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackTraceFilter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.exceptions.base.StackTraceFilter.isBad(java.lang.StackTraceElement)",
      "begin_line": 14,
      "end_line": 20,
      "comment": "",
      "child_ranges": [
        "(line 15,col 9)-(line 15,col 93)",
        "(line 16,col 9)-(line 16,col 77)",
        "(line 17,col 9)-(line 17,col 79)",
        "(line 18,col 9)-(line 18,col 96)",
        "(line 19,col 9)-(line 19,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.exceptions.base.StackTraceFilter.filter(java.lang.StackTraceElement[], boolean)",
      "begin_line": 27,
      "end_line": 54,
      "comment": "\n     * Example how the filter works (+/- means good/bad):\n     * [a+, b+, c-, d+, e+, f-, g+] -\u003e [a+, b+, g+]\n     * Basically removes all bad from the middle. If any good are in the middle of bad those are also removed. \n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 77)",
        "(line 31,col 9)-(line 31,col 25)",
        "(line 32,col 9)-(line 32,col 26)",
        "(line 33,col 9)-(line 41,col 9)",
        "(line 43,col 9)-(line 43,col 36)",
        "(line 44,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 50,col 112)",
        "(line 51,col 9)-(line 51,col 81)",
        "(line 52,col 9)-(line 52,col 32)",
        "(line 53,col 9)-(line 53,col 59)"
      ]
    }
  ]
}