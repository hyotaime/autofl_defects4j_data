{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/encoders/SunJPEGEncoderAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SunJPEGEncoderAdapter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.encoders.ImageEncoder"
      ],
      "begin_line": 66,
      "end_line": 177,
      "comment": "\r\n * Adapter class for the Sun JPEG Encoder.  The {@link ImageEncoderFactory} \r\n * will only return a reference to this class by default if the library has \r\n * been compiled under a JDK 1.4+ and is being run using a JRE 1.4+.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "quality"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The quality setting (in the range 0.0f to 1.0f). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.SunJPEGEncoderAdapter()",
      "begin_line": 74,
      "end_line": 75,
      "comment": "\r\n     * Creates a new \u003ccode\u003eSunJPEGEncoderAdapter\u003c/code\u003e instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.getQuality()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the quality of the image encoding, which is a number in the\r\n     * range 0.0f to 1.0f (higher values give better quality output, but larger\r\n     * file sizes).  The default value is 0.95f.\r\n     *\r\n     * @return A float representing the quality, in the range 0.0f to 1.0f.\r\n     * \r\n     * @see #setQuality(float)\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.setQuality(float)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\r\n     * Set the quality of the image encoding.\r\n     *\r\n     * @param quality  A float representing the quality (in the range 0.0f to\r\n     *     1.0f).\r\n     *     \r\n     * @see #getQuality()\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.isEncodingAlpha()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e always, indicating that this encoder does not\r\n     * encode alpha transparency.\r\n     *\r\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.setEncodingAlpha(boolean)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Set whether the encoder should encode alpha transparency (this is not \r\n     * supported for JPEG, so this method does nothing).\r\n     *\r\n     * @param encodingAlpha  ignored.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.encode(java.awt.image.BufferedImage)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\r\n     * Encodes an image in JPEG format.\r\n     *\r\n     * @param bufferedImage  the image to be encoded (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * \r\n     * @return The byte[] that is the encoded image.\r\n     * \r\n     * @throws IOException if there is an I/O problem.\r\n     * @throws NullPointerException if \u003ccode\u003ebufferedImage\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 140,col 44)",
        "(line 141,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunJPEGEncoderAdapter.encode(java.awt.image.BufferedImage, java.io.OutputStream)",
      "begin_line": 156,
      "end_line": 175,
      "comment": "\r\n     * Encodes an image in JPEG format and writes it to an output stream.\r\n     *\r\n     * @param bufferedImage  the image to be encoded (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * @param outputStream  the OutputStream to write the encoded image to \r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IOException if there is an I/O problem.\r\n     * @throws NullPointerException if \u003ccode\u003ebufferedImage\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 72)",
        "(line 165,col 9)-(line 165,col 59)",
        "(line 166,col 9)-(line 166,col 58)",
        "(line 167,col 9)-(line 167,col 60)",
        "(line 168,col 9)-(line 168,col 46)",
        "(line 169,col 9)-(line 169,col 78)",
        "(line 170,col 9)-(line 170,col 30)",
        "(line 171,col 9)-(line 171,col 71)",
        "(line 172,col 9)-(line 172,col 20)",
        "(line 173,col 9)-(line 173,col 25)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    }
  ]
}