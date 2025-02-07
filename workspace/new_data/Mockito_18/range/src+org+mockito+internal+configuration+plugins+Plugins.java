{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/plugins/Plugins.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Plugins",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 9,
      "end_line": 29,
      "comment": "\n * Access to Mockito behavior that can be reconfigured by plugins\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.Plugins.getStackTraceCleanerProvider()",
      "begin_line": 16,
      "end_line": 18,
      "comment": "\n     * The implementation of the stack trace cleaner\n     ",
      "child_ranges": [
        "(line 17,col 9)-(line 17,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.Plugins.getMockMaker()",
      "begin_line": 26,
      "end_line": 28,
      "comment": "\n     * Returns the implementation of the mock maker available for the current runtime.\n     *\n     * \u003cp\u003eReturns default mock maker if no\n     * {@link org.mockito.plugins.MockMaker} extension exists or is visible in the current classpath.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 39)"
      ]
    }
  ]
}