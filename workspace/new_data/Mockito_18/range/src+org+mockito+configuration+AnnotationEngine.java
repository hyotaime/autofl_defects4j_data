{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/configuration/AnnotationEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnnotationEngine",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 41,
      "comment": "\n * Configures mock creation logic behind \u0026#064;Mock, \u0026#064;Captor and \u0026#064;Spy annotations\n * \u003cp\u003e\n * If you are interested then see implementations or source code of {@link MockitoAnnotations#initMocks(Object)}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.AnnotationEngine.createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)",
      "begin_line": 29,
      "end_line": 30,
      "comment": "\n     * @deprecated\n     * Please use {@link AnnotationEngine#process(Class, Object)} method instead that is more robust\n     * \u003cp\u003e\n     * Creates mock, ArgumentCaptor or wraps field instance in spy object.\n     * Only if of correct annotation type.\n     *\n     * @param annotation Annotation\n     * @param field Field details\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.AnnotationEngine.process(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Allows extending the interface to perform action on specific fields on the test class.\n     * \u003cp\u003e\n     * See the implementation of this method to figure out what is it for.\n     * \n     * @param clazz Class where to extract field information, check implementation for details\n     * @param testInstance Test instance\n     ",
      "child_ranges": []
    }
  ]
}