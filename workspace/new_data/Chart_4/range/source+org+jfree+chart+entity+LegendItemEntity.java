{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/entity/LegendItemEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendItemEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 184,
      "comment": "\r\n * An entity that represents an item within a legend.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * The dataset.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\r\n     * The series key.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.LegendItemEntity.LegendItemEntity(java.awt.Shape)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Creates a legend item entity.\r\n     *\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.getDataset()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns a reference to the dataset that this legend item is derived\r\n     * from.\r\n     *\r\n     * @return The dataset.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setDataset(Dataset)\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.setDataset(org.jfree.data.general.Dataset)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Sets a reference to the dataset that this legend item is derived from.\r\n     *\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.getSeriesKey()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns the series key that identifies the legend item.\r\n     *\r\n     * @return The series key.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setSeriesKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.setSeriesKey(java.lang.Comparable)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Sets the key for the series.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #getSeriesKey()\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.equals(java.lang.Object)",
      "begin_line": 144,
      "end_line": 159,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 55)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.clone()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns a clone of the entity.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         object.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.LegendItemEntity.toString()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\r\n     * Returns a string representing this object (useful for debugging\r\n     * purposes).\r\n     *\r\n     * @return A string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 181,col 46)"
      ]
    }
  ]
}