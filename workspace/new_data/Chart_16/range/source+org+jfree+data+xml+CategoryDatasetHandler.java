{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xml/CategoryDatasetHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryDatasetHandler",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xml.RootHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 52,
      "end_line": 137,
      "comment": "\r\n * A SAX handler for reading a {@link CategoryDataset} from an XML file.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The dataset under construction. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.CategoryDatasetHandler.CategoryDatasetHandler()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\r\n     * Creates a new handler.\r\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategoryDatasetHandler.getDataset()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategoryDatasetHandler.addItem(java.lang.Comparable, java.lang.Comparable, java.lang.Number)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Adds an item to the dataset.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 94,
      "end_line": 115,
      "comment": "\r\n     * The start of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the element attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)",
        "(line 100,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.CategoryDatasetHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 133,col 9)"
      ]
    }
  ]
}