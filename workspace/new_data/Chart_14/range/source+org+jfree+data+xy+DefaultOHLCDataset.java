{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/DefaultOHLCDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultOHLCDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset"
      ],
      "begin_line": 54,
      "end_line": 322,
      "comment": "\r\n * A simple implementation of the {@link OHLCDataset} interface.  This \r\n * implementation supports only one series.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Storage for the data items. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.DefaultOHLCDataset(java.lang.Comparable, org.jfree.data.xy.OHLCDataItem[])",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\r\n     * Creates a new dataset.\r\n     * \r\n     * @param key  the series key.\r\n     * @param data  the data items.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getSeriesKey(int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the series key. \r\n     * \r\n     * @param series  the series index (ignored).\r\n     * \r\n     * @return The series key.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getX(int, int)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the x-value for a data item.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getXDate(int, int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the x-value for a data item as a date.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The x-value as a date.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getY(int, int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the y-value.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The y value.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getHigh(int, int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the high value.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The high value.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getHighValue(int, int)",
      "begin_line": 142,
      "end_line": 149,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getLow(int, int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the low value.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The low value.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getLowValue(int, int)",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 42)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getOpen(int, int)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the open value.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The open value.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getOpenValue(int, int)",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 35)",
        "(line 204,col 9)-(line 204,col 44)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getClose(int, int)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns the close value.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The close value.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getCloseValue(int, int)",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getVolume(int, int)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Returns the trading volume.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The trading volume.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getVolumeValue(int, int)",
      "begin_line": 262,
      "end_line": 269,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The volume-value.\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 35)",
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getSeriesCount()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the series count.\r\n     * \r\n     * @return 1.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.getItemCount(int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\r\n     * Returns the item count for the specified series.\r\n     * \r\n     * @param series  the series index (ignored).\r\n     * \r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.sortDataByDate()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Sorts the data into ascending order by date.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultOHLCDataset.equals(java.lang.Object)",
      "begin_line": 305,
      "end_line": 320,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    }
  ]
}