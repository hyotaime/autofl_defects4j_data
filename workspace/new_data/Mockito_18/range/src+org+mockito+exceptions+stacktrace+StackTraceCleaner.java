{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/exceptions/stacktrace/StackTraceCleaner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackTraceCleaner",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 26,
      "comment": "\n * Decides if particular StackTraceElement is excluded from the human-readable stack trace output.\n * Mockito stack trace filtering mechanism uses this information.\n * \u003cp\u003e\n * Excluding an element will make it not show in the cleaned stack trace.\n * Not-excluding an element does not guarantee it will be shown\n * (e.g. it depends on the implementation of\n * Mockito internal {@link org.mockito.internal.exceptions.stacktrace.StackTraceFilter}).\n * \u003cp\u003e\n * The implementations are required to be thread safe. For example, make them stateless.\n * \u003cp\u003e\n * See the default implementation: {@link org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner}.\n *\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.exceptions.stacktrace.StackTraceCleaner.isOut(java.lang.StackTraceElement)",
      "begin_line": 25,
      "end_line": 25,
      "comment": "\n     * Decides if element is excluded.\n     *\n     * @param candidate element of the actual stack trace\n     * @return whether the element should be excluded from cleaned stack trace.\n     ",
      "child_ranges": []
    }
  ]
}