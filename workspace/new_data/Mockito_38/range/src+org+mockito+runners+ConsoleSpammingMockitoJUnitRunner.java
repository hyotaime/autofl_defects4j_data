{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/runners/ConsoleSpammingMockitoJUnitRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConsoleSpammingMockitoJUnitRunner",
      "is_interface": false,
      "parent_types": [
        "org.junit.runner.Runner"
      ],
      "begin_line": 89,
      "end_line": 135,
      "comment": "\r\n * Uses \u003cb\u003eJUnit 4.5\u003c/b\u003e runner {@link BlockJUnit4ClassRunner}.\r\n * \u003cp\u003e\r\n * Experimental implementation that suppose to improve tdd/testing experience. \r\n * Don\u0027t hesitate to send feedback to mockito@googlegroups.com\r\n * \u003cb\u003eIt is very likely it will change in the next version!\u003c/b\u003e\r\n * \u003cp\u003e\r\n * This runner does exactly what {@link MockitoJUnitRunner} does but also  \r\n * prints warnings that might be useful. \r\n * The point is that Mockito should help the tdd developer to quickly figure out if the test fails for the right reason. \r\n * Then the developer can implement the functionality. \r\n * Also when the test fails it should be easy to figure out why the test fails. \r\n * \u003cp\u003e\r\n * Sometimes when the test fails, the underlying reason is that stubbed method was called with wrong arguments. \r\n * Sometimes it fails because one forgets to stub a method or forgets to call a stubbed method. \r\n * All above problems are not immediately obvious.\r\n * \u003cp\u003e\r\n * One way of approaching this problem is full-blown \u0027expect\u0027 API. \r\n * However it means the \u0027expectations upfront\u0027 business which is not in line with core Mockito concepts.\r\n * After all, the essence of testing are \u003cb\u003eexplicit assertions\u003c/b\u003e that are described consistently at the \u003cb\u003ebottom of the test\u003c/b\u003e method.\r\n * \u003cp\u003e\r\n * Here\u0027s the experiment: a warning is printed to the standard output if the test fails.\r\n * Also, you get a clickabe link to the line of code. You can immediately jump to the place in code where the potential problem is.\r\n * \u003cp\u003e \r\n * Let\u0027s say your test fails on assertion. \r\n * Let\u0027s say the underlying reason is a stubbed method that was called with different arguments:\r\n * \u003cpre\u003e\r\n * //test:\r\n * Dictionary dictionary \u003d new Dictionary(translator);\r\n * when(translator.translate(\"Mockito\")).thenReturn(\"cool framework\");\r\n * String translated \u003d dictionary.search(\"Mockito\");\r\n * assertEquals(\"cool framework\", translated);\r\n * \r\n * //code:\r\n * public String search(String word) {\r\n *     ...\r\n *     return translator.translate(\"oups\");\r\n *\r\n * \u003c/pre\u003e\r\n * On standard output you\u0027ll see something like that:\r\n * \u003cpre\u003e\r\n * [Mockito] Warning - stubbed method called with different arguments.\r\n * Stubbed this way:\r\n * translator.translate(\"Mockito\");\r\n * org.dictionary.SmartDictionaryTest.shouldFindTranslation(SmartDictionaryTest.java:27)\r\n *  \r\n * But called with different arguments:\r\n * translator.translate(\"oups\");\r\n * org.dictionary.SmartDictionary.search(SmartDictionary.java:15)\r\n * \u003c/pre\u003e\r\n * \u003cp\u003e\r\n * Note that it is just a warning, not an assertion. \r\n * The test fails on assertion because it\u0027s the assertion\u0027s duty to document what the test stands for and what behavior it proves. \r\n * Warnings just makes it quicker to figure out if the test fails for the right reason.\r\n * \u003cp\u003e\r\n * Note that code links printed to the console are clickable in any decent IDE (e.g. Eclipse).\r\n * \u003cp\u003e\r\n * So far I identified 3 cases when warnings are printed:\r\n * \u003cli\u003eunstubbed method\u003c/li\u003e\r\n * \u003cli\u003eunsued stub\u003c/li\u003e\r\n * \u003cli\u003estubbed method but called with different arguments\u003c/li\u003e \r\n * \u003cp\u003e\r\n * \u003cbr/\u003e\r\n * This runner lives under org.junit.mockito package \r\n * so that it automatically takes advantage on clean stack traces in most IDEs \r\n * \u003cp\u003e\r\n * Do you think it is useful or not? Drop us an email at mockito@googlegroups.com\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runner"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.ConsoleSpammingMockitoJUnitRunner(java.lang.Class\u003c?\u003e)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.ConsoleSpammingMockitoJUnitRunner(java.lang.Class\u003c?\u003e, org.mockito.internal.util.MockitoLogger, org.mockito.internal.runners.RunnerImpl)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.run(org.junit.runner.notification.RunNotifier)",
      "begin_line": 103,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 67)",
        "(line 106,col 9)-(line 106,col 66)",
        "(line 108,col 9)-(line 108,col 43)",
        "(line 110,col 9)-(line 110,col 29)",
        "(line 112,col 9)-(line 112,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.afterRun(org.mockito.internal.debugging.DebuggingInfo)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.beforeRun(org.junit.runner.notification.RunNotifier, org.mockito.internal.debugging.DebuggingInfo)",
      "begin_line": 119,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)",
        "(line 122,col 9)-(line 126,col 10)",
        "(line 128,col 9)-(line 128,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.Anonymous-d2f87097-a165-4378-8ccf-791ec9956d61.testFailure(org.junit.runner.notification.Failure)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 17)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.getDescription()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 39)"
      ]
    }
  ]
}