{
  "filepath": "/tmp/Mockito-18b/test/org/mockitoutil/TestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestBase",
      "is_interface": false,
      "parent_types": [
        "junit.framework.Assert"
      ],
      "begin_line": 37,
      "end_line": 189,
      "comment": "\n * the easiest way to make sure that tests clean up invalid state is to require\n * valid state for all tests.\n "
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.cleanUpConfigInAnyCase()",
      "begin_line": 40,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 72)",
        "(line 43,col 9)-(line 43,col 68)",
        "(line 44,col 9)-(line 44,col 46)",
        "(line 47,col 9)-(line 47,col 25)",
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.init()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.makeStackTracesClean()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.resetState()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.getLastInvocation()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "assertThat(T, Assertor)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Assertor\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 70,
      "end_line": 72,
      "comment": "I\u0027m really tired of matchers, enter the assertor!",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertThat(T, org.hamcrest.Matcher\u003cT\u003e)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertThat(java.lang.String, T, org.hamcrest.Matcher\u003cT\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.endsWith(java.lang.String)",
      "begin_line": 82,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 89,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "assertValue(String)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Corresponding declaration not available for unsolved symbol.\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 84,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 17)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertNotEquals(java.lang.Object, java.lang.Object)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertContains(java.lang.String, java.lang.String)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 104,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertContainsIgnoringCase(java.lang.String, java.lang.String)",
      "begin_line": 107,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 115,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.containsIgnoringCase(java.lang.String, java.lang.String)",
      "begin_line": 118,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 18)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertNotContains(java.lang.String, java.lang.String)",
      "begin_line": 134,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.invocationOf(java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 47)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 151,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.invocationOf(java.lang.Class\u003c?\u003e, java.lang.String, org.mockito.internal.invocation.realmethod.RealMethod)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.describe(org.hamcrest.SelfDescribing)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.isMock(java.lang.Object)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.assertContainsType(java.util.Collection\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 167,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 178,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.Anonymous-eb706efc-dc9c-4493-8ec5-45c9a2043e6b.matches(java.util.Collection\u003c?\u003e)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 171,col 17)-(line 175,col 17)",
        "(line 176,col 17)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockitoutil.TestBase.getStackTrace(java.lang.Throwable)",
      "begin_line": 181,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 48)",
        "(line 184,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 187,col 30)"
      ]
    }
  ]
}