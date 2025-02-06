{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/jdbc/JDBCPieDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDBCPieDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.DefaultPieDataset"
      ],
      "begin_line": 79,
      "end_line": 247,
      "comment": "\r\n * A {@link PieDataset} that reads data from a database via JDBC.\r\n * \u003cP\u003e\r\n * A query should be supplied that returns data in two columns, the first \r\n * containing VARCHAR data, and the second containing numerical data.  The \r\n * data is cached in-memory and can be refreshed at any time.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "connection"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The database connection. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.JDBCPieDataset(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\r\n     * Creates a new JDBCPieDataset and establishes a new database connection.\r\n     *\r\n     * @param url  the URL of the database connection.\r\n     * @param driverName  the database driver class name.\r\n     * @param user  the database user.\r\n     * @param password  the database users password.\r\n     * \r\n     * @throws ClassNotFoundException if the driver cannot be found.\r\n     * @throws SQLException if there is a problem obtaining a database \r\n     *                      connection.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)",
        "(line 103,col 9)-(line 103,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.JDBCPieDataset(java.sql.Connection)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\r\n     * Creates a new JDBCPieDataset using a pre-existing database connection.\r\n     * \u003cP\u003e\r\n     * The dataset is initially empty, since no query has been supplied yet.\r\n     *\r\n     * @param con  the database connection.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.JDBCPieDataset(java.sql.Connection, java.lang.String)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\r\n     * Creates a new JDBCPieDataset using a pre-existing database connection.\r\n     * \u003cP\u003e\r\n     * The dataset is initialised with the supplied query.\r\n     *\r\n     * @param con  the database connection.\r\n     * @param query  the database connection.\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 18)",
        "(line 133,col 9)-(line 133,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.executeQuery(java.lang.String)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     *  ExecuteQuery will attempt execute the query passed to it against the\r\n     *  existing database connection.  If no connection exists then no action\r\n     *  is taken.\r\n     *  The results from the query are extracted and cached locally, thus\r\n     *  applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param  query  the query to be executed.\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 148,col 7)-(line 148,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.executeQuery(java.sql.Connection, java.lang.String)",
      "begin_line": 163,
      "end_line": 233,
      "comment": "\r\n     *  ExecuteQuery will attempt execute the query passed to it against the\r\n     *  existing database connection.  If no connection exists then no action\r\n     *  is taken.\r\n     *  The results from the query are extracted and cached locally, thus\r\n     *  applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param  query  the query to be executed\r\n     * @param  con  the connection the query is to be executed against\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 168,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCPieDataset.close()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\r\n     * Close the database connection\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 245,col 9)"
      ]
    }
  ]
}