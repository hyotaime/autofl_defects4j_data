{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/MockSettings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockSettings",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 125,
      "comment": "\r\n * Allows mock creation with additional mock settings. \r\n * \u003cp\u003e\r\n * Don\u0027t use it too often. \r\n * Consider writing simple tests that use simple mocks. \r\n * Repeat after me: simple tests push simple, KISSy, readable \u0026 maintainable code.\r\n * If you cannot write a test in a simple way - refactor the code under test.\r\n * \u003cp\u003e\r\n * Examples of mock settings:\r\n * \u003cpre\u003e\r\n *   //Creates mock with different default answer \u0026 name\r\n *   Foo mock \u003d mock(Foo.class, withSettings()\r\n *       .defaultAnswer(RETURNS_SMART_NULLS)\r\n *       .name(\"cool mockie\"));\r\n *       \r\n *   //Creates mock with different default answer, descriptive name and extra interfaces\r\n *   Foo mock \u003d mock(Foo.class, withSettings()\r\n *       .defaultAnswer(RETURNS_SMART_NULLS)\r\n *       .name(\"cool mockie\")\r\n *       .extraInterfaces(Bar.class));    \r\n * \u003c/pre\u003e\r\n * {@link MockSettings} has been introduced for two reasons. \r\n * Firstly, to make it easy to add another mock setting when the demand comes.\r\n * Secondly, to enable combining together different mock settings without introducing zillions of overloaded mock() methods.\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.extraInterfaces(java.lang.Class\u003c?\u003e...)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\r\n     * Specifies extra interfaces the mock should implement. Might be useful for legacy code or some corner cases.\r\n     * For background, see issue 51 \u003ca href\u003d\"http://code.google.com/p/mockito/issues/detail?id\u003d51\"\u003ehere\u003c/a\u003e  \r\n     * \u003cp\u003e\r\n     * This mysterious feature should be used very occasionally. \r\n     * The object under test should know exactly its collaborators \u0026 dependencies.\r\n     * If you happen to use it often than please make sure you are really producing simple, clean \u0026 readable code.\r\n     * \u003cp\u003e   \r\n     * Examples:\r\n     * \u003cpre\u003e\r\n     *   Foo foo \u003d mock(Foo.class, withSettings().extraInterfaces(Bar.class, Baz.class));\r\n     *   \r\n     *   //now, the mock implements extra interfaces, so following casting is possible:\r\n     *   Bar bar \u003d (Bar) foo;\r\n     *   Baz baz \u003d (Baz) foo;\r\n     * \u003c/pre\u003e\r\n     * \r\n     * @param interfaces extra interfaces the should implement.\r\n     * @return settings instance so that you can fluently specify other settings\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.name(java.lang.String)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * Specifies mock name. Naming mocks can be helpful for debugging - the name is used in all verification errors. \r\n     * \u003cp\u003e\r\n     * Beware that naming mocks is not a solution for complex code which uses too many mocks or collaborators. \r\n     * \u003cb\u003eIf you have too many mocks then refactor the code\u003c/b\u003e so that it\u0027s easy to test/debug without necessity of naming mocks.\r\n     * \u003cp\u003e\r\n     * \u003cb\u003eIf you use \u0026#064;Mock annotation then you\u0027ve got naming mocks for free!\u003c/b\u003e \u0026#064;Mock uses field name as mock name. {@link Mock Read more.}\r\n     * \u003cp\u003e\r\n     * Examples:\r\n     * \u003cpre\u003e\r\n     *   Foo foo \u003d mock(Foo.class, withSettings().name(\"foo\"));\r\n     *   \r\n     *   //Below does exactly the same:\r\n     *   Foo foo \u003d mock(Foo.class, \"foo\");\r\n     * \u003c/pre\u003e\r\n     * @param name the name of the mock, later used in all verification errors\r\n     * @return settings instance so that you can fluently specify other settings\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.spiedInstance(java.lang.Object)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Specifies the instance to spy on. Makes sense only for spies/partial mocks.\r\n     * Sets the real implementation to be called when the method is called on a mock object.\r\n     * \u003cp\u003e\r\n     * As usual you are going to read \u003cb\u003ethe partial mock warning\u003c/b\u003e:\r\n     * Object oriented programming is more less tackling complexity by dividing the complexity into separate, specific, SRPy objects.\r\n     * How does partial mock fit into this paradigm? Well, it just doesn\u0027t... \r\n     * Partial mock usually means that the complexity has been moved to a different method on the same object.\r\n     * In most cases, this is not the way you want to design your application.\r\n     * \u003cp\u003e\r\n     * However, there are rare cases when partial mocks come handy: \r\n     * dealing with code you cannot change easily (3rd party interfaces, interim refactoring of legacy code etc.)\r\n     * However, I wouldn\u0027t use partial mocks for new, test-driven \u0026 well-designed code.\r\n     * \u003cp\u003e\r\n     * Enough warnings about partial mocks, see an example how spiedInstance() works:\r\n     * \u003cpre\u003e\r\n     *   Foo foo \u003d mock(Foo.class, spiedInstance(fooInstance));\r\n     *   \r\n     *   //Below does exactly the same:\r\n     *   Foo foo \u003d spy(fooInstance);\r\n     * \u003c/pre\u003e\r\n     * \r\n     * @param instance to spy on\r\n     * @return settings instance so that you can fluently specify other settings\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.MockSettings.defaultAnswer(org.mockito.stubbing.Answer)",
      "begin_line": 123,
      "end_line": 124,
      "comment": "\r\n     * Specifies default answers to interactions. \r\n     * It\u0027s quite advanced feature and typically you don\u0027t need it to write decent tests.\r\n     * However it can be helpful when working with legacy systems.\r\n     * \u003cp\u003e\r\n     * It is the default answer so it will be used \u003cb\u003eonly when you don\u0027t\u003c/b\u003e stub the method call.\r\n     *\r\n     * \u003cpre\u003e\r\n     *   Foo mock \u003d mock(Foo.class, withSettings().defaultAnswer(RETURNS_SMART_NULLS));\r\n     *   Foo mockTwo \u003d mock(Foo.class, withSettings().defaultAnswer(new YourOwnAnswer()));\r\n     *   \r\n     *   //Below does exactly the same:\r\n     *   Foo mockTwo \u003d mock(Foo.class, new YourOwnAnswer());\r\n     * \u003c/pre\u003e\r\n     * \r\n     * @param defaultAnswer default answer to be used by mock when not stubbed\r\n     * @return settings instance so that you can fluently specify other settings\r\n     ",
      "child_ranges": []
    }
  ]
}