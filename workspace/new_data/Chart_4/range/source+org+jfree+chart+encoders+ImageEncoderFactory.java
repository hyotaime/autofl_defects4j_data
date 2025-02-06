{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/encoders/ImageEncoderFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImageEncoderFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 164,
      "comment": "\r\n * Factory class for returning {@link ImageEncoder}s for different\r\n * {@link ImageFormat}s.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "encoders"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.init()",
      "begin_line": 64,
      "end_line": 81,
      "comment": "\r\n     * Sets up default encoders (uses Sun PNG Encoder if JDK 1.4+ and the\r\n     * SunPNGEncoderAdapter class is available).\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)",
        "(line 66,col 9)-(line 66,col 79)",
        "(line 67,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.setImageEncoder(java.lang.String, java.lang.String)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\r\n     * Used to set additional encoders or replace default ones.\r\n     *\r\n     * @param format  The image format name.\r\n     * @param imageEncoderClassName  The name of the ImageEncoder class.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.newInstance(java.lang.String)",
      "begin_line": 101,
      "end_line": 116,
      "comment": "\r\n     * Used to retrieve an ImageEncoder for a specific image format.\r\n     *\r\n     * @param format  The image format required.\r\n     *\r\n     * @return The ImageEncoder or \u003ccode\u003enull\u003c/code\u003e if none available.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 57)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.newInstance(java.lang.String, float)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\r\n     * Used to retrieve an ImageEncoder for a specific image format.\r\n     *\r\n     * @param format  The image format required.\r\n     * @param quality  The quality to be set before returning.\r\n     *\r\n     * @return The ImageEncoder or \u003ccode\u003enull\u003c/code\u003e if none available.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.newInstance(java.lang.String, boolean)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\r\n     * Used to retrieve an ImageEncoder for a specific image format.\r\n     *\r\n     * @param format  The image format required.\r\n     * @param encodingAlpha  Sets whether alpha transparency should be encoded.\r\n     *\r\n     * @return The ImageEncoder or \u003ccode\u003enull\u003c/code\u003e if none available.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoderFactory.newInstance(java.lang.String, float, boolean)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\r\n     * Used to retrieve an ImageEncoder for a specific image format.\r\n     *\r\n     * @param format  The image format required.\r\n     * @param quality  The quality to be set before returning.\r\n     * @param encodingAlpha  Sets whether alpha transparency should be encoded.\r\n     *\r\n     * @return The ImageEncoder or \u003ccode\u003enull\u003c/code\u003e if none available.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 53)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    }
  ]
}