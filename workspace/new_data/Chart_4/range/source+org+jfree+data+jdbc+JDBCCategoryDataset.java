{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/jdbc/JDBCCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDBCCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.category.DefaultCategoryDataset"
      ],
      "begin_line": 93,
      "end_line": 318,
      "comment": "\r\n * A {@link CategoryDataset} implementation over a database JDBC result set.\r\n * The dataset is populated via a call to {@link #executeQuery(String)} with\r\n * the string SQL query.  The SQL query must return at least two columns.  The\r\n * first column will be the category name and remaining columns values (each\r\n * column represents a series).  Subsequent calls to\r\n * {@link #executeQuery(String)} will refresh the dataset.\r\n * \u003cp\u003e\r\n * The database connection is read-only and no write back facility exists.\r\n * \u003cp\u003e\r\n * NOTE: Many people have found this class too restrictive in general use.\r\n * For the greatest flexibility, please consider writing your own code to read\r\n * data from a \u003ccode\u003eResultSet\u003c/code\u003e and populate a\r\n * {@link DefaultCategoryDataset} directly.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "connection"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The database connection. "
    },
    {
      "type": "field",
      "varNames": [
        "transpose"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * A flag the controls whether or not the table is transposed.  The default\r\n     * is \u0027true\u0027 because this provides the behaviour described in the\r\n     * documentation.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.JDBCCategoryDataset(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 121,
      "end_line": 129,
      "comment": "\r\n     * Creates a new dataset with a database connection.\r\n     *\r\n     * @param  url  the URL of the database connection.\r\n     * @param  driverName  the database driver class name.\r\n     * @param  user  the database user.\r\n     * @param  passwd  the database user\u0027s password.\r\n     *\r\n     * @throws ClassNotFoundException if the driver cannot be found.\r\n     * @throws SQLException if there is an error obtaining a connection to the\r\n     *                      database.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 128,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.JDBCCategoryDataset(java.sql.Connection)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\r\n     * Create a new dataset with the given database connection.\r\n     *\r\n     * @param connection  the database connection.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.JDBCCategoryDataset(java.sql.Connection, java.lang.String)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\r\n     * Creates a new dataset with the given database connection, and executes\r\n     * the supplied query to populate the dataset.\r\n     *\r\n     * @param connection  the connection.\r\n     * @param query  the query.\r\n     *\r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 25)",
        "(line 155,col 9)-(line 155,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.getTranspose()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns a flag that controls whether or not the table values are\r\n     * transposed when added to the dataset.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.setTranspose(boolean)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Sets a flag that controls whether or not the table values are transposed\r\n     * when added to the dataset.\r\n     *\r\n     * @param transpose  the flag.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.executeQuery(java.lang.String)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Populates the dataset by executing the supplied query against the\r\n     * existing database connection.  If no connection exists then no action\r\n     * is taken.\r\n     * \u003cp\u003e\r\n     * The results from the query are extracted and cached locally, thus\r\n     * applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param query  the query.\r\n     *\r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCCategoryDataset.executeQuery(java.sql.Connection, java.lang.String)",
      "begin_line": 207,
      "end_line": 316,
      "comment": "\r\n     * Populates the dataset by executing the supplied query against the\r\n     * existing database connection.  If no connection exists then no action\r\n     * is taken.\r\n     * \u003cp\u003e\r\n     * The results from the query are extracted and cached locally, thus\r\n     * applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param con  the connection.\r\n     * @param query  the query.\r\n     *\r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 315,col 9)"
      ]
    }
  ]
}