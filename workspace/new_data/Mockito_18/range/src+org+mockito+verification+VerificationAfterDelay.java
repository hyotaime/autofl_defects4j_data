{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/verification/VerificationAfterDelay.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerificationAfterDelay",
      "is_interface": true,
      "parent_types": [
        "org.mockito.verification.VerificationMode"
      ],
      "begin_line": 29,
      "end_line": 64,
      "comment": "\n * VerificationAfterDelay is a {@link VerificationMode} that allows combining existing verification modes with an initial delay, e.g. \n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * verify(mock, after(100).atMost(5)).foo();\n * \n * verify(mock, after(100).never()).bar();\n * \n * verify(mock, after(200).atLeastOnce()).baz();\n * \u003c/code\u003e\u003c/pre\u003e\n * \n * This is similar to {@link VerificationWithTimeout timeout()} except the assertion will not terminate until either the condition is \n * definitively failed, or the full time has elapsed (whereas timeout() will also stop if the conditions is true at any point, as is\n * typically the case with never() etc initially). \n * \n * \u003cp\u003e\n * See examples in javadoc for {@link Mockito#verify(Object, VerificationMode)}\n *\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.times(int)",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Verifies that there are exactly N invocations during the given period. This will wait the full period given.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.never()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Allows verification that there are no invocations at any point during the given period. This will wait the \n     * full period given, unless an invocation occurs (in which case there will be immediate failure)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.atLeastOnce()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Verifies that there is at least 1 invocation during the given period. This will wait the full period given.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.atLeast(int)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Verifies that there is are least N invocations during the given period. This will wait the full period given.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.atMost(int)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Verifies that there is are most N invocations during the given period. This will wait the full period given,\n     * unless too many invocations occur (in which case there will be an immediate failure)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.VerificationAfterDelay.only()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Verifies that there the given method is invoked and is the only method invoked. This will wait the full \n     * period given, unless another method is invoked (in which case there will be an immediate failure)\n     ",
      "child_ranges": []
    }
  ]
}