{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/MockInjection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockInjection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 97,
      "comment": "\n * Internal injection configuration utility.\n *\n * \u003cp\u003e\n * Allow the user of this class to configure the way the injection of mocks will happen.\n * \u003c/p\u003e\n *\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.onField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Create a new configuration setup for a field\n     *\n     *\n     * @param field Field needing mock injection\n     * @param ofInstance Instance owning the \u003ccode\u003efield\u003c/code\u003e\n     * @return New configuration builder\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.onFields(java.util.Set\u003cjava.lang.reflect.Field\u003e, java.lang.Object)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Create a new configuration setup for fields\n     *\n     *\n     * @param fields Fields needing mock injection\n     * @param ofInstance Instance owning the \u003ccode\u003efield\u003c/code\u003e\n     * @return New configuration builder\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OngoingMockInjection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 96,
      "comment": "\n     * Ongoing configuration of the mock injector.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mocks"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fieldOwner"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectionStrategies"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "postInjectionStrategies"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.OngoingMockInjection(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.OngoingMockInjection(java.util.Set\u003cjava.lang.reflect.Field\u003e, java.lang.Object)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 69)",
        "(line 67,col 13)-(line 67,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.withMocks(java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 60)",
        "(line 72,col 13)-(line 72,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.tryConstructorInjection()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 68)",
        "(line 77,col 13)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.tryPropertyOrFieldInjection()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 74)",
        "(line 82,col 13)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.handleSpyAnnotation()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 78)",
        "(line 87,col 13)-(line 87,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection.apply()",
      "begin_line": 90,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 94,col 13)"
      ]
    }
  ]
}