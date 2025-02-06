{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/AbstractCategoryItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCategoryItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 316,
      "comment": "\r\n * A base class that can be used to create a label or tooltip generator that \r\n * can be assigned to a \r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFormat"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " \r\n     * The label format string used by a \u003ccode\u003eMessageFormat\u003c/code\u003e object to \r\n     * combine the standard items:  {0} \u003d series name, {1} \u003d category, \r\n     * {2} \u003d value, {3} \u003d value as a percentage of the column total.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nullValueString"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The string used to represent a null value. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormat"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " \r\n     * A number formatter used to preformat the value before it is passed to \r\n     * the MessageFormat object. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormat"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * A date formatter used to preformat the value before it is passed to the\r\n     * MessageFormat object.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "percentFormat"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\r\n     * A number formatter used to preformat the percentage value before it is \r\n     * passed to the MessageFormat object.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\r\n     * Creates a label generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 119,
      "end_line": 136,
      "comment": "\r\n     * Creates a label generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percentFormatter  the percent formatter (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *     \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 39)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.AbstractCategoryItemLabelGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 145,
      "end_line": 158,
      "comment": "\r\n     * Creates a label generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 157,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateRowLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * \r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateColumnLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The label.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getLabelFormat()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the label format string.\r\n     * \r\n     * @return The label format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getNumberFormat()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the number formatter.\r\n     *\r\n     * @return The number formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.getDateFormat()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the date formatter.\r\n     *\r\n     * @return The date formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.generateLabelString(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 220,
      "end_line": 230,
      "comment": "\r\n     * Generates a for the specified item.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 226,col 63)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 242,
      "end_line": 266,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 54)",
        "(line 246,col 9)-(line 246,col 60)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 275,
      "end_line": 295,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 284,col 55)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator.clone()",
      "begin_line": 304,
      "end_line": 314,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 306,col 65)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 21)"
      ]
    }
  ]
}