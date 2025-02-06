{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/BlockParams.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockParams",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.EntityBlockParams"
      ],
      "begin_line": 47,
      "end_line": 137,
      "comment": "\r\n * A standard parameter object that can be passed to the draw() method defined\r\n * by the {@link Block} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "generateEntities"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " \r\n     * A flag that controls whether or not the block should generate and \r\n     * return chart entities for the items it draws.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "translateX"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " \r\n     * The x-translation (used to enable chart entities to use global \r\n     * coordinates rather than coordinates that are local to the container\r\n     * they are within).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "translateY"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \r\n     * The y-translation (used to enable chart entities to use global \r\n     * coordinates rather than coordinates that are local to the container\r\n     * they are within).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockParams.BlockParams()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 30)",
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.getGenerateEntities()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the flag that controls whether or not chart entities are \r\n     * generated.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.setGenerateEntities(boolean)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Sets the flag that controls whether or not chart entities are generated.\r\n     * \r\n     * @param generate  the flag.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.getTranslateX()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the translation required to convert local x-coordinates back to\r\n     * the coordinate space of the container.\r\n     * \r\n     * @return The x-translation amount.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.setTranslateX(double)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Sets the translation required to convert local x-coordinates into the\r\n     * coordinate space of the container.\r\n     * \r\n     * @param x  the x-translation amount.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.getTranslateY()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the translation required to convert local y-coordinates back to\r\n     * the coordinate space of the container.\r\n     * \r\n     * @return The y-translation amount.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockParams.setTranslateY(double)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Sets the translation required to convert local y-coordinates into the\r\n     * coordinate space of the container.\r\n     * \r\n     * @param y  the y-translation amount.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 28)"
      ]
    }
  ]
}