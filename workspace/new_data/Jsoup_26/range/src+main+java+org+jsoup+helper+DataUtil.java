{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 18,
      "end_line": 136,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " ~130K."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 23,
      "end_line": 23,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 33,
      "end_line": 43,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 40)",
        "(line 35,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 51)",
        "(line 55,col 9)-(line 55,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Parses a Document from an input steam, using the provided Parser.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @param parser alternate {@link Parser#xmlParser() parser} to use.\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 51)",
        "(line 69,col 9)-(line 69,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 74,
      "end_line": 106,
      "comment": " switching the chartset midstream when a meta http-equiv tag defines the charset.",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 108,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 110,col 80)",
        "(line 111,col 9)-(line 111,col 17)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 71)",
        "(line 118,col 9)-(line 118,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 126,
      "end_line": 133,
      "comment": "\n     * Parse out a charset from a content type header.\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    }
  ]
}