{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/configuration/IMockitoConfiguration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IMockitoConfiguration",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 84,
      "comment": "\n * Use it to configure Mockito. For now there are not many configuration options but it may change in future.\n * \u003cp\u003e\n * In most cases you don\u0027t really need to configure Mockito. For example in case of working with legacy code, \n * when you might want to have different \u0027mocking style\u0027 this interface might be helpful. \n * A reason of configuring Mockito might be if you disagree with the {@link ReturnsEmptyValues} unstubbed mocks return.\n * \u003cp\u003e\n * To configure Mockito create exactly \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e class that implements this interface.\n * \u003cp\u003e\n * Configuring Mockito is completely \u003cb\u003eoptional\u003c/b\u003e - nothing happens if there isn\u0027t any \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e on the classpath. \n * \u003cp\u003e\n * \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e must implement IMockitoConfiguration or extend {@link DefaultMockitoConfiguration}\n * \u003cp\u003e\n * Mockito will store single instance of org.mockito.configuration.MockitoConfiguration per thread (using ThreadLocal). \n * For sanity of your tests, don\u0027t make the implementation stateful.\n * \u003cp\u003e\n * If you have comments on Mockito configuration feature don\u0027t hesitate to write to mockito@googlegroups.com\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getReturnValues()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\n     * @deprecated\n     * \u003cb\u003ePlease use {@link IMockitoConfiguration#getDefaultAnswer()}\u003c/b\u003e\n     * \u003cp\u003e\n     * Steps: \n     * \u003cp\u003e\n     * 1. Leave the implementation of getReturnValues() method empty - it\u0027s not going to be used anyway.\n     * \u003cp\u003e\n     * 2. Implement getDefaultAnswer() instead.\n     * \u003cp\u003e\n     * In rare cases your code might not compile with recent deprecation \u0026 changes.\n     * Very sorry for inconvenience but it had to be done in order to keep framework consistent.\n     * \u003cp\u003e\n     * See javadoc {@link ReturnValues} for info why this method was deprecated\n     * \u003cp\u003e\n     * Allows configuring the default return values of unstubbed invocations\n     * \u003cp\u003e\n     * See javadoc for {@link IMockitoConfiguration}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getDefaultAnswer()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Allows configuring the default answers of unstubbed invocations\n     * \u003cp\u003e\n     * See javadoc for {@link IMockitoConfiguration}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getAnnotationEngine()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Configures annotations for mocks\n     * \u003cp\u003e\n     * See javadoc for {@link IMockitoConfiguration}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.cleansStackTrace()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * This should be turned on unless you\u0027re a Mockito developer and you wish\n     * to have verbose (read: messy) stack traces that only few understand (eg:\n     * Mockito developers)\n     * \u003cp\u003e\n     * See javadoc for {@link IMockitoConfiguration}\n     * \n     * @return if Mockito should clean stack traces\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.enableClassCache()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Allow objenesis to cache classes. If you\u0027re in an environment where classes \n     * are dynamically reloaded, you can disable this to avoid classcast exceptions.\n     ",
      "child_ranges": []
    }
  ]
}