{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/entity/PieSectionEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieSectionEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 191,
      "comment": "\r\n * A chart entity that represents one section within a pie plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The pie index. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionIndex"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The section index. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionKey"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The section key. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.PieSectionEntity.PieSectionEntity(java.awt.Shape, org.jfree.data.general.PieDataset, int, int, java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 93,
      "end_line": 105,
      "comment": "\r\n     * Creates a new pie section entity.\r\n     *\r\n     * @param area  the area.\r\n     * @param dataset  the pie dataset.\r\n     * @param pieIndex  the pie index (zero-based).\r\n     * @param sectionIndex  the section index (zero-based).\r\n     * @param sectionKey  the section key.\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text for HTML image maps.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 42)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getDataset()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the dataset this entity refers to.\r\n     *\r\n     * @return The dataset.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Sets the dataset this entity refers to.\r\n     *\r\n     * @param dataset  the dataset.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getPieIndex()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the pie index.  For a regular pie chart, the section index is 0. \r\n     * For a pie chart containing multiple pie plots, the pie index is the row \r\n     * or column index from which the pie data is extracted.\r\n     *\r\n     * @return The pie index.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setPieIndex(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Sets the pie index.\r\n     *\r\n     * @param index  the new index value.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getSectionIndex()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the section index.\r\n     *\r\n     * @return The section index.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setSectionIndex(int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Sets the section index.\r\n     *\r\n     * @param index  the section index.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getSectionKey()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the section key.\r\n     *\r\n     * @return The section key.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setSectionKey(java.lang.Comparable)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Sets the section key.\r\n     *\r\n     * @param key  the section key.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.toString()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * Returns a string representing the entity.\r\n     *\r\n     * @return A string representing the entity.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 188,col 65)"
      ]
    }
  ]
}