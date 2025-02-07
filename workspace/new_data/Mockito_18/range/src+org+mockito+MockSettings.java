{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/MockSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockSettings",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 269,
      "comment": "\n * Allows mock creation with additional mock settings.\n * \u003cp/\u003e\n * Don\u0027t use it too often.\n * Consider writing simple tests that use simple mocks.\n * Repeat after me: simple tests push simple, KISSy, readable \u0026 maintainable code.\n * If you cannot write a test in a simple way - refactor the code under test.\n * \u003cp/\u003e\n * Examples of mock settings:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n *   //Creates mock with different default answer \u0026 name\n *   Foo mock \u003d mock(Foo.class, withSettings()\n *                                .defaultAnswer(RETURNS_SMART_NULLS)\n *                                .name(\"cool mockie\")\n *                                );\n *\n *   //Creates mock with different default answer, descriptive name and extra interfaces\n *   Foo mock \u003d mock(Foo.class, withSettings()\n *                                .defaultAnswer(RETURNS_SMART_NULLS)\n *                                .name(\"cool mockie\")\n *                                .extraInterfaces(Bar.class));\n * \u003c/code\u003e\u003c/pre\u003e\n * {@link MockSettings} has been introduced for two reasons.\n * Firstly, to make it easy to add another mock setting when the demand comes.\n * Secondly, to enable combining together different mock settings without introducing zillions of overloaded mock() methods.\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.extraInterfaces(java.lang.Class\u003c?\u003e...)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Specifies extra interfaces the mock should implement. Might be useful for legacy code or some corner cases.\n     * For background, see issue 51 \u003ca href\u003d\"http://code.google.com/p/mockito/issues/detail?id\u003d51\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * This mysterious feature should be used very occasionally.\n     * The object under test should know exactly its collaborators \u0026 dependencies.\n     * If you happen to use it often than please make sure you are really producing simple, clean \u0026 readable code.\n     * \u003cp\u003e\n     * Examples:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   Foo foo \u003d mock(Foo.class, withSettings().extraInterfaces(Bar.class, Baz.class));\n     *\n     *   //now, the mock implements extra interfaces, so following casting is possible:\n     *   Bar bar \u003d (Bar) foo;\n     *   Baz baz \u003d (Baz) foo;\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param interfaces extra interfaces the should implement.\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.name(java.lang.String)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Specifies mock name. Naming mocks can be helpful for debugging - the name is used in all verification errors.\n     * \u003cp\u003e\n     * Beware that naming mocks is not a solution for complex code which uses too many mocks or collaborators.\n     * \u003cb\u003eIf you have too many mocks then refactor the code\u003c/b\u003e so that it\u0027s easy to test/debug without necessity of naming mocks.\n     * \u003cp\u003e\n     * \u003cb\u003eIf you use \u0026#064;Mock annotation then you\u0027ve got naming mocks for free!\u003c/b\u003e \u0026#064;Mock uses field name as mock name. {@link Mock Read more.}\n     * \u003cp\u003e\n     * Examples:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   Foo foo \u003d mock(Foo.class, withSettings().name(\"foo\"));\n     *\n     *   //Below does exactly the same:\n     *   Foo foo \u003d mock(Foo.class, \"foo\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * @param name the name of the mock, later used in all verification errors\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.spiedInstance(java.lang.Object)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Specifies the instance to spy on. Makes sense only for spies/partial mocks.\n     *\n     * Sets the instance that will be spied. Actually copies the internal fields of the passed instance to the mock.\n     * \u003cp\u003e\n     * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\n     * Object oriented programming is more or less about tackling complexity by dividing the complexity into separate, specific, SRPy objects.\n     * How does partial mock fit into this paradigm? Well, it just doesn\u0027t...\n     * Partial mock usually means that the complexity has been moved to a different method on the same object.\n     * In most cases, this is not the way you want to design your application.\n     * \u003cp\u003e\n     * However, there are rare cases when partial mocks come handy:\n     * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\n     * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\n     * \u003cp\u003e\n     * Enough warnings about partial mocks, see an example how spiedInstance() works:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   Foo foo \u003d mock(Foo.class, withSettings().spiedInstance(fooInstance));\n     *\n     *   //Below does exactly the same:\n     *   Foo foo \u003d spy(fooInstance);\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * About stubbing for a partial mock, as it is a spy it will always call the real method, unless you use the\n     * \u003ccode\u003edoReturn\u003c/code\u003e|\u003ccode\u003eThrow\u003c/code\u003e|\u003ccode\u003eAnswer\u003c/code\u003e|\u003ccode\u003eCallRealMethod\u003c/code\u003e stubbing style. Example:\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   List list \u003d new LinkedList();\n     *   List spy \u003d spy(list);\n     *\n     *   //Impossible: real method is called so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)\n     *   when(spy.get(0)).thenReturn(\"foo\");\n     *\n     *   //You have to use doReturn() for stubbing\n     *   doReturn(\"foo\").when(spy).get(0);\n     * \u003c/code\u003e\n     *\n     * @param instance to spy on\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.defaultAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 143,
      "end_line": 144,
      "comment": "\n     * Specifies default answers to interactions.\n     * It\u0027s quite advanced feature and typically you don\u0027t need it to write decent tests.\n     * However it can be helpful when working with legacy systems.\n     * \u003cp\u003e\n     * It is the default answer so it will be used \u003cb\u003eonly when you don\u0027t\u003c/b\u003e stub the method call.\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   Foo mock \u003d mock(Foo.class, withSettings().defaultAnswer(RETURNS_SMART_NULLS));\n     *   Foo mockTwo \u003d mock(Foo.class, withSettings().defaultAnswer(new YourOwnAnswer()));\n     *\n     *   //Below does exactly the same:\n     *   Foo mockTwo \u003d mock(Foo.class, new YourOwnAnswer());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param defaultAnswer default answer to be used by mock when not stubbed\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.serializable()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n     * Configures the mock to be serializable. With this feature you can use a mock in a place that requires dependencies to be serializable.\n     * \u003cp\u003e\n     * WARNING: This should be rarely used in unit testing.\n     * \u003cp\u003e\n     * The behaviour was implemented for a specific use case of a BDD spec that had an unreliable external dependency.  This\n     * was in a web environment and the objects from the external dependency were being serialized to pass between layers.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   List serializableMock \u003d mock(List.class, withSettings().serializable());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @return settings instance so that you can fluently specify other settings\n     * @since 1.8.1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.serializable(org.mockito.mock.SerializableMode)",
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Configures the mock to be serializable with a specific serializable mode.\n     * With this feature you can use a mock in a place that requires dependencies to be serializable.\n     * \u003cp\u003e\n     * WARNING: This should be rarely used in unit testing.\n     * \u003cp\u003e\n     * The behaviour was implemented for a specific use case of a BDD spec that had an unreliable external dependency.  This\n     * was in a web environment and the objects from the external dependency were being serialized to pass between layers.\n     *\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   List serializableMock \u003d mock(List.class, withSettings().serializable(SerializableMode.ACROSS_CLASSLOADERS));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param mode serialization mode\n     * @return settings instance so that you can fluently specify other settings\n     * @since 1.10.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.verboseLogging()",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Enables real-time logging of method invocations on this mock. Can be used\n     * during test debugging in order to find wrong interactions with this mock.\n     * \u003cp\u003e\n     * Invocations are logged as they happen to the standard output stream.\n     * \u003cp\u003e\n     * Calling this method multiple times makes no difference.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * List mockWithLogger \u003d mock(List.class, withSettings().verboseLogging());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.invocationListeners(org.mockito.listeners.InvocationListener...)",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Registers a listener for method invocations on this mock. The listener is\n     * notified every time a method on this mock is called.\n     * \u003cp\u003e\n     * Multiple listeners may be added, but the same object is only added once.\n     * The order, in which the listeners are added, is not guaranteed to be the\n     * order in which the listeners are notified.\n     *\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *  List mockWithListener \u003d mock(List.class, withSettings().invocationListeners(new YourInvocationListener()));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * See the {@link InvocationListener listener interface} for more details.\n     *\n     * @param listeners The invocation listeners to add. May not be null.\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.stubOnly()",
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n     * A stub-only mock does not record method\n     * invocations, thus saving memory but\n     * disallowing verification of invocations.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * List stubOnly \u003d mock(List.class, withSettings().stubOnly());\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @return settings instance so that you can fluently specify other settings\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.useConstructor()",
      "begin_line": 252,
      "end_line": 253,
      "comment": "\n     * Mockito attempts to use constructor when creating instance of the mock.\n     * This is particularly useful for spying on abstract classes. See also {@link Mockito#spy(Class)}.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * //Robust API, via settings builder:\n     * OtherAbstract spy \u003d mock(OtherAbstract.class, withSettings()\n     *   .useConstructor().defaultAnswer(CALLS_REAL_METHODS));\n     *\n     * //Mocking a non-static inner abstract class:\n     * InnerAbstract spy \u003d mock(InnerAbstract.class, withSettings()\n     *   .useConstructor().outerInstance(outerInstance).defaultAnswer(CALLS_REAL_METHODS));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @return settings instance so that you can fluently specify other settings\n     * @since 1.10.12\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.outerInstance(java.lang.Object)",
      "begin_line": 267,
      "end_line": 268,
      "comment": "\n     * Makes it possible to mock non-static inner classes in conjunction with {@link #useConstructor()}.\n     * \u003cp\u003e\n     * Example:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     * InnerClass mock \u003d mock(InnerClass.class, withSettings()\n     *   .useConstructor().outerInstance(outerInstance).defaultAnswer(CALLS_REAL_METHODS));\n     * \u003c/code\u003e\u003c/pre\u003e\n     *\n     * @return settings instance so that you can fluently specify other settings\n     * @since 1.10.12\n     ",
      "child_ranges": []
    }
  ]
}