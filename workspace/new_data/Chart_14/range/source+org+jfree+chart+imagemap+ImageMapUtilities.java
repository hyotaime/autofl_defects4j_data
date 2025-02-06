{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/imagemap/ImageMapUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ImageMapUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 244,
      "comment": "\r\n * Collection of utility methods related to producing image maps.  \r\n * Functionality was originally in {@link org.jfree.chart.ChartUtilities}.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 74,
      "end_line": 83,
      "comment": "\r\n     * Writes an image map to an output stream.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws java.io.IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, boolean)",
      "begin_line": 96,
      "end_line": 115,
      "comment": "\r\n     * Writes an image map to an output stream.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param useOverLibForToolTips  whether to use OverLIB for tooltips\r\n     *                               (http://www.bosrup.com/web/overlib/).\r\n     *\r\n     * @throws java.io.IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 71)",
        "(line 103,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(java.io.PrintWriter, java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 132,
      "end_line": 140,
      "comment": "\r\n     * Writes an image map to an output stream.\r\n     *\r\n     * @param writer  the writer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted \r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if \r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @throws java.io.IOException if there are any I/O errors.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 139,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\r\n     * Creates an image map element that complies with the XHTML 1.0\r\n     * specification.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The map element.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(java.lang.String, org.jfree.chart.ChartRenderingInfo, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator)",
      "begin_line": 172,
      "end_line": 200,
      "comment": "\r\n     * Creates an image map element that complies with the XHTML 1.0\r\n     * specification.\r\n     *\r\n     * @param name  the map name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param info  the chart rendering info (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipTagFragmentGenerator  a generator for the HTML fragment\r\n     *     that will contain the tooltip text (\u003ccode\u003enull\u003c/code\u003e not permitted \r\n     *     if \u003ccode\u003einfo\u003c/code\u003e contains tooltip information).\r\n     * @param urlTagFragmentGenerator  a generator for the HTML fragment that\r\n     *     will contain the URL reference (\u003ccode\u003enull\u003c/code\u003e not permitted if \r\n     *     \u003ccode\u003einfo\u003c/code\u003e contains URLs).\r\n     *\r\n     * @return The map tag.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 45)",
        "(line 177,col 9)-(line 178,col 44)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 180,col 63)",
        "(line 181,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 28)",
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(java.lang.String)",
      "begin_line": 212,
      "end_line": 243,
      "comment": "\r\n     * Returns a string that is equivalent to the input string, but with \r\n     * special characters converted to HTML escape sequences.\r\n     * \r\n     * @param input  the string to escape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A string with characters escaped.\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 33)"
      ]
    }
  ]
}