{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xml/KeyHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyHandler",
      "is_interface": false,
      "parent_types": [
        "DefaultHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 50,
      "end_line": 156,
      "comment": "\r\n * A SAX handler for reading a key.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "rootHandler"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The root handler. "
    },
    {
      "type": "field",
      "varNames": [
        "itemHandler"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The item handler. "
    },
    {
      "type": "field",
      "varNames": [
        "currentText"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Storage for the current CDATA "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.KeyHandler.KeyHandler(org.jfree.data.xml.RootHandler, org.jfree.data.xml.ItemHandler)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\r\n     * Creates a new handler.\r\n     *\r\n     * @param rootHandler  the root handler.\r\n     * @param itemHandler  the item handler.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 72,col 39)",
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 87,
      "end_line": 99,
      "comment": "\r\n     * The start of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.KeyHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 110,
      "end_line": 125,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.KeyHandler.characters(char[], int, int)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\r\n     * Receives some (or all) of the text in the current element.\r\n     *\r\n     * @param ch  character buffer.\r\n     * @param start  the start index.\r\n     * @param length  the length of the valid character data.\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.KeyHandler.getCurrentText()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns the current text of the textbuffer.\r\n     *\r\n     * @return The current text.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.KeyHandler.clearCurrentText()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Removes all text from the textbuffer at the end of a CDATA section.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 62)"
      ]
    }
  ]
}