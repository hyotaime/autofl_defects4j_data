{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/PropertyAndSetterInjection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertyAndSetterInjection",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.configuration.injection.MockInjectionStrategy"
      ],
      "begin_line": 60,
      "end_line": 130,
      "comment": "\n * Inject mocks using first setters then fields, if no setters available.\n *\n * \u003cp\u003e\n * \u003cu\u003eAlgorithm :\u003cbr\u003e\u003c/u\u003e\n * for each field annotated by @InjectMocks\n *   \u003cul\u003e\n *   \u003cli\u003einitialize field annotated by @InjectMocks\n *   \u003cli\u003efor each fields of a class in @InjectMocks type hierarchy\n *     \u003cul\u003e\n *     \u003cli\u003emake a copy of mock candidates\n *     \u003cli\u003eorder fields from sub-type to super-type, then by field name\n *     \u003cli\u003efor the list of fields in a class try two passes of :\n *         \u003cul\u003e\n *             \u003cli\u003efind mock candidate by type\n *             \u003cli\u003eif more than \u003cb\u003e*one*\u003c/b\u003e candidate find mock candidate on name\n *             \u003cli\u003eif one mock candidate then\n *                 \u003cul\u003e\n *                     \u003cli\u003eset mock by property setter if possible\n *                     \u003cli\u003eelse set mock by field injection\n *                 \u003c/ul\u003e\n *             \u003cli\u003eremove mock from mocks copy (mocks are just injected once in a class)\n *             \u003cli\u003eremove injected field from list of class fields\n *         \u003c/ul\u003e\n *     \u003cli\u003eelse don\u0027t fail, user will then provide dependencies\n *     \u003c/ul\u003e\n *   \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * \u003cu\u003eNote:\u003c/u\u003e If the field needing injection is not initialized, the strategy tries\n * to create one using a no-arg constructor of the field type.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "mockCandidateFilter"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "notFinalOrStatic"
      ],
      "begin_line": 64,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.Anonymous-04cf204b-8aa0-4483-8335-034439c437f9.isOut(java.lang.reflect.Field)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.processInjection(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 71,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 111)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 50)",
        "(line 78,col 9)-(line 78,col 70)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.initializeInjectMocksField(java.lang.reflect.Field, java.lang.Object)",
      "begin_line": 86,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidates(java.lang.Class\u003c?\u003e, java.util.Set\u003cjava.lang.Object\u003e, java.lang.Object)",
      "begin_line": 101,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 103,col 94)",
        "(line 105,col 9)-(line 105,col 117)",
        "(line 107,col 9)-(line 107,col 117)",
        "(line 108,col 9)-(line 108,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.injectMockCandidatesOnFields(java.util.Set\u003cjava.lang.Object\u003e, java.lang.Object, boolean, java.util.List\u003cjava.lang.reflect.Field\u003e)",
      "begin_line": 111,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.PropertyAndSetterInjection.orderedInstanceFieldsFrom(java.lang.Class\u003c?\u003e)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 95)",
        "(line 126,col 9)-(line 126,col 75)",
        "(line 128,col 9)-(line 128,col 63)"
      ]
    }
  ]
}