{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/entity/XYItemEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYItemEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity"
      ],
      "begin_line": 61,
      "end_line": 183,
      "comment": "\r\n * A chart entity that represents one item within an\r\n * {@link org.jfree.chart.plot.XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "series"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The series. "
    },
    {
      "type": "field",
      "varNames": [
        "item"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The item. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.XYItemEntity.XYItemEntity(java.awt.Shape, org.jfree.data.xy.XYDataset, int, int, java.lang.String, java.lang.String)",
      "begin_line": 85,
      "end_line": 92,
      "comment": "\r\n     * Creates a new entity.\r\n     *\r\n     * @param area  the area.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text for HTML image maps.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 42)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 29)",
        "(line 91,col 9)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.getDataset()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Returns the dataset this entity refers to.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Sets the dataset this entity refers to.\r\n     *\r\n     * @param dataset  the dataset.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.getSeriesIndex()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the series index.\r\n     *\r\n     * @return The series index.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.setSeriesIndex(int)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Sets the series index.\r\n     *\r\n     * @param series the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.getItem()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the item index.\r\n     *\r\n     * @return The item index.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.setItem(int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\r\n     * Sets the item index.\r\n     *\r\n     * @param item the item index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.equals(java.lang.Object)",
      "begin_line": 155,
      "end_line": 170,
      "comment": "\r\n     * Tests the entity for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.XYItemEntity.toString()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\r\n     * Returns a string representation of this instance, useful for debugging\r\n     * purposes.\r\n     *\r\n     * @return A string.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 180,col 56)"
      ]
    }
  ]
}