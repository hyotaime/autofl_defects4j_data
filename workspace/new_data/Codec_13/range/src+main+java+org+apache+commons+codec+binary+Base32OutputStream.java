{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/binary/Base32OutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base32OutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.binary.BaseNCodecOutputStream"
      ],
      "begin_line": 39,
      "end_line": 85,
      "comment": "\n * Provides Base32 encoding and decoding in a streaming fashion (unlimited size). When encoding the default lineLength\n * is 76 characters and the default lineEnding is CRLF, but these can be overridden by using the appropriate\n * constructor.\n * \u003cp\u003e\n * The default behaviour of the Base32OutputStream is to ENCODE, whereas the default behaviour of the Base32InputStream\n * is to DECODE. But this behaviour can be overridden by using a different constructor.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Since this class operates directly on byte streams, and not character streams, it is hard-coded to only encode/decode\n * character encodings which are compatible with the lower 127 ASCII chart (ISO-8859-1, Windows-1252, UTF-8, etc).\n * \u003c/p\u003e\n *\n * @version $Id$\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc4648.txt\"\u003eRFC 4648\u003c/a\u003e\n * @since 1.5\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32OutputStream.Base32OutputStream(java.io.OutputStream)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Creates a Base32OutputStream such that all data written is Base32-encoded to the original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32OutputStream.Base32OutputStream(java.io.OutputStream, boolean)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates a Base32OutputStream such that all data written is either Base32-encoded or Base32-decoded to the\n     * original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base32OutputStream.Base32OutputStream(java.io.OutputStream, boolean, int, byte[])",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Creates a Base32OutputStream such that all data written is either Base32-encoded or Base32-decoded to the\n     * original provided OutputStream.\n     *\n     * @param out\n     *            OutputStream to wrap.\n     * @param doEncode\n     *            true if we should encode all data written to us, false if we should decode.\n     * @param lineLength\n     *            If doEncode is true, each line of encoded data will contain lineLength characters (rounded down to\n     *            nearest multiple of 4). If lineLength \u0026lt;\u003d 0, the encoded data is not divided into lines. If doEncode is\n     *            false, lineLength is ignored.\n     * @param lineSeparator\n     *            If doEncode is true, each line of encoded data will be terminated with this byte sequence (e.g. \\r\\n).\n     *            If lineLength \u0026lt;\u003d 0, the lineSeparator is not used. If doEncode is false lineSeparator is ignored.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 68)"
      ]
    }
  ]
}