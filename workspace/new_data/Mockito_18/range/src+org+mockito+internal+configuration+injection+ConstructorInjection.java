{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/ConstructorInjection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstructorInjection",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.configuration.injection.MockInjectionStrategy"
      ],
      "begin_line": 38,
      "end_line": 92,
      "comment": "\n * Injection strategy based on constructor.\n *\n * \u003cp\u003e\n * The strategy will search for the constructor with most parameters\n * and try to resolve mocks by type.\n * \u003c/p\u003e\n *\n * \u003cblockquote\u003e\n * TODO on missing mock type, shall it abandon or create \"noname\" mocks.\n * TODO and what if the arg type is not mockable.\n * \u003c/blockquote\u003e\n *\n * \u003cp\u003e\n * For now the algorithm tries to create anonymous mocks if an argument type is missing.\n * If not possible the algorithm abandon resolution.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "argResolver"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.ConstructorInjection()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.ConstructorInjection(org.mockito.internal.util.reflection.FieldInitializer.ConstructorArgumentResolver)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " visible for testing",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.processInjection(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 49,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleArgumentResolver",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.util.reflection.FieldInitializer.ConstructorArgumentResolver"
      ],
      "begin_line": 69,
      "end_line": 90,
      "comment": "\n     * Returns mocks that match the argument type, if not possible assigns null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "objects"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.SimpleArgumentResolver.SimpleArgumentResolver(java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.SimpleArgumentResolver.resolveTypeInstances(java.lang.Class\u003c?\u003e...)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 84)",
        "(line 78,col 13)-(line 80,col 13)",
        "(line 81,col 13)-(line 81,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.ConstructorInjection.SimpleArgumentResolver.objectThatIsAssignableFrom(java.lang.Class\u003c?\u003e)",
      "begin_line": 84,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 87,col 13)",
        "(line 88,col 13)-(line 88,col 24)"
      ]
    }
  ]
}