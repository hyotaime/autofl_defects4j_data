{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/plugins/PluginRegistry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PluginRegistry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 7,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pluginSwitch"
      ],
      "begin_line": 9,
      "end_line": 10,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mockMaker"
      ],
      "begin_line": 12,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stackTraceCleanerProvider"
      ],
      "begin_line": 15,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.PluginRegistry.getStackTraceCleanerProvider()",
      "begin_line": 21,
      "end_line": 24,
      "comment": "\n     * The implementation of the stack trace cleaner\n     ",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.plugins.PluginRegistry.getMockMaker()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Returns the implementation of the mock maker available for the current runtime.\n     *\n     * \u003cp\u003eReturns {@link org.mockito.internal.creation.cglib.CglibMockMaker} if no\n     * {@link org.mockito.plugins.MockMaker} extension exists or is visible in the current classpath.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 25)"
      ]
    }
  ]
}