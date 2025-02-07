{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/invocation/Invocation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Invocation",
      "is_interface": true,
      "parent_types": [
        "org.mockito.invocation.InvocationOnMock",
        "org.mockito.invocation.DescribedInvocation"
      ],
      "begin_line": 17,
      "end_line": 84,
      "comment": "\n * A method call on a mock object. Contains all information and state needed for the Mockito framework to operate.\n * This API might be useful for developers who extend Mockito.\n * \u003cp\u003e\n * The javadoc does not have lots of examples or documentation because its audience is different.\n * Vast majority of users don\u0027t need to use the Invocation. It\u0027s mostly useful for other framework authors\n * that extend Mockito.\n *\n * @since 1.9.5\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.isVerified()",
      "begin_line": 23,
      "end_line": 23,
      "comment": "\n     * @return whether the invocation has been already verified.\n     * Needed for {@link org.mockito.Mockito#verifyNoMoreInteractions(Object...)}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.getSequenceNumber()",
      "begin_line": 29,
      "end_line": 29,
      "comment": "\n     * @return the sequence number of the Invocation. Useful to determine the order of invocations.\n     * Used by verification in order.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.getLocation()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * @return the location in code of this invocation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.getRawArguments()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Returns unprocessed arguments whereas {@link #getArguments()} returns\n     * arguments already processed (e.g. varargs expended, etc.).\n     *\n     * @return unprocessed arguments, exactly as provided to this invocation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.getRawReturnType()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns unprocessed arguments whereas {@link #getArguments()} returns\n     * arguments already processed (e.g. varargs expended, etc.).\n     *\n     * @return unprocessed arguments, exactly as provided to this invocation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.markVerified()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Marks this invocation as verified so that it will not cause verification error at\n     * {@link org.mockito.Mockito#verifyNoMoreInteractions(Object...)}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.stubInfo()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * @return the stubbing information for this invocation. May return null - this means\n     * the invocation was not stubbed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.markStubbed(org.mockito.invocation.StubInfo)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Marks this invocation as stubbed.\n     *\n     * @param stubInfo the information about stubbing.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.isIgnoredForVerification()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Informs if the invocation participates in verify-no-more-invocations or verification in order.\n     *\n     * @return whether this invocation should be ignored for the purposes of\n     * verify-no-more-invocations or verification in order.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.invocation.Invocation.ignoreForVerification()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Configures this invocation to be ignored for verify-no-more-invocations or verification in order.\n     * See also {@link #isIgnoredForVerification()}\n     ",
      "child_ranges": []
    }
  ]
}