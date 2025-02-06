{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/io/CSV.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSV",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 201,
      "comment": "\r\n * A utility class for reading {@link CategoryDataset} data from a CSV file.\r\n * This initial version is very basic, and won\u0027t handle errors in the data\r\n * file very gracefully.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "fieldDelimiter"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The field delimiter. "
    },
    {
      "type": "field",
      "varNames": [
        "textDelimiter"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The text delimiter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.io.CSV.CSV()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Creates a new CSV reader where the field delimiter is a comma, and the\r\n     * text delimiter is a double-quote.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.io.CSV.CSV(char, char)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\r\n     * Creates a new reader with the specified field and text delimiters.\r\n     *\r\n     * @param fieldDelimiter  the field delimiter (usually a comma, semi-colon,\r\n     *                        colon, tab or space).\r\n     * @param textDelimiter  the text delimiter (usually a single or double\r\n     *                       quote).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)",
        "(line 82,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.io.CSV.readCategoryDataset(java.io.Reader)",
      "begin_line": 94,
      "end_line": 113,
      "comment": "\r\n     * Reads a {@link CategoryDataset} from a CSV file or input source.\r\n     *\r\n     * @param in  the input source.\r\n     *\r\n     * @return A category dataset.\r\n     *\r\n     * @throws IOException if there is an I/O problem.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 26)",
        "(line 100,col 9)-(line 100,col 40)",
        "(line 101,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.io.CSV.extractColumnKeys(java.lang.String)",
      "begin_line": 122,
      "end_line": 140,
      "comment": "\r\n     * Extracts the column keys from a string.\r\n     *\r\n     * @param line  a line from the input file.\r\n     *\r\n     * @return A list of column keys.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 46)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 22)",
        "(line 126,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 46)",
        "(line 139,col 9)-(line 139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.io.CSV.extractRowKeyAndData(java.lang.String, org.jfree.data.category.DefaultCategoryDataset, java.util.List)",
      "begin_line": 149,
      "end_line": 180,
      "comment": "\r\n     * Extracts the row key and data for a single line from the input source.\r\n     *\r\n     * @param line  the line from the input source.\r\n     * @param dataset  the dataset to be populated.\r\n     * @param columnKeys  the column keys.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 33)",
        "(line 153,col 9)-(line 153,col 27)",
        "(line 154,col 9)-(line 154,col 22)",
        "(line 155,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 10)",
        "(line 177,col 9)-(line 179,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.io.CSV.removeStringDelimiters(java.lang.String)",
      "begin_line": 190,
      "end_line": 199,
      "comment": "\r\n     * Removes the string delimiters from a key (as well as any white space\r\n     * outside the delimiters).\r\n     *\r\n     * @param key  the key (including delimiters).\r\n     *\r\n     * @return The key without delimiters.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 17)"
      ]
    }
  ]
}