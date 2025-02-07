{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/scanner/InjectMocksScanner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InjectMocksScanner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 20,
      "end_line": 68,
      "comment": "\n * Scan field for injection.\n "
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.scanner.InjectMocksScanner.InjectMocksScanner(java.lang.Class\u003c?\u003e)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "\n     * Create a new InjectMocksScanner for the given clazz on the given instance\n     *\n     * @param clazz    Current class in the hierarchy of the test\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.InjectMocksScanner.addTo(java.util.Set\u003cjava.lang.reflect.Field\u003e)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Add the fields annotated by @{@link InjectMocks}\n     *\n     * @param mockDependentFields Set of fields annotated by  @{@link InjectMocks}\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.InjectMocksScanner.scan()",
      "begin_line": 48,
      "end_line": 59,
      "comment": "\n     * Scan fields annotated by \u0026#064;InjectMocks\n     *\n     * @return Fields that depends on Mock\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 62)",
        "(line 50,col 9)-(line 50,col 51)",
        "(line 51,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.InjectMocksScanner.assertNoAnnotations(java.lang.reflect.Field, java.lang.Class...)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 66,col 9)"
      ]
    }
  ]
}