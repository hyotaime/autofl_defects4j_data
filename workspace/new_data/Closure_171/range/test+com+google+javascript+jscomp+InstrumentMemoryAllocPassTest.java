{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/InstrumentMemoryAllocPassTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstrumentMemoryAllocPassTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 79,
      "comment": "\n * Unit tests for {@link InstrumentMemoryAllocPass}.\n * Note: The order of test execution matters because the instrumentation\n * uniquely identifies memory allocation sites. Thus, the order is fixed by\n * combining tests into a single method.\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.InstrumentMemoryAllocPassTest()",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 28,col 5)-(line 28,col 12)",
        "(line 29,col 5)-(line 29,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 32,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.getNumRepetitions()",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.getOptions()",
      "begin_line": 43,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 52)",
        "(line 46,col 5)-(line 46,col 49)",
        "(line 47,col 5)-(line 47,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.testNoAllocation()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 53,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.testNoStringInstrumentation()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 60,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InstrumentMemoryAllocPassTest.testAllocations()",
      "begin_line": 63,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 67,col 63)",
        "(line 69,col 5)-(line 72,col 62)",
        "(line 74,col 5)-(line 77,col 75)"
      ]
    }
  ]
}