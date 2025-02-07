{
  "filepath": "/tmp/Mockito-18b/src/org/mockito/internal/verification/VerificationOverTimeImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VerificationOverTimeImpl",
      "is_interface": false,
      "parent_types": [
        "org.mockito.verification.VerificationMode"
      ],
      "begin_line": 17,
      "end_line": 122,
      "comment": "\n * Verifies that another verification mode (the delegate) is satisfied within a certain timeframe\n * (before timeoutMillis has passed, measured from the call to verify()), and either returns immediately\n * once it does, or waits until it is definitely satisfied once the full time has passed.\n "
    },
    {
      "type": "field",
      "varNames": [
        "pollingPeriodMillis"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnOnSuccess"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timer"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.VerificationOverTimeImpl(long, long, org.mockito.verification.VerificationMode, boolean)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Create this verification mode, to be used to verify invocation ongoing data later.\n     *\n     * @param pollingPeriodMillis The frequency to poll delegate.verify(), to check whether the delegate has been satisfied\n     * @param durationMillis The max time to wait (in millis) for the delegate verification mode to be satisfied\n     * @param delegate The verification mode to delegate overall success or failure to\n     * @param returnOnSuccess Whether to immediately return successfully once the delegate is satisfied (as in\n     *                        {@link org.mockito.verification.VerificationWithTimeout}, or to only return once\n     *                        the delegate is satisfied and the full duration has passed (as in\n     *                        {@link org.mockito.verification.VerificationAfterDelay}).\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 88)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.VerificationOverTimeImpl(long, org.mockito.verification.VerificationMode, boolean, org.mockito.internal.util.Timer)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\n     * Create this verification mode, to be used to verify invocation ongoing data later.\n     *\n     * @param pollingPeriodMillis The frequency to poll delegate.verify(), to check whether the delegate has been satisfied\n     * @param delegate The verification mode to delegate overall success or failure to\n     * @param returnOnSuccess Whether to immediately return successfully once the delegate is satisfied (as in\n     *                        {@link org.mockito.verification.VerificationWithTimeout}, or to only return once\n     *                        the delegate is satisfied and the full duration has passed (as in\n     *                        {@link org.mockito.verification.VerificationAfterDelay}).\n     * @param timer Checker of whether the duration of the verification is still acceptable\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 55)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 47)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.verify(org.mockito.internal.verification.api.VerificationData)",
      "begin_line": 72,
      "end_line": 96,
      "comment": "\n     * Verify the given ongoing verification data, and confirm that it satisfies the delegate verification mode\n     * before the full duration has passed.\n     *\n     * In practice, this polls the delegate verification mode until it is satisfied. If it is not satisfied once\n     * the full duration has passed, the last error returned by the delegate verification mode will be thrown\n     * here in turn. This may be thrown early if the delegate is unsatisfied and the verification mode is known\n     * to never recover from this situation (e.g. {@link AtMost}).\n     *\n     * If it is satisfied before the full duration has passed, behaviour is dependent on the returnOnSuccess parameter\n     * given in the constructor. If true, this verification mode is immediately satisfied once the delegate is. If\n     * false, this verification mode is not satisfied until the delegate is satisfied and the full time has passed.\n     *\n     * @throws MockitoAssertionError if the delegate verification mode does not succeed before the timeout\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 36)",
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.handleVerifyException(java.lang.AssertionError)",
      "begin_line": 98,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.canRecoverFromFailure(org.mockito.verification.VerificationMode)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.copyWithVerificationMode(org.mockito.verification.VerificationMode)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.mockito.internal.verification.VerificationOverTimeImpl.sleep(long)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 120,col 9)"
      ]
    }
  ]
}