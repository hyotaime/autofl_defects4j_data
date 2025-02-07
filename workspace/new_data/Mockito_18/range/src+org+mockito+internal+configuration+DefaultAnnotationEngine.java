{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/DefaultAnnotationEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultAnnotationEngine",
      "is_interface": false,
      "parent_types": [
        "org.mockito.configuration.AnnotationEngine"
      ],
      "begin_line": 28,
      "end_line": 87,
      "comment": "\n * Initializes fields annotated with \u0026#64;{@link org.mockito.Mock} or \u0026#64;{@link org.mockito.Captor}.\n *\n * \u003cp\u003e\n * The {@link #process(Class, Object)} method implementation \u003cstrong\u003edoes not\u003c/strong\u003e process super classes!\n *\n * @see MockitoAnnotations\n "
    },
    {
      "type": "field",
      "varNames": [
        "annotationProcessorMap"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.DefaultAnnotationEngine()",
      "begin_line": 32,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 79)",
        "(line 34,col 9)-(line 34,col 116)",
        "(line 35,col 9)-(line 35,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)",
      "begin_line": 41,
      "end_line": 44,
      "comment": " (non-Javadoc)\n    * @see org.mockito.AnnotationEngine#createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)\n    ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.forAnnotation(A)",
      "begin_line": 46,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 54,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.Anonymous-e6e27706-4b2d-4707-8c67-ba4ab76687f7.process(A, java.lang.reflect.Field)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 17)-(line 52,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.registerAnnotationProcessor(java.lang.Class\u003cA\u003e, org.mockito.internal.configuration.FieldAnnotationProcessor\u003cA\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.process(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 61,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 51)",
        "(line 63,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.DefaultAnnotationEngine.throwIfAlreadyAssigned(java.lang.reflect.Field, boolean)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)"
      ]
    }
  ]
}