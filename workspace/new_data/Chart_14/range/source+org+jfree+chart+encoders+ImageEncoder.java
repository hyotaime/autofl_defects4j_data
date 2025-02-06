{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/encoders/ImageEncoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImageEncoder",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 106,
      "comment": "\r\n * Interface for abstracting different types of image encoders.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.encode(java.awt.image.BufferedImage)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\r\n     * Encodes an image in a particular format.\r\n     *\r\n     * @param bufferedImage  The image to be encoded.\r\n     * \r\n     * @return The byte[] that is the encoded image.\r\n     * \r\n     * @throws IOException\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.encode(java.awt.image.BufferedImage, java.io.OutputStream)",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\r\n     * Encodes an image in a particular format and writes it to an OutputStream.\r\n     *\r\n     * @param bufferedImage  The image to be encoded.\r\n     * @param outputStream  The OutputStream to write the encoded image to.\r\n     * @throws IOException\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.getQuality()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\r\n     * Get the quality of the image encoding.\r\n     *\r\n     * @return A float representing the quality.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.setQuality(float)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * Set the quality of the image encoding (not supported by all \r\n     * ImageEncoders).\r\n     *\r\n     * @param quality  A float representing the quality.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.isEncodingAlpha()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\r\n     * Get whether the encoder should encode alpha transparency.\r\n     *\r\n     * @return Whether the encoder is encoding alpha transparency.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.encoders.ImageEncoder.setEncodingAlpha(boolean)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * Set whether the encoder should encode alpha transparency (not \r\n     * supported by all ImageEncoders).\r\n     *\r\n     * @param encodingAlpha  Whether the encoder should encode alpha \r\n     *                       transparency.\r\n     ",
      "child_ranges": []
    }
  ]
}