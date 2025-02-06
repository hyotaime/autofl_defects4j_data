{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/configuration/IMockitoConfiguration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IMockitoConfiguration",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 78,
      "comment": "\r\n * Use it to configure Mockito. For now there are not many configuration options but it may change in future.\r\n * \u003cp\u003e\r\n * In most cases you don\u0027t really need to configure Mockito. For example in case of working with legacy code, \r\n * when you might want to have different \u0027mocking style\u0027 this interface might be helpful. \r\n * A reason of configuring Mockito might be if you disagree with the {@link ReturnsEmptyValues} unstubbed mocks return.\r\n * \u003cp\u003e\r\n * To configure Mockito create exactly \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e class that implements this interface.\r\n * \u003cp\u003e\r\n * Configuring Mockito is completely \u003cb\u003eoptional\u003c/b\u003e - nothing happens if there isn\u0027t any \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e on the classpath. \r\n * \u003cp\u003e\r\n * \u003cb\u003eorg.mockito.configuration.MockitoConfiguration\u003c/b\u003e must implement IMockitoConfiguration or extend {@link DefaultMockitoConfiguration}\r\n * \u003cp\u003e\r\n * Mockito will store single instance of org.mockito.configuration.MockitoConfiguration per thread (using ThreadLocal). \r\n * For sanity of your tests, don\u0027t make the implementation stateful.\r\n * \u003cp\u003e\r\n * If you have comments on Mockito configuration feature don\u0027t hesitate to write to mockito@googlegroups.com\r\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getReturnValues()",
      "begin_line": 51,
      "end_line": 52,
      "comment": "\r\n     * @deprecated\r\n     * \u003cb\u003ePlease use {@link IMockitoConfiguration#getDefaultAnswer()}\u003c/b\u003e\r\n     * \u003cp\u003e\r\n     * Steps: \r\n     * \u003cp\u003e\r\n     * 1. Leave the implementation of getReturnValues() method empty - it\u0027s not going to be used anyway.\r\n     * \u003cp\u003e\r\n     * 2. Implement getDefaultAnswer() instead.\r\n     * \u003cp\u003e\r\n     * In rare cases your code might not compile with recent deprecation \u0026 changes.\r\n     * Very sorry for inconvenience but it had to be done in order to keep framework consistent.\r\n     * \u003cp\u003e\r\n     * See javadoc {@link ReturnValues} for info why this method was deprecated\r\n     * \u003cp\u003e\r\n     * Allows configuring the default return values of unstubbed invocations\r\n     * \u003cp\u003e\r\n     * See javadoc for {@link IMockitoConfiguration}\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getDefaultAnswer()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\r\n     * Allows configuring the default answers of unstubbed invocations\r\n     * \u003cp\u003e\r\n     * See javadoc for {@link IMockitoConfiguration}\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.getAnnotationEngine()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * Configures annotations for mocks\r\n     * \u003cp\u003e\r\n     * See javadoc for {@link IMockitoConfiguration}\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.configuration.IMockitoConfiguration.cleansStackTrace()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * This should be turned on unless you\u0027re a Mockito developer and you wish\r\n     * to have verbose (read: messy) stack traces that only few understand (eg:\r\n     * Mockito developers)\r\n     * \u003cp\u003e\r\n     * See javadoc for {@link IMockitoConfiguration}\r\n     * \r\n     * @return if Mockito should clean stack traces\r\n     ",
      "child_ranges": []
    }
  ]
}