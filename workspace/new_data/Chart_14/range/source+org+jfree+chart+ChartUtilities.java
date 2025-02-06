{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/ChartUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 106,
      "end_line": 746,
      "comment": "\r\n * A collection of utility methods for JFreeChart.  Includes methods for \r\n * converting charts to image formats (PNG and JPEG) plus creating simple HTML \r\n * image maps.\r\n * \r\n * @see ImageMapUtilities\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, boolean, int)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 144,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.  This method allows \r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect \r\n     * information about the chart dimensions/entities.  You will need this \r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 170,col 65)",
        "(line 171,col 9)-(line 171,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, boolean, int)",
      "begin_line": 191,
      "end_line": 206,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.  This method allows \r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect \r\n     * information about the chart dimensions/entities.  You will need this \r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  carries back chart rendering info (\u003ccode\u003enull\u003c/code\u003e \r\n     *              permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 202,col 51)",
        "(line 203,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeScaledChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, int, int)",
      "begin_line": 220,
      "end_line": 263,
      "comment": "\r\n     * Writes a scaled version of a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the unscaled chart width.\r\n     * @param height  the unscaled chart height.\r\n     * @param widthScaleFactor  the horizontal scale factor.\r\n     * @param heightScaleFactor  the vertical scale factor.\r\n     *\r\n     * @throws IOException if there are any I/O problems.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 55)",
        "(line 232,col 9)-(line 232,col 58)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 234,col 38)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 52)",
        "(line 243,col 9)-(line 243,col 54)",
        "(line 245,col 9)-(line 246,col 66)",
        "(line 247,col 9)-(line 247,col 47)",
        "(line 249,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\r\n     * Saves a chart to the specified file in PNG format.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 297,
      "end_line": 311,
      "comment": "\r\n     * Saves a chart to a file in PNG format.  This method allows you to pass \r\n     * in a {@link ChartRenderingInfo} object, to collect information about the \r\n     * chart dimensions/entities.  You will need this info if you want to \r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 80)",
        "(line 305,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, boolean, int)",
      "begin_line": 329,
      "end_line": 349,
      "comment": "\r\n     * Saves a chart to a file in PNG format.  This method allows you to pass \r\n     * in a {@link ChartRenderingInfo} object, to collect information about the \r\n     * chart dimensions/entities.  You will need this info if you want to \r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 80)",
        "(line 341,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 362,
      "end_line": 368,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  Please note that\r\n     * JPEG is a poor format for chart images, use PNG if possible.\r\n     * \r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, float, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 382,
      "end_line": 389,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  Please note that\r\n     * JPEG is a poor format for chart images, use PNG if possible.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 387,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 405,
      "end_line": 415,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format. This method allows \r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect \r\n     * information about the chart dimensions/entities.  You will need this \r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 77)",
        "(line 413,col 9)-(line 413,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, float, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 432,
      "end_line": 442,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  This method allows \r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect \r\n     * information about the chart dimensions/entities.  You will need this \r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the output quality (0.0f to 1.0f).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 77)",
        "(line 440,col 9)-(line 440,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 454,
      "end_line": 460,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, float, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the JPEG quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 495,
      "end_line": 512,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.  This method allows you to pass \r\n     * in a {@link ChartRenderingInfo} object, to collect information about the \r\n     * chart dimensions/entities.  You will need this info if you want to \r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 80)",
        "(line 505,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, float, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 529,
      "end_line": 549,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.  This method allows you to pass \r\n     * in a {@link ChartRenderingInfo} object, to collect information about the \r\n     * chart dimensions/entities.  You will need this info if you want to \r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 541,col 23)",
        "(line 542,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsJPEG(java.io.OutputStream, java.awt.image.BufferedImage)",
      "begin_line": 559,
      "end_line": 565,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in JPEG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsJPEG(java.io.OutputStream, float, java.awt.image.BufferedImage)",
      "begin_line": 576,
      "end_line": 581,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in JPEG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the image quality (0.0f to 1.0f).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsPNG(java.io.OutputStream, java.awt.image.BufferedImage)",
      "begin_line": 591,
      "end_line": 596,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsPNG(java.io.OutputStream, java.awt.image.BufferedImage, boolean, int)",
      "begin_line": 608,
      "end_line": 614,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 613,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.encodeAsPNG(java.awt.image.BufferedImage)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Encodes a {@link BufferedImage} to PNG format.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A byte array in PNG format.\r\n     * \r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.encodeAsPNG(java.awt.image.BufferedImage, boolean, int)",
      "begin_line": 640,
      "end_line": 645,
      "comment": "\r\n     * Encodes a {@link BufferedImage} to PNG format.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @return The byte array in PNG format.\r\n     * \r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 644,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, boolean)",
      "begin_line": 658,
      "end_line": 677,
      "comment": "\r\n     * Writes an image map to an output stream.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param useOverLibForToolTips  whether to use OverLIB for tooltips\r\n     *                               (http://www.bosrup.com/web/overlib/).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 71)",
        "(line 665,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 675,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 694,
      "end_line": 702,
      "comment": "\r\n     * Writes an image map to the specified writer.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted \r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if \r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 701,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 715,
      "end_line": 719,
      "comment": "\r\n     * Creates an HTML image map.  This method maps to \r\n     * {@link ImageMapUtilities#getImageMap(String, ChartRenderingInfo, \r\n     * ToolTipTagFragmentGenerator, URLTagFragmentGenerator)}, using default \r\n     * generators.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The map tag.\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 718,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 737,
      "end_line": 744,
      "comment": "\r\n     * Creates an HTML image map.  This method maps directly to\r\n     * {@link ImageMapUtilities#getImageMap(String, ChartRenderingInfo, \r\n     * ToolTipTagFragmentGenerator, URLTagFragmentGenerator)}.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted \r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if \r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @return The map tag.\r\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 742,col 70)"
      ]
    }
  ]
}