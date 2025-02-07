{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/verification/VerificationWithTimeout.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerificationWithTimeout",
      "is_interface": true,
      "parent_types": [
        "org.mockito.verification.VerificationMode"
      ],
      "begin_line": 28,
      "end_line": 122,
      "comment": "\n * VerificationWithTimeout is a {@link VerificationMode} that allows combining existing verification modes with \u0027timeout\u0027. E.g:\n * \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * verify(mock, timeout(100).times(5)).foo();\n * \n * verify(mock, timeout(100).never()).bar();\n * \n * verify(mock, timeout(200).atLeastOnce()).baz();\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * This is similar to {@link VerificationAfterDelay after()} except this assertion will immediately pass if it becomes true at any point,\n * whereas after() will wait the full period. Assertions which are consistently expected to be initially true and potentially become false \n * are deprecated below, and after() should be used instead.\n * \n * \u003cp\u003e\n * See examples in javadoc for {@link Mockito#verify(Object, VerificationMode)}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.times(int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Allows verifying exact number of invocations within given timeout\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   verify(mock, timeout(100).times(2)).someMethod(\"some arg\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param wantedNumberOfInvocations wanted number of invocations \n     * \n     * @return verification mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.never()",
      "begin_line": 57,
      "end_line": 58,
      "comment": "\n     * @deprecated\n     * Validation with timeout combined with never simply does not make sense, as never() will typically immediately pass,\n     * and therefore not wait the timeout. The behaviour you may be looking for is actually provided by after().never(). \n     * \u003cp\u003e\n     * To avoid compilation errors upon upgrade the method is deprecated and it throws a \"friendly reminder\" exception.\n     * \u003cp\u003e\n     * In a future release we will remove timeout(x).atMost(y) and timeout(x).never() from the API.\n     * \u003cp\u003e\n     * Do you want to find out more? See \u003ca href\u003d\"http://code.google.com/p/mockito/issues/detail?id\u003d235\"\u003eissue 235\u003c/a\u003e\n     * \n     * @return verification mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.atLeastOnce()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Allows at-least-once verification within given timeout. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   verify(mock, timeout(100).atLeastOnce()).someMethod(\"some arg\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * Alias to atLeast(1)\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @return verification mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.atLeast(int)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Allows at-least-x verification within given timeout. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   verify(mock, timeout(100).atLeast(3)).someMethod(\"some arg\");\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @param minNumberOfInvocations minimum number of invocations \n     * \n     * @return verification mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.atMost(int)",
      "begin_line": 102,
      "end_line": 103,
      "comment": "\n     * @deprecated\n     *\n     * \u003cb\u003eDeprecated\u003c/b\u003e\n     * Validation with timeout combined with never simply does not make sense, as atMost() will typically immediately pass,\n     * and therefore not wait the timeout. The behaviour you may be looking for is actually provided by after().atMost(). \n     * \u003cp\u003e\n     * To avoid compilation errors upon upgrade the method is deprecated and it throws a \"friendly reminder\" exception.\n     * \u003cp\u003e\n     * In a future release we will remove timeout(x).atMost(y) and timeout(x).never() from the API.\n     * \u003cp\u003e\n     * Do you want to find out more? See \u003ca href\u003d\"http://code.google.com/p/mockito/issues/detail?id\u003d235\"\u003eissue 235\u003c/a\u003e\n     *\n     * @return verification mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationWithTimeout.only()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Allows checking if given method was the only one invoked. E.g:\n     * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n     *   verify(mock, only()).someMethod();\n     *   //above is a shorthand for following 2 lines of code:\n     *   verify(mock).someMethod();\n     *   verifyNoMoreInvocations(mock);\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * \u003cp\u003e\n     * See also {@link Mockito#verifyNoMoreInteractions(Object...)}\n     * \u003cp\u003e\n     * See examples in javadoc for {@link Mockito} class\n     * \n     * @return verification mode\n     ",
      "child_ranges": []
    }
  ]
}