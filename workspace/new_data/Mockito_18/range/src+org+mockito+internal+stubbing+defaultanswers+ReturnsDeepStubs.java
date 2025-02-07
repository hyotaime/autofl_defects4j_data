{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/stubbing/defaultanswers/ReturnsDeepStubs.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReturnsDeepStubs",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 167,
      "comment": "\n * Returning deep stub implementation.\n *\n * Will return previously created mock if the invocation matches.\n *\n * \u003cp\u003eSupports nested generic information, with this answer you can write code like this :\n *\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *     interface GenericsNest\u0026lt;K extends Comparable\u0026lt;K\u0026gt; \u0026 Cloneable\u0026gt; extends Map\u0026lt;K, Set\u0026lt;Number\u0026gt;\u0026gt; {}\n *\n *     GenericsNest\u0026lt;?\u0026gt; mock \u003d mock(GenericsNest.class, new ReturnsGenericDeepStubs());\n *     Number number \u003d mock.entrySet().iterator().next().getValue().iterator().next();\n * \u003c/code\u003e\u003c/pre\u003e\n * \u003c/p\u003e\n *\n * @see org.mockito.Mockito#RETURNS_DEEP_STUBS\n * @see org.mockito.Answers#RETURNS_DEEP_STUBS\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 47,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 49,col 111)",
        "(line 51,col 9)-(line 51,col 63)",
        "(line 52,col 9)-(line 54,col 9)",
        "(line 56,col 9)-(line 56,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.deepStub(org.mockito.invocation.InvocationOnMock, org.mockito.internal.util.reflection.GenericMetadataSupport)",
      "begin_line": 59,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 98)",
        "(line 61,col 9)-(line 61,col 103)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 71,col 9)-(line 74,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.newDeepStubMock(org.mockito.internal.util.reflection.GenericMetadataSupport, java.lang.Object)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Creates a mock using the Generics Metadata.\n     *\n     * \u003cli\u003eFinally as we want to mock the actual type, but we want to pass along the contextual generics meta-data\n     * that was resolved for the current return type, for this to happen we associate to the mock an new instance of\n     * {@link ReturnsDeepStubs} answer in which we will store the returned type generic metadata.\n     *\n     * @param returnTypeGenericMetadata The metadata to use to create the new mock.\n     * @param parentMock The parent of the current deep stub mock.\n     * @return The mock\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 93)",
        "(line 90,col 9)-(line 93,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.withSettingsUsing(org.mockito.internal.util.reflection.GenericMetadataSupport, org.mockito.mock.MockCreationSettings)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 33)",
        "(line 101,col 9)-(line 102,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.propagateSerializationSettings(org.mockito.MockSettings, org.mockito.mock.MockCreationSettings)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.returnsDeepStubsAnswerUsing(org.mockito.internal.util.reflection.GenericMetadataSupport)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.recordDeepStubAnswer(java.lang.Object, org.mockito.internal.stubbing.InvocationContainerImpl)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 66)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.actualParameterizedType(java.lang.Object)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 113)",
        "(line 120,col 9)-(line 120,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReturnsDeepStubsSerializationFallback",
      "is_interface": false,
      "parent_types": [
        "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs",
        "java.io.Serializable"
      ],
      "begin_line": 124,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnTypeGenericMetadata"
      ],
      "begin_line": 125,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.ReturnsDeepStubsSerializationFallback.ReturnsDeepStubsSerializationFallback(org.mockito.internal.util.reflection.GenericMetadataSupport)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.ReturnsDeepStubsSerializationFallback.actualParameterizedType(java.lang.Object)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.ReturnsDeepStubsSerializationFallback.writeReplace()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DeeplyStubbedAnswer",
      "is_interface": false,
      "parent_types": [
        "org.mockito.stubbing.Answer\u003cjava.lang.Object\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 142,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 143,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.DeeplyStubbedAnswer.DeeplyStubbedAnswer(java.lang.Object)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.DeeplyStubbedAnswer.answer(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.mockitoCore()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs.delegate()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 163,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MOCKITO_CORE"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DELEGATE"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    }
  ]
}