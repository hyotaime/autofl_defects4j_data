{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/servlet/ChartDeleter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChartDeleter",
      "is_interface": false,
      "parent_types": [
        "javax.servlet.http.HttpSessionBindingListener",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 123,
      "comment": "\r\n * Used for deleting charts from the temporary directory when the users session\r\n * expires.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "chartNames"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The chart names. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.servlet.ChartDeleter.ChartDeleter()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\r\n     * Blank constructor.\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ChartDeleter.addChart(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Add a chart to be deleted when the session expires\r\n     *\r\n     * @param filename  the name of the chart in the temporary directory to be \r\n     *                  deleted.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ChartDeleter.isChartAvailable(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Checks to see if a chart is in the list of charts to be deleted\r\n     *\r\n     * @param filename  the name of the chart in the temporary directory.\r\n     *\r\n     * @return A boolean value indicating whether the chart is present in the \r\n     *         list.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ChartDeleter.valueBound(javax.servlet.http.HttpSessionBindingEvent)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Binding this object to the session has no additional effects.\r\n     *\r\n     * @param event  the session bind event.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.servlet.ChartDeleter.valueUnbound(javax.servlet.http.HttpSessionBindingEvent)",
      "begin_line": 107,
      "end_line": 121,
      "comment": "\r\n     * When this object is unbound from the session (including upon session\r\n     * expiry) the files that have been added to the ArrayList are iterated\r\n     * and deleted.\r\n     *\r\n     * @param event  the session unbind event.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 55)",
        "(line 110,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 15)"
      ]
    }
  ]
}