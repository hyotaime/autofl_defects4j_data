{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/plugins/StackTraceCleanerProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackTraceCleanerProvider",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 15,
      "end_line": 24,
      "comment": "\n * An extension point to register custom {@link StackTraceCleaner}.\n * You can replace Mockito\u0027s default StackTraceCleaner.\n * You can also \u0027enhance\u0027 Mockito\u0027s default behavior\n * because the default cleaner is passed as parameter to the method.\n * \u003cp\u003e\n * Registering custom StackTraceCleaner is done in similar manner as the {@link MockMaker} implementation.\n * \u003cp\u003e\n * See the default implementation: {@link org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider}\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.plugins.StackTraceCleanerProvider.getStackTraceCleaner(org.mockito.exceptions.stacktrace.StackTraceCleaner)",
      "begin_line": 23,
      "end_line": 23,
      "comment": "\n     * Allows configuring custom StackTraceCleaner.\n     *\n     * @param defaultCleaner - Mockito\u0027s default StackTraceCleaner\n     * @return StackTraceCleaner to use\n     ",
      "child_ranges": []
    }
  ]
}