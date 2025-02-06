{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/CharSequenceUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSequenceUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 197,
      "comment": "\n * \u003cp\u003eOperations on {@link java.lang.CharSequence} that are\n * {@code null} safe.\u003c/p\u003e\n *\n * @see java.lang.CharSequence\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.CharSequenceUtils()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * \u003cp\u003e{@code CharSequenceUtils} instances should NOT be constructed in\n     * standard programming. \u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.subSequence(java.lang.CharSequence, int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eReturns a new {@code CharSequence} that is a subsequence of this\n     * sequence starting with the {@code char} value at the specified index.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis provides the {@code CharSequence} equivalent to {@link String#substring(int)}.\n     * The length (in {@code char}) of the returned sequence is {@code length() - start},\n     * so if {@code start \u003d\u003d end} then an empty sequence is returned.\u003c/p\u003e\n     *\n     * @param cs  the specified subsequence, null returns null\n     * @param start  the start index, inclusive, valid\n     * @return a new subsequence, may be null\n     * @throws IndexOutOfBoundsException if {@code start} is negative or if \n     *  {@code start} is greater than {@code length()}\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.indexOf(java.lang.CharSequence, int, int)",
      "begin_line": 69,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eFinds the first index in the {@code CharSequence} that matches the\n     * specified character.\u003c/p\u003e\n     *\n     * @param cs  the {@code CharSequence} to be processed, not null\n     * @param searchChar  the char to be searched for\n     * @param start  the start index, negative starts at the string start\n     * @return the index where the search char was found, -1 if not found\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 83,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\n     * Used by the indexOf(CharSequence methods) as a green implementation of indexOf.\n     *\n     * @param cs the {@code CharSequence} to be processed\n     * @param searchChar the {@code CharSequence} to be searched for\n     * @param start the start index\n     * @return the index where the search sequence was found\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(java.lang.CharSequence, int, int)",
      "begin_line": 116,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eFinds the last index in the {@code CharSequence} that matches the\n     * specified character.\u003c/p\u003e\n     *\n     * @param cs  the {@code CharSequence} to be processed\n     * @param searchChar  the char to be searched for\n     * @param start  the start index, negative returns -1, beyond length starts at end\n     * @return the index where the search char was found, -1 if not found\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\n     * Used by the lastIndexOf(CharSequence methods) as a green implementation of lastIndexOf\n     *\n     * @param cs the {@code CharSequence} to be processed\n     * @param searchChar the {@code CharSequence} to be searched for\n     * @param start the start index\n     * @return the index where the search sequence was found\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.toCharArray(java.lang.CharSequence)",
      "begin_line": 163,
      "end_line": 174,
      "comment": "\n     * Green implementation of toCharArray.\n     *\n     * @param cs the {@code CharSequence} to be processed\n     * @return the resulting char array\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSequenceUtils.regionMatches(java.lang.CharSequence, boolean, int, java.lang.CharSequence, int, int)",
      "begin_line": 187,
      "end_line": 195,
      "comment": "\n     * Green implementation of regionMatches.\n     *\n     * @param cs the {@code CharSequence} to be processed\n     * @param ignoreCase whether or not to be case insensitive\n     * @param thisStart the index to start on the {@code cs} CharSequence\n     * @param substring the {@code CharSequence} to be looked for\n     * @param start the index to start on the {@code substring} CharSequence\n     * @param length character length of the region\n     * @return whether the region matched\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 194,col 9)"
      ]
    }
  ]
}