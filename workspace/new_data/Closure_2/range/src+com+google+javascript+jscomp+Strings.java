{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/Strings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Strings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 119,
      "comment": "\n * Guava code that will eventually be open-sourced properly. Package-private\n * until they\u0027re able to do that. A lot of these methods are discouraged\n * anyways.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Strings.Strings()",
      "begin_line": 27,
      "end_line": 27,
      "comment": " All static",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Strings.truncateAtMaxLength(java.lang.String, int, boolean)",
      "begin_line": 45,
      "end_line": 55,
      "comment": "\n   * If this given string is of length {@code maxLength} or less, it will\n   * be returned as-is.\n   * Otherwise, it will be truncated to {@code maxLength}, regardless of whether\n   * there are any space characters in the String. If an ellipsis is requested\n   * to be appended to the truncated String, the String will be truncated so\n   * that the ellipsis will also fit within maxLength.\n   * If no truncation was necessary, no ellipsis will be added.\n   * @param source the String to truncate if necessary\n   * @param maxLength the maximum number of characters to keep\n   * @param addEllipsis if true, and if the String had to be truncated,\n   *     add \"...\" to the end of the String before returning. Additionally,\n   *     the ellipsis will only be added if maxLength is greater than 3.\n   * @return the original string if it\u0027s length is less than or equal to\n   *     maxLength, otherwise a truncated string as mentioned above\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 50,col 5)",
        "(line 51,col 5)-(line 53,col 5)",
        "(line 54,col 5)-(line 54,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Strings.unicodePreservingIndex(java.lang.String, int)",
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n   * Normalizes {@code index} such that it respects Unicode character\n   * boundaries in {@code str}.\n   *\n   * \u003cp\u003eIf {@code index} is the low surrogate of a Unicode character,\n   * the method returns {@code index - 1}. Otherwise, {@code index} is\n   * returned.\n   *\n   * \u003cp\u003eIn the case in which {@code index} falls in an invalid surrogate pair\n   * (e.g. consecutive low surrogates, consecutive high surrogates), or if\n   * if it is not a valid index into {@code str}, the original value of\n   * {@code index} is returned.\n   *\n   * @param str the String\n   * @param index the index to be normalized\n   * @return a normalized index that does not split a Unicode character\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Strings.unicodePreservingSubstring(java.lang.String, int, int)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n   * Returns a substring of {@code str} that respects Unicode character\n   * boundaries.\n   *\n   * \u003cp\u003eThe string will never be split between a [high, low] surrogate pair,\n   * as defined by {@link Character#isHighSurrogate} and\n   * {@link Character#isLowSurrogate}.\n   *\n   * \u003cp\u003eIf {@code begin} or {@code end} are the low surrogate of a Unicode\n   * character, it will be offset by -1.\n   *\n   * \u003cp\u003eThis behavior guarantees that\n   * {@code str.equals(StringUtil.unicodePreservingSubstring(str, 0, n) +\n   *     StringUtil.unicodePreservingSubstring(str, n, str.length())) } is\n   * true for all {@code n}.\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eThis means that unlike {@link String#substring(int, int)}, the length of\n   * the returned substring may not necessarily be equivalent to\n   * {@code end - begin}.\n   *\n   * @param str the original String\n   * @param begin the beginning index, inclusive\n   * @param end the ending index, exclusive\n   * @return the specified substring, possibly adjusted in order to not\n   *   split Unicode surrogate pairs\n   * @throws IndexOutOfBoundsException if the {@code begin} is negative,\n   *   or {@code end} is larger than the length of {@code str}, or\n   *   {@code begin} is larger than {@code end}\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 117,col 42)"
      ]
    }
  ]
}