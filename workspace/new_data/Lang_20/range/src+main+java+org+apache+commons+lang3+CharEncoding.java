{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/CharEncoding.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharEncoding",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 105,
      "comment": "\n * \u003cp\u003eCharacter encoding names required of every implementation of the Java platform.\u003c/p\u003e\n *\n * \u003cp\u003eAccording to \u003ca href\u003d\"http://java.sun.com/j2se/1.3/docs/api/java/lang/package-summary.html#charenc\"\u003eJRE character\n * encoding names\u003c/a\u003e:\u003c/p\u003e\n *\n * \u003cp\u003e\u003ccite\u003eEvery implementation of the Java platform is required to support the following character encodings.\n * Consult the release documentation for your implementation to see if any other encodings are supported.\n * \u003c/cite\u003e\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://download.oracle.com/javase/1.3/docs/guide/intl/encoding.doc.html\"\u003eJRE character encoding names\u003c/a\u003e\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_8859_1"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * \u003cp\u003eISO Latin Alphabet #1, also known as ISO-LATIN-1.\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "US_ASCII"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003eSeven-bit ASCII, also known as ISO646-US, also known as the Basic Latin block\n     * of the Unicode character set.\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eSixteen-bit Unicode Transformation Format, byte order specified by a mandatory initial\n     * byte-order mark (either order accepted on input, big-endian used on output).\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16BE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eSixteen-bit Unicode Transformation Format, big-endian byte order.\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_16LE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * \u003cp\u003eSixteen-bit Unicode Transformation Format, little-endian byte order.\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "UTF_8"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eEight-bit Unicode Transformation Format.\u003c/p\u003e\n     *\n     * \u003cp\u003eEvery implementation of the Java platform is required to support this character encoding.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharEncoding.isSupported(java.lang.String)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eReturns whether the named charset is supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to \u003ca\n     * href\u003d\"http://download.oracle.com/javase/1.4.2/docs/api/java/nio/charset/Charset.html#isSupported%28java.lang.String%29\"\u003e\n     * java.nio.charset.Charset.isSupported(String)\u003c/a\u003e but handles more formats\u003c/p\u003e\n     *\n     * @param name  the name of the requested charset; may be either a canonical name or an alias, null returns false\n     * @return {@code true} if the charset is available in the current Java virtual machine\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 102,col 9)"
      ]
    }
  ]
}