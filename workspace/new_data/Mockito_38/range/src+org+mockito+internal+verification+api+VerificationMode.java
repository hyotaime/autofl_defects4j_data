{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/verification/api/VerificationMode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerificationMode",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 34,
      "comment": "\n * Allows verifying that certain behavior happened at least once / exact number\n * of times / never. E.g:\n * \n * \u003cpre\u003e\n * verify(mock, times(5)).someMethod(\u0026quot;was called five times\u0026quot;);\n * \n * verify(mock, never()).someMethod(\u0026quot;was never called\u0026quot;);\n * \n * verify(mock, atLeastOnce()).someMethod(\u0026quot;was called at least once\u0026quot;);\n * \n * verify(mock, atLeast(2)).someMethod(\u0026quot;was called at least twice\u0026quot;);\n * \n * verify(mock, atMost(3)).someMethod(\u0026quot;was called at most 3 times\u0026quot;);\n * \n * \u003c/pre\u003e\n * \n * \u003cb\u003etimes(1) is the default\u003c/b\u003e and can be omitted\n * \u003cp\u003e\n * See examples in javadoc for {@link Mockito#verify(Object, VerificationMode)}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.api.VerificationMode.verify(org.mockito.internal.verification.api.VerificationData)",
      "begin_line": 32,
      "end_line": 32,
      "comment": "",
      "child_ranges": []
    }
  ]
}