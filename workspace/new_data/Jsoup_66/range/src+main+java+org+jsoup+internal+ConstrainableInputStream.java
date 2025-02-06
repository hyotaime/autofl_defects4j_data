{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/internal/ConstrainableInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstrainableInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.BufferedInputStream"
      ],
      "begin_line": 13,
      "end_line": 35,
      "comment": "\n * A jsoup internal class (so don\u0027t use it as there is no contract API) that enables constraints on an Input Stream,\n * namely a maximum read size, and the ability to Thread.interrupt() the read.\n "
    },
    {
      "type": "field",
      "varNames": [
        "capped"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.internal.ConstrainableInputStream.ConstrainableInputStream(java.io.InputStream, int, int)",
      "begin_line": 17,
      "end_line": 22,
      "comment": "",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 30)",
        "(line 19,col 9)-(line 19,col 38)",
        "(line 20,col 9)-(line 20,col 28)",
        "(line 21,col 9)-(line 21,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.read(byte[], int, int)",
      "begin_line": 24,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 27,col 22)",
        "(line 29,col 9)-(line 29,col 49)",
        "(line 30,col 9)-(line 32,col 9)",
        "(line 33,col 9)-(line 33,col 20)"
      ]
    }
  ]
}