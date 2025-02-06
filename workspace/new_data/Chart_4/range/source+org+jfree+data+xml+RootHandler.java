{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xml/RootHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RootHandler",
      "is_interface": false,
      "parent_types": [
        "DefaultHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 51,
      "end_line": 125,
      "comment": "\r\n * A SAX handler that delegates work to sub-handlers.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "subHandlers"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The sub-handlers. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.RootHandler.RootHandler()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\r\n     * Creates a new handler.\r\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.RootHandler.getSubHandlers()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Returns the stack of sub handlers.\r\n     *\r\n     * @return The sub-handler stack.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.RootHandler.characters(char[], int, int)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\r\n     * Receives some (or all) of the text in the current element.\r\n     *\r\n     * @param ch  character buffer.\r\n     * @param start  the start index.\r\n     * @param length  the length of the valid character data.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 53)",
        "(line 84,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.RootHandler.getCurrentHandler()",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\r\n     * Returns the handler at the top of the stack.\r\n     *\r\n     * @return The handler.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)",
        "(line 96,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "pushSubHandler(DefaultHandler)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027DefaultHandler\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Pushes a sub-handler onto the stack.\r\n     *\r\n     * @param subhandler  the sub-handler.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.RootHandler.popSubHandler()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Pops a sub-handler from the stack.\r\n     *\r\n     * @return The sub-handler.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 55)"
      ]
    }
  ]
}