{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/configuration/injection/MockInjectionStrategy.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MockInjectionStrategy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 91,
      "comment": "\n * Injector strategy contract\n "
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.nop()",
      "begin_line": 19,
      "end_line": 25,
      "comment": "\n     * NOP Strategy that will always try the next strategy.\n     ",
      "child_ranges": [
        "(line 20,col 9)-(line 24,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.Anonymous-eb9eb8d3-347f-49b7-bbd0-c78080379813.processInjection(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 21,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 22,col 17)-(line 22,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nextStrategy"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.thenTry(org.mockito.internal.configuration.injection.MockInjectionStrategy)",
      "begin_line": 40,
      "end_line": 47,
      "comment": "\n     * Enqueue next injection strategy.\n     *\n     * \u003cp\u003e\n     * The implementation should take care of the actual calling if required.\n     * \u003c/p\u003e\n     *\n     * @param strategy Queued strategy.\n     * @return The passed strategy instance to allow chaining.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.process(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * Actually inject mockCandidates on field.\n     *\n     * \u003cp\u003e\n     * Actual algorithm is defined in the implementations of {@link #processInjection(Field, Object, Set)}.\n     * However if injection occurred successfully, the process should return \u003ccode\u003etrue\u003c/code\u003e,\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The code takes care of calling the next strategy if available and if of course if required\n     * \u003c/p\u003e\n     *\n     * @param onField Field needing injection.\n     * @param fieldOwnedBy The owning instance of the field.\n     * @param mockCandidates A set of mock candidate, that might be injected.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if successful, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.processInjection(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Process actual injection.\n     *\n     * \u003cp\u003e\n     * Don\u0027t call this method directly, instead call {@link #process(Field, Object, Set)}\n     * \u003c/p\u003e\n     *\n     * @param field Field needing injection\n     * @param fieldOwner Field owner instance.\n     * @param mockCandidates Pool of mocks to inject.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if injection occurred, \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.configuration.injection.MockInjectionStrategy.relayProcessToNextStrategy(java.lang.reflect.Field, java.lang.Object, java.util.Set\u003cjava.lang.Object\u003e)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 95)"
      ]
    }
  ]
}