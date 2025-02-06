{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/servlet/DisplayChart.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisplayChart",
      "is_interface": false,
      "parent_types": [
        "javax.servlet.http.HttpServlet"
      ],
      "begin_line": 71,
      "end_line": 154,
      "comment": "\r\n * Servlet used for streaming charts to the client browser from the temporary\r\n * directory.  You need to add this servlet and mapping to your deployment \r\n * descriptor (web.xml) in order to get it to work.  The syntax is as follows:\r\n * \u003cxmp\u003e\r\n * \u003cservlet\u003e\r\n *    \u003cservlet-name\u003eDisplayChart\u003c/servlet-name\u003e\r\n *    \u003cservlet-class\u003eorg.jfree.chart.servlet.DisplayChart\u003c/servlet-class\u003e\r\n * \u003c/servlet\u003e\r\n * \u003cservlet-mapping\u003e\r\n *     \u003cservlet-name\u003eDisplayChart\u003c/servlet-name\u003e\r\n *     \u003curl-pattern\u003e/servlet/DisplayChart\u003c/url-pattern\u003e\r\n * \u003c/servlet-mapping\u003e\r\n * \u003c/xmp\u003e\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.servlet.DisplayChart.DisplayChart()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.DisplayChart.init()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Init method.\r\n     *\r\n     * @throws ServletException never.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.DisplayChart.service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)",
      "begin_line": 98,
      "end_line": 152,
      "comment": "\r\n     * Service method.\r\n     *\r\n     * @param request  the request.\r\n     * @param response  the response.\r\n     *\r\n     * @throws ServletException ??.\r\n     * @throws IOException ??.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 51)",
        "(line 103,col 9)-(line 103,col 59)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 111,col 9)-(line 111,col 70)",
        "(line 114,col 9)-(line 114,col 77)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 15)"
      ]
    }
  ]
}