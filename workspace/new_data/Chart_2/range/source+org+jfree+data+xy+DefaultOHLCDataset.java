{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/DefaultOHLCDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultOHLCDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 57,
      "end_line": 339,
      "comment": "\r\n * A simple implementation of the {@link OHLCDataset} interface.  This\r\n * implementation supports only one series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the data items. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.DefaultOHLCDataset(java.lang.Comparable, org.jfree.data.xy.OHLCDataItem[])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\r\n     * Creates a new dataset.\r\n     *\r\n     * @param key  the series key.\r\n     * @param data  the data items.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getSeriesKey(int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the series key.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     *\r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getX(int, int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the x-value for a data item.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getXDate(int, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Returns the x-value for a data item as a date.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value as a date.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getY(int, int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns the y-value.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y value.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getHigh(int, int)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the high value.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The high value.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getHighValue(int, int)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getLow(int, int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the low value.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The low value.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getLowValue(int, int)",
      "begin_line": 175,
      "end_line": 182,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getOpen(int, int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the open value.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The open value.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getOpenValue(int, int)",
      "begin_line": 205,
      "end_line": 212,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)",
        "(line 207,col 9)-(line 207,col 44)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getClose(int, int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the close value.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The close value.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getCloseValue(int, int)",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getVolume(int, int)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\r\n     * Returns the trading volume.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The trading volume.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getVolumeValue(int, int)",
      "begin_line": 265,
      "end_line": 272,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 9)-(line 267,col 48)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getSeriesCount()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the series count.\r\n     *\r\n     * @return 1.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getItemCount(int)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Returns the item count for the specified series.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.sortDataByDate()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Sorts the data into ascending order by date.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.equals(java.lang.Object)",
      "begin_line": 308,
      "end_line": 323,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 59)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.clone()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 70)",
        "(line 334,col 9)-(line 334,col 56)",
        "(line 335,col 9)-(line 335,col 72)",
        "(line 336,col 9)-(line 336,col 21)"
      ]
    }
  ]
}