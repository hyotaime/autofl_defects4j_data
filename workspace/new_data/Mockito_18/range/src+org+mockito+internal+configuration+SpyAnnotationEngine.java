{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/SpyAnnotationEngine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SpyAnnotationEngine",
      "is_interface": false,
      "parent_types": [
        "org.mockito.configuration.AnnotationEngine"
      ],
      "begin_line": 39,
      "end_line": 129,
      "comment": "\n * Process fields annotated with \u0026#64;Spy.\n * \u003cp/\u003e\n * \u003cp\u003e\n * Will try transform the field in a spy as with \u003ccode\u003eMockito.spy()\u003c/code\u003e.\n * \u003c/p\u003e\n * \u003cp/\u003e\n * \u003cp\u003e\n * If the field is not initialized, will try to initialize it, with a no-arg constructor.\n * \u003c/p\u003e\n * \u003cp/\u003e\n * \u003cp\u003e\n * If the field is also annotated with the \u003cstrong\u003ecompatible\u003c/strong\u003e \u0026#64;InjectMocks then the field will be ignored,\n * The injection engine will handle this specific case.\n * \u003c/p\u003e\n * \u003cp/\u003e\n * \u003cp\u003eThis engine will fail, if the field is also annotated with incompatible Mockito annotations.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.SpyAnnotationEngine.createMockFor(java.lang.annotation.Annotation, java.lang.reflect.Field)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.SpyAnnotationEngine.process(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 46,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.SpyAnnotationEngine.assertNotInterface(java.lang.Object, java.lang.Class\u003c?\u003e)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 68)",
        "(line 78,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.SpyAnnotationEngine.newSpyInstance(java.lang.Object, java.lang.reflect.Field)",
      "begin_line": 83,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.SpyAnnotationEngine.assertNoIncompatibleAnnotations(java.lang.Class, java.lang.reflect.Field, java.lang.Class...)",
      "begin_line": 122,
      "end_line": 128,
      "comment": "TODO duplicated elsewhere",
      "child_ranges": [
        "(line 123,col 9)-(line 127,col 9)"
      ]
    }
  ]
}