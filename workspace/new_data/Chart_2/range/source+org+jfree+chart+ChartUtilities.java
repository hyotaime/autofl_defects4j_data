{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/ChartUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 108,
      "end_line": 763,
      "comment": "\r\n * A collection of utility methods for JFreeChart.  Includes methods for\r\n * converting charts to image formats (PNG and JPEG) plus creating simple HTML\r\n * image maps.\r\n *\r\n * @see ImageMapUtilities\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.applyCurrentTheme(org.jfree.chart.JFreeChart)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Applies the current theme to the specified chart.  This method is\r\n     * provided for convenience, the theme itself is stored in the\r\n     * {@link ChartFactory} class.\r\n     *\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 133,
      "end_line": 139,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, boolean, int)",
      "begin_line": 153,
      "end_line": 161,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 177,
      "end_line": 187,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.  This method allows\r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect\r\n     * information about the chart dimensions/entities.  You will need this\r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 185,col 65)",
        "(line 186,col 9)-(line 186,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, boolean, int)",
      "begin_line": 206,
      "end_line": 221,
      "comment": "\r\n     * Writes a chart to an output stream in PNG format.  This method allows\r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect\r\n     * information about the chart dimensions/entities.  You will need this\r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  carries back chart rendering info (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 219,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeScaledChartAsPNG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, int, int)",
      "begin_line": 235,
      "end_line": 278,
      "comment": "\r\n     * Writes a scaled version of a chart to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the unscaled chart width.\r\n     * @param height  the unscaled chart height.\r\n     * @param widthScaleFactor  the horizontal scale factor.\r\n     * @param heightScaleFactor  the vertical scale factor.\r\n     *\r\n     * @throws IOException if there are any I/O problems.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 55)",
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 38)",
        "(line 250,col 9)-(line 250,col 30)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 52)",
        "(line 258,col 9)-(line 258,col 54)",
        "(line 260,col 9)-(line 261,col 66)",
        "(line 262,col 9)-(line 262,col 47)",
        "(line 264,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 290,
      "end_line": 296,
      "comment": "\r\n     * Saves a chart to the specified file in PNG format.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 312,
      "end_line": 326,
      "comment": "\r\n     * Saves a chart to a file in PNG format.  This method allows you to pass\r\n     * in a {@link ChartRenderingInfo} object, to collect information about the\r\n     * chart dimensions/entities.  You will need this info if you want to\r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 80)",
        "(line 320,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsPNG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, boolean, int)",
      "begin_line": 344,
      "end_line": 364,
      "comment": "\r\n     * Saves a chart to a file in PNG format.  This method allows you to pass\r\n     * in a {@link ChartRenderingInfo} object, to collect information about the\r\n     * chart dimensions/entities.  You will need this info if you want to\r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 80)",
        "(line 356,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  Please note that\r\n     * JPEG is a poor format for chart images, use PNG if possible.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, float, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 397,
      "end_line": 404,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  Please note that\r\n     * JPEG is a poor format for chart images, use PNG if possible.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 420,
      "end_line": 431,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format. This method allows\r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect\r\n     * information about the chart dimensions/entities.  You will need this\r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 428,col 50)",
        "(line 429,col 9)-(line 429,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeChartAsJPEG(java.io.OutputStream, float, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 448,
      "end_line": 459,
      "comment": "\r\n     * Writes a chart to an output stream in JPEG format.  This method allows\r\n     * you to pass in a {@link ChartRenderingInfo} object, to collect\r\n     * information about the chart dimensions/entities.  You will need this\r\n     * info if you want to create an HTML image map.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the output quality (0.0f to 1.0f).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 456,col 50)",
        "(line 457,col 9)-(line 457,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 471,
      "end_line": 477,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, float, org.jfree.chart.JFreeChart, int, int)",
      "begin_line": 490,
      "end_line": 496,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.\r\n     *\r\n     * @param file  the file (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the JPEG quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 512,
      "end_line": 529,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.  This method allows you to pass\r\n     * in a {@link ChartRenderingInfo} object, to collect information about the\r\n     * chart dimensions/entities.  You will need this info if you want to\r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 80)",
        "(line 522,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.saveChartAsJPEG(java.io.File, float, org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 546,
      "end_line": 566,
      "comment": "\r\n     * Saves a chart to a file in JPEG format.  This method allows you to pass\r\n     * in a {@link ChartRenderingInfo} object, to collect information about the\r\n     * chart dimensions/entities.  You will need this info if you want to\r\n     * create an HTML image map.\r\n     *\r\n     * @param file  the file name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the quality setting.\r\n     * @param chart  the chart (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the image width.\r\n     * @param height  the image height.\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 558,col 23)",
        "(line 559,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsJPEG(java.io.OutputStream, java.awt.image.BufferedImage)",
      "begin_line": 576,
      "end_line": 582,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in JPEG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsJPEG(java.io.OutputStream, float, java.awt.image.BufferedImage)",
      "begin_line": 593,
      "end_line": 598,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in JPEG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param quality  the image quality (0.0f to 1.0f).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsPNG(java.io.OutputStream, java.awt.image.BufferedImage)",
      "begin_line": 608,
      "end_line": 613,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeBufferedImageAsPNG(java.io.OutputStream, java.awt.image.BufferedImage, boolean, int)",
      "begin_line": 625,
      "end_line": 631,
      "comment": "\r\n     * Writes a {@link BufferedImage} to an output stream in PNG format.\r\n     *\r\n     * @param out  the output stream (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the compression level (0-9).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 630,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.encodeAsPNG(java.awt.image.BufferedImage)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Encodes a {@link BufferedImage} to PNG format.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A byte array in PNG format.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.encodeAsPNG(java.awt.image.BufferedImage, boolean, int)",
      "begin_line": 657,
      "end_line": 662,
      "comment": "\r\n     * Encodes a {@link BufferedImage} to PNG format.\r\n     *\r\n     * @param image  the image (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param encodeAlpha  encode alpha?\r\n     * @param compression  the PNG compression level (0-9).\r\n     *\r\n     * @return The byte array in PNG format.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 661,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, boolean)",
      "begin_line": 675,
      "end_line": 694,
      "comment": "\r\n     * Writes an image map to an output stream.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param useOverLibForToolTips  whether to use OverLIB for tooltips\r\n     *                               (http://www.bosrup.com/web/overlib/).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 71)",
        "(line 682,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 692,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 711,
      "end_line": 719,
      "comment": "\r\n     * Writes an image map to the specified writer.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted\r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if\r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @throws IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 718,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 732,
      "end_line": 736,
      "comment": "\r\n     * Creates an HTML image map.  This method maps to\r\n     * {@link ImageMapUtilities#getImageMap(String, ChartRenderingInfo,\r\n     * ToolTipTagFragmentGenerator, URLTagFragmentGenerator)}, using default\r\n     * generators.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The map tag.\r\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.ChartUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 754,
      "end_line": 761,
      "comment": "\r\n     * Creates an HTML image map.  This method maps directly to\r\n     * {@link ImageMapUtilities#getImageMap(String, ChartRenderingInfo,\r\n     * ToolTipTagFragmentGenerator, URLTagFragmentGenerator)}.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted\r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if\r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @return The map tag.\r\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 759,col 70)"
      ]
    }
  ]
}