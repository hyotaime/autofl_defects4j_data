{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/exceptions/stacktrace/StackTraceFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackTraceFilter",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 17,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEANER"
      ],
      "begin_line": 21,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.exceptions.stacktrace.StackTraceFilter.filter(java.lang.StackTraceElement[], boolean)",
      "begin_line": 29,
      "end_line": 56,
      "comment": "\n     * Example how the filter works (+/- means good/bad):\n     * [a+, b+, c-, d+, e+, f-, g+] -\u003e [a+, b+, g+]\n     * Basically removes all bad from the middle. If any good are in the middle of bad those are also removed. \n     ",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 77)",
        "(line 33,col 9)-(line 33,col 25)",
        "(line 34,col 9)-(line 34,col 26)",
        "(line 35,col 9)-(line 43,col 9)",
        "(line 45,col 9)-(line 45,col 36)",
        "(line 46,col 9)-(line 50,col 9)",
        "(line 52,col 9)-(line 52,col 112)",
        "(line 53,col 9)-(line 53,col 81)",
        "(line 54,col 9)-(line 54,col 32)",
        "(line 55,col 9)-(line 55,col 59)"
      ]
    }
  ]
}