{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xml/CategorySeriesHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategorySeriesHandler",
      "is_interface": false,
      "parent_types": [
        "DefaultHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 53,
      "end_line": 153,
      "comment": "\r\n * A handler for reading a series for a category dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The root handler. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.CategorySeriesHandler.CategorySeriesHandler(org.jfree.data.xml.RootHandler)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\r\n     * Creates a new item handler.\r\n     *\r\n     * @param root  the root handler.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategorySeriesHandler.setSeriesKey(java.lang.Comparable)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Sets the series key.\r\n     *\r\n     * @param key  the key.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategorySeriesHandler.addItem(java.lang.Comparable, java.lang.Number)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Adds an item to the temporary storage for the series.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 104,
      "end_line": 125,
      "comment": "\r\n     * The start of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategorySeriesHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 134,
      "end_line": 151,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 149,col 9)"
      ]
    }
  ]
}