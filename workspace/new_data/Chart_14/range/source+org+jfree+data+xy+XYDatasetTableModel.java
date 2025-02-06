{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/XYDatasetTableModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDatasetTableModel",
      "is_interface": false,
      "parent_types": [
        "javax.swing.table.AbstractTableModel",
        "javax.swing.table.TableModel",
        "org.jfree.data.general.DatasetChangeListener"
      ],
      "begin_line": 65,
      "end_line": 251,
      "comment": "\r\n * A READ-ONLY wrapper around a {@link TableXYDataset} to convert it to a\r\n * table model for use in a JTable.  The first column of the table shows the\r\n * x-values, the remaining columns show the y-values for each series (series 0\r\n * appears in column 1, series 1 appears in column 2, etc).\r\n * \u003cP\u003e\r\n * TO DO:\r\n * \u003cul\u003e\r\n * \u003cli\u003eimplement proper naming for x axis (getColumnName)\u003c/li\u003e\r\n * \u003cli\u003eimplement setValueAt to remove READ-ONLY constraint (not sure how)\u003c/li\u003e\r\n * \u003c/ul\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "model"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The dataset. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.XYDatasetTableModel()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Default constructor.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.XYDatasetTableModel(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\r\n     * Creates a new table model based on the specified dataset.\r\n     *\r\n     * @param dataset  the dataset.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 15)",
        "(line 85,col 9)-(line 85,col 29)",
        "(line 86,col 9)-(line 86,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.setModel(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\r\n     * Sets the model (dataset).\r\n     *\r\n     * @param dataset  the dataset.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.getRowCount()",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\r\n     * Returns the number of rows.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.getColumnCount()",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\r\n     * Gets the number of columns in the model.\r\n     *\r\n     * @return The number of columns in the model.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.getColumnName(int)",
      "begin_line": 131,
      "end_line": 141,
      "comment": "\r\n     * Returns the column name.\r\n     *\r\n     * @param column  the column index.\r\n     *\r\n     * @return The column name.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.getValueAt(int, int)",
      "begin_line": 152,
      "end_line": 162,
      "comment": "\r\n     * Returns a value of the specified cell.\r\n     * Column 0 is the X axis, Columns 1 and over are the Y axis\r\n     *\r\n     * @param row  the row number.\r\n     * @param column  the column number.\r\n     *\r\n     * @return The value of the specified cell.\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Receives notification that the underlying dataset has changed.\r\n    *\r\n     * @param event  the event\r\n     *\r\n     * @see DatasetChangeListener\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.isCellEditable(int, int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns a flag indicating whether or not the specified cell is editable.\r\n     *\r\n     * @param row  the row number.\r\n     * @param column  the column number.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified cell is editable.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDatasetTableModel.setValueAt(java.lang.Object, int, int)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\r\n     * Updates the {@link XYDataset} if allowed.\r\n     *\r\n     * @param value  the new value.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)"
      ]
    }
  ]
}