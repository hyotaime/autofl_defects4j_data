{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/DataNode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataNode",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 9,
      "end_line": 72,
      "comment": "\n A data node, for contents of style, script tags etc, where contents should not show in text().\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DataNode.DataNode(java.lang.String)",
      "begin_line": 15,
      "end_line": 17,
      "comment": "\n     Create a new DataNode.\n     @param data data contents\n     ",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DataNode.DataNode(java.lang.String, java.lang.String)",
      "begin_line": 25,
      "end_line": 27,
      "comment": "\n     Create a new DataNode.\n     @param data data contents\n     @param baseUri Unused, Leaf Nodes do not hold base URis\n     @deprecated use {@link #DataNode(String)} instead\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.nodeName()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.getWholeData()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     Get the data contents of this node. Will be unescaped and with original new lines, space etc.\n     @return data\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.setWholeData(java.lang.String)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Set the data contents of this node.\n     * @param data unencoded data\n     * @return this node, for chaining\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 24)",
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.toString()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DataNode.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     Create a new DataNode from HTML encoded data.\n     @param encodedData encoded data\n     @param baseUri bass URI\n     @return new DataNode\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 70,col 34)"
      ]
    }
  ]
}