{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/mock/MockCreationSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockCreationSettings",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 83,
      "comment": "\n * Informs about the mock settings. An immutable view of {@link org.mockito.MockSettings}.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getTypeToMock()",
      "begin_line": 23,
      "end_line": 23,
      "comment": "\n     * Mocked type. An interface or class the mock should implement / extend.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getExtraInterfaces()",
      "begin_line": 28,
      "end_line": 28,
      "comment": "\n     * the extra interfaces the mock object should implement.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getMockName()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * the name of this mock, as printed on verification errors; see {@link org.mockito.MockSettings#name}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getDefaultAnswer()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * the default answer for this mock, see {@link org.mockito.MockSettings#defaultAnswer}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getSpiedInstance()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * the spied instance - needed for spies.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.isSerializable()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * if the mock is serializable, see {@link org.mockito.MockSettings#serializable}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getSerializableMode()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * @return the serializable mode of this mock\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.isStubOnly()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Whether the mock is only for stubbing, i.e. does not remember\n     * parameters on its invocation and therefore cannot\n     * be used for verification\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getInvocationListeners()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The invocation listeners attached to this mock, see {@link org.mockito.MockSettings#invocationListeners}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.isUsingConstructor()",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Informs whether the mock instance should be created via constructor\n     *\n     * @since 1.10.12\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.mock.MockCreationSettings.getOuterClassInstance()",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Used when mocking non-static inner classes in conjunction with {@link #isUsingConstructor()}\n     *\n     * @return the outer class instance used for creation of the mock object via the constructor.\n     * @since 1.10.12\n     ",
      "child_ranges": []
    }
  ]
}