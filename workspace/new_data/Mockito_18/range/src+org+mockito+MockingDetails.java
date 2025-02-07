{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/MockingDetails.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockingDetails",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 43,
      "comment": "\n * Provides mocking information.\n * For example, you can identify whether a particular object is either a mock or a spy.\n *\n * @since 1.9.5\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.MockingDetails.isMock()",
      "begin_line": 25,
      "end_line": 25,
      "comment": "\n     * Informs if the object is a mock. isMock() for null input returns false.\n     * @return true if the object is a mock or a spy.\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockingDetails.isSpy()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Informs if the object is a spy. isSpy() for null input returns false.\n     * @return true if the object is a spy.\n     *\n     * @since 1.9.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockingDetails.getInvocations()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Provides a collection of methods indicating the invocations of the object\n     * @return collection of Invocation representing the invocations \n     * for the object.\n     *\n     * @since 1.10.0\n     ",
      "child_ranges": []
    }
  ]
}