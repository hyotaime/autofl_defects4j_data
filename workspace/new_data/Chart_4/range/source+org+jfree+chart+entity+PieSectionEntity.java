{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/entity/PieSectionEntity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieSectionEntity",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.entity.ChartEntity",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 251,
      "comment": "\r\n * A chart entity that represents one section within a pie plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "pieIndex"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The pie index. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionIndex"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The section index. "
    },
    {
      "type": "field",
      "varNames": [
        "sectionKey"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The section key. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.entity.PieSectionEntity.PieSectionEntity(java.awt.Shape, org.jfree.data.general.PieDataset, int, int, java.lang.Comparable, java.lang.String, java.lang.String)",
      "begin_line": 95,
      "end_line": 107,
      "comment": "\r\n     * Creates a new pie section entity.\r\n     *\r\n     * @param area  the area.\r\n     * @param dataset  the pie dataset.\r\n     * @param pieIndex  the pie index (zero-based).\r\n     * @param sectionIndex  the section index (zero-based).\r\n     * @param sectionKey  the section key.\r\n     * @param toolTipText  the tool tip text.\r\n     * @param urlText  the URL text for HTML image maps.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 31)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 105,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getDataset()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the dataset this entity refers to.\r\n     *\r\n     * @return The dataset.\r\n     *\r\n     * @see #setDataset(PieDataset)\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setDataset(org.jfree.data.general.PieDataset)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Sets the dataset this entity refers to.\r\n     *\r\n     * @param dataset  the dataset.\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getPieIndex()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the pie index.  For a regular pie chart, the section index is 0.\r\n     * For a pie chart containing multiple pie plots, the pie index is the row\r\n     * or column index from which the pie data is extracted.\r\n     *\r\n     * @return The pie index.\r\n     *\r\n     * @see #setPieIndex(int)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setPieIndex(int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Sets the pie index.\r\n     *\r\n     * @param index  the new index value.\r\n     *\r\n     * @see #getPieIndex()\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getSectionIndex()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the section index.\r\n     *\r\n     * @return The section index.\r\n     *\r\n     * @see #setSectionIndex(int)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setSectionIndex(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Sets the section index.\r\n     *\r\n     * @param index  the section index.\r\n     *\r\n     * @see #getSectionIndex()\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.getSectionKey()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the section key.\r\n     *\r\n     * @return The section key.\r\n     *\r\n     * @see #setSectionKey(Comparable)\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.setSectionKey(java.lang.Comparable)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Sets the section key.\r\n     *\r\n     * @param key  the section key.\r\n     *\r\n     * @see #getSectionKey()\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 227,
      "comment": "\r\n     * Tests this entity for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 55)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.hashCode()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 236,col 63)",
        "(line 237,col 9)-(line 237,col 67)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.entity.PieSectionEntity.toString()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\r\n     * Returns a string representing the entity.\r\n     *\r\n     * @return A string representing the entity.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 248,col 65)"
      ]
    }
  ]
}