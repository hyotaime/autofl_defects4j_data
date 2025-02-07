{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/plugins/MockMaker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockMaker",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 102,
      "comment": "\n * The facility to create mocks.\n *\n * \u003cp\u003eBy default, an internal byte-buddy/asm/objenesis based implementation is used.\u003c/p\u003e\n *\n * \u003cp\u003e{@code MockMaker} is an extension point that makes it possible to use custom dynamic proxies\n * and avoid using the default byte-buddy/asm/objenesis implementation.\n * For example, the android users can use a MockMaker that can work with Dalvik virtual machine\n * and hence bring Mockito to android apps developers.\u003c/p\u003e\n *\n * \u003ch3\u003eUsing the extension point\u003c/h3\u003e\n *\n * \u003cp\u003eSuppose you wrote an extension to create mocks with some \u003cem\u003eAwesome\u003c/em\u003e library, in order to tell\n * Mockito to use it you need to put in your \u003cstrong\u003eclasspath\u003c/strong\u003e:\n * \u003col style\u003d\"list-style-type: lower-alpha\"\u003e\n *     \u003cli\u003e\n *         The implementation itself, for example \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e that\n *         extends the \u003ccode\u003eMockMaker\u003c/code\u003e.\n *     \u003c/li\u003e\n *     \u003cli\u003e\n *         A file \"\u003ccode\u003emockito-extensions/org.mockito.plugins.MockMaker\u003c/code\u003e\". The content of this file is\n *         exactly a \u003cstrong\u003eone\u003c/strong\u003e line with the qualified name:\n *         \u003ccode\u003eorg.awesome.mockito.AwesomeMockMaker\u003c/code\u003e.\n*      \u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n *\n * \u003cp\u003eNote that if several \u003ccode\u003emockito-extensions/org.mockito.plugins.MockMaker\u003c/code\u003e files exists in the classpath\n * Mockito will only use the first returned by the standard {@link ClassLoader#getResource} mechanism.\n *\n * @see org.mockito.mock.MockCreationSettings\n * @see org.mockito.invocation.MockHandler\n * @since 1.9.5\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.plugins.MockMaker.createMock(org.mockito.mock.MockCreationSettings\u003cT\u003e, org.mockito.invocation.MockHandler)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * If you want to provide your own implementation of {@code MockMaker} this method should:\n     * \u003cul\u003e\n     *     \u003cli\u003eCreate a proxy object that implements {@code settings.typeToMock} and potentially also {@code settings.extraInterfaces}.\u003c/li\u003e\n     *     \u003cli\u003eYou may use the information from {@code settings} to create/configure your proxy object.\u003c/li\u003e\n     *     \u003cli\u003eYour proxy object should carry the {@code handler} with it. For example, if you generate byte code\n     *     to create the proxy you could generate an extra field to keep the {@code handler} with the generated object.\n     *     Your implementation of {@code MockMaker} is required to provide this instance of {@code handler} when\n     *     {@link #getHandler(Object)} is called.\n     *     \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param settings - mock creation settings like type to mock, extra interfaces and so on.\n     * @param handler See {@link org.mockito.invocation.MockHandler}.\n     *                \u003cb\u003eDo not\u003c/b\u003e provide your own implementation at this time. Make sure your implementation of\n     *                {@link #getHandler(Object)} will return this instance.\n     * @param \u003cT\u003e Type of the mock to return, actually the \u003ccode\u003esettings.getTypeToMock\u003c/code\u003e.\n     * @return The mock instance.\n     * @since 1.9.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.plugins.MockMaker.getHandler(java.lang.Object)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Returns the handler for the {@code mock}. \u003cb\u003eDo not\u003c/b\u003e provide your own implementations at this time\n     * because the work on the {@link MockHandler} api is not completed.\n     * Use the instance provided to you by Mockito at {@link #createMock} or {@link #resetMock}.\n     *\n     * @param mock The mock instance.\n     * @return may return null - it means that there is no handler attached to provided object.\n     *   This means the passed object is not really a Mockito mock.\n     * @since 1.9.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.plugins.MockMaker.resetMock(java.lang.Object, org.mockito.invocation.MockHandler, org.mockito.mock.MockCreationSettings)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Replaces the existing handler on {@code mock} with {@code newHandler}.\n     *\n     * \u003cp\u003eThe invocation handler actually store invocations to achieve\n     * stubbing and verification. In order to reset the mock, we pass\n     * a new instance of the invocation handler.\u003c/p\u003e\n     *\n     * \u003cp\u003eYour implementation should make sure the {@code newHandler} is correctly associated to passed {@code mock}\u003c/p\u003e\n     *\n     * @param mock The mock instance whose invocation handler is to be replaced.\n     * @param newHandler The new invocation handler instance.\n     * @param settings The mock settings - should you need to access some of the mock creation details.\n     * @since 1.9.5\n     ",
      "child_ranges": []
    }
  ]
}