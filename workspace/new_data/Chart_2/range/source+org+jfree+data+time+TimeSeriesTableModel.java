{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/TimeSeriesTableModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesTableModel",
      "is_interface": false,
      "parent_types": [
        "javax.swing.table.AbstractTableModel",
        "org.jfree.data.event.SeriesChangeListener"
      ],
      "begin_line": 55,
      "end_line": 266,
      "comment": "\r\n * Wrapper around a time series to convert it to a table model for use in\r\n * a \u003ccode\u003eJTable\u003c/code\u003e.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "series"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The series. "
    },
    {
      "type": "field",
      "varNames": [
        "editable"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A flag that controls whether the series is editable. "
    },
    {
      "type": "field",
      "varNames": [
        "newTimePeriod"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The new time period. "
    },
    {
      "type": "field",
      "varNames": [
        "newValue"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The new value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.TimeSeriesTableModel()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.TimeSeriesTableModel(org.jfree.data.time.TimeSeries)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Constructs a table model for a time series.\r\n     *\r\n     * @param series  the time series.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.TimeSeriesTableModel(org.jfree.data.time.TimeSeries, boolean)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\r\n     * Creates a table model based on a time series.\r\n     *\r\n     * @param series  the time series.\r\n     * @param editable  if \u003cocde\u003etrue\u003c/code\u003e, the table is editable.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.getColumnCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the number of columns in the table model.  For this particular\r\n     * model, the column count is fixed at 2.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.getColumnClass(int)",
      "begin_line": 115,
      "end_line": 127,
      "comment": "\r\n     * Returns the column class in the table model.\r\n     *\r\n     * @param column    The column index.\r\n     *\r\n     * @return The column class in the table model.\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.getColumnName(int)",
      "begin_line": 136,
      "end_line": 150,
      "comment": "\r\n     * Returns the name of a column\r\n     *\r\n     * @param column  the column index.\r\n     *\r\n     * @return The name of a column.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.getRowCount()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns the number of rows in the table model.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.getValueAt(int, int)",
      "begin_line": 169,
      "end_line": 198,
      "comment": "\r\n     * Returns the data value for a cell in the table model.\r\n     *\r\n     * @param row  the row number.\r\n     * @param column  the column number.\r\n     *\r\n     * @return The data value for a cell in the table model.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.isCellEditable(int, int)",
      "begin_line": 208,
      "end_line": 220,
      "comment": "\r\n     * Returns a flag indicating whether or not the specified cell is editable.\r\n     *\r\n     * @param row  the row number.\r\n     * @param column  the column number.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified cell is editable.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.setValueAt(java.lang.Object, int, int)",
      "begin_line": 229,
      "end_line": 254,
      "comment": "\r\n     * Updates the time series.\r\n     *\r\n     * @param value  the new value.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeriesTableModel.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Receives notification that the time series has been changed.  Responds\r\n     * by firing a table data change event.\r\n     *\r\n     * @param event  the event.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 31)"
      ]
    }
  ]
}