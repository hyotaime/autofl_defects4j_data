{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/encoders/EncoderUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EncoderUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 191,
      "comment": "\r\n * A collection of utility methods for encoding images and returning them as a\r\n * byte[] or writing them directly to an OutputStream.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.encode(java.awt.image.BufferedImage, java.lang.String)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\r\n     * Encode the image in a specific format.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     *\r\n     * @return The byte[] that is the encoded image.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 76)",
        "(line 66,col 9)-(line 66,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.encode(java.awt.image.BufferedImage, java.lang.String, boolean)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\r\n     * Encode the image in a specific format.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param encodeAlpha  Whether to encode alpha transparency (not supported\r\n     *                     by all ImageEncoders).\r\n     * @return The byte[] that is the encoded image.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 67)",
        "(line 83,col 9)-(line 83,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.encode(java.awt.image.BufferedImage, java.lang.String, float)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\r\n     * Encode the image in a specific format.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param quality  The quality to use for the image encoding (not supported\r\n     *                 by all ImageEncoders).\r\n     * @return The byte[] that is the encoded image.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 63)",
        "(line 100,col 9)-(line 100,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.encode(java.awt.image.BufferedImage, java.lang.String, float, boolean)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\r\n     * Encode the image in a specific format.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param quality  The quality to use for the image encoding (not supported\r\n     *                 by all ImageEncoders).\r\n     * @param encodeAlpha  Whether to encode alpha transparency (not supported\r\n     *                     by all ImageEncoders).\r\n     * @return The byte[] that is the encoded image.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 119,col 76)",
        "(line 120,col 9)-(line 120,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(java.awt.image.BufferedImage, java.lang.String, java.io.OutputStream)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\r\n     * Encode the image in a specific format and write it to an OutputStream.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 76)",
        "(line 134,col 9)-(line 134,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(java.awt.image.BufferedImage, java.lang.String, java.io.OutputStream, float)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\r\n     * Encode the image in a specific format and write it to an OutputStream.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @param quality  The quality to use for the image encoding (not\r\n     *                 supported by all ImageEncoders).\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 150,col 63)",
        "(line 151,col 9)-(line 151,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(java.awt.image.BufferedImage, java.lang.String, java.io.OutputStream, boolean)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\r\n     * Encode the image in a specific format and write it to an OutputStream.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @param encodeAlpha  Whether to encode alpha transparency (not\r\n     *                     supported by all ImageEncoders).\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 67)",
        "(line 168,col 9)-(line 168,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.EncoderUtil.writeBufferedImage(java.awt.image.BufferedImage, java.lang.String, java.io.OutputStream, float, boolean)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\r\n     * Encode the image in a specific format and write it to an OutputStream.\r\n     *\r\n     * @param image  The image to be encoded.\r\n     * @param format  The {@link ImageFormat} to use.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @param quality  The quality to use for the image encoding (not\r\n     *                 supported by all ImageEncoders).\r\n     * @param encodeAlpha  Whether to encode alpha transparency (not supported\r\n     *                     by all ImageEncoders).\r\n     * @throws IOException\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 188,col 49)"
      ]
    }
  ]
}