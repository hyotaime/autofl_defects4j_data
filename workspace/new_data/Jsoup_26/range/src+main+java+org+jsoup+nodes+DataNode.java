{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/DataNode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataNode",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 7,
      "end_line": 62,
      "comment": "\n A data node, for contents of style, script tags etc, where contents should not show in text().\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "DATA_KEY"
      ],
      "begin_line": 8,
      "end_line": 8,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DataNode.DataNode(java.lang.String, java.lang.String)",
      "begin_line": 15,
      "end_line": 18,
      "comment": "\n     Create a new DataNode.\n     @param data data contents\n     @param baseUri base URI\n     ",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 23)",
        "(line 17,col 9)-(line 17,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.nodeName()",
      "begin_line": 20,
      "end_line": 22,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.getWholeData()",
      "begin_line": 28,
      "end_line": 30,
      "comment": "\n     Get the data contents of this node. Will be unescaped and with original new lines, space etc.\n     @return data\n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.setWholeData(java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Set the data contents of this node.\n     * @param data unencoded data\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 39)",
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.toString()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     Create a new DataNode from HTML encoded data.\n     @param encodedData encoded data\n     @param baseUri bass URI\n     @return new DataNode\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 53)",
        "(line 60,col 9)-(line 60,col 43)"
      ]
    }
  ]
}