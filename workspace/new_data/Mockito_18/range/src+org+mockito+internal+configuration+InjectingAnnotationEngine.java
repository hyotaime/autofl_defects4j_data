{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/InjectingAnnotationEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InjectingAnnotationEngine",
      "is_interface": false,
      "parent_types": [
        "org.mockito.configuration.AnnotationEngine"
      ],
      "begin_line": 22,
      "end_line": 103,
      "comment": "\n * See {@link MockitoAnnotations}\n "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "spyAnnotationEngine"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.InjectingAnnotationEngine.createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)",
      "begin_line": 33,
      "end_line": 36,
      "comment": "*\n     * Create a mock using {@link DefaultAnnotationEngine}\n     *\n     * @see org.mockito.internal.configuration.DefaultAnnotationEngine\n     * @see org.mockito.configuration.AnnotationEngine#createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.InjectingAnnotationEngine.process(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Process the fields of the test instance and create Mocks, Spies, Captors and inject them on fields\n     * annotated \u0026#64;InjectMocks.\n     *\n     * \u003cp\u003e\n     * This code process the test class and the super classes.\n     * \u003col\u003e\n     * \u003cli\u003eFirst create Mocks, Spies, Captors.\u003c/li\u003e\n     * \u003cli\u003eThen try to inject them.\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param clazz Not used\n     * @param testInstance The instance of the test, should not be null.\n     *\n     * @see org.mockito.configuration.AnnotationEngine#process(Class, Object)\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 77)",
        "(line 56,col 9)-(line 56,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.InjectingAnnotationEngine.processInjectMocks(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 38)",
        "(line 61,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.InjectingAnnotationEngine.processIndependentAnnotations(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 67,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)",
        "(line 69,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.InjectingAnnotationEngine.injectMocks(java.lang.Object)",
      "begin_line": 89,
      "end_line": 101,
      "comment": "\n     * Initializes mock/spies dependencies for objects annotated with\n     * \u0026#064;InjectMocks for given testClassInstance.\n     * \u003cp\u003e\n     * See examples in javadoc for {@link MockitoAnnotations} class.\n     * \n     * @param testClassInstance\n     *            Test class, usually \u003ccode\u003ethis\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 54)",
        "(line 91,col 9)-(line 91,col 62)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 104)"
      ]
    }
  ]
}