{
  "filepath": "/tmp/Mockito-38b/src/org/mockito/internal/invocation/Invocation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Invocation",
      "is_interface": false,
      "parent_types": [
        "org.mockito.exceptions.PrintableInvocation",
        "org.mockito.invocation.InvocationOnMock",
        "org.mockito.internal.reporting.PrintingFriendlyInvocation"
      ],
      "begin_line": 33,
      "end_line": 226,
      "comment": "\n * Method call on a mock object.\n * \u003cp\u003e\n * Contains sequence number which should be globally unique and is used for\n * verification in order.\n * \u003cp\u003e\n * Contains stack trace of invocation\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LINE_LENGTH"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sequenceNumber"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mock"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "location"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "verified"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "verifiedInOrder"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rawArguments"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "realMethod"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.invocation.Invocation.Invocation(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], int, org.mockito.internal.invocation.realmethod.RealMethod)",
      "begin_line": 48,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 37)",
        "(line 52,col 9)-(line 52,col 65)",
        "(line 53,col 9)-(line 53,col 33)",
        "(line 54,col 9)-(line 54,col 45)",
        "(line 55,col 9)-(line 55,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.expandVarArgs(boolean, java.lang.Object[])",
      "begin_line": 60,
      "end_line": 78,
      "comment": " varArgs (1, a, b);",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 52)",
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 48)",
        "(line 74,col 9)-(line 74,col 70)",
        "(line 75,col 9)-(line 75,col 63)",
        "(line 76,col 9)-(line 76,col 77)",
        "(line 77,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getMock()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getMethod()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getArguments()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.markVerified()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isVerified()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getSequenceNumber()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.markVerifiedInOrder()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 28)",
        "(line 106,col 9)-(line 106,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isVerifiedInOrder()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 120,col 9)-(line 120,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.equalArguments(java.lang.Object[])",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.hashCode()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.toString()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.toString(java.util.List\u003corg.hamcrest.Matcher\u003e, org.mockito.internal.reporting.PrintSettings)",
      "begin_line": 135,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 64)",
        "(line 137,col 9)-(line 137,col 46)",
        "(line 138,col 9)-(line 138,col 95)",
        "(line 139,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.qualifiedMethodName()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.argumentsToMatchers()",
      "begin_line": 150,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 74)",
        "(line 152,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isToString(org.mockito.invocation.InvocationOnMock)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isToString(java.lang.reflect.Method)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isValidException(java.lang.Throwable)",
      "begin_line": 171,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 69)",
        "(line 173,col 9)-(line 173,col 55)",
        "(line 174,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isValidReturnType(java.lang.Class)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.isVoid()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.printMethodReturnType()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getMethodName()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.returnsPrimitive()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getLocation()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getArgumentsCount()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.getRawArguments()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.callRealMethod()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.invocation.Invocation.toString(org.mockito.internal.reporting.PrintSettings)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 62)"
      ]
    }
  ]
}