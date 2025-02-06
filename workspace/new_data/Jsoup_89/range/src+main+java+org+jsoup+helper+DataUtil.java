{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 271,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "firstReadBufferSize"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mimeBoundaryChars"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "boundaryLength"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.crossStreams(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Writes the input stream to the output stream. Doesn\u0027t close them.\n     * @param in input stream to read from\n     * @param out output stream to write to\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 51)",
        "(line 90,col 9)-(line 90,col 16)",
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseInputStream(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 96,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 41)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 101,col 9)-(line 101,col 28)",
        "(line 102,col 9)-(line 102,col 34)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 81)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 22)",
        "(line 111,col 9)-(line 111,col 65)",
        "(line 112,col 9)-(line 113,col 45)",
        "(line 115,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 22)",
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream, int)",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this\n     * method is executing on. The data read until being interrupted will be available.\n     * @param inStream the input stream to read from\n     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.\n     * @return the filled byte buffer\n     * @throws IOException if an exception occurs whilst reading from the input stream.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 81)",
        "(line 191,col 9)-(line 191,col 108)",
        "(line 192,col 9)-(line 192,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.emptyByteBuffer()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 205,
      "end_line": 214,
      "comment": "\n     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default\n     * will kick in.)\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 45)",
        "(line 207,col 9)-(line 207,col 56)",
        "(line 208,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.validateCharset(java.lang.String)",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 56)",
        "(line 218,col 9)-(line 218,col 47)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.mimeBoundary()",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Creates a random string, suitable for use as a mime boundary\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 62)",
        "(line 234,col 9)-(line 234,col 41)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.detectCharsetFromBom(java.nio.ByteBuffer)",
      "begin_line": 241,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 39)",
        "(line 243,col 9)-(line 243,col 22)",
        "(line 244,col 9)-(line 244,col 33)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BomCharset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 262,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.BomCharset.BomCharset(java.lang.String, boolean)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 35)",
        "(line 268,col 13)-(line 268,col 33)"
      ]
    }
  ]
}