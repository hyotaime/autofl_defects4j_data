{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/helper/DataUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 17,
      "end_line": 115,
      "comment": "\n * Internal static utilities for handling data.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "charsetPattern"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultCharset"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " used if not found in header or meta charset"
    },
    {
      "type": "field",
      "varNames": [
        "bufferSize"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " ~130K."
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.DataUtil.DataUtil()",
      "begin_line": 22,
      "end_line": 22,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String)",
      "begin_line": 32,
      "end_line": 41,
      "comment": "\n     * Loads a file to a Document.\n     * @param in file to load\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 36)",
        "(line 34,col 9)-(line 40,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.load(java.io.InputStream, java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Parses a Document from an input steam.\n     * @param in input stream to parse. You will need to close it.\n     * @param charsetName character set of input\n     * @param baseUri base URI of document, to resolve relative links against\n     * @return Document\n     * @throws IOException on IO error\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 51)",
        "(line 53,col 9)-(line 53,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.parseByteData(java.nio.ByteBuffer, java.lang.String, java.lang.String)",
      "begin_line": 58,
      "end_line": 84,
      "comment": " switching the chartset midstream when a meta http-equiv tag defines the charset.",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 60,col 28)",
        "(line 61,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.readToByteBuffer(java.io.InputStream)",
      "begin_line": 86,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 45)",
        "(line 88,col 9)-(line 88,col 80)",
        "(line 89,col 9)-(line 89,col 17)",
        "(line 90,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 71)",
        "(line 96,col 9)-(line 96,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.DataUtil.getCharsetFromContentType(java.lang.String)",
      "begin_line": 104,
      "end_line": 112,
      "comment": "\n     * Parse out a charset from a content type header.\n     * @param contentType e.g. \"text/html; charset\u003dEUC-JP\"\n     * @return \"EUC-JP\", or null if not found. Charset is trimmed and uppercased.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 45)",
        "(line 107,col 9)-(line 107,col 56)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 20)"
      ]
    }
  ]
}