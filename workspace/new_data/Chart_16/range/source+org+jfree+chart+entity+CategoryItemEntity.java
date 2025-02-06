{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/entity/CategoryItemEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 228,
      "comment": "\r\n * A chart entity that represents one item within a category plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "rowKey"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * The row key.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columnKey"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * The column key.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.CategoryItemEntity(java.awt.Shape, java.lang.String, java.lang.String, org.jfree.data.category.CategoryDataset, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\r\n     * Creates a new entity instance for an item in the specified dataset.\r\n     * \r\n     * @param area  the \u0027hotspot\u0027 area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 31)",
        "(line 107,col 9)-(line 107,col 29)",
        "(line 108,col 9)-(line 108,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.getDataset()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns the dataset this entity refers to.  This can be used to \r\n     * differentiate between items in a chart that displays more than one\r\n     * dataset.\r\n     *\r\n     * @return The dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(CategoryDataset)\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.setDataset(org.jfree.data.category.CategoryDataset)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\r\n     * Sets the dataset this entity refers to.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.getRowKey()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the row key.\r\n     * \r\n     * @return The row key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setRowKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.setRowKey(java.lang.Comparable)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Sets the row key.\r\n     * \r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getRowKey()\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.getColumnKey()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the column key.\r\n     * \r\n     * @return The column key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setColumnKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.setColumnKey(java.lang.Comparable)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Sets the column key.\r\n     * \r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #getColumnKey()\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.toString()",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\r\n     * Returns a string representing this object (useful for debugging \r\n     * purposes).\r\n     *\r\n     * @return A string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 198,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.CategoryItemEntity.equals(java.lang.Object)",
      "begin_line": 208,
      "end_line": 226,
      "comment": "\r\n     * Tests the entity for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 59)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 33)"
      ]
    }
  ]
}