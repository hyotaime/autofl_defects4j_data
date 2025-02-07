{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/runners/ConsoleSpammingMockitoJUnitRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConsoleSpammingMockitoJUnitRunner",
      "is_interface": false,
      "parent_types": [
        "org.junit.runner.Runner",
        "org.junit.runner.manipulation.Filterable"
      ],
      "begin_line": 89,
      "end_line": 132,
      "comment": "\n * Uses \u003cb\u003eJUnit 4.5\u003c/b\u003e runner {@link BlockJUnit4ClassRunner}.\n * \u003cp\u003e\n * Experimental implementation that suppose to improve tdd/testing experience. \n * Don\u0027t hesitate to send feedback to mockito@googlegroups.com\n * \u003cb\u003eIt is very likely it will change in the next version!\u003c/b\u003e\n * \u003cp\u003e\n * This runner does exactly what {@link MockitoJUnitRunner} does but also  \n * prints warnings that might be useful. \n * The point is that Mockito should help the tdd developer to quickly figure out if the test fails for the right reason. \n * Then the developer can implement the functionality. \n * Also when the test fails it should be easy to figure out why the test fails. \n * \u003cp\u003e\n * Sometimes when the test fails, the underlying reason is that stubbed method was called with wrong arguments. \n * Sometimes it fails because one forgets to stub a method or forgets to call a stubbed method. \n * All above problems are not immediately obvious.\n * \u003cp\u003e\n * One way of approaching this problem is full-blown \u0027expect\u0027 API. \n * However it means the \u0027expectations upfront\u0027 business which is not in line with core Mockito concepts.\n * After all, the essence of testing are \u003cb\u003eexplicit assertions\u003c/b\u003e that are described consistently at the \u003cb\u003ebottom of the test\u003c/b\u003e method.\n * \u003cp\u003e\n * Here\u0027s the experiment: a warning is printed to the standard output if the test fails.\n * Also, you get a clickabe link to the line of code. You can immediately jump to the place in code where the potential problem is.\n * \u003cp\u003e \n * Let\u0027s say your test fails on assertion. \n * Let\u0027s say the underlying reason is a stubbed method that was called with different arguments:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * //test:\n * Dictionary dictionary \u003d new Dictionary(translator);\n * when(translator.translate(\"Mockito\")).thenReturn(\"cool framework\");\n * String translated \u003d dictionary.search(\"Mockito\");\n * assertEquals(\"cool framework\", translated);\n * \n * //code:\n * public String search(String word) {\n *     ...\n *     return translator.translate(\"oups\");\n *\n * \u003c/code\u003e\u003c/pre\u003e\n * On standard output you\u0027ll see something like that:\n * \u003cpre class\u003d\"code\"\u003e\u003ccode class\u003d\"java\"\u003e\n * [Mockito] Warning - stubbed method called with different arguments.\n * Stubbed this way:\n * translator.translate(\"Mockito\");\n * org.dictionary.SmartDictionaryTest.shouldFindTranslation(SmartDictionaryTest.java:27)\n *  \n * But called with different arguments:\n * translator.translate(\"oups\");\n * org.dictionary.SmartDictionary.search(SmartDictionary.java:15)\n * \u003c/code\u003e\u003c/pre\u003e\n * \u003cp\u003e\n * Note that it is just a warning, not an assertion. \n * The test fails on assertion because it\u0027s the assertion\u0027s duty to document what the test stands for and what behavior it proves. \n * Warnings just makes it quicker to figure out if the test fails for the right reason.\n * \u003cp\u003e\n * Note that code links printed to the console are clickable in any decent IDE (e.g. Eclipse).\n * \u003cp\u003e\n * So far I identified 2 cases when warnings are printed:\n * \u003cli\u003eunsued stub\u003c/li\u003e\n * \u003cli\u003estubbed method but called with different arguments\u003c/li\u003e \n * \u003cp\u003e\n * \u003cbr/\u003e\n * \u003cp\u003e\n * Do you think it is useful or not? Drop us an email at mockito@googlegroups.com\n "
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
        "(line 95,col 9)-(line 95,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.ConsoleSpammingMockitoJUnitRunner(org.mockito.internal.util.MockitoLogger, org.mockito.internal.runners.RunnerImpl)",
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
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 116,col 10)",
        "(line 118,col 9)-(line 118,col 39)",
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningsCollector"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.Anonymous-54c274c7-cd0f-43e6-a3f5-229a95b10e01.testStarted(org.junit.runner.Description)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 17)-(line 110,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.Anonymous-cfb75813-770e-4294-ab37-233659397ad3.testFailure(org.junit.runner.notification.Failure)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 17)-(line 114,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.getDescription()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.ConsoleSpammingMockitoJUnitRunner.filter(org.junit.runner.manipulation.Filter)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 30)"
      ]
    }
  ]
}