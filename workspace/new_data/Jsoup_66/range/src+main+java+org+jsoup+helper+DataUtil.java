{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 284,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "firstReadBufferSize"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mimeBoundaryChars"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "boundaryLength"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.crossStreams(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Writes the input stream to the output stream. Doesn\u0027t close them.\n     * @param in input stream to read from\n     * @param out output stream to write to\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 51)",
        "(line 87,col 9)-(line 87,col 16)",
        "(line 88,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseInputStream(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 93,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 41)",
        "(line 97,col 9)-(line 98,col 71)",
        "(line 100,col 9)-(line 100,col 28)",
        "(line 101,col 9)-(line 101,col 34)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 81)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 22)",
        "(line 110,col 9)-(line 110,col 78)",
        "(line 111,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 22)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream, int)",
      "begin_line": 168,
      "end_line": 190,
      "comment": "\n     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this\n     * method is executing on. The data read until being interrupted will be available.\n     * @param inStream the input stream to read from\n     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.\n     * @return the filled byte buffer\n     * @throws IOException if an exception occurs whilst reading from the input stream.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 81)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 94)",
        "(line 172,col 9)-(line 172,col 105)",
        "(line 174,col 9)-(line 174,col 17)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 177,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readFileToByteBuffer(java.io.File)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.emptyByteBuffer()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 219,
      "end_line": 228,
      "comment": "\n     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default\n     * will kick in.)\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 45)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.validateCharset(java.lang.String)",
      "begin_line": 230,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 56)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.mimeBoundary()",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n     * Creates a random string, suitable for use as a mime boundary\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 69)",
        "(line 248,col 9)-(line 248,col 41)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.detectCharsetFromBom(java.nio.ByteBuffer, java.lang.String)",
      "begin_line": 255,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 24)",
        "(line 257,col 9)-(line 257,col 33)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BomCharset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 275,
      "end_line": 283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.BomCharset.BomCharset(java.lang.String, int)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 35)",
        "(line 281,col 13)-(line 281,col 33)"
      ]
    }
  ]
}