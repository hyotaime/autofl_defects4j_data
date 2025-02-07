{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/invocation/MockHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockHandler",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 16,
      "end_line": 29,
      "comment": "\n * Mockito handler of an invocation on a mock. This is a core part of the API, the heart of Mockito.\n * See also the {@link org.mockito.plugins.MockMaker}.\n * \u003cp\u003e\n * This api is work in progress. Do not provide your own implementations.\n * Mockito will provide you with the implementation via other {@link org.mockito.plugins.MockMaker} methods.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.MockHandler.handle(org.mockito.invocation.Invocation)",
      "begin_line": 28,
      "end_line": 28,
      "comment": "\n     * Takes an invocation object and handles it.\n     * \u003cp\u003e\n     * The default implementation provided by Mockito handles invocations by recording\n     * method calls on mocks for further verification, captures the stubbing information when mock is stubbed,\n     * returns the stubbed values for invocations that have been stubbed, and much more.\n     *\n     * @param invocation The invocation to handle\n     * @return Result\n     * @throws Throwable Throwable\n     ",
      "child_ranges": []
    }
  ]
}