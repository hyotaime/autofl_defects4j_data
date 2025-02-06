{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/OHLCDataItem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OHLCDataItem",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 210,
      "comment": "\r\n * Represents a single (open-high-low-close) data item in\r\n * an {@link DefaultOHLCDataset}.  This data item is commonly used\r\n * to summarise the trading activity of a financial commodity for\r\n * a fixed period (most often one day).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "date"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The date. "
    },
    {
      "type": "field",
      "varNames": [
        "open"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The open value. "
    },
    {
      "type": "field",
      "varNames": [
        "high"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The high value. "
    },
    {
      "type": "field",
      "varNames": [
        "low"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The low value. "
    },
    {
      "type": "field",
      "varNames": [
        "close"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The close value. "
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The trading volume (number of shares, contracts or whatever). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.OHLCDataItem.OHLCDataItem(java.util.Date, double, double, double, double, double)",
      "begin_line": 86,
      "end_line": 101,
      "comment": "\r\n     * Creates a new item.\r\n     *\r\n     * @param date  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param open  the open value.\r\n     * @param high  the high value.\r\n     * @param low  the low value.\r\n     * @param close  the close value.\r\n     * @param volume  the volume.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 96,col 37)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 35)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getDate()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Returns the date that the data item relates to.\r\n     *\r\n     * @return The date (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getOpen()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the open value.\r\n     *\r\n     * @return The open value.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getHigh()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the high value.\r\n     *\r\n     * @return The high value.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getLow()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the low value.\r\n     *\r\n     * @return The low value.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getClose()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Returns the close value.\r\n     *\r\n     * @return The close value.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.getVolume()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the volume.\r\n     *\r\n     * @return The volume.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.equals(java.lang.Object)",
      "begin_line": 164,
      "end_line": 188,
      "comment": "\r\n     * Checks this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.OHLCDataItem.compareTo(java.lang.Object)",
      "begin_line": 200,
      "end_line": 208,
      "comment": "\r\n     * Compares this object with the specified object for order. Returns a\r\n     * negative integer, zero, or a positive integer as this object is less\r\n     * than, equal to, or greater than the specified object.\r\n     *\r\n     * @param object  the object to compare to.\r\n     *\r\n     * @return A negative integer, zero, or a positive integer as this object\r\n     *         is less than, equal to, or greater than the specified object.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 207,col 9)"
      ]
    }
  ]
}