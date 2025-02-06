{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/jdbc/JDBCXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JDBCXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.XYDataset",
        "org.jfree.data.xy.TableXYDataset",
        "org.jfree.data.RangeInfo"
      ],
      "begin_line": 101,
      "end_line": 555,
      "comment": "\r\n * This class provides an {@link XYDataset} implementation over a database \r\n * JDBC result set.  The dataset is populated via a call to executeQuery with \r\n * the string sql query.  The sql query must return at least two columns.  \r\n * The first column will be the x-axis and remaining columns y-axis values.\r\n * executeQuery can be called a number of times.\r\n *\r\n * The database connection is read-only and no write back facility exists.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "connection"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The database connection. "
    },
    {
      "type": "field",
      "varNames": [
        "columnNames"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Column names. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Rows. "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The maximum y value of the returned result set "
    },
    {
      "type": "field",
      "varNames": [
        "minValue"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The minimum y value of the returned result set "
    },
    {
      "type": "field",
      "varNames": [
        "isTimeSeries"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Is this dataset a timeseries ? "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.JDBCXYDataset()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Creates a new JDBCXYDataset (initially empty) with no database \r\n     * connection.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.JDBCXYDataset(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 144,
      "end_line": 153,
      "comment": "\r\n     * Creates a new dataset (initially empty) and establishes a new database \r\n     * connection.\r\n     *\r\n     * @param  url  URL of the database connection.\r\n     * @param  driverName  the database driver class name.\r\n     * @param  user  the database user.\r\n     * @param  password  the database user\u0027s password.\r\n     * \r\n     * @throws ClassNotFoundException if the driver cannot be found.\r\n     * @throws SQLException if there is a problem connecting to the database.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 15)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 152,col 9)-(line 152,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.JDBCXYDataset(java.sql.Connection)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\r\n     * Creates a new dataset (initially empty) using the specified database \r\n     * connection.\r\n     *\r\n     * @param  con  the database connection.\r\n     * \r\n     * @throws SQLException if there is a problem connecting to the database.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 15)",
        "(line 165,col 9)-(line 165,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.JDBCXYDataset(java.sql.Connection, java.lang.String)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\r\n     * Creates a new dataset using the specified database connection, and \r\n     * populates it using data obtained with the supplied query.\r\n     *\r\n     * @param con  the connection.\r\n     * @param query  the SQL query.\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 18)",
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.isTimeSeries()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset represents time series data, \r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.setTimeSeries(boolean)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Sets a flag that indicates whether or not the data represents a time \r\n     * series.\r\n     * \r\n     * @param timeSeries  the new value of the flag.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.executeQuery(java.lang.String)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * ExecuteQuery will attempt execute the query passed to it against the\r\n     * existing database connection.  If no connection exists then no action\r\n     * is taken.\r\n     *\r\n     * The results from the query are extracted and cached locally, thus\r\n     * applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param  query  the query to be executed.\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.executeQuery(java.sql.Connection, java.lang.String)",
      "begin_line": 231,
      "end_line": 414,
      "comment": "\r\n     * ExecuteQuery will attempt execute the query passed to it against the\r\n     * provided database connection.  If connection is null then no action is \r\n     * taken.\r\n     *\r\n     * The results from the query are extracted and cached locally, thus\r\n     * applying an upper limit on how many rows can be retrieved successfully.\r\n     *\r\n     * @param  query  the query to be executed.\r\n     * @param  con  the connection the query is to be executed against.\r\n     * \r\n     * @throws SQLException if there is a problem executing the query.\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getX(int, int)",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\r\n     * Returns the x-value for the specified series and item.  The\r\n     * implementation is responsible for ensuring that the x-values are\r\n     * presented in ascending order.\r\n     *\r\n     * @param  seriesIndex  the series (zero-based index).\r\n     * @param  itemIndex  the item (zero-based index).\r\n     *\r\n     * @return The x-value\r\n     *\r\n     * @see XYDataset\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 61)",
        "(line 430,col 9)-(line 430,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getY(int, int)",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param  seriesIndex  the series (zero-based index).\r\n     * @param  itemIndex  the item (zero-based index).\r\n     *\r\n     * @return The yValue value\r\n     *\r\n     * @see XYDataset\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 61)",
        "(line 445,col 9)-(line 445,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getItemCount(int)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param  seriesIndex  the series (zero-based index).\r\n     *\r\n     * @return The itemCount value\r\n     *\r\n     * @see XYDataset\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getItemCount()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n     * Returns the number of items in all series.  This method is defined by \r\n     * the {@link TableXYDataset} interface.\r\n     * \r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getSeriesCount()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The seriesCount value\r\n     *\r\n     * @see XYDataset\r\n     * @see Dataset\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getSeriesKey(int)",
      "begin_line": 493,
      "end_line": 503,
      "comment": "\r\n     * Returns the key for the specified series.\r\n     *\r\n     * @param seriesIndex  the series (zero-based index).\r\n     *\r\n     * @return The seriesName value\r\n     *\r\n     * @see XYDataset\r\n     * @see Dataset\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 501,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.close()",
      "begin_line": 508,
      "end_line": 517,
      "comment": "\r\n     * Close the database connection\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getRangeLowerBound(boolean)",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getRangeUpperBound(boolean)",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.jdbc.JDBCXYDataset.getRangeBounds(boolean)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 55)"
      ]
    }
  ]
}