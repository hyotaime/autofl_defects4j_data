{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/verification/Timeout.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Timeout",
      "is_interface": false,
      "parent_types": [
        "org.mockito.verification.VerificationWrapper\u003corg.mockito.internal.verification.VerificationOverTimeImpl\u003e",
        "org.mockito.verification.VerificationWithTimeout"
      ],
      "begin_line": 16,
      "end_line": 60,
      "comment": "\n * See the javadoc for {@link VerificationWithTimeout}\n * \u003cp\u003e\n * Typically, you won\u0027t use this class explicitly. Instead use timeout() method on Mockito class.\n * See javadoc for {@link VerificationWithTimeout}\n "
    },
    {
      "type": "constructor",
      "signature": "org.mockito.verification.Timeout.Timeout(long, org.mockito.verification.VerificationMode)",
      "begin_line": 24,
      "end_line": 26,
      "comment": "\n     * See the javadoc for {@link VerificationWithTimeout}\n     * \u003cp\u003e\n     * Typically, you won\u0027t use this class explicitly. Instead use timeout() method on Mockito class.\n     * See javadoc for {@link VerificationWithTimeout}\n     ",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.verification.Timeout.Timeout(long, long, org.mockito.verification.VerificationMode)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * See the javadoc for {@link VerificationWithTimeout}\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 88)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.verification.Timeout.Timeout(long, org.mockito.verification.VerificationMode, org.mockito.internal.util.Timer)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * See the javadoc for {@link VerificationWithTimeout}\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.verification.Timeout.Timeout(org.mockito.internal.verification.VerificationOverTimeImpl)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.Timeout.copySelfWithNewVerificationMode(org.mockito.verification.VerificationMode)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.Timeout.atMost(int)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 66)",
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.verification.Timeout.never()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 66)",
        "(line 58,col 9)-(line 58,col 20)"
      ]
    }
  ]
}