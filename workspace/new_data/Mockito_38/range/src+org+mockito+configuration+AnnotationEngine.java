{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/configuration/AnnotationEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationEngine",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 34,
      "comment": "\r\n * Configures mock creation logic behind \u0026#064;Mock annotations\r\n * \u003cp\u003e\r\n * If you are interested then see implementations or source code of {@link MockitoAnnotations#initMocks(Object)}\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.AnnotationEngine.createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\r\n     * Usually the implementation checks the annotation  \r\n     * and then creates a mock object for specified field.\r\n     * \u003cp\u003e\r\n     * You don\u0027t need to set the mock on the field. Mockito does it for you. \r\n     * If in doubts look for implementations of this interface.\r\n     * \u003cp\u003e\r\n     * For annotations that you don\u0027t care about just return null - then Mockito will not initialize this field\r\n     * \r\n     * @param annotation annotation on the field, for example \u0026#064;Mock\r\n     * @param field field to create mock object for\r\n     * @return mock created for specified field. Can be null - then Mockito will not initialize the field\r\n     ",
      "child_ranges": []
    }
  ]
}