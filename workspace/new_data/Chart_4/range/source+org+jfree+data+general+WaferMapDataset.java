{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/WaferMapDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WaferMapDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset"
      ],
      "begin_line": 55,
      "end_line": 314,
      "comment": "\r\n * A dataset that can be used with the {@link org.jfree.chart.plot.WaferMapPlot}\r\n * class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * Storage structure for the data values (row key is chipx, column is\r\n     * chipy)\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxChipX"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " wafer x dimension "
    },
    {
      "type": "field",
      "varNames": [
        "maxChipY"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " wafer y dimension "
    },
    {
      "type": "field",
      "varNames": [
        "chipSpace"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " space to draw between chips "
    },
    {
      "type": "field",
      "varNames": [
        "maxValue"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " maximum value in this dataset "
    },
    {
      "type": "field",
      "varNames": [
        "minValue"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " minimum value in this dataset "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHIP_SPACE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " default chip spacing "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.WaferMapDataset.WaferMapDataset(int, int)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Creates a new dataset using the default chipspace.\r\n     *\r\n     * @param maxChipX  the wafer x-dimension.\r\n     * @param maxChipY  the wafer y-dimension.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.WaferMapDataset.WaferMapDataset(int, int, java.lang.Number)",
      "begin_line": 98,
      "end_line": 113,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param maxChipX  the wafer x-dimension.\r\n     * @param maxChipY  the wafer y-dimension.\r\n     * @param chipSpace  the space between chips.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 61)",
        "(line 101,col 9)-(line 101,col 61)",
        "(line 102,col 9)-(line 102,col 47)",
        "(line 104,col 9)-(line 104,col 33)",
        "(line 105,col 9)-(line 105,col 33)",
        "(line 106,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Sets a value in the dataset.\r\n     *\r\n     * @param value  the value.\r\n     * @param chipx  the x-index for the chip.\r\n     * @param chipy  the y-index for the chip.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.addValue(int, int, int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Adds a value to the dataset.\r\n     *\r\n     * @param v  the value.\r\n     * @param x  the x-index.\r\n     * @param y  the y-index.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\r\n     * Sets a value in the dataset and updates min and max value entries.\r\n     *\r\n     * @param value  the value.\r\n     * @param chipx  the x-index.\r\n     * @param chipy  the y-index.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getUniqueValueCount()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the number of unique values.\r\n     *\r\n     * @return The number of unique values.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getUniqueValues()",
      "begin_line": 168,
      "end_line": 180,
      "comment": "\r\n     * Returns the set of unique values.\r\n     *\r\n     * @return The set of unique values.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 35)",
        "(line 171,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getChipValue(int, int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the data value for a chip.\r\n     *\r\n     * @param chipx  the x-index.\r\n     * @param chipy  the y-index.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getChipValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 202,
      "end_line": 212,
      "comment": "\r\n     * Returns the value for a given chip x and y or null.\r\n     *\r\n     * @param chipx  the x-index.\r\n     * @param chipy  the y-index.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 55)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.isMaxValue(java.lang.Number)",
      "begin_line": 221,
      "end_line": 226,
      "comment": "\r\n     * Tests to see if the passed value is larger than the stored maxvalue.\r\n     *\r\n     * @param check  the number to check.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.isMinValue(java.lang.Number)",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\r\n     * Tests to see if the passed value is smaller than the stored minvalue.\r\n     *\r\n     * @param check  the number to check.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getMaxValue()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the maximum value stored in the dataset.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getMinValue()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\r\n     * Returns the minimum value stored in the dataset.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getMaxChipX()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the wafer x-dimension.\r\n     *\r\n     * @return The number of chips in the x-dimension.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.setMaxChipX(int)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Sets wafer x dimension.\r\n     *\r\n     * @param maxChipX  the number of chips in the x-dimension.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getMaxChipY()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the number of chips in the y-dimension.\r\n     *\r\n     * @return The number of chips.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.setMaxChipY(int)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\r\n     * Sets the number of chips in the y-dimension.\r\n     *\r\n     * @param maxChipY  the number of chips.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.getChipSpace()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Returns the space to draw between chips.\r\n     *\r\n     * @return The space.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.WaferMapDataset.setChipSpace(double)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Sets the space to draw between chips.\r\n     *\r\n     * @param space  the space.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 31)"
      ]
    }
  ]
}