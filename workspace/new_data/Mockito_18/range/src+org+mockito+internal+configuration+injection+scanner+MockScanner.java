{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/scanner/MockScanner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockScanner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 21,
      "end_line": 89,
      "comment": "\n * Scan mocks, and prepare them if needed.\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockUtil"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "clazz"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.MockScanner(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "\n     * Creates a MockScanner.\n     *\n     * @param instance The test instance\n     * @param clazz    The class in the type hierarchy of this instance.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 33)",
        "(line 34,col 9)-(line 34,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.addPreparedMocks(java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Add the scanned and prepared mock instance to the given collection.\n     *\n     * \u003cp\u003e\n     * The preparation of mocks consists only in defining a MockName if not already set.\n     * \u003c/p\u003e\n     *\n     * @param mocks Set of mocks\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.scan()",
      "begin_line": 55,
      "end_line": 67,
      "comment": "\n     * Scan and prepare mocks for the given \u003ccode\u003etestClassInstance\u003c/code\u003e and \u003ccode\u003eclazz\u003c/code\u003e in the type hierarchy.\n     *\n     * @return A prepared set of mock\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 49)",
        "(line 57,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.preparedMock(java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 69,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.isAnnotatedByMockOrSpy(java.lang.reflect.Field)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.scanner.MockScanner.isMockOrSpy(java.lang.Object)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 44)"
      ]
    }
  ]
}