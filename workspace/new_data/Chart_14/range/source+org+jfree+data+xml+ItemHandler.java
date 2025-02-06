{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xml/ItemHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ItemHandler",
      "is_interface": false,
      "parent_types": [
        "DefaultHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 50,
      "end_line": 168,
      "comment": "\r\n * A handler for reading key-value items.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The root handler. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The parent handler (can be the same as root, but not always). "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The key. "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The value. "
    },
    {
      "type": "constructor",
      "signature": "ItemHandler(RootHandler, DefaultHandler)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027DefaultHandler\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\r\n     * Creates a new item handler.\r\n     *\r\n     * @param root  the root handler.\r\n     * @param parent  the parent handler.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 29)",
        "(line 73,col 9)-(line 73,col 24)",
        "(line 74,col 9)-(line 74,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ItemHandler.getKey()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Returns the key that has been read by the handler, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The key.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ItemHandler.setKey(java.lang.Comparable)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Sets the key.\r\n     *\r\n     * @param key  the key.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ItemHandler.getValue()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Returns the key that has been read by the handler, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ItemHandler.setValue(java.lang.Number)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Sets the value.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 123,
      "end_line": 142,
      "comment": "\r\n     * The start of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.ItemHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 151,
      "end_line": 166,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 164,col 9)"
      ]
    }
  ]
}