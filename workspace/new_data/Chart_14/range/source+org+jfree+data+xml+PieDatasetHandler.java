{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xml/PieDatasetHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieDatasetHandler",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xml.RootHandler",
        "org.jfree.data.xml.DatasetTags"
      ],
      "begin_line": 52,
      "end_line": 133,
      "comment": "\r\n * A SAX handler for reading a {@link PieDataset} from an XML file.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The pie dataset under construction. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xml.PieDatasetHandler.PieDatasetHandler()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.PieDatasetHandler.getDataset()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Returns the dataset.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.PieDatasetHandler.addItem(java.lang.Comparable, java.lang.Number)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Adds an item to the dataset under construction.\r\n     *\r\n     * @param key  the key.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "startElement(String, String, String, Attributes)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Attributes\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 93,
      "end_line": 111,
      "comment": "\r\n     * Starts an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     * @param atts  the element attributes.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 53)",
        "(line 99,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xml.PieDatasetHandler.endElement(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 122,
      "end_line": 131,
      "comment": "\r\n     * The end of an element.\r\n     *\r\n     * @param namespaceURI  the namespace.\r\n     * @param localName  the element name.\r\n     * @param qName  the element name.\r\n     *\r\n     * @throws SAXException for errors.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 53)",
        "(line 127,col 9)-(line 129,col 9)"
      ]
    }
  ]
}