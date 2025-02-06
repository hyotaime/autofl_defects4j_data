{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/internal/ConstrainableInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstrainableInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.BufferedInputStream"
      ],
      "begin_line": 16,
      "end_line": 121,
      "comment": "\n * A jsoup internal class (so don\u0027t use it as there is no contract API) that enables constraints on an Input Stream,\n * namely a maximum read size, and the ability to Thread.interrupt() the read.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DefaultSize"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "capped"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxSize"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeout"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " optional max time of request"
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "interrupted"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.internal.ConstrainableInputStream.ConstrainableInputStream(java.io.InputStream, int, int)",
      "begin_line": 26,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 30)",
        "(line 28,col 9)-(line 28,col 38)",
        "(line 29,col 9)-(line 29,col 31)",
        "(line 30,col 9)-(line 30,col 28)",
        "(line 31,col 9)-(line 31,col 30)",
        "(line 32,col 9)-(line 32,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.wrap(java.io.InputStream, int, int)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * If this InputStream is not already a ConstrainableInputStream, let it be one.\n     * @param in the input stream to (maybe) wrap\n     * @param bufferSize the buffer size to use when reading\n     * @param maxSize the maximum size to allow to be read. 0 \u003d\u003d infinite.\n     * @return a constrainable input stream\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.read(byte[], int, int)",
      "begin_line": 48,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 51,col 22)",
        "(line 52,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 58,col 61)",
        "(line 60,col 9)-(line 61,col 28)",
        "(line 63,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.readToByteBuffer(int)",
      "begin_line": 76,
      "end_line": 99,
      "comment": "\n     * Reads this inputstream to a ByteBuffer. The supplied max may be less than the inputstream\u0027s max, to support\n     * reading just the first bytes.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 77)",
        "(line 78,col 9)-(line 78,col 44)",
        "(line 79,col 9)-(line 79,col 84)",
        "(line 80,col 9)-(line 80,col 55)",
        "(line 81,col 9)-(line 81,col 86)",
        "(line 83,col 9)-(line 83,col 17)",
        "(line 84,col 9)-(line 84,col 28)",
        "(line 86,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.reset()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.timeout(long, long)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 109,col 47)",
        "(line 110,col 9)-(line 110,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.internal.ConstrainableInputStream.expired()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 115,col 25)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 118,col 41)",
        "(line 119,col 9)-(line 119,col 31)"
      ]
    }
  ]
}