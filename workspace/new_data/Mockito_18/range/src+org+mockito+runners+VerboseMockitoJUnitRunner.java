{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/runners/VerboseMockitoJUnitRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerboseMockitoJUnitRunner",
      "is_interface": false,
      "parent_types": [
        "org.junit.runner.Runner",
        "org.junit.runner.manipulation.Filterable"
      ],
      "begin_line": 38,
      "end_line": 84,
      "comment": "\n * Experimental implementation that suppose to improve tdd/testing experience. \n * Don\u0027t hesitate to send feedback to mockito@googlegroups.com\n * \u003cb\u003eIt is very likely it will change in the next version!\u003c/b\u003e\n * \u003cp\u003e\n * This runner does exactly what {@link MockitoJUnitRunner} does but also  \n * adds extra Mocktio hints to the exception message. \n * The point is that Mockito should help the tdd developer to quickly figure out if the test fails for the right reason and track the reason. \n * \u003cp\u003e\n * The implementation is pretty hacky - it uses brute force of reflection to modify the exception message and add extra mockito hints.\n * You\u0027ve been warned. \n * \u003cp\u003e\n * Do you think it is useful or not? Drop us an email at mockito@googlegroups.com\n * \u003cp\u003e\n * Experimental implementation - will change in future!\n "
    },
    {
      "type": "field",
      "varNames": [
        "runner"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.VerboseMockitoJUnitRunner(java.lang.Class\u003c?\u003e)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.VerboseMockitoJUnitRunner(org.mockito.internal.runners.RunnerImpl)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.run(org.junit.runner.notification.RunNotifier)",
      "begin_line": 50,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 68,col 10)",
        "(line 70,col 9)-(line 70,col 44)",
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningsCollector"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.Anonymous-0edc31cd-e8de-4bdd-9541-1ce60377f45a.testStarted(org.junit.runner.Description)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 17)-(line 60,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.Anonymous-81205734-8840-4bd4-8e4b-abfde50e51cf.testFailure(org.junit.runner.notification.Failure)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 17)-(line 65,col 66)",
        "(line 66,col 17)-(line 66,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.getDescription()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.runners.VerboseMockitoJUnitRunner.filter(org.junit.runner.manipulation.Filter)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)"
      ]
    }
  ]
}