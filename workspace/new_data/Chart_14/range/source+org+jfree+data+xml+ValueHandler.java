{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xml/ValueHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueHandler",
      "is_interface": false,
      "parent_types": [
        "DefaultHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 51,
      "end_line": 161,
      "comment": "\r\n * A handler for reading a \u0027Value\u0027 element.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "rootHandler"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The root handler. "
    },
    {
      "type": "field",
      "varNames": [
        "itemHandler"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The item handler. "
    },
    {
      "type": "field",
      "varNames": [
        "currentText"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Storage for the current CDATA "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.ValueHandler.ValueHandler(org.jfree.data.xml.RootHandler, org.jfree.data.xml.ItemHandler)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\r\n     * Creates a new value handler.\r\n     *\r\n     * @param rootHandler  the root handler.\r\n     * @param itemHandler  the item handler.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 39)",
        "(line 70,col 9)-(line 70,col 39)",
        "(line 71,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 84,
      "end_line": 97,
      "comment": "\r\n     * The start of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ValueHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 108,
      "end_line": 130,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ValueHandler.characters(char[], int, int)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\r\n     * Receives some (or all) of the text in the current element.\r\n     *\r\n     * @param ch  character buffer.\r\n     * @param start  the start index.\r\n     * @param length  the length of the valid character data.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ValueHandler.getCurrentText()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the current text of the textbuffer.\r\n     *\r\n     * @return The current text.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ValueHandler.clearCurrentText()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Removes all text from the textbuffer at the end of a CDATA section.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 62)"
      ]
    }
  ]
}