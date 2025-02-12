{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/servlet/ServletUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServletUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 440,
      "comment": "\r\n * Utility class used for servlet related JFreeChart operations.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "tempFilePrefix"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The filename prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "tempOneTimeFilePrefix"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " A prefix for \"one time\" charts. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.getTempFilePrefix()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the prefix for the temporary file names generated by this class.\r\n     *\r\n     * @return The prefix (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.setTempFilePrefix(java.lang.String)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\r\n     * Sets the prefix for the temporary file names generated by this class.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.getTempOneTimeFilePrefix()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the prefix for \"one time\" temporary file names generated by\r\n     * this class.\r\n     *\r\n     * @return The prefix.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.setTempOneTimeFilePrefix(java.lang.String)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\r\n     * Sets the prefix for the \"one time\" temporary file names generated by\r\n     * this class.\r\n     *\r\n     * @param prefix  the prefix (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(org.jfree.chart.JFreeChart, int, int, javax.servlet.http.HttpSession)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\r\n     * Saves the chart as a PNG format file in the temporary directory.\r\n     *\r\n     * @param chart  the JFreeChart to be saved.\r\n     * @param width  the width of the chart.\r\n     * @param height  the height of the chart.\r\n     * @param session  the HttpSession of the client (if \u003ccode\u003enull\u003c/code\u003e, the\r\n     *                 temporary file is marked as \"one-time\" and deleted by\r\n     *                 the {@link DisplayChart} servlet right after it is\r\n     *                 streamed to the client).\r\n     *\r\n     * @return The filename of the chart saved in the temporary directory.\r\n     *\r\n     * @throws IOException if there is a problem saving the file.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 151,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.saveChartAsPNG(org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, javax.servlet.http.HttpSession)",
      "begin_line": 174,
      "end_line": 193,
      "comment": "\r\n     * Saves the chart as a PNG format file in the temporary directory and\r\n     * populates the {@link ChartRenderingInfo} object which can be used to\r\n     * generate an HTML image map.\r\n     *\r\n     * @param chart  the chart to be saved (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the width of the chart.\r\n     * @param height  the height of the chart.\r\n     * @param info  the ChartRenderingInfo object to be populated\r\n     *              (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param session  the HttpSession of the client (if \u003ccode\u003enull\u003c/code\u003e, the\r\n     *                 temporary file is marked as \"one-time\" and deleted by\r\n     *                 the {@link DisplayChart} servlet right after it is\r\n     *                 streamed to the client).\r\n     *\r\n     * @return The filename of the chart saved in the temporary directory.\r\n     *\r\n     * @throws IOException if there is a problem saving the file.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 186,col 64)",
        "(line 187,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.saveChartAsJPEG(org.jfree.chart.JFreeChart, int, int, javax.servlet.http.HttpSession)",
      "begin_line": 215,
      "end_line": 222,
      "comment": "\r\n     * Saves the chart as a JPEG format file in the temporary directory.\r\n     * \u003cp\u003e\r\n     * SPECIAL NOTE: Please avoid using JPEG as an image format for charts,\r\n     * it is a \"lossy\" format that introduces visible distortions in the\r\n     * resulting image - use PNG instead.  In addition, note that JPEG output\r\n     * is supported by JFreeChart only for JRE 1.4.2 or later.\r\n     *\r\n     * @param chart  the JFreeChart to be saved.\r\n     * @param width  the width of the chart.\r\n     * @param height  the height of the chart.\r\n     * @param session  the HttpSession of the client (if \u003ccode\u003enull\u003c/code\u003e, the\r\n     *                 temporary file is marked as \"one-time\" and deleted by\r\n     *                 the {@link DisplayChart} servlet right after it is\r\n     *                 streamed to the client).\r\n     *\r\n     * @return The filename of the chart saved in the temporary directory.\r\n     *\r\n     * @throws IOException if there is a problem saving the file.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 220,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.saveChartAsJPEG(org.jfree.chart.JFreeChart, int, int, org.jfree.chart.ChartRenderingInfo, javax.servlet.http.HttpSession)",
      "begin_line": 247,
      "end_line": 268,
      "comment": "\r\n     * Saves the chart as a JPEG format file in the temporary directory and\r\n     * populates the \u003ccode\u003eChartRenderingInfo\u003c/code\u003e object which can be used\r\n     * to generate an HTML image map.\r\n     * \u003cp\u003e\r\n     * SPECIAL NOTE: Please avoid using JPEG as an image format for charts,\r\n     * it is a \"lossy\" format that introduces visible distortions in the\r\n     * resulting image - use PNG instead.  In addition, note that JPEG output\r\n     * is supported by JFreeChart only for JRE 1.4.2 or later.\r\n     *\r\n     * @param chart  the chart to be saved (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the width of the chart\r\n     * @param height  the height of the chart\r\n     * @param info  the ChartRenderingInfo object to be populated\r\n     * @param session  the HttpSession of the client (if \u003ccode\u003enull\u003c/code\u003e, the\r\n     *                 temporary file is marked as \"one-time\" and deleted by\r\n     *                 the {@link DisplayChart} servlet right after it is\r\n     *                 streamed to the client).\r\n     *\r\n     * @return The filename of the chart saved in the temporary directory\r\n     *\r\n     * @throws IOException if there is a problem saving the file.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 41)",
        "(line 256,col 9)-(line 256,col 56)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 261,col 64)",
        "(line 262,col 9)-(line 262,col 77)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.createTempDir()",
      "begin_line": 279,
      "end_line": 291,
      "comment": "\r\n     * Creates the temporary directory if it does not exist.  Throws a\r\n     * \u003ccode\u003eRuntimeException\u003c/code\u003e if the temporary directory is\r\n     * \u003ccode\u003enull\u003c/code\u003e.  Uses the system property \u003ccode\u003ejava.io.tmpdir\u003c/code\u003e\r\n     * as the temporary directory.  This sounds like a strange thing to do but\r\n     * my temporary directory was not created on my default Tomcat 4.0.3\r\n     * installation.  Could save some questions on the forum if it is created\r\n     * when not present.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 66)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 287,col 9)-(line 287,col 45)",
        "(line 288,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.registerChartForDeletion(java.io.File, javax.servlet.http.HttpSession)",
      "begin_line": 301,
      "end_line": 317,
      "comment": "\r\n     * Adds a {@link ChartDeleter} object to the session object with the name\r\n     * \u003ccode\u003eJFreeChart_Deleter\u003c/code\u003e if there is not already one bound to the\r\n     * session and adds the filename to the list of charts to be deleted.\r\n     *\r\n     * @param tempFile  the file to be deleted.\r\n     * @param session  the HTTP session of the client.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.sendTempFile(java.lang.String, javax.servlet.http.HttpServletResponse)",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\r\n     * Binary streams the specified file in the temporary directory to the\r\n     * HTTP response in 1KB chunks.\r\n     *\r\n     * @param filename  the name of the file in the temporary directory.\r\n     * @param response  the HTTP response object.\r\n     *\r\n     * @throws IOException  if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 77)",
        "(line 332,col 9)-(line 332,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.sendTempFile(java.io.File, javax.servlet.http.HttpServletResponse)",
      "begin_line": 343,
      "end_line": 359,
      "comment": "\r\n     * Binary streams the specified file to the HTTP response in 1KB chunks.\r\n     *\r\n     * @param file  the file to be streamed.\r\n     * @param response  the HTTP response object.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 31)",
        "(line 347,col 9)-(line 347,col 41)",
        "(line 348,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.sendTempFile(java.io.File, javax.servlet.http.HttpServletResponse, java.lang.String)",
      "begin_line": 370,
      "end_line": 409,
      "comment": "\r\n     * Binary streams the specified file to the HTTP response in 1KB chunks.\r\n     *\r\n     * @param file  the file to be streamed.\r\n     * @param response  the HTTP response object.\r\n     * @param mimeType  the mime type of the file, null allowed.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ServletUtilities.searchReplace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 421,
      "end_line": 438,
      "comment": "\r\n     * Perform a search/replace operation on a String\r\n     * There are String methods to do this since (JDK 1.4)\r\n     *\r\n     * @param inputString  the String to have the search/replace operation.\r\n     * @param searchString  the search String.\r\n     * @param replaceString  the replace String.\r\n     *\r\n     * @return The String with the replacements made.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 50)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 430,col 22)",
        "(line 431,col 9)-(line 431,col 57)",
        "(line 432,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 17)"
      ]
    }
  ]
}