{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/encoders/SunPNGEncoderAdapter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SunPNGEncoderAdapter",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.encoders.ImageEncoder"
      ],
      "begin_line": 56,
      "end_line": 130,
      "comment": "\r\n * Adapter class for the Sun PNG Encoder.  The ImageEncoderFactory will only\r\n * return a reference to this class by default if the library has been compiled\r\n * under a JDK 1.4+ and is being run using a JDK 1.4+.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.getQuality()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Get the quality of the image encoding (always 0.0).\r\n     *\r\n     * @return A float representing the quality.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.setQuality(float)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Set the quality of the image encoding (not supported in this\r\n     * ImageEncoder).\r\n     *\r\n     * @param quality  A float representing the quality.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.isEncodingAlpha()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Get whether the encoder should encode alpha transparency (always false).\r\n     *\r\n     * @return Whether the encoder is encoding alpha transparency.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.setEncodingAlpha(boolean)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Set whether the encoder should encode alpha transparency (not\r\n     * supported in this ImageEncoder).\r\n     *\r\n     * @param encodingAlpha  Whether the encoder should encode alpha\r\n     *                       transparency.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.encode(java.awt.image.BufferedImage)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\r\n     * Encodes an image in PNG format.\r\n     *\r\n     * @param bufferedImage  The image to be encoded.\r\n     *\r\n     * @return The byte[] that is the encoded image.\r\n     *\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 73)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.SunPNGEncoderAdapter.encode(java.awt.image.BufferedImage, java.io.OutputStream)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\r\n     * Encodes an image in PNG format and writes it to an OutputStream.\r\n     *\r\n     * @param bufferedImage  The image to be encoded.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 68)"
      ]
    }
  ]
}